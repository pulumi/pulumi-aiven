// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aiven.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class KafkaKafkaUserConfigFollowerFetchingArgs extends com.pulumi.resources.ResourceArgs {

    public static final KafkaKafkaUserConfigFollowerFetchingArgs Empty = new KafkaKafkaUserConfigFollowerFetchingArgs();

    /**
     * Whether to enable the follower fetching functionality.
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return Whether to enable the follower fetching functionality.
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    private KafkaKafkaUserConfigFollowerFetchingArgs() {}

    private KafkaKafkaUserConfigFollowerFetchingArgs(KafkaKafkaUserConfigFollowerFetchingArgs $) {
        this.enabled = $.enabled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(KafkaKafkaUserConfigFollowerFetchingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private KafkaKafkaUserConfigFollowerFetchingArgs $;

        public Builder() {
            $ = new KafkaKafkaUserConfigFollowerFetchingArgs();
        }

        public Builder(KafkaKafkaUserConfigFollowerFetchingArgs defaults) {
            $ = new KafkaKafkaUserConfigFollowerFetchingArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enabled Whether to enable the follower fetching functionality.
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Whether to enable the follower fetching functionality.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        public KafkaKafkaUserConfigFollowerFetchingArgs build() {
            return $;
        }
    }

}