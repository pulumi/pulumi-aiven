// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aiven.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ServiceIntegrationDatadogUserConfigOpensearch {
    private @Nullable Boolean indexStatsEnabled;
    private @Nullable Boolean pendingTaskStatsEnabled;
    private @Nullable Boolean pshardStatsEnabled;

    private ServiceIntegrationDatadogUserConfigOpensearch() {}
    public Optional<Boolean> indexStatsEnabled() {
        return Optional.ofNullable(this.indexStatsEnabled);
    }
    public Optional<Boolean> pendingTaskStatsEnabled() {
        return Optional.ofNullable(this.pendingTaskStatsEnabled);
    }
    public Optional<Boolean> pshardStatsEnabled() {
        return Optional.ofNullable(this.pshardStatsEnabled);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceIntegrationDatadogUserConfigOpensearch defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean indexStatsEnabled;
        private @Nullable Boolean pendingTaskStatsEnabled;
        private @Nullable Boolean pshardStatsEnabled;
        public Builder() {}
        public Builder(ServiceIntegrationDatadogUserConfigOpensearch defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.indexStatsEnabled = defaults.indexStatsEnabled;
    	      this.pendingTaskStatsEnabled = defaults.pendingTaskStatsEnabled;
    	      this.pshardStatsEnabled = defaults.pshardStatsEnabled;
        }

        @CustomType.Setter
        public Builder indexStatsEnabled(@Nullable Boolean indexStatsEnabled) {
            this.indexStatsEnabled = indexStatsEnabled;
            return this;
        }
        @CustomType.Setter
        public Builder pendingTaskStatsEnabled(@Nullable Boolean pendingTaskStatsEnabled) {
            this.pendingTaskStatsEnabled = pendingTaskStatsEnabled;
            return this;
        }
        @CustomType.Setter
        public Builder pshardStatsEnabled(@Nullable Boolean pshardStatsEnabled) {
            this.pshardStatsEnabled = pshardStatsEnabled;
            return this;
        }
        public ServiceIntegrationDatadogUserConfigOpensearch build() {
            final var o = new ServiceIntegrationDatadogUserConfigOpensearch();
            o.indexStatsEnabled = indexStatsEnabled;
            o.pendingTaskStatsEnabled = pendingTaskStatsEnabled;
            o.pshardStatsEnabled = pshardStatsEnabled;
            return o;
        }
    }
}