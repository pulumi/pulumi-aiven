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
    /// The Azure Privatelink resource allows the creation and management of Aiven Azure Privatelink for a services.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using Pulumi;
    /// using Aiven = Pulumi.Aiven;
    /// 
    /// class MyStack : Stack
    /// {
    ///     public MyStack()
    ///     {
    ///         var foo = new Aiven.AzurePrivatelink("foo", new Aiven.AzurePrivatelinkArgs
    ///         {
    ///             Project = data.Aiven_project.Foo.Project,
    ///             ServiceName = aiven_kafka.Bar.Service_name,
    ///             UserSubscriptionIds = 
    ///             {
    ///                 "xxxxxx-xxxx-xxxx-xxxx-xxxxxxxx",
    ///             },
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// </summary>
    [AivenResourceType("aiven:index/azurePrivatelink:AzurePrivatelink")]
    public partial class AzurePrivatelink : Pulumi.CustomResource
    {
        /// <summary>
        /// Azure Privatelink service alias
        /// </summary>
        [Output("azureServiceAlias")]
        public Output<string> AzureServiceAlias { get; private set; } = null!;

        /// <summary>
        /// Azure Privatelink service ID
        /// </summary>
        [Output("azureServiceId")]
        public Output<string> AzureServiceId { get; private set; } = null!;

        /// <summary>
        /// Printable result of the Azure Privatelink request
        /// </summary>
        [Output("message")]
        public Output<string> Message { get; private set; } = null!;

        /// <summary>
        /// Identifies the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. This property cannot be changed, doing so forces recreation of the resource.
        /// </summary>
        [Output("project")]
        public Output<string> Project { get; private set; } = null!;

        /// <summary>
        /// Specifies the name of the service that this resource belongs to. To set up proper dependencies please refer to this variable as a reference. This property cannot be changed, doing so forces recreation of the resource.
        /// </summary>
        [Output("serviceName")]
        public Output<string> ServiceName { get; private set; } = null!;

        /// <summary>
        /// Privatelink resource state
        /// </summary>
        [Output("state")]
        public Output<string> State { get; private set; } = null!;

        /// <summary>
        /// A List of allowed Subscription IDs Maximum Length: `16`.
        /// </summary>
        [Output("userSubscriptionIds")]
        public Output<ImmutableArray<string>> UserSubscriptionIds { get; private set; } = null!;


        /// <summary>
        /// Create a AzurePrivatelink resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public AzurePrivatelink(string name, AzurePrivatelinkArgs args, CustomResourceOptions? options = null)
            : base("aiven:index/azurePrivatelink:AzurePrivatelink", name, args ?? new AzurePrivatelinkArgs(), MakeResourceOptions(options, ""))
        {
        }

        private AzurePrivatelink(string name, Input<string> id, AzurePrivatelinkState? state = null, CustomResourceOptions? options = null)
            : base("aiven:index/azurePrivatelink:AzurePrivatelink", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing AzurePrivatelink resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static AzurePrivatelink Get(string name, Input<string> id, AzurePrivatelinkState? state = null, CustomResourceOptions? options = null)
        {
            return new AzurePrivatelink(name, id, state, options);
        }
    }

    public sealed class AzurePrivatelinkArgs : Pulumi.ResourceArgs
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

        [Input("userSubscriptionIds", required: true)]
        private InputList<string>? _userSubscriptionIds;

        /// <summary>
        /// A List of allowed Subscription IDs Maximum Length: `16`.
        /// </summary>
        public InputList<string> UserSubscriptionIds
        {
            get => _userSubscriptionIds ?? (_userSubscriptionIds = new InputList<string>());
            set => _userSubscriptionIds = value;
        }

        public AzurePrivatelinkArgs()
        {
        }
    }

    public sealed class AzurePrivatelinkState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Azure Privatelink service alias
        /// </summary>
        [Input("azureServiceAlias")]
        public Input<string>? AzureServiceAlias { get; set; }

        /// <summary>
        /// Azure Privatelink service ID
        /// </summary>
        [Input("azureServiceId")]
        public Input<string>? AzureServiceId { get; set; }

        /// <summary>
        /// Printable result of the Azure Privatelink request
        /// </summary>
        [Input("message")]
        public Input<string>? Message { get; set; }

        /// <summary>
        /// Identifies the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. This property cannot be changed, doing so forces recreation of the resource.
        /// </summary>
        [Input("project")]
        public Input<string>? Project { get; set; }

        /// <summary>
        /// Specifies the name of the service that this resource belongs to. To set up proper dependencies please refer to this variable as a reference. This property cannot be changed, doing so forces recreation of the resource.
        /// </summary>
        [Input("serviceName")]
        public Input<string>? ServiceName { get; set; }

        /// <summary>
        /// Privatelink resource state
        /// </summary>
        [Input("state")]
        public Input<string>? State { get; set; }

        [Input("userSubscriptionIds")]
        private InputList<string>? _userSubscriptionIds;

        /// <summary>
        /// A List of allowed Subscription IDs Maximum Length: `16`.
        /// </summary>
        public InputList<string> UserSubscriptionIds
        {
            get => _userSubscriptionIds ?? (_userSubscriptionIds = new InputList<string>());
            set => _userSubscriptionIds = value;
        }

        public AzurePrivatelinkState()
        {
        }
    }
}