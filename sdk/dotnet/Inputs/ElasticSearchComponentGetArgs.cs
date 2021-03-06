// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aiven.Inputs
{

    public sealed class ElasticSearchComponentGetArgs : Pulumi.ResourceArgs
    {
        [Input("component")]
        public Input<string>? Component { get; set; }

        [Input("host")]
        public Input<string>? Host { get; set; }

        [Input("kafkaAuthenticationMethod")]
        public Input<string>? KafkaAuthenticationMethod { get; set; }

        [Input("port")]
        public Input<int>? Port { get; set; }

        [Input("route")]
        public Input<string>? Route { get; set; }

        [Input("ssl")]
        public Input<bool>? Ssl { get; set; }

        [Input("usage")]
        public Input<string>? Usage { get; set; }

        public ElasticSearchComponentGetArgs()
        {
        }
    }
}
