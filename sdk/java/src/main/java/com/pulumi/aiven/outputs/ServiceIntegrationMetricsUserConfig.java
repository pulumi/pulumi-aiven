// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aiven.outputs;

import com.pulumi.aiven.outputs.ServiceIntegrationMetricsUserConfigSourceMysql;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ServiceIntegrationMetricsUserConfig {
    /**
     * @return Name of the database where to store metric datapoints. Only affects PostgreSQL destinations. Defaults to &#39;metrics&#39;. Note that this must be the same for all metrics integrations that write data to the same PostgreSQL service.
     * 
     */
    private @Nullable String database;
    /**
     * @return Number of days to keep old metrics. Only affects PostgreSQL destinations. Set to 0 for no automatic cleanup. Defaults to 30 days.
     * 
     */
    private @Nullable String retentionDays;
    /**
     * @return Name of a user that can be used to read metrics. This will be used for Grafana integration (if enabled) to prevent Grafana users from making undesired changes. Only affects PostgreSQL destinations. Defaults to &#39;metrics_reader&#39;. Note that this must be the same for all metrics integrations that write data to the same PostgreSQL service.
     * 
     */
    private @Nullable String roUsername;
    /**
     * @return Configuration options for metrics where source service is MySQL
     * 
     */
    private @Nullable ServiceIntegrationMetricsUserConfigSourceMysql sourceMysql;
    /**
     * @return Name of the user used to write metrics. Only affects PostgreSQL destinations. Defaults to &#39;metrics_writer&#39;. Note that this must be the same for all metrics integrations that write data to the same PostgreSQL service.
     * 
     */
    private @Nullable String username;

    private ServiceIntegrationMetricsUserConfig() {}
    /**
     * @return Name of the database where to store metric datapoints. Only affects PostgreSQL destinations. Defaults to &#39;metrics&#39;. Note that this must be the same for all metrics integrations that write data to the same PostgreSQL service.
     * 
     */
    public Optional<String> database() {
        return Optional.ofNullable(this.database);
    }
    /**
     * @return Number of days to keep old metrics. Only affects PostgreSQL destinations. Set to 0 for no automatic cleanup. Defaults to 30 days.
     * 
     */
    public Optional<String> retentionDays() {
        return Optional.ofNullable(this.retentionDays);
    }
    /**
     * @return Name of a user that can be used to read metrics. This will be used for Grafana integration (if enabled) to prevent Grafana users from making undesired changes. Only affects PostgreSQL destinations. Defaults to &#39;metrics_reader&#39;. Note that this must be the same for all metrics integrations that write data to the same PostgreSQL service.
     * 
     */
    public Optional<String> roUsername() {
        return Optional.ofNullable(this.roUsername);
    }
    /**
     * @return Configuration options for metrics where source service is MySQL
     * 
     */
    public Optional<ServiceIntegrationMetricsUserConfigSourceMysql> sourceMysql() {
        return Optional.ofNullable(this.sourceMysql);
    }
    /**
     * @return Name of the user used to write metrics. Only affects PostgreSQL destinations. Defaults to &#39;metrics_writer&#39;. Note that this must be the same for all metrics integrations that write data to the same PostgreSQL service.
     * 
     */
    public Optional<String> username() {
        return Optional.ofNullable(this.username);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceIntegrationMetricsUserConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String database;
        private @Nullable String retentionDays;
        private @Nullable String roUsername;
        private @Nullable ServiceIntegrationMetricsUserConfigSourceMysql sourceMysql;
        private @Nullable String username;
        public Builder() {}
        public Builder(ServiceIntegrationMetricsUserConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.database = defaults.database;
    	      this.retentionDays = defaults.retentionDays;
    	      this.roUsername = defaults.roUsername;
    	      this.sourceMysql = defaults.sourceMysql;
    	      this.username = defaults.username;
        }

        @CustomType.Setter
        public Builder database(@Nullable String database) {
            this.database = database;
            return this;
        }
        @CustomType.Setter
        public Builder retentionDays(@Nullable String retentionDays) {
            this.retentionDays = retentionDays;
            return this;
        }
        @CustomType.Setter
        public Builder roUsername(@Nullable String roUsername) {
            this.roUsername = roUsername;
            return this;
        }
        @CustomType.Setter
        public Builder sourceMysql(@Nullable ServiceIntegrationMetricsUserConfigSourceMysql sourceMysql) {
            this.sourceMysql = sourceMysql;
            return this;
        }
        @CustomType.Setter
        public Builder username(@Nullable String username) {
            this.username = username;
            return this;
        }
        public ServiceIntegrationMetricsUserConfig build() {
            final var o = new ServiceIntegrationMetricsUserConfig();
            o.database = database;
            o.retentionDays = retentionDays;
            o.roUsername = roUsername;
            o.sourceMysql = sourceMysql;
            o.username = username;
            return o;
        }
    }
}