// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aiven.Inputs
{

    public sealed class ThanosTechEmailArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// An email address to contact for technical issues
        /// </summary>
        [Input("email", required: true)]
        public Input<string> Email { get; set; } = null!;

        public ThanosTechEmailArgs()
        {
        }
        public static new ThanosTechEmailArgs Empty => new ThanosTechEmailArgs();
    }
}
