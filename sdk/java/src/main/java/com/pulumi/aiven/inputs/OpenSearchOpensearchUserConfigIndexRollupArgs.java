// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aiven.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OpenSearchOpensearchUserConfigIndexRollupArgs extends com.pulumi.resources.ResourceArgs {

    public static final OpenSearchOpensearchUserConfigIndexRollupArgs Empty = new OpenSearchOpensearchUserConfigIndexRollupArgs();

    /**
     * Whether rollups are enabled in OpenSearch Dashboards. Defaults to true.
     * 
     */
    @Import(name="rollupDashboardsEnabled")
    private @Nullable Output<Boolean> rollupDashboardsEnabled;

    /**
     * @return Whether rollups are enabled in OpenSearch Dashboards. Defaults to true.
     * 
     */
    public Optional<Output<Boolean>> rollupDashboardsEnabled() {
        return Optional.ofNullable(this.rollupDashboardsEnabled);
    }

    /**
     * Whether the rollup plugin is enabled. Defaults to true.
     * 
     */
    @Import(name="rollupEnabled")
    private @Nullable Output<Boolean> rollupEnabled;

    /**
     * @return Whether the rollup plugin is enabled. Defaults to true.
     * 
     */
    public Optional<Output<Boolean>> rollupEnabled() {
        return Optional.ofNullable(this.rollupEnabled);
    }

    /**
     * How many retries the plugin should attempt for failed rollup jobs. Defaults to 5.
     * 
     */
    @Import(name="rollupSearchBackoffCount")
    private @Nullable Output<Integer> rollupSearchBackoffCount;

    /**
     * @return How many retries the plugin should attempt for failed rollup jobs. Defaults to 5.
     * 
     */
    public Optional<Output<Integer>> rollupSearchBackoffCount() {
        return Optional.ofNullable(this.rollupSearchBackoffCount);
    }

    /**
     * The backoff time between retries for failed rollup jobs. Defaults to 1000ms.
     * 
     */
    @Import(name="rollupSearchBackoffMillis")
    private @Nullable Output<Integer> rollupSearchBackoffMillis;

    /**
     * @return The backoff time between retries for failed rollup jobs. Defaults to 1000ms.
     * 
     */
    public Optional<Output<Integer>> rollupSearchBackoffMillis() {
        return Optional.ofNullable(this.rollupSearchBackoffMillis);
    }

    /**
     * Whether OpenSearch should return all jobs that match all specified search terms. If disabled, OpenSearch returns just one, as opposed to all, of the jobs that matches the search terms. Defaults to false.
     * 
     */
    @Import(name="rollupSearchSearchAllJobs")
    private @Nullable Output<Boolean> rollupSearchSearchAllJobs;

    /**
     * @return Whether OpenSearch should return all jobs that match all specified search terms. If disabled, OpenSearch returns just one, as opposed to all, of the jobs that matches the search terms. Defaults to false.
     * 
     */
    public Optional<Output<Boolean>> rollupSearchSearchAllJobs() {
        return Optional.ofNullable(this.rollupSearchSearchAllJobs);
    }

    private OpenSearchOpensearchUserConfigIndexRollupArgs() {}

    private OpenSearchOpensearchUserConfigIndexRollupArgs(OpenSearchOpensearchUserConfigIndexRollupArgs $) {
        this.rollupDashboardsEnabled = $.rollupDashboardsEnabled;
        this.rollupEnabled = $.rollupEnabled;
        this.rollupSearchBackoffCount = $.rollupSearchBackoffCount;
        this.rollupSearchBackoffMillis = $.rollupSearchBackoffMillis;
        this.rollupSearchSearchAllJobs = $.rollupSearchSearchAllJobs;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OpenSearchOpensearchUserConfigIndexRollupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OpenSearchOpensearchUserConfigIndexRollupArgs $;

        public Builder() {
            $ = new OpenSearchOpensearchUserConfigIndexRollupArgs();
        }

        public Builder(OpenSearchOpensearchUserConfigIndexRollupArgs defaults) {
            $ = new OpenSearchOpensearchUserConfigIndexRollupArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param rollupDashboardsEnabled Whether rollups are enabled in OpenSearch Dashboards. Defaults to true.
         * 
         * @return builder
         * 
         */
        public Builder rollupDashboardsEnabled(@Nullable Output<Boolean> rollupDashboardsEnabled) {
            $.rollupDashboardsEnabled = rollupDashboardsEnabled;
            return this;
        }

        /**
         * @param rollupDashboardsEnabled Whether rollups are enabled in OpenSearch Dashboards. Defaults to true.
         * 
         * @return builder
         * 
         */
        public Builder rollupDashboardsEnabled(Boolean rollupDashboardsEnabled) {
            return rollupDashboardsEnabled(Output.of(rollupDashboardsEnabled));
        }

        /**
         * @param rollupEnabled Whether the rollup plugin is enabled. Defaults to true.
         * 
         * @return builder
         * 
         */
        public Builder rollupEnabled(@Nullable Output<Boolean> rollupEnabled) {
            $.rollupEnabled = rollupEnabled;
            return this;
        }

        /**
         * @param rollupEnabled Whether the rollup plugin is enabled. Defaults to true.
         * 
         * @return builder
         * 
         */
        public Builder rollupEnabled(Boolean rollupEnabled) {
            return rollupEnabled(Output.of(rollupEnabled));
        }

        /**
         * @param rollupSearchBackoffCount How many retries the plugin should attempt for failed rollup jobs. Defaults to 5.
         * 
         * @return builder
         * 
         */
        public Builder rollupSearchBackoffCount(@Nullable Output<Integer> rollupSearchBackoffCount) {
            $.rollupSearchBackoffCount = rollupSearchBackoffCount;
            return this;
        }

        /**
         * @param rollupSearchBackoffCount How many retries the plugin should attempt for failed rollup jobs. Defaults to 5.
         * 
         * @return builder
         * 
         */
        public Builder rollupSearchBackoffCount(Integer rollupSearchBackoffCount) {
            return rollupSearchBackoffCount(Output.of(rollupSearchBackoffCount));
        }

        /**
         * @param rollupSearchBackoffMillis The backoff time between retries for failed rollup jobs. Defaults to 1000ms.
         * 
         * @return builder
         * 
         */
        public Builder rollupSearchBackoffMillis(@Nullable Output<Integer> rollupSearchBackoffMillis) {
            $.rollupSearchBackoffMillis = rollupSearchBackoffMillis;
            return this;
        }

        /**
         * @param rollupSearchBackoffMillis The backoff time between retries for failed rollup jobs. Defaults to 1000ms.
         * 
         * @return builder
         * 
         */
        public Builder rollupSearchBackoffMillis(Integer rollupSearchBackoffMillis) {
            return rollupSearchBackoffMillis(Output.of(rollupSearchBackoffMillis));
        }

        /**
         * @param rollupSearchSearchAllJobs Whether OpenSearch should return all jobs that match all specified search terms. If disabled, OpenSearch returns just one, as opposed to all, of the jobs that matches the search terms. Defaults to false.
         * 
         * @return builder
         * 
         */
        public Builder rollupSearchSearchAllJobs(@Nullable Output<Boolean> rollupSearchSearchAllJobs) {
            $.rollupSearchSearchAllJobs = rollupSearchSearchAllJobs;
            return this;
        }

        /**
         * @param rollupSearchSearchAllJobs Whether OpenSearch should return all jobs that match all specified search terms. If disabled, OpenSearch returns just one, as opposed to all, of the jobs that matches the search terms. Defaults to false.
         * 
         * @return builder
         * 
         */
        public Builder rollupSearchSearchAllJobs(Boolean rollupSearchSearchAllJobs) {
            return rollupSearchSearchAllJobs(Output.of(rollupSearchSearchAllJobs));
        }

        public OpenSearchOpensearchUserConfigIndexRollupArgs build() {
            return $;
        }
    }

}
