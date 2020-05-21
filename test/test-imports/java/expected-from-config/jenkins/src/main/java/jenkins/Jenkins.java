package jenkins;

/**
 * Jenkins is the Schema for the jenkins API.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T15:59:02.581Z")
@software.amazon.jsii.Jsii(module = jenkins.$Module.class, fqn = "jenkins.Jenkins")
public class Jenkins extends org.cdk8s.ApiObject {

    protected Jenkins(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected Jenkins(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * Defines a "Jenkins" API object.
     * <p>
     * @param scope the scope in which to define this object. This parameter is required.
     * @param name a scope-local name for the object. This parameter is required.
     * @param options configuration options.
     */
    public Jenkins(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String name, final @org.jetbrains.annotations.Nullable jenkins.JenkinsOptions options) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(name, "name is required"), options });
    }

    /**
     * Defines a "Jenkins" API object.
     * <p>
     * @param scope the scope in which to define this object. This parameter is required.
     * @param name a scope-local name for the object. This parameter is required.
     */
    public Jenkins(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String name) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(name, "name is required") });
    }

    /**
     * A fluent builder for {@link jenkins.Jenkins}.
     */
    public static final class Builder {
        /**
         * @return a new instance of {@link Builder}.
         * @param scope the scope in which to define this object. This parameter is required.
         * @param name a scope-local name for the object. This parameter is required.
         */
        public static Builder create(final software.constructs.Construct scope, final java.lang.String name) {
            return new Builder(scope, name);
        }

        private final software.constructs.Construct scope;
        private final java.lang.String name;
        private jenkins.JenkinsOptions.Builder options;

        private Builder(final software.constructs.Construct scope, final java.lang.String name) {
            this.scope = scope;
            this.name = name;
        }

        /**
         * @return {@code this}
         * @param metadata This parameter is required.
         */
        public Builder metadata(final java.lang.Object metadata) {
            this.options().metadata(metadata);
            return this;
        }

        /**
         * Spec defines the desired state of the Jenkins.
         * <p>
         * @return {@code this}
         * @param spec Spec defines the desired state of the Jenkins. This parameter is required.
         */
        public Builder spec(final jenkins.JenkinsSpec spec) {
            this.options().spec(spec);
            return this;
        }

        /**
         * @returns a newly built instance of {@link jenkins.Jenkins}.
         */
        public jenkins.Jenkins build() {
            return new jenkins.Jenkins(
                this.scope,
                this.name,
                this.options != null ? this.options.build() : null
            );
        }

        private jenkins.JenkinsOptions.Builder options() {
            if (this.options == null) {
                this.options = new jenkins.JenkinsOptions.Builder();
            }
            return this.options;
        }
    }
}
