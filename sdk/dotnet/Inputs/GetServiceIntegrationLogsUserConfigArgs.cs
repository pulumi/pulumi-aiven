// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aiven.Inputs
{

    public sealed class GetServiceIntegrationLogsUserConfigArgs : Pulumi.InvokeArgs
    {
        [Input("elasticsearchIndexDaysMax")]
        public string? ElasticsearchIndexDaysMax { get; set; }

        [Input("elasticsearchIndexPrefix")]
        public string? ElasticsearchIndexPrefix { get; set; }

        public GetServiceIntegrationLogsUserConfigArgs()
        {
        }
    }
}
