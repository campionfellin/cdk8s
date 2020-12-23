// generated by cdk8s
import { ApiObject, GroupVersionKind } from 'cdk8s';
import { Construct } from 'constructs';

/**
 * An CompositeResourceDefinition defines a new kind of composite infrastructure resource. The new resource is composed of other composite or managed infrastructure resources.
 *
 * @schema CompositeResourceDefinition
 */
export class CompositeResourceDefinition extends ApiObject {
  /**
   * Returns the apiVersion and kind for "CompositeResourceDefinition"
   */
  public static readonly GVK: GroupVersionKind = {
    apiVersion: 'apiextensions.crossplane.io/v1alpha1',
    kind: 'CompositeResourceDefinition',
  }

  /**
   * Renders a Kubernetes manifest for "CompositeResourceDefinition".
   *
   * This can be used to inline resource manifests inside other objects (e.g. as templates).
   *
   * @param props initialization props
   */
  public static manifest(props: CompositeResourceDefinitionProps = {}): any {
    return {
      ...CompositeResourceDefinition.GVK,
      ...props,
    };
  }

  /**
   * Defines a "CompositeResourceDefinition" API object
   * @param scope the scope in which to define this object
   * @param id a scope-local name for the object
   * @param props initialization props
   */
  public constructor(scope: Construct, id: string, props: CompositeResourceDefinitionProps = {}) {
    super(scope, id, CompositeResourceDefinition.manifest(props));
  }
}

/**
 * An CompositeResourceDefinition defines a new kind of composite infrastructure resource. The new resource is composed of other composite or managed infrastructure resources.
 *
 * @schema CompositeResourceDefinition
 */
export interface CompositeResourceDefinitionProps {
  /**
   * @schema CompositeResourceDefinition#metadata
   */
  readonly metadata?: any;

  /**
   * CompositeResourceDefinitionSpec specifies the desired state of the definition.
   *
   * @schema CompositeResourceDefinition#spec
   */
  readonly spec?: CompositeResourceDefinitionSpec;

}

/**
 * CompositeResourceDefinitionSpec specifies the desired state of the definition.
 *
 * @schema CompositeResourceDefinitionSpec
 */
export interface CompositeResourceDefinitionSpec {
  /**
   * ClaimNames specifies the names of an optional composite resource claim. When claim names are specified Crossplane will create a namespaced 'composite resource claim' CRD that corresponds to the defined composite resource. This composite resource claim acts as a namespaced proxy for the composite resource; creating, updating, or deleting the claim will create, update, or delete a corresponding composite resource. You may add claim names to an existing CompositeResourceDefinition, but they cannot be changed or removed once they have been set.
   *
   * @schema CompositeResourceDefinitionSpec#claimNames
   */
  readonly claimNames?: CompositeResourceDefinitionSpecClaimNames;

  /**
   * ConnectionSecretKeys is the list of keys that will be exposed to the end user of the defined kind.
   *
   * @schema CompositeResourceDefinitionSpec#connectionSecretKeys
   */
  readonly connectionSecretKeys?: string[];

  /**
   * DefaultCompositionRef refers to the Composition resource that will be used in case no composition selector is given.
   *
   * @schema CompositeResourceDefinitionSpec#defaultCompositionRef
   */
  readonly defaultCompositionRef?: CompositeResourceDefinitionSpecDefaultCompositionRef;

  /**
   * EnforcedCompositionRef refers to the Composition resource that will be used by all composite instances whose schema is defined by this definition.
   *
   * @schema CompositeResourceDefinitionSpec#enforcedCompositionRef
   */
  readonly enforcedCompositionRef?: CompositeResourceDefinitionSpecEnforcedCompositionRef;

  /**
   * Group specifies the API group of the defined composite resource. Composite resources are served under `/apis/<group>/...`. Must match the name of the XRD (in the form `<names.plural>.<group>`).
   *
   * @schema CompositeResourceDefinitionSpec#group
   */
  readonly group: string;

