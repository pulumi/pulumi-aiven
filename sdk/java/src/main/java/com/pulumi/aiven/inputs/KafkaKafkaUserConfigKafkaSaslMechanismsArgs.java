// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aiven.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class KafkaKafkaUserConfigKafkaSaslMechanismsArgs extends com.pulumi.resources.ResourceArgs {

    public static final KafkaKafkaUserConfigKafkaSaslMechanismsArgs Empty = new KafkaKafkaUserConfigKafkaSaslMechanismsArgs();

    /**
     * Enable PLAIN mechanism. Default: `true`.
     * 
     */
    @Import(name="plain")
    private @Nullable Output<Boolean> plain;

    /**
     * @return Enable PLAIN mechanism. Default: `true`.
     * 
     */
    public Optional<Output<Boolean>> plain() {
        return Optional.ofNullable(this.plain);
    }

    /**
     * Enable SCRAM-SHA-256 mechanism. Default: `true`.
     * 
     */
    @Import(name="scramSha256")
    private @Nullable Output<Boolean> scramSha256;

    /**
     * @return Enable SCRAM-SHA-256 mechanism. Default: `true`.
     * 
     */
    public Optional<Output<Boolean>> scramSha256() {
        return Optional.ofNullable(this.scramSha256);
    }

    /**
     * Enable SCRAM-SHA-512 mechanism. Default: `true`.
     * 
     */
    @Import(name="scramSha512")
    private @Nullable Output<Boolean> scramSha512;

    /**
     * @return Enable SCRAM-SHA-512 mechanism. Default: `true`.
     * 
     */
    public Optional<Output<Boolean>> scramSha512() {
        return Optional.ofNullable(this.scramSha512);
    }

    private KafkaKafkaUserConfigKafkaSaslMechanismsArgs() {}

    private KafkaKafkaUserConfigKafkaSaslMechanismsArgs(KafkaKafkaUserConfigKafkaSaslMechanismsArgs $) {
        this.plain = $.plain;
        this.scramSha256 = $.scramSha256;
        this.scramSha512 = $.scramSha512;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(KafkaKafkaUserConfigKafkaSaslMechanismsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private KafkaKafkaUserConfigKafkaSaslMechanismsArgs $;

        public Builder() {
            $ = new KafkaKafkaUserConfigKafkaSaslMechanismsArgs();
        }

        public Builder(KafkaKafkaUserConfigKafkaSaslMechanismsArgs defaults) {
            $ = new KafkaKafkaUserConfigKafkaSaslMechanismsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param plain Enable PLAIN mechanism. Default: `true`.
         * 
         * @return builder
         * 
         */
        public Builder plain(@Nullable Output<Boolean> plain) {
            $.plain = plain;
            return this;
        }

        /**
         * @param plain Enable PLAIN mechanism. Default: `true`.
         * 
         * @return builder
         * 
         */
        public Builder plain(Boolean plain) {
            return plain(Output.of(plain));
        }

        /**
         * @param scramSha256 Enable SCRAM-SHA-256 mechanism. Default: `true`.
         * 
         * @return builder
         * 
         */
        public Builder scramSha256(@Nullable Output<Boolean> scramSha256) {
            $.scramSha256 = scramSha256;
            return this;
        }

        /**
         * @param scramSha256 Enable SCRAM-SHA-256 mechanism. Default: `true`.
         * 
         * @return builder
         * 
         */
        public Builder scramSha256(Boolean scramSha256) {
            return scramSha256(Output.of(scramSha256));
        }

        /**
         * @param scramSha512 Enable SCRAM-SHA-512 mechanism. Default: `true`.
         * 
         * @return builder
         * 
         */
        public Builder scramSha512(@Nullable Output<Boolean> scramSha512) {
            $.scramSha512 = scramSha512;
            return this;
        }

        /**
         * @param scramSha512 Enable SCRAM-SHA-512 mechanism. Default: `true`.
         * 
         * @return builder
         * 
         */
        public Builder scramSha512(Boolean scramSha512) {
            return scramSha512(Output.of(scramSha512));
        }

        public KafkaKafkaUserConfigKafkaSaslMechanismsArgs build() {
            return $;
        }
    }

}
