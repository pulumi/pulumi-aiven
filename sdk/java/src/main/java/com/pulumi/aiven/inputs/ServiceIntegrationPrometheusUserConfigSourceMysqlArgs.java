// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aiven.inputs;

import com.pulumi.aiven.inputs.ServiceIntegrationPrometheusUserConfigSourceMysqlTelegrafArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServiceIntegrationPrometheusUserConfigSourceMysqlArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceIntegrationPrometheusUserConfigSourceMysqlArgs Empty = new ServiceIntegrationPrometheusUserConfigSourceMysqlArgs();

    /**
     * Configuration options for Telegraf MySQL input plugin
     * 
     */
    @Import(name="telegraf")
    private @Nullable Output<ServiceIntegrationPrometheusUserConfigSourceMysqlTelegrafArgs> telegraf;

    /**
     * @return Configuration options for Telegraf MySQL input plugin
     * 
     */
    public Optional<Output<ServiceIntegrationPrometheusUserConfigSourceMysqlTelegrafArgs>> telegraf() {
        return Optional.ofNullable(this.telegraf);
    }

    private ServiceIntegrationPrometheusUserConfigSourceMysqlArgs() {}

    private ServiceIntegrationPrometheusUserConfigSourceMysqlArgs(ServiceIntegrationPrometheusUserConfigSourceMysqlArgs $) {
        this.telegraf = $.telegraf;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceIntegrationPrometheusUserConfigSourceMysqlArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceIntegrationPrometheusUserConfigSourceMysqlArgs $;

        public Builder() {
            $ = new ServiceIntegrationPrometheusUserConfigSourceMysqlArgs();
        }

        public Builder(ServiceIntegrationPrometheusUserConfigSourceMysqlArgs defaults) {
            $ = new ServiceIntegrationPrometheusUserConfigSourceMysqlArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param telegraf Configuration options for Telegraf MySQL input plugin
         * 
         * @return builder
         * 
         */
        public Builder telegraf(@Nullable Output<ServiceIntegrationPrometheusUserConfigSourceMysqlTelegrafArgs> telegraf) {
            $.telegraf = telegraf;
            return this;
        }

        /**
         * @param telegraf Configuration options for Telegraf MySQL input plugin
         * 
         * @return builder
         * 
         */
        public Builder telegraf(ServiceIntegrationPrometheusUserConfigSourceMysqlTelegrafArgs telegraf) {
            return telegraf(Output.of(telegraf));
        }

        public ServiceIntegrationPrometheusUserConfigSourceMysqlArgs build() {
            return $;
        }
    }

}