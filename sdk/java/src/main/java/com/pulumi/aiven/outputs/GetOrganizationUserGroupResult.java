// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aiven.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetOrganizationUserGroupResult {
    /**
     * @return Time of creation.
     * 
     */
    private String createTime;
    /**
     * @return The description of the user group. Changing this property forces recreation of the resource.
     * 
     */
    private String description;
    /**
     * @return The ID of the user group.
     * 
     */
    private String groupId;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return The name of the user group. Changing this property forces recreation of the resource.
     * 
     */
    private String name;
    /**
     * @return The ID of the organization. Changing this property forces recreation of the resource.
     * 
     */
    private String organizationId;
    /**
     * @return Time of last update.
     * 
     */
    private String updateTime;

    private GetOrganizationUserGroupResult() {}
    /**
     * @return Time of creation.
     * 
     */
    public String createTime() {
        return this.createTime;
    }
    /**
     * @return The description of the user group. Changing this property forces recreation of the resource.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return The ID of the user group.
     * 
     */
    public String groupId() {
        return this.groupId;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The name of the user group. Changing this property forces recreation of the resource.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The ID of the organization. Changing this property forces recreation of the resource.
     * 
     */
    public String organizationId() {
        return this.organizationId;
    }
    /**
     * @return Time of last update.
     * 
     */
    public String updateTime() {
        return this.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetOrganizationUserGroupResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String createTime;
        private String description;
        private String groupId;
        private String id;
        private String name;
        private String organizationId;
        private String updateTime;
        public Builder() {}
        public Builder(GetOrganizationUserGroupResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createTime = defaults.createTime;
    	      this.description = defaults.description;
    	      this.groupId = defaults.groupId;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.organizationId = defaults.organizationId;
    	      this.updateTime = defaults.updateTime;
        }

        @CustomType.Setter
        public Builder createTime(String createTime) {
            if (createTime == null) {
              throw new MissingRequiredPropertyException("GetOrganizationUserGroupResult", "createTime");
            }
            this.createTime = createTime;
            return this;
        }
        @CustomType.Setter
        public Builder description(String description) {
            if (description == null) {
              throw new MissingRequiredPropertyException("GetOrganizationUserGroupResult", "description");
            }
            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder groupId(String groupId) {
            if (groupId == null) {
              throw new MissingRequiredPropertyException("GetOrganizationUserGroupResult", "groupId");
            }
            this.groupId = groupId;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetOrganizationUserGroupResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetOrganizationUserGroupResult", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder organizationId(String organizationId) {
            if (organizationId == null) {
              throw new MissingRequiredPropertyException("GetOrganizationUserGroupResult", "organizationId");
            }
            this.organizationId = organizationId;
            return this;
        }
        @CustomType.Setter
        public Builder updateTime(String updateTime) {
            if (updateTime == null) {
              throw new MissingRequiredPropertyException("GetOrganizationUserGroupResult", "updateTime");
            }
            this.updateTime = updateTime;
            return this;
        }
        public GetOrganizationUserGroupResult build() {
            final var _resultValue = new GetOrganizationUserGroupResult();
            _resultValue.createTime = createTime;
            _resultValue.description = description;
            _resultValue.groupId = groupId;
            _resultValue.id = id;
            _resultValue.name = name;
            _resultValue.organizationId = organizationId;
            _resultValue.updateTime = updateTime;
            return _resultValue;
        }
    }
}