// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aiven.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RedisRedisUserConfigIpFilterObjectArgs extends com.pulumi.resources.ResourceArgs {

    public static final RedisRedisUserConfigIpFilterObjectArgs Empty = new RedisRedisUserConfigIpFilterObjectArgs();

    @Import(name="description")
    private @Nullable Output<String> description;

    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    @Import(name="network")
    private @Nullable Output<String> network;

    public Optional<Output<String>> network() {
        return Optional.ofNullable(this.network);
    }

    private RedisRedisUserConfigIpFilterObjectArgs() {}

    private RedisRedisUserConfigIpFilterObjectArgs(RedisRedisUserConfigIpFilterObjectArgs $) {
        this.description = $.description;
        this.network = $.network;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RedisRedisUserConfigIpFilterObjectArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RedisRedisUserConfigIpFilterObjectArgs $;

        public Builder() {
            $ = new RedisRedisUserConfigIpFilterObjectArgs();
        }

        public Builder(RedisRedisUserConfigIpFilterObjectArgs defaults) {
            $ = new RedisRedisUserConfigIpFilterObjectArgs(Objects.requireNonNull(defaults));
        }

        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder network(@Nullable Output<String> network) {
            $.network = network;
            return this;
        }

        public Builder network(String network) {
            return network(Output.of(network));
        }

        public RedisRedisUserConfigIpFilterObjectArgs build() {
            return $;
        }
    }

}