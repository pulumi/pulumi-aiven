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
    public sealed class GetM3DbM3dbUserConfigRulesResult
    {
        public readonly ImmutableArray<Outputs.GetM3DbM3dbUserConfigRulesMappingResult> Mappings;

        [OutputConstructor]
        private GetM3DbM3dbUserConfigRulesResult(ImmutableArray<Outputs.GetM3DbM3dbUserConfigRulesMappingResult> mappings)
        {
            Mappings = mappings;
        }
    }
}