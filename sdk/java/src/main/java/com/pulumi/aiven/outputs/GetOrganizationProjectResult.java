// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aiven.outputs;

import com.pulumi.aiven.outputs.GetOrganizationProjectTag;
import com.pulumi.aiven.outputs.GetOrganizationProjectTimeouts;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetOrganizationProjectResult {
    /**
     * @return Valid port number (1-65535) to use as a base for service port allocation.
     * 
     */
    private Integer basePort;
    /**
     * @return Billing group ID to assign to the project. It&#39;s required when moving projects between organizations.
     * 
     */
    private String billingGroupId;
    /**
     * @return PEM encoded certificate.
     * 
     */
    private String caCert;
    /**
     * @return Resource ID, a composite of `organization_id` and `project_id` IDs.
     * 
     */
    private String id;
    /**
     * @return ID of an organization.
     * 
     */
    private String organizationId;
    /**
     * @return Link a project to an [organization or organizational unit](https://aiven.io/docs/platform/concepts/orgs-units-projects) by using its ID. To set up proper dependencies please refer to this variable as a reference.
     * 
     */
    private String parentId;
    /**
     * @return The name of the project. Names must be globally unique among all Aiven customers. Names must begin with a letter (a-z), and consist of letters, numbers, and dashes. It&#39;s recommended to use a random string or your organization name as a prefix or suffix. Changing this property forces recreation of the resource.
     * 
     */
    private String projectId;
    /**
     * @return Tags are key-value pairs that allow you to categorize projects.
     * 
     */
    private @Nullable List<GetOrganizationProjectTag> tags;
    /**
     * @return The email addresses for [project contacts](https://aiven.io/docs/platform/howto/technical-emails), who will receive important alerts and updates about this project and its services. You can also set email contacts at the service level. It&#39;s good practice to keep these up-to-date to be aware of any potential issues with your project.
     * 
     */
    private List<String> technicalEmails;
    private @Nullable GetOrganizationProjectTimeouts timeouts;

    private GetOrganizationProjectResult() {}
    /**
     * @return Valid port number (1-65535) to use as a base for service port allocation.
     * 
     */
    public Integer basePort() {
        return this.basePort;
    }
    /**
     * @return Billing group ID to assign to the project. It&#39;s required when moving projects between organizations.
     * 
     */
    public String billingGroupId() {
        return this.billingGroupId;
    }
    /**
     * @return PEM encoded certificate.
     * 
     */
    public String caCert() {
        return this.caCert;
    }
    /**
     * @return Resource ID, a composite of `organization_id` and `project_id` IDs.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return ID of an organization.
     * 
     */
    public String organizationId() {
        return this.organizationId;
    }
    /**
     * @return Link a project to an [organization or organizational unit](https://aiven.io/docs/platform/concepts/orgs-units-projects) by using its ID. To set up proper dependencies please refer to this variable as a reference.
     * 
     */
    public String parentId() {
        return this.parentId;
    }
    /**
     * @return The name of the project. Names must be globally unique among all Aiven customers. Names must begin with a letter (a-z), and consist of letters, numbers, and dashes. It&#39;s recommended to use a random string or your organization name as a prefix or suffix. Changing this property forces recreation of the resource.
     * 
     */
    public String projectId() {
        return this.projectId;
    }
    /**
     * @return Tags are key-value pairs that allow you to categorize projects.
     * 
     */
    public List<GetOrganizationProjectTag> tags() {
        return this.tags == null ? List.of() : this.tags;
    }
    /**
     * @return The email addresses for [project contacts](https://aiven.io/docs/platform/howto/technical-emails), who will receive important alerts and updates about this project and its services. You can also set email contacts at the service level. It&#39;s good practice to keep these up-to-date to be aware of any potential issues with your project.
     * 
     */
    public List<String> technicalEmails() {
        return this.technicalEmails;
    }
    public Optional<GetOrganizationProjectTimeouts> timeouts() {
        return Optional.ofNullable(this.timeouts);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetOrganizationProjectResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer basePort;
        private String billingGroupId;
        private String caCert;
        private String id;
        private String organizationId;
        private String parentId;
        private String projectId;
        private @Nullable List<GetOrganizationProjectTag> tags;
        private List<String> technicalEmails;
        private @Nullable GetOrganizationProjectTimeouts timeouts;
        public Builder() {}
        public Builder(GetOrganizationProjectResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.basePort = defaults.basePort;
    	      this.billingGroupId = defaults.billingGroupId;
    	      this.caCert = defaults.caCert;
    	      this.id = defaults.id;
    	      this.organizationId = defaults.organizationId;
    	      this.parentId = defaults.parentId;
    	      this.projectId = defaults.projectId;
    	      this.tags = defaults.tags;
    	      this.technicalEmails = defaults.technicalEmails;
    	      this.timeouts = defaults.timeouts;
        }

        @CustomType.Setter
        public Builder basePort(Integer basePort) {
            if (basePort == null) {
              throw new MissingRequiredPropertyException("GetOrganizationProjectResult", "basePort");
            }
            this.basePort = basePort;
            return this;
        }
        @CustomType.Setter
        public Builder billingGroupId(String billingGroupId) {
            if (billingGroupId == null) {
              throw new MissingRequiredPropertyException("GetOrganizationProjectResult", "billingGroupId");
            }
            this.billingGroupId = billingGroupId;
            return this;
        }
        @CustomType.Setter
        public Builder caCert(String caCert) {
            if (caCert == null) {
              throw new MissingRequiredPropertyException("GetOrganizationProjectResult", "caCert");
            }
            this.caCert = caCert;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetOrganizationProjectResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder organizationId(String organizationId) {
            if (organizationId == null) {
              throw new MissingRequiredPropertyException("GetOrganizationProjectResult", "organizationId");
            }
            this.organizationId = organizationId;
            return this;
        }
        @CustomType.Setter
        public Builder parentId(String parentId) {
            if (parentId == null) {
              throw new MissingRequiredPropertyException("GetOrganizationProjectResult", "parentId");
            }
            this.parentId = parentId;
            return this;
        }
        @CustomType.Setter
        public Builder projectId(String projectId) {
            if (projectId == null) {
              throw new MissingRequiredPropertyException("GetOrganizationProjectResult", "projectId");
            }
            this.projectId = projectId;
            return this;
        }
        @CustomType.Setter
        public Builder tags(@Nullable List<GetOrganizationProjectTag> tags) {

            this.tags = tags;
            return this;
        }
        public Builder tags(GetOrganizationProjectTag... tags) {
            return tags(List.of(tags));
        }
        @CustomType.Setter
        public Builder technicalEmails(List<String> technicalEmails) {
            if (technicalEmails == null) {
              throw new MissingRequiredPropertyException("GetOrganizationProjectResult", "technicalEmails");
            }
            this.technicalEmails = technicalEmails;
            return this;
        }
        public Builder technicalEmails(String... technicalEmails) {
            return technicalEmails(List.of(technicalEmails));
        }
        @CustomType.Setter
        public Builder timeouts(@Nullable GetOrganizationProjectTimeouts timeouts) {

            this.timeouts = timeouts;
            return this;
        }
        public GetOrganizationProjectResult build() {
            final var _resultValue = new GetOrganizationProjectResult();
            _resultValue.basePort = basePort;
            _resultValue.billingGroupId = billingGroupId;
            _resultValue.caCert = caCert;
            _resultValue.id = id;
            _resultValue.organizationId = organizationId;
            _resultValue.parentId = parentId;
            _resultValue.projectId = projectId;
            _resultValue.tags = tags;
            _resultValue.technicalEmails = technicalEmails;
            _resultValue.timeouts = timeouts;
            return _resultValue;
        }
    }
}
