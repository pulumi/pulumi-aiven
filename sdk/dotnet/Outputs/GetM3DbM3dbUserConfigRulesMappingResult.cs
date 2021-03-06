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
    public sealed class GetM3DbM3dbUserConfigRulesMappingResult
    {
        /// <summary>
        /// List of aggregations to be applied
        /// </summary>
        public readonly ImmutableArray<string> Aggregations;
        /// <summary>
        /// Drop the matching metric; Only store the derived metric (as specified in the roll-up rules), if any.
        /// </summary>
        public readonly string? Drop;
        /// <summary>
        /// The metrics to be used with this particular rule; Matching metric names with wildcards (using
        /// __name__:wildcard) or matching tags and their (optionally wildcarded) values. For value, !
        /// can be used at start of value for negation, and multiple filters can be supplied using space as separator.
        /// </summary>
        public readonly string? Filter;
        /// <summary>
        /// The name of the namespace
        /// </summary>
        public readonly string? Name;
        /// <summary>
        /// List of tags to be appended to matching metrics.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetM3DbM3dbUserConfigRulesMappingTagResult> Tags;

        [OutputConstructor]
        private GetM3DbM3dbUserConfigRulesMappingResult(
            ImmutableArray<string> aggregations,

            string? drop,

            string? filter,

            string? name,

            ImmutableArray<Outputs.GetM3DbM3dbUserConfigRulesMappingTagResult> tags)
        {
            Aggregations = aggregations;
            Drop = drop;
            Filter = filter;
            Name = name;
            Tags = tags;
        }
    }
}
