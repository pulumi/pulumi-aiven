// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aiven.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class KafkaMirrorMakerKafkaMirrormakerUserConfigIpFilterObjectArgs extends com.pulumi.resources.ResourceArgs {

    public static final KafkaMirrorMakerKafkaMirrormakerUserConfigIpFilterObjectArgs Empty = new KafkaMirrorMakerKafkaMirrormakerUserConfigIpFilterObjectArgs();

    @Import(name="description")
    private @Nullable Output<String> description;

    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    @Import(name="network")
    private @Nullable Output<String> network;

    public Optional<Output<String>> network() {
        return Optional.ofNullable(this.network);
    }

    private KafkaMirrorMakerKafkaMirrormakerUserConfigIpFilterObjectArgs() {}

    private KafkaMirrorMakerKafkaMirrormakerUserConfigIpFilterObjectArgs(KafkaMirrorMakerKafkaMirrormakerUserConfigIpFilterObjectArgs $) {
        this.description = $.description;
        this.network = $.network;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(KafkaMirrorMakerKafkaMirrormakerUserConfigIpFilterObjectArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private KafkaMirrorMakerKafkaMirrormakerUserConfigIpFilterObjectArgs $;

        public Builder() {
            $ = new KafkaMirrorMakerKafkaMirrormakerUserConfigIpFilterObjectArgs();
        }

        public Builder(KafkaMirrorMakerKafkaMirrormakerUserConfigIpFilterObjectArgs defaults) {
            $ = new KafkaMirrorMakerKafkaMirrormakerUserConfigIpFilterObjectArgs(Objects.requireNonNull(defaults));
        }

        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder network(@Nullable Output<String> network) {
            $.network = network;
            return this;
        }

        public Builder network(String network) {
            return network(Output.of(network));
        }

        public KafkaMirrorMakerKafkaMirrormakerUserConfigIpFilterObjectArgs build() {
            return $;
        }
    }

}