package k8s;

/**
 * HTTPHeader describes a custom header to be used in HTTP probes.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T15:58:47.234Z")
@software.amazon.jsii.Jsii(module = k8s.$Module.class, fqn = "k8s.HTTPHeader")
@software.amazon.jsii.Jsii.Proxy(HTTPHeader.Jsii$Proxy.class)
public interface HTTPHeader extends software.amazon.jsii.JsiiSerializable {

    /**
     * The header field name.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getName();

    /**
     * The header field value.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getValue();

    /**
     * @return a {@link Builder} of {@link HTTPHeader}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link HTTPHeader}
     */
    public static final class Builder {
        private java.lang.String name;
        private java.lang.String value;

        /**
         * Sets the value of {@link HTTPHeader#getName}
         * @param name The header field name. This parameter is required.
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link HTTPHeader#getValue}
         * @param value The header field value. This parameter is required.
         * @return {@code this}
         */
        public Builder value(java.lang.String value) {
            this.value = value;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link HTTPHeader}
         * @throws NullPointerException if any required attribute was not provided
         */
        public HTTPHeader build() {
            return new Jsii$Proxy(name, value);
        }
    }

    /**
     * An implementation for {@link HTTPHeader}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements HTTPHeader {
        private final java.lang.String name;
        private final java.lang.String value;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.name = this.jsiiGet("name", java.lang.String.class);
            this.value = this.jsiiGet("value", java.lang.String.class);
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        private Jsii$Proxy(final java.lang.String name, final java.lang.String value) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.name = java.util.Objects.requireNonNull(name, "name is required");
            this.value = java.util.Objects.requireNonNull(value, "value is required");
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
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("name", om.valueToTree(this.getName()));
            data.set("value", om.valueToTree(this.getValue()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.HTTPHeader"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            HTTPHeader.Jsii$Proxy that = (HTTPHeader.Jsii$Proxy) o;

            if (!name.equals(that.name)) return false;
            return this.value.equals(that.value);
        }

        @Override
        public int hashCode() {
            int result = this.name.hashCode();
            result = 31 * result + (this.value.hashCode());
            return result;
        }
    }
}
