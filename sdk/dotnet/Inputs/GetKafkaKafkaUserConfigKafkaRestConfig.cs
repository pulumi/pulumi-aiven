// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aiven.Inputs
{

    public sealed class GetKafkaKafkaUserConfigKafkaRestConfigArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// If true the consumer's offset will be periodically 
        /// committed to Kafka in the background
        /// </summary>
        [Input("consumerEnableAutoCommit")]
        public string? ConsumerEnableAutoCommit { get; set; }

        /// <summary>
        /// Maximum number of bytes in unencoded message keys and 
        /// values by a single request
        /// </summary>
        [Input("consumerRequestMaxBytes")]
        public string? ConsumerRequestMaxBytes { get; set; }

        /// <summary>
        /// The maximum total time to wait for messages for a 
        /// request if the maximum number of messages has not yet been reached
        /// </summary>
        [Input("consumerRequestTimeoutMs")]
        public string? ConsumerRequestTimeoutMs { get; set; }

        /// <summary>
        /// The number of acknowledgments the producer requires the leader to 
        /// have received before considering a request complete. If set to 'all' or '-1', the leader will wait
        /// for the full set of in-sync replicas to acknowledge the record.
        /// </summary>
        [Input("producerAcks")]
        public string? ProducerAcks { get; set; }

        /// <summary>
        /// Wait for up to the given delay to allow batching records together
        /// </summary>
        [Input("producerLingerMs")]
        public string? ProducerLingerMs { get; set; }

        /// <summary>
        /// Maximum number of SimpleConsumers that can be 
        /// instantiated per broker.
        /// </summary>
        [Input("simpleconsumerPoolSizeMax")]
        public string? SimpleconsumerPoolSizeMax { get; set; }

        public GetKafkaKafkaUserConfigKafkaRestConfigArgs()
        {
        }
    }
}