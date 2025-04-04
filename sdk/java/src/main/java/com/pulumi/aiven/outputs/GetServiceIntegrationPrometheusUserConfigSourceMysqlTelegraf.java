// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aiven.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetServiceIntegrationPrometheusUserConfigSourceMysqlTelegraf {
    /**
     * @return Gather metrics from PERFORMANCE_SCHEMA.EVENT_WAITS.
     * 
     */
    private @Nullable Boolean gatherEventWaits;
    /**
     * @return Gather metrics from PERFORMANCE_SCHEMA.FILE_SUMMARY_BY_EVENT_NAME.
     * 
     */
    private @Nullable Boolean gatherFileEventsStats;
    /**
     * @return Gather metrics from PERFORMANCE_SCHEMA.TABLE_IO_WAITS_SUMMARY_BY_INDEX_USAGE.
     * 
     */
    private @Nullable Boolean gatherIndexIoWaits;
    /**
     * @return Gather auto_increment columns and max values from information schema.
     * 
     */
    private @Nullable Boolean gatherInfoSchemaAutoInc;
    /**
     * @return Gather metrics from INFORMATION_SCHEMA.INNODB_METRICS.
     * 
     */
    private @Nullable Boolean gatherInnodbMetrics;
    /**
     * @return Gather metrics from PERFORMANCE_SCHEMA.EVENTS_STATEMENTS_SUMMARY_BY_DIGEST.
     * 
     */
    private @Nullable Boolean gatherPerfEventsStatements;
    /**
     * @return Gather thread state counts from INFORMATION_SCHEMA.PROCESSLIST.
     * 
     */
    private @Nullable Boolean gatherProcessList;
    /**
     * @return Gather metrics from SHOW SLAVE STATUS command output.
     * 
     */
    private @Nullable Boolean gatherSlaveStatus;
    /**
     * @return Gather metrics from PERFORMANCE_SCHEMA.TABLE_IO_WAITS_SUMMARY_BY_TABLE.
     * 
     */
    private @Nullable Boolean gatherTableIoWaits;
    /**
     * @return Gather metrics from PERFORMANCE_SCHEMA.TABLE_LOCK_WAITS.
     * 
     */
    private @Nullable Boolean gatherTableLockWaits;
    /**
     * @return Gather metrics from INFORMATION_SCHEMA.TABLES.
     * 
     */
    private @Nullable Boolean gatherTableSchema;
    /**
     * @return Truncates digest text from perf_events_statements into this many characters. Example: `120`.
     * 
     */
    private @Nullable Integer perfEventsStatementsDigestTextLimit;
    /**
     * @return Limits metrics from perf_events_statements. Example: `250`.
     * 
     */
    private @Nullable Integer perfEventsStatementsLimit;
    /**
     * @return Only include perf_events_statements whose last seen is less than this many seconds. Example: `86400`.
     * 
     */
    private @Nullable Integer perfEventsStatementsTimeLimit;

    private GetServiceIntegrationPrometheusUserConfigSourceMysqlTelegraf() {}
    /**
     * @return Gather metrics from PERFORMANCE_SCHEMA.EVENT_WAITS.
     * 
     */
    public Optional<Boolean> gatherEventWaits() {
        return Optional.ofNullable(this.gatherEventWaits);
    }
    /**
     * @return Gather metrics from PERFORMANCE_SCHEMA.FILE_SUMMARY_BY_EVENT_NAME.
     * 
     */
    public Optional<Boolean> gatherFileEventsStats() {
        return Optional.ofNullable(this.gatherFileEventsStats);
    }
    /**
     * @return Gather metrics from PERFORMANCE_SCHEMA.TABLE_IO_WAITS_SUMMARY_BY_INDEX_USAGE.
     * 
     */
    public Optional<Boolean> gatherIndexIoWaits() {
        return Optional.ofNullable(this.gatherIndexIoWaits);
    }
    /**
     * @return Gather auto_increment columns and max values from information schema.
     * 
     */
    public Optional<Boolean> gatherInfoSchemaAutoInc() {
        return Optional.ofNullable(this.gatherInfoSchemaAutoInc);
    }
    /**
     * @return Gather metrics from INFORMATION_SCHEMA.INNODB_METRICS.
     * 
     */
    public Optional<Boolean> gatherInnodbMetrics() {
        return Optional.ofNullable(this.gatherInnodbMetrics);
    }
    /**
     * @return Gather metrics from PERFORMANCE_SCHEMA.EVENTS_STATEMENTS_SUMMARY_BY_DIGEST.
     * 
     */
    public Optional<Boolean> gatherPerfEventsStatements() {
        return Optional.ofNullable(this.gatherPerfEventsStatements);
    }
    /**
     * @return Gather thread state counts from INFORMATION_SCHEMA.PROCESSLIST.
     * 
     */
    public Optional<Boolean> gatherProcessList() {
        return Optional.ofNullable(this.gatherProcessList);
    }
    /**
     * @return Gather metrics from SHOW SLAVE STATUS command output.
     * 
     */
    public Optional<Boolean> gatherSlaveStatus() {
        return Optional.ofNullable(this.gatherSlaveStatus);
    }
    /**
     * @return Gather metrics from PERFORMANCE_SCHEMA.TABLE_IO_WAITS_SUMMARY_BY_TABLE.
     * 
     */
    public Optional<Boolean> gatherTableIoWaits() {
        return Optional.ofNullable(this.gatherTableIoWaits);
    }
    /**
     * @return Gather metrics from PERFORMANCE_SCHEMA.TABLE_LOCK_WAITS.
     * 
     */
    public Optional<Boolean> gatherTableLockWaits() {
        return Optional.ofNullable(this.gatherTableLockWaits);
    }
    /**
     * @return Gather metrics from INFORMATION_SCHEMA.TABLES.
     * 
     */
    public Optional<Boolean> gatherTableSchema() {
        return Optional.ofNullable(this.gatherTableSchema);
    }
    /**
     * @return Truncates digest text from perf_events_statements into this many characters. Example: `120`.
     * 
     */
    public Optional<Integer> perfEventsStatementsDigestTextLimit() {
        return Optional.ofNullable(this.perfEventsStatementsDigestTextLimit);
    }
    /**
     * @return Limits metrics from perf_events_statements. Example: `250`.
     * 
     */
    public Optional<Integer> perfEventsStatementsLimit() {
        return Optional.ofNullable(this.perfEventsStatementsLimit);
    }
    /**
     * @return Only include perf_events_statements whose last seen is less than this many seconds. Example: `86400`.
     * 
     */
    public Optional<Integer> perfEventsStatementsTimeLimit() {
        return Optional.ofNullable(this.perfEventsStatementsTimeLimit);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServiceIntegrationPrometheusUserConfigSourceMysqlTelegraf defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean gatherEventWaits;
        private @Nullable Boolean gatherFileEventsStats;
        private @Nullable Boolean gatherIndexIoWaits;
        private @Nullable Boolean gatherInfoSchemaAutoInc;
        private @Nullable Boolean gatherInnodbMetrics;
        private @Nullable Boolean gatherPerfEventsStatements;
        private @Nullable Boolean gatherProcessList;
        private @Nullable Boolean gatherSlaveStatus;
        private @Nullable Boolean gatherTableIoWaits;
        private @Nullable Boolean gatherTableLockWaits;
        private @Nullable Boolean gatherTableSchema;
        private @Nullable Integer perfEventsStatementsDigestTextLimit;
        private @Nullable Integer perfEventsStatementsLimit;
        private @Nullable Integer perfEventsStatementsTimeLimit;
        public Builder() {}
        public Builder(GetServiceIntegrationPrometheusUserConfigSourceMysqlTelegraf defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.gatherEventWaits = defaults.gatherEventWaits;
    	      this.gatherFileEventsStats = defaults.gatherFileEventsStats;
    	      this.gatherIndexIoWaits = defaults.gatherIndexIoWaits;
    	      this.gatherInfoSchemaAutoInc = defaults.gatherInfoSchemaAutoInc;
    	      this.gatherInnodbMetrics = defaults.gatherInnodbMetrics;
    	      this.gatherPerfEventsStatements = defaults.gatherPerfEventsStatements;
    	      this.gatherProcessList = defaults.gatherProcessList;
    	      this.gatherSlaveStatus = defaults.gatherSlaveStatus;
    	      this.gatherTableIoWaits = defaults.gatherTableIoWaits;
    	      this.gatherTableLockWaits = defaults.gatherTableLockWaits;
    	      this.gatherTableSchema = defaults.gatherTableSchema;
    	      this.perfEventsStatementsDigestTextLimit = defaults.perfEventsStatementsDigestTextLimit;
    	      this.perfEventsStatementsLimit = defaults.perfEventsStatementsLimit;
    	      this.perfEventsStatementsTimeLimit = defaults.perfEventsStatementsTimeLimit;
        }

        @CustomType.Setter
        public Builder gatherEventWaits(@Nullable Boolean gatherEventWaits) {

            this.gatherEventWaits = gatherEventWaits;
            return this;
        }
        @CustomType.Setter
        public Builder gatherFileEventsStats(@Nullable Boolean gatherFileEventsStats) {

            this.gatherFileEventsStats = gatherFileEventsStats;
            return this;
        }
        @CustomType.Setter
        public Builder gatherIndexIoWaits(@Nullable Boolean gatherIndexIoWaits) {

            this.gatherIndexIoWaits = gatherIndexIoWaits;
            return this;
        }
        @CustomType.Setter
        public Builder gatherInfoSchemaAutoInc(@Nullable Boolean gatherInfoSchemaAutoInc) {

            this.gatherInfoSchemaAutoInc = gatherInfoSchemaAutoInc;
            return this;
        }
        @CustomType.Setter
        public Builder gatherInnodbMetrics(@Nullable Boolean gatherInnodbMetrics) {

            this.gatherInnodbMetrics = gatherInnodbMetrics;
            return this;
        }
        @CustomType.Setter
        public Builder gatherPerfEventsStatements(@Nullable Boolean gatherPerfEventsStatements) {

            this.gatherPerfEventsStatements = gatherPerfEventsStatements;
            return this;
        }
        @CustomType.Setter
        public Builder gatherProcessList(@Nullable Boolean gatherProcessList) {

            this.gatherProcessList = gatherProcessList;
            return this;
        }
        @CustomType.Setter
        public Builder gatherSlaveStatus(@Nullable Boolean gatherSlaveStatus) {

            this.gatherSlaveStatus = gatherSlaveStatus;
            return this;
        }
        @CustomType.Setter
        public Builder gatherTableIoWaits(@Nullable Boolean gatherTableIoWaits) {

            this.gatherTableIoWaits = gatherTableIoWaits;
            return this;
        }
        @CustomType.Setter
        public Builder gatherTableLockWaits(@Nullable Boolean gatherTableLockWaits) {

            this.gatherTableLockWaits = gatherTableLockWaits;
            return this;
        }
        @CustomType.Setter
        public Builder gatherTableSchema(@Nullable Boolean gatherTableSchema) {

            this.gatherTableSchema = gatherTableSchema;
            return this;
        }
        @CustomType.Setter
        public Builder perfEventsStatementsDigestTextLimit(@Nullable Integer perfEventsStatementsDigestTextLimit) {

            this.perfEventsStatementsDigestTextLimit = perfEventsStatementsDigestTextLimit;
            return this;
        }
        @CustomType.Setter
        public Builder perfEventsStatementsLimit(@Nullable Integer perfEventsStatementsLimit) {

            this.perfEventsStatementsLimit = perfEventsStatementsLimit;
            return this;
        }
        @CustomType.Setter
        public Builder perfEventsStatementsTimeLimit(@Nullable Integer perfEventsStatementsTimeLimit) {

            this.perfEventsStatementsTimeLimit = perfEventsStatementsTimeLimit;
            return this;
        }
        public GetServiceIntegrationPrometheusUserConfigSourceMysqlTelegraf build() {
            final var _resultValue = new GetServiceIntegrationPrometheusUserConfigSourceMysqlTelegraf();
            _resultValue.gatherEventWaits = gatherEventWaits;
            _resultValue.gatherFileEventsStats = gatherFileEventsStats;
            _resultValue.gatherIndexIoWaits = gatherIndexIoWaits;
            _resultValue.gatherInfoSchemaAutoInc = gatherInfoSchemaAutoInc;
            _resultValue.gatherInnodbMetrics = gatherInnodbMetrics;
            _resultValue.gatherPerfEventsStatements = gatherPerfEventsStatements;
            _resultValue.gatherProcessList = gatherProcessList;
            _resultValue.gatherSlaveStatus = gatherSlaveStatus;
            _resultValue.gatherTableIoWaits = gatherTableIoWaits;
            _resultValue.gatherTableLockWaits = gatherTableLockWaits;
            _resultValue.gatherTableSchema = gatherTableSchema;
            _resultValue.perfEventsStatementsDigestTextLimit = perfEventsStatementsDigestTextLimit;
            _resultValue.perfEventsStatementsLimit = perfEventsStatementsLimit;
            _resultValue.perfEventsStatementsTimeLimit = perfEventsStatementsTimeLimit;
            return _resultValue;
        }
    }
}
