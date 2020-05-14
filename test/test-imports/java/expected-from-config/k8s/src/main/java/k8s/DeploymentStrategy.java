package k8s;

/**
 * DeploymentStrategy describes how to replace existing pods with new ones.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T15:58:47.181Z")
@software.amazon.jsii.Jsii(module = k8s.$Module.class, fqn = "k8s.DeploymentStrategy")
@software.amazon.jsii.Jsii.Proxy(DeploymentStrategy.Jsii$Proxy.class)
public interface DeploymentStrategy extends software.amazon.jsii.JsiiSerializable {

    /**
     * Rolling update config params.
     * <p>
     * Present only if DeploymentStrategyType = RollingUpdate.
     */
    default @org.jetbrains.annotations.Nullable k8s.RollingUpdateDeployment getRollingUpdate() {
        return null;
    }

    /**
     * Type of deployment.
     * <p>
     * Can be "Recreate" or "RollingUpdate". Default is RollingUpdate.
     * <p>
     * Default: RollingUpdate.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getType() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link DeploymentStrategy}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link DeploymentStrategy}
     */
    public static final class Builder {
        private k8s.RollingUpdateDeployment rollingUpdate;
        private java.lang.String type;

        /**
         * Sets the value of {@link DeploymentStrategy#getRollingUpdate}
         * @param rollingUpdate Rolling update config params.
         *                      Present only if DeploymentStrategyType = RollingUpdate.
         * @return {@code this}
         */
        public Builder rollingUpdate(k8s.RollingUpdateDeployment rollingUpdate) {
            this.rollingUpdate = rollingUpdate;
            return this;
        }

        /**
         * Sets the value of {@link DeploymentStrategy#getType}
         * @param type Type of deployment.
         *             Can be "Recreate" or "RollingUpdate". Default is RollingUpdate.
         * @return {@code this}
         */
        public Builder type(java.lang.String type) {
            this.type = type;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link DeploymentStrategy}
         * @throws NullPointerException if any required attribute was not provided
         */
        public DeploymentStrategy build() {
            return new Jsii$Proxy(rollingUpdate, type);
        }
    }

    /**
     * An implementation for {@link DeploymentStrategy}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements DeploymentStrategy {
        private final k8s.RollingUpdateDeployment rollingUpdate;
        private final java.lang.String type;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.rollingUpdate = this.jsiiGet("rollingUpdate", k8s.RollingUpdateDeployment.class);
            this.type = this.jsiiGet("type", java.lang.String.class);
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        private Jsii$Proxy(final k8s.RollingUpdateDeployment rollingUpdate, final java.lang.String type) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.rollingUpdate = rollingUpdate;
            this.type = type;
        }

        @Override
        public k8s.RollingUpdateDeployment getRollingUpdate() {
            return this.rollingUpdate;
        }

        @Override
        public java.lang.String getType() {
            return this.type;
        }

        @Override
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getRollingUpdate() != null) {
                data.set("rollingUpdate", om.valueToTree(this.getRollingUpdate()));
            }
            if (this.getType() != null) {
                data.set("type", om.valueToTree(this.getType()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.DeploymentStrategy"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            DeploymentStrategy.Jsii$Proxy that = (DeploymentStrategy.Jsii$Proxy) o;

            if (this.rollingUpdate != null ? !this.rollingUpdate.equals(that.rollingUpdate) : that.rollingUpdate != null) return false;
            return this.type != null ? this.type.equals(that.type) : that.type == null;
        }

        @Override
        public int hashCode() {
            int result = this.rollingUpdate != null ? this.rollingUpdate.hashCode() : 0;
            result = 31 * result + (this.type != null ? this.type.hashCode() : 0);
            return result;
        }
    }
}
