// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aiven.Inputs
{

    public sealed class ServiceIntegrationPrometheusUserConfigSourceMysqlTelegrafGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Gather metrics from PERFORMANCE*SCHEMA.EVENT*WAITS.
        /// </summary>
        [Input("gatherEventWaits")]
        public Input<bool>? GatherEventWaits { get; set; }

        /// <summary>
        /// Gather metrics from PERFORMANCE*SCHEMA.FILE*SUMMARY*BY*EVENT_NAME.
        /// </summary>
        [Input("gatherFileEventsStats")]
        public Input<bool>? GatherFileEventsStats { get; set; }

        /// <summary>
        /// Gather metrics from PERFORMANCE*SCHEMA.TABLE*IO*WAITS*SUMMARY*BY*INDEX_USAGE.
        /// </summary>
        [Input("gatherIndexIoWaits")]
        public Input<bool>? GatherIndexIoWaits { get; set; }

        /// <summary>
        /// Gather auto_increment columns and max values from information schema.
        /// </summary>
        [Input("gatherInfoSchemaAutoInc")]
        public Input<bool>? GatherInfoSchemaAutoInc { get; set; }

        /// <summary>
        /// Gather metrics from INFORMATION*SCHEMA.INNODB*METRICS.
        /// </summary>
        [Input("gatherInnodbMetrics")]
        public Input<bool>? GatherInnodbMetrics { get; set; }

        /// <summary>
        /// Gather metrics from PERFORMANCE*SCHEMA.EVENTS*STATEMENTS*SUMMARY*BY_DIGEST.
        /// </summary>
        [Input("gatherPerfEventsStatements")]
        public Input<bool>? GatherPerfEventsStatements { get; set; }

        /// <summary>
        /// Gather thread state counts from INFORMATION_SCHEMA.PROCESSLIST.
        /// </summary>
        [Input("gatherProcessList")]
        public Input<bool>? GatherProcessList { get; set; }

        /// <summary>
        /// Gather metrics from SHOW SLAVE STATUS command output.
        /// </summary>
        [Input("gatherSlaveStatus")]
        public Input<bool>? GatherSlaveStatus { get; set; }

        /// <summary>
        /// Gather metrics from PERFORMANCE*SCHEMA.TABLE*IO*WAITS*SUMMARY*BY*TABLE.
        /// </summary>
        [Input("gatherTableIoWaits")]
        public Input<bool>? GatherTableIoWaits { get; set; }

        /// <summary>
        /// Gather metrics from PERFORMANCE*SCHEMA.TABLE*LOCK_WAITS.
        /// </summary>
        [Input("gatherTableLockWaits")]
        public Input<bool>? GatherTableLockWaits { get; set; }

        /// <summary>
        /// Gather metrics from INFORMATION_SCHEMA.TABLES.
        /// </summary>
        [Input("gatherTableSchema")]
        public Input<bool>? GatherTableSchema { get; set; }

        /// <summary>
        /// Truncates digest text from perf*events*statements into this many characters.
        /// </summary>
        [Input("perfEventsStatementsDigestTextLimit")]
        public Input<int>? PerfEventsStatementsDigestTextLimit { get; set; }

        /// <summary>
        /// Limits metrics from perf*events*statements.
        /// </summary>
        [Input("perfEventsStatementsLimit")]
        public Input<int>? PerfEventsStatementsLimit { get; set; }

        /// <summary>
        /// Only include perf*events*statements whose last seen is less than this many seconds.
        /// </summary>
        [Input("perfEventsStatementsTimeLimit")]
        public Input<int>? PerfEventsStatementsTimeLimit { get; set; }

        public ServiceIntegrationPrometheusUserConfigSourceMysqlTelegrafGetArgs()
        {
        }
        public static new ServiceIntegrationPrometheusUserConfigSourceMysqlTelegrafGetArgs Empty => new ServiceIntegrationPrometheusUserConfigSourceMysqlTelegrafGetArgs();
    }
}