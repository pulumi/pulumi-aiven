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
    public sealed class GetM3AggregatorM3aggregatorResult
    {
        /// <summary>
        /// M3 Aggregator HTTP URI.
        /// </summary>
        public readonly string AggregatorHttpUri;
        /// <summary>
        /// M3 Aggregator server URIs.
        /// </summary>
        public readonly ImmutableArray<string> Uris;

        [OutputConstructor]
        private GetM3AggregatorM3aggregatorResult(
            string aggregatorHttpUri,

            ImmutableArray<string> uris)
        {
            AggregatorHttpUri = aggregatorHttpUri;
            Uris = uris;
        }
    }
}