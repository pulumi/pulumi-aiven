// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aiven.Inputs
{

    public sealed class ElasticSearchElasticsearchUserConfigArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Serve the web frontend using a custom CNAME pointing to the 
        /// Aiven DNS name.
        /// </summary>
        [Input("customDomain")]
        public Input<string>? CustomDomain { get; set; }

        /// <summary>
        /// Disable automatic replication factor 
        /// adjustment for multi-node services. By default, Aiven ensures all indexes are replicated at
        /// least to two nodes. Note: setting this to true increases a risk of data loss in case of
        /// virtual machine failure.
        /// </summary>
        [Input("disableReplicationFactorAdjustment")]
        public Input<string>? DisableReplicationFactorAdjustment { get; set; }

        /// <summary>
        /// Allow clients to connect to elasticsearch from the public 
        /// internet for service nodes that are in a project VPC or another type of private network.
        /// </summary>
        [Input("elasticsearch")]
        public Input<Inputs.ElasticSearchElasticsearchUserConfigElasticsearchArgs>? Elasticsearch { get; set; }

        /// <summary>
        /// Elasticsearch major version.
        /// </summary>
        [Input("elasticsearchVersion")]
        public Input<string>? ElasticsearchVersion { get; set; }

        [Input("indexPatterns")]
        private InputList<Inputs.ElasticSearchElasticsearchUserConfigIndexPatternArgs>? _indexPatterns;

        /// <summary>
        /// Glob pattern and number of indexes matching that pattern to 
        /// be kept.
        /// </summary>
        public InputList<Inputs.ElasticSearchElasticsearchUserConfigIndexPatternArgs> IndexPatterns
        {
            get => _indexPatterns ?? (_indexPatterns = new InputList<Inputs.ElasticSearchElasticsearchUserConfigIndexPatternArgs>());
            set => _indexPatterns = value;
        }

        /// <summary>
        /// Template settings for all new indexe.
        /// </summary>
        [Input("indexTemplate")]
        public Input<Inputs.ElasticSearchElasticsearchUserConfigIndexTemplateArgs>? IndexTemplate { get; set; }

        [Input("ipFilters")]
        private InputList<string>? _ipFilters;

        /// <summary>
        /// allow incoming connections from CIDR address block, e.g. `10.20.0.0/16`
        /// </summary>
        public InputList<string> IpFilters
        {
            get => _ipFilters ?? (_ipFilters = new InputList<string>());
            set => _ipFilters = value;
        }

        /// <summary>
        /// Allow clients to connect to kibana from the public internet for 
        /// service nodes that are in a project VPC or another type of private network.
        /// </summary>
        [Input("kibana")]
        public Input<Inputs.ElasticSearchElasticsearchUserConfigKibanaArgs>? Kibana { get; set; }

        /// <summary>
        /// Maximum number of indexes to keep before deleting the oldest one.
        /// </summary>
        [Input("maxIndexCount")]
        public Input<string>? MaxIndexCount { get; set; }

        /// <summary>
        /// Allow access to selected service ports from private networks.
        /// </summary>
        [Input("privateAccess")]
        public Input<Inputs.ElasticSearchElasticsearchUserConfigPrivateAccessArgs>? PrivateAccess { get; set; }

        /// <summary>
        /// Allow access to selected service components through Privatelink
        /// </summary>
        [Input("privatelinkAccess")]
        public Input<Inputs.ElasticSearchElasticsearchUserConfigPrivatelinkAccessArgs>? PrivatelinkAccess { get; set; }

        /// <summary>
        /// Name of another project to fork a service from. This has 
        /// effect only when a new service is being created.
        /// </summary>
        [Input("projectToForkFrom")]
        public Input<string>? ProjectToForkFrom { get; set; }

        /// <summary>
        /// Allow access to selected service ports from the public Internet.
        /// </summary>
        [Input("publicAccess")]
        public Input<Inputs.ElasticSearchElasticsearchUserConfigPublicAccessArgs>? PublicAccess { get; set; }

        /// <summary>
        /// Name of the basebackup to restore in forked service.
        /// </summary>
        [Input("recoveryBasebackupName")]
        public Input<string>? RecoveryBasebackupName { get; set; }

        /// <summary>
        /// Name of another service to fork from. This has effect 
        /// only when a new service is being created.
        /// </summary>
        [Input("serviceToForkFrom")]
        public Input<string>? ServiceToForkFrom { get; set; }

        public ElasticSearchElasticsearchUserConfigArgs()
        {
        }
    }
}
