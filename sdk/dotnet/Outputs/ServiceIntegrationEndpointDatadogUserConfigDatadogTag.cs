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
    public sealed class ServiceIntegrationEndpointDatadogUserConfigDatadogTag
    {
        /// <summary>
        /// Optional tag explanation.
        /// </summary>
        public readonly string? Comment;
        /// <summary>
        /// Tag format and usage are described here: https://docs.datadoghq.com/getting_started/tagging. Tags with prefix 'aiven-' are reserved for Aiven.
        /// </summary>
        public readonly string Tag;

        [OutputConstructor]
        private ServiceIntegrationEndpointDatadogUserConfigDatadogTag(
            string? comment,

            string tag)
        {
            Comment = comment;
            Tag = tag;
        }
    }
}