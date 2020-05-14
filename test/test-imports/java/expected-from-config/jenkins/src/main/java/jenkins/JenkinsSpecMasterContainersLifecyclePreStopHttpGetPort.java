package jenkins;

/**
 * Name or number of the port to access on the container.
 * <p>
 * Number must be in the range 1 to 65535. Name must be an IANA_SVC_NAME.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T15:59:02.617Z")
@software.amazon.jsii.Jsii(module = jenkins.$Module.class, fqn = "jenkins.JenkinsSpecMasterContainersLifecyclePreStopHttpGetPort")
public class JenkinsSpecMasterContainersLifecyclePreStopHttpGetPort extends software.amazon.jsii.JsiiObject {

    protected JenkinsSpecMasterContainersLifecyclePreStopHttpGetPort(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected JenkinsSpecMasterContainersLifecyclePreStopHttpGetPort(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    public static @org.jetbrains.annotations.NotNull jenkins.JenkinsSpecMasterContainersLifecyclePreStopHttpGetPort fromNumber(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        return software.amazon.jsii.JsiiObject.jsiiStaticCall(jenkins.JenkinsSpecMasterContainersLifecyclePreStopHttpGetPort.class, "fromNumber", jenkins.JenkinsSpecMasterContainersLifecyclePreStopHttpGetPort.class, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public static @org.jetbrains.annotations.NotNull jenkins.JenkinsSpecMasterContainersLifecyclePreStopHttpGetPort fromString(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        return software.amazon.jsii.JsiiObject.jsiiStaticCall(jenkins.JenkinsSpecMasterContainersLifecyclePreStopHttpGetPort.class, "fromString", jenkins.JenkinsSpecMasterContainersLifecyclePreStopHttpGetPort.class, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }
}
