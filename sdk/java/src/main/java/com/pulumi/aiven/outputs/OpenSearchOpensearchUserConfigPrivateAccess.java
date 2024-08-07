// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aiven.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class OpenSearchOpensearchUserConfigPrivateAccess {
    /**
     * @return Allow clients to connect to opensearch with a DNS name that always resolves to the service&#39;s private IP addresses. Only available in certain network locations.
     * 
     */
    private @Nullable Boolean opensearch;
    /**
     * @return Allow clients to connect to opensearch_dashboards with a DNS name that always resolves to the service&#39;s private IP addresses. Only available in certain network locations.
     * 
     */
    private @Nullable Boolean opensearchDashboards;
    /**
     * @return Allow clients to connect to prometheus with a DNS name that always resolves to the service&#39;s private IP addresses. Only available in certain network locations.
     * 
     */
    private @Nullable Boolean prometheus;

    private OpenSearchOpensearchUserConfigPrivateAccess() {}
    /**
     * @return Allow clients to connect to opensearch with a DNS name that always resolves to the service&#39;s private IP addresses. Only available in certain network locations.
     * 
     */
    public Optional<Boolean> opensearch() {
        return Optional.ofNullable(this.opensearch);
    }
    /**
     * @return Allow clients to connect to opensearch_dashboards with a DNS name that always resolves to the service&#39;s private IP addresses. Only available in certain network locations.
     * 
     */
    public Optional<Boolean> opensearchDashboards() {
        return Optional.ofNullable(this.opensearchDashboards);
    }
    /**
     * @return Allow clients to connect to prometheus with a DNS name that always resolves to the service&#39;s private IP addresses. Only available in certain network locations.
     * 
     */
    public Optional<Boolean> prometheus() {
        return Optional.ofNullable(this.prometheus);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OpenSearchOpensearchUserConfigPrivateAccess defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean opensearch;
        private @Nullable Boolean opensearchDashboards;
        private @Nullable Boolean prometheus;
        public Builder() {}
        public Builder(OpenSearchOpensearchUserConfigPrivateAccess defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.opensearch = defaults.opensearch;
    	      this.opensearchDashboards = defaults.opensearchDashboards;
    	      this.prometheus = defaults.prometheus;
        }

        @CustomType.Setter
        public Builder opensearch(@Nullable Boolean opensearch) {

            this.opensearch = opensearch;
            return this;
        }
        @CustomType.Setter
        public Builder opensearchDashboards(@Nullable Boolean opensearchDashboards) {

            this.opensearchDashboards = opensearchDashboards;
            return this;
        }
        @CustomType.Setter
        public Builder prometheus(@Nullable Boolean prometheus) {

            this.prometheus = prometheus;
            return this;
        }
        public OpenSearchOpensearchUserConfigPrivateAccess build() {
            final var _resultValue = new OpenSearchOpensearchUserConfigPrivateAccess();
            _resultValue.opensearch = opensearch;
            _resultValue.opensearchDashboards = opensearchDashboards;
            _resultValue.prometheus = prometheus;
            return _resultValue;
        }
    }
}
