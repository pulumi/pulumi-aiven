// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aiven.Inputs
{

    public sealed class ServiceKafkaUserConfigGetArgs : Pulumi.ResourceArgs
    {
        [Input("customDomain")]
        public Input<string>? CustomDomain { get; set; }

        [Input("ipFilters")]
        private InputList<string>? _ipFilters;
        public InputList<string> IpFilters
        {
            get => _ipFilters ?? (_ipFilters = new InputList<string>());
            set => _ipFilters = value;
        }

        [Input("kafka")]
        public Input<Inputs.ServiceKafkaUserConfigKafkaGetArgs>? Kafka { get; set; }

        [Input("kafkaAuthenticationMethods")]
        public Input<Inputs.ServiceKafkaUserConfigKafkaAuthenticationMethodsGetArgs>? KafkaAuthenticationMethods { get; set; }

        [Input("kafkaConnect")]
        public Input<bool>? KafkaConnect { get; set; }

        [Input("kafkaConnectConfig")]
        public Input<Inputs.ServiceKafkaUserConfigKafkaConnectConfigGetArgs>? KafkaConnectConfig { get; set; }

        [Input("kafkaRest")]
        public Input<bool>? KafkaRest { get; set; }

        [Input("kafkaRestConfig")]
        public Input<Inputs.ServiceKafkaUserConfigKafkaRestConfigGetArgs>? KafkaRestConfig { get; set; }

        [Input("kafkaVersion")]
        public Input<string>? KafkaVersion { get; set; }

        [Input("privateAccess")]
        public Input<Inputs.ServiceKafkaUserConfigPrivateAccessGetArgs>? PrivateAccess { get; set; }

        [Input("publicAccess")]
        public Input<Inputs.ServiceKafkaUserConfigPublicAccessGetArgs>? PublicAccess { get; set; }

        [Input("schemaRegistry")]
        public Input<bool>? SchemaRegistry { get; set; }

        public ServiceKafkaUserConfigGetArgs()
        {
        }
    }
}