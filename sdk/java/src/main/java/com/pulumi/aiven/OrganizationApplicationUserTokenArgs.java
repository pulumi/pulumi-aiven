// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aiven;

import com.pulumi.aiven.inputs.OrganizationApplicationUserTokenTimeoutsArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OrganizationApplicationUserTokenArgs extends com.pulumi.resources.ResourceArgs {

    public static final OrganizationApplicationUserTokenArgs Empty = new OrganizationApplicationUserTokenArgs();

    /**
     * Description of the token.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Description of the token.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Extends the token session duration when the token is used. Only applicable if a value is set for `max_age_seconds`.
     * 
     */
    @Import(name="extendWhenUsed")
    private @Nullable Output<Boolean> extendWhenUsed;

    /**
     * @return Extends the token session duration when the token is used. Only applicable if a value is set for `max_age_seconds`.
     * 
     */
    public Optional<Output<Boolean>> extendWhenUsed() {
        return Optional.ofNullable(this.extendWhenUsed);
    }

    /**
     * The number of hours after which a token expires. Default session duration is 10 hours.
     * 
     */
    @Import(name="maxAgeSeconds")
    private @Nullable Output<Double> maxAgeSeconds;

    /**
     * @return The number of hours after which a token expires. Default session duration is 10 hours.
     * 
     */
    public Optional<Output<Double>> maxAgeSeconds() {
        return Optional.ofNullable(this.maxAgeSeconds);
    }

    /**
     * The ID of the organization the application user belongs to.
     * 
     */
    @Import(name="organizationId", required=true)
    private Output<String> organizationId;

    /**
     * @return The ID of the organization the application user belongs to.
     * 
     */
    public Output<String> organizationId() {
        return this.organizationId;
    }

    /**
     * Restricts the scopes for this token.
     * 
     */
    @Import(name="scopes")
    private @Nullable Output<List<String>> scopes;

    /**
     * @return Restricts the scopes for this token.
     * 
     */
    public Optional<Output<List<String>>> scopes() {
        return Optional.ofNullable(this.scopes);
    }

    @Import(name="timeouts")
    private @Nullable Output<OrganizationApplicationUserTokenTimeoutsArgs> timeouts;

    public Optional<Output<OrganizationApplicationUserTokenTimeoutsArgs>> timeouts() {
        return Optional.ofNullable(this.timeouts);
    }

    /**
     * The ID of the application user the token is created for.
     * 
     */
    @Import(name="userId", required=true)
    private Output<String> userId;

    /**
     * @return The ID of the application user the token is created for.
     * 
     */
    public Output<String> userId() {
        return this.userId;
    }

    private OrganizationApplicationUserTokenArgs() {}

    private OrganizationApplicationUserTokenArgs(OrganizationApplicationUserTokenArgs $) {
        this.description = $.description;
        this.extendWhenUsed = $.extendWhenUsed;
        this.maxAgeSeconds = $.maxAgeSeconds;
        this.organizationId = $.organizationId;
        this.scopes = $.scopes;
        this.timeouts = $.timeouts;
        this.userId = $.userId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OrganizationApplicationUserTokenArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OrganizationApplicationUserTokenArgs $;

        public Builder() {
            $ = new OrganizationApplicationUserTokenArgs();
        }

        public Builder(OrganizationApplicationUserTokenArgs defaults) {
            $ = new OrganizationApplicationUserTokenArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description Description of the token.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Description of the token.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param extendWhenUsed Extends the token session duration when the token is used. Only applicable if a value is set for `max_age_seconds`.
         * 
         * @return builder
         * 
         */
        public Builder extendWhenUsed(@Nullable Output<Boolean> extendWhenUsed) {
            $.extendWhenUsed = extendWhenUsed;
            return this;
        }

        /**
         * @param extendWhenUsed Extends the token session duration when the token is used. Only applicable if a value is set for `max_age_seconds`.
         * 
         * @return builder
         * 
         */
        public Builder extendWhenUsed(Boolean extendWhenUsed) {
            return extendWhenUsed(Output.of(extendWhenUsed));
        }

        /**
         * @param maxAgeSeconds The number of hours after which a token expires. Default session duration is 10 hours.
         * 
         * @return builder
         * 
         */
        public Builder maxAgeSeconds(@Nullable Output<Double> maxAgeSeconds) {
            $.maxAgeSeconds = maxAgeSeconds;
            return this;
        }

        /**
         * @param maxAgeSeconds The number of hours after which a token expires. Default session duration is 10 hours.
         * 
         * @return builder
         * 
         */
        public Builder maxAgeSeconds(Double maxAgeSeconds) {
            return maxAgeSeconds(Output.of(maxAgeSeconds));
        }

        /**
         * @param organizationId The ID of the organization the application user belongs to.
         * 
         * @return builder
         * 
         */
        public Builder organizationId(Output<String> organizationId) {
            $.organizationId = organizationId;
            return this;
        }

        /**
         * @param organizationId The ID of the organization the application user belongs to.
         * 
         * @return builder
         * 
         */
        public Builder organizationId(String organizationId) {
            return organizationId(Output.of(organizationId));
        }

        /**
         * @param scopes Restricts the scopes for this token.
         * 
         * @return builder
         * 
         */
        public Builder scopes(@Nullable Output<List<String>> scopes) {
            $.scopes = scopes;
            return this;
        }

        /**
         * @param scopes Restricts the scopes for this token.
         * 
         * @return builder
         * 
         */
        public Builder scopes(List<String> scopes) {
            return scopes(Output.of(scopes));
        }

        /**
         * @param scopes Restricts the scopes for this token.
         * 
         * @return builder
         * 
         */
        public Builder scopes(String... scopes) {
            return scopes(List.of(scopes));
        }

        public Builder timeouts(@Nullable Output<OrganizationApplicationUserTokenTimeoutsArgs> timeouts) {
            $.timeouts = timeouts;
            return this;
        }

        public Builder timeouts(OrganizationApplicationUserTokenTimeoutsArgs timeouts) {
            return timeouts(Output.of(timeouts));
        }

        /**
         * @param userId The ID of the application user the token is created for.
         * 
         * @return builder
         * 
         */
        public Builder userId(Output<String> userId) {
            $.userId = userId;
            return this;
        }

        /**
         * @param userId The ID of the application user the token is created for.
         * 
         * @return builder
         * 
         */
        public Builder userId(String userId) {
            return userId(Output.of(userId));
        }

        public OrganizationApplicationUserTokenArgs build() {
            if ($.organizationId == null) {
                throw new MissingRequiredPropertyException("OrganizationApplicationUserTokenArgs", "organizationId");
            }
            if ($.userId == null) {
                throw new MissingRequiredPropertyException("OrganizationApplicationUserTokenArgs", "userId");
            }
            return $;
        }
    }

}