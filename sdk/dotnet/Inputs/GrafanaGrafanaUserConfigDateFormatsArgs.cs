// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aiven.Inputs
{

    public sealed class GrafanaGrafanaUserConfigDateFormatsArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Default time zone for user preferences. Value 'browser' uses browser local time zone.
        /// </summary>
        [Input("defaultTimezone")]
        public Input<string>? DefaultTimezone { get; set; }

        /// <summary>
        /// Moment.js style format string for cases where full date is shown.
        /// </summary>
        [Input("fullDate")]
        public Input<string>? FullDate { get; set; }

        /// <summary>
        /// Moment.js style format string used when a time requiring day accuracy is shown.
        /// </summary>
        [Input("intervalDay")]
        public Input<string>? IntervalDay { get; set; }

        /// <summary>
        /// Moment.js style format string used when a time requiring hour accuracy is shown.
        /// </summary>
        [Input("intervalHour")]
        public Input<string>? IntervalHour { get; set; }

        /// <summary>
        /// Moment.js style format string used when a time requiring minute accuracy is shown.
        /// </summary>
        [Input("intervalMinute")]
        public Input<string>? IntervalMinute { get; set; }

        /// <summary>
        /// Moment.js style format string used when a time requiring month accuracy is shown.
        /// </summary>
        [Input("intervalMonth")]
        public Input<string>? IntervalMonth { get; set; }

        /// <summary>
        /// Moment.js style format string used when a time requiring second accuracy is shown.
        /// </summary>
        [Input("intervalSecond")]
        public Input<string>? IntervalSecond { get; set; }

        /// <summary>
        /// Moment.js style format string used when a time requiring year accuracy is shown.
        /// </summary>
        [Input("intervalYear")]
        public Input<string>? IntervalYear { get; set; }

        public GrafanaGrafanaUserConfigDateFormatsArgs()
        {
        }
        public static new GrafanaGrafanaUserConfigDateFormatsArgs Empty => new GrafanaGrafanaUserConfigDateFormatsArgs();
    }
}