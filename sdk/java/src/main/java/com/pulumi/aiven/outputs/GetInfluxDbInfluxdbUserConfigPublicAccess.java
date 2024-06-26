// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aiven.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetInfluxDbInfluxdbUserConfigPublicAccess {
    /**
     * @return Allow clients to connect to influxdb from the public internet for service nodes that are in a project VPC or another type of private network.
     * 
     */
    private @Nullable Boolean influxdb;

    private GetInfluxDbInfluxdbUserConfigPublicAccess() {}
    /**
     * @return Allow clients to connect to influxdb from the public internet for service nodes that are in a project VPC or another type of private network.
     * 
     */
    public Optional<Boolean> influxdb() {
        return Optional.ofNullable(this.influxdb);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInfluxDbInfluxdbUserConfigPublicAccess defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean influxdb;
        public Builder() {}
        public Builder(GetInfluxDbInfluxdbUserConfigPublicAccess defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.influxdb = defaults.influxdb;
        }

        @CustomType.Setter
        public Builder influxdb(@Nullable Boolean influxdb) {

            this.influxdb = influxdb;
            return this;
        }
        public GetInfluxDbInfluxdbUserConfigPublicAccess build() {
            final var _resultValue = new GetInfluxDbInfluxdbUserConfigPublicAccess();
            _resultValue.influxdb = influxdb;
            return _resultValue;
        }
    }
}
