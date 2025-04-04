// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aiven.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class KafkaMirrorMakerKafkaMirrormakerUserConfigKafkaMirrormakerArgs extends com.pulumi.resources.ResourceArgs {

    public static final KafkaMirrorMakerKafkaMirrormakerUserConfigKafkaMirrormakerArgs Empty = new KafkaMirrorMakerKafkaMirrormakerUserConfigKafkaMirrormakerArgs();

    /**
     * Timeout for administrative tasks, e.g. detecting new topics, loading of consumer group and offsets. Defaults to 60000 milliseconds (1 minute).
     * 
     */
    @Import(name="adminTimeoutMs")
    private @Nullable Output<Integer> adminTimeoutMs;

    /**
     * @return Timeout for administrative tasks, e.g. detecting new topics, loading of consumer group and offsets. Defaults to 60000 milliseconds (1 minute).
     * 
     */
    public Optional<Output<Integer>> adminTimeoutMs() {
        return Optional.ofNullable(this.adminTimeoutMs);
    }

    /**
     * Whether to emit consumer group offset checkpoints to target cluster periodically (default: true).
     * 
     */
    @Import(name="emitCheckpointsEnabled")
    private @Nullable Output<Boolean> emitCheckpointsEnabled;

    /**
     * @return Whether to emit consumer group offset checkpoints to target cluster periodically (default: true).
     * 
     */
    public Optional<Output<Boolean>> emitCheckpointsEnabled() {
        return Optional.ofNullable(this.emitCheckpointsEnabled);
    }

    /**
     * Frequency at which consumer group offset checkpoints are emitted (default: 60, every minute). Example: `60`.
     * 
     */
    @Import(name="emitCheckpointsIntervalSeconds")
    private @Nullable Output<Integer> emitCheckpointsIntervalSeconds;

    /**
     * @return Frequency at which consumer group offset checkpoints are emitted (default: 60, every minute). Example: `60`.
     * 
     */
    public Optional<Output<Integer>> emitCheckpointsIntervalSeconds() {
        return Optional.ofNullable(this.emitCheckpointsIntervalSeconds);
    }

    /**
     * Consumer groups to replicate. Supports comma-separated group IDs and regexes. Example: `.*`.
     * 
     */
    @Import(name="groups")
    private @Nullable Output<String> groups;

    /**
     * @return Consumer groups to replicate. Supports comma-separated group IDs and regexes. Example: `.*`.
     * 
     */
    public Optional<Output<String>> groups() {
        return Optional.ofNullable(this.groups);
    }

    /**
     * Exclude groups. Supports comma-separated group IDs and regexes. Excludes take precedence over includes. Example: `console-consumer-.*,connect-.*,__.*`.
     * 
     */
    @Import(name="groupsExclude")
    private @Nullable Output<String> groupsExclude;

    /**
     * @return Exclude groups. Supports comma-separated group IDs and regexes. Excludes take precedence over includes. Example: `console-consumer-.*,connect-.*,__.*`.
     * 
     */
    public Optional<Output<String>> groupsExclude() {
        return Optional.ofNullable(this.groupsExclude);
    }

    /**
     * How out-of-sync a remote partition can be before it is resynced. Example: `100`.
     * 
     */
    @Import(name="offsetLagMax")
    private @Nullable Output<Integer> offsetLagMax;

    /**
     * @return How out-of-sync a remote partition can be before it is resynced. Example: `100`.
     * 
     */
    public Optional<Output<Integer>> offsetLagMax() {
        return Optional.ofNullable(this.offsetLagMax);
    }

    /**
     * Whether to periodically check for new consumer groups. Defaults to `true`.
     * 
     */
    @Import(name="refreshGroupsEnabled")
    private @Nullable Output<Boolean> refreshGroupsEnabled;

    /**
     * @return Whether to periodically check for new consumer groups. Defaults to `true`.
     * 
     */
    public Optional<Output<Boolean>> refreshGroupsEnabled() {
        return Optional.ofNullable(this.refreshGroupsEnabled);
    }

    /**
     * Frequency of consumer group refresh in seconds. Defaults to 600 seconds (10 minutes).
     * 
     */
    @Import(name="refreshGroupsIntervalSeconds")
    private @Nullable Output<Integer> refreshGroupsIntervalSeconds;

    /**
     * @return Frequency of consumer group refresh in seconds. Defaults to 600 seconds (10 minutes).
     * 
     */
    public Optional<Output<Integer>> refreshGroupsIntervalSeconds() {
        return Optional.ofNullable(this.refreshGroupsIntervalSeconds);
    }

    /**
     * Whether to periodically check for new topics and partitions. Defaults to `true`.
     * 
     */
    @Import(name="refreshTopicsEnabled")
    private @Nullable Output<Boolean> refreshTopicsEnabled;

    /**
     * @return Whether to periodically check for new topics and partitions. Defaults to `true`.
     * 
     */
    public Optional<Output<Boolean>> refreshTopicsEnabled() {
        return Optional.ofNullable(this.refreshTopicsEnabled);
    }

    /**
     * Frequency of topic and partitions refresh in seconds. Defaults to 600 seconds (10 minutes).
     * 
     */
    @Import(name="refreshTopicsIntervalSeconds")
    private @Nullable Output<Integer> refreshTopicsIntervalSeconds;

    /**
     * @return Frequency of topic and partitions refresh in seconds. Defaults to 600 seconds (10 minutes).
     * 
     */
    public Optional<Output<Integer>> refreshTopicsIntervalSeconds() {
        return Optional.ofNullable(this.refreshTopicsIntervalSeconds);
    }

    /**
     * Whether to periodically write the translated offsets of replicated consumer groups (in the source cluster) to _*consumer*offsets topic in target cluster, as long as no active consumers in that group are connected to the target cluster.
     * 
     */
    @Import(name="syncGroupOffsetsEnabled")
    private @Nullable Output<Boolean> syncGroupOffsetsEnabled;

    /**
     * @return Whether to periodically write the translated offsets of replicated consumer groups (in the source cluster) to _*consumer*offsets topic in target cluster, as long as no active consumers in that group are connected to the target cluster.
     * 
     */
    public Optional<Output<Boolean>> syncGroupOffsetsEnabled() {
        return Optional.ofNullable(this.syncGroupOffsetsEnabled);
    }

    /**
     * Frequency at which consumer group offsets are synced (default: 60, every minute). Example: `60`.
     * 
     */
    @Import(name="syncGroupOffsetsIntervalSeconds")
    private @Nullable Output<Integer> syncGroupOffsetsIntervalSeconds;

    /**
     * @return Frequency at which consumer group offsets are synced (default: 60, every minute). Example: `60`.
     * 
     */
    public Optional<Output<Integer>> syncGroupOffsetsIntervalSeconds() {
        return Optional.ofNullable(this.syncGroupOffsetsIntervalSeconds);
    }

    /**
     * Whether to periodically configure remote topics to match their corresponding upstream topics.
     * 
     */
    @Import(name="syncTopicConfigsEnabled")
    private @Nullable Output<Boolean> syncTopicConfigsEnabled;

    /**
     * @return Whether to periodically configure remote topics to match their corresponding upstream topics.
     * 
     */
    public Optional<Output<Boolean>> syncTopicConfigsEnabled() {
        return Optional.ofNullable(this.syncTopicConfigsEnabled);
    }

    /**
     * `tasks.max` is set to this multiplied by the number of CPUs in the service. Default: `1`.
     * 
     */
    @Import(name="tasksMaxPerCpu")
    private @Nullable Output<Integer> tasksMaxPerCpu;

    /**
     * @return `tasks.max` is set to this multiplied by the number of CPUs in the service. Default: `1`.
     * 
     */
    public Optional<Output<Integer>> tasksMaxPerCpu() {
        return Optional.ofNullable(this.tasksMaxPerCpu);
    }

    private KafkaMirrorMakerKafkaMirrormakerUserConfigKafkaMirrormakerArgs() {}

    private KafkaMirrorMakerKafkaMirrormakerUserConfigKafkaMirrormakerArgs(KafkaMirrorMakerKafkaMirrormakerUserConfigKafkaMirrormakerArgs $) {
        this.adminTimeoutMs = $.adminTimeoutMs;
        this.emitCheckpointsEnabled = $.emitCheckpointsEnabled;
        this.emitCheckpointsIntervalSeconds = $.emitCheckpointsIntervalSeconds;
        this.groups = $.groups;
        this.groupsExclude = $.groupsExclude;
        this.offsetLagMax = $.offsetLagMax;
        this.refreshGroupsEnabled = $.refreshGroupsEnabled;
        this.refreshGroupsIntervalSeconds = $.refreshGroupsIntervalSeconds;
        this.refreshTopicsEnabled = $.refreshTopicsEnabled;
        this.refreshTopicsIntervalSeconds = $.refreshTopicsIntervalSeconds;
        this.syncGroupOffsetsEnabled = $.syncGroupOffsetsEnabled;
        this.syncGroupOffsetsIntervalSeconds = $.syncGroupOffsetsIntervalSeconds;
        this.syncTopicConfigsEnabled = $.syncTopicConfigsEnabled;
        this.tasksMaxPerCpu = $.tasksMaxPerCpu;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(KafkaMirrorMakerKafkaMirrormakerUserConfigKafkaMirrormakerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private KafkaMirrorMakerKafkaMirrormakerUserConfigKafkaMirrormakerArgs $;

        public Builder() {
            $ = new KafkaMirrorMakerKafkaMirrormakerUserConfigKafkaMirrormakerArgs();
        }

        public Builder(KafkaMirrorMakerKafkaMirrormakerUserConfigKafkaMirrormakerArgs defaults) {
            $ = new KafkaMirrorMakerKafkaMirrormakerUserConfigKafkaMirrormakerArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param adminTimeoutMs Timeout for administrative tasks, e.g. detecting new topics, loading of consumer group and offsets. Defaults to 60000 milliseconds (1 minute).
         * 
         * @return builder
         * 
         */
        public Builder adminTimeoutMs(@Nullable Output<Integer> adminTimeoutMs) {
            $.adminTimeoutMs = adminTimeoutMs;
            return this;
        }

        /**
         * @param adminTimeoutMs Timeout for administrative tasks, e.g. detecting new topics, loading of consumer group and offsets. Defaults to 60000 milliseconds (1 minute).
         * 
         * @return builder
         * 
         */
        public Builder adminTimeoutMs(Integer adminTimeoutMs) {
            return adminTimeoutMs(Output.of(adminTimeoutMs));
        }

        /**
         * @param emitCheckpointsEnabled Whether to emit consumer group offset checkpoints to target cluster periodically (default: true).
         * 
         * @return builder
         * 
         */
        public Builder emitCheckpointsEnabled(@Nullable Output<Boolean> emitCheckpointsEnabled) {
            $.emitCheckpointsEnabled = emitCheckpointsEnabled;
            return this;
        }

        /**
         * @param emitCheckpointsEnabled Whether to emit consumer group offset checkpoints to target cluster periodically (default: true).
         * 
         * @return builder
         * 
         */
        public Builder emitCheckpointsEnabled(Boolean emitCheckpointsEnabled) {
            return emitCheckpointsEnabled(Output.of(emitCheckpointsEnabled));
        }

        /**
         * @param emitCheckpointsIntervalSeconds Frequency at which consumer group offset checkpoints are emitted (default: 60, every minute). Example: `60`.
         * 
         * @return builder
         * 
         */
        public Builder emitCheckpointsIntervalSeconds(@Nullable Output<Integer> emitCheckpointsIntervalSeconds) {
            $.emitCheckpointsIntervalSeconds = emitCheckpointsIntervalSeconds;
            return this;
        }

        /**
         * @param emitCheckpointsIntervalSeconds Frequency at which consumer group offset checkpoints are emitted (default: 60, every minute). Example: `60`.
         * 
         * @return builder
         * 
         */
        public Builder emitCheckpointsIntervalSeconds(Integer emitCheckpointsIntervalSeconds) {
            return emitCheckpointsIntervalSeconds(Output.of(emitCheckpointsIntervalSeconds));
        }

        /**
         * @param groups Consumer groups to replicate. Supports comma-separated group IDs and regexes. Example: `.*`.
         * 
         * @return builder
         * 
         */
        public Builder groups(@Nullable Output<String> groups) {
            $.groups = groups;
            return this;
        }

        /**
         * @param groups Consumer groups to replicate. Supports comma-separated group IDs and regexes. Example: `.*`.
         * 
         * @return builder
         * 
         */
        public Builder groups(String groups) {
            return groups(Output.of(groups));
        }

        /**
         * @param groupsExclude Exclude groups. Supports comma-separated group IDs and regexes. Excludes take precedence over includes. Example: `console-consumer-.*,connect-.*,__.*`.
         * 
         * @return builder
         * 
         */
        public Builder groupsExclude(@Nullable Output<String> groupsExclude) {
            $.groupsExclude = groupsExclude;
            return this;
        }

        /**
         * @param groupsExclude Exclude groups. Supports comma-separated group IDs and regexes. Excludes take precedence over includes. Example: `console-consumer-.*,connect-.*,__.*`.
         * 
         * @return builder
         * 
         */
        public Builder groupsExclude(String groupsExclude) {
            return groupsExclude(Output.of(groupsExclude));
        }

        /**
         * @param offsetLagMax How out-of-sync a remote partition can be before it is resynced. Example: `100`.
         * 
         * @return builder
         * 
         */
        public Builder offsetLagMax(@Nullable Output<Integer> offsetLagMax) {
            $.offsetLagMax = offsetLagMax;
            return this;
        }

        /**
         * @param offsetLagMax How out-of-sync a remote partition can be before it is resynced. Example: `100`.
         * 
         * @return builder
         * 
         */
        public Builder offsetLagMax(Integer offsetLagMax) {
            return offsetLagMax(Output.of(offsetLagMax));
        }

        /**
         * @param refreshGroupsEnabled Whether to periodically check for new consumer groups. Defaults to `true`.
         * 
         * @return builder
         * 
         */
        public Builder refreshGroupsEnabled(@Nullable Output<Boolean> refreshGroupsEnabled) {
            $.refreshGroupsEnabled = refreshGroupsEnabled;
            return this;
        }

        /**
         * @param refreshGroupsEnabled Whether to periodically check for new consumer groups. Defaults to `true`.
         * 
         * @return builder
         * 
         */
        public Builder refreshGroupsEnabled(Boolean refreshGroupsEnabled) {
            return refreshGroupsEnabled(Output.of(refreshGroupsEnabled));
        }

        /**
         * @param refreshGroupsIntervalSeconds Frequency of consumer group refresh in seconds. Defaults to 600 seconds (10 minutes).
         * 
         * @return builder
         * 
         */
        public Builder refreshGroupsIntervalSeconds(@Nullable Output<Integer> refreshGroupsIntervalSeconds) {
            $.refreshGroupsIntervalSeconds = refreshGroupsIntervalSeconds;
            return this;
        }

        /**
         * @param refreshGroupsIntervalSeconds Frequency of consumer group refresh in seconds. Defaults to 600 seconds (10 minutes).
         * 
         * @return builder
         * 
         */
        public Builder refreshGroupsIntervalSeconds(Integer refreshGroupsIntervalSeconds) {
            return refreshGroupsIntervalSeconds(Output.of(refreshGroupsIntervalSeconds));
        }

        /**
         * @param refreshTopicsEnabled Whether to periodically check for new topics and partitions. Defaults to `true`.
         * 
         * @return builder
         * 
         */
        public Builder refreshTopicsEnabled(@Nullable Output<Boolean> refreshTopicsEnabled) {
            $.refreshTopicsEnabled = refreshTopicsEnabled;
            return this;
        }

        /**
         * @param refreshTopicsEnabled Whether to periodically check for new topics and partitions. Defaults to `true`.
         * 
         * @return builder
         * 
         */
        public Builder refreshTopicsEnabled(Boolean refreshTopicsEnabled) {
            return refreshTopicsEnabled(Output.of(refreshTopicsEnabled));
        }

        /**
         * @param refreshTopicsIntervalSeconds Frequency of topic and partitions refresh in seconds. Defaults to 600 seconds (10 minutes).
         * 
         * @return builder
         * 
         */
        public Builder refreshTopicsIntervalSeconds(@Nullable Output<Integer> refreshTopicsIntervalSeconds) {
            $.refreshTopicsIntervalSeconds = refreshTopicsIntervalSeconds;
            return this;
        }

        /**
         * @param refreshTopicsIntervalSeconds Frequency of topic and partitions refresh in seconds. Defaults to 600 seconds (10 minutes).
         * 
         * @return builder
         * 
         */
        public Builder refreshTopicsIntervalSeconds(Integer refreshTopicsIntervalSeconds) {
            return refreshTopicsIntervalSeconds(Output.of(refreshTopicsIntervalSeconds));
        }

        /**
         * @param syncGroupOffsetsEnabled Whether to periodically write the translated offsets of replicated consumer groups (in the source cluster) to _*consumer*offsets topic in target cluster, as long as no active consumers in that group are connected to the target cluster.
         * 
         * @return builder
         * 
         */
        public Builder syncGroupOffsetsEnabled(@Nullable Output<Boolean> syncGroupOffsetsEnabled) {
            $.syncGroupOffsetsEnabled = syncGroupOffsetsEnabled;
            return this;
        }

        /**
         * @param syncGroupOffsetsEnabled Whether to periodically write the translated offsets of replicated consumer groups (in the source cluster) to _*consumer*offsets topic in target cluster, as long as no active consumers in that group are connected to the target cluster.
         * 
         * @return builder
         * 
         */
        public Builder syncGroupOffsetsEnabled(Boolean syncGroupOffsetsEnabled) {
            return syncGroupOffsetsEnabled(Output.of(syncGroupOffsetsEnabled));
        }

        /**
         * @param syncGroupOffsetsIntervalSeconds Frequency at which consumer group offsets are synced (default: 60, every minute). Example: `60`.
         * 
         * @return builder
         * 
         */
        public Builder syncGroupOffsetsIntervalSeconds(@Nullable Output<Integer> syncGroupOffsetsIntervalSeconds) {
            $.syncGroupOffsetsIntervalSeconds = syncGroupOffsetsIntervalSeconds;
            return this;
        }

        /**
         * @param syncGroupOffsetsIntervalSeconds Frequency at which consumer group offsets are synced (default: 60, every minute). Example: `60`.
         * 
         * @return builder
         * 
         */
        public Builder syncGroupOffsetsIntervalSeconds(Integer syncGroupOffsetsIntervalSeconds) {
            return syncGroupOffsetsIntervalSeconds(Output.of(syncGroupOffsetsIntervalSeconds));
        }

        /**
         * @param syncTopicConfigsEnabled Whether to periodically configure remote topics to match their corresponding upstream topics.
         * 
         * @return builder
         * 
         */
        public Builder syncTopicConfigsEnabled(@Nullable Output<Boolean> syncTopicConfigsEnabled) {
            $.syncTopicConfigsEnabled = syncTopicConfigsEnabled;
            return this;
        }

        /**
         * @param syncTopicConfigsEnabled Whether to periodically configure remote topics to match their corresponding upstream topics.
         * 
         * @return builder
         * 
         */
        public Builder syncTopicConfigsEnabled(Boolean syncTopicConfigsEnabled) {
            return syncTopicConfigsEnabled(Output.of(syncTopicConfigsEnabled));
        }

        /**
         * @param tasksMaxPerCpu `tasks.max` is set to this multiplied by the number of CPUs in the service. Default: `1`.
         * 
         * @return builder
         * 
         */
        public Builder tasksMaxPerCpu(@Nullable Output<Integer> tasksMaxPerCpu) {
            $.tasksMaxPerCpu = tasksMaxPerCpu;
            return this;
        }

        /**
         * @param tasksMaxPerCpu `tasks.max` is set to this multiplied by the number of CPUs in the service. Default: `1`.
         * 
         * @return builder
         * 
         */
        public Builder tasksMaxPerCpu(Integer tasksMaxPerCpu) {
            return tasksMaxPerCpu(Output.of(tasksMaxPerCpu));
        }

        public KafkaMirrorMakerKafkaMirrormakerUserConfigKafkaMirrormakerArgs build() {
            return $;
        }
    }

}
