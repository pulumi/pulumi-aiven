// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aiven.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServiceIntegrationClickhousePostgresqlUserConfigDatabaseArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceIntegrationClickhousePostgresqlUserConfigDatabaseArgs Empty = new ServiceIntegrationClickhousePostgresqlUserConfigDatabaseArgs();

    @Import(name="database")
    private @Nullable Output<String> database;

    public Optional<Output<String>> database() {
        return Optional.ofNullable(this.database);
    }

    @Import(name="schema")
    private @Nullable Output<String> schema;

    public Optional<Output<String>> schema() {
        return Optional.ofNullable(this.schema);
    }

    private ServiceIntegrationClickhousePostgresqlUserConfigDatabaseArgs() {}

    private ServiceIntegrationClickhousePostgresqlUserConfigDatabaseArgs(ServiceIntegrationClickhousePostgresqlUserConfigDatabaseArgs $) {
        this.database = $.database;
        this.schema = $.schema;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceIntegrationClickhousePostgresqlUserConfigDatabaseArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceIntegrationClickhousePostgresqlUserConfigDatabaseArgs $;

        public Builder() {
            $ = new ServiceIntegrationClickhousePostgresqlUserConfigDatabaseArgs();
        }

        public Builder(ServiceIntegrationClickhousePostgresqlUserConfigDatabaseArgs defaults) {
            $ = new ServiceIntegrationClickhousePostgresqlUserConfigDatabaseArgs(Objects.requireNonNull(defaults));
        }

        public Builder database(@Nullable Output<String> database) {
            $.database = database;
            return this;
        }

        public Builder database(String database) {
            return database(Output.of(database));
        }

        public Builder schema(@Nullable Output<String> schema) {
            $.schema = schema;
            return this;
        }

        public Builder schema(String schema) {
            return schema(Output.of(schema));
        }

        public ServiceIntegrationClickhousePostgresqlUserConfigDatabaseArgs build() {
            return $;
        }
    }

}