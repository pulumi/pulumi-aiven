// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aiven.inputs;

import com.pulumi.aiven.inputs.ServiceIntegrationEndpointDatadogUserConfigDatadogTagArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServiceIntegrationEndpointDatadogUserConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceIntegrationEndpointDatadogUserConfigArgs Empty = new ServiceIntegrationEndpointDatadogUserConfigArgs();

    /**
     * Datadog API key
     * 
     */
    @Import(name="datadogApiKey")
    private @Nullable Output<String> datadogApiKey;

    /**
     * @return Datadog API key
     * 
     */
    public Optional<Output<String>> datadogApiKey() {
        return Optional.ofNullable(this.datadogApiKey);
    }

    /**
     * Custom tags provided by user
     * 
     */
    @Import(name="datadogTags")
    private @Nullable Output<List<ServiceIntegrationEndpointDatadogUserConfigDatadogTagArgs>> datadogTags;

    /**
     * @return Custom tags provided by user
     * 
     */
    public Optional<Output<List<ServiceIntegrationEndpointDatadogUserConfigDatadogTagArgs>>> datadogTags() {
        return Optional.ofNullable(this.datadogTags);
    }

    /**
     * Disable consumer group metrics
     * 
     */
    @Import(name="disableConsumerStats")
    private @Nullable Output<String> disableConsumerStats;

    /**
     * @return Disable consumer group metrics
     * 
     */
    public Optional<Output<String>> disableConsumerStats() {
        return Optional.ofNullable(this.disableConsumerStats);
    }

    /**
     * Number of separate instances to fetch kafka consumer statistics with
     * 
     */
    @Import(name="kafkaConsumerCheckInstances")
    private @Nullable Output<String> kafkaConsumerCheckInstances;

    /**
     * @return Number of separate instances to fetch kafka consumer statistics with
     * 
     */
    public Optional<Output<String>> kafkaConsumerCheckInstances() {
        return Optional.ofNullable(this.kafkaConsumerCheckInstances);
    }

    /**
     * Number of seconds that datadog will wait to get consumer statistics from brokers
     * 
     */
    @Import(name="kafkaConsumerStatsTimeout")
    private @Nullable Output<String> kafkaConsumerStatsTimeout;

    /**
     * @return Number of seconds that datadog will wait to get consumer statistics from brokers
     * 
     */
    public Optional<Output<String>> kafkaConsumerStatsTimeout() {
        return Optional.ofNullable(this.kafkaConsumerStatsTimeout);
    }

    /**
     * Maximum number of partition contexts to send
     * 
     */
    @Import(name="maxPartitionContexts")
    private @Nullable Output<String> maxPartitionContexts;

    /**
     * @return Maximum number of partition contexts to send
     * 
     */
    public Optional<Output<String>> maxPartitionContexts() {
        return Optional.ofNullable(this.maxPartitionContexts);
    }

    /**
     * Datadog intake site. Defaults to datadoghq.com
     * 
     */
    @Import(name="site")
    private @Nullable Output<String> site;

    /**
     * @return Datadog intake site. Defaults to datadoghq.com
     * 
     */
    public Optional<Output<String>> site() {
        return Optional.ofNullable(this.site);
    }

    private ServiceIntegrationEndpointDatadogUserConfigArgs() {}

    private ServiceIntegrationEndpointDatadogUserConfigArgs(ServiceIntegrationEndpointDatadogUserConfigArgs $) {
        this.datadogApiKey = $.datadogApiKey;
        this.datadogTags = $.datadogTags;
        this.disableConsumerStats = $.disableConsumerStats;
        this.kafkaConsumerCheckInstances = $.kafkaConsumerCheckInstances;
        this.kafkaConsumerStatsTimeout = $.kafkaConsumerStatsTimeout;
        this.maxPartitionContexts = $.maxPartitionContexts;
        this.site = $.site;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceIntegrationEndpointDatadogUserConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceIntegrationEndpointDatadogUserConfigArgs $;

        public Builder() {
            $ = new ServiceIntegrationEndpointDatadogUserConfigArgs();
        }

        public Builder(ServiceIntegrationEndpointDatadogUserConfigArgs defaults) {
            $ = new ServiceIntegrationEndpointDatadogUserConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param datadogApiKey Datadog API key
         * 
         * @return builder
         * 
         */
        public Builder datadogApiKey(@Nullable Output<String> datadogApiKey) {
            $.datadogApiKey = datadogApiKey;
            return this;
        }

        /**
         * @param datadogApiKey Datadog API key
         * 
         * @return builder
         * 
         */
        public Builder datadogApiKey(String datadogApiKey) {
            return datadogApiKey(Output.of(datadogApiKey));
        }

        /**
         * @param datadogTags Custom tags provided by user
         * 
         * @return builder
         * 
         */
        public Builder datadogTags(@Nullable Output<List<ServiceIntegrationEndpointDatadogUserConfigDatadogTagArgs>> datadogTags) {
            $.datadogTags = datadogTags;
            return this;
        }

        /**
         * @param datadogTags Custom tags provided by user
         * 
         * @return builder
         * 
         */
        public Builder datadogTags(List<ServiceIntegrationEndpointDatadogUserConfigDatadogTagArgs> datadogTags) {
            return datadogTags(Output.of(datadogTags));
        }

        /**
         * @param datadogTags Custom tags provided by user
         * 
         * @return builder
         * 
         */
        public Builder datadogTags(ServiceIntegrationEndpointDatadogUserConfigDatadogTagArgs... datadogTags) {
            return datadogTags(List.of(datadogTags));
        }

        /**
         * @param disableConsumerStats Disable consumer group metrics
         * 
         * @return builder
         * 
         */
        public Builder disableConsumerStats(@Nullable Output<String> disableConsumerStats) {
            $.disableConsumerStats = disableConsumerStats;
            return this;
        }

        /**
         * @param disableConsumerStats Disable consumer group metrics
         * 
         * @return builder
         * 
         */
        public Builder disableConsumerStats(String disableConsumerStats) {
            return disableConsumerStats(Output.of(disableConsumerStats));
        }

        /**
         * @param kafkaConsumerCheckInstances Number of separate instances to fetch kafka consumer statistics with
         * 
         * @return builder
         * 
         */
        public Builder kafkaConsumerCheckInstances(@Nullable Output<String> kafkaConsumerCheckInstances) {
            $.kafkaConsumerCheckInstances = kafkaConsumerCheckInstances;
            return this;
        }

        /**
         * @param kafkaConsumerCheckInstances Number of separate instances to fetch kafka consumer statistics with
         * 
         * @return builder
         * 
         */
        public Builder kafkaConsumerCheckInstances(String kafkaConsumerCheckInstances) {
            return kafkaConsumerCheckInstances(Output.of(kafkaConsumerCheckInstances));
        }

        /**
         * @param kafkaConsumerStatsTimeout Number of seconds that datadog will wait to get consumer statistics from brokers
         * 
         * @return builder
         * 
         */
        public Builder kafkaConsumerStatsTimeout(@Nullable Output<String> kafkaConsumerStatsTimeout) {
            $.kafkaConsumerStatsTimeout = kafkaConsumerStatsTimeout;
            return this;
        }

        /**
         * @param kafkaConsumerStatsTimeout Number of seconds that datadog will wait to get consumer statistics from brokers
         * 
         * @return builder
         * 
         */
        public Builder kafkaConsumerStatsTimeout(String kafkaConsumerStatsTimeout) {
            return kafkaConsumerStatsTimeout(Output.of(kafkaConsumerStatsTimeout));
        }

        /**
         * @param maxPartitionContexts Maximum number of partition contexts to send
         * 
         * @return builder
         * 
         */
        public Builder maxPartitionContexts(@Nullable Output<String> maxPartitionContexts) {
            $.maxPartitionContexts = maxPartitionContexts;
            return this;
        }

        /**
         * @param maxPartitionContexts Maximum number of partition contexts to send
         * 
         * @return builder
         * 
         */
        public Builder maxPartitionContexts(String maxPartitionContexts) {
            return maxPartitionContexts(Output.of(maxPartitionContexts));
        }

        /**
         * @param site Datadog intake site. Defaults to datadoghq.com
         * 
         * @return builder
         * 
         */
        public Builder site(@Nullable Output<String> site) {
            $.site = site;
            return this;
        }

        /**
         * @param site Datadog intake site. Defaults to datadoghq.com
         * 
         * @return builder
         * 
         */
        public Builder site(String site) {
            return site(Output.of(site));
        }

        public ServiceIntegrationEndpointDatadogUserConfigArgs build() {
            return $;
        }
    }

}