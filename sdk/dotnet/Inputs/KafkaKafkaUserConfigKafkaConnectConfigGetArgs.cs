// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aiven.Inputs
{

    public sealed class KafkaKafkaUserConfigKafkaConnectConfigGetArgs : Pulumi.ResourceArgs
    {
        [Input("connectorClientConfigOverridePolicy")]
        public Input<string>? ConnectorClientConfigOverridePolicy { get; set; }

        [Input("consumerAutoOffsetReset")]
        public Input<string>? ConsumerAutoOffsetReset { get; set; }

        [Input("consumerIsolationLevel")]
        public Input<string>? ConsumerIsolationLevel { get; set; }

        [Input("consumerMaxPollIntervalMs")]
        public Input<string>? ConsumerMaxPollIntervalMs { get; set; }

        [Input("consumerMaxPollRecords")]
        public Input<string>? ConsumerMaxPollRecords { get; set; }

        [Input("offsetFlushIntervalMs")]
        public Input<string>? OffsetFlushIntervalMs { get; set; }

        [Input("offsetFlushTimeoutMs")]
        public Input<string>? OffsetFlushTimeoutMs { get; set; }

        [Input("sessionTimeoutMs")]
        public Input<string>? SessionTimeoutMs { get; set; }

        public KafkaKafkaUserConfigKafkaConnectConfigGetArgs()
        {
        }
    }
}