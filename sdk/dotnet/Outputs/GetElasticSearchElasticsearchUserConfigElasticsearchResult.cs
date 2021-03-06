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
    public sealed class GetElasticSearchElasticsearchUserConfigElasticsearchResult
    {
        /// <summary>
        /// Explicitly allow or block automatic 
        /// creation of indices. Defaults to true
        /// </summary>
        public readonly string? ActionAutoCreateIndexEnabled;
        /// <summary>
        /// Require explicit index names when deleting
        /// </summary>
        public readonly string? ActionDestructiveRequiresName;
        /// <summary>
        /// Controls the number of shards allowed in the
        /// cluster per data node
        /// </summary>
        public readonly string? ClusterMaxShardsPerNode;
        /// <summary>
        /// Maximum content length for HTTP requests to 
        /// the Elasticsearch HTTP API, in bytes.
        /// </summary>
        public readonly string? HttpMaxContentLength;
        /// <summary>
        /// The max size of allowed headers, in bytes.
        /// </summary>
        public readonly string? HttpMaxHeaderSize;
        /// <summary>
        /// The max length of an HTTP URL, in bytes.
        /// </summary>
        public readonly string? HttpMaxInitialLineLength;
        /// <summary>
        /// Relative amount. Maximum amount of 
        /// heap memory used for field data cache. This is an expert setting; decreasing the
        /// value too much will increase overhead of loading field data; too much memory used
        /// for field data cache will decrease amount of heap available for other operations.
        /// </summary>
        public readonly string? IndicesFielddataCacheSize;
        /// <summary>
        /// Percentage value. Default is 10%. 
        /// Total amount of heap used for indexing buffer, before writing segments to disk.
        /// This is an expert setting. Too low value will slow down indexing; too high value
        /// will increase indexing performance but causes performance issues for query performance.
        /// </summary>
        public readonly string? IndicesMemoryIndexBufferSize;
        /// <summary>
        /// Percentage value. Default is 10%. 
        /// Maximum amount of heap used for query cache. This is an expert setting.
        /// Too low value will decrease query performance and increase performance for other
        /// operations; too high value will cause issues with other Elasticsearch functionality.
        /// </summary>
        public readonly string? IndicesQueriesCacheSize;
        /// <summary>
        /// Maximum number of clauses Lucene 
        /// BooleanQuery can have. The default value (1024) is relatively high, and increasing it
        /// may cause performance issues. Investigate other approaches first before increasing this value.
        /// </summary>
        public readonly string? IndicesQueryBoolMaxClauseCount;
        /// <summary>
        /// Whitelisted addresses for reindexing. 
        /// Changing this value will cause all Elasticsearch instances to restart.
        /// </summary>
        public readonly ImmutableArray<string> ReindexRemoteWhitelists;
        /// <summary>
        /// Maximum number of aggregation buckets allowed 
        /// in a single response. Elasticsearch default value is used when this is not defined.
        /// </summary>
        public readonly string? SearchMaxBuckets;
        /// <summary>
        /// Size for the thread pool queue. 
        /// See documentation for exact details.
        /// </summary>
        public readonly string? ThreadPoolAnalyzeQueueSize;
        /// <summary>
        /// Size for the thread pool. See documentation 
        /// for exact details. Do note this may have maximum value depending on CPU count -
        /// value is automatically lowered if set to higher than maximum value.
        /// </summary>
        public readonly string? ThreadPoolAnalyzeSize;
        /// <summary>
        /// Size for the thread pool. See 
        /// documentation for exact details. Do note this may have maximum value depending on
        /// CPU count - value is automatically lowered if set to higher than maximum value.
        /// </summary>
        public readonly string? ThreadPoolForceMergeSize;
        /// <summary>
        /// Size for the thread pool queue. See 
        /// documentation for exact details.
        /// </summary>
        public readonly string? ThreadPoolGetQueueSize;
        /// <summary>
        /// Size for the thread pool. See documentation 
        /// for exact details. Do note this may have maximum value depending on CPU count -
        /// value is automatically lowered if set to higher than maximum value.
        /// </summary>
        public readonly string? ThreadPoolGetSize;
        /// <summary>
        /// Size for the thread pool queue. 
        /// See documentation for exact details.
        /// </summary>
        public readonly string? ThreadPoolIndexQueueSize;
        /// <summary>
        /// Size for the thread pool. See documentation 
        /// for exact details. Do note this may have maximum value depending on CPU count -
        /// value is automatically lowered if set to higher than maximum value.
        /// </summary>
        public readonly string? ThreadPoolIndexSize;
        /// <summary>
        /// Size for the thread pool queue. See 
        /// documentation for exact details.
        /// </summary>
        public readonly string? ThreadPoolSearchQueueSize;
        /// <summary>
        /// Size for the thread pool. See documentation 
        /// for exact details. Do note this may have maximum value depending on CPU count - value
        /// is automatically lowered if set to higher than maximum value.
        /// </summary>
        public readonly string? ThreadPoolSearchSize;
        /// <summary>
        /// Size for the thread pool queue. 
        /// See documentation for exact details.
        /// </summary>
        public readonly string? ThreadPoolSearchThrottledQueueSize;
        /// <summary>
        /// Size for the thread pool. See 
        /// documentation for exact details. Do note this may have maximum value depending on
        /// CPU count - value is automatically lowered if set to higher than maximum value.
        /// </summary>
        public readonly string? ThreadPoolSearchThrottledSize;
        /// <summary>
        /// Size for the thread pool queue. See 
        /// documentation for exact details.
        /// </summary>
        public readonly string? ThreadPoolWriteQueueSize;
        /// <summary>
        /// Size for the thread pool. See documentation 
        /// for exact details. Do note this may have maximum value depending on CPU count - value
        /// is automatically lowered if set to higher than maximum value.
        /// </summary>
        public readonly string? ThreadPoolWriteSize;

        [OutputConstructor]
        private GetElasticSearchElasticsearchUserConfigElasticsearchResult(
            string? actionAutoCreateIndexEnabled,

            string? actionDestructiveRequiresName,

            string? clusterMaxShardsPerNode,

            string? httpMaxContentLength,

            string? httpMaxHeaderSize,

            string? httpMaxInitialLineLength,

            string? indicesFielddataCacheSize,

            string? indicesMemoryIndexBufferSize,

            string? indicesQueriesCacheSize,

            string? indicesQueryBoolMaxClauseCount,

            ImmutableArray<string> reindexRemoteWhitelists,

            string? searchMaxBuckets,

            string? threadPoolAnalyzeQueueSize,

            string? threadPoolAnalyzeSize,

            string? threadPoolForceMergeSize,

            string? threadPoolGetQueueSize,

            string? threadPoolGetSize,

            string? threadPoolIndexQueueSize,

            string? threadPoolIndexSize,

            string? threadPoolSearchQueueSize,

            string? threadPoolSearchSize,

            string? threadPoolSearchThrottledQueueSize,

            string? threadPoolSearchThrottledSize,

            string? threadPoolWriteQueueSize,

            string? threadPoolWriteSize)
        {
            ActionAutoCreateIndexEnabled = actionAutoCreateIndexEnabled;
            ActionDestructiveRequiresName = actionDestructiveRequiresName;
            ClusterMaxShardsPerNode = clusterMaxShardsPerNode;
            HttpMaxContentLength = httpMaxContentLength;
            HttpMaxHeaderSize = httpMaxHeaderSize;
            HttpMaxInitialLineLength = httpMaxInitialLineLength;
            IndicesFielddataCacheSize = indicesFielddataCacheSize;
            IndicesMemoryIndexBufferSize = indicesMemoryIndexBufferSize;
            IndicesQueriesCacheSize = indicesQueriesCacheSize;
            IndicesQueryBoolMaxClauseCount = indicesQueryBoolMaxClauseCount;
            ReindexRemoteWhitelists = reindexRemoteWhitelists;
            SearchMaxBuckets = searchMaxBuckets;
            ThreadPoolAnalyzeQueueSize = threadPoolAnalyzeQueueSize;
            ThreadPoolAnalyzeSize = threadPoolAnalyzeSize;
            ThreadPoolForceMergeSize = threadPoolForceMergeSize;
            ThreadPoolGetQueueSize = threadPoolGetQueueSize;
            ThreadPoolGetSize = threadPoolGetSize;
            ThreadPoolIndexQueueSize = threadPoolIndexQueueSize;
            ThreadPoolIndexSize = threadPoolIndexSize;
            ThreadPoolSearchQueueSize = threadPoolSearchQueueSize;
            ThreadPoolSearchSize = threadPoolSearchSize;
            ThreadPoolSearchThrottledQueueSize = threadPoolSearchThrottledQueueSize;
            ThreadPoolSearchThrottledSize = threadPoolSearchThrottledSize;
            ThreadPoolWriteQueueSize = threadPoolWriteQueueSize;
            ThreadPoolWriteSize = threadPoolWriteSize;
        }
    }
}
