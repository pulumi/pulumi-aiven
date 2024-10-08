// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aiven.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OpenSearchOpensearchUserConfigPrivatelinkAccessArgs extends com.pulumi.resources.ResourceArgs {

    public static final OpenSearchOpensearchUserConfigPrivatelinkAccessArgs Empty = new OpenSearchOpensearchUserConfigPrivatelinkAccessArgs();

    /**
     * Enable opensearch.
     * 
     */
    @Import(name="opensearch")
    private @Nullable Output<Boolean> opensearch;

    /**
     * @return Enable opensearch.
     * 
     */
    public Optional<Output<Boolean>> opensearch() {
        return Optional.ofNullable(this.opensearch);
    }

    /**
     * Enable opensearch_dashboards.
     * 
     */
    @Import(name="opensearchDashboards")
    private @Nullable Output<Boolean> opensearchDashboards;

    /**
     * @return Enable opensearch_dashboards.
     * 
     */
    public Optional<Output<Boolean>> opensearchDashboards() {
        return Optional.ofNullable(this.opensearchDashboards);
    }

    /**
     * Enable prometheus.
     * 
     */
    @Import(name="prometheus")
    private @Nullable Output<Boolean> prometheus;

    /**
     * @return Enable prometheus.
     * 
     */
    public Optional<Output<Boolean>> prometheus() {
        return Optional.ofNullable(this.prometheus);
    }

    private OpenSearchOpensearchUserConfigPrivatelinkAccessArgs() {}

    private OpenSearchOpensearchUserConfigPrivatelinkAccessArgs(OpenSearchOpensearchUserConfigPrivatelinkAccessArgs $) {
        this.opensearch = $.opensearch;
        this.opensearchDashboards = $.opensearchDashboards;
        this.prometheus = $.prometheus;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OpenSearchOpensearchUserConfigPrivatelinkAccessArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OpenSearchOpensearchUserConfigPrivatelinkAccessArgs $;

        public Builder() {
            $ = new OpenSearchOpensearchUserConfigPrivatelinkAccessArgs();
        }

        public Builder(OpenSearchOpensearchUserConfigPrivatelinkAccessArgs defaults) {
            $ = new OpenSearchOpensearchUserConfigPrivatelinkAccessArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param opensearch Enable opensearch.
         * 
         * @return builder
         * 
         */
        public Builder opensearch(@Nullable Output<Boolean> opensearch) {
            $.opensearch = opensearch;
            return this;
        }

        /**
         * @param opensearch Enable opensearch.
         * 
         * @return builder
         * 
         */
        public Builder opensearch(Boolean opensearch) {
            return opensearch(Output.of(opensearch));
        }

        /**
         * @param opensearchDashboards Enable opensearch_dashboards.
         * 
         * @return builder
         * 
         */
        public Builder opensearchDashboards(@Nullable Output<Boolean> opensearchDashboards) {
            $.opensearchDashboards = opensearchDashboards;
            return this;
        }

        /**
         * @param opensearchDashboards Enable opensearch_dashboards.
         * 
         * @return builder
         * 
         */
        public Builder opensearchDashboards(Boolean opensearchDashboards) {
            return opensearchDashboards(Output.of(opensearchDashboards));
        }

        /**
         * @param prometheus Enable prometheus.
         * 
         * @return builder
         * 
         */
        public Builder prometheus(@Nullable Output<Boolean> prometheus) {
            $.prometheus = prometheus;
            return this;
        }

        /**
         * @param prometheus Enable prometheus.
         * 
         * @return builder
         * 
         */
        public Builder prometheus(Boolean prometheus) {
            return prometheus(Output.of(prometheus));
        }

        public OpenSearchOpensearchUserConfigPrivatelinkAccessArgs build() {
            return $;
        }
    }

}
