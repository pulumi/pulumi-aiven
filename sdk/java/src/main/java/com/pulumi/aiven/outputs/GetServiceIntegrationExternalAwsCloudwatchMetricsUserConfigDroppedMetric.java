// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aiven.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetServiceIntegrationExternalAwsCloudwatchMetricsUserConfigDroppedMetric {
    private String field;
    private String metric;

    private GetServiceIntegrationExternalAwsCloudwatchMetricsUserConfigDroppedMetric() {}
    public String field() {
        return this.field;
    }
    public String metric() {
        return this.metric;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServiceIntegrationExternalAwsCloudwatchMetricsUserConfigDroppedMetric defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String field;
        private String metric;
        public Builder() {}
        public Builder(GetServiceIntegrationExternalAwsCloudwatchMetricsUserConfigDroppedMetric defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.field = defaults.field;
    	      this.metric = defaults.metric;
        }

        @CustomType.Setter
        public Builder field(String field) {
            this.field = Objects.requireNonNull(field);
            return this;
        }
        @CustomType.Setter
        public Builder metric(String metric) {
            this.metric = Objects.requireNonNull(metric);
            return this;
        }
        public GetServiceIntegrationExternalAwsCloudwatchMetricsUserConfigDroppedMetric build() {
            final var o = new GetServiceIntegrationExternalAwsCloudwatchMetricsUserConfigDroppedMetric();
            o.field = field;
            o.metric = metric;
            return o;
        }
    }
}