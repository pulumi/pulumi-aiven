// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aiven.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RedisRedisUserConfigPrivateAccessArgs extends com.pulumi.resources.ResourceArgs {

    public static final RedisRedisUserConfigPrivateAccessArgs Empty = new RedisRedisUserConfigPrivateAccessArgs();

    /**
     * Allow clients to connect to prometheus with a DNS name that always resolves to the service&#39;s private IP addresses. Only available in certain network locations.
     * 
     */
    @Import(name="prometheus")
    private @Nullable Output<Boolean> prometheus;

    /**
     * @return Allow clients to connect to prometheus with a DNS name that always resolves to the service&#39;s private IP addresses. Only available in certain network locations.
     * 
     */
    public Optional<Output<Boolean>> prometheus() {
        return Optional.ofNullable(this.prometheus);
    }

    /**
     * Allow clients to connect to redis with a DNS name that always resolves to the service&#39;s private IP addresses. Only available in certain network locations.
     * 
     */
    @Import(name="redis")
    private @Nullable Output<Boolean> redis;

    /**
     * @return Allow clients to connect to redis with a DNS name that always resolves to the service&#39;s private IP addresses. Only available in certain network locations.
     * 
     */
    public Optional<Output<Boolean>> redis() {
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

        /**
         * @param prometheus Allow clients to connect to prometheus with a DNS name that always resolves to the service&#39;s private IP addresses. Only available in certain network locations.
         * 
         * @return builder
         * 
         */
        public Builder prometheus(@Nullable Output<Boolean> prometheus) {
            $.prometheus = prometheus;
            return this;
        }

        /**
         * @param prometheus Allow clients to connect to prometheus with a DNS name that always resolves to the service&#39;s private IP addresses. Only available in certain network locations.
         * 
         * @return builder
         * 
         */
        public Builder prometheus(Boolean prometheus) {
            return prometheus(Output.of(prometheus));
        }

        /**
         * @param redis Allow clients to connect to redis with a DNS name that always resolves to the service&#39;s private IP addresses. Only available in certain network locations.
         * 
         * @return builder
         * 
         */
        public Builder redis(@Nullable Output<Boolean> redis) {
            $.redis = redis;
            return this;
        }

        /**
         * @param redis Allow clients to connect to redis with a DNS name that always resolves to the service&#39;s private IP addresses. Only available in certain network locations.
         * 
         * @return builder
         * 
         */
        public Builder redis(Boolean redis) {
            return redis(Output.of(redis));
        }

        public RedisRedisUserConfigPrivateAccessArgs build() {
            return $;
        }
    }

}