  /**
   * Names specifies the resource and kind names of the defined composite resource.
   *
   * @schema CompositeResourceDefinitionSpec#names
   */
  readonly names: CompositeResourceDefinitionSpecNames;

  /**
   * Versions is the list of all API versions of the defined composite resource. Version names are used to compute the order in which served versions are listed in API discovery. If the version string is "kube-like", it will sort above non "kube-like" version strings, which are ordered lexicographically. "Kube-like" versions start with a "v", then are followed by a number (the major version), then optionally the string "alpha" or "beta" and another number (the minor version). These are sorted first by GA > beta > alpha (where GA is a version with no suffix such as beta or alpha), and then by comparing major version, then minor version. An example sorted list of versions: v10, v2, v1, v11beta2, v10beta3, v3beta1, v12alpha1, v11alpha2, foo1, foo10. Note that all versions must have identical schemas; Crossplane does not currently support conversion between different version schemas.
   *
   * @schema CompositeResourceDefinitionSpec#versions
   */
  readonly versions: CompositeResourceDefinitionSpecVersions[];

}

/**
 * ClaimNames specifies the names of an optional composite resource claim. When claim names are specified Crossplane will create a namespaced 'composite resource claim' CRD that corresponds to the defined composite resource. This composite resource claim acts as a namespaced proxy for the composite resource; creating, updating, or deleting the claim will create, update, or delete a corresponding composite resource. You may add claim names to an existing CompositeResourceDefinition, but they cannot be changed or removed once they have been set.
 *
 * @schema CompositeResourceDefinitionSpecClaimNames
 */
export interface CompositeResourceDefinitionSpecClaimNames {
  /**
   * categories is a list of grouped resources this custom resource belongs to (e.g. 'all'). This is published in API discovery documents, and used by clients to support invocations like `kubectl get all`.
   *
   * @schema CompositeResourceDefinitionSpecClaimNames#categories
   */
  readonly categories?: string[];

  /**
   * kind is the serialized kind of the resource. It is normally CamelCase and singular. Custom resource instances will use this value as the `kind` attribute in API calls.
   *
   * @schema CompositeResourceDefinitionSpecClaimNames#kind
   */
  readonly kind: string;

  /**
   * listKind is the serialized kind of the list for this resource. Defaults to "`kind`List".
   *
   * @default kind`List".
   * @schema CompositeResourceDefinitionSpecClaimNames#listKind
   */
  readonly listKind?: string;

  /**
   * plural is the plural name of the resource to serve. The custom resources are served under `/apis/<group>/<version>/.../<plural>`. Must match the name of the CustomResourceDefinition (in the form `<names.plural>.<group>`). Must be all lowercase.
   *
   * @schema CompositeResourceDefinitionSpecClaimNames#plural
   */
  readonly plural: string;

  /**
   * shortNames are short names for the resource, exposed in API discovery documents, and used by clients to support invocations like `kubectl get <shortname>`. It must be all lowercase.
   *
   * @schema CompositeResourceDefinitionSpecClaimNames#shortNames
   */
  readonly shortNames?: string[];

  /**
   * singular is the singular name of the resource. It must be all lowercase. Defaults to lowercased `kind`.
   *
   * @default lowercased `kind`.
   * @schema CompositeResourceDefinitionSpecClaimNames#singular
   */
  readonly singular?: string;

}

/**
 * DefaultCompositionRef refers to the Composition resource that will be used in case no composition selector is given.
 *
 * @schema CompositeResourceDefinitionSpecDefaultCompositionRef
 */
export interface CompositeResourceDefinitionSpecDefaultCompositionRef {
  /**
   * Name of the referenced object.
   *
   * @schema CompositeResourceDefinitionSpecDefaultCompositionRef#name
   */
  readonly name: string;

}

/**
 * EnforcedCompositionRef refers to the Composition resource that will be used by all composite instances whose schema is defined by this definition.
 *
 * @schema CompositeResourceDefinitionSpecEnforcedCompositionRef
 */
