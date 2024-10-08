// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aiven.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class ServiceIntegrationEndpointExternalClickhouseUserConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceIntegrationEndpointExternalClickhouseUserConfigArgs Empty = new ServiceIntegrationEndpointExternalClickhouseUserConfigArgs();

    /**
     * Hostname or IP address of the server. Example: `my.server.com`.
     * 
     */
    @Import(name="host", required=true)
    private Output<String> host;

    /**
     * @return Hostname or IP address of the server. Example: `my.server.com`.
     * 
     */
    public Output<String> host() {
        return this.host;
    }

    /**
     * Password. Example: `jjKk45Nnd`.
     * 
     */
    @Import(name="password", required=true)
    private Output<String> password;

    /**
     * @return Password. Example: `jjKk45Nnd`.
     * 
     */
    public Output<String> password() {
        return this.password;
    }

    /**
     * Secure TCP server port. Example: `9440`.
     * 
     */
    @Import(name="port", required=true)
    private Output<Integer> port;

    /**
     * @return Secure TCP server port. Example: `9440`.
     * 
     */
    public Output<Integer> port() {
        return this.port;
    }

    /**
     * User name. Example: `default`.
     * 
     */
    @Import(name="username", required=true)
    private Output<String> username;

    /**
     * @return User name. Example: `default`.
     * 
     */
    public Output<String> username() {
        return this.username;
    }

    private ServiceIntegrationEndpointExternalClickhouseUserConfigArgs() {}

    private ServiceIntegrationEndpointExternalClickhouseUserConfigArgs(ServiceIntegrationEndpointExternalClickhouseUserConfigArgs $) {
        this.host = $.host;
        this.password = $.password;
        this.port = $.port;
        this.username = $.username;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceIntegrationEndpointExternalClickhouseUserConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceIntegrationEndpointExternalClickhouseUserConfigArgs $;

        public Builder() {
            $ = new ServiceIntegrationEndpointExternalClickhouseUserConfigArgs();
        }

        public Builder(ServiceIntegrationEndpointExternalClickhouseUserConfigArgs defaults) {
            $ = new ServiceIntegrationEndpointExternalClickhouseUserConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param host Hostname or IP address of the server. Example: `my.server.com`.
         * 
         * @return builder
         * 
         */
        public Builder host(Output<String> host) {
            $.host = host;
            return this;
        }

        /**
         * @param host Hostname or IP address of the server. Example: `my.server.com`.
         * 
         * @return builder
         * 
         */
        public Builder host(String host) {
            return host(Output.of(host));
        }

        /**
         * @param password Password. Example: `jjKk45Nnd`.
         * 
         * @return builder
         * 
         */
        public Builder password(Output<String> password) {
            $.password = password;
            return this;
        }

        /**
         * @param password Password. Example: `jjKk45Nnd`.
         * 
         * @return builder
         * 
         */
        public Builder password(String password) {
            return password(Output.of(password));
        }

        /**
         * @param port Secure TCP server port. Example: `9440`.
         * 
         * @return builder
         * 
         */
        public Builder port(Output<Integer> port) {
            $.port = port;
            return this;
        }

        /**
         * @param port Secure TCP server port. Example: `9440`.
         * 
         * @return builder
         * 
         */
        public Builder port(Integer port) {
            return port(Output.of(port));
        }

        /**
         * @param username User name. Example: `default`.
         * 
         * @return builder
         * 
         */
        public Builder username(Output<String> username) {
            $.username = username;
            return this;
        }

        /**
         * @param username User name. Example: `default`.
         * 
         * @return builder
         * 
         */
        public Builder username(String username) {
            return username(Output.of(username));
        }

        public ServiceIntegrationEndpointExternalClickhouseUserConfigArgs build() {
            if ($.host == null) {
                throw new MissingRequiredPropertyException("ServiceIntegrationEndpointExternalClickhouseUserConfigArgs", "host");
            }
            if ($.password == null) {
                throw new MissingRequiredPropertyException("ServiceIntegrationEndpointExternalClickhouseUserConfigArgs", "password");
            }
            if ($.port == null) {
                throw new MissingRequiredPropertyException("ServiceIntegrationEndpointExternalClickhouseUserConfigArgs", "port");
            }
            if ($.username == null) {
                throw new MissingRequiredPropertyException("ServiceIntegrationEndpointExternalClickhouseUserConfigArgs", "username");
            }
            return $;
        }
    }

}
