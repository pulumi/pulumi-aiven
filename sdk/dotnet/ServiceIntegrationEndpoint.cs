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
    /// Creates and manages an integration endpoint.
    /// 
    /// Integration endpoints let you send data like metrics and logs from Aiven services to external systems. The `autoscaler` endpoint lets you automatically scale the disk space on your services.
    /// 
    /// After creating an endpoint, use the service integration resource to connect it to a service.
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
    ///     // Datadog endpoint
    ///     var exampleEndpoint = new Aiven.ServiceIntegrationEndpoint("example_endpoint", new()
    ///     {
    ///         Project = exampleProject.Project,
    ///         EndpointName = "Datadog endpoint",
    ///         EndpointType = "datadog",
    ///     });
    /// 
    ///     // Disk autoscaler endpoint
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
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// ```sh
    /// $ pulumi import aiven:index/serviceIntegrationEndpoint:ServiceIntegrationEndpoint example_endpoint PROJECT/ID
    /// ```
    /// </summary>
    [AivenResourceType("aiven:index/serviceIntegrationEndpoint:ServiceIntegrationEndpoint")]
    public partial class ServiceIntegrationEndpoint : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Autoscaler user configurable settings. **Warning:** There's no way to reset advanced configuration options to default. Options that you add cannot be removed later
        /// </summary>
        [Output("autoscalerUserConfig")]
        public Output<Outputs.ServiceIntegrationEndpointAutoscalerUserConfig?> AutoscalerUserConfig { get; private set; } = null!;

        /// <summary>
        /// Datadog user configurable settings. **Warning:** There's no way to reset advanced configuration options to default. Options that you add cannot be removed later
        /// </summary>
        [Output("datadogUserConfig")]
        public Output<Outputs.ServiceIntegrationEndpointDatadogUserConfig?> DatadogUserConfig { get; private set; } = null!;

        /// <summary>
        /// Backend configuration for the endpoint.
        /// </summary>
        [Output("endpointConfig")]
        public Output<ImmutableDictionary<string, string>> EndpointConfig { get; private set; } = null!;

        /// <summary>
        /// Name of the service integration endpoint.
        /// </summary>
        [Output("endpointName")]
        public Output<string> EndpointName { get; private set; } = null!;

        /// <summary>
        /// The type of service integration endpoint. The possible values are `autoscaler`, `datadog`, `external_aws_cloudwatch_logs`, `external_aws_cloudwatch_metrics`, `external_aws_s3`, `external_azure_blob_storage`, `external_clickhouse`, `external_elasticsearch_logs`, `external_google_cloud_bigquery`, `external_google_cloud_logging`, `external_kafka`, `external_mysql`, `external_opensearch_logs`, `external_postgresql`, `external_prometheus`, `external_redis`, `external_schema_registry`, `external_sumologic_logs`, `jolokia`, `prometheus` and `rsyslog`.
        /// </summary>
        [Output("endpointType")]
        public Output<string> EndpointType { get; private set; } = null!;

        /// <summary>
        /// ExternalAwsCloudwatchLogs user configurable settings. **Warning:** There's no way to reset advanced configuration options to default. Options that you add cannot be removed later
        /// </summary>
        [Output("externalAwsCloudwatchLogsUserConfig")]
        public Output<Outputs.ServiceIntegrationEndpointExternalAwsCloudwatchLogsUserConfig?> ExternalAwsCloudwatchLogsUserConfig { get; private set; } = null!;

        /// <summary>
        /// ExternalAwsCloudwatchMetrics user configurable settings. **Warning:** There's no way to reset advanced configuration options to default. Options that you add cannot be removed later
        /// </summary>
        [Output("externalAwsCloudwatchMetricsUserConfig")]
        public Output<Outputs.ServiceIntegrationEndpointExternalAwsCloudwatchMetricsUserConfig?> ExternalAwsCloudwatchMetricsUserConfig { get; private set; } = null!;

        /// <summary>
        /// ExternalAwsS3 user configurable settings. **Warning:** There's no way to reset advanced configuration options to default. Options that you add cannot be removed later
        /// </summary>
        [Output("externalAwsS3UserConfig")]
        public Output<Outputs.ServiceIntegrationEndpointExternalAwsS3UserConfig?> ExternalAwsS3UserConfig { get; private set; } = null!;

        /// <summary>
        /// ExternalAzureBlobStorage user configurable settings. **Warning:** There's no way to reset advanced configuration options to default. Options that you add cannot be removed later
        /// </summary>
        [Output("externalAzureBlobStorageUserConfig")]
        public Output<Outputs.ServiceIntegrationEndpointExternalAzureBlobStorageUserConfig?> ExternalAzureBlobStorageUserConfig { get; private set; } = null!;

        /// <summary>
        /// ExternalClickhouse user configurable settings. **Warning:** There's no way to reset advanced configuration options to default. Options that you add cannot be removed later
        /// </summary>
        [Output("externalClickhouseUserConfig")]
        public Output<Outputs.ServiceIntegrationEndpointExternalClickhouseUserConfig?> ExternalClickhouseUserConfig { get; private set; } = null!;

        /// <summary>
        /// ExternalElasticsearchLogs user configurable settings. **Warning:** There's no way to reset advanced configuration options to default. Options that you add cannot be removed later
        /// </summary>
        [Output("externalElasticsearchLogsUserConfig")]
        public Output<Outputs.ServiceIntegrationEndpointExternalElasticsearchLogsUserConfig?> ExternalElasticsearchLogsUserConfig { get; private set; } = null!;

        /// <summary>
        /// ExternalGoogleCloudBigquery user configurable settings. **Warning:** There's no way to reset advanced configuration options to default. Options that you add cannot be removed later
        /// </summary>
        [Output("externalGoogleCloudBigquery")]
        public Output<Outputs.ServiceIntegrationEndpointExternalGoogleCloudBigquery?> ExternalGoogleCloudBigquery { get; private set; } = null!;

        /// <summary>
        /// ExternalGoogleCloudLogging user configurable settings. **Warning:** There's no way to reset advanced configuration options to default. Options that you add cannot be removed later
        /// </summary>
        [Output("externalGoogleCloudLoggingUserConfig")]
        public Output<Outputs.ServiceIntegrationEndpointExternalGoogleCloudLoggingUserConfig?> ExternalGoogleCloudLoggingUserConfig { get; private set; } = null!;

        /// <summary>
        /// ExternalKafka user configurable settings. **Warning:** There's no way to reset advanced configuration options to default. Options that you add cannot be removed later
        /// </summary>
        [Output("externalKafkaUserConfig")]
        public Output<Outputs.ServiceIntegrationEndpointExternalKafkaUserConfig?> ExternalKafkaUserConfig { get; private set; } = null!;

        /// <summary>
        /// ExternalMysql user configurable settings. **Warning:** There's no way to reset advanced configuration options to default. Options that you add cannot be removed later
        /// </summary>
        [Output("externalMysqlUserConfig")]
        public Output<Outputs.ServiceIntegrationEndpointExternalMysqlUserConfig?> ExternalMysqlUserConfig { get; private set; } = null!;

        /// <summary>
        /// ExternalOpensearchLogs user configurable settings. **Warning:** There's no way to reset advanced configuration options to default. Options that you add cannot be removed later
        /// </summary>
        [Output("externalOpensearchLogsUserConfig")]
        public Output<Outputs.ServiceIntegrationEndpointExternalOpensearchLogsUserConfig?> ExternalOpensearchLogsUserConfig { get; private set; } = null!;

        /// <summary>
        /// ExternalPostgresql user configurable settings. **Warning:** There's no way to reset advanced configuration options to default. Options that you add cannot be removed later
        /// </summary>
        [Output("externalPostgresql")]
        public Output<Outputs.ServiceIntegrationEndpointExternalPostgresql?> ExternalPostgresql { get; private set; } = null!;

        /// <summary>
        /// ExternalPrometheus user configurable settings. **Warning:** There's no way to reset advanced configuration options to default. Options that you add cannot be removed later
        /// </summary>
        [Output("externalPrometheusUserConfig")]
        public Output<Outputs.ServiceIntegrationEndpointExternalPrometheusUserConfig?> ExternalPrometheusUserConfig { get; private set; } = null!;

        /// <summary>
        /// ExternalSchemaRegistry user configurable settings. **Warning:** There's no way to reset advanced configuration options to default. Options that you add cannot be removed later
        /// </summary>
        [Output("externalSchemaRegistryUserConfig")]
        public Output<Outputs.ServiceIntegrationEndpointExternalSchemaRegistryUserConfig?> ExternalSchemaRegistryUserConfig { get; private set; } = null!;

        /// <summary>
        /// Jolokia user configurable settings. **Warning:** There's no way to reset advanced configuration options to default. Options that you add cannot be removed later
        /// </summary>
        [Output("jolokiaUserConfig")]
        public Output<Outputs.ServiceIntegrationEndpointJolokiaUserConfig?> JolokiaUserConfig { get; private set; } = null!;

        /// <summary>
        /// Project the service integration endpoint is in.
        /// </summary>
        [Output("project")]
        public Output<string> Project { get; private set; } = null!;

        /// <summary>
        /// Prometheus user configurable settings. **Warning:** There's no way to reset advanced configuration options to default. Options that you add cannot be removed later
        /// </summary>
        [Output("prometheusUserConfig")]
        public Output<Outputs.ServiceIntegrationEndpointPrometheusUserConfig?> PrometheusUserConfig { get; private set; } = null!;

        /// <summary>
        /// Rsyslog user configurable settings. **Warning:** There's no way to reset advanced configuration options to default. Options that you add cannot be removed later
        /// </summary>
        [Output("rsyslogUserConfig")]
        public Output<Outputs.ServiceIntegrationEndpointRsyslogUserConfig?> RsyslogUserConfig { get; private set; } = null!;


        /// <summary>
        /// Create a ServiceIntegrationEndpoint resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ServiceIntegrationEndpoint(string name, ServiceIntegrationEndpointArgs args, CustomResourceOptions? options = null)
            : base("aiven:index/serviceIntegrationEndpoint:ServiceIntegrationEndpoint", name, args ?? new ServiceIntegrationEndpointArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ServiceIntegrationEndpoint(string name, Input<string> id, ServiceIntegrationEndpointState? state = null, CustomResourceOptions? options = null)
            : base("aiven:index/serviceIntegrationEndpoint:ServiceIntegrationEndpoint", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing ServiceIntegrationEndpoint resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ServiceIntegrationEndpoint Get(string name, Input<string> id, ServiceIntegrationEndpointState? state = null, CustomResourceOptions? options = null)
        {
            return new ServiceIntegrationEndpoint(name, id, state, options);
        }
    }

    public sealed class ServiceIntegrationEndpointArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Autoscaler user configurable settings. **Warning:** There's no way to reset advanced configuration options to default. Options that you add cannot be removed later
        /// </summary>
        [Input("autoscalerUserConfig")]
        public Input<Inputs.ServiceIntegrationEndpointAutoscalerUserConfigArgs>? AutoscalerUserConfig { get; set; }

        /// <summary>
        /// Datadog user configurable settings. **Warning:** There's no way to reset advanced configuration options to default. Options that you add cannot be removed later
        /// </summary>
        [Input("datadogUserConfig")]
        public Input<Inputs.ServiceIntegrationEndpointDatadogUserConfigArgs>? DatadogUserConfig { get; set; }

        /// <summary>
        /// Name of the service integration endpoint.
        /// </summary>
        [Input("endpointName", required: true)]
        public Input<string> EndpointName { get; set; } = null!;

        /// <summary>
        /// The type of service integration endpoint. The possible values are `autoscaler`, `datadog`, `external_aws_cloudwatch_logs`, `external_aws_cloudwatch_metrics`, `external_aws_s3`, `external_azure_blob_storage`, `external_clickhouse`, `external_elasticsearch_logs`, `external_google_cloud_bigquery`, `external_google_cloud_logging`, `external_kafka`, `external_mysql`, `external_opensearch_logs`, `external_postgresql`, `external_prometheus`, `external_redis`, `external_schema_registry`, `external_sumologic_logs`, `jolokia`, `prometheus` and `rsyslog`.
        /// </summary>
        [Input("endpointType", required: true)]
        public Input<string> EndpointType { get; set; } = null!;

        /// <summary>
        /// ExternalAwsCloudwatchLogs user configurable settings. **Warning:** There's no way to reset advanced configuration options to default. Options that you add cannot be removed later
        /// </summary>
        [Input("externalAwsCloudwatchLogsUserConfig")]
        public Input<Inputs.ServiceIntegrationEndpointExternalAwsCloudwatchLogsUserConfigArgs>? ExternalAwsCloudwatchLogsUserConfig { get; set; }

        /// <summary>
        /// ExternalAwsCloudwatchMetrics user configurable settings. **Warning:** There's no way to reset advanced configuration options to default. Options that you add cannot be removed later
        /// </summary>
        [Input("externalAwsCloudwatchMetricsUserConfig")]
        public Input<Inputs.ServiceIntegrationEndpointExternalAwsCloudwatchMetricsUserConfigArgs>? ExternalAwsCloudwatchMetricsUserConfig { get; set; }

        /// <summary>
        /// ExternalAwsS3 user configurable settings. **Warning:** There's no way to reset advanced configuration options to default. Options that you add cannot be removed later
        /// </summary>
        [Input("externalAwsS3UserConfig")]
        public Input<Inputs.ServiceIntegrationEndpointExternalAwsS3UserConfigArgs>? ExternalAwsS3UserConfig { get; set; }

        /// <summary>
        /// ExternalAzureBlobStorage user configurable settings. **Warning:** There's no way to reset advanced configuration options to default. Options that you add cannot be removed later
        /// </summary>
        [Input("externalAzureBlobStorageUserConfig")]
        public Input<Inputs.ServiceIntegrationEndpointExternalAzureBlobStorageUserConfigArgs>? ExternalAzureBlobStorageUserConfig { get; set; }

        /// <summary>
        /// ExternalClickhouse user configurable settings. **Warning:** There's no way to reset advanced configuration options to default. Options that you add cannot be removed later
        /// </summary>
        [Input("externalClickhouseUserConfig")]
        public Input<Inputs.ServiceIntegrationEndpointExternalClickhouseUserConfigArgs>? ExternalClickhouseUserConfig { get; set; }

        /// <summary>
        /// ExternalElasticsearchLogs user configurable settings. **Warning:** There's no way to reset advanced configuration options to default. Options that you add cannot be removed later
        /// </summary>
        [Input("externalElasticsearchLogsUserConfig")]
        public Input<Inputs.ServiceIntegrationEndpointExternalElasticsearchLogsUserConfigArgs>? ExternalElasticsearchLogsUserConfig { get; set; }

        /// <summary>
        /// ExternalGoogleCloudBigquery user configurable settings. **Warning:** There's no way to reset advanced configuration options to default. Options that you add cannot be removed later
        /// </summary>
        [Input("externalGoogleCloudBigquery")]
        public Input<Inputs.ServiceIntegrationEndpointExternalGoogleCloudBigqueryArgs>? ExternalGoogleCloudBigquery { get; set; }

        /// <summary>
        /// ExternalGoogleCloudLogging user configurable settings. **Warning:** There's no way to reset advanced configuration options to default. Options that you add cannot be removed later
        /// </summary>
        [Input("externalGoogleCloudLoggingUserConfig")]
        public Input<Inputs.ServiceIntegrationEndpointExternalGoogleCloudLoggingUserConfigArgs>? ExternalGoogleCloudLoggingUserConfig { get; set; }

        /// <summary>
        /// ExternalKafka user configurable settings. **Warning:** There's no way to reset advanced configuration options to default. Options that you add cannot be removed later
        /// </summary>
        [Input("externalKafkaUserConfig")]
        public Input<Inputs.ServiceIntegrationEndpointExternalKafkaUserConfigArgs>? ExternalKafkaUserConfig { get; set; }

        /// <summary>
        /// ExternalMysql user configurable settings. **Warning:** There's no way to reset advanced configuration options to default. Options that you add cannot be removed later
        /// </summary>
        [Input("externalMysqlUserConfig")]
        public Input<Inputs.ServiceIntegrationEndpointExternalMysqlUserConfigArgs>? ExternalMysqlUserConfig { get; set; }

        /// <summary>
        /// ExternalOpensearchLogs user configurable settings. **Warning:** There's no way to reset advanced configuration options to default. Options that you add cannot be removed later
        /// </summary>
        [Input("externalOpensearchLogsUserConfig")]
        public Input<Inputs.ServiceIntegrationEndpointExternalOpensearchLogsUserConfigArgs>? ExternalOpensearchLogsUserConfig { get; set; }

        /// <summary>
        /// ExternalPostgresql user configurable settings. **Warning:** There's no way to reset advanced configuration options to default. Options that you add cannot be removed later
        /// </summary>
        [Input("externalPostgresql")]
        public Input<Inputs.ServiceIntegrationEndpointExternalPostgresqlArgs>? ExternalPostgresql { get; set; }

        /// <summary>
        /// ExternalPrometheus user configurable settings. **Warning:** There's no way to reset advanced configuration options to default. Options that you add cannot be removed later
        /// </summary>
        [Input("externalPrometheusUserConfig")]
        public Input<Inputs.ServiceIntegrationEndpointExternalPrometheusUserConfigArgs>? ExternalPrometheusUserConfig { get; set; }

        /// <summary>
        /// ExternalSchemaRegistry user configurable settings. **Warning:** There's no way to reset advanced configuration options to default. Options that you add cannot be removed later
        /// </summary>
        [Input("externalSchemaRegistryUserConfig")]
        public Input<Inputs.ServiceIntegrationEndpointExternalSchemaRegistryUserConfigArgs>? ExternalSchemaRegistryUserConfig { get; set; }

        /// <summary>
        /// Jolokia user configurable settings. **Warning:** There's no way to reset advanced configuration options to default. Options that you add cannot be removed later
        /// </summary>
        [Input("jolokiaUserConfig")]
        public Input<Inputs.ServiceIntegrationEndpointJolokiaUserConfigArgs>? JolokiaUserConfig { get; set; }

        /// <summary>
        /// Project the service integration endpoint is in.
        /// </summary>
        [Input("project", required: true)]
        public Input<string> Project { get; set; } = null!;

        /// <summary>
        /// Prometheus user configurable settings. **Warning:** There's no way to reset advanced configuration options to default. Options that you add cannot be removed later
        /// </summary>
        [Input("prometheusUserConfig")]
        public Input<Inputs.ServiceIntegrationEndpointPrometheusUserConfigArgs>? PrometheusUserConfig { get; set; }

        /// <summary>
        /// Rsyslog user configurable settings. **Warning:** There's no way to reset advanced configuration options to default. Options that you add cannot be removed later
        /// </summary>
        [Input("rsyslogUserConfig")]
        public Input<Inputs.ServiceIntegrationEndpointRsyslogUserConfigArgs>? RsyslogUserConfig { get; set; }

        public ServiceIntegrationEndpointArgs()
        {
        }
        public static new ServiceIntegrationEndpointArgs Empty => new ServiceIntegrationEndpointArgs();
    }

    public sealed class ServiceIntegrationEndpointState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Autoscaler user configurable settings. **Warning:** There's no way to reset advanced configuration options to default. Options that you add cannot be removed later
        /// </summary>
        [Input("autoscalerUserConfig")]
        public Input<Inputs.ServiceIntegrationEndpointAutoscalerUserConfigGetArgs>? AutoscalerUserConfig { get; set; }

        /// <summary>
        /// Datadog user configurable settings. **Warning:** There's no way to reset advanced configuration options to default. Options that you add cannot be removed later
        /// </summary>
        [Input("datadogUserConfig")]
        public Input<Inputs.ServiceIntegrationEndpointDatadogUserConfigGetArgs>? DatadogUserConfig { get; set; }

        [Input("endpointConfig")]
        private InputMap<string>? _endpointConfig;

        /// <summary>
        /// Backend configuration for the endpoint.
        /// </summary>
        public InputMap<string> EndpointConfig
        {
            get => _endpointConfig ?? (_endpointConfig = new InputMap<string>());
            set => _endpointConfig = value;
        }

        /// <summary>
        /// Name of the service integration endpoint.
        /// </summary>
        [Input("endpointName")]
        public Input<string>? EndpointName { get; set; }

        /// <summary>
        /// The type of service integration endpoint. The possible values are `autoscaler`, `datadog`, `external_aws_cloudwatch_logs`, `external_aws_cloudwatch_metrics`, `external_aws_s3`, `external_azure_blob_storage`, `external_clickhouse`, `external_elasticsearch_logs`, `external_google_cloud_bigquery`, `external_google_cloud_logging`, `external_kafka`, `external_mysql`, `external_opensearch_logs`, `external_postgresql`, `external_prometheus`, `external_redis`, `external_schema_registry`, `external_sumologic_logs`, `jolokia`, `prometheus` and `rsyslog`.
        /// </summary>
        [Input("endpointType")]
        public Input<string>? EndpointType { get; set; }

        /// <summary>
        /// ExternalAwsCloudwatchLogs user configurable settings. **Warning:** There's no way to reset advanced configuration options to default. Options that you add cannot be removed later
        /// </summary>
        [Input("externalAwsCloudwatchLogsUserConfig")]
        public Input<Inputs.ServiceIntegrationEndpointExternalAwsCloudwatchLogsUserConfigGetArgs>? ExternalAwsCloudwatchLogsUserConfig { get; set; }

        /// <summary>
        /// ExternalAwsCloudwatchMetrics user configurable settings. **Warning:** There's no way to reset advanced configuration options to default. Options that you add cannot be removed later
        /// </summary>
        [Input("externalAwsCloudwatchMetricsUserConfig")]
        public Input<Inputs.ServiceIntegrationEndpointExternalAwsCloudwatchMetricsUserConfigGetArgs>? ExternalAwsCloudwatchMetricsUserConfig { get; set; }

        /// <summary>
        /// ExternalAwsS3 user configurable settings. **Warning:** There's no way to reset advanced configuration options to default. Options that you add cannot be removed later
        /// </summary>
        [Input("externalAwsS3UserConfig")]
        public Input<Inputs.ServiceIntegrationEndpointExternalAwsS3UserConfigGetArgs>? ExternalAwsS3UserConfig { get; set; }

        /// <summary>
        /// ExternalAzureBlobStorage user configurable settings. **Warning:** There's no way to reset advanced configuration options to default. Options that you add cannot be removed later
        /// </summary>
        [Input("externalAzureBlobStorageUserConfig")]
        public Input<Inputs.ServiceIntegrationEndpointExternalAzureBlobStorageUserConfigGetArgs>? ExternalAzureBlobStorageUserConfig { get; set; }

        /// <summary>
        /// ExternalClickhouse user configurable settings. **Warning:** There's no way to reset advanced configuration options to default. Options that you add cannot be removed later
        /// </summary>
        [Input("externalClickhouseUserConfig")]
        public Input<Inputs.ServiceIntegrationEndpointExternalClickhouseUserConfigGetArgs>? ExternalClickhouseUserConfig { get; set; }

        /// <summary>
        /// ExternalElasticsearchLogs user configurable settings. **Warning:** There's no way to reset advanced configuration options to default. Options that you add cannot be removed later
        /// </summary>
        [Input("externalElasticsearchLogsUserConfig")]
        public Input<Inputs.ServiceIntegrationEndpointExternalElasticsearchLogsUserConfigGetArgs>? ExternalElasticsearchLogsUserConfig { get; set; }

        /// <summary>
        /// ExternalGoogleCloudBigquery user configurable settings. **Warning:** There's no way to reset advanced configuration options to default. Options that you add cannot be removed later
        /// </summary>
        [Input("externalGoogleCloudBigquery")]
        public Input<Inputs.ServiceIntegrationEndpointExternalGoogleCloudBigqueryGetArgs>? ExternalGoogleCloudBigquery { get; set; }

        /// <summary>
        /// ExternalGoogleCloudLogging user configurable settings. **Warning:** There's no way to reset advanced configuration options to default. Options that you add cannot be removed later
        /// </summary>
        [Input("externalGoogleCloudLoggingUserConfig")]
        public Input<Inputs.ServiceIntegrationEndpointExternalGoogleCloudLoggingUserConfigGetArgs>? ExternalGoogleCloudLoggingUserConfig { get; set; }

        /// <summary>
        /// ExternalKafka user configurable settings. **Warning:** There's no way to reset advanced configuration options to default. Options that you add cannot be removed later
        /// </summary>
        [Input("externalKafkaUserConfig")]
        public Input<Inputs.ServiceIntegrationEndpointExternalKafkaUserConfigGetArgs>? ExternalKafkaUserConfig { get; set; }

        /// <summary>
        /// ExternalMysql user configurable settings. **Warning:** There's no way to reset advanced configuration options to default. Options that you add cannot be removed later
        /// </summary>
        [Input("externalMysqlUserConfig")]
        public Input<Inputs.ServiceIntegrationEndpointExternalMysqlUserConfigGetArgs>? ExternalMysqlUserConfig { get; set; }

        /// <summary>
        /// ExternalOpensearchLogs user configurable settings. **Warning:** There's no way to reset advanced configuration options to default. Options that you add cannot be removed later
        /// </summary>
        [Input("externalOpensearchLogsUserConfig")]
        public Input<Inputs.ServiceIntegrationEndpointExternalOpensearchLogsUserConfigGetArgs>? ExternalOpensearchLogsUserConfig { get; set; }

        /// <summary>
        /// ExternalPostgresql user configurable settings. **Warning:** There's no way to reset advanced configuration options to default. Options that you add cannot be removed later
        /// </summary>
        [Input("externalPostgresql")]
        public Input<Inputs.ServiceIntegrationEndpointExternalPostgresqlGetArgs>? ExternalPostgresql { get; set; }

        /// <summary>
        /// ExternalPrometheus user configurable settings. **Warning:** There's no way to reset advanced configuration options to default. Options that you add cannot be removed later
        /// </summary>
        [Input("externalPrometheusUserConfig")]
        public Input<Inputs.ServiceIntegrationEndpointExternalPrometheusUserConfigGetArgs>? ExternalPrometheusUserConfig { get; set; }

        /// <summary>
        /// ExternalSchemaRegistry user configurable settings. **Warning:** There's no way to reset advanced configuration options to default. Options that you add cannot be removed later
        /// </summary>
        [Input("externalSchemaRegistryUserConfig")]
        public Input<Inputs.ServiceIntegrationEndpointExternalSchemaRegistryUserConfigGetArgs>? ExternalSchemaRegistryUserConfig { get; set; }

        /// <summary>
        /// Jolokia user configurable settings. **Warning:** There's no way to reset advanced configuration options to default. Options that you add cannot be removed later
        /// </summary>
        [Input("jolokiaUserConfig")]
        public Input<Inputs.ServiceIntegrationEndpointJolokiaUserConfigGetArgs>? JolokiaUserConfig { get; set; }

        /// <summary>
        /// Project the service integration endpoint is in.
        /// </summary>
        [Input("project")]
        public Input<string>? Project { get; set; }

        /// <summary>
        /// Prometheus user configurable settings. **Warning:** There's no way to reset advanced configuration options to default. Options that you add cannot be removed later
        /// </summary>
        [Input("prometheusUserConfig")]
        public Input<Inputs.ServiceIntegrationEndpointPrometheusUserConfigGetArgs>? PrometheusUserConfig { get; set; }

        /// <summary>
        /// Rsyslog user configurable settings. **Warning:** There's no way to reset advanced configuration options to default. Options that you add cannot be removed later
        /// </summary>
        [Input("rsyslogUserConfig")]
        public Input<Inputs.ServiceIntegrationEndpointRsyslogUserConfigGetArgs>? RsyslogUserConfig { get; set; }

        public ServiceIntegrationEndpointState()
        {
        }
        public static new ServiceIntegrationEndpointState Empty => new ServiceIntegrationEndpointState();
    }
}
