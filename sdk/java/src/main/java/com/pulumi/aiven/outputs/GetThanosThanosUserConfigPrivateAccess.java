// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aiven.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetThanosThanosUserConfigPrivateAccess {
    /**
     * @return Allow clients to connect to query_frontend with a DNS name that always resolves to the service&#39;s private IP addresses. Only available in certain network locations.
     * 
     */
    private @Nullable Boolean queryFrontend;
    /**
     * @return Allow clients to connect to receiver_routing with a DNS name that always resolves to the service&#39;s private IP addresses. Only available in certain network locations.
     * 
     */
    private @Nullable Boolean receiverRouting;

    private GetThanosThanosUserConfigPrivateAccess() {}
    /**
     * @return Allow clients to connect to query_frontend with a DNS name that always resolves to the service&#39;s private IP addresses. Only available in certain network locations.
     * 
     */
    public Optional<Boolean> queryFrontend() {
        return Optional.ofNullable(this.queryFrontend);
    }
    /**
     * @return Allow clients to connect to receiver_routing with a DNS name that always resolves to the service&#39;s private IP addresses. Only available in certain network locations.
     * 
     */
    public Optional<Boolean> receiverRouting() {
        return Optional.ofNullable(this.receiverRouting);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetThanosThanosUserConfigPrivateAccess defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean queryFrontend;
        private @Nullable Boolean receiverRouting;
        public Builder() {}
        public Builder(GetThanosThanosUserConfigPrivateAccess defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.queryFrontend = defaults.queryFrontend;
    	      this.receiverRouting = defaults.receiverRouting;
        }

        @CustomType.Setter
        public Builder queryFrontend(@Nullable Boolean queryFrontend) {

            this.queryFrontend = queryFrontend;
            return this;
        }
        @CustomType.Setter
        public Builder receiverRouting(@Nullable Boolean receiverRouting) {

            this.receiverRouting = receiverRouting;
            return this;
        }
        public GetThanosThanosUserConfigPrivateAccess build() {
            final var _resultValue = new GetThanosThanosUserConfigPrivateAccess();
            _resultValue.queryFrontend = queryFrontend;
            _resultValue.receiverRouting = receiverRouting;
            return _resultValue;
        }
    }
}
