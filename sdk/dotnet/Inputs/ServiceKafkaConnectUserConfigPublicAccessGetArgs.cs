// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aiven.Inputs
{

    public sealed class ServiceKafkaConnectUserConfigPublicAccessGetArgs : Pulumi.ResourceArgs
    {
        [Input("kafkaConnect")]
        public Input<string>? KafkaConnect { get; set; }

        [Input("prometheus")]
        public Input<string>? Prometheus { get; set; }

        public ServiceKafkaConnectUserConfigPublicAccessGetArgs()
        {
        }
    }
}
