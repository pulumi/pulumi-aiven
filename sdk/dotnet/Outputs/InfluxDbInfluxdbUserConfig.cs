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
    public sealed class InfluxDbInfluxdbUserConfig
    {
        /// <summary>
        /// Serve the web frontend using a custom CNAME pointing to the Aiven DNS name
        /// </summary>
        public readonly string? CustomDomain;
        /// <summary>
        /// influxdb.conf configuration values
        /// </summary>
        public readonly Outputs.InfluxDbInfluxdbUserConfigInfluxdb? Influxdb;
        /// <summary>
        /// allow incoming connections from CIDR address block, e.g. `10.20.0.0/16`
        /// </summary>
        public readonly ImmutableArray<string> IpFilters;
        /// <summary>
        /// Allow access to selected service ports from private networks
        /// </summary>
        public readonly Outputs.InfluxDbInfluxdbUserConfigPrivateAccess? PrivateAccess;
        /// <summary>
        /// Allow access to selected service components through Privatelink
        /// </summary>
        public readonly Outputs.InfluxDbInfluxdbUserConfigPrivatelinkAccess? PrivatelinkAccess;
        /// <summary>
        /// Name of another project to fork a service from. This has 
        /// effect only when a new service is being created.
        /// </summary>
        public readonly string? ProjectToForkFrom;
        /// <summary>
        /// Allow access to selected service ports from the public Internet
        /// </summary>
        public readonly Outputs.InfluxDbInfluxdbUserConfigPublicAccess? PublicAccess;
        /// <summary>
        /// Name of the basebackup to restore in forked service
        /// </summary>
        public readonly string? RecoveryBasebackupName;
        /// <summary>
        /// Name of another service to fork from. This has effect 
        /// only when a new service is being created.
        /// </summary>
        public readonly string? ServiceToForkFrom;

        [OutputConstructor]
        private InfluxDbInfluxdbUserConfig(
            string? customDomain,

            Outputs.InfluxDbInfluxdbUserConfigInfluxdb? influxdb,

            ImmutableArray<string> ipFilters,

            Outputs.InfluxDbInfluxdbUserConfigPrivateAccess? privateAccess,

            Outputs.InfluxDbInfluxdbUserConfigPrivatelinkAccess? privatelinkAccess,

            string? projectToForkFrom,

            Outputs.InfluxDbInfluxdbUserConfigPublicAccess? publicAccess,

            string? recoveryBasebackupName,

            string? serviceToForkFrom)
        {
            CustomDomain = customDomain;
            Influxdb = influxdb;
            IpFilters = ipFilters;
            PrivateAccess = privateAccess;
            PrivatelinkAccess = privatelinkAccess;
            ProjectToForkFrom = projectToForkFrom;
            PublicAccess = publicAccess;
            RecoveryBasebackupName = recoveryBasebackupName;
            ServiceToForkFrom = serviceToForkFrom;
        }
    }
}
