// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aiven.Inputs
{

    public sealed class ServiceIntegrationEndpointExternalGoogleCloudBigqueryArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// GCP project id. Example: `snappy-photon-12345`.
        /// </summary>
        [Input("projectId", required: true)]
        public Input<string> ProjectId { get; set; } = null!;

        /// <summary>
        /// This is a JSON object with the fields documented in https://cloud.google.com/iam/docs/creating-managing-service-account-keys. Example: `{"type": "service_account", ...`.
        /// </summary>
        [Input("serviceAccountCredentials", required: true)]
        public Input<string> ServiceAccountCredentials { get; set; } = null!;

        public ServiceIntegrationEndpointExternalGoogleCloudBigqueryArgs()
        {
        }
        public static new ServiceIntegrationEndpointExternalGoogleCloudBigqueryArgs Empty => new ServiceIntegrationEndpointExternalGoogleCloudBigqueryArgs();
    }
}
