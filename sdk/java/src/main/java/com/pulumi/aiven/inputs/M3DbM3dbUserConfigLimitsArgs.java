// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aiven.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class M3DbM3dbUserConfigLimitsArgs extends com.pulumi.resources.ResourceArgs {

    public static final M3DbM3dbUserConfigLimitsArgs Empty = new M3DbM3dbUserConfigLimitsArgs();

    /**
     * The maximum number of blocks that can be read in a given lookback period.
     * 
     */
    @Import(name="maxRecentlyQueriedSeriesBlocks")
    private @Nullable Output<Integer> maxRecentlyQueriedSeriesBlocks;

    /**
     * @return The maximum number of blocks that can be read in a given lookback period.
     * 
     */
    public Optional<Output<Integer>> maxRecentlyQueriedSeriesBlocks() {
        return Optional.ofNullable(this.maxRecentlyQueriedSeriesBlocks);
    }

    /**
     * The maximum number of disk bytes that can be read in a given lookback period.
     * 
     */
    @Import(name="maxRecentlyQueriedSeriesDiskBytesRead")
    private @Nullable Output<Integer> maxRecentlyQueriedSeriesDiskBytesRead;

    /**
     * @return The maximum number of disk bytes that can be read in a given lookback period.
     * 
     */
    public Optional<Output<Integer>> maxRecentlyQueriedSeriesDiskBytesRead() {
        return Optional.ofNullable(this.maxRecentlyQueriedSeriesDiskBytesRead);
    }

    /**
     * The lookback period for &#39;max*recently*queried*series*blocks&#39; and &#39;max*recently*queried*series*disk*bytes*read&#39;.
     * 
     */
    @Import(name="maxRecentlyQueriedSeriesLookback")
    private @Nullable Output<String> maxRecentlyQueriedSeriesLookback;

    /**
     * @return The lookback period for &#39;max*recently*queried*series*blocks&#39; and &#39;max*recently*queried*series*disk*bytes*read&#39;.
     * 
     */
    public Optional<Output<String>> maxRecentlyQueriedSeriesLookback() {
        return Optional.ofNullable(this.maxRecentlyQueriedSeriesLookback);
    }

    /**
     * The maximum number of docs fetched in single query.
     * 
     */
    @Import(name="queryDocs")
    private @Nullable Output<Integer> queryDocs;

    /**
     * @return The maximum number of docs fetched in single query.
     * 
     */
    public Optional<Output<Integer>> queryDocs() {
        return Optional.ofNullable(this.queryDocs);
    }

    /**
     * When query limits are exceeded, whether to return error or return partial results.
     * 
     */
    @Import(name="queryRequireExhaustive")
    private @Nullable Output<Boolean> queryRequireExhaustive;

    /**
     * @return When query limits are exceeded, whether to return error or return partial results.
     * 
     */
    public Optional<Output<Boolean>> queryRequireExhaustive() {
        return Optional.ofNullable(this.queryRequireExhaustive);
    }

    /**
     * The maximum number of series fetched in single query.
     * 
     */
    @Import(name="querySeries")
    private @Nullable Output<Integer> querySeries;

    /**
     * @return The maximum number of series fetched in single query.
     * 
     */
    public Optional<Output<Integer>> querySeries() {
        return Optional.ofNullable(this.querySeries);
    }

    private M3DbM3dbUserConfigLimitsArgs() {}

    private M3DbM3dbUserConfigLimitsArgs(M3DbM3dbUserConfigLimitsArgs $) {
        this.maxRecentlyQueriedSeriesBlocks = $.maxRecentlyQueriedSeriesBlocks;
        this.maxRecentlyQueriedSeriesDiskBytesRead = $.maxRecentlyQueriedSeriesDiskBytesRead;
        this.maxRecentlyQueriedSeriesLookback = $.maxRecentlyQueriedSeriesLookback;
        this.queryDocs = $.queryDocs;
        this.queryRequireExhaustive = $.queryRequireExhaustive;
        this.querySeries = $.querySeries;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(M3DbM3dbUserConfigLimitsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private M3DbM3dbUserConfigLimitsArgs $;

        public Builder() {
            $ = new M3DbM3dbUserConfigLimitsArgs();
        }

        public Builder(M3DbM3dbUserConfigLimitsArgs defaults) {
            $ = new M3DbM3dbUserConfigLimitsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param maxRecentlyQueriedSeriesBlocks The maximum number of blocks that can be read in a given lookback period.
         * 
         * @return builder
         * 
         */
        public Builder maxRecentlyQueriedSeriesBlocks(@Nullable Output<Integer> maxRecentlyQueriedSeriesBlocks) {
            $.maxRecentlyQueriedSeriesBlocks = maxRecentlyQueriedSeriesBlocks;
            return this;
        }

        /**
         * @param maxRecentlyQueriedSeriesBlocks The maximum number of blocks that can be read in a given lookback period.
         * 
         * @return builder
         * 
         */
        public Builder maxRecentlyQueriedSeriesBlocks(Integer maxRecentlyQueriedSeriesBlocks) {
            return maxRecentlyQueriedSeriesBlocks(Output.of(maxRecentlyQueriedSeriesBlocks));
        }

        /**
         * @param maxRecentlyQueriedSeriesDiskBytesRead The maximum number of disk bytes that can be read in a given lookback period.
         * 
         * @return builder
         * 
         */
        public Builder maxRecentlyQueriedSeriesDiskBytesRead(@Nullable Output<Integer> maxRecentlyQueriedSeriesDiskBytesRead) {
            $.maxRecentlyQueriedSeriesDiskBytesRead = maxRecentlyQueriedSeriesDiskBytesRead;
            return this;
        }

        /**
         * @param maxRecentlyQueriedSeriesDiskBytesRead The maximum number of disk bytes that can be read in a given lookback period.
         * 
         * @return builder
         * 
         */
        public Builder maxRecentlyQueriedSeriesDiskBytesRead(Integer maxRecentlyQueriedSeriesDiskBytesRead) {
            return maxRecentlyQueriedSeriesDiskBytesRead(Output.of(maxRecentlyQueriedSeriesDiskBytesRead));
        }

        /**
         * @param maxRecentlyQueriedSeriesLookback The lookback period for &#39;max*recently*queried*series*blocks&#39; and &#39;max*recently*queried*series*disk*bytes*read&#39;.
         * 
         * @return builder
         * 
         */
        public Builder maxRecentlyQueriedSeriesLookback(@Nullable Output<String> maxRecentlyQueriedSeriesLookback) {
            $.maxRecentlyQueriedSeriesLookback = maxRecentlyQueriedSeriesLookback;
            return this;
        }

        /**
         * @param maxRecentlyQueriedSeriesLookback The lookback period for &#39;max*recently*queried*series*blocks&#39; and &#39;max*recently*queried*series*disk*bytes*read&#39;.
         * 
         * @return builder
         * 
         */
        public Builder maxRecentlyQueriedSeriesLookback(String maxRecentlyQueriedSeriesLookback) {
            return maxRecentlyQueriedSeriesLookback(Output.of(maxRecentlyQueriedSeriesLookback));
        }

        /**
         * @param queryDocs The maximum number of docs fetched in single query.
         * 
         * @return builder
         * 
         */
        public Builder queryDocs(@Nullable Output<Integer> queryDocs) {
            $.queryDocs = queryDocs;
            return this;
        }

        /**
         * @param queryDocs The maximum number of docs fetched in single query.
         * 
         * @return builder
         * 
         */
        public Builder queryDocs(Integer queryDocs) {
            return queryDocs(Output.of(queryDocs));
        }

        /**
         * @param queryRequireExhaustive When query limits are exceeded, whether to return error or return partial results.
         * 
         * @return builder
         * 
         */
        public Builder queryRequireExhaustive(@Nullable Output<Boolean> queryRequireExhaustive) {
            $.queryRequireExhaustive = queryRequireExhaustive;
            return this;
        }

        /**
         * @param queryRequireExhaustive When query limits are exceeded, whether to return error or return partial results.
         * 
         * @return builder
         * 
         */
        public Builder queryRequireExhaustive(Boolean queryRequireExhaustive) {
            return queryRequireExhaustive(Output.of(queryRequireExhaustive));
        }

        /**
         * @param querySeries The maximum number of series fetched in single query.
         * 
         * @return builder
         * 
         */
        public Builder querySeries(@Nullable Output<Integer> querySeries) {
            $.querySeries = querySeries;
            return this;
        }

        /**
         * @param querySeries The maximum number of series fetched in single query.
         * 
         * @return builder
         * 
         */
        public Builder querySeries(Integer querySeries) {
            return querySeries(Output.of(querySeries));
        }

        public M3DbM3dbUserConfigLimitsArgs build() {
            return $;
        }
    }

}