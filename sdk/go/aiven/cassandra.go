// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package aiven

import (
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

type Cassandra struct {
	pulumi.CustomResourceState

	// Cassandra server provided values
	Cassandra CassandraCassandraOutput `pulumi:"cassandra"`
	// Cassandra user configurable settings
	CassandraUserConfig CassandraCassandraUserConfigPtrOutput `pulumi:"cassandraUserConfig"`
	// Cloud the service runs in
	CloudName pulumi.StringPtrOutput `pulumi:"cloudName"`
	// Service component information objects
	Components CassandraComponentArrayOutput `pulumi:"components"`
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
	ServiceIntegrations CassandraServiceIntegrationArrayOutput `pulumi:"serviceIntegrations"`
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

// NewCassandra registers a new resource with the given unique name, arguments, and options.
func NewCassandra(ctx *pulumi.Context,
	name string, args *CassandraArgs, opts ...pulumi.ResourceOption) (*Cassandra, error) {
	if args == nil || args.Project == nil {
		return nil, errors.New("missing required argument 'Project'")
	}
	if args == nil || args.ServiceName == nil {
		return nil, errors.New("missing required argument 'ServiceName'")
	}
	if args == nil {
		args = &CassandraArgs{}
	}
	var resource Cassandra
	err := ctx.RegisterResource("aiven:index/cassandra:Cassandra", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetCassandra gets an existing Cassandra resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetCassandra(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *CassandraState, opts ...pulumi.ResourceOption) (*Cassandra, error) {
	var resource Cassandra
	err := ctx.ReadResource("aiven:index/cassandra:Cassandra", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Cassandra resources.
type cassandraState struct {
	// Cassandra server provided values
	Cassandra *CassandraCassandra `pulumi:"cassandra"`
	// Cassandra user configurable settings
	CassandraUserConfig *CassandraCassandraUserConfig `pulumi:"cassandraUserConfig"`
	// Cloud the service runs in
	CloudName *string `pulumi:"cloudName"`
	// Service component information objects
	Components []CassandraComponent `pulumi:"components"`
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
	ServiceIntegrations []CassandraServiceIntegration `pulumi:"serviceIntegrations"`
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

type CassandraState struct {
	// Cassandra server provided values
	Cassandra CassandraCassandraPtrInput
	// Cassandra user configurable settings
	CassandraUserConfig CassandraCassandraUserConfigPtrInput
	// Cloud the service runs in
	CloudName pulumi.StringPtrInput
	// Service component information objects
	Components CassandraComponentArrayInput
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
	ServiceIntegrations CassandraServiceIntegrationArrayInput
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

func (CassandraState) ElementType() reflect.Type {
	return reflect.TypeOf((*cassandraState)(nil)).Elem()
}

type cassandraArgs struct {
	// Cassandra server provided values
	Cassandra *CassandraCassandra `pulumi:"cassandra"`
	// Cassandra user configurable settings
	CassandraUserConfig *CassandraCassandraUserConfig `pulumi:"cassandraUserConfig"`
	// Cloud the service runs in
	CloudName *string `pulumi:"cloudName"`
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
	ServiceIntegrations []CassandraServiceIntegration `pulumi:"serviceIntegrations"`
	// Service name
	ServiceName string `pulumi:"serviceName"`
	// Prevent service from being deleted. It is recommended to have this enabled for all services.
	TerminationProtection *bool `pulumi:"terminationProtection"`
}

// The set of arguments for constructing a Cassandra resource.
type CassandraArgs struct {
	// Cassandra server provided values
	Cassandra CassandraCassandraPtrInput
	// Cassandra user configurable settings
	CassandraUserConfig CassandraCassandraUserConfigPtrInput
	// Cloud the service runs in
	CloudName pulumi.StringPtrInput
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
	ServiceIntegrations CassandraServiceIntegrationArrayInput
	// Service name
	ServiceName pulumi.StringInput
	// Prevent service from being deleted. It is recommended to have this enabled for all services.
	TerminationProtection pulumi.BoolPtrInput
}

func (CassandraArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*cassandraArgs)(nil)).Elem()
}