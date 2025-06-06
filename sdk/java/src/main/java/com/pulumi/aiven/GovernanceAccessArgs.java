// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aiven;

import com.pulumi.aiven.inputs.GovernanceAccessAccessDataArgs;
import com.pulumi.aiven.inputs.GovernanceAccessTimeoutsArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GovernanceAccessArgs extends com.pulumi.resources.ResourceArgs {

    public static final GovernanceAccessArgs Empty = new GovernanceAccessArgs();

    /**
     * Required property. access type specific data. Changing this property forces recreation of the resource.
     * 
     */
    @Import(name="accessData")
    private @Nullable Output<GovernanceAccessAccessDataArgs> accessData;

    /**
     * @return Required property. access type specific data. Changing this property forces recreation of the resource.
     * 
     */
    public Optional<Output<GovernanceAccessAccessDataArgs>> accessData() {
        return Optional.ofNullable(this.accessData);
    }

    /**
     * Label to describe the access. Changing this property forces recreation of the resource.
     * 
     */
    @Import(name="accessName", required=true)
    private Output<String> accessName;

    /**
     * @return Label to describe the access. Changing this property forces recreation of the resource.
     * 
     */
    public Output<String> accessName() {
        return this.accessName;
    }

    /**
     * An enumeration. The possible value is `KAFKA`. Changing this property forces recreation of the resource.
     * 
     */
    @Import(name="accessType", required=true)
    private Output<String> accessType;

    /**
     * @return An enumeration. The possible value is `KAFKA`. Changing this property forces recreation of the resource.
     * 
     */
    public Output<String> accessType() {
        return this.accessType;
    }

    /**
     * ID of an organization. Changing this property forces recreation of the resource.
     * 
     */
    @Import(name="organizationId", required=true)
    private Output<String> organizationId;

    /**
     * @return ID of an organization. Changing this property forces recreation of the resource.
     * 
     */
    public Output<String> organizationId() {
        return this.organizationId;
    }

    /**
     * The ID of the group that will own the access. Maximum length: `36`. Changing this property forces recreation of the resource.
     * 
     */
    @Import(name="ownerUserGroupId")
    private @Nullable Output<String> ownerUserGroupId;

    /**
     * @return The ID of the group that will own the access. Maximum length: `36`. Changing this property forces recreation of the resource.
     * 
     */
    public Optional<Output<String>> ownerUserGroupId() {
        return Optional.ofNullable(this.ownerUserGroupId);
    }

    @Import(name="timeouts")
    private @Nullable Output<GovernanceAccessTimeoutsArgs> timeouts;

    public Optional<Output<GovernanceAccessTimeoutsArgs>> timeouts() {
        return Optional.ofNullable(this.timeouts);
    }

    private GovernanceAccessArgs() {}

    private GovernanceAccessArgs(GovernanceAccessArgs $) {
        this.accessData = $.accessData;
        this.accessName = $.accessName;
        this.accessType = $.accessType;
        this.organizationId = $.organizationId;
        this.ownerUserGroupId = $.ownerUserGroupId;
        this.timeouts = $.timeouts;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GovernanceAccessArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GovernanceAccessArgs $;

        public Builder() {
            $ = new GovernanceAccessArgs();
        }

        public Builder(GovernanceAccessArgs defaults) {
            $ = new GovernanceAccessArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accessData Required property. access type specific data. Changing this property forces recreation of the resource.
         * 
         * @return builder
         * 
         */
        public Builder accessData(@Nullable Output<GovernanceAccessAccessDataArgs> accessData) {
            $.accessData = accessData;
            return this;
        }

        /**
         * @param accessData Required property. access type specific data. Changing this property forces recreation of the resource.
         * 
         * @return builder
         * 
         */
        public Builder accessData(GovernanceAccessAccessDataArgs accessData) {
            return accessData(Output.of(accessData));
        }

        /**
         * @param accessName Label to describe the access. Changing this property forces recreation of the resource.
         * 
         * @return builder
         * 
         */
        public Builder accessName(Output<String> accessName) {
            $.accessName = accessName;
            return this;
        }

        /**
         * @param accessName Label to describe the access. Changing this property forces recreation of the resource.
         * 
         * @return builder
         * 
         */
        public Builder accessName(String accessName) {
            return accessName(Output.of(accessName));
        }

        /**
         * @param accessType An enumeration. The possible value is `KAFKA`. Changing this property forces recreation of the resource.
         * 
         * @return builder
         * 
         */
        public Builder accessType(Output<String> accessType) {
            $.accessType = accessType;
            return this;
        }

        /**
         * @param accessType An enumeration. The possible value is `KAFKA`. Changing this property forces recreation of the resource.
         * 
         * @return builder
         * 
         */
        public Builder accessType(String accessType) {
            return accessType(Output.of(accessType));
        }

        /**
         * @param organizationId ID of an organization. Changing this property forces recreation of the resource.
         * 
         * @return builder
         * 
         */
        public Builder organizationId(Output<String> organizationId) {
            $.organizationId = organizationId;
            return this;
        }

        /**
         * @param organizationId ID of an organization. Changing this property forces recreation of the resource.
         * 
         * @return builder
         * 
         */
        public Builder organizationId(String organizationId) {
            return organizationId(Output.of(organizationId));
        }

        /**
         * @param ownerUserGroupId The ID of the group that will own the access. Maximum length: `36`. Changing this property forces recreation of the resource.
         * 
         * @return builder
         * 
         */
        public Builder ownerUserGroupId(@Nullable Output<String> ownerUserGroupId) {
            $.ownerUserGroupId = ownerUserGroupId;
            return this;
        }

        /**
         * @param ownerUserGroupId The ID of the group that will own the access. Maximum length: `36`. Changing this property forces recreation of the resource.
         * 
         * @return builder
         * 
         */
        public Builder ownerUserGroupId(String ownerUserGroupId) {
            return ownerUserGroupId(Output.of(ownerUserGroupId));
        }

        public Builder timeouts(@Nullable Output<GovernanceAccessTimeoutsArgs> timeouts) {
            $.timeouts = timeouts;
            return this;
        }

        public Builder timeouts(GovernanceAccessTimeoutsArgs timeouts) {
            return timeouts(Output.of(timeouts));
        }

        public GovernanceAccessArgs build() {
            if ($.accessName == null) {
                throw new MissingRequiredPropertyException("GovernanceAccessArgs", "accessName");
            }
            if ($.accessType == null) {
                throw new MissingRequiredPropertyException("GovernanceAccessArgs", "accessType");
            }
            if ($.organizationId == null) {
                throw new MissingRequiredPropertyException("GovernanceAccessArgs", "organizationId");
            }
            return $;
        }
    }

}
