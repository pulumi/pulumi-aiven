// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aiven.Inputs
{

    public sealed class GrafanaGrafanaUserConfigSmtpServerGetArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Address used for sending emails
        /// </summary>
        [Input("fromAddress")]
        public Input<string>? FromAddress { get; set; }

        /// <summary>
        /// Name used in outgoing emails, defaults to Grafana
        /// </summary>
        [Input("fromName")]
        public Input<string>? FromName { get; set; }

        /// <summary>
        /// Server hostname or IP
        /// </summary>
        [Input("host")]
        public Input<string>? Host { get; set; }

        /// <summary>
        /// Password for SMTP authentication
        /// </summary>
        [Input("password")]
        public Input<string>? Password { get; set; }

        /// <summary>
        /// SMTP server port
        /// </summary>
        [Input("port")]
        public Input<string>? Port { get; set; }

        /// <summary>
        /// Skip verifying server certificate. Defaults to false
        /// </summary>
        [Input("skipVerify")]
        public Input<string>? SkipVerify { get; set; }

        /// <summary>
        /// Either OpportunisticStartTLS, MandatoryStartTLS or NoStartTLS. 
        /// Default is OpportunisticStartTLS.
        /// </summary>
        [Input("starttlsPolicy")]
        public Input<string>? StarttlsPolicy { get; set; }

        /// <summary>
        /// Username for SMTP authentication
        /// </summary>
        [Input("username")]
        public Input<string>? Username { get; set; }

        public GrafanaGrafanaUserConfigSmtpServerGetArgs()
        {
        }
    }
}
