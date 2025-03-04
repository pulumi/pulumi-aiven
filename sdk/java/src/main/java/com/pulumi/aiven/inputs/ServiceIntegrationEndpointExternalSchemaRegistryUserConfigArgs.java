// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aiven.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServiceIntegrationEndpointExternalSchemaRegistryUserConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceIntegrationEndpointExternalSchemaRegistryUserConfigArgs Empty = new ServiceIntegrationEndpointExternalSchemaRegistryUserConfigArgs();

    /**
     * Enum: `basic`, `none`. Authentication method.
     * 
     */
    @Import(name="authentication", required=true)
    private Output<String> authentication;

    /**
     * @return Enum: `basic`, `none`. Authentication method.
     * 
     */
    public Output<String> authentication() {
        return this.authentication;
    }

    /**
     * Basic authentication password. Example: `Zm9vYg==`.
     * 
     */
    @Import(name="basicAuthPassword")
    private @Nullable Output<String> basicAuthPassword;

    /**
     * @return Basic authentication password. Example: `Zm9vYg==`.
     * 
     */
    public Optional<Output<String>> basicAuthPassword() {
        return Optional.ofNullable(this.basicAuthPassword);
    }

    /**
     * Basic authentication user name. Example: `avnadmin`.
     * 
     */
    @Import(name="basicAuthUsername")
    private @Nullable Output<String> basicAuthUsername;

    /**
     * @return Basic authentication user name. Example: `avnadmin`.
     * 
     */
    public Optional<Output<String>> basicAuthUsername() {
        return Optional.ofNullable(this.basicAuthUsername);
    }

    /**
     * Schema Registry URL. Example: `https://schema-registry.kafka.company.com:28419`.
     * 
     */
    @Import(name="url", required=true)
    private Output<String> url;

    /**
     * @return Schema Registry URL. Example: `https://schema-registry.kafka.company.com:28419`.
     * 
     */
    public Output<String> url() {
        return this.url;
    }

    private ServiceIntegrationEndpointExternalSchemaRegistryUserConfigArgs() {}

    private ServiceIntegrationEndpointExternalSchemaRegistryUserConfigArgs(ServiceIntegrationEndpointExternalSchemaRegistryUserConfigArgs $) {
        this.authentication = $.authentication;
        this.basicAuthPassword = $.basicAuthPassword;
        this.basicAuthUsername = $.basicAuthUsername;
        this.url = $.url;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceIntegrationEndpointExternalSchemaRegistryUserConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceIntegrationEndpointExternalSchemaRegistryUserConfigArgs $;

        public Builder() {
            $ = new ServiceIntegrationEndpointExternalSchemaRegistryUserConfigArgs();
        }

        public Builder(ServiceIntegrationEndpointExternalSchemaRegistryUserConfigArgs defaults) {
            $ = new ServiceIntegrationEndpointExternalSchemaRegistryUserConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param authentication Enum: `basic`, `none`. Authentication method.
         * 
         * @return builder
         * 
         */
        public Builder authentication(Output<String> authentication) {
            $.authentication = authentication;
            return this;
        }

        /**
         * @param authentication Enum: `basic`, `none`. Authentication method.
         * 
         * @return builder
         * 
         */
        public Builder authentication(String authentication) {
            return authentication(Output.of(authentication));
        }

        /**
         * @param basicAuthPassword Basic authentication password. Example: `Zm9vYg==`.
         * 
         * @return builder
         * 
         */
        public Builder basicAuthPassword(@Nullable Output<String> basicAuthPassword) {
            $.basicAuthPassword = basicAuthPassword;
            return this;
        }

        /**
         * @param basicAuthPassword Basic authentication password. Example: `Zm9vYg==`.
         * 
         * @return builder
         * 
         */
        public Builder basicAuthPassword(String basicAuthPassword) {
            return basicAuthPassword(Output.of(basicAuthPassword));
        }

        /**
         * @param basicAuthUsername Basic authentication user name. Example: `avnadmin`.
         * 
         * @return builder
         * 
         */
        public Builder basicAuthUsername(@Nullable Output<String> basicAuthUsername) {
            $.basicAuthUsername = basicAuthUsername;
            return this;
        }

        /**
         * @param basicAuthUsername Basic authentication user name. Example: `avnadmin`.
         * 
         * @return builder
         * 
         */
        public Builder basicAuthUsername(String basicAuthUsername) {
            return basicAuthUsername(Output.of(basicAuthUsername));
        }

        /**
         * @param url Schema Registry URL. Example: `https://schema-registry.kafka.company.com:28419`.
         * 
         * @return builder
         * 
         */
        public Builder url(Output<String> url) {
            $.url = url;
            return this;
        }

        /**
         * @param url Schema Registry URL. Example: `https://schema-registry.kafka.company.com:28419`.
         * 
         * @return builder
         * 
         */
        public Builder url(String url) {
            return url(Output.of(url));
        }

        public ServiceIntegrationEndpointExternalSchemaRegistryUserConfigArgs build() {
            if ($.authentication == null) {
                throw new MissingRequiredPropertyException("ServiceIntegrationEndpointExternalSchemaRegistryUserConfigArgs", "authentication");
            }
            if ($.url == null) {
                throw new MissingRequiredPropertyException("ServiceIntegrationEndpointExternalSchemaRegistryUserConfigArgs", "url");
            }
            return $;
        }
    }

}
