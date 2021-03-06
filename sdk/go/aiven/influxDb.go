// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package aiven

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// ## # InfluxDB Resource
//
// The InfluxDB resource allows the creation and management of Aiven InfluxDB services.
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
// 		_, err := aiven.NewInfluxDb(ctx, "inf1", &aiven.InfluxDbArgs{
// 			Project:               pulumi.Any(data.Aiven_project.Pr1.Project),
// 			CloudName:             pulumi.String("google-europe-west1"),
// 			Plan:                  pulumi.String("startup-4"),
// 			ServiceName:           pulumi.String("my-inf1"),
// 			MaintenanceWindowDow:  pulumi.String("monday"),
// 			MaintenanceWindowTime: pulumi.String("10:00:00"),
// 			InfluxdbUserConfig: &aiven.InfluxDbInfluxdbUserConfigArgs{
// 				PublicAccess: &aiven.InfluxDbInfluxdbUserConfigPublicAccessArgs{
// 					Influxdb: pulumi.String("true"),
// 				},
// 			},
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
type InfluxDb struct {
	pulumi.CustomResourceState

	// defines where the cloud provider and region where the service is hosted
	// in. This can be changed freely after service is created. Changing the value will trigger
	// a potentially lengthy migration process for the service. Format is cloud provider name
	// (`aws`, `azure`, `do` `google`, `upcloud`, etc.), dash, and the cloud provider
	// specific region name. These are documented on each Cloud provider's own support articles,
	// like [here for Google](https://cloud.google.com/compute/docs/regions-zones/) and
	// [here for AWS](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.RegionsAndAvailabilityZones.html).
	CloudName pulumi.StringPtrOutput `pulumi:"cloudName"`
	// Service component information objects
	Components InfluxDbComponentArrayOutput `pulumi:"components"`
	// influxdb.conf configuration values
	Influxdb InfluxDbInfluxdbOutput `pulumi:"influxdb"`
	// defines InfluxDB specific additional configuration options. The following
	// configuration options available:
	InfluxdbUserConfig InfluxDbInfluxdbUserConfigPtrOutput `pulumi:"influxdbUserConfig"`
	// day of week when maintenance operations should be performed.
	// On monday, tuesday, wednesday, etc.
	MaintenanceWindowDow pulumi.StringPtrOutput `pulumi:"maintenanceWindowDow"`
	// time of day when maintenance operations should be performed.
	// UTC time in HH:mm:ss format.
	MaintenanceWindowTime pulumi.StringPtrOutput `pulumi:"maintenanceWindowTime"`
	// defines what kind of computing resources are allocated for the service. It can
	// be changed after creation, though there are some restrictions when going to a smaller
	// plan such as the new plan must have sufficient amount of disk space to store all current
	// data and switching to a plan with fewer nodes might not be supported. The basic plan
	// names are `hobbyist`, `startup-x`, `business-x` and `premium-x` where `x` is
	// (roughly) the amount of memory on each node (also other attributes like number of CPUs
	// and amount of disk space varies but naming is based on memory). The available options can be seem from the [Aiven pricing page](https://aiven.io/pricing).
	Plan pulumi.StringPtrOutput `pulumi:"plan"`
	// identifies the project the service belongs to. To set up proper dependency
	// between the project and the service, refer to the project as shown in the above example.
	// Project cannot be changed later without destroying and re-creating the service.
	Project pulumi.StringOutput `pulumi:"project"`
	// optionally specifies the VPC the service should run in. If the value
	// is not set the service is not run inside a VPC. When set, the value should be given as a
	// reference as shown above to set up dependencies correctly and the VPC must be in the same
	// cloud and region as the service itself. Project can be freely moved to and from VPC after
	// creation but doing so triggers migration to new servers so the operation can take
	// significant amount of time to complete if the service has a lot of data.
	ProjectVpcId pulumi.StringPtrOutput `pulumi:"projectVpcId"`
	// InfluxDB hostname.
	ServiceHost pulumi.StringOutput `pulumi:"serviceHost"`
	// Service integrations to specify when creating a service. Not applied after initial service creation
	ServiceIntegrations InfluxDbServiceIntegrationArrayOutput `pulumi:"serviceIntegrations"`
	// specifies the actual name of the service. The name cannot be changed
	// later without destroying and re-creating the service so name should be picked based on
	// intended service usage rather than current attributes.
	ServiceName pulumi.StringOutput `pulumi:"serviceName"`
	// Password used for connecting to the InfluxDB service, if applicable.
	ServicePassword pulumi.StringOutput `pulumi:"servicePassword"`
	// InfluxDB port.
	ServicePort pulumi.IntOutput `pulumi:"servicePort"`
	// Aiven internal service type code
	ServiceType pulumi.StringOutput `pulumi:"serviceType"`
	// URI for connecting to the InfluxDB service.
	ServiceUri pulumi.StringOutput `pulumi:"serviceUri"`
	// Username used for connecting to the InfluxDB service, if applicable.
	ServiceUsername pulumi.StringOutput `pulumi:"serviceUsername"`
	// Service state.
	State pulumi.StringOutput `pulumi:"state"`
	// prevents the service from being deleted. It is recommended to
	// set this to `true` for all production services to prevent unintentional service
	// deletion. This does not shield against deleting databases or topics but for services
	// with backups much of the content can at least be restored from backup in case accidental
	// deletion is done.
	TerminationProtection pulumi.BoolPtrOutput `pulumi:"terminationProtection"`
}

