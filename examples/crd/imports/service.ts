// generated by cdk8s
import { ApiObject } from 'cdk8s';
import { Construct } from 'constructs';

/**
 * 
 *
 * @schema Service
 */
export class Service extends ApiObject {
  /**
   * Defines a "Service" API object
   * @param scope the scope in which to define this object
   * @param name a scope-local name for the object
   * @param options configuration options
   */
  public constructor(scope: Construct, name: string, options: ServiceOptions = {}) {
    super(scope, name, {
      ...options,
      kind: 'Service',
      apiVersion: 'serving.knative.dev/v1alpha1',
    });
  }
}

/**
 * @schema Service
 */
export interface ServiceOptions {
}

