// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aiven.Inputs
{

    public sealed class KafkaKafkaUserConfigKafkaSaslMechanismsGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Enable PLAIN mechanism. Default: `true`.
        /// </summary>
        [Input("plain")]
        public Input<bool>? Plain { get; set; }

        /// <summary>
        /// Enable SCRAM-SHA-256 mechanism. Default: `true`.
        /// </summary>
        [Input("scramSha256")]
        public Input<bool>? ScramSha256 { get; set; }

        /// <summary>
        /// Enable SCRAM-SHA-512 mechanism. Default: `true`.
        /// </summary>
        [Input("scramSha512")]
        public Input<bool>? ScramSha512 { get; set; }

        public KafkaKafkaUserConfigKafkaSaslMechanismsGetArgs()
        {
        }
        public static new KafkaKafkaUserConfigKafkaSaslMechanismsGetArgs Empty => new KafkaKafkaUserConfigKafkaSaslMechanismsGetArgs();
    }
}
