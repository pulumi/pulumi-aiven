// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aiven.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ProjectVpcState extends com.pulumi.resources.ResourceArgs {

    public static final ProjectVpcState Empty = new ProjectVpcState();

    /**
     * Defines where the cloud provider and region where the service is hosted in. See the Service resource for additional information. This property cannot be changed, doing so forces recreation of the resource.
     * 
     */
    @Import(name="cloudName")
    private @Nullable Output<String> cloudName;

    /**
     * @return Defines where the cloud provider and region where the service is hosted in. See the Service resource for additional information. This property cannot be changed, doing so forces recreation of the resource.
     * 
     */
    public Optional<Output<String>> cloudName() {
        return Optional.ofNullable(this.cloudName);
    }

    /**
     * Network address range used by the VPC like 192.168.0.0/24
     * 
     */
    @Import(name="networkCidr")
    private @Nullable Output<String> networkCidr;

    /**
     * @return Network address range used by the VPC like 192.168.0.0/24
     * 
     */
    public Optional<Output<String>> networkCidr() {
        return Optional.ofNullable(this.networkCidr);
    }

    /**
     * Identifies the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. This property cannot be changed, doing so forces recreation of the resource.
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    /**
     * @return Identifies the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. This property cannot be changed, doing so forces recreation of the resource.
     * 
     */
    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * State of the VPC. The possible values are `APPROVED`, `ACTIVE`, `DELETING` and `DELETED`.
     * 
     */
    @Import(name="state")
    private @Nullable Output<String> state;

    /**
     * @return State of the VPC. The possible values are `APPROVED`, `ACTIVE`, `DELETING` and `DELETED`.
     * 
     */
    public Optional<Output<String>> state() {
        return Optional.ofNullable(this.state);
    }

    private ProjectVpcState() {}

    private ProjectVpcState(ProjectVpcState $) {
        this.cloudName = $.cloudName;
        this.networkCidr = $.networkCidr;
        this.project = $.project;
        this.state = $.state;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ProjectVpcState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ProjectVpcState $;

        public Builder() {
            $ = new ProjectVpcState();
        }

        public Builder(ProjectVpcState defaults) {
            $ = new ProjectVpcState(Objects.requireNonNull(defaults));
        }

        /**
         * @param cloudName Defines where the cloud provider and region where the service is hosted in. See the Service resource for additional information. This property cannot be changed, doing so forces recreation of the resource.
         * 
         * @return builder
         * 
         */
        public Builder cloudName(@Nullable Output<String> cloudName) {
            $.cloudName = cloudName;
            return this;
        }

        /**
         * @param cloudName Defines where the cloud provider and region where the service is hosted in. See the Service resource for additional information. This property cannot be changed, doing so forces recreation of the resource.
         * 
         * @return builder
         * 
         */
        public Builder cloudName(String cloudName) {
            return cloudName(Output.of(cloudName));
        }

        /**
         * @param networkCidr Network address range used by the VPC like 192.168.0.0/24
         * 
         * @return builder
         * 
         */
        public Builder networkCidr(@Nullable Output<String> networkCidr) {
            $.networkCidr = networkCidr;
            return this;
        }

        /**
         * @param networkCidr Network address range used by the VPC like 192.168.0.0/24
         * 
         * @return builder
         * 
         */
        public Builder networkCidr(String networkCidr) {
            return networkCidr(Output.of(networkCidr));
        }

        /**
         * @param project Identifies the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. This property cannot be changed, doing so forces recreation of the resource.
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        /**
         * @param project Identifies the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. This property cannot be changed, doing so forces recreation of the resource.
         * 
         * @return builder
         * 
         */
        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param state State of the VPC. The possible values are `APPROVED`, `ACTIVE`, `DELETING` and `DELETED`.
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable Output<String> state) {
            $.state = state;
            return this;
        }

        /**
         * @param state State of the VPC. The possible values are `APPROVED`, `ACTIVE`, `DELETING` and `DELETED`.
         * 
         * @return builder
         * 
         */
        public Builder state(String state) {
            return state(Output.of(state));
        }

        public ProjectVpcState build() {
            return $;
        }
    }

}