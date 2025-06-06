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
    public sealed class GetServiceIntegrationEndpointAutoscalerUserConfigAutoscalingResult
    {
        /// <summary>
        /// The maximum total disk size (in gb) to allow autoscaler to scale up to. Example: `300`.
        /// </summary>
        public readonly int CapGb;
        /// <summary>
        /// Enum: `autoscale_disk`. Type of autoscale event.
        /// </summary>
        public readonly string Type;

        [OutputConstructor]
        private GetServiceIntegrationEndpointAutoscalerUserConfigAutoscalingResult(
            int capGb,

            string type)
        {
            CapGb = capGb;
            Type = type;
        }
    }
}
