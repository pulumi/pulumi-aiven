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
    public sealed class PgPgUserConfig
    {
        public readonly string? AdminPassword;
        public readonly string? AdminUsername;
        public readonly string? BackupHour;
        public readonly string? BackupMinute;
        public readonly ImmutableArray<string> IpFilters;
        public readonly Outputs.PgPgUserConfigMigration? Migration;
        public readonly Outputs.PgPgUserConfigPg? Pg;
        public readonly string? PgReadReplica;
        public readonly string? PgServiceToForkFrom;
        public readonly string? PgVersion;
        public readonly Outputs.PgPgUserConfigPgbouncer? Pgbouncer;
        public readonly Outputs.PgPgUserConfigPglookout? Pglookout;
        public readonly Outputs.PgPgUserConfigPrivateAccess? PrivateAccess;
        public readonly Outputs.PgPgUserConfigPublicAccess? PublicAccess;
        public readonly string? RecoveryTargetTime;
        public readonly string? ServiceToForkFrom;
        public readonly string? SharedBuffersPercentage;
        public readonly string? SynchronousReplication;
        public readonly Outputs.PgPgUserConfigTimescaledb? Timescaledb;
        public readonly string? Variant;
        public readonly string? WorkMem;

        [OutputConstructor]
        private PgPgUserConfig(
            string? adminPassword,

            string? adminUsername,

            string? backupHour,

            string? backupMinute,

            ImmutableArray<string> ipFilters,

            Outputs.PgPgUserConfigMigration? migration,

            Outputs.PgPgUserConfigPg? pg,

            string? pgReadReplica,

            string? pgServiceToForkFrom,

            string? pgVersion,

            Outputs.PgPgUserConfigPgbouncer? pgbouncer,

            Outputs.PgPgUserConfigPglookout? pglookout,

            Outputs.PgPgUserConfigPrivateAccess? privateAccess,

            Outputs.PgPgUserConfigPublicAccess? publicAccess,

            string? recoveryTargetTime,

            string? serviceToForkFrom,

            string? sharedBuffersPercentage,

            string? synchronousReplication,

            Outputs.PgPgUserConfigTimescaledb? timescaledb,

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