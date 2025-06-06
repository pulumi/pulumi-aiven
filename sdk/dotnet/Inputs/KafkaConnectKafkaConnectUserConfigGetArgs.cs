// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aiven.Inputs
{

    public sealed class KafkaConnectKafkaConnectUserConfigGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Additional Cloud Regions for Backup Replication.
        /// </summary>
        [Input("additionalBackupRegions")]
        public Input<string>? AdditionalBackupRegions { get; set; }

        [Input("ipFilterObjects")]
        private InputList<Inputs.KafkaConnectKafkaConnectUserConfigIpFilterObjectGetArgs>? _ipFilterObjects;

        /// <summary>
        /// Allow incoming connections from CIDR address block, e.g. `10.20.0.0/16`
        /// </summary>
        public InputList<Inputs.KafkaConnectKafkaConnectUserConfigIpFilterObjectGetArgs> IpFilterObjects
        {
            get => _ipFilterObjects ?? (_ipFilterObjects = new InputList<Inputs.KafkaConnectKafkaConnectUserConfigIpFilterObjectGetArgs>());
            set => _ipFilterObjects = value;
        }

        [Input("ipFilterStrings")]
        private InputList<string>? _ipFilterStrings;

        /// <summary>
        /// Allow incoming connections from CIDR address block, e.g. `10.20.0.0/16`.
        /// </summary>
        public InputList<string> IpFilterStrings
        {
            get => _ipFilterStrings ?? (_ipFilterStrings = new InputList<string>());
            set => _ipFilterStrings = value;
        }

        [Input("ipFilters")]
        private InputList<string>? _ipFilters;

        /// <summary>
        /// Allow incoming connections from CIDR address block, e.g. `10.20.0.0/16`.
        /// </summary>
        [Obsolete(@"Deprecated. Use `ip_filter_string` instead.")]
        public InputList<string> IpFilters
        {
            get => _ipFilters ?? (_ipFilters = new InputList<string>());
            set => _ipFilters = value;
        }

        /// <summary>
        /// Kafka Connect configuration values
        /// </summary>
        [Input("kafkaConnect")]
        public Input<Inputs.KafkaConnectKafkaConnectUserConfigKafkaConnectGetArgs>? KafkaConnect { get; set; }

        [Input("pluginVersions")]
        private InputList<Inputs.KafkaConnectKafkaConnectUserConfigPluginVersionGetArgs>? _pluginVersions;

        /// <summary>
        /// The plugin selected by the user
        /// </summary>
        public InputList<Inputs.KafkaConnectKafkaConnectUserConfigPluginVersionGetArgs> PluginVersions
        {
            get => _pluginVersions ?? (_pluginVersions = new InputList<Inputs.KafkaConnectKafkaConnectUserConfigPluginVersionGetArgs>());
            set => _pluginVersions = value;
        }

        /// <summary>
        /// Allow access to selected service ports from private networks
        /// </summary>
        [Input("privateAccess")]
        public Input<Inputs.KafkaConnectKafkaConnectUserConfigPrivateAccessGetArgs>? PrivateAccess { get; set; }

        /// <summary>
        /// Allow access to selected service components through Privatelink
        /// </summary>
        [Input("privatelinkAccess")]
        public Input<Inputs.KafkaConnectKafkaConnectUserConfigPrivatelinkAccessGetArgs>? PrivatelinkAccess { get; set; }

        /// <summary>
        /// Allow access to selected service ports from the public Internet
        /// </summary>
        [Input("publicAccess")]
        public Input<Inputs.KafkaConnectKafkaConnectUserConfigPublicAccessGetArgs>? PublicAccess { get; set; }

        [Input("secretProviders")]
        private InputList<Inputs.KafkaConnectKafkaConnectUserConfigSecretProviderGetArgs>? _secretProviders;
        public InputList<Inputs.KafkaConnectKafkaConnectUserConfigSecretProviderGetArgs> SecretProviders
        {
            get => _secretProviders ?? (_secretProviders = new InputList<Inputs.KafkaConnectKafkaConnectUserConfigSecretProviderGetArgs>());
            set => _secretProviders = value;
        }

        /// <summary>
        /// Store logs for the service so that they are available in the HTTP API and console.
        /// </summary>
        [Input("serviceLog")]
        public Input<bool>? ServiceLog { get; set; }

        /// <summary>
        /// Use static public IP addresses.
        /// </summary>
        [Input("staticIps")]
        public Input<bool>? StaticIps { get; set; }

        public KafkaConnectKafkaConnectUserConfigGetArgs()
        {
        }
        public static new KafkaConnectKafkaConnectUserConfigGetArgs Empty => new KafkaConnectKafkaConnectUserConfigGetArgs();
    }
}
