// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aiven.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ThanosThanosUserConfigCompactorArgs extends com.pulumi.resources.ResourceArgs {

    public static final ThanosThanosUserConfigCompactorArgs Empty = new ThanosThanosUserConfigCompactorArgs();

    /**
     * Retention time for data in days for each resolution (5m, 1h, raw).
     * 
     */
    @Import(name="retentionDays")
    private @Nullable Output<Integer> retentionDays;

    /**
     * @return Retention time for data in days for each resolution (5m, 1h, raw).
     * 
     */
    public Optional<Output<Integer>> retentionDays() {
        return Optional.ofNullable(this.retentionDays);
    }

    private ThanosThanosUserConfigCompactorArgs() {}

    private ThanosThanosUserConfigCompactorArgs(ThanosThanosUserConfigCompactorArgs $) {
        this.retentionDays = $.retentionDays;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ThanosThanosUserConfigCompactorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ThanosThanosUserConfigCompactorArgs $;

        public Builder() {
            $ = new ThanosThanosUserConfigCompactorArgs();
        }

        public Builder(ThanosThanosUserConfigCompactorArgs defaults) {
            $ = new ThanosThanosUserConfigCompactorArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param retentionDays Retention time for data in days for each resolution (5m, 1h, raw).
         * 
         * @return builder
         * 
         */
        public Builder retentionDays(@Nullable Output<Integer> retentionDays) {
            $.retentionDays = retentionDays;
            return this;
        }

        /**
         * @param retentionDays Retention time for data in days for each resolution (5m, 1h, raw).
         * 
         * @return builder
         * 
         */
        public Builder retentionDays(Integer retentionDays) {
            return retentionDays(Output.of(retentionDays));
        }

        public ThanosThanosUserConfigCompactorArgs build() {
            return $;
        }
    }

}