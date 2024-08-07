// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aiven.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetOrganizationApplicationUserPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetOrganizationApplicationUserPlainArgs Empty = new GetOrganizationApplicationUserPlainArgs();

    /**
     * The ID of the organization the application user belongs to.
     * 
     */
    @Import(name="organizationId", required=true)
    private String organizationId;

    /**
     * @return The ID of the organization the application user belongs to.
     * 
     */
    public String organizationId() {
        return this.organizationId;
    }

    /**
     * The ID of the application user.
     * 
     */
    @Import(name="userId", required=true)
    private String userId;

    /**
     * @return The ID of the application user.
     * 
     */
    public String userId() {
        return this.userId;
    }

    private GetOrganizationApplicationUserPlainArgs() {}

    private GetOrganizationApplicationUserPlainArgs(GetOrganizationApplicationUserPlainArgs $) {
        this.organizationId = $.organizationId;
        this.userId = $.userId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetOrganizationApplicationUserPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetOrganizationApplicationUserPlainArgs $;

        public Builder() {
            $ = new GetOrganizationApplicationUserPlainArgs();
        }

        public Builder(GetOrganizationApplicationUserPlainArgs defaults) {
            $ = new GetOrganizationApplicationUserPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param organizationId The ID of the organization the application user belongs to.
         * 
         * @return builder
         * 
         */
        public Builder organizationId(String organizationId) {
            $.organizationId = organizationId;
            return this;
        }

        /**
         * @param userId The ID of the application user.
         * 
         * @return builder
         * 
         */
        public Builder userId(String userId) {
            $.userId = userId;
            return this;
        }

        public GetOrganizationApplicationUserPlainArgs build() {
            if ($.organizationId == null) {
                throw new MissingRequiredPropertyException("GetOrganizationApplicationUserPlainArgs", "organizationId");
            }
            if ($.userId == null) {
                throw new MissingRequiredPropertyException("GetOrganizationApplicationUserPlainArgs", "userId");
            }
            return $;
        }
    }

}
