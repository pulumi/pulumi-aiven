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
    public sealed class M3DbM3dbUserConfigPublicAccess
    {
        /// <summary>
        /// Allow clients to connect to m3coordinator from the public internet 
        /// for service nodes that are in a project VPC or another type of private network.
        /// </summary>
        public readonly string? M3coordinator;

        [OutputConstructor]
        private M3DbM3dbUserConfigPublicAccess(string? m3coordinator)
        {
            M3coordinator = m3coordinator;
        }
    }
}