// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aiven.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetServiceIntegrationDatadogUserConfigRedis {
    /**
     * @return Enable command_stats option in the agent&#39;s configuration. Default: `false`.
     * 
     */
    private @Nullable Boolean commandStatsEnabled;

    private GetServiceIntegrationDatadogUserConfigRedis() {}
    /**
     * @return Enable command_stats option in the agent&#39;s configuration. Default: `false`.
     * 
     */
    public Optional<Boolean> commandStatsEnabled() {
        return Optional.ofNullable(this.commandStatsEnabled);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServiceIntegrationDatadogUserConfigRedis defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean commandStatsEnabled;
        public Builder() {}
        public Builder(GetServiceIntegrationDatadogUserConfigRedis defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.commandStatsEnabled = defaults.commandStatsEnabled;
        }

        @CustomType.Setter
        public Builder commandStatsEnabled(@Nullable Boolean commandStatsEnabled) {

            this.commandStatsEnabled = commandStatsEnabled;
            return this;
        }
        public GetServiceIntegrationDatadogUserConfigRedis build() {
            final var _resultValue = new GetServiceIntegrationDatadogUserConfigRedis();
            _resultValue.commandStatsEnabled = commandStatsEnabled;
            return _resultValue;
        }
    }
}
