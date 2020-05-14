package jenkins;

/**
 * ConfigMap represents a configMap that should populate this volume.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T15:59:02.662Z")
@software.amazon.jsii.Jsii(module = jenkins.$Module.class, fqn = "jenkins.JenkinsSpecMasterVolumesConfigMap")
@software.amazon.jsii.Jsii.Proxy(JenkinsSpecMasterVolumesConfigMap.Jsii$Proxy.class)
public interface JenkinsSpecMasterVolumesConfigMap extends software.amazon.jsii.JsiiSerializable {

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
     * If unspecified, each key-value pair in the Data field of the referenced ConfigMap will be projected into the volume as a file whose name is the key and content is the value.
     * <p>
     * If specified, the listed keys will be projected into the specified paths, and unlisted keys will not be present. If a key is specified which is not present in the ConfigMap, the volume setup will error unless it is marked optional. Paths must be relative and may not contain the '..' path or start with '..'.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<jenkins.JenkinsSpecMasterVolumesConfigMapItems> getItems() {
        return null;
    }

    /**
     * Name of the referent.
     * <p>
     * More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names TODO: Add other useful fields. apiVersion, kind, uid?
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getName() {
        return null;
    }

    /**
     * Specify whether the ConfigMap or its keys must be defined.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getOptional() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link JenkinsSpecMasterVolumesConfigMap}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link JenkinsSpecMasterVolumesConfigMap}
     */
    public static final class Builder {
        private java.lang.Number defaultMode;
        private java.util.List<jenkins.JenkinsSpecMasterVolumesConfigMapItems> items;
        private java.lang.String name;
        private java.lang.Boolean optional;

        /**
         * Sets the value of {@link JenkinsSpecMasterVolumesConfigMap#getDefaultMode}
         * @param defaultMode Optional: mode bits to use on created files by default.
         *                    Must be a value between 0 and 0777. Defaults to 0644. Directories within the path are not affected by this setting. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.
         * @return {@code this}
         */
        public Builder defaultMode(java.lang.Number defaultMode) {
            this.defaultMode = defaultMode;
            return this;
        }

        /**
         * Sets the value of {@link JenkinsSpecMasterVolumesConfigMap#getItems}
         * @param items If unspecified, each key-value pair in the Data field of the referenced ConfigMap will be projected into the volume as a file whose name is the key and content is the value.
         *              If specified, the listed keys will be projected into the specified paths, and unlisted keys will not be present. If a key is specified which is not present in the ConfigMap, the volume setup will error unless it is marked optional. Paths must be relative and may not contain the '..' path or start with '..'.
         * @return {@code this}
         */
        public Builder items(java.util.List<jenkins.JenkinsSpecMasterVolumesConfigMapItems> items) {
            this.items = items;
            return this;
        }

        /**
         * Sets the value of {@link JenkinsSpecMasterVolumesConfigMap#getName}
         * @param name Name of the referent.
         *             More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names TODO: Add other useful fields. apiVersion, kind, uid?
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link JenkinsSpecMasterVolumesConfigMap#getOptional}
         * @param optional Specify whether the ConfigMap or its keys must be defined.
         * @return {@code this}
         */
        public Builder optional(java.lang.Boolean optional) {
            this.optional = optional;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link JenkinsSpecMasterVolumesConfigMap}
         * @throws NullPointerException if any required attribute was not provided
         */
        public JenkinsSpecMasterVolumesConfigMap build() {
            return new Jsii$Proxy(defaultMode, items, name, optional);
        }
    }

    /**
     * An implementation for {@link JenkinsSpecMasterVolumesConfigMap}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements JenkinsSpecMasterVolumesConfigMap {
        private final java.lang.Number defaultMode;
        private final java.util.List<jenkins.JenkinsSpecMasterVolumesConfigMapItems> items;
        private final java.lang.String name;
        private final java.lang.Boolean optional;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.defaultMode = this.jsiiGet("defaultMode", java.lang.Number.class);
            this.items = this.jsiiGet("items", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(jenkins.JenkinsSpecMasterVolumesConfigMapItems.class)));
            this.name = this.jsiiGet("name", java.lang.String.class);
            this.optional = this.jsiiGet("optional", java.lang.Boolean.class);
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        private Jsii$Proxy(final java.lang.Number defaultMode, final java.util.List<jenkins.JenkinsSpecMasterVolumesConfigMapItems> items, final java.lang.String name, final java.lang.Boolean optional) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.defaultMode = defaultMode;
            this.items = items;
            this.name = name;
            this.optional = optional;
        }

        @Override
        public java.lang.Number getDefaultMode() {
            return this.defaultMode;
        }

        @Override
        public java.util.List<jenkins.JenkinsSpecMasterVolumesConfigMapItems> getItems() {
            return this.items;
        }

        @Override
        public java.lang.String getName() {
            return this.name;
        }

        @Override
        public java.lang.Boolean getOptional() {
            return this.optional;
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
            if (this.getName() != null) {
                data.set("name", om.valueToTree(this.getName()));
            }
            if (this.getOptional() != null) {
                data.set("optional", om.valueToTree(this.getOptional()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("jenkins.JenkinsSpecMasterVolumesConfigMap"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            JenkinsSpecMasterVolumesConfigMap.Jsii$Proxy that = (JenkinsSpecMasterVolumesConfigMap.Jsii$Proxy) o;

            if (this.defaultMode != null ? !this.defaultMode.equals(that.defaultMode) : that.defaultMode != null) return false;
            if (this.items != null ? !this.items.equals(that.items) : that.items != null) return false;
            if (this.name != null ? !this.name.equals(that.name) : that.name != null) return false;
            return this.optional != null ? this.optional.equals(that.optional) : that.optional == null;
        }

        @Override
        public int hashCode() {
            int result = this.defaultMode != null ? this.defaultMode.hashCode() : 0;
            result = 31 * result + (this.items != null ? this.items.hashCode() : 0);
            result = 31 * result + (this.name != null ? this.name.hashCode() : 0);
            result = 31 * result + (this.optional != null ? this.optional.hashCode() : 0);
            return result;
        }
    }
}
