// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aiven.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class M3DbM3dbUserConfigPublicAccess {
    private @Nullable String m3coordinator;

    private M3DbM3dbUserConfigPublicAccess() {}
    public Optional<String> m3coordinator() {
        return Optional.ofNullable(this.m3coordinator);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(M3DbM3dbUserConfigPublicAccess defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String m3coordinator;
        public Builder() {}
        public Builder(M3DbM3dbUserConfigPublicAccess defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.m3coordinator = defaults.m3coordinator;
        }

        @CustomType.Setter
        public Builder m3coordinator(@Nullable String m3coordinator) {
            this.m3coordinator = m3coordinator;
            return this;
        }
        public M3DbM3dbUserConfigPublicAccess build() {
            final var o = new M3DbM3dbUserConfigPublicAccess();
            o.m3coordinator = m3coordinator;
            return o;
        }
    }
}