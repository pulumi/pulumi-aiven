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


public final class DragonflyDragonflyArgs extends com.pulumi.resources.ResourceArgs {

    public static final DragonflyDragonflyArgs Empty = new DragonflyDragonflyArgs();

    /**
     * Dragonfly password.
     * 
     */
    @Import(name="password")
    private @Nullable Output<String> password;

    /**
     * @return Dragonfly password.
     * 
     */
    public Optional<Output<String>> password() {
        return Optional.ofNullable(this.password);
    }

    /**
     * Dragonfly replica server URI.
     * 
     */
    @Import(name="replicaUri")
    private @Nullable Output<String> replicaUri;

    /**
     * @return Dragonfly replica server URI.
     * 
     */
    public Optional<Output<String>> replicaUri() {
        return Optional.ofNullable(this.replicaUri);
    }

    /**
     * Dragonfly slave server URIs.
     * 
     */
    @Import(name="slaveUris")
    private @Nullable Output<List<String>> slaveUris;

    /**
     * @return Dragonfly slave server URIs.
     * 
     */
    public Optional<Output<List<String>>> slaveUris() {
        return Optional.ofNullable(this.slaveUris);
    }

    /**
     * Dragonfly server URIs.
     * 
     */
    @Import(name="uris")
    private @Nullable Output<List<String>> uris;

    /**
     * @return Dragonfly server URIs.
     * 
     */
    public Optional<Output<List<String>>> uris() {
        return Optional.ofNullable(this.uris);
    }

    private DragonflyDragonflyArgs() {}

    private DragonflyDragonflyArgs(DragonflyDragonflyArgs $) {
        this.password = $.password;
        this.replicaUri = $.replicaUri;
        this.slaveUris = $.slaveUris;
        this.uris = $.uris;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DragonflyDragonflyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DragonflyDragonflyArgs $;

        public Builder() {
            $ = new DragonflyDragonflyArgs();
        }

        public Builder(DragonflyDragonflyArgs defaults) {
            $ = new DragonflyDragonflyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param password Dragonfly password.
         * 
         * @return builder
         * 
         */
        public Builder password(@Nullable Output<String> password) {
            $.password = password;
            return this;
        }

        /**
         * @param password Dragonfly password.
         * 
         * @return builder
         * 
         */
        public Builder password(String password) {
            return password(Output.of(password));
        }

        /**
         * @param replicaUri Dragonfly replica server URI.
         * 
         * @return builder
         * 
         */
        public Builder replicaUri(@Nullable Output<String> replicaUri) {
            $.replicaUri = replicaUri;
            return this;
        }

        /**
         * @param replicaUri Dragonfly replica server URI.
         * 
         * @return builder
         * 
         */
        public Builder replicaUri(String replicaUri) {
            return replicaUri(Output.of(replicaUri));
        }

        /**
         * @param slaveUris Dragonfly slave server URIs.
         * 
         * @return builder
         * 
         */
        public Builder slaveUris(@Nullable Output<List<String>> slaveUris) {
            $.slaveUris = slaveUris;
            return this;
        }

        /**
         * @param slaveUris Dragonfly slave server URIs.
         * 
         * @return builder
         * 
         */
        public Builder slaveUris(List<String> slaveUris) {
            return slaveUris(Output.of(slaveUris));
        }

        /**
         * @param slaveUris Dragonfly slave server URIs.
         * 
         * @return builder
         * 
         */
        public Builder slaveUris(String... slaveUris) {
            return slaveUris(List.of(slaveUris));
        }

        /**
         * @param uris Dragonfly server URIs.
         * 
         * @return builder
         * 
         */
        public Builder uris(@Nullable Output<List<String>> uris) {
            $.uris = uris;
            return this;
        }

        /**
         * @param uris Dragonfly server URIs.
         * 
         * @return builder
         * 
         */
        public Builder uris(List<String> uris) {
            return uris(Output.of(uris));
        }

        /**
         * @param uris Dragonfly server URIs.
         * 
         * @return builder
         * 
         */
        public Builder uris(String... uris) {
            return uris(List.of(uris));
        }

        public DragonflyDragonflyArgs build() {
            return $;
        }
    }

}