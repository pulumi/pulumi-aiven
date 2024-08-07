// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aiven.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClickhouseClickhouseUserConfigPrivateAccess {
    /**
     * @return Allow clients to connect to clickhouse with a DNS name that always resolves to the service&#39;s private IP addresses. Only available in certain network locations.
     * 
     */
    private @Nullable Boolean clickhouse;
    /**
     * @return Allow clients to connect to clickhouse_https with a DNS name that always resolves to the service&#39;s private IP addresses. Only available in certain network locations.
     * 
     */
    private @Nullable Boolean clickhouseHttps;
    /**
     * @return Allow clients to connect to clickhouse_mysql with a DNS name that always resolves to the service&#39;s private IP addresses. Only available in certain network locations.
     * 
     */
    private @Nullable Boolean clickhouseMysql;
    /**
     * @return Allow clients to connect to prometheus with a DNS name that always resolves to the service&#39;s private IP addresses. Only available in certain network locations.
     * 
     */
    private @Nullable Boolean prometheus;

    private ClickhouseClickhouseUserConfigPrivateAccess() {}
    /**
     * @return Allow clients to connect to clickhouse with a DNS name that always resolves to the service&#39;s private IP addresses. Only available in certain network locations.
     * 
     */
    public Optional<Boolean> clickhouse() {
        return Optional.ofNullable(this.clickhouse);
    }
    /**
     * @return Allow clients to connect to clickhouse_https with a DNS name that always resolves to the service&#39;s private IP addresses. Only available in certain network locations.
     * 
     */
    public Optional<Boolean> clickhouseHttps() {
        return Optional.ofNullable(this.clickhouseHttps);
    }
    /**
     * @return Allow clients to connect to clickhouse_mysql with a DNS name that always resolves to the service&#39;s private IP addresses. Only available in certain network locations.
     * 
     */
    public Optional<Boolean> clickhouseMysql() {
        return Optional.ofNullable(this.clickhouseMysql);
    }
    /**
     * @return Allow clients to connect to prometheus with a DNS name that always resolves to the service&#39;s private IP addresses. Only available in certain network locations.
     * 
     */
    public Optional<Boolean> prometheus() {
        return Optional.ofNullable(this.prometheus);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClickhouseClickhouseUserConfigPrivateAccess defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean clickhouse;
        private @Nullable Boolean clickhouseHttps;
        private @Nullable Boolean clickhouseMysql;
        private @Nullable Boolean prometheus;
        public Builder() {}
        public Builder(ClickhouseClickhouseUserConfigPrivateAccess defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clickhouse = defaults.clickhouse;
    	      this.clickhouseHttps = defaults.clickhouseHttps;
    	      this.clickhouseMysql = defaults.clickhouseMysql;
    	      this.prometheus = defaults.prometheus;
        }

        @CustomType.Setter
        public Builder clickhouse(@Nullable Boolean clickhouse) {

            this.clickhouse = clickhouse;
            return this;
        }
        @CustomType.Setter
        public Builder clickhouseHttps(@Nullable Boolean clickhouseHttps) {

            this.clickhouseHttps = clickhouseHttps;
            return this;
        }
        @CustomType.Setter
        public Builder clickhouseMysql(@Nullable Boolean clickhouseMysql) {

            this.clickhouseMysql = clickhouseMysql;
            return this;
        }
        @CustomType.Setter
        public Builder prometheus(@Nullable Boolean prometheus) {

            this.prometheus = prometheus;
            return this;
        }
        public ClickhouseClickhouseUserConfigPrivateAccess build() {
            final var _resultValue = new ClickhouseClickhouseUserConfigPrivateAccess();
            _resultValue.clickhouse = clickhouse;
            _resultValue.clickhouseHttps = clickhouseHttps;
            _resultValue.clickhouseMysql = clickhouseMysql;
            _resultValue.prometheus = prometheus;
            return _resultValue;
        }
    }
}
