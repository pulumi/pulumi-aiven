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
    /// ## # Project VPC Resource
    /// 
    /// The Project VPC resource allows the creation and management of Aiven Project VPCs.
    /// </summary>
    [AivenResourceType("aiven:index/projectVpc:ProjectVpc")]
    public partial class ProjectVpc : Pulumi.CustomResource
    {
        /// <summary>
        /// defines where the cloud provider and region where the service is hosted
        /// in. See the Service resource for additional information.
        /// </summary>
        [Output("cloudName")]
        public Output<string> CloudName { get; private set; } = null!;

        /// <summary>
        /// defines the network CIDR of the VPC.
        /// </summary>
        [Output("networkCidr")]
        public Output<string> NetworkCidr { get; private set; } = null!;

        /// <summary>
        /// defines the project the VPC belongs to.
        /// </summary>
        [Output("project")]
        public Output<string> Project { get; private set; } = null!;

        /// <summary>
        /// ia a computed property that tells the current state of the VPC. This property cannot be
        /// set, only read.
        /// </summary>
        [Output("state")]
        public Output<string> State { get; private set; } = null!;


        /// <summary>
        /// Create a ProjectVpc resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ProjectVpc(string name, ProjectVpcArgs args, CustomResourceOptions? options = null)
            : base("aiven:index/projectVpc:ProjectVpc", name, args ?? new ProjectVpcArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ProjectVpc(string name, Input<string> id, ProjectVpcState? state = null, CustomResourceOptions? options = null)
            : base("aiven:index/projectVpc:ProjectVpc", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing ProjectVpc resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ProjectVpc Get(string name, Input<string> id, ProjectVpcState? state = null, CustomResourceOptions? options = null)
        {
            return new ProjectVpc(name, id, state, options);
        }
    }

    public sealed class ProjectVpcArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// defines where the cloud provider and region where the service is hosted
        /// in. See the Service resource for additional information.
        /// </summary>
        [Input("cloudName", required: true)]
        public Input<string> CloudName { get; set; } = null!;

        /// <summary>
        /// defines the network CIDR of the VPC.
        /// </summary>
        [Input("networkCidr", required: true)]
        public Input<string> NetworkCidr { get; set; } = null!;

        /// <summary>
        /// defines the project the VPC belongs to.
        /// </summary>
        [Input("project", required: true)]
        public Input<string> Project { get; set; } = null!;

        public ProjectVpcArgs()
        {
        }
    }

    public sealed class ProjectVpcState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// defines where the cloud provider and region where the service is hosted
        /// in. See the Service resource for additional information.
        /// </summary>
        [Input("cloudName")]
        public Input<string>? CloudName { get; set; }

        /// <summary>
        /// defines the network CIDR of the VPC.
        /// </summary>
        [Input("networkCidr")]
        public Input<string>? NetworkCidr { get; set; }

        /// <summary>
        /// defines the project the VPC belongs to.
        /// </summary>
        [Input("project")]
        public Input<string>? Project { get; set; }

        /// <summary>
        /// ia a computed property that tells the current state of the VPC. This property cannot be
        /// set, only read.
        /// </summary>
        [Input("state")]
        public Input<string>? State { get; set; }

        public ProjectVpcState()
        {
        }
    }
}
