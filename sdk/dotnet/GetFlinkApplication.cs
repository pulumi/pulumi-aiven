// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aiven
{
    public static class GetFlinkApplication
    {
        /// <summary>
        /// Gets information about an Aiven for Apache Flink® application.
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
        ///     var exampleApp = Aiven.GetFlinkApplication.Invoke(new()
        ///     {
        ///         Project = exampleProject.Project,
        ///         ServiceName = "example-flink-service",
        ///         Name = "example-app",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetFlinkApplicationResult> InvokeAsync(GetFlinkApplicationArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetFlinkApplicationResult>("aiven:index/getFlinkApplication:getFlinkApplication", args ?? new GetFlinkApplicationArgs(), options.WithDefaults());

        /// <summary>
        /// Gets information about an Aiven for Apache Flink® application.
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
        ///     var exampleApp = Aiven.GetFlinkApplication.Invoke(new()
        ///     {
        ///         Project = exampleProject.Project,
        ///         ServiceName = "example-flink-service",
        ///         Name = "example-app",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetFlinkApplicationResult> Invoke(GetFlinkApplicationInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetFlinkApplicationResult>("aiven:index/getFlinkApplication:getFlinkApplication", args ?? new GetFlinkApplicationInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// Gets information about an Aiven for Apache Flink® application.
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
        ///     var exampleApp = Aiven.GetFlinkApplication.Invoke(new()
        ///     {
        ///         Project = exampleProject.Project,
        ///         ServiceName = "example-flink-service",
        ///         Name = "example-app",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetFlinkApplicationResult> Invoke(GetFlinkApplicationInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetFlinkApplicationResult>("aiven:index/getFlinkApplication:getFlinkApplication", args ?? new GetFlinkApplicationInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetFlinkApplicationArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The name of the application.
        /// </summary>
        [Input("name", required: true)]
        public string Name { get; set; } = null!;

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

        public GetFlinkApplicationArgs()
        {
        }
        public static new GetFlinkApplicationArgs Empty => new GetFlinkApplicationArgs();
    }

    public sealed class GetFlinkApplicationInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The name of the application.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

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

        public GetFlinkApplicationInvokeArgs()
        {
        }
        public static new GetFlinkApplicationInvokeArgs Empty => new GetFlinkApplicationInvokeArgs();
    }


    [OutputType]
    public sealed class GetFlinkApplicationResult
    {
        /// <summary>
        /// Application ID.
        /// </summary>
        public readonly string ApplicationId;
        /// <summary>
        /// Application creation time.
        /// </summary>
        public readonly string CreatedAt;
        /// <summary>
        /// The user who created the application.
        /// </summary>
        public readonly string CreatedBy;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The name of the application.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// The name of the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
        /// </summary>
        public readonly string Project;
        /// <summary>
        /// The name of the service that this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
        /// </summary>
        public readonly string ServiceName;
        /// <summary>
        /// When the application was updated.
        /// </summary>
        public readonly string UpdatedAt;
        /// <summary>
        /// The user who updated the application.
        /// </summary>
        public readonly string UpdatedBy;

        [OutputConstructor]
        private GetFlinkApplicationResult(
            string applicationId,

            string createdAt,

            string createdBy,

            string id,

            string name,

            string project,

            string serviceName,

            string updatedAt,

            string updatedBy)
        {
            ApplicationId = applicationId;
            CreatedAt = createdAt;
            CreatedBy = createdBy;
            Id = id;
            Name = name;
            Project = project;
            ServiceName = serviceName;
            UpdatedAt = updatedAt;
            UpdatedBy = updatedBy;
        }
    }
}
