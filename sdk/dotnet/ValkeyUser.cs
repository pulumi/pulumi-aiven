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
    /// Creates and manages an [Aiven for Valkey™](https://aiven.io/docs/products/valkey) service user.
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
    ///     // Example user with read-only access for analytics
    ///     var readAnalytics = new Aiven.ValkeyUser("read_analytics", new()
    ///     {
    ///         Project = exampleProject.Project,
    ///         ServiceName = exampleValkey.ServiceName,
    ///         Username = "example-analytics-reader",
    ///         Password = valkeyUserPw,
    ///         ValkeyAclCategories = new[]
    ///         {
    ///             "+@read",
    ///         },
    ///         ValkeyAclCommands = new[]
    ///         {
    ///             "+get",
    ///             "+set",
    ///             "+mget",
    ///             "+hget",
    ///             "+zrange",
    ///         },
    ///         ValkeyAclKeys = new[]
    ///         {
    ///             "analytics:*",
    ///         },
    ///     });
    /// 
    ///     // Example user with restricted write access for session management
    ///     var manageSessions = new Aiven.ValkeyUser("manage_sessions", new()
    ///     {
    ///         Project = exampleProject.Project,
    ///         ServiceName = exampleValkey.ServiceName,
    ///         Username = "example-session-manager",
    ///         Password = valkeyUserPw,
    ///         ValkeyAclCategories = new[]
    ///         {
    ///             "+@write",
    ///             "+@keyspace",
    ///         },
    ///         ValkeyAclCommands = new[]
    ///         {
    ///             "+set",
    ///             "+del",
    ///             "+expire",
    ///             "-flushall",
    ///             "-flushdb",
    ///         },
    ///         ValkeyAclKeys = new[]
    ///         {
    ///             "session:*",
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// ```sh
    /// $ pulumi import aiven:index/valkeyUser:ValkeyUser example_valkey PROJECT/SERVICE_NAME/USERNAME
    /// ```
    /// </summary>
    [AivenResourceType("aiven:index/valkeyUser:ValkeyUser")]
    public partial class ValkeyUser : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The Valkey service user's password.
        /// </summary>
        [Output("password")]
        public Output<string> Password { get; private set; } = null!;

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
        /// User account type, such as primary or regular account.
        /// </summary>
        [Output("type")]
        public Output<string> Type { get; private set; } = null!;

        /// <summary>
        /// Name of the Valkey service user. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
        /// </summary>
        [Output("username")]
        public Output<string> Username { get; private set; } = null!;

        /// <summary>
        /// Allow or disallow command categories. To allow a category use the prefix `+@` and to disallow use `-@`. See the [Valkey documentation](https://valkey.io/topics/acl/) for details on the ACL feature. The field is required with`valkey_acl_commands` and `valkey_acl_keys`. Changing this property forces recreation of the resource.
        /// </summary>
        [Output("valkeyAclCategories")]
        public Output<ImmutableArray<string>> ValkeyAclCategories { get; private set; } = null!;

        /// <summary>
        /// Allows and disallows access to pub/sub channels. Entries are defined as standard glob patterns. Changing this property forces recreation of the resource.
        /// </summary>
        [Output("valkeyAclChannels")]
        public Output<ImmutableArray<string>> ValkeyAclChannels { get; private set; } = null!;

        /// <summary>
        /// Defines rules for individual commands. To allow a command use the prefix `+` and to disallow use `-`. The field is required with`valkey_acl_categories` and `valkey_acl_keys`. Changing this property forces recreation of the resource.
        /// </summary>
        [Output("valkeyAclCommands")]
        public Output<ImmutableArray<string>> ValkeyAclCommands { get; private set; } = null!;

        /// <summary>
        /// Key access rules. Entries are defined as standard glob patterns. The field is required with`valkey_acl_categories` and `valkey_acl_keys`. Changing this property forces recreation of the resource.
        /// </summary>
        [Output("valkeyAclKeys")]
        public Output<ImmutableArray<string>> ValkeyAclKeys { get; private set; } = null!;


        /// <summary>
        /// Create a ValkeyUser resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ValkeyUser(string name, ValkeyUserArgs args, CustomResourceOptions? options = null)
            : base("aiven:index/valkeyUser:ValkeyUser", name, args ?? new ValkeyUserArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ValkeyUser(string name, Input<string> id, ValkeyUserState? state = null, CustomResourceOptions? options = null)
            : base("aiven:index/valkeyUser:ValkeyUser", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                AdditionalSecretOutputs =
                {
                    "password",
                },
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing ValkeyUser resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ValkeyUser Get(string name, Input<string> id, ValkeyUserState? state = null, CustomResourceOptions? options = null)
        {
            return new ValkeyUser(name, id, state, options);
        }
    }

    public sealed class ValkeyUserArgs : global::Pulumi.ResourceArgs
    {
        [Input("password")]
        private Input<string>? _password;

        /// <summary>
        /// The Valkey service user's password.
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
        /// The name of the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
        /// </summary>
        [Input("project", required: true)]
        public Input<string> Project { get; set; } = null!;

        /// <summary>
        /// The name of the service that this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
        /// </summary>
        [Input("serviceName", required: true)]
        public Input<string> ServiceName { get; set; } = null!;

        /// <summary>
        /// Name of the Valkey service user. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
        /// </summary>
        [Input("username", required: true)]
        public Input<string> Username { get; set; } = null!;

        [Input("valkeyAclCategories")]
        private InputList<string>? _valkeyAclCategories;

        /// <summary>
        /// Allow or disallow command categories. To allow a category use the prefix `+@` and to disallow use `-@`. See the [Valkey documentation](https://valkey.io/topics/acl/) for details on the ACL feature. The field is required with`valkey_acl_commands` and `valkey_acl_keys`. Changing this property forces recreation of the resource.
        /// </summary>
        public InputList<string> ValkeyAclCategories
        {
            get => _valkeyAclCategories ?? (_valkeyAclCategories = new InputList<string>());
            set => _valkeyAclCategories = value;
        }

        [Input("valkeyAclChannels")]
        private InputList<string>? _valkeyAclChannels;

        /// <summary>
        /// Allows and disallows access to pub/sub channels. Entries are defined as standard glob patterns. Changing this property forces recreation of the resource.
        /// </summary>
        public InputList<string> ValkeyAclChannels
        {
            get => _valkeyAclChannels ?? (_valkeyAclChannels = new InputList<string>());
            set => _valkeyAclChannels = value;
        }

        [Input("valkeyAclCommands")]
        private InputList<string>? _valkeyAclCommands;

        /// <summary>
        /// Defines rules for individual commands. To allow a command use the prefix `+` and to disallow use `-`. The field is required with`valkey_acl_categories` and `valkey_acl_keys`. Changing this property forces recreation of the resource.
        /// </summary>
        public InputList<string> ValkeyAclCommands
        {
            get => _valkeyAclCommands ?? (_valkeyAclCommands = new InputList<string>());
            set => _valkeyAclCommands = value;
        }

        [Input("valkeyAclKeys")]
        private InputList<string>? _valkeyAclKeys;

        /// <summary>
        /// Key access rules. Entries are defined as standard glob patterns. The field is required with`valkey_acl_categories` and `valkey_acl_keys`. Changing this property forces recreation of the resource.
        /// </summary>
        public InputList<string> ValkeyAclKeys
        {
            get => _valkeyAclKeys ?? (_valkeyAclKeys = new InputList<string>());
            set => _valkeyAclKeys = value;
        }

        public ValkeyUserArgs()
        {
        }
        public static new ValkeyUserArgs Empty => new ValkeyUserArgs();
    }

    public sealed class ValkeyUserState : global::Pulumi.ResourceArgs
    {
        [Input("password")]
        private Input<string>? _password;

        /// <summary>
        /// The Valkey service user's password.
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
        /// The name of the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
        /// </summary>
        [Input("project")]
        public Input<string>? Project { get; set; }

        /// <summary>
        /// The name of the service that this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
        /// </summary>
        [Input("serviceName")]
        public Input<string>? ServiceName { get; set; }

        /// <summary>
        /// User account type, such as primary or regular account.
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        /// <summary>
        /// Name of the Valkey service user. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
        /// </summary>
        [Input("username")]
        public Input<string>? Username { get; set; }

        [Input("valkeyAclCategories")]
        private InputList<string>? _valkeyAclCategories;

        /// <summary>
        /// Allow or disallow command categories. To allow a category use the prefix `+@` and to disallow use `-@`. See the [Valkey documentation](https://valkey.io/topics/acl/) for details on the ACL feature. The field is required with`valkey_acl_commands` and `valkey_acl_keys`. Changing this property forces recreation of the resource.
        /// </summary>
        public InputList<string> ValkeyAclCategories
        {
            get => _valkeyAclCategories ?? (_valkeyAclCategories = new InputList<string>());
            set => _valkeyAclCategories = value;
        }

        [Input("valkeyAclChannels")]
        private InputList<string>? _valkeyAclChannels;

        /// <summary>
        /// Allows and disallows access to pub/sub channels. Entries are defined as standard glob patterns. Changing this property forces recreation of the resource.
        /// </summary>
        public InputList<string> ValkeyAclChannels
        {
            get => _valkeyAclChannels ?? (_valkeyAclChannels = new InputList<string>());
            set => _valkeyAclChannels = value;
        }

        [Input("valkeyAclCommands")]
        private InputList<string>? _valkeyAclCommands;

        /// <summary>
        /// Defines rules for individual commands. To allow a command use the prefix `+` and to disallow use `-`. The field is required with`valkey_acl_categories` and `valkey_acl_keys`. Changing this property forces recreation of the resource.
        /// </summary>
        public InputList<string> ValkeyAclCommands
        {
            get => _valkeyAclCommands ?? (_valkeyAclCommands = new InputList<string>());
            set => _valkeyAclCommands = value;
        }

        [Input("valkeyAclKeys")]
        private InputList<string>? _valkeyAclKeys;

        /// <summary>
        /// Key access rules. Entries are defined as standard glob patterns. The field is required with`valkey_acl_categories` and `valkey_acl_keys`. Changing this property forces recreation of the resource.
        /// </summary>
        public InputList<string> ValkeyAclKeys
        {
            get => _valkeyAclKeys ?? (_valkeyAclKeys = new InputList<string>());
            set => _valkeyAclKeys = value;
        }

        public ValkeyUserState()
        {
        }
        public static new ValkeyUserState Empty => new ValkeyUserState();
    }
}
