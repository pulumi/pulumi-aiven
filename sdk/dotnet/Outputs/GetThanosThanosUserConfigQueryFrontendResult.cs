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
    public sealed class GetThanosThanosUserConfigQueryFrontendResult
    {
        /// <summary>
        /// Whether to align the query range boundaries with the step. If enabled, the query range boundaries will be aligned to the step, providing more accurate results for queries with high-resolution data. Default: `true`.
        /// </summary>
        public readonly bool? QueryRangeAlignRangeWithStep;

        [OutputConstructor]
        private GetThanosThanosUserConfigQueryFrontendResult(bool? queryRangeAlignRangeWithStep)
        {
            QueryRangeAlignRangeWithStep = queryRangeAlignRangeWithStep;
        }
    }
}
