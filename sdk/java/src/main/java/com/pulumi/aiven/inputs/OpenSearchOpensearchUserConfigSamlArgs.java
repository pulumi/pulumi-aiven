// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aiven.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OpenSearchOpensearchUserConfigSamlArgs extends com.pulumi.resources.ResourceArgs {

    public static final OpenSearchOpensearchUserConfigSamlArgs Empty = new OpenSearchOpensearchUserConfigSamlArgs();

    @Import(name="enabled", required=true)
    private Output<Boolean> enabled;

    public Output<Boolean> enabled() {
        return this.enabled;
    }

    @Import(name="idpEntityId", required=true)
    private Output<String> idpEntityId;

    public Output<String> idpEntityId() {
        return this.idpEntityId;
    }

    @Import(name="idpMetadataUrl", required=true)
    private Output<String> idpMetadataUrl;

    public Output<String> idpMetadataUrl() {
        return this.idpMetadataUrl;
    }

    @Import(name="idpPemtrustedcasContent")
    private @Nullable Output<String> idpPemtrustedcasContent;

    public Optional<Output<String>> idpPemtrustedcasContent() {
        return Optional.ofNullable(this.idpPemtrustedcasContent);
    }

    @Import(name="rolesKey")
    private @Nullable Output<String> rolesKey;

    public Optional<Output<String>> rolesKey() {
        return Optional.ofNullable(this.rolesKey);
    }

    @Import(name="spEntityId", required=true)
    private Output<String> spEntityId;

    public Output<String> spEntityId() {
        return this.spEntityId;
    }

    @Import(name="subjectKey")
    private @Nullable Output<String> subjectKey;

    public Optional<Output<String>> subjectKey() {
        return Optional.ofNullable(this.subjectKey);
    }

    private OpenSearchOpensearchUserConfigSamlArgs() {}

    private OpenSearchOpensearchUserConfigSamlArgs(OpenSearchOpensearchUserConfigSamlArgs $) {
        this.enabled = $.enabled;
        this.idpEntityId = $.idpEntityId;
        this.idpMetadataUrl = $.idpMetadataUrl;
        this.idpPemtrustedcasContent = $.idpPemtrustedcasContent;
        this.rolesKey = $.rolesKey;
        this.spEntityId = $.spEntityId;
        this.subjectKey = $.subjectKey;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OpenSearchOpensearchUserConfigSamlArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OpenSearchOpensearchUserConfigSamlArgs $;

        public Builder() {
            $ = new OpenSearchOpensearchUserConfigSamlArgs();
        }

        public Builder(OpenSearchOpensearchUserConfigSamlArgs defaults) {
            $ = new OpenSearchOpensearchUserConfigSamlArgs(Objects.requireNonNull(defaults));
        }

        public Builder enabled(Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        public Builder idpEntityId(Output<String> idpEntityId) {
            $.idpEntityId = idpEntityId;
            return this;
        }

        public Builder idpEntityId(String idpEntityId) {
            return idpEntityId(Output.of(idpEntityId));
        }

        public Builder idpMetadataUrl(Output<String> idpMetadataUrl) {
            $.idpMetadataUrl = idpMetadataUrl;
            return this;
        }

        public Builder idpMetadataUrl(String idpMetadataUrl) {
            return idpMetadataUrl(Output.of(idpMetadataUrl));
        }

        public Builder idpPemtrustedcasContent(@Nullable Output<String> idpPemtrustedcasContent) {
            $.idpPemtrustedcasContent = idpPemtrustedcasContent;
            return this;
        }

        public Builder idpPemtrustedcasContent(String idpPemtrustedcasContent) {
            return idpPemtrustedcasContent(Output.of(idpPemtrustedcasContent));
        }

        public Builder rolesKey(@Nullable Output<String> rolesKey) {
            $.rolesKey = rolesKey;
            return this;
        }

        public Builder rolesKey(String rolesKey) {
            return rolesKey(Output.of(rolesKey));
        }

        public Builder spEntityId(Output<String> spEntityId) {
            $.spEntityId = spEntityId;
            return this;
        }

        public Builder spEntityId(String spEntityId) {
            return spEntityId(Output.of(spEntityId));
        }

        public Builder subjectKey(@Nullable Output<String> subjectKey) {
            $.subjectKey = subjectKey;
            return this;
        }

        public Builder subjectKey(String subjectKey) {
            return subjectKey(Output.of(subjectKey));
        }

        public OpenSearchOpensearchUserConfigSamlArgs build() {
            $.enabled = Objects.requireNonNull($.enabled, "expected parameter 'enabled' to be non-null");
            $.idpEntityId = Objects.requireNonNull($.idpEntityId, "expected parameter 'idpEntityId' to be non-null");
            $.idpMetadataUrl = Objects.requireNonNull($.idpMetadataUrl, "expected parameter 'idpMetadataUrl' to be non-null");
            $.spEntityId = Objects.requireNonNull($.spEntityId, "expected parameter 'spEntityId' to be non-null");
            return $;
        }
    }

}