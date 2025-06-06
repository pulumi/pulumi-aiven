// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aiven.Inputs
{

    public sealed class KafkaKafkaUserConfigKafkaConnectSecretProviderArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// AWS secret provider configuration
        /// </summary>
        [Input("aws")]
        public Input<Inputs.KafkaKafkaUserConfigKafkaConnectSecretProviderAwsArgs>? Aws { get; set; }

        /// <summary>
        /// Name of the secret provider. Used to reference secrets in connector config.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// Vault secret provider configuration
        /// </summary>
        [Input("vault")]
        public Input<Inputs.KafkaKafkaUserConfigKafkaConnectSecretProviderVaultArgs>? Vault { get; set; }

        public KafkaKafkaUserConfigKafkaConnectSecretProviderArgs()
        {
        }
        public static new KafkaKafkaUserConfigKafkaConnectSecretProviderArgs Empty => new KafkaKafkaUserConfigKafkaConnectSecretProviderArgs();
    }
}
