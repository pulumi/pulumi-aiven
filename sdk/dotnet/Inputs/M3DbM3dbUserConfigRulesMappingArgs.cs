// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aiven.Inputs
{

    public sealed class M3DbM3dbUserConfigRulesMappingArgs : Pulumi.ResourceArgs
    {
        [Input("aggregations")]
        private InputList<string>? _aggregations;

        /// <summary>
        /// List of aggregations to be applied
        /// </summary>
        public InputList<string> Aggregations
        {
            get => _aggregations ?? (_aggregations = new InputList<string>());
            set => _aggregations = value;
        }

        /// <summary>
        /// Drop the matching metric; Only store the derived metric (as specified in the roll-up rules), if any.
        /// </summary>
        [Input("drop")]
        public Input<string>? Drop { get; set; }

        /// <summary>
        /// The metrics to be used with this particular rule; Matching metric names with wildcards (using
        /// __name__:wildcard) or matching tags and their (optionally wildcarded) values. For value, !
        /// can be used at start of value for negation, and multiple filters can be supplied using space as separator.
        /// </summary>
        [Input("filter")]
        public Input<string>? Filter { get; set; }

        /// <summary>
        /// The name of the namespace
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("tags")]
        private InputList<Inputs.M3DbM3dbUserConfigRulesMappingTagArgs>? _tags;

        /// <summary>
        /// List of tags to be appended to matching metrics.
        /// </summary>
        public InputList<Inputs.M3DbM3dbUserConfigRulesMappingTagArgs> Tags
        {
            get => _tags ?? (_tags = new InputList<Inputs.M3DbM3dbUserConfigRulesMappingTagArgs>());
            set => _tags = value;
        }

        public M3DbM3dbUserConfigRulesMappingArgs()
        {
        }
    }
}