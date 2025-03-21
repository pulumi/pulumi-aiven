// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aiven.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetFlinkFlinkUserConfigPublicAccess {
    /**
     * @return Allow clients to connect to flink from the public internet for service nodes that are in a project VPC or another type of private network.
     * 
     */
    private @Nullable Boolean flink;

    private GetFlinkFlinkUserConfigPublicAccess() {}
    /**
     * @return Allow clients to connect to flink from the public internet for service nodes that are in a project VPC or another type of private network.
     * 
     */
    public Optional<Boolean> flink() {
        return Optional.ofNullable(this.flink);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFlinkFlinkUserConfigPublicAccess defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean flink;
        public Builder() {}
        public Builder(GetFlinkFlinkUserConfigPublicAccess defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.flink = defaults.flink;
        }

        @CustomType.Setter
        public Builder flink(@Nullable Boolean flink) {

            this.flink = flink;
            return this;
        }
        public GetFlinkFlinkUserConfigPublicAccess build() {
            final var _resultValue = new GetFlinkFlinkUserConfigPublicAccess();
            _resultValue.flink = flink;
            return _resultValue;
        }
    }
}
