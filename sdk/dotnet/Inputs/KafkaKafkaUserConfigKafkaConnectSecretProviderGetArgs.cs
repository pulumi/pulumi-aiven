// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aiven.Inputs
{

    public sealed class KafkaKafkaUserConfigKafkaConnectSecretProviderGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// AWS config for Secret Provider
        /// </summary>
        [Input("aws")]
        public Input<Inputs.KafkaKafkaUserConfigKafkaConnectSecretProviderAwsGetArgs>? Aws { get; set; }

        /// <summary>
        /// Name of the secret provider. Used to reference secrets in connector config.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// Vault Config for Secret Provider
        /// </summary>
        [Input("vault")]
        public Input<Inputs.KafkaKafkaUserConfigKafkaConnectSecretProviderVaultGetArgs>? Vault { get; set; }

        public KafkaKafkaUserConfigKafkaConnectSecretProviderGetArgs()
        {
        }
        public static new KafkaKafkaUserConfigKafkaConnectSecretProviderGetArgs Empty => new KafkaKafkaUserConfigKafkaConnectSecretProviderGetArgs();
    }
}