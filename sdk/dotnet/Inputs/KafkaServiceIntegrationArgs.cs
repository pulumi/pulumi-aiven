// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aiven.Inputs
{

    public sealed class KafkaServiceIntegrationArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Type of the service integration
        /// </summary>
        [Input("integrationType", required: true)]
        public Input<string> IntegrationType { get; set; } = null!;

        /// <summary>
        /// Name of the source service
        /// </summary>
        [Input("sourceServiceName", required: true)]
        public Input<string> SourceServiceName { get; set; } = null!;

        public KafkaServiceIntegrationArgs()
        {
        }
        public static new KafkaServiceIntegrationArgs Empty => new KafkaServiceIntegrationArgs();
    }
}
