// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aiven
{
    public static class GetAccountAuthentication
    {
        /// <summary>
        /// ## # Account Authentication Data Source
        /// 
        /// The Account Authentication data source provides information about the existing Aiven Account Authentication.
        /// </summary>
        public static Task<GetAccountAuthenticationResult> InvokeAsync(GetAccountAuthenticationArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetAccountAuthenticationResult>("aiven:index/getAccountAuthentication:getAccountAuthentication", args ?? new GetAccountAuthenticationArgs(), options.WithVersion());
    }


    public sealed class GetAccountAuthenticationArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// is a unique account id.
        /// </summary>
        [Input("accountId", required: true)]
        public string AccountId { get; set; } = null!;

        /// <summary>
        /// account authentication id.
        /// </summary>
        [Input("authenticationId")]
        public string? AuthenticationId { get; set; }

        /// <summary>
        /// time of creation.
        /// </summary>
        [Input("createTime")]
        public string? CreateTime { get; set; }

        /// <summary>
        /// defines an authentication method enabled or not.
        /// </summary>
        [Input("enabled")]
        public bool? Enabled { get; set; }

        /// <summary>
        /// is an account authentication name.
        /// </summary>
        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        /// <summary>
        /// is a SAML Assertion Consumer Service URL.
        /// </summary>
        [Input("samlAcsUrl")]
        public string? SamlAcsUrl { get; set; }

        /// <summary>
        /// is a SAML Certificate.
        /// </summary>
        [Input("samlCertificate")]
        public string? SamlCertificate { get; set; }

        /// <summary>
        /// is a SAML Entity ID.
        /// </summary>
        [Input("samlEntityId")]
        public string? SamlEntityId { get; set; }

        /// <summary>
        /// is a SAML Idp URL.
        /// </summary>
        [Input("samlIdpUrl")]
        public string? SamlIdpUrl { get; set; }

        /// <summary>
        /// is a SAML Metadata URL.
        /// </summary>
        [Input("samlMetadataUrl")]
        public string? SamlMetadataUrl { get; set; }

        /// <summary>
        /// is an account authentication type, can be one of `internal` and `saml`.
        /// </summary>
        [Input("type")]
        public string? Type { get; set; }

        /// <summary>
        /// time of last update.
        /// </summary>
        [Input("updateTime")]
        public string? UpdateTime { get; set; }

        public GetAccountAuthenticationArgs()
        {
        }
    }


    [OutputType]
    public sealed class GetAccountAuthenticationResult
    {
        /// <summary>
        /// is a unique account id.
        /// </summary>
        public readonly string AccountId;
        /// <summary>
        /// account authentication id.
        /// </summary>
        public readonly string AuthenticationId;
        /// <summary>
        /// time of creation.
        /// </summary>
        public readonly string CreateTime;
        /// <summary>
        /// defines an authentication method enabled or not.
        /// </summary>
        public readonly bool? Enabled;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// is an account authentication name.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// is a SAML Assertion Consumer Service URL.
        /// </summary>
        public readonly string SamlAcsUrl;
        /// <summary>
        /// is a SAML Certificate.
        /// </summary>
        public readonly string? SamlCertificate;
        /// <summary>
        /// is a SAML Entity ID.
        /// </summary>
        public readonly string? SamlEntityId;
        /// <summary>
        /// is a SAML Idp URL.
        /// </summary>
        public readonly string? SamlIdpUrl;
        /// <summary>
        /// is a SAML Metadata URL.
        /// </summary>
        public readonly string SamlMetadataUrl;
        /// <summary>
        /// is an account authentication type, can be one of `internal` and `saml`.
        /// </summary>
        public readonly string? Type;
        /// <summary>
        /// time of last update.
        /// </summary>
        public readonly string UpdateTime;

        [OutputConstructor]
        private GetAccountAuthenticationResult(
            string accountId,

            string authenticationId,

            string createTime,

            bool? enabled,

            string id,

            string name,

            string samlAcsUrl,

            string? samlCertificate,

            string? samlEntityId,

            string? samlIdpUrl,

            string samlMetadataUrl,

            string? type,

            string updateTime)
        {
            AccountId = accountId;
            AuthenticationId = authenticationId;
            CreateTime = createTime;
            Enabled = enabled;
            Id = id;
            Name = name;
            SamlAcsUrl = samlAcsUrl;
            SamlCertificate = samlCertificate;
            SamlEntityId = samlEntityId;
            SamlIdpUrl = samlIdpUrl;
            SamlMetadataUrl = samlMetadataUrl;
            Type = type;
            UpdateTime = updateTime;
        }
    }
}
