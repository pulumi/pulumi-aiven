// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aiven.Inputs
{

    public sealed class GetServiceIntegrationEndpointRsyslogUserConfigArgs : Pulumi.InvokeArgs
    {
        [Input("ca")]
        public string? Ca { get; set; }

        [Input("cert")]
        public string? Cert { get; set; }

        [Input("format")]
        public string? Format { get; set; }

        [Input("key")]
        public string? Key { get; set; }

        [Input("logline")]
        public string? Logline { get; set; }

        [Input("port")]
        public string? Port { get; set; }

        [Input("sd")]
        public string? Sd { get; set; }

        [Input("server")]
        public string? Server { get; set; }

        [Input("tls")]
        public string? Tls { get; set; }

        public GetServiceIntegrationEndpointRsyslogUserConfigArgs()
        {
        }
    }
}