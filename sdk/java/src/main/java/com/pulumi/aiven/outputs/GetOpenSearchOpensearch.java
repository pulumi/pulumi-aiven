// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aiven.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetOpenSearchOpensearch {
    private String opensearchDashboardsUri;

    private GetOpenSearchOpensearch() {}
    public String opensearchDashboardsUri() {
        return this.opensearchDashboardsUri;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetOpenSearchOpensearch defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String opensearchDashboardsUri;
        public Builder() {}
        public Builder(GetOpenSearchOpensearch defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.opensearchDashboardsUri = defaults.opensearchDashboardsUri;
        }

        @CustomType.Setter
        public Builder opensearchDashboardsUri(String opensearchDashboardsUri) {
            this.opensearchDashboardsUri = Objects.requireNonNull(opensearchDashboardsUri);
            return this;
        }
        public GetOpenSearchOpensearch build() {
            final var o = new GetOpenSearchOpensearch();
            o.opensearchDashboardsUri = opensearchDashboardsUri;
            return o;
        }
    }
}