// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aiven
{
    public static class GetOpenSearchAclConfig
    {
        /// <summary>
        /// Gets information about access control for an Aiven for OpenSearch® service.
        /// 
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Aiven = Pulumi.Aiven;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var os_acl_config = Aiven.GetOpenSearchAclConfig.Invoke(new()
        ///     {
        ///         Project = exampleProject.Project,
        ///         ServiceName = exampleOpensearch.ServiceName,
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetOpenSearchAclConfigResult> InvokeAsync(GetOpenSearchAclConfigArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetOpenSearchAclConfigResult>("aiven:index/getOpenSearchAclConfig:getOpenSearchAclConfig", args ?? new GetOpenSearchAclConfigArgs(), options.WithDefaults());

        /// <summary>
        /// Gets information about access control for an Aiven for OpenSearch® service.
        /// 
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Aiven = Pulumi.Aiven;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var os_acl_config = Aiven.GetOpenSearchAclConfig.Invoke(new()
        ///     {
        ///         Project = exampleProject.Project,
        ///         ServiceName = exampleOpensearch.ServiceName,
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetOpenSearchAclConfigResult> Invoke(GetOpenSearchAclConfigInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetOpenSearchAclConfigResult>("aiven:index/getOpenSearchAclConfig:getOpenSearchAclConfig", args ?? new GetOpenSearchAclConfigInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// Gets information about access control for an Aiven for OpenSearch® service.
        /// 
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Aiven = Pulumi.Aiven;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var os_acl_config = Aiven.GetOpenSearchAclConfig.Invoke(new()
        ///     {
        ///         Project = exampleProject.Project,
        ///         ServiceName = exampleOpensearch.ServiceName,
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetOpenSearchAclConfigResult> Invoke(GetOpenSearchAclConfigInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetOpenSearchAclConfigResult>("aiven:index/getOpenSearchAclConfig:getOpenSearchAclConfig", args ?? new GetOpenSearchAclConfigInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetOpenSearchAclConfigArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The name of the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
        /// </summary>
        [Input("project", required: true)]
        public string Project { get; set; } = null!;

        /// <summary>
        /// The name of the service that this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
        /// </summary>
        [Input("serviceName", required: true)]
        public string ServiceName { get; set; } = null!;

        public GetOpenSearchAclConfigArgs()
        {
        }
        public static new GetOpenSearchAclConfigArgs Empty => new GetOpenSearchAclConfigArgs();
    }

    public sealed class GetOpenSearchAclConfigInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The name of the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
        /// </summary>
        [Input("project", required: true)]
        public Input<string> Project { get; set; } = null!;

        /// <summary>
        /// The name of the service that this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
        /// </summary>
        [Input("serviceName", required: true)]
        public Input<string> ServiceName { get; set; } = null!;

        public GetOpenSearchAclConfigInvokeArgs()
        {
        }
        public static new GetOpenSearchAclConfigInvokeArgs Empty => new GetOpenSearchAclConfigInvokeArgs();
    }


    [OutputType]
    public sealed class GetOpenSearchAclConfigResult
    {
        /// <summary>
        /// Enable OpenSearch ACLs. When disabled, authenticated service users have unrestricted access. The default value is `true`.
        /// </summary>
        public readonly bool Enabled;
        /// <summary>
        /// Index rules can be applied in a limited fashion to the _mget, _msearch and _bulk APIs (and only those) by enabling the ExtendedAcl option for the service. When it is enabled, users can use these APIs as long as all operations only target indexes they have been granted access to. The default value is `true`.
        /// </summary>
        public readonly bool ExtendedAcl;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The name of the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
        /// </summary>
        public readonly string Project;
        /// <summary>
        /// The name of the service that this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
        /// </summary>
        public readonly string ServiceName;

        [OutputConstructor]
        private GetOpenSearchAclConfigResult(
            bool enabled,

            bool extendedAcl,

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
