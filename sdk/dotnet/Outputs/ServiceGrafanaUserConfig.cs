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
    public sealed class ServiceGrafanaUserConfig
    {
        public readonly string? AlertingEnabled;
        public readonly string? AlertingErrorOrTimeout;
        public readonly string? AlertingNodataOrNullvalues;
        public readonly string? AllowEmbedding;
        public readonly string? AuthBasicEnabled;
        public readonly Outputs.ServiceGrafanaUserConfigAuthGenericOauth? AuthGenericOauth;
        public readonly Outputs.ServiceGrafanaUserConfigAuthGithub? AuthGithub;
        public readonly Outputs.ServiceGrafanaUserConfigAuthGitlab? AuthGitlab;
        public readonly Outputs.ServiceGrafanaUserConfigAuthGoogle? AuthGoogle;
        public readonly string? CookieSamesite;
        public readonly string? CustomDomain;
        public readonly string? DashboardsMinRefreshInterval;
        public readonly string? DashboardsVersionsToKeep;
        public readonly string? DataproxySendUserHeader;
        public readonly string? DataproxyTimeout;
        public readonly string? DisableGravatar;
        public readonly string? EditorsCanAdmin;
        public readonly Outputs.ServiceGrafanaUserConfigExternalImageStorage? ExternalImageStorage;
        public readonly string? GoogleAnalyticsUaId;
        public readonly ImmutableArray<string> IpFilters;
        public readonly string? MetricsEnabled;
        public readonly Outputs.ServiceGrafanaUserConfigPrivateAccess? PrivateAccess;
        public readonly Outputs.ServiceGrafanaUserConfigPrivatelinkAccess? PrivatelinkAccess;
        public readonly string? ProjectToForkFrom;
        public readonly Outputs.ServiceGrafanaUserConfigPublicAccess? PublicAccess;
        public readonly string? RecoveryBasebackupName;
        public readonly string? ServiceToForkFrom;
        public readonly Outputs.ServiceGrafanaUserConfigSmtpServer? SmtpServer;
        public readonly string? UserAutoAssignOrg;
        public readonly string? UserAutoAssignOrgRole;
        public readonly string? ViewersCanEdit;

        [OutputConstructor]
        private ServiceGrafanaUserConfig(
            string? alertingEnabled,

            string? alertingErrorOrTimeout,

            string? alertingNodataOrNullvalues,

            string? allowEmbedding,

            string? authBasicEnabled,

            Outputs.ServiceGrafanaUserConfigAuthGenericOauth? authGenericOauth,

            Outputs.ServiceGrafanaUserConfigAuthGithub? authGithub,

            Outputs.ServiceGrafanaUserConfigAuthGitlab? authGitlab,

            Outputs.ServiceGrafanaUserConfigAuthGoogle? authGoogle,

            string? cookieSamesite,

            string? customDomain,

            string? dashboardsMinRefreshInterval,

            string? dashboardsVersionsToKeep,

            string? dataproxySendUserHeader,

            string? dataproxyTimeout,

            string? disableGravatar,

            string? editorsCanAdmin,

            Outputs.ServiceGrafanaUserConfigExternalImageStorage? externalImageStorage,

            string? googleAnalyticsUaId,

            ImmutableArray<string> ipFilters,

            string? metricsEnabled,

            Outputs.ServiceGrafanaUserConfigPrivateAccess? privateAccess,

            Outputs.ServiceGrafanaUserConfigPrivatelinkAccess? privatelinkAccess,

            string? projectToForkFrom,

            Outputs.ServiceGrafanaUserConfigPublicAccess? publicAccess,

            string? recoveryBasebackupName,

            string? serviceToForkFrom,

            Outputs.ServiceGrafanaUserConfigSmtpServer? smtpServer,

            string? userAutoAssignOrg,

            string? userAutoAssignOrgRole,

            string? viewersCanEdit)
        {
            AlertingEnabled = alertingEnabled;
            AlertingErrorOrTimeout = alertingErrorOrTimeout;
            AlertingNodataOrNullvalues = alertingNodataOrNullvalues;
            AllowEmbedding = allowEmbedding;
            AuthBasicEnabled = authBasicEnabled;
            AuthGenericOauth = authGenericOauth;
            AuthGithub = authGithub;
            AuthGitlab = authGitlab;
            AuthGoogle = authGoogle;
            CookieSamesite = cookieSamesite;
            CustomDomain = customDomain;
            DashboardsMinRefreshInterval = dashboardsMinRefreshInterval;
            DashboardsVersionsToKeep = dashboardsVersionsToKeep;
            DataproxySendUserHeader = dataproxySendUserHeader;
            DataproxyTimeout = dataproxyTimeout;
            DisableGravatar = disableGravatar;
            EditorsCanAdmin = editorsCanAdmin;
            ExternalImageStorage = externalImageStorage;
            GoogleAnalyticsUaId = googleAnalyticsUaId;
            IpFilters = ipFilters;
            MetricsEnabled = metricsEnabled;
            PrivateAccess = privateAccess;
            PrivatelinkAccess = privatelinkAccess;
            ProjectToForkFrom = projectToForkFrom;
            PublicAccess = publicAccess;
            RecoveryBasebackupName = recoveryBasebackupName;
            ServiceToForkFrom = serviceToForkFrom;
            SmtpServer = smtpServer;
            UserAutoAssignOrg = userAutoAssignOrg;
            UserAutoAssignOrgRole = userAutoAssignOrgRole;
            ViewersCanEdit = viewersCanEdit;
        }
    }
}
