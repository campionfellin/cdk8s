package k8s;

/**
 * Describes a certificate signing request.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T15:58:47.114Z")
@software.amazon.jsii.Jsii(module = k8s.$Module.class, fqn = "k8s.CertificateSigningRequest")
public class CertificateSigningRequest extends org.cdk8s.ApiObject {

    protected CertificateSigningRequest(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected CertificateSigningRequest(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * Defines a "io.k8s.api.certificates.v1beta1.CertificateSigningRequest" API object.
     * <p>
     * @param scope the scope in which to define this object. This parameter is required.
     * @param name a scope-local name for the object. This parameter is required.
     * @param options configuration options.
     */
    public CertificateSigningRequest(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String name, final @org.jetbrains.annotations.Nullable k8s.CertificateSigningRequestOptions options) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(name, "name is required"), options });
    }

    /**
     * Defines a "io.k8s.api.certificates.v1beta1.CertificateSigningRequest" API object.
     * <p>
     * @param scope the scope in which to define this object. This parameter is required.
     * @param name a scope-local name for the object. This parameter is required.
     */
    public CertificateSigningRequest(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String name) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(name, "name is required") });
    }

    /**
     * A fluent builder for {@link k8s.CertificateSigningRequest}.
     */
    public static final class Builder {
        /**
         * @return a new instance of {@link Builder}.
         * @param scope the scope in which to define this object. This parameter is required.
         * @param name a scope-local name for the object. This parameter is required.
         */
        public static Builder create(final software.constructs.Construct scope, final java.lang.String name) {
            return new Builder(scope, name);
        }

        private final software.constructs.Construct scope;
        private final java.lang.String name;
        private k8s.CertificateSigningRequestOptions.Builder options;

        private Builder(final software.constructs.Construct scope, final java.lang.String name) {
            this.scope = scope;
            this.name = name;
        }

        /**
         * @return {@code this}
         * @param metadata This parameter is required.
         */
        public Builder metadata(final k8s.ObjectMeta metadata) {
            this.options().metadata(metadata);
            return this;
        }

        /**
         * The certificate request itself and any additional information.
         * <p>
         * @return {@code this}
         * @param spec The certificate request itself and any additional information. This parameter is required.
         */
        public Builder spec(final k8s.CertificateSigningRequestSpec spec) {
            this.options().spec(spec);
            return this;
        }

        /**
         * @returns a newly built instance of {@link k8s.CertificateSigningRequest}.
         */
        public k8s.CertificateSigningRequest build() {
            return new k8s.CertificateSigningRequest(
                this.scope,
                this.name,
                this.options != null ? this.options.build() : null
            );
        }

        private k8s.CertificateSigningRequestOptions.Builder options() {
            if (this.options == null) {
                this.options = new k8s.CertificateSigningRequestOptions.Builder();
            }
            return this.options;
        }
    }
}
