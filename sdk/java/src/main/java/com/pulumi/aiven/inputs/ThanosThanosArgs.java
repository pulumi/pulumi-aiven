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


public final class ThanosThanosArgs extends com.pulumi.resources.ResourceArgs {

    public static final ThanosThanosArgs Empty = new ThanosThanosArgs();

    /**
     * Query frontend URI.
     * 
     */
    @Import(name="queryFrontendUri")
    private @Nullable Output<String> queryFrontendUri;

    /**
     * @return Query frontend URI.
     * 
     */
    public Optional<Output<String>> queryFrontendUri() {
        return Optional.ofNullable(this.queryFrontendUri);
    }

    /**
     * Query URI.
     * 
     */
    @Import(name="queryUri")
    private @Nullable Output<String> queryUri;

    /**
     * @return Query URI.
     * 
     */
    public Optional<Output<String>> queryUri() {
        return Optional.ofNullable(this.queryUri);
    }

    /**
     * Receiver ingesting remote write URI.
     * 
     */
    @Import(name="receiverIngestingRemoteWriteUri")
    private @Nullable Output<String> receiverIngestingRemoteWriteUri;

    /**
     * @return Receiver ingesting remote write URI.
     * 
     */
    public Optional<Output<String>> receiverIngestingRemoteWriteUri() {
        return Optional.ofNullable(this.receiverIngestingRemoteWriteUri);
    }

    /**
     * Receiver remote write URI.
     * 
     */
    @Import(name="receiverRemoteWriteUri")
    private @Nullable Output<String> receiverRemoteWriteUri;

    /**
     * @return Receiver remote write URI.
     * 
     */
    public Optional<Output<String>> receiverRemoteWriteUri() {
        return Optional.ofNullable(this.receiverRemoteWriteUri);
    }

    /**
     * Store URI.
     * 
     */
    @Import(name="storeUri")
    private @Nullable Output<String> storeUri;

    /**
     * @return Store URI.
     * 
     */
    public Optional<Output<String>> storeUri() {
        return Optional.ofNullable(this.storeUri);
    }

    /**
     * Thanos server URIs.
     * 
     */
    @Import(name="uris")
    private @Nullable Output<List<String>> uris;

    /**
     * @return Thanos server URIs.
     * 
     */
    public Optional<Output<List<String>>> uris() {
        return Optional.ofNullable(this.uris);
    }

    private ThanosThanosArgs() {}

    private ThanosThanosArgs(ThanosThanosArgs $) {
        this.queryFrontendUri = $.queryFrontendUri;
        this.queryUri = $.queryUri;
        this.receiverIngestingRemoteWriteUri = $.receiverIngestingRemoteWriteUri;
        this.receiverRemoteWriteUri = $.receiverRemoteWriteUri;
        this.storeUri = $.storeUri;
        this.uris = $.uris;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ThanosThanosArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ThanosThanosArgs $;

        public Builder() {
            $ = new ThanosThanosArgs();
        }

        public Builder(ThanosThanosArgs defaults) {
            $ = new ThanosThanosArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param queryFrontendUri Query frontend URI.
         * 
         * @return builder
         * 
         */
        public Builder queryFrontendUri(@Nullable Output<String> queryFrontendUri) {
            $.queryFrontendUri = queryFrontendUri;
            return this;
        }

        /**
         * @param queryFrontendUri Query frontend URI.
         * 
         * @return builder
         * 
         */
        public Builder queryFrontendUri(String queryFrontendUri) {
            return queryFrontendUri(Output.of(queryFrontendUri));
        }

        /**
         * @param queryUri Query URI.
         * 
         * @return builder
         * 
         */
        public Builder queryUri(@Nullable Output<String> queryUri) {
            $.queryUri = queryUri;
            return this;
        }

        /**
         * @param queryUri Query URI.
         * 
         * @return builder
         * 
         */
        public Builder queryUri(String queryUri) {
            return queryUri(Output.of(queryUri));
        }

        /**
         * @param receiverIngestingRemoteWriteUri Receiver ingesting remote write URI.
         * 
         * @return builder
         * 
         */
        public Builder receiverIngestingRemoteWriteUri(@Nullable Output<String> receiverIngestingRemoteWriteUri) {
            $.receiverIngestingRemoteWriteUri = receiverIngestingRemoteWriteUri;
            return this;
        }

        /**
         * @param receiverIngestingRemoteWriteUri Receiver ingesting remote write URI.
         * 
         * @return builder
         * 
         */
        public Builder receiverIngestingRemoteWriteUri(String receiverIngestingRemoteWriteUri) {
            return receiverIngestingRemoteWriteUri(Output.of(receiverIngestingRemoteWriteUri));
        }

        /**
         * @param receiverRemoteWriteUri Receiver remote write URI.
         * 
         * @return builder
         * 
         */
        public Builder receiverRemoteWriteUri(@Nullable Output<String> receiverRemoteWriteUri) {
            $.receiverRemoteWriteUri = receiverRemoteWriteUri;
            return this;
        }

        /**
         * @param receiverRemoteWriteUri Receiver remote write URI.
         * 
         * @return builder
         * 
         */
        public Builder receiverRemoteWriteUri(String receiverRemoteWriteUri) {
            return receiverRemoteWriteUri(Output.of(receiverRemoteWriteUri));
        }

        /**
         * @param storeUri Store URI.
         * 
         * @return builder
         * 
         */
        public Builder storeUri(@Nullable Output<String> storeUri) {
            $.storeUri = storeUri;
            return this;
        }

        /**
         * @param storeUri Store URI.
         * 
         * @return builder
         * 
         */
        public Builder storeUri(String storeUri) {
            return storeUri(Output.of(storeUri));
        }

        /**
         * @param uris Thanos server URIs.
         * 
         * @return builder
         * 
         */
        public Builder uris(@Nullable Output<List<String>> uris) {
            $.uris = uris;
            return this;
        }

        /**
         * @param uris Thanos server URIs.
         * 
         * @return builder
         * 
         */
        public Builder uris(List<String> uris) {
            return uris(Output.of(uris));
        }

        /**
         * @param uris Thanos server URIs.
         * 
         * @return builder
         * 
         */
        public Builder uris(String... uris) {
            return uris(List.of(uris));
        }

        public ThanosThanosArgs build() {
            return $;
        }
    }

}