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
    public sealed class FlinkJobTableUpsertKafka
    {
        /// <summary>
        /// Defines the columns from the SQL schema of the data table that are considered keys in the Kafka messages. This property cannot be changed, doing so forces recreation of the resource.
        /// </summary>
        public readonly ImmutableArray<string> KeyFields;
        /// <summary>
        /// Sets the format that is used to convert the key part of Kafka messages. The possible values are `avro`, `avro-confluent`, `debezium-avro-confluent`, `debezium-json` and `json`. This property cannot be changed, doing so forces recreation of the resource.
        /// </summary>
        public readonly string? KeyFormat;
        /// <summary>
        /// Controls the startup method for the Kafka consumer that Aiven for Apache Flink is using. The possible values are `earliest-offset`, `latest-offset`, `group-offsets` and `timestamp`. This property cannot be changed, doing so forces recreation of the resource.
        /// </summary>
        public readonly string? ScanStartupMode;
        /// <summary>
        /// Topic name This property cannot be changed, doing so forces recreation of the resource.
        /// </summary>
        public readonly string? Topic;
        /// <summary>
        /// Controls how key columns are handled in the message value. Select ALL to include the physical columns of the table schema in the message value. Select EXCEPT_KEY to exclude the physical columns of the table schema from the message value. This is the default for upsert Kafka connectors. The possible values are `[ALL EXCEPT_KEY]`. This property cannot be changed, doing so forces recreation of the resource.
        /// </summary>
        public readonly string? ValueFieldsInclude;
        /// <summary>
        /// Sets the format that is used to convert the value part of Kafka messages. The possible values are `avro`, `avro-confluent`, `debezium-avro-confluent`, `debezium-json` and `json`. This property cannot be changed, doing so forces recreation of the resource.
        /// </summary>
        public readonly string? ValueFormat;

        [OutputConstructor]
        private FlinkJobTableUpsertKafka(
            ImmutableArray<string> keyFields,

            string? keyFormat,

            string? scanStartupMode,

            string? topic,

            string? valueFieldsInclude,

            string? valueFormat)
        {
            KeyFields = keyFields;
            KeyFormat = keyFormat;
            ScanStartupMode = scanStartupMode;
            Topic = topic;
            ValueFieldsInclude = valueFieldsInclude;
            ValueFormat = valueFormat;
        }
    }
}