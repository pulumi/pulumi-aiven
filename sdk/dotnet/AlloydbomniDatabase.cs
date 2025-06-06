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
    /// Creates and manages a database in an Aiven for AlloyDB Omni service.
    /// 
    /// **This resource is in the beta stage and may change without notice.** Set
    /// the `PROVIDER_AIVEN_ENABLE_BETA` environment variable to use the resource.
    /// </summary>
    [AivenResourceType("aiven:index/alloydbomniDatabase:AlloydbomniDatabase")]
    public partial class AlloydbomniDatabase : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The name of the service database. Changing this property forces recreation of the resource.
        /// </summary>
        [Output("databaseName")]
        public Output<string> DatabaseName { get; private set; } = null!;

        /// <summary>
        /// Default string sort order (`LC_COLLATE`) of the database. The default value is `en_US.UTF-8`. Changing this property forces recreation of the resource.
        /// </summary>
        [Output("lcCollate")]
        public Output<string?> LcCollate { get; private set; } = null!;

        /// <summary>
        /// Default character classification (`LC_CTYPE`) of the database. The default value is `en_US.UTF-8`. Changing this property forces recreation of the resource.
        /// </summary>
        [Output("lcCtype")]
        public Output<string?> LcCtype { get; private set; } = null!;

        /// <summary>
        /// The name of the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
        /// </summary>
        [Output("project")]
        public Output<string> Project { get; private set; } = null!;

        /// <summary>
        /// The name of the service that this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
        /// </summary>
        [Output("serviceName")]
        public Output<string> ServiceName { get; private set; } = null!;


        /// <summary>
        /// Create a AlloydbomniDatabase resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public AlloydbomniDatabase(string name, AlloydbomniDatabaseArgs args, CustomResourceOptions? options = null)
            : base("aiven:index/alloydbomniDatabase:AlloydbomniDatabase", name, args ?? new AlloydbomniDatabaseArgs(), MakeResourceOptions(options, ""))
        {
        }

        private AlloydbomniDatabase(string name, Input<string> id, AlloydbomniDatabaseState? state = null, CustomResourceOptions? options = null)
            : base("aiven:index/alloydbomniDatabase:AlloydbomniDatabase", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing AlloydbomniDatabase resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static AlloydbomniDatabase Get(string name, Input<string> id, AlloydbomniDatabaseState? state = null, CustomResourceOptions? options = null)
        {
            return new AlloydbomniDatabase(name, id, state, options);
        }
    }

    public sealed class AlloydbomniDatabaseArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name of the service database. Changing this property forces recreation of the resource.
        /// </summary>
        [Input("databaseName", required: true)]
        public Input<string> DatabaseName { get; set; } = null!;

        /// <summary>
        /// Default string sort order (`LC_COLLATE`) of the database. The default value is `en_US.UTF-8`. Changing this property forces recreation of the resource.
        /// </summary>
        [Input("lcCollate")]
        public Input<string>? LcCollate { get; set; }

        /// <summary>
        /// Default character classification (`LC_CTYPE`) of the database. The default value is `en_US.UTF-8`. Changing this property forces recreation of the resource.
        /// </summary>
        [Input("lcCtype")]
        public Input<string>? LcCtype { get; set; }

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

        public AlloydbomniDatabaseArgs()
        {
        }
        public static new AlloydbomniDatabaseArgs Empty => new AlloydbomniDatabaseArgs();
    }

    public sealed class AlloydbomniDatabaseState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name of the service database. Changing this property forces recreation of the resource.
        /// </summary>
        [Input("databaseName")]
        public Input<string>? DatabaseName { get; set; }

        /// <summary>
        /// Default string sort order (`LC_COLLATE`) of the database. The default value is `en_US.UTF-8`. Changing this property forces recreation of the resource.
        /// </summary>
        [Input("lcCollate")]
        public Input<string>? LcCollate { get; set; }

        /// <summary>
        /// Default character classification (`LC_CTYPE`) of the database. The default value is `en_US.UTF-8`. Changing this property forces recreation of the resource.
        /// </summary>
        [Input("lcCtype")]
        public Input<string>? LcCtype { get; set; }

        /// <summary>
        /// The name of the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
        /// </summary>
        [Input("project")]
        public Input<string>? Project { get; set; }

        /// <summary>
        /// The name of the service that this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
        /// </summary>
        [Input("serviceName")]
        public Input<string>? ServiceName { get; set; }

        public AlloydbomniDatabaseState()
        {
        }
        public static new AlloydbomniDatabaseState Empty => new AlloydbomniDatabaseState();
    }
}
