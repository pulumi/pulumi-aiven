// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aiven
{
    /// <summary>
    /// The Organization User resource allows the creation and management of an Aiven Organization User.
    /// 
    /// During the creation of `aiven.OrganizationUser`resource, an email invitation will be sent
    /// to a user using `user_email` address. If the user accepts an invitation, they will become
    /// a member of the organization. The deletion of `aiven.OrganizationUser` will not only
    /// delete the invitation if one was sent but not yet accepted by the user, it will also
    /// eliminate the member from the organization if one has accepted an invitation previously.
    /// </summary>
    [AivenResourceType("aiven:index/organizationUser:OrganizationUser")]
    public partial class OrganizationUser : global::Pulumi.CustomResource
    {
        /// <summary>
        /// This is a boolean flag that determines whether an invitation was accepted or not by the user. `false` value means that the invitation was sent to the user but not yet accepted. `true` means that the user accepted the invitation and now a member of an organization.
        /// </summary>
        [Output("accepted")]
        public Output<bool> Accepted { get; private set; } = null!;

        /// <summary>
        /// Time of creation
        /// </summary>
        [Output("createTime")]
        public Output<string> CreateTime { get; private set; } = null!;

        /// <summary>
        /// The email address of the user who sent an invitation to the user.
        /// </summary>
        [Output("invitedBy")]
        public Output<string> InvitedBy { get; private set; } = null!;

        /// <summary>
        /// The unique organization ID. This property cannot be changed, doing so forces recreation of the resource.
        /// </summary>
        [Output("organizationId")]
        public Output<string> OrganizationId { get; private set; } = null!;

        /// <summary>
        /// This is a user email address that first will be invited, and after accepting an invitation, they become a member of the organization. This property cannot be changed, doing so forces recreation of the resource.
        /// </summary>
        [Output("userEmail")]
        public Output<string> UserEmail { get; private set; } = null!;


        /// <summary>
        /// Create a OrganizationUser resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public OrganizationUser(string name, OrganizationUserArgs args, CustomResourceOptions? options = null)
            : base("aiven:index/organizationUser:OrganizationUser", name, args ?? new OrganizationUserArgs(), MakeResourceOptions(options, ""))
        {
        }

        private OrganizationUser(string name, Input<string> id, OrganizationUserState? state = null, CustomResourceOptions? options = null)
            : base("aiven:index/organizationUser:OrganizationUser", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing OrganizationUser resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static OrganizationUser Get(string name, Input<string> id, OrganizationUserState? state = null, CustomResourceOptions? options = null)
        {
            return new OrganizationUser(name, id, state, options);
        }
    }

    public sealed class OrganizationUserArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The unique organization ID. This property cannot be changed, doing so forces recreation of the resource.
        /// </summary>
        [Input("organizationId", required: true)]
        public Input<string> OrganizationId { get; set; } = null!;

        /// <summary>
        /// This is a user email address that first will be invited, and after accepting an invitation, they become a member of the organization. This property cannot be changed, doing so forces recreation of the resource.
        /// </summary>
        [Input("userEmail", required: true)]
        public Input<string> UserEmail { get; set; } = null!;

        public OrganizationUserArgs()
        {
        }
        public static new OrganizationUserArgs Empty => new OrganizationUserArgs();
    }

    public sealed class OrganizationUserState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// This is a boolean flag that determines whether an invitation was accepted or not by the user. `false` value means that the invitation was sent to the user but not yet accepted. `true` means that the user accepted the invitation and now a member of an organization.
        /// </summary>
        [Input("accepted")]
        public Input<bool>? Accepted { get; set; }

        /// <summary>
        /// Time of creation
        /// </summary>
        [Input("createTime")]
        public Input<string>? CreateTime { get; set; }

        /// <summary>
        /// The email address of the user who sent an invitation to the user.
        /// </summary>
        [Input("invitedBy")]
        public Input<string>? InvitedBy { get; set; }

        /// <summary>
        /// The unique organization ID. This property cannot be changed, doing so forces recreation of the resource.
        /// </summary>
        [Input("organizationId")]
        public Input<string>? OrganizationId { get; set; }

        /// <summary>
        /// This is a user email address that first will be invited, and after accepting an invitation, they become a member of the organization. This property cannot be changed, doing so forces recreation of the resource.
        /// </summary>
        [Input("userEmail")]
        public Input<string>? UserEmail { get; set; }

        public OrganizationUserState()
        {
        }
        public static new OrganizationUserState Empty => new OrganizationUserState();
    }
}