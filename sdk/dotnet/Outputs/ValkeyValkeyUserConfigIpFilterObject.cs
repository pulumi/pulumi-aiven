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
    public sealed class ValkeyValkeyUserConfigIpFilterObject
    {
        /// <summary>
        /// Description for IP filter list entry. Example: `Production service IP range`.
        /// </summary>
        public readonly string? Description;
        /// <summary>
        /// CIDR address block. Example: `10.20.0.0/16`.
        /// </summary>
        public readonly string Network;

        [OutputConstructor]
        private ValkeyValkeyUserConfigIpFilterObject(
            string? description,

            string network)
        {
            Description = description;
            Network = network;
        }
    }
}