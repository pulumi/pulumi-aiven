// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aiven.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetServiceIntegrationEndpointArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetServiceIntegrationEndpointArgs Empty = new GetServiceIntegrationEndpointArgs();

    /**
     * Name of the service integration endpoint
     * 
     */
    @Import(name="endpointName", required=true)
    private Output<String> endpointName;

    /**
     * @return Name of the service integration endpoint
     * 
     */
    public Output<String> endpointName() {
        return this.endpointName;
    }

    /**
     * Project the service integration endpoint belongs to
     * 
     */
    @Import(name="project", required=true)
    private Output<String> project;

    /**
     * @return Project the service integration endpoint belongs to
     * 
     */
    public Output<String> project() {
        return this.project;
    }

    private GetServiceIntegrationEndpointArgs() {}

    private GetServiceIntegrationEndpointArgs(GetServiceIntegrationEndpointArgs $) {
        this.endpointName = $.endpointName;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetServiceIntegrationEndpointArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetServiceIntegrationEndpointArgs $;

        public Builder() {
            $ = new GetServiceIntegrationEndpointArgs();
        }

        public Builder(GetServiceIntegrationEndpointArgs defaults) {
            $ = new GetServiceIntegrationEndpointArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param endpointName Name of the service integration endpoint
         * 
         * @return builder
         * 
         */
        public Builder endpointName(Output<String> endpointName) {
            $.endpointName = endpointName;
            return this;
        }

        /**
         * @param endpointName Name of the service integration endpoint
         * 
         * @return builder
         * 
         */
        public Builder endpointName(String endpointName) {
            return endpointName(Output.of(endpointName));
        }

        /**
         * @param project Project the service integration endpoint belongs to
         * 
         * @return builder
         * 
         */
        public Builder project(Output<String> project) {
            $.project = project;
            return this;
        }

        /**
         * @param project Project the service integration endpoint belongs to
         * 
         * @return builder
         * 
         */
        public Builder project(String project) {
            return project(Output.of(project));
        }

        public GetServiceIntegrationEndpointArgs build() {
            $.endpointName = Objects.requireNonNull($.endpointName, "expected parameter 'endpointName' to be non-null");
            $.project = Objects.requireNonNull($.project, "expected parameter 'project' to be non-null");
            return $;
        }
    }

}