// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aiven
{
    public static class GetAzurePrivatelink
    {
        /// <summary>
        /// The Azure Privatelink resource allows the creation and management of Aiven Azure Privatelink for a services.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using Pulumi;
        /// using Aiven = Pulumi.Aiven;
        /// 
        /// class MyStack : Stack
        /// {
        ///     public MyStack()
        ///     {
        ///         var foo = Output.Create(Aiven.GetAzurePrivatelink.InvokeAsync(new Aiven.GetAzurePrivatelinkArgs
        ///         {
        ///             Project = data.Aiven_project.Foo.Project,
        ///             ServiceName = aiven_kafka.Bar.Service_name,
        ///         }));
        ///     }
        /// 
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetAzurePrivatelinkResult> InvokeAsync(GetAzurePrivatelinkArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetAzurePrivatelinkResult>("aiven:index/getAzurePrivatelink:getAzurePrivatelink", args ?? new GetAzurePrivatelinkArgs(), options.WithDefaults());

        /// <summary>
        /// The Azure Privatelink resource allows the creation and management of Aiven Azure Privatelink for a services.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using Pulumi;
        /// using Aiven = Pulumi.Aiven;
        /// 
        /// class MyStack : Stack
        /// {
        ///     public MyStack()
        ///     {
        ///         var foo = Output.Create(Aiven.GetAzurePrivatelink.InvokeAsync(new Aiven.GetAzurePrivatelinkArgs
        ///         {
        ///             Project = data.Aiven_project.Foo.Project,
        ///             ServiceName = aiven_kafka.Bar.Service_name,
        ///         }));
        ///     }
        /// 
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetAzurePrivatelinkResult> Invoke(GetAzurePrivatelinkInvokeArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.Invoke<GetAzurePrivatelinkResult>("aiven:index/getAzurePrivatelink:getAzurePrivatelink", args ?? new GetAzurePrivatelinkInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetAzurePrivatelinkArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// Identifies the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. This property cannot be changed, doing so forces recreation of the resource.
        /// </summary>
        [Input("project", required: true)]
        public string Project { get; set; } = null!;

        /// <summary>
        /// Specifies the name of the service that this resource belongs to. To set up proper dependencies please refer to this variable as a reference. This property cannot be changed, doing so forces recreation of the resource.
        /// </summary>
        [Input("serviceName", required: true)]
        public string ServiceName { get; set; } = null!;

        public GetAzurePrivatelinkArgs()
        {
        }
    }

    public sealed class GetAzurePrivatelinkInvokeArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// Identifies the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. This property cannot be changed, doing so forces recreation of the resource.
        /// </summary>
        [Input("project", required: true)]
        public Input<string> Project { get; set; } = null!;

        /// <summary>
        /// Specifies the name of the service that this resource belongs to. To set up proper dependencies please refer to this variable as a reference. This property cannot be changed, doing so forces recreation of the resource.
        /// </summary>
        [Input("serviceName", required: true)]
        public Input<string> ServiceName { get; set; } = null!;

        public GetAzurePrivatelinkInvokeArgs()
        {
        }
    }


    [OutputType]
    public sealed class GetAzurePrivatelinkResult
    {
        /// <summary>
        /// Azure Privatelink service alias
        /// </summary>
        public readonly string AzureServiceAlias;
        /// <summary>
        /// Azure Privatelink service ID
        /// </summary>
        public readonly string AzureServiceId;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Printable result of the Azure Privatelink request
        /// </summary>
        public readonly string Message;
        /// <summary>
        /// Identifies the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. This property cannot be changed, doing so forces recreation of the resource.
        /// </summary>
        public readonly string Project;
        /// <summary>
        /// Specifies the name of the service that this resource belongs to. To set up proper dependencies please refer to this variable as a reference. This property cannot be changed, doing so forces recreation of the resource.
        /// </summary>
        public readonly string ServiceName;
        /// <summary>
        /// Privatelink resource state
        /// </summary>
        public readonly string State;
        /// <summary>
        /// A List of allowed Subscription IDs Maximum Length: `16`.
        /// </summary>
        public readonly ImmutableArray<string> UserSubscriptionIds;

        [OutputConstructor]
        private GetAzurePrivatelinkResult(
            string azureServiceAlias,

            string azureServiceId,

            string id,

            string message,

            string project,

            string serviceName,

            string state,

            ImmutableArray<string> userSubscriptionIds)
        {
            AzureServiceAlias = azureServiceAlias;
            AzureServiceId = azureServiceId;
            Id = id;
            Message = message;
            Project = project;
            ServiceName = serviceName;
            State = state;
            UserSubscriptionIds = userSubscriptionIds;
        }
    }
}