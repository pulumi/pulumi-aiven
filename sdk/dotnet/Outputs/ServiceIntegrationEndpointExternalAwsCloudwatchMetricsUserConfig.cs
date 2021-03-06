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
    public sealed class ServiceIntegrationEndpointExternalAwsCloudwatchMetricsUserConfig
    {
        public readonly string? AccessKey;
        public readonly string? Namespace;
        public readonly string? Region;
        public readonly string? SecretKey;

        [OutputConstructor]
        private ServiceIntegrationEndpointExternalAwsCloudwatchMetricsUserConfig(
            string? accessKey,

            string? @namespace,

            string? region,

            string? secretKey)
        {
            AccessKey = accessKey;
            Namespace = @namespace;
            Region = region;
            SecretKey = secretKey;
        }
    }
}
