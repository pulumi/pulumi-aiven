// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aiven.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetOrganizationUserGroupPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetOrganizationUserGroupPlainArgs Empty = new GetOrganizationUserGroupPlainArgs();

    /**
     * The name of the user group. Changing this property forces recreation of the resource.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return The name of the user group. Changing this property forces recreation of the resource.
     * 
     */
    public String name() {
        return this.name;
    }

    /**
     * The ID of the organization. Changing this property forces recreation of the resource.
     * 
     */
    @Import(name="organizationId", required=true)
    private String organizationId;

    /**
     * @return The ID of the organization. Changing this property forces recreation of the resource.
     * 
     */
    public String organizationId() {
        return this.organizationId;
    }

    private GetOrganizationUserGroupPlainArgs() {}

    private GetOrganizationUserGroupPlainArgs(GetOrganizationUserGroupPlainArgs $) {
        this.name = $.name;
        this.organizationId = $.organizationId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetOrganizationUserGroupPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetOrganizationUserGroupPlainArgs $;

        public Builder() {
            $ = new GetOrganizationUserGroupPlainArgs();
        }

        public Builder(GetOrganizationUserGroupPlainArgs defaults) {
            $ = new GetOrganizationUserGroupPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of the user group. Changing this property forces recreation of the resource.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        /**
         * @param organizationId The ID of the organization. Changing this property forces recreation of the resource.
         * 
         * @return builder
         * 
         */
        public Builder organizationId(String organizationId) {
            $.organizationId = organizationId;
            return this;
        }

        public GetOrganizationUserGroupPlainArgs build() {
            if ($.name == null) {
                throw new MissingRequiredPropertyException("GetOrganizationUserGroupPlainArgs", "name");
            }
            if ($.organizationId == null) {
                throw new MissingRequiredPropertyException("GetOrganizationUserGroupPlainArgs", "organizationId");
            }
            return $;
        }
    }

}