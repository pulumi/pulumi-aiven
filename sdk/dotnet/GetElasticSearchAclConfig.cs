// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aiven
{
    public static class GetElasticSearchAclConfig
    {
        public static Task<GetElasticSearchAclConfigResult> InvokeAsync(GetElasticSearchAclConfigArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetElasticSearchAclConfigResult>("aiven:index/getElasticSearchAclConfig:getElasticSearchAclConfig", args ?? new GetElasticSearchAclConfigArgs(), options.WithDefaults());

        public static Output<GetElasticSearchAclConfigResult> Invoke(GetElasticSearchAclConfigInvokeArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.Invoke<GetElasticSearchAclConfigResult>("aiven:index/getElasticSearchAclConfig:getElasticSearchAclConfig", args ?? new GetElasticSearchAclConfigInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetElasticSearchAclConfigArgs : Pulumi.InvokeArgs
    {
        [Input("enabled")]
        public bool? Enabled { get; set; }

        [Input("extendedAcl")]
        public bool? ExtendedAcl { get; set; }

        [Input("project", required: true)]
        public string Project { get; set; } = null!;

        [Input("serviceName", required: true)]
        public string ServiceName { get; set; } = null!;

        public GetElasticSearchAclConfigArgs()
        {
        }
    }

    public sealed class GetElasticSearchAclConfigInvokeArgs : Pulumi.InvokeArgs
    {
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        [Input("extendedAcl")]
        public Input<bool>? ExtendedAcl { get; set; }

        [Input("project", required: true)]
        public Input<string> Project { get; set; } = null!;

        [Input("serviceName", required: true)]
        public Input<string> ServiceName { get; set; } = null!;

        public GetElasticSearchAclConfigInvokeArgs()
        {
        }
    }


    [OutputType]
    public sealed class GetElasticSearchAclConfigResult
    {
        public readonly bool? Enabled;
        public readonly bool? ExtendedAcl;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string Project;
        public readonly string ServiceName;

        [OutputConstructor]
        private GetElasticSearchAclConfigResult(
            bool? enabled,

            bool? extendedAcl,

            string id,

            string project,

            string serviceName)
        {
            Enabled = enabled;
            ExtendedAcl = extendedAcl;
            Id = id;
            Project = project;
            ServiceName = serviceName;
        }
    }
}