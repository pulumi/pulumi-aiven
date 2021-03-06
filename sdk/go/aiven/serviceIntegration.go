// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package aiven

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// ## # Service Integration Resource
//
// The Service Integration resource allows the creation and management of Aiven Service Integrations.
//
// Service Integration defines an integration between two Aiven services or between Aiven service and an external
// integration endpoint. Integration could be for example sending metrics from Kafka service to an InfluxDB service,
// getting metrics from an InfluxDB service to a Grafana service to show dashboards, sending logs from any service to
// Elasticsearch, etc.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-aiven/sdk/v4/go/aiven"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := aiven.NewServiceIntegration(ctx, "myintegration", &aiven.ServiceIntegrationArgs{
// 			Project:               pulumi.Any(aiven_project.Myproject.Project),
// 			DestinationEndpointId: pulumi.Any(aiven_service_integration_endpoint.XX.Id),
// 			IntegrationType:       pulumi.String("datadog"),
// 			SourceServiceName:     pulumi.Any(aiven_kafka.XXX.Service_name),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
//
// > **Note** For services running on `hobbiest` plan service integrations are not supported.
type ServiceIntegration struct {
	pulumi.CustomResourceState

	// Dashboard specific user configurable settings
	DashboardUserConfig ServiceIntegrationDashboardUserConfigPtrOutput `pulumi:"dashboardUserConfig"`
	// Dashboard specific user configurable settings
	DatadogUserConfig ServiceIntegrationDatadogUserConfigPtrOutput `pulumi:"datadogUserConfig"`
	// or `destinationServiceName` - (Required) identifies the target side of the integration.
	// Only either endpoint identifier (e.g. `aiven_service_integration_endpoint.XXX.id`) or service name (
	// e.g. `aiven_kafka.XXX.service_name`) must be specified. In either case the target needs to be defined using the
	// reference syntax described above to set up the dependency correctly.
	DestinationEndpointId pulumi.StringPtrOutput `pulumi:"destinationEndpointId"`
	// Destination service for the integration (if any)
	DestinationServiceName pulumi.StringPtrOutput `pulumi:"destinationServiceName"`
	// External AWS Cloudwatch logs specific user configurable settings
	ExternalAwsCloudwatchLogsUserConfig ServiceIntegrationExternalAwsCloudwatchLogsUserConfigPtrOutput `pulumi:"externalAwsCloudwatchLogsUserConfig"`
	// External AWS cloudwatch metrics specific user configurable settings
	ExternalAwsCloudwatchMetricsUserConfig ServiceIntegrationExternalAwsCloudwatchMetricsUserConfigPtrOutput `pulumi:"externalAwsCloudwatchMetricsUserConfig"`
	// External Elasticsearch logs specific user configurable settings
	ExternalElasticsearchLogsUserConfig ServiceIntegrationExternalElasticsearchLogsUserConfigPtrOutput `pulumi:"externalElasticsearchLogsUserConfig"`
	// External Google Cloud Logging specific user configurable settings
	ExternalGoogleCloudLoggingUserConfig ServiceIntegrationExternalGoogleCloudLoggingUserConfigPtrOutput `pulumi:"externalGoogleCloudLoggingUserConfig"`
	// identifies the type of integration that is set up. Possible values include `dashboard`
	// , `datadog`, `logs`, `metrics`, `kafkaConnect`, `externalGoogleCloudLogging`, `externalElasticsearchLogs`
	// `externalAwsCloudwatchLogs`, `readReplica`, `rsyslog`, `signalfx`, `kafkaLogs`, `m3aggregator`,
	// `m3coordinator`, `prometheus`, `schemaRegistryProxy` and `kafkaMirrormaker`.
	IntegrationType pulumi.StringOutput `pulumi:"integrationType"`
	// Kafka Connect specific user configurable settings
	KafkaConnectUserConfig ServiceIntegrationKafkaConnectUserConfigPtrOutput `pulumi:"kafkaConnectUserConfig"`
	// Kafka Logs specific user configurable settings
	KafkaLogsUserConfig ServiceIntegrationKafkaLogsUserConfigPtrOutput `pulumi:"kafkaLogsUserConfig"`
	// Mirrormaker 2 integration specific user configurable settings
	KafkaMirrormakerUserConfig ServiceIntegrationKafkaMirrormakerUserConfigPtrOutput `pulumi:"kafkaMirrormakerUserConfig"`
	// Log integration specific user configurable settings
	LogsUserConfig ServiceIntegrationLogsUserConfigPtrOutput `pulumi:"logsUserConfig"`
	// M3 aggregator specific user configurable settings
	M3aggregatorUserConfig ServiceIntegrationM3aggregatorUserConfigPtrOutput `pulumi:"m3aggregatorUserConfig"`
	// M3 coordinator specific user configurable settings
	M3coordinatorUserConfig ServiceIntegrationM3coordinatorUserConfigPtrOutput `pulumi:"m3coordinatorUserConfig"`
	// Metrics specific user configurable settings
	MetricsUserConfig ServiceIntegrationMetricsUserConfigPtrOutput `pulumi:"metricsUserConfig"`
	// Mirrormaker 1 integration specific user configurable settings
	MirrormakerUserConfig ServiceIntegrationMirrormakerUserConfigPtrOutput `pulumi:"mirrormakerUserConfig"`
	// defines the project the integration belongs to.
	Project pulumi.StringOutput `pulumi:"project"`
	// Prometheus coordinator specific user configurable settings
	PrometheusUserConfig ServiceIntegrationPrometheusUserConfigPtrOutput `pulumi:"prometheusUserConfig"`
	// PG Read replica specific user configurable settings
	ReadReplicaUserConfig ServiceIntegrationReadReplicaUserConfigPtrOutput `pulumi:"readReplicaUserConfig"`
	// RSyslog specific user configurable settings
	RsyslogUserConfig ServiceIntegrationRsyslogUserConfigPtrOutput `pulumi:"rsyslogUserConfig"`
	// Schema registry proxy specific user configurable settings
	SchemaRegistryProxyUserConfig ServiceIntegrationSchemaRegistryProxyUserConfigPtrOutput `pulumi:"schemaRegistryProxyUserConfig"`
	// Signalfx specific user configurable settings
	SignalfxUserConfig ServiceIntegrationSignalfxUserConfigPtrOutput `pulumi:"signalfxUserConfig"`
	// or `sourceServiceName` - (Optional) identifies the source side of the integration. Only either
	// endpoint identifier (e.g. `aiven_service_integration_endpoint.XXX.id`) or service name (
	// e.g. `aiven_kafka.XXX.service_name`) must be specified. In either case the source needs to be defined using the
	// reference syntax described above to set up the dependency correctly.
	SourceEndpointId pulumi.StringPtrOutput `pulumi:"sourceEndpointId"`
	// Source service for the integration (if any)
	SourceServiceName pulumi.StringPtrOutput `pulumi:"sourceServiceName"`
}