// NewInfluxDb registers a new resource with the given unique name, arguments, and options.
func NewInfluxDb(ctx *pulumi.Context,
	name string, args *InfluxDbArgs, opts ...pulumi.ResourceOption) (*InfluxDb, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Project == nil {
		return nil, errors.New("invalid value for required argument 'Project'")
	}
	if args.ServiceName == nil {
		return nil, errors.New("invalid value for required argument 'ServiceName'")
	}
	var resource InfluxDb
	err := ctx.RegisterResource("aiven:index/influxDb:InfluxDb", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetInfluxDb gets an existing InfluxDb resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetInfluxDb(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *InfluxDbState, opts ...pulumi.ResourceOption) (*InfluxDb, error) {
	var resource InfluxDb
	err := ctx.ReadResource("aiven:index/influxDb:InfluxDb", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering InfluxDb resources.
type influxDbState struct {
	// defines where the cloud provider and region where the service is hosted
	// in. This can be changed freely after service is created. Changing the value will trigger
	// a potentially lengthy migration process for the service. Format is cloud provider name
	// (`aws`, `azure`, `do` `google`, `upcloud`, etc.), dash, and the cloud provider
	// specific region name. These are documented on each Cloud provider's own support articles,
	// like [here for Google](https://cloud.google.com/compute/docs/regions-zones/) and
	// [here for AWS](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.RegionsAndAvailabilityZones.html).
	CloudName *string `pulumi:"cloudName"`
	// Service component information objects
	Components []InfluxDbComponent `pulumi:"components"`
	// influxdb.conf configuration values
	Influxdb *InfluxDbInfluxdb `pulumi:"influxdb"`
	// defines InfluxDB specific additional configuration options. The following
	// configuration options available:
	InfluxdbUserConfig *InfluxDbInfluxdbUserConfig `pulumi:"influxdbUserConfig"`
	// day of week when maintenance operations should be performed.
	// On monday, tuesday, wednesday, etc.
	MaintenanceWindowDow *string `pulumi:"maintenanceWindowDow"`
	// time of day when maintenance operations should be performed.
	// UTC time in HH:mm:ss format.
	MaintenanceWindowTime *string `pulumi:"maintenanceWindowTime"`
	// defines what kind of computing resources are allocated for the service. It can
	// be changed after creation, though there are some restrictions when going to a smaller
	// plan such as the new plan must have sufficient amount of disk space to store all current
	// data and switching to a plan with fewer nodes might not be supported. The basic plan
	// names are `hobbyist`, `startup-x`, `business-x` and `premium-x` where `x` is
	// (roughly) the amount of memory on each node (also other attributes like number of CPUs
	// and amount of disk space varies but naming is based on memory). The available options can be seem from the [Aiven pricing page](https://aiven.io/pricing).
	Plan *string `pulumi:"plan"`
	// identifies the project the service belongs to. To set up proper dependency
	// between the project and the service, refer to the project as shown in the above example.
	// Project cannot be changed later without destroying and re-creating the service.
	Project *string `pulumi:"project"`
	// optionally specifies the VPC the service should run in. If the value
	// is not set the service is not run inside a VPC. When set, the value should be given as a
	// reference as shown above to set up dependencies correctly and the VPC must be in the same
	// cloud and region as the service itself. Project can be freely moved to and from VPC after
	// creation but doing so triggers migration to new servers so the operation can take
	// significant amount of time to complete if the service has a lot of data.
	ProjectVpcId *string `pulumi:"projectVpcId"`
	// InfluxDB hostname.
	ServiceHost *string `pulumi:"serviceHost"`
	// Service integrations to specify when creating a service. Not applied after initial service creation
	ServiceIntegrations []InfluxDbServiceIntegration `pulumi:"serviceIntegrations"`
	// specifies the actual name of the service. The name cannot be changed
	// later without destroying and re-creating the service so name should be picked based on
	// intended service usage rather than current attributes.
	ServiceName *string `pulumi:"serviceName"`
	// Password used for connecting to the InfluxDB service, if applicable.
	ServicePassword *string `pulumi:"servicePassword"`
	// InfluxDB port.
	ServicePort *int `pulumi:"servicePort"`
	// Aiven internal service type code
	ServiceType *string `pulumi:"serviceType"`
	// URI for connecting to the InfluxDB service.
	ServiceUri *string `pulumi:"serviceUri"`
	// Username used for connecting to the InfluxDB service, if applicable.
	ServiceUsername *string `pulumi:"serviceUsername"`
	// Service state.
	State *string `pulumi:"state"`
	// prevents the service from being deleted. It is recommended to
	// set this to `true` for all production services to prevent unintentional service
	// deletion. This does not shield against deleting databases or topics but for services
	// with backups much of the content can at least be restored from backup in case accidental
	// deletion is done.
	TerminationProtection *bool `pulumi:"terminationProtection"`
}

type InfluxDbState struct {
	// defines where the cloud provider and region where the service is hosted
	// in. This can be changed freely after service is created. Changing the value will trigger
	// a potentially lengthy migration process for the service. Format is cloud provider name
	// (`aws`, `azure`, `do` `google`, `upcloud`, etc.), dash, and the cloud provider
	// specific region name. These are documented on each Cloud provider's own support articles,
	// like [here for Google](https://cloud.google.com/compute/docs/regions-zones/) and
	// [here for AWS](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.RegionsAndAvailabilityZones.html).
	CloudName pulumi.StringPtrInput
	// Service component information objects
	Components InfluxDbComponentArrayInput
	// influxdb.conf configuration values
	Influxdb InfluxDbInfluxdbPtrInput
	// defines InfluxDB specific additional configuration options. The following
	// configuration options available:
	InfluxdbUserConfig InfluxDbInfluxdbUserConfigPtrInput
	// day of week when maintenance operations should be performed.
	// On monday, tuesday, wednesday, etc.
	MaintenanceWindowDow pulumi.StringPtrInput
	// time of day when maintenance operations should be performed.
	// UTC time in HH:mm:ss format.
	MaintenanceWindowTime pulumi.StringPtrInput
	// defines what kind of computing resources are allocated for the service. It can
	// be changed after creation, though there are some restrictions when going to a smaller
	// plan such as the new plan must have sufficient amount of disk space to store all current
	// data and switching to a plan with fewer nodes might not be supported. The basic plan
	// names are `hobbyist`, `startup-x`, `business-x` and `premium-x` where `x` is
	// (roughly) the amount of memory on each node (also other attributes like number of CPUs
	// and amount of disk space varies but naming is based on memory). The available options can be seem from the [Aiven pricing page](https://aiven.io/pricing).
	Plan pulumi.StringPtrInput
	// identifies the project the service belongs to. To set up proper dependency
	// between the project and the service, refer to the project as shown in the above example.
	// Project cannot be changed later without destroying and re-creating the service.
	Project pulumi.StringPtrInput
	// optionally specifies the VPC the service should run in. If the value
	// is not set the service is not run inside a VPC. When set, the value should be given as a
	// reference as shown above to set up dependencies correctly and the VPC must be in the same
	// cloud and region as the service itself. Project can be freely moved to and from VPC after
	// creation but doing so triggers migration to new servers so the operation can take
	// significant amount of time to complete if the service has a lot of data.
	ProjectVpcId pulumi.StringPtrInput
	// InfluxDB hostname.
	ServiceHost pulumi.StringPtrInput
	// Service integrations to specify when creating a service. Not applied after initial service creation
	ServiceIntegrations InfluxDbServiceIntegrationArrayInput
	// specifies the actual name of the service. The name cannot be changed
	// later without destroying and re-creating the service so name should be picked based on
	// intended service usage rather than current attributes.
	ServiceName pulumi.StringPtrInput
	// Password used for connecting to the InfluxDB service, if applicable.
	ServicePassword pulumi.StringPtrInput
	// InfluxDB port.
	ServicePort pulumi.IntPtrInput
	// Aiven internal service type code
	ServiceType pulumi.StringPtrInput
	// URI for connecting to the InfluxDB service.
	ServiceUri pulumi.StringPtrInput
	// Username used for connecting to the InfluxDB service, if applicable.
	ServiceUsername pulumi.StringPtrInput
	// Service state.
	State pulumi.StringPtrInput
	// prevents the service from being deleted. It is recommended to
	// set this to `true` for all production services to prevent unintentional service
	// deletion. This does not shield against deleting databases or topics but for services
	// with backups much of the content can at least be restored from backup in case accidental
	// deletion is done.
	TerminationProtection pulumi.BoolPtrInput
}

func (InfluxDbState) ElementType() reflect.Type {
	return reflect.TypeOf((*influxDbState)(nil)).Elem()
}

type influxDbArgs struct {
	// defines where the cloud provider and region where the service is hosted
	// in. This can be changed freely after service is created. Changing the value will trigger
	// a potentially lengthy migration process for the service. Format is cloud provider name
	// (`aws`, `azure`, `do` `google`, `upcloud`, etc.), dash, and the cloud provider
	// specific region name. These are documented on each Cloud provider's own support articles,
	// like [here for Google](https://cloud.google.com/compute/docs/regions-zones/) and
	// [here for AWS](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.RegionsAndAvailabilityZones.html).
	CloudName *string `pulumi:"cloudName"`
	// influxdb.conf configuration values
	Influxdb *InfluxDbInfluxdb `pulumi:"influxdb"`
	// defines InfluxDB specific additional configuration options. The following
	// configuration options available:
	InfluxdbUserConfig *InfluxDbInfluxdbUserConfig `pulumi:"influxdbUserConfig"`
	// day of week when maintenance operations should be performed.
	// On monday, tuesday, wednesday, etc.
	MaintenanceWindowDow *string `pulumi:"maintenanceWindowDow"`
	// time of day when maintenance operations should be performed.
	// UTC time in HH:mm:ss format.
	MaintenanceWindowTime *string `pulumi:"maintenanceWindowTime"`
	// defines what kind of computing resources are allocated for the service. It can
	// be changed after creation, though there are some restrictions when going to a smaller
	// plan such as the new plan must have sufficient amount of disk space to store all current
	// data and switching to a plan with fewer nodes might not be supported. The basic plan
	// names are `hobbyist`, `startup-x`, `business-x` and `premium-x` where `x` is
	// (roughly) the amount of memory on each node (also other attributes like number of CPUs
	// and amount of disk space varies but naming is based on memory). The available options can be seem from the [Aiven pricing page](https://aiven.io/pricing).
	Plan *string `pulumi:"plan"`
	// identifies the project the service belongs to. To set up proper dependency
	// between the project and the service, refer to the project as shown in the above example.
	// Project cannot be changed later without destroying and re-creating the service.
	Project string `pulumi:"project"`
	// optionally specifies the VPC the service should run in. If the value
	// is not set the service is not run inside a VPC. When set, the value should be given as a
	// reference as shown above to set up dependencies correctly and the VPC must be in the same
	// cloud and region as the service itself. Project can be freely moved to and from VPC after
	// creation but doing so triggers migration to new servers so the operation can take
	// significant amount of time to complete if the service has a lot of data.
	ProjectVpcId *string `pulumi:"projectVpcId"`
	// Service integrations to specify when creating a service. Not applied after initial service creation
	ServiceIntegrations []InfluxDbServiceIntegration `pulumi:"serviceIntegrations"`
	// specifies the actual name of the service. The name cannot be changed
	// later without destroying and re-creating the service so name should be picked based on
	// intended service usage rather than current attributes.
	ServiceName string `pulumi:"serviceName"`
	// prevents the service from being deleted. It is recommended to
	// set this to `true` for all production services to prevent unintentional service
	// deletion. This does not shield against deleting databases or topics but for services
	// with backups much of the content can at least be restored from backup in case accidental
	// deletion is done.
	TerminationProtection *bool `pulumi:"terminationProtection"`
}

// The set of arguments for constructing a InfluxDb resource.
type InfluxDbArgs struct {
	// defines where the cloud provider and region where the service is hosted
	// in. This can be changed freely after service is created. Changing the value will trigger
	// a potentially lengthy migration process for the service. Format is cloud provider name
	// (`aws`, `azure`, `do` `google`, `upcloud`, etc.), dash, and the cloud provider
	// specific region name. These are documented on each Cloud provider's own support articles,
	// like [here for Google](https://cloud.google.com/compute/docs/regions-zones/) and
	// [here for AWS](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.RegionsAndAvailabilityZones.html).
	CloudName pulumi.StringPtrInput
	// influxdb.conf configuration values
	Influxdb InfluxDbInfluxdbPtrInput
	// defines InfluxDB specific additional configuration options. The following
	// configuration options available:
	InfluxdbUserConfig InfluxDbInfluxdbUserConfigPtrInput
	// day of week when maintenance operations should be performed.
	// On monday, tuesday, wednesday, etc.
	MaintenanceWindowDow pulumi.StringPtrInput
	// time of day when maintenance operations should be performed.
	// UTC time in HH:mm:ss format.
	MaintenanceWindowTime pulumi.StringPtrInput
	// defines what kind of computing resources are allocated for the service. It can
	// be changed after creation, though there are some restrictions when going to a smaller
	// plan such as the new plan must have sufficient amount of disk space to store all current
	// data and switching to a plan with fewer nodes might not be supported. The basic plan
	// names are `hobbyist`, `startup-x`, `business-x` and `premium-x` where `x` is
	// (roughly) the amount of memory on each node (also other attributes like number of CPUs
	// and amount of disk space varies but naming is based on memory). The available options can be seem from the [Aiven pricing page](https://aiven.io/pricing).
	Plan pulumi.StringPtrInput
	// identifies the project the service belongs to. To set up proper dependency
	// between the project and the service, refer to the project as shown in the above example.
	// Project cannot be changed later without destroying and re-creating the service.
	Project pulumi.StringInput
	// optionally specifies the VPC the service should run in. If the value
	// is not set the service is not run inside a VPC. When set, the value should be given as a
	// reference as shown above to set up dependencies correctly and the VPC must be in the same
	// cloud and region as the service itself. Project can be freely moved to and from VPC after
	// creation but doing so triggers migration to new servers so the operation can take
	// significant amount of time to complete if the service has a lot of data.
	ProjectVpcId pulumi.StringPtrInput
	// Service integrations to specify when creating a service. Not applied after initial service creation
	ServiceIntegrations InfluxDbServiceIntegrationArrayInput
	// specifies the actual name of the service. The name cannot be changed
	// later without destroying and re-creating the service so name should be picked based on
	// intended service usage rather than current attributes.
	ServiceName pulumi.StringInput
	// prevents the service from being deleted. It is recommended to
	// set this to `true` for all production services to prevent unintentional service
	// deletion. This does not shield against deleting databases or topics but for services
	// with backups much of the content can at least be restored from backup in case accidental
	// deletion is done.
	TerminationProtection pulumi.BoolPtrInput
}

func (InfluxDbArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*influxDbArgs)(nil)).Elem()
}

type InfluxDbInput interface {
	pulumi.Input

	ToInfluxDbOutput() InfluxDbOutput
	ToInfluxDbOutputWithContext(ctx context.Context) InfluxDbOutput
}

func (*InfluxDb) ElementType() reflect.Type {
	return reflect.TypeOf((*InfluxDb)(nil))
}

func (i *InfluxDb) ToInfluxDbOutput() InfluxDbOutput {
	return i.ToInfluxDbOutputWithContext(context.Background())
}

func (i *InfluxDb) ToInfluxDbOutputWithContext(ctx context.Context) InfluxDbOutput {
	return pulumi.ToOutputWithContext(ctx, i).(InfluxDbOutput)
}

func (i *InfluxDb) ToInfluxDbPtrOutput() InfluxDbPtrOutput {
	return i.ToInfluxDbPtrOutputWithContext(context.Background())
}

func (i *InfluxDb) ToInfluxDbPtrOutputWithContext(ctx context.Context) InfluxDbPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(InfluxDbPtrOutput)
}

type InfluxDbPtrInput interface {
	pulumi.Input

	ToInfluxDbPtrOutput() InfluxDbPtrOutput
	ToInfluxDbPtrOutputWithContext(ctx context.Context) InfluxDbPtrOutput
}

type influxDbPtrType InfluxDbArgs

func (*influxDbPtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**InfluxDb)(nil))
}

