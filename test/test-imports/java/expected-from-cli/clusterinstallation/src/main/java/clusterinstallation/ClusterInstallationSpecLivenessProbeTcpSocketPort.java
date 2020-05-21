package clusterinstallation;

/**
 * Number or name of the port to access on the container.
 * <p>
 * Number must be in the range 1 to 65535. Name must be an IANA_SVC_NAME.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T16:00:54.389Z")
@software.amazon.jsii.Jsii(module = clusterinstallation.$Module.class, fqn = "clusterinstallation.ClusterInstallationSpecLivenessProbeTcpSocketPort")
public class ClusterInstallationSpecLivenessProbeTcpSocketPort extends software.amazon.jsii.JsiiObject {

    protected ClusterInstallationSpecLivenessProbeTcpSocketPort(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected ClusterInstallationSpecLivenessProbeTcpSocketPort(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    public static @org.jetbrains.annotations.NotNull clusterinstallation.ClusterInstallationSpecLivenessProbeTcpSocketPort fromNumber(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        return software.amazon.jsii.JsiiObject.jsiiStaticCall(clusterinstallation.ClusterInstallationSpecLivenessProbeTcpSocketPort.class, "fromNumber", clusterinstallation.ClusterInstallationSpecLivenessProbeTcpSocketPort.class, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public static @org.jetbrains.annotations.NotNull clusterinstallation.ClusterInstallationSpecLivenessProbeTcpSocketPort fromString(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        return software.amazon.jsii.JsiiObject.jsiiStaticCall(clusterinstallation.ClusterInstallationSpecLivenessProbeTcpSocketPort.class, "fromString", clusterinstallation.ClusterInstallationSpecLivenessProbeTcpSocketPort.class, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }
}
