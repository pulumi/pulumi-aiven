// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aiven.Inputs
{

    public sealed class DragonflyDragonflyUserConfigPrivatelinkAccessArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Enable dragonfly.
        /// </summary>
        [Input("dragonfly")]
        public Input<bool>? Dragonfly { get; set; }

        /// <summary>
        /// Enable prometheus.
        /// </summary>
        [Input("prometheus")]
        public Input<bool>? Prometheus { get; set; }

        public DragonflyDragonflyUserConfigPrivatelinkAccessArgs()
        {
        }
        public static new DragonflyDragonflyUserConfigPrivatelinkAccessArgs Empty => new DragonflyDragonflyUserConfigPrivatelinkAccessArgs();
    }
}
