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
    public sealed class MySqlMysqlParam
    {
        /// <summary>
        /// Primary MySQL database name
        /// </summary>
        public readonly string? DatabaseName;
        /// <summary>
        /// MySQL host IP or name
        /// </summary>
        public readonly string? Host;
        /// <summary>
        /// MySQL admin user password
        /// </summary>
        public readonly string? Password;
        /// <summary>
        /// MySQL port
        /// </summary>
        public readonly int? Port;
        /// <summary>
        /// MySQL sslmode setting (currently always "require")
        /// </summary>
        public readonly string? Sslmode;
        /// <summary>
        /// MySQL admin user name
        /// </summary>
        public readonly string? User;

        [OutputConstructor]
        private MySqlMysqlParam(
            string? databaseName,

            string? host,

            string? password,

            int? port,

            string? sslmode,

            string? user)
        {
            DatabaseName = databaseName;
            Host = host;
            Password = password;
            Port = port;
            Sslmode = sslmode;
            User = user;
        }
    }
}