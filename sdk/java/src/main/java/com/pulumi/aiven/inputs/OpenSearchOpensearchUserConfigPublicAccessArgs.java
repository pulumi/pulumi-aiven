// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aiven.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OpenSearchOpensearchUserConfigPublicAccessArgs extends com.pulumi.resources.ResourceArgs {

    public static final OpenSearchOpensearchUserConfigPublicAccessArgs Empty = new OpenSearchOpensearchUserConfigPublicAccessArgs();

    /**
     * Allow clients to connect to opensearch from the public internet for service nodes that are in a project VPC or another type of private network.
     * 
     */
    @Import(name="opensearch")
    private @Nullable Output<Boolean> opensearch;

    /**
     * @return Allow clients to connect to opensearch from the public internet for service nodes that are in a project VPC or another type of private network.
     * 
     */
    public Optional<Output<Boolean>> opensearch() {
        return Optional.ofNullable(this.opensearch);
    }

    /**
     * Allow clients to connect to opensearch_dashboards from the public internet for service nodes that are in a project VPC or another type of private network.
     * 
     */
    @Import(name="opensearchDashboards")
    private @Nullable Output<Boolean> opensearchDashboards;

    /**
     * @return Allow clients to connect to opensearch_dashboards from the public internet for service nodes that are in a project VPC or another type of private network.
     * 
     */
    public Optional<Output<Boolean>> opensearchDashboards() {
        return Optional.ofNullable(this.opensearchDashboards);
    }

    /**
     * Allow clients to connect to prometheus from the public internet for service nodes that are in a project VPC or another type of private network.
     * 
     */
    @Import(name="prometheus")
    private @Nullable Output<Boolean> prometheus;

    /**
     * @return Allow clients to connect to prometheus from the public internet for service nodes that are in a project VPC or another type of private network.
     * 
     */
    public Optional<Output<Boolean>> prometheus() {
        return Optional.ofNullable(this.prometheus);
    }

    private OpenSearchOpensearchUserConfigPublicAccessArgs() {}

    private OpenSearchOpensearchUserConfigPublicAccessArgs(OpenSearchOpensearchUserConfigPublicAccessArgs $) {
        this.opensearch = $.opensearch;
        this.opensearchDashboards = $.opensearchDashboards;
        this.prometheus = $.prometheus;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OpenSearchOpensearchUserConfigPublicAccessArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OpenSearchOpensearchUserConfigPublicAccessArgs $;

        public Builder() {
            $ = new OpenSearchOpensearchUserConfigPublicAccessArgs();
        }

        public Builder(OpenSearchOpensearchUserConfigPublicAccessArgs defaults) {
            $ = new OpenSearchOpensearchUserConfigPublicAccessArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param opensearch Allow clients to connect to opensearch from the public internet for service nodes that are in a project VPC or another type of private network.
         * 
         * @return builder
         * 
         */
        public Builder opensearch(@Nullable Output<Boolean> opensearch) {
            $.opensearch = opensearch;
            return this;
        }

        /**
         * @param opensearch Allow clients to connect to opensearch from the public internet for service nodes that are in a project VPC or another type of private network.
         * 
         * @return builder
         * 
         */
        public Builder opensearch(Boolean opensearch) {
            return opensearch(Output.of(opensearch));
        }

        /**
         * @param opensearchDashboards Allow clients to connect to opensearch_dashboards from the public internet for service nodes that are in a project VPC or another type of private network.
         * 
         * @return builder
         * 
         */
        public Builder opensearchDashboards(@Nullable Output<Boolean> opensearchDashboards) {
            $.opensearchDashboards = opensearchDashboards;
            return this;
        }

        /**
         * @param opensearchDashboards Allow clients to connect to opensearch_dashboards from the public internet for service nodes that are in a project VPC or another type of private network.
         * 
         * @return builder
         * 
         */
        public Builder opensearchDashboards(Boolean opensearchDashboards) {
            return opensearchDashboards(Output.of(opensearchDashboards));
        }

        /**
         * @param prometheus Allow clients to connect to prometheus from the public internet for service nodes that are in a project VPC or another type of private network.
         * 
         * @return builder
         * 
         */
        public Builder prometheus(@Nullable Output<Boolean> prometheus) {
            $.prometheus = prometheus;
            return this;
        }

        /**
         * @param prometheus Allow clients to connect to prometheus from the public internet for service nodes that are in a project VPC or another type of private network.
         * 
         * @return builder
         * 
         */
        public Builder prometheus(Boolean prometheus) {
            return prometheus(Output.of(prometheus));
        }

        public OpenSearchOpensearchUserConfigPublicAccessArgs build() {
            return $;
        }
    }

}
