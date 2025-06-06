// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aiven.Inputs
{

    public sealed class GrafanaGrafanaUserConfigAuthGoogleArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Automatically sign-up users on successful sign-in.
        /// </summary>
        [Input("allowSignUp")]
        public Input<bool>? AllowSignUp { get; set; }

        [Input("allowedDomains", required: true)]
        private InputList<string>? _allowedDomains;

        /// <summary>
        /// Domains allowed to sign-in to this Grafana.
        /// </summary>
        public InputList<string> AllowedDomains
        {
            get => _allowedDomains ?? (_allowedDomains = new InputList<string>());
            set => _allowedDomains = value;
        }

        /// <summary>
        /// Client ID from provider. Example: `b1ba0bf54a4c2c0a1c29`.
        /// </summary>
        [Input("clientId", required: true)]
        public Input<string> ClientId { get; set; } = null!;

        [Input("clientSecret", required: true)]
        private Input<string>? _clientSecret;

        /// <summary>
        /// Client secret from provider. Example: `bfa6gea4f129076761dcba8ce5e1e406bd83af7b`.
        /// </summary>
        public Input<string>? ClientSecret
        {
            get => _clientSecret;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _clientSecret = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        public GrafanaGrafanaUserConfigAuthGoogleArgs()
        {
        }
        public static new GrafanaGrafanaUserConfigAuthGoogleArgs Empty => new GrafanaGrafanaUserConfigAuthGoogleArgs();
    }
}
