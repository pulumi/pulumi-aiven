// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aiven.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClickhouseClickhouseUserConfigPublicAccessArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClickhouseClickhouseUserConfigPublicAccessArgs Empty = new ClickhouseClickhouseUserConfigPublicAccessArgs();

    /**
     * Allow clients to connect to clickhouse from the public internet for service nodes that are in a project VPC or another type of private network.
     * 
     */
    @Import(name="clickhouse")
    private @Nullable Output<Boolean> clickhouse;

    /**
     * @return Allow clients to connect to clickhouse from the public internet for service nodes that are in a project VPC or another type of private network.
     * 
     */
    public Optional<Output<Boolean>> clickhouse() {
        return Optional.ofNullable(this.clickhouse);
    }

    /**
     * Allow clients to connect to clickhouse_https from the public internet for service nodes that are in a project VPC or another type of private network.
     * 
     */
    @Import(name="clickhouseHttps")
    private @Nullable Output<Boolean> clickhouseHttps;

    /**
     * @return Allow clients to connect to clickhouse_https from the public internet for service nodes that are in a project VPC or another type of private network.
     * 
     */
    public Optional<Output<Boolean>> clickhouseHttps() {
        return Optional.ofNullable(this.clickhouseHttps);
    }

    /**
     * Allow clients to connect to clickhouse_mysql from the public internet for service nodes that are in a project VPC or another type of private network.
     * 
     */
    @Import(name="clickhouseMysql")
    private @Nullable Output<Boolean> clickhouseMysql;

    /**
     * @return Allow clients to connect to clickhouse_mysql from the public internet for service nodes that are in a project VPC or another type of private network.
     * 
     */
    public Optional<Output<Boolean>> clickhouseMysql() {
        return Optional.ofNullable(this.clickhouseMysql);
    }

    /**
     * Allow clients to connect to prometheus from the public internet for service nodes that are in a project VPC or another type of private network.
     * 
     */
    @Import(name="prometheus")
    private @Nullable Output<Boolean> prometheus;

    /**
     * @return Allow clients to connect to prometheus from the public internet for service nodes that are in a project VPC or another type of private network.
     * 
     */
    public Optional<Output<Boolean>> prometheus() {
        return Optional.ofNullable(this.prometheus);
    }

    private ClickhouseClickhouseUserConfigPublicAccessArgs() {}

    private ClickhouseClickhouseUserConfigPublicAccessArgs(ClickhouseClickhouseUserConfigPublicAccessArgs $) {
        this.clickhouse = $.clickhouse;
        this.clickhouseHttps = $.clickhouseHttps;
        this.clickhouseMysql = $.clickhouseMysql;
        this.prometheus = $.prometheus;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClickhouseClickhouseUserConfigPublicAccessArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClickhouseClickhouseUserConfigPublicAccessArgs $;

        public Builder() {
            $ = new ClickhouseClickhouseUserConfigPublicAccessArgs();
        }

        public Builder(ClickhouseClickhouseUserConfigPublicAccessArgs defaults) {
            $ = new ClickhouseClickhouseUserConfigPublicAccessArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param clickhouse Allow clients to connect to clickhouse from the public internet for service nodes that are in a project VPC or another type of private network.
         * 
         * @return builder
         * 
         */
        public Builder clickhouse(@Nullable Output<Boolean> clickhouse) {
            $.clickhouse = clickhouse;
            return this;
        }

        /**
         * @param clickhouse Allow clients to connect to clickhouse from the public internet for service nodes that are in a project VPC or another type of private network.
         * 
         * @return builder
         * 
         */
        public Builder clickhouse(Boolean clickhouse) {
            return clickhouse(Output.of(clickhouse));
        }

        /**
         * @param clickhouseHttps Allow clients to connect to clickhouse_https from the public internet for service nodes that are in a project VPC or another type of private network.
         * 
         * @return builder
         * 
         */
        public Builder clickhouseHttps(@Nullable Output<Boolean> clickhouseHttps) {
            $.clickhouseHttps = clickhouseHttps;
            return this;
        }

        /**
         * @param clickhouseHttps Allow clients to connect to clickhouse_https from the public internet for service nodes that are in a project VPC or another type of private network.
         * 
         * @return builder
         * 
         */
        public Builder clickhouseHttps(Boolean clickhouseHttps) {
            return clickhouseHttps(Output.of(clickhouseHttps));
        }

        /**
         * @param clickhouseMysql Allow clients to connect to clickhouse_mysql from the public internet for service nodes that are in a project VPC or another type of private network.
         * 
         * @return builder
         * 
         */
        public Builder clickhouseMysql(@Nullable Output<Boolean> clickhouseMysql) {
            $.clickhouseMysql = clickhouseMysql;
            return this;
        }

        /**
         * @param clickhouseMysql Allow clients to connect to clickhouse_mysql from the public internet for service nodes that are in a project VPC or another type of private network.
         * 
         * @return builder
         * 
         */
        public Builder clickhouseMysql(Boolean clickhouseMysql) {
            return clickhouseMysql(Output.of(clickhouseMysql));
        }

        /**
         * @param prometheus Allow clients to connect to prometheus from the public internet for service nodes that are in a project VPC or another type of private network.
         * 
         * @return builder
         * 
         */
        public Builder prometheus(@Nullable Output<Boolean> prometheus) {
            $.prometheus = prometheus;
            return this;
        }

        /**
         * @param prometheus Allow clients to connect to prometheus from the public internet for service nodes that are in a project VPC or another type of private network.
         * 
         * @return builder
         * 
         */
        public Builder prometheus(Boolean prometheus) {
            return prometheus(Output.of(prometheus));
        }

        public ClickhouseClickhouseUserConfigPublicAccessArgs build() {
            return $;
        }
    }

}