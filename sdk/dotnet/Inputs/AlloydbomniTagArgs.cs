// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aiven.Inputs
{

    public sealed class AlloydbomniTagArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Service tag key
        /// </summary>
        [Input("key", required: true)]
        public Input<string> Key { get; set; } = null!;

        /// <summary>
        /// Service tag value
        /// </summary>
        [Input("value", required: true)]
        public Input<string> Value { get; set; } = null!;

        public AlloydbomniTagArgs()
        {
        }
        public static new AlloydbomniTagArgs Empty => new AlloydbomniTagArgs();
    }
}
