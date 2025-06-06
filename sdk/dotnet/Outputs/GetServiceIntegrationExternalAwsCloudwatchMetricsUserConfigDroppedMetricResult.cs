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
    public sealed class GetServiceIntegrationExternalAwsCloudwatchMetricsUserConfigDroppedMetricResult
    {
        /// <summary>
        /// Identifier of a value in the metric. Example: `used`.
        /// </summary>
        public readonly string Field;
        /// <summary>
        /// Identifier of the metric. Example: `java.lang:Memory`.
        /// </summary>
        public readonly string Metric;

        [OutputConstructor]
        private GetServiceIntegrationExternalAwsCloudwatchMetricsUserConfigDroppedMetricResult(
            string field,

            string metric)
        {
            Field = field;
            Metric = metric;
        }
    }
}
