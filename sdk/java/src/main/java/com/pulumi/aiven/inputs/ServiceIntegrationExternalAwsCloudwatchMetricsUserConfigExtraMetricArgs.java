// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aiven.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class ServiceIntegrationExternalAwsCloudwatchMetricsUserConfigExtraMetricArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceIntegrationExternalAwsCloudwatchMetricsUserConfigExtraMetricArgs Empty = new ServiceIntegrationExternalAwsCloudwatchMetricsUserConfigExtraMetricArgs();

    /**
     * Identifier of a value in the metric.
     * 
     */
    @Import(name="field", required=true)
    private Output<String> field;

    /**
     * @return Identifier of a value in the metric.
     * 
     */
    public Output<String> field() {
        return this.field;
    }

    /**
     * Identifier of the metric.
     * 
     */
    @Import(name="metric", required=true)
    private Output<String> metric;

    /**
     * @return Identifier of the metric.
     * 
     */
    public Output<String> metric() {
        return this.metric;
    }

    private ServiceIntegrationExternalAwsCloudwatchMetricsUserConfigExtraMetricArgs() {}

    private ServiceIntegrationExternalAwsCloudwatchMetricsUserConfigExtraMetricArgs(ServiceIntegrationExternalAwsCloudwatchMetricsUserConfigExtraMetricArgs $) {
        this.field = $.field;
        this.metric = $.metric;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceIntegrationExternalAwsCloudwatchMetricsUserConfigExtraMetricArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceIntegrationExternalAwsCloudwatchMetricsUserConfigExtraMetricArgs $;

        public Builder() {
            $ = new ServiceIntegrationExternalAwsCloudwatchMetricsUserConfigExtraMetricArgs();
        }

        public Builder(ServiceIntegrationExternalAwsCloudwatchMetricsUserConfigExtraMetricArgs defaults) {
            $ = new ServiceIntegrationExternalAwsCloudwatchMetricsUserConfigExtraMetricArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param field Identifier of a value in the metric.
         * 
         * @return builder
         * 
         */
        public Builder field(Output<String> field) {
            $.field = field;
            return this;
        }

        /**
         * @param field Identifier of a value in the metric.
         * 
         * @return builder
         * 
         */
        public Builder field(String field) {
            return field(Output.of(field));
        }

        /**
         * @param metric Identifier of the metric.
         * 
         * @return builder
         * 
         */
        public Builder metric(Output<String> metric) {
            $.metric = metric;
            return this;
        }

        /**
         * @param metric Identifier of the metric.
         * 
         * @return builder
         * 
         */
        public Builder metric(String metric) {
            return metric(Output.of(metric));
        }

        public ServiceIntegrationExternalAwsCloudwatchMetricsUserConfigExtraMetricArgs build() {
            if ($.field == null) {
                throw new MissingRequiredPropertyException("ServiceIntegrationExternalAwsCloudwatchMetricsUserConfigExtraMetricArgs", "field");
            }
            if ($.metric == null) {
                throw new MissingRequiredPropertyException("ServiceIntegrationExternalAwsCloudwatchMetricsUserConfigExtraMetricArgs", "metric");
            }
            return $;
        }
    }

}