// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aiven.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class M3DbM3dbUserConfigM3TagOptionsArgs extends com.pulumi.resources.ResourceArgs {

    public static final M3DbM3dbUserConfigM3TagOptionsArgs Empty = new M3DbM3dbUserConfigM3TagOptionsArgs();

    @Import(name="allowTagNameDuplicates")
    private @Nullable Output<Boolean> allowTagNameDuplicates;

    public Optional<Output<Boolean>> allowTagNameDuplicates() {
        return Optional.ofNullable(this.allowTagNameDuplicates);
    }

    @Import(name="allowTagValueEmpty")
    private @Nullable Output<Boolean> allowTagValueEmpty;

    public Optional<Output<Boolean>> allowTagValueEmpty() {
        return Optional.ofNullable(this.allowTagValueEmpty);
    }

    private M3DbM3dbUserConfigM3TagOptionsArgs() {}

    private M3DbM3dbUserConfigM3TagOptionsArgs(M3DbM3dbUserConfigM3TagOptionsArgs $) {
        this.allowTagNameDuplicates = $.allowTagNameDuplicates;
        this.allowTagValueEmpty = $.allowTagValueEmpty;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(M3DbM3dbUserConfigM3TagOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private M3DbM3dbUserConfigM3TagOptionsArgs $;

        public Builder() {
            $ = new M3DbM3dbUserConfigM3TagOptionsArgs();
        }

        public Builder(M3DbM3dbUserConfigM3TagOptionsArgs defaults) {
            $ = new M3DbM3dbUserConfigM3TagOptionsArgs(Objects.requireNonNull(defaults));
        }

        public Builder allowTagNameDuplicates(@Nullable Output<Boolean> allowTagNameDuplicates) {
            $.allowTagNameDuplicates = allowTagNameDuplicates;
            return this;
        }

        public Builder allowTagNameDuplicates(Boolean allowTagNameDuplicates) {
            return allowTagNameDuplicates(Output.of(allowTagNameDuplicates));
        }

        public Builder allowTagValueEmpty(@Nullable Output<Boolean> allowTagValueEmpty) {
            $.allowTagValueEmpty = allowTagValueEmpty;
            return this;
        }

        public Builder allowTagValueEmpty(Boolean allowTagValueEmpty) {
            return allowTagValueEmpty(Output.of(allowTagValueEmpty));
        }

        public M3DbM3dbUserConfigM3TagOptionsArgs build() {
            return $;
        }
    }

}