// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aiven.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetProjectVpcArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetProjectVpcArgs Empty = new GetProjectVpcArgs();

    /**
     * The cloud provider and region where the service is hosted in the format `CLOUD_PROVIDER-REGION_NAME`. For example, `google-europe-west1` or `aws-us-east-2`.
     * 
     */
    @Import(name="cloudName")
    private @Nullable Output<String> cloudName;

    /**
     * @return The cloud provider and region where the service is hosted in the format `CLOUD_PROVIDER-REGION_NAME`. For example, `google-europe-west1` or `aws-us-east-2`.
     * 
     */
    public Optional<Output<String>> cloudName() {
        return Optional.ofNullable(this.cloudName);
    }

    /**
     * Identifies the project this resource belongs to.
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    /**
     * @return Identifies the project this resource belongs to.
     * 
     */
    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * The ID of the VPC. This can be used to filter out the other VPCs if there are more than one for the project and cloud.
     * 
     */
    @Import(name="vpcId")
    private @Nullable Output<String> vpcId;

    /**
     * @return The ID of the VPC. This can be used to filter out the other VPCs if there are more than one for the project and cloud.
     * 
     */
    public Optional<Output<String>> vpcId() {
        return Optional.ofNullable(this.vpcId);
    }

    private GetProjectVpcArgs() {}

    private GetProjectVpcArgs(GetProjectVpcArgs $) {
        this.cloudName = $.cloudName;
        this.project = $.project;
        this.vpcId = $.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetProjectVpcArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetProjectVpcArgs $;

        public Builder() {
            $ = new GetProjectVpcArgs();
        }

        public Builder(GetProjectVpcArgs defaults) {
            $ = new GetProjectVpcArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param cloudName The cloud provider and region where the service is hosted in the format `CLOUD_PROVIDER-REGION_NAME`. For example, `google-europe-west1` or `aws-us-east-2`.
         * 
         * @return builder
         * 
         */
        public Builder cloudName(@Nullable Output<String> cloudName) {
            $.cloudName = cloudName;
            return this;
        }

        /**
         * @param cloudName The cloud provider and region where the service is hosted in the format `CLOUD_PROVIDER-REGION_NAME`. For example, `google-europe-west1` or `aws-us-east-2`.
         * 
         * @return builder
         * 
         */
        public Builder cloudName(String cloudName) {
            return cloudName(Output.of(cloudName));
        }

        /**
         * @param project Identifies the project this resource belongs to.
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        /**
         * @param project Identifies the project this resource belongs to.
         * 
         * @return builder
         * 
         */
        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param vpcId The ID of the VPC. This can be used to filter out the other VPCs if there are more than one for the project and cloud.
         * 
         * @return builder
         * 
         */
        public Builder vpcId(@Nullable Output<String> vpcId) {
            $.vpcId = vpcId;
            return this;
        }

        /**
         * @param vpcId The ID of the VPC. This can be used to filter out the other VPCs if there are more than one for the project and cloud.
         * 
         * @return builder
         * 
         */
        public Builder vpcId(String vpcId) {
            return vpcId(Output.of(vpcId));
        }

        public GetProjectVpcArgs build() {
            return $;
        }
    }

}