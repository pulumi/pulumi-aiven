// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aiven.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ValkeyValkeyUserConfigMigration {
    /**
     * @return Database name for bootstrapping the initial connection. Example: `defaultdb`.
     * 
     */
    private @Nullable String dbname;
    /**
     * @return Hostname or IP address of the server where to migrate data from. Example: `my.server.com`.
     * 
     */
    private String host;
    /**
     * @return Comma-separated list of databases, which should be ignored during migration (supported by MySQL and PostgreSQL only at the moment). Example: `db1,db2`.
     * 
     */
    private @Nullable String ignoreDbs;
    /**
     * @return Enum: `dump`, `replication`. The migration method to be used (currently supported only by Redis, Dragonfly, MySQL and PostgreSQL service types).
     * 
     */
    private @Nullable String method;
    /**
     * @return Password for authentication with the server where to migrate data from. Example: `jjKk45Nnd`.
     * 
     */
    private @Nullable String password;
    /**
     * @return Port number of the server where to migrate data from. Example: `1234`.
     * 
     */
    private Integer port;
    /**
     * @return The server where to migrate data from is secured with SSL. Default: `true`.
     * 
     */
    private @Nullable Boolean ssl;
    /**
     * @return User name for authentication with the server where to migrate data from. Example: `myname`.
     * 
     */
    private @Nullable String username;

    private ValkeyValkeyUserConfigMigration() {}
    /**
     * @return Database name for bootstrapping the initial connection. Example: `defaultdb`.
     * 
     */
    public Optional<String> dbname() {
        return Optional.ofNullable(this.dbname);
    }
    /**
     * @return Hostname or IP address of the server where to migrate data from. Example: `my.server.com`.
     * 
     */
    public String host() {
        return this.host;
    }
    /**
     * @return Comma-separated list of databases, which should be ignored during migration (supported by MySQL and PostgreSQL only at the moment). Example: `db1,db2`.
     * 
     */
    public Optional<String> ignoreDbs() {
        return Optional.ofNullable(this.ignoreDbs);
    }
    /**
     * @return Enum: `dump`, `replication`. The migration method to be used (currently supported only by Redis, Dragonfly, MySQL and PostgreSQL service types).
     * 
     */
    public Optional<String> method() {
        return Optional.ofNullable(this.method);
    }
    /**
     * @return Password for authentication with the server where to migrate data from. Example: `jjKk45Nnd`.
     * 
     */
    public Optional<String> password() {
        return Optional.ofNullable(this.password);
    }
    /**
     * @return Port number of the server where to migrate data from. Example: `1234`.
     * 
     */
    public Integer port() {
        return this.port;
    }
    /**
     * @return The server where to migrate data from is secured with SSL. Default: `true`.
     * 
     */
    public Optional<Boolean> ssl() {
        return Optional.ofNullable(this.ssl);
    }
    /**
     * @return User name for authentication with the server where to migrate data from. Example: `myname`.
     * 
     */
    public Optional<String> username() {
        return Optional.ofNullable(this.username);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ValkeyValkeyUserConfigMigration defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String dbname;
        private String host;
        private @Nullable String ignoreDbs;
        private @Nullable String method;
        private @Nullable String password;
        private Integer port;
        private @Nullable Boolean ssl;
        private @Nullable String username;
        public Builder() {}
        public Builder(ValkeyValkeyUserConfigMigration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dbname = defaults.dbname;
    	      this.host = defaults.host;
    	      this.ignoreDbs = defaults.ignoreDbs;
    	      this.method = defaults.method;
    	      this.password = defaults.password;
    	      this.port = defaults.port;
    	      this.ssl = defaults.ssl;
    	      this.username = defaults.username;
        }

        @CustomType.Setter
        public Builder dbname(@Nullable String dbname) {

            this.dbname = dbname;
            return this;
        }
        @CustomType.Setter
        public Builder host(String host) {
            if (host == null) {
              throw new MissingRequiredPropertyException("ValkeyValkeyUserConfigMigration", "host");
            }
            this.host = host;
            return this;
        }
        @CustomType.Setter
        public Builder ignoreDbs(@Nullable String ignoreDbs) {

            this.ignoreDbs = ignoreDbs;
            return this;
        }
        @CustomType.Setter
        public Builder method(@Nullable String method) {

            this.method = method;
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
              throw new MissingRequiredPropertyException("ValkeyValkeyUserConfigMigration", "port");
            }
            this.port = port;
            return this;
        }
        @CustomType.Setter
        public Builder ssl(@Nullable Boolean ssl) {

            this.ssl = ssl;
            return this;
        }
        @CustomType.Setter
        public Builder username(@Nullable String username) {

            this.username = username;
            return this;
        }
        public ValkeyValkeyUserConfigMigration build() {
            final var _resultValue = new ValkeyValkeyUserConfigMigration();
            _resultValue.dbname = dbname;
            _resultValue.host = host;
            _resultValue.ignoreDbs = ignoreDbs;
            _resultValue.method = method;
            _resultValue.password = password;
            _resultValue.port = port;
            _resultValue.ssl = ssl;
            _resultValue.username = username;
            return _resultValue;
        }
    }
}