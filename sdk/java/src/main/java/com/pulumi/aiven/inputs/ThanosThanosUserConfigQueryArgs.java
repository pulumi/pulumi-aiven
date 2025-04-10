// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aiven.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ThanosThanosUserConfigQueryArgs extends com.pulumi.resources.ResourceArgs {

    public static final ThanosThanosUserConfigQueryArgs Empty = new ThanosThanosUserConfigQueryArgs();

    /**
     * Set the default evaluation interval for subqueries. Default: `1m`.
     * 
     */
    @Import(name="queryDefaultEvaluationInterval")
    private @Nullable Output<String> queryDefaultEvaluationInterval;

    /**
     * @return Set the default evaluation interval for subqueries. Default: `1m`.
     * 
     */
    public Optional<Output<String>> queryDefaultEvaluationInterval() {
        return Optional.ofNullable(this.queryDefaultEvaluationInterval);
    }

    /**
     * The maximum lookback duration for retrieving metrics during expression evaluations in PromQL. PromQL always evaluates the query for a certain timestamp, and it looks back for the given amount of time to get the latest sample. If it exceeds the maximum lookback delta, it assumes the series is stale and returns none (a gap). The lookback delta should be set to at least 2 times the slowest scrape interval. If unset, it will use the promql default of 5m. Default: `5m`.
     * 
     */
    @Import(name="queryLookbackDelta")
    private @Nullable Output<String> queryLookbackDelta;

    /**
     * @return The maximum lookback duration for retrieving metrics during expression evaluations in PromQL. PromQL always evaluates the query for a certain timestamp, and it looks back for the given amount of time to get the latest sample. If it exceeds the maximum lookback delta, it assumes the series is stale and returns none (a gap). The lookback delta should be set to at least 2 times the slowest scrape interval. If unset, it will use the promql default of 5m. Default: `5m`.
     * 
     */
    public Optional<Output<String>> queryLookbackDelta() {
        return Optional.ofNullable(this.queryLookbackDelta);
    }

    /**
     * The default metadata time range duration for retrieving labels through Labels and Series API when the range parameters are not specified. The zero value means the range covers the time since the beginning. Default: `0s`.
     * 
     */
    @Import(name="queryMetadataDefaultTimeRange")
    private @Nullable Output<String> queryMetadataDefaultTimeRange;

    /**
     * @return The default metadata time range duration for retrieving labels through Labels and Series API when the range parameters are not specified. The zero value means the range covers the time since the beginning. Default: `0s`.
     * 
     */
    public Optional<Output<String>> queryMetadataDefaultTimeRange() {
        return Optional.ofNullable(this.queryMetadataDefaultTimeRange);
    }

    /**
     * Maximum time to process a query by the query node. Default: `2m`.
     * 
     */
    @Import(name="queryTimeout")
    private @Nullable Output<String> queryTimeout;

    /**
     * @return Maximum time to process a query by the query node. Default: `2m`.
     * 
     */
    public Optional<Output<String>> queryTimeout() {
        return Optional.ofNullable(this.queryTimeout);
    }

    /**
     * The maximum samples allowed for a single Series request. The Series call fails if this limit is exceeded. Set to 0 for no limit. NOTE: For efficiency, the limit is internally implemented as &#39;chunks limit&#39; considering each chunk contains a maximum of 120 samples. The default value is 100 * store.limits.request-series. Default: `0`.
     * 
     */
    @Import(name="storeLimitsRequestSamples")
    private @Nullable Output<Integer> storeLimitsRequestSamples;

    /**
     * @return The maximum samples allowed for a single Series request. The Series call fails if this limit is exceeded. Set to 0 for no limit. NOTE: For efficiency, the limit is internally implemented as &#39;chunks limit&#39; considering each chunk contains a maximum of 120 samples. The default value is 100 * store.limits.request-series. Default: `0`.
     * 
     */
    public Optional<Output<Integer>> storeLimitsRequestSamples() {
        return Optional.ofNullable(this.storeLimitsRequestSamples);
    }

    /**
     * The maximum series allowed for a single Series request. The Series call fails if this limit is exceeded. Set to 0 for no limit. The default value is 1000 * cpu_count. Default: `0`.
     * 
     */
    @Import(name="storeLimitsRequestSeries")
    private @Nullable Output<Integer> storeLimitsRequestSeries;

    /**
     * @return The maximum series allowed for a single Series request. The Series call fails if this limit is exceeded. Set to 0 for no limit. The default value is 1000 * cpu_count. Default: `0`.
     * 
     */
    public Optional<Output<Integer>> storeLimitsRequestSeries() {
        return Optional.ofNullable(this.storeLimitsRequestSeries);
    }

    private ThanosThanosUserConfigQueryArgs() {}

    private ThanosThanosUserConfigQueryArgs(ThanosThanosUserConfigQueryArgs $) {
        this.queryDefaultEvaluationInterval = $.queryDefaultEvaluationInterval;
        this.queryLookbackDelta = $.queryLookbackDelta;
        this.queryMetadataDefaultTimeRange = $.queryMetadataDefaultTimeRange;
        this.queryTimeout = $.queryTimeout;
        this.storeLimitsRequestSamples = $.storeLimitsRequestSamples;
        this.storeLimitsRequestSeries = $.storeLimitsRequestSeries;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ThanosThanosUserConfigQueryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ThanosThanosUserConfigQueryArgs $;

        public Builder() {
            $ = new ThanosThanosUserConfigQueryArgs();
        }

        public Builder(ThanosThanosUserConfigQueryArgs defaults) {
            $ = new ThanosThanosUserConfigQueryArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param queryDefaultEvaluationInterval Set the default evaluation interval for subqueries. Default: `1m`.
         * 
         * @return builder
         * 
         */
        public Builder queryDefaultEvaluationInterval(@Nullable Output<String> queryDefaultEvaluationInterval) {
            $.queryDefaultEvaluationInterval = queryDefaultEvaluationInterval;
            return this;
        }

        /**
         * @param queryDefaultEvaluationInterval Set the default evaluation interval for subqueries. Default: `1m`.
         * 
         * @return builder
         * 
         */
        public Builder queryDefaultEvaluationInterval(String queryDefaultEvaluationInterval) {
            return queryDefaultEvaluationInterval(Output.of(queryDefaultEvaluationInterval));
        }

        /**
         * @param queryLookbackDelta The maximum lookback duration for retrieving metrics during expression evaluations in PromQL. PromQL always evaluates the query for a certain timestamp, and it looks back for the given amount of time to get the latest sample. If it exceeds the maximum lookback delta, it assumes the series is stale and returns none (a gap). The lookback delta should be set to at least 2 times the slowest scrape interval. If unset, it will use the promql default of 5m. Default: `5m`.
         * 
         * @return builder
         * 
         */
        public Builder queryLookbackDelta(@Nullable Output<String> queryLookbackDelta) {
            $.queryLookbackDelta = queryLookbackDelta;
            return this;
        }

        /**
         * @param queryLookbackDelta The maximum lookback duration for retrieving metrics during expression evaluations in PromQL. PromQL always evaluates the query for a certain timestamp, and it looks back for the given amount of time to get the latest sample. If it exceeds the maximum lookback delta, it assumes the series is stale and returns none (a gap). The lookback delta should be set to at least 2 times the slowest scrape interval. If unset, it will use the promql default of 5m. Default: `5m`.
         * 
         * @return builder
         * 
         */
        public Builder queryLookbackDelta(String queryLookbackDelta) {
            return queryLookbackDelta(Output.of(queryLookbackDelta));
        }

        /**
         * @param queryMetadataDefaultTimeRange The default metadata time range duration for retrieving labels through Labels and Series API when the range parameters are not specified. The zero value means the range covers the time since the beginning. Default: `0s`.
         * 
         * @return builder
         * 
         */
        public Builder queryMetadataDefaultTimeRange(@Nullable Output<String> queryMetadataDefaultTimeRange) {
            $.queryMetadataDefaultTimeRange = queryMetadataDefaultTimeRange;
            return this;
        }

        /**
         * @param queryMetadataDefaultTimeRange The default metadata time range duration for retrieving labels through Labels and Series API when the range parameters are not specified. The zero value means the range covers the time since the beginning. Default: `0s`.
         * 
         * @return builder
         * 
         */
        public Builder queryMetadataDefaultTimeRange(String queryMetadataDefaultTimeRange) {
            return queryMetadataDefaultTimeRange(Output.of(queryMetadataDefaultTimeRange));
        }

        /**
         * @param queryTimeout Maximum time to process a query by the query node. Default: `2m`.
         * 
         * @return builder
         * 
         */
        public Builder queryTimeout(@Nullable Output<String> queryTimeout) {
            $.queryTimeout = queryTimeout;
            return this;
        }

        /**
         * @param queryTimeout Maximum time to process a query by the query node. Default: `2m`.
         * 
         * @return builder
         * 
         */
        public Builder queryTimeout(String queryTimeout) {
            return queryTimeout(Output.of(queryTimeout));
        }

        /**
         * @param storeLimitsRequestSamples The maximum samples allowed for a single Series request. The Series call fails if this limit is exceeded. Set to 0 for no limit. NOTE: For efficiency, the limit is internally implemented as &#39;chunks limit&#39; considering each chunk contains a maximum of 120 samples. The default value is 100 * store.limits.request-series. Default: `0`.
         * 
         * @return builder
         * 
         */
        public Builder storeLimitsRequestSamples(@Nullable Output<Integer> storeLimitsRequestSamples) {
            $.storeLimitsRequestSamples = storeLimitsRequestSamples;
            return this;
        }

        /**
         * @param storeLimitsRequestSamples The maximum samples allowed for a single Series request. The Series call fails if this limit is exceeded. Set to 0 for no limit. NOTE: For efficiency, the limit is internally implemented as &#39;chunks limit&#39; considering each chunk contains a maximum of 120 samples. The default value is 100 * store.limits.request-series. Default: `0`.
         * 
         * @return builder
         * 
         */
        public Builder storeLimitsRequestSamples(Integer storeLimitsRequestSamples) {
            return storeLimitsRequestSamples(Output.of(storeLimitsRequestSamples));
        }

        /**
         * @param storeLimitsRequestSeries The maximum series allowed for a single Series request. The Series call fails if this limit is exceeded. Set to 0 for no limit. The default value is 1000 * cpu_count. Default: `0`.
         * 
         * @return builder
         * 
         */
        public Builder storeLimitsRequestSeries(@Nullable Output<Integer> storeLimitsRequestSeries) {
            $.storeLimitsRequestSeries = storeLimitsRequestSeries;
            return this;
        }

        /**
         * @param storeLimitsRequestSeries The maximum series allowed for a single Series request. The Series call fails if this limit is exceeded. Set to 0 for no limit. The default value is 1000 * cpu_count. Default: `0`.
         * 
         * @return builder
         * 
         */
        public Builder storeLimitsRequestSeries(Integer storeLimitsRequestSeries) {
            return storeLimitsRequestSeries(Output.of(storeLimitsRequestSeries));
        }

        public ThanosThanosUserConfigQueryArgs build() {
            return $;
        }
    }

}
