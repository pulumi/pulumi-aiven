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
    /// The Resource Kafka Schema Registry ACL resource allows the creation and management of Schema Registry ACLs for an Aiven Kafka service.
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
    ///     var foo = new Aiven.KafkaSchemaRegistryAcl("foo", new()
    ///     {
    ///         Project = kafka_schemas_project1.Project,
    ///         ServiceName = kafka_service1.ServiceName,
    ///         Resource = "Subject:topic-1",
    ///         Username = "group-user-*",
    ///         Permission = "schema_registry_read",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// ```sh
    /// $ pulumi import aiven:index/kafkaSchemaRegistryAcl:KafkaSchemaRegistryAcl foo PROJECT/SERVICE_NAME
    /// ```
    /// </summary>
    [AivenResourceType("aiven:index/kafkaSchemaRegistryAcl:KafkaSchemaRegistryAcl")]
    public partial class KafkaSchemaRegistryAcl : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Kafka Schema Registry ACL ID
        /// </summary>
        [Output("aclId")]
        public Output<string> AclId { get; private set; } = null!;

        /// <summary>
        /// Kafka Schema Registry permission to grant. The possible values are `schema_registry_read` and `schema_registry_write`. Changing this property forces recreation of the resource.
        /// </summary>
        [Output("permission")]
        public Output<string> Permission { get; private set; } = null!;

        /// <summary>
        /// The name of the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
        /// </summary>
        [Output("project")]
        public Output<string> Project { get; private set; } = null!;

        /// <summary>
        /// Resource name pattern for the Schema Registry ACL entry. Changing this property forces recreation of the resource.
        /// </summary>
        [Output("resource")]
        public Output<string> Resource { get; private set; } = null!;

        /// <summary>
        /// The name of the service that this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
        /// </summary>
        [Output("serviceName")]
        public Output<string> ServiceName { get; private set; } = null!;

        /// <summary>
        /// Username pattern for the ACL entry. Changing this property forces recreation of the resource.
        /// </summary>
        [Output("username")]
        public Output<string> Username { get; private set; } = null!;


        /// <summary>
        /// Create a KafkaSchemaRegistryAcl resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public KafkaSchemaRegistryAcl(string name, KafkaSchemaRegistryAclArgs args, CustomResourceOptions? options = null)
            : base("aiven:index/kafkaSchemaRegistryAcl:KafkaSchemaRegistryAcl", name, args ?? new KafkaSchemaRegistryAclArgs(), MakeResourceOptions(options, ""))
        {
        }

        private KafkaSchemaRegistryAcl(string name, Input<string> id, KafkaSchemaRegistryAclState? state = null, CustomResourceOptions? options = null)
            : base("aiven:index/kafkaSchemaRegistryAcl:KafkaSchemaRegistryAcl", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing KafkaSchemaRegistryAcl resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static KafkaSchemaRegistryAcl Get(string name, Input<string> id, KafkaSchemaRegistryAclState? state = null, CustomResourceOptions? options = null)
        {
            return new KafkaSchemaRegistryAcl(name, id, state, options);
        }
    }

    public sealed class KafkaSchemaRegistryAclArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Kafka Schema Registry permission to grant. The possible values are `schema_registry_read` and `schema_registry_write`. Changing this property forces recreation of the resource.
        /// </summary>
        [Input("permission", required: true)]
        public Input<string> Permission { get; set; } = null!;

        /// <summary>
        /// The name of the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
        /// </summary>
        [Input("project", required: true)]
        public Input<string> Project { get; set; } = null!;

        /// <summary>
        /// Resource name pattern for the Schema Registry ACL entry. Changing this property forces recreation of the resource.
        /// </summary>
        [Input("resource", required: true)]
        public Input<string> Resource { get; set; } = null!;

        /// <summary>
        /// The name of the service that this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
        /// </summary>
        [Input("serviceName", required: true)]
        public Input<string> ServiceName { get; set; } = null!;

        /// <summary>
        /// Username pattern for the ACL entry. Changing this property forces recreation of the resource.
        /// </summary>
        [Input("username", required: true)]
        public Input<string> Username { get; set; } = null!;

        public KafkaSchemaRegistryAclArgs()
        {
        }
        public static new KafkaSchemaRegistryAclArgs Empty => new KafkaSchemaRegistryAclArgs();
    }

    public sealed class KafkaSchemaRegistryAclState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Kafka Schema Registry ACL ID
        /// </summary>
        [Input("aclId")]
        public Input<string>? AclId { get; set; }

        /// <summary>
        /// Kafka Schema Registry permission to grant. The possible values are `schema_registry_read` and `schema_registry_write`. Changing this property forces recreation of the resource.
        /// </summary>
        [Input("permission")]
        public Input<string>? Permission { get; set; }

        /// <summary>
        /// The name of the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
        /// </summary>
        [Input("project")]
        public Input<string>? Project { get; set; }

        /// <summary>
        /// Resource name pattern for the Schema Registry ACL entry. Changing this property forces recreation of the resource.
        /// </summary>
        [Input("resource")]
        public Input<string>? Resource { get; set; }

        /// <summary>
        /// The name of the service that this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
        /// </summary>
        [Input("serviceName")]
        public Input<string>? ServiceName { get; set; }

        /// <summary>
        /// Username pattern for the ACL entry. Changing this property forces recreation of the resource.
        /// </summary>
        [Input("username")]
        public Input<string>? Username { get; set; }

        public KafkaSchemaRegistryAclState()
        {
        }
        public static new KafkaSchemaRegistryAclState Empty => new KafkaSchemaRegistryAclState();
    }
}