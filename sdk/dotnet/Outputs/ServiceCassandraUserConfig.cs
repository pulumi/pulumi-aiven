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
    public sealed class ServiceCassandraUserConfig
    {
        public readonly ImmutableArray<string> IpFilters;
        public readonly string? MigrateSstableloader;
        public readonly Outputs.ServiceCassandraUserConfigPrivateAccess? PrivateAccess;
        public readonly Outputs.ServiceCassandraUserConfigPublicAccess? PublicAccess;
        public readonly string? ServiceToForkFrom;

        [OutputConstructor]
        private ServiceCassandraUserConfig(
            ImmutableArray<string> ipFilters,

            string? migrateSstableloader,

            Outputs.ServiceCassandraUserConfigPrivateAccess? privateAccess,

            Outputs.ServiceCassandraUserConfigPublicAccess? publicAccess,

            string? serviceToForkFrom)
        {
            IpFilters = ipFilters;
            MigrateSstableloader = migrateSstableloader;
            PrivateAccess = privateAccess;
            PublicAccess = publicAccess;
            ServiceToForkFrom = serviceToForkFrom;
        }
    }
}