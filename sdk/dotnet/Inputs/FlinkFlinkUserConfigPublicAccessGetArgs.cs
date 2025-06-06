// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aiven.Inputs
{

    public sealed class FlinkFlinkUserConfigPublicAccessGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Allow clients to connect to flink from the public internet for service nodes that are in a project VPC or another type of private network.
        /// </summary>
        [Input("flink")]
        public Input<bool>? Flink { get; set; }

        public FlinkFlinkUserConfigPublicAccessGetArgs()
        {
        }
        public static new FlinkFlinkUserConfigPublicAccessGetArgs Empty => new FlinkFlinkUserConfigPublicAccessGetArgs();
    }
}
