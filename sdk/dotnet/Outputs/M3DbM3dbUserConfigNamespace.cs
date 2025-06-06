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
    public sealed class M3DbM3dbUserConfigNamespace
    {
        /// <summary>
        /// The name of the namespace. Example: `default`.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// Namespace options
        /// </summary>
        public readonly Outputs.M3DbM3dbUserConfigNamespaceOptions? Options;
        /// <summary>
        /// The resolution for an aggregated namespace. Example: `30s`.
        /// </summary>
        public readonly string? Resolution;
        /// <summary>
        /// Enum: `aggregated`, `unaggregated`. The type of aggregation (aggregated/unaggregated).
        /// </summary>
        public readonly string Type;

        [OutputConstructor]
        private M3DbM3dbUserConfigNamespace(
            string name,

            Outputs.M3DbM3dbUserConfigNamespaceOptions? options,

            string? resolution,

            string type)
        {
            Name = name;
            Options = options;
            Resolution = resolution;
            Type = type;
        }
    }
}
