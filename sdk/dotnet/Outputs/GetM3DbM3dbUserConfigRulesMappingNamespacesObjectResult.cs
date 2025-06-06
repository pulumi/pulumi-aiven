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
    public sealed class GetM3DbM3dbUserConfigRulesMappingNamespacesObjectResult
    {
        /// <summary>
        /// The resolution for the matching namespace. Example: `30s`.
        /// </summary>
        public readonly string Resolution;
        /// <summary>
        /// The retention period of the matching namespace. Example: `48h`.
        /// </summary>
        public readonly string? Retention;

        [OutputConstructor]
        private GetM3DbM3dbUserConfigRulesMappingNamespacesObjectResult(
            string resolution,

            string? retention)
        {
            Resolution = resolution;
            Retention = retention;
        }
    }
}
