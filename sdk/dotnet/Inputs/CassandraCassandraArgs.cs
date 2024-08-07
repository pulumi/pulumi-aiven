// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aiven.Inputs
{

    public sealed class CassandraCassandraArgs : global::Pulumi.ResourceArgs
    {
        [Input("uris")]
        private InputList<string>? _uris;

        /// <summary>
        /// Cassandra server URIs.
        /// </summary>
        public InputList<string> Uris
        {
            get => _uris ?? (_uris = new InputList<string>());
            set => _uris = value;
        }

        public CassandraCassandraArgs()
        {
        }
        public static new CassandraCassandraArgs Empty => new CassandraCassandraArgs();
    }
}
