package jenkins;

/**
 * TCPSocket specifies an action involving a TCP port.
 * <p>
 * TCP hooks not yet supported TODO: implement a realistic TCP lifecycle hook
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T15:59:02.617Z")
@software.amazon.jsii.Jsii(module = jenkins.$Module.class, fqn = "jenkins.JenkinsSpecMasterContainersLifecyclePreStopTcpSocket")
@software.amazon.jsii.Jsii.Proxy(JenkinsSpecMasterContainersLifecyclePreStopTcpSocket.Jsii$Proxy.class)
public interface JenkinsSpecMasterContainersLifecyclePreStopTcpSocket extends software.amazon.jsii.JsiiSerializable {

    /**
     * Number or name of the port to access on the container.
     * <p>
     * Number must be in the range 1 to 65535. Name must be an IANA_SVC_NAME.
     */
    @org.jetbrains.annotations.NotNull jenkins.JenkinsSpecMasterContainersLifecyclePreStopTcpSocketPort getPort();

    /**
     * Optional: Host name to connect to, defaults to the pod IP.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getHost() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link JenkinsSpecMasterContainersLifecyclePreStopTcpSocket}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link JenkinsSpecMasterContainersLifecyclePreStopTcpSocket}
     */
    public static final class Builder {
        private jenkins.JenkinsSpecMasterContainersLifecyclePreStopTcpSocketPort port;
        private java.lang.String host;

        /**
         * Sets the value of {@link JenkinsSpecMasterContainersLifecyclePreStopTcpSocket#getPort}
         * @param port Number or name of the port to access on the container. This parameter is required.
         *             Number must be in the range 1 to 65535. Name must be an IANA_SVC_NAME.
         * @return {@code this}
         */
        public Builder port(jenkins.JenkinsSpecMasterContainersLifecyclePreStopTcpSocketPort port) {
            this.port = port;
            return this;
        }

        /**
         * Sets the value of {@link JenkinsSpecMasterContainersLifecyclePreStopTcpSocket#getHost}
         * @param host Optional: Host name to connect to, defaults to the pod IP.
         * @return {@code this}
         */
        public Builder host(java.lang.String host) {
            this.host = host;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link JenkinsSpecMasterContainersLifecyclePreStopTcpSocket}
         * @throws NullPointerException if any required attribute was not provided
         */
        public JenkinsSpecMasterContainersLifecyclePreStopTcpSocket build() {
            return new Jsii$Proxy(port, host);
        }
    }

    /**
     * An implementation for {@link JenkinsSpecMasterContainersLifecyclePreStopTcpSocket}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements JenkinsSpecMasterContainersLifecyclePreStopTcpSocket {
        private final jenkins.JenkinsSpecMasterContainersLifecyclePreStopTcpSocketPort port;
        private final java.lang.String host;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.port = this.jsiiGet("port", jenkins.JenkinsSpecMasterContainersLifecyclePreStopTcpSocketPort.class);
            this.host = this.jsiiGet("host", java.lang.String.class);
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        private Jsii$Proxy(final jenkins.JenkinsSpecMasterContainersLifecyclePreStopTcpSocketPort port, final java.lang.String host) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.port = java.util.Objects.requireNonNull(port, "port is required");
            this.host = host;
        }

        @Override
        public jenkins.JenkinsSpecMasterContainersLifecyclePreStopTcpSocketPort getPort() {
            return this.port;
        }

        @Override
        public java.lang.String getHost() {
            return this.host;
        }

        @Override
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("port", om.valueToTree(this.getPort()));
            if (this.getHost() != null) {
                data.set("host", om.valueToTree(this.getHost()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("jenkins.JenkinsSpecMasterContainersLifecyclePreStopTcpSocket"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            JenkinsSpecMasterContainersLifecyclePreStopTcpSocket.Jsii$Proxy that = (JenkinsSpecMasterContainersLifecyclePreStopTcpSocket.Jsii$Proxy) o;

            if (!port.equals(that.port)) return false;
            return this.host != null ? this.host.equals(that.host) : that.host == null;
        }

        @Override
        public int hashCode() {
            int result = this.port.hashCode();
            result = 31 * result + (this.host != null ? this.host.hashCode() : 0);
            return result;
        }
    }
}
