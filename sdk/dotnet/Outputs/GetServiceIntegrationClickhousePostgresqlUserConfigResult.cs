// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aiven.Outputs
{

    [OutputType]
    public sealed class GetServiceIntegrationClickhousePostgresqlUserConfigResult
    {
        /// <summary>
        /// Databases to expose
        /// </summary>
        public readonly ImmutableArray<Outputs.GetServiceIntegrationClickhousePostgresqlUserConfigDatabaseResult> Databases;

        [OutputConstructor]
        private GetServiceIntegrationClickhousePostgresqlUserConfigResult(ImmutableArray<Outputs.GetServiceIntegrationClickhousePostgresqlUserConfigDatabaseResult> databases)
        {
            Databases = databases;
        }
    }
}
