package jenkins;

/**
 * Optional: SecretRef is reference to the secret object containing sensitive information to pass to the plugin scripts.
 * <p>
 * This may be empty if no secret object is specified. If the secret object contains more than one secret, all secrets are passed to the plugin scripts.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T15:59:02.670Z")
@software.amazon.jsii.Jsii(module = jenkins.$Module.class, fqn = "jenkins.JenkinsSpecMasterVolumesFlexVolumeSecretRef")
@software.amazon.jsii.Jsii.Proxy(JenkinsSpecMasterVolumesFlexVolumeSecretRef.Jsii$Proxy.class)
public interface JenkinsSpecMasterVolumesFlexVolumeSecretRef extends software.amazon.jsii.JsiiSerializable {

    /**
     * Name of the referent.
     * <p>
     * More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names TODO: Add other useful fields. apiVersion, kind, uid?
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getName() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link JenkinsSpecMasterVolumesFlexVolumeSecretRef}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link JenkinsSpecMasterVolumesFlexVolumeSecretRef}
     */
    public static final class Builder {
        private java.lang.String name;

        /**
         * Sets the value of {@link JenkinsSpecMasterVolumesFlexVolumeSecretRef#getName}
         * @param name Name of the referent.
         *             More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names TODO: Add other useful fields. apiVersion, kind, uid?
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link JenkinsSpecMasterVolumesFlexVolumeSecretRef}
         * @throws NullPointerException if any required attribute was not provided
         */
        public JenkinsSpecMasterVolumesFlexVolumeSecretRef build() {
            return new Jsii$Proxy(name);
        }
    }

    /**
     * An implementation for {@link JenkinsSpecMasterVolumesFlexVolumeSecretRef}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements JenkinsSpecMasterVolumesFlexVolumeSecretRef {
        private final java.lang.String name;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.name = this.jsiiGet("name", java.lang.String.class);
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        private Jsii$Proxy(final java.lang.String name) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.name = name;
        }

        @Override
        public java.lang.String getName() {
            return this.name;
        }

        @Override
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getName() != null) {
                data.set("name", om.valueToTree(this.getName()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("jenkins.JenkinsSpecMasterVolumesFlexVolumeSecretRef"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            JenkinsSpecMasterVolumesFlexVolumeSecretRef.Jsii$Proxy that = (JenkinsSpecMasterVolumesFlexVolumeSecretRef.Jsii$Proxy) o;

            return this.name != null ? this.name.equals(that.name) : that.name == null;
        }

        @Override
        public int hashCode() {
            int result = this.name != null ? this.name.hashCode() : 0;
            return result;
        }
    }
}
