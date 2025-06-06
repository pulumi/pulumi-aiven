// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aiven
{
    public static class GetMirrorMakerReplicationFlow
    {
        /// <summary>
        /// Gets information about an [Aiven for Apache Kafka® MirrorMaker 2](https://aiven.io/docs/products/kafka/kafka-mirrormaker) replication flow.
        /// 
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Aiven = Pulumi.Aiven;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var exampleReplicationFlow = Aiven.GetMirrorMakerReplicationFlow.Invoke(new()
        ///     {
        ///         Project = exampleProject.Project,
        ///         ServiceName = exampleKafka.ServiceName,
        ///         SourceCluster = source.ServiceName,
        ///         TargetCluster = target.ServiceName,
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetMirrorMakerReplicationFlowResult> InvokeAsync(GetMirrorMakerReplicationFlowArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetMirrorMakerReplicationFlowResult>("aiven:index/getMirrorMakerReplicationFlow:getMirrorMakerReplicationFlow", args ?? new GetMirrorMakerReplicationFlowArgs(), options.WithDefaults());

        /// <summary>
        /// Gets information about an [Aiven for Apache Kafka® MirrorMaker 2](https://aiven.io/docs/products/kafka/kafka-mirrormaker) replication flow.
        /// 
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Aiven = Pulumi.Aiven;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var exampleReplicationFlow = Aiven.GetMirrorMakerReplicationFlow.Invoke(new()
        ///     {
        ///         Project = exampleProject.Project,
        ///         ServiceName = exampleKafka.ServiceName,
        ///         SourceCluster = source.ServiceName,
        ///         TargetCluster = target.ServiceName,
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetMirrorMakerReplicationFlowResult> Invoke(GetMirrorMakerReplicationFlowInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetMirrorMakerReplicationFlowResult>("aiven:index/getMirrorMakerReplicationFlow:getMirrorMakerReplicationFlow", args ?? new GetMirrorMakerReplicationFlowInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// Gets information about an [Aiven for Apache Kafka® MirrorMaker 2](https://aiven.io/docs/products/kafka/kafka-mirrormaker) replication flow.
        /// 
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Aiven = Pulumi.Aiven;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var exampleReplicationFlow = Aiven.GetMirrorMakerReplicationFlow.Invoke(new()
        ///     {
        ///         Project = exampleProject.Project,
        ///         ServiceName = exampleKafka.ServiceName,
        ///         SourceCluster = source.ServiceName,
        ///         TargetCluster = target.ServiceName,
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetMirrorMakerReplicationFlowResult> Invoke(GetMirrorMakerReplicationFlowInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetMirrorMakerReplicationFlowResult>("aiven:index/getMirrorMakerReplicationFlow:getMirrorMakerReplicationFlow", args ?? new GetMirrorMakerReplicationFlowInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetMirrorMakerReplicationFlowArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The name of the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
        /// </summary>
        [Input("project", required: true)]
        public string Project { get; set; } = null!;

        /// <summary>
        /// The name of the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
        /// </summary>
        [Input("serviceName", required: true)]
        public string ServiceName { get; set; } = null!;

        /// <summary>
        /// Source cluster alias. Maximum length: `128`.
        /// </summary>
        [Input("sourceCluster", required: true)]
        public string SourceCluster { get; set; } = null!;

        /// <summary>
        /// Target cluster alias. Maximum length: `128`.
        /// </summary>
        [Input("targetCluster", required: true)]
        public string TargetCluster { get; set; } = null!;

        public GetMirrorMakerReplicationFlowArgs()
        {
        }
        public static new GetMirrorMakerReplicationFlowArgs Empty => new GetMirrorMakerReplicationFlowArgs();
    }

    public sealed class GetMirrorMakerReplicationFlowInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The name of the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
        /// </summary>
        [Input("project", required: true)]
        public Input<string> Project { get; set; } = null!;

        /// <summary>
        /// The name of the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
        /// </summary>
        [Input("serviceName", required: true)]
        public Input<string> ServiceName { get; set; } = null!;

        /// <summary>
        /// Source cluster alias. Maximum length: `128`.
        /// </summary>
        [Input("sourceCluster", required: true)]
        public Input<string> SourceCluster { get; set; } = null!;

        /// <summary>
        /// Target cluster alias. Maximum length: `128`.
        /// </summary>
        [Input("targetCluster", required: true)]
        public Input<string> TargetCluster { get; set; } = null!;

        public GetMirrorMakerReplicationFlowInvokeArgs()
        {
        }
        public static new GetMirrorMakerReplicationFlowInvokeArgs Empty => new GetMirrorMakerReplicationFlowInvokeArgs();
    }


    [OutputType]
    public sealed class GetMirrorMakerReplicationFlowResult
    {
        /// <summary>
        /// List of topic configuration properties and regular expressions to not replicate. The properties that are not replicated by default are: `follower.replication.throttled.replicas`, `leader.replication.throttled.replicas`, `message.timestamp.difference.max.ms`, `message.timestamp.type`, `unclean.leader.election.enable`, and `min.insync.replicas`. Setting this overrides the defaults. For example, to enable replication for 'min.insync.replicas' and 'unclean.leader.election.enable' set this to: ["follower\\.replication\\.throttled\\.replicas", "leader\\.replication\\.throttled\\.replicas", "message\\.timestamp\\.difference\\.max\\.ms",  "message\\.timestamp\\.type"]
        /// </summary>
        public readonly ImmutableArray<string> ConfigPropertiesExcludes;
        /// <summary>
        /// Enables emitting heartbeats to the direction opposite to the flow, i.e. to the source cluster. The default value is `false`.
        /// </summary>
        public readonly bool EmitBackwardHeartbeatsEnabled;
        /// <summary>
        /// Enables emitting heartbeats to the target cluster. The default value is `false`.
        /// </summary>
        public readonly bool EmitHeartbeatsEnabled;
        /// <summary>
        /// Enables replication flow for a service.
        /// </summary>
        public readonly bool Enable;
        /// <summary>
        /// Enables exactly-once message delivery. Set this to `enabled` for new replications. The default value is `false`.
        /// </summary>
        public readonly bool ExactlyOnceDeliveryEnabled;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Offset syncs topic location. The possible values are `source` and `target`.
        /// </summary>
        public readonly string OffsetSyncsTopicLocation;
        /// <summary>
        /// The name of the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
        /// </summary>
        public readonly string Project;
        /// <summary>
        /// Replication factor, `&gt;= 1`.
        /// </summary>
        public readonly int ReplicationFactor;
        /// <summary>
        /// Replication policy class. The possible values are `org.apache.kafka.connect.mirror.DefaultReplicationPolicy` and `org.apache.kafka.connect.mirror.IdentityReplicationPolicy`. The default value is `org.apache.kafka.connect.mirror.DefaultReplicationPolicy`.
        /// </summary>
        public readonly string ReplicationPolicyClass;
        /// <summary>
        /// The name of the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
        /// </summary>
        public readonly string ServiceName;
        /// <summary>
        /// Source cluster alias. Maximum length: `128`.
        /// </summary>
        public readonly string SourceCluster;
        /// <summary>
        /// Sync consumer group offsets. The default value is `false`.
        /// </summary>
        public readonly bool SyncGroupOffsetsEnabled;
        /// <summary>
        /// Frequency of consumer group offset sync. The default value is `1`.
        /// </summary>
        public readonly int SyncGroupOffsetsIntervalSeconds;
        /// <summary>
        /// Target cluster alias. Maximum length: `128`.
        /// </summary>
        public readonly string TargetCluster;
        /// <summary>
        /// The topics to include in the replica defined by a [list of regular expressions in Java format](https://aiven.io/docs/products/kafka/kafka-mirrormaker/concepts/replication-flow-topics-regex).
        /// </summary>
        public readonly ImmutableArray<string> Topics;
        /// <summary>
        /// The topics to exclude from the replica defined by a [list of regular expressions in Java format](https://aiven.io/docs/products/kafka/kafka-mirrormaker/concepts/replication-flow-topics-regex).
        /// </summary>
        public readonly ImmutableArray<string> TopicsBlacklists;

        [OutputConstructor]
        private GetMirrorMakerReplicationFlowResult(
            ImmutableArray<string> configPropertiesExcludes,

            bool emitBackwardHeartbeatsEnabled,

            bool emitHeartbeatsEnabled,

            bool enable,

            bool exactlyOnceDeliveryEnabled,

            string id,

            string offsetSyncsTopicLocation,

            string project,

            int replicationFactor,

            string replicationPolicyClass,

            string serviceName,

            string sourceCluster,

            bool syncGroupOffsetsEnabled,

            int syncGroupOffsetsIntervalSeconds,

            string targetCluster,

            ImmutableArray<string> topics,

            ImmutableArray<string> topicsBlacklists)
        {
            ConfigPropertiesExcludes = configPropertiesExcludes;
            EmitBackwardHeartbeatsEnabled = emitBackwardHeartbeatsEnabled;
            EmitHeartbeatsEnabled = emitHeartbeatsEnabled;
            Enable = enable;
            ExactlyOnceDeliveryEnabled = exactlyOnceDeliveryEnabled;
            Id = id;
            OffsetSyncsTopicLocation = offsetSyncsTopicLocation;
            Project = project;
            ReplicationFactor = replicationFactor;
            ReplicationPolicyClass = replicationPolicyClass;
            ServiceName = serviceName;
            SourceCluster = sourceCluster;
            SyncGroupOffsetsEnabled = syncGroupOffsetsEnabled;
            SyncGroupOffsetsIntervalSeconds = syncGroupOffsetsIntervalSeconds;
            TargetCluster = targetCluster;
            Topics = topics;
            TopicsBlacklists = topicsBlacklists;
        }
    }
}
