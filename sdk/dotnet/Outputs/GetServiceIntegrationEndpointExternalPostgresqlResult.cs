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
    public sealed class GetServiceIntegrationEndpointExternalPostgresqlResult
    {
        public readonly string Host;
        public readonly string Password;
        public readonly int Port;
        public readonly string? SslMode;
        public readonly string? SslRootCert;
        public readonly string Username;

        [OutputConstructor]
        private GetServiceIntegrationEndpointExternalPostgresqlResult(
            string host,

            string password,

            int port,

            string? sslMode,

            string? sslRootCert,

            string username)
        {
            Host = host;
            Password = password;
            Port = port;
            SslMode = sslMode;
            SslRootCert = sslRootCert;
            Username = username;
        }
    }
}