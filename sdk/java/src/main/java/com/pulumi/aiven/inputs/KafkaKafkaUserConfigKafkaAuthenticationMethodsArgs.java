// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aiven.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class KafkaKafkaUserConfigKafkaAuthenticationMethodsArgs extends com.pulumi.resources.ResourceArgs {

    public static final KafkaKafkaUserConfigKafkaAuthenticationMethodsArgs Empty = new KafkaKafkaUserConfigKafkaAuthenticationMethodsArgs();

    @Import(name="certificate")
    private @Nullable Output<String> certificate;

    public Optional<Output<String>> certificate() {
        return Optional.ofNullable(this.certificate);
    }

    @Import(name="sasl")
    private @Nullable Output<String> sasl;

    public Optional<Output<String>> sasl() {
        return Optional.ofNullable(this.sasl);
    }

    private KafkaKafkaUserConfigKafkaAuthenticationMethodsArgs() {}

    private KafkaKafkaUserConfigKafkaAuthenticationMethodsArgs(KafkaKafkaUserConfigKafkaAuthenticationMethodsArgs $) {
        this.certificate = $.certificate;
        this.sasl = $.sasl;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(KafkaKafkaUserConfigKafkaAuthenticationMethodsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private KafkaKafkaUserConfigKafkaAuthenticationMethodsArgs $;

        public Builder() {
            $ = new KafkaKafkaUserConfigKafkaAuthenticationMethodsArgs();
        }

        public Builder(KafkaKafkaUserConfigKafkaAuthenticationMethodsArgs defaults) {
            $ = new KafkaKafkaUserConfigKafkaAuthenticationMethodsArgs(Objects.requireNonNull(defaults));
        }

        public Builder certificate(@Nullable Output<String> certificate) {
            $.certificate = certificate;
            return this;
        }

        public Builder certificate(String certificate) {
            return certificate(Output.of(certificate));
        }

        public Builder sasl(@Nullable Output<String> sasl) {
            $.sasl = sasl;
            return this;
        }

        public Builder sasl(String sasl) {
            return sasl(Output.of(sasl));
        }

        public KafkaKafkaUserConfigKafkaAuthenticationMethodsArgs build() {
            return $;
        }
    }

}