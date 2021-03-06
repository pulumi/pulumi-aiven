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
    public sealed class KafkaKafkaUserConfig
    {
        /// <summary>
        /// Serve the web frontend using a custom CNAME pointing to the Aiven DNS name.
        /// </summary>
        public readonly string? CustomDomain;
        /// <summary>
        /// Allow incoming connections from CIDR address block, e.g. '10.20.0.0/16'.
        /// </summary>
        public readonly ImmutableArray<string> IpFilters;
        /// <summary>
        /// Enable kafka
        /// </summary>
        public readonly Outputs.KafkaKafkaUserConfigKafka? Kafka;
        /// <summary>
        /// Kafka authentication methods
        /// </summary>
        public readonly Outputs.KafkaKafkaUserConfigKafkaAuthenticationMethods? KafkaAuthenticationMethods;
        /// <summary>
        /// Enable kafka_connect
        /// </summary>
        public readonly string? KafkaConnect;
        /// <summary>
        /// Kafka Connect configuration values
        /// </summary>
        public readonly Outputs.KafkaKafkaUserConfigKafkaConnectConfig? KafkaConnectConfig;
        /// <summary>
        /// Enable kafka_rest
        /// </summary>
        public readonly string? KafkaRest;
        /// <summary>
        /// Kafka-REST configuration
        /// </summary>
        public readonly Outputs.KafkaKafkaUserConfigKafkaRestConfig? KafkaRestConfig;
        /// <summary>
        /// Kafka major version
        /// </summary>
        public readonly string? KafkaVersion;
        /// <summary>
        /// Allow access to selected service ports from private networks
        /// </summary>
        public readonly Outputs.KafkaKafkaUserConfigPrivateAccess? PrivateAccess;
        /// <summary>
        /// Allow access to selected service components through Privatelink
        /// </summary>
        public readonly Outputs.KafkaKafkaUserConfigPrivatelinkAccess? PrivatelinkAccess;
        /// <summary>
        /// Allow access to selected service ports from the public Internet
        /// </summary>
        public readonly Outputs.KafkaKafkaUserConfigPublicAccess? PublicAccess;
        /// <summary>
        /// Enable Schema-Registry service
        /// </summary>
        public readonly string? SchemaRegistry;
        /// <summary>
        /// Schema Registry configuration
        /// </summary>
        public readonly Outputs.KafkaKafkaUserConfigSchemaRegistryConfig? SchemaRegistryConfig;

        [OutputConstructor]
        private KafkaKafkaUserConfig(
            string? customDomain,

            ImmutableArray<string> ipFilters,

            Outputs.KafkaKafkaUserConfigKafka? kafka,

            Outputs.KafkaKafkaUserConfigKafkaAuthenticationMethods? kafkaAuthenticationMethods,

            string? kafkaConnect,

            Outputs.KafkaKafkaUserConfigKafkaConnectConfig? kafkaConnectConfig,

            string? kafkaRest,

            Outputs.KafkaKafkaUserConfigKafkaRestConfig? kafkaRestConfig,

            string? kafkaVersion,

            Outputs.KafkaKafkaUserConfigPrivateAccess? privateAccess,

            Outputs.KafkaKafkaUserConfigPrivatelinkAccess? privatelinkAccess,

            Outputs.KafkaKafkaUserConfigPublicAccess? publicAccess,

            string? schemaRegistry,

            Outputs.KafkaKafkaUserConfigSchemaRegistryConfig? schemaRegistryConfig)
        {
            CustomDomain = customDomain;
            IpFilters = ipFilters;
            Kafka = kafka;
            KafkaAuthenticationMethods = kafkaAuthenticationMethods;
            KafkaConnect = kafkaConnect;
            KafkaConnectConfig = kafkaConnectConfig;
            KafkaRest = kafkaRest;
            KafkaRestConfig = kafkaRestConfig;
            KafkaVersion = kafkaVersion;
            PrivateAccess = privateAccess;
            PrivatelinkAccess = privatelinkAccess;
            PublicAccess = publicAccess;
            SchemaRegistry = schemaRegistry;
            SchemaRegistryConfig = schemaRegistryConfig;
        }
    }
}
