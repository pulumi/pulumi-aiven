// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aiven.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ServiceIntegrationEndpointExternalGoogleCloudLoggingUserConfig {
    /**
     * @return Google Cloud Logging log id
     * 
     */
    private @Nullable String logId;
    /**
     * @return GCP project id.
     * 
     */
    private @Nullable String projectId;
    /**
     * @return This is a JSON object with the fields documented in https://cloud.google.com/iam/docs/creating-managing-service-account-keys .
     * 
     */
    private @Nullable String serviceAccountCredentials;

    private ServiceIntegrationEndpointExternalGoogleCloudLoggingUserConfig() {}
    /**
     * @return Google Cloud Logging log id
     * 
     */
    public Optional<String> logId() {
        return Optional.ofNullable(this.logId);
    }
    /**
     * @return GCP project id.
     * 
     */
    public Optional<String> projectId() {
        return Optional.ofNullable(this.projectId);
    }
    /**
     * @return This is a JSON object with the fields documented in https://cloud.google.com/iam/docs/creating-managing-service-account-keys .
     * 
     */
    public Optional<String> serviceAccountCredentials() {
        return Optional.ofNullable(this.serviceAccountCredentials);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceIntegrationEndpointExternalGoogleCloudLoggingUserConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String logId;
        private @Nullable String projectId;
        private @Nullable String serviceAccountCredentials;
        public Builder() {}
        public Builder(ServiceIntegrationEndpointExternalGoogleCloudLoggingUserConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.logId = defaults.logId;
    	      this.projectId = defaults.projectId;
    	      this.serviceAccountCredentials = defaults.serviceAccountCredentials;
        }

        @CustomType.Setter
        public Builder logId(@Nullable String logId) {
            this.logId = logId;
            return this;
        }
        @CustomType.Setter
        public Builder projectId(@Nullable String projectId) {
            this.projectId = projectId;
            return this;
        }
        @CustomType.Setter
        public Builder serviceAccountCredentials(@Nullable String serviceAccountCredentials) {
            this.serviceAccountCredentials = serviceAccountCredentials;
            return this;
        }
        public ServiceIntegrationEndpointExternalGoogleCloudLoggingUserConfig build() {
            final var o = new ServiceIntegrationEndpointExternalGoogleCloudLoggingUserConfig();
            o.logId = logId;
            o.projectId = projectId;
            o.serviceAccountCredentials = serviceAccountCredentials;
            return o;
        }
    }
}