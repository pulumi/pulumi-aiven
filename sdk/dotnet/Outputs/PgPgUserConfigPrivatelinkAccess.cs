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
    public sealed class PgPgUserConfigPrivatelinkAccess
    {
        /// <summary>
        /// Enable pg.
        /// </summary>
        public readonly string? Pg;
        /// <summary>
        /// Enable pgbouncer.
        /// </summary>
        public readonly string? Pgbouncer;

        [OutputConstructor]
        private PgPgUserConfigPrivatelinkAccess(
            string? pg,

            string? pgbouncer)
        {
            Pg = pg;
            Pgbouncer = pgbouncer;
        }
    }
}
