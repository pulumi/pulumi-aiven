// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aiven.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetValkeyValkeyUserConfigPrivatelinkAccess {
    /**
     * @return Enable prometheus.
     * 
     */
    private @Nullable Boolean prometheus;
    /**
     * @return Enable valkey.
     * 
     */
    private @Nullable Boolean valkey;

    private GetValkeyValkeyUserConfigPrivatelinkAccess() {}
    /**
     * @return Enable prometheus.
     * 
     */
    public Optional<Boolean> prometheus() {
        return Optional.ofNullable(this.prometheus);
    }
    /**
     * @return Enable valkey.
     * 
     */
    public Optional<Boolean> valkey() {
        return Optional.ofNullable(this.valkey);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetValkeyValkeyUserConfigPrivatelinkAccess defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean prometheus;
        private @Nullable Boolean valkey;
        public Builder() {}
        public Builder(GetValkeyValkeyUserConfigPrivatelinkAccess defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.prometheus = defaults.prometheus;
    	      this.valkey = defaults.valkey;
        }

        @CustomType.Setter
        public Builder prometheus(@Nullable Boolean prometheus) {

            this.prometheus = prometheus;
            return this;
        }
        @CustomType.Setter
        public Builder valkey(@Nullable Boolean valkey) {

            this.valkey = valkey;
            return this;
        }
        public GetValkeyValkeyUserConfigPrivatelinkAccess build() {
            final var _resultValue = new GetValkeyValkeyUserConfigPrivatelinkAccess();
            _resultValue.prometheus = prometheus;
            _resultValue.valkey = valkey;
            return _resultValue;
        }
    }
}