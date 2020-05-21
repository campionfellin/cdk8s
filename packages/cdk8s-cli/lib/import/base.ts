import * as fs from 'fs-extra';
import * as path from 'path';
import { CodeMaker } from 'codemaker';
import { withTempDir, shell } from '../util';
import { jsiiCompile } from './jsii';

export enum Language {
  TYPESCRIPT = 'typescript',
  PYTHON = 'python',
  DOTNET = 'dotnet',
  JAVA = 'java',
}

export const LANGUAGES = [ Language.TYPESCRIPT, Language.PYTHON, Language.JAVA ];

export interface ImportOptions {
  readonly moduleNamePrefix?: string;
  readonly targetLanguage: Language;
  readonly outdir: string;
}

export abstract class ImportBase {
  public abstract get moduleNames(): string[];
  protected abstract async generateTypeScript(code: CodeMaker, moduleName?: string): Promise<void>;

  public async import(options: ImportOptions) {
    const code = new CodeMaker();

    const outdir = path.resolve(options.outdir);
    await fs.mkdirp(outdir);
    const isTypescript = options.targetLanguage === Language.TYPESCRIPT
    const { moduleNamePrefix } = options;

    for (const name of this.moduleNames) {
      const fileName = moduleNamePrefix ? `${moduleNamePrefix}-${name}.ts` : `${name}.ts`;
      code.openFile(fileName);
      code.indentation = 2;
      await this.generateTypeScript(code, name);
      code.closeFile(fileName);

      if (isTypescript) {
        await code.save(outdir);
      }
    }

    if (isTypescript) return;

    for (const name of this.moduleNames) {
      // this is not typescript, so we generate in a staging directory and harvest the code
      await withTempDir('importer', async () => {
        await code.save('.');
        await jsiiCompile('.', {
          main: name,
          moduleNamePrefix,
          name,
        });

        const pacmak = require.resolve('jsii-pacmak/bin/jsii-pacmak');
        await shell(pacmak, [ '--target', options.targetLanguage, '--code-only' ]);
        await this.harvestCode(options, outdir, name);
      });
    }
  }

  private async harvestCode(options: ImportOptions, targetdir: string, moduleName: string) {
    const { moduleNamePrefix } = options
    switch (options.targetLanguage) {
      case Language.TYPESCRIPT:
        throw new Error('no op for typescript');
  
      case Language.PYTHON:
        await this.harvestPython(targetdir, moduleNamePrefix ? moduleNamePrefix : moduleName);
        break;

      case Language.JAVA:
        await this.harvestJava(targetdir, moduleNamePrefix ? moduleNamePrefix : moduleName);
        break;
  
      default:
        throw new Error(`unsupported language ${options.targetLanguage} (yet)`);
    }
  
  }

  private async harvestJava(targetdir: string, moduleName: string) {
    const target = path.join(targetdir, moduleName);
    await fs.move(`dist/java/src/`, target, { overwrite: true });
  }

  private async harvestPython(targetdir: string, moduleName: string) {
    const target = path.join(targetdir, moduleName);
    await fs.move(`dist/python/src/${moduleName}`, target, { overwrite: true });
  }
}
