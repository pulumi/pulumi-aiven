// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aiven.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetMySqlMysqlParam {
    /**
     * @return Primary MySQL database name
     * 
     */
    private String databaseName;
    /**
     * @return MySQL host IP or name
     * 
     */
    private String host;
    /**
     * @return MySQL admin user password
     * 
     */
    private String password;
    /**
     * @return MySQL port
     * 
     */
    private Integer port;
    /**
     * @return MySQL sslmode setting (currently always &#34;require&#34;)
     * 
     */
    private String sslmode;
    /**
     * @return MySQL admin user name
     * 
     */
    private String user;

    private GetMySqlMysqlParam() {}
    /**
     * @return Primary MySQL database name
     * 
     */
    public String databaseName() {
        return this.databaseName;
    }
    /**
     * @return MySQL host IP or name
     * 
     */
    public String host() {
        return this.host;
    }
    /**
     * @return MySQL admin user password
     * 
     */
    public String password() {
        return this.password;
    }
    /**
     * @return MySQL port
     * 
     */
    public Integer port() {
        return this.port;
    }
    /**
     * @return MySQL sslmode setting (currently always &#34;require&#34;)
     * 
     */
    public String sslmode() {
        return this.sslmode;
    }
    /**
     * @return MySQL admin user name
     * 
     */
    public String user() {
        return this.user;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetMySqlMysqlParam defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String databaseName;
        private String host;
        private String password;
        private Integer port;
        private String sslmode;
        private String user;
        public Builder() {}
        public Builder(GetMySqlMysqlParam defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.databaseName = defaults.databaseName;
    	      this.host = defaults.host;
    	      this.password = defaults.password;
    	      this.port = defaults.port;
    	      this.sslmode = defaults.sslmode;
    	      this.user = defaults.user;
        }

        @CustomType.Setter
        public Builder databaseName(String databaseName) {
            if (databaseName == null) {
              throw new MissingRequiredPropertyException("GetMySqlMysqlParam", "databaseName");
            }
            this.databaseName = databaseName;
            return this;
        }
        @CustomType.Setter
        public Builder host(String host) {
            if (host == null) {
              throw new MissingRequiredPropertyException("GetMySqlMysqlParam", "host");
            }
            this.host = host;
            return this;
        }
        @CustomType.Setter
        public Builder password(String password) {
            if (password == null) {
              throw new MissingRequiredPropertyException("GetMySqlMysqlParam", "password");
            }
            this.password = password;
            return this;
        }
        @CustomType.Setter
        public Builder port(Integer port) {
            if (port == null) {
              throw new MissingRequiredPropertyException("GetMySqlMysqlParam", "port");
            }
            this.port = port;
            return this;
        }
        @CustomType.Setter
        public Builder sslmode(String sslmode) {
            if (sslmode == null) {
              throw new MissingRequiredPropertyException("GetMySqlMysqlParam", "sslmode");
            }
            this.sslmode = sslmode;
            return this;
        }
        @CustomType.Setter
        public Builder user(String user) {
            if (user == null) {
              throw new MissingRequiredPropertyException("GetMySqlMysqlParam", "user");
            }
            this.user = user;
            return this;
        }
        public GetMySqlMysqlParam build() {
            final var _resultValue = new GetMySqlMysqlParam();
            _resultValue.databaseName = databaseName;
            _resultValue.host = host;
            _resultValue.password = password;
            _resultValue.port = port;
            _resultValue.sslmode = sslmode;
            _resultValue.user = user;
            return _resultValue;
        }
    }
}