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
    public sealed class GetM3AggregatorServiceIntegrationResult
    {
        public readonly string IntegrationType;
        public readonly string SourceServiceName;

        [OutputConstructor]
        private GetM3AggregatorServiceIntegrationResult(
            string integrationType,

            string sourceServiceName)
        {
            IntegrationType = integrationType;
            SourceServiceName = sourceServiceName;
        }
    }
}