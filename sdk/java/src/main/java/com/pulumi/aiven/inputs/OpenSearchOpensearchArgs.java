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


public final class OpenSearchOpensearchArgs extends com.pulumi.resources.ResourceArgs {

    public static final OpenSearchOpensearchArgs Empty = new OpenSearchOpensearchArgs();

    /**
     * URI for Kibana dashboard frontend.
     * 
     * @deprecated
     * This field was added by mistake and has never worked. It will be removed in future versions.
     * 
     */
    @Deprecated /* This field was added by mistake and has never worked. It will be removed in future versions. */
    @Import(name="kibanaUri")
    private @Nullable Output<String> kibanaUri;

    /**
     * @return URI for Kibana dashboard frontend.
     * 
     * @deprecated
     * This field was added by mistake and has never worked. It will be removed in future versions.
     * 
     */
    @Deprecated /* This field was added by mistake and has never worked. It will be removed in future versions. */
    public Optional<Output<String>> kibanaUri() {
        return Optional.ofNullable(this.kibanaUri);
    }

    /**
     * URI for OpenSearch dashboard frontend.
     * 
     */
    @Import(name="opensearchDashboardsUri")
    private @Nullable Output<String> opensearchDashboardsUri;

    /**
     * @return URI for OpenSearch dashboard frontend.
     * 
     */
    public Optional<Output<String>> opensearchDashboardsUri() {
        return Optional.ofNullable(this.opensearchDashboardsUri);
    }

    /**
     * OpenSearch password.
     * 
     */
    @Import(name="password")
    private @Nullable Output<String> password;

    /**
     * @return OpenSearch password.
     * 
     */
    public Optional<Output<String>> password() {
        return Optional.ofNullable(this.password);
    }

    /**
     * OpenSearch server URIs.
     * 
     */
    @Import(name="uris")
    private @Nullable Output<List<String>> uris;

    /**
     * @return OpenSearch server URIs.
     * 
     */
    public Optional<Output<List<String>>> uris() {
        return Optional.ofNullable(this.uris);
    }

    /**
     * OpenSearch username.
     * 
     */
    @Import(name="username")
    private @Nullable Output<String> username;

    /**
     * @return OpenSearch username.
     * 
     */
    public Optional<Output<String>> username() {
        return Optional.ofNullable(this.username);
    }

    private OpenSearchOpensearchArgs() {}

    private OpenSearchOpensearchArgs(OpenSearchOpensearchArgs $) {
        this.kibanaUri = $.kibanaUri;
        this.opensearchDashboardsUri = $.opensearchDashboardsUri;
        this.password = $.password;
        this.uris = $.uris;
        this.username = $.username;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OpenSearchOpensearchArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OpenSearchOpensearchArgs $;

        public Builder() {
            $ = new OpenSearchOpensearchArgs();
        }

        public Builder(OpenSearchOpensearchArgs defaults) {
            $ = new OpenSearchOpensearchArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param kibanaUri URI for Kibana dashboard frontend.
         * 
         * @return builder
         * 
         * @deprecated
         * This field was added by mistake and has never worked. It will be removed in future versions.
         * 
         */
        @Deprecated /* This field was added by mistake and has never worked. It will be removed in future versions. */
        public Builder kibanaUri(@Nullable Output<String> kibanaUri) {
            $.kibanaUri = kibanaUri;
            return this;
        }

        /**
         * @param kibanaUri URI for Kibana dashboard frontend.
         * 
         * @return builder
         * 
         * @deprecated
         * This field was added by mistake and has never worked. It will be removed in future versions.
         * 
         */
        @Deprecated /* This field was added by mistake and has never worked. It will be removed in future versions. */
        public Builder kibanaUri(String kibanaUri) {
            return kibanaUri(Output.of(kibanaUri));
        }

        /**
         * @param opensearchDashboardsUri URI for OpenSearch dashboard frontend.
         * 
         * @return builder
         * 
         */
        public Builder opensearchDashboardsUri(@Nullable Output<String> opensearchDashboardsUri) {
            $.opensearchDashboardsUri = opensearchDashboardsUri;
            return this;
        }

        /**
         * @param opensearchDashboardsUri URI for OpenSearch dashboard frontend.
         * 
         * @return builder
         * 
         */
        public Builder opensearchDashboardsUri(String opensearchDashboardsUri) {
            return opensearchDashboardsUri(Output.of(opensearchDashboardsUri));
        }

        /**
         * @param password OpenSearch password.
         * 
         * @return builder
         * 
         */
        public Builder password(@Nullable Output<String> password) {
            $.password = password;
            return this;
        }

        /**
         * @param password OpenSearch password.
         * 
         * @return builder
         * 
         */
        public Builder password(String password) {
            return password(Output.of(password));
        }

        /**
         * @param uris OpenSearch server URIs.
         * 
         * @return builder
         * 
         */
        public Builder uris(@Nullable Output<List<String>> uris) {
            $.uris = uris;
            return this;
        }

        /**
         * @param uris OpenSearch server URIs.
         * 
         * @return builder
         * 
         */
        public Builder uris(List<String> uris) {
            return uris(Output.of(uris));
        }

        /**
         * @param uris OpenSearch server URIs.
         * 
         * @return builder
         * 
         */
        public Builder uris(String... uris) {
            return uris(List.of(uris));
        }

        /**
         * @param username OpenSearch username.
         * 
         * @return builder
         * 
         */
        public Builder username(@Nullable Output<String> username) {
            $.username = username;
            return this;
        }

        /**
         * @param username OpenSearch username.
         * 
         * @return builder
         * 
         */
        public Builder username(String username) {
            return username(Output.of(username));
        }

        public OpenSearchOpensearchArgs build() {
            return $;
        }
    }

}
