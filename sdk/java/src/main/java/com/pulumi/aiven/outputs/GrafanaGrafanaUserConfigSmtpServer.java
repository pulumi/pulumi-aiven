// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aiven.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GrafanaGrafanaUserConfigSmtpServer {
    private @Nullable String fromAddress;
    private @Nullable String fromName;
    private @Nullable String host;
    private @Nullable String password;
    private @Nullable String port;
    private @Nullable String skipVerify;
    private @Nullable String starttlsPolicy;
    private @Nullable String username;

    private GrafanaGrafanaUserConfigSmtpServer() {}
    public Optional<String> fromAddress() {
        return Optional.ofNullable(this.fromAddress);
    }
    public Optional<String> fromName() {
        return Optional.ofNullable(this.fromName);
    }
    public Optional<String> host() {
        return Optional.ofNullable(this.host);
    }
    public Optional<String> password() {
        return Optional.ofNullable(this.password);
    }
    public Optional<String> port() {
        return Optional.ofNullable(this.port);
    }
    public Optional<String> skipVerify() {
        return Optional.ofNullable(this.skipVerify);
    }
    public Optional<String> starttlsPolicy() {
        return Optional.ofNullable(this.starttlsPolicy);
    }
    public Optional<String> username() {
        return Optional.ofNullable(this.username);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GrafanaGrafanaUserConfigSmtpServer defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String fromAddress;
        private @Nullable String fromName;
        private @Nullable String host;
        private @Nullable String password;
        private @Nullable String port;
        private @Nullable String skipVerify;
        private @Nullable String starttlsPolicy;
        private @Nullable String username;
        public Builder() {}
        public Builder(GrafanaGrafanaUserConfigSmtpServer defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fromAddress = defaults.fromAddress;
    	      this.fromName = defaults.fromName;
    	      this.host = defaults.host;
    	      this.password = defaults.password;
    	      this.port = defaults.port;
    	      this.skipVerify = defaults.skipVerify;
    	      this.starttlsPolicy = defaults.starttlsPolicy;
    	      this.username = defaults.username;
        }

        @CustomType.Setter
        public Builder fromAddress(@Nullable String fromAddress) {
            this.fromAddress = fromAddress;
            return this;
        }
        @CustomType.Setter
        public Builder fromName(@Nullable String fromName) {
            this.fromName = fromName;
            return this;
        }
        @CustomType.Setter
        public Builder host(@Nullable String host) {
            this.host = host;
            return this;
        }
        @CustomType.Setter
        public Builder password(@Nullable String password) {
            this.password = password;
            return this;
        }
        @CustomType.Setter
        public Builder port(@Nullable String port) {
            this.port = port;
            return this;
        }
        @CustomType.Setter
        public Builder skipVerify(@Nullable String skipVerify) {
            this.skipVerify = skipVerify;
            return this;
        }
        @CustomType.Setter
        public Builder starttlsPolicy(@Nullable String starttlsPolicy) {
            this.starttlsPolicy = starttlsPolicy;
            return this;
        }
        @CustomType.Setter
        public Builder username(@Nullable String username) {
            this.username = username;
            return this;
        }
        public GrafanaGrafanaUserConfigSmtpServer build() {
            final var o = new GrafanaGrafanaUserConfigSmtpServer();
            o.fromAddress = fromAddress;
            o.fromName = fromName;
            o.host = host;
            o.password = password;
            o.port = port;
            o.skipVerify = skipVerify;
            o.starttlsPolicy = starttlsPolicy;
            o.username = username;
            return o;
        }
    }
}