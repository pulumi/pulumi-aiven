// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aiven.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetProjectArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetProjectArgs Empty = new GetProjectArgs();

    /**
     * The name of the project. Names must be globally unique among all Aiven customers and cannot be changed later without destroying and re-creating the project, including all sub-resources.
     * 
     */
    @Import(name="project", required=true)
    private Output<String> project;

    /**
     * @return The name of the project. Names must be globally unique among all Aiven customers and cannot be changed later without destroying and re-creating the project, including all sub-resources.
     * 
     */
    public Output<String> project() {
        return this.project;
    }

    private GetProjectArgs() {}

    private GetProjectArgs(GetProjectArgs $) {
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetProjectArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetProjectArgs $;

        public Builder() {
            $ = new GetProjectArgs();
        }

        public Builder(GetProjectArgs defaults) {
            $ = new GetProjectArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param project The name of the project. Names must be globally unique among all Aiven customers and cannot be changed later without destroying and re-creating the project, including all sub-resources.
         * 
         * @return builder
         * 
         */
        public Builder project(Output<String> project) {
            $.project = project;
            return this;
        }

        /**
         * @param project The name of the project. Names must be globally unique among all Aiven customers and cannot be changed later without destroying and re-creating the project, including all sub-resources.
         * 
         * @return builder
         * 
         */
        public Builder project(String project) {
            return project(Output.of(project));
        }

        public GetProjectArgs build() {
            if ($.project == null) {
                throw new MissingRequiredPropertyException("GetProjectArgs", "project");
            }
            return $;
        }
    }

}
