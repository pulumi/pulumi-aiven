// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aiven.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ClickhouseServiceIntegration {
    /**
     * @return Type of the service integration. The only supported values at the moment are `clickhouse_kafka` and `clickhouse_postgresql`.
     * 
     */
    private String integrationType;
    /**
     * @return Name of the source service
     * 
     */
    private String sourceServiceName;

    private ClickhouseServiceIntegration() {}
    /**
     * @return Type of the service integration. The only supported values at the moment are `clickhouse_kafka` and `clickhouse_postgresql`.
     * 
     */
    public String integrationType() {
        return this.integrationType;
    }
    /**
     * @return Name of the source service
     * 
     */
    public String sourceServiceName() {
        return this.sourceServiceName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClickhouseServiceIntegration defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String integrationType;
        private String sourceServiceName;
        public Builder() {}
        public Builder(ClickhouseServiceIntegration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.integrationType = defaults.integrationType;
    	      this.sourceServiceName = defaults.sourceServiceName;
        }

        @CustomType.Setter
        public Builder integrationType(String integrationType) {
            if (integrationType == null) {
              throw new MissingRequiredPropertyException("ClickhouseServiceIntegration", "integrationType");
            }
            this.integrationType = integrationType;
            return this;
        }
        @CustomType.Setter
        public Builder sourceServiceName(String sourceServiceName) {
            if (sourceServiceName == null) {
              throw new MissingRequiredPropertyException("ClickhouseServiceIntegration", "sourceServiceName");
            }
            this.sourceServiceName = sourceServiceName;
            return this;
        }
        public ClickhouseServiceIntegration build() {
            final var _resultValue = new ClickhouseServiceIntegration();
            _resultValue.integrationType = integrationType;
            _resultValue.sourceServiceName = sourceServiceName;
            return _resultValue;
        }
    }
}