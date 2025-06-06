// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aiven.Outputs
{

    [OutputType]
    public sealed class GetKafkaConnectKafkaConnectUserConfigKafkaConnectResult
    {
        /// <summary>
        /// Enum: `All`, `None`. Defines what client configurations can be overridden by the connector. Default is None.
        /// </summary>
        public readonly string? ConnectorClientConfigOverridePolicy;
        /// <summary>
        /// Enum: `earliest`, `latest`. What to do when there is no initial offset in Kafka or if the current offset does not exist any more on the server. Default is earliest.
        /// </summary>
        public readonly string? ConsumerAutoOffsetReset;
        /// <summary>
        /// Records are fetched in batches by the consumer, and if the first record batch in the first non-empty partition of the fetch is larger than this value, the record batch will still be returned to ensure that the consumer can make progress. As such, this is not a absolute maximum. Example: `52428800`.
        /// </summary>
        public readonly int? ConsumerFetchMaxBytes;
        /// <summary>
        /// Enum: `read_committed`, `read_uncommitted`. Transaction read isolation level. read_uncommitted is the default, but read_committed can be used if consume-exactly-once behavior is desired.
        /// </summary>
        public readonly string? ConsumerIsolationLevel;
        /// <summary>
        /// Records are fetched in batches by the consumer.If the first record batch in the first non-empty partition of the fetch is larger than this limit, the batch will still be returned to ensure that the consumer can make progress. Example: `1048576`.
        /// </summary>
        public readonly int? ConsumerMaxPartitionFetchBytes;
        /// <summary>
        /// The maximum delay in milliseconds between invocations of poll() when using consumer group management (defaults to 300000).
        /// </summary>
        public readonly int? ConsumerMaxPollIntervalMs;
        /// <summary>
        /// The maximum number of records returned in a single call to poll() (defaults to 500).
        /// </summary>
        public readonly int? ConsumerMaxPollRecords;
        /// <summary>
        /// The interval at which to try committing offsets for tasks (defaults to 60000).
        /// </summary>
        public readonly int? OffsetFlushIntervalMs;
        /// <summary>
        /// Maximum number of milliseconds to wait for records to flush and partition offset data to be committed to offset storage before cancelling the process and restoring the offset data to be committed in a future attempt (defaults to 5000).
        /// </summary>
        public readonly int? OffsetFlushTimeoutMs;
        /// <summary>
        /// This setting gives the upper bound of the batch size to be sent. If there are fewer than this many bytes accumulated for this partition, the producer will `linger` for the linger.ms time waiting for more records to show up. A batch size of zero will disable batching entirely (defaults to 16384).
        /// </summary>
        public readonly int? ProducerBatchSize;
        /// <summary>
        /// The total bytes of memory the producer can use to buffer records waiting to be sent to the broker (defaults to 33554432).
        /// </summary>
        public readonly int? ProducerBufferMemory;
        /// <summary>
        /// Enum: `gzip`, `lz4`, `none`, `snappy`, `zstd`. Specify the default compression type for producers. This configuration accepts the standard compression codecs (`gzip`, `snappy`, `lz4`, `zstd`). It additionally accepts `none` which is the default and equivalent to no compression.
        /// </summary>
        public readonly string? ProducerCompressionType;
        /// <summary>
        /// This setting gives the upper bound on the delay for batching: once there is batch.size worth of records for a partition it will be sent immediately regardless of this setting, however if there are fewer than this many bytes accumulated for this partition the producer will `linger` for the specified time waiting for more records to show up. Defaults to 0.
        /// </summary>
        public readonly int? ProducerLingerMs;
        /// <summary>
        /// This setting will limit the number of record batches the producer will send in a single request to avoid sending huge requests. Example: `1048576`.
        /// </summary>
        public readonly int? ProducerMaxRequestSize;
        /// <summary>
        /// The maximum delay that is scheduled in order to wait for the return of one or more departed workers before rebalancing and reassigning their connectors and tasks to the group. During this period the connectors and tasks of the departed workers remain unassigned. Defaults to 5 minutes.
        /// </summary>
        public readonly int? ScheduledRebalanceMaxDelayMs;
        /// <summary>
        /// The timeout in milliseconds used to detect failures when using Kafka’s group management facilities (defaults to 10000).
        /// </summary>
        public readonly int? SessionTimeoutMs;

        [OutputConstructor]
        private GetKafkaConnectKafkaConnectUserConfigKafkaConnectResult(
            string? connectorClientConfigOverridePolicy,

            string? consumerAutoOffsetReset,

            int? consumerFetchMaxBytes,

            string? consumerIsolationLevel,

            int? consumerMaxPartitionFetchBytes,

            int? consumerMaxPollIntervalMs,

            int? consumerMaxPollRecords,

            int? offsetFlushIntervalMs,

            int? offsetFlushTimeoutMs,

            int? producerBatchSize,

            int? producerBufferMemory,

            string? producerCompressionType,

            int? producerLingerMs,

            int? producerMaxRequestSize,

            int? scheduledRebalanceMaxDelayMs,

            int? sessionTimeoutMs)
        {
            ConnectorClientConfigOverridePolicy = connectorClientConfigOverridePolicy;
            ConsumerAutoOffsetReset = consumerAutoOffsetReset;
            ConsumerFetchMaxBytes = consumerFetchMaxBytes;
            ConsumerIsolationLevel = consumerIsolationLevel;
            ConsumerMaxPartitionFetchBytes = consumerMaxPartitionFetchBytes;
            ConsumerMaxPollIntervalMs = consumerMaxPollIntervalMs;
            ConsumerMaxPollRecords = consumerMaxPollRecords;
            OffsetFlushIntervalMs = offsetFlushIntervalMs;
            OffsetFlushTimeoutMs = offsetFlushTimeoutMs;
            ProducerBatchSize = producerBatchSize;
            ProducerBufferMemory = producerBufferMemory;
            ProducerCompressionType = producerCompressionType;
            ProducerLingerMs = producerLingerMs;
            ProducerMaxRequestSize = producerMaxRequestSize;
            ScheduledRebalanceMaxDelayMs = scheduledRebalanceMaxDelayMs;
            SessionTimeoutMs = sessionTimeoutMs;
        }
    }
}