// NewServiceIntegration registers a new resource with the given unique name, arguments, and options.
func NewServiceIntegration(ctx *pulumi.Context,
	name string, args *ServiceIntegrationArgs, opts ...pulumi.ResourceOption) (*ServiceIntegration, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.IntegrationType == nil {
		return nil, errors.New("invalid value for required argument 'IntegrationType'")
	}
	if args.Project == nil {
		return nil, errors.New("invalid value for required argument 'Project'")
	}
	var resource ServiceIntegration
	err := ctx.RegisterResource("aiven:index/serviceIntegration:ServiceIntegration", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetServiceIntegration gets an existing ServiceIntegration resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetServiceIntegration(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ServiceIntegrationState, opts ...pulumi.ResourceOption) (*ServiceIntegration, error) {
	var resource ServiceIntegration
	err := ctx.ReadResource("aiven:index/serviceIntegration:ServiceIntegration", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ServiceIntegration resources.
type serviceIntegrationState struct {
	// Dashboard specific user configurable settings
	DashboardUserConfig *ServiceIntegrationDashboardUserConfig `pulumi:"dashboardUserConfig"`
	// Dashboard specific user configurable settings
	DatadogUserConfig *ServiceIntegrationDatadogUserConfig `pulumi:"datadogUserConfig"`
	// or `destinationServiceName` - (Required) identifies the target side of the integration.
	// Only either endpoint identifier (e.g. `aiven_service_integration_endpoint.XXX.id`) or service name (
	// e.g. `aiven_kafka.XXX.service_name`) must be specified. In either case the target needs to be defined using the
	// reference syntax described above to set up the dependency correctly.
	DestinationEndpointId *string `pulumi:"destinationEndpointId"`
	// Destination service for the integration (if any)
	DestinationServiceName *string `pulumi:"destinationServiceName"`
	// External AWS Cloudwatch logs specific user configurable settings
	ExternalAwsCloudwatchLogsUserConfig *ServiceIntegrationExternalAwsCloudwatchLogsUserConfig `pulumi:"externalAwsCloudwatchLogsUserConfig"`
	// External AWS cloudwatch metrics specific user configurable settings
	ExternalAwsCloudwatchMetricsUserConfig *ServiceIntegrationExternalAwsCloudwatchMetricsUserConfig `pulumi:"externalAwsCloudwatchMetricsUserConfig"`
	// External Elasticsearch logs specific user configurable settings
	ExternalElasticsearchLogsUserConfig *ServiceIntegrationExternalElasticsearchLogsUserConfig `pulumi:"externalElasticsearchLogsUserConfig"`
	// External Google Cloud Logging specific user configurable settings
	ExternalGoogleCloudLoggingUserConfig *ServiceIntegrationExternalGoogleCloudLoggingUserConfig `pulumi:"externalGoogleCloudLoggingUserConfig"`
	// identifies the type of integration that is set up. Possible values include `dashboard`
	// , `datadog`, `logs`, `metrics`, `kafkaConnect`, `externalGoogleCloudLogging`, `externalElasticsearchLogs`
	// `externalAwsCloudwatchLogs`, `readReplica`, `rsyslog`, `signalfx`, `kafkaLogs`, `m3aggregator`,
	// `m3coordinator`, `prometheus`, `schemaRegistryProxy` and `kafkaMirrormaker`.
	IntegrationType *string `pulumi:"integrationType"`
	// Kafka Connect specific user configurable settings
	KafkaConnectUserConfig *ServiceIntegrationKafkaConnectUserConfig `pulumi:"kafkaConnectUserConfig"`
	// Kafka Logs specific user configurable settings
	KafkaLogsUserConfig *ServiceIntegrationKafkaLogsUserConfig `pulumi:"kafkaLogsUserConfig"`
	// Mirrormaker 2 integration specific user configurable settings
	KafkaMirrormakerUserConfig *ServiceIntegrationKafkaMirrormakerUserConfig `pulumi:"kafkaMirrormakerUserConfig"`
	// Log integration specific user configurable settings
	LogsUserConfig *ServiceIntegrationLogsUserConfig `pulumi:"logsUserConfig"`
	// M3 aggregator specific user configurable settings
	M3aggregatorUserConfig *ServiceIntegrationM3aggregatorUserConfig `pulumi:"m3aggregatorUserConfig"`
	// M3 coordinator specific user configurable settings
	M3coordinatorUserConfig *ServiceIntegrationM3coordinatorUserConfig `pulumi:"m3coordinatorUserConfig"`
	// Metrics specific user configurable settings
	MetricsUserConfig *ServiceIntegrationMetricsUserConfig `pulumi:"metricsUserConfig"`
	// Mirrormaker 1 integration specific user configurable settings
	MirrormakerUserConfig *ServiceIntegrationMirrormakerUserConfig `pulumi:"mirrormakerUserConfig"`
	// defines the project the integration belongs to.
	Project *string `pulumi:"project"`
	// Prometheus coordinator specific user configurable settings
	PrometheusUserConfig *ServiceIntegrationPrometheusUserConfig `pulumi:"prometheusUserConfig"`
	// PG Read replica specific user configurable settings
	ReadReplicaUserConfig *ServiceIntegrationReadReplicaUserConfig `pulumi:"readReplicaUserConfig"`
	// RSyslog specific user configurable settings
	RsyslogUserConfig *ServiceIntegrationRsyslogUserConfig `pulumi:"rsyslogUserConfig"`
	// Schema registry proxy specific user configurable settings
	SchemaRegistryProxyUserConfig *ServiceIntegrationSchemaRegistryProxyUserConfig `pulumi:"schemaRegistryProxyUserConfig"`
	// Signalfx specific user configurable settings
	SignalfxUserConfig *ServiceIntegrationSignalfxUserConfig `pulumi:"signalfxUserConfig"`
	// or `sourceServiceName` - (Optional) identifies the source side of the integration. Only either
	// endpoint identifier (e.g. `aiven_service_integration_endpoint.XXX.id`) or service name (
	// e.g. `aiven_kafka.XXX.service_name`) must be specified. In either case the source needs to be defined using the
	// reference syntax described above to set up the dependency correctly.
	SourceEndpointId *string `pulumi:"sourceEndpointId"`
	// Source service for the integration (if any)
	SourceServiceName *string `pulumi:"sourceServiceName"`
}

type ServiceIntegrationState struct {
	// Dashboard specific user configurable settings
	DashboardUserConfig ServiceIntegrationDashboardUserConfigPtrInput
	// Dashboard specific user configurable settings
	DatadogUserConfig ServiceIntegrationDatadogUserConfigPtrInput
	// or `destinationServiceName` - (Required) identifies the target side of the integration.
	// Only either endpoint identifier (e.g. `aiven_service_integration_endpoint.XXX.id`) or service name (
	// e.g. `aiven_kafka.XXX.service_name`) must be specified. In either case the target needs to be defined using the
	// reference syntax described above to set up the dependency correctly.
	DestinationEndpointId pulumi.StringPtrInput
	// Destination service for the integration (if any)
	DestinationServiceName pulumi.StringPtrInput
	// External AWS Cloudwatch logs specific user configurable settings
	ExternalAwsCloudwatchLogsUserConfig ServiceIntegrationExternalAwsCloudwatchLogsUserConfigPtrInput
	// External AWS cloudwatch metrics specific user configurable settings
	ExternalAwsCloudwatchMetricsUserConfig ServiceIntegrationExternalAwsCloudwatchMetricsUserConfigPtrInput
	// External Elasticsearch logs specific user configurable settings
	ExternalElasticsearchLogsUserConfig ServiceIntegrationExternalElasticsearchLogsUserConfigPtrInput
	// External Google Cloud Logging specific user configurable settings
	ExternalGoogleCloudLoggingUserConfig ServiceIntegrationExternalGoogleCloudLoggingUserConfigPtrInput
	// identifies the type of integration that is set up. Possible values include `dashboard`
	// , `datadog`, `logs`, `metrics`, `kafkaConnect`, `externalGoogleCloudLogging`, `externalElasticsearchLogs`
	// `externalAwsCloudwatchLogs`, `readReplica`, `rsyslog`, `signalfx`, `kafkaLogs`, `m3aggregator`,
	// `m3coordinator`, `prometheus`, `schemaRegistryProxy` and `kafkaMirrormaker`.
	IntegrationType pulumi.StringPtrInput
	// Kafka Connect specific user configurable settings
	KafkaConnectUserConfig ServiceIntegrationKafkaConnectUserConfigPtrInput
	// Kafka Logs specific user configurable settings
	KafkaLogsUserConfig ServiceIntegrationKafkaLogsUserConfigPtrInput
	// Mirrormaker 2 integration specific user configurable settings
	KafkaMirrormakerUserConfig ServiceIntegrationKafkaMirrormakerUserConfigPtrInput
	// Log integration specific user configurable settings
	LogsUserConfig ServiceIntegrationLogsUserConfigPtrInput
	// M3 aggregator specific user configurable settings
	M3aggregatorUserConfig ServiceIntegrationM3aggregatorUserConfigPtrInput
	// M3 coordinator specific user configurable settings
	M3coordinatorUserConfig ServiceIntegrationM3coordinatorUserConfigPtrInput
	// Metrics specific user configurable settings
	MetricsUserConfig ServiceIntegrationMetricsUserConfigPtrInput
	// Mirrormaker 1 integration specific user configurable settings
	MirrormakerUserConfig ServiceIntegrationMirrormakerUserConfigPtrInput
	// defines the project the integration belongs to.
	Project pulumi.StringPtrInput
	// Prometheus coordinator specific user configurable settings
	PrometheusUserConfig ServiceIntegrationPrometheusUserConfigPtrInput
	// PG Read replica specific user configurable settings
	ReadReplicaUserConfig ServiceIntegrationReadReplicaUserConfigPtrInput
	// RSyslog specific user configurable settings
	RsyslogUserConfig ServiceIntegrationRsyslogUserConfigPtrInput
	// Schema registry proxy specific user configurable settings
	SchemaRegistryProxyUserConfig ServiceIntegrationSchemaRegistryProxyUserConfigPtrInput
	// Signalfx specific user configurable settings
	SignalfxUserConfig ServiceIntegrationSignalfxUserConfigPtrInput
	// or `sourceServiceName` - (Optional) identifies the source side of the integration. Only either
	// endpoint identifier (e.g. `aiven_service_integration_endpoint.XXX.id`) or service name (
	// e.g. `aiven_kafka.XXX.service_name`) must be specified. In either case the source needs to be defined using the
	// reference syntax described above to set up the dependency correctly.
	SourceEndpointId pulumi.StringPtrInput
	// Source service for the integration (if any)
	SourceServiceName pulumi.StringPtrInput
}

func (ServiceIntegrationState) ElementType() reflect.Type {
	return reflect.TypeOf((*serviceIntegrationState)(nil)).Elem()
}

type serviceIntegrationArgs struct {
	// Dashboard specific user configurable settings
	DashboardUserConfig *ServiceIntegrationDashboardUserConfig `pulumi:"dashboardUserConfig"`
	// Dashboard specific user configurable settings
	DatadogUserConfig *ServiceIntegrationDatadogUserConfig `pulumi:"datadogUserConfig"`
	// or `destinationServiceName` - (Required) identifies the target side of the integration.
	// Only either endpoint identifier (e.g. `aiven_service_integration_endpoint.XXX.id`) or service name (
	// e.g. `aiven_kafka.XXX.service_name`) must be specified. In either case the target needs to be defined using the
	// reference syntax described above to set up the dependency correctly.
	DestinationEndpointId *string `pulumi:"destinationEndpointId"`
	// Destination service for the integration (if any)
	DestinationServiceName *string `pulumi:"destinationServiceName"`
	// External AWS Cloudwatch logs specific user configurable settings
	ExternalAwsCloudwatchLogsUserConfig *ServiceIntegrationExternalAwsCloudwatchLogsUserConfig `pulumi:"externalAwsCloudwatchLogsUserConfig"`
	// External AWS cloudwatch metrics specific user configurable settings
	ExternalAwsCloudwatchMetricsUserConfig *ServiceIntegrationExternalAwsCloudwatchMetricsUserConfig `pulumi:"externalAwsCloudwatchMetricsUserConfig"`
	// External Elasticsearch logs specific user configurable settings
	ExternalElasticsearchLogsUserConfig *ServiceIntegrationExternalElasticsearchLogsUserConfig `pulumi:"externalElasticsearchLogsUserConfig"`
	// External Google Cloud Logging specific user configurable settings
	ExternalGoogleCloudLoggingUserConfig *ServiceIntegrationExternalGoogleCloudLoggingUserConfig `pulumi:"externalGoogleCloudLoggingUserConfig"`
	// identifies the type of integration that is set up. Possible values include `dashboard`
	// , `datadog`, `logs`, `metrics`, `kafkaConnect`, `externalGoogleCloudLogging`, `externalElasticsearchLogs`
	// `externalAwsCloudwatchLogs`, `readReplica`, `rsyslog`, `signalfx`, `kafkaLogs`, `m3aggregator`,
	// `m3coordinator`, `prometheus`, `schemaRegistryProxy` and `kafkaMirrormaker`.
	IntegrationType string `pulumi:"integrationType"`
	// Kafka Connect specific user configurable settings
	KafkaConnectUserConfig *ServiceIntegrationKafkaConnectUserConfig `pulumi:"kafkaConnectUserConfig"`
	// Kafka Logs specific user configurable settings
	KafkaLogsUserConfig *ServiceIntegrationKafkaLogsUserConfig `pulumi:"kafkaLogsUserConfig"`
	// Mirrormaker 2 integration specific user configurable settings
	KafkaMirrormakerUserConfig *ServiceIntegrationKafkaMirrormakerUserConfig `pulumi:"kafkaMirrormakerUserConfig"`
	// Log integration specific user configurable settings
	LogsUserConfig *ServiceIntegrationLogsUserConfig `pulumi:"logsUserConfig"`
	// M3 aggregator specific user configurable settings
	M3aggregatorUserConfig *ServiceIntegrationM3aggregatorUserConfig `pulumi:"m3aggregatorUserConfig"`
	// M3 coordinator specific user configurable settings
	M3coordinatorUserConfig *ServiceIntegrationM3coordinatorUserConfig `pulumi:"m3coordinatorUserConfig"`
	// Metrics specific user configurable settings
	MetricsUserConfig *ServiceIntegrationMetricsUserConfig `pulumi:"metricsUserConfig"`
	// Mirrormaker 1 integration specific user configurable settings
	MirrormakerUserConfig *ServiceIntegrationMirrormakerUserConfig `pulumi:"mirrormakerUserConfig"`
	// defines the project the integration belongs to.
	Project string `pulumi:"project"`
	// Prometheus coordinator specific user configurable settings
	PrometheusUserConfig *ServiceIntegrationPrometheusUserConfig `pulumi:"prometheusUserConfig"`
	// PG Read replica specific user configurable settings
	ReadReplicaUserConfig *ServiceIntegrationReadReplicaUserConfig `pulumi:"readReplicaUserConfig"`
	// RSyslog specific user configurable settings
	RsyslogUserConfig *ServiceIntegrationRsyslogUserConfig `pulumi:"rsyslogUserConfig"`
	// Schema registry proxy specific user configurable settings
	SchemaRegistryProxyUserConfig *ServiceIntegrationSchemaRegistryProxyUserConfig `pulumi:"schemaRegistryProxyUserConfig"`
	// Signalfx specific user configurable settings
	SignalfxUserConfig *ServiceIntegrationSignalfxUserConfig `pulumi:"signalfxUserConfig"`
	// or `sourceServiceName` - (Optional) identifies the source side of the integration. Only either
	// endpoint identifier (e.g. `aiven_service_integration_endpoint.XXX.id`) or service name (
	// e.g. `aiven_kafka.XXX.service_name`) must be specified. In either case the source needs to be defined using the
	// reference syntax described above to set up the dependency correctly.
	SourceEndpointId *string `pulumi:"sourceEndpointId"`
	// Source service for the integration (if any)
	SourceServiceName *string `pulumi:"sourceServiceName"`
}

// The set of arguments for constructing a ServiceIntegration resource.
type ServiceIntegrationArgs struct {
	// Dashboard specific user configurable settings
	DashboardUserConfig ServiceIntegrationDashboardUserConfigPtrInput
	// Dashboard specific user configurable settings
	DatadogUserConfig ServiceIntegrationDatadogUserConfigPtrInput
	// or `destinationServiceName` - (Required) identifies the target side of the integration.
	// Only either endpoint identifier (e.g. `aiven_service_integration_endpoint.XXX.id`) or service name (
	// e.g. `aiven_kafka.XXX.service_name`) must be specified. In either case the target needs to be defined using the
	// reference syntax described above to set up the dependency correctly.
	DestinationEndpointId pulumi.StringPtrInput
	// Destination service for the integration (if any)
	DestinationServiceName pulumi.StringPtrInput
	// External AWS Cloudwatch logs specific user configurable settings
	ExternalAwsCloudwatchLogsUserConfig ServiceIntegrationExternalAwsCloudwatchLogsUserConfigPtrInput
	// External AWS cloudwatch metrics specific user configurable settings
	ExternalAwsCloudwatchMetricsUserConfig ServiceIntegrationExternalAwsCloudwatchMetricsUserConfigPtrInput
	// External Elasticsearch logs specific user configurable settings
	ExternalElasticsearchLogsUserConfig ServiceIntegrationExternalElasticsearchLogsUserConfigPtrInput
	// External Google Cloud Logging specific user configurable settings
	ExternalGoogleCloudLoggingUserConfig ServiceIntegrationExternalGoogleCloudLoggingUserConfigPtrInput
	// identifies the type of integration that is set up. Possible values include `dashboard`
	// , `datadog`, `logs`, `metrics`, `kafkaConnect`, `externalGoogleCloudLogging`, `externalElasticsearchLogs`
	// `externalAwsCloudwatchLogs`, `readReplica`, `rsyslog`, `signalfx`, `kafkaLogs`, `m3aggregator`,
	// `m3coordinator`, `prometheus`, `schemaRegistryProxy` and `kafkaMirrormaker`.
	IntegrationType pulumi.StringInput
	// Kafka Connect specific user configurable settings
	KafkaConnectUserConfig ServiceIntegrationKafkaConnectUserConfigPtrInput
	// Kafka Logs specific user configurable settings
	KafkaLogsUserConfig ServiceIntegrationKafkaLogsUserConfigPtrInput
	// Mirrormaker 2 integration specific user configurable settings
	KafkaMirrormakerUserConfig ServiceIntegrationKafkaMirrormakerUserConfigPtrInput
	// Log integration specific user configurable settings
	LogsUserConfig ServiceIntegrationLogsUserConfigPtrInput
	// M3 aggregator specific user configurable settings
	M3aggregatorUserConfig ServiceIntegrationM3aggregatorUserConfigPtrInput
	// M3 coordinator specific user configurable settings
	M3coordinatorUserConfig ServiceIntegrationM3coordinatorUserConfigPtrInput
	// Metrics specific user configurable settings
	MetricsUserConfig ServiceIntegrationMetricsUserConfigPtrInput
	// Mirrormaker 1 integration specific user configurable settings
	MirrormakerUserConfig ServiceIntegrationMirrormakerUserConfigPtrInput
	// defines the project the integration belongs to.
	Project pulumi.StringInput
	// Prometheus coordinator specific user configurable settings
	PrometheusUserConfig ServiceIntegrationPrometheusUserConfigPtrInput
	// PG Read replica specific user configurable settings
	ReadReplicaUserConfig ServiceIntegrationReadReplicaUserConfigPtrInput
	// RSyslog specific user configurable settings
	RsyslogUserConfig ServiceIntegrationRsyslogUserConfigPtrInput
	// Schema registry proxy specific user configurable settings
	SchemaRegistryProxyUserConfig ServiceIntegrationSchemaRegistryProxyUserConfigPtrInput
	// Signalfx specific user configurable settings
	SignalfxUserConfig ServiceIntegrationSignalfxUserConfigPtrInput
	// or `sourceServiceName` - (Optional) identifies the source side of the integration. Only either
	// endpoint identifier (e.g. `aiven_service_integration_endpoint.XXX.id`) or service name (
	// e.g. `aiven_kafka.XXX.service_name`) must be specified. In either case the source needs to be defined using the
	// reference syntax described above to set up the dependency correctly.
	SourceEndpointId pulumi.StringPtrInput
	// Source service for the integration (if any)
	SourceServiceName pulumi.StringPtrInput
}

func (ServiceIntegrationArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*serviceIntegrationArgs)(nil)).Elem()
}

type ServiceIntegrationInput interface {
	pulumi.Input

	ToServiceIntegrationOutput() ServiceIntegrationOutput
	ToServiceIntegrationOutputWithContext(ctx context.Context) ServiceIntegrationOutput
}

func (*ServiceIntegration) ElementType() reflect.Type {
	return reflect.TypeOf((*ServiceIntegration)(nil))
}

func (i *ServiceIntegration) ToServiceIntegrationOutput() ServiceIntegrationOutput {
	return i.ToServiceIntegrationOutputWithContext(context.Background())
}

func (i *ServiceIntegration) ToServiceIntegrationOutputWithContext(ctx context.Context) ServiceIntegrationOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ServiceIntegrationOutput)
}

