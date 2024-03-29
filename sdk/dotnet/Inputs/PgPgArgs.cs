// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aiven.Inputs
{

    public sealed class PgPgArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Primary PostgreSQL database name
        /// </summary>
        [Input("dbname")]
        public Input<string>? Dbname { get; set; }

        /// <summary>
        /// PostgreSQL master node host IP or name
        /// </summary>
        [Input("host")]
        public Input<string>? Host { get; set; }

        /// <summary>
        /// Connection limit
        /// </summary>
        [Input("maxConnections")]
        public Input<int>? MaxConnections { get; set; }

        [Input("password")]
        private Input<string>? _password;

        /// <summary>
        /// PostgreSQL admin user password
        /// </summary>
        public Input<string>? Password
        {
            get => _password;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _password = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// PostgreSQL port
        /// </summary>
        [Input("port")]
        public Input<int>? Port { get; set; }

        [Input("replicaUri")]
        private Input<string>? _replicaUri;

        /// <summary>
        /// PostgreSQL replica URI for services with a replica
        /// </summary>
        public Input<string>? ReplicaUri
        {
            get => _replicaUri;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _replicaUri = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// PostgreSQL sslmode setting (currently always "require")
        /// </summary>
        [Input("sslmode")]
        public Input<string>? Sslmode { get; set; }

        [Input("uri")]
        private Input<string>? _uri;

        /// <summary>
        /// PostgreSQL master connection URI
        /// </summary>
        public Input<string>? Uri
        {
            get => _uri;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _uri = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// PostgreSQL admin user name
        /// </summary>
        [Input("user")]
        public Input<string>? User { get; set; }

        public PgPgArgs()
        {
        }
        public static new PgPgArgs Empty => new PgPgArgs();
    }
}
