import { Construct, IConstruct, Node } from 'constructs';
import * as stringify from 'json-stable-stringify';
import { resolve } from './_resolve';
import { sanitizeValue } from './_util';
import { Chart } from './chart';
import { JsonPatch } from './json-patch';
import { ApiObjectMetadata, ApiObjectMetadataDefinition } from './metadata';

/**
 * Options for defining API objects.
 */
export interface ApiObjectOptions {
  /**
   * Object metadata.
   *
   * If `name` is not specified, an app-unique name will be allocated by the
   * framework based on the path of the construct within thes construct tree.
   */
  readonly metadata?: ApiObjectMetadata;

  /**
   * API version.
   */
  readonly apiVersion: string;

  /**
   * Resource kind.
   */
  readonly kind: string;

  /**
   * Additional attributes for this API object.
   */
  readonly [key: string]: any;
}

export class ApiObject extends Construct {
  /**
   * Returns the `ApiObject` named `Resource` which is a child of the given
   * construct. If `c` is an `ApiObject`, it is returned directly. Throws an
   * exception if the construct does not have a child named `Default` _or_ if
   * this child is not an `ApiObject`.
   *
   * @param c The higher-level construct
   */
  public static of(c: IConstruct): ApiObject {
    if (c instanceof ApiObject) {
      return c;
    }

    const child = Node.of(c).defaultChild;
    if (!child) {
      throw new Error(`cannot find a (direct or indirect) child of type ApiObject for construct ${Node.of(c).path}`);
    }

    return ApiObject.of(child);
  }

  /**
   * The name of the API object.
   *
   * If a name is specified in `metadata.name` this will be the name returned.
   * Otherwise, a name will be generated by calling
   * `Chart.of(this).generatedObjectName(this)`, which by default uses the
   * construct path to generate a DNS-compatible name for the resource.
   */
  public readonly name: string;

  /**
   * The object's API version (e.g. `authorization.k8s.io/v1`)
   */
  public readonly apiVersion: string;

  /**
   * The group portion of the API version (e.g. `authorization.k8s.io`)
   */
  public readonly apiGroup: string;

  /**
   * The object kind.
   */
  public readonly kind: string;

  /**
   * The chart in which this object is defined.
   */
  public readonly chart: Chart;

  /**
   * Metadata associated with this API object.
   */
  public readonly metadata: ApiObjectMetadataDefinition;

  /**
   * A set of JSON patch operations to apply to the document after synthesis.
   */
  private readonly patches: Array<JsonPatch>;

  /**
   * Defines an API object.
   *
   * @param scope the construct scope
   * @param ns namespace
   * @param options options
   */
  constructor(scope: Construct, ns: string, private readonly options: ApiObjectOptions) {
    super(scope, ns);
    this.patches = new Array<JsonPatch>();
    this.chart = Chart.of(this);
    this.kind = options.kind;
    this.apiVersion = options.apiVersion;
    this.apiGroup = parseApiGroup(this.apiVersion);

    this.name = options.metadata?.name ?? this.chart.generateObjectName(this);

    this.metadata = new ApiObjectMetadataDefinition({
      name: this.name,

      // user defined values
      ...options.metadata,

      namespace: options.metadata?.namespace ?? this.chart.namespace,
      labels: {
        ...this.chart.labels,
        ...options.metadata?.labels,
      },
    });
  }

  /**
   * Create a dependency between this ApiObject and other constructs.
   * These can be other ApiObjects, Charts, or custom.
   *
   * @param dependencies the dependencies to add.
   */
  public addDependency(...dependencies: IConstruct[]) {
    Node.of(this).addDependency(...dependencies);
  }

  /**
   * Applies a set of RFC-6902 JSON-Patch operations to the manifest
   * synthesized for this API object.
   *
   * @param ops The JSON-Patch operations to apply.
   *
   * @example
   *
   *   kubePod.addJsonPatch(JsonPatch.replace('/spec/enableServiceLinks', true));
   *
   */
  public addJsonPatch(...ops: JsonPatch[]) {
    this.patches.push(...ops);
  }

  /**
   * Renders the object to Kubernetes JSON.
   */
  public toJson(): any {
    const data = {
      ...this.options,
      metadata: this.metadata.toJson(),
    };

    // convert to "pure data" so, for example, when we convert to yaml these
    // references are not converted to anchors.
    const json = JSON.parse(stringify(sanitizeValue(resolve(data))));
    return JsonPatch.apply(json, ...this.patches);
  }
}

function parseApiGroup(apiVersion: string) {
  const v = apiVersion.split('/');

  // no group means "core"
  // https://kubernetes.io/docs/reference/using-api/api-overview/#api-groups
  if (v.length === 1) {
    return 'core';
  }

  if (v.length === 2) {
    return v[0];
  }

  throw new Error(`invalid apiVersion ${apiVersion}, expecting GROUP/VERSION. See https://kubernetes.io/docs/reference/using-api/api-overview/#api-groups`);
}