func (i *ServiceIntegration) ToServiceIntegrationPtrOutput() ServiceIntegrationPtrOutput {
	return i.ToServiceIntegrationPtrOutputWithContext(context.Background())
}

func (i *ServiceIntegration) ToServiceIntegrationPtrOutputWithContext(ctx context.Context) ServiceIntegrationPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ServiceIntegrationPtrOutput)
}

type ServiceIntegrationPtrInput interface {
	pulumi.Input

	ToServiceIntegrationPtrOutput() ServiceIntegrationPtrOutput
	ToServiceIntegrationPtrOutputWithContext(ctx context.Context) ServiceIntegrationPtrOutput
}

type serviceIntegrationPtrType ServiceIntegrationArgs

func (*serviceIntegrationPtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**ServiceIntegration)(nil))
}

func (i *serviceIntegrationPtrType) ToServiceIntegrationPtrOutput() ServiceIntegrationPtrOutput {
	return i.ToServiceIntegrationPtrOutputWithContext(context.Background())
}

func (i *serviceIntegrationPtrType) ToServiceIntegrationPtrOutputWithContext(ctx context.Context) ServiceIntegrationPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ServiceIntegrationPtrOutput)
}

// ServiceIntegrationArrayInput is an input type that accepts ServiceIntegrationArray and ServiceIntegrationArrayOutput values.
// You can construct a concrete instance of `ServiceIntegrationArrayInput` via:
//
//          ServiceIntegrationArray{ ServiceIntegrationArgs{...} }
type ServiceIntegrationArrayInput interface {
	pulumi.Input

	ToServiceIntegrationArrayOutput() ServiceIntegrationArrayOutput
	ToServiceIntegrationArrayOutputWithContext(context.Context) ServiceIntegrationArrayOutput
}

