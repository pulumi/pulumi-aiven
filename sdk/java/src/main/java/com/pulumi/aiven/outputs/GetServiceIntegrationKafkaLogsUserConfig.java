// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aiven.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetServiceIntegrationKafkaLogsUserConfig {
    private @Nullable String kafkaTopic;

    private GetServiceIntegrationKafkaLogsUserConfig() {}
    public Optional<String> kafkaTopic() {
        return Optional.ofNullable(this.kafkaTopic);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServiceIntegrationKafkaLogsUserConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String kafkaTopic;
        public Builder() {}
        public Builder(GetServiceIntegrationKafkaLogsUserConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kafkaTopic = defaults.kafkaTopic;
        }

        @CustomType.Setter
        public Builder kafkaTopic(@Nullable String kafkaTopic) {
            this.kafkaTopic = kafkaTopic;
            return this;
        }
        public GetServiceIntegrationKafkaLogsUserConfig build() {
            final var o = new GetServiceIntegrationKafkaLogsUserConfig();
            o.kafkaTopic = kafkaTopic;
            return o;
        }
    }
}