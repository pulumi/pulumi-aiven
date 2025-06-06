// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aiven.outputs;

import com.pulumi.aiven.outputs.AlloydbomniAlloydbomniUserConfigIpFilterObject;
import com.pulumi.aiven.outputs.AlloydbomniAlloydbomniUserConfigPg;
import com.pulumi.aiven.outputs.AlloydbomniAlloydbomniUserConfigPgaudit;
import com.pulumi.aiven.outputs.AlloydbomniAlloydbomniUserConfigPgbouncer;
import com.pulumi.aiven.outputs.AlloydbomniAlloydbomniUserConfigPglookout;
import com.pulumi.aiven.outputs.AlloydbomniAlloydbomniUserConfigPrivateAccess;
import com.pulumi.aiven.outputs.AlloydbomniAlloydbomniUserConfigPrivatelinkAccess;
import com.pulumi.aiven.outputs.AlloydbomniAlloydbomniUserConfigPublicAccess;
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
public final class AlloydbomniAlloydbomniUserConfig {
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
     * @return Enum: `15`, and newer. PostgreSQL major version.
     * 
     */
    private @Nullable String alloydbomniVersion;
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
     * @return Enables or disables the columnar engine. When enabled, it accelerates SQL query processing. Default: `true`.
     * 
     */
    private @Nullable Boolean googleColumnarEngineEnabled;
    /**
     * @return Allocate the amount of RAM to store columnar data. Default: `10`.
     * 
     */
    private @Nullable Integer googleColumnarEngineMemorySizePercentage;
    /**
     * @return Allow incoming connections from CIDR address block, e.g. `10.20.0.0/16`
     * 
     */
    private @Nullable List<AlloydbomniAlloydbomniUserConfigIpFilterObject> ipFilterObjects;
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
     * @return postgresql.conf configuration values
     * 
     */
    private @Nullable AlloydbomniAlloydbomniUserConfigPg pg;
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
     * @return Enum: `15`, and newer. PostgreSQL major version.
     * 
     */
    private @Nullable String pgVersion;
    /**
     * @return System-wide settings for the pgaudit extension
     * 
     */
    private @Nullable AlloydbomniAlloydbomniUserConfigPgaudit pgaudit;
    /**
     * @return PGBouncer connection pooling settings
     * 
     */
    private @Nullable AlloydbomniAlloydbomniUserConfigPgbouncer pgbouncer;
    /**
     * @return System-wide settings for pglookout
     * 
     */
    private @Nullable AlloydbomniAlloydbomniUserConfigPglookout pglookout;
    /**
     * @return Allow access to selected service ports from private networks
     * 
     */
    private @Nullable AlloydbomniAlloydbomniUserConfigPrivateAccess privateAccess;
    /**
     * @return Allow access to selected service components through Privatelink
     * 
     */
    private @Nullable AlloydbomniAlloydbomniUserConfigPrivatelinkAccess privatelinkAccess;
    /**
     * @return Name of another project to fork a service from. This has effect only when a new service is being created. Example: `anotherprojectname`.
     * 
     */
    private @Nullable String projectToForkFrom;
    /**
     * @return Allow access to selected service ports from the public Internet
     * 
     */
    private @Nullable AlloydbomniAlloydbomniUserConfigPublicAccess publicAccess;
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
     * @return Enum: `aiven`, `timescale`. Variant of the PostgreSQL service, may affect the features that are exposed by default.
     * 
     */
    private @Nullable String variant;
    /**
     * @return Sets the maximum amount of memory to be used by a query operation (such as a sort or hash table) before writing to temporary disk files, in MB. The default is 1MB + 0.075% of total RAM (up to 32MB). Example: `4`.
     * 
     */
    private @Nullable Integer workMem;

