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
    public sealed class ServiceIntegrationFlinkExternalPostgresqlUserConfig
    {
        /// <summary>
        /// Enum: `unspecified`. If stringtype is set to unspecified, parameters will be sent to the server as untyped values.
        /// </summary>
        public readonly string? Stringtype;

        [OutputConstructor]
        private ServiceIntegrationFlinkExternalPostgresqlUserConfig(string? stringtype)
        {
            Stringtype = stringtype;
        }
    }
}