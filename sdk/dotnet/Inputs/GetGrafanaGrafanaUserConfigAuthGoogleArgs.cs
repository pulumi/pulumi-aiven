// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aiven.Inputs
{

    public sealed class GetGrafanaGrafanaUserConfigAuthGoogleArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// Automatically sign-up users on successful sign-in
        /// </summary>
        [Input("allowSignUp")]
        public string? AllowSignUp { get; set; }

        [Input("allowedDomains")]
        private List<string>? _allowedDomains;

        /// <summary>
        /// Allowed domain
        /// </summary>
        public List<string> AllowedDomains
        {
            get => _allowedDomains ?? (_allowedDomains = new List<string>());
            set => _allowedDomains = value;
        }

        /// <summary>
        /// Client ID from provider
        /// </summary>
        [Input("clientId")]
        public string? ClientId { get; set; }

        /// <summary>
        /// Client secret from provider
        /// </summary>
        [Input("clientSecret")]
        public string? ClientSecret { get; set; }

        public GetGrafanaGrafanaUserConfigAuthGoogleArgs()
        {
        }
    }
}
