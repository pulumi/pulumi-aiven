// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aiven.Inputs
{

    public sealed class FlinkJobTableUpsertKafkaArgs : global::Pulumi.ResourceArgs
    {
        [Input("keyFields")]
        private InputList<string>? _keyFields;

        /// <summary>
        /// Defines the columns from the SQL schema of the data table that are considered keys in the Kafka messages. This property cannot be changed, doing so forces recreation of the resource.
        /// </summary>
        public InputList<string> KeyFields
        {
            get => _keyFields ?? (_keyFields = new InputList<string>());
            set => _keyFields = value;
        }

        /// <summary>
        /// Sets the format that is used to convert the key part of Kafka messages. The possible values are `avro`, `avro-confluent`, `debezium-avro-confluent`, `debezium-json` and `json`. This property cannot be changed, doing so forces recreation of the resource.
        /// </summary>
        [Input("keyFormat")]
        public Input<string>? KeyFormat { get; set; }

        /// <summary>
        /// Controls the startup method for the Kafka consumer that Aiven for Apache Flink is using. The possible values are `earliest-offset`, `latest-offset`, `group-offsets` and `timestamp`. This property cannot be changed, doing so forces recreation of the resource.
        /// </summary>
        [Input("scanStartupMode")]
        public Input<string>? ScanStartupMode { get; set; }

        /// <summary>
        /// Topic name This property cannot be changed, doing so forces recreation of the resource.
        /// </summary>
        [Input("topic")]
        public Input<string>? Topic { get; set; }

        /// <summary>
        /// Controls how key columns are handled in the message value. Select ALL to include the physical columns of the table schema in the message value. Select EXCEPT_KEY to exclude the physical columns of the table schema from the message value. This is the default for upsert Kafka connectors. The possible values are `[ALL EXCEPT_KEY]`. This property cannot be changed, doing so forces recreation of the resource.
        /// </summary>
        [Input("valueFieldsInclude")]
        public Input<string>? ValueFieldsInclude { get; set; }

        /// <summary>
        /// Sets the format that is used to convert the value part of Kafka messages. The possible values are `avro`, `avro-confluent`, `debezium-avro-confluent`, `debezium-json` and `json`. This property cannot be changed, doing so forces recreation of the resource.
        /// </summary>
        [Input("valueFormat")]
        public Input<string>? ValueFormat { get; set; }

        public FlinkJobTableUpsertKafkaArgs()
        {
        }
        public static new FlinkJobTableUpsertKafkaArgs Empty => new FlinkJobTableUpsertKafkaArgs();
    }
}