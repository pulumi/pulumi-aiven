// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aiven.Inputs
{

    public sealed class ServiceGrafanaUserConfigAuthGitlabArgs : Pulumi.ResourceArgs
    {
        [Input("allowSignUp")]
        public Input<string>? AllowSignUp { get; set; }

        [Input("allowedGroups")]
        private InputList<string>? _allowedGroups;
        public InputList<string> AllowedGroups
        {
            get => _allowedGroups ?? (_allowedGroups = new InputList<string>());
            set => _allowedGroups = value;
        }

        [Input("apiUrl")]
        public Input<string>? ApiUrl { get; set; }

        [Input("authUrl")]
        public Input<string>? AuthUrl { get; set; }

        [Input("clientId")]
        public Input<string>? ClientId { get; set; }

        [Input("clientSecret")]
        public Input<string>? ClientSecret { get; set; }

        [Input("tokenUrl")]
        public Input<string>? TokenUrl { get; set; }

        public ServiceGrafanaUserConfigAuthGitlabArgs()
        {
        }
    }
}
