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
    public sealed class KafkaMirrorMakerKafkaMirrormakerUserConfigKafkaMirrormaker
    {
        /// <summary>
        /// Timeout for administrative tasks, e.g. detecting new topics, loading of consumer group and offsets. Defaults to 60000 milliseconds (1 minute).
        /// </summary>
        public readonly int? AdminTimeoutMs;
        /// <summary>
        /// Whether to emit consumer group offset checkpoints to target cluster periodically (default: true).
        /// </summary>
        public readonly bool? EmitCheckpointsEnabled;
        /// <summary>
        /// Frequency at which consumer group offset checkpoints are emitted (default: 60, every minute). Example: `60`.
        /// </summary>
        public readonly int? EmitCheckpointsIntervalSeconds;
        /// <summary>
        /// Consumer groups to replicate. Supports comma-separated group IDs and regexes. Example: `.*`.
        /// </summary>
        public readonly string? Groups;
        /// <summary>
        /// Exclude groups. Supports comma-separated group IDs and regexes. Excludes take precedence over includes. Example: `console-consumer-.*,connect-.*,__.*`.
        /// </summary>
        public readonly string? GroupsExclude;
        /// <summary>
        /// How out-of-sync a remote partition can be before it is resynced. Example: `100`.
        /// </summary>
        public readonly int? OffsetLagMax;
        /// <summary>
        /// Whether to periodically check for new consumer groups. Defaults to `true`.
        /// </summary>
        public readonly bool? RefreshGroupsEnabled;
        /// <summary>
        /// Frequency of consumer group refresh in seconds. Defaults to 600 seconds (10 minutes).
        /// </summary>
        public readonly int? RefreshGroupsIntervalSeconds;
        /// <summary>
        /// Whether to periodically check for new topics and partitions. Defaults to `true`.
        /// </summary>
        public readonly bool? RefreshTopicsEnabled;
        /// <summary>
        /// Frequency of topic and partitions refresh in seconds. Defaults to 600 seconds (10 minutes).
        /// </summary>
        public readonly int? RefreshTopicsIntervalSeconds;
        /// <summary>
        /// Whether to periodically write the translated offsets of replicated consumer groups (in the source cluster) to _*consumer*offsets topic in target cluster, as long as no active consumers in that group are connected to the target cluster.
        /// </summary>
        public readonly bool? SyncGroupOffsetsEnabled;
        /// <summary>
        /// Frequency at which consumer group offsets are synced (default: 60, every minute). Example: `60`.
        /// </summary>
        public readonly int? SyncGroupOffsetsIntervalSeconds;
        /// <summary>
        /// Whether to periodically configure remote topics to match their corresponding upstream topics.
        /// </summary>
        public readonly bool? SyncTopicConfigsEnabled;
        /// <summary>
        /// `tasks.max` is set to this multiplied by the number of CPUs in the service. Default: `1`.
        /// </summary>
        public readonly int? TasksMaxPerCpu;

        [OutputConstructor]
        private KafkaMirrorMakerKafkaMirrormakerUserConfigKafkaMirrormaker(
            int? adminTimeoutMs,

            bool? emitCheckpointsEnabled,

            int? emitCheckpointsIntervalSeconds,

            string? groups,

            string? groupsExclude,

            int? offsetLagMax,

            bool? refreshGroupsEnabled,

            int? refreshGroupsIntervalSeconds,

            bool? refreshTopicsEnabled,

            int? refreshTopicsIntervalSeconds,

            bool? syncGroupOffsetsEnabled,

            int? syncGroupOffsetsIntervalSeconds,

            bool? syncTopicConfigsEnabled,

            int? tasksMaxPerCpu)
        {
            AdminTimeoutMs = adminTimeoutMs;
            EmitCheckpointsEnabled = emitCheckpointsEnabled;
            EmitCheckpointsIntervalSeconds = emitCheckpointsIntervalSeconds;
            Groups = groups;
            GroupsExclude = groupsExclude;
            OffsetLagMax = offsetLagMax;
            RefreshGroupsEnabled = refreshGroupsEnabled;
            RefreshGroupsIntervalSeconds = refreshGroupsIntervalSeconds;
            RefreshTopicsEnabled = refreshTopicsEnabled;
            RefreshTopicsIntervalSeconds = refreshTopicsIntervalSeconds;
            SyncGroupOffsetsEnabled = syncGroupOffsetsEnabled;
            SyncGroupOffsetsIntervalSeconds = syncGroupOffsetsIntervalSeconds;
            SyncTopicConfigsEnabled = syncTopicConfigsEnabled;
            TasksMaxPerCpu = tasksMaxPerCpu;
        }
    }
}
