// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aiven.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetMysqlDatabaseArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetMysqlDatabaseArgs Empty = new GetMysqlDatabaseArgs();

    /**
     * The name of the service database. Changing this property forces recreation of the resource.
     * 
     */
    @Import(name="databaseName", required=true)
    private Output<String> databaseName;

    /**
     * @return The name of the service database. Changing this property forces recreation of the resource.
     * 
     */
    public Output<String> databaseName() {
        return this.databaseName;
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

    private GetMysqlDatabaseArgs() {}

    private GetMysqlDatabaseArgs(GetMysqlDatabaseArgs $) {
        this.databaseName = $.databaseName;
        this.project = $.project;
        this.serviceName = $.serviceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetMysqlDatabaseArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetMysqlDatabaseArgs $;

        public Builder() {
            $ = new GetMysqlDatabaseArgs();
        }

        public Builder(GetMysqlDatabaseArgs defaults) {
            $ = new GetMysqlDatabaseArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param databaseName The name of the service database. Changing this property forces recreation of the resource.
         * 
         * @return builder
         * 
         */
        public Builder databaseName(Output<String> databaseName) {
            $.databaseName = databaseName;
            return this;
        }

        /**
         * @param databaseName The name of the service database. Changing this property forces recreation of the resource.
         * 
         * @return builder
         * 
         */
        public Builder databaseName(String databaseName) {
            return databaseName(Output.of(databaseName));
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

        public GetMysqlDatabaseArgs build() {
            if ($.databaseName == null) {
                throw new MissingRequiredPropertyException("GetMysqlDatabaseArgs", "databaseName");
            }
            if ($.project == null) {
                throw new MissingRequiredPropertyException("GetMysqlDatabaseArgs", "project");
            }
            if ($.serviceName == null) {
                throw new MissingRequiredPropertyException("GetMysqlDatabaseArgs", "serviceName");
            }
            return $;
        }
    }

}