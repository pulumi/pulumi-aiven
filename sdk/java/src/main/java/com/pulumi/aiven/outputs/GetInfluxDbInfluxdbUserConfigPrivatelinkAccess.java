// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aiven.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetInfluxDbInfluxdbUserConfigPrivatelinkAccess {
    /**
     * @return InfluxDB server provided values
     * 
     */
    private @Nullable String influxdb;

    private GetInfluxDbInfluxdbUserConfigPrivatelinkAccess() {}
    /**
     * @return InfluxDB server provided values
     * 
     */
    public Optional<String> influxdb() {
        return Optional.ofNullable(this.influxdb);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInfluxDbInfluxdbUserConfigPrivatelinkAccess defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String influxdb;
        public Builder() {}
        public Builder(GetInfluxDbInfluxdbUserConfigPrivatelinkAccess defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.influxdb = defaults.influxdb;
        }

        @CustomType.Setter
        public Builder influxdb(@Nullable String influxdb) {
            this.influxdb = influxdb;
            return this;
        }
        public GetInfluxDbInfluxdbUserConfigPrivatelinkAccess build() {
            final var o = new GetInfluxDbInfluxdbUserConfigPrivatelinkAccess();
            o.influxdb = influxdb;
            return o;
        }
    }
}