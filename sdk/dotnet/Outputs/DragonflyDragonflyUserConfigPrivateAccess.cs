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
    public sealed class DragonflyDragonflyUserConfigPrivateAccess
    {
        /// <summary>
        /// Allow clients to connect to dragonfly with a DNS name that always resolves to the service's private IP addresses. Only available in certain network locations.
        /// </summary>
        public readonly bool? Dragonfly;
        /// <summary>
        /// Allow clients to connect to prometheus with a DNS name that always resolves to the service's private IP addresses. Only available in certain network locations.
        /// </summary>
        public readonly bool? Prometheus;

        [OutputConstructor]
        private DragonflyDragonflyUserConfigPrivateAccess(
            bool? dragonfly,

            bool? prometheus)
        {
            Dragonfly = dragonfly;
            Prometheus = prometheus;
        }
    }
}