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
    public sealed class ServiceOpensearchUserConfigOpensearchDashboards
    {
        public readonly string? Enabled;
        public readonly string? MaxOldSpaceSize;
        public readonly string? OpensearchRequestTimeout;

        [OutputConstructor]
        private ServiceOpensearchUserConfigOpensearchDashboards(
            string? enabled,

            string? maxOldSpaceSize,

            string? opensearchRequestTimeout)
        {
            Enabled = enabled;
            MaxOldSpaceSize = maxOldSpaceSize;
            OpensearchRequestTimeout = opensearchRequestTimeout;
        }
    }
}