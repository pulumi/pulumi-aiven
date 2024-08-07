// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aiven.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServiceIntegrationEndpointJolokiaUserConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceIntegrationEndpointJolokiaUserConfigArgs Empty = new ServiceIntegrationEndpointJolokiaUserConfigArgs();

    /**
     * Jolokia basic authentication password. Example: `yhfBNFii4C`.
     * 
     */
    @Import(name="basicAuthPassword")
    private @Nullable Output<String> basicAuthPassword;

    /**
     * @return Jolokia basic authentication password. Example: `yhfBNFii4C`.
     * 
     */
    public Optional<Output<String>> basicAuthPassword() {
        return Optional.ofNullable(this.basicAuthPassword);
    }

    /**
     * Jolokia basic authentication username. Example: `jol48k51`.
     * 
     */
    @Import(name="basicAuthUsername")
    private @Nullable Output<String> basicAuthUsername;

    /**
     * @return Jolokia basic authentication username. Example: `jol48k51`.
     * 
     */
    public Optional<Output<String>> basicAuthUsername() {
        return Optional.ofNullable(this.basicAuthUsername);
    }

    private ServiceIntegrationEndpointJolokiaUserConfigArgs() {}

    private ServiceIntegrationEndpointJolokiaUserConfigArgs(ServiceIntegrationEndpointJolokiaUserConfigArgs $) {
        this.basicAuthPassword = $.basicAuthPassword;
        this.basicAuthUsername = $.basicAuthUsername;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceIntegrationEndpointJolokiaUserConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceIntegrationEndpointJolokiaUserConfigArgs $;

        public Builder() {
            $ = new ServiceIntegrationEndpointJolokiaUserConfigArgs();
        }

        public Builder(ServiceIntegrationEndpointJolokiaUserConfigArgs defaults) {
            $ = new ServiceIntegrationEndpointJolokiaUserConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param basicAuthPassword Jolokia basic authentication password. Example: `yhfBNFii4C`.
         * 
         * @return builder
         * 
         */
        public Builder basicAuthPassword(@Nullable Output<String> basicAuthPassword) {
            $.basicAuthPassword = basicAuthPassword;
            return this;
        }

        /**
         * @param basicAuthPassword Jolokia basic authentication password. Example: `yhfBNFii4C`.
         * 
         * @return builder
         * 
         */
        public Builder basicAuthPassword(String basicAuthPassword) {
            return basicAuthPassword(Output.of(basicAuthPassword));
        }

        /**
         * @param basicAuthUsername Jolokia basic authentication username. Example: `jol48k51`.
         * 
         * @return builder
         * 
         */
        public Builder basicAuthUsername(@Nullable Output<String> basicAuthUsername) {
            $.basicAuthUsername = basicAuthUsername;
            return this;
        }

        /**
         * @param basicAuthUsername Jolokia basic authentication username. Example: `jol48k51`.
         * 
         * @return builder
         * 
         */
        public Builder basicAuthUsername(String basicAuthUsername) {
            return basicAuthUsername(Output.of(basicAuthUsername));
        }

        public ServiceIntegrationEndpointJolokiaUserConfigArgs build() {
            return $;
        }
    }

}
