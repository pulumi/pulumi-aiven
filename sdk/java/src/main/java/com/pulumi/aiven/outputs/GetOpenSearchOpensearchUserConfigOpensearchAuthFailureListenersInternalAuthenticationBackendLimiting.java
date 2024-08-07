// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aiven.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetOpenSearchOpensearchUserConfigOpensearchAuthFailureListenersInternalAuthenticationBackendLimiting {
    /**
     * @return The number of login attempts allowed before login is blocked. Example: `10`.
     * 
     */
    private @Nullable Integer allowedTries;
    /**
     * @return Enum: `internal`. internal_authentication_backend_limiting.authentication_backend.
     * 
     */
    private @Nullable String authenticationBackend;
    /**
     * @return The duration of time that login remains blocked after a failed login. Example: `600`.
     * 
     */
    private @Nullable Integer blockExpirySeconds;
    /**
     * @return internal_authentication_backend_limiting.max_blocked_clients. Example: `100000`.
     * 
     */
    private @Nullable Integer maxBlockedClients;
    /**
     * @return The maximum number of tracked IP addresses that have failed login. Example: `100000`.
     * 
     */
    private @Nullable Integer maxTrackedClients;
    /**
     * @return The window of time in which the value for `allowed_tries` is enforced. Example: `3600`.
     * 
     */
    private @Nullable Integer timeWindowSeconds;
    /**
     * @return Enum: `username`. internal_authentication_backend_limiting.type.
     * 
     */
    private @Nullable String type;

    private GetOpenSearchOpensearchUserConfigOpensearchAuthFailureListenersInternalAuthenticationBackendLimiting() {}
    /**
     * @return The number of login attempts allowed before login is blocked. Example: `10`.
     * 
     */
    public Optional<Integer> allowedTries() {
        return Optional.ofNullable(this.allowedTries);
    }
    /**
     * @return Enum: `internal`. internal_authentication_backend_limiting.authentication_backend.
     * 
     */
    public Optional<String> authenticationBackend() {
        return Optional.ofNullable(this.authenticationBackend);
    }
    /**
     * @return The duration of time that login remains blocked after a failed login. Example: `600`.
     * 
     */
    public Optional<Integer> blockExpirySeconds() {
        return Optional.ofNullable(this.blockExpirySeconds);
    }
    /**
     * @return internal_authentication_backend_limiting.max_blocked_clients. Example: `100000`.
     * 
     */
    public Optional<Integer> maxBlockedClients() {
        return Optional.ofNullable(this.maxBlockedClients);
    }
    /**
     * @return The maximum number of tracked IP addresses that have failed login. Example: `100000`.
     * 
     */
    public Optional<Integer> maxTrackedClients() {
        return Optional.ofNullable(this.maxTrackedClients);
    }
    /**
     * @return The window of time in which the value for `allowed_tries` is enforced. Example: `3600`.
     * 
     */
    public Optional<Integer> timeWindowSeconds() {
        return Optional.ofNullable(this.timeWindowSeconds);
    }
    /**
     * @return Enum: `username`. internal_authentication_backend_limiting.type.
     * 
     */
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetOpenSearchOpensearchUserConfigOpensearchAuthFailureListenersInternalAuthenticationBackendLimiting defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer allowedTries;
        private @Nullable String authenticationBackend;
        private @Nullable Integer blockExpirySeconds;
        private @Nullable Integer maxBlockedClients;
        private @Nullable Integer maxTrackedClients;
        private @Nullable Integer timeWindowSeconds;
        private @Nullable String type;
        public Builder() {}
        public Builder(GetOpenSearchOpensearchUserConfigOpensearchAuthFailureListenersInternalAuthenticationBackendLimiting defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedTries = defaults.allowedTries;
    	      this.authenticationBackend = defaults.authenticationBackend;
    	      this.blockExpirySeconds = defaults.blockExpirySeconds;
    	      this.maxBlockedClients = defaults.maxBlockedClients;
    	      this.maxTrackedClients = defaults.maxTrackedClients;
    	      this.timeWindowSeconds = defaults.timeWindowSeconds;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder allowedTries(@Nullable Integer allowedTries) {

            this.allowedTries = allowedTries;
            return this;
        }
        @CustomType.Setter
        public Builder authenticationBackend(@Nullable String authenticationBackend) {

            this.authenticationBackend = authenticationBackend;
            return this;
        }
        @CustomType.Setter
        public Builder blockExpirySeconds(@Nullable Integer blockExpirySeconds) {

            this.blockExpirySeconds = blockExpirySeconds;
            return this;
        }
        @CustomType.Setter
        public Builder maxBlockedClients(@Nullable Integer maxBlockedClients) {

            this.maxBlockedClients = maxBlockedClients;
            return this;
        }
        @CustomType.Setter
        public Builder maxTrackedClients(@Nullable Integer maxTrackedClients) {

            this.maxTrackedClients = maxTrackedClients;
            return this;
        }
        @CustomType.Setter
        public Builder timeWindowSeconds(@Nullable Integer timeWindowSeconds) {

            this.timeWindowSeconds = timeWindowSeconds;
            return this;
        }
        @CustomType.Setter
        public Builder type(@Nullable String type) {

            this.type = type;
            return this;
        }
        public GetOpenSearchOpensearchUserConfigOpensearchAuthFailureListenersInternalAuthenticationBackendLimiting build() {
            final var _resultValue = new GetOpenSearchOpensearchUserConfigOpensearchAuthFailureListenersInternalAuthenticationBackendLimiting();
            _resultValue.allowedTries = allowedTries;
            _resultValue.authenticationBackend = authenticationBackend;
            _resultValue.blockExpirySeconds = blockExpirySeconds;
            _resultValue.maxBlockedClients = maxBlockedClients;
            _resultValue.maxTrackedClients = maxTrackedClients;
            _resultValue.timeWindowSeconds = timeWindowSeconds;
            _resultValue.type = type;
            return _resultValue;
        }
    }
}
