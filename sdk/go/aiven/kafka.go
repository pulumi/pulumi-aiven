// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package aiven

import (
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

type Kafka struct {
	pulumi.CustomResourceState

	// Cloud the service runs in
	CloudName pulumi.StringPtrOutput `pulumi:"cloudName"`
	// Service component information objects
	Components KafkaComponentArrayOutput `pulumi:"components"`
	// Create default wildcard Kafka ACL
	DefaultAcl pulumi.BoolPtrOutput `pulumi:"defaultAcl"`
	// Kafka server provided values
	Kafka KafkaKafkaOutput `pulumi:"kafka"`
	// Kafka user configurable settings
	KafkaUserConfig KafkaKafkaUserConfigPtrOutput `pulumi:"kafkaUserConfig"`
	// Day of week when maintenance operations should be performed. One monday, tuesday, wednesday, etc.
	MaintenanceWindowDow pulumi.StringPtrOutput `pulumi:"maintenanceWindowDow"`
	// Time of day when maintenance operations should be performed. UTC time in HH:mm:ss format.
	MaintenanceWindowTime pulumi.StringPtrOutput `pulumi:"maintenanceWindowTime"`
	// Subscription plan
	Plan pulumi.StringPtrOutput `pulumi:"plan"`
	// Target project
	Project pulumi.StringOutput `pulumi:"project"`
	// Identifier of the VPC the service should be in, if any
	ProjectVpcId pulumi.StringPtrOutput `pulumi:"projectVpcId"`
	// Service hostname
	ServiceHost pulumi.StringOutput `pulumi:"serviceHost"`
	// Service integrations to specify when creating a service. Not applied after initial service creation
	ServiceIntegrations KafkaServiceIntegrationArrayOutput `pulumi:"serviceIntegrations"`
	// Service name
	ServiceName pulumi.StringOutput `pulumi:"serviceName"`
	// Password used for connecting to the service, if applicable
	ServicePassword pulumi.StringOutput `pulumi:"servicePassword"`
	// Service port
	ServicePort pulumi.IntOutput `pulumi:"servicePort"`
	// Aiven internal service type code
	ServiceType pulumi.StringOutput `pulumi:"serviceType"`
	// URI for connecting to the service. Service specific info is under "kafka", "pg", etc.
	ServiceUri pulumi.StringOutput `pulumi:"serviceUri"`
	// Username used for connecting to the service, if applicable
	ServiceUsername pulumi.StringOutput `pulumi:"serviceUsername"`
	// Service state
	State pulumi.StringOutput `pulumi:"state"`
	// Prevent service from being deleted. It is recommended to have this enabled for all services.
	TerminationProtection pulumi.BoolPtrOutput `pulumi:"terminationProtection"`
}

// NewKafka registers a new resource with the given unique name, arguments, and options.
func NewKafka(ctx *pulumi.Context,
	name string, args *KafkaArgs, opts ...pulumi.ResourceOption) (*Kafka, error) {
	if args == nil || args.Project == nil {
		return nil, errors.New("missing required argument 'Project'")
	}
	if args == nil || args.ServiceName == nil {
		return nil, errors.New("missing required argument 'ServiceName'")
	}
	if args == nil {
		args = &KafkaArgs{}
	}
	var resource Kafka
	err := ctx.RegisterResource("aiven:index/kafka:Kafka", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetKafka gets an existing Kafka resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetKafka(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *KafkaState, opts ...pulumi.ResourceOption) (*Kafka, error) {
	var resource Kafka
	err := ctx.ReadResource("aiven:index/kafka:Kafka", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Kafka resources.
type kafkaState struct {
	// Cloud the service runs in
	CloudName *string `pulumi:"cloudName"`
	// Service component information objects
	Components []KafkaComponent `pulumi:"components"`
	// Create default wildcard Kafka ACL
	DefaultAcl *bool `pulumi:"defaultAcl"`
	// Kafka server provided values
	Kafka *KafkaKafka `pulumi:"kafka"`
	// Kafka user configurable settings
	KafkaUserConfig *KafkaKafkaUserConfig `pulumi:"kafkaUserConfig"`
	// Day of week when maintenance operations should be performed. One monday, tuesday, wednesday, etc.
	MaintenanceWindowDow *string `pulumi:"maintenanceWindowDow"`
	// Time of day when maintenance operations should be performed. UTC time in HH:mm:ss format.
	MaintenanceWindowTime *string `pulumi:"maintenanceWindowTime"`
	// Subscription plan
	Plan *string `pulumi:"plan"`
	// Target project
	Project *string `pulumi:"project"`
	// Identifier of the VPC the service should be in, if any
	ProjectVpcId *string `pulumi:"projectVpcId"`
	// Service hostname
	ServiceHost *string `pulumi:"serviceHost"`
	// Service integrations to specify when creating a service. Not applied after initial service creation
	ServiceIntegrations []KafkaServiceIntegration `pulumi:"serviceIntegrations"`
	// Service name
	ServiceName *string `pulumi:"serviceName"`
	// Password used for connecting to the service, if applicable
	ServicePassword *string `pulumi:"servicePassword"`
	// Service port
	ServicePort *int `pulumi:"servicePort"`
	// Aiven internal service type code
	ServiceType *string `pulumi:"serviceType"`
	// URI for connecting to the service. Service specific info is under "kafka", "pg", etc.
	ServiceUri *string `pulumi:"serviceUri"`
	// Username used for connecting to the service, if applicable
	ServiceUsername *string `pulumi:"serviceUsername"`
	// Service state
	State *string `pulumi:"state"`
	// Prevent service from being deleted. It is recommended to have this enabled for all services.
	TerminationProtection *bool `pulumi:"terminationProtection"`
}

type KafkaState struct {
	// Cloud the service runs in
	CloudName pulumi.StringPtrInput
	// Service component information objects
	Components KafkaComponentArrayInput
	// Create default wildcard Kafka ACL
	DefaultAcl pulumi.BoolPtrInput
	// Kafka server provided values
	Kafka KafkaKafkaPtrInput
	// Kafka user configurable settings
	KafkaUserConfig KafkaKafkaUserConfigPtrInput
	// Day of week when maintenance operations should be performed. One monday, tuesday, wednesday, etc.
	MaintenanceWindowDow pulumi.StringPtrInput
	// Time of day when maintenance operations should be performed. UTC time in HH:mm:ss format.
	MaintenanceWindowTime pulumi.StringPtrInput
	// Subscription plan
	Plan pulumi.StringPtrInput
	// Target project
	Project pulumi.StringPtrInput
	// Identifier of the VPC the service should be in, if any
	ProjectVpcId pulumi.StringPtrInput
	// Service hostname
	ServiceHost pulumi.StringPtrInput
	// Service integrations to specify when creating a service. Not applied after initial service creation
	ServiceIntegrations KafkaServiceIntegrationArrayInput
	// Service name
	ServiceName pulumi.StringPtrInput
	// Password used for connecting to the service, if applicable
	ServicePassword pulumi.StringPtrInput
	// Service port
	ServicePort pulumi.IntPtrInput
	// Aiven internal service type code
	ServiceType pulumi.StringPtrInput
	// URI for connecting to the service. Service specific info is under "kafka", "pg", etc.
	ServiceUri pulumi.StringPtrInput
	// Username used for connecting to the service, if applicable
	ServiceUsername pulumi.StringPtrInput
	// Service state
	State pulumi.StringPtrInput
	// Prevent service from being deleted. It is recommended to have this enabled for all services.
	TerminationProtection pulumi.BoolPtrInput
}

func (KafkaState) ElementType() reflect.Type {
	return reflect.TypeOf((*kafkaState)(nil)).Elem()
}

type kafkaArgs struct {
	// Cloud the service runs in
	CloudName *string `pulumi:"cloudName"`
	// Create default wildcard Kafka ACL
	DefaultAcl *bool `pulumi:"defaultAcl"`
	// Kafka server provided values
	Kafka *KafkaKafka `pulumi:"kafka"`
	// Kafka user configurable settings
	KafkaUserConfig *KafkaKafkaUserConfig `pulumi:"kafkaUserConfig"`
	// Day of week when maintenance operations should be performed. One monday, tuesday, wednesday, etc.
	MaintenanceWindowDow *string `pulumi:"maintenanceWindowDow"`
	// Time of day when maintenance operations should be performed. UTC time in HH:mm:ss format.
	MaintenanceWindowTime *string `pulumi:"maintenanceWindowTime"`
	// Subscription plan
	Plan *string `pulumi:"plan"`
	// Target project
	Project string `pulumi:"project"`
	// Identifier of the VPC the service should be in, if any
	ProjectVpcId *string `pulumi:"projectVpcId"`
	// Service integrations to specify when creating a service. Not applied after initial service creation
	ServiceIntegrations []KafkaServiceIntegration `pulumi:"serviceIntegrations"`
	// Service name
	ServiceName string `pulumi:"serviceName"`
	// Prevent service from being deleted. It is recommended to have this enabled for all services.
	TerminationProtection *bool `pulumi:"terminationProtection"`
}

// The set of arguments for constructing a Kafka resource.
type KafkaArgs struct {
	// Cloud the service runs in
	CloudName pulumi.StringPtrInput
	// Create default wildcard Kafka ACL
	DefaultAcl pulumi.BoolPtrInput
	// Kafka server provided values
	Kafka KafkaKafkaPtrInput
	// Kafka user configurable settings
	KafkaUserConfig KafkaKafkaUserConfigPtrInput
	// Day of week when maintenance operations should be performed. One monday, tuesday, wednesday, etc.
	MaintenanceWindowDow pulumi.StringPtrInput
	// Time of day when maintenance operations should be performed. UTC time in HH:mm:ss format.
	MaintenanceWindowTime pulumi.StringPtrInput
	// Subscription plan
	Plan pulumi.StringPtrInput
	// Target project
	Project pulumi.StringInput
	// Identifier of the VPC the service should be in, if any
	ProjectVpcId pulumi.StringPtrInput
	// Service integrations to specify when creating a service. Not applied after initial service creation
	ServiceIntegrations KafkaServiceIntegrationArrayInput
	// Service name
	ServiceName pulumi.StringInput
	// Prevent service from being deleted. It is recommended to have this enabled for all services.
	TerminationProtection pulumi.BoolPtrInput
}

func (KafkaArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*kafkaArgs)(nil)).Elem()
}