package jenkins;

/**
 * PersistentVolumeClaimVolumeSource represents a reference to a PersistentVolumeClaim in the same namespace.
 * <p>
 * More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#persistentvolumeclaims
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T15:59:02.683Z")
@software.amazon.jsii.Jsii(module = jenkins.$Module.class, fqn = "jenkins.JenkinsSpecMasterVolumesPersistentVolumeClaim")
@software.amazon.jsii.Jsii.Proxy(JenkinsSpecMasterVolumesPersistentVolumeClaim.Jsii$Proxy.class)
public interface JenkinsSpecMasterVolumesPersistentVolumeClaim extends software.amazon.jsii.JsiiSerializable {

    /**
     * ClaimName is the name of a PersistentVolumeClaim in the same namespace as the pod using this volume.
     * <p>
     * More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#persistentvolumeclaims
     */
    @org.jetbrains.annotations.NotNull java.lang.String getClaimName();

    /**
     * Will force the ReadOnly setting in VolumeMounts.
     * <p>
     * Default false.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getReadOnly() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link JenkinsSpecMasterVolumesPersistentVolumeClaim}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link JenkinsSpecMasterVolumesPersistentVolumeClaim}
     */
    public static final class Builder {
        private java.lang.String claimName;
        private java.lang.Boolean readOnly;

        /**
         * Sets the value of {@link JenkinsSpecMasterVolumesPersistentVolumeClaim#getClaimName}
         * @param claimName ClaimName is the name of a PersistentVolumeClaim in the same namespace as the pod using this volume. This parameter is required.
         *                  More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#persistentvolumeclaims
         * @return {@code this}
         */
        public Builder claimName(java.lang.String claimName) {
            this.claimName = claimName;
            return this;
        }

        /**
         * Sets the value of {@link JenkinsSpecMasterVolumesPersistentVolumeClaim#getReadOnly}
         * @param readOnly Will force the ReadOnly setting in VolumeMounts.
         *                 Default false.
         * @return {@code this}
         */
        public Builder readOnly(java.lang.Boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link JenkinsSpecMasterVolumesPersistentVolumeClaim}
         * @throws NullPointerException if any required attribute was not provided
         */
        public JenkinsSpecMasterVolumesPersistentVolumeClaim build() {
            return new Jsii$Proxy(claimName, readOnly);
        }
    }

    /**
     * An implementation for {@link JenkinsSpecMasterVolumesPersistentVolumeClaim}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements JenkinsSpecMasterVolumesPersistentVolumeClaim {
        private final java.lang.String claimName;
        private final java.lang.Boolean readOnly;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.claimName = this.jsiiGet("claimName", java.lang.String.class);
            this.readOnly = this.jsiiGet("readOnly", java.lang.Boolean.class);
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        private Jsii$Proxy(final java.lang.String claimName, final java.lang.Boolean readOnly) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.claimName = java.util.Objects.requireNonNull(claimName, "claimName is required");
            this.readOnly = readOnly;
        }

        @Override
        public java.lang.String getClaimName() {
            return this.claimName;
        }

        @Override
        public java.lang.Boolean getReadOnly() {
            return this.readOnly;
        }

        @Override
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("claimName", om.valueToTree(this.getClaimName()));
            if (this.getReadOnly() != null) {
                data.set("readOnly", om.valueToTree(this.getReadOnly()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("jenkins.JenkinsSpecMasterVolumesPersistentVolumeClaim"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            JenkinsSpecMasterVolumesPersistentVolumeClaim.Jsii$Proxy that = (JenkinsSpecMasterVolumesPersistentVolumeClaim.Jsii$Proxy) o;

            if (!claimName.equals(that.claimName)) return false;
            return this.readOnly != null ? this.readOnly.equals(that.readOnly) : that.readOnly == null;
        }

        @Override
        public int hashCode() {
            int result = this.claimName.hashCode();
            result = 31 * result + (this.readOnly != null ? this.readOnly.hashCode() : 0);
            return result;
        }
    }
}
