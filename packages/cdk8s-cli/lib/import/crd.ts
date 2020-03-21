import { TypeGenerator } from './type-generator';
import { ImportBase } from './base';
import { CodeMaker } from 'codemaker';
import { httpsGet } from '../util';
import * as yaml from 'yaml';
import * as fs from 'fs-extra';
import * as path from 'path';

interface CustomResourceApiObject {
  apiVersion?: string;
  kind?: string;
  metadata?: {
    name?: string;
  };
  spec?: {
    group: string;
    names: {
      kind: string;
    };
    versions?: Array<{ name: string; schema?: { openAPIV3Schema?: any } }>;
    validation?: { openAPIV3Schema?: any };
  };
}

export class CustomResourceDefinition {
  private readonly schema: any;
  private readonly group: string;
  private readonly version: string;
  private readonly kind: string;
  private readonly fqn: string;

  constructor(manifest: CustomResourceApiObject) {
    assert(manifest.apiVersion === 'apiextensions.k8s.io/v1beta1', '"apiVersion" must be "apiextensions.k8s.io/v1beta1"');
    assert(manifest.kind === 'CustomResourceDefinition', '"kind" must be "CustomResourceDefinition"');

    const spec = manifest.spec;
    if (!spec) {
      throw new Error(`manifest does not have a "spec" attribute`)
    }
  
    const version = (spec.versions ?? [])[0];
    if (!version) {
      throw new Error(`unable to determine CRD version`);
    }
  
    if (!manifest.metadata?.name) {
      throw new Error(`"metadata.name" is required`);
    }
  
    const schema = version.schema?.openAPIV3Schema ?? spec.validation?.openAPIV3Schema;
  
    if (!schema) {
      throw new Error(`unable to determine schema for custom resource`);
    }

    this.schema = schema;
    this.group = spec.group;
    this.version = version.name;
    this.kind = spec.names.kind;
    this.fqn = this.kind;
  }

  public get moduleName() {
    return this.kind.toLocaleLowerCase();
  }

  public async generateTypeScript(code: CodeMaker) {
    const types = new TypeGenerator();
  
    types.emitConstruct({
      group: this.group,
      version: this.version,
      kind: this.kind,
      fqn: this.fqn,
      schema: this.schema
    });

    code.line(`// generated by cdk8s`);
    code.line(`import { ApiObject } from 'cdk8s';`);
    code.line(`import { Construct } from 'constructs';`);
    code.line();
    types.generate(code);
  }
}

export class ImportCustomResourceDefinition extends ImportBase {
  public static async match(source: string): Promise<undefined | CustomResourceApiObject[]> {
    let manifest;
    if (source.startsWith('https://')) {
      manifest = await httpsGet(source);
    } else if (path.extname(source) === '.yaml' || path.extname(source) === '.yml' || path.extname(source) === '.json') {
      if (!(await fs.pathExists(source))) {
        throw new Error(`can't find file ${source}`);
      }

      manifest = await fs.readFile(source, 'utf-8');
    }

  
    if (!manifest) {
      return undefined;
    }

    return yaml.parseAllDocuments(manifest).map((doc: yaml.ast.Document) => doc.toJSON());
  }

  private readonly CRDs: CustomResourceDefinition[] = [];
  
  constructor(manifest: CustomResourceApiObject[]) {
    super();

    this.CRDs = manifest?.map(obj => new CustomResourceDefinition(obj));
  }

  public get moduleName() {
    return this.CRDs.map(crd => crd.moduleName);
  }

  protected async generateTypeScript(code: CodeMaker, moduleName: string) {
    this.CRDs.filter(crd => moduleName === crd.moduleName).map(crd => crd.generateTypeScript(code));
  }
}

function assert(condition: boolean, message: string) {
  if (!condition) {
    throw new Error(`invalid CustomResourceDefinition manifest: ${message}`);
  }
}
