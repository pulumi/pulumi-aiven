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
    public sealed class PgPgUserConfigPublicAccess
    {
        /// <summary>
        /// Enable pg.
        /// </summary>
        public readonly string? Pg;
        /// <summary>
        /// Enable pgbouncer.
        /// </summary>
        public readonly string? Pgbouncer;
        /// <summary>
        /// Allow clients to connect to prometheus from the public internet for 
        /// service nodes that are in a project VPC or another type of private network
        /// </summary>
        public readonly string? Prometheus;

        [OutputConstructor]
        private PgPgUserConfigPublicAccess(
            string? pg,

            string? pgbouncer,

            string? prometheus)
        {
            Pg = pg;
            Pgbouncer = pgbouncer;
            Prometheus = prometheus;
        }
    }
}
