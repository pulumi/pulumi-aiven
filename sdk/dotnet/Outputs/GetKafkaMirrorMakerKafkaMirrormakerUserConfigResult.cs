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
    public sealed class GetKafkaMirrorMakerKafkaMirrormakerUserConfigResult
    {
        public readonly ImmutableArray<string> IpFilters;
        public readonly Outputs.GetKafkaMirrorMakerKafkaMirrormakerUserConfigKafkaMirrormakerResult? KafkaMirrormaker;

        [OutputConstructor]
        private GetKafkaMirrorMakerKafkaMirrormakerUserConfigResult(
            ImmutableArray<string> ipFilters,

            Outputs.GetKafkaMirrorMakerKafkaMirrormakerUserConfigKafkaMirrormakerResult? kafkaMirrormaker)
        {
            IpFilters = ipFilters;
            KafkaMirrormaker = kafkaMirrormaker;
        }
    }
}