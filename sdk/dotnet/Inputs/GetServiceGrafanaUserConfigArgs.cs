// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aiven.Inputs
{

    public sealed class GetServiceGrafanaUserConfigArgs : Pulumi.InvokeArgs
    {
        [Input("alertingEnabled")]
        public string? AlertingEnabled { get; set; }

        [Input("alertingErrorOrTimeout")]
        public string? AlertingErrorOrTimeout { get; set; }

        [Input("alertingNodataOrNullvalues")]
        public string? AlertingNodataOrNullvalues { get; set; }

        [Input("allowEmbedding")]
        public string? AllowEmbedding { get; set; }

        [Input("authGenericOauth")]
        public Inputs.GetServiceGrafanaUserConfigAuthGenericOauthArgs? AuthGenericOauth { get; set; }

        [Input("authGithub")]
        public Inputs.GetServiceGrafanaUserConfigAuthGithubArgs? AuthGithub { get; set; }

        [Input("authGitlab")]
        public Inputs.GetServiceGrafanaUserConfigAuthGitlabArgs? AuthGitlab { get; set; }

        [Input("authGoogle")]
        public Inputs.GetServiceGrafanaUserConfigAuthGoogleArgs? AuthGoogle { get; set; }

        [Input("cookieSamesite")]
        public string? CookieSamesite { get; set; }

        [Input("customDomain")]
        public string? CustomDomain { get; set; }

        [Input("dashboardsVersionsToKeep")]
        public int? DashboardsVersionsToKeep { get; set; }

        [Input("dataproxySendUserHeader")]
        public string? DataproxySendUserHeader { get; set; }

        [Input("dataproxyTimeout")]
        public int? DataproxyTimeout { get; set; }

        [Input("disableGravatar")]
        public string? DisableGravatar { get; set; }

        [Input("editorsCanAdmin")]
        public string? EditorsCanAdmin { get; set; }

        [Input("externalImageStorage")]
        public Inputs.GetServiceGrafanaUserConfigExternalImageStorageArgs? ExternalImageStorage { get; set; }

        [Input("googleAnalyticsUaId")]
        public string? GoogleAnalyticsUaId { get; set; }

        [Input("ipFilters")]
        private List<string>? _ipFilters;
        public List<string> IpFilters
        {
            get => _ipFilters ?? (_ipFilters = new List<string>());
            set => _ipFilters = value;
        }

        [Input("metricsEnabled")]
        public string? MetricsEnabled { get; set; }

        [Input("privateAccess")]
        public Inputs.GetServiceGrafanaUserConfigPrivateAccessArgs? PrivateAccess { get; set; }

        [Input("publicAccess")]
        public Inputs.GetServiceGrafanaUserConfigPublicAccessArgs? PublicAccess { get; set; }

        [Input("smtpServer")]
        public Inputs.GetServiceGrafanaUserConfigSmtpServerArgs? SmtpServer { get; set; }

        [Input("userAutoAssignOrg")]
        public string? UserAutoAssignOrg { get; set; }

        [Input("userAutoAssignOrgRole")]
        public string? UserAutoAssignOrgRole { get; set; }

        [Input("viewersCanEdit")]
        public string? ViewersCanEdit { get; set; }

        public GetServiceGrafanaUserConfigArgs()
        {
        }
    }
}