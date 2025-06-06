// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aiven.Inputs
{

    public sealed class MySqlMysqlUserConfigPrivatelinkAccessArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Enable mysql.
        /// </summary>
        [Input("mysql")]
        public Input<bool>? Mysql { get; set; }

        /// <summary>
        /// Enable mysqlx.
        /// </summary>
        [Input("mysqlx")]
        public Input<bool>? Mysqlx { get; set; }

        /// <summary>
        /// Enable prometheus.
        /// </summary>
        [Input("prometheus")]
        public Input<bool>? Prometheus { get; set; }

        public MySqlMysqlUserConfigPrivatelinkAccessArgs()
        {
        }
        public static new MySqlMysqlUserConfigPrivatelinkAccessArgs Empty => new MySqlMysqlUserConfigPrivatelinkAccessArgs();
    }
}
