package k8s;

/**
 * DownwardAPIVolumeSource represents a volume containing downward API info.
 * <p>
 * Downward API volumes support ownership management and SELinux relabeling.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T15:58:47.182Z")
@software.amazon.jsii.Jsii(module = k8s.$Module.class, fqn = "k8s.DownwardAPIVolumeSource")
@software.amazon.jsii.Jsii.Proxy(DownwardAPIVolumeSource.Jsii$Proxy.class)
public interface DownwardAPIVolumeSource extends software.amazon.jsii.JsiiSerializable {

    /**
     * Optional: mode bits to use on created files by default.
     * <p>
     * Must be a value between 0 and 0777. Defaults to 0644. Directories within the path are not affected by this setting. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.
     * <p>
     * Default: 0644. Directories within the path are not affected by this setting. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getDefaultMode() {
        return null;
    }

    /**
     * Items is a list of downward API volume file.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<k8s.DownwardAPIVolumeFile> getItems() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link DownwardAPIVolumeSource}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link DownwardAPIVolumeSource}
     */
    public static final class Builder {
        private java.lang.Number defaultMode;
        private java.util.List<k8s.DownwardAPIVolumeFile> items;

        /**
         * Sets the value of {@link DownwardAPIVolumeSource#getDefaultMode}
         * @param defaultMode Optional: mode bits to use on created files by default.
         *                    Must be a value between 0 and 0777. Defaults to 0644. Directories within the path are not affected by this setting. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.
         * @return {@code this}
         */
        public Builder defaultMode(java.lang.Number defaultMode) {
            this.defaultMode = defaultMode;
            return this;
        }

        /**
         * Sets the value of {@link DownwardAPIVolumeSource#getItems}
         * @param items Items is a list of downward API volume file.
         * @return {@code this}
         */
        public Builder items(java.util.List<k8s.DownwardAPIVolumeFile> items) {
            this.items = items;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link DownwardAPIVolumeSource}
         * @throws NullPointerException if any required attribute was not provided
         */
        public DownwardAPIVolumeSource build() {
            return new Jsii$Proxy(defaultMode, items);
        }
    }

    /**
     * An implementation for {@link DownwardAPIVolumeSource}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements DownwardAPIVolumeSource {
        private final java.lang.Number defaultMode;
        private final java.util.List<k8s.DownwardAPIVolumeFile> items;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.defaultMode = this.jsiiGet("defaultMode", java.lang.Number.class);
            this.items = this.jsiiGet("items", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(k8s.DownwardAPIVolumeFile.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        private Jsii$Proxy(final java.lang.Number defaultMode, final java.util.List<k8s.DownwardAPIVolumeFile> items) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.defaultMode = defaultMode;
            this.items = items;
        }

        @Override
        public java.lang.Number getDefaultMode() {
            return this.defaultMode;
        }

        @Override
        public java.util.List<k8s.DownwardAPIVolumeFile> getItems() {
            return this.items;
        }

        @Override
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getDefaultMode() != null) {
                data.set("defaultMode", om.valueToTree(this.getDefaultMode()));
            }
            if (this.getItems() != null) {
                data.set("items", om.valueToTree(this.getItems()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.DownwardAPIVolumeSource"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            DownwardAPIVolumeSource.Jsii$Proxy that = (DownwardAPIVolumeSource.Jsii$Proxy) o;

            if (this.defaultMode != null ? !this.defaultMode.equals(that.defaultMode) : that.defaultMode != null) return false;
            return this.items != null ? this.items.equals(that.items) : that.items == null;
        }

        @Override
        public int hashCode() {
            int result = this.defaultMode != null ? this.defaultMode.hashCode() : 0;
            result = 31 * result + (this.items != null ? this.items.hashCode() : 0);
            return result;
        }
    }
}
