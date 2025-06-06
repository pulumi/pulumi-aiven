// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aiven.Inputs
{

    public sealed class OpenSearchOpensearchUserConfigOpensearchSearchInsightsTopQueriesGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Top N queries monitoring by CPU
        /// </summary>
        [Input("cpu")]
        public Input<Inputs.OpenSearchOpensearchUserConfigOpensearchSearchInsightsTopQueriesCpuGetArgs>? Cpu { get; set; }

        /// <summary>
        /// Top N queries monitoring by latency
        /// </summary>
        [Input("latency")]
        public Input<Inputs.OpenSearchOpensearchUserConfigOpensearchSearchInsightsTopQueriesLatencyGetArgs>? Latency { get; set; }

        /// <summary>
        /// Top N queries monitoring by memory
        /// </summary>
        [Input("memory")]
        public Input<Inputs.OpenSearchOpensearchUserConfigOpensearchSearchInsightsTopQueriesMemoryGetArgs>? Memory { get; set; }

        public OpenSearchOpensearchUserConfigOpensearchSearchInsightsTopQueriesGetArgs()
        {
        }
        public static new OpenSearchOpensearchUserConfigOpensearchSearchInsightsTopQueriesGetArgs Empty => new OpenSearchOpensearchUserConfigOpensearchSearchInsightsTopQueriesGetArgs();
    }
}
