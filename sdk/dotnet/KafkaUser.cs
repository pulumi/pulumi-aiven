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
    /// The Kafka User resource allows the creation and management of Aiven Kafka Users.
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
    ///     var foo = new Aiven.KafkaUser("foo", new()
    ///     {
    ///         ServiceName = aiven_kafka.Bar.Service_name,
    ///         Project = "my-project",
    ///         Username = "user-1",
    ///         Password = "Test$1234",
    ///     });
    /// 
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// 
    /// ## Import
    /// 
    /// ```sh
    /// $ pulumi import aiven:index/kafkaUser:KafkaUser foo project/service_name/username
    /// ```
    /// </summary>
    [AivenResourceType("aiven:index/kafkaUser:KafkaUser")]
    public partial class KafkaUser : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Access certificate for the user
        /// </summary>
        [Output("accessCert")]
        public Output<string> AccessCert { get; private set; } = null!;

        /// <summary>
        /// Access certificate key for the user
        /// </summary>
        [Output("accessKey")]
        public Output<string> AccessKey { get; private set; } = null!;

        /// <summary>
        /// The password of the Kafka User.
        /// </summary>
        [Output("password")]
        public Output<string> Password { get; private set; } = null!;

        /// <summary>
        /// Identifies the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
        /// </summary>
        [Output("project")]
        public Output<string> Project { get; private set; } = null!;

        /// <summary>
        /// Specifies the name of the service that this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
        /// </summary>
        [Output("serviceName")]
        public Output<string> ServiceName { get; private set; } = null!;

        /// <summary>
        /// Type of the user account. Tells whether the user is the primary account or a regular account.
        /// </summary>
        [Output("type")]
        public Output<string> Type { get; private set; } = null!;

        /// <summary>
        /// The actual name of the Kafka User. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
        /// </summary>
        [Output("username")]
        public Output<string> Username { get; private set; } = null!;


        /// <summary>
        /// Create a KafkaUser resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public KafkaUser(string name, KafkaUserArgs args, CustomResourceOptions? options = null)
            : base("aiven:index/kafkaUser:KafkaUser", name, args ?? new KafkaUserArgs(), MakeResourceOptions(options, ""))
        {
        }

        private KafkaUser(string name, Input<string> id, KafkaUserState? state = null, CustomResourceOptions? options = null)
            : base("aiven:index/kafkaUser:KafkaUser", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                AdditionalSecretOutputs =
                {
                    "accessCert",
                    "accessKey",
                    "password",
                },
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing KafkaUser resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static KafkaUser Get(string name, Input<string> id, KafkaUserState? state = null, CustomResourceOptions? options = null)
        {
            return new KafkaUser(name, id, state, options);
        }
    }

    public sealed class KafkaUserArgs : global::Pulumi.ResourceArgs
    {
        [Input("password")]
        private Input<string>? _password;

        /// <summary>
        /// The password of the Kafka User.
        /// </summary>
        public Input<string>? Password
        {
            get => _password;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _password = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// Identifies the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
        /// </summary>
        [Input("project", required: true)]
        public Input<string> Project { get; set; } = null!;

        /// <summary>
        /// Specifies the name of the service that this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
        /// </summary>
        [Input("serviceName", required: true)]
        public Input<string> ServiceName { get; set; } = null!;

        /// <summary>
        /// The actual name of the Kafka User. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
        /// </summary>
        [Input("username", required: true)]
        public Input<string> Username { get; set; } = null!;

        public KafkaUserArgs()
        {
        }
        public static new KafkaUserArgs Empty => new KafkaUserArgs();
    }

    public sealed class KafkaUserState : global::Pulumi.ResourceArgs
    {
        [Input("accessCert")]
        private Input<string>? _accessCert;

        /// <summary>
        /// Access certificate for the user
        /// </summary>
        public Input<string>? AccessCert
        {
            get => _accessCert;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _accessCert = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        [Input("accessKey")]
        private Input<string>? _accessKey;

        /// <summary>
        /// Access certificate key for the user
        /// </summary>
        public Input<string>? AccessKey
        {
            get => _accessKey;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _accessKey = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        [Input("password")]
        private Input<string>? _password;

        /// <summary>
        /// The password of the Kafka User.
        /// </summary>
        public Input<string>? Password
        {
            get => _password;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _password = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// Identifies the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
        /// </summary>
        [Input("project")]
        public Input<string>? Project { get; set; }

        /// <summary>
        /// Specifies the name of the service that this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
        /// </summary>
        [Input("serviceName")]
        public Input<string>? ServiceName { get; set; }

        /// <summary>
        /// Type of the user account. Tells whether the user is the primary account or a regular account.
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        /// <summary>
        /// The actual name of the Kafka User. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
        /// </summary>
        [Input("username")]
        public Input<string>? Username { get; set; }

        public KafkaUserState()
        {
        }
        public static new KafkaUserState Empty => new KafkaUserState();
    }
}
