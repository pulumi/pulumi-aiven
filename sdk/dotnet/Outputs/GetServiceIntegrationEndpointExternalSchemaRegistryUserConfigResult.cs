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
    public sealed class GetServiceIntegrationEndpointExternalSchemaRegistryUserConfigResult
    {
        public readonly string? Authentication;
        public readonly string? BasicAuthPassword;
        public readonly string? BasicAuthUsername;
        public readonly string? Url;

        [OutputConstructor]
        private GetServiceIntegrationEndpointExternalSchemaRegistryUserConfigResult(
            string? authentication,

            string? basicAuthPassword,

            string? basicAuthUsername,

            string? url)
        {
            Authentication = authentication;
            BasicAuthPassword = basicAuthPassword;
            BasicAuthUsername = basicAuthUsername;
            Url = url;
        }
    }
}
