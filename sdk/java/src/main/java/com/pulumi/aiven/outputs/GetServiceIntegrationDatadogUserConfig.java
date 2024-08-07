// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aiven.outputs;

import com.pulumi.aiven.outputs.GetServiceIntegrationDatadogUserConfigDatadogTag;
import com.pulumi.aiven.outputs.GetServiceIntegrationDatadogUserConfigOpensearch;
import com.pulumi.aiven.outputs.GetServiceIntegrationDatadogUserConfigRedis;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetServiceIntegrationDatadogUserConfig {
    /**
     * @return Enable Datadog Database Monitoring.
     * 
     */
    private @Nullable Boolean datadogDbmEnabled;
    /**
     * @return Enable Datadog PgBouncer Metric Tracking.
     * 
     */
    private @Nullable Boolean datadogPgbouncerEnabled;
    /**
     * @return Custom tags provided by user
     * 
     */
    private @Nullable List<GetServiceIntegrationDatadogUserConfigDatadogTag> datadogTags;
    /**
     * @return List of custom metrics.
     * 
     */
    private @Nullable List<String> excludeConsumerGroups;
    /**
     * @return List of topics to exclude.
     * 
     */
    private @Nullable List<String> excludeTopics;
    /**
     * @return List of custom metrics.
     * 
     */
    private @Nullable List<String> includeConsumerGroups;
    /**
     * @return List of topics to include.
     * 
     */
    private @Nullable List<String> includeTopics;
    /**
     * @return List of custom metrics.
     * 
     */
    private @Nullable List<String> kafkaCustomMetrics;
    /**
     * @return Maximum number of JMX metrics to send. Example: `2000`.
     * 
     */
    private @Nullable Integer maxJmxMetrics;
    /**
     * @return List of custom metrics.
     * 
     */
    private @Nullable List<String> mirrormakerCustomMetrics;
    /**
     * @return Datadog Opensearch Options
     * 
     */
    private @Nullable GetServiceIntegrationDatadogUserConfigOpensearch opensearch;
    /**
     * @return Datadog Redis Options
     * 
     */
    private @Nullable GetServiceIntegrationDatadogUserConfigRedis redis;

    private GetServiceIntegrationDatadogUserConfig() {}
    /**
     * @return Enable Datadog Database Monitoring.
     * 
     */
    public Optional<Boolean> datadogDbmEnabled() {
        return Optional.ofNullable(this.datadogDbmEnabled);
    }
    /**
     * @return Enable Datadog PgBouncer Metric Tracking.
     * 
     */
    public Optional<Boolean> datadogPgbouncerEnabled() {
        return Optional.ofNullable(this.datadogPgbouncerEnabled);
    }
    /**
     * @return Custom tags provided by user
     * 
     */
    public List<GetServiceIntegrationDatadogUserConfigDatadogTag> datadogTags() {
        return this.datadogTags == null ? List.of() : this.datadogTags;
    }
    /**
     * @return List of custom metrics.
     * 
     */
    public List<String> excludeConsumerGroups() {
        return this.excludeConsumerGroups == null ? List.of() : this.excludeConsumerGroups;
    }
    /**
     * @return List of topics to exclude.
     * 
     */
    public List<String> excludeTopics() {
        return this.excludeTopics == null ? List.of() : this.excludeTopics;
    }
    /**
     * @return List of custom metrics.
     * 
     */
    public List<String> includeConsumerGroups() {
        return this.includeConsumerGroups == null ? List.of() : this.includeConsumerGroups;
    }
    /**
     * @return List of topics to include.
     * 
     */
    public List<String> includeTopics() {
        return this.includeTopics == null ? List.of() : this.includeTopics;
    }
    /**
     * @return List of custom metrics.
     * 
     */
    public List<String> kafkaCustomMetrics() {
        return this.kafkaCustomMetrics == null ? List.of() : this.kafkaCustomMetrics;
    }
    /**
     * @return Maximum number of JMX metrics to send. Example: `2000`.
     * 
     */
    public Optional<Integer> maxJmxMetrics() {
        return Optional.ofNullable(this.maxJmxMetrics);
    }
    /**
     * @return List of custom metrics.
     * 
     */
    public List<String> mirrormakerCustomMetrics() {
        return this.mirrormakerCustomMetrics == null ? List.of() : this.mirrormakerCustomMetrics;
    }
    /**
     * @return Datadog Opensearch Options
     * 
     */
    public Optional<GetServiceIntegrationDatadogUserConfigOpensearch> opensearch() {
        return Optional.ofNullable(this.opensearch);
    }
    /**
     * @return Datadog Redis Options
     * 
     */
    public Optional<GetServiceIntegrationDatadogUserConfigRedis> redis() {
        return Optional.ofNullable(this.redis);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServiceIntegrationDatadogUserConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean datadogDbmEnabled;
        private @Nullable Boolean datadogPgbouncerEnabled;
        private @Nullable List<GetServiceIntegrationDatadogUserConfigDatadogTag> datadogTags;
        private @Nullable List<String> excludeConsumerGroups;
        private @Nullable List<String> excludeTopics;
        private @Nullable List<String> includeConsumerGroups;
        private @Nullable List<String> includeTopics;
        private @Nullable List<String> kafkaCustomMetrics;
        private @Nullable Integer maxJmxMetrics;
        private @Nullable List<String> mirrormakerCustomMetrics;
        private @Nullable GetServiceIntegrationDatadogUserConfigOpensearch opensearch;
        private @Nullable GetServiceIntegrationDatadogUserConfigRedis redis;
        public Builder() {}
        public Builder(GetServiceIntegrationDatadogUserConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.datadogDbmEnabled = defaults.datadogDbmEnabled;
    	      this.datadogPgbouncerEnabled = defaults.datadogPgbouncerEnabled;
    	      this.datadogTags = defaults.datadogTags;
    	      this.excludeConsumerGroups = defaults.excludeConsumerGroups;
    	      this.excludeTopics = defaults.excludeTopics;
    	      this.includeConsumerGroups = defaults.includeConsumerGroups;
    	      this.includeTopics = defaults.includeTopics;
    	      this.kafkaCustomMetrics = defaults.kafkaCustomMetrics;
    	      this.maxJmxMetrics = defaults.maxJmxMetrics;
    	      this.mirrormakerCustomMetrics = defaults.mirrormakerCustomMetrics;
    	      this.opensearch = defaults.opensearch;
    	      this.redis = defaults.redis;
        }

        @CustomType.Setter
        public Builder datadogDbmEnabled(@Nullable Boolean datadogDbmEnabled) {

            this.datadogDbmEnabled = datadogDbmEnabled;
            return this;
        }
        @CustomType.Setter
        public Builder datadogPgbouncerEnabled(@Nullable Boolean datadogPgbouncerEnabled) {

            this.datadogPgbouncerEnabled = datadogPgbouncerEnabled;
            return this;
        }
        @CustomType.Setter
        public Builder datadogTags(@Nullable List<GetServiceIntegrationDatadogUserConfigDatadogTag> datadogTags) {

            this.datadogTags = datadogTags;
            return this;
        }
        public Builder datadogTags(GetServiceIntegrationDatadogUserConfigDatadogTag... datadogTags) {
            return datadogTags(List.of(datadogTags));
        }
        @CustomType.Setter
        public Builder excludeConsumerGroups(@Nullable List<String> excludeConsumerGroups) {

            this.excludeConsumerGroups = excludeConsumerGroups;
            return this;
        }
        public Builder excludeConsumerGroups(String... excludeConsumerGroups) {
            return excludeConsumerGroups(List.of(excludeConsumerGroups));
        }
        @CustomType.Setter
        public Builder excludeTopics(@Nullable List<String> excludeTopics) {

            this.excludeTopics = excludeTopics;
            return this;
        }
        public Builder excludeTopics(String... excludeTopics) {
            return excludeTopics(List.of(excludeTopics));
        }
        @CustomType.Setter
        public Builder includeConsumerGroups(@Nullable List<String> includeConsumerGroups) {

            this.includeConsumerGroups = includeConsumerGroups;
            return this;
        }
        public Builder includeConsumerGroups(String... includeConsumerGroups) {
            return includeConsumerGroups(List.of(includeConsumerGroups));
        }
        @CustomType.Setter
        public Builder includeTopics(@Nullable List<String> includeTopics) {

            this.includeTopics = includeTopics;
            return this;
        }
        public Builder includeTopics(String... includeTopics) {
            return includeTopics(List.of(includeTopics));
        }
        @CustomType.Setter
        public Builder kafkaCustomMetrics(@Nullable List<String> kafkaCustomMetrics) {

            this.kafkaCustomMetrics = kafkaCustomMetrics;
            return this;
        }
        public Builder kafkaCustomMetrics(String... kafkaCustomMetrics) {
            return kafkaCustomMetrics(List.of(kafkaCustomMetrics));
        }
        @CustomType.Setter
        public Builder maxJmxMetrics(@Nullable Integer maxJmxMetrics) {

            this.maxJmxMetrics = maxJmxMetrics;
            return this;
        }
        @CustomType.Setter
        public Builder mirrormakerCustomMetrics(@Nullable List<String> mirrormakerCustomMetrics) {

            this.mirrormakerCustomMetrics = mirrormakerCustomMetrics;
            return this;
        }
        public Builder mirrormakerCustomMetrics(String... mirrormakerCustomMetrics) {
            return mirrormakerCustomMetrics(List.of(mirrormakerCustomMetrics));
        }
        @CustomType.Setter
        public Builder opensearch(@Nullable GetServiceIntegrationDatadogUserConfigOpensearch opensearch) {

            this.opensearch = opensearch;
            return this;
        }
        @CustomType.Setter
        public Builder redis(@Nullable GetServiceIntegrationDatadogUserConfigRedis redis) {

            this.redis = redis;
            return this;
        }
        public GetServiceIntegrationDatadogUserConfig build() {
            final var _resultValue = new GetServiceIntegrationDatadogUserConfig();
            _resultValue.datadogDbmEnabled = datadogDbmEnabled;
            _resultValue.datadogPgbouncerEnabled = datadogPgbouncerEnabled;
            _resultValue.datadogTags = datadogTags;
            _resultValue.excludeConsumerGroups = excludeConsumerGroups;
            _resultValue.excludeTopics = excludeTopics;
            _resultValue.includeConsumerGroups = includeConsumerGroups;
            _resultValue.includeTopics = includeTopics;
            _resultValue.kafkaCustomMetrics = kafkaCustomMetrics;
            _resultValue.maxJmxMetrics = maxJmxMetrics;
            _resultValue.mirrormakerCustomMetrics = mirrormakerCustomMetrics;
            _resultValue.opensearch = opensearch;
            _resultValue.redis = redis;
            return _resultValue;
        }
    }
}
