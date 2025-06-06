// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aiven.Inputs
{

    public sealed class OpenSearchOpensearchUserConfigOpensearchAuthFailureListenersGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("internalAuthenticationBackendLimiting")]
        public Input<Inputs.OpenSearchOpensearchUserConfigOpensearchAuthFailureListenersInternalAuthenticationBackendLimitingGetArgs>? InternalAuthenticationBackendLimiting { get; set; }

        /// <summary>
        /// IP address rate limiting settings
        /// </summary>
        [Input("ipRateLimiting")]
        public Input<Inputs.OpenSearchOpensearchUserConfigOpensearchAuthFailureListenersIpRateLimitingGetArgs>? IpRateLimiting { get; set; }

        public OpenSearchOpensearchUserConfigOpensearchAuthFailureListenersGetArgs()
        {
        }
        public static new OpenSearchOpensearchUserConfigOpensearchAuthFailureListenersGetArgs Empty => new OpenSearchOpensearchUserConfigOpensearchAuthFailureListenersGetArgs();
    }
}
