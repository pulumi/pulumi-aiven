// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aiven.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetInfluxDbServiceIntegration {
    private String integrationType;
    private String sourceServiceName;

    private GetInfluxDbServiceIntegration() {}
    public String integrationType() {
        return this.integrationType;
    }
    public String sourceServiceName() {
        return this.sourceServiceName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInfluxDbServiceIntegration defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String integrationType;
        private String sourceServiceName;
        public Builder() {}
        public Builder(GetInfluxDbServiceIntegration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.integrationType = defaults.integrationType;
    	      this.sourceServiceName = defaults.sourceServiceName;
        }

        @CustomType.Setter
        public Builder integrationType(String integrationType) {
            this.integrationType = Objects.requireNonNull(integrationType);
            return this;
        }
        @CustomType.Setter
        public Builder sourceServiceName(String sourceServiceName) {
            this.sourceServiceName = Objects.requireNonNull(sourceServiceName);
            return this;
        }
        public GetInfluxDbServiceIntegration build() {
            final var o = new GetInfluxDbServiceIntegration();
            o.integrationType = integrationType;
            o.sourceServiceName = sourceServiceName;
            return o;
        }
    }
}