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
    public sealed class CassandraComponent
    {
        public readonly string? Component;
        public readonly string? Host;
        public readonly string? KafkaAuthenticationMethod;
        public readonly int? Port;
        public readonly string? Route;
        public readonly bool? Ssl;
        public readonly string? Usage;

        [OutputConstructor]
        private CassandraComponent(
            string? component,

            string? host,

            string? kafkaAuthenticationMethod,

            int? port,

            string? route,

            bool? ssl,

            string? usage)
        {
            Component = component;
            Host = host;
            KafkaAuthenticationMethod = kafkaAuthenticationMethod;
            Port = port;
            Route = route;
            Ssl = ssl;
            Usage = usage;
        }
    }
}
