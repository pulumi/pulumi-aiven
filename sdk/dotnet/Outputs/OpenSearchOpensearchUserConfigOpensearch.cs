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
    public sealed class OpenSearchOpensearchUserConfigOpensearch
    {
        /// <summary>
        /// Explicitly allow or block automatic creation of indices. Defaults to true.
        /// </summary>
        public readonly bool? ActionAutoCreateIndexEnabled;
        /// <summary>
        /// Require explicit index names when deleting.
        /// </summary>
        public readonly bool? ActionDestructiveRequiresName;
        /// <summary>
        /// Opensearch Security Plugin Settings
        /// </summary>
        public readonly Outputs.OpenSearchOpensearchUserConfigOpensearchAuthFailureListeners? AuthFailureListeners;
        /// <summary>
        /// Defines a limit of how much total remote data can be referenced as a ratio of the size of the disk reserved for the file cache. This is designed to be a safeguard to prevent oversubscribing a cluster. Defaults to 0.
        /// </summary>
        public readonly double? ClusterFilecacheRemoteDataRatio;
        /// <summary>
        /// Controls the number of shards allowed in the cluster per data node. Example: `1000`.
        /// </summary>
        public readonly int? ClusterMaxShardsPerNode;
        public readonly Outputs.OpenSearchOpensearchUserConfigOpensearchClusterRemoteStore? ClusterRemoteStore;
        /// <summary>
        /// When set to true, OpenSearch attempts to evenly distribute the primary shards between the cluster nodes. Enabling this setting does not always guarantee an equal number of primary shards on each node, especially in the event of a failover. Changing this setting to false after it was set to true does not invoke redistribution of primary shards. Default is false.
        /// </summary>
        public readonly bool? ClusterRoutingAllocationBalancePreferPrimary;
        /// <summary>
        /// How many concurrent incoming/outgoing shard recoveries (normally replicas) are allowed to happen on a node. Defaults to node cpu count * 2.
        /// </summary>
        public readonly int? ClusterRoutingAllocationNodeConcurrentRecoveries;
        public readonly Outputs.OpenSearchOpensearchUserConfigOpensearchClusterSearchRequestSlowlog? ClusterSearchRequestSlowlog;
        /// <summary>
        /// Watermark settings
        /// </summary>
        public readonly Outputs.OpenSearchOpensearchUserConfigOpensearchDiskWatermarks? DiskWatermarks;
        /// <summary>
        /// Sender name placeholder to be used in Opensearch Dashboards and Opensearch keystore. Example: `alert-sender`.
        /// </summary>
        public readonly string? EmailSenderName;
        /// <summary>
        /// Sender password for Opensearch alerts to authenticate with SMTP server. Example: `very-secure-mail-password`.
        /// </summary>
        public readonly string? EmailSenderPassword;
        /// <summary>
        /// Sender username for Opensearch alerts. Example: `jane@example.com`.
        /// </summary>
        public readonly string? EmailSenderUsername;
        /// <summary>
        /// Enable remote-backed storage.
        /// </summary>
        public readonly bool? EnableRemoteBackedStorage;
        /// <summary>
        /// Enable searchable snapshots.
        /// </summary>
        public readonly bool? EnableSearchableSnapshots;
        /// <summary>
        /// Enable/Disable security audit.
        /// </summary>
        public readonly bool? EnableSecurityAudit;
        /// <summary>
        /// Enable/Disable snapshot API for custom repositories, this requires security management to be enabled.
        /// </summary>
        public readonly bool? EnableSnapshotApi;
        /// <summary>
        /// Maximum content length for HTTP requests to the OpenSearch HTTP API, in bytes.
        /// </summary>
        public readonly int? HttpMaxContentLength;
        /// <summary>
        /// The max size of allowed headers, in bytes. Example: `8192`.
        /// </summary>
        public readonly int? HttpMaxHeaderSize;
        /// <summary>
        /// The max length of an HTTP URL, in bytes. Example: `4096`.
        /// </summary>
        public readonly int? HttpMaxInitialLineLength;
        /// <summary>
        /// Relative amount. Maximum amount of heap memory used for field data cache. This is an expert setting; decreasing the value too much will increase overhead of loading field data; too much memory used for field data cache will decrease amount of heap available for other operations.
        /// </summary>
        public readonly int? IndicesFielddataCacheSize;
        /// <summary>
        /// Percentage value. Default is 10%. Total amount of heap used for indexing buffer, before writing segments to disk. This is an expert setting. Too low value will slow down indexing; too high value will increase indexing performance but causes performance issues for query performance.
        /// </summary>
        public readonly int? IndicesMemoryIndexBufferSize;
        /// <summary>
        /// Absolute value. Default is unbound. Doesn't work without indices.memory.index*buffer*size. Maximum amount of heap used for query cache, an absolute indices.memory.index*buffer*size maximum hard limit.
        /// </summary>
        public readonly int? IndicesMemoryMaxIndexBufferSize;
        /// <summary>
        /// Absolute value. Default is 48mb. Doesn't work without indices.memory.index*buffer*size. Minimum amount of heap used for query cache, an absolute indices.memory.index*buffer*size minimal hard limit.
        /// </summary>
        public readonly int? IndicesMemoryMinIndexBufferSize;
        /// <summary>
        /// Percentage value. Default is 10%. Maximum amount of heap used for query cache. This is an expert setting. Too low value will decrease query performance and increase performance for other operations; too high value will cause issues with other OpenSearch functionality.
        /// </summary>
        public readonly int? IndicesQueriesCacheSize;
        /// <summary>
        /// Maximum number of clauses Lucene BooleanQuery can have. The default value (1024) is relatively high, and increasing it may cause performance issues. Investigate other approaches first before increasing this value.
        /// </summary>
        public readonly int? IndicesQueryBoolMaxClauseCount;
        /// <summary>
        /// Limits total inbound and outbound recovery traffic for each node. Applies to both peer recoveries as well as snapshot recoveries (i.e., restores from a snapshot). Defaults to 40mb.
        /// </summary>
        public readonly int? IndicesRecoveryMaxBytesPerSec;
        /// <summary>
        /// Number of file chunks sent in parallel for each recovery. Defaults to 2.
        /// </summary>
        public readonly int? IndicesRecoveryMaxConcurrentFileChunks;
        /// <summary>
        /// Specifies whether ISM is enabled or not.
        /// </summary>
        public readonly bool? IsmEnabled;
        /// <summary>
        /// Specifies whether audit history is enabled or not. The logs from ISM are automatically indexed to a logs document.
        /// </summary>
        public readonly bool? IsmHistoryEnabled;
        /// <summary>
        /// The maximum age before rolling over the audit history index in hours. Example: `24`.
        /// </summary>
        public readonly int? IsmHistoryMaxAge;
        /// <summary>
        /// The maximum number of documents before rolling over the audit history index. Example: `2500000`.
        /// </summary>
        public readonly int? IsmHistoryMaxDocs;
        /// <summary>
        /// The time between rollover checks for the audit history index in hours. Example: `8`.
        /// </summary>
        public readonly int? IsmHistoryRolloverCheckPeriod;
        /// <summary>
        /// How long audit history indices are kept in days. Example: `30`.
        /// </summary>
        public readonly int? IsmHistoryRolloverRetentionPeriod;
        /// <summary>
        /// Enable or disable KNN memory circuit breaker. Defaults to true.
        /// </summary>
        public readonly bool? KnnMemoryCircuitBreakerEnabled;
        /// <summary>
        /// Maximum amount of memory that can be used for KNN index. Defaults to 50% of the JVM heap size.
        /// </summary>
        public readonly int? KnnMemoryCircuitBreakerLimit;
        /// <summary>
        /// Defines a limit of how much total remote data can be referenced as a ratio of the size of the disk reserved for the file cache. This is designed to be a safeguard to prevent oversubscribing a cluster. Defaults to 5gb. Requires restarting all OpenSearch nodes.
        /// </summary>
        public readonly string? NodeSearchCacheSize;
        /// <summary>
        /// Compatibility mode sets OpenSearch to report its version as 7.10 so clients continue to work. Default is false.
        /// </summary>
        public readonly bool? OverrideMainResponseVersion;
        /// <summary>
        /// Enable or disable filtering of alerting by backend roles. Requires Security plugin. Defaults to false.
        /// </summary>
        public readonly bool? PluginsAlertingFilterByBackendRoles;
        /// <summary>
        /// Whitelisted addresses for reindexing. Changing this value will cause all OpenSearch instances to restart.
        /// </summary>
        public readonly ImmutableArray<string> ReindexRemoteWhitelists;
        public readonly Outputs.OpenSearchOpensearchUserConfigOpensearchRemoteStore? RemoteStore;
        /// <summary>
        /// Script compilation circuit breaker limits the number of inline script compilations within a period of time. Default is use-context. Example: `75/5m`.
        /// </summary>
        public readonly string? ScriptMaxCompilationsRate;
        /// <summary>
        /// Search Backpressure Settings
        /// </summary>
        public readonly Outputs.OpenSearchOpensearchUserConfigOpensearchSearchBackpressure? SearchBackpressure;
        public readonly Outputs.OpenSearchOpensearchUserConfigOpensearchSearchInsightsTopQueries? SearchInsightsTopQueries;
        /// <summary>
        /// Maximum number of aggregation buckets allowed in a single response. OpenSearch default value is used when this is not defined. Example: `10000`.
        /// </summary>
        public readonly int? SearchMaxBuckets;
        /// <summary>
        /// Segment Replication Backpressure Settings
        /// </summary>
        public readonly Outputs.OpenSearchOpensearchUserConfigOpensearchSegrep? Segrep;
        /// <summary>
        /// Shard indexing back pressure settings
        /// </summary>
        public readonly Outputs.OpenSearchOpensearchUserConfigOpensearchShardIndexingPressure? ShardIndexingPressure;
        /// <summary>
        /// Size for the thread pool queue. See documentation for exact details.
        /// </summary>
        public readonly int? ThreadPoolAnalyzeQueueSize;
        /// <summary>
        /// Size for the thread pool. See documentation for exact details. Do note this may have maximum value depending on CPU count - value is automatically lowered if set to higher than maximum value.
        /// </summary>
        public readonly int? ThreadPoolAnalyzeSize;
        /// <summary>
        /// Size for the thread pool. See documentation for exact details. Do note this may have maximum value depending on CPU count - value is automatically lowered if set to higher than maximum value.
        /// </summary>
        public readonly int? ThreadPoolForceMergeSize;
        /// <summary>
        /// Size for the thread pool queue. See documentation for exact details.
        /// </summary>
        public readonly int? ThreadPoolGetQueueSize;
        /// <summary>
        /// Size for the thread pool. See documentation for exact details. Do note this may have maximum value depending on CPU count - value is automatically lowered if set to higher than maximum value.
        /// </summary>
        public readonly int? ThreadPoolGetSize;
        /// <summary>
        /// Size for the thread pool queue. See documentation for exact details.
        /// </summary>
        public readonly int? ThreadPoolSearchQueueSize;
        /// <summary>
        /// Size for the thread pool. See documentation for exact details. Do note this may have maximum value depending on CPU count - value is automatically lowered if set to higher than maximum value.
        /// </summary>
        public readonly int? ThreadPoolSearchSize;
        /// <summary>
        /// Size for the thread pool queue. See documentation for exact details.
        /// </summary>
        public readonly int? ThreadPoolSearchThrottledQueueSize;
        /// <summary>
        /// Size for the thread pool. See documentation for exact details. Do note this may have maximum value depending on CPU count - value is automatically lowered if set to higher than maximum value.
        /// </summary>
        public readonly int? ThreadPoolSearchThrottledSize;
        /// <summary>
        /// Size for the thread pool queue. See documentation for exact details.
        /// </summary>
        public readonly int? ThreadPoolWriteQueueSize;
        /// <summary>
        /// Size for the thread pool. See documentation for exact details. Do note this may have maximum value depending on CPU count - value is automatically lowered if set to higher than maximum value.
        /// </summary>
        public readonly int? ThreadPoolWriteSize;

        [OutputConstructor]
        private OpenSearchOpensearchUserConfigOpensearch(
            bool? actionAutoCreateIndexEnabled,

            bool? actionDestructiveRequiresName,

            Outputs.OpenSearchOpensearchUserConfigOpensearchAuthFailureListeners? authFailureListeners,

            double? clusterFilecacheRemoteDataRatio,

            int? clusterMaxShardsPerNode,

            Outputs.OpenSearchOpensearchUserConfigOpensearchClusterRemoteStore? clusterRemoteStore,

            bool? clusterRoutingAllocationBalancePreferPrimary,

            int? clusterRoutingAllocationNodeConcurrentRecoveries,

            Outputs.OpenSearchOpensearchUserConfigOpensearchClusterSearchRequestSlowlog? clusterSearchRequestSlowlog,

            Outputs.OpenSearchOpensearchUserConfigOpensearchDiskWatermarks? diskWatermarks,

            string? emailSenderName,

            string? emailSenderPassword,

            string? emailSenderUsername,

            bool? enableRemoteBackedStorage,

            bool? enableSearchableSnapshots,

            bool? enableSecurityAudit,

            bool? enableSnapshotApi,

            int? httpMaxContentLength,

            int? httpMaxHeaderSize,

            int? httpMaxInitialLineLength,

            int? indicesFielddataCacheSize,

            int? indicesMemoryIndexBufferSize,

            int? indicesMemoryMaxIndexBufferSize,

            int? indicesMemoryMinIndexBufferSize,

            int? indicesQueriesCacheSize,

            int? indicesQueryBoolMaxClauseCount,

            int? indicesRecoveryMaxBytesPerSec,

            int? indicesRecoveryMaxConcurrentFileChunks,

            bool? ismEnabled,

            bool? ismHistoryEnabled,

            int? ismHistoryMaxAge,

            int? ismHistoryMaxDocs,

            int? ismHistoryRolloverCheckPeriod,

            int? ismHistoryRolloverRetentionPeriod,

            bool? knnMemoryCircuitBreakerEnabled,

            int? knnMemoryCircuitBreakerLimit,

            string? nodeSearchCacheSize,

            bool? overrideMainResponseVersion,

            bool? pluginsAlertingFilterByBackendRoles,

            ImmutableArray<string> reindexRemoteWhitelists,

            Outputs.OpenSearchOpensearchUserConfigOpensearchRemoteStore? remoteStore,

            string? scriptMaxCompilationsRate,

            Outputs.OpenSearchOpensearchUserConfigOpensearchSearchBackpressure? searchBackpressure,

            Outputs.OpenSearchOpensearchUserConfigOpensearchSearchInsightsTopQueries? searchInsightsTopQueries,

            int? searchMaxBuckets,

            Outputs.OpenSearchOpensearchUserConfigOpensearchSegrep? segrep,

            Outputs.OpenSearchOpensearchUserConfigOpensearchShardIndexingPressure? shardIndexingPressure,

            int? threadPoolAnalyzeQueueSize,

            int? threadPoolAnalyzeSize,

            int? threadPoolForceMergeSize,

            int? threadPoolGetQueueSize,

            int? threadPoolGetSize,

            int? threadPoolSearchQueueSize,

            int? threadPoolSearchSize,

            int? threadPoolSearchThrottledQueueSize,

            int? threadPoolSearchThrottledSize,

            int? threadPoolWriteQueueSize,

            int? threadPoolWriteSize)
        {
            ActionAutoCreateIndexEnabled = actionAutoCreateIndexEnabled;
            ActionDestructiveRequiresName = actionDestructiveRequiresName;
            AuthFailureListeners = authFailureListeners;
            ClusterFilecacheRemoteDataRatio = clusterFilecacheRemoteDataRatio;
            ClusterMaxShardsPerNode = clusterMaxShardsPerNode;
            ClusterRemoteStore = clusterRemoteStore;
            ClusterRoutingAllocationBalancePreferPrimary = clusterRoutingAllocationBalancePreferPrimary;
            ClusterRoutingAllocationNodeConcurrentRecoveries = clusterRoutingAllocationNodeConcurrentRecoveries;
            ClusterSearchRequestSlowlog = clusterSearchRequestSlowlog;
            DiskWatermarks = diskWatermarks;
            EmailSenderName = emailSenderName;
            EmailSenderPassword = emailSenderPassword;
            EmailSenderUsername = emailSenderUsername;
            EnableRemoteBackedStorage = enableRemoteBackedStorage;
            EnableSearchableSnapshots = enableSearchableSnapshots;
            EnableSecurityAudit = enableSecurityAudit;
            EnableSnapshotApi = enableSnapshotApi;
            HttpMaxContentLength = httpMaxContentLength;
            HttpMaxHeaderSize = httpMaxHeaderSize;
            HttpMaxInitialLineLength = httpMaxInitialLineLength;
            IndicesFielddataCacheSize = indicesFielddataCacheSize;
            IndicesMemoryIndexBufferSize = indicesMemoryIndexBufferSize;
            IndicesMemoryMaxIndexBufferSize = indicesMemoryMaxIndexBufferSize;
            IndicesMemoryMinIndexBufferSize = indicesMemoryMinIndexBufferSize;
            IndicesQueriesCacheSize = indicesQueriesCacheSize;
            IndicesQueryBoolMaxClauseCount = indicesQueryBoolMaxClauseCount;
            IndicesRecoveryMaxBytesPerSec = indicesRecoveryMaxBytesPerSec;
            IndicesRecoveryMaxConcurrentFileChunks = indicesRecoveryMaxConcurrentFileChunks;
            IsmEnabled = ismEnabled;
            IsmHistoryEnabled = ismHistoryEnabled;
            IsmHistoryMaxAge = ismHistoryMaxAge;
            IsmHistoryMaxDocs = ismHistoryMaxDocs;
            IsmHistoryRolloverCheckPeriod = ismHistoryRolloverCheckPeriod;
            IsmHistoryRolloverRetentionPeriod = ismHistoryRolloverRetentionPeriod;
            KnnMemoryCircuitBreakerEnabled = knnMemoryCircuitBreakerEnabled;
            KnnMemoryCircuitBreakerLimit = knnMemoryCircuitBreakerLimit;
            NodeSearchCacheSize = nodeSearchCacheSize;
            OverrideMainResponseVersion = overrideMainResponseVersion;
            PluginsAlertingFilterByBackendRoles = pluginsAlertingFilterByBackendRoles;
            ReindexRemoteWhitelists = reindexRemoteWhitelists;
            RemoteStore = remoteStore;
            ScriptMaxCompilationsRate = scriptMaxCompilationsRate;
            SearchBackpressure = searchBackpressure;
            SearchInsightsTopQueries = searchInsightsTopQueries;
            SearchMaxBuckets = searchMaxBuckets;
            Segrep = segrep;
            ShardIndexingPressure = shardIndexingPressure;
            ThreadPoolAnalyzeQueueSize = threadPoolAnalyzeQueueSize;
            ThreadPoolAnalyzeSize = threadPoolAnalyzeSize;
            ThreadPoolForceMergeSize = threadPoolForceMergeSize;
            ThreadPoolGetQueueSize = threadPoolGetQueueSize;
            ThreadPoolGetSize = threadPoolGetSize;
            ThreadPoolSearchQueueSize = threadPoolSearchQueueSize;
            ThreadPoolSearchSize = threadPoolSearchSize;
            ThreadPoolSearchThrottledQueueSize = threadPoolSearchThrottledQueueSize;
            ThreadPoolSearchThrottledSize = threadPoolSearchThrottledSize;
            ThreadPoolWriteQueueSize = threadPoolWriteQueueSize;
            ThreadPoolWriteSize = threadPoolWriteSize;
        }
    }
}