func (i *influxDbPtrType) ToInfluxDbPtrOutput() InfluxDbPtrOutput {
	return i.ToInfluxDbPtrOutputWithContext(context.Background())
}

func (i *influxDbPtrType) ToInfluxDbPtrOutputWithContext(ctx context.Context) InfluxDbPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(InfluxDbPtrOutput)
}

// InfluxDbArrayInput is an input type that accepts InfluxDbArray and InfluxDbArrayOutput values.
// You can construct a concrete instance of `InfluxDbArrayInput` via:
//
//          InfluxDbArray{ InfluxDbArgs{...} }
type InfluxDbArrayInput interface {
	pulumi.Input

	ToInfluxDbArrayOutput() InfluxDbArrayOutput
	ToInfluxDbArrayOutputWithContext(context.Context) InfluxDbArrayOutput
}

type InfluxDbArray []InfluxDbInput

func (InfluxDbArray) ElementType() reflect.Type {
	return reflect.TypeOf(([]*InfluxDb)(nil))
}

func (i InfluxDbArray) ToInfluxDbArrayOutput() InfluxDbArrayOutput {
	return i.ToInfluxDbArrayOutputWithContext(context.Background())
}

func (i InfluxDbArray) ToInfluxDbArrayOutputWithContext(ctx context.Context) InfluxDbArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(InfluxDbArrayOutput)
}

