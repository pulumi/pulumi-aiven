// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aiven.Inputs
{

    public sealed class GetKafkaConnectKafkaConnectUserConfigArgs : Pulumi.InvokeArgs
    {
        [Input("ipFilters")]
        private List<string>? _ipFilters;
        public List<string> IpFilters
        {
            get => _ipFilters ?? (_ipFilters = new List<string>());
            set => _ipFilters = value;
        }

        [Input("kafkaConnect")]
        public Inputs.GetKafkaConnectKafkaConnectUserConfigKafkaConnectArgs? KafkaConnect { get; set; }

        [Input("privateAccess")]
        public Inputs.GetKafkaConnectKafkaConnectUserConfigPrivateAccessArgs? PrivateAccess { get; set; }

        [Input("publicAccess")]
        public Inputs.GetKafkaConnectKafkaConnectUserConfigPublicAccessArgs? PublicAccess { get; set; }

        public GetKafkaConnectKafkaConnectUserConfigArgs()
        {
        }
    }
}