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
    public sealed class GetServiceMysqlUserConfigResult
    {
        public readonly string? AdminPassword;
        public readonly string? AdminUsername;
        public readonly int? BackupHour;
        public readonly int? BackupMinute;
        public readonly ImmutableArray<string> IpFilters;
        public readonly Outputs.GetServiceMysqlUserConfigMysqlResult? Mysql;
        public readonly string? MysqlVersion;
        public readonly Outputs.GetServiceMysqlUserConfigPrivateAccessResult? PrivateAccess;
        public readonly Outputs.GetServiceMysqlUserConfigPublicAccessResult? PublicAccess;
        public readonly string? RecoveryTargetTime;
        public readonly string? ServiceToForkFrom;

        [OutputConstructor]
        private GetServiceMysqlUserConfigResult(
            string? adminPassword,

            string? adminUsername,

            int? backupHour,

            int? backupMinute,

            ImmutableArray<string> ipFilters,

            Outputs.GetServiceMysqlUserConfigMysqlResult? mysql,

            string? mysqlVersion,

            Outputs.GetServiceMysqlUserConfigPrivateAccessResult? privateAccess,

            Outputs.GetServiceMysqlUserConfigPublicAccessResult? publicAccess,

            string? recoveryTargetTime,

            string? serviceToForkFrom)
        {
            AdminPassword = adminPassword;
            AdminUsername = adminUsername;
            BackupHour = backupHour;
            BackupMinute = backupMinute;
            IpFilters = ipFilters;
            Mysql = mysql;
            MysqlVersion = mysqlVersion;
            PrivateAccess = privateAccess;
            PublicAccess = publicAccess;
            RecoveryTargetTime = recoveryTargetTime;
            ServiceToForkFrom = serviceToForkFrom;
        }
    }
}