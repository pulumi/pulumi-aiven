// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aiven.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GrafanaGrafanaUserConfigAuthGithubArgs extends com.pulumi.resources.ResourceArgs {

    public static final GrafanaGrafanaUserConfigAuthGithubArgs Empty = new GrafanaGrafanaUserConfigAuthGithubArgs();

    @Import(name="allowSignUp")
    private @Nullable Output<String> allowSignUp;

    public Optional<Output<String>> allowSignUp() {
        return Optional.ofNullable(this.allowSignUp);
    }

    @Import(name="allowedOrganizations")
    private @Nullable Output<List<String>> allowedOrganizations;

    public Optional<Output<List<String>>> allowedOrganizations() {
        return Optional.ofNullable(this.allowedOrganizations);
    }

    @Import(name="clientId")
    private @Nullable Output<String> clientId;

    public Optional<Output<String>> clientId() {
        return Optional.ofNullable(this.clientId);
    }

    @Import(name="clientSecret")
    private @Nullable Output<String> clientSecret;

    public Optional<Output<String>> clientSecret() {
        return Optional.ofNullable(this.clientSecret);
    }

    @Import(name="teamIds")
    private @Nullable Output<List<String>> teamIds;

    public Optional<Output<List<String>>> teamIds() {
        return Optional.ofNullable(this.teamIds);
    }

    private GrafanaGrafanaUserConfigAuthGithubArgs() {}

    private GrafanaGrafanaUserConfigAuthGithubArgs(GrafanaGrafanaUserConfigAuthGithubArgs $) {
        this.allowSignUp = $.allowSignUp;
        this.allowedOrganizations = $.allowedOrganizations;
        this.clientId = $.clientId;
        this.clientSecret = $.clientSecret;
        this.teamIds = $.teamIds;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GrafanaGrafanaUserConfigAuthGithubArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GrafanaGrafanaUserConfigAuthGithubArgs $;

        public Builder() {
            $ = new GrafanaGrafanaUserConfigAuthGithubArgs();
        }

        public Builder(GrafanaGrafanaUserConfigAuthGithubArgs defaults) {
            $ = new GrafanaGrafanaUserConfigAuthGithubArgs(Objects.requireNonNull(defaults));
        }

        public Builder allowSignUp(@Nullable Output<String> allowSignUp) {
            $.allowSignUp = allowSignUp;
            return this;
        }

        public Builder allowSignUp(String allowSignUp) {
            return allowSignUp(Output.of(allowSignUp));
        }

        public Builder allowedOrganizations(@Nullable Output<List<String>> allowedOrganizations) {
            $.allowedOrganizations = allowedOrganizations;
            return this;
        }

        public Builder allowedOrganizations(List<String> allowedOrganizations) {
            return allowedOrganizations(Output.of(allowedOrganizations));
        }

        public Builder allowedOrganizations(String... allowedOrganizations) {
            return allowedOrganizations(List.of(allowedOrganizations));
        }

        public Builder clientId(@Nullable Output<String> clientId) {
            $.clientId = clientId;
            return this;
        }

        public Builder clientId(String clientId) {
            return clientId(Output.of(clientId));
        }

        public Builder clientSecret(@Nullable Output<String> clientSecret) {
            $.clientSecret = clientSecret;
            return this;
        }

        public Builder clientSecret(String clientSecret) {
            return clientSecret(Output.of(clientSecret));
        }

        public Builder teamIds(@Nullable Output<List<String>> teamIds) {
            $.teamIds = teamIds;
            return this;
        }

        public Builder teamIds(List<String> teamIds) {
            return teamIds(Output.of(teamIds));
        }

        public Builder teamIds(String... teamIds) {
            return teamIds(List.of(teamIds));
        }

        public GrafanaGrafanaUserConfigAuthGithubArgs build() {
            return $;
        }
    }

}