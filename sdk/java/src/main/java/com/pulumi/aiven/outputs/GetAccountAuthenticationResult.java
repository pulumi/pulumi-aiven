// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aiven.outputs;

import com.pulumi.aiven.outputs.GetAccountAuthenticationSamlFieldMapping;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetAccountAuthenticationResult {
    /**
     * @return The unique id of the account.
     * 
     */
    private String accountId;
    /**
     * @return Account authentication id
     * 
     */
    private String authenticationId;
    /**
     * @return Team ID
     * 
     */
    private String autoJoinTeamId;
    /**
     * @return Time of creation
     * 
     */
    private String createTime;
    /**
     * @return Status of account authentication method. The default value is `false`.
     * 
     */
    private Boolean enabled;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return The name of the account authentication.
     * 
     */
    private String name;
    /**
     * @return SAML Assertion Consumer Service URL
     * 
     */
    private String samlAcsUrl;
    /**
     * @return SAML Certificate
     * 
     */
    private String samlCertificate;
    /**
     * @return Digest algorithm. This is an advanced option that typically does not need to be set.
     * 
     */
    private String samlDigestAlgorithm;
    /**
     * @return SAML Entity id
     * 
     */
    private String samlEntityId;
    /**
     * @return Map IdP fields
     * 
     */
    private List<GetAccountAuthenticationSamlFieldMapping> samlFieldMappings;
    /**
     * @return Set to &#39;true&#39; to enable IdP initiated login
     * 
     */
    private Boolean samlIdpLoginAllowed;
    /**
     * @return SAML Idp URL
     * 
     */
    private String samlIdpUrl;
    /**
     * @return SAML Metadata URL
     * 
     */
    private String samlMetadataUrl;
    /**
     * @return Signature algorithm. This is an advanced option that typically does not need to be set.
     * 
     */
    private String samlSignatureAlgorithm;
    /**
     * @return SAML server variant
     * 
     */
    private String samlVariant;
    /**
     * @return The account authentication type. The possible values are `internal` and `saml`.
     * 
     */
    private String type;
    /**
     * @return Time of last update
     * 
     */
    private String updateTime;

    private GetAccountAuthenticationResult() {}
    /**
     * @return The unique id of the account.
     * 
     */
    public String accountId() {
        return this.accountId;
    }
    /**
     * @return Account authentication id
     * 
     */
    public String authenticationId() {
        return this.authenticationId;
    }
    /**
     * @return Team ID
     * 
     */
    public String autoJoinTeamId() {
        return this.autoJoinTeamId;
    }
    /**
     * @return Time of creation
     * 
     */
    public String createTime() {
        return this.createTime;
    }
    /**
     * @return Status of account authentication method. The default value is `false`.
     * 
     */
    public Boolean enabled() {
        return this.enabled;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The name of the account authentication.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return SAML Assertion Consumer Service URL
     * 
     */
    public String samlAcsUrl() {
        return this.samlAcsUrl;
    }
    /**
     * @return SAML Certificate
     * 
     */
    public String samlCertificate() {
        return this.samlCertificate;
    }
    /**
     * @return Digest algorithm. This is an advanced option that typically does not need to be set.
     * 
     */
    public String samlDigestAlgorithm() {
        return this.samlDigestAlgorithm;
    }
    /**
     * @return SAML Entity id
     * 
     */
    public String samlEntityId() {
        return this.samlEntityId;
    }
    /**
     * @return Map IdP fields
     * 
     */
    public List<GetAccountAuthenticationSamlFieldMapping> samlFieldMappings() {
        return this.samlFieldMappings;
    }
    /**
     * @return Set to &#39;true&#39; to enable IdP initiated login
     * 
     */
    public Boolean samlIdpLoginAllowed() {
        return this.samlIdpLoginAllowed;
    }
    /**
     * @return SAML Idp URL
     * 
     */
    public String samlIdpUrl() {
        return this.samlIdpUrl;
    }
    /**
     * @return SAML Metadata URL
     * 
     */
    public String samlMetadataUrl() {
        return this.samlMetadataUrl;
    }
    /**
     * @return Signature algorithm. This is an advanced option that typically does not need to be set.
     * 
     */
    public String samlSignatureAlgorithm() {
        return this.samlSignatureAlgorithm;
    }
    /**
     * @return SAML server variant
     * 
     */
    public String samlVariant() {
        return this.samlVariant;
    }
    /**
     * @return The account authentication type. The possible values are `internal` and `saml`.
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return Time of last update
     * 
     */
    public String updateTime() {
        return this.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAccountAuthenticationResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String accountId;
        private String authenticationId;
        private String autoJoinTeamId;
        private String createTime;
        private Boolean enabled;
        private String id;
        private String name;
        private String samlAcsUrl;
        private String samlCertificate;
        private String samlDigestAlgorithm;
        private String samlEntityId;
        private List<GetAccountAuthenticationSamlFieldMapping> samlFieldMappings;
        private Boolean samlIdpLoginAllowed;
        private String samlIdpUrl;
        private String samlMetadataUrl;
        private String samlSignatureAlgorithm;
        private String samlVariant;
        private String type;
        private String updateTime;
        public Builder() {}
        public Builder(GetAccountAuthenticationResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountId = defaults.accountId;
    	      this.authenticationId = defaults.authenticationId;
    	      this.autoJoinTeamId = defaults.autoJoinTeamId;
    	      this.createTime = defaults.createTime;
    	      this.enabled = defaults.enabled;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.samlAcsUrl = defaults.samlAcsUrl;
    	      this.samlCertificate = defaults.samlCertificate;
    	      this.samlDigestAlgorithm = defaults.samlDigestAlgorithm;
    	      this.samlEntityId = defaults.samlEntityId;
    	      this.samlFieldMappings = defaults.samlFieldMappings;
    	      this.samlIdpLoginAllowed = defaults.samlIdpLoginAllowed;
    	      this.samlIdpUrl = defaults.samlIdpUrl;
    	      this.samlMetadataUrl = defaults.samlMetadataUrl;
    	      this.samlSignatureAlgorithm = defaults.samlSignatureAlgorithm;
    	      this.samlVariant = defaults.samlVariant;
    	      this.type = defaults.type;
    	      this.updateTime = defaults.updateTime;
        }

        @CustomType.Setter
        public Builder accountId(String accountId) {
            if (accountId == null) {
              throw new MissingRequiredPropertyException("GetAccountAuthenticationResult", "accountId");
            }
            this.accountId = accountId;
            return this;
        }
        @CustomType.Setter
        public Builder authenticationId(String authenticationId) {
            if (authenticationId == null) {
              throw new MissingRequiredPropertyException("GetAccountAuthenticationResult", "authenticationId");
            }
            this.authenticationId = authenticationId;
            return this;
        }
        @CustomType.Setter
        public Builder autoJoinTeamId(String autoJoinTeamId) {
            if (autoJoinTeamId == null) {
              throw new MissingRequiredPropertyException("GetAccountAuthenticationResult", "autoJoinTeamId");
            }
            this.autoJoinTeamId = autoJoinTeamId;
            return this;
        }
        @CustomType.Setter
        public Builder createTime(String createTime) {
            if (createTime == null) {
              throw new MissingRequiredPropertyException("GetAccountAuthenticationResult", "createTime");
            }
            this.createTime = createTime;
            return this;
        }
        @CustomType.Setter
        public Builder enabled(Boolean enabled) {
            if (enabled == null) {
              throw new MissingRequiredPropertyException("GetAccountAuthenticationResult", "enabled");
            }
            this.enabled = enabled;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetAccountAuthenticationResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetAccountAuthenticationResult", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder samlAcsUrl(String samlAcsUrl) {
            if (samlAcsUrl == null) {
              throw new MissingRequiredPropertyException("GetAccountAuthenticationResult", "samlAcsUrl");
            }
            this.samlAcsUrl = samlAcsUrl;
            return this;
        }
        @CustomType.Setter
        public Builder samlCertificate(String samlCertificate) {
            if (samlCertificate == null) {
              throw new MissingRequiredPropertyException("GetAccountAuthenticationResult", "samlCertificate");
            }
            this.samlCertificate = samlCertificate;
            return this;
        }
        @CustomType.Setter
        public Builder samlDigestAlgorithm(String samlDigestAlgorithm) {
            if (samlDigestAlgorithm == null) {
              throw new MissingRequiredPropertyException("GetAccountAuthenticationResult", "samlDigestAlgorithm");
            }
            this.samlDigestAlgorithm = samlDigestAlgorithm;
            return this;
        }
        @CustomType.Setter
        public Builder samlEntityId(String samlEntityId) {
            if (samlEntityId == null) {
              throw new MissingRequiredPropertyException("GetAccountAuthenticationResult", "samlEntityId");
            }
            this.samlEntityId = samlEntityId;
            return this;
        }
        @CustomType.Setter
        public Builder samlFieldMappings(List<GetAccountAuthenticationSamlFieldMapping> samlFieldMappings) {
            if (samlFieldMappings == null) {
              throw new MissingRequiredPropertyException("GetAccountAuthenticationResult", "samlFieldMappings");
            }
            this.samlFieldMappings = samlFieldMappings;
            return this;
        }
        public Builder samlFieldMappings(GetAccountAuthenticationSamlFieldMapping... samlFieldMappings) {
            return samlFieldMappings(List.of(samlFieldMappings));
        }
        @CustomType.Setter
        public Builder samlIdpLoginAllowed(Boolean samlIdpLoginAllowed) {
            if (samlIdpLoginAllowed == null) {
              throw new MissingRequiredPropertyException("GetAccountAuthenticationResult", "samlIdpLoginAllowed");
            }
            this.samlIdpLoginAllowed = samlIdpLoginAllowed;
            return this;
        }
        @CustomType.Setter
        public Builder samlIdpUrl(String samlIdpUrl) {
            if (samlIdpUrl == null) {
              throw new MissingRequiredPropertyException("GetAccountAuthenticationResult", "samlIdpUrl");
            }
            this.samlIdpUrl = samlIdpUrl;
            return this;
        }
        @CustomType.Setter
        public Builder samlMetadataUrl(String samlMetadataUrl) {
            if (samlMetadataUrl == null) {
              throw new MissingRequiredPropertyException("GetAccountAuthenticationResult", "samlMetadataUrl");
            }
            this.samlMetadataUrl = samlMetadataUrl;
            return this;
        }
        @CustomType.Setter
        public Builder samlSignatureAlgorithm(String samlSignatureAlgorithm) {
            if (samlSignatureAlgorithm == null) {
              throw new MissingRequiredPropertyException("GetAccountAuthenticationResult", "samlSignatureAlgorithm");
            }
            this.samlSignatureAlgorithm = samlSignatureAlgorithm;
            return this;
        }
        @CustomType.Setter
        public Builder samlVariant(String samlVariant) {
            if (samlVariant == null) {
              throw new MissingRequiredPropertyException("GetAccountAuthenticationResult", "samlVariant");
            }
            this.samlVariant = samlVariant;
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            if (type == null) {
              throw new MissingRequiredPropertyException("GetAccountAuthenticationResult", "type");
            }
            this.type = type;
            return this;
        }
        @CustomType.Setter
        public Builder updateTime(String updateTime) {
            if (updateTime == null) {
              throw new MissingRequiredPropertyException("GetAccountAuthenticationResult", "updateTime");
            }
            this.updateTime = updateTime;
            return this;
        }
        public GetAccountAuthenticationResult build() {
            final var _resultValue = new GetAccountAuthenticationResult();
            _resultValue.accountId = accountId;
            _resultValue.authenticationId = authenticationId;
            _resultValue.autoJoinTeamId = autoJoinTeamId;
            _resultValue.createTime = createTime;
            _resultValue.enabled = enabled;
            _resultValue.id = id;
            _resultValue.name = name;
            _resultValue.samlAcsUrl = samlAcsUrl;
            _resultValue.samlCertificate = samlCertificate;
            _resultValue.samlDigestAlgorithm = samlDigestAlgorithm;
            _resultValue.samlEntityId = samlEntityId;
            _resultValue.samlFieldMappings = samlFieldMappings;
            _resultValue.samlIdpLoginAllowed = samlIdpLoginAllowed;
            _resultValue.samlIdpUrl = samlIdpUrl;
            _resultValue.samlMetadataUrl = samlMetadataUrl;
            _resultValue.samlSignatureAlgorithm = samlSignatureAlgorithm;
            _resultValue.samlVariant = samlVariant;
            _resultValue.type = type;
            _resultValue.updateTime = updateTime;
            return _resultValue;
        }
    }
}
