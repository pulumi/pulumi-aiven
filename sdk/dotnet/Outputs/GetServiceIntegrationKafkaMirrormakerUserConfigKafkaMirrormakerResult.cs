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
    public sealed class GetServiceIntegrationKafkaMirrormakerUserConfigKafkaMirrormakerResult
    {
        /// <summary>
        /// The minimum amount of data the server should return for a fetch request.
        /// </summary>
        public readonly int? ConsumerFetchMinBytes;
        /// <summary>
        /// The batch size in bytes producer will attempt to collect before publishing to broker.
        /// </summary>
        public readonly int? ProducerBatchSize;
        /// <summary>
        /// The amount of bytes producer can use for buffering data before publishing to broker.
        /// </summary>
        public readonly int? ProducerBufferMemory;
        /// <summary>
        /// Specify the default compression type for producers. This configuration accepts the standard compression codecs ('gzip', 'snappy', 'lz4', 'zstd'). It additionally accepts 'none' which is the default and equivalent to no compression.
        /// </summary>
        public readonly string? ProducerCompressionType;
        /// <summary>
        /// The linger time (ms) for waiting new data to arrive for publishing.
        /// </summary>
        public readonly int? ProducerLingerMs;
        /// <summary>
        /// The maximum request size in bytes.
        /// </summary>
        public readonly int? ProducerMaxRequestSize;

        [OutputConstructor]
        private GetServiceIntegrationKafkaMirrormakerUserConfigKafkaMirrormakerResult(
            int? consumerFetchMinBytes,

            int? producerBatchSize,

            int? producerBufferMemory,

            string? producerCompressionType,

            int? producerLingerMs,

            int? producerMaxRequestSize)
        {
            ConsumerFetchMinBytes = consumerFetchMinBytes;
            ProducerBatchSize = producerBatchSize;
            ProducerBufferMemory = producerBufferMemory;
            ProducerCompressionType = producerCompressionType;
            ProducerLingerMs = producerLingerMs;
            ProducerMaxRequestSize = producerMaxRequestSize;
        }
    }
}
