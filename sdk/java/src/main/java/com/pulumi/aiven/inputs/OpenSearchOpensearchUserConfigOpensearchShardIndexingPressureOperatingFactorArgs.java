// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aiven.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OpenSearchOpensearchUserConfigOpensearchShardIndexingPressureOperatingFactorArgs extends com.pulumi.resources.ResourceArgs {

    public static final OpenSearchOpensearchUserConfigOpensearchShardIndexingPressureOperatingFactorArgs Empty = new OpenSearchOpensearchUserConfigOpensearchShardIndexingPressureOperatingFactorArgs();

    /**
     * Specify the lower occupancy limit of the allocated quota of memory for the shard.
     *                 If the total memory usage of a shard is below this limit,
     *                 shard indexing backpressure decreases the current allocated memory for that shard.
     *                 Default is 0.75.
     * 
     */
    @Import(name="lower")
    private @Nullable Output<Double> lower;

    /**
     * @return Specify the lower occupancy limit of the allocated quota of memory for the shard.
     *                 If the total memory usage of a shard is below this limit,
     *                 shard indexing backpressure decreases the current allocated memory for that shard.
     *                 Default is 0.75.
     * 
     */
    public Optional<Output<Double>> lower() {
        return Optional.ofNullable(this.lower);
    }

    /**
     * Specify the optimal occupancy of the allocated quota of memory for the shard.
     *                 If the total memory usage of a shard is at this level,
     *                 shard indexing backpressure doesn’t change the current allocated memory for that shard.
     *                 Default is 0.85.
     * 
     */
    @Import(name="optimal")
    private @Nullable Output<Double> optimal;

    /**
     * @return Specify the optimal occupancy of the allocated quota of memory for the shard.
     *                 If the total memory usage of a shard is at this level,
     *                 shard indexing backpressure doesn’t change the current allocated memory for that shard.
     *                 Default is 0.85.
     * 
     */
    public Optional<Output<Double>> optimal() {
        return Optional.ofNullable(this.optimal);
    }

    /**
     * Specify the upper occupancy limit of the allocated quota of memory for the shard.
     *                 If the total memory usage of a shard is above this limit,
     *                 shard indexing backpressure increases the current allocated memory for that shard.
     *                 Default is 0.95.
     * 
     */
    @Import(name="upper")
    private @Nullable Output<Double> upper;

    /**
     * @return Specify the upper occupancy limit of the allocated quota of memory for the shard.
     *                 If the total memory usage of a shard is above this limit,
     *                 shard indexing backpressure increases the current allocated memory for that shard.
     *                 Default is 0.95.
     * 
     */
    public Optional<Output<Double>> upper() {
        return Optional.ofNullable(this.upper);
    }

    private OpenSearchOpensearchUserConfigOpensearchShardIndexingPressureOperatingFactorArgs() {}

    private OpenSearchOpensearchUserConfigOpensearchShardIndexingPressureOperatingFactorArgs(OpenSearchOpensearchUserConfigOpensearchShardIndexingPressureOperatingFactorArgs $) {
        this.lower = $.lower;
        this.optimal = $.optimal;
        this.upper = $.upper;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OpenSearchOpensearchUserConfigOpensearchShardIndexingPressureOperatingFactorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OpenSearchOpensearchUserConfigOpensearchShardIndexingPressureOperatingFactorArgs $;

        public Builder() {
            $ = new OpenSearchOpensearchUserConfigOpensearchShardIndexingPressureOperatingFactorArgs();
        }

        public Builder(OpenSearchOpensearchUserConfigOpensearchShardIndexingPressureOperatingFactorArgs defaults) {
            $ = new OpenSearchOpensearchUserConfigOpensearchShardIndexingPressureOperatingFactorArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param lower Specify the lower occupancy limit of the allocated quota of memory for the shard.
         *                 If the total memory usage of a shard is below this limit,
         *                 shard indexing backpressure decreases the current allocated memory for that shard.
         *                 Default is 0.75.
         * 
         * @return builder
         * 
         */
        public Builder lower(@Nullable Output<Double> lower) {
            $.lower = lower;
            return this;
        }

        /**
         * @param lower Specify the lower occupancy limit of the allocated quota of memory for the shard.
         *                 If the total memory usage of a shard is below this limit,
         *                 shard indexing backpressure decreases the current allocated memory for that shard.
         *                 Default is 0.75.
         * 
         * @return builder
         * 
         */
        public Builder lower(Double lower) {
            return lower(Output.of(lower));
        }

        /**
         * @param optimal Specify the optimal occupancy of the allocated quota of memory for the shard.
         *                 If the total memory usage of a shard is at this level,
         *                 shard indexing backpressure doesn’t change the current allocated memory for that shard.
         *                 Default is 0.85.
         * 
         * @return builder
         * 
         */
        public Builder optimal(@Nullable Output<Double> optimal) {
            $.optimal = optimal;
            return this;
        }

        /**
         * @param optimal Specify the optimal occupancy of the allocated quota of memory for the shard.
         *                 If the total memory usage of a shard is at this level,
         *                 shard indexing backpressure doesn’t change the current allocated memory for that shard.
         *                 Default is 0.85.
         * 
         * @return builder
         * 
         */
        public Builder optimal(Double optimal) {
            return optimal(Output.of(optimal));
        }

        /**
         * @param upper Specify the upper occupancy limit of the allocated quota of memory for the shard.
         *                 If the total memory usage of a shard is above this limit,
         *                 shard indexing backpressure increases the current allocated memory for that shard.
         *                 Default is 0.95.
         * 
         * @return builder
         * 
         */
        public Builder upper(@Nullable Output<Double> upper) {
            $.upper = upper;
            return this;
        }

        /**
         * @param upper Specify the upper occupancy limit of the allocated quota of memory for the shard.
         *                 If the total memory usage of a shard is above this limit,
         *                 shard indexing backpressure increases the current allocated memory for that shard.
         *                 Default is 0.95.
         * 
         * @return builder
         * 
         */
        public Builder upper(Double upper) {
            return upper(Output.of(upper));
        }

        public OpenSearchOpensearchUserConfigOpensearchShardIndexingPressureOperatingFactorArgs build() {
            return $;
        }
    }

}
