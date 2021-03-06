// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aiven.Outputs
{

    [OutputType]
    public sealed class GetKafkaKafkaUserConfigKafkaRestConfigResult
    {
        /// <summary>
        /// If true the consumer's offset will be periodically 
        /// committed to Kafka in the background
        /// </summary>
        public readonly string? ConsumerEnableAutoCommit;
        /// <summary>
        /// Maximum number of bytes in unencoded message keys and 
        /// values by a single request
        /// </summary>
        public readonly string? ConsumerRequestMaxBytes;
        /// <summary>
        /// The maximum total time to wait for messages for a 
        /// request if the maximum number of messages has not yet been reached
        /// </summary>
        public readonly string? ConsumerRequestTimeoutMs;
        /// <summary>
        /// The number of acknowledgments the producer requires the leader to 
        /// have received before considering a request complete. If set to 'all' or '-1', the leader will wait
        /// for the full set of in-sync replicas to acknowledge the record.
        /// </summary>
        public readonly string? ProducerAcks;
        /// <summary>
        /// Wait for up to the given delay to allow batching records together
        /// </summary>
        public readonly string? ProducerLingerMs;
        /// <summary>
        /// Maximum number of SimpleConsumers that can be 
        /// instantiated per broker.
        /// </summary>
        public readonly string? SimpleconsumerPoolSizeMax;

        [OutputConstructor]
        private GetKafkaKafkaUserConfigKafkaRestConfigResult(
            string? consumerEnableAutoCommit,

            string? consumerRequestMaxBytes,

            string? consumerRequestTimeoutMs,

            string? producerAcks,

            string? producerLingerMs,

            string? simpleconsumerPoolSizeMax)
        {
            ConsumerEnableAutoCommit = consumerEnableAutoCommit;
            ConsumerRequestMaxBytes = consumerRequestMaxBytes;
            ConsumerRequestTimeoutMs = consumerRequestTimeoutMs;
            ProducerAcks = producerAcks;
            ProducerLingerMs = producerLingerMs;
            SimpleconsumerPoolSizeMax = simpleconsumerPoolSizeMax;
        }
    }
}
