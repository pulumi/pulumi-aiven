// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aiven.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetOpenSearchAclConfigPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetOpenSearchAclConfigPlainArgs Empty = new GetOpenSearchAclConfigPlainArgs();

    /**
     * The name of the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
     * 
     */
    @Import(name="project", required=true)
    private String project;

    /**
     * @return The name of the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
     * 
     */
    public String project() {
        return this.project;
    }

    /**
     * The name of the service that this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
     * 
     */
    @Import(name="serviceName", required=true)
    private String serviceName;

    /**
     * @return The name of the service that this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
     * 
     */
    public String serviceName() {
        return this.serviceName;
    }

    private GetOpenSearchAclConfigPlainArgs() {}

    private GetOpenSearchAclConfigPlainArgs(GetOpenSearchAclConfigPlainArgs $) {
        this.project = $.project;
        this.serviceName = $.serviceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetOpenSearchAclConfigPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetOpenSearchAclConfigPlainArgs $;

        public Builder() {
            $ = new GetOpenSearchAclConfigPlainArgs();
        }

        public Builder(GetOpenSearchAclConfigPlainArgs defaults) {
            $ = new GetOpenSearchAclConfigPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param project The name of the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
         * 
         * @return builder
         * 
         */
        public Builder project(String project) {
            $.project = project;
            return this;
        }

        /**
         * @param serviceName The name of the service that this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
         * 
         * @return builder
         * 
         */
        public Builder serviceName(String serviceName) {
            $.serviceName = serviceName;
            return this;
        }

        public GetOpenSearchAclConfigPlainArgs build() {
            if ($.project == null) {
                throw new MissingRequiredPropertyException("GetOpenSearchAclConfigPlainArgs", "project");
            }
            if ($.serviceName == null) {
                throw new MissingRequiredPropertyException("GetOpenSearchAclConfigPlainArgs", "serviceName");
            }
            return $;
        }
    }

}
