// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aiven.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class OpenSearchOpensearchUserConfigSaml {
    private Boolean enabled;
    private String idpEntityId;
    private String idpMetadataUrl;
    private @Nullable String idpPemtrustedcasContent;
    private @Nullable String rolesKey;
    private String spEntityId;
    private @Nullable String subjectKey;

    private OpenSearchOpensearchUserConfigSaml() {}
    public Boolean enabled() {
        return this.enabled;
    }
    public String idpEntityId() {
        return this.idpEntityId;
    }
    public String idpMetadataUrl() {
        return this.idpMetadataUrl;
    }
    public Optional<String> idpPemtrustedcasContent() {
        return Optional.ofNullable(this.idpPemtrustedcasContent);
    }
    public Optional<String> rolesKey() {
        return Optional.ofNullable(this.rolesKey);
    }
    public String spEntityId() {
        return this.spEntityId;
    }
    public Optional<String> subjectKey() {
        return Optional.ofNullable(this.subjectKey);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OpenSearchOpensearchUserConfigSaml defaults) {
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
        public Builder(OpenSearchOpensearchUserConfigSaml defaults) {
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
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }
        @CustomType.Setter
        public Builder idpEntityId(String idpEntityId) {
            this.idpEntityId = Objects.requireNonNull(idpEntityId);
            return this;
        }
        @CustomType.Setter
        public Builder idpMetadataUrl(String idpMetadataUrl) {
            this.idpMetadataUrl = Objects.requireNonNull(idpMetadataUrl);
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
            this.spEntityId = Objects.requireNonNull(spEntityId);
            return this;
        }
        @CustomType.Setter
        public Builder subjectKey(@Nullable String subjectKey) {
            this.subjectKey = subjectKey;
            return this;
        }
        public OpenSearchOpensearchUserConfigSaml build() {
            final var o = new OpenSearchOpensearchUserConfigSaml();
            o.enabled = enabled;
            o.idpEntityId = idpEntityId;
            o.idpMetadataUrl = idpMetadataUrl;
            o.idpPemtrustedcasContent = idpPemtrustedcasContent;
            o.rolesKey = rolesKey;
            o.spEntityId = spEntityId;
            o.subjectKey = subjectKey;
            return o;
        }
    }
}