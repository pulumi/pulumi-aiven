// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aiven.Inputs
{

    public sealed class ServiceKafkaUserConfigKafkaGetArgs : Pulumi.ResourceArgs
    {
        [Input("autoCreateTopicsEnable")]
        public Input<string>? AutoCreateTopicsEnable { get; set; }

        [Input("compressionType")]
        public Input<string>? CompressionType { get; set; }

        [Input("connectionsMaxIdleMs")]
        public Input<string>? ConnectionsMaxIdleMs { get; set; }

        [Input("defaultReplicationFactor")]
        public Input<string>? DefaultReplicationFactor { get; set; }

        [Input("groupInitialRebalanceDelayMs")]
        public Input<string>? GroupInitialRebalanceDelayMs { get; set; }

        [Input("groupMaxSessionTimeoutMs")]
        public Input<string>? GroupMaxSessionTimeoutMs { get; set; }

        [Input("groupMinSessionTimeoutMs")]
        public Input<string>? GroupMinSessionTimeoutMs { get; set; }

        [Input("logCleanerDeleteRetentionMs")]
        public Input<string>? LogCleanerDeleteRetentionMs { get; set; }

        [Input("logCleanerMaxCompactionLagMs")]
        public Input<string>? LogCleanerMaxCompactionLagMs { get; set; }

        [Input("logCleanerMinCleanableRatio")]
        public Input<string>? LogCleanerMinCleanableRatio { get; set; }

        [Input("logCleanerMinCompactionLagMs")]
        public Input<string>? LogCleanerMinCompactionLagMs { get; set; }

        [Input("logCleanupPolicy")]
        public Input<string>? LogCleanupPolicy { get; set; }

        [Input("logFlushIntervalMessages")]
        public Input<string>? LogFlushIntervalMessages { get; set; }

        [Input("logFlushIntervalMs")]
        public Input<string>? LogFlushIntervalMs { get; set; }

        [Input("logIndexIntervalBytes")]
        public Input<string>? LogIndexIntervalBytes { get; set; }

        [Input("logIndexSizeMaxBytes")]
        public Input<string>? LogIndexSizeMaxBytes { get; set; }

        [Input("logMessageDownconversionEnable")]
        public Input<string>? LogMessageDownconversionEnable { get; set; }

        [Input("logMessageTimestampDifferenceMaxMs")]
        public Input<string>? LogMessageTimestampDifferenceMaxMs { get; set; }

        [Input("logMessageTimestampType")]
        public Input<string>? LogMessageTimestampType { get; set; }

        [Input("logPreallocate")]
        public Input<string>? LogPreallocate { get; set; }

        [Input("logRetentionBytes")]
        public Input<string>? LogRetentionBytes { get; set; }

        [Input("logRetentionHours")]
        public Input<string>? LogRetentionHours { get; set; }

        [Input("logRetentionMs")]
        public Input<string>? LogRetentionMs { get; set; }

        [Input("logRollJitterMs")]
        public Input<string>? LogRollJitterMs { get; set; }

        [Input("logRollMs")]
        public Input<string>? LogRollMs { get; set; }

        [Input("logSegmentBytes")]
        public Input<string>? LogSegmentBytes { get; set; }

        [Input("logSegmentDeleteDelayMs")]
        public Input<string>? LogSegmentDeleteDelayMs { get; set; }

        [Input("maxConnectionsPerIp")]
        public Input<string>? MaxConnectionsPerIp { get; set; }

        [Input("maxIncrementalFetchSessionCacheSlots")]
        public Input<string>? MaxIncrementalFetchSessionCacheSlots { get; set; }

        [Input("messageMaxBytes")]
        public Input<string>? MessageMaxBytes { get; set; }

        [Input("minInsyncReplicas")]
        public Input<string>? MinInsyncReplicas { get; set; }

        [Input("numPartitions")]
        public Input<string>? NumPartitions { get; set; }

        [Input("offsetsRetentionMinutes")]
        public Input<string>? OffsetsRetentionMinutes { get; set; }

        [Input("producerPurgatoryPurgeIntervalRequests")]
        public Input<string>? ProducerPurgatoryPurgeIntervalRequests { get; set; }

        [Input("replicaFetchMaxBytes")]
        public Input<string>? ReplicaFetchMaxBytes { get; set; }

        [Input("replicaFetchResponseMaxBytes")]
        public Input<string>? ReplicaFetchResponseMaxBytes { get; set; }

        [Input("socketRequestMaxBytes")]
        public Input<string>? SocketRequestMaxBytes { get; set; }

        [Input("transactionRemoveExpiredTransactionCleanupIntervalMs")]
        public Input<string>? TransactionRemoveExpiredTransactionCleanupIntervalMs { get; set; }

        [Input("transactionStateLogSegmentBytes")]
        public Input<string>? TransactionStateLogSegmentBytes { get; set; }

        public ServiceKafkaUserConfigKafkaGetArgs()
        {
        }
    }
}
