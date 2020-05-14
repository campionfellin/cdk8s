package clusterinstallation;

/**
 * Required.
 * <p>
 * A pod affinity term, associated with the corresponding weight.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T16:00:54.317Z")
@software.amazon.jsii.Jsii(module = clusterinstallation.$Module.class, fqn = "clusterinstallation.ClusterInstallationSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTerm")
@software.amazon.jsii.Jsii.Proxy(ClusterInstallationSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTerm.Jsii$Proxy.class)
public interface ClusterInstallationSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTerm extends software.amazon.jsii.JsiiSerializable {

    /**
     * This pod should be co-located (affinity) or not co-located (anti-affinity) with the pods matching the labelSelector in the specified namespaces, where co-located is defined as running on a node whose value of the label with key topologyKey matches that of any node on which any of the selected pods is running.
     * <p>
     * Empty topologyKey is not allowed.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getTopologyKey();

    /**
     * A label query over a set of resources, in this case pods.
     */
    default @org.jetbrains.annotations.Nullable clusterinstallation.ClusterInstallationSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTermLabelSelector getLabelSelector() {
        return null;
    }

    /**
     * namespaces specifies which namespaces the labelSelector applies to (matches against);
     * <p>
     * null or empty list means "this pod's namespace"
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getNamespaces() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link ClusterInstallationSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTerm}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ClusterInstallationSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTerm}
     */
    public static final class Builder {
        private java.lang.String topologyKey;
        private clusterinstallation.ClusterInstallationSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTermLabelSelector labelSelector;
        private java.util.List<java.lang.String> namespaces;

        /**
         * Sets the value of {@link ClusterInstallationSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTerm#getTopologyKey}
         * @param topologyKey This pod should be co-located (affinity) or not co-located (anti-affinity) with the pods matching the labelSelector in the specified namespaces, where co-located is defined as running on a node whose value of the label with key topologyKey matches that of any node on which any of the selected pods is running. This parameter is required.
         *                    Empty topologyKey is not allowed.
         * @return {@code this}
         */
        public Builder topologyKey(java.lang.String topologyKey) {
            this.topologyKey = topologyKey;
            return this;
        }

        /**
         * Sets the value of {@link ClusterInstallationSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTerm#getLabelSelector}
         * @param labelSelector A label query over a set of resources, in this case pods.
         * @return {@code this}
         */
        public Builder labelSelector(clusterinstallation.ClusterInstallationSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTermLabelSelector labelSelector) {
            this.labelSelector = labelSelector;
            return this;
        }

        /**
         * Sets the value of {@link ClusterInstallationSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTerm#getNamespaces}
         * @param namespaces namespaces specifies which namespaces the labelSelector applies to (matches against);.
         *                   null or empty list means "this pod's namespace"
         * @return {@code this}
         */
        public Builder namespaces(java.util.List<java.lang.String> namespaces) {
            this.namespaces = namespaces;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link ClusterInstallationSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTerm}
         * @throws NullPointerException if any required attribute was not provided
         */
        public ClusterInstallationSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTerm build() {
            return new Jsii$Proxy(topologyKey, labelSelector, namespaces);
        }
    }

    /**
     * An implementation for {@link ClusterInstallationSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTerm}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ClusterInstallationSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTerm {
        private final java.lang.String topologyKey;
        private final clusterinstallation.ClusterInstallationSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTermLabelSelector labelSelector;
        private final java.util.List<java.lang.String> namespaces;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.topologyKey = this.jsiiGet("topologyKey", java.lang.String.class);
            this.labelSelector = this.jsiiGet("labelSelector", clusterinstallation.ClusterInstallationSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTermLabelSelector.class);
            this.namespaces = this.jsiiGet("namespaces", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        private Jsii$Proxy(final java.lang.String topologyKey, final clusterinstallation.ClusterInstallationSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTermLabelSelector labelSelector, final java.util.List<java.lang.String> namespaces) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.topologyKey = java.util.Objects.requireNonNull(topologyKey, "topologyKey is required");
            this.labelSelector = labelSelector;
            this.namespaces = namespaces;
        }

        @Override
        public java.lang.String getTopologyKey() {
            return this.topologyKey;
        }

        @Override
        public clusterinstallation.ClusterInstallationSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTermLabelSelector getLabelSelector() {
            return this.labelSelector;
        }

        @Override
        public java.util.List<java.lang.String> getNamespaces() {
            return this.namespaces;
        }

        @Override
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("topologyKey", om.valueToTree(this.getTopologyKey()));
            if (this.getLabelSelector() != null) {
                data.set("labelSelector", om.valueToTree(this.getLabelSelector()));
            }
            if (this.getNamespaces() != null) {
                data.set("namespaces", om.valueToTree(this.getNamespaces()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("clusterinstallation.ClusterInstallationSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTerm"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ClusterInstallationSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTerm.Jsii$Proxy that = (ClusterInstallationSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecutionPodAffinityTerm.Jsii$Proxy) o;

            if (!topologyKey.equals(that.topologyKey)) return false;
            if (this.labelSelector != null ? !this.labelSelector.equals(that.labelSelector) : that.labelSelector != null) return false;
            return this.namespaces != null ? this.namespaces.equals(that.namespaces) : that.namespaces == null;
        }

        @Override
        public int hashCode() {
            int result = this.topologyKey.hashCode();
            result = 31 * result + (this.labelSelector != null ? this.labelSelector.hashCode() : 0);
            result = 31 * result + (this.namespaces != null ? this.namespaces.hashCode() : 0);
            return result;
        }
    }
}
