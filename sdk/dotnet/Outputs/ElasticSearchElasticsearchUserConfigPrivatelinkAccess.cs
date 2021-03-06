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
    public sealed class ElasticSearchElasticsearchUserConfigPrivatelinkAccess
    {
        /// <summary>
        /// Allow clients to connect to elasticsearch from the public 
        /// internet for service nodes that are in a project VPC or another type of private network.
        /// </summary>
        public readonly string? Elasticsearch;
        /// <summary>
        /// Allow clients to connect to kibana from the public internet for 
        /// service nodes that are in a project VPC or another type of private network.
        /// </summary>
        public readonly string? Kibana;

        [OutputConstructor]
        private ElasticSearchElasticsearchUserConfigPrivatelinkAccess(
            string? elasticsearch,

            string? kibana)
        {
            Elasticsearch = elasticsearch;
            Kibana = kibana;
        }
    }
}
