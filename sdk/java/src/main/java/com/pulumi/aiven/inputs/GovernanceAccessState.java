// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aiven.inputs;

import com.pulumi.aiven.inputs.GovernanceAccessAccessDataArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GovernanceAccessState extends com.pulumi.resources.ResourceArgs {

    public static final GovernanceAccessState Empty = new GovernanceAccessState();

    /**
     * Details of the access. Changing this property forces recreation of the resource.
     * 
     */
    @Import(name="accessData")
    private @Nullable Output<GovernanceAccessAccessDataArgs> accessData;

    /**
     * @return Details of the access. Changing this property forces recreation of the resource.
     * 
     */
    public Optional<Output<GovernanceAccessAccessDataArgs>> accessData() {
        return Optional.ofNullable(this.accessData);
    }

    /**
     * The name to describe the access. Maximum length: `54`. Changing this property forces recreation of the resource.
     * 
     */
    @Import(name="accessName")
    private @Nullable Output<String> accessName;

    /**
     * @return The name to describe the access. Maximum length: `54`. Changing this property forces recreation of the resource.
     * 
     */
    public Optional<Output<String>> accessName() {
        return Optional.ofNullable(this.accessName);
    }

    /**
     * The type of access. The possible value is `KAFKA`. Changing this property forces recreation of the resource.
     * 
     */
    @Import(name="accessType")
    private @Nullable Output<String> accessType;

    /**
     * @return The type of access. The possible value is `KAFKA`. Changing this property forces recreation of the resource.
     * 
     */
    public Optional<Output<String>> accessType() {
        return Optional.ofNullable(this.accessType);
    }

    /**
     * The ID of the organization. Changing this property forces recreation of the resource.
     * 
     */
    @Import(name="organizationId")
    private @Nullable Output<String> organizationId;

    /**
     * @return The ID of the organization. Changing this property forces recreation of the resource.
     * 
     */
    public Optional<Output<String>> organizationId() {
        return Optional.ofNullable(this.organizationId);
    }

    /**
     * The ID of the user group that owns the access. Maximum length: `54`. Changing this property forces recreation of the resource.
     * 
     */
    @Import(name="ownerUserGroupId")
    private @Nullable Output<String> ownerUserGroupId;

    /**
     * @return The ID of the user group that owns the access. Maximum length: `54`. Changing this property forces recreation of the resource.
     * 
     */
    public Optional<Output<String>> ownerUserGroupId() {
        return Optional.ofNullable(this.ownerUserGroupId);
    }

    /**
     * The ID of the access.
     * 
     */
    @Import(name="susbcriptionId")
    private @Nullable Output<String> susbcriptionId;

    /**
     * @return The ID of the access.
     * 
     */
    public Optional<Output<String>> susbcriptionId() {
        return Optional.ofNullable(this.susbcriptionId);
    }

    private GovernanceAccessState() {}

    private GovernanceAccessState(GovernanceAccessState $) {
        this.accessData = $.accessData;
        this.accessName = $.accessName;
        this.accessType = $.accessType;
        this.organizationId = $.organizationId;
        this.ownerUserGroupId = $.ownerUserGroupId;
        this.susbcriptionId = $.susbcriptionId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GovernanceAccessState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GovernanceAccessState $;

        public Builder() {
            $ = new GovernanceAccessState();
        }

        public Builder(GovernanceAccessState defaults) {
            $ = new GovernanceAccessState(Objects.requireNonNull(defaults));
        }

        /**
         * @param accessData Details of the access. Changing this property forces recreation of the resource.
         * 
         * @return builder
         * 
         */
        public Builder accessData(@Nullable Output<GovernanceAccessAccessDataArgs> accessData) {
            $.accessData = accessData;
            return this;
        }

        /**
         * @param accessData Details of the access. Changing this property forces recreation of the resource.
         * 
         * @return builder
         * 
         */
        public Builder accessData(GovernanceAccessAccessDataArgs accessData) {
            return accessData(Output.of(accessData));
        }

        /**
         * @param accessName The name to describe the access. Maximum length: `54`. Changing this property forces recreation of the resource.
         * 
         * @return builder
         * 
         */
        public Builder accessName(@Nullable Output<String> accessName) {
            $.accessName = accessName;
            return this;
        }

        /**
         * @param accessName The name to describe the access. Maximum length: `54`. Changing this property forces recreation of the resource.
         * 
         * @return builder
         * 
         */
        public Builder accessName(String accessName) {
            return accessName(Output.of(accessName));
        }

        /**
         * @param accessType The type of access. The possible value is `KAFKA`. Changing this property forces recreation of the resource.
         * 
         * @return builder
         * 
         */
        public Builder accessType(@Nullable Output<String> accessType) {
            $.accessType = accessType;
            return this;
        }

        /**
         * @param accessType The type of access. The possible value is `KAFKA`. Changing this property forces recreation of the resource.
         * 
         * @return builder
         * 
         */
        public Builder accessType(String accessType) {
            return accessType(Output.of(accessType));
        }

        /**
         * @param organizationId The ID of the organization. Changing this property forces recreation of the resource.
         * 
         * @return builder
         * 
         */
        public Builder organizationId(@Nullable Output<String> organizationId) {
            $.organizationId = organizationId;
            return this;
        }

        /**
         * @param organizationId The ID of the organization. Changing this property forces recreation of the resource.
         * 
         * @return builder
         * 
         */
        public Builder organizationId(String organizationId) {
            return organizationId(Output.of(organizationId));
        }

        /**
         * @param ownerUserGroupId The ID of the user group that owns the access. Maximum length: `54`. Changing this property forces recreation of the resource.
         * 
         * @return builder
         * 
         */
        public Builder ownerUserGroupId(@Nullable Output<String> ownerUserGroupId) {
            $.ownerUserGroupId = ownerUserGroupId;
            return this;
        }

        /**
         * @param ownerUserGroupId The ID of the user group that owns the access. Maximum length: `54`. Changing this property forces recreation of the resource.
         * 
         * @return builder
         * 
         */
        public Builder ownerUserGroupId(String ownerUserGroupId) {
            return ownerUserGroupId(Output.of(ownerUserGroupId));
        }

        /**
         * @param susbcriptionId The ID of the access.
         * 
         * @return builder
         * 
         */
        public Builder susbcriptionId(@Nullable Output<String> susbcriptionId) {
            $.susbcriptionId = susbcriptionId;
            return this;
        }

        /**
         * @param susbcriptionId The ID of the access.
         * 
         * @return builder
         * 
         */
        public Builder susbcriptionId(String susbcriptionId) {
            return susbcriptionId(Output.of(susbcriptionId));
        }

        public GovernanceAccessState build() {
            return $;
        }
    }

}
