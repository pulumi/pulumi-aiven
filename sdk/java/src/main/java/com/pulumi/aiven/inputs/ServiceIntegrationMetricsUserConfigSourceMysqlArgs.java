// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aiven.inputs;

import com.pulumi.aiven.inputs.ServiceIntegrationMetricsUserConfigSourceMysqlTelegrafArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServiceIntegrationMetricsUserConfigSourceMysqlArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceIntegrationMetricsUserConfigSourceMysqlArgs Empty = new ServiceIntegrationMetricsUserConfigSourceMysqlArgs();

    /**
     * Configuration options for Telegraf MySQL input plugin
     * 
     */
    @Import(name="telegraf")
    private @Nullable Output<ServiceIntegrationMetricsUserConfigSourceMysqlTelegrafArgs> telegraf;

    /**
     * @return Configuration options for Telegraf MySQL input plugin
     * 
     */
    public Optional<Output<ServiceIntegrationMetricsUserConfigSourceMysqlTelegrafArgs>> telegraf() {
        return Optional.ofNullable(this.telegraf);
    }

    private ServiceIntegrationMetricsUserConfigSourceMysqlArgs() {}

    private ServiceIntegrationMetricsUserConfigSourceMysqlArgs(ServiceIntegrationMetricsUserConfigSourceMysqlArgs $) {
        this.telegraf = $.telegraf;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceIntegrationMetricsUserConfigSourceMysqlArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceIntegrationMetricsUserConfigSourceMysqlArgs $;

        public Builder() {
            $ = new ServiceIntegrationMetricsUserConfigSourceMysqlArgs();
        }

        public Builder(ServiceIntegrationMetricsUserConfigSourceMysqlArgs defaults) {
            $ = new ServiceIntegrationMetricsUserConfigSourceMysqlArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param telegraf Configuration options for Telegraf MySQL input plugin
         * 
         * @return builder
         * 
         */
        public Builder telegraf(@Nullable Output<ServiceIntegrationMetricsUserConfigSourceMysqlTelegrafArgs> telegraf) {
            $.telegraf = telegraf;
            return this;
        }

        /**
         * @param telegraf Configuration options for Telegraf MySQL input plugin
         * 
         * @return builder
         * 
         */
        public Builder telegraf(ServiceIntegrationMetricsUserConfigSourceMysqlTelegrafArgs telegraf) {
            return telegraf(Output.of(telegraf));
        }

        public ServiceIntegrationMetricsUserConfigSourceMysqlArgs build() {
            return $;
        }
    }

}
