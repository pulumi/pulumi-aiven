// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aiven.outputs;

import com.pulumi.aiven.outputs.PgPgUserConfigIpFilterObject;
import com.pulumi.aiven.outputs.PgPgUserConfigMigration;
import com.pulumi.aiven.outputs.PgPgUserConfigPg;
import com.pulumi.aiven.outputs.PgPgUserConfigPgQualstats;
import com.pulumi.aiven.outputs.PgPgUserConfigPgaudit;
import com.pulumi.aiven.outputs.PgPgUserConfigPgbouncer;
import com.pulumi.aiven.outputs.PgPgUserConfigPglookout;
import com.pulumi.aiven.outputs.PgPgUserConfigPrivateAccess;
import com.pulumi.aiven.outputs.PgPgUserConfigPrivatelinkAccess;
import com.pulumi.aiven.outputs.PgPgUserConfigPublicAccess;
import com.pulumi.aiven.outputs.PgPgUserConfigTimescaledb;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PgPgUserConfig {
    /**
     * @return Additional Cloud Regions for Backup Replication.
     * 
     */
    private @Nullable String additionalBackupRegions;
    /**
     * @return Custom password for admin user. Defaults to random string. This must be set only when a new service is being created.
     * 
     */
    private @Nullable String adminPassword;
    /**
     * @return Custom username for admin user. This must be set only when a new service is being created. Example: `avnadmin`.
     * 
     */
    private @Nullable String adminUsername;
    /**
     * @return The hour of day (in UTC) when backup for the service is started. New backup is only started if previous backup has already completed. Example: `3`.
     * 
     */
    private @Nullable Integer backupHour;
    /**
     * @return The minute of an hour when backup for the service is started. New backup is only started if previous backup has already completed. Example: `30`.
     * 
     */
    private @Nullable Integer backupMinute;
    /**
     * @return Register AAAA DNS records for the service, and allow IPv6 packets to service ports.
     * 
     */
    private @Nullable Boolean enableIpv6;
    /**
     * @return Allow incoming connections from CIDR address block, e.g. `10.20.0.0/16`
     * 
     */
    private @Nullable List<PgPgUserConfigIpFilterObject> ipFilterObjects;
    /**
     * @return Allow incoming connections from CIDR address block, e.g. `10.20.0.0/16`.
     * 
     */
    private @Nullable List<String> ipFilterStrings;
    /**
     * @return Allow incoming connections from CIDR address block, e.g. `10.20.0.0/16`.
     * 
     * @deprecated
     * Deprecated. Use `ip_filter_string` instead.
     * 
     */
    @Deprecated /* Deprecated. Use `ip_filter_string` instead. */
    private @Nullable List<String> ipFilters;
    /**
     * @return Migrate data from existing server
     * 
     */
    private @Nullable PgPgUserConfigMigration migration;
    /**
     * @return postgresql.conf configuration values
     * 
     */
    private @Nullable PgPgUserConfigPg pg;
    /**
     * @return System-wide settings for the pg*qualstats extension
     * 
     * @deprecated
     * This property is deprecated.
     * 
     */
    @Deprecated /* This property is deprecated. */
    private @Nullable PgPgUserConfigPgQualstats pgQualstats;
    /**
     * @return Should the service which is being forked be a read replica (deprecated, use read_replica service integration instead).
     * 
     */
    private @Nullable Boolean pgReadReplica;
    /**
     * @return Name of the PG Service from which to fork (deprecated, use service*to*fork_from). This has effect only when a new service is being created. Example: `anotherservicename`.
     * 
     */
    private @Nullable String pgServiceToForkFrom;
    /**
     * @return Enable the pg*stat*monitor extension. Changing this parameter causes a service restart. When this extension is enabled, pg*stat*statements results for utility commands are unreliable. Default: `false`.
     * 
     */
    private @Nullable Boolean pgStatMonitorEnable;
    /**
     * @return Enum: `10`, `11`, `12`, `13`, `14`, `15`, `16`, `17`, and newer. PostgreSQL major version.
     * 
     */
    private @Nullable String pgVersion;
    /**
     * @return System-wide settings for the pgaudit extension
     * 
     */
    private @Nullable PgPgUserConfigPgaudit pgaudit;
    /**
     * @return PGBouncer connection pooling settings
     * 
     */
    private @Nullable PgPgUserConfigPgbouncer pgbouncer;
    /**
     * @return System-wide settings for pglookout
     * 
     */
    private @Nullable PgPgUserConfigPglookout pglookout;
    /**
     * @return Allow access to selected service ports from private networks
     * 
     */
    private @Nullable PgPgUserConfigPrivateAccess privateAccess;
    /**
     * @return Allow access to selected service components through Privatelink
     * 
     */
    private @Nullable PgPgUserConfigPrivatelinkAccess privatelinkAccess;
    /**
     * @return Name of another project to fork a service from. This has effect only when a new service is being created. Example: `anotherprojectname`.
     * 
     */
    private @Nullable String projectToForkFrom;
    /**
     * @return Allow access to selected service ports from the public Internet
     * 
     */
    private @Nullable PgPgUserConfigPublicAccess publicAccess;
    /**
     * @return Recovery target time when forking a service. This has effect only when a new service is being created. Example: `2019-01-01 23:34:45`.
     * 
     */
    private @Nullable String recoveryTargetTime;
    /**
     * @return Store logs for the service so that they are available in the HTTP API and console.
     * 
     */
    private @Nullable Boolean serviceLog;
    /**
     * @return Name of another service to fork from. This has effect only when a new service is being created. Example: `anotherservicename`.
     * 
     */
    private @Nullable String serviceToForkFrom;
    /**
     * @return Percentage of total RAM that the database server uses for shared memory buffers. Valid range is 20-60 (float), which corresponds to 20% - 60%. This setting adjusts the shared_buffers configuration value. Changing this parameter causes a service restart. Example: `41.5`.
     * 
     */
    private @Nullable Double sharedBuffersPercentage;
    /**
     * @return Use static public IP addresses.
     * 
     */
    private @Nullable Boolean staticIps;
    /**
     * @return Enum: `off`, `quorum`. Synchronous replication type. Note that the service plan also needs to support synchronous replication.
     * 
     */
    private @Nullable String synchronousReplication;
    /**
     * @return System-wide settings for the timescaledb extension
     * 
     */
    private @Nullable PgPgUserConfigTimescaledb timescaledb;
    /**
     * @return Enum: `aiven`, `timescale`. Variant of the PostgreSQL service, may affect the features that are exposed by default.
     * 
     */
    private @Nullable String variant;
    /**
     * @return Sets the maximum amount of memory to be used by a query operation (such as a sort or hash table) before writing to temporary disk files, in MB. The default is 1MB + 0.075% of total RAM (up to 32MB). Example: `4`.
     * 
     */
    private @Nullable Integer workMem;

    private PgPgUserConfig() {}
    /**
     * @return Additional Cloud Regions for Backup Replication.
     * 
     */
    public Optional<String> additionalBackupRegions() {
        return Optional.ofNullable(this.additionalBackupRegions);
    }
    /**
     * @return Custom password for admin user. Defaults to random string. This must be set only when a new service is being created.
     * 
     */
    public Optional<String> adminPassword() {
        return Optional.ofNullable(this.adminPassword);
    }
    /**
     * @return Custom username for admin user. This must be set only when a new service is being created. Example: `avnadmin`.
     * 
     */
    public Optional<String> adminUsername() {
        return Optional.ofNullable(this.adminUsername);
    }
    /**
     * @return The hour of day (in UTC) when backup for the service is started. New backup is only started if previous backup has already completed. Example: `3`.
     * 
     */
    public Optional<Integer> backupHour() {
        return Optional.ofNullable(this.backupHour);
    }
    /**
     * @return The minute of an hour when backup for the service is started. New backup is only started if previous backup has already completed. Example: `30`.
     * 
     */
    public Optional<Integer> backupMinute() {
        return Optional.ofNullable(this.backupMinute);
    }
    /**
     * @return Register AAAA DNS records for the service, and allow IPv6 packets to service ports.
     * 
     */
    public Optional<Boolean> enableIpv6() {
        return Optional.ofNullable(this.enableIpv6);
    }
    /**
     * @return Allow incoming connections from CIDR address block, e.g. `10.20.0.0/16`
     * 
     */
    public List<PgPgUserConfigIpFilterObject> ipFilterObjects() {
        return this.ipFilterObjects == null ? List.of() : this.ipFilterObjects;
    }
    /**
     * @return Allow incoming connections from CIDR address block, e.g. `10.20.0.0/16`.
     * 
     */
    public List<String> ipFilterStrings() {
        return this.ipFilterStrings == null ? List.of() : this.ipFilterStrings;
    }
    /**
     * @return Allow incoming connections from CIDR address block, e.g. `10.20.0.0/16`.
     * 
     * @deprecated
     * Deprecated. Use `ip_filter_string` instead.
     * 
     */
    @Deprecated /* Deprecated. Use `ip_filter_string` instead. */
    public List<String> ipFilters() {
        return this.ipFilters == null ? List.of() : this.ipFilters;
    }
    /**
     * @return Migrate data from existing server
     * 
     */
    public Optional<PgPgUserConfigMigration> migration() {
        return Optional.ofNullable(this.migration);
    }
    /**
     * @return postgresql.conf configuration values
     * 
     */
    public Optional<PgPgUserConfigPg> pg() {
        return Optional.ofNullable(this.pg);
    }
    /**
     * @return System-wide settings for the pg*qualstats extension
     * 
     * @deprecated
     * This property is deprecated.
     * 
     */
    @Deprecated /* This property is deprecated. */
    public Optional<PgPgUserConfigPgQualstats> pgQualstats() {
        return Optional.ofNullable(this.pgQualstats);
    }
    /**
     * @return Should the service which is being forked be a read replica (deprecated, use read_replica service integration instead).
     * 
     */
    public Optional<Boolean> pgReadReplica() {
        return Optional.ofNullable(this.pgReadReplica);
    }
    /**
     * @return Name of the PG Service from which to fork (deprecated, use service*to*fork_from). This has effect only when a new service is being created. Example: `anotherservicename`.
     * 
     */
    public Optional<String> pgServiceToForkFrom() {
        return Optional.ofNullable(this.pgServiceToForkFrom);
    }
    /**
     * @return Enable the pg*stat*monitor extension. Changing this parameter causes a service restart. When this extension is enabled, pg*stat*statements results for utility commands are unreliable. Default: `false`.
     * 
     */
    public Optional<Boolean> pgStatMonitorEnable() {
        return Optional.ofNullable(this.pgStatMonitorEnable);
    }
    /**
     * @return Enum: `10`, `11`, `12`, `13`, `14`, `15`, `16`, `17`, and newer. PostgreSQL major version.
     * 
     */
    public Optional<String> pgVersion() {
        return Optional.ofNullable(this.pgVersion);
    }
    /**
     * @return System-wide settings for the pgaudit extension
     * 
     */
    public Optional<PgPgUserConfigPgaudit> pgaudit() {
        return Optional.ofNullable(this.pgaudit);
    }
    /**
     * @return PGBouncer connection pooling settings
     * 
     */
    public Optional<PgPgUserConfigPgbouncer> pgbouncer() {
        return Optional.ofNullable(this.pgbouncer);
    }
    /**
     * @return System-wide settings for pglookout
     * 
     */
    public Optional<PgPgUserConfigPglookout> pglookout() {
        return Optional.ofNullable(this.pglookout);
    }
    /**
     * @return Allow access to selected service ports from private networks
     * 
     */
    public Optional<PgPgUserConfigPrivateAccess> privateAccess() {
        return Optional.ofNullable(this.privateAccess);
    }
    /**
     * @return Allow access to selected service components through Privatelink
     * 
     */
    public Optional<PgPgUserConfigPrivatelinkAccess> privatelinkAccess() {
        return Optional.ofNullable(this.privatelinkAccess);
    }
    /**
     * @return Name of another project to fork a service from. This has effect only when a new service is being created. Example: `anotherprojectname`.
     * 
     */
    public Optional<String> projectToForkFrom() {
        return Optional.ofNullable(this.projectToForkFrom);
    }
    /**
     * @return Allow access to selected service ports from the public Internet
     * 
     */
    public Optional<PgPgUserConfigPublicAccess> publicAccess() {
        return Optional.ofNullable(this.publicAccess);
    }
    /**
     * @return Recovery target time when forking a service. This has effect only when a new service is being created. Example: `2019-01-01 23:34:45`.
     * 
     */
    public Optional<String> recoveryTargetTime() {
        return Optional.ofNullable(this.recoveryTargetTime);
    }
    /**
     * @return Store logs for the service so that they are available in the HTTP API and console.
     * 
     */
    public Optional<Boolean> serviceLog() {
        return Optional.ofNullable(this.serviceLog);
    }
    /**
     * @return Name of another service to fork from. This has effect only when a new service is being created. Example: `anotherservicename`.
     * 
     */
    public Optional<String> serviceToForkFrom() {
        return Optional.ofNullable(this.serviceToForkFrom);
    }
    /**
     * @return Percentage of total RAM that the database server uses for shared memory buffers. Valid range is 20-60 (float), which corresponds to 20% - 60%. This setting adjusts the shared_buffers configuration value. Changing this parameter causes a service restart. Example: `41.5`.
     * 
     */
    public Optional<Double> sharedBuffersPercentage() {
        return Optional.ofNullable(this.sharedBuffersPercentage);
    }
    /**
     * @return Use static public IP addresses.
     * 
     */
    public Optional<Boolean> staticIps() {
        return Optional.ofNullable(this.staticIps);
    }
    /**
     * @return Enum: `off`, `quorum`. Synchronous replication type. Note that the service plan also needs to support synchronous replication.
     * 
     */
    public Optional<String> synchronousReplication() {
        return Optional.ofNullable(this.synchronousReplication);
    }
    /**
     * @return System-wide settings for the timescaledb extension
     * 
     */
    public Optional<PgPgUserConfigTimescaledb> timescaledb() {
        return Optional.ofNullable(this.timescaledb);
    }
    /**
     * @return Enum: `aiven`, `timescale`. Variant of the PostgreSQL service, may affect the features that are exposed by default.
     * 
     */
    public Optional<String> variant() {
        return Optional.ofNullable(this.variant);
    }
    /**
     * @return Sets the maximum amount of memory to be used by a query operation (such as a sort or hash table) before writing to temporary disk files, in MB. The default is 1MB + 0.075% of total RAM (up to 32MB). Example: `4`.
     * 
     */
    public Optional<Integer> workMem() {
        return Optional.ofNullable(this.workMem);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PgPgUserConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String additionalBackupRegions;
        private @Nullable String adminPassword;
        private @Nullable String adminUsername;
        private @Nullable Integer backupHour;
        private @Nullable Integer backupMinute;
        private @Nullable Boolean enableIpv6;
        private @Nullable List<PgPgUserConfigIpFilterObject> ipFilterObjects;
        private @Nullable List<String> ipFilterStrings;
        private @Nullable List<String> ipFilters;
        private @Nullable PgPgUserConfigMigration migration;
        private @Nullable PgPgUserConfigPg pg;
        private @Nullable PgPgUserConfigPgQualstats pgQualstats;
        private @Nullable Boolean pgReadReplica;
        private @Nullable String pgServiceToForkFrom;
        private @Nullable Boolean pgStatMonitorEnable;
        private @Nullable String pgVersion;
        private @Nullable PgPgUserConfigPgaudit pgaudit;
        private @Nullable PgPgUserConfigPgbouncer pgbouncer;
        private @Nullable PgPgUserConfigPglookout pglookout;
        private @Nullable PgPgUserConfigPrivateAccess privateAccess;
        private @Nullable PgPgUserConfigPrivatelinkAccess privatelinkAccess;
        private @Nullable String projectToForkFrom;
        private @Nullable PgPgUserConfigPublicAccess publicAccess;
        private @Nullable String recoveryTargetTime;
        private @Nullable Boolean serviceLog;
        private @Nullable String serviceToForkFrom;
        private @Nullable Double sharedBuffersPercentage;
        private @Nullable Boolean staticIps;
        private @Nullable String synchronousReplication;
        private @Nullable PgPgUserConfigTimescaledb timescaledb;
        private @Nullable String variant;
        private @Nullable Integer workMem;
        public Builder() {}
        public Builder(PgPgUserConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalBackupRegions = defaults.additionalBackupRegions;
    	      this.adminPassword = defaults.adminPassword;
    	      this.adminUsername = defaults.adminUsername;
    	      this.backupHour = defaults.backupHour;
    	      this.backupMinute = defaults.backupMinute;
    	      this.enableIpv6 = defaults.enableIpv6;
    	      this.ipFilterObjects = defaults.ipFilterObjects;
    	      this.ipFilterStrings = defaults.ipFilterStrings;
    	      this.ipFilters = defaults.ipFilters;
    	      this.migration = defaults.migration;
    	      this.pg = defaults.pg;
    	      this.pgQualstats = defaults.pgQualstats;
    	      this.pgReadReplica = defaults.pgReadReplica;
    	      this.pgServiceToForkFrom = defaults.pgServiceToForkFrom;
    	      this.pgStatMonitorEnable = defaults.pgStatMonitorEnable;
    	      this.pgVersion = defaults.pgVersion;
    	      this.pgaudit = defaults.pgaudit;
    	      this.pgbouncer = defaults.pgbouncer;
    	      this.pglookout = defaults.pglookout;
    	      this.privateAccess = defaults.privateAccess;
    	      this.privatelinkAccess = defaults.privatelinkAccess;
    	      this.projectToForkFrom = defaults.projectToForkFrom;
    	      this.publicAccess = defaults.publicAccess;
    	      this.recoveryTargetTime = defaults.recoveryTargetTime;
    	      this.serviceLog = defaults.serviceLog;
    	      this.serviceToForkFrom = defaults.serviceToForkFrom;
    	      this.sharedBuffersPercentage = defaults.sharedBuffersPercentage;
    	      this.staticIps = defaults.staticIps;
    	      this.synchronousReplication = defaults.synchronousReplication;
    	      this.timescaledb = defaults.timescaledb;
    	      this.variant = defaults.variant;
    	      this.workMem = defaults.workMem;
        }

        @CustomType.Setter
        public Builder additionalBackupRegions(@Nullable String additionalBackupRegions) {

            this.additionalBackupRegions = additionalBackupRegions;
            return this;
        }
        @CustomType.Setter
        public Builder adminPassword(@Nullable String adminPassword) {

            this.adminPassword = adminPassword;
            return this;
        }
        @CustomType.Setter
        public Builder adminUsername(@Nullable String adminUsername) {

            this.adminUsername = adminUsername;
            return this;
        }
        @CustomType.Setter
        public Builder backupHour(@Nullable Integer backupHour) {

            this.backupHour = backupHour;
            return this;
        }
        @CustomType.Setter
        public Builder backupMinute(@Nullable Integer backupMinute) {

            this.backupMinute = backupMinute;
            return this;
        }
        @CustomType.Setter
        public Builder enableIpv6(@Nullable Boolean enableIpv6) {

            this.enableIpv6 = enableIpv6;
            return this;
        }
        @CustomType.Setter
        public Builder ipFilterObjects(@Nullable List<PgPgUserConfigIpFilterObject> ipFilterObjects) {

            this.ipFilterObjects = ipFilterObjects;
            return this;
        }
        public Builder ipFilterObjects(PgPgUserConfigIpFilterObject... ipFilterObjects) {
            return ipFilterObjects(List.of(ipFilterObjects));
        }
        @CustomType.Setter
        public Builder ipFilterStrings(@Nullable List<String> ipFilterStrings) {

            this.ipFilterStrings = ipFilterStrings;
            return this;
        }
        public Builder ipFilterStrings(String... ipFilterStrings) {
            return ipFilterStrings(List.of(ipFilterStrings));
        }
        @CustomType.Setter
        public Builder ipFilters(@Nullable List<String> ipFilters) {

            this.ipFilters = ipFilters;
            return this;
        }
        public Builder ipFilters(String... ipFilters) {
            return ipFilters(List.of(ipFilters));
        }
        @CustomType.Setter
        public Builder migration(@Nullable PgPgUserConfigMigration migration) {

            this.migration = migration;
            return this;
        }
        @CustomType.Setter
        public Builder pg(@Nullable PgPgUserConfigPg pg) {

            this.pg = pg;
            return this;
        }
        @CustomType.Setter
        public Builder pgQualstats(@Nullable PgPgUserConfigPgQualstats pgQualstats) {

            this.pgQualstats = pgQualstats;
            return this;
        }
        @CustomType.Setter
        public Builder pgReadReplica(@Nullable Boolean pgReadReplica) {

            this.pgReadReplica = pgReadReplica;
            return this;
        }
        @CustomType.Setter
        public Builder pgServiceToForkFrom(@Nullable String pgServiceToForkFrom) {

            this.pgServiceToForkFrom = pgServiceToForkFrom;
            return this;
        }
        @CustomType.Setter
        public Builder pgStatMonitorEnable(@Nullable Boolean pgStatMonitorEnable) {

            this.pgStatMonitorEnable = pgStatMonitorEnable;
            return this;
        }
        @CustomType.Setter
        public Builder pgVersion(@Nullable String pgVersion) {

            this.pgVersion = pgVersion;
            return this;
        }
        @CustomType.Setter
        public Builder pgaudit(@Nullable PgPgUserConfigPgaudit pgaudit) {

            this.pgaudit = pgaudit;
            return this;
        }
        @CustomType.Setter
        public Builder pgbouncer(@Nullable PgPgUserConfigPgbouncer pgbouncer) {

            this.pgbouncer = pgbouncer;
            return this;
        }
        @CustomType.Setter
        public Builder pglookout(@Nullable PgPgUserConfigPglookout pglookout) {

            this.pglookout = pglookout;
            return this;
        }
        @CustomType.Setter
        public Builder privateAccess(@Nullable PgPgUserConfigPrivateAccess privateAccess) {

            this.privateAccess = privateAccess;
            return this;
        }
        @CustomType.Setter
        public Builder privatelinkAccess(@Nullable PgPgUserConfigPrivatelinkAccess privatelinkAccess) {

            this.privatelinkAccess = privatelinkAccess;
            return this;
        }
        @CustomType.Setter
        public Builder projectToForkFrom(@Nullable String projectToForkFrom) {

            this.projectToForkFrom = projectToForkFrom;
            return this;
        }
        @CustomType.Setter
        public Builder publicAccess(@Nullable PgPgUserConfigPublicAccess publicAccess) {

            this.publicAccess = publicAccess;
            return this;
        }
        @CustomType.Setter
        public Builder recoveryTargetTime(@Nullable String recoveryTargetTime) {

            this.recoveryTargetTime = recoveryTargetTime;
            return this;
        }
        @CustomType.Setter
        public Builder serviceLog(@Nullable Boolean serviceLog) {

            this.serviceLog = serviceLog;
            return this;
        }
        @CustomType.Setter
        public Builder serviceToForkFrom(@Nullable String serviceToForkFrom) {

            this.serviceToForkFrom = serviceToForkFrom;
            return this;
        }
        @CustomType.Setter
        public Builder sharedBuffersPercentage(@Nullable Double sharedBuffersPercentage) {

            this.sharedBuffersPercentage = sharedBuffersPercentage;
            return this;
        }
        @CustomType.Setter
        public Builder staticIps(@Nullable Boolean staticIps) {

            this.staticIps = staticIps;
            return this;
        }
        @CustomType.Setter
        public Builder synchronousReplication(@Nullable String synchronousReplication) {

            this.synchronousReplication = synchronousReplication;
            return this;
        }
        @CustomType.Setter
        public Builder timescaledb(@Nullable PgPgUserConfigTimescaledb timescaledb) {

            this.timescaledb = timescaledb;
            return this;
        }
        @CustomType.Setter
        public Builder variant(@Nullable String variant) {

            this.variant = variant;
            return this;
        }
        @CustomType.Setter
        public Builder workMem(@Nullable Integer workMem) {

            this.workMem = workMem;
            return this;
        }
        public PgPgUserConfig build() {
            final var _resultValue = new PgPgUserConfig();
            _resultValue.additionalBackupRegions = additionalBackupRegions;
            _resultValue.adminPassword = adminPassword;
            _resultValue.adminUsername = adminUsername;
            _resultValue.backupHour = backupHour;
            _resultValue.backupMinute = backupMinute;
            _resultValue.enableIpv6 = enableIpv6;
            _resultValue.ipFilterObjects = ipFilterObjects;
            _resultValue.ipFilterStrings = ipFilterStrings;
            _resultValue.ipFilters = ipFilters;
            _resultValue.migration = migration;
            _resultValue.pg = pg;
            _resultValue.pgQualstats = pgQualstats;
            _resultValue.pgReadReplica = pgReadReplica;
            _resultValue.pgServiceToForkFrom = pgServiceToForkFrom;
            _resultValue.pgStatMonitorEnable = pgStatMonitorEnable;
            _resultValue.pgVersion = pgVersion;
            _resultValue.pgaudit = pgaudit;
            _resultValue.pgbouncer = pgbouncer;
            _resultValue.pglookout = pglookout;
            _resultValue.privateAccess = privateAccess;
            _resultValue.privatelinkAccess = privatelinkAccess;
            _resultValue.projectToForkFrom = projectToForkFrom;
            _resultValue.publicAccess = publicAccess;
            _resultValue.recoveryTargetTime = recoveryTargetTime;
            _resultValue.serviceLog = serviceLog;
            _resultValue.serviceToForkFrom = serviceToForkFrom;
            _resultValue.sharedBuffersPercentage = sharedBuffersPercentage;
            _resultValue.staticIps = staticIps;
            _resultValue.synchronousReplication = synchronousReplication;
            _resultValue.timescaledb = timescaledb;
            _resultValue.variant = variant;
            _resultValue.workMem = workMem;
            return _resultValue;
        }
    }
}
