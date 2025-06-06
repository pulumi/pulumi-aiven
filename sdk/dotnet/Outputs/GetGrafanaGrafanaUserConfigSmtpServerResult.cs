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
    public sealed class GetGrafanaGrafanaUserConfigSmtpServerResult
    {
        /// <summary>
        /// Address used for sending emails. Example: `yourgrafanauser@yourdomain.example.com`.
        /// </summary>
        public readonly string FromAddress;
        /// <summary>
        /// Name used in outgoing emails, defaults to Grafana.
        /// </summary>
        public readonly string? FromName;
        /// <summary>
        /// Server hostname or IP. Example: `smtp.example.com`.
        /// </summary>
        public readonly string Host;
        /// <summary>
        /// Password for SMTP authentication. Example: `ein0eemeev5eeth3Ahfu`.
        /// </summary>
        public readonly string? Password;
        /// <summary>
        /// SMTP server port. Example: `25`.
        /// </summary>
        public readonly int Port;
        /// <summary>
        /// Skip verifying server certificate. Defaults to false.
        /// </summary>
        public readonly bool? SkipVerify;
        /// <summary>
        /// Enum: `MandatoryStartTLS`, `NoStartTLS`, `OpportunisticStartTLS`. Either OpportunisticStartTLS, MandatoryStartTLS or NoStartTLS. Default is OpportunisticStartTLS.
        /// </summary>
        public readonly string? StarttlsPolicy;
        /// <summary>
        /// Username for SMTP authentication. Example: `smtpuser`.
        /// </summary>
        public readonly string? Username;

        [OutputConstructor]
        private GetGrafanaGrafanaUserConfigSmtpServerResult(
            string fromAddress,

            string? fromName,

            string host,

            string? password,

            int port,

            bool? skipVerify,

            string? starttlsPolicy,

            string? username)
        {
            FromAddress = fromAddress;
            FromName = fromName;
            Host = host;
            Password = password;
            Port = port;
            SkipVerify = skipVerify;
            StarttlsPolicy = starttlsPolicy;
            Username = username;
        }
    }
}