export interface CompositeResourceDefinitionSpecEnforcedCompositionRef {
  /**
   * Name of the referenced object.
   *
   * @schema CompositeResourceDefinitionSpecEnforcedCompositionRef#name
   */
  readonly name: string;

}

/**
 * Names specifies the resource and kind names of the defined composite resource.
 *
 * @schema CompositeResourceDefinitionSpecNames
 */
export interface CompositeResourceDefinitionSpecNames {
  /**
   * categories is a list of grouped resources this custom resource belongs to (e.g. 'all'). This is published in API discovery documents, and used by clients to support invocations like `kubectl get all`.
   *
   * @schema CompositeResourceDefinitionSpecNames#categories
   */
  readonly categories?: string[];

  /**
   * kind is the serialized kind of the resource. It is normally CamelCase and singular. Custom resource instances will use this value as the `kind` attribute in API calls.
   *
   * @schema CompositeResourceDefinitionSpecNames#kind
   */
  readonly kind: string;

  /**
   * listKind is the serialized kind of the list for this resource. Defaults to "`kind`List".
   *
   * @default kind`List".
   * @schema CompositeResourceDefinitionSpecNames#listKind
   */
  readonly listKind?: string;

  /**
   * plural is the plural name of the resource to serve. The custom resources are served under `/apis/<group>/<version>/.../<plural>`. Must match the name of the CustomResourceDefinition (in the form `<names.plural>.<group>`). Must be all lowercase.
   *
   * @schema CompositeResourceDefinitionSpecNames#plural
   */
  readonly plural: string;

  /**
   * shortNames are short names for the resource, exposed in API discovery documents, and used by clients to support invocations like `kubectl get <shortname>`. It must be all lowercase.
   *
   * @schema CompositeResourceDefinitionSpecNames#shortNames
   */
  readonly shortNames?: string[];

  /**
   * singular is the singular name of the resource. It must be all lowercase. Defaults to lowercased `kind`.
   *
   * @default lowercased `kind`.
   * @schema CompositeResourceDefinitionSpecNames#singular
   */
  readonly singular?: string;

}

/**
 * CompositeResourceDefinitionVersion describes a version of an XR.
 *
 * @schema CompositeResourceDefinitionSpecVersions
 */
export interface CompositeResourceDefinitionSpecVersions {
  /**
   * AdditionalPrinterColumns specifies additional columns returned in Table output. If no columns are specified, a single column displaying the age of the custom resource is used. See the following link for details: https://kubernetes.io/docs/reference/using-api/api-concepts/#receiving-resources-as-tables
   *
   * @schema CompositeResourceDefinitionSpecVersions#additionalPrinterColumns
   */
  readonly additionalPrinterColumns?: CompositeResourceDefinitionSpecVersionsAdditionalPrinterColumns[];

  /**
   * Name of this version, e.g. “v1”, “v2beta1”, etc. Composite resources are served under this version at `/apis/<group>/<version>/...` if `served` is true.
   *
   * @schema CompositeResourceDefinitionSpecVersions#name
   */
  readonly name: string;

  /**
   * Referenceable specifies that this version may be referenced by a Composition in order to configure which resources an XR may be composed of. Exactly one version must be marked as referenceable; all Compositions must target only the referenceable version. The referenceable version must be served.
   *
   * @schema CompositeResourceDefinitionSpecVersions#referenceable
   */
  readonly referenceable: boolean;

  /**
   * Schema describes the schema used for validation, pruning, and defaulting of this version of the defined composite resource. Fields required by all composite resources will be injected into this schema automatically, and will override equivalently named fields in this schema. Omitting this schema results in a schema that contains only the fields required by all composite resources.
   *
   * @schema CompositeResourceDefinitionSpecVersions#schema
   */
  readonly schema?: CompositeResourceDefinitionSpecVersionsSchema;

  /**
   * Served specifies that this version should be served via REST APIs.
   *
   * @schema CompositeResourceDefinitionSpecVersions#served
   */
  readonly served: boolean;

}

