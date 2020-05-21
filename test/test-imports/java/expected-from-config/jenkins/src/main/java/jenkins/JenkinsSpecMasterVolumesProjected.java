package jenkins;

/**
 * Items for all in one resources secrets, configmaps, and downward API.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T15:59:02.685Z")
@software.amazon.jsii.Jsii(module = jenkins.$Module.class, fqn = "jenkins.JenkinsSpecMasterVolumesProjected")
@software.amazon.jsii.Jsii.Proxy(JenkinsSpecMasterVolumesProjected.Jsii$Proxy.class)
public interface JenkinsSpecMasterVolumesProjected extends software.amazon.jsii.JsiiSerializable {

    /**
     * list of volume projections.
     */
    @org.jetbrains.annotations.NotNull java.util.List<jenkins.JenkinsSpecMasterVolumesProjectedSources> getSources();

    /**
     * Mode bits to use on created files by default.
     * <p>
     * Must be a value between 0 and 0777. Directories within the path are not affected by this setting. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getDefaultMode() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link JenkinsSpecMasterVolumesProjected}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link JenkinsSpecMasterVolumesProjected}
     */
    public static final class Builder {
        private java.util.List<jenkins.JenkinsSpecMasterVolumesProjectedSources> sources;
        private java.lang.Number defaultMode;

        /**
         * Sets the value of {@link JenkinsSpecMasterVolumesProjected#getSources}
         * @param sources list of volume projections. This parameter is required.
         * @return {@code this}
         */
        public Builder sources(java.util.List<jenkins.JenkinsSpecMasterVolumesProjectedSources> sources) {
            this.sources = sources;
            return this;
        }

        /**
         * Sets the value of {@link JenkinsSpecMasterVolumesProjected#getDefaultMode}
         * @param defaultMode Mode bits to use on created files by default.
         *                    Must be a value between 0 and 0777. Directories within the path are not affected by this setting. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.
         * @return {@code this}
         */
        public Builder defaultMode(java.lang.Number defaultMode) {
            this.defaultMode = defaultMode;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link JenkinsSpecMasterVolumesProjected}
         * @throws NullPointerException if any required attribute was not provided
         */
        public JenkinsSpecMasterVolumesProjected build() {
            return new Jsii$Proxy(sources, defaultMode);
        }
    }

    /**
     * An implementation for {@link JenkinsSpecMasterVolumesProjected}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements JenkinsSpecMasterVolumesProjected {
        private final java.util.List<jenkins.JenkinsSpecMasterVolumesProjectedSources> sources;
        private final java.lang.Number defaultMode;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.sources = this.jsiiGet("sources", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(jenkins.JenkinsSpecMasterVolumesProjectedSources.class)));
            this.defaultMode = this.jsiiGet("defaultMode", java.lang.Number.class);
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        private Jsii$Proxy(final java.util.List<jenkins.JenkinsSpecMasterVolumesProjectedSources> sources, final java.lang.Number defaultMode) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.sources = java.util.Objects.requireNonNull(sources, "sources is required");
            this.defaultMode = defaultMode;
        }

        @Override
        public java.util.List<jenkins.JenkinsSpecMasterVolumesProjectedSources> getSources() {
            return this.sources;
        }

        @Override
        public java.lang.Number getDefaultMode() {
            return this.defaultMode;
        }

        @Override
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("sources", om.valueToTree(this.getSources()));
            if (this.getDefaultMode() != null) {
                data.set("defaultMode", om.valueToTree(this.getDefaultMode()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("jenkins.JenkinsSpecMasterVolumesProjected"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            JenkinsSpecMasterVolumesProjected.Jsii$Proxy that = (JenkinsSpecMasterVolumesProjected.Jsii$Proxy) o;

            if (!sources.equals(that.sources)) return false;
            return this.defaultMode != null ? this.defaultMode.equals(that.defaultMode) : that.defaultMode == null;
        }

        @Override
        public int hashCode() {
            int result = this.sources.hashCode();
            result = 31 * result + (this.defaultMode != null ? this.defaultMode.hashCode() : 0);
            return result;
        }
    }
}
