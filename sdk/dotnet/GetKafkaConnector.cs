// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aiven
{
    public static partial class Invokes
    {
        public static Task<GetKafkaConnectorResult> GetKafkaConnector(GetKafkaConnectorArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetKafkaConnectorResult>("aiven:index/getKafkaConnector:getKafkaConnector", args ?? ResourceArgs.Empty, options.WithVersion());
    }

    public sealed class GetKafkaConnectorArgs : Pulumi.ResourceArgs
    {
        [Input("config")]
        private InputMap<string>? _config;
        public InputMap<string> Config
        {
            get => _config ?? (_config = new InputMap<string>());
            set => _config = value;
        }

        [Input("connectorName", required: true)]
        public Input<string> ConnectorName { get; set; } = null!;

        [Input("pluginAuthor")]
        public Input<string>? PluginAuthor { get; set; }

        [Input("pluginClass")]
        public Input<string>? PluginClass { get; set; }

        [Input("pluginDocUrl")]
        public Input<string>? PluginDocUrl { get; set; }

        [Input("pluginTitle")]
        public Input<string>? PluginTitle { get; set; }

        [Input("pluginType")]
        public Input<string>? PluginType { get; set; }

        [Input("pluginVersion")]
        public Input<string>? PluginVersion { get; set; }

        [Input("project", required: true)]
        public Input<string> Project { get; set; } = null!;

        [Input("serviceName", required: true)]
        public Input<string> ServiceName { get; set; } = null!;

        [Input("tasks")]
        private InputList<Inputs.GetKafkaConnectorTasksArgs>? _tasks;
        public InputList<Inputs.GetKafkaConnectorTasksArgs> Tasks
        {
            get => _tasks ?? (_tasks = new InputList<Inputs.GetKafkaConnectorTasksArgs>());
            set => _tasks = value;
        }

        public GetKafkaConnectorArgs()
        {
        }
    }

    [OutputType]
    public sealed class GetKafkaConnectorResult
    {
        public readonly ImmutableDictionary<string, string>? Config;
        public readonly string ConnectorName;
        public readonly string PluginAuthor;
        public readonly string PluginClass;
        public readonly string PluginDocUrl;
        public readonly string PluginTitle;
        public readonly string PluginType;
        public readonly string PluginVersion;
        public readonly string Project;
        public readonly string ServiceName;
        public readonly ImmutableArray<Outputs.GetKafkaConnectorTasksResult> Tasks;
        /// <summary>
        /// id is the provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;

        [OutputConstructor]
        private GetKafkaConnectorResult(
            ImmutableDictionary<string, string>? config,
            string connectorName,
            string pluginAuthor,
            string pluginClass,
            string pluginDocUrl,
            string pluginTitle,
            string pluginType,
            string pluginVersion,
            string project,
            string serviceName,
            ImmutableArray<Outputs.GetKafkaConnectorTasksResult> tasks,
            string id)
        {
            Config = config;
            ConnectorName = connectorName;
            PluginAuthor = pluginAuthor;
            PluginClass = pluginClass;
            PluginDocUrl = pluginDocUrl;
            PluginTitle = pluginTitle;
            PluginType = pluginType;
            PluginVersion = pluginVersion;
            Project = project;
            ServiceName = serviceName;
            Tasks = tasks;
            Id = id;
        }
    }

    namespace Inputs
    {

    public sealed class GetKafkaConnectorTasksArgs : Pulumi.ResourceArgs
    {
        [Input("connector")]
        public Input<string>? Connector { get; set; }

        [Input("task")]
        public Input<int>? Task { get; set; }

        public GetKafkaConnectorTasksArgs()
        {
        }
    }
    }

    namespace Outputs
    {

    [OutputType]
    public sealed class GetKafkaConnectorTasksResult
    {
        public readonly string Connector;
        public readonly int Task;

        [OutputConstructor]
        private GetKafkaConnectorTasksResult(
            string connector,
            int task)
        {
            Connector = connector;
            Task = task;
        }
    }
    }
}