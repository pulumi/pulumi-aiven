// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aiven.Outputs
{

    [OutputType]
    public sealed class GetFlinkFlinkUserConfigResult
    {
        /// <summary>
        /// Additional Cloud Regions for Backup Replication.
        /// </summary>
        public readonly string? AdditionalBackupRegions;
        /// <summary>
        /// Enable to upload Custom JARs for Flink applications.
        /// </summary>
        public readonly bool? CustomCode;
        /// <summary>
        /// Enum: `1.16`, `1.19`, `1.20`, and newer. Flink major version.
        /// </summary>
        public readonly string? FlinkVersion;
        /// <summary>
        /// Allow incoming connections from CIDR address block, e.g. `10.20.0.0/16`
        /// </summary>
        public readonly ImmutableArray<Outputs.GetFlinkFlinkUserConfigIpFilterObjectResult> IpFilterObjects;
        /// <summary>
        /// Allow incoming connections from CIDR address block, e.g. `10.20.0.0/16`.
        /// </summary>
        public readonly ImmutableArray<string> IpFilterStrings;
        /// <summary>
        /// Allow incoming connections from CIDR address block, e.g. `10.20.0.0/16`.
        /// </summary>
        public readonly ImmutableArray<string> IpFilters;
        /// <summary>
        /// Task slots per node. For a 3 node plan, total number of task slots is 3x this value. Example: `1`.
        /// </summary>
        public readonly int? NumberOfTaskSlots;
        /// <summary>
        /// Timeout in seconds used for all futures and blocking Pekko requests. Example: `10`.
        /// </summary>
        public readonly int? PekkoAskTimeoutS;
        /// <summary>
        /// Maximum size in bytes for messages exchanged between the JobManager and the TaskManagers. Example: `10485760`.
        /// </summary>
        public readonly int? PekkoFramesizeB;
        /// <summary>
        /// Allow access to selected service components through Privatelink
        /// </summary>
        public readonly Outputs.GetFlinkFlinkUserConfigPrivatelinkAccessResult? PrivatelinkAccess;
        /// <summary>
        /// Allow access to selected service ports from the public Internet
        /// </summary>
        public readonly Outputs.GetFlinkFlinkUserConfigPublicAccessResult? PublicAccess;
        /// <summary>
        /// Store logs for the service so that they are available in the HTTP API and console.
        /// </summary>
        public readonly bool? ServiceLog;
        /// <summary>
        /// Use static public IP addresses.
        /// </summary>
        public readonly bool? StaticIps;

        [OutputConstructor]
        private GetFlinkFlinkUserConfigResult(
            string? additionalBackupRegions,

            bool? customCode,

            string? flinkVersion,

            ImmutableArray<Outputs.GetFlinkFlinkUserConfigIpFilterObjectResult> ipFilterObjects,

            ImmutableArray<string> ipFilterStrings,

            ImmutableArray<string> ipFilters,

            int? numberOfTaskSlots,

            int? pekkoAskTimeoutS,

            int? pekkoFramesizeB,

            Outputs.GetFlinkFlinkUserConfigPrivatelinkAccessResult? privatelinkAccess,

            Outputs.GetFlinkFlinkUserConfigPublicAccessResult? publicAccess,

            bool? serviceLog,

            bool? staticIps)
        {
            AdditionalBackupRegions = additionalBackupRegions;
            CustomCode = customCode;
            FlinkVersion = flinkVersion;
            IpFilterObjects = ipFilterObjects;
            IpFilterStrings = ipFilterStrings;
            IpFilters = ipFilters;
            NumberOfTaskSlots = numberOfTaskSlots;
            PekkoAskTimeoutS = pekkoAskTimeoutS;
            PekkoFramesizeB = pekkoFramesizeB;
            PrivatelinkAccess = privatelinkAccess;
            PublicAccess = publicAccess;
            ServiceLog = serviceLog;
            StaticIps = staticIps;
        }
    }
}
