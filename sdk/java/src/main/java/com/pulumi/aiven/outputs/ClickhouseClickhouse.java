// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aiven.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class ClickhouseClickhouse {
    /**
     * @return Clickhouse server URIs.
     * 
     */
    private @Nullable List<String> uris;

    private ClickhouseClickhouse() {}
    /**
     * @return Clickhouse server URIs.
     * 
     */
    public List<String> uris() {
        return this.uris == null ? List.of() : this.uris;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClickhouseClickhouse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> uris;
        public Builder() {}
        public Builder(ClickhouseClickhouse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.uris = defaults.uris;
        }

        @CustomType.Setter
        public Builder uris(@Nullable List<String> uris) {

            this.uris = uris;
            return this;
        }
        public Builder uris(String... uris) {
            return uris(List.of(uris));
        }
        public ClickhouseClickhouse build() {
            final var _resultValue = new ClickhouseClickhouse();
            _resultValue.uris = uris;
            return _resultValue;
        }
    }
}