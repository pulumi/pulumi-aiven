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
    public sealed class KafkaMirrorMakerKafkaMirrormakerUserConfig
    {
        /// <summary>
        /// allow incoming connections from CIDR address block, e.g. `10.20.0.0/16`
        /// </summary>
        public readonly ImmutableArray<string> IpFilters;
        /// <summary>
        /// Kafka MirrorMaker configuration values
        /// </summary>
        public readonly Outputs.KafkaMirrorMakerKafkaMirrormakerUserConfigKafkaMirrormaker? KafkaMirrormaker;

        [OutputConstructor]
        private KafkaMirrorMakerKafkaMirrormakerUserConfig(
            ImmutableArray<string> ipFilters,

            Outputs.KafkaMirrorMakerKafkaMirrormakerUserConfigKafkaMirrormaker? kafkaMirrormaker)
        {
            IpFilters = ipFilters;
            KafkaMirrormaker = kafkaMirrormaker;
        }
    }
}
