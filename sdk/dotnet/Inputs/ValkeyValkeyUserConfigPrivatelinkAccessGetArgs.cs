// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aiven.Inputs
{

    public sealed class ValkeyValkeyUserConfigPrivatelinkAccessGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Enable prometheus.
        /// </summary>
        [Input("prometheus")]
        public Input<bool>? Prometheus { get; set; }

        /// <summary>
        /// Enable valkey.
        /// </summary>
        [Input("valkey")]
        public Input<bool>? Valkey { get; set; }

        public ValkeyValkeyUserConfigPrivatelinkAccessGetArgs()
        {
        }
        public static new ValkeyValkeyUserConfigPrivatelinkAccessGetArgs Empty => new ValkeyValkeyUserConfigPrivatelinkAccessGetArgs();
    }
}
