// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aiven.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetMySqlTag {
    private String key;
    private String value;

    private GetMySqlTag() {}
    public String key() {
        return this.key;
    }
    public String value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetMySqlTag defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String key;
        private String value;
        public Builder() {}
        public Builder(GetMySqlTag defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder key(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }
        @CustomType.Setter
        public Builder value(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public GetMySqlTag build() {
            final var o = new GetMySqlTag();
            o.key = key;
            o.value = value;
            return o;
        }
    }
}