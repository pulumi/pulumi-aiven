// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aiven.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RedisRedisUserConfigPrivateAccessArgs extends com.pulumi.resources.ResourceArgs {

    public static final RedisRedisUserConfigPrivateAccessArgs Empty = new RedisRedisUserConfigPrivateAccessArgs();

    @Import(name="prometheus")
    private @Nullable Output<String> prometheus;

    public Optional<Output<String>> prometheus() {
        return Optional.ofNullable(this.prometheus);
    }

    @Import(name="redis")
    private @Nullable Output<String> redis;

    public Optional<Output<String>> redis() {
        return Optional.ofNullable(this.redis);
    }

    private RedisRedisUserConfigPrivateAccessArgs() {}

    private RedisRedisUserConfigPrivateAccessArgs(RedisRedisUserConfigPrivateAccessArgs $) {
        this.prometheus = $.prometheus;
        this.redis = $.redis;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RedisRedisUserConfigPrivateAccessArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RedisRedisUserConfigPrivateAccessArgs $;

        public Builder() {
            $ = new RedisRedisUserConfigPrivateAccessArgs();
        }

        public Builder(RedisRedisUserConfigPrivateAccessArgs defaults) {
            $ = new RedisRedisUserConfigPrivateAccessArgs(Objects.requireNonNull(defaults));
        }

        public Builder prometheus(@Nullable Output<String> prometheus) {
            $.prometheus = prometheus;
            return this;
        }

        public Builder prometheus(String prometheus) {
            return prometheus(Output.of(prometheus));
        }

        public Builder redis(@Nullable Output<String> redis) {
            $.redis = redis;
            return this;
        }

        public Builder redis(String redis) {
            return redis(Output.of(redis));
        }

        public RedisRedisUserConfigPrivateAccessArgs build() {
            return $;
        }
    }

}