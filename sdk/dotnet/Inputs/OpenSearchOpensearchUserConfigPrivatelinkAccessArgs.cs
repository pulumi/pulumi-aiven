// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aiven.Inputs
{

    public sealed class OpenSearchOpensearchUserConfigPrivatelinkAccessArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Enable opensearch.
        /// </summary>
        [Input("opensearch")]
        public Input<bool>? Opensearch { get; set; }

        /// <summary>
        /// Enable opensearch_dashboards.
        /// </summary>
        [Input("opensearchDashboards")]
        public Input<bool>? OpensearchDashboards { get; set; }

        /// <summary>
        /// Enable prometheus.
        /// </summary>
        [Input("prometheus")]
        public Input<bool>? Prometheus { get; set; }

        public OpenSearchOpensearchUserConfigPrivatelinkAccessArgs()
        {
        }
        public static new OpenSearchOpensearchUserConfigPrivatelinkAccessArgs Empty => new OpenSearchOpensearchUserConfigPrivatelinkAccessArgs();
    }
}
