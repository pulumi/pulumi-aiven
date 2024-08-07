// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aiven.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GrafanaGrafanaUserConfigAuthAzuread {
    /**
     * @return Automatically sign-up users on successful sign-in.
     * 
     */
    private @Nullable Boolean allowSignUp;
    /**
     * @return Allowed domains.
     * 
     */
    private @Nullable List<String> allowedDomains;
    /**
     * @return Require users to belong to one of given groups.
     * 
     */
    private @Nullable List<String> allowedGroups;
    /**
     * @return Authorization URL. Example: `https://login.microsoftonline.com/&lt;AZURE_TENANT_ID&gt;/oauth2/v2.0/authorize`.
     * 
     */
    private String authUrl;
    /**
     * @return Client ID from provider. Example: `b1ba0bf54a4c2c0a1c29`.
     * 
     */
    private String clientId;
    /**
     * @return Client secret from provider. Example: `bfa6gea4f129076761dcba8ce5e1e406bd83af7b`.
     * 
     */
    private String clientSecret;
    /**
     * @return Token URL. Example: `https://login.microsoftonline.com/&lt;AZURE_TENANT_ID&gt;/oauth2/v2.0/token`.
     * 
     */
    private String tokenUrl;

    private GrafanaGrafanaUserConfigAuthAzuread() {}
    /**
     * @return Automatically sign-up users on successful sign-in.
     * 
     */
    public Optional<Boolean> allowSignUp() {
        return Optional.ofNullable(this.allowSignUp);
    }
    /**
     * @return Allowed domains.
     * 
     */
    public List<String> allowedDomains() {
        return this.allowedDomains == null ? List.of() : this.allowedDomains;
    }
    /**
     * @return Require users to belong to one of given groups.
     * 
     */
    public List<String> allowedGroups() {
        return this.allowedGroups == null ? List.of() : this.allowedGroups;
    }
    /**
     * @return Authorization URL. Example: `https://login.microsoftonline.com/&lt;AZURE_TENANT_ID&gt;/oauth2/v2.0/authorize`.
     * 
     */
    public String authUrl() {
        return this.authUrl;
    }
    /**
     * @return Client ID from provider. Example: `b1ba0bf54a4c2c0a1c29`.
     * 
     */
    public String clientId() {
        return this.clientId;
    }
    /**
     * @return Client secret from provider. Example: `bfa6gea4f129076761dcba8ce5e1e406bd83af7b`.
     * 
     */
    public String clientSecret() {
        return this.clientSecret;
    }
    /**
     * @return Token URL. Example: `https://login.microsoftonline.com/&lt;AZURE_TENANT_ID&gt;/oauth2/v2.0/token`.
     * 
     */
    public String tokenUrl() {
        return this.tokenUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GrafanaGrafanaUserConfigAuthAzuread defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean allowSignUp;
        private @Nullable List<String> allowedDomains;
        private @Nullable List<String> allowedGroups;
        private String authUrl;
        private String clientId;
        private String clientSecret;
        private String tokenUrl;
        public Builder() {}
        public Builder(GrafanaGrafanaUserConfigAuthAzuread defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowSignUp = defaults.allowSignUp;
    	      this.allowedDomains = defaults.allowedDomains;
    	      this.allowedGroups = defaults.allowedGroups;
    	      this.authUrl = defaults.authUrl;
    	      this.clientId = defaults.clientId;
    	      this.clientSecret = defaults.clientSecret;
    	      this.tokenUrl = defaults.tokenUrl;
        }

        @CustomType.Setter
        public Builder allowSignUp(@Nullable Boolean allowSignUp) {

            this.allowSignUp = allowSignUp;
            return this;
        }
        @CustomType.Setter
        public Builder allowedDomains(@Nullable List<String> allowedDomains) {

            this.allowedDomains = allowedDomains;
            return this;
        }
        public Builder allowedDomains(String... allowedDomains) {
            return allowedDomains(List.of(allowedDomains));
        }
        @CustomType.Setter
        public Builder allowedGroups(@Nullable List<String> allowedGroups) {

            this.allowedGroups = allowedGroups;
            return this;
        }
        public Builder allowedGroups(String... allowedGroups) {
            return allowedGroups(List.of(allowedGroups));
        }
        @CustomType.Setter
        public Builder authUrl(String authUrl) {
            if (authUrl == null) {
              throw new MissingRequiredPropertyException("GrafanaGrafanaUserConfigAuthAzuread", "authUrl");
            }
            this.authUrl = authUrl;
            return this;
        }
        @CustomType.Setter
        public Builder clientId(String clientId) {
            if (clientId == null) {
              throw new MissingRequiredPropertyException("GrafanaGrafanaUserConfigAuthAzuread", "clientId");
            }
            this.clientId = clientId;
            return this;
        }
        @CustomType.Setter
        public Builder clientSecret(String clientSecret) {
            if (clientSecret == null) {
              throw new MissingRequiredPropertyException("GrafanaGrafanaUserConfigAuthAzuread", "clientSecret");
            }
            this.clientSecret = clientSecret;
            return this;
        }
        @CustomType.Setter
        public Builder tokenUrl(String tokenUrl) {
            if (tokenUrl == null) {
              throw new MissingRequiredPropertyException("GrafanaGrafanaUserConfigAuthAzuread", "tokenUrl");
            }
            this.tokenUrl = tokenUrl;
            return this;
        }
        public GrafanaGrafanaUserConfigAuthAzuread build() {
            final var _resultValue = new GrafanaGrafanaUserConfigAuthAzuread();
            _resultValue.allowSignUp = allowSignUp;
            _resultValue.allowedDomains = allowedDomains;
            _resultValue.allowedGroups = allowedGroups;
            _resultValue.authUrl = authUrl;
            _resultValue.clientId = clientId;
            _resultValue.clientSecret = clientSecret;
            _resultValue.tokenUrl = tokenUrl;
            return _resultValue;
        }
    }
}
