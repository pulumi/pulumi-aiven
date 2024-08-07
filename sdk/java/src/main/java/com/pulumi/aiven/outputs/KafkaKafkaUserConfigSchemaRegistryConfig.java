// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aiven.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class KafkaKafkaUserConfigSchemaRegistryConfig {
    /**
     * @return If true, Karapace / Schema Registry on the service nodes can participate in leader election. It might be needed to disable this when the schemas topic is replicated to a secondary cluster and Karapace / Schema Registry there must not participate in leader election. Defaults to `true`.
     * 
     */
    private @Nullable Boolean leaderEligibility;
    /**
     * @return The durable single partition topic that acts as the durable log for the data. This topic must be compacted to avoid losing data due to retention policy. Please note that changing this configuration in an existing Schema Registry / Karapace setup leads to previous schemas being inaccessible, data encoded with them potentially unreadable and schema ID sequence put out of order. It&#39;s only possible to do the switch while Schema Registry / Karapace is disabled. Defaults to `_schemas`.
     * 
     */
    private @Nullable String topicName;

    private KafkaKafkaUserConfigSchemaRegistryConfig() {}
    /**
     * @return If true, Karapace / Schema Registry on the service nodes can participate in leader election. It might be needed to disable this when the schemas topic is replicated to a secondary cluster and Karapace / Schema Registry there must not participate in leader election. Defaults to `true`.
     * 
     */
    public Optional<Boolean> leaderEligibility() {
        return Optional.ofNullable(this.leaderEligibility);
    }
    /**
     * @return The durable single partition topic that acts as the durable log for the data. This topic must be compacted to avoid losing data due to retention policy. Please note that changing this configuration in an existing Schema Registry / Karapace setup leads to previous schemas being inaccessible, data encoded with them potentially unreadable and schema ID sequence put out of order. It&#39;s only possible to do the switch while Schema Registry / Karapace is disabled. Defaults to `_schemas`.
     * 
     */
    public Optional<String> topicName() {
        return Optional.ofNullable(this.topicName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KafkaKafkaUserConfigSchemaRegistryConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean leaderEligibility;
        private @Nullable String topicName;
        public Builder() {}
        public Builder(KafkaKafkaUserConfigSchemaRegistryConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.leaderEligibility = defaults.leaderEligibility;
    	      this.topicName = defaults.topicName;
        }

        @CustomType.Setter
        public Builder leaderEligibility(@Nullable Boolean leaderEligibility) {

            this.leaderEligibility = leaderEligibility;
            return this;
        }
        @CustomType.Setter
        public Builder topicName(@Nullable String topicName) {

            this.topicName = topicName;
            return this;
        }
        public KafkaKafkaUserConfigSchemaRegistryConfig build() {
            final var _resultValue = new KafkaKafkaUserConfigSchemaRegistryConfig();
            _resultValue.leaderEligibility = leaderEligibility;
            _resultValue.topicName = topicName;
            return _resultValue;
        }
    }
}
