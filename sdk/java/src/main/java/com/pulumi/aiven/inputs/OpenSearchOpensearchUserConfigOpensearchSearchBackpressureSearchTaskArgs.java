// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aiven.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OpenSearchOpensearchUserConfigOpensearchSearchBackpressureSearchTaskArgs extends com.pulumi.resources.ResourceArgs {

    public static final OpenSearchOpensearchUserConfigOpensearchSearchBackpressureSearchTaskArgs Empty = new OpenSearchOpensearchUserConfigOpensearchSearchBackpressureSearchTaskArgs();

    /**
     * The maximum number of search tasks to cancel in a single iteration of the observer thread. Default is 5.0.
     * 
     */
    @Import(name="cancellationBurst")
    private @Nullable Output<Double> cancellationBurst;

    /**
     * @return The maximum number of search tasks to cancel in a single iteration of the observer thread. Default is 5.0.
     * 
     */
    public Optional<Output<Double>> cancellationBurst() {
        return Optional.ofNullable(this.cancellationBurst);
    }

    /**
     * The maximum number of search tasks to cancel per millisecond of elapsed time. Default is 0.003.
     * 
     */
    @Import(name="cancellationRate")
    private @Nullable Output<Double> cancellationRate;

    /**
     * @return The maximum number of search tasks to cancel per millisecond of elapsed time. Default is 0.003.
     * 
     */
    public Optional<Output<Double>> cancellationRate() {
        return Optional.ofNullable(this.cancellationRate);
    }

    /**
     * The maximum number of search tasks to cancel, as a percentage of successful search task completions. Default is 0.1.
     * 
     */
    @Import(name="cancellationRatio")
    private @Nullable Output<Double> cancellationRatio;

    /**
     * @return The maximum number of search tasks to cancel, as a percentage of successful search task completions. Default is 0.1.
     * 
     */
    public Optional<Output<Double>> cancellationRatio() {
        return Optional.ofNullable(this.cancellationRatio);
    }

    /**
     * The CPU usage threshold (in milliseconds) required for an individual parent task before it is considered for cancellation. Default is 30000.
     * 
     */
    @Import(name="cpuTimeMillisThreshold")
    private @Nullable Output<Integer> cpuTimeMillisThreshold;

    /**
     * @return The CPU usage threshold (in milliseconds) required for an individual parent task before it is considered for cancellation. Default is 30000.
     * 
     */
    public Optional<Output<Integer>> cpuTimeMillisThreshold() {
        return Optional.ofNullable(this.cpuTimeMillisThreshold);
    }

    /**
     * The elapsed time threshold (in milliseconds) required for an individual parent task before it is considered for cancellation. Default is 45000.
     * 
     */
    @Import(name="elapsedTimeMillisThreshold")
    private @Nullable Output<Integer> elapsedTimeMillisThreshold;

    /**
     * @return The elapsed time threshold (in milliseconds) required for an individual parent task before it is considered for cancellation. Default is 45000.
     * 
     */
    public Optional<Output<Integer>> elapsedTimeMillisThreshold() {
        return Optional.ofNullable(this.elapsedTimeMillisThreshold);
    }

    /**
     * The window size used to calculate the rolling average of the heap usage for the completed parent tasks. Default is 10.
     * 
     */
    @Import(name="heapMovingAverageWindowSize")
    private @Nullable Output<Integer> heapMovingAverageWindowSize;

    /**
     * @return The window size used to calculate the rolling average of the heap usage for the completed parent tasks. Default is 10.
     * 
     */
    public Optional<Output<Integer>> heapMovingAverageWindowSize() {
        return Optional.ofNullable(this.heapMovingAverageWindowSize);
    }

    /**
     * The heap usage threshold (as a percentage) required for an individual parent task before it is considered for cancellation. Default is 0.2.
     * 
     */
    @Import(name="heapPercentThreshold")
    private @Nullable Output<Double> heapPercentThreshold;

    /**
     * @return The heap usage threshold (as a percentage) required for an individual parent task before it is considered for cancellation. Default is 0.2.
     * 
     */
    public Optional<Output<Double>> heapPercentThreshold() {
        return Optional.ofNullable(this.heapPercentThreshold);
    }

    /**
     * The heap usage variance required for an individual parent task before it is considered for cancellation. A task is considered for cancellation when taskHeapUsage is greater than or equal to heapUsageMovingAverage * variance. Default is 2.0.
     * 
     */
    @Import(name="heapVariance")
    private @Nullable Output<Double> heapVariance;

    /**
     * @return The heap usage variance required for an individual parent task before it is considered for cancellation. A task is considered for cancellation when taskHeapUsage is greater than or equal to heapUsageMovingAverage * variance. Default is 2.0.
     * 
     */
    public Optional<Output<Double>> heapVariance() {
        return Optional.ofNullable(this.heapVariance);
    }

    /**
     * The heap usage threshold (as a percentage) required for the sum of heap usages of all search tasks before cancellation is applied. Default is 0.5.
     * 
     */
    @Import(name="totalHeapPercentThreshold")
    private @Nullable Output<Double> totalHeapPercentThreshold;

    /**
     * @return The heap usage threshold (as a percentage) required for the sum of heap usages of all search tasks before cancellation is applied. Default is 0.5.
     * 
     */
    public Optional<Output<Double>> totalHeapPercentThreshold() {
        return Optional.ofNullable(this.totalHeapPercentThreshold);
    }

    private OpenSearchOpensearchUserConfigOpensearchSearchBackpressureSearchTaskArgs() {}

    private OpenSearchOpensearchUserConfigOpensearchSearchBackpressureSearchTaskArgs(OpenSearchOpensearchUserConfigOpensearchSearchBackpressureSearchTaskArgs $) {
        this.cancellationBurst = $.cancellationBurst;
        this.cancellationRate = $.cancellationRate;
        this.cancellationRatio = $.cancellationRatio;
        this.cpuTimeMillisThreshold = $.cpuTimeMillisThreshold;
        this.elapsedTimeMillisThreshold = $.elapsedTimeMillisThreshold;
        this.heapMovingAverageWindowSize = $.heapMovingAverageWindowSize;
        this.heapPercentThreshold = $.heapPercentThreshold;
        this.heapVariance = $.heapVariance;
        this.totalHeapPercentThreshold = $.totalHeapPercentThreshold;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OpenSearchOpensearchUserConfigOpensearchSearchBackpressureSearchTaskArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OpenSearchOpensearchUserConfigOpensearchSearchBackpressureSearchTaskArgs $;

        public Builder() {
            $ = new OpenSearchOpensearchUserConfigOpensearchSearchBackpressureSearchTaskArgs();
        }

        public Builder(OpenSearchOpensearchUserConfigOpensearchSearchBackpressureSearchTaskArgs defaults) {
            $ = new OpenSearchOpensearchUserConfigOpensearchSearchBackpressureSearchTaskArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param cancellationBurst The maximum number of search tasks to cancel in a single iteration of the observer thread. Default is 5.0.
         * 
         * @return builder
         * 
         */
        public Builder cancellationBurst(@Nullable Output<Double> cancellationBurst) {
            $.cancellationBurst = cancellationBurst;
            return this;
        }

        /**
         * @param cancellationBurst The maximum number of search tasks to cancel in a single iteration of the observer thread. Default is 5.0.
         * 
         * @return builder
         * 
         */
        public Builder cancellationBurst(Double cancellationBurst) {
            return cancellationBurst(Output.of(cancellationBurst));
        }

        /**
         * @param cancellationRate The maximum number of search tasks to cancel per millisecond of elapsed time. Default is 0.003.
         * 
         * @return builder
         * 
         */
        public Builder cancellationRate(@Nullable Output<Double> cancellationRate) {
            $.cancellationRate = cancellationRate;
            return this;
        }

        /**
         * @param cancellationRate The maximum number of search tasks to cancel per millisecond of elapsed time. Default is 0.003.
         * 
         * @return builder
         * 
         */
        public Builder cancellationRate(Double cancellationRate) {
            return cancellationRate(Output.of(cancellationRate));
        }

        /**
         * @param cancellationRatio The maximum number of search tasks to cancel, as a percentage of successful search task completions. Default is 0.1.
         * 
         * @return builder
         * 
         */
        public Builder cancellationRatio(@Nullable Output<Double> cancellationRatio) {
            $.cancellationRatio = cancellationRatio;
            return this;
        }

        /**
         * @param cancellationRatio The maximum number of search tasks to cancel, as a percentage of successful search task completions. Default is 0.1.
         * 
         * @return builder
         * 
         */
        public Builder cancellationRatio(Double cancellationRatio) {
            return cancellationRatio(Output.of(cancellationRatio));
        }

        /**
         * @param cpuTimeMillisThreshold The CPU usage threshold (in milliseconds) required for an individual parent task before it is considered for cancellation. Default is 30000.
         * 
         * @return builder
         * 
         */
        public Builder cpuTimeMillisThreshold(@Nullable Output<Integer> cpuTimeMillisThreshold) {
            $.cpuTimeMillisThreshold = cpuTimeMillisThreshold;
            return this;
        }

        /**
         * @param cpuTimeMillisThreshold The CPU usage threshold (in milliseconds) required for an individual parent task before it is considered for cancellation. Default is 30000.
         * 
         * @return builder
         * 
         */
        public Builder cpuTimeMillisThreshold(Integer cpuTimeMillisThreshold) {
            return cpuTimeMillisThreshold(Output.of(cpuTimeMillisThreshold));
        }

        /**
         * @param elapsedTimeMillisThreshold The elapsed time threshold (in milliseconds) required for an individual parent task before it is considered for cancellation. Default is 45000.
         * 
         * @return builder
         * 
         */
        public Builder elapsedTimeMillisThreshold(@Nullable Output<Integer> elapsedTimeMillisThreshold) {
            $.elapsedTimeMillisThreshold = elapsedTimeMillisThreshold;
            return this;
        }

        /**
         * @param elapsedTimeMillisThreshold The elapsed time threshold (in milliseconds) required for an individual parent task before it is considered for cancellation. Default is 45000.
         * 
         * @return builder
         * 
         */
        public Builder elapsedTimeMillisThreshold(Integer elapsedTimeMillisThreshold) {
            return elapsedTimeMillisThreshold(Output.of(elapsedTimeMillisThreshold));
        }

        /**
         * @param heapMovingAverageWindowSize The window size used to calculate the rolling average of the heap usage for the completed parent tasks. Default is 10.
         * 
         * @return builder
         * 
         */
        public Builder heapMovingAverageWindowSize(@Nullable Output<Integer> heapMovingAverageWindowSize) {
            $.heapMovingAverageWindowSize = heapMovingAverageWindowSize;
            return this;
        }

        /**
         * @param heapMovingAverageWindowSize The window size used to calculate the rolling average of the heap usage for the completed parent tasks. Default is 10.
         * 
         * @return builder
         * 
         */
        public Builder heapMovingAverageWindowSize(Integer heapMovingAverageWindowSize) {
            return heapMovingAverageWindowSize(Output.of(heapMovingAverageWindowSize));
        }

        /**
         * @param heapPercentThreshold The heap usage threshold (as a percentage) required for an individual parent task before it is considered for cancellation. Default is 0.2.
         * 
         * @return builder
         * 
         */
        public Builder heapPercentThreshold(@Nullable Output<Double> heapPercentThreshold) {
            $.heapPercentThreshold = heapPercentThreshold;
            return this;
        }

        /**
         * @param heapPercentThreshold The heap usage threshold (as a percentage) required for an individual parent task before it is considered for cancellation. Default is 0.2.
         * 
         * @return builder
         * 
         */
        public Builder heapPercentThreshold(Double heapPercentThreshold) {
            return heapPercentThreshold(Output.of(heapPercentThreshold));
        }

        /**
         * @param heapVariance The heap usage variance required for an individual parent task before it is considered for cancellation. A task is considered for cancellation when taskHeapUsage is greater than or equal to heapUsageMovingAverage * variance. Default is 2.0.
         * 
         * @return builder
         * 
         */
        public Builder heapVariance(@Nullable Output<Double> heapVariance) {
            $.heapVariance = heapVariance;
            return this;
        }

        /**
         * @param heapVariance The heap usage variance required for an individual parent task before it is considered for cancellation. A task is considered for cancellation when taskHeapUsage is greater than or equal to heapUsageMovingAverage * variance. Default is 2.0.
         * 
         * @return builder
         * 
         */
        public Builder heapVariance(Double heapVariance) {
            return heapVariance(Output.of(heapVariance));
        }

        /**
         * @param totalHeapPercentThreshold The heap usage threshold (as a percentage) required for the sum of heap usages of all search tasks before cancellation is applied. Default is 0.5.
         * 
         * @return builder
         * 
         */
        public Builder totalHeapPercentThreshold(@Nullable Output<Double> totalHeapPercentThreshold) {
            $.totalHeapPercentThreshold = totalHeapPercentThreshold;
            return this;
        }

        /**
         * @param totalHeapPercentThreshold The heap usage threshold (as a percentage) required for the sum of heap usages of all search tasks before cancellation is applied. Default is 0.5.
         * 
         * @return builder
         * 
         */
        public Builder totalHeapPercentThreshold(Double totalHeapPercentThreshold) {
            return totalHeapPercentThreshold(Output.of(totalHeapPercentThreshold));
        }

        public OpenSearchOpensearchUserConfigOpensearchSearchBackpressureSearchTaskArgs build() {
            return $;
        }
    }

}
