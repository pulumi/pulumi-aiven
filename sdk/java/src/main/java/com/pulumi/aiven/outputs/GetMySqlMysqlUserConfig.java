// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aiven.outputs;

import com.pulumi.aiven.outputs.GetMySqlMysqlUserConfigIpFilterObject;
import com.pulumi.aiven.outputs.GetMySqlMysqlUserConfigMigration;
import com.pulumi.aiven.outputs.GetMySqlMysqlUserConfigMysql;
import com.pulumi.aiven.outputs.GetMySqlMysqlUserConfigPrivateAccess;
import com.pulumi.aiven.outputs.GetMySqlMysqlUserConfigPrivatelinkAccess;
import com.pulumi.aiven.outputs.GetMySqlMysqlUserConfigPublicAccess;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetMySqlMysqlUserConfig {
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
     * @return The minimum amount of time in seconds to keep binlog entries before deletion. This may be extended for services that require binlog entries for longer than the default for example if using the MySQL Debezium Kafka connector. Example: `600`.
     * 
     */
    private @Nullable Integer binlogRetentionPeriod;
    /**
     * @return Allow incoming connections from CIDR address block, e.g. `10.20.0.0/16`
     * 
     */
    private @Nullable List<GetMySqlMysqlUserConfigIpFilterObject> ipFilterObjects;
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
    private @Nullable GetMySqlMysqlUserConfigMigration migration;
    /**
     * @return mysql.conf configuration values
     * 
     */
    private @Nullable GetMySqlMysqlUserConfigMysql mysql;
    /**
     * @return Enum: `8`, and newer. MySQL major version.
     * 
     */
    private @Nullable String mysqlVersion;
    /**
     * @return Allow access to selected service ports from private networks
     * 
     */
    private @Nullable GetMySqlMysqlUserConfigPrivateAccess privateAccess;
    /**
     * @return Allow access to selected service components through Privatelink
     * 
     */
    private @Nullable GetMySqlMysqlUserConfigPrivatelinkAccess privatelinkAccess;
    /**
     * @return Name of another project to fork a service from. This has effect only when a new service is being created. Example: `anotherprojectname`.
     * 
     */
    private @Nullable String projectToForkFrom;
    /**
     * @return Allow access to selected service ports from the public Internet
     * 
     */
    private @Nullable GetMySqlMysqlUserConfigPublicAccess publicAccess;
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
     * @return Use static public IP addresses.
     * 
     */
    private @Nullable Boolean staticIps;

    private GetMySqlMysqlUserConfig() {}
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
     * @return The minimum amount of time in seconds to keep binlog entries before deletion. This may be extended for services that require binlog entries for longer than the default for example if using the MySQL Debezium Kafka connector. Example: `600`.
     * 
     */
    public Optional<Integer> binlogRetentionPeriod() {
        return Optional.ofNullable(this.binlogRetentionPeriod);
    }
    /**
     * @return Allow incoming connections from CIDR address block, e.g. `10.20.0.0/16`
     * 
     */
    public List<GetMySqlMysqlUserConfigIpFilterObject> ipFilterObjects() {
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
    public Optional<GetMySqlMysqlUserConfigMigration> migration() {
        return Optional.ofNullable(this.migration);
    }
    /**
     * @return mysql.conf configuration values
     * 
     */
    public Optional<GetMySqlMysqlUserConfigMysql> mysql() {
        return Optional.ofNullable(this.mysql);
    }
    /**
     * @return Enum: `8`, and newer. MySQL major version.
     * 
     */
    public Optional<String> mysqlVersion() {
        return Optional.ofNullable(this.mysqlVersion);
    }
    /**
     * @return Allow access to selected service ports from private networks
     * 
     */
    public Optional<GetMySqlMysqlUserConfigPrivateAccess> privateAccess() {
        return Optional.ofNullable(this.privateAccess);
    }
    /**
     * @return Allow access to selected service components through Privatelink
     * 
     */
    public Optional<GetMySqlMysqlUserConfigPrivatelinkAccess> privatelinkAccess() {
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
    public Optional<GetMySqlMysqlUserConfigPublicAccess> publicAccess() {
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
     * @return Use static public IP addresses.
     * 
     */
    public Optional<Boolean> staticIps() {
        return Optional.ofNullable(this.staticIps);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetMySqlMysqlUserConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String additionalBackupRegions;
        private @Nullable String adminPassword;
        private @Nullable String adminUsername;
        private @Nullable Integer backupHour;
        private @Nullable Integer backupMinute;
        private @Nullable Integer binlogRetentionPeriod;
        private @Nullable List<GetMySqlMysqlUserConfigIpFilterObject> ipFilterObjects;
        private @Nullable List<String> ipFilterStrings;
        private @Nullable List<String> ipFilters;
        private @Nullable GetMySqlMysqlUserConfigMigration migration;
        private @Nullable GetMySqlMysqlUserConfigMysql mysql;
        private @Nullable String mysqlVersion;
        private @Nullable GetMySqlMysqlUserConfigPrivateAccess privateAccess;
        private @Nullable GetMySqlMysqlUserConfigPrivatelinkAccess privatelinkAccess;
        private @Nullable String projectToForkFrom;
        private @Nullable GetMySqlMysqlUserConfigPublicAccess publicAccess;
        private @Nullable String recoveryTargetTime;
        private @Nullable Boolean serviceLog;
        private @Nullable String serviceToForkFrom;
        private @Nullable Boolean staticIps;
        public Builder() {}
        public Builder(GetMySqlMysqlUserConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalBackupRegions = defaults.additionalBackupRegions;
    	      this.adminPassword = defaults.adminPassword;
    	      this.adminUsername = defaults.adminUsername;
    	      this.backupHour = defaults.backupHour;
    	      this.backupMinute = defaults.backupMinute;
    	      this.binlogRetentionPeriod = defaults.binlogRetentionPeriod;
    	      this.ipFilterObjects = defaults.ipFilterObjects;
    	      this.ipFilterStrings = defaults.ipFilterStrings;
    	      this.ipFilters = defaults.ipFilters;
    	      this.migration = defaults.migration;
    	      this.mysql = defaults.mysql;
    	      this.mysqlVersion = defaults.mysqlVersion;
    	      this.privateAccess = defaults.privateAccess;
    	      this.privatelinkAccess = defaults.privatelinkAccess;
    	      this.projectToForkFrom = defaults.projectToForkFrom;
    	      this.publicAccess = defaults.publicAccess;
    	      this.recoveryTargetTime = defaults.recoveryTargetTime;
    	      this.serviceLog = defaults.serviceLog;
    	      this.serviceToForkFrom = defaults.serviceToForkFrom;
    	      this.staticIps = defaults.staticIps;
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
        public Builder binlogRetentionPeriod(@Nullable Integer binlogRetentionPeriod) {

            this.binlogRetentionPeriod = binlogRetentionPeriod;
            return this;
        }
        @CustomType.Setter
        public Builder ipFilterObjects(@Nullable List<GetMySqlMysqlUserConfigIpFilterObject> ipFilterObjects) {

            this.ipFilterObjects = ipFilterObjects;
            return this;
        }
        public Builder ipFilterObjects(GetMySqlMysqlUserConfigIpFilterObject... ipFilterObjects) {
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
        public Builder migration(@Nullable GetMySqlMysqlUserConfigMigration migration) {

            this.migration = migration;
            return this;
        }
        @CustomType.Setter
        public Builder mysql(@Nullable GetMySqlMysqlUserConfigMysql mysql) {

            this.mysql = mysql;
            return this;
        }
        @CustomType.Setter
        public Builder mysqlVersion(@Nullable String mysqlVersion) {

            this.mysqlVersion = mysqlVersion;
            return this;
        }
        @CustomType.Setter
        public Builder privateAccess(@Nullable GetMySqlMysqlUserConfigPrivateAccess privateAccess) {

            this.privateAccess = privateAccess;
            return this;
        }
        @CustomType.Setter
        public Builder privatelinkAccess(@Nullable GetMySqlMysqlUserConfigPrivatelinkAccess privatelinkAccess) {

            this.privatelinkAccess = privatelinkAccess;
            return this;
        }
        @CustomType.Setter
        public Builder projectToForkFrom(@Nullable String projectToForkFrom) {

            this.projectToForkFrom = projectToForkFrom;
            return this;
        }
        @CustomType.Setter
        public Builder publicAccess(@Nullable GetMySqlMysqlUserConfigPublicAccess publicAccess) {

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
        public Builder staticIps(@Nullable Boolean staticIps) {

            this.staticIps = staticIps;
            return this;
        }
        public GetMySqlMysqlUserConfig build() {
            final var _resultValue = new GetMySqlMysqlUserConfig();
            _resultValue.additionalBackupRegions = additionalBackupRegions;
            _resultValue.adminPassword = adminPassword;
            _resultValue.adminUsername = adminUsername;
            _resultValue.backupHour = backupHour;
            _resultValue.backupMinute = backupMinute;
            _resultValue.binlogRetentionPeriod = binlogRetentionPeriod;
            _resultValue.ipFilterObjects = ipFilterObjects;
            _resultValue.ipFilterStrings = ipFilterStrings;
            _resultValue.ipFilters = ipFilters;
            _resultValue.migration = migration;
            _resultValue.mysql = mysql;
            _resultValue.mysqlVersion = mysqlVersion;
            _resultValue.privateAccess = privateAccess;
            _resultValue.privatelinkAccess = privatelinkAccess;
            _resultValue.projectToForkFrom = projectToForkFrom;
            _resultValue.publicAccess = publicAccess;
            _resultValue.recoveryTargetTime = recoveryTargetTime;
            _resultValue.serviceLog = serviceLog;
            _resultValue.serviceToForkFrom = serviceToForkFrom;
            _resultValue.staticIps = staticIps;
            return _resultValue;
        }
    }
}