type ServiceIntegrationArray []ServiceIntegrationInput

func (ServiceIntegrationArray) ElementType() reflect.Type {
	return reflect.TypeOf(([]*ServiceIntegration)(nil))
}

func (i ServiceIntegrationArray) ToServiceIntegrationArrayOutput() ServiceIntegrationArrayOutput {
	return i.ToServiceIntegrationArrayOutputWithContext(context.Background())
}

func (i ServiceIntegrationArray) ToServiceIntegrationArrayOutputWithContext(ctx context.Context) ServiceIntegrationArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ServiceIntegrationArrayOutput)
}

// ServiceIntegrationMapInput is an input type that accepts ServiceIntegrationMap and ServiceIntegrationMapOutput values.
// You can construct a concrete instance of `ServiceIntegrationMapInput` via:
//
//          ServiceIntegrationMap{ "key": ServiceIntegrationArgs{...} }
type ServiceIntegrationMapInput interface {
	pulumi.Input

	ToServiceIntegrationMapOutput() ServiceIntegrationMapOutput
	ToServiceIntegrationMapOutputWithContext(context.Context) ServiceIntegrationMapOutput
}

type ServiceIntegrationMap map[string]ServiceIntegrationInput

func (ServiceIntegrationMap) ElementType() reflect.Type {
	return reflect.TypeOf((map[string]*ServiceIntegration)(nil))
}

