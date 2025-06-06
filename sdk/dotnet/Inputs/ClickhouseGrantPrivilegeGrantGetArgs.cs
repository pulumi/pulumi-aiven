// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aiven.Inputs
{

    public sealed class ClickhouseGrantPrivilegeGrantGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The column to grant access to. Changing this property forces recreation of the resource.
        /// </summary>
        [Input("column")]
        public Input<string>? Column { get; set; }

        /// <summary>
        /// The database to grant access to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
        /// </summary>
        [Input("database", required: true)]
        public Input<string> Database { get; set; } = null!;

        /// <summary>
        /// The privileges to grant. For example: `INSERT`, `SELECT`, `CREATE TABLE`. A complete list is available in the [ClickHouse documentation](https://clickhouse.com/docs/en/sql-reference/statements/grant). Changing this property forces recreation of the resource.
        /// </summary>
        [Input("privilege")]
        public Input<string>? Privilege { get; set; }

        /// <summary>
        /// The table to grant access to. Changing this property forces recreation of the resource.
        /// </summary>
        [Input("table")]
        public Input<string>? Table { get; set; }

        /// <summary>
        /// Allow grantees to grant their privileges to other grantees. Changing this property forces recreation of the resource.
        /// </summary>
        [Input("withGrant")]
        public Input<bool>? WithGrant { get; set; }

        public ClickhouseGrantPrivilegeGrantGetArgs()
        {
        }
        public static new ClickhouseGrantPrivilegeGrantGetArgs Empty => new ClickhouseGrantPrivilegeGrantGetArgs();
    }
}
