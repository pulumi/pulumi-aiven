// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aiven.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetOrganizationUserPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetOrganizationUserPlainArgs Empty = new GetOrganizationUserPlainArgs();

    /**
     * The unique organization ID. This property cannot be changed, doing so forces recreation of the resource.
     * 
     */
    @Import(name="organizationId", required=true)
    private String organizationId;

    /**
     * @return The unique organization ID. This property cannot be changed, doing so forces recreation of the resource.
     * 
     */
    public String organizationId() {
        return this.organizationId;
    }

    /**
     * This is a user email address that first will be invited, and after accepting an invitation, they become a member of the organization. This property cannot be changed, doing so forces recreation of the resource.
     * 
     */
    @Import(name="userEmail", required=true)
    private String userEmail;

    /**
     * @return This is a user email address that first will be invited, and after accepting an invitation, they become a member of the organization. This property cannot be changed, doing so forces recreation of the resource.
     * 
     */
    public String userEmail() {
        return this.userEmail;
    }

    private GetOrganizationUserPlainArgs() {}

    private GetOrganizationUserPlainArgs(GetOrganizationUserPlainArgs $) {
        this.organizationId = $.organizationId;
        this.userEmail = $.userEmail;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetOrganizationUserPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetOrganizationUserPlainArgs $;

        public Builder() {
            $ = new GetOrganizationUserPlainArgs();
        }

        public Builder(GetOrganizationUserPlainArgs defaults) {
            $ = new GetOrganizationUserPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param organizationId The unique organization ID. This property cannot be changed, doing so forces recreation of the resource.
         * 
         * @return builder
         * 
         */
        public Builder organizationId(String organizationId) {
            $.organizationId = organizationId;
            return this;
        }

        /**
         * @param userEmail This is a user email address that first will be invited, and after accepting an invitation, they become a member of the organization. This property cannot be changed, doing so forces recreation of the resource.
         * 
         * @return builder
         * 
         */
        public Builder userEmail(String userEmail) {
            $.userEmail = userEmail;
            return this;
        }

        public GetOrganizationUserPlainArgs build() {
            $.organizationId = Objects.requireNonNull($.organizationId, "expected parameter 'organizationId' to be non-null");
            $.userEmail = Objects.requireNonNull($.userEmail, "expected parameter 'userEmail' to be non-null");
            return $;
        }
    }

}