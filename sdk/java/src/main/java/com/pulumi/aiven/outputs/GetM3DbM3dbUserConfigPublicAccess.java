// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aiven.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetM3DbM3dbUserConfigPublicAccess {
    /**
     * @return Allow clients to connect to m3coordinator from the public internet for service nodes that are in a project VPC or another type of private network.
     * 
     */
    private @Nullable Boolean m3coordinator;

    private GetM3DbM3dbUserConfigPublicAccess() {}
    /**
     * @return Allow clients to connect to m3coordinator from the public internet for service nodes that are in a project VPC or another type of private network.
     * 
     */
    public Optional<Boolean> m3coordinator() {
        return Optional.ofNullable(this.m3coordinator);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetM3DbM3dbUserConfigPublicAccess defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean m3coordinator;
        public Builder() {}
        public Builder(GetM3DbM3dbUserConfigPublicAccess defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.m3coordinator = defaults.m3coordinator;
        }

        @CustomType.Setter
        public Builder m3coordinator(@Nullable Boolean m3coordinator) {

            this.m3coordinator = m3coordinator;
            return this;
        }
        public GetM3DbM3dbUserConfigPublicAccess build() {
            final var _resultValue = new GetM3DbM3dbUserConfigPublicAccess();
            _resultValue.m3coordinator = m3coordinator;
            return _resultValue;
        }
    }
}
