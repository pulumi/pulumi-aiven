// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aiven.Inputs
{

    public sealed class ValkeyValkeyUserConfigPrivatelinkAccessArgs : global::Pulumi.ResourceArgs
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

        public ValkeyValkeyUserConfigPrivatelinkAccessArgs()
        {
        }
        public static new ValkeyValkeyUserConfigPrivatelinkAccessArgs Empty => new ValkeyValkeyUserConfigPrivatelinkAccessArgs();
    }
}