func (i ServiceIntegrationMap) ToServiceIntegrationMapOutput() ServiceIntegrationMapOutput {
	return i.ToServiceIntegrationMapOutputWithContext(context.Background())
}

func (i ServiceIntegrationMap) ToServiceIntegrationMapOutputWithContext(ctx context.Context) ServiceIntegrationMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ServiceIntegrationMapOutput)
}

type ServiceIntegrationOutput struct {
	*pulumi.OutputState
}

func (ServiceIntegrationOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*ServiceIntegration)(nil))
}

func (o ServiceIntegrationOutput) ToServiceIntegrationOutput() ServiceIntegrationOutput {
	return o
}

func (o ServiceIntegrationOutput) ToServiceIntegrationOutputWithContext(ctx context.Context) ServiceIntegrationOutput {
	return o
}

func (o ServiceIntegrationOutput) ToServiceIntegrationPtrOutput() ServiceIntegrationPtrOutput {
	return o.ToServiceIntegrationPtrOutputWithContext(context.Background())
}

func (o ServiceIntegrationOutput) ToServiceIntegrationPtrOutputWithContext(ctx context.Context) ServiceIntegrationPtrOutput {
	return o.ApplyT(func(v ServiceIntegration) *ServiceIntegration {
		return &v
	}).(ServiceIntegrationPtrOutput)
}

