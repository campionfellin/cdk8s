package clusterinstallation;

/**
 * EnvVar represents an environment variable present in a Container.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T16:00:54.389Z")
@software.amazon.jsii.Jsii(module = clusterinstallation.$Module.class, fqn = "clusterinstallation.ClusterInstallationSpecMattermostEnv")
@software.amazon.jsii.Jsii.Proxy(ClusterInstallationSpecMattermostEnv.Jsii$Proxy.class)
public interface ClusterInstallationSpecMattermostEnv extends software.amazon.jsii.JsiiSerializable {

    /**
     * Name of the environment variable.
     * <p>
     * Must be a C_IDENTIFIER.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getName();

    /**
     * Variable references $(VAR_NAME) are expanded using the previous defined environment variables in the container and any service environment variables.
     * <p>
     * If a variable cannot be resolved, the reference in the input string will be unchanged. The $(VAR_NAME) syntax can be escaped with a double $$, ie: $$(VAR_NAME). Escaped references will never be expanded, regardless of whether the variable exists or not. Defaults to "".
     * <p>
     * Default: .
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getValue() {
        return null;
    }

    /**
     * Source for the environment variable's value.
     * <p>
     * Cannot be used if value is not empty.
     */
    default @org.jetbrains.annotations.Nullable clusterinstallation.ClusterInstallationSpecMattermostEnvValueFrom getValueFrom() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link ClusterInstallationSpecMattermostEnv}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ClusterInstallationSpecMattermostEnv}
     */
    public static final class Builder {
        private java.lang.String name;
        private java.lang.String value;
        private clusterinstallation.ClusterInstallationSpecMattermostEnvValueFrom valueFrom;

        /**
         * Sets the value of {@link ClusterInstallationSpecMattermostEnv#getName}
         * @param name Name of the environment variable. This parameter is required.
         *             Must be a C_IDENTIFIER.
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link ClusterInstallationSpecMattermostEnv#getValue}
         * @param value Variable references $(VAR_NAME) are expanded using the previous defined environment variables in the container and any service environment variables.
         *              If a variable cannot be resolved, the reference in the input string will be unchanged. The $(VAR_NAME) syntax can be escaped with a double $$, ie: $$(VAR_NAME). Escaped references will never be expanded, regardless of whether the variable exists or not. Defaults to "".
         * @return {@code this}
         */
        public Builder value(java.lang.String value) {
            this.value = value;
            return this;
        }

        /**
         * Sets the value of {@link ClusterInstallationSpecMattermostEnv#getValueFrom}
         * @param valueFrom Source for the environment variable's value.
         *                  Cannot be used if value is not empty.
         * @return {@code this}
         */
        public Builder valueFrom(clusterinstallation.ClusterInstallationSpecMattermostEnvValueFrom valueFrom) {
            this.valueFrom = valueFrom;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link ClusterInstallationSpecMattermostEnv}
         * @throws NullPointerException if any required attribute was not provided
         */
        public ClusterInstallationSpecMattermostEnv build() {
            return new Jsii$Proxy(name, value, valueFrom);
        }
    }

    /**
     * An implementation for {@link ClusterInstallationSpecMattermostEnv}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ClusterInstallationSpecMattermostEnv {
        private final java.lang.String name;
        private final java.lang.String value;
        private final clusterinstallation.ClusterInstallationSpecMattermostEnvValueFrom valueFrom;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.name = this.jsiiGet("name", java.lang.String.class);
            this.value = this.jsiiGet("value", java.lang.String.class);
            this.valueFrom = this.jsiiGet("valueFrom", clusterinstallation.ClusterInstallationSpecMattermostEnvValueFrom.class);
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        private Jsii$Proxy(final java.lang.String name, final java.lang.String value, final clusterinstallation.ClusterInstallationSpecMattermostEnvValueFrom valueFrom) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.name = java.util.Objects.requireNonNull(name, "name is required");
            this.value = value;
            this.valueFrom = valueFrom;
        }

        @Override
        public java.lang.String getName() {
            return this.name;
        }

        @Override
        public java.lang.String getValue() {
            return this.value;
        }

        @Override
        public clusterinstallation.ClusterInstallationSpecMattermostEnvValueFrom getValueFrom() {
            return this.valueFrom;
        }

        @Override
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("name", om.valueToTree(this.getName()));
            if (this.getValue() != null) {
                data.set("value", om.valueToTree(this.getValue()));
            }
            if (this.getValueFrom() != null) {
                data.set("valueFrom", om.valueToTree(this.getValueFrom()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("clusterinstallation.ClusterInstallationSpecMattermostEnv"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ClusterInstallationSpecMattermostEnv.Jsii$Proxy that = (ClusterInstallationSpecMattermostEnv.Jsii$Proxy) o;

            if (!name.equals(that.name)) return false;
            if (this.value != null ? !this.value.equals(that.value) : that.value != null) return false;
            return this.valueFrom != null ? this.valueFrom.equals(that.valueFrom) : that.valueFrom == null;
        }

        @Override
        public int hashCode() {
            int result = this.name.hashCode();
            result = 31 * result + (this.value != null ? this.value.hashCode() : 0);
            result = 31 * result + (this.valueFrom != null ? this.valueFrom.hashCode() : 0);
            return result;
        }
    }
}
