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
    public sealed class GetServicePgUserConfigPgResult
    {
        public readonly string? AutovacuumAnalyzeScaleFactor;
        public readonly string? AutovacuumAnalyzeThreshold;
        public readonly string? AutovacuumFreezeMaxAge;
        public readonly string? AutovacuumMaxWorkers;
        public readonly string? AutovacuumNaptime;
        public readonly string? AutovacuumVacuumCostDelay;
        public readonly string? AutovacuumVacuumCostLimit;
        public readonly string? AutovacuumVacuumScaleFactor;
        public readonly string? AutovacuumVacuumThreshold;
        public readonly string? DeadlockTimeout;
        public readonly string? IdleInTransactionSessionTimeout;
        public readonly string? Jit;
        public readonly string? LogAutovacuumMinDuration;
        public readonly string? LogErrorVerbosity;
        public readonly string? LogLinePrefix;
        public readonly string? LogMinDurationStatement;
        public readonly string? MaxFilesPerProcess;
        public readonly string? MaxLocksPerTransaction;
        public readonly string? MaxLogicalReplicationWorkers;
        public readonly string? MaxParallelWorkers;
        public readonly string? MaxParallelWorkersPerGather;
        public readonly string? MaxPredLocksPerTransaction;
        public readonly string? MaxPreparedTransactions;
        public readonly string? MaxReplicationSlots;
        public readonly string? MaxStackDepth;
        public readonly string? MaxStandbyArchiveDelay;
        public readonly string? MaxStandbyStreamingDelay;
        public readonly string? MaxWalSenders;
        public readonly string? MaxWorkerProcesses;
        public readonly string? PgPartmanBgwInterval;
        public readonly string? PgPartmanBgwRole;
        public readonly string? PgStatStatementsTrack;
        public readonly string? TempFileLimit;
        public readonly string? Timezone;
        public readonly string? TrackActivityQuerySize;
        public readonly string? TrackCommitTimestamp;
        public readonly string? TrackFunctions;
        public readonly string? TrackIoTiming;
        public readonly string? WalSenderTimeout;
        public readonly string? WalWriterDelay;

        [OutputConstructor]
        private GetServicePgUserConfigPgResult(
            string? autovacuumAnalyzeScaleFactor,

            string? autovacuumAnalyzeThreshold,

            string? autovacuumFreezeMaxAge,

            string? autovacuumMaxWorkers,

            string? autovacuumNaptime,

            string? autovacuumVacuumCostDelay,

            string? autovacuumVacuumCostLimit,

            string? autovacuumVacuumScaleFactor,

            string? autovacuumVacuumThreshold,

            string? deadlockTimeout,

            string? idleInTransactionSessionTimeout,

            string? jit,

            string? logAutovacuumMinDuration,

            string? logErrorVerbosity,

            string? logLinePrefix,

            string? logMinDurationStatement,

            string? maxFilesPerProcess,

            string? maxLocksPerTransaction,

            string? maxLogicalReplicationWorkers,

            string? maxParallelWorkers,

            string? maxParallelWorkersPerGather,

            string? maxPredLocksPerTransaction,

            string? maxPreparedTransactions,

            string? maxReplicationSlots,

            string? maxStackDepth,

            string? maxStandbyArchiveDelay,

            string? maxStandbyStreamingDelay,

            string? maxWalSenders,

            string? maxWorkerProcesses,

            string? pgPartmanBgwInterval,

            string? pgPartmanBgwRole,

            string? pgStatStatementsTrack,

            string? tempFileLimit,

            string? timezone,

            string? trackActivityQuerySize,

            string? trackCommitTimestamp,

            string? trackFunctions,

            string? trackIoTiming,

            string? walSenderTimeout,

            string? walWriterDelay)
        {
            AutovacuumAnalyzeScaleFactor = autovacuumAnalyzeScaleFactor;
            AutovacuumAnalyzeThreshold = autovacuumAnalyzeThreshold;
            AutovacuumFreezeMaxAge = autovacuumFreezeMaxAge;
            AutovacuumMaxWorkers = autovacuumMaxWorkers;
            AutovacuumNaptime = autovacuumNaptime;
            AutovacuumVacuumCostDelay = autovacuumVacuumCostDelay;
            AutovacuumVacuumCostLimit = autovacuumVacuumCostLimit;
            AutovacuumVacuumScaleFactor = autovacuumVacuumScaleFactor;
            AutovacuumVacuumThreshold = autovacuumVacuumThreshold;
            DeadlockTimeout = deadlockTimeout;
            IdleInTransactionSessionTimeout = idleInTransactionSessionTimeout;
            Jit = jit;
            LogAutovacuumMinDuration = logAutovacuumMinDuration;
            LogErrorVerbosity = logErrorVerbosity;
            LogLinePrefix = logLinePrefix;
            LogMinDurationStatement = logMinDurationStatement;
            MaxFilesPerProcess = maxFilesPerProcess;
            MaxLocksPerTransaction = maxLocksPerTransaction;
            MaxLogicalReplicationWorkers = maxLogicalReplicationWorkers;
            MaxParallelWorkers = maxParallelWorkers;
            MaxParallelWorkersPerGather = maxParallelWorkersPerGather;
            MaxPredLocksPerTransaction = maxPredLocksPerTransaction;
            MaxPreparedTransactions = maxPreparedTransactions;
            MaxReplicationSlots = maxReplicationSlots;
            MaxStackDepth = maxStackDepth;
            MaxStandbyArchiveDelay = maxStandbyArchiveDelay;
            MaxStandbyStreamingDelay = maxStandbyStreamingDelay;
            MaxWalSenders = maxWalSenders;
            MaxWorkerProcesses = maxWorkerProcesses;
            PgPartmanBgwInterval = pgPartmanBgwInterval;
            PgPartmanBgwRole = pgPartmanBgwRole;
            PgStatStatementsTrack = pgStatStatementsTrack;
            TempFileLimit = tempFileLimit;
            Timezone = timezone;
            TrackActivityQuerySize = trackActivityQuerySize;
            TrackCommitTimestamp = trackCommitTimestamp;
            TrackFunctions = trackFunctions;
            TrackIoTiming = trackIoTiming;
            WalSenderTimeout = walSenderTimeout;
            WalWriterDelay = walWriterDelay;
        }
    }
}
