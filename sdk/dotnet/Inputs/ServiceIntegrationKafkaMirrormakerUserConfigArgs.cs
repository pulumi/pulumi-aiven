// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aiven.Inputs
{

    public sealed class ServiceIntegrationKafkaMirrormakerUserConfigArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The alias under which the Kafka cluster is known to MirrorMaker. Can contain the following symbols: ASCII alphanumerics, `.`, `_`, and `-`. Example: `kafka-abc`.
        /// </summary>
        [Input("clusterAlias")]
        public Input<string>? ClusterAlias { get; set; }

        /// <summary>
        /// Kafka MirrorMaker configuration values
        /// </summary>
        [Input("kafkaMirrormaker")]
        public Input<Inputs.ServiceIntegrationKafkaMirrormakerUserConfigKafkaMirrormakerArgs>? KafkaMirrormaker { get; set; }

        public ServiceIntegrationKafkaMirrormakerUserConfigArgs()
        {
        }
        public static new ServiceIntegrationKafkaMirrormakerUserConfigArgs Empty => new ServiceIntegrationKafkaMirrormakerUserConfigArgs();
    }
}
