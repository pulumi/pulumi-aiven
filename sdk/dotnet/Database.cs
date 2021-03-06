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
    /// ## # Database Resource
    /// 
    /// The Database resource allows the creation and management of Aiven Databases.
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
    ///         var mydatabase = new Aiven.Database("mydatabase", new Aiven.DatabaseArgs
    ///         {
    ///             Project = aiven_project.Myproject.Project,
    ///             ServiceName = aiven_service.Myservice.Service_name,
    ///             DatabaseName = "&lt;DATABASE_NAME&gt;",
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// </summary>
    [AivenResourceType("aiven:index/database:Database")]
    public partial class Database : Pulumi.CustomResource
    {
        /// <summary>
        /// is the actual name of the database.
        /// </summary>
        [Output("databaseName")]
        public Output<string> DatabaseName { get; private set; } = null!;

        /// <summary>
        /// default string sort order (LC_COLLATE) of the database. Default value: en_US.UTF-8.
        /// </summary>
        [Output("lcCollate")]
        public Output<string?> LcCollate { get; private set; } = null!;

        /// <summary>
        /// default character classification (LC_CTYPE) of the database. Default value: en_US.UTF-8.
        /// </summary>
        [Output("lcCtype")]
        public Output<string?> LcCtype { get; private set; } = null!;

        /// <summary>
        /// and `service_name` - (Required) define the project and service the database belongs to.
        /// They should be defined using reference as shown above to set up dependencies correctly.
        /// </summary>
        [Output("project")]
        public Output<string> Project { get; private set; } = null!;

        /// <summary>
        /// Service to link the database to
        /// </summary>
        [Output("serviceName")]
        public Output<string> ServiceName { get; private set; } = null!;

        /// <summary>
        /// It is a Terraform client-side deletion protections, which prevents the database from being deleted by Terraform. It is
        /// recommended to enable this for any production databases containing critical data.
        /// </summary>
        [Output("terminationProtection")]
        public Output<bool?> TerminationProtection { get; private set; } = null!;


        /// <summary>
        /// Create a Database resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Database(string name, DatabaseArgs args, CustomResourceOptions? options = null)
            : base("aiven:index/database:Database", name, args ?? new DatabaseArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Database(string name, Input<string> id, DatabaseState? state = null, CustomResourceOptions? options = null)
            : base("aiven:index/database:Database", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Database resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Database Get(string name, Input<string> id, DatabaseState? state = null, CustomResourceOptions? options = null)
        {
            return new Database(name, id, state, options);
        }
    }

    public sealed class DatabaseArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// is the actual name of the database.
        /// </summary>
        [Input("databaseName", required: true)]
        public Input<string> DatabaseName { get; set; } = null!;

        /// <summary>
        /// default string sort order (LC_COLLATE) of the database. Default value: en_US.UTF-8.
        /// </summary>
        [Input("lcCollate")]
        public Input<string>? LcCollate { get; set; }

        /// <summary>
        /// default character classification (LC_CTYPE) of the database. Default value: en_US.UTF-8.
        /// </summary>
        [Input("lcCtype")]
        public Input<string>? LcCtype { get; set; }

        /// <summary>
        /// and `service_name` - (Required) define the project and service the database belongs to.
        /// They should be defined using reference as shown above to set up dependencies correctly.
        /// </summary>
        [Input("project", required: true)]
        public Input<string> Project { get; set; } = null!;

        /// <summary>
        /// Service to link the database to
        /// </summary>
        [Input("serviceName", required: true)]
        public Input<string> ServiceName { get; set; } = null!;

        /// <summary>
        /// It is a Terraform client-side deletion protections, which prevents the database from being deleted by Terraform. It is
        /// recommended to enable this for any production databases containing critical data.
        /// </summary>
        [Input("terminationProtection")]
        public Input<bool>? TerminationProtection { get; set; }

        public DatabaseArgs()
        {
        }
    }

    public sealed class DatabaseState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// is the actual name of the database.
        /// </summary>
        [Input("databaseName")]
        public Input<string>? DatabaseName { get; set; }

        /// <summary>
        /// default string sort order (LC_COLLATE) of the database. Default value: en_US.UTF-8.
        /// </summary>
        [Input("lcCollate")]
        public Input<string>? LcCollate { get; set; }

        /// <summary>
        /// default character classification (LC_CTYPE) of the database. Default value: en_US.UTF-8.
        /// </summary>
        [Input("lcCtype")]
        public Input<string>? LcCtype { get; set; }

        /// <summary>
        /// and `service_name` - (Required) define the project and service the database belongs to.
        /// They should be defined using reference as shown above to set up dependencies correctly.
        /// </summary>
        [Input("project")]
        public Input<string>? Project { get; set; }

        /// <summary>
        /// Service to link the database to
        /// </summary>
        [Input("serviceName")]
        public Input<string>? ServiceName { get; set; }

        /// <summary>
        /// It is a Terraform client-side deletion protections, which prevents the database from being deleted by Terraform. It is
        /// recommended to enable this for any production databases containing critical data.
        /// </summary>
        [Input("terminationProtection")]
        public Input<bool>? TerminationProtection { get; set; }

        public DatabaseState()
        {
        }
    }
}
