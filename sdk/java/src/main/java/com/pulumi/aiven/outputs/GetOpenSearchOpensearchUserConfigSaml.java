// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aiven.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetOpenSearchOpensearchUserConfigSaml {
    /**
     * @return Enables or disables SAML-based authentication for OpenSearch. When enabled, users can authenticate using SAML with an Identity Provider. The default value is `true`.
     * 
     */
    private Boolean enabled;
    /**
     * @return The unique identifier for the Identity Provider (IdP) entity that is used for SAML authentication. This value is typically provided by the IdP.
     * 
     */
    private String idpEntityId;
    /**
     * @return The URL of the SAML metadata for the Identity Provider (IdP). This is used to configure SAML-based authentication with the IdP.
     * 
     */
    private String idpMetadataUrl;
    /**
     * @return This parameter specifies the PEM-encoded root certificate authority (CA) content for the SAML identity provider (IdP) server verification. The root CA content is used to verify the SSL/TLS certificate presented by the server.
     * 
     */
    private @Nullable String idpPemtrustedcasContent;
    /**
     * @return Optional. Specifies the attribute in the SAML response where role information is stored, if available. Role attributes are not required for SAML authentication, but can be included in SAML assertions by most Identity Providers (IdPs) to determine user access levels or permissions.
     * 
     */
    private @Nullable String rolesKey;
    /**
     * @return The unique identifier for the Service Provider (SP) entity that is used for SAML authentication. This value is typically provided by the SP.
     * 
     */
    private String spEntityId;
    /**
     * @return Optional. Specifies the attribute in the SAML response where the subject identifier is stored. If not configured, the NameID attribute is used by default.
     * 
     */
    private @Nullable String subjectKey;

    private GetOpenSearchOpensearchUserConfigSaml() {}
    /**
     * @return Enables or disables SAML-based authentication for OpenSearch. When enabled, users can authenticate using SAML with an Identity Provider. The default value is `true`.
     * 
     */
    public Boolean enabled() {
        return this.enabled;
    }
    /**
     * @return The unique identifier for the Identity Provider (IdP) entity that is used for SAML authentication. This value is typically provided by the IdP.
     * 
     */
    public String idpEntityId() {
        return this.idpEntityId;
    }
    /**
     * @return The URL of the SAML metadata for the Identity Provider (IdP). This is used to configure SAML-based authentication with the IdP.
     * 
     */
    public String idpMetadataUrl() {
        return this.idpMetadataUrl;
    }
    /**
     * @return This parameter specifies the PEM-encoded root certificate authority (CA) content for the SAML identity provider (IdP) server verification. The root CA content is used to verify the SSL/TLS certificate presented by the server.
     * 
     */
    public Optional<String> idpPemtrustedcasContent() {
        return Optional.ofNullable(this.idpPemtrustedcasContent);
    }
    /**
     * @return Optional. Specifies the attribute in the SAML response where role information is stored, if available. Role attributes are not required for SAML authentication, but can be included in SAML assertions by most Identity Providers (IdPs) to determine user access levels or permissions.
     * 
     */
    public Optional<String> rolesKey() {
        return Optional.ofNullable(this.rolesKey);
    }
    /**
     * @return The unique identifier for the Service Provider (SP) entity that is used for SAML authentication. This value is typically provided by the SP.
     * 
     */
    public String spEntityId() {
        return this.spEntityId;
    }
    /**
     * @return Optional. Specifies the attribute in the SAML response where the subject identifier is stored. If not configured, the NameID attribute is used by default.
     * 
     */
    public Optional<String> subjectKey() {
        return Optional.ofNullable(this.subjectKey);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetOpenSearchOpensearchUserConfigSaml defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean enabled;
        private String idpEntityId;
        private String idpMetadataUrl;
        private @Nullable String idpPemtrustedcasContent;
        private @Nullable String rolesKey;
        private String spEntityId;
        private @Nullable String subjectKey;
        public Builder() {}
        public Builder(GetOpenSearchOpensearchUserConfigSaml defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.idpEntityId = defaults.idpEntityId;
    	      this.idpMetadataUrl = defaults.idpMetadataUrl;
    	      this.idpPemtrustedcasContent = defaults.idpPemtrustedcasContent;
    	      this.rolesKey = defaults.rolesKey;
    	      this.spEntityId = defaults.spEntityId;
    	      this.subjectKey = defaults.subjectKey;
        }

        @CustomType.Setter
        public Builder enabled(Boolean enabled) {
            if (enabled == null) {
              throw new MissingRequiredPropertyException("GetOpenSearchOpensearchUserConfigSaml", "enabled");
            }
            this.enabled = enabled;
            return this;
        }
        @CustomType.Setter
        public Builder idpEntityId(String idpEntityId) {
            if (idpEntityId == null) {
              throw new MissingRequiredPropertyException("GetOpenSearchOpensearchUserConfigSaml", "idpEntityId");
            }
            this.idpEntityId = idpEntityId;
            return this;
        }
        @CustomType.Setter
        public Builder idpMetadataUrl(String idpMetadataUrl) {
            if (idpMetadataUrl == null) {
              throw new MissingRequiredPropertyException("GetOpenSearchOpensearchUserConfigSaml", "idpMetadataUrl");
            }
            this.idpMetadataUrl = idpMetadataUrl;
            return this;
        }
        @CustomType.Setter
        public Builder idpPemtrustedcasContent(@Nullable String idpPemtrustedcasContent) {

            this.idpPemtrustedcasContent = idpPemtrustedcasContent;
            return this;
        }
        @CustomType.Setter
        public Builder rolesKey(@Nullable String rolesKey) {

            this.rolesKey = rolesKey;
            return this;
        }
        @CustomType.Setter
        public Builder spEntityId(String spEntityId) {
            if (spEntityId == null) {
              throw new MissingRequiredPropertyException("GetOpenSearchOpensearchUserConfigSaml", "spEntityId");
            }
            this.spEntityId = spEntityId;
            return this;
        }
        @CustomType.Setter
        public Builder subjectKey(@Nullable String subjectKey) {

            this.subjectKey = subjectKey;
            return this;
        }
        public GetOpenSearchOpensearchUserConfigSaml build() {
            final var _resultValue = new GetOpenSearchOpensearchUserConfigSaml();
            _resultValue.enabled = enabled;
            _resultValue.idpEntityId = idpEntityId;
            _resultValue.idpMetadataUrl = idpMetadataUrl;
            _resultValue.idpPemtrustedcasContent = idpPemtrustedcasContent;
            _resultValue.rolesKey = rolesKey;
            _resultValue.spEntityId = spEntityId;
            _resultValue.subjectKey = subjectKey;
            return _resultValue;
        }
    }
}