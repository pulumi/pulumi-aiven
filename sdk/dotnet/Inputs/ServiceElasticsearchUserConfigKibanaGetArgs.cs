// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aiven.Inputs
{

    public sealed class ServiceElasticsearchUserConfigKibanaGetArgs : Pulumi.ResourceArgs
    {
        [Input("elasticsearchRequestTimeout")]
        public Input<string>? ElasticsearchRequestTimeout { get; set; }

        [Input("enabled")]
        public Input<string>? Enabled { get; set; }

        [Input("maxOldSpaceSize")]
        public Input<string>? MaxOldSpaceSize { get; set; }

        public ServiceElasticsearchUserConfigKibanaGetArgs()
        {
        }
    }
}
