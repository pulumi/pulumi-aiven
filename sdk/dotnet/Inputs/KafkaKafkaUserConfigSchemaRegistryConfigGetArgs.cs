// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aiven.Inputs
{

    public sealed class KafkaKafkaUserConfigSchemaRegistryConfigGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// If true, Karapace / Schema Registry on the service nodes can participate in leader election. It might be needed to disable this when the schemas topic is replicated to a secondary cluster and Karapace / Schema Registry there must not participate in leader election. Defaults to `true`.
        /// </summary>
        [Input("leaderEligibility")]
        public Input<bool>? LeaderEligibility { get; set; }

        /// <summary>
        /// If enabled, kafka errors which can be retried or custom errors specified for the service will not be raised, instead, a warning log is emitted. This will denoise issue tracking systems, i.e. sentry. Defaults to `true`.
        /// </summary>
        [Input("retriableErrorsSilenced")]
        public Input<bool>? RetriableErrorsSilenced { get; set; }

        /// <summary>
        /// If enabled, causes the Karapace schema-registry service to shutdown when there are invalid schema records in the `_schemas` topic. Defaults to `false`.
        /// </summary>
        [Input("schemaReaderStrictMode")]
        public Input<bool>? SchemaReaderStrictMode { get; set; }

        /// <summary>
        /// The durable single partition topic that acts as the durable log for the data. This topic must be compacted to avoid losing data due to retention policy. Please note that changing this configuration in an existing Schema Registry / Karapace setup leads to previous schemas being inaccessible, data encoded with them potentially unreadable and schema ID sequence put out of order. It's only possible to do the switch while Schema Registry / Karapace is disabled. Defaults to `_schemas`.
        /// </summary>
        [Input("topicName")]
        public Input<string>? TopicName { get; set; }

        public KafkaKafkaUserConfigSchemaRegistryConfigGetArgs()
        {
        }
        public static new KafkaKafkaUserConfigSchemaRegistryConfigGetArgs Empty => new KafkaKafkaUserConfigSchemaRegistryConfigGetArgs();
    }
}
