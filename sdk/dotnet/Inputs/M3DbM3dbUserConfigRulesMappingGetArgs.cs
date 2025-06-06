// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aiven.Inputs
{

    public sealed class M3DbM3dbUserConfigRulesMappingGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("aggregations")]
        private InputList<string>? _aggregations;

        /// <summary>
        /// List of aggregations to be applied.
        /// </summary>
        public InputList<string> Aggregations
        {
            get => _aggregations ?? (_aggregations = new InputList<string>());
            set => _aggregations = value;
        }

        /// <summary>
        /// Only store the derived metric (as specified in the roll-up rules), if any.
        /// </summary>
        [Input("drop")]
        public Input<bool>? Drop { get; set; }

        /// <summary>
        /// Matching metric names with wildcards (using **name**:wildcard) or matching tags and their (optionally wildcarded) values. For value, ! can be used at start of value for negation, and multiple filters can be supplied using space as separator. Example: `__name__:disk_* host:important-42 mount:!*/sda`.
        /// </summary>
        [Input("filter", required: true)]
        public Input<string> Filter { get; set; } = null!;

        /// <summary>
        /// The (optional) name of the rule. Example: `important disk metrics`.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("namespaces")]
        private InputList<string>? _namespaces;

        /// <summary>
        /// This rule will be used to store the metrics in the given namespace(s). If a namespace is target of rules, the global default aggregation will be automatically disabled. Note that specifying filters that match no namespaces whatsoever will be returned as an error. Filter the namespace by glob (=wildcards).
        /// </summary>
        [Obsolete(@"Deprecated. Use `namespaces_string` instead.")]
        public InputList<string> Namespaces
        {
            get => _namespaces ?? (_namespaces = new InputList<string>());
            set => _namespaces = value;
        }

        [Input("namespacesObjects")]
        private InputList<Inputs.M3DbM3dbUserConfigRulesMappingNamespacesObjectGetArgs>? _namespacesObjects;

        /// <summary>
        /// This rule will be used to store the metrics in the given namespace(s). If a namespace is target of rules, the global default aggregation will be automatically disabled. Note that specifying filters that match no namespaces whatsoever will be returned as an error. Filter the namespace by exact match of retention period and resolution
        /// </summary>
        public InputList<Inputs.M3DbM3dbUserConfigRulesMappingNamespacesObjectGetArgs> NamespacesObjects
        {
            get => _namespacesObjects ?? (_namespacesObjects = new InputList<Inputs.M3DbM3dbUserConfigRulesMappingNamespacesObjectGetArgs>());
            set => _namespacesObjects = value;
        }

        [Input("namespacesStrings")]
        private InputList<string>? _namespacesStrings;

        /// <summary>
        /// This rule will be used to store the metrics in the given namespace(s). If a namespace is target of rules, the global default aggregation will be automatically disabled. Note that specifying filters that match no namespaces whatsoever will be returned as an error. Filter the namespace by glob (=wildcards).
        /// </summary>
        public InputList<string> NamespacesStrings
        {
            get => _namespacesStrings ?? (_namespacesStrings = new InputList<string>());
            set => _namespacesStrings = value;
        }

        [Input("tags")]
        private InputList<Inputs.M3DbM3dbUserConfigRulesMappingTagGetArgs>? _tags;

        /// <summary>
        /// List of tags to be appended to matching metrics
        /// </summary>
        public InputList<Inputs.M3DbM3dbUserConfigRulesMappingTagGetArgs> Tags
        {
            get => _tags ?? (_tags = new InputList<Inputs.M3DbM3dbUserConfigRulesMappingTagGetArgs>());
            set => _tags = value;
        }

        public M3DbM3dbUserConfigRulesMappingGetArgs()
        {
        }
        public static new M3DbM3dbUserConfigRulesMappingGetArgs Empty => new M3DbM3dbUserConfigRulesMappingGetArgs();
    }
}
