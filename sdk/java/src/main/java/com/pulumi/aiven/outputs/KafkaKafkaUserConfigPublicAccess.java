// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aiven.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class KafkaKafkaUserConfigPublicAccess {
    /**
     * @return Kafka server provided values
     * 
     */
    private @Nullable String kafka;
    private @Nullable String kafkaConnect;
    private @Nullable String kafkaRest;
    private @Nullable String prometheus;
    private @Nullable String schemaRegistry;

    private KafkaKafkaUserConfigPublicAccess() {}
    /**
     * @return Kafka server provided values
     * 
     */
    public Optional<String> kafka() {
        return Optional.ofNullable(this.kafka);
    }
    public Optional<String> kafkaConnect() {
        return Optional.ofNullable(this.kafkaConnect);
    }
    public Optional<String> kafkaRest() {
        return Optional.ofNullable(this.kafkaRest);
    }
    public Optional<String> prometheus() {
        return Optional.ofNullable(this.prometheus);
    }
    public Optional<String> schemaRegistry() {
        return Optional.ofNullable(this.schemaRegistry);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KafkaKafkaUserConfigPublicAccess defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String kafka;
        private @Nullable String kafkaConnect;
        private @Nullable String kafkaRest;
        private @Nullable String prometheus;
        private @Nullable String schemaRegistry;
        public Builder() {}
        public Builder(KafkaKafkaUserConfigPublicAccess defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kafka = defaults.kafka;
    	      this.kafkaConnect = defaults.kafkaConnect;
    	      this.kafkaRest = defaults.kafkaRest;
    	      this.prometheus = defaults.prometheus;
    	      this.schemaRegistry = defaults.schemaRegistry;
        }

        @CustomType.Setter
        public Builder kafka(@Nullable String kafka) {
            this.kafka = kafka;
            return this;
        }
        @CustomType.Setter
        public Builder kafkaConnect(@Nullable String kafkaConnect) {
            this.kafkaConnect = kafkaConnect;
            return this;
        }
        @CustomType.Setter
        public Builder kafkaRest(@Nullable String kafkaRest) {
            this.kafkaRest = kafkaRest;
            return this;
        }
        @CustomType.Setter
        public Builder prometheus(@Nullable String prometheus) {
            this.prometheus = prometheus;
            return this;
        }
        @CustomType.Setter
        public Builder schemaRegistry(@Nullable String schemaRegistry) {
            this.schemaRegistry = schemaRegistry;
            return this;
        }
        public KafkaKafkaUserConfigPublicAccess build() {
            final var o = new KafkaKafkaUserConfigPublicAccess();
            o.kafka = kafka;
            o.kafkaConnect = kafkaConnect;
            o.kafkaRest = kafkaRest;
            o.prometheus = prometheus;
            o.schemaRegistry = schemaRegistry;
            return o;
        }
    }
}