// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aiven.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AlloydbomniAlloydbomniParam {
    /**
     * @return Primary AlloyDB Omni database name.
     * 
     */
    private @Nullable String databaseName;
    /**
     * @return AlloyDB Omni host IP or name.
     * 
     */
    private @Nullable String host;
    /**
     * @return AlloyDB Omni admin user password.
     * 
     */
    private @Nullable String password;
    /**
     * @return AlloyDB Omni port.
     * 
     */
    private @Nullable Integer port;
    /**
     * @return AlloyDB Omni SSL mode setting.
     * 
     */
    private @Nullable String sslmode;
    /**
     * @return AlloyDB Omni admin user name.
     * 
     */
    private @Nullable String user;

    private AlloydbomniAlloydbomniParam() {}
    /**
     * @return Primary AlloyDB Omni database name.
     * 
     */
    public Optional<String> databaseName() {
        return Optional.ofNullable(this.databaseName);
    }
    /**
     * @return AlloyDB Omni host IP or name.
     * 
     */
    public Optional<String> host() {
        return Optional.ofNullable(this.host);
    }
    /**
     * @return AlloyDB Omni admin user password.
     * 
     */
    public Optional<String> password() {
        return Optional.ofNullable(this.password);
    }
    /**
     * @return AlloyDB Omni port.
     * 
     */
    public Optional<Integer> port() {
        return Optional.ofNullable(this.port);
    }
    /**
     * @return AlloyDB Omni SSL mode setting.
     * 
     */
    public Optional<String> sslmode() {
        return Optional.ofNullable(this.sslmode);
    }
    /**
     * @return AlloyDB Omni admin user name.
     * 
     */
    public Optional<String> user() {
        return Optional.ofNullable(this.user);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AlloydbomniAlloydbomniParam defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String databaseName;
        private @Nullable String host;
        private @Nullable String password;
        private @Nullable Integer port;
        private @Nullable String sslmode;
        private @Nullable String user;
        public Builder() {}
        public Builder(AlloydbomniAlloydbomniParam defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.databaseName = defaults.databaseName;
    	      this.host = defaults.host;
    	      this.password = defaults.password;
    	      this.port = defaults.port;
    	      this.sslmode = defaults.sslmode;
    	      this.user = defaults.user;
        }

        @CustomType.Setter
        public Builder databaseName(@Nullable String databaseName) {

            this.databaseName = databaseName;
            return this;
        }
        @CustomType.Setter
        public Builder host(@Nullable String host) {

            this.host = host;
            return this;
        }
        @CustomType.Setter
        public Builder password(@Nullable String password) {

            this.password = password;
            return this;
        }
        @CustomType.Setter
        public Builder port(@Nullable Integer port) {

            this.port = port;
            return this;
        }
        @CustomType.Setter
        public Builder sslmode(@Nullable String sslmode) {

            this.sslmode = sslmode;
            return this;
        }
        @CustomType.Setter
        public Builder user(@Nullable String user) {

            this.user = user;
            return this;
        }
        public AlloydbomniAlloydbomniParam build() {
            final var _resultValue = new AlloydbomniAlloydbomniParam();
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
