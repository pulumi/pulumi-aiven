// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aiven.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetGrafanaTag {
    /**
     * @return Service tag key
     * 
     */
    private String key;
    /**
     * @return Service tag value
     * 
     */
    private String value;

    private GetGrafanaTag() {}
    /**
     * @return Service tag key
     * 
     */
    public String key() {
        return this.key;
    }
    /**
     * @return Service tag value
     * 
     */
    public String value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGrafanaTag defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String key;
        private String value;
        public Builder() {}
        public Builder(GetGrafanaTag defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder key(String key) {
            if (key == null) {
              throw new MissingRequiredPropertyException("GetGrafanaTag", "key");
            }
            this.key = key;
            return this;
        }
        @CustomType.Setter
        public Builder value(String value) {
            if (value == null) {
              throw new MissingRequiredPropertyException("GetGrafanaTag", "value");
            }
            this.value = value;
            return this;
        }
        public GetGrafanaTag build() {
            final var _resultValue = new GetGrafanaTag();
            _resultValue.key = key;
            _resultValue.value = value;
            return _resultValue;
        }
    }
}
