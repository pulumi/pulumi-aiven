// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aiven.Inputs
{

    public sealed class GetM3DbM3dbUserConfigRulesMappingArgs : Pulumi.InvokeArgs
    {
        [Input("aggregations")]
        private List<string>? _aggregations;

        /// <summary>
        /// List of aggregations to be applied
        /// </summary>
        public List<string> Aggregations
        {
            get => _aggregations ?? (_aggregations = new List<string>());
            set => _aggregations = value;
        }

        /// <summary>
        /// Drop the matching metric; Only store the derived metric (as specified in the roll-up rules), if any.
        /// </summary>
        [Input("drop")]
        public string? Drop { get; set; }

        /// <summary>
        /// The metrics to be used with this particular rule; Matching metric names with wildcards (using
        /// __name__:wildcard) or matching tags and their (optionally wildcarded) values. For value, !
        /// can be used at start of value for negation, and multiple filters can be supplied using space as separator.
        /// </summary>
        [Input("filter")]
        public string? Filter { get; set; }

        /// <summary>
        /// The name of the namespace
        /// </summary>
        [Input("name")]
        public string? Name { get; set; }

        [Input("tags")]
        private List<Inputs.GetM3DbM3dbUserConfigRulesMappingTagArgs>? _tags;

        /// <summary>
        /// List of tags to be appended to matching metrics.
        /// </summary>
        public List<Inputs.GetM3DbM3dbUserConfigRulesMappingTagArgs> Tags
        {
            get => _tags ?? (_tags = new List<Inputs.GetM3DbM3dbUserConfigRulesMappingTagArgs>());
            set => _tags = value;
        }

        public GetM3DbM3dbUserConfigRulesMappingArgs()
        {
        }
    }
}