// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aiven.Inputs
{

    public sealed class GetCassandraCassandraUserConfigInputArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Cassandra specific server provided values.
        /// </summary>
        [Input("cassandra")]
        public Input<Inputs.GetCassandraCassandraUserConfigCassandraInputArgs>? Cassandra { get; set; }

        [Input("cassandraVersion")]
        public Input<string>? CassandraVersion { get; set; }

        [Input("ipFilters")]
        private InputList<string>? _ipFilters;

        /// <summary>
        /// allow incoming connections from CIDR address block, e.g. `10.20.0.0/16`
        /// </summary>
        public InputList<string> IpFilters
        {
            get => _ipFilters ?? (_ipFilters = new InputList<string>());
            set => _ipFilters = value;
        }

        /// <summary>
        /// sets the service into migration mode enabling the sstableloader 
        /// utility to be used to upload Cassandra data files. Available only on service create.
        /// </summary>
        [Input("migrateSstableloader")]
        public Input<string>? MigrateSstableloader { get; set; }

        /// <summary>
        /// Allow access to selected service ports from private networks.
        /// </summary>
        [Input("privateAccess")]
        public Input<Inputs.GetCassandraCassandraUserConfigPrivateAccessInputArgs>? PrivateAccess { get; set; }

        [Input("projectToForkFrom")]
        public Input<string>? ProjectToForkFrom { get; set; }

        /// <summary>
        /// Allow access to selected service ports from the public Internet
        /// </summary>
        [Input("publicAccess")]
        public Input<Inputs.GetCassandraCassandraUserConfigPublicAccessInputArgs>? PublicAccess { get; set; }

        /// <summary>
        /// Name of another service to fork from. This has effect only 
        /// when a new service is being created.
        /// </summary>
        [Input("serviceToForkFrom")]
        public Input<string>? ServiceToForkFrom { get; set; }

        [Input("staticIps")]
        public Input<string>? StaticIps { get; set; }

        public GetCassandraCassandraUserConfigInputArgs()
        {
        }
    }
}