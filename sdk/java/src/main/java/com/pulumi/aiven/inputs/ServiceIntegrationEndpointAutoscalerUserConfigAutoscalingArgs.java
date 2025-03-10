// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aiven.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class ServiceIntegrationEndpointAutoscalerUserConfigAutoscalingArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceIntegrationEndpointAutoscalerUserConfigAutoscalingArgs Empty = new ServiceIntegrationEndpointAutoscalerUserConfigAutoscalingArgs();

    /**
     * The maximum total disk size (in gb) to allow autoscaler to scale up to. Example: `300`.
     * 
     */
    @Import(name="capGb", required=true)
    private Output<Integer> capGb;

    /**
     * @return The maximum total disk size (in gb) to allow autoscaler to scale up to. Example: `300`.
     * 
     */
    public Output<Integer> capGb() {
        return this.capGb;
    }

    /**
     * Enum: `autoscale_disk`. Type of autoscale event.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return Enum: `autoscale_disk`. Type of autoscale event.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    private ServiceIntegrationEndpointAutoscalerUserConfigAutoscalingArgs() {}

    private ServiceIntegrationEndpointAutoscalerUserConfigAutoscalingArgs(ServiceIntegrationEndpointAutoscalerUserConfigAutoscalingArgs $) {
        this.capGb = $.capGb;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceIntegrationEndpointAutoscalerUserConfigAutoscalingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceIntegrationEndpointAutoscalerUserConfigAutoscalingArgs $;

        public Builder() {
            $ = new ServiceIntegrationEndpointAutoscalerUserConfigAutoscalingArgs();
        }

        public Builder(ServiceIntegrationEndpointAutoscalerUserConfigAutoscalingArgs defaults) {
            $ = new ServiceIntegrationEndpointAutoscalerUserConfigAutoscalingArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param capGb The maximum total disk size (in gb) to allow autoscaler to scale up to. Example: `300`.
         * 
         * @return builder
         * 
         */
        public Builder capGb(Output<Integer> capGb) {
            $.capGb = capGb;
            return this;
        }

        /**
         * @param capGb The maximum total disk size (in gb) to allow autoscaler to scale up to. Example: `300`.
         * 
         * @return builder
         * 
         */
        public Builder capGb(Integer capGb) {
            return capGb(Output.of(capGb));
        }

        /**
         * @param type Enum: `autoscale_disk`. Type of autoscale event.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Enum: `autoscale_disk`. Type of autoscale event.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public ServiceIntegrationEndpointAutoscalerUserConfigAutoscalingArgs build() {
            if ($.capGb == null) {
                throw new MissingRequiredPropertyException("ServiceIntegrationEndpointAutoscalerUserConfigAutoscalingArgs", "capGb");
            }
            if ($.type == null) {
                throw new MissingRequiredPropertyException("ServiceIntegrationEndpointAutoscalerUserConfigAutoscalingArgs", "type");
            }
            return $;
        }
    }

}
