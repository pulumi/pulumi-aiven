// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aiven.outputs;

import com.pulumi.aiven.outputs.GetServiceIntegrationKafkaConnectUserConfigKafkaConnect;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetServiceIntegrationKafkaConnectUserConfig {
    private @Nullable GetServiceIntegrationKafkaConnectUserConfigKafkaConnect kafkaConnect;

    private GetServiceIntegrationKafkaConnectUserConfig() {}
    public Optional<GetServiceIntegrationKafkaConnectUserConfigKafkaConnect> kafkaConnect() {
        return Optional.ofNullable(this.kafkaConnect);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServiceIntegrationKafkaConnectUserConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable GetServiceIntegrationKafkaConnectUserConfigKafkaConnect kafkaConnect;
        public Builder() {}
        public Builder(GetServiceIntegrationKafkaConnectUserConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kafkaConnect = defaults.kafkaConnect;
        }

        @CustomType.Setter
        public Builder kafkaConnect(@Nullable GetServiceIntegrationKafkaConnectUserConfigKafkaConnect kafkaConnect) {
            this.kafkaConnect = kafkaConnect;
            return this;
        }
        public GetServiceIntegrationKafkaConnectUserConfig build() {
            final var o = new GetServiceIntegrationKafkaConnectUserConfig();
            o.kafkaConnect = kafkaConnect;
            return o;
        }
    }
}