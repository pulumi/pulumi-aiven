// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aiven.inputs;

import com.pulumi.aiven.inputs.ServiceIntegrationExternalAwsCloudwatchMetricsUserConfigDroppedMetricArgs;
import com.pulumi.aiven.inputs.ServiceIntegrationExternalAwsCloudwatchMetricsUserConfigExtraMetricArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServiceIntegrationExternalAwsCloudwatchMetricsUserConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceIntegrationExternalAwsCloudwatchMetricsUserConfigArgs Empty = new ServiceIntegrationExternalAwsCloudwatchMetricsUserConfigArgs();

    /**
     * Metrics to not send to AWS CloudWatch (takes precedence over extra*metrics)
     * 
     */
    @Import(name="droppedMetrics")
    private @Nullable Output<List<ServiceIntegrationExternalAwsCloudwatchMetricsUserConfigDroppedMetricArgs>> droppedMetrics;

    /**
     * @return Metrics to not send to AWS CloudWatch (takes precedence over extra*metrics)
     * 
     */
    public Optional<Output<List<ServiceIntegrationExternalAwsCloudwatchMetricsUserConfigDroppedMetricArgs>>> droppedMetrics() {
        return Optional.ofNullable(this.droppedMetrics);
    }

    /**
     * Metrics to allow through to AWS CloudWatch (in addition to default metrics)
     * 
     */
    @Import(name="extraMetrics")
    private @Nullable Output<List<ServiceIntegrationExternalAwsCloudwatchMetricsUserConfigExtraMetricArgs>> extraMetrics;

    /**
     * @return Metrics to allow through to AWS CloudWatch (in addition to default metrics)
     * 
     */
    public Optional<Output<List<ServiceIntegrationExternalAwsCloudwatchMetricsUserConfigExtraMetricArgs>>> extraMetrics() {
        return Optional.ofNullable(this.extraMetrics);
    }

    private ServiceIntegrationExternalAwsCloudwatchMetricsUserConfigArgs() {}

    private ServiceIntegrationExternalAwsCloudwatchMetricsUserConfigArgs(ServiceIntegrationExternalAwsCloudwatchMetricsUserConfigArgs $) {
        this.droppedMetrics = $.droppedMetrics;
        this.extraMetrics = $.extraMetrics;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceIntegrationExternalAwsCloudwatchMetricsUserConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceIntegrationExternalAwsCloudwatchMetricsUserConfigArgs $;

        public Builder() {
            $ = new ServiceIntegrationExternalAwsCloudwatchMetricsUserConfigArgs();
        }

        public Builder(ServiceIntegrationExternalAwsCloudwatchMetricsUserConfigArgs defaults) {
            $ = new ServiceIntegrationExternalAwsCloudwatchMetricsUserConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param droppedMetrics Metrics to not send to AWS CloudWatch (takes precedence over extra*metrics)
         * 
         * @return builder
         * 
         */
        public Builder droppedMetrics(@Nullable Output<List<ServiceIntegrationExternalAwsCloudwatchMetricsUserConfigDroppedMetricArgs>> droppedMetrics) {
            $.droppedMetrics = droppedMetrics;
            return this;
        }

        /**
         * @param droppedMetrics Metrics to not send to AWS CloudWatch (takes precedence over extra*metrics)
         * 
         * @return builder
         * 
         */
        public Builder droppedMetrics(List<ServiceIntegrationExternalAwsCloudwatchMetricsUserConfigDroppedMetricArgs> droppedMetrics) {
            return droppedMetrics(Output.of(droppedMetrics));
        }

        /**
         * @param droppedMetrics Metrics to not send to AWS CloudWatch (takes precedence over extra*metrics)
         * 
         * @return builder
         * 
         */
        public Builder droppedMetrics(ServiceIntegrationExternalAwsCloudwatchMetricsUserConfigDroppedMetricArgs... droppedMetrics) {
            return droppedMetrics(List.of(droppedMetrics));
        }

        /**
         * @param extraMetrics Metrics to allow through to AWS CloudWatch (in addition to default metrics)
         * 
         * @return builder
         * 
         */
        public Builder extraMetrics(@Nullable Output<List<ServiceIntegrationExternalAwsCloudwatchMetricsUserConfigExtraMetricArgs>> extraMetrics) {
            $.extraMetrics = extraMetrics;
            return this;
        }

        /**
         * @param extraMetrics Metrics to allow through to AWS CloudWatch (in addition to default metrics)
         * 
         * @return builder
         * 
         */
        public Builder extraMetrics(List<ServiceIntegrationExternalAwsCloudwatchMetricsUserConfigExtraMetricArgs> extraMetrics) {
            return extraMetrics(Output.of(extraMetrics));
        }

        /**
         * @param extraMetrics Metrics to allow through to AWS CloudWatch (in addition to default metrics)
         * 
         * @return builder
         * 
         */
        public Builder extraMetrics(ServiceIntegrationExternalAwsCloudwatchMetricsUserConfigExtraMetricArgs... extraMetrics) {
            return extraMetrics(List.of(extraMetrics));
        }

        public ServiceIntegrationExternalAwsCloudwatchMetricsUserConfigArgs build() {
            return $;
        }
    }

}