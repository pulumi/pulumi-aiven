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
    public sealed class GetServiceIntegrationClickhousePostgresqlUserConfigDatabaseResult
    {
        /// <summary>
        /// PostgreSQL database to expose. Default: `defaultdb`.
        /// </summary>
        public readonly string? Database;
        /// <summary>
        /// PostgreSQL schema to expose. Default: `public`.
        /// </summary>
        public readonly string? Schema;

        [OutputConstructor]
        private GetServiceIntegrationClickhousePostgresqlUserConfigDatabaseResult(
            string? database,

            string? schema)
        {
            Database = database;
            Schema = schema;
        }
    }
}