    private AlloydbomniAlloydbomniUserConfig() {}
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
     * @return Enum: `15`, and newer. PostgreSQL major version.
     * 
     */
    public Optional<String> alloydbomniVersion() {
        return Optional.ofNullable(this.alloydbomniVersion);
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
     * @return Enables or disables the columnar engine. When enabled, it accelerates SQL query processing. Default: `true`.
     * 
     */
    public Optional<Boolean> googleColumnarEngineEnabled() {
        return Optional.ofNullable(this.googleColumnarEngineEnabled);
    }
    /**
     * @return Allocate the amount of RAM to store columnar data. Default: `10`.
     * 
     */
    public Optional<Integer> googleColumnarEngineMemorySizePercentage() {
        return Optional.ofNullable(this.googleColumnarEngineMemorySizePercentage);
    }
    /**
     * @return Allow incoming connections from CIDR address block, e.g. `10.20.0.0/16`
     * 
     */
    public List<AlloydbomniAlloydbomniUserConfigIpFilterObject> ipFilterObjects() {
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
     * @return postgresql.conf configuration values
     * 
     */
    public Optional<AlloydbomniAlloydbomniUserConfigPg> pg() {
        return Optional.ofNullable(this.pg);
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
     * @return Enum: `15`, and newer. PostgreSQL major version.
     * 
     */
    public Optional<String> pgVersion() {
        return Optional.ofNullable(this.pgVersion);
    }
    /**
     * @return System-wide settings for the pgaudit extension
     * 
     */
    public Optional<AlloydbomniAlloydbomniUserConfigPgaudit> pgaudit() {
        return Optional.ofNullable(this.pgaudit);
    }
    /**
     * @return PGBouncer connection pooling settings
     * 
     */
    public Optional<AlloydbomniAlloydbomniUserConfigPgbouncer> pgbouncer() {
        return Optional.ofNullable(this.pgbouncer);
    }
    /**
     * @return System-wide settings for pglookout
     * 
     */
    public Optional<AlloydbomniAlloydbomniUserConfigPglookout> pglookout() {
        return Optional.ofNullable(this.pglookout);
    }
    /**
     * @return Allow access to selected service ports from private networks
     * 
     */
    public Optional<AlloydbomniAlloydbomniUserConfigPrivateAccess> privateAccess() {
        return Optional.ofNullable(this.privateAccess);
    }
    /**
     * @return Allow access to selected service components through Privatelink
     * 
     */
    public Optional<AlloydbomniAlloydbomniUserConfigPrivatelinkAccess> privatelinkAccess() {
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
    public Optional<AlloydbomniAlloydbomniUserConfigPublicAccess> publicAccess() {
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

    public static Builder builder(AlloydbomniAlloydbomniUserConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String additionalBackupRegions;
        private @Nullable String adminPassword;
        private @Nullable String adminUsername;
        private @Nullable String alloydbomniVersion;
        private @Nullable Integer backupHour;
        private @Nullable Integer backupMinute;
        private @Nullable Boolean enableIpv6;
        private @Nullable Boolean googleColumnarEngineEnabled;
        private @Nullable Integer googleColumnarEngineMemorySizePercentage;
        private @Nullable List<AlloydbomniAlloydbomniUserConfigIpFilterObject> ipFilterObjects;
        private @Nullable List<String> ipFilterStrings;
        private @Nullable List<String> ipFilters;
        private @Nullable AlloydbomniAlloydbomniUserConfigPg pg;
        private @Nullable Boolean pgReadReplica;
        private @Nullable String pgServiceToForkFrom;
        private @Nullable String pgVersion;
        private @Nullable AlloydbomniAlloydbomniUserConfigPgaudit pgaudit;
        private @Nullable AlloydbomniAlloydbomniUserConfigPgbouncer pgbouncer;
        private @Nullable AlloydbomniAlloydbomniUserConfigPglookout pglookout;
        private @Nullable AlloydbomniAlloydbomniUserConfigPrivateAccess privateAccess;
        private @Nullable AlloydbomniAlloydbomniUserConfigPrivatelinkAccess privatelinkAccess;
        private @Nullable String projectToForkFrom;
        private @Nullable AlloydbomniAlloydbomniUserConfigPublicAccess publicAccess;
        private @Nullable String recoveryTargetTime;
        private @Nullable Boolean serviceLog;
        private @Nullable String serviceToForkFrom;
        private @Nullable Double sharedBuffersPercentage;
        private @Nullable Boolean staticIps;
        private @Nullable String synchronousReplication;
        private @Nullable String variant;
        private @Nullable Integer workMem;
        public Builder() {}
        public Builder(AlloydbomniAlloydbomniUserConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalBackupRegions = defaults.additionalBackupRegions;
    	      this.adminPassword = defaults.adminPassword;
    	      this.adminUsername = defaults.adminUsername;
    	      this.alloydbomniVersion = defaults.alloydbomniVersion;
    	      this.backupHour = defaults.backupHour;
    	      this.backupMinute = defaults.backupMinute;
    	      this.enableIpv6 = defaults.enableIpv6;
    	      this.googleColumnarEngineEnabled = defaults.googleColumnarEngineEnabled;
    	      this.googleColumnarEngineMemorySizePercentage = defaults.googleColumnarEngineMemorySizePercentage;
    	      this.ipFilterObjects = defaults.ipFilterObjects;
    	      this.ipFilterStrings = defaults.ipFilterStrings;
    	      this.ipFilters = defaults.ipFilters;
    	      this.pg = defaults.pg;
    	      this.pgReadReplica = defaults.pgReadReplica;
    	      this.pgServiceToForkFrom = defaults.pgServiceToForkFrom;
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
        public Builder alloydbomniVersion(@Nullable String alloydbomniVersion) {

            this.alloydbomniVersion = alloydbomniVersion;
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
        public Builder googleColumnarEngineEnabled(@Nullable Boolean googleColumnarEngineEnabled) {

            this.googleColumnarEngineEnabled = googleColumnarEngineEnabled;
            return this;
        }
        @CustomType.Setter
        public Builder googleColumnarEngineMemorySizePercentage(@Nullable Integer googleColumnarEngineMemorySizePercentage) {

            this.googleColumnarEngineMemorySizePercentage = googleColumnarEngineMemorySizePercentage;
            return this;
        }
        @CustomType.Setter
        public Builder ipFilterObjects(@Nullable List<AlloydbomniAlloydbomniUserConfigIpFilterObject> ipFilterObjects) {

            this.ipFilterObjects = ipFilterObjects;
            return this;
        }
        public Builder ipFilterObjects(AlloydbomniAlloydbomniUserConfigIpFilterObject... ipFilterObjects) {
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
        public Builder pg(@Nullable AlloydbomniAlloydbomniUserConfigPg pg) {

            this.pg = pg;
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
        public Builder pgVersion(@Nullable String pgVersion) {

            this.pgVersion = pgVersion;
            return this;
        }
        @CustomType.Setter
        public Builder pgaudit(@Nullable AlloydbomniAlloydbomniUserConfigPgaudit pgaudit) {

            this.pgaudit = pgaudit;
            return this;
        }
        @CustomType.Setter
        public Builder pgbouncer(@Nullable AlloydbomniAlloydbomniUserConfigPgbouncer pgbouncer) {

            this.pgbouncer = pgbouncer;
            return this;
        }
        @CustomType.Setter
        public Builder pglookout(@Nullable AlloydbomniAlloydbomniUserConfigPglookout pglookout) {

            this.pglookout = pglookout;
            return this;
        }
        @CustomType.Setter
        public Builder privateAccess(@Nullable AlloydbomniAlloydbomniUserConfigPrivateAccess privateAccess) {

            this.privateAccess = privateAccess;
            return this;
        }
        @CustomType.Setter
        public Builder privatelinkAccess(@Nullable AlloydbomniAlloydbomniUserConfigPrivatelinkAccess privatelinkAccess) {

            this.privatelinkAccess = privatelinkAccess;
            return this;
        }
        @CustomType.Setter
        public Builder projectToForkFrom(@Nullable String projectToForkFrom) {

            this.projectToForkFrom = projectToForkFrom;
            return this;
        }
        @CustomType.Setter
        public Builder publicAccess(@Nullable AlloydbomniAlloydbomniUserConfigPublicAccess publicAccess) {

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
        public Builder variant(@Nullable String variant) {

            this.variant = variant;
            return this;
        }
        @CustomType.Setter
        public Builder workMem(@Nullable Integer workMem) {

            this.workMem = workMem;
            return this;
        }
        public AlloydbomniAlloydbomniUserConfig build() {
            final var _resultValue = new AlloydbomniAlloydbomniUserConfig();
            _resultValue.additionalBackupRegions = additionalBackupRegions;
            _resultValue.adminPassword = adminPassword;
            _resultValue.adminUsername = adminUsername;
            _resultValue.alloydbomniVersion = alloydbomniVersion;
            _resultValue.backupHour = backupHour;
            _resultValue.backupMinute = backupMinute;
            _resultValue.enableIpv6 = enableIpv6;
            _resultValue.googleColumnarEngineEnabled = googleColumnarEngineEnabled;
            _resultValue.googleColumnarEngineMemorySizePercentage = googleColumnarEngineMemorySizePercentage;
            _resultValue.ipFilterObjects = ipFilterObjects;
            _resultValue.ipFilterStrings = ipFilterStrings;
            _resultValue.ipFilters = ipFilters;
            _resultValue.pg = pg;
            _resultValue.pgReadReplica = pgReadReplica;
            _resultValue.pgServiceToForkFrom = pgServiceToForkFrom;
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
            _resultValue.variant = variant;
            _resultValue.workMem = workMem;
            return _resultValue;
        }
    }
}
