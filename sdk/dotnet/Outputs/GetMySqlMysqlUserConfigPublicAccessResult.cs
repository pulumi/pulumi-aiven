// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aiven.Outputs
{

    [OutputType]
    public sealed class GetMySqlMysqlUserConfigPublicAccessResult
    {
        /// <summary>
        /// Allow clients to connect to mysql from the public internet for service nodes that are in a project VPC or another type of private network.
        /// </summary>
        public readonly bool? Mysql;
        /// <summary>
        /// Allow clients to connect to mysqlx from the public internet for service nodes that are in a project VPC or another type of private network.
        /// </summary>
        public readonly bool? Mysqlx;
        /// <summary>
        /// Allow clients to connect to prometheus from the public internet for service nodes that are in a project VPC or another type of private network.
        /// </summary>
        public readonly bool? Prometheus;

        [OutputConstructor]
        private GetMySqlMysqlUserConfigPublicAccessResult(
            bool? mysql,

            bool? mysqlx,

            bool? prometheus)
        {
            Mysql = mysql;
            Mysqlx = mysqlx;
            Prometheus = prometheus;
        }
    }
}
