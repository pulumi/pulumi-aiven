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
    public sealed class GetServiceIntegrationLogsUserConfigResult
    {
        /// <summary>
        /// Elasticsearch index retention limit. Default: `3`.
        /// </summary>
        public readonly int? ElasticsearchIndexDaysMax;
        /// <summary>
        /// Elasticsearch index prefix. Default: `logs`.
        /// </summary>
        public readonly string? ElasticsearchIndexPrefix;
        /// <summary>
        /// The list of logging fields that will be sent to the integration logging service. The MESSAGE and timestamp fields are always sent.
        /// </summary>
        public readonly ImmutableArray<string> SelectedLogFields;

        [OutputConstructor]
        private GetServiceIntegrationLogsUserConfigResult(
            int? elasticsearchIndexDaysMax,

            string? elasticsearchIndexPrefix,

            ImmutableArray<string> selectedLogFields)
        {
            ElasticsearchIndexDaysMax = elasticsearchIndexDaysMax;
            ElasticsearchIndexPrefix = elasticsearchIndexPrefix;
            SelectedLogFields = selectedLogFields;
        }
    }
}
