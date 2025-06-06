// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aiven.Inputs
{

    public sealed class PgPgUserConfigPrivatelinkAccessArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Enable pg.
        /// </summary>
        [Input("pg")]
        public Input<bool>? Pg { get; set; }

        /// <summary>
        /// Enable pgbouncer.
        /// </summary>
        [Input("pgbouncer")]
        public Input<bool>? Pgbouncer { get; set; }

        /// <summary>
        /// Enable prometheus.
        /// </summary>
        [Input("prometheus")]
        public Input<bool>? Prometheus { get; set; }

        public PgPgUserConfigPrivatelinkAccessArgs()
        {
        }
        public static new PgPgUserConfigPrivatelinkAccessArgs Empty => new PgPgUserConfigPrivatelinkAccessArgs();
    }
}
