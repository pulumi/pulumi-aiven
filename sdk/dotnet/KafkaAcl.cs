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
    /// ## # Resource Kafka ACL Resource
    /// 
    /// The Resource Kafka ACL resource allows the creation and management of ACLs for an Aiven Kafka service.
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
    ///         var mytestacl = new Aiven.KafkaAcl("mytestacl", new Aiven.KafkaAclArgs
    ///         {
    ///             Project = aiven_project.Myproject.Project,
    ///             ServiceName = aiven_kafka.Myservice.Service_name,
    ///             Topic = "&lt;TOPIC_NAME_PATTERN&gt;",
    ///             Permission = "admin",
    ///             Username = "&lt;USERNAME_PATTERN&gt;",
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// </summary>
    [AivenResourceType("aiven:index/kafkaAcl:KafkaAcl")]
    public partial class KafkaAcl : Pulumi.CustomResource
    {
        /// <summary>
        /// is the level of permission the matching users are given to the matching
        /// topics (admin, read, readwrite, write).
        /// </summary>
        [Output("permission")]
        public Output<string> Permission { get; private set; } = null!;

        /// <summary>
        /// and `service_name` - (Required) define the project and service the ACL belongs to.
        /// They should be defined using reference as shown above to set up dependencies correctly.
        /// These properties cannot be changed once the service is created. Doing so will result in
        /// the topic being deleted and new one created instead.
        /// </summary>
        [Output("project")]
        public Output<string> Project { get; private set; } = null!;

        /// <summary>
        /// Service to link the Kafka ACL to
        /// </summary>
        [Output("serviceName")]
        public Output<string> ServiceName { get; private set; } = null!;

        /// <summary>
        /// is a topic name pattern the ACL entry matches to.
        /// </summary>
        [Output("topic")]
        public Output<string> Topic { get; private set; } = null!;

        /// <summary>
        /// is a username pattern the ACL entry matches to.
        /// </summary>
        [Output("username")]
        public Output<string> Username { get; private set; } = null!;


        /// <summary>
        /// Create a KafkaAcl resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public KafkaAcl(string name, KafkaAclArgs args, CustomResourceOptions? options = null)
            : base("aiven:index/kafkaAcl:KafkaAcl", name, args ?? new KafkaAclArgs(), MakeResourceOptions(options, ""))
        {
        }

        private KafkaAcl(string name, Input<string> id, KafkaAclState? state = null, CustomResourceOptions? options = null)
            : base("aiven:index/kafkaAcl:KafkaAcl", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing KafkaAcl resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static KafkaAcl Get(string name, Input<string> id, KafkaAclState? state = null, CustomResourceOptions? options = null)
        {
            return new KafkaAcl(name, id, state, options);
        }
    }

    public sealed class KafkaAclArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// is the level of permission the matching users are given to the matching
        /// topics (admin, read, readwrite, write).
        /// </summary>
        [Input("permission", required: true)]
        public Input<string> Permission { get; set; } = null!;

        /// <summary>
        /// and `service_name` - (Required) define the project and service the ACL belongs to.
        /// They should be defined using reference as shown above to set up dependencies correctly.
        /// These properties cannot be changed once the service is created. Doing so will result in
        /// the topic being deleted and new one created instead.
        /// </summary>
        [Input("project", required: true)]
        public Input<string> Project { get; set; } = null!;

        /// <summary>
        /// Service to link the Kafka ACL to
        /// </summary>
        [Input("serviceName", required: true)]
        public Input<string> ServiceName { get; set; } = null!;

        /// <summary>
        /// is a topic name pattern the ACL entry matches to.
        /// </summary>
        [Input("topic", required: true)]
        public Input<string> Topic { get; set; } = null!;

        /// <summary>
        /// is a username pattern the ACL entry matches to.
        /// </summary>
        [Input("username", required: true)]
        public Input<string> Username { get; set; } = null!;

        public KafkaAclArgs()
        {
        }
    }

    public sealed class KafkaAclState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// is the level of permission the matching users are given to the matching
        /// topics (admin, read, readwrite, write).
        /// </summary>
        [Input("permission")]
        public Input<string>? Permission { get; set; }

        /// <summary>
        /// and `service_name` - (Required) define the project and service the ACL belongs to.
        /// They should be defined using reference as shown above to set up dependencies correctly.
        /// These properties cannot be changed once the service is created. Doing so will result in
        /// the topic being deleted and new one created instead.
        /// </summary>
        [Input("project")]
        public Input<string>? Project { get; set; }

        /// <summary>
        /// Service to link the Kafka ACL to
        /// </summary>
        [Input("serviceName")]
        public Input<string>? ServiceName { get; set; }

        /// <summary>
        /// is a topic name pattern the ACL entry matches to.
        /// </summary>
        [Input("topic")]
        public Input<string>? Topic { get; set; }

        /// <summary>
        /// is a username pattern the ACL entry matches to.
        /// </summary>
        [Input("username")]
        public Input<string>? Username { get; set; }

        public KafkaAclState()
        {
        }
    }
}
