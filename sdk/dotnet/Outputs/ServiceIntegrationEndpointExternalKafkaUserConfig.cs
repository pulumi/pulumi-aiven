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
    public sealed class ServiceIntegrationEndpointExternalKafkaUserConfig
    {
        public readonly string? BootstrapServers;
        public readonly string? SecurityProtocol;
        public readonly string? SslCaCert;
        public readonly string? SslClientCert;
        public readonly string? SslClientKey;

        [OutputConstructor]
        private ServiceIntegrationEndpointExternalKafkaUserConfig(
            string? bootstrapServers,

            string? securityProtocol,

            string? sslCaCert,

            string? sslClientCert,

            string? sslClientKey)
        {
            BootstrapServers = bootstrapServers;
            SecurityProtocol = securityProtocol;
            SslCaCert = sslCaCert;
            SslClientCert = sslClientCert;
            SslClientKey = sslClientKey;
        }
    }
}