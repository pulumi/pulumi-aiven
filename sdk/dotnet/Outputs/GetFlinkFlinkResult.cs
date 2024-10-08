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
    public sealed class GetFlinkFlinkResult
    {
        /// <summary>
        /// The host and port of a Flink server.
        /// </summary>
        public readonly ImmutableArray<string> HostPorts;

        [OutputConstructor]
        private GetFlinkFlinkResult(ImmutableArray<string> hostPorts)
        {
            HostPorts = hostPorts;
        }
    }
}
