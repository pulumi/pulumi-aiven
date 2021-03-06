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
    public sealed class PgPgUserConfigMigration
    {
        /// <summary>
        /// database name for bootstrapping the initial connection.
        /// </summary>
        public readonly string? Dbname;
        /// <summary>
        /// hostname or IP address of the server where to migrate data from.
        /// </summary>
        public readonly string? Host;
        /// <summary>
        /// Comma-separated list of databases, which should be ignored during 
        /// migration (supported by MySQL only at the moment)
        /// </summary>
        public readonly string? IgnoreDbs;
        /// <summary>
        /// password for authentication with the server where to migrate data from.
        /// </summary>
        public readonly string? Password;
        /// <summary>
        /// port number of the server where to migrate data from.
        /// </summary>
        public readonly string? Port;
        /// <summary>
        /// the server where to migrate data from is secured with SSL.
        /// </summary>
        public readonly string? Ssl;
        /// <summary>
        /// user name for authentication with the server where to migrate data from.
        /// </summary>
        public readonly string? Username;

        [OutputConstructor]
        private PgPgUserConfigMigration(
            string? dbname,

            string? host,

            string? ignoreDbs,

            string? password,

            string? port,

            string? ssl,

            string? username)
        {
            Dbname = dbname;
            Host = host;
            IgnoreDbs = ignoreDbs;
            Password = password;
            Port = port;
            Ssl = ssl;
            Username = username;
        }
    }
}
