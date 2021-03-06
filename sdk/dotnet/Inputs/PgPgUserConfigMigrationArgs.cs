// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aiven.Inputs
{

    public sealed class PgPgUserConfigMigrationArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// database name for bootstrapping the initial connection.
        /// </summary>
        [Input("dbname")]
        public Input<string>? Dbname { get; set; }

        /// <summary>
        /// hostname or IP address of the server where to migrate data from.
        /// </summary>
        [Input("host")]
        public Input<string>? Host { get; set; }

        /// <summary>
        /// Comma-separated list of databases, which should be ignored during 
        /// migration (supported by MySQL only at the moment)
        /// </summary>
        [Input("ignoreDbs")]
        public Input<string>? IgnoreDbs { get; set; }

        /// <summary>
        /// password for authentication with the server where to migrate data from.
        /// </summary>
        [Input("password")]
        public Input<string>? Password { get; set; }

        /// <summary>
        /// port number of the server where to migrate data from.
        /// </summary>
        [Input("port")]
        public Input<string>? Port { get; set; }

        /// <summary>
        /// the server where to migrate data from is secured with SSL.
        /// </summary>
        [Input("ssl")]
        public Input<string>? Ssl { get; set; }

        /// <summary>
        /// user name for authentication with the server where to migrate data from.
        /// </summary>
        [Input("username")]
        public Input<string>? Username { get; set; }

        public PgPgUserConfigMigrationArgs()
        {
        }
    }
}
