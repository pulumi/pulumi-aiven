// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aiven.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetInfluxDbPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetInfluxDbPlainArgs Empty = new GetInfluxDbPlainArgs();

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

    private GetInfluxDbPlainArgs() {}

    private GetInfluxDbPlainArgs(GetInfluxDbPlainArgs $) {
        this.project = $.project;
        this.serviceName = $.serviceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetInfluxDbPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetInfluxDbPlainArgs $;

        public Builder() {
            $ = new GetInfluxDbPlainArgs();
        }

        public Builder(GetInfluxDbPlainArgs defaults) {
            $ = new GetInfluxDbPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder project(String project) {
            $.project = project;
            return this;
        }

        public Builder serviceName(String serviceName) {
            $.serviceName = serviceName;
            return this;
        }

        public GetInfluxDbPlainArgs build() {
            if ($.project == null) {
                throw new MissingRequiredPropertyException("GetInfluxDbPlainArgs", "project");
            }
            if ($.serviceName == null) {
                throw new MissingRequiredPropertyException("GetInfluxDbPlainArgs", "serviceName");
            }
            return $;
        }
    }

}