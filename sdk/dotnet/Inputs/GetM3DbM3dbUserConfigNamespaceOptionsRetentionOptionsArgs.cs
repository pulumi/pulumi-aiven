// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aiven.Inputs
{

    public sealed class GetM3DbM3dbUserConfigNamespaceOptionsRetentionOptionsArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// Controls how long we wait before expiring stale data
        /// </summary>
        [Input("blockDataExpiryDuration")]
        public string? BlockDataExpiryDuration { get; set; }

        /// <summary>
        /// Controls how long to keep a block in memory before 
        /// flushing to a fileset on disk
        /// </summary>
        [Input("blocksizeDuration")]
        public string? BlocksizeDuration { get; set; }

        /// <summary>
        /// Controls how far into the future writes to 
        /// the namespace will be accepted
        /// </summary>
        [Input("bufferFutureDuration")]
        public string? BufferFutureDuration { get; set; }

        /// <summary>
        /// Controls how far into the past writes to the 
        /// namespace will be accepted
        /// </summary>
        [Input("bufferPastDuration")]
        public string? BufferPastDuration { get; set; }

        /// <summary>
        /// Controls the duration of time that M3DB will 
        /// retain data for the namespace
        /// </summary>
        [Input("retentionPeriodDuration")]
        public string? RetentionPeriodDuration { get; set; }

        public GetM3DbM3dbUserConfigNamespaceOptionsRetentionOptionsArgs()
        {
        }
    }
}
