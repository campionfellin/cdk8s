package k8s;

/**
 * PodPreset is a policy resource that defines additional runtime requirements for a Pod.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T15:58:47.349Z")
@software.amazon.jsii.Jsii(module = k8s.$Module.class, fqn = "k8s.PodPresetOptions")
@software.amazon.jsii.Jsii.Proxy(PodPresetOptions.Jsii$Proxy.class)
public interface PodPresetOptions extends software.amazon.jsii.JsiiSerializable {

    /**
     */
    default @org.jetbrains.annotations.Nullable k8s.ObjectMeta getMetadata() {
        return null;
    }

    /**
     */
    default @org.jetbrains.annotations.Nullable k8s.PodPresetSpec getSpec() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link PodPresetOptions}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link PodPresetOptions}
     */
    public static final class Builder {
        private k8s.ObjectMeta metadata;
        private k8s.PodPresetSpec spec;

        /**
         * Sets the value of {@link PodPresetOptions#getMetadata}
         * @param metadata the value to be set.
         * @return {@code this}
         */
        public Builder metadata(k8s.ObjectMeta metadata) {
            this.metadata = metadata;
            return this;
        }

        /**
         * Sets the value of {@link PodPresetOptions#getSpec}
         * @param spec the value to be set.
         * @return {@code this}
         */
        public Builder spec(k8s.PodPresetSpec spec) {
            this.spec = spec;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link PodPresetOptions}
         * @throws NullPointerException if any required attribute was not provided
         */
        public PodPresetOptions build() {
            return new Jsii$Proxy(metadata, spec);
        }
    }

    /**
     * An implementation for {@link PodPresetOptions}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements PodPresetOptions {
        private final k8s.ObjectMeta metadata;
        private final k8s.PodPresetSpec spec;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.metadata = this.jsiiGet("metadata", k8s.ObjectMeta.class);
            this.spec = this.jsiiGet("spec", k8s.PodPresetSpec.class);
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        private Jsii$Proxy(final k8s.ObjectMeta metadata, final k8s.PodPresetSpec spec) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.metadata = metadata;
            this.spec = spec;
        }

        @Override
        public k8s.ObjectMeta getMetadata() {
            return this.metadata;
        }

        @Override
        public k8s.PodPresetSpec getSpec() {
            return this.spec;
        }

        @Override
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getMetadata() != null) {
                data.set("metadata", om.valueToTree(this.getMetadata()));
            }
            if (this.getSpec() != null) {
                data.set("spec", om.valueToTree(this.getSpec()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.PodPresetOptions"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            PodPresetOptions.Jsii$Proxy that = (PodPresetOptions.Jsii$Proxy) o;

            if (this.metadata != null ? !this.metadata.equals(that.metadata) : that.metadata != null) return false;
            return this.spec != null ? this.spec.equals(that.spec) : that.spec == null;
        }

        @Override
        public int hashCode() {
            int result = this.metadata != null ? this.metadata.hashCode() : 0;
            result = 31 * result + (this.spec != null ? this.spec.hashCode() : 0);
            return result;
        }
    }
}
