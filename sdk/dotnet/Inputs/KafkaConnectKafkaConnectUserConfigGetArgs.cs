// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aiven.Inputs
{

    public sealed class KafkaConnectKafkaConnectUserConfigGetArgs : Pulumi.ResourceArgs
    {
        [Input("ipFilters")]
        private InputList<string>? _ipFilters;

        /// <summary>
        /// allow incoming connections from CIDR address block, e.g. `10.20.0.0/16`
        /// </summary>
        public InputList<string> IpFilters
        {
            get => _ipFilters ?? (_ipFilters = new InputList<string>());
            set => _ipFilters = value;
        }

        /// <summary>
        /// Allow clients to connect to kafka_connect from the public internet for 
        /// service nodes that are in a project VPC or another type of private network.
        /// </summary>
        [Input("kafkaConnect")]
        public Input<Inputs.KafkaConnectKafkaConnectUserConfigKafkaConnectGetArgs>? KafkaConnect { get; set; }

        /// <summary>
        /// Allow access to selected service ports from private networks.
        /// </summary>
        [Input("privateAccess")]
        public Input<Inputs.KafkaConnectKafkaConnectUserConfigPrivateAccessGetArgs>? PrivateAccess { get; set; }

        /// <summary>
        /// Allow access to selected service components through Privatelink
        /// </summary>
        [Input("privatelinkAccess")]
        public Input<Inputs.KafkaConnectKafkaConnectUserConfigPrivatelinkAccessGetArgs>? PrivatelinkAccess { get; set; }

        /// <summary>
        /// Allow access to selected service ports from the public Internet.
        /// </summary>
        [Input("publicAccess")]
        public Input<Inputs.KafkaConnectKafkaConnectUserConfigPublicAccessGetArgs>? PublicAccess { get; set; }

        public KafkaConnectKafkaConnectUserConfigGetArgs()
        {
        }
    }
}
