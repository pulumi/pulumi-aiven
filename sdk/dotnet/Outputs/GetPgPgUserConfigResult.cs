// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aiven.Outputs
{

    [OutputType]
    public sealed class GetPgPgUserConfigResult
    {
        /// <summary>
        /// custom password for admin user. Defaults to random string. *This must
        /// be set only when a new service is being created.*
        /// </summary>
        public readonly string? AdminPassword;
        /// <summary>
        /// custom username for admin user. *This must be set only when a new service
        /// is being created.*
        /// </summary>
        public readonly string? AdminUsername;
        /// <summary>
        /// the hour of day (in UTC) when backup for the service is started. New backup 
        /// is only started if previous backup has already completed.
        /// </summary>
        public readonly string? BackupHour;
        /// <summary>
        /// the minute of an hour when backup for the service is started. New backup 
        /// is only started if previous backup has already completed.
        /// </summary>
        public readonly string? BackupMinute;
        /// <summary>
        /// allow incoming connections from CIDR address block, e.g. `10.20.0.0/16`
        /// </summary>
        public readonly ImmutableArray<string> IpFilters;
        /// <summary>
        /// migrate data from existing server, has the following options:
        /// </summary>
        public readonly Outputs.GetPgPgUserConfigMigrationResult? Migration;
        /// <summary>
        /// PostgreSQL specific server provided values.
        /// </summary>
        public readonly Outputs.GetPgPgUserConfigPgResult? Pg;
        /// <summary>
        /// This setting is deprecated. Use read-replica service integration instead.
        /// </summary>
        public readonly string? PgReadReplica;
        /// <summary>
        /// Name of the PG Service from which to fork (deprecated, use service_to_fork_from). 
        /// This has effect only when a new service is being created.
        /// </summary>
        public readonly string? PgServiceToForkFrom;
        /// <summary>
        /// PostgreSQL major version.
        /// </summary>
        public readonly string? PgVersion;
        /// <summary>
        /// Enable pgbouncer.
        /// </summary>
        public readonly Outputs.GetPgPgUserConfigPgbouncerResult? Pgbouncer;
        /// <summary>
        /// PGLookout settings.
        /// </summary>
        public readonly Outputs.GetPgPgUserConfigPglookoutResult? Pglookout;
        /// <summary>
        /// Allow access to selected service ports from private networks.
        /// </summary>
        public readonly Outputs.GetPgPgUserConfigPrivateAccessResult? PrivateAccess;
        /// <summary>
        /// Allow access to selected service components through Privatelink.
        /// </summary>
        public readonly Outputs.GetPgPgUserConfigPrivatelinkAccessResult? PrivatelinkAccess;
        /// <summary>
        /// Name of another project to fork a service from. This has
        /// effect only when a new service is being created.
        /// </summary>
        public readonly string? ProjectToForkFrom;
        /// <summary>
        /// Allow access to selected service ports from the public Internet
        /// </summary>
        public readonly Outputs.GetPgPgUserConfigPublicAccessResult? PublicAccess;
        /// <summary>
        /// Recovery target time when forking a service. This has effect 
        /// only when a new service is being created.
        /// </summary>
        public readonly string? RecoveryTargetTime;
        /// <summary>
        /// Name of another service to fork from. This has effect only 
        /// when a new service is being created.
        /// </summary>
        public readonly string? ServiceToForkFrom;
        /// <summary>
        /// Percentage of total RAM that the database server uses for 
        /// memory buffers. Valid range is 20-60 (float), which corresponds to 20% - 60%. This setting adjusts
        /// the shared_buffers configuration value. The absolute maximum is 12 GB.
        /// </summary>
        public readonly string? SharedBuffersPercentage;
        /// <summary>
        /// Synchronous replication type. Note that the service plan 
        /// also needs to support synchronous replication.
        /// </summary>
        public readonly string? SynchronousReplication;
        /// <summary>
        /// TimescaleDB extension configuration values.
        /// </summary>
        public readonly Outputs.GetPgPgUserConfigTimescaledbResult? Timescaledb;
        /// <summary>
        /// Variant of the PostgreSQL service, may affect the features that are 
        /// exposed by default. Options: `aiven` or `timescale`.
        /// </summary>
        public readonly string? Variant;
        /// <summary>
        /// Sets the maximum amount of memory to be used by a query operation (such 
        /// as a sort or hash table) before writing to temporary disk files, in MB. Default is 1MB + 0.075% of
        /// total RAM (up to 32MB).
        /// </summary>
        public readonly string? WorkMem;

        [OutputConstructor]
        private GetPgPgUserConfigResult(
            string? adminPassword,

            string? adminUsername,

            string? backupHour,

            string? backupMinute,

            ImmutableArray<string> ipFilters,

            Outputs.GetPgPgUserConfigMigrationResult? migration,

            Outputs.GetPgPgUserConfigPgResult? pg,

            string? pgReadReplica,

            string? pgServiceToForkFrom,

            string? pgVersion,

            Outputs.GetPgPgUserConfigPgbouncerResult? pgbouncer,

            Outputs.GetPgPgUserConfigPglookoutResult? pglookout,

            Outputs.GetPgPgUserConfigPrivateAccessResult? privateAccess,

            Outputs.GetPgPgUserConfigPrivatelinkAccessResult? privatelinkAccess,

            string? projectToForkFrom,

            Outputs.GetPgPgUserConfigPublicAccessResult? publicAccess,

            string? recoveryTargetTime,

            string? serviceToForkFrom,

            string? sharedBuffersPercentage,

            string? synchronousReplication,

            Outputs.GetPgPgUserConfigTimescaledbResult? timescaledb,

            string? variant,

            string? workMem)
        {
            AdminPassword = adminPassword;
            AdminUsername = adminUsername;
            BackupHour = backupHour;
            BackupMinute = backupMinute;
            IpFilters = ipFilters;
            Migration = migration;
            Pg = pg;
            PgReadReplica = pgReadReplica;
            PgServiceToForkFrom = pgServiceToForkFrom;
            PgVersion = pgVersion;
            Pgbouncer = pgbouncer;
            Pglookout = pglookout;
            PrivateAccess = privateAccess;
            PrivatelinkAccess = privatelinkAccess;
            ProjectToForkFrom = projectToForkFrom;
            PublicAccess = publicAccess;
            RecoveryTargetTime = recoveryTargetTime;
            ServiceToForkFrom = serviceToForkFrom;
            SharedBuffersPercentage = sharedBuffersPercentage;
            SynchronousReplication = synchronousReplication;
            Timescaledb = timescaledb;
            Variant = variant;
            WorkMem = workMem;
        }
    }
}