/**
 * CustomResourceColumnDefinition specifies a column for server side printing.
 *
 * @schema CompositeResourceDefinitionSpecVersionsAdditionalPrinterColumns
 */
export interface CompositeResourceDefinitionSpecVersionsAdditionalPrinterColumns {
  /**
   * description is a human readable description of this column.
   *
   * @schema CompositeResourceDefinitionSpecVersionsAdditionalPrinterColumns#description
   */
  readonly description?: string;

  /**
   * format is an optional OpenAPI type definition for this column. The 'name' format is applied to the primary identifier column to assist in clients identifying column is the resource name. See https://github.com/OAI/OpenAPI-Specification/blob/master/versions/2.0.md#data-types for details.
   *
   * @schema CompositeResourceDefinitionSpecVersionsAdditionalPrinterColumns#format
   */
  readonly format?: string;

  /**
   * jsonPath is a simple JSON path (i.e. with array notation) which is evaluated against each custom resource to produce the value for this column.
   *
   * @schema CompositeResourceDefinitionSpecVersionsAdditionalPrinterColumns#jsonPath
   */
  readonly jsonPath: string;

  /**
   * name is a human readable name for the column.
   *
   * @schema CompositeResourceDefinitionSpecVersionsAdditionalPrinterColumns#name
   */
  readonly name: string;

  /**
   * priority is an integer defining the relative importance of this column compared to others. Lower numbers are considered higher priority. Columns that may be omitted in limited space scenarios should be given a priority greater than 0.
   *
   * @schema CompositeResourceDefinitionSpecVersionsAdditionalPrinterColumns#priority
   */
  readonly priority?: number;

  /**
   * type is an OpenAPI type definition for this column. See https://github.com/OAI/OpenAPI-Specification/blob/master/versions/2.0.md#data-types for details.
   *
   * @schema CompositeResourceDefinitionSpecVersionsAdditionalPrinterColumns#type
   */
  readonly type: string;

}

/**
 * Schema describes the schema used for validation, pruning, and defaulting of this version of the defined composite resource. Fields required by all composite resources will be injected into this schema automatically, and will override equivalently named fields in this schema. Omitting this schema results in a schema that contains only the fields required by all composite resources.
 *
 * @schema CompositeResourceDefinitionSpecVersionsSchema
 */
export interface CompositeResourceDefinitionSpecVersionsSchema {
  /**
   * OpenAPIV3Schema is the OpenAPI v3 schema to use for validation and pruning.
   *
   * @schema CompositeResourceDefinitionSpecVersionsSchema#openAPIV3Schema
   */
  readonly openAPIV3Schema?: any;

}

/**
 * Composition defines the group of resources to be created when a compatible type is created with reference to the composition.
 *
 * @schema Composition
 */
export class Composition extends ApiObject {
  /**
   * Returns the apiVersion and kind for "Composition"
   */
  public static readonly GVK: GroupVersionKind = {
    apiVersion: 'apiextensions.crossplane.io/v1alpha1',
    kind: 'Composition',
  }

  /**
   * Renders a Kubernetes manifest for "Composition".
   *
   * This can be used to inline resource manifests inside other objects (e.g. as templates).
   *
   * @param props initialization props
   */
  public static manifest(props: CompositionProps = {}): any {
    return {
      ...Composition.GVK,
      ...props,
    };
  }

  /**
   * Defines a "Composition" API object
   * @param scope the scope in which to define this object
   * @param id a scope-local name for the object
   * @param props initialization props
   */
  public constructor(scope: Construct, id: string, props: CompositionProps = {}) {
    super(scope, id, Composition.manifest(props));
  }
}

/**
 * Composition defines the group of resources to be created when a compatible type is created with reference to the composition.
 *
 * @schema Composition
 */
export interface CompositionProps {
  /**
   * @schema Composition#metadata
   */
  readonly metadata?: any;

  /**
   * CompositionSpec specifies the desired state of the definition.
   *
   * @schema Composition#spec
   */
  readonly spec?: CompositionSpec;

}

