// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aiven.Inputs
{

    public sealed class GetOpenSearchComponentInputArgs : Pulumi.ResourceArgs
    {
        [Input("component", required: true)]
        public Input<string> Component { get; set; } = null!;

        [Input("host", required: true)]
        public Input<string> Host { get; set; } = null!;

        [Input("kafkaAuthenticationMethod", required: true)]
        public Input<string> KafkaAuthenticationMethod { get; set; } = null!;

        [Input("port", required: true)]
        public Input<int> Port { get; set; } = null!;

        [Input("route", required: true)]
        public Input<string> Route { get; set; } = null!;

        [Input("ssl", required: true)]
        public Input<bool> Ssl { get; set; } = null!;

        [Input("usage", required: true)]
        public Input<string> Usage { get; set; } = null!;

        public GetOpenSearchComponentInputArgs()
        {
        }
    }
}