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
    public sealed class GetGrafanaGrafanaUserConfigAuthAzureadResult
    {
        /// <summary>
        /// Automatically sign-up users on successful sign-in.
        /// </summary>
        public readonly bool? AllowSignUp;
        /// <summary>
        /// Allowed domains.
        /// </summary>
        public readonly ImmutableArray<string> AllowedDomains;
        /// <summary>
        /// Require users to belong to one of given groups.
        /// </summary>
        public readonly ImmutableArray<string> AllowedGroups;
        /// <summary>
        /// Authorization URL.
        /// </summary>
        public readonly string AuthUrl;
        /// <summary>
        /// Client ID from provider.
        /// </summary>
        public readonly string ClientId;
        /// <summary>
        /// Client secret from provider.
        /// </summary>
        public readonly string ClientSecret;
        /// <summary>
        /// Token URL.
        /// </summary>
        public readonly string TokenUrl;

        [OutputConstructor]
        private GetGrafanaGrafanaUserConfigAuthAzureadResult(
            bool? allowSignUp,

            ImmutableArray<string> allowedDomains,

            ImmutableArray<string> allowedGroups,

            string authUrl,

            string clientId,

            string clientSecret,

            string tokenUrl)
        {
            AllowSignUp = allowSignUp;
            AllowedDomains = allowedDomains;
            AllowedGroups = allowedGroups;
            AuthUrl = authUrl;
            ClientId = clientId;
            ClientSecret = clientSecret;
            TokenUrl = tokenUrl;
        }
    }
}