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
    public sealed class ServiceMysqlUserConfigMysql
    {
        public readonly int? ConnectTimeout;
        public readonly string? DefaultTimeZone;
        public readonly int? GroupConcatMaxLen;
        public readonly int? InformationSchemaStatsExpiry;
        public readonly int? InnodbFtMinTokenSize;
        public readonly string? InnodbFtServerStopwordTable;
        public readonly int? InnodbLockWaitTimeout;
        public readonly int? InnodbOnlineAlterLogMaxSize;
        public readonly string? InnodbRollbackOnTimeout;
        public readonly int? MaxAllowedPacket;
        public readonly int? NetReadTimeout;
        public readonly int? NetWriteTimeout;
        public readonly string? SqlMode;
        public readonly string? SqlRequirePrimaryKey;
        public readonly int? WaitTimeout;

        [OutputConstructor]
        private ServiceMysqlUserConfigMysql(
            int? connectTimeout,

            string? defaultTimeZone,

            int? groupConcatMaxLen,

            int? informationSchemaStatsExpiry,

            int? innodbFtMinTokenSize,

            string? innodbFtServerStopwordTable,

            int? innodbLockWaitTimeout,

            int? innodbOnlineAlterLogMaxSize,

            string? innodbRollbackOnTimeout,

            int? maxAllowedPacket,

            int? netReadTimeout,

            int? netWriteTimeout,

            string? sqlMode,

            string? sqlRequirePrimaryKey,

            int? waitTimeout)
        {
            ConnectTimeout = connectTimeout;
            DefaultTimeZone = defaultTimeZone;
            GroupConcatMaxLen = groupConcatMaxLen;
            InformationSchemaStatsExpiry = informationSchemaStatsExpiry;
            InnodbFtMinTokenSize = innodbFtMinTokenSize;
            InnodbFtServerStopwordTable = innodbFtServerStopwordTable;
            InnodbLockWaitTimeout = innodbLockWaitTimeout;
            InnodbOnlineAlterLogMaxSize = innodbOnlineAlterLogMaxSize;
            InnodbRollbackOnTimeout = innodbRollbackOnTimeout;
            MaxAllowedPacket = maxAllowedPacket;
            NetReadTimeout = netReadTimeout;
            NetWriteTimeout = netWriteTimeout;
            SqlMode = sqlMode;
            SqlRequirePrimaryKey = sqlRequirePrimaryKey;
            WaitTimeout = waitTimeout;
        }
    }
}