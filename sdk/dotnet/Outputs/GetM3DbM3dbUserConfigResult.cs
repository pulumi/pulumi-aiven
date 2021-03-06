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
    public sealed class GetM3DbM3dbUserConfigResult
    {
        /// <summary>
        /// Serve the web frontend using a custom CNAME pointing to the Aiven DNS name.
        /// </summary>
        public readonly string? CustomDomain;
        /// <summary>
        /// Allow incoming connections from CIDR address block, e.g. '10.20.0.0/16'
        /// </summary>
        public readonly ImmutableArray<string> IpFilters;
        /// <summary>
        /// M3 limits
        /// </summary>
        public readonly Outputs.GetM3DbM3dbUserConfigLimitsResult? Limits;
        public readonly string? M3Version;
        /// <summary>
        /// Enables access to Graphite Carbon 
        /// plaintext metrics ingestion. It can be enabled only for services inside VPCs. The
        /// metrics are written to aggregated namespaces only.
        /// </summary>
        public readonly string? M3coordinatorEnableGraphiteCarbonIngest;
        /// <summary>
        /// M3 major version
        /// </summary>
        public readonly string? M3dbVersion;
        /// <summary>
        /// List of M3 namespaces
        /// </summary>
        public readonly ImmutableArray<Outputs.GetM3DbM3dbUserConfigNamespaceResult> Namespaces;
        /// <summary>
        /// Allow access to selected service ports from private networks.
        /// </summary>
        public readonly Outputs.GetM3DbM3dbUserConfigPrivateAccessResult? PrivateAccess;
        /// <summary>
        /// Name of another project to fork a service from. This has
        /// effect only when a new service is being created.
        /// </summary>
        public readonly string? ProjectToForkFrom;
        /// <summary>
        /// Allow access to selected service ports from the public Internet.
        /// </summary>
        public readonly Outputs.GetM3DbM3dbUserConfigPublicAccessResult? PublicAccess;
        /// <summary>
        /// Mapping rules allow more granular use of aggregation, not simply sending
        /// everything to a namespace. If mapping rules exist that target a namespace, only data matching mapping
        /// rules will be sent to it and nothing else.
        /// </summary>
        public readonly Outputs.GetM3DbM3dbUserConfigRulesResult? Rules;
        /// <summary>
        /// Name of another service to fork from. This has effect only 
        /// when a new service is being created.
        /// </summary>
        public readonly string? ServiceToForkFrom;

        [OutputConstructor]
        private GetM3DbM3dbUserConfigResult(
            string? customDomain,

            ImmutableArray<string> ipFilters,

            Outputs.GetM3DbM3dbUserConfigLimitsResult? limits,

            string? m3Version,

            string? m3coordinatorEnableGraphiteCarbonIngest,

            string? m3dbVersion,

            ImmutableArray<Outputs.GetM3DbM3dbUserConfigNamespaceResult> namespaces,

            Outputs.GetM3DbM3dbUserConfigPrivateAccessResult? privateAccess,

            string? projectToForkFrom,

            Outputs.GetM3DbM3dbUserConfigPublicAccessResult? publicAccess,

            Outputs.GetM3DbM3dbUserConfigRulesResult? rules,

            string? serviceToForkFrom)
        {
            CustomDomain = customDomain;
            IpFilters = ipFilters;
            Limits = limits;
            M3Version = m3Version;
            M3coordinatorEnableGraphiteCarbonIngest = m3coordinatorEnableGraphiteCarbonIngest;
            M3dbVersion = m3dbVersion;
            Namespaces = namespaces;
            PrivateAccess = privateAccess;
            ProjectToForkFrom = projectToForkFrom;
            PublicAccess = publicAccess;
            Rules = rules;
            ServiceToForkFrom = serviceToForkFrom;
        }
    }
}
