// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aiven.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FlinkFlinkUserConfigPrivatelinkAccessArgs extends com.pulumi.resources.ResourceArgs {

    public static final FlinkFlinkUserConfigPrivatelinkAccessArgs Empty = new FlinkFlinkUserConfigPrivatelinkAccessArgs();

    /**
     * Flink server provided values
     * 
     */
    @Import(name="flink")
    private @Nullable Output<String> flink;

    /**
     * @return Flink server provided values
     * 
     */
    public Optional<Output<String>> flink() {
        return Optional.ofNullable(this.flink);
    }

    @Import(name="prometheus")
    private @Nullable Output<String> prometheus;

    public Optional<Output<String>> prometheus() {
        return Optional.ofNullable(this.prometheus);
    }

    private FlinkFlinkUserConfigPrivatelinkAccessArgs() {}

    private FlinkFlinkUserConfigPrivatelinkAccessArgs(FlinkFlinkUserConfigPrivatelinkAccessArgs $) {
        this.flink = $.flink;
        this.prometheus = $.prometheus;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FlinkFlinkUserConfigPrivatelinkAccessArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FlinkFlinkUserConfigPrivatelinkAccessArgs $;

        public Builder() {
            $ = new FlinkFlinkUserConfigPrivatelinkAccessArgs();
        }

        public Builder(FlinkFlinkUserConfigPrivatelinkAccessArgs defaults) {
            $ = new FlinkFlinkUserConfigPrivatelinkAccessArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param flink Flink server provided values
         * 
         * @return builder
         * 
         */
        public Builder flink(@Nullable Output<String> flink) {
            $.flink = flink;
            return this;
        }

        /**
         * @param flink Flink server provided values
         * 
         * @return builder
         * 
         */
        public Builder flink(String flink) {
            return flink(Output.of(flink));
        }

        public Builder prometheus(@Nullable Output<String> prometheus) {
            $.prometheus = prometheus;
            return this;
        }

        public Builder prometheus(String prometheus) {
            return prometheus(Output.of(prometheus));
        }

        public FlinkFlinkUserConfigPrivatelinkAccessArgs build() {
            return $;
        }
    }

}