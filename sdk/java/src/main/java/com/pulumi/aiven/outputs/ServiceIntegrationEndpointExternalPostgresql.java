// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aiven.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ServiceIntegrationEndpointExternalPostgresql {
    /**
     * @return Default database.
     * 
     */
    private @Nullable String defaultDatabase;
    /**
     * @return Hostname or IP address of the server.
     * 
     */
    private String host;
    /**
     * @return Password.
     * 
     */
    private @Nullable String password;
    /**
     * @return Port number of the server.
     * 
     */
    private Integer port;
    /**
     * @return Client certificate.
     * 
     */
    private @Nullable String sslClientCertificate;
    /**
     * @return Client key.
     * 
     */
    private @Nullable String sslClientKey;
    /**
     * @return SSL Mode. The default value is `verify-full`.
     * 
     */
    private @Nullable String sslMode;
    /**
     * @return SSL Root Cert.
     * 
     */
    private @Nullable String sslRootCert;
    /**
     * @return User name.
     * 
     */
    private String username;

    private ServiceIntegrationEndpointExternalPostgresql() {}
    /**
     * @return Default database.
     * 
     */
    public Optional<String> defaultDatabase() {
        return Optional.ofNullable(this.defaultDatabase);
    }
    /**
     * @return Hostname or IP address of the server.
     * 
     */
    public String host() {
        return this.host;
    }
    /**
     * @return Password.
     * 
     */
    public Optional<String> password() {
        return Optional.ofNullable(this.password);
    }
    /**
     * @return Port number of the server.
     * 
     */
    public Integer port() {
        return this.port;
    }
    /**
     * @return Client certificate.
     * 
     */
    public Optional<String> sslClientCertificate() {
        return Optional.ofNullable(this.sslClientCertificate);
    }
    /**
     * @return Client key.
     * 
     */
    public Optional<String> sslClientKey() {
        return Optional.ofNullable(this.sslClientKey);
    }
    /**
     * @return SSL Mode. The default value is `verify-full`.
     * 
     */
    public Optional<String> sslMode() {
        return Optional.ofNullable(this.sslMode);
    }
    /**
     * @return SSL Root Cert.
     * 
     */
    public Optional<String> sslRootCert() {
        return Optional.ofNullable(this.sslRootCert);
    }
    /**
     * @return User name.
     * 
     */
    public String username() {
        return this.username;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceIntegrationEndpointExternalPostgresql defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String defaultDatabase;
        private String host;
        private @Nullable String password;
        private Integer port;
        private @Nullable String sslClientCertificate;
        private @Nullable String sslClientKey;
        private @Nullable String sslMode;
        private @Nullable String sslRootCert;
        private String username;
        public Builder() {}
        public Builder(ServiceIntegrationEndpointExternalPostgresql defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultDatabase = defaults.defaultDatabase;
    	      this.host = defaults.host;
    	      this.password = defaults.password;
    	      this.port = defaults.port;
    	      this.sslClientCertificate = defaults.sslClientCertificate;
    	      this.sslClientKey = defaults.sslClientKey;
    	      this.sslMode = defaults.sslMode;
    	      this.sslRootCert = defaults.sslRootCert;
    	      this.username = defaults.username;
        }

        @CustomType.Setter
        public Builder defaultDatabase(@Nullable String defaultDatabase) {

            this.defaultDatabase = defaultDatabase;
            return this;
        }
        @CustomType.Setter
        public Builder host(String host) {
            if (host == null) {
              throw new MissingRequiredPropertyException("ServiceIntegrationEndpointExternalPostgresql", "host");
            }
            this.host = host;
            return this;
        }
        @CustomType.Setter
        public Builder password(@Nullable String password) {

            this.password = password;
            return this;
        }
        @CustomType.Setter
        public Builder port(Integer port) {
            if (port == null) {
              throw new MissingRequiredPropertyException("ServiceIntegrationEndpointExternalPostgresql", "port");
            }
            this.port = port;
            return this;
        }
        @CustomType.Setter
        public Builder sslClientCertificate(@Nullable String sslClientCertificate) {

            this.sslClientCertificate = sslClientCertificate;
            return this;
        }
        @CustomType.Setter
        public Builder sslClientKey(@Nullable String sslClientKey) {

            this.sslClientKey = sslClientKey;
            return this;
        }
        @CustomType.Setter
        public Builder sslMode(@Nullable String sslMode) {

            this.sslMode = sslMode;
            return this;
        }
        @CustomType.Setter
        public Builder sslRootCert(@Nullable String sslRootCert) {

            this.sslRootCert = sslRootCert;
            return this;
        }
        @CustomType.Setter
        public Builder username(String username) {
            if (username == null) {
              throw new MissingRequiredPropertyException("ServiceIntegrationEndpointExternalPostgresql", "username");
            }
            this.username = username;
            return this;
        }
        public ServiceIntegrationEndpointExternalPostgresql build() {
            final var _resultValue = new ServiceIntegrationEndpointExternalPostgresql();
            _resultValue.defaultDatabase = defaultDatabase;
            _resultValue.host = host;
            _resultValue.password = password;
            _resultValue.port = port;
            _resultValue.sslClientCertificate = sslClientCertificate;
            _resultValue.sslClientKey = sslClientKey;
            _resultValue.sslMode = sslMode;
            _resultValue.sslRootCert = sslRootCert;
            _resultValue.username = username;
            return _resultValue;
        }
    }
}
