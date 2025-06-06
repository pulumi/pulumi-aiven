// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aiven.Inputs
{

    public sealed class InfluxDbComponentGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Service component name
        /// </summary>
        [Input("component")]
        public Input<string>? Component { get; set; }

        /// <summary>
        /// Connection info for connecting to the service component. This is a combination of host and port.
        /// </summary>
        [Input("connectionUri")]
        public Input<string>? ConnectionUri { get; set; }

        /// <summary>
        /// Host name for connecting to the service component
        /// </summary>
        [Input("host")]
        public Input<string>? Host { get; set; }

        /// <summary>
        /// Kafka authentication method. This is a value specific to the 'kafka' service component
        /// </summary>
        [Input("kafkaAuthenticationMethod")]
        public Input<string>? KafkaAuthenticationMethod { get; set; }

        /// <summary>
        /// Kafka certificate used. The possible values are `letsencrypt` and `project_ca`.
        /// </summary>
        [Input("kafkaSslCa")]
        public Input<string>? KafkaSslCa { get; set; }

        /// <summary>
        /// Port number for connecting to the service component
        /// </summary>
        [Input("port")]
        public Input<int>? Port { get; set; }

        /// <summary>
        /// Network access route
        /// </summary>
        [Input("route")]
        public Input<string>? Route { get; set; }

        /// <summary>
        /// Whether the endpoint is encrypted or accepts plaintext. By default endpoints are always encrypted and this property is only included for service components they may disable encryption
        /// </summary>
        [Input("ssl")]
        public Input<bool>? Ssl { get; set; }

        /// <summary>
        /// DNS usage name
        /// </summary>
        [Input("usage")]
        public Input<string>? Usage { get; set; }

        public InfluxDbComponentGetArgs()
        {
        }
        public static new InfluxDbComponentGetArgs Empty => new InfluxDbComponentGetArgs();
    }
}
