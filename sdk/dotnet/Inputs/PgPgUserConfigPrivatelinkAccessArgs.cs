// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aiven.Inputs
{

    public sealed class PgPgUserConfigPrivatelinkAccessArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Enable pg.
        /// </summary>
        [Input("pg")]
        public Input<string>? Pg { get; set; }

        /// <summary>
        /// Enable pgbouncer.
        /// </summary>
        [Input("pgbouncer")]
        public Input<string>? Pgbouncer { get; set; }

        public PgPgUserConfigPrivatelinkAccessArgs()
        {
        }
    }
}