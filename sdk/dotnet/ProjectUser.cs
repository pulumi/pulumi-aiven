// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aiven
{
    /// <summary>
    /// Creates and manages an Aiven project member.
    /// 
    /// &gt; **This resource is deprecated**
    /// Use `aiven.OrganizationPermission` instead and
    /// migrate existing `aiven.ProjectUser` resources
    /// to the new resource. **Do not use the `aiven.ProjectUser` and `aiven.OrganizationPermission` resources together**.
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
    ///     var mytestuser = new Aiven.ProjectUser("mytestuser", new()
    ///     {
    ///         Project = myproject.Project,
    ///         Email = "john.doe@example.com",
    ///         MemberType = "admin",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// ```sh
    /// $ pulumi import aiven:index/projectUser:ProjectUser mytestuser PROJECT/EMAIL
    /// ```
    /// </summary>
    [AivenResourceType("aiven:index/projectUser:ProjectUser")]
    public partial class ProjectUser : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Whether the user has accepted the request to join the project. Users get an invite and become project members after accepting the invite.
        /// </summary>
        [Output("accepted")]
        public Output<bool> Accepted { get; private set; } = null!;

        /// <summary>
        /// Email address of the user in lowercase. Changing this property forces recreation of the resource.
        /// </summary>
        [Output("email")]
        public Output<string> Email { get; private set; } = null!;

        /// <summary>
        /// Project membership type. The possible values are `admin`, `developer`, `operator`, `organization:app_users:write`, `organization:audit_logs:read`, `organization:billing:read`, `organization:billing:write`, `organization:domains:write`, `organization:groups:write`, `organization:idps:write`, `organization:networking:read`, `organization:networking:write`, `organization:projects:write`, `organization:users:write`, `project:audit_logs:read`, `project:integrations:read`, `project:integrations:write`, `project:networking:read`, `project:networking:write`, `project:permissions:read`, `project:services:read`, `project:services:write`, `read_only`, `role:organization:admin`, `role:services:maintenance`, `role:services:recover`, `service:configuration:write`, `service:data:write`, `service:logs:read`, `service:secrets:read` and `service:users:write`.
        /// </summary>
        [Output("memberType")]
        public Output<string> MemberType { get; private set; } = null!;

        /// <summary>
        /// The name of the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
        /// </summary>
        [Output("project")]
        public Output<string> Project { get; private set; } = null!;


        /// <summary>
        /// Create a ProjectUser resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ProjectUser(string name, ProjectUserArgs args, CustomResourceOptions? options = null)
            : base("aiven:index/projectUser:ProjectUser", name, args ?? new ProjectUserArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ProjectUser(string name, Input<string> id, ProjectUserState? state = null, CustomResourceOptions? options = null)
            : base("aiven:index/projectUser:ProjectUser", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing ProjectUser resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ProjectUser Get(string name, Input<string> id, ProjectUserState? state = null, CustomResourceOptions? options = null)
        {
            return new ProjectUser(name, id, state, options);
        }
    }

    public sealed class ProjectUserArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Email address of the user in lowercase. Changing this property forces recreation of the resource.
        /// </summary>
        [Input("email", required: true)]
        public Input<string> Email { get; set; } = null!;

        /// <summary>
        /// Project membership type. The possible values are `admin`, `developer`, `operator`, `organization:app_users:write`, `organization:audit_logs:read`, `organization:billing:read`, `organization:billing:write`, `organization:domains:write`, `organization:groups:write`, `organization:idps:write`, `organization:networking:read`, `organization:networking:write`, `organization:projects:write`, `organization:users:write`, `project:audit_logs:read`, `project:integrations:read`, `project:integrations:write`, `project:networking:read`, `project:networking:write`, `project:permissions:read`, `project:services:read`, `project:services:write`, `read_only`, `role:organization:admin`, `role:services:maintenance`, `role:services:recover`, `service:configuration:write`, `service:data:write`, `service:logs:read`, `service:secrets:read` and `service:users:write`.
        /// </summary>
        [Input("memberType", required: true)]
        public Input<string> MemberType { get; set; } = null!;

        /// <summary>
        /// The name of the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
        /// </summary>
        [Input("project", required: true)]
        public Input<string> Project { get; set; } = null!;

        public ProjectUserArgs()
        {
        }
        public static new ProjectUserArgs Empty => new ProjectUserArgs();
    }

    public sealed class ProjectUserState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Whether the user has accepted the request to join the project. Users get an invite and become project members after accepting the invite.
        /// </summary>
        [Input("accepted")]
        public Input<bool>? Accepted { get; set; }

        /// <summary>
        /// Email address of the user in lowercase. Changing this property forces recreation of the resource.
        /// </summary>
        [Input("email")]
        public Input<string>? Email { get; set; }

        /// <summary>
        /// Project membership type. The possible values are `admin`, `developer`, `operator`, `organization:app_users:write`, `organization:audit_logs:read`, `organization:billing:read`, `organization:billing:write`, `organization:domains:write`, `organization:groups:write`, `organization:idps:write`, `organization:networking:read`, `organization:networking:write`, `organization:projects:write`, `organization:users:write`, `project:audit_logs:read`, `project:integrations:read`, `project:integrations:write`, `project:networking:read`, `project:networking:write`, `project:permissions:read`, `project:services:read`, `project:services:write`, `read_only`, `role:organization:admin`, `role:services:maintenance`, `role:services:recover`, `service:configuration:write`, `service:data:write`, `service:logs:read`, `service:secrets:read` and `service:users:write`.
        /// </summary>
        [Input("memberType")]
        public Input<string>? MemberType { get; set; }

        /// <summary>
        /// The name of the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
        /// </summary>
        [Input("project")]
        public Input<string>? Project { get; set; }

        public ProjectUserState()
        {
        }
        public static new ProjectUserState Empty => new ProjectUserState();
    }
}
