// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aiven.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetMysqlDatabaseResult {
    /**
     * @return The name of the database. Changing this property forces recreation of the resource.
     * 
     */
    private String databaseName;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return The name of the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
     * 
     */
    private String project;
    /**
     * @return The name of the service that this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
     * 
     */
    private String serviceName;
    private Boolean terminationProtection;

    private GetMysqlDatabaseResult() {}
    /**
     * @return The name of the database. Changing this property forces recreation of the resource.
     * 
     */
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
    /**
     * @return The name of the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
     * 
     */
    public String project() {
        return this.project;
    }
    /**
     * @return The name of the service that this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
     * 
     */
    public String serviceName() {
        return this.serviceName;
    }
    public Boolean terminationProtection() {
        return this.terminationProtection;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetMysqlDatabaseResult defaults) {
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
        public Builder(GetMysqlDatabaseResult defaults) {
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
              throw new MissingRequiredPropertyException("GetMysqlDatabaseResult", "databaseName");
            }
            this.databaseName = databaseName;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetMysqlDatabaseResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder project(String project) {
            if (project == null) {
              throw new MissingRequiredPropertyException("GetMysqlDatabaseResult", "project");
            }
            this.project = project;
            return this;
        }
        @CustomType.Setter
        public Builder serviceName(String serviceName) {
            if (serviceName == null) {
              throw new MissingRequiredPropertyException("GetMysqlDatabaseResult", "serviceName");
            }
            this.serviceName = serviceName;
            return this;
        }
        @CustomType.Setter
        public Builder terminationProtection(Boolean terminationProtection) {
            if (terminationProtection == null) {
              throw new MissingRequiredPropertyException("GetMysqlDatabaseResult", "terminationProtection");
            }
            this.terminationProtection = terminationProtection;
            return this;
        }
        public GetMysqlDatabaseResult build() {
            final var _resultValue = new GetMysqlDatabaseResult();
            _resultValue.databaseName = databaseName;
            _resultValue.id = id;
            _resultValue.project = project;
            _resultValue.serviceName = serviceName;
            _resultValue.terminationProtection = terminationProtection;
            return _resultValue;
        }
    }
}
