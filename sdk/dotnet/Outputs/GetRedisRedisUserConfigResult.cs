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
    public sealed class GetRedisRedisUserConfigResult
    {
        /// <summary>
        /// Allow incoming connections from CIDR address block, e.g. `10.20.0.0/16`
        /// </summary>
        public readonly ImmutableArray<string> IpFilters;
        /// <summary>
        /// Migrate data from existing server
        /// </summary>
        public readonly Outputs.GetRedisRedisUserConfigMigrationResult? Migration;
        /// <summary>
        /// Allow access to selected service ports from private networks
        /// </summary>
        public readonly Outputs.GetRedisRedisUserConfigPrivateAccessResult? PrivateAccess;
        /// <summary>
        /// Allow access to selected service components through Privatelink
        /// </summary>
        public readonly Outputs.GetRedisRedisUserConfigPrivatelinkAccessResult? PrivatelinkAccess;
        /// <summary>
        /// Name of another project to fork a service from. This has
        /// effect only when a new service is being created.
        /// </summary>
        public readonly string? ProjectToForkFrom;
        /// <summary>
        /// Allow access to selected service ports from the public Internet
        /// </summary>
        public readonly Outputs.GetRedisRedisUserConfigPublicAccessResult? PublicAccess;
        /// <summary>
        /// Name of the basebackup to restore in forked service
        /// </summary>
        public readonly string? RecoveryBasebackupName;
        /// <summary>
        /// Redis IO thread count
        /// * `redis_lfu_decay_time"` - LFU maxmemory-policy counter decay time in minutes
        /// </summary>
        public readonly string? RedisIoThreads;
        public readonly string? RedisLfuDecayTime;
        /// <summary>
        /// Counter logarithm factor for volatile-lfu and allkeys-lfu 
        /// maxmemory-policies
        /// </summary>
        public readonly string? RedisLfuLogFactor;
        /// <summary>
        /// Redis maxmemory-policy
        /// </summary>
        public readonly string? RedisMaxmemoryPolicy;
        /// <summary>
        /// Set notify-keyspace-events option
        /// </summary>
        public readonly string? RedisNotifyKeyspaceEvents;
        /// <summary>
        /// Require SSL to access Redis
        /// </summary>
        public readonly string? RedisSsl;
        /// <summary>
        /// Redis idle connection timeout
        /// * `service_to_fork_from"` - Name of another service to fork from. This has effect only
        /// when a new service is being created.
        /// </summary>
        public readonly string? RedisTimeout;
        public readonly string? ServiceToForkFrom;

        [OutputConstructor]
        private GetRedisRedisUserConfigResult(
            ImmutableArray<string> ipFilters,

            Outputs.GetRedisRedisUserConfigMigrationResult? migration,

            Outputs.GetRedisRedisUserConfigPrivateAccessResult? privateAccess,

            Outputs.GetRedisRedisUserConfigPrivatelinkAccessResult? privatelinkAccess,

            string? projectToForkFrom,

            Outputs.GetRedisRedisUserConfigPublicAccessResult? publicAccess,

            string? recoveryBasebackupName,

            string? redisIoThreads,

            string? redisLfuDecayTime,

            string? redisLfuLogFactor,

            string? redisMaxmemoryPolicy,

            string? redisNotifyKeyspaceEvents,

            string? redisSsl,

            string? redisTimeout,

            string? serviceToForkFrom)
        {
            IpFilters = ipFilters;
            Migration = migration;
            PrivateAccess = privateAccess;
            PrivatelinkAccess = privatelinkAccess;
            ProjectToForkFrom = projectToForkFrom;
            PublicAccess = publicAccess;
            RecoveryBasebackupName = recoveryBasebackupName;
            RedisIoThreads = redisIoThreads;
            RedisLfuDecayTime = redisLfuDecayTime;
            RedisLfuLogFactor = redisLfuLogFactor;
            RedisMaxmemoryPolicy = redisMaxmemoryPolicy;
            RedisNotifyKeyspaceEvents = redisNotifyKeyspaceEvents;
            RedisSsl = redisSsl;
            RedisTimeout = redisTimeout;
            ServiceToForkFrom = serviceToForkFrom;
        }
    }
}
