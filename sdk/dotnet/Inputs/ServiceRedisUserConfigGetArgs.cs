// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aiven.Inputs
{

    public sealed class ServiceRedisUserConfigGetArgs : Pulumi.ResourceArgs
    {
        [Input("ipFilters")]
        private InputList<string>? _ipFilters;
        public InputList<string> IpFilters
        {
            get => _ipFilters ?? (_ipFilters = new InputList<string>());
            set => _ipFilters = value;
        }

        [Input("migration")]
        public Input<Inputs.ServiceRedisUserConfigMigrationGetArgs>? Migration { get; set; }

        [Input("privateAccess")]
        public Input<Inputs.ServiceRedisUserConfigPrivateAccessGetArgs>? PrivateAccess { get; set; }

        [Input("privatelinkAccess")]
        public Input<Inputs.ServiceRedisUserConfigPrivatelinkAccessGetArgs>? PrivatelinkAccess { get; set; }

        [Input("projectToForkFrom")]
        public Input<string>? ProjectToForkFrom { get; set; }

        [Input("publicAccess")]
        public Input<Inputs.ServiceRedisUserConfigPublicAccessGetArgs>? PublicAccess { get; set; }

        [Input("recoveryBasebackupName")]
        public Input<string>? RecoveryBasebackupName { get; set; }

        [Input("redisIoThreads")]
        public Input<string>? RedisIoThreads { get; set; }

        [Input("redisLfuDecayTime")]
        public Input<string>? RedisLfuDecayTime { get; set; }

        [Input("redisLfuLogFactor")]
        public Input<string>? RedisLfuLogFactor { get; set; }

        [Input("redisMaxmemoryPolicy")]
        public Input<string>? RedisMaxmemoryPolicy { get; set; }

        [Input("redisNotifyKeyspaceEvents")]
        public Input<string>? RedisNotifyKeyspaceEvents { get; set; }

        [Input("redisSsl")]
        public Input<string>? RedisSsl { get; set; }

        [Input("redisTimeout")]
        public Input<string>? RedisTimeout { get; set; }

        [Input("serviceToForkFrom")]
        public Input<string>? ServiceToForkFrom { get; set; }

        public ServiceRedisUserConfigGetArgs()
        {
        }
    }
}
