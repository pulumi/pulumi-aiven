// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package aiven

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-aiven/sdk/v6/go/aiven/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Creates and manages a VPC for an Aiven project.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aiven/sdk/v6/go/aiven"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := aiven.NewProjectVpc(ctx, "example_vpc", &aiven.ProjectVpcArgs{
//				Project:     pulumi.Any(exampleProject.Project),
//				CloudName:   pulumi.String("google-europe-west1"),
//				NetworkCidr: pulumi.String("192.168.1.0/24"),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// ## Import
//
// ```sh
// $ pulumi import aiven:index/projectVpc:ProjectVpc example_vpc PROJECT/ID
// ```
type ProjectVpc struct {
	pulumi.CustomResourceState

	// The cloud provider and region where the service is hosted in the format `CLOUD_PROVIDER-REGION_NAME`. For example, `google-europe-west1` or `aws-us-east-2`. Changing this property forces recreation of the resource.
	CloudName pulumi.StringOutput `pulumi:"cloudName"`
	// Network address range used by the VPC. For example, `192.168.0.0/24`.
	NetworkCidr pulumi.StringOutput `pulumi:"networkCidr"`
	// The name of the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
	Project pulumi.StringOutput `pulumi:"project"`
	// State of the VPC. The possible values are `ACTIVE`, `APPROVED`, `DELETED` and `DELETING`.
	State pulumi.StringOutput `pulumi:"state"`
}

// NewProjectVpc registers a new resource with the given unique name, arguments, and options.
func NewProjectVpc(ctx *pulumi.Context,
	name string, args *ProjectVpcArgs, opts ...pulumi.ResourceOption) (*ProjectVpc, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.CloudName == nil {
		return nil, errors.New("invalid value for required argument 'CloudName'")
	}
	if args.NetworkCidr == nil {
		return nil, errors.New("invalid value for required argument 'NetworkCidr'")
	}
	if args.Project == nil {
		return nil, errors.New("invalid value for required argument 'Project'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource ProjectVpc
	err := ctx.RegisterResource("aiven:index/projectVpc:ProjectVpc", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetProjectVpc gets an existing ProjectVpc resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetProjectVpc(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ProjectVpcState, opts ...pulumi.ResourceOption) (*ProjectVpc, error) {
	var resource ProjectVpc
	err := ctx.ReadResource("aiven:index/projectVpc:ProjectVpc", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ProjectVpc resources.
type projectVpcState struct {
	// The cloud provider and region where the service is hosted in the format `CLOUD_PROVIDER-REGION_NAME`. For example, `google-europe-west1` or `aws-us-east-2`. Changing this property forces recreation of the resource.
	CloudName *string `pulumi:"cloudName"`
	// Network address range used by the VPC. For example, `192.168.0.0/24`.
	NetworkCidr *string `pulumi:"networkCidr"`
	// The name of the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
	Project *string `pulumi:"project"`
	// State of the VPC. The possible values are `ACTIVE`, `APPROVED`, `DELETED` and `DELETING`.
	State *string `pulumi:"state"`
}

type ProjectVpcState struct {
	// The cloud provider and region where the service is hosted in the format `CLOUD_PROVIDER-REGION_NAME`. For example, `google-europe-west1` or `aws-us-east-2`. Changing this property forces recreation of the resource.
	CloudName pulumi.StringPtrInput
	// Network address range used by the VPC. For example, `192.168.0.0/24`.
	NetworkCidr pulumi.StringPtrInput
	// The name of the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
	Project pulumi.StringPtrInput
	// State of the VPC. The possible values are `ACTIVE`, `APPROVED`, `DELETED` and `DELETING`.
	State pulumi.StringPtrInput
}

func (ProjectVpcState) ElementType() reflect.Type {
	return reflect.TypeOf((*projectVpcState)(nil)).Elem()
}

type projectVpcArgs struct {
	// The cloud provider and region where the service is hosted in the format `CLOUD_PROVIDER-REGION_NAME`. For example, `google-europe-west1` or `aws-us-east-2`. Changing this property forces recreation of the resource.
	CloudName string `pulumi:"cloudName"`
	// Network address range used by the VPC. For example, `192.168.0.0/24`.
	NetworkCidr string `pulumi:"networkCidr"`
	// The name of the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
	Project string `pulumi:"project"`
}

// The set of arguments for constructing a ProjectVpc resource.
type ProjectVpcArgs struct {
	// The cloud provider and region where the service is hosted in the format `CLOUD_PROVIDER-REGION_NAME`. For example, `google-europe-west1` or `aws-us-east-2`. Changing this property forces recreation of the resource.
	CloudName pulumi.StringInput
	// Network address range used by the VPC. For example, `192.168.0.0/24`.
	NetworkCidr pulumi.StringInput
	// The name of the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
	Project pulumi.StringInput
}

func (ProjectVpcArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*projectVpcArgs)(nil)).Elem()
}

type ProjectVpcInput interface {
	pulumi.Input

	ToProjectVpcOutput() ProjectVpcOutput
	ToProjectVpcOutputWithContext(ctx context.Context) ProjectVpcOutput
}

func (*ProjectVpc) ElementType() reflect.Type {
	return reflect.TypeOf((**ProjectVpc)(nil)).Elem()
}

func (i *ProjectVpc) ToProjectVpcOutput() ProjectVpcOutput {
	return i.ToProjectVpcOutputWithContext(context.Background())
}

func (i *ProjectVpc) ToProjectVpcOutputWithContext(ctx context.Context) ProjectVpcOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProjectVpcOutput)
}

// ProjectVpcArrayInput is an input type that accepts ProjectVpcArray and ProjectVpcArrayOutput values.
// You can construct a concrete instance of `ProjectVpcArrayInput` via:
//
//	ProjectVpcArray{ ProjectVpcArgs{...} }
type ProjectVpcArrayInput interface {
	pulumi.Input

	ToProjectVpcArrayOutput() ProjectVpcArrayOutput
	ToProjectVpcArrayOutputWithContext(context.Context) ProjectVpcArrayOutput
}

type ProjectVpcArray []ProjectVpcInput

func (ProjectVpcArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ProjectVpc)(nil)).Elem()
}

func (i ProjectVpcArray) ToProjectVpcArrayOutput() ProjectVpcArrayOutput {
	return i.ToProjectVpcArrayOutputWithContext(context.Background())
}

func (i ProjectVpcArray) ToProjectVpcArrayOutputWithContext(ctx context.Context) ProjectVpcArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProjectVpcArrayOutput)
}

// ProjectVpcMapInput is an input type that accepts ProjectVpcMap and ProjectVpcMapOutput values.
// You can construct a concrete instance of `ProjectVpcMapInput` via:
//
//	ProjectVpcMap{ "key": ProjectVpcArgs{...} }
type ProjectVpcMapInput interface {
	pulumi.Input

	ToProjectVpcMapOutput() ProjectVpcMapOutput
	ToProjectVpcMapOutputWithContext(context.Context) ProjectVpcMapOutput
}

type ProjectVpcMap map[string]ProjectVpcInput

func (ProjectVpcMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ProjectVpc)(nil)).Elem()
}

func (i ProjectVpcMap) ToProjectVpcMapOutput() ProjectVpcMapOutput {
	return i.ToProjectVpcMapOutputWithContext(context.Background())
}

func (i ProjectVpcMap) ToProjectVpcMapOutputWithContext(ctx context.Context) ProjectVpcMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProjectVpcMapOutput)
}

type ProjectVpcOutput struct{ *pulumi.OutputState }

func (ProjectVpcOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ProjectVpc)(nil)).Elem()
}

func (o ProjectVpcOutput) ToProjectVpcOutput() ProjectVpcOutput {
	return o
}

func (o ProjectVpcOutput) ToProjectVpcOutputWithContext(ctx context.Context) ProjectVpcOutput {
	return o
}

// The cloud provider and region where the service is hosted in the format `CLOUD_PROVIDER-REGION_NAME`. For example, `google-europe-west1` or `aws-us-east-2`. Changing this property forces recreation of the resource.
func (o ProjectVpcOutput) CloudName() pulumi.StringOutput {
	return o.ApplyT(func(v *ProjectVpc) pulumi.StringOutput { return v.CloudName }).(pulumi.StringOutput)
}

// Network address range used by the VPC. For example, `192.168.0.0/24`.
func (o ProjectVpcOutput) NetworkCidr() pulumi.StringOutput {
	return o.ApplyT(func(v *ProjectVpc) pulumi.StringOutput { return v.NetworkCidr }).(pulumi.StringOutput)
}

// The name of the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
func (o ProjectVpcOutput) Project() pulumi.StringOutput {
	return o.ApplyT(func(v *ProjectVpc) pulumi.StringOutput { return v.Project }).(pulumi.StringOutput)
}

// State of the VPC. The possible values are `ACTIVE`, `APPROVED`, `DELETED` and `DELETING`.
func (o ProjectVpcOutput) State() pulumi.StringOutput {
	return o.ApplyT(func(v *ProjectVpc) pulumi.StringOutput { return v.State }).(pulumi.StringOutput)
}

type ProjectVpcArrayOutput struct{ *pulumi.OutputState }

func (ProjectVpcArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ProjectVpc)(nil)).Elem()
}

func (o ProjectVpcArrayOutput) ToProjectVpcArrayOutput() ProjectVpcArrayOutput {
	return o
}

func (o ProjectVpcArrayOutput) ToProjectVpcArrayOutputWithContext(ctx context.Context) ProjectVpcArrayOutput {
	return o
}

func (o ProjectVpcArrayOutput) Index(i pulumi.IntInput) ProjectVpcOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ProjectVpc {
		return vs[0].([]*ProjectVpc)[vs[1].(int)]
	}).(ProjectVpcOutput)
}

type ProjectVpcMapOutput struct{ *pulumi.OutputState }

func (ProjectVpcMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ProjectVpc)(nil)).Elem()
}

func (o ProjectVpcMapOutput) ToProjectVpcMapOutput() ProjectVpcMapOutput {
	return o
}

func (o ProjectVpcMapOutput) ToProjectVpcMapOutputWithContext(ctx context.Context) ProjectVpcMapOutput {
	return o
}

func (o ProjectVpcMapOutput) MapIndex(k pulumi.StringInput) ProjectVpcOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ProjectVpc {
		return vs[0].(map[string]*ProjectVpc)[vs[1].(string)]
	}).(ProjectVpcOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ProjectVpcInput)(nil)).Elem(), &ProjectVpc{})
	pulumi.RegisterInputType(reflect.TypeOf((*ProjectVpcArrayInput)(nil)).Elem(), ProjectVpcArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ProjectVpcMapInput)(nil)).Elem(), ProjectVpcMap{})
	pulumi.RegisterOutputType(ProjectVpcOutput{})
	pulumi.RegisterOutputType(ProjectVpcArrayOutput{})
	pulumi.RegisterOutputType(ProjectVpcMapOutput{})
}
