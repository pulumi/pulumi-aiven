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
    /// The Project resource allows the creation and management of Aiven Projects.
    /// 
    /// ## Example Usage
    /// 
    /// &lt;!--Start PulumiCodeChooser --&gt;
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Aiven = Pulumi.Aiven;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var exampleProject = new Aiven.Project("exampleProject", new()
    ///     {
    ///         ProjectName = "Example project",
    ///         ParentId = aiven_organization.Main.Id,
    ///     });
    /// 
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// 
    /// ## Import
    /// 
    /// ```sh
    /// $ pulumi import aiven:index/project:Project myproject project
    /// ```
    /// </summary>
    [AivenResourceType("aiven:index/project:Project")]
    public partial class Project : global::Pulumi.CustomResource
    {
        /// <summary>
        /// An optional property to link a project to an already existing account by using account ID. To set up proper dependencies please refer to this variable as a reference.
        /// </summary>
        [Output("accountId")]
        public Output<string?> AccountId { get; private set; } = null!;

        /// <summary>
        /// If parent_id is set, grant account owner team admin access to the new project. The default value is `true`.
        /// </summary>
        [Output("addAccountOwnersAdminAccess")]
        public Output<bool?> AddAccountOwnersAdminAccess { get; private set; } = null!;

        /// <summary>
        /// The amount of platform credits available to the project. This could be your free trial or other promotional credits.
        /// </summary>
        [Output("availableCredits")]
        public Output<string> AvailableCredits { get; private set; } = null!;

        /// <summary>
        /// The id of the billing group that is linked to this project. To set up proper dependencies please refer to this variable as a reference.
        /// </summary>
        [Output("billingGroup")]
        public Output<string?> BillingGroup { get; private set; } = null!;

        /// <summary>
        /// The CA certificate of the project. This is required for configuring clients that connect to certain services like Kafka.
        /// </summary>
        [Output("caCert")]
        public Output<string> CaCert { get; private set; } = null!;

        /// <summary>
        /// is the name of another project used to copy billing information and some other project attributes like technical contacts from. This is mostly relevant when an existing project has billing type set to invoice and that needs to be copied over to a new project. (Setting billing is otherwise not allowed over the API.) This only has effect when the project is created. To set up proper dependencies please refer to this variable as a reference.
        /// </summary>
        [Output("copyFromProject")]
        public Output<string?> CopyFromProject { get; private set; } = null!;

        /// <summary>
        /// Defines the default cloud provider and region where services are hosted. This can be changed freely after the project is created. This will not affect existing services.
        /// </summary>
        [Output("defaultCloud")]
        public Output<string?> DefaultCloud { get; private set; } = null!;

        /// <summary>
        /// The current accumulated bill for this project in the current billing period.
        /// </summary>
        [Output("estimatedBalance")]
        public Output<string> EstimatedBalance { get; private set; } = null!;

        /// <summary>
        /// An optional property to link a project to an already existing organization or account by using its ID. To set up proper dependencies please refer to this variable as a reference.
        /// </summary>
        [Output("parentId")]
        public Output<string?> ParentId { get; private set; } = null!;

        /// <summary>
        /// The method of invoicing used for payments for this project, e.g. `card`.
        /// </summary>
        [Output("paymentMethod")]
        public Output<string> PaymentMethod { get; private set; } = null!;

        /// <summary>
        /// Defines the name of the project. Name must be globally unique (between all Aiven customers) and cannot be changed later without destroying and re-creating the project, including all sub-resources.
        /// </summary>
        [Output("project")]
        public Output<string> ProjectName { get; private set; } = null!;

        /// <summary>
        /// Tags are key-value pairs that allow you to categorize projects.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableArray<Outputs.ProjectTag>> Tags { get; private set; } = null!;

        /// <summary>
        /// Defines the email addresses that will receive alerts about upcoming maintenance updates or warnings about service instability. It is a good practice to keep this up-to-date to be aware of any potential issues with your project.
        /// </summary>
        [Output("technicalEmails")]
        public Output<ImmutableArray<string>> TechnicalEmails { get; private set; } = null!;

        /// <summary>
        /// Use the same billing group that is used in source project.
        /// </summary>
        [Output("useSourceProjectBillingGroup")]
        public Output<bool?> UseSourceProjectBillingGroup { get; private set; } = null!;


        /// <summary>
        /// Create a Project resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Project(string name, ProjectArgs args, CustomResourceOptions? options = null)
            : base("aiven:index/project:Project", name, args ?? new ProjectArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Project(string name, Input<string> id, ProjectState? state = null, CustomResourceOptions? options = null)
            : base("aiven:index/project:Project", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                AdditionalSecretOutputs =
                {
                    "caCert",
                },
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing Project resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Project Get(string name, Input<string> id, ProjectState? state = null, CustomResourceOptions? options = null)
        {
            return new Project(name, id, state, options);
        }
    }

    public sealed class ProjectArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// An optional property to link a project to an already existing account by using account ID. To set up proper dependencies please refer to this variable as a reference.
        /// </summary>
        [Input("accountId")]
        public Input<string>? AccountId { get; set; }

        /// <summary>
        /// If parent_id is set, grant account owner team admin access to the new project. The default value is `true`.
        /// </summary>
        [Input("addAccountOwnersAdminAccess")]
        public Input<bool>? AddAccountOwnersAdminAccess { get; set; }

        /// <summary>
        /// The id of the billing group that is linked to this project. To set up proper dependencies please refer to this variable as a reference.
        /// </summary>
        [Input("billingGroup")]
        public Input<string>? BillingGroup { get; set; }

        /// <summary>
        /// is the name of another project used to copy billing information and some other project attributes like technical contacts from. This is mostly relevant when an existing project has billing type set to invoice and that needs to be copied over to a new project. (Setting billing is otherwise not allowed over the API.) This only has effect when the project is created. To set up proper dependencies please refer to this variable as a reference.
        /// </summary>
        [Input("copyFromProject")]
        public Input<string>? CopyFromProject { get; set; }

        /// <summary>
        /// Defines the default cloud provider and region where services are hosted. This can be changed freely after the project is created. This will not affect existing services.
        /// </summary>
        [Input("defaultCloud")]
        public Input<string>? DefaultCloud { get; set; }

        /// <summary>
        /// An optional property to link a project to an already existing organization or account by using its ID. To set up proper dependencies please refer to this variable as a reference.
        /// </summary>
        [Input("parentId")]
        public Input<string>? ParentId { get; set; }

        /// <summary>
        /// Defines the name of the project. Name must be globally unique (between all Aiven customers) and cannot be changed later without destroying and re-creating the project, including all sub-resources.
        /// </summary>
        [Input("project", required: true)]
        public Input<string> ProjectName { get; set; } = null!;

        [Input("tags")]
        private InputList<Inputs.ProjectTagArgs>? _tags;

        /// <summary>
        /// Tags are key-value pairs that allow you to categorize projects.
        /// </summary>
        public InputList<Inputs.ProjectTagArgs> Tags
        {
            get => _tags ?? (_tags = new InputList<Inputs.ProjectTagArgs>());
            set => _tags = value;
        }

        [Input("technicalEmails")]
        private InputList<string>? _technicalEmails;

        /// <summary>
        /// Defines the email addresses that will receive alerts about upcoming maintenance updates or warnings about service instability. It is a good practice to keep this up-to-date to be aware of any potential issues with your project.
        /// </summary>
        public InputList<string> TechnicalEmails
        {
            get => _technicalEmails ?? (_technicalEmails = new InputList<string>());
            set => _technicalEmails = value;
        }

        /// <summary>
        /// Use the same billing group that is used in source project.
        /// </summary>
        [Input("useSourceProjectBillingGroup")]
        public Input<bool>? UseSourceProjectBillingGroup { get; set; }

        public ProjectArgs()
        {
        }
        public static new ProjectArgs Empty => new ProjectArgs();
    }

    public sealed class ProjectState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// An optional property to link a project to an already existing account by using account ID. To set up proper dependencies please refer to this variable as a reference.
        /// </summary>
        [Input("accountId")]
        public Input<string>? AccountId { get; set; }

        /// <summary>
        /// If parent_id is set, grant account owner team admin access to the new project. The default value is `true`.
        /// </summary>
        [Input("addAccountOwnersAdminAccess")]
        public Input<bool>? AddAccountOwnersAdminAccess { get; set; }

        /// <summary>
        /// The amount of platform credits available to the project. This could be your free trial or other promotional credits.
        /// </summary>
        [Input("availableCredits")]
        public Input<string>? AvailableCredits { get; set; }

        /// <summary>
        /// The id of the billing group that is linked to this project. To set up proper dependencies please refer to this variable as a reference.
        /// </summary>
        [Input("billingGroup")]
        public Input<string>? BillingGroup { get; set; }

        [Input("caCert")]
        private Input<string>? _caCert;

        /// <summary>
        /// The CA certificate of the project. This is required for configuring clients that connect to certain services like Kafka.
        /// </summary>
        public Input<string>? CaCert
        {
            get => _caCert;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _caCert = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// is the name of another project used to copy billing information and some other project attributes like technical contacts from. This is mostly relevant when an existing project has billing type set to invoice and that needs to be copied over to a new project. (Setting billing is otherwise not allowed over the API.) This only has effect when the project is created. To set up proper dependencies please refer to this variable as a reference.
        /// </summary>
        [Input("copyFromProject")]
        public Input<string>? CopyFromProject { get; set; }

        /// <summary>
        /// Defines the default cloud provider and region where services are hosted. This can be changed freely after the project is created. This will not affect existing services.
        /// </summary>
        [Input("defaultCloud")]
        public Input<string>? DefaultCloud { get; set; }

        /// <summary>
        /// The current accumulated bill for this project in the current billing period.
        /// </summary>
        [Input("estimatedBalance")]
        public Input<string>? EstimatedBalance { get; set; }

        /// <summary>
        /// An optional property to link a project to an already existing organization or account by using its ID. To set up proper dependencies please refer to this variable as a reference.
        /// </summary>
        [Input("parentId")]
        public Input<string>? ParentId { get; set; }

        /// <summary>
        /// The method of invoicing used for payments for this project, e.g. `card`.
        /// </summary>
        [Input("paymentMethod")]
        public Input<string>? PaymentMethod { get; set; }

        /// <summary>
        /// Defines the name of the project. Name must be globally unique (between all Aiven customers) and cannot be changed later without destroying and re-creating the project, including all sub-resources.
        /// </summary>
        [Input("project")]
        public Input<string>? ProjectName { get; set; }

        [Input("tags")]
        private InputList<Inputs.ProjectTagGetArgs>? _tags;

        /// <summary>
        /// Tags are key-value pairs that allow you to categorize projects.
        /// </summary>
        public InputList<Inputs.ProjectTagGetArgs> Tags
        {
            get => _tags ?? (_tags = new InputList<Inputs.ProjectTagGetArgs>());
            set => _tags = value;
        }

        [Input("technicalEmails")]
        private InputList<string>? _technicalEmails;

        /// <summary>
        /// Defines the email addresses that will receive alerts about upcoming maintenance updates or warnings about service instability. It is a good practice to keep this up-to-date to be aware of any potential issues with your project.
        /// </summary>
        public InputList<string> TechnicalEmails
        {
            get => _technicalEmails ?? (_technicalEmails = new InputList<string>());
            set => _technicalEmails = value;
        }

        /// <summary>
        /// Use the same billing group that is used in source project.
        /// </summary>
        [Input("useSourceProjectBillingGroup")]
        public Input<bool>? UseSourceProjectBillingGroup { get; set; }

        public ProjectState()
        {
        }
        public static new ProjectState Empty => new ProjectState();
    }
}
