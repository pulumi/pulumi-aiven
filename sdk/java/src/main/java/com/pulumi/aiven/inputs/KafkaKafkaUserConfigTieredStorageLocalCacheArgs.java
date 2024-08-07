// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aiven.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class KafkaKafkaUserConfigTieredStorageLocalCacheArgs extends com.pulumi.resources.ResourceArgs {

    public static final KafkaKafkaUserConfigTieredStorageLocalCacheArgs Empty = new KafkaKafkaUserConfigTieredStorageLocalCacheArgs();

    /**
     * Local cache size in bytes. Example: `1073741824`.
     * 
     * @deprecated
     * This property is deprecated.
     * 
     */
    @Deprecated /* This property is deprecated. */
    @Import(name="size")
    private @Nullable Output<Integer> size;

    /**
     * @return Local cache size in bytes. Example: `1073741824`.
     * 
     * @deprecated
     * This property is deprecated.
     * 
     */
    @Deprecated /* This property is deprecated. */
    public Optional<Output<Integer>> size() {
        return Optional.ofNullable(this.size);
    }

    private KafkaKafkaUserConfigTieredStorageLocalCacheArgs() {}

    private KafkaKafkaUserConfigTieredStorageLocalCacheArgs(KafkaKafkaUserConfigTieredStorageLocalCacheArgs $) {
        this.size = $.size;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(KafkaKafkaUserConfigTieredStorageLocalCacheArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private KafkaKafkaUserConfigTieredStorageLocalCacheArgs $;

        public Builder() {
            $ = new KafkaKafkaUserConfigTieredStorageLocalCacheArgs();
        }

        public Builder(KafkaKafkaUserConfigTieredStorageLocalCacheArgs defaults) {
            $ = new KafkaKafkaUserConfigTieredStorageLocalCacheArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param size Local cache size in bytes. Example: `1073741824`.
         * 
         * @return builder
         * 
         * @deprecated
         * This property is deprecated.
         * 
         */
        @Deprecated /* This property is deprecated. */
        public Builder size(@Nullable Output<Integer> size) {
            $.size = size;
            return this;
        }

        /**
         * @param size Local cache size in bytes. Example: `1073741824`.
         * 
         * @return builder
         * 
         * @deprecated
         * This property is deprecated.
         * 
         */
        @Deprecated /* This property is deprecated. */
        public Builder size(Integer size) {
            return size(Output.of(size));
        }

        public KafkaKafkaUserConfigTieredStorageLocalCacheArgs build() {
            return $;
        }
    }

}
