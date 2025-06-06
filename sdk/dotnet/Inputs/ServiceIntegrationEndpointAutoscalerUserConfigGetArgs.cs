// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aiven.Inputs
{

    public sealed class ServiceIntegrationEndpointAutoscalerUserConfigGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("autoscalings", required: true)]
        private InputList<Inputs.ServiceIntegrationEndpointAutoscalerUserConfigAutoscalingGetArgs>? _autoscalings;

        /// <summary>
        /// Configure autoscaling thresholds for a service
        /// </summary>
        public InputList<Inputs.ServiceIntegrationEndpointAutoscalerUserConfigAutoscalingGetArgs> Autoscalings
        {
            get => _autoscalings ?? (_autoscalings = new InputList<Inputs.ServiceIntegrationEndpointAutoscalerUserConfigAutoscalingGetArgs>());
            set => _autoscalings = value;
        }

        public ServiceIntegrationEndpointAutoscalerUserConfigGetArgs()
        {
        }
        public static new ServiceIntegrationEndpointAutoscalerUserConfigGetArgs Empty => new ServiceIntegrationEndpointAutoscalerUserConfigGetArgs();
    }
}
