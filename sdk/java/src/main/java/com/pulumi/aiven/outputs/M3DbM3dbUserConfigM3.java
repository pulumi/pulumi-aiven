// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aiven.outputs;

import com.pulumi.aiven.outputs.M3DbM3dbUserConfigM3TagOptions;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class M3DbM3dbUserConfigM3 {
    private @Nullable M3DbM3dbUserConfigM3TagOptions tagOptions;

    private M3DbM3dbUserConfigM3() {}
    public Optional<M3DbM3dbUserConfigM3TagOptions> tagOptions() {
        return Optional.ofNullable(this.tagOptions);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(M3DbM3dbUserConfigM3 defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable M3DbM3dbUserConfigM3TagOptions tagOptions;
        public Builder() {}
        public Builder(M3DbM3dbUserConfigM3 defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.tagOptions = defaults.tagOptions;
        }

        @CustomType.Setter
        public Builder tagOptions(@Nullable M3DbM3dbUserConfigM3TagOptions tagOptions) {
            this.tagOptions = tagOptions;
            return this;
        }
        public M3DbM3dbUserConfigM3 build() {
            final var o = new M3DbM3dbUserConfigM3();
            o.tagOptions = tagOptions;
            return o;
        }
    }
}