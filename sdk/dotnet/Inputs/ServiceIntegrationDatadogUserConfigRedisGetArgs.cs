// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aiven.Inputs
{

    public sealed class ServiceIntegrationDatadogUserConfigRedisGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Enable command_stats option in the agent's configuration. The default value is `false`.
        /// </summary>
        [Input("commandStatsEnabled")]
        public Input<bool>? CommandStatsEnabled { get; set; }

        public ServiceIntegrationDatadogUserConfigRedisGetArgs()
        {
        }
        public static new ServiceIntegrationDatadogUserConfigRedisGetArgs Empty => new ServiceIntegrationDatadogUserConfigRedisGetArgs();
    }
}