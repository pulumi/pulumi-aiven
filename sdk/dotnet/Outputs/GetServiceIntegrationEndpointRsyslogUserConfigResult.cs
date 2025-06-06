// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aiven.Outputs
{

    [OutputType]
    public sealed class GetServiceIntegrationEndpointRsyslogUserConfigResult
    {
        /// <summary>
        /// PEM encoded CA certificate. Example: `-----BEGIN CERTIFICATE-----
        /// ...
        /// -----END CERTIFICATE-----
        /// `.
        /// </summary>
        public readonly string? Ca;
        /// <summary>
        /// PEM encoded client certificate. Example: `-----BEGIN CERTIFICATE-----
        /// ...
        /// -----END CERTIFICATE-----
        /// `.
        /// </summary>
        public readonly string? Cert;
        /// <summary>
        /// Enum: `custom`, `rfc3164`, `rfc5424`. Message format. Default: `rfc5424`.
        /// </summary>
        public readonly string Format;
        /// <summary>
        /// PEM encoded client key. Example: `-----BEGIN PRIVATE KEY-----
        /// ...
        /// -----END PRIVATE KEY-----
        /// `.
        /// </summary>
        public readonly string? Key;
        /// <summary>
        /// Custom syslog message format. Example: `&lt;%pri%&gt;%timestamp:::date-rfc3339% %HOSTNAME% %app-name% %msg%`.
        /// </summary>
        public readonly string? Logline;
        /// <summary>
        /// Rsyslog max message size. Default: `8192`.
        /// </summary>
        public readonly int? MaxMessageSize;
        /// <summary>
        /// Rsyslog server port. Default: `514`.
        /// </summary>
        public readonly int Port;
        /// <summary>
        /// Structured data block for log message. Example: `TOKEN tag="LiteralValue"`.
        /// </summary>
        public readonly string? Sd;
        /// <summary>
        /// Rsyslog server IP address or hostname. Example: `logs.example.com`.
        /// </summary>
        public readonly string Server;
        /// <summary>
        /// Require TLS. Default: `true`.
        /// </summary>
        public readonly bool Tls;

        [OutputConstructor]
        private GetServiceIntegrationEndpointRsyslogUserConfigResult(
            string? ca,

            string? cert,

            string format,

            string? key,

            string? logline,

            int? maxMessageSize,

            int port,

            string? sd,

            string server,

            bool tls)
        {
            Ca = ca;
            Cert = cert;
            Format = format;
            Key = key;
            Logline = logline;
            MaxMessageSize = maxMessageSize;
            Port = port;
            Sd = sd;
            Server = server;
            Tls = tls;
        }
    }
}
