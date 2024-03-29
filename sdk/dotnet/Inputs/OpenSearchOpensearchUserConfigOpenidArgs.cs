// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aiven.Inputs
{

    public sealed class OpenSearchOpensearchUserConfigOpenidArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the OpenID Connect client configured in your IdP. Required.
        /// </summary>
        [Input("clientId", required: true)]
        public Input<string> ClientId { get; set; } = null!;

        /// <summary>
        /// The client secret of the OpenID Connect client configured in your IdP. Required.
        /// </summary>
        [Input("clientSecret", required: true)]
        public Input<string> ClientSecret { get; set; } = null!;

        /// <summary>
        /// The URL of your IdP where the Security plugin can find the OpenID Connect metadata/configuration settings.
        /// </summary>
        [Input("connectUrl", required: true)]
        public Input<string> ConnectUrl { get; set; } = null!;

        /// <summary>
        /// Enables or disables OpenID Connect authentication for OpenSearch. When enabled, users can authenticate using OpenID Connect with an Identity Provider. The default value is `true`.
        /// </summary>
        [Input("enabled", required: true)]
        public Input<bool> Enabled { get; set; } = null!;

        /// <summary>
        /// HTTP header name of the JWT token. Optional. Default is Authorization. The default value is `Authorization`.
        /// </summary>
        [Input("header")]
        public Input<string>? Header { get; set; }

        /// <summary>
        /// The HTTP header that stores the token. Typically the Authorization header with the Bearer schema: Authorization: Bearer \n\n. Optional. Default is Authorization.
        /// </summary>
        [Input("jwtHeader")]
        public Input<string>? JwtHeader { get; set; }

        /// <summary>
        /// If the token is not transmitted in the HTTP header, but as an URL parameter, define the name of the parameter here. Optional.
        /// </summary>
        [Input("jwtUrlParameter")]
        public Input<string>? JwtUrlParameter { get; set; }

        /// <summary>
        /// The maximum number of unknown key IDs in the time frame. Default is 10. Optional. The default value is `10`.
        /// </summary>
        [Input("refreshRateLimitCount")]
        public Input<int>? RefreshRateLimitCount { get; set; }

        /// <summary>
        /// The time frame to use when checking the maximum number of unknown key IDs, in milliseconds. Optional.Default is 10000 (10 seconds). The default value is `10000`.
        /// </summary>
        [Input("refreshRateLimitTimeWindowMs")]
        public Input<int>? RefreshRateLimitTimeWindowMs { get; set; }

        /// <summary>
        /// The key in the JSON payload that stores the user’s roles. The value of this key must be a comma-separated list of roles. Required only if you want to use roles in the JWT.
        /// </summary>
        [Input("rolesKey")]
        public Input<string>? RolesKey { get; set; }

        /// <summary>
        /// The scope of the identity token issued by the IdP. Optional. Default is openid profile email address phone.
        /// </summary>
        [Input("scope")]
        public Input<string>? Scope { get; set; }

        /// <summary>
        /// The key in the JSON payload that stores the user’s name. If not defined, the subject registered claim is used. Most IdP providers use the preferred_username claim. Optional.
        /// </summary>
        [Input("subjectKey")]
        public Input<string>? SubjectKey { get; set; }

        public OpenSearchOpensearchUserConfigOpenidArgs()
        {
        }
        public static new OpenSearchOpensearchUserConfigOpenidArgs Empty => new OpenSearchOpensearchUserConfigOpenidArgs();
    }
}
