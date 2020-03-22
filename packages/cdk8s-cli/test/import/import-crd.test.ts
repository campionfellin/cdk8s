import * as path from 'path';
import * as yaml from 'yaml';
import * as fs from 'fs';
import { ImportCustomResourceDefinition } from '../../lib/import/crd';
import { expectImportMatchSnapshot } from './util';

const jenkinsCrd = yaml.parseAllDocuments(fs.readFileSync(path.join(__dirname, 'fixtures', 'jenkins_crd.yaml'), 'utf-8'))
                       .map((doc: yaml.ast.Document) => doc.toJSON());

expectImportMatchSnapshot('jenkins', () => new ImportCustomResourceDefinition(jenkinsCrd));

test('fails if manifest is not a CRD', async () => {
  expect(() => new ImportCustomResourceDefinition([{ 
    apiVersion: 'voo' 
  }])).toThrow('invalid CustomResourceDefinition manifest: "apiVersion" must be "apiextensions.k8s.io/v1beta1"');

  expect(() => new ImportCustomResourceDefinition([{ 
    apiVersion: 'apiextensions.k8s.io/v1beta1',
    kind: 'Foo'
  }])).toThrow('invalid CustomResourceDefinition manifest: "kind" must be "CustomResourceDefinition"');

  expect(() => new ImportCustomResourceDefinition([{
    apiVersion: 'apiextensions.k8s.io/v1beta1',
    kind: 'CustomResourceDefinition',
  }])).toThrow('manifest does not have a "spec" attribute');
})
