// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aiven.Inputs
{

    public sealed class PgPgParamGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Primary PostgreSQL database name
        /// </summary>
        [Input("databaseName")]
        public Input<string>? DatabaseName { get; set; }

        /// <summary>
        /// PostgreSQL host IP or name
        /// </summary>
        [Input("host")]
        public Input<string>? Host { get; set; }

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

        /// <summary>
        /// PostgreSQL sslmode setting (currently always "require")
        /// </summary>
        [Input("sslmode")]
        public Input<string>? Sslmode { get; set; }

        /// <summary>
        /// PostgreSQL admin user name
        /// </summary>
        [Input("user")]
        public Input<string>? User { get; set; }

        public PgPgParamGetArgs()
        {
        }
        public static new PgPgParamGetArgs Empty => new PgPgParamGetArgs();
    }
}