/**
 * CompositionSpec specifies the desired state of the definition.
 *
 * @schema CompositionSpec
 */
export interface CompositionSpec {
  /**
   * CompositeTypeRef specifies the type of composite resource that this composition is compatible with.
   *
   * @schema CompositionSpec#compositeTypeRef
   */
  readonly compositeTypeRef: CompositionSpecCompositeTypeRef;

  /**
   * Resources is the list of resource templates that will be used when a composite resource referring to this composition is created.
   *
   * @schema CompositionSpec#resources
   */
  readonly resources: CompositionSpecResources[];

  /**
   * WriteConnectionSecretsToNamespace specifies the namespace in which the connection secrets of composite resource dynamically provisioned using this composition will be created.
   *
   * @schema CompositionSpec#writeConnectionSecretsToNamespace
   */
  readonly writeConnectionSecretsToNamespace?: string;

}

/**
 * CompositeTypeRef specifies the type of composite resource that this composition is compatible with.
 *
 * @schema CompositionSpecCompositeTypeRef
 */
export interface CompositionSpecCompositeTypeRef {
  /**
   * APIVersion of the type.
   *
   * @schema CompositionSpecCompositeTypeRef#apiVersion
   */
  readonly apiVersion: string;

  /**
   * Kind of the type.
   *
   * @schema CompositionSpecCompositeTypeRef#kind
   */
  readonly kind: string;

}

/**
 * ComposedTemplate is used to provide information about how the composed resource should be processed.
 *
 * @schema CompositionSpecResources
 */
export interface CompositionSpecResources {
  /**
   * Base is the target resource that the patches will be applied on.
   *
   * @schema CompositionSpecResources#base
   */
  readonly base: any;

  /**
   * ConnectionDetails lists the propagation secret keys from this target resource to the composition instance connection secret.
   *
   * @schema CompositionSpecResources#connectionDetails
   */
  readonly connectionDetails?: CompositionSpecResourcesConnectionDetails[];

  /**
   * Patches will be applied as overlay to the base resource.
   *
   * @schema CompositionSpecResources#patches
   */
  readonly patches?: CompositionSpecResourcesPatches[];

  /**
   * ReadinessChecks allows users to define custom readiness checks. All checks have to return true in order for resource to be considered ready. The default readiness check is to have the "Ready" condition to be "True".
   *
   * @schema CompositionSpecResources#readinessChecks
   */
  readonly readinessChecks?: CompositionSpecResourcesReadinessChecks[];

}

/**
 * ConnectionDetail includes the information about the propagation of the connection information from one secret to another.
 *
 * @schema CompositionSpecResourcesConnectionDetails
 */
export interface CompositionSpecResourcesConnectionDetails {
  /**
   * FromConnectionSecretKey is the key that will be used to fetch the value from the given target resource.
   *
   * @schema CompositionSpecResourcesConnectionDetails#fromConnectionSecretKey
   */
  readonly fromConnectionSecretKey?: string;

  /**
   * Name of the connection secret key that will be propagated to the connection secret of the composition instance. Leave empty if you'd like to use the same key name.
   *
   * @schema CompositionSpecResourcesConnectionDetails#name
   */
  readonly name?: string;

  /**
   * Value that will be propagated to the connection secret of the composition instance. Typically you should use FromConnectionSecretKey instead, but an explicit value may be set to inject a fixed, non-sensitive connection secret values, for example a well-known port. Supercedes FromConnectionSecretKey when set.
   *
   * @schema CompositionSpecResourcesConnectionDetails#value
   */
  readonly value?: string;

}

/**
 * Patch is used to patch the field on the base resource at ToFieldPath after piping the value that is at FromFieldPath of the target resource through transformers.
 *
 * @schema CompositionSpecResourcesPatches
 */
export interface CompositionSpecResourcesPatches {
  /**
   * FromFieldPath is the path of the field on the upstream resource whose value to be used as input.
   *
   * @schema CompositionSpecResourcesPatches#fromFieldPath
   */
  readonly fromFieldPath: string;

