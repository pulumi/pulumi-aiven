// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aiven.inputs;

import com.pulumi.aiven.inputs.M3DbM3dbUserConfigNamespaceOptionsArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class M3DbM3dbUserConfigNamespaceArgs extends com.pulumi.resources.ResourceArgs {

    public static final M3DbM3dbUserConfigNamespaceArgs Empty = new M3DbM3dbUserConfigNamespaceArgs();

    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="options")
    private @Nullable Output<M3DbM3dbUserConfigNamespaceOptionsArgs> options;

    public Optional<Output<M3DbM3dbUserConfigNamespaceOptionsArgs>> options() {
        return Optional.ofNullable(this.options);
    }

    @Import(name="resolution")
    private @Nullable Output<String> resolution;

    public Optional<Output<String>> resolution() {
        return Optional.ofNullable(this.resolution);
    }

    @Import(name="type")
    private @Nullable Output<String> type;

    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    private M3DbM3dbUserConfigNamespaceArgs() {}

    private M3DbM3dbUserConfigNamespaceArgs(M3DbM3dbUserConfigNamespaceArgs $) {
        this.name = $.name;
        this.options = $.options;
        this.resolution = $.resolution;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(M3DbM3dbUserConfigNamespaceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private M3DbM3dbUserConfigNamespaceArgs $;

        public Builder() {
            $ = new M3DbM3dbUserConfigNamespaceArgs();
        }

        public Builder(M3DbM3dbUserConfigNamespaceArgs defaults) {
            $ = new M3DbM3dbUserConfigNamespaceArgs(Objects.requireNonNull(defaults));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder options(@Nullable Output<M3DbM3dbUserConfigNamespaceOptionsArgs> options) {
            $.options = options;
            return this;
        }

        public Builder options(M3DbM3dbUserConfigNamespaceOptionsArgs options) {
            return options(Output.of(options));
        }

        public Builder resolution(@Nullable Output<String> resolution) {
            $.resolution = resolution;
            return this;
        }

        public Builder resolution(String resolution) {
            return resolution(Output.of(resolution));
        }

        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        public Builder type(String type) {
            return type(Output.of(type));
        }

        public M3DbM3dbUserConfigNamespaceArgs build() {
            return $;
        }
    }

}