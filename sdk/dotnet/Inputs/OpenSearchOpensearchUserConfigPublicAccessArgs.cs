// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aiven.Inputs
{

    public sealed class OpenSearchOpensearchUserConfigPublicAccessArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// OpenSearch settings
        /// </summary>
        [Input("opensearch")]
        public Input<bool>? Opensearch { get; set; }

        /// <summary>
        /// OpenSearch Dashboards settings
        /// </summary>
        [Input("opensearchDashboards")]
        public Input<bool>? OpensearchDashboards { get; set; }

        /// <summary>
        /// Allow clients to connect to prometheus with a DNS name that always resolves to the service's private IP addresses. Only available in certain network locations.
        /// </summary>
        [Input("prometheus")]
        public Input<bool>? Prometheus { get; set; }

        public OpenSearchOpensearchUserConfigPublicAccessArgs()
        {
        }
        public static new OpenSearchOpensearchUserConfigPublicAccessArgs Empty => new OpenSearchOpensearchUserConfigPublicAccessArgs();
    }
}
