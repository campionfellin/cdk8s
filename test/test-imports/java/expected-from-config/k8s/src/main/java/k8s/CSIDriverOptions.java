package k8s;

/**
 * CSIDriver captures information about a Container Storage Interface (CSI) volume driver deployed on the cluster.
 * <p>
 * CSI drivers do not need to create the CSIDriver object directly. Instead they may use the cluster-driver-registrar sidecar container. When deployed with a CSI driver it automatically creates a CSIDriver object representing the driver. Kubernetes attach detach controller uses this object to determine whether attach is required. Kubelet uses this object to determine whether pod information needs to be passed on mount. CSIDriver objects are non-namespaced.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T15:58:47.099Z")
@software.amazon.jsii.Jsii(module = k8s.$Module.class, fqn = "k8s.CSIDriverOptions")
@software.amazon.jsii.Jsii.Proxy(CSIDriverOptions.Jsii$Proxy.class)
public interface CSIDriverOptions extends software.amazon.jsii.JsiiSerializable {

    /**
     * Specification of the CSI Driver.
     */
    @org.jetbrains.annotations.NotNull k8s.CSIDriverSpec getSpec();

    /**
     * Standard object metadata.
     * <p>
     * metadata.Name indicates the name of the CSI driver that this object refers to; it MUST be the same name returned by the CSI GetPluginName() call for that driver. The driver name must be 63 characters or less, beginning and ending with an alphanumeric character ([a-z0-9A-Z]) with dashes (-), dots (.), and alphanumerics between. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
     */
    default @org.jetbrains.annotations.Nullable k8s.ObjectMeta getMetadata() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link CSIDriverOptions}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link CSIDriverOptions}
     */
    public static final class Builder {
        private k8s.CSIDriverSpec spec;
        private k8s.ObjectMeta metadata;

        /**
         * Sets the value of {@link CSIDriverOptions#getSpec}
         * @param spec Specification of the CSI Driver. This parameter is required.
         * @return {@code this}
         */
        public Builder spec(k8s.CSIDriverSpec spec) {
            this.spec = spec;
            return this;
        }

        /**
         * Sets the value of {@link CSIDriverOptions#getMetadata}
         * @param metadata Standard object metadata.
         *                 metadata.Name indicates the name of the CSI driver that this object refers to; it MUST be the same name returned by the CSI GetPluginName() call for that driver. The driver name must be 63 characters or less, beginning and ending with an alphanumeric character ([a-z0-9A-Z]) with dashes (-), dots (.), and alphanumerics between. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
         * @return {@code this}
         */
        public Builder metadata(k8s.ObjectMeta metadata) {
            this.metadata = metadata;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link CSIDriverOptions}
         * @throws NullPointerException if any required attribute was not provided
         */
        public CSIDriverOptions build() {
            return new Jsii$Proxy(spec, metadata);
        }
    }

    /**
     * An implementation for {@link CSIDriverOptions}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements CSIDriverOptions {
        private final k8s.CSIDriverSpec spec;
        private final k8s.ObjectMeta metadata;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.spec = this.jsiiGet("spec", k8s.CSIDriverSpec.class);
            this.metadata = this.jsiiGet("metadata", k8s.ObjectMeta.class);
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        private Jsii$Proxy(final k8s.CSIDriverSpec spec, final k8s.ObjectMeta metadata) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.spec = java.util.Objects.requireNonNull(spec, "spec is required");
            this.metadata = metadata;
        }

        @Override
        public k8s.CSIDriverSpec getSpec() {
            return this.spec;
        }

        @Override
        public k8s.ObjectMeta getMetadata() {
            return this.metadata;
        }

        @Override
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("spec", om.valueToTree(this.getSpec()));
            if (this.getMetadata() != null) {
                data.set("metadata", om.valueToTree(this.getMetadata()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.CSIDriverOptions"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            CSIDriverOptions.Jsii$Proxy that = (CSIDriverOptions.Jsii$Proxy) o;

            if (!spec.equals(that.spec)) return false;
            return this.metadata != null ? this.metadata.equals(that.metadata) : that.metadata == null;
        }

        @Override
        public int hashCode() {
            int result = this.spec.hashCode();
            result = 31 * result + (this.metadata != null ? this.metadata.hashCode() : 0);
            return result;
        }
    }
}
