// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aiven
{
    public static class GetOpenSearchAclRule
    {
        public static Task<GetOpenSearchAclRuleResult> InvokeAsync(GetOpenSearchAclRuleArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetOpenSearchAclRuleResult>("aiven:index/getOpenSearchAclRule:getOpenSearchAclRule", args ?? new GetOpenSearchAclRuleArgs(), options.WithDefaults());

        public static Output<GetOpenSearchAclRuleResult> Invoke(GetOpenSearchAclRuleInvokeArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.Invoke<GetOpenSearchAclRuleResult>("aiven:index/getOpenSearchAclRule:getOpenSearchAclRule", args ?? new GetOpenSearchAclRuleInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetOpenSearchAclRuleArgs : Pulumi.InvokeArgs
    {
        [Input("index", required: true)]
        public string Index { get; set; } = null!;

        [Input("permission", required: true)]
        public string Permission { get; set; } = null!;

        [Input("project", required: true)]
        public string Project { get; set; } = null!;

        [Input("serviceName", required: true)]
        public string ServiceName { get; set; } = null!;

        [Input("username", required: true)]
        public string Username { get; set; } = null!;

        public GetOpenSearchAclRuleArgs()
        {
        }
    }

    public sealed class GetOpenSearchAclRuleInvokeArgs : Pulumi.InvokeArgs
    {
        [Input("index", required: true)]
        public Input<string> Index { get; set; } = null!;

        [Input("permission", required: true)]
        public Input<string> Permission { get; set; } = null!;

        [Input("project", required: true)]
        public Input<string> Project { get; set; } = null!;

        [Input("serviceName", required: true)]
        public Input<string> ServiceName { get; set; } = null!;

        [Input("username", required: true)]
        public Input<string> Username { get; set; } = null!;

        public GetOpenSearchAclRuleInvokeArgs()
        {
        }
    }


    [OutputType]
    public sealed class GetOpenSearchAclRuleResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string Index;
        public readonly string Permission;
        public readonly string Project;
        public readonly string ServiceName;
        public readonly string Username;

        [OutputConstructor]
        private GetOpenSearchAclRuleResult(
            string id,

            string index,

            string permission,

            string project,

            string serviceName,

            string username)
        {
            Id = id;
            Index = index;
            Permission = permission;
            Project = project;
            ServiceName = serviceName;
            Username = username;
        }
    }
}