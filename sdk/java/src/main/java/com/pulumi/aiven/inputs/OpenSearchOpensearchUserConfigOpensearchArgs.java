// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aiven.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OpenSearchOpensearchUserConfigOpensearchArgs extends com.pulumi.resources.ResourceArgs {

    public static final OpenSearchOpensearchUserConfigOpensearchArgs Empty = new OpenSearchOpensearchUserConfigOpensearchArgs();

    @Import(name="actionAutoCreateIndexEnabled")
    private @Nullable Output<String> actionAutoCreateIndexEnabled;

    public Optional<Output<String>> actionAutoCreateIndexEnabled() {
        return Optional.ofNullable(this.actionAutoCreateIndexEnabled);
    }

    @Import(name="actionDestructiveRequiresName")
    private @Nullable Output<String> actionDestructiveRequiresName;

    public Optional<Output<String>> actionDestructiveRequiresName() {
        return Optional.ofNullable(this.actionDestructiveRequiresName);
    }

    @Import(name="clusterMaxShardsPerNode")
    private @Nullable Output<String> clusterMaxShardsPerNode;

    public Optional<Output<String>> clusterMaxShardsPerNode() {
        return Optional.ofNullable(this.clusterMaxShardsPerNode);
    }

    @Import(name="clusterRoutingAllocationNodeConcurrentRecoveries")
    private @Nullable Output<String> clusterRoutingAllocationNodeConcurrentRecoveries;

    public Optional<Output<String>> clusterRoutingAllocationNodeConcurrentRecoveries() {
        return Optional.ofNullable(this.clusterRoutingAllocationNodeConcurrentRecoveries);
    }

    @Import(name="emailSenderName")
    private @Nullable Output<String> emailSenderName;

    public Optional<Output<String>> emailSenderName() {
        return Optional.ofNullable(this.emailSenderName);
    }

    @Import(name="emailSenderPassword")
    private @Nullable Output<String> emailSenderPassword;

    public Optional<Output<String>> emailSenderPassword() {
        return Optional.ofNullable(this.emailSenderPassword);
    }

    @Import(name="emailSenderUsername")
    private @Nullable Output<String> emailSenderUsername;

    public Optional<Output<String>> emailSenderUsername() {
        return Optional.ofNullable(this.emailSenderUsername);
    }

    @Import(name="httpMaxContentLength")
    private @Nullable Output<String> httpMaxContentLength;

    public Optional<Output<String>> httpMaxContentLength() {
        return Optional.ofNullable(this.httpMaxContentLength);
    }

    @Import(name="httpMaxHeaderSize")
    private @Nullable Output<String> httpMaxHeaderSize;

    public Optional<Output<String>> httpMaxHeaderSize() {
        return Optional.ofNullable(this.httpMaxHeaderSize);
    }

    @Import(name="httpMaxInitialLineLength")
    private @Nullable Output<String> httpMaxInitialLineLength;

    public Optional<Output<String>> httpMaxInitialLineLength() {
        return Optional.ofNullable(this.httpMaxInitialLineLength);
    }

    @Import(name="indicesFielddataCacheSize")
    private @Nullable Output<String> indicesFielddataCacheSize;

    public Optional<Output<String>> indicesFielddataCacheSize() {
        return Optional.ofNullable(this.indicesFielddataCacheSize);
    }

    @Import(name="indicesMemoryIndexBufferSize")
    private @Nullable Output<String> indicesMemoryIndexBufferSize;

    public Optional<Output<String>> indicesMemoryIndexBufferSize() {
        return Optional.ofNullable(this.indicesMemoryIndexBufferSize);
    }

    @Import(name="indicesQueriesCacheSize")
    private @Nullable Output<String> indicesQueriesCacheSize;

    public Optional<Output<String>> indicesQueriesCacheSize() {
        return Optional.ofNullable(this.indicesQueriesCacheSize);
    }

    @Import(name="indicesQueryBoolMaxClauseCount")
    private @Nullable Output<String> indicesQueryBoolMaxClauseCount;

    public Optional<Output<String>> indicesQueryBoolMaxClauseCount() {
        return Optional.ofNullable(this.indicesQueryBoolMaxClauseCount);
    }

    @Import(name="indicesRecoveryMaxBytesPerSec")
    private @Nullable Output<String> indicesRecoveryMaxBytesPerSec;

    public Optional<Output<String>> indicesRecoveryMaxBytesPerSec() {
        return Optional.ofNullable(this.indicesRecoveryMaxBytesPerSec);
    }

    @Import(name="indicesRecoveryMaxConcurrentFileChunks")
    private @Nullable Output<String> indicesRecoveryMaxConcurrentFileChunks;

    public Optional<Output<String>> indicesRecoveryMaxConcurrentFileChunks() {
        return Optional.ofNullable(this.indicesRecoveryMaxConcurrentFileChunks);
    }

    @Import(name="overrideMainResponseVersion")
    private @Nullable Output<String> overrideMainResponseVersion;

    public Optional<Output<String>> overrideMainResponseVersion() {
        return Optional.ofNullable(this.overrideMainResponseVersion);
    }

    @Import(name="reindexRemoteWhitelists")
    private @Nullable Output<List<String>> reindexRemoteWhitelists;

    public Optional<Output<List<String>>> reindexRemoteWhitelists() {
        return Optional.ofNullable(this.reindexRemoteWhitelists);
    }

    @Import(name="scriptMaxCompilationsRate")
    private @Nullable Output<String> scriptMaxCompilationsRate;

    public Optional<Output<String>> scriptMaxCompilationsRate() {
        return Optional.ofNullable(this.scriptMaxCompilationsRate);
    }

    @Import(name="searchMaxBuckets")
    private @Nullable Output<String> searchMaxBuckets;

    public Optional<Output<String>> searchMaxBuckets() {
        return Optional.ofNullable(this.searchMaxBuckets);
    }

    @Import(name="threadPoolAnalyzeQueueSize")
    private @Nullable Output<String> threadPoolAnalyzeQueueSize;

    public Optional<Output<String>> threadPoolAnalyzeQueueSize() {
        return Optional.ofNullable(this.threadPoolAnalyzeQueueSize);
    }

    @Import(name="threadPoolAnalyzeSize")
    private @Nullable Output<String> threadPoolAnalyzeSize;

    public Optional<Output<String>> threadPoolAnalyzeSize() {
        return Optional.ofNullable(this.threadPoolAnalyzeSize);
    }

    @Import(name="threadPoolForceMergeSize")
    private @Nullable Output<String> threadPoolForceMergeSize;

    public Optional<Output<String>> threadPoolForceMergeSize() {
        return Optional.ofNullable(this.threadPoolForceMergeSize);
    }

    @Import(name="threadPoolGetQueueSize")
    private @Nullable Output<String> threadPoolGetQueueSize;

    public Optional<Output<String>> threadPoolGetQueueSize() {
        return Optional.ofNullable(this.threadPoolGetQueueSize);
    }

    @Import(name="threadPoolGetSize")
    private @Nullable Output<String> threadPoolGetSize;

    public Optional<Output<String>> threadPoolGetSize() {
        return Optional.ofNullable(this.threadPoolGetSize);
    }

    @Import(name="threadPoolSearchQueueSize")
    private @Nullable Output<String> threadPoolSearchQueueSize;

    public Optional<Output<String>> threadPoolSearchQueueSize() {
        return Optional.ofNullable(this.threadPoolSearchQueueSize);
    }

    @Import(name="threadPoolSearchSize")
    private @Nullable Output<String> threadPoolSearchSize;

    public Optional<Output<String>> threadPoolSearchSize() {
        return Optional.ofNullable(this.threadPoolSearchSize);
    }

    @Import(name="threadPoolSearchThrottledQueueSize")
    private @Nullable Output<String> threadPoolSearchThrottledQueueSize;

    public Optional<Output<String>> threadPoolSearchThrottledQueueSize() {
        return Optional.ofNullable(this.threadPoolSearchThrottledQueueSize);
    }

    @Import(name="threadPoolSearchThrottledSize")
    private @Nullable Output<String> threadPoolSearchThrottledSize;

    public Optional<Output<String>> threadPoolSearchThrottledSize() {
        return Optional.ofNullable(this.threadPoolSearchThrottledSize);
    }

    @Import(name="threadPoolWriteQueueSize")
    private @Nullable Output<String> threadPoolWriteQueueSize;

    public Optional<Output<String>> threadPoolWriteQueueSize() {
        return Optional.ofNullable(this.threadPoolWriteQueueSize);
    }

    @Import(name="threadPoolWriteSize")
    private @Nullable Output<String> threadPoolWriteSize;

    public Optional<Output<String>> threadPoolWriteSize() {
        return Optional.ofNullable(this.threadPoolWriteSize);
    }

    private OpenSearchOpensearchUserConfigOpensearchArgs() {}

    private OpenSearchOpensearchUserConfigOpensearchArgs(OpenSearchOpensearchUserConfigOpensearchArgs $) {
        this.actionAutoCreateIndexEnabled = $.actionAutoCreateIndexEnabled;
        this.actionDestructiveRequiresName = $.actionDestructiveRequiresName;
        this.clusterMaxShardsPerNode = $.clusterMaxShardsPerNode;
        this.clusterRoutingAllocationNodeConcurrentRecoveries = $.clusterRoutingAllocationNodeConcurrentRecoveries;
        this.emailSenderName = $.emailSenderName;
        this.emailSenderPassword = $.emailSenderPassword;
        this.emailSenderUsername = $.emailSenderUsername;
        this.httpMaxContentLength = $.httpMaxContentLength;
        this.httpMaxHeaderSize = $.httpMaxHeaderSize;
        this.httpMaxInitialLineLength = $.httpMaxInitialLineLength;
        this.indicesFielddataCacheSize = $.indicesFielddataCacheSize;
        this.indicesMemoryIndexBufferSize = $.indicesMemoryIndexBufferSize;
        this.indicesQueriesCacheSize = $.indicesQueriesCacheSize;
        this.indicesQueryBoolMaxClauseCount = $.indicesQueryBoolMaxClauseCount;
        this.indicesRecoveryMaxBytesPerSec = $.indicesRecoveryMaxBytesPerSec;
        this.indicesRecoveryMaxConcurrentFileChunks = $.indicesRecoveryMaxConcurrentFileChunks;
        this.overrideMainResponseVersion = $.overrideMainResponseVersion;
        this.reindexRemoteWhitelists = $.reindexRemoteWhitelists;
        this.scriptMaxCompilationsRate = $.scriptMaxCompilationsRate;
        this.searchMaxBuckets = $.searchMaxBuckets;
        this.threadPoolAnalyzeQueueSize = $.threadPoolAnalyzeQueueSize;
        this.threadPoolAnalyzeSize = $.threadPoolAnalyzeSize;
        this.threadPoolForceMergeSize = $.threadPoolForceMergeSize;
        this.threadPoolGetQueueSize = $.threadPoolGetQueueSize;
        this.threadPoolGetSize = $.threadPoolGetSize;
        this.threadPoolSearchQueueSize = $.threadPoolSearchQueueSize;
        this.threadPoolSearchSize = $.threadPoolSearchSize;
        this.threadPoolSearchThrottledQueueSize = $.threadPoolSearchThrottledQueueSize;
        this.threadPoolSearchThrottledSize = $.threadPoolSearchThrottledSize;
        this.threadPoolWriteQueueSize = $.threadPoolWriteQueueSize;
        this.threadPoolWriteSize = $.threadPoolWriteSize;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OpenSearchOpensearchUserConfigOpensearchArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OpenSearchOpensearchUserConfigOpensearchArgs $;

        public Builder() {
            $ = new OpenSearchOpensearchUserConfigOpensearchArgs();
        }

        public Builder(OpenSearchOpensearchUserConfigOpensearchArgs defaults) {
            $ = new OpenSearchOpensearchUserConfigOpensearchArgs(Objects.requireNonNull(defaults));
        }

        public Builder actionAutoCreateIndexEnabled(@Nullable Output<String> actionAutoCreateIndexEnabled) {
            $.actionAutoCreateIndexEnabled = actionAutoCreateIndexEnabled;
            return this;
        }

        public Builder actionAutoCreateIndexEnabled(String actionAutoCreateIndexEnabled) {
            return actionAutoCreateIndexEnabled(Output.of(actionAutoCreateIndexEnabled));
        }

        public Builder actionDestructiveRequiresName(@Nullable Output<String> actionDestructiveRequiresName) {
            $.actionDestructiveRequiresName = actionDestructiveRequiresName;
            return this;
        }

        public Builder actionDestructiveRequiresName(String actionDestructiveRequiresName) {
            return actionDestructiveRequiresName(Output.of(actionDestructiveRequiresName));
        }

        public Builder clusterMaxShardsPerNode(@Nullable Output<String> clusterMaxShardsPerNode) {
            $.clusterMaxShardsPerNode = clusterMaxShardsPerNode;
            return this;
        }

        public Builder clusterMaxShardsPerNode(String clusterMaxShardsPerNode) {
            return clusterMaxShardsPerNode(Output.of(clusterMaxShardsPerNode));
        }

        public Builder clusterRoutingAllocationNodeConcurrentRecoveries(@Nullable Output<String> clusterRoutingAllocationNodeConcurrentRecoveries) {
            $.clusterRoutingAllocationNodeConcurrentRecoveries = clusterRoutingAllocationNodeConcurrentRecoveries;
            return this;
        }

        public Builder clusterRoutingAllocationNodeConcurrentRecoveries(String clusterRoutingAllocationNodeConcurrentRecoveries) {
            return clusterRoutingAllocationNodeConcurrentRecoveries(Output.of(clusterRoutingAllocationNodeConcurrentRecoveries));
        }

        public Builder emailSenderName(@Nullable Output<String> emailSenderName) {
            $.emailSenderName = emailSenderName;
            return this;
        }

        public Builder emailSenderName(String emailSenderName) {
            return emailSenderName(Output.of(emailSenderName));
        }

        public Builder emailSenderPassword(@Nullable Output<String> emailSenderPassword) {
            $.emailSenderPassword = emailSenderPassword;
            return this;
        }

        public Builder emailSenderPassword(String emailSenderPassword) {
            return emailSenderPassword(Output.of(emailSenderPassword));
        }

        public Builder emailSenderUsername(@Nullable Output<String> emailSenderUsername) {
            $.emailSenderUsername = emailSenderUsername;
            return this;
        }

        public Builder emailSenderUsername(String emailSenderUsername) {
            return emailSenderUsername(Output.of(emailSenderUsername));
        }

        public Builder httpMaxContentLength(@Nullable Output<String> httpMaxContentLength) {
            $.httpMaxContentLength = httpMaxContentLength;
            return this;
        }

        public Builder httpMaxContentLength(String httpMaxContentLength) {
            return httpMaxContentLength(Output.of(httpMaxContentLength));
        }

        public Builder httpMaxHeaderSize(@Nullable Output<String> httpMaxHeaderSize) {
            $.httpMaxHeaderSize = httpMaxHeaderSize;
            return this;
        }

        public Builder httpMaxHeaderSize(String httpMaxHeaderSize) {
            return httpMaxHeaderSize(Output.of(httpMaxHeaderSize));
        }

        public Builder httpMaxInitialLineLength(@Nullable Output<String> httpMaxInitialLineLength) {
            $.httpMaxInitialLineLength = httpMaxInitialLineLength;
            return this;
        }

        public Builder httpMaxInitialLineLength(String httpMaxInitialLineLength) {
            return httpMaxInitialLineLength(Output.of(httpMaxInitialLineLength));
        }

        public Builder indicesFielddataCacheSize(@Nullable Output<String> indicesFielddataCacheSize) {
            $.indicesFielddataCacheSize = indicesFielddataCacheSize;
            return this;
        }

        public Builder indicesFielddataCacheSize(String indicesFielddataCacheSize) {
            return indicesFielddataCacheSize(Output.of(indicesFielddataCacheSize));
        }

        public Builder indicesMemoryIndexBufferSize(@Nullable Output<String> indicesMemoryIndexBufferSize) {
            $.indicesMemoryIndexBufferSize = indicesMemoryIndexBufferSize;
            return this;
        }

        public Builder indicesMemoryIndexBufferSize(String indicesMemoryIndexBufferSize) {
            return indicesMemoryIndexBufferSize(Output.of(indicesMemoryIndexBufferSize));
        }

        public Builder indicesQueriesCacheSize(@Nullable Output<String> indicesQueriesCacheSize) {
            $.indicesQueriesCacheSize = indicesQueriesCacheSize;
            return this;
        }

        public Builder indicesQueriesCacheSize(String indicesQueriesCacheSize) {
            return indicesQueriesCacheSize(Output.of(indicesQueriesCacheSize));
        }

        public Builder indicesQueryBoolMaxClauseCount(@Nullable Output<String> indicesQueryBoolMaxClauseCount) {
            $.indicesQueryBoolMaxClauseCount = indicesQueryBoolMaxClauseCount;
            return this;
        }

        public Builder indicesQueryBoolMaxClauseCount(String indicesQueryBoolMaxClauseCount) {
            return indicesQueryBoolMaxClauseCount(Output.of(indicesQueryBoolMaxClauseCount));
        }

        public Builder indicesRecoveryMaxBytesPerSec(@Nullable Output<String> indicesRecoveryMaxBytesPerSec) {
            $.indicesRecoveryMaxBytesPerSec = indicesRecoveryMaxBytesPerSec;
            return this;
        }

        public Builder indicesRecoveryMaxBytesPerSec(String indicesRecoveryMaxBytesPerSec) {
            return indicesRecoveryMaxBytesPerSec(Output.of(indicesRecoveryMaxBytesPerSec));
        }

        public Builder indicesRecoveryMaxConcurrentFileChunks(@Nullable Output<String> indicesRecoveryMaxConcurrentFileChunks) {
            $.indicesRecoveryMaxConcurrentFileChunks = indicesRecoveryMaxConcurrentFileChunks;
            return this;
        }

        public Builder indicesRecoveryMaxConcurrentFileChunks(String indicesRecoveryMaxConcurrentFileChunks) {
            return indicesRecoveryMaxConcurrentFileChunks(Output.of(indicesRecoveryMaxConcurrentFileChunks));
        }

        public Builder overrideMainResponseVersion(@Nullable Output<String> overrideMainResponseVersion) {
            $.overrideMainResponseVersion = overrideMainResponseVersion;
            return this;
        }

        public Builder overrideMainResponseVersion(String overrideMainResponseVersion) {
            return overrideMainResponseVersion(Output.of(overrideMainResponseVersion));
        }

        public Builder reindexRemoteWhitelists(@Nullable Output<List<String>> reindexRemoteWhitelists) {
            $.reindexRemoteWhitelists = reindexRemoteWhitelists;
            return this;
        }

        public Builder reindexRemoteWhitelists(List<String> reindexRemoteWhitelists) {
            return reindexRemoteWhitelists(Output.of(reindexRemoteWhitelists));
        }

        public Builder reindexRemoteWhitelists(String... reindexRemoteWhitelists) {
            return reindexRemoteWhitelists(List.of(reindexRemoteWhitelists));
        }

        public Builder scriptMaxCompilationsRate(@Nullable Output<String> scriptMaxCompilationsRate) {
            $.scriptMaxCompilationsRate = scriptMaxCompilationsRate;
            return this;
        }

        public Builder scriptMaxCompilationsRate(String scriptMaxCompilationsRate) {
            return scriptMaxCompilationsRate(Output.of(scriptMaxCompilationsRate));
        }

        public Builder searchMaxBuckets(@Nullable Output<String> searchMaxBuckets) {
            $.searchMaxBuckets = searchMaxBuckets;
            return this;
        }

        public Builder searchMaxBuckets(String searchMaxBuckets) {
            return searchMaxBuckets(Output.of(searchMaxBuckets));
        }

        public Builder threadPoolAnalyzeQueueSize(@Nullable Output<String> threadPoolAnalyzeQueueSize) {
            $.threadPoolAnalyzeQueueSize = threadPoolAnalyzeQueueSize;
            return this;
        }

        public Builder threadPoolAnalyzeQueueSize(String threadPoolAnalyzeQueueSize) {
            return threadPoolAnalyzeQueueSize(Output.of(threadPoolAnalyzeQueueSize));
        }

        public Builder threadPoolAnalyzeSize(@Nullable Output<String> threadPoolAnalyzeSize) {
            $.threadPoolAnalyzeSize = threadPoolAnalyzeSize;
            return this;
        }

        public Builder threadPoolAnalyzeSize(String threadPoolAnalyzeSize) {
            return threadPoolAnalyzeSize(Output.of(threadPoolAnalyzeSize));
        }

        public Builder threadPoolForceMergeSize(@Nullable Output<String> threadPoolForceMergeSize) {
            $.threadPoolForceMergeSize = threadPoolForceMergeSize;
            return this;
        }

        public Builder threadPoolForceMergeSize(String threadPoolForceMergeSize) {
            return threadPoolForceMergeSize(Output.of(threadPoolForceMergeSize));
        }

        public Builder threadPoolGetQueueSize(@Nullable Output<String> threadPoolGetQueueSize) {
            $.threadPoolGetQueueSize = threadPoolGetQueueSize;
            return this;
        }

        public Builder threadPoolGetQueueSize(String threadPoolGetQueueSize) {
            return threadPoolGetQueueSize(Output.of(threadPoolGetQueueSize));
        }

        public Builder threadPoolGetSize(@Nullable Output<String> threadPoolGetSize) {
            $.threadPoolGetSize = threadPoolGetSize;
            return this;
        }

        public Builder threadPoolGetSize(String threadPoolGetSize) {
            return threadPoolGetSize(Output.of(threadPoolGetSize));
        }

        public Builder threadPoolSearchQueueSize(@Nullable Output<String> threadPoolSearchQueueSize) {
            $.threadPoolSearchQueueSize = threadPoolSearchQueueSize;
            return this;
        }

        public Builder threadPoolSearchQueueSize(String threadPoolSearchQueueSize) {
            return threadPoolSearchQueueSize(Output.of(threadPoolSearchQueueSize));
        }

        public Builder threadPoolSearchSize(@Nullable Output<String> threadPoolSearchSize) {
            $.threadPoolSearchSize = threadPoolSearchSize;
            return this;
        }

        public Builder threadPoolSearchSize(String threadPoolSearchSize) {
            return threadPoolSearchSize(Output.of(threadPoolSearchSize));
        }

        public Builder threadPoolSearchThrottledQueueSize(@Nullable Output<String> threadPoolSearchThrottledQueueSize) {
            $.threadPoolSearchThrottledQueueSize = threadPoolSearchThrottledQueueSize;
            return this;
        }

        public Builder threadPoolSearchThrottledQueueSize(String threadPoolSearchThrottledQueueSize) {
            return threadPoolSearchThrottledQueueSize(Output.of(threadPoolSearchThrottledQueueSize));
        }

        public Builder threadPoolSearchThrottledSize(@Nullable Output<String> threadPoolSearchThrottledSize) {
            $.threadPoolSearchThrottledSize = threadPoolSearchThrottledSize;
            return this;
        }

        public Builder threadPoolSearchThrottledSize(String threadPoolSearchThrottledSize) {
            return threadPoolSearchThrottledSize(Output.of(threadPoolSearchThrottledSize));
        }

        public Builder threadPoolWriteQueueSize(@Nullable Output<String> threadPoolWriteQueueSize) {
            $.threadPoolWriteQueueSize = threadPoolWriteQueueSize;
            return this;
        }

        public Builder threadPoolWriteQueueSize(String threadPoolWriteQueueSize) {
            return threadPoolWriteQueueSize(Output.of(threadPoolWriteQueueSize));
        }

        public Builder threadPoolWriteSize(@Nullable Output<String> threadPoolWriteSize) {
            $.threadPoolWriteSize = threadPoolWriteSize;
            return this;
        }

        public Builder threadPoolWriteSize(String threadPoolWriteSize) {
            return threadPoolWriteSize(Output.of(threadPoolWriteSize));
        }

        public OpenSearchOpensearchUserConfigOpensearchArgs build() {
            return $;
        }
    }

}