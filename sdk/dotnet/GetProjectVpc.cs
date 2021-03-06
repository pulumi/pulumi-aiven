// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aiven
{
    public static class GetProjectVpc
    {
        /// <summary>
        /// ## # Project VPC Data Source
        /// 
        /// The Project VPC data source provides information about the existing Aiven Project VPC.
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
        ///         var myvpc = Output.Create(Aiven.GetProjectVpc.InvokeAsync(new Aiven.GetProjectVpcArgs
        ///         {
        ///             Project = aiven_project.Myproject.Project,
        ///             CloudName = "google-europe-west1",
        ///         }));
        ///     }
        /// 
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetProjectVpcResult> InvokeAsync(GetProjectVpcArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetProjectVpcResult>("aiven:index/getProjectVpc:getProjectVpc", args ?? new GetProjectVpcArgs(), options.WithVersion());
    }


    public sealed class GetProjectVpcArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// defines where the cloud provider and region where the service is hosted
        /// in. See the Service resource for additional information.
        /// </summary>
        [Input("cloudName", required: true)]
        public string CloudName { get; set; } = null!;

        /// <summary>
        /// defines the network CIDR of the VPC.
        /// </summary>
        [Input("networkCidr")]
        public string? NetworkCidr { get; set; }

        /// <summary>
        /// defines the project the VPC belongs to.
        /// </summary>
        [Input("project", required: true)]
        public string Project { get; set; } = null!;

        /// <summary>
        /// ia a computed property that tells the current state of the VPC. This property cannot be
        /// set, only read.
        /// </summary>
        [Input("state")]
        public string? State { get; set; }

        public GetProjectVpcArgs()
        {
        }
    }


    [OutputType]
    public sealed class GetProjectVpcResult
    {
        public readonly string CloudName;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// defines the network CIDR of the VPC.
        /// </summary>
        public readonly string? NetworkCidr;
        public readonly string Project;
        /// <summary>
        /// ia a computed property that tells the current state of the VPC. This property cannot be
        /// set, only read.
        /// </summary>
        public readonly string State;

        [OutputConstructor]
        private GetProjectVpcResult(
            string cloudName,

            string id,

            string? networkCidr,

            string project,

            string state)
        {
            CloudName = cloudName;
            Id = id;
            NetworkCidr = networkCidr;
            Project = project;
            State = state;
        }
    }
}
