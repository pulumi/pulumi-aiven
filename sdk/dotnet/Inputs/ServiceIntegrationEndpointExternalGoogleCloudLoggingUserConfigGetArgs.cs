// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aiven.Inputs
{

    public sealed class ServiceIntegrationEndpointExternalGoogleCloudLoggingUserConfigGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Google Cloud Logging log id. Example: `syslog`.
        /// </summary>
        [Input("logId", required: true)]
        public Input<string> LogId { get; set; } = null!;

        /// <summary>
        /// GCP project id. Example: `snappy-photon-12345`.
        /// </summary>
        [Input("projectId", required: true)]
        public Input<string> ProjectId { get; set; } = null!;

        [Input("serviceAccountCredentials", required: true)]
        private Input<string>? _serviceAccountCredentials;

        /// <summary>
        /// This is a JSON object with the fields documented in https://cloud.google.com/iam/docs/creating-managing-service-account-keys. Example: `{"type": "service_account", ...`.
        /// </summary>
        public Input<string>? ServiceAccountCredentials
        {
            get => _serviceAccountCredentials;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _serviceAccountCredentials = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        public ServiceIntegrationEndpointExternalGoogleCloudLoggingUserConfigGetArgs()
        {
        }
        public static new ServiceIntegrationEndpointExternalGoogleCloudLoggingUserConfigGetArgs Empty => new ServiceIntegrationEndpointExternalGoogleCloudLoggingUserConfigGetArgs();
    }
}
