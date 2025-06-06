// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aiven.Inputs
{

    public sealed class GrafanaGrafanaUserConfigAuthGitlabGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Automatically sign-up users on successful sign-in.
        /// </summary>
        [Input("allowSignUp")]
        public Input<bool>? AllowSignUp { get; set; }

        [Input("allowedGroups", required: true)]
        private InputList<string>? _allowedGroups;

        /// <summary>
        /// Require users to belong to one of given groups.
        /// </summary>
        public InputList<string> AllowedGroups
        {
            get => _allowedGroups ?? (_allowedGroups = new InputList<string>());
            set => _allowedGroups = value;
        }

        /// <summary>
        /// This only needs to be set when using self hosted GitLab. Example: `https://gitlab.com/api/v4`.
        /// </summary>
        [Input("apiUrl")]
        public Input<string>? ApiUrl { get; set; }

        /// <summary>
        /// This only needs to be set when using self hosted GitLab. Example: `https://gitlab.com/oauth/authorize`.
        /// </summary>
        [Input("authUrl")]
        public Input<string>? AuthUrl { get; set; }

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

        /// <summary>
        /// This only needs to be set when using self hosted GitLab. Example: `https://gitlab.com/oauth/token`.
        /// </summary>
        [Input("tokenUrl")]
        public Input<string>? TokenUrl { get; set; }

        public GrafanaGrafanaUserConfigAuthGitlabGetArgs()
        {
        }
        public static new GrafanaGrafanaUserConfigAuthGitlabGetArgs Empty => new GrafanaGrafanaUserConfigAuthGitlabGetArgs();
    }
}
