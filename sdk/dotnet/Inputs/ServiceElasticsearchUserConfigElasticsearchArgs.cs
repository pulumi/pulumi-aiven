// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aiven.Inputs
{

    public sealed class ServiceElasticsearchUserConfigElasticsearchArgs : Pulumi.ResourceArgs
    {
        [Input("actionAutoCreateIndexEnabled")]
        public Input<string>? ActionAutoCreateIndexEnabled { get; set; }

        [Input("actionDestructiveRequiresName")]
        public Input<string>? ActionDestructiveRequiresName { get; set; }

        [Input("httpMaxContentLength")]
        public Input<int>? HttpMaxContentLength { get; set; }

        [Input("indicesFielddataCacheSize")]
        public Input<int>? IndicesFielddataCacheSize { get; set; }

        [Input("indicesMemoryIndexBufferSize")]
        public Input<int>? IndicesMemoryIndexBufferSize { get; set; }

        [Input("indicesQueriesCacheSize")]
        public Input<int>? IndicesQueriesCacheSize { get; set; }

        [Input("indicesQueryBoolMaxClauseCount")]
        public Input<int>? IndicesQueryBoolMaxClauseCount { get; set; }

        [Input("reindexRemoteWhitelists")]
        private InputList<string>? _reindexRemoteWhitelists;
        public InputList<string> ReindexRemoteWhitelists
        {
            get => _reindexRemoteWhitelists ?? (_reindexRemoteWhitelists = new InputList<string>());
            set => _reindexRemoteWhitelists = value;
        }

        [Input("threadPoolAnalyzeQueueSize")]
        public Input<int>? ThreadPoolAnalyzeQueueSize { get; set; }

        [Input("threadPoolAnalyzeSize")]
        public Input<int>? ThreadPoolAnalyzeSize { get; set; }

        [Input("threadPoolForceMergeSize")]
        public Input<int>? ThreadPoolForceMergeSize { get; set; }

        [Input("threadPoolGetQueueSize")]
        public Input<int>? ThreadPoolGetQueueSize { get; set; }

        [Input("threadPoolGetSize")]
        public Input<int>? ThreadPoolGetSize { get; set; }

        [Input("threadPoolIndexQueueSize")]
        public Input<int>? ThreadPoolIndexQueueSize { get; set; }

        [Input("threadPoolIndexSize")]
        public Input<int>? ThreadPoolIndexSize { get; set; }

        [Input("threadPoolSearchQueueSize")]
        public Input<int>? ThreadPoolSearchQueueSize { get; set; }

        [Input("threadPoolSearchSize")]
        public Input<int>? ThreadPoolSearchSize { get; set; }

        [Input("threadPoolSearchThrottledQueueSize")]
        public Input<int>? ThreadPoolSearchThrottledQueueSize { get; set; }

        [Input("threadPoolSearchThrottledSize")]
        public Input<int>? ThreadPoolSearchThrottledSize { get; set; }

        [Input("threadPoolWriteQueueSize")]
        public Input<int>? ThreadPoolWriteQueueSize { get; set; }

        [Input("threadPoolWriteSize")]
        public Input<int>? ThreadPoolWriteSize { get; set; }

        public ServiceElasticsearchUserConfigElasticsearchArgs()
        {
        }
    }
}