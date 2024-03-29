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
    public sealed class ServiceIntegrationEndpointDatadogUserConfig
    {
        /// <summary>
        /// Datadog API key.
        /// </summary>
        public readonly string DatadogApiKey;
        /// <summary>
        /// Custom tags provided by user
        /// </summary>
        public readonly ImmutableArray<Outputs.ServiceIntegrationEndpointDatadogUserConfigDatadogTag> DatadogTags;
        /// <summary>
        /// Disable consumer group metrics.
        /// </summary>
        public readonly bool? DisableConsumerStats;
        /// <summary>
        /// Number of separate instances to fetch kafka consumer statistics with.
        /// </summary>
        public readonly int? KafkaConsumerCheckInstances;
        /// <summary>
        /// Number of seconds that datadog will wait to get consumer statistics from brokers.
        /// </summary>
        public readonly int? KafkaConsumerStatsTimeout;
        /// <summary>
        /// Maximum number of partition contexts to send.
        /// </summary>
        public readonly int? MaxPartitionContexts;
        /// <summary>
        /// Datadog intake site. Defaults to datadoghq.com.
        /// </summary>
        public readonly string? Site;

        [OutputConstructor]
        private ServiceIntegrationEndpointDatadogUserConfig(
            string datadogApiKey,

            ImmutableArray<Outputs.ServiceIntegrationEndpointDatadogUserConfigDatadogTag> datadogTags,

            bool? disableConsumerStats,

            int? kafkaConsumerCheckInstances,

            int? kafkaConsumerStatsTimeout,

            int? maxPartitionContexts,

            string? site)
        {
            DatadogApiKey = datadogApiKey;
            DatadogTags = datadogTags;
            DisableConsumerStats = disableConsumerStats;
            KafkaConsumerCheckInstances = kafkaConsumerCheckInstances;
            KafkaConsumerStatsTimeout = kafkaConsumerStatsTimeout;
            MaxPartitionContexts = maxPartitionContexts;
            Site = site;
        }
    }
}
