// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aiven.Inputs
{

    public sealed class FlinkFlinkUserConfigPrivatelinkAccessArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Enable flink.
        /// </summary>
        [Input("flink")]
        public Input<bool>? Flink { get; set; }

        /// <summary>
        /// Enable prometheus.
        /// </summary>
        [Input("prometheus")]
        public Input<bool>? Prometheus { get; set; }

        public FlinkFlinkUserConfigPrivatelinkAccessArgs()
        {
        }
        public static new FlinkFlinkUserConfigPrivatelinkAccessArgs Empty => new FlinkFlinkUserConfigPrivatelinkAccessArgs();
    }
}
