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
    public sealed class GetKafkaKafkaUserConfigPrivateAccessResult
    {
        /// <summary>
        /// Allow clients to connect to kafka with a DNS name that always resolves to the service's private IP addresses. Only available in certain network locations.
        /// </summary>
        public readonly bool? Kafka;
        /// <summary>
        /// Allow clients to connect to kafka_connect with a DNS name that always resolves to the service's private IP addresses. Only available in certain network locations.
        /// </summary>
        public readonly bool? KafkaConnect;
        /// <summary>
        /// Allow clients to connect to kafka_rest with a DNS name that always resolves to the service's private IP addresses. Only available in certain network locations.
        /// </summary>
        public readonly bool? KafkaRest;
        /// <summary>
        /// Allow clients to connect to prometheus with a DNS name that always resolves to the service's private IP addresses. Only available in certain network locations.
        /// </summary>
        public readonly bool? Prometheus;
        /// <summary>
        /// Allow clients to connect to schema_registry with a DNS name that always resolves to the service's private IP addresses. Only available in certain network locations.
        /// </summary>
        public readonly bool? SchemaRegistry;

        [OutputConstructor]
        private GetKafkaKafkaUserConfigPrivateAccessResult(
            bool? kafka,

            bool? kafkaConnect,

            bool? kafkaRest,

            bool? prometheus,

            bool? schemaRegistry)
        {
            Kafka = kafka;
            KafkaConnect = kafkaConnect;
            KafkaRest = kafkaRest;
            Prometheus = prometheus;
            SchemaRegistry = schemaRegistry;
        }
    }
}
