// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aiven.Inputs
{

    public sealed class ServiceIntegrationEndpointExternalPostgresqlArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Default database. Example: `testdb`.
        /// </summary>
        [Input("defaultDatabase")]
        public Input<string>? DefaultDatabase { get; set; }

        /// <summary>
        /// Hostname or IP address of the server. Example: `my.server.com`.
        /// </summary>
        [Input("host", required: true)]
        public Input<string> Host { get; set; } = null!;

        [Input("password")]
        private Input<string>? _password;

        /// <summary>
        /// Password. Example: `jjKk45Nnd`.
        /// </summary>
        public Input<string>? Password
        {
            get => _password;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _password = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// Port number of the server. Example: `5432`.
        /// </summary>
        [Input("port", required: true)]
        public Input<int> Port { get; set; } = null!;

        /// <summary>
        /// Client certificate. Example: `-----BEGIN CERTIFICATE-----
        /// ...
        /// -----END CERTIFICATE-----
        /// `.
        /// </summary>
        [Input("sslClientCertificate")]
        public Input<string>? SslClientCertificate { get; set; }

        [Input("sslClientKey")]
        private Input<string>? _sslClientKey;

        /// <summary>
        /// Client key. Example: `-----BEGIN PRIVATE KEY-----
        /// ...
        /// -----END PRIVATE KEY-----`.
        /// </summary>
        public Input<string>? SslClientKey
        {
            get => _sslClientKey;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _sslClientKey = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// Enum: `allow`, `disable`, `prefer`, `require`, `verify-ca`, `verify-full`. SSL mode to use for the connection.  Please note that Aiven requires TLS for all connections to external PostgreSQL services. Default: `verify-full`.
        /// </summary>
        [Input("sslMode")]
        public Input<string>? SslMode { get; set; }

        /// <summary>
        /// SSL Root Cert. Example: `-----BEGIN CERTIFICATE-----
        /// ...
        /// -----END CERTIFICATE-----
        /// `.
        /// </summary>
        [Input("sslRootCert")]
        public Input<string>? SslRootCert { get; set; }

        /// <summary>
        /// User name. Example: `myname`.
        /// </summary>
        [Input("username", required: true)]
        public Input<string> Username { get; set; } = null!;

        public ServiceIntegrationEndpointExternalPostgresqlArgs()
        {
        }
        public static new ServiceIntegrationEndpointExternalPostgresqlArgs Empty => new ServiceIntegrationEndpointExternalPostgresqlArgs();
    }
}
