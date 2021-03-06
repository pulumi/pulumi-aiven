// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aiven.Inputs
{

    public sealed class ServiceGrafanaUserConfigArgs : Pulumi.ResourceArgs
    {
        [Input("alertingEnabled")]
        public Input<string>? AlertingEnabled { get; set; }

        [Input("alertingErrorOrTimeout")]
        public Input<string>? AlertingErrorOrTimeout { get; set; }

        [Input("alertingNodataOrNullvalues")]
        public Input<string>? AlertingNodataOrNullvalues { get; set; }

        [Input("allowEmbedding")]
        public Input<string>? AllowEmbedding { get; set; }

        [Input("authBasicEnabled")]
        public Input<string>? AuthBasicEnabled { get; set; }

        [Input("authGenericOauth")]
        public Input<Inputs.ServiceGrafanaUserConfigAuthGenericOauthArgs>? AuthGenericOauth { get; set; }

        [Input("authGithub")]
        public Input<Inputs.ServiceGrafanaUserConfigAuthGithubArgs>? AuthGithub { get; set; }

        [Input("authGitlab")]
        public Input<Inputs.ServiceGrafanaUserConfigAuthGitlabArgs>? AuthGitlab { get; set; }

        [Input("authGoogle")]
        public Input<Inputs.ServiceGrafanaUserConfigAuthGoogleArgs>? AuthGoogle { get; set; }

        [Input("cookieSamesite")]
        public Input<string>? CookieSamesite { get; set; }

        [Input("customDomain")]
        public Input<string>? CustomDomain { get; set; }

        [Input("dashboardsMinRefreshInterval")]
        public Input<string>? DashboardsMinRefreshInterval { get; set; }

        [Input("dashboardsVersionsToKeep")]
        public Input<string>? DashboardsVersionsToKeep { get; set; }

        [Input("dataproxySendUserHeader")]
        public Input<string>? DataproxySendUserHeader { get; set; }

        [Input("dataproxyTimeout")]
        public Input<string>? DataproxyTimeout { get; set; }

        [Input("disableGravatar")]
        public Input<string>? DisableGravatar { get; set; }

        [Input("editorsCanAdmin")]
        public Input<string>? EditorsCanAdmin { get; set; }

        [Input("externalImageStorage")]
        public Input<Inputs.ServiceGrafanaUserConfigExternalImageStorageArgs>? ExternalImageStorage { get; set; }

        [Input("googleAnalyticsUaId")]
        public Input<string>? GoogleAnalyticsUaId { get; set; }

        [Input("ipFilters")]
        private InputList<string>? _ipFilters;
        public InputList<string> IpFilters
        {
            get => _ipFilters ?? (_ipFilters = new InputList<string>());
            set => _ipFilters = value;
        }

        [Input("metricsEnabled")]
        public Input<string>? MetricsEnabled { get; set; }

        [Input("privateAccess")]
        public Input<Inputs.ServiceGrafanaUserConfigPrivateAccessArgs>? PrivateAccess { get; set; }

        [Input("privatelinkAccess")]
        public Input<Inputs.ServiceGrafanaUserConfigPrivatelinkAccessArgs>? PrivatelinkAccess { get; set; }

        [Input("projectToForkFrom")]
        public Input<string>? ProjectToForkFrom { get; set; }

        [Input("publicAccess")]
        public Input<Inputs.ServiceGrafanaUserConfigPublicAccessArgs>? PublicAccess { get; set; }

        [Input("recoveryBasebackupName")]
        public Input<string>? RecoveryBasebackupName { get; set; }

        [Input("serviceToForkFrom")]
        public Input<string>? ServiceToForkFrom { get; set; }

        [Input("smtpServer")]
        public Input<Inputs.ServiceGrafanaUserConfigSmtpServerArgs>? SmtpServer { get; set; }

        [Input("userAutoAssignOrg")]
        public Input<string>? UserAutoAssignOrg { get; set; }

        [Input("userAutoAssignOrgRole")]
        public Input<string>? UserAutoAssignOrgRole { get; set; }

        [Input("viewersCanEdit")]
        public Input<string>? ViewersCanEdit { get; set; }

        public ServiceGrafanaUserConfigArgs()
        {
        }
    }
}
