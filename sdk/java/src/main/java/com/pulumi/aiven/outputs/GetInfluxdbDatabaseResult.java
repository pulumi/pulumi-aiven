// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aiven.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetInfluxdbDatabaseResult {
    private String databaseName;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private String project;
    private String serviceName;
    private Boolean terminationProtection;

    private GetInfluxdbDatabaseResult() {}
    public String databaseName() {
        return this.databaseName;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public String project() {
        return this.project;
    }
    public String serviceName() {
        return this.serviceName;
    }
    public Boolean terminationProtection() {
        return this.terminationProtection;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInfluxdbDatabaseResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String databaseName;
        private String id;
        private String project;
        private String serviceName;
        private Boolean terminationProtection;
        public Builder() {}
        public Builder(GetInfluxdbDatabaseResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.databaseName = defaults.databaseName;
    	      this.id = defaults.id;
    	      this.project = defaults.project;
    	      this.serviceName = defaults.serviceName;
    	      this.terminationProtection = defaults.terminationProtection;
        }

        @CustomType.Setter
        public Builder databaseName(String databaseName) {
            if (databaseName == null) {
              throw new MissingRequiredPropertyException("GetInfluxdbDatabaseResult", "databaseName");
            }
            this.databaseName = databaseName;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetInfluxdbDatabaseResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder project(String project) {
            if (project == null) {
              throw new MissingRequiredPropertyException("GetInfluxdbDatabaseResult", "project");
            }
            this.project = project;
            return this;
        }
        @CustomType.Setter
        public Builder serviceName(String serviceName) {
            if (serviceName == null) {
              throw new MissingRequiredPropertyException("GetInfluxdbDatabaseResult", "serviceName");
            }
            this.serviceName = serviceName;
            return this;
        }
        @CustomType.Setter
        public Builder terminationProtection(Boolean terminationProtection) {
            if (terminationProtection == null) {
              throw new MissingRequiredPropertyException("GetInfluxdbDatabaseResult", "terminationProtection");
            }
            this.terminationProtection = terminationProtection;
            return this;
        }
        public GetInfluxdbDatabaseResult build() {
            final var _resultValue = new GetInfluxdbDatabaseResult();
            _resultValue.databaseName = databaseName;
            _resultValue.id = id;
            _resultValue.project = project;
            _resultValue.serviceName = serviceName;
            _resultValue.terminationProtection = terminationProtection;
            return _resultValue;
        }
    }
}