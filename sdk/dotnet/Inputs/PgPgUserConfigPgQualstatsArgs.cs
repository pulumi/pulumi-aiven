// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aiven.Inputs
{

    public sealed class PgPgUserConfigPgQualstatsArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Enable / Disable pg_qualstats. The default value is `false`.
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// Error estimation num threshold to save quals. The default value is `0`.
        /// </summary>
        [Input("minErrEstimateNum")]
        public Input<int>? MinErrEstimateNum { get; set; }

        /// <summary>
        /// Error estimation ratio threshold to save quals. The default value is `0`.
        /// </summary>
        [Input("minErrEstimateRatio")]
        public Input<int>? MinErrEstimateRatio { get; set; }

        /// <summary>
        /// Enable / Disable pg_qualstats constants tracking. The default value is `true`.
        /// </summary>
        [Input("trackConstants")]
        public Input<bool>? TrackConstants { get; set; }

        /// <summary>
        /// Track quals on system catalogs too. The default value is `false`.
        /// </summary>
        [Input("trackPgCatalog")]
        public Input<bool>? TrackPgCatalog { get; set; }

        public PgPgUserConfigPgQualstatsArgs()
        {
        }
        public static new PgPgUserConfigPgQualstatsArgs Empty => new PgPgUserConfigPgQualstatsArgs();
    }
}