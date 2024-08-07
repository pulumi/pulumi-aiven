// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aiven.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RedisRedisArgs extends com.pulumi.resources.ResourceArgs {

    public static final RedisRedisArgs Empty = new RedisRedisArgs();

    /**
     * Redis password.
     * 
     */
    @Import(name="password")
    private @Nullable Output<String> password;

    /**
     * @return Redis password.
     * 
     */
    public Optional<Output<String>> password() {
        return Optional.ofNullable(this.password);
    }

    /**
     * Redis replica server URI.
     * 
     */
    @Import(name="replicaUri")
    private @Nullable Output<String> replicaUri;

    /**
     * @return Redis replica server URI.
     * 
     */
    public Optional<Output<String>> replicaUri() {
        return Optional.ofNullable(this.replicaUri);
    }

    /**
     * Redis slave server URIs.
     * 
     */
    @Import(name="slaveUris")
    private @Nullable Output<List<String>> slaveUris;

    /**
     * @return Redis slave server URIs.
     * 
     */
    public Optional<Output<List<String>>> slaveUris() {
        return Optional.ofNullable(this.slaveUris);
    }

    /**
     * Redis server URIs.
     * 
     */
    @Import(name="uris")
    private @Nullable Output<List<String>> uris;

    /**
     * @return Redis server URIs.
     * 
     */
    public Optional<Output<List<String>>> uris() {
        return Optional.ofNullable(this.uris);
    }

    private RedisRedisArgs() {}

    private RedisRedisArgs(RedisRedisArgs $) {
        this.password = $.password;
        this.replicaUri = $.replicaUri;
        this.slaveUris = $.slaveUris;
        this.uris = $.uris;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RedisRedisArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RedisRedisArgs $;

        public Builder() {
            $ = new RedisRedisArgs();
        }

        public Builder(RedisRedisArgs defaults) {
            $ = new RedisRedisArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param password Redis password.
         * 
         * @return builder
         * 
         */
        public Builder password(@Nullable Output<String> password) {
            $.password = password;
            return this;
        }

        /**
         * @param password Redis password.
         * 
         * @return builder
         * 
         */
        public Builder password(String password) {
            return password(Output.of(password));
        }

        /**
         * @param replicaUri Redis replica server URI.
         * 
         * @return builder
         * 
         */
        public Builder replicaUri(@Nullable Output<String> replicaUri) {
            $.replicaUri = replicaUri;
            return this;
        }

        /**
         * @param replicaUri Redis replica server URI.
         * 
         * @return builder
         * 
         */
        public Builder replicaUri(String replicaUri) {
            return replicaUri(Output.of(replicaUri));
        }

        /**
         * @param slaveUris Redis slave server URIs.
         * 
         * @return builder
         * 
         */
        public Builder slaveUris(@Nullable Output<List<String>> slaveUris) {
            $.slaveUris = slaveUris;
            return this;
        }

        /**
         * @param slaveUris Redis slave server URIs.
         * 
         * @return builder
         * 
         */
        public Builder slaveUris(List<String> slaveUris) {
            return slaveUris(Output.of(slaveUris));
        }

        /**
         * @param slaveUris Redis slave server URIs.
         * 
         * @return builder
         * 
         */
        public Builder slaveUris(String... slaveUris) {
            return slaveUris(List.of(slaveUris));
        }

        /**
         * @param uris Redis server URIs.
         * 
         * @return builder
         * 
         */
        public Builder uris(@Nullable Output<List<String>> uris) {
            $.uris = uris;
            return this;
        }

        /**
         * @param uris Redis server URIs.
         * 
         * @return builder
         * 
         */
        public Builder uris(List<String> uris) {
            return uris(Output.of(uris));
        }

        /**
         * @param uris Redis server URIs.
         * 
         * @return builder
         * 
         */
        public Builder uris(String... uris) {
            return uris(List.of(uris));
        }

        public RedisRedisArgs build() {
            return $;
        }
    }

}
