// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aiven.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetM3DbM3dbUserConfigM3TagOptions {
    /**
     * @return Allows for duplicate tags to appear on series (not allowed by default).
     * 
     */
    private @Nullable Boolean allowTagNameDuplicates;
    /**
     * @return Allows for empty tags to appear on series (not allowed by default).
     * 
     */
    private @Nullable Boolean allowTagValueEmpty;

    private GetM3DbM3dbUserConfigM3TagOptions() {}
    /**
     * @return Allows for duplicate tags to appear on series (not allowed by default).
     * 
     */
    public Optional<Boolean> allowTagNameDuplicates() {
        return Optional.ofNullable(this.allowTagNameDuplicates);
    }
    /**
     * @return Allows for empty tags to appear on series (not allowed by default).
     * 
     */
    public Optional<Boolean> allowTagValueEmpty() {
        return Optional.ofNullable(this.allowTagValueEmpty);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetM3DbM3dbUserConfigM3TagOptions defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean allowTagNameDuplicates;
        private @Nullable Boolean allowTagValueEmpty;
        public Builder() {}
        public Builder(GetM3DbM3dbUserConfigM3TagOptions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowTagNameDuplicates = defaults.allowTagNameDuplicates;
    	      this.allowTagValueEmpty = defaults.allowTagValueEmpty;
        }

        @CustomType.Setter
        public Builder allowTagNameDuplicates(@Nullable Boolean allowTagNameDuplicates) {

            this.allowTagNameDuplicates = allowTagNameDuplicates;
            return this;
        }
        @CustomType.Setter
        public Builder allowTagValueEmpty(@Nullable Boolean allowTagValueEmpty) {

            this.allowTagValueEmpty = allowTagValueEmpty;
            return this;
        }
        public GetM3DbM3dbUserConfigM3TagOptions build() {
            final var _resultValue = new GetM3DbM3dbUserConfigM3TagOptions();
            _resultValue.allowTagNameDuplicates = allowTagNameDuplicates;
            _resultValue.allowTagValueEmpty = allowTagValueEmpty;
            return _resultValue;
        }
    }
}
