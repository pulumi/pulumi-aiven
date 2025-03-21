// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aiven.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServiceIntegrationEndpointExternalPostgresqlArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceIntegrationEndpointExternalPostgresqlArgs Empty = new ServiceIntegrationEndpointExternalPostgresqlArgs();

    /**
     * Default database. Example: `testdb`.
     * 
     */
    @Import(name="defaultDatabase")
    private @Nullable Output<String> defaultDatabase;

    /**
     * @return Default database. Example: `testdb`.
     * 
     */
    public Optional<Output<String>> defaultDatabase() {
        return Optional.ofNullable(this.defaultDatabase);
    }

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
    @Import(name="password")
    private @Nullable Output<String> password;

    /**
     * @return Password. Example: `jjKk45Nnd`.
     * 
     */
    public Optional<Output<String>> password() {
        return Optional.ofNullable(this.password);
    }

    /**
     * Port number of the server. Example: `5432`.
     * 
     */
    @Import(name="port", required=true)
    private Output<Integer> port;

    /**
     * @return Port number of the server. Example: `5432`.
     * 
     */
    public Output<Integer> port() {
        return this.port;
    }

    /**
     * Client certificate. Example: `-----BEGIN CERTIFICATE-----
     * ...
     * -----END CERTIFICATE-----
     * `.
     * 
     */
    @Import(name="sslClientCertificate")
    private @Nullable Output<String> sslClientCertificate;

    /**
     * @return Client certificate. Example: `-----BEGIN CERTIFICATE-----
     * ...
     * -----END CERTIFICATE-----
     * `.
     * 
     */
    public Optional<Output<String>> sslClientCertificate() {
        return Optional.ofNullable(this.sslClientCertificate);
    }

    /**
     * Client key. Example: `-----BEGIN PRIVATE KEY-----
     * ...
     * -----END PRIVATE KEY-----`.
     * 
     */
    @Import(name="sslClientKey")
    private @Nullable Output<String> sslClientKey;

    /**
     * @return Client key. Example: `-----BEGIN PRIVATE KEY-----
     * ...
     * -----END PRIVATE KEY-----`.
     * 
     */
    public Optional<Output<String>> sslClientKey() {
        return Optional.ofNullable(this.sslClientKey);
    }

    /**
     * Enum: `allow`, `disable`, `prefer`, `require`, `verify-ca`, `verify-full`. SSL mode to use for the connection.  Please note that Aiven requires TLS for all connections to external PostgreSQL services. Default: `verify-full`.
     * 
     */
    @Import(name="sslMode")
    private @Nullable Output<String> sslMode;

    /**
     * @return Enum: `allow`, `disable`, `prefer`, `require`, `verify-ca`, `verify-full`. SSL mode to use for the connection.  Please note that Aiven requires TLS for all connections to external PostgreSQL services. Default: `verify-full`.
     * 
     */
    public Optional<Output<String>> sslMode() {
        return Optional.ofNullable(this.sslMode);
    }

    /**
     * SSL Root Cert. Example: `-----BEGIN CERTIFICATE-----
     * ...
     * -----END CERTIFICATE-----
     * `.
     * 
     */
    @Import(name="sslRootCert")
    private @Nullable Output<String> sslRootCert;

    /**
     * @return SSL Root Cert. Example: `-----BEGIN CERTIFICATE-----
     * ...
     * -----END CERTIFICATE-----
     * `.
     * 
     */
    public Optional<Output<String>> sslRootCert() {
        return Optional.ofNullable(this.sslRootCert);
    }

    /**
     * User name. Example: `myname`.
     * 
     */
    @Import(name="username", required=true)
    private Output<String> username;

    /**
     * @return User name. Example: `myname`.
     * 
     */
    public Output<String> username() {
        return this.username;
    }

    private ServiceIntegrationEndpointExternalPostgresqlArgs() {}

    private ServiceIntegrationEndpointExternalPostgresqlArgs(ServiceIntegrationEndpointExternalPostgresqlArgs $) {
        this.defaultDatabase = $.defaultDatabase;
        this.host = $.host;
        this.password = $.password;
        this.port = $.port;
        this.sslClientCertificate = $.sslClientCertificate;
        this.sslClientKey = $.sslClientKey;
        this.sslMode = $.sslMode;
        this.sslRootCert = $.sslRootCert;
        this.username = $.username;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceIntegrationEndpointExternalPostgresqlArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceIntegrationEndpointExternalPostgresqlArgs $;

        public Builder() {
            $ = new ServiceIntegrationEndpointExternalPostgresqlArgs();
        }

        public Builder(ServiceIntegrationEndpointExternalPostgresqlArgs defaults) {
            $ = new ServiceIntegrationEndpointExternalPostgresqlArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param defaultDatabase Default database. Example: `testdb`.
         * 
         * @return builder
         * 
         */
        public Builder defaultDatabase(@Nullable Output<String> defaultDatabase) {
            $.defaultDatabase = defaultDatabase;
            return this;
        }

        /**
         * @param defaultDatabase Default database. Example: `testdb`.
         * 
         * @return builder
         * 
         */
        public Builder defaultDatabase(String defaultDatabase) {
            return defaultDatabase(Output.of(defaultDatabase));
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
        public Builder password(@Nullable Output<String> password) {
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
         * @param port Port number of the server. Example: `5432`.
         * 
         * @return builder
         * 
         */
        public Builder port(Output<Integer> port) {
            $.port = port;
            return this;
        }

        /**
         * @param port Port number of the server. Example: `5432`.
         * 
         * @return builder
         * 
         */
        public Builder port(Integer port) {
            return port(Output.of(port));
        }

        /**
         * @param sslClientCertificate Client certificate. Example: `-----BEGIN CERTIFICATE-----
         * ...
         * -----END CERTIFICATE-----
         * `.
         * 
         * @return builder
         * 
         */
        public Builder sslClientCertificate(@Nullable Output<String> sslClientCertificate) {
            $.sslClientCertificate = sslClientCertificate;
            return this;
        }

        /**
         * @param sslClientCertificate Client certificate. Example: `-----BEGIN CERTIFICATE-----
         * ...
         * -----END CERTIFICATE-----
         * `.
         * 
         * @return builder
         * 
         */
        public Builder sslClientCertificate(String sslClientCertificate) {
            return sslClientCertificate(Output.of(sslClientCertificate));
        }

        /**
         * @param sslClientKey Client key. Example: `-----BEGIN PRIVATE KEY-----
         * ...
         * -----END PRIVATE KEY-----`.
         * 
         * @return builder
         * 
         */
        public Builder sslClientKey(@Nullable Output<String> sslClientKey) {
            $.sslClientKey = sslClientKey;
            return this;
        }

        /**
         * @param sslClientKey Client key. Example: `-----BEGIN PRIVATE KEY-----
         * ...
         * -----END PRIVATE KEY-----`.
         * 
         * @return builder
         * 
         */
        public Builder sslClientKey(String sslClientKey) {
            return sslClientKey(Output.of(sslClientKey));
        }

        /**
         * @param sslMode Enum: `allow`, `disable`, `prefer`, `require`, `verify-ca`, `verify-full`. SSL mode to use for the connection.  Please note that Aiven requires TLS for all connections to external PostgreSQL services. Default: `verify-full`.
         * 
         * @return builder
         * 
         */
        public Builder sslMode(@Nullable Output<String> sslMode) {
            $.sslMode = sslMode;
            return this;
        }

        /**
         * @param sslMode Enum: `allow`, `disable`, `prefer`, `require`, `verify-ca`, `verify-full`. SSL mode to use for the connection.  Please note that Aiven requires TLS for all connections to external PostgreSQL services. Default: `verify-full`.
         * 
         * @return builder
         * 
         */
        public Builder sslMode(String sslMode) {
            return sslMode(Output.of(sslMode));
        }

        /**
         * @param sslRootCert SSL Root Cert. Example: `-----BEGIN CERTIFICATE-----
         * ...
         * -----END CERTIFICATE-----
         * `.
         * 
         * @return builder
         * 
         */
        public Builder sslRootCert(@Nullable Output<String> sslRootCert) {
            $.sslRootCert = sslRootCert;
            return this;
        }

        /**
         * @param sslRootCert SSL Root Cert. Example: `-----BEGIN CERTIFICATE-----
         * ...
         * -----END CERTIFICATE-----
         * `.
         * 
         * @return builder
         * 
         */
        public Builder sslRootCert(String sslRootCert) {
            return sslRootCert(Output.of(sslRootCert));
        }

        /**
         * @param username User name. Example: `myname`.
         * 
         * @return builder
         * 
         */
        public Builder username(Output<String> username) {
            $.username = username;
            return this;
        }

        /**
         * @param username User name. Example: `myname`.
         * 
         * @return builder
         * 
         */
        public Builder username(String username) {
            return username(Output.of(username));
        }

        public ServiceIntegrationEndpointExternalPostgresqlArgs build() {
            if ($.host == null) {
                throw new MissingRequiredPropertyException("ServiceIntegrationEndpointExternalPostgresqlArgs", "host");
            }
            if ($.port == null) {
                throw new MissingRequiredPropertyException("ServiceIntegrationEndpointExternalPostgresqlArgs", "port");
            }
            if ($.username == null) {
                throw new MissingRequiredPropertyException("ServiceIntegrationEndpointExternalPostgresqlArgs", "username");
            }
            return $;
        }
    }

}