type ServiceIntegrationPtrOutput struct {
	*pulumi.OutputState
}

func (ServiceIntegrationPtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ServiceIntegration)(nil))
}

func (o ServiceIntegrationPtrOutput) ToServiceIntegrationPtrOutput() ServiceIntegrationPtrOutput {
	return o
}

func (o ServiceIntegrationPtrOutput) ToServiceIntegrationPtrOutputWithContext(ctx context.Context) ServiceIntegrationPtrOutput {
	return o
}

type ServiceIntegrationArrayOutput struct{ *pulumi.OutputState }

func (ServiceIntegrationArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]ServiceIntegration)(nil))
}

func (o ServiceIntegrationArrayOutput) ToServiceIntegrationArrayOutput() ServiceIntegrationArrayOutput {
	return o
}

func (o ServiceIntegrationArrayOutput) ToServiceIntegrationArrayOutputWithContext(ctx context.Context) ServiceIntegrationArrayOutput {
	return o
}

func (o ServiceIntegrationArrayOutput) Index(i pulumi.IntInput) ServiceIntegrationOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) ServiceIntegration {
		return vs[0].([]ServiceIntegration)[vs[1].(int)]
	}).(ServiceIntegrationOutput)
}

type ServiceIntegrationMapOutput struct{ *pulumi.OutputState }

func (ServiceIntegrationMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]ServiceIntegration)(nil))
}

func (o ServiceIntegrationMapOutput) ToServiceIntegrationMapOutput() ServiceIntegrationMapOutput {
	return o
}

func (o ServiceIntegrationMapOutput) ToServiceIntegrationMapOutputWithContext(ctx context.Context) ServiceIntegrationMapOutput {
	return o
}

func (o ServiceIntegrationMapOutput) MapIndex(k pulumi.StringInput) ServiceIntegrationOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) ServiceIntegration {
		return vs[0].(map[string]ServiceIntegration)[vs[1].(string)]
	}).(ServiceIntegrationOutput)
}

func init() {
	pulumi.RegisterOutputType(ServiceIntegrationOutput{})
	pulumi.RegisterOutputType(ServiceIntegrationPtrOutput{})
	pulumi.RegisterOutputType(ServiceIntegrationArrayOutput{})
	pulumi.RegisterOutputType(ServiceIntegrationMapOutput{})
}
