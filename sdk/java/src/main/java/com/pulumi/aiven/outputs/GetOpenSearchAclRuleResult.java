// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aiven.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetOpenSearchAclRuleResult {
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return The index pattern for this ACL rule. Maximum length: `249`. Changing this property forces recreation of the resource.
     * 
     */
    private String index;
    /**
     * @return The permissions for this ACL rule. The possible values are `admin`, `deny`, `read`, `readwrite` and `write`.
     * 
     */
    private String permission;
    /**
     * @return The name of the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
     * 
     */
    private String project;
    /**
     * @return The name of the service that this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
     * 
     */
    private String serviceName;
    /**
     * @return The username for the OpenSearch user this ACL rule applies to. Maximum length: `40`. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
     * 
     */
    private String username;

    private GetOpenSearchAclRuleResult() {}
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The index pattern for this ACL rule. Maximum length: `249`. Changing this property forces recreation of the resource.
     * 
     */
    public String index() {
        return this.index;
    }
    /**
     * @return The permissions for this ACL rule. The possible values are `admin`, `deny`, `read`, `readwrite` and `write`.
     * 
     */
    public String permission() {
        return this.permission;
    }
    /**
     * @return The name of the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
     * 
     */
    public String project() {
        return this.project;
    }
    /**
     * @return The name of the service that this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
     * 
     */
    public String serviceName() {
        return this.serviceName;
    }
    /**
     * @return The username for the OpenSearch user this ACL rule applies to. Maximum length: `40`. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
     * 
     */
    public String username() {
        return this.username;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetOpenSearchAclRuleResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private String index;
        private String permission;
        private String project;
        private String serviceName;
        private String username;
        public Builder() {}
        public Builder(GetOpenSearchAclRuleResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.index = defaults.index;
    	      this.permission = defaults.permission;
    	      this.project = defaults.project;
    	      this.serviceName = defaults.serviceName;
    	      this.username = defaults.username;
        }

        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetOpenSearchAclRuleResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder index(String index) {
            if (index == null) {
              throw new MissingRequiredPropertyException("GetOpenSearchAclRuleResult", "index");
            }
            this.index = index;
            return this;
        }
        @CustomType.Setter
        public Builder permission(String permission) {
            if (permission == null) {
              throw new MissingRequiredPropertyException("GetOpenSearchAclRuleResult", "permission");
            }
            this.permission = permission;
            return this;
        }
        @CustomType.Setter
        public Builder project(String project) {
            if (project == null) {
              throw new MissingRequiredPropertyException("GetOpenSearchAclRuleResult", "project");
            }
            this.project = project;
            return this;
        }
        @CustomType.Setter
        public Builder serviceName(String serviceName) {
            if (serviceName == null) {
              throw new MissingRequiredPropertyException("GetOpenSearchAclRuleResult", "serviceName");
            }
            this.serviceName = serviceName;
            return this;
        }
        @CustomType.Setter
        public Builder username(String username) {
            if (username == null) {
              throw new MissingRequiredPropertyException("GetOpenSearchAclRuleResult", "username");
            }
            this.username = username;
            return this;
        }
        public GetOpenSearchAclRuleResult build() {
            final var _resultValue = new GetOpenSearchAclRuleResult();
            _resultValue.id = id;
            _resultValue.index = index;
            _resultValue.permission = permission;
            _resultValue.project = project;
            _resultValue.serviceName = serviceName;
            _resultValue.username = username;
            return _resultValue;
        }
    }
}
