// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aiven.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetFlinkApplicationVersionArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetFlinkApplicationVersionArgs Empty = new GetFlinkApplicationVersionArgs();

    /**
     * Application ID
     * 
     */
    @Import(name="applicationId", required=true)
    private Output<String> applicationId;

    /**
     * @return Application ID
     * 
     */
    public Output<String> applicationId() {
        return this.applicationId;
    }

    /**
     * Application version ID
     * 
     */
    @Import(name="applicationVersionId", required=true)
    private Output<String> applicationVersionId;

    /**
     * @return Application version ID
     * 
     */
    public Output<String> applicationVersionId() {
        return this.applicationVersionId;
    }

    /**
     * The name of the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
     * 
     */
    @Import(name="project", required=true)
    private Output<String> project;

    /**
     * @return The name of the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
     * 
     */
    public Output<String> project() {
        return this.project;
    }

    /**
     * The name of the service that this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
     * 
     */
    @Import(name="serviceName", required=true)
    private Output<String> serviceName;

    /**
     * @return The name of the service that this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
     * 
     */
    public Output<String> serviceName() {
        return this.serviceName;
    }

    private GetFlinkApplicationVersionArgs() {}

    private GetFlinkApplicationVersionArgs(GetFlinkApplicationVersionArgs $) {
        this.applicationId = $.applicationId;
        this.applicationVersionId = $.applicationVersionId;
        this.project = $.project;
        this.serviceName = $.serviceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetFlinkApplicationVersionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetFlinkApplicationVersionArgs $;

        public Builder() {
            $ = new GetFlinkApplicationVersionArgs();
        }

        public Builder(GetFlinkApplicationVersionArgs defaults) {
            $ = new GetFlinkApplicationVersionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param applicationId Application ID
         * 
         * @return builder
         * 
         */
        public Builder applicationId(Output<String> applicationId) {
            $.applicationId = applicationId;
            return this;
        }

        /**
         * @param applicationId Application ID
         * 
         * @return builder
         * 
         */
        public Builder applicationId(String applicationId) {
            return applicationId(Output.of(applicationId));
        }

        /**
         * @param applicationVersionId Application version ID
         * 
         * @return builder
         * 
         */
        public Builder applicationVersionId(Output<String> applicationVersionId) {
            $.applicationVersionId = applicationVersionId;
            return this;
        }

        /**
         * @param applicationVersionId Application version ID
         * 
         * @return builder
         * 
         */
        public Builder applicationVersionId(String applicationVersionId) {
            return applicationVersionId(Output.of(applicationVersionId));
        }

        /**
         * @param project The name of the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
         * 
         * @return builder
         * 
         */
        public Builder project(Output<String> project) {
            $.project = project;
            return this;
        }

        /**
         * @param project The name of the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
         * 
         * @return builder
         * 
         */
        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param serviceName The name of the service that this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
         * 
         * @return builder
         * 
         */
        public Builder serviceName(Output<String> serviceName) {
            $.serviceName = serviceName;
            return this;
        }

        /**
         * @param serviceName The name of the service that this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
         * 
         * @return builder
         * 
         */
        public Builder serviceName(String serviceName) {
            return serviceName(Output.of(serviceName));
        }

        public GetFlinkApplicationVersionArgs build() {
            if ($.applicationId == null) {
                throw new MissingRequiredPropertyException("GetFlinkApplicationVersionArgs", "applicationId");
            }
            if ($.applicationVersionId == null) {
                throw new MissingRequiredPropertyException("GetFlinkApplicationVersionArgs", "applicationVersionId");
            }
            if ($.project == null) {
                throw new MissingRequiredPropertyException("GetFlinkApplicationVersionArgs", "project");
            }
            if ($.serviceName == null) {
                throw new MissingRequiredPropertyException("GetFlinkApplicationVersionArgs", "serviceName");
            }
            return $;
        }
    }

}