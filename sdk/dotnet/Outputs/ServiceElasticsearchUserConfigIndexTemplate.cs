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
    public sealed class ServiceElasticsearchUserConfigIndexTemplate
    {
        public readonly string? MappingNestedObjectsLimit;
        public readonly string? NumberOfReplicas;
        public readonly string? NumberOfShards;

        [OutputConstructor]
        private ServiceElasticsearchUserConfigIndexTemplate(
            string? mappingNestedObjectsLimit,

            string? numberOfReplicas,

            string? numberOfShards)
        {
            MappingNestedObjectsLimit = mappingNestedObjectsLimit;
            NumberOfReplicas = numberOfReplicas;
            NumberOfShards = numberOfShards;
        }
    }
}
