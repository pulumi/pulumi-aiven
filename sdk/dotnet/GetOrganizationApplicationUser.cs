// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aiven
{
    public static class GetOrganizationApplicationUser
    {
        /// <summary>
        /// Gets information about an application user.
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
        ///     var tfUser = Aiven.GetOrganizationApplicationUser.Invoke(new()
        ///     {
        ///         OrganizationId = main.Id,
        ///         UserId = "u123a456b7890c",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetOrganizationApplicationUserResult> InvokeAsync(GetOrganizationApplicationUserArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetOrganizationApplicationUserResult>("aiven:index/getOrganizationApplicationUser:getOrganizationApplicationUser", args ?? new GetOrganizationApplicationUserArgs(), options.WithDefaults());

        /// <summary>
        /// Gets information about an application user.
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
        ///     var tfUser = Aiven.GetOrganizationApplicationUser.Invoke(new()
        ///     {
        ///         OrganizationId = main.Id,
        ///         UserId = "u123a456b7890c",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetOrganizationApplicationUserResult> Invoke(GetOrganizationApplicationUserInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetOrganizationApplicationUserResult>("aiven:index/getOrganizationApplicationUser:getOrganizationApplicationUser", args ?? new GetOrganizationApplicationUserInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetOrganizationApplicationUserArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The ID of the organization the application user belongs to.
        /// </summary>
        [Input("organizationId", required: true)]
        public string OrganizationId { get; set; } = null!;

        /// <summary>
        /// The ID of the application user.
        /// </summary>
        [Input("userId", required: true)]
        public string UserId { get; set; } = null!;

        public GetOrganizationApplicationUserArgs()
        {
        }
        public static new GetOrganizationApplicationUserArgs Empty => new GetOrganizationApplicationUserArgs();
    }

    public sealed class GetOrganizationApplicationUserInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The ID of the organization the application user belongs to.
        /// </summary>
        [Input("organizationId", required: true)]
        public Input<string> OrganizationId { get; set; } = null!;

        /// <summary>
        /// The ID of the application user.
        /// </summary>
        [Input("userId", required: true)]
        public Input<string> UserId { get; set; } = null!;

        public GetOrganizationApplicationUserInvokeArgs()
        {
        }
        public static new GetOrganizationApplicationUserInvokeArgs Empty => new GetOrganizationApplicationUserInvokeArgs();
    }


    [OutputType]
    public sealed class GetOrganizationApplicationUserResult
    {
        /// <summary>
        /// An email address automatically generated by Aiven to help identify the application user. No notifications are sent to this email.
        /// </summary>
        public readonly string Email;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Makes the application user a super admin. The super admin role has full access to an organization, its billing and settings, and all its organizational units, projects, and services.
        /// </summary>
        public readonly bool IsSuperAdmin;
        /// <summary>
        /// Name of the application user.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// The ID of the organization the application user belongs to.
        /// </summary>
        public readonly string OrganizationId;
        /// <summary>
        /// The ID of the application user.
        /// </summary>
        public readonly string UserId;

        [OutputConstructor]
        private GetOrganizationApplicationUserResult(
            string email,

            string id,

            bool isSuperAdmin,

            string name,

            string organizationId,

            string userId)
        {
            Email = email;
            Id = id;
            IsSuperAdmin = isSuperAdmin;
            Name = name;
            OrganizationId = organizationId;
            UserId = userId;
        }
    }
}