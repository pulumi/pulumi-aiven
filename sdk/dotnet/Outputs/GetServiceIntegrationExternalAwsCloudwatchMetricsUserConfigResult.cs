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
    public sealed class GetServiceIntegrationExternalAwsCloudwatchMetricsUserConfigResult
    {
        /// <summary>
        /// Metrics to not send to AWS CloudWatch (takes precedence over extra_metrics)
        /// </summary>
        public readonly ImmutableArray<Outputs.GetServiceIntegrationExternalAwsCloudwatchMetricsUserConfigDroppedMetricResult> DroppedMetrics;
        /// <summary>
        /// Metrics to allow through to AWS CloudWatch (in addition to default metrics)
        /// </summary>
        public readonly ImmutableArray<Outputs.GetServiceIntegrationExternalAwsCloudwatchMetricsUserConfigExtraMetricResult> ExtraMetrics;

        [OutputConstructor]
        private GetServiceIntegrationExternalAwsCloudwatchMetricsUserConfigResult(
            ImmutableArray<Outputs.GetServiceIntegrationExternalAwsCloudwatchMetricsUserConfigDroppedMetricResult> droppedMetrics,

            ImmutableArray<Outputs.GetServiceIntegrationExternalAwsCloudwatchMetricsUserConfigExtraMetricResult> extraMetrics)
        {
            DroppedMetrics = droppedMetrics;
            ExtraMetrics = extraMetrics;
        }
    }
}
