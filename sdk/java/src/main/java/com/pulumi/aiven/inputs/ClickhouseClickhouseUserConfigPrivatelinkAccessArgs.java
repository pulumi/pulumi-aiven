// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aiven.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClickhouseClickhouseUserConfigPrivatelinkAccessArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClickhouseClickhouseUserConfigPrivatelinkAccessArgs Empty = new ClickhouseClickhouseUserConfigPrivatelinkAccessArgs();

    /**
     * Enable clickhouse.
     * 
     */
    @Import(name="clickhouse")
    private @Nullable Output<Boolean> clickhouse;

    /**
     * @return Enable clickhouse.
     * 
     */
    public Optional<Output<Boolean>> clickhouse() {
        return Optional.ofNullable(this.clickhouse);
    }

    /**
     * Enable clickhouse_https.
     * 
     */
    @Import(name="clickhouseHttps")
    private @Nullable Output<Boolean> clickhouseHttps;

    /**
     * @return Enable clickhouse_https.
     * 
     */
    public Optional<Output<Boolean>> clickhouseHttps() {
        return Optional.ofNullable(this.clickhouseHttps);
    }

    /**
     * Enable clickhouse_mysql.
     * 
     */
    @Import(name="clickhouseMysql")
    private @Nullable Output<Boolean> clickhouseMysql;

    /**
     * @return Enable clickhouse_mysql.
     * 
     */
    public Optional<Output<Boolean>> clickhouseMysql() {
        return Optional.ofNullable(this.clickhouseMysql);
    }

    /**
     * Enable prometheus.
     * 
     */
    @Import(name="prometheus")
    private @Nullable Output<Boolean> prometheus;

    /**
     * @return Enable prometheus.
     * 
     */
    public Optional<Output<Boolean>> prometheus() {
        return Optional.ofNullable(this.prometheus);
    }

    private ClickhouseClickhouseUserConfigPrivatelinkAccessArgs() {}

    private ClickhouseClickhouseUserConfigPrivatelinkAccessArgs(ClickhouseClickhouseUserConfigPrivatelinkAccessArgs $) {
        this.clickhouse = $.clickhouse;
        this.clickhouseHttps = $.clickhouseHttps;
        this.clickhouseMysql = $.clickhouseMysql;
        this.prometheus = $.prometheus;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClickhouseClickhouseUserConfigPrivatelinkAccessArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClickhouseClickhouseUserConfigPrivatelinkAccessArgs $;

        public Builder() {
            $ = new ClickhouseClickhouseUserConfigPrivatelinkAccessArgs();
        }

        public Builder(ClickhouseClickhouseUserConfigPrivatelinkAccessArgs defaults) {
            $ = new ClickhouseClickhouseUserConfigPrivatelinkAccessArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param clickhouse Enable clickhouse.
         * 
         * @return builder
         * 
         */
        public Builder clickhouse(@Nullable Output<Boolean> clickhouse) {
            $.clickhouse = clickhouse;
            return this;
        }

        /**
         * @param clickhouse Enable clickhouse.
         * 
         * @return builder
         * 
         */
        public Builder clickhouse(Boolean clickhouse) {
            return clickhouse(Output.of(clickhouse));
        }

        /**
         * @param clickhouseHttps Enable clickhouse_https.
         * 
         * @return builder
         * 
         */
        public Builder clickhouseHttps(@Nullable Output<Boolean> clickhouseHttps) {
            $.clickhouseHttps = clickhouseHttps;
            return this;
        }

        /**
         * @param clickhouseHttps Enable clickhouse_https.
         * 
         * @return builder
         * 
         */
        public Builder clickhouseHttps(Boolean clickhouseHttps) {
            return clickhouseHttps(Output.of(clickhouseHttps));
        }

        /**
         * @param clickhouseMysql Enable clickhouse_mysql.
         * 
         * @return builder
         * 
         */
        public Builder clickhouseMysql(@Nullable Output<Boolean> clickhouseMysql) {
            $.clickhouseMysql = clickhouseMysql;
            return this;
        }

        /**
         * @param clickhouseMysql Enable clickhouse_mysql.
         * 
         * @return builder
         * 
         */
        public Builder clickhouseMysql(Boolean clickhouseMysql) {
            return clickhouseMysql(Output.of(clickhouseMysql));
        }

        /**
         * @param prometheus Enable prometheus.
         * 
         * @return builder
         * 
         */
        public Builder prometheus(@Nullable Output<Boolean> prometheus) {
            $.prometheus = prometheus;
            return this;
        }

        /**
         * @param prometheus Enable prometheus.
         * 
         * @return builder
         * 
         */
        public Builder prometheus(Boolean prometheus) {
            return prometheus(Output.of(prometheus));
        }

        public ClickhouseClickhouseUserConfigPrivatelinkAccessArgs build() {
            return $;
        }
    }

}