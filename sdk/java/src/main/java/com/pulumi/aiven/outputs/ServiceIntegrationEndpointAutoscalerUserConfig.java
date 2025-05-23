// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aiven.outputs;

import com.pulumi.aiven.outputs.ServiceIntegrationEndpointAutoscalerUserConfigAutoscaling;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.util.List;
import java.util.Objects;

@CustomType
public final class ServiceIntegrationEndpointAutoscalerUserConfig {
    /**
     * @return Configure autoscaling thresholds for a service
     * 
     */
    private List<ServiceIntegrationEndpointAutoscalerUserConfigAutoscaling> autoscalings;

    private ServiceIntegrationEndpointAutoscalerUserConfig() {}
    /**
     * @return Configure autoscaling thresholds for a service
     * 
     */
    public List<ServiceIntegrationEndpointAutoscalerUserConfigAutoscaling> autoscalings() {
        return this.autoscalings;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceIntegrationEndpointAutoscalerUserConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<ServiceIntegrationEndpointAutoscalerUserConfigAutoscaling> autoscalings;
        public Builder() {}
        public Builder(ServiceIntegrationEndpointAutoscalerUserConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoscalings = defaults.autoscalings;
        }

        @CustomType.Setter
        public Builder autoscalings(List<ServiceIntegrationEndpointAutoscalerUserConfigAutoscaling> autoscalings) {
            if (autoscalings == null) {
              throw new MissingRequiredPropertyException("ServiceIntegrationEndpointAutoscalerUserConfig", "autoscalings");
            }
            this.autoscalings = autoscalings;
            return this;
        }
        public Builder autoscalings(ServiceIntegrationEndpointAutoscalerUserConfigAutoscaling... autoscalings) {
            return autoscalings(List.of(autoscalings));
        }
        public ServiceIntegrationEndpointAutoscalerUserConfig build() {
            final var _resultValue = new ServiceIntegrationEndpointAutoscalerUserConfig();
            _resultValue.autoscalings = autoscalings;
            return _resultValue;
        }
    }
}
