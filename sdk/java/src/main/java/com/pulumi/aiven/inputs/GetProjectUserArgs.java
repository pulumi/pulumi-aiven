// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aiven.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetProjectUserArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetProjectUserArgs Empty = new GetProjectUserArgs();

    /**
     * Email address of the user. This property cannot be changed, doing so forces recreation of the resource.
     * 
     */
    @Import(name="email", required=true)
    private Output<String> email;

    /**
     * @return Email address of the user. This property cannot be changed, doing so forces recreation of the resource.
     * 
     */
    public Output<String> email() {
        return this.email;
    }

    /**
     * Identifies the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. This property cannot be changed, doing so forces recreation of the resource.
     * 
     */
    @Import(name="project", required=true)
    private Output<String> project;

    /**
     * @return Identifies the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. This property cannot be changed, doing so forces recreation of the resource.
     * 
     */
    public Output<String> project() {
        return this.project;
    }

    private GetProjectUserArgs() {}

    private GetProjectUserArgs(GetProjectUserArgs $) {
        this.email = $.email;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetProjectUserArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetProjectUserArgs $;

        public Builder() {
            $ = new GetProjectUserArgs();
        }

        public Builder(GetProjectUserArgs defaults) {
            $ = new GetProjectUserArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param email Email address of the user. This property cannot be changed, doing so forces recreation of the resource.
         * 
         * @return builder
         * 
         */
        public Builder email(Output<String> email) {
            $.email = email;
            return this;
        }

        /**
         * @param email Email address of the user. This property cannot be changed, doing so forces recreation of the resource.
         * 
         * @return builder
         * 
         */
        public Builder email(String email) {
            return email(Output.of(email));
        }

        /**
         * @param project Identifies the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. This property cannot be changed, doing so forces recreation of the resource.
         * 
         * @return builder
         * 
         */
        public Builder project(Output<String> project) {
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

        public GetProjectUserArgs build() {
            $.email = Objects.requireNonNull($.email, "expected parameter 'email' to be non-null");
            $.project = Objects.requireNonNull($.project, "expected parameter 'project' to be non-null");
            return $;
        }
    }

}