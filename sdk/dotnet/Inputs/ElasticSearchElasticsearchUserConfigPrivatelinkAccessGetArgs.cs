// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aiven.Inputs
{

    public sealed class ElasticSearchElasticsearchUserConfigPrivatelinkAccessGetArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Allow clients to connect to elasticsearch from the public 
        /// internet for service nodes that are in a project VPC or another type of private network.
        /// </summary>
        [Input("elasticsearch")]
        public Input<string>? Elasticsearch { get; set; }

        /// <summary>
        /// Allow clients to connect to kibana from the public internet for 
        /// service nodes that are in a project VPC or another type of private network.
        /// </summary>
        [Input("kibana")]
        public Input<string>? Kibana { get; set; }

        public ElasticSearchElasticsearchUserConfigPrivatelinkAccessGetArgs()
        {
        }
    }
}