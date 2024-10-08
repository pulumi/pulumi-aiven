// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aiven.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetClickhouseDatabasePlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetClickhouseDatabasePlainArgs Empty = new GetClickhouseDatabasePlainArgs();

    /**
     * The name of the ClickHouse database. Changing this property forces recreation of the resource.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return The name of the ClickHouse database. Changing this property forces recreation of the resource.
     * 
     */
    public String name() {
        return this.name;
    }

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

    private GetClickhouseDatabasePlainArgs() {}

    private GetClickhouseDatabasePlainArgs(GetClickhouseDatabasePlainArgs $) {
        this.name = $.name;
        this.project = $.project;
        this.serviceName = $.serviceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetClickhouseDatabasePlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetClickhouseDatabasePlainArgs $;

        public Builder() {
            $ = new GetClickhouseDatabasePlainArgs();
        }

        public Builder(GetClickhouseDatabasePlainArgs defaults) {
            $ = new GetClickhouseDatabasePlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of the ClickHouse database. Changing this property forces recreation of the resource.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
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

        public GetClickhouseDatabasePlainArgs build() {
            if ($.name == null) {
                throw new MissingRequiredPropertyException("GetClickhouseDatabasePlainArgs", "name");
            }
            if ($.project == null) {
                throw new MissingRequiredPropertyException("GetClickhouseDatabasePlainArgs", "project");
            }
            if ($.serviceName == null) {
                throw new MissingRequiredPropertyException("GetClickhouseDatabasePlainArgs", "serviceName");
            }
            return $;
        }
    }

}
