// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aiven.Inputs
{

    public sealed class KafkaKafkaUserConfigFollowerFetchingGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Whether to enable the follower fetching functionality.
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        public KafkaKafkaUserConfigFollowerFetchingGetArgs()
        {
        }
        public static new KafkaKafkaUserConfigFollowerFetchingGetArgs Empty => new KafkaKafkaUserConfigFollowerFetchingGetArgs();
    }
}
