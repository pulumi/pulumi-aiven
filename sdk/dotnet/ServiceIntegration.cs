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
    ///     // Integrate Kafka and Thanos services for metrics
    ///     var exampleIntegration = new Aiven.ServiceIntegration("example_integration", new()
    ///     {
    ///         Project = exampleProject.Project,
    ///         IntegrationType = "metrics",
    ///         SourceServiceName = exampleKafka.ServiceName,
    ///         DestinationServiceName = exampleThanos.ServiceName,
    ///     });
    /// 
    ///     // Use disk autoscaler with a PostgreSQL service
    ///     var autoscalerEndpoint = new Aiven.ServiceIntegrationEndpoint("autoscaler_endpoint", new()
    ///     {
    ///         Project = exampleProject.Project,
    ///         EndpointName = "disk-autoscaler-200GiB",
    ///         EndpointType = "autoscaler",
    ///         AutoscalerUserConfig = new Aiven.Inputs.ServiceIntegrationEndpointAutoscalerUserConfigArgs
    ///         {
    ///             Autoscalings = new[]
    ///             {
    ///                 new Aiven.Inputs.ServiceIntegrationEndpointAutoscalerUserConfigAutoscalingArgs
    ///                 {
    ///                     CapGb = 200,
    ///                     Type = "autoscale_disk",
    ///                 },
    ///             },
    ///         },
    ///     });
    /// 
    ///     var autoscalerIntegration = new Aiven.ServiceIntegration("autoscaler_integration", new()
    ///     {
    ///         Project = exampleProject.Project,
    ///         IntegrationType = "autoscaler",
    ///         SourceServiceName = examplePg.ServiceName,
    ///         DestinationEndpointId = autoscalerEndpoint.Id,
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// ```sh
    /// $ pulumi import aiven:index/serviceIntegration:ServiceIntegration example_integration PROJECT/INTEGRATION_ID
    /// ```
    /// </summary>
    [AivenResourceType("aiven:index/serviceIntegration:ServiceIntegration")]
    public partial class ServiceIntegration : global::Pulumi.CustomResource
    {
        /// <summary>
        /// ClickhouseKafka user configurable settings. **Warning:** There's no way to reset advanced configuration options to default. Options that you add cannot be removed later
        /// </summary>
        [Output("clickhouseKafkaUserConfig")]
        public Output<Outputs.ServiceIntegrationClickhouseKafkaUserConfig?> ClickhouseKafkaUserConfig { get; private set; } = null!;

        /// <summary>
        /// ClickhousePostgresql user configurable settings. **Warning:** There's no way to reset advanced configuration options to default. Options that you add cannot be removed later
        /// </summary>
        [Output("clickhousePostgresqlUserConfig")]
        public Output<Outputs.ServiceIntegrationClickhousePostgresqlUserConfig?> ClickhousePostgresqlUserConfig { get; private set; } = null!;

        /// <summary>
        /// Datadog user configurable settings. **Warning:** There's no way to reset advanced configuration options to default. Options that you add cannot be removed later
        /// </summary>
        [Output("datadogUserConfig")]
        public Output<Outputs.ServiceIntegrationDatadogUserConfig?> DatadogUserConfig { get; private set; } = null!;

        /// <summary>
        /// Destination endpoint for the integration.
        /// </summary>
        [Output("destinationEndpointId")]
        public Output<string?> DestinationEndpointId { get; private set; } = null!;

        /// <summary>
        /// Destination service for the integration.
        /// </summary>
        [Output("destinationServiceName")]
        public Output<string?> DestinationServiceName { get; private set; } = null!;

        /// <summary>
        /// Destination service project name
        /// </summary>
        [Output("destinationServiceProject")]
        public Output<string> DestinationServiceProject { get; private set; } = null!;

        /// <summary>
        /// ExternalAwsCloudwatchLogs user configurable settings. **Warning:** There's no way to reset advanced configuration options to default. Options that you add cannot be removed later
        /// </summary>
        [Output("externalAwsCloudwatchLogsUserConfig")]
        public Output<Outputs.ServiceIntegrationExternalAwsCloudwatchLogsUserConfig?> ExternalAwsCloudwatchLogsUserConfig { get; private set; } = null!;

        /// <summary>
        /// ExternalAwsCloudwatchMetrics user configurable settings. **Warning:** There's no way to reset advanced configuration options to default. Options that you add cannot be removed later
        /// </summary>
        [Output("externalAwsCloudwatchMetricsUserConfig")]
        public Output<Outputs.ServiceIntegrationExternalAwsCloudwatchMetricsUserConfig?> ExternalAwsCloudwatchMetricsUserConfig { get; private set; } = null!;

        /// <summary>
        /// ExternalElasticsearchLogs user configurable settings. **Warning:** There's no way to reset advanced configuration options to default. Options that you add cannot be removed later
        /// </summary>
        [Output("externalElasticsearchLogsUserConfig")]
        public Output<Outputs.ServiceIntegrationExternalElasticsearchLogsUserConfig?> ExternalElasticsearchLogsUserConfig { get; private set; } = null!;

        /// <summary>
        /// ExternalOpensearchLogs user configurable settings. **Warning:** There's no way to reset advanced configuration options to default. Options that you add cannot be removed later
        /// </summary>
        [Output("externalOpensearchLogsUserConfig")]
        public Output<Outputs.ServiceIntegrationExternalOpensearchLogsUserConfig?> ExternalOpensearchLogsUserConfig { get; private set; } = null!;

        /// <summary>
        /// FlinkExternalPostgresql user configurable settings. **Warning:** There's no way to reset advanced configuration options to default. Options that you add cannot be removed later
        /// </summary>
        [Output("flinkExternalPostgresqlUserConfig")]
        public Output<Outputs.ServiceIntegrationFlinkExternalPostgresqlUserConfig?> FlinkExternalPostgresqlUserConfig { get; private set; } = null!;

        /// <summary>
        /// The ID of the Aiven service integration.
        /// </summary>
        [Output("integrationId")]
        public Output<string> IntegrationId { get; private set; } = null!;

        /// <summary>
        /// Type of the service integration. The possible values are `alertmanager`, `autoscaler`, `caching`, `cassandra_cross_service_cluster`, `clickhouse_credentials`, `clickhouse_kafka`, `clickhouse_postgresql`, `dashboard`, `datadog`, `datasource`, `disaster_recovery`, `external_aws_cloudwatch_logs`, `external_aws_cloudwatch_metrics`, `external_elasticsearch_logs`, `external_google_cloud_logging`, `external_opensearch_logs`, `flink`, `flink_external_bigquery`, `flink_external_kafka`, `flink_external_postgresql`, `internal_connectivity`, `jolokia`, `kafka_connect`, `kafka_connect_postgresql`, `kafka_logs`, `kafka_mirrormaker`, `logs`, `m3aggregator`, `m3coordinator`, `metrics`, `opensearch_cross_cluster_replication`, `opensearch_cross_cluster_search`, `prometheus`, `read_replica`, `rsyslog`, `schema_registry_proxy`, `stresstester`, `thanos_distributed_query`, `thanos_migrate`, `thanoscompactor`, `thanosquery`, `thanosruler`, `thanosstore`, `vector` and `vmalert`.
        /// </summary>
        [Output("integrationType")]
        public Output<string> IntegrationType { get; private set; } = null!;

        /// <summary>
        /// KafkaConnect user configurable settings. **Warning:** There's no way to reset advanced configuration options to default. Options that you add cannot be removed later
        /// </summary>
        [Output("kafkaConnectUserConfig")]
        public Output<Outputs.ServiceIntegrationKafkaConnectUserConfig?> KafkaConnectUserConfig { get; private set; } = null!;

        /// <summary>
        /// KafkaLogs user configurable settings. **Warning:** There's no way to reset advanced configuration options to default. Options that you add cannot be removed later
        /// </summary>
        [Output("kafkaLogsUserConfig")]
        public Output<Outputs.ServiceIntegrationKafkaLogsUserConfig?> KafkaLogsUserConfig { get; private set; } = null!;

        /// <summary>
        /// KafkaMirrormaker user configurable settings. **Warning:** There's no way to reset advanced configuration options to default. Options that you add cannot be removed later
        /// </summary>
        [Output("kafkaMirrormakerUserConfig")]
        public Output<Outputs.ServiceIntegrationKafkaMirrormakerUserConfig?> KafkaMirrormakerUserConfig { get; private set; } = null!;

        /// <summary>
        /// Logs user configurable settings. **Warning:** There's no way to reset advanced configuration options to default. Options that you add cannot be removed later
        /// </summary>
        [Output("logsUserConfig")]
        public Output<Outputs.ServiceIntegrationLogsUserConfig?> LogsUserConfig { get; private set; } = null!;

        /// <summary>
        /// Metrics user configurable settings. **Warning:** There's no way to reset advanced configuration options to default. Options that you add cannot be removed later
        /// </summary>
        [Output("metricsUserConfig")]
        public Output<Outputs.ServiceIntegrationMetricsUserConfig?> MetricsUserConfig { get; private set; } = null!;

        /// <summary>
        /// Project the integration belongs to.
        /// </summary>
        [Output("project")]
        public Output<string> Project { get; private set; } = null!;

        /// <summary>
        /// Prometheus user configurable settings. **Warning:** There's no way to reset advanced configuration options to default. Options that you add cannot be removed later
        /// </summary>
        [Output("prometheusUserConfig")]
        public Output<Outputs.ServiceIntegrationPrometheusUserConfig?> PrometheusUserConfig { get; private set; } = null!;

        /// <summary>
        /// Source endpoint for the integration.
        /// </summary>
        [Output("sourceEndpointId")]
        public Output<string?> SourceEndpointId { get; private set; } = null!;

        /// <summary>
        /// Source service for the integration (if any)
        /// </summary>
        [Output("sourceServiceName")]
        public Output<string> SourceServiceName { get; private set; } = null!;

        /// <summary>
        /// Source service project name
        /// </summary>
        [Output("sourceServiceProject")]
        public Output<string> SourceServiceProject { get; private set; } = null!;


        /// <summary>
        /// Create a ServiceIntegration resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ServiceIntegration(string name, ServiceIntegrationArgs args, CustomResourceOptions? options = null)
            : base("aiven:index/serviceIntegration:ServiceIntegration", name, args ?? new ServiceIntegrationArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ServiceIntegration(string name, Input<string> id, ServiceIntegrationState? state = null, CustomResourceOptions? options = null)
            : base("aiven:index/serviceIntegration:ServiceIntegration", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing ServiceIntegration resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ServiceIntegration Get(string name, Input<string> id, ServiceIntegrationState? state = null, CustomResourceOptions? options = null)
        {
            return new ServiceIntegration(name, id, state, options);
        }
    }

    public sealed class ServiceIntegrationArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// ClickhouseKafka user configurable settings. **Warning:** There's no way to reset advanced configuration options to default. Options that you add cannot be removed later
        /// </summary>
        [Input("clickhouseKafkaUserConfig")]
        public Input<Inputs.ServiceIntegrationClickhouseKafkaUserConfigArgs>? ClickhouseKafkaUserConfig { get; set; }

        /// <summary>
        /// ClickhousePostgresql user configurable settings. **Warning:** There's no way to reset advanced configuration options to default. Options that you add cannot be removed later
        /// </summary>
        [Input("clickhousePostgresqlUserConfig")]
        public Input<Inputs.ServiceIntegrationClickhousePostgresqlUserConfigArgs>? ClickhousePostgresqlUserConfig { get; set; }

        /// <summary>
        /// Datadog user configurable settings. **Warning:** There's no way to reset advanced configuration options to default. Options that you add cannot be removed later
        /// </summary>
        [Input("datadogUserConfig")]
        public Input<Inputs.ServiceIntegrationDatadogUserConfigArgs>? DatadogUserConfig { get; set; }

        /// <summary>
        /// Destination endpoint for the integration.
        /// </summary>
        [Input("destinationEndpointId")]
        public Input<string>? DestinationEndpointId { get; set; }

        /// <summary>
        /// Destination service for the integration.
        /// </summary>
        [Input("destinationServiceName")]
        public Input<string>? DestinationServiceName { get; set; }

        /// <summary>
        /// Destination service project name
        /// </summary>
        [Input("destinationServiceProject")]
        public Input<string>? DestinationServiceProject { get; set; }

        /// <summary>
        /// ExternalAwsCloudwatchLogs user configurable settings. **Warning:** There's no way to reset advanced configuration options to default. Options that you add cannot be removed later
        /// </summary>
        [Input("externalAwsCloudwatchLogsUserConfig")]
        public Input<Inputs.ServiceIntegrationExternalAwsCloudwatchLogsUserConfigArgs>? ExternalAwsCloudwatchLogsUserConfig { get; set; }

        /// <summary>
        /// ExternalAwsCloudwatchMetrics user configurable settings. **Warning:** There's no way to reset advanced configuration options to default. Options that you add cannot be removed later
        /// </summary>
        [Input("externalAwsCloudwatchMetricsUserConfig")]
        public Input<Inputs.ServiceIntegrationExternalAwsCloudwatchMetricsUserConfigArgs>? ExternalAwsCloudwatchMetricsUserConfig { get; set; }

        /// <summary>
        /// ExternalElasticsearchLogs user configurable settings. **Warning:** There's no way to reset advanced configuration options to default. Options that you add cannot be removed later
        /// </summary>
        [Input("externalElasticsearchLogsUserConfig")]
        public Input<Inputs.ServiceIntegrationExternalElasticsearchLogsUserConfigArgs>? ExternalElasticsearchLogsUserConfig { get; set; }

        /// <summary>
        /// ExternalOpensearchLogs user configurable settings. **Warning:** There's no way to reset advanced configuration options to default. Options that you add cannot be removed later
        /// </summary>
        [Input("externalOpensearchLogsUserConfig")]
        public Input<Inputs.ServiceIntegrationExternalOpensearchLogsUserConfigArgs>? ExternalOpensearchLogsUserConfig { get; set; }

        /// <summary>
        /// FlinkExternalPostgresql user configurable settings. **Warning:** There's no way to reset advanced configuration options to default. Options that you add cannot be removed later
        /// </summary>
        [Input("flinkExternalPostgresqlUserConfig")]
        public Input<Inputs.ServiceIntegrationFlinkExternalPostgresqlUserConfigArgs>? FlinkExternalPostgresqlUserConfig { get; set; }

        /// <summary>
        /// Type of the service integration. The possible values are `alertmanager`, `autoscaler`, `caching`, `cassandra_cross_service_cluster`, `clickhouse_credentials`, `clickhouse_kafka`, `clickhouse_postgresql`, `dashboard`, `datadog`, `datasource`, `disaster_recovery`, `external_aws_cloudwatch_logs`, `external_aws_cloudwatch_metrics`, `external_elasticsearch_logs`, `external_google_cloud_logging`, `external_opensearch_logs`, `flink`, `flink_external_bigquery`, `flink_external_kafka`, `flink_external_postgresql`, `internal_connectivity`, `jolokia`, `kafka_connect`, `kafka_connect_postgresql`, `kafka_logs`, `kafka_mirrormaker`, `logs`, `m3aggregator`, `m3coordinator`, `metrics`, `opensearch_cross_cluster_replication`, `opensearch_cross_cluster_search`, `prometheus`, `read_replica`, `rsyslog`, `schema_registry_proxy`, `stresstester`, `thanos_distributed_query`, `thanos_migrate`, `thanoscompactor`, `thanosquery`, `thanosruler`, `thanosstore`, `vector` and `vmalert`.
        /// </summary>
        [Input("integrationType", required: true)]
        public Input<string> IntegrationType { get; set; } = null!;

        /// <summary>
        /// KafkaConnect user configurable settings. **Warning:** There's no way to reset advanced configuration options to default. Options that you add cannot be removed later
        /// </summary>
        [Input("kafkaConnectUserConfig")]
        public Input<Inputs.ServiceIntegrationKafkaConnectUserConfigArgs>? KafkaConnectUserConfig { get; set; }

        /// <summary>
        /// KafkaLogs user configurable settings. **Warning:** There's no way to reset advanced configuration options to default. Options that you add cannot be removed later
        /// </summary>
        [Input("kafkaLogsUserConfig")]
        public Input<Inputs.ServiceIntegrationKafkaLogsUserConfigArgs>? KafkaLogsUserConfig { get; set; }

        /// <summary>
        /// KafkaMirrormaker user configurable settings. **Warning:** There's no way to reset advanced configuration options to default. Options that you add cannot be removed later
        /// </summary>
        [Input("kafkaMirrormakerUserConfig")]
        public Input<Inputs.ServiceIntegrationKafkaMirrormakerUserConfigArgs>? KafkaMirrormakerUserConfig { get; set; }

        /// <summary>
        /// Logs user configurable settings. **Warning:** There's no way to reset advanced configuration options to default. Options that you add cannot be removed later
        /// </summary>
        [Input("logsUserConfig")]
        public Input<Inputs.ServiceIntegrationLogsUserConfigArgs>? LogsUserConfig { get; set; }

        /// <summary>
        /// Metrics user configurable settings. **Warning:** There's no way to reset advanced configuration options to default. Options that you add cannot be removed later
        /// </summary>
        [Input("metricsUserConfig")]
        public Input<Inputs.ServiceIntegrationMetricsUserConfigArgs>? MetricsUserConfig { get; set; }

        /// <summary>
        /// Project the integration belongs to.
        /// </summary>
        [Input("project", required: true)]
        public Input<string> Project { get; set; } = null!;

        /// <summary>
        /// Prometheus user configurable settings. **Warning:** There's no way to reset advanced configuration options to default. Options that you add cannot be removed later
        /// </summary>
        [Input("prometheusUserConfig")]
        public Input<Inputs.ServiceIntegrationPrometheusUserConfigArgs>? PrometheusUserConfig { get; set; }

        /// <summary>
        /// Source endpoint for the integration.
        /// </summary>
        [Input("sourceEndpointId")]
        public Input<string>? SourceEndpointId { get; set; }

        /// <summary>
        /// Source service for the integration (if any)
        /// </summary>
        [Input("sourceServiceName")]
        public Input<string>? SourceServiceName { get; set; }

        /// <summary>
        /// Source service project name
        /// </summary>
        [Input("sourceServiceProject")]
        public Input<string>? SourceServiceProject { get; set; }

        public ServiceIntegrationArgs()
        {
        }
        public static new ServiceIntegrationArgs Empty => new ServiceIntegrationArgs();
    }

    public sealed class ServiceIntegrationState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// ClickhouseKafka user configurable settings. **Warning:** There's no way to reset advanced configuration options to default. Options that you add cannot be removed later
        /// </summary>
        [Input("clickhouseKafkaUserConfig")]
        public Input<Inputs.ServiceIntegrationClickhouseKafkaUserConfigGetArgs>? ClickhouseKafkaUserConfig { get; set; }

        /// <summary>
        /// ClickhousePostgresql user configurable settings. **Warning:** There's no way to reset advanced configuration options to default. Options that you add cannot be removed later
        /// </summary>
        [Input("clickhousePostgresqlUserConfig")]
        public Input<Inputs.ServiceIntegrationClickhousePostgresqlUserConfigGetArgs>? ClickhousePostgresqlUserConfig { get; set; }

        /// <summary>
        /// Datadog user configurable settings. **Warning:** There's no way to reset advanced configuration options to default. Options that you add cannot be removed later
        /// </summary>
        [Input("datadogUserConfig")]
        public Input<Inputs.ServiceIntegrationDatadogUserConfigGetArgs>? DatadogUserConfig { get; set; }

        /// <summary>
        /// Destination endpoint for the integration.
        /// </summary>
        [Input("destinationEndpointId")]
        public Input<string>? DestinationEndpointId { get; set; }

        /// <summary>
        /// Destination service for the integration.
        /// </summary>
        [Input("destinationServiceName")]
        public Input<string>? DestinationServiceName { get; set; }

        /// <summary>
        /// Destination service project name
        /// </summary>
        [Input("destinationServiceProject")]
        public Input<string>? DestinationServiceProject { get; set; }

        /// <summary>
        /// ExternalAwsCloudwatchLogs user configurable settings. **Warning:** There's no way to reset advanced configuration options to default. Options that you add cannot be removed later
        /// </summary>
        [Input("externalAwsCloudwatchLogsUserConfig")]
        public Input<Inputs.ServiceIntegrationExternalAwsCloudwatchLogsUserConfigGetArgs>? ExternalAwsCloudwatchLogsUserConfig { get; set; }

        /// <summary>
        /// ExternalAwsCloudwatchMetrics user configurable settings. **Warning:** There's no way to reset advanced configuration options to default. Options that you add cannot be removed later
        /// </summary>
        [Input("externalAwsCloudwatchMetricsUserConfig")]
        public Input<Inputs.ServiceIntegrationExternalAwsCloudwatchMetricsUserConfigGetArgs>? ExternalAwsCloudwatchMetricsUserConfig { get; set; }

        /// <summary>
        /// ExternalElasticsearchLogs user configurable settings. **Warning:** There's no way to reset advanced configuration options to default. Options that you add cannot be removed later
        /// </summary>
        [Input("externalElasticsearchLogsUserConfig")]
        public Input<Inputs.ServiceIntegrationExternalElasticsearchLogsUserConfigGetArgs>? ExternalElasticsearchLogsUserConfig { get; set; }

        /// <summary>
        /// ExternalOpensearchLogs user configurable settings. **Warning:** There's no way to reset advanced configuration options to default. Options that you add cannot be removed later
        /// </summary>
        [Input("externalOpensearchLogsUserConfig")]
        public Input<Inputs.ServiceIntegrationExternalOpensearchLogsUserConfigGetArgs>? ExternalOpensearchLogsUserConfig { get; set; }

        /// <summary>
        /// FlinkExternalPostgresql user configurable settings. **Warning:** There's no way to reset advanced configuration options to default. Options that you add cannot be removed later
        /// </summary>
        [Input("flinkExternalPostgresqlUserConfig")]
        public Input<Inputs.ServiceIntegrationFlinkExternalPostgresqlUserConfigGetArgs>? FlinkExternalPostgresqlUserConfig { get; set; }

        /// <summary>
        /// The ID of the Aiven service integration.
        /// </summary>
        [Input("integrationId")]
        public Input<string>? IntegrationId { get; set; }

        /// <summary>
        /// Type of the service integration. The possible values are `alertmanager`, `autoscaler`, `caching`, `cassandra_cross_service_cluster`, `clickhouse_credentials`, `clickhouse_kafka`, `clickhouse_postgresql`, `dashboard`, `datadog`, `datasource`, `disaster_recovery`, `external_aws_cloudwatch_logs`, `external_aws_cloudwatch_metrics`, `external_elasticsearch_logs`, `external_google_cloud_logging`, `external_opensearch_logs`, `flink`, `flink_external_bigquery`, `flink_external_kafka`, `flink_external_postgresql`, `internal_connectivity`, `jolokia`, `kafka_connect`, `kafka_connect_postgresql`, `kafka_logs`, `kafka_mirrormaker`, `logs`, `m3aggregator`, `m3coordinator`, `metrics`, `opensearch_cross_cluster_replication`, `opensearch_cross_cluster_search`, `prometheus`, `read_replica`, `rsyslog`, `schema_registry_proxy`, `stresstester`, `thanos_distributed_query`, `thanos_migrate`, `thanoscompactor`, `thanosquery`, `thanosruler`, `thanosstore`, `vector` and `vmalert`.
        /// </summary>
        [Input("integrationType")]
        public Input<string>? IntegrationType { get; set; }

        /// <summary>
        /// KafkaConnect user configurable settings. **Warning:** There's no way to reset advanced configuration options to default. Options that you add cannot be removed later
        /// </summary>
        [Input("kafkaConnectUserConfig")]
        public Input<Inputs.ServiceIntegrationKafkaConnectUserConfigGetArgs>? KafkaConnectUserConfig { get; set; }

        /// <summary>
        /// KafkaLogs user configurable settings. **Warning:** There's no way to reset advanced configuration options to default. Options that you add cannot be removed later
        /// </summary>
        [Input("kafkaLogsUserConfig")]
        public Input<Inputs.ServiceIntegrationKafkaLogsUserConfigGetArgs>? KafkaLogsUserConfig { get; set; }

        /// <summary>
        /// KafkaMirrormaker user configurable settings. **Warning:** There's no way to reset advanced configuration options to default. Options that you add cannot be removed later
        /// </summary>
        [Input("kafkaMirrormakerUserConfig")]
        public Input<Inputs.ServiceIntegrationKafkaMirrormakerUserConfigGetArgs>? KafkaMirrormakerUserConfig { get; set; }

        /// <summary>
        /// Logs user configurable settings. **Warning:** There's no way to reset advanced configuration options to default. Options that you add cannot be removed later
        /// </summary>
        [Input("logsUserConfig")]
        public Input<Inputs.ServiceIntegrationLogsUserConfigGetArgs>? LogsUserConfig { get; set; }

        /// <summary>
        /// Metrics user configurable settings. **Warning:** There's no way to reset advanced configuration options to default. Options that you add cannot be removed later
        /// </summary>
        [Input("metricsUserConfig")]
        public Input<Inputs.ServiceIntegrationMetricsUserConfigGetArgs>? MetricsUserConfig { get; set; }

        /// <summary>
        /// Project the integration belongs to.
        /// </summary>
        [Input("project")]
        public Input<string>? Project { get; set; }

        /// <summary>
        /// Prometheus user configurable settings. **Warning:** There's no way to reset advanced configuration options to default. Options that you add cannot be removed later
        /// </summary>
        [Input("prometheusUserConfig")]
        public Input<Inputs.ServiceIntegrationPrometheusUserConfigGetArgs>? PrometheusUserConfig { get; set; }

        /// <summary>
        /// Source endpoint for the integration.
        /// </summary>
        [Input("sourceEndpointId")]
        public Input<string>? SourceEndpointId { get; set; }

        /// <summary>
        /// Source service for the integration (if any)
        /// </summary>
        [Input("sourceServiceName")]
        public Input<string>? SourceServiceName { get; set; }

        /// <summary>
        /// Source service project name
        /// </summary>
        [Input("sourceServiceProject")]
        public Input<string>? SourceServiceProject { get; set; }

        public ServiceIntegrationState()
        {
        }
        public static new ServiceIntegrationState Empty => new ServiceIntegrationState();
    }
}
