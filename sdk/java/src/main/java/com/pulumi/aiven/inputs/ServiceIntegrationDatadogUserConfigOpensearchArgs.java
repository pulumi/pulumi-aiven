// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aiven.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServiceIntegrationDatadogUserConfigOpensearchArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceIntegrationDatadogUserConfigOpensearchArgs Empty = new ServiceIntegrationDatadogUserConfigOpensearchArgs();

    @Import(name="indexStatsEnabled")
    private @Nullable Output<Boolean> indexStatsEnabled;

    public Optional<Output<Boolean>> indexStatsEnabled() {
        return Optional.ofNullable(this.indexStatsEnabled);
    }

    @Import(name="pendingTaskStatsEnabled")
    private @Nullable Output<Boolean> pendingTaskStatsEnabled;

    public Optional<Output<Boolean>> pendingTaskStatsEnabled() {
        return Optional.ofNullable(this.pendingTaskStatsEnabled);
    }

    @Import(name="pshardStatsEnabled")
    private @Nullable Output<Boolean> pshardStatsEnabled;

    public Optional<Output<Boolean>> pshardStatsEnabled() {
        return Optional.ofNullable(this.pshardStatsEnabled);
    }

    private ServiceIntegrationDatadogUserConfigOpensearchArgs() {}

    private ServiceIntegrationDatadogUserConfigOpensearchArgs(ServiceIntegrationDatadogUserConfigOpensearchArgs $) {
        this.indexStatsEnabled = $.indexStatsEnabled;
        this.pendingTaskStatsEnabled = $.pendingTaskStatsEnabled;
        this.pshardStatsEnabled = $.pshardStatsEnabled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceIntegrationDatadogUserConfigOpensearchArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceIntegrationDatadogUserConfigOpensearchArgs $;

        public Builder() {
            $ = new ServiceIntegrationDatadogUserConfigOpensearchArgs();
        }

        public Builder(ServiceIntegrationDatadogUserConfigOpensearchArgs defaults) {
            $ = new ServiceIntegrationDatadogUserConfigOpensearchArgs(Objects.requireNonNull(defaults));
        }

        public Builder indexStatsEnabled(@Nullable Output<Boolean> indexStatsEnabled) {
            $.indexStatsEnabled = indexStatsEnabled;
            return this;
        }

        public Builder indexStatsEnabled(Boolean indexStatsEnabled) {
            return indexStatsEnabled(Output.of(indexStatsEnabled));
        }

        public Builder pendingTaskStatsEnabled(@Nullable Output<Boolean> pendingTaskStatsEnabled) {
            $.pendingTaskStatsEnabled = pendingTaskStatsEnabled;
            return this;
        }

        public Builder pendingTaskStatsEnabled(Boolean pendingTaskStatsEnabled) {
            return pendingTaskStatsEnabled(Output.of(pendingTaskStatsEnabled));
        }

        public Builder pshardStatsEnabled(@Nullable Output<Boolean> pshardStatsEnabled) {
            $.pshardStatsEnabled = pshardStatsEnabled;
            return this;
        }

        public Builder pshardStatsEnabled(Boolean pshardStatsEnabled) {
            return pshardStatsEnabled(Output.of(pshardStatsEnabled));
        }

        public ServiceIntegrationDatadogUserConfigOpensearchArgs build() {
            return $;
        }
    }

}