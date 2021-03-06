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
    public sealed class GetCassandaCassandraUserConfigResult
    {
        /// <summary>
        /// Cassandra specific server provided values.
        /// </summary>
        public readonly Outputs.GetCassandaCassandraUserConfigCassandraResult? Cassandra;
        /// <summary>
        /// allow incoming connections from CIDR address block, e.g. `10.20.0.0/16`
        /// </summary>
        public readonly ImmutableArray<string> IpFilters;
        /// <summary>
        /// sets the service into migration mode enabling the sstableloader 
        /// utility to be used to upload Cassandra data files. Available only on service create.
        /// </summary>
        public readonly string? MigrateSstableloader;
        /// <summary>
        /// Allow access to selected service ports from private networks.
        /// </summary>
        public readonly Outputs.GetCassandaCassandraUserConfigPrivateAccessResult? PrivateAccess;
        public readonly string? ProjectToForkFrom;
        /// <summary>
        /// Allow access to selected service ports from the public Internet
        /// </summary>
        public readonly Outputs.GetCassandaCassandraUserConfigPublicAccessResult? PublicAccess;
        /// <summary>
        /// Name of another service to fork from. This has effect only 
        /// when a new service is being created.
        /// </summary>
        public readonly string? ServiceToForkFrom;

        [OutputConstructor]
        private GetCassandaCassandraUserConfigResult(
            Outputs.GetCassandaCassandraUserConfigCassandraResult? cassandra,

            ImmutableArray<string> ipFilters,

            string? migrateSstableloader,

            Outputs.GetCassandaCassandraUserConfigPrivateAccessResult? privateAccess,

            string? projectToForkFrom,

            Outputs.GetCassandaCassandraUserConfigPublicAccessResult? publicAccess,

            string? serviceToForkFrom)
        {
            Cassandra = cassandra;
            IpFilters = ipFilters;
            MigrateSstableloader = migrateSstableloader;
            PrivateAccess = privateAccess;
            ProjectToForkFrom = projectToForkFrom;
            PublicAccess = publicAccess;
            ServiceToForkFrom = serviceToForkFrom;
        }
    }
}
