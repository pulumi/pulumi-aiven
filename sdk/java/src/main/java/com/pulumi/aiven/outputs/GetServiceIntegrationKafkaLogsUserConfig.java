// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aiven.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class GetServiceIntegrationKafkaLogsUserConfig {
    /**
     * @return Topic name. Example: `mytopic`.
     * 
     */
    private String kafkaTopic;
    /**
     * @return The list of logging fields that will be sent to the integration logging service. The MESSAGE and timestamp fields are always sent.
     * 
     */
    private @Nullable List<String> selectedLogFields;

    private GetServiceIntegrationKafkaLogsUserConfig() {}
    /**
     * @return Topic name. Example: `mytopic`.
     * 
     */
    public String kafkaTopic() {
        return this.kafkaTopic;
    }
    /**
     * @return The list of logging fields that will be sent to the integration logging service. The MESSAGE and timestamp fields are always sent.
     * 
     */
    public List<String> selectedLogFields() {
        return this.selectedLogFields == null ? List.of() : this.selectedLogFields;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServiceIntegrationKafkaLogsUserConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String kafkaTopic;
        private @Nullable List<String> selectedLogFields;
        public Builder() {}
        public Builder(GetServiceIntegrationKafkaLogsUserConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kafkaTopic = defaults.kafkaTopic;
    	      this.selectedLogFields = defaults.selectedLogFields;
        }

        @CustomType.Setter
        public Builder kafkaTopic(String kafkaTopic) {
            if (kafkaTopic == null) {
              throw new MissingRequiredPropertyException("GetServiceIntegrationKafkaLogsUserConfig", "kafkaTopic");
            }
            this.kafkaTopic = kafkaTopic;
            return this;
        }
        @CustomType.Setter
        public Builder selectedLogFields(@Nullable List<String> selectedLogFields) {

            this.selectedLogFields = selectedLogFields;
            return this;
        }
        public Builder selectedLogFields(String... selectedLogFields) {
            return selectedLogFields(List.of(selectedLogFields));
        }
        public GetServiceIntegrationKafkaLogsUserConfig build() {
            final var _resultValue = new GetServiceIntegrationKafkaLogsUserConfig();
            _resultValue.kafkaTopic = kafkaTopic;
            _resultValue.selectedLogFields = selectedLogFields;
            return _resultValue;
        }
    }
}