  /**
   * ToFieldPath is the path of the field on the base resource whose value will be changed with the result of transforms. Leave empty if you'd like to propagate to the same path on the target resource.
   *
   * @schema CompositionSpecResourcesPatches#toFieldPath
   */
  readonly toFieldPath?: string;

  /**
   * Transforms are the list of functions that are used as a FIFO pipe for the input to be transformed.
   *
   * @schema CompositionSpecResourcesPatches#transforms
   */
  readonly transforms?: CompositionSpecResourcesPatchesTransforms[];

}

/**
 * ReadinessCheck is used to indicate how to tell whether a resource is ready for consumption
 *
 * @schema CompositionSpecResourcesReadinessChecks
 */
export interface CompositionSpecResourcesReadinessChecks {
  /**
   * FieldPath shows the path of the field whose value will be used.
   *
   * @schema CompositionSpecResourcesReadinessChecks#fieldPath
   */
  readonly fieldPath?: string;

  /**
   * MatchInt is the value you'd like to match if you're using "MatchInt" type.
   *
   * @schema CompositionSpecResourcesReadinessChecks#matchInteger
   */
  readonly matchInteger?: number;

  /**
   * MatchString is the value you'd like to match if you're using "MatchString" type.
   *
   * @schema CompositionSpecResourcesReadinessChecks#matchString
   */
  readonly matchString?: string;

  /**
   * Type indicates the type of probe you'd like to use.
   *
   * @schema CompositionSpecResourcesReadinessChecks#type
   */
  readonly type: CompositionSpecResourcesReadinessChecksType;

}

/**
 * Transform is a unit of process whose input is transformed into an output with the supplied configuration.
 *
 * @schema CompositionSpecResourcesPatchesTransforms
 */
export interface CompositionSpecResourcesPatchesTransforms {
  /**
   * Map uses the input as a key in the given map and returns the value.
   *
   * @schema CompositionSpecResourcesPatchesTransforms#map
   */
  readonly map?: { [key: string]: string };

  /**
   * Math is used to transform the input via mathematical operations such as multiplication.
   *
   * @schema CompositionSpecResourcesPatchesTransforms#math
   */
  readonly math?: CompositionSpecResourcesPatchesTransformsMath;

  /**
   * String is used to transform the input into a string or a different kind of string. Note that the input does not necessarily need to be a string.
   *
   * @schema CompositionSpecResourcesPatchesTransforms#string
   */
  readonly string?: CompositionSpecResourcesPatchesTransformsString;

  /**
   * Type of the transform to be run.
   *
   * @schema CompositionSpecResourcesPatchesTransforms#type
   */
  readonly type: string;

}

/**
 * Type indicates the type of probe you'd like to use.
 *
 * @schema CompositionSpecResourcesReadinessChecksType
 */
export enum CompositionSpecResourcesReadinessChecksType {
  /** MatchString */
  MATCH_STRING = "MatchString",
  /** MatchInteger */
  MATCH_INTEGER = "MatchInteger",
  /** NonEmpty */
  NON_EMPTY = "NonEmpty",
  /** None */
  NONE = "None",
}

/**
 * Math is used to transform the input via mathematical operations such as multiplication.
 *
 * @schema CompositionSpecResourcesPatchesTransformsMath
 */
export interface CompositionSpecResourcesPatchesTransformsMath {
  /**
   * Multiply the value.
   *
   * @schema CompositionSpecResourcesPatchesTransformsMath#multiply
   */
  readonly multiply?: number;

}

/**
 * String is used to transform the input into a string or a different kind of string. Note that the input does not necessarily need to be a string.
 *
 * @schema CompositionSpecResourcesPatchesTransformsString
 */
export interface CompositionSpecResourcesPatchesTransformsString {
  /**
   * Format the input using a Go format string. See https://golang.org/pkg/fmt/ for details.
   *
   * @schema CompositionSpecResourcesPatchesTransformsString#fmt
   */
  readonly fmt: string;

}

