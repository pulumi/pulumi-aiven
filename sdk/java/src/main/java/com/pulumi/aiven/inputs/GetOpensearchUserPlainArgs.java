// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aiven.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetOpensearchUserPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetOpensearchUserPlainArgs Empty = new GetOpensearchUserPlainArgs();

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

    /**
     * Name of the OpenSearch service user. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
     * 
     */
    @Import(name="username", required=true)
    private String username;

    /**
     * @return Name of the OpenSearch service user. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
     * 
     */
    public String username() {
        return this.username;
    }

    private GetOpensearchUserPlainArgs() {}

    private GetOpensearchUserPlainArgs(GetOpensearchUserPlainArgs $) {
        this.project = $.project;
        this.serviceName = $.serviceName;
        this.username = $.username;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetOpensearchUserPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetOpensearchUserPlainArgs $;

        public Builder() {
            $ = new GetOpensearchUserPlainArgs();
        }

        public Builder(GetOpensearchUserPlainArgs defaults) {
            $ = new GetOpensearchUserPlainArgs(Objects.requireNonNull(defaults));
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

        /**
         * @param username Name of the OpenSearch service user. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
         * 
         * @return builder
         * 
         */
        public Builder username(String username) {
            $.username = username;
            return this;
        }

        public GetOpensearchUserPlainArgs build() {
            if ($.project == null) {
                throw new MissingRequiredPropertyException("GetOpensearchUserPlainArgs", "project");
            }
            if ($.serviceName == null) {
                throw new MissingRequiredPropertyException("GetOpensearchUserPlainArgs", "serviceName");
            }
            if ($.username == null) {
                throw new MissingRequiredPropertyException("GetOpensearchUserPlainArgs", "username");
            }
            return $;
        }
    }

}
