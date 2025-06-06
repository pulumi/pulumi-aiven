// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aiven.inputs;

import com.pulumi.aiven.inputs.GovernanceAccessAccessDataAclArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GovernanceAccessAccessDataArgs extends com.pulumi.resources.ResourceArgs {

    public static final GovernanceAccessAccessDataArgs Empty = new GovernanceAccessAccessDataArgs();

    /**
     * Required property. Acls. Changing this property forces recreation of the resource.
     * 
     */
    @Import(name="acls")
    private @Nullable Output<List<GovernanceAccessAccessDataAclArgs>> acls;

    /**
     * @return Required property. Acls. Changing this property forces recreation of the resource.
     * 
     */
    public Optional<Output<List<GovernanceAccessAccessDataAclArgs>>> acls() {
        return Optional.ofNullable(this.acls);
    }

    /**
     * Project name. Changing this property forces recreation of the resource.
     * 
     */
    @Import(name="project", required=true)
    private Output<String> project;

    /**
     * @return Project name. Changing this property forces recreation of the resource.
     * 
     */
    public Output<String> project() {
        return this.project;
    }

    /**
     * Service name. Changing this property forces recreation of the resource.
     * 
     */
    @Import(name="serviceName", required=true)
    private Output<String> serviceName;

    /**
     * @return Service name. Changing this property forces recreation of the resource.
     * 
     */
    public Output<String> serviceName() {
        return this.serviceName;
    }

    /**
     * The service username assigned to the access. Changing this property forces recreation of the resource.
     * 
     */
    @Import(name="username")
    private @Nullable Output<String> username;

    /**
     * @return The service username assigned to the access. Changing this property forces recreation of the resource.
     * 
     */
    public Optional<Output<String>> username() {
        return Optional.ofNullable(this.username);
    }

    private GovernanceAccessAccessDataArgs() {}

    private GovernanceAccessAccessDataArgs(GovernanceAccessAccessDataArgs $) {
        this.acls = $.acls;
        this.project = $.project;
        this.serviceName = $.serviceName;
        this.username = $.username;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GovernanceAccessAccessDataArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GovernanceAccessAccessDataArgs $;

        public Builder() {
            $ = new GovernanceAccessAccessDataArgs();
        }

        public Builder(GovernanceAccessAccessDataArgs defaults) {
            $ = new GovernanceAccessAccessDataArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param acls Required property. Acls. Changing this property forces recreation of the resource.
         * 
         * @return builder
         * 
         */
        public Builder acls(@Nullable Output<List<GovernanceAccessAccessDataAclArgs>> acls) {
            $.acls = acls;
            return this;
        }

        /**
         * @param acls Required property. Acls. Changing this property forces recreation of the resource.
         * 
         * @return builder
         * 
         */
        public Builder acls(List<GovernanceAccessAccessDataAclArgs> acls) {
            return acls(Output.of(acls));
        }

        /**
         * @param acls Required property. Acls. Changing this property forces recreation of the resource.
         * 
         * @return builder
         * 
         */
        public Builder acls(GovernanceAccessAccessDataAclArgs... acls) {
            return acls(List.of(acls));
        }

        /**
         * @param project Project name. Changing this property forces recreation of the resource.
         * 
         * @return builder
         * 
         */
        public Builder project(Output<String> project) {
            $.project = project;
            return this;
        }

        /**
         * @param project Project name. Changing this property forces recreation of the resource.
         * 
         * @return builder
         * 
         */
        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param serviceName Service name. Changing this property forces recreation of the resource.
         * 
         * @return builder
         * 
         */
        public Builder serviceName(Output<String> serviceName) {
            $.serviceName = serviceName;
            return this;
        }

        /**
         * @param serviceName Service name. Changing this property forces recreation of the resource.
         * 
         * @return builder
         * 
         */
        public Builder serviceName(String serviceName) {
            return serviceName(Output.of(serviceName));
        }

        /**
         * @param username The service username assigned to the access. Changing this property forces recreation of the resource.
         * 
         * @return builder
         * 
         */
        public Builder username(@Nullable Output<String> username) {
            $.username = username;
            return this;
        }

        /**
         * @param username The service username assigned to the access. Changing this property forces recreation of the resource.
         * 
         * @return builder
         * 
         */
        public Builder username(String username) {
            return username(Output.of(username));
        }

        public GovernanceAccessAccessDataArgs build() {
            if ($.project == null) {
                throw new MissingRequiredPropertyException("GovernanceAccessAccessDataArgs", "project");
            }
            if ($.serviceName == null) {
                throw new MissingRequiredPropertyException("GovernanceAccessAccessDataArgs", "serviceName");
            }
            return $;
        }
    }

}
