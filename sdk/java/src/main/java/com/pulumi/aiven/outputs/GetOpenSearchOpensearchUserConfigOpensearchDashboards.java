// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aiven.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetOpenSearchOpensearchUserConfigOpensearchDashboards {
    private @Nullable String enabled;
    private @Nullable String maxOldSpaceSize;
    private @Nullable String opensearchRequestTimeout;

    private GetOpenSearchOpensearchUserConfigOpensearchDashboards() {}
    public Optional<String> enabled() {
        return Optional.ofNullable(this.enabled);
    }
    public Optional<String> maxOldSpaceSize() {
        return Optional.ofNullable(this.maxOldSpaceSize);
    }
    public Optional<String> opensearchRequestTimeout() {
        return Optional.ofNullable(this.opensearchRequestTimeout);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetOpenSearchOpensearchUserConfigOpensearchDashboards defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String enabled;
        private @Nullable String maxOldSpaceSize;
        private @Nullable String opensearchRequestTimeout;
        public Builder() {}
        public Builder(GetOpenSearchOpensearchUserConfigOpensearchDashboards defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.maxOldSpaceSize = defaults.maxOldSpaceSize;
    	      this.opensearchRequestTimeout = defaults.opensearchRequestTimeout;
        }

        @CustomType.Setter
        public Builder enabled(@Nullable String enabled) {
            this.enabled = enabled;
            return this;
        }
        @CustomType.Setter
        public Builder maxOldSpaceSize(@Nullable String maxOldSpaceSize) {
            this.maxOldSpaceSize = maxOldSpaceSize;
            return this;
        }
        @CustomType.Setter
        public Builder opensearchRequestTimeout(@Nullable String opensearchRequestTimeout) {
            this.opensearchRequestTimeout = opensearchRequestTimeout;
            return this;
        }
        public GetOpenSearchOpensearchUserConfigOpensearchDashboards build() {
            final var o = new GetOpenSearchOpensearchUserConfigOpensearchDashboards();
            o.enabled = enabled;
            o.maxOldSpaceSize = maxOldSpaceSize;
            o.opensearchRequestTimeout = opensearchRequestTimeout;
            return o;
        }
    }
}