// InfluxDbMapInput is an input type that accepts InfluxDbMap and InfluxDbMapOutput values.
// You can construct a concrete instance of `InfluxDbMapInput` via:
//
//          InfluxDbMap{ "key": InfluxDbArgs{...} }
type InfluxDbMapInput interface {
	pulumi.Input

	ToInfluxDbMapOutput() InfluxDbMapOutput
	ToInfluxDbMapOutputWithContext(context.Context) InfluxDbMapOutput
}

type InfluxDbMap map[string]InfluxDbInput

func (InfluxDbMap) ElementType() reflect.Type {
	return reflect.TypeOf((map[string]*InfluxDb)(nil))
}

func (i InfluxDbMap) ToInfluxDbMapOutput() InfluxDbMapOutput {
	return i.ToInfluxDbMapOutputWithContext(context.Background())
}

func (i InfluxDbMap) ToInfluxDbMapOutputWithContext(ctx context.Context) InfluxDbMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(InfluxDbMapOutput)
}

type InfluxDbOutput struct {
	*pulumi.OutputState
}

func (InfluxDbOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*InfluxDb)(nil))
}

func (o InfluxDbOutput) ToInfluxDbOutput() InfluxDbOutput {
	return o
}

func (o InfluxDbOutput) ToInfluxDbOutputWithContext(ctx context.Context) InfluxDbOutput {
	return o
}

func (o InfluxDbOutput) ToInfluxDbPtrOutput() InfluxDbPtrOutput {
	return o.ToInfluxDbPtrOutputWithContext(context.Background())
}

func (o InfluxDbOutput) ToInfluxDbPtrOutputWithContext(ctx context.Context) InfluxDbPtrOutput {
	return o.ApplyT(func(v InfluxDb) *InfluxDb {
		return &v
	}).(InfluxDbPtrOutput)
}

type InfluxDbPtrOutput struct {
	*pulumi.OutputState
}

func (InfluxDbPtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**InfluxDb)(nil))
}

func (o InfluxDbPtrOutput) ToInfluxDbPtrOutput() InfluxDbPtrOutput {
	return o
}

func (o InfluxDbPtrOutput) ToInfluxDbPtrOutputWithContext(ctx context.Context) InfluxDbPtrOutput {
	return o
}

type InfluxDbArrayOutput struct{ *pulumi.OutputState }

func (InfluxDbArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]InfluxDb)(nil))
}

func (o InfluxDbArrayOutput) ToInfluxDbArrayOutput() InfluxDbArrayOutput {
	return o
}

func (o InfluxDbArrayOutput) ToInfluxDbArrayOutputWithContext(ctx context.Context) InfluxDbArrayOutput {
	return o
}

func (o InfluxDbArrayOutput) Index(i pulumi.IntInput) InfluxDbOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) InfluxDb {
		return vs[0].([]InfluxDb)[vs[1].(int)]
	}).(InfluxDbOutput)
}

type InfluxDbMapOutput struct{ *pulumi.OutputState }

func (InfluxDbMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]InfluxDb)(nil))
}

func (o InfluxDbMapOutput) ToInfluxDbMapOutput() InfluxDbMapOutput {
	return o
}

func (o InfluxDbMapOutput) ToInfluxDbMapOutputWithContext(ctx context.Context) InfluxDbMapOutput {
	return o
}

func (o InfluxDbMapOutput) MapIndex(k pulumi.StringInput) InfluxDbOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) InfluxDb {
		return vs[0].(map[string]InfluxDb)[vs[1].(string)]
	}).(InfluxDbOutput)
}

func init() {
	pulumi.RegisterOutputType(InfluxDbOutput{})
	pulumi.RegisterOutputType(InfluxDbPtrOutput{})
	pulumi.RegisterOutputType(InfluxDbArrayOutput{})
	pulumi.RegisterOutputType(InfluxDbMapOutput{})
}
