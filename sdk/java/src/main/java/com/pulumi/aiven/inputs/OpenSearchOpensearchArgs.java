// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aiven.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OpenSearchOpensearchArgs extends com.pulumi.resources.ResourceArgs {

    public static final OpenSearchOpensearchArgs Empty = new OpenSearchOpensearchArgs();

    @Import(name="opensearchDashboardsUri")
    private @Nullable Output<String> opensearchDashboardsUri;

    public Optional<Output<String>> opensearchDashboardsUri() {
        return Optional.ofNullable(this.opensearchDashboardsUri);
    }

    private OpenSearchOpensearchArgs() {}

    private OpenSearchOpensearchArgs(OpenSearchOpensearchArgs $) {
        this.opensearchDashboardsUri = $.opensearchDashboardsUri;
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

        public Builder opensearchDashboardsUri(@Nullable Output<String> opensearchDashboardsUri) {
            $.opensearchDashboardsUri = opensearchDashboardsUri;
            return this;
        }

        public Builder opensearchDashboardsUri(String opensearchDashboardsUri) {
            return opensearchDashboardsUri(Output.of(opensearchDashboardsUri));
        }

        public OpenSearchOpensearchArgs build() {
            return $;
        }
    }

}