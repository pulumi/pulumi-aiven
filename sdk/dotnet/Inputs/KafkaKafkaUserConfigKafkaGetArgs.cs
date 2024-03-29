// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aiven.Inputs
{

    public sealed class KafkaKafkaUserConfigKafkaGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Enable auto creation of topics.
        /// </summary>
        [Input("autoCreateTopicsEnable")]
        public Input<bool>? AutoCreateTopicsEnable { get; set; }

        /// <summary>
        /// Specify the final compression type for a given topic. This configuration accepts the standard compression codecs ('gzip', 'snappy', 'lz4', 'zstd'). It additionally accepts 'uncompressed' which is equivalent to no compression; and 'producer' which means retain the original compression codec set by the producer.
        /// </summary>
        [Input("compressionType")]
        public Input<string>? CompressionType { get; set; }

        /// <summary>
        /// Idle connections timeout: the server socket processor threads close the connections that idle for longer than this.
        /// </summary>
        [Input("connectionsMaxIdleMs")]
        public Input<int>? ConnectionsMaxIdleMs { get; set; }

        /// <summary>
        /// Replication factor for autocreated topics.
        /// </summary>
        [Input("defaultReplicationFactor")]
        public Input<int>? DefaultReplicationFactor { get; set; }

        /// <summary>
        /// The amount of time, in milliseconds, the group coordinator will wait for more consumers to join a new group before performing the first rebalance. A longer delay means potentially fewer rebalances, but increases the time until processing begins. The default value for this is 3 seconds. During development and testing it might be desirable to set this to 0 in order to not delay test execution time.
        /// </summary>
        [Input("groupInitialRebalanceDelayMs")]
        public Input<int>? GroupInitialRebalanceDelayMs { get; set; }

        /// <summary>
        /// The maximum allowed session timeout for registered consumers. Longer timeouts give consumers more time to process messages in between heartbeats at the cost of a longer time to detect failures.
        /// </summary>
        [Input("groupMaxSessionTimeoutMs")]
        public Input<int>? GroupMaxSessionTimeoutMs { get; set; }

        /// <summary>
        /// The minimum allowed session timeout for registered consumers. Longer timeouts give consumers more time to process messages in between heartbeats at the cost of a longer time to detect failures.
        /// </summary>
        [Input("groupMinSessionTimeoutMs")]
        public Input<int>? GroupMinSessionTimeoutMs { get; set; }

        /// <summary>
        /// How long are delete records retained?
        /// </summary>
        [Input("logCleanerDeleteRetentionMs")]
        public Input<int>? LogCleanerDeleteRetentionMs { get; set; }

        /// <summary>
        /// The maximum amount of time message will remain uncompacted. Only applicable for logs that are being compacted.
        /// </summary>
        [Input("logCleanerMaxCompactionLagMs")]
        public Input<int>? LogCleanerMaxCompactionLagMs { get; set; }

        /// <summary>
        /// Controls log compactor frequency. Larger value means more frequent compactions but also more space wasted for logs. Consider setting log.cleaner.max.compaction.lag.ms to enforce compactions sooner, instead of setting a very high value for this option.
        /// </summary>
        [Input("logCleanerMinCleanableRatio")]
        public Input<double>? LogCleanerMinCleanableRatio { get; set; }

        /// <summary>
        /// The minimum time a message will remain uncompacted in the log. Only applicable for logs that are being compacted.
        /// </summary>
        [Input("logCleanerMinCompactionLagMs")]
        public Input<int>? LogCleanerMinCompactionLagMs { get; set; }

        /// <summary>
        /// The default cleanup policy for segments beyond the retention window.
        /// </summary>
        [Input("logCleanupPolicy")]
        public Input<string>? LogCleanupPolicy { get; set; }

        /// <summary>
        /// The number of messages accumulated on a log partition before messages are flushed to disk.
        /// </summary>
        [Input("logFlushIntervalMessages")]
        public Input<int>? LogFlushIntervalMessages { get; set; }

        /// <summary>
        /// The maximum time in ms that a message in any topic is kept in memory before flushed to disk. If not set, the value in log.flush.scheduler.interval.ms is used.
        /// </summary>
        [Input("logFlushIntervalMs")]
        public Input<int>? LogFlushIntervalMs { get; set; }

        /// <summary>
        /// The interval with which Kafka adds an entry to the offset index.
        /// </summary>
        [Input("logIndexIntervalBytes")]
        public Input<int>? LogIndexIntervalBytes { get; set; }

        /// <summary>
        /// The maximum size in bytes of the offset index.
        /// </summary>
        [Input("logIndexSizeMaxBytes")]
        public Input<int>? LogIndexSizeMaxBytes { get; set; }

        /// <summary>
        /// The maximum size of local log segments that can grow for a partition before it gets eligible for deletion. If set to -2, the value of log.retention.bytes is used. The effective value should always be less than or equal to log.retention.bytes value.
        /// </summary>
        [Input("logLocalRetentionBytes")]
        public Input<int>? LogLocalRetentionBytes { get; set; }

        /// <summary>
        /// The number of milliseconds to keep the local log segments before it gets eligible for deletion. If set to -2, the value of log.retention.ms is used. The effective value should always be less than or equal to log.retention.ms value.
        /// </summary>
        [Input("logLocalRetentionMs")]
        public Input<int>? LogLocalRetentionMs { get; set; }

        /// <summary>
        /// This configuration controls whether down-conversion of message formats is enabled to satisfy consume requests. .
        /// </summary>
        [Input("logMessageDownconversionEnable")]
        public Input<bool>? LogMessageDownconversionEnable { get; set; }

        /// <summary>
        /// The maximum difference allowed between the timestamp when a broker receives a message and the timestamp specified in the message.
        /// </summary>
        [Input("logMessageTimestampDifferenceMaxMs")]
        public Input<int>? LogMessageTimestampDifferenceMaxMs { get; set; }

        /// <summary>
        /// Define whether the timestamp in the message is message create time or log append time.
        /// </summary>
        [Input("logMessageTimestampType")]
        public Input<string>? LogMessageTimestampType { get; set; }

        /// <summary>
        /// Should pre allocate file when create new segment?
        /// </summary>
        [Input("logPreallocate")]
        public Input<bool>? LogPreallocate { get; set; }

        /// <summary>
        /// The maximum size of the log before deleting messages.
        /// </summary>
        [Input("logRetentionBytes")]
        public Input<int>? LogRetentionBytes { get; set; }

        /// <summary>
        /// The number of hours to keep a log file before deleting it.
        /// </summary>
        [Input("logRetentionHours")]
        public Input<int>? LogRetentionHours { get; set; }

        /// <summary>
        /// The number of milliseconds to keep a log file before deleting it (in milliseconds), If not set, the value in log.retention.minutes is used. If set to -1, no time limit is applied.
        /// </summary>
        [Input("logRetentionMs")]
        public Input<int>? LogRetentionMs { get; set; }

        /// <summary>
        /// The maximum jitter to subtract from logRollTimeMillis (in milliseconds). If not set, the value in log.roll.jitter.hours is used.
        /// </summary>
        [Input("logRollJitterMs")]
        public Input<int>? LogRollJitterMs { get; set; }

        /// <summary>
        /// The maximum time before a new log segment is rolled out (in milliseconds).
        /// </summary>
        [Input("logRollMs")]
        public Input<int>? LogRollMs { get; set; }

        /// <summary>
        /// The maximum size of a single log file.
        /// </summary>
        [Input("logSegmentBytes")]
        public Input<int>? LogSegmentBytes { get; set; }

        /// <summary>
        /// The amount of time to wait before deleting a file from the filesystem.
        /// </summary>
        [Input("logSegmentDeleteDelayMs")]
        public Input<int>? LogSegmentDeleteDelayMs { get; set; }

        /// <summary>
        /// The maximum number of connections allowed from each ip address (defaults to 2147483647).
        /// </summary>
        [Input("maxConnectionsPerIp")]
        public Input<int>? MaxConnectionsPerIp { get; set; }

        /// <summary>
        /// The maximum number of incremental fetch sessions that the broker will maintain.
        /// </summary>
        [Input("maxIncrementalFetchSessionCacheSlots")]
        public Input<int>? MaxIncrementalFetchSessionCacheSlots { get; set; }

        /// <summary>
        /// The maximum size of message that the server can receive.
        /// </summary>
        [Input("messageMaxBytes")]
        public Input<int>? MessageMaxBytes { get; set; }

        /// <summary>
        /// When a producer sets acks to 'all' (or '-1'), min.insync.replicas specifies the minimum number of replicas that must acknowledge a write for the write to be considered successful.
        /// </summary>
        [Input("minInsyncReplicas")]
        public Input<int>? MinInsyncReplicas { get; set; }

        /// <summary>
        /// Number of partitions for autocreated topics.
        /// </summary>
        [Input("numPartitions")]
        public Input<int>? NumPartitions { get; set; }

        /// <summary>
        /// Log retention window in minutes for offsets topic.
        /// </summary>
        [Input("offsetsRetentionMinutes")]
        public Input<int>? OffsetsRetentionMinutes { get; set; }

        /// <summary>
        /// The purge interval (in number of requests) of the producer request purgatory(defaults to 1000).
        /// </summary>
        [Input("producerPurgatoryPurgeIntervalRequests")]
        public Input<int>? ProducerPurgatoryPurgeIntervalRequests { get; set; }

        /// <summary>
        /// The number of bytes of messages to attempt to fetch for each partition (defaults to 1048576). This is not an absolute maximum, if the first record batch in the first non-empty partition of the fetch is larger than this value, the record batch will still be returned to ensure that progress can be made.
        /// </summary>
        [Input("replicaFetchMaxBytes")]
        public Input<int>? ReplicaFetchMaxBytes { get; set; }

        /// <summary>
        /// Maximum bytes expected for the entire fetch response (defaults to 10485760). Records are fetched in batches, and if the first record batch in the first non-empty partition of the fetch is larger than this value, the record batch will still be returned to ensure that progress can be made. As such, this is not an absolute maximum.
        /// </summary>
        [Input("replicaFetchResponseMaxBytes")]
        public Input<int>? ReplicaFetchResponseMaxBytes { get; set; }

        /// <summary>
        /// The (optional) comma-delimited setting for the broker to use to verify that the JWT was issued for one of the expected audiences.
        /// </summary>
        [Input("saslOauthbearerExpectedAudience")]
        public Input<string>? SaslOauthbearerExpectedAudience { get; set; }

        /// <summary>
        /// Optional setting for the broker to use to verify that the JWT was created by the expected issuer.
        /// </summary>
        [Input("saslOauthbearerExpectedIssuer")]
        public Input<string>? SaslOauthbearerExpectedIssuer { get; set; }

        /// <summary>
        /// OIDC JWKS endpoint URL. By setting this the SASL SSL OAuth2/OIDC authentication is enabled. See also other options for SASL OAuth2/OIDC. .
        /// </summary>
        [Input("saslOauthbearerJwksEndpointUrl")]
        public Input<string>? SaslOauthbearerJwksEndpointUrl { get; set; }

        /// <summary>
        /// Name of the scope from which to extract the subject claim from the JWT. Defaults to sub.
        /// </summary>
        [Input("saslOauthbearerSubClaimName")]
        public Input<string>? SaslOauthbearerSubClaimName { get; set; }

        /// <summary>
        /// The maximum number of bytes in a socket request (defaults to 104857600).
        /// </summary>
        [Input("socketRequestMaxBytes")]
        public Input<int>? SocketRequestMaxBytes { get; set; }

        /// <summary>
        /// Enable verification that checks that the partition has been added to the transaction before writing transactional records to the partition.
        /// </summary>
        [Input("transactionPartitionVerificationEnable")]
        public Input<bool>? TransactionPartitionVerificationEnable { get; set; }

        /// <summary>
        /// The interval at which to remove transactions that have expired due to transactional.id.expiration.ms passing (defaults to 3600000 (1 hour)).
        /// </summary>
        [Input("transactionRemoveExpiredTransactionCleanupIntervalMs")]
        public Input<int>? TransactionRemoveExpiredTransactionCleanupIntervalMs { get; set; }

        /// <summary>
        /// The transaction topic segment bytes should be kept relatively small in order to facilitate faster log compaction and cache loads (defaults to 104857600 (100 mebibytes)).
        /// </summary>
        [Input("transactionStateLogSegmentBytes")]
        public Input<int>? TransactionStateLogSegmentBytes { get; set; }

        public KafkaKafkaUserConfigKafkaGetArgs()
        {
        }
        public static new KafkaKafkaUserConfigKafkaGetArgs Empty => new KafkaKafkaUserConfigKafkaGetArgs();
    }
}
