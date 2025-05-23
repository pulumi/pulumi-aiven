// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aiven.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class MySqlMysqlParamArgs extends com.pulumi.resources.ResourceArgs {

    public static final MySqlMysqlParamArgs Empty = new MySqlMysqlParamArgs();

    /**
     * Thr name of the primary MySQL database.
     * 
     */
    @Import(name="databaseName")
    private @Nullable Output<String> databaseName;

    /**
     * @return Thr name of the primary MySQL database.
     * 
     */
    public Optional<Output<String>> databaseName() {
        return Optional.ofNullable(this.databaseName);
    }

    /**
     * MySQL host IP or name.
     * 
     */
    @Import(name="host")
    private @Nullable Output<String> host;

    /**
     * @return MySQL host IP or name.
     * 
     */
    public Optional<Output<String>> host() {
        return Optional.ofNullable(this.host);
    }

    /**
     * The password for the admin service user.
     * 
     */
    @Import(name="password")
    private @Nullable Output<String> password;

    /**
     * @return The password for the admin service user.
     * 
     */
    public Optional<Output<String>> password() {
        return Optional.ofNullable(this.password);
    }

    /**
     * MySQL port.
     * 
     */
    @Import(name="port")
    private @Nullable Output<Integer> port;

    /**
     * @return MySQL port.
     * 
     */
    public Optional<Output<Integer>> port() {
        return Optional.ofNullable(this.port);
    }

    /**
     * MySQL SSL mode setting. Always set to &#34;require&#34;.
     * 
     */
    @Import(name="sslmode")
    private @Nullable Output<String> sslmode;

    /**
     * @return MySQL SSL mode setting. Always set to &#34;require&#34;.
     * 
     */
    public Optional<Output<String>> sslmode() {
        return Optional.ofNullable(this.sslmode);
    }

    /**
     * The username for the admin service user.
     * 
     */
    @Import(name="user")
    private @Nullable Output<String> user;

    /**
     * @return The username for the admin service user.
     * 
     */
    public Optional<Output<String>> user() {
        return Optional.ofNullable(this.user);
    }

    private MySqlMysqlParamArgs() {}

    private MySqlMysqlParamArgs(MySqlMysqlParamArgs $) {
        this.databaseName = $.databaseName;
        this.host = $.host;
        this.password = $.password;
        this.port = $.port;
        this.sslmode = $.sslmode;
        this.user = $.user;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MySqlMysqlParamArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MySqlMysqlParamArgs $;

        public Builder() {
            $ = new MySqlMysqlParamArgs();
        }

        public Builder(MySqlMysqlParamArgs defaults) {
            $ = new MySqlMysqlParamArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param databaseName Thr name of the primary MySQL database.
         * 
         * @return builder
         * 
         */
        public Builder databaseName(@Nullable Output<String> databaseName) {
            $.databaseName = databaseName;
            return this;
        }

        /**
         * @param databaseName Thr name of the primary MySQL database.
         * 
         * @return builder
         * 
         */
        public Builder databaseName(String databaseName) {
            return databaseName(Output.of(databaseName));
        }

        /**
         * @param host MySQL host IP or name.
         * 
         * @return builder
         * 
         */
        public Builder host(@Nullable Output<String> host) {
            $.host = host;
            return this;
        }

        /**
         * @param host MySQL host IP or name.
         * 
         * @return builder
         * 
         */
        public Builder host(String host) {
            return host(Output.of(host));
        }

        /**
         * @param password The password for the admin service user.
         * 
         * @return builder
         * 
         */
        public Builder password(@Nullable Output<String> password) {
            $.password = password;
            return this;
        }

        /**
         * @param password The password for the admin service user.
         * 
         * @return builder
         * 
         */
        public Builder password(String password) {
            return password(Output.of(password));
        }

        /**
         * @param port MySQL port.
         * 
         * @return builder
         * 
         */
        public Builder port(@Nullable Output<Integer> port) {
            $.port = port;
            return this;
        }

        /**
         * @param port MySQL port.
         * 
         * @return builder
         * 
         */
        public Builder port(Integer port) {
            return port(Output.of(port));
        }

        /**
         * @param sslmode MySQL SSL mode setting. Always set to &#34;require&#34;.
         * 
         * @return builder
         * 
         */
        public Builder sslmode(@Nullable Output<String> sslmode) {
            $.sslmode = sslmode;
            return this;
        }

        /**
         * @param sslmode MySQL SSL mode setting. Always set to &#34;require&#34;.
         * 
         * @return builder
         * 
         */
        public Builder sslmode(String sslmode) {
            return sslmode(Output.of(sslmode));
        }

        /**
         * @param user The username for the admin service user.
         * 
         * @return builder
         * 
         */
        public Builder user(@Nullable Output<String> user) {
            $.user = user;
            return this;
        }

        /**
         * @param user The username for the admin service user.
         * 
         * @return builder
         * 
         */
        public Builder user(String user) {
            return user(Output.of(user));
        }

        public MySqlMysqlParamArgs build() {
            return $;
        }
    }

}
