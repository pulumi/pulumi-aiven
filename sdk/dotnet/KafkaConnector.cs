// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aiven
{
    public partial class KafkaConnector : Pulumi.CustomResource
    {
        /// <summary>
        /// Kafka Connector configuration parameters
        /// </summary>
        [Output("config")]
        public Output<ImmutableDictionary<string, string>> Config { get; private set; } = null!;

        /// <summary>
        /// Kafka connector name
        /// </summary>
        [Output("connectorName")]
        public Output<string> ConnectorName { get; private set; } = null!;

        /// <summary>
        /// Kafka connector author
        /// </summary>
        [Output("pluginAuthor")]
        public Output<string> PluginAuthor { get; private set; } = null!;

        /// <summary>
        /// Kafka connector Java class
        /// </summary>
        [Output("pluginClass")]
        public Output<string> PluginClass { get; private set; } = null!;

        /// <summary>
        /// Kafka connector documentation URL
        /// </summary>
        [Output("pluginDocUrl")]
        public Output<string> PluginDocUrl { get; private set; } = null!;

        /// <summary>
        /// Kafka connector title
        /// </summary>
        [Output("pluginTitle")]
        public Output<string> PluginTitle { get; private set; } = null!;

        /// <summary>
        /// Kafka connector type
        /// </summary>
        [Output("pluginType")]
        public Output<string> PluginType { get; private set; } = null!;

        /// <summary>
        /// Kafka connector version
        /// </summary>
        [Output("pluginVersion")]
        public Output<string> PluginVersion { get; private set; } = null!;

        /// <summary>
        /// Project to link the kafka connector to
        /// </summary>
        [Output("project")]
        public Output<string> Project { get; private set; } = null!;

        /// <summary>
        /// Service to link the kafka connector to
        /// </summary>
        [Output("serviceName")]
        public Output<string> ServiceName { get; private set; } = null!;

        /// <summary>
        /// List of tasks of a connector
        /// </summary>
        [Output("tasks")]
        public Output<ImmutableArray<Outputs.KafkaConnectorTasks>> Tasks { get; private set; } = null!;


        /// <summary>
        /// Create a KafkaConnector resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public KafkaConnector(string name, KafkaConnectorArgs args, CustomResourceOptions? options = null)
            : base("aiven:index/kafkaConnector:KafkaConnector", name, args ?? ResourceArgs.Empty, MakeResourceOptions(options, ""))
        {
        }

        private KafkaConnector(string name, Input<string> id, KafkaConnectorState? state = null, CustomResourceOptions? options = null)
            : base("aiven:index/kafkaConnector:KafkaConnector", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing KafkaConnector resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static KafkaConnector Get(string name, Input<string> id, KafkaConnectorState? state = null, CustomResourceOptions? options = null)
        {
            return new KafkaConnector(name, id, state, options);
        }
    }

    public sealed class KafkaConnectorArgs : Pulumi.ResourceArgs
    {
        [Input("config", required: true)]
        private InputMap<string>? _config;

        /// <summary>
        /// Kafka Connector configuration parameters
        /// </summary>
        public InputMap<string> Config
        {
            get => _config ?? (_config = new InputMap<string>());
            set => _config = value;
        }

        /// <summary>
        /// Kafka connector name
        /// </summary>
        [Input("connectorName", required: true)]
        public Input<string> ConnectorName { get; set; } = null!;

        /// <summary>
        /// Project to link the kafka connector to
        /// </summary>
        [Input("project", required: true)]
        public Input<string> Project { get; set; } = null!;

        /// <summary>
        /// Service to link the kafka connector to
        /// </summary>
        [Input("serviceName", required: true)]
        public Input<string> ServiceName { get; set; } = null!;

        public KafkaConnectorArgs()
        {
        }
    }

    public sealed class KafkaConnectorState : Pulumi.ResourceArgs
    {
        [Input("config")]
        private InputMap<string>? _config;

        /// <summary>
        /// Kafka Connector configuration parameters
        /// </summary>
        public InputMap<string> Config
        {
            get => _config ?? (_config = new InputMap<string>());
            set => _config = value;
        }

        /// <summary>
        /// Kafka connector name
        /// </summary>
        [Input("connectorName")]
        public Input<string>? ConnectorName { get; set; }

        /// <summary>
        /// Kafka connector author
        /// </summary>
        [Input("pluginAuthor")]
        public Input<string>? PluginAuthor { get; set; }

        /// <summary>
        /// Kafka connector Java class
        /// </summary>
        [Input("pluginClass")]
        public Input<string>? PluginClass { get; set; }

        /// <summary>
        /// Kafka connector documentation URL
        /// </summary>
        [Input("pluginDocUrl")]
        public Input<string>? PluginDocUrl { get; set; }

        /// <summary>
        /// Kafka connector title
        /// </summary>
        [Input("pluginTitle")]
        public Input<string>? PluginTitle { get; set; }

        /// <summary>
        /// Kafka connector type
        /// </summary>
        [Input("pluginType")]
        public Input<string>? PluginType { get; set; }

        /// <summary>
        /// Kafka connector version
        /// </summary>
        [Input("pluginVersion")]
        public Input<string>? PluginVersion { get; set; }

        /// <summary>
        /// Project to link the kafka connector to
        /// </summary>
        [Input("project")]
        public Input<string>? Project { get; set; }

        /// <summary>
        /// Service to link the kafka connector to
        /// </summary>
        [Input("serviceName")]
        public Input<string>? ServiceName { get; set; }

        [Input("tasks")]
        private InputList<Inputs.KafkaConnectorTasksGetArgs>? _tasks;

        /// <summary>
        /// List of tasks of a connector
        /// </summary>
        public InputList<Inputs.KafkaConnectorTasksGetArgs> Tasks
        {
            get => _tasks ?? (_tasks = new InputList<Inputs.KafkaConnectorTasksGetArgs>());
            set => _tasks = value;
        }

        public KafkaConnectorState()
        {
        }
    }

    namespace Inputs
    {

    public sealed class KafkaConnectorTasksGetArgs : Pulumi.ResourceArgs
    {
        [Input("connector")]
        public Input<string>? Connector { get; set; }

        [Input("task")]
        public Input<int>? Task { get; set; }

        public KafkaConnectorTasksGetArgs()
        {
        }
    }
    }

    namespace Outputs
    {

    [OutputType]
    public sealed class KafkaConnectorTasks
    {
        public readonly string Connector;
        public readonly int Task;

        [OutputConstructor]
        private KafkaConnectorTasks(
            string connector,
            int task)
        {
            Connector = connector;
            Task = task;
        }
    }
    }
}