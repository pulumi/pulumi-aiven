// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aiven
{
    [AivenResourceType("aiven:index/gcpPrivatelink:GcpPrivatelink")]
    public partial class GcpPrivatelink : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Privatelink resource Google Service Attachment
        /// </summary>
        [Output("googleServiceAttachment")]
        public Output<string> GoogleServiceAttachment { get; private set; } = null!;

        /// <summary>
        /// Printable result of the GCP Privatelink request
        /// </summary>
        [Output("message")]
        public Output<string> Message { get; private set; } = null!;

        /// <summary>
        /// Identifies the project this resource belongs to. To set up proper dependencies please refer to this variable as a
        /// reference. This property cannot be changed, doing so forces recreation of the resource.
        /// </summary>
        [Output("project")]
        public Output<string> Project { get; private set; } = null!;

        /// <summary>
        /// Specifies the name of the service that this resource belongs to. To set up proper dependencies please refer to this
        /// variable as a reference. This property cannot be changed, doing so forces recreation of the resource.
        /// </summary>
        [Output("serviceName")]
        public Output<string> ServiceName { get; private set; } = null!;

        /// <summary>
        /// Privatelink resource state
        /// </summary>
        [Output("state")]
        public Output<string> State { get; private set; } = null!;


        /// <summary>
        /// Create a GcpPrivatelink resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public GcpPrivatelink(string name, GcpPrivatelinkArgs args, CustomResourceOptions? options = null)
            : base("aiven:index/gcpPrivatelink:GcpPrivatelink", name, args ?? new GcpPrivatelinkArgs(), MakeResourceOptions(options, ""))
        {
        }

        private GcpPrivatelink(string name, Input<string> id, GcpPrivatelinkState? state = null, CustomResourceOptions? options = null)
            : base("aiven:index/gcpPrivatelink:GcpPrivatelink", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing GcpPrivatelink resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static GcpPrivatelink Get(string name, Input<string> id, GcpPrivatelinkState? state = null, CustomResourceOptions? options = null)
        {
            return new GcpPrivatelink(name, id, state, options);
        }
    }

    public sealed class GcpPrivatelinkArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Identifies the project this resource belongs to. To set up proper dependencies please refer to this variable as a
        /// reference. This property cannot be changed, doing so forces recreation of the resource.
        /// </summary>
        [Input("project", required: true)]
        public Input<string> Project { get; set; } = null!;

        /// <summary>
        /// Specifies the name of the service that this resource belongs to. To set up proper dependencies please refer to this
        /// variable as a reference. This property cannot be changed, doing so forces recreation of the resource.
        /// </summary>
        [Input("serviceName", required: true)]
        public Input<string> ServiceName { get; set; } = null!;

        public GcpPrivatelinkArgs()
        {
        }
        public static new GcpPrivatelinkArgs Empty => new GcpPrivatelinkArgs();
    }

    public sealed class GcpPrivatelinkState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Privatelink resource Google Service Attachment
        /// </summary>
        [Input("googleServiceAttachment")]
        public Input<string>? GoogleServiceAttachment { get; set; }

        /// <summary>
        /// Printable result of the GCP Privatelink request
        /// </summary>
        [Input("message")]
        public Input<string>? Message { get; set; }

        /// <summary>
        /// Identifies the project this resource belongs to. To set up proper dependencies please refer to this variable as a
        /// reference. This property cannot be changed, doing so forces recreation of the resource.
        /// </summary>
        [Input("project")]
        public Input<string>? Project { get; set; }

        /// <summary>
        /// Specifies the name of the service that this resource belongs to. To set up proper dependencies please refer to this
        /// variable as a reference. This property cannot be changed, doing so forces recreation of the resource.
        /// </summary>
        [Input("serviceName")]
        public Input<string>? ServiceName { get; set; }

        /// <summary>
        /// Privatelink resource state
        /// </summary>
        [Input("state")]
        public Input<string>? State { get; set; }

        public GcpPrivatelinkState()
        {
        }
        public static new GcpPrivatelinkState Empty => new GcpPrivatelinkState();
    }
}