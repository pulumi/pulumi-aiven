// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aiven.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetInfluxdbDatabasePlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetInfluxdbDatabasePlainArgs Empty = new GetInfluxdbDatabasePlainArgs();

    @Import(name="databaseName", required=true)
    private String databaseName;

    public String databaseName() {
        return this.databaseName;
    }

    @Import(name="project", required=true)
    private String project;

    public String project() {
        return this.project;
    }

    @Import(name="serviceName", required=true)
    private String serviceName;

    public String serviceName() {
        return this.serviceName;
    }

    private GetInfluxdbDatabasePlainArgs() {}

    private GetInfluxdbDatabasePlainArgs(GetInfluxdbDatabasePlainArgs $) {
        this.databaseName = $.databaseName;
        this.project = $.project;
        this.serviceName = $.serviceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetInfluxdbDatabasePlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetInfluxdbDatabasePlainArgs $;

        public Builder() {
            $ = new GetInfluxdbDatabasePlainArgs();
        }

        public Builder(GetInfluxdbDatabasePlainArgs defaults) {
            $ = new GetInfluxdbDatabasePlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder databaseName(String databaseName) {
            $.databaseName = databaseName;
            return this;
        }

        public Builder project(String project) {
            $.project = project;
            return this;
        }

        public Builder serviceName(String serviceName) {
            $.serviceName = serviceName;
            return this;
        }

        public GetInfluxdbDatabasePlainArgs build() {
            if ($.databaseName == null) {
                throw new MissingRequiredPropertyException("GetInfluxdbDatabasePlainArgs", "databaseName");
            }
            if ($.project == null) {
                throw new MissingRequiredPropertyException("GetInfluxdbDatabasePlainArgs", "project");
            }
            if ($.serviceName == null) {
                throw new MissingRequiredPropertyException("GetInfluxdbDatabasePlainArgs", "serviceName");
            }
            return $;
        }
    }

}