// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aiven.Inputs
{

    public sealed class M3DbM3dbUserConfigPrivateAccessGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Allow clients to connect to m3coordinator with a DNS name that always resolves to the service's private IP addresses. Only available in certain network locations.
        /// </summary>
        [Input("m3coordinator")]
        public Input<bool>? M3coordinator { get; set; }

        public M3DbM3dbUserConfigPrivateAccessGetArgs()
        {
        }
        public static new M3DbM3dbUserConfigPrivateAccessGetArgs Empty => new M3DbM3dbUserConfigPrivateAccessGetArgs();
    }
}
