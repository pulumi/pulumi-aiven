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

// Creates and manages an [AWS PrivateLink for Aiven services](https://aiven.io/docs/platform/howto/use-aws-privatelinks) in a VPC.
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
//			_, err := aiven.NewAwsPrivatelink(ctx, "main", &aiven.AwsPrivatelinkArgs{
//				Project:     pulumi.Any(exampleProject.Project),
//				ServiceName: pulumi.Any(exampleKafka.ServiceName),
//				Principals: pulumi.StringArray{
//					pulumi.String("arn:aws:iam::012345678901:user/mwf"),
//				},
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
// $ pulumi import aiven:index/awsPrivatelink:AwsPrivatelink main PROJECT/SERVICE_NAME
// ```
type AwsPrivatelink struct {
	pulumi.CustomResourceState

	// AWS service ID.
	AwsServiceId pulumi.StringOutput `pulumi:"awsServiceId"`
	// AWS service name.
	AwsServiceName pulumi.StringOutput `pulumi:"awsServiceName"`
	// List of the ARNs of the AWS accounts or IAM users allowed to connect to the VPC endpoint.
	Principals pulumi.StringArrayOutput `pulumi:"principals"`
	// The name of the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
	Project pulumi.StringOutput `pulumi:"project"`
	// The name of the service that this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
	ServiceName pulumi.StringOutput `pulumi:"serviceName"`
}

// NewAwsPrivatelink registers a new resource with the given unique name, arguments, and options.
func NewAwsPrivatelink(ctx *pulumi.Context,
	name string, args *AwsPrivatelinkArgs, opts ...pulumi.ResourceOption) (*AwsPrivatelink, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Principals == nil {
		return nil, errors.New("invalid value for required argument 'Principals'")
	}
	if args.Project == nil {
		return nil, errors.New("invalid value for required argument 'Project'")
	}
	if args.ServiceName == nil {
		return nil, errors.New("invalid value for required argument 'ServiceName'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource AwsPrivatelink
	err := ctx.RegisterResource("aiven:index/awsPrivatelink:AwsPrivatelink", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetAwsPrivatelink gets an existing AwsPrivatelink resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetAwsPrivatelink(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *AwsPrivatelinkState, opts ...pulumi.ResourceOption) (*AwsPrivatelink, error) {
	var resource AwsPrivatelink
	err := ctx.ReadResource("aiven:index/awsPrivatelink:AwsPrivatelink", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering AwsPrivatelink resources.
type awsPrivatelinkState struct {
	// AWS service ID.
	AwsServiceId *string `pulumi:"awsServiceId"`
	// AWS service name.
	AwsServiceName *string `pulumi:"awsServiceName"`
	// List of the ARNs of the AWS accounts or IAM users allowed to connect to the VPC endpoint.
	Principals []string `pulumi:"principals"`
	// The name of the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
	Project *string `pulumi:"project"`
	// The name of the service that this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
	ServiceName *string `pulumi:"serviceName"`
}

type AwsPrivatelinkState struct {
	// AWS service ID.
	AwsServiceId pulumi.StringPtrInput
	// AWS service name.
	AwsServiceName pulumi.StringPtrInput
	// List of the ARNs of the AWS accounts or IAM users allowed to connect to the VPC endpoint.
	Principals pulumi.StringArrayInput
	// The name of the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
	Project pulumi.StringPtrInput
	// The name of the service that this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
	ServiceName pulumi.StringPtrInput
}

func (AwsPrivatelinkState) ElementType() reflect.Type {
	return reflect.TypeOf((*awsPrivatelinkState)(nil)).Elem()
}

type awsPrivatelinkArgs struct {
	// List of the ARNs of the AWS accounts or IAM users allowed to connect to the VPC endpoint.
	Principals []string `pulumi:"principals"`
	// The name of the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
	Project string `pulumi:"project"`
	// The name of the service that this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
	ServiceName string `pulumi:"serviceName"`
}

// The set of arguments for constructing a AwsPrivatelink resource.
type AwsPrivatelinkArgs struct {
	// List of the ARNs of the AWS accounts or IAM users allowed to connect to the VPC endpoint.
	Principals pulumi.StringArrayInput
	// The name of the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
	Project pulumi.StringInput
	// The name of the service that this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
	ServiceName pulumi.StringInput
}

func (AwsPrivatelinkArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*awsPrivatelinkArgs)(nil)).Elem()
}

type AwsPrivatelinkInput interface {
	pulumi.Input

	ToAwsPrivatelinkOutput() AwsPrivatelinkOutput
	ToAwsPrivatelinkOutputWithContext(ctx context.Context) AwsPrivatelinkOutput
}

func (*AwsPrivatelink) ElementType() reflect.Type {
	return reflect.TypeOf((**AwsPrivatelink)(nil)).Elem()
}

func (i *AwsPrivatelink) ToAwsPrivatelinkOutput() AwsPrivatelinkOutput {
	return i.ToAwsPrivatelinkOutputWithContext(context.Background())
}

func (i *AwsPrivatelink) ToAwsPrivatelinkOutputWithContext(ctx context.Context) AwsPrivatelinkOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AwsPrivatelinkOutput)
}

// AwsPrivatelinkArrayInput is an input type that accepts AwsPrivatelinkArray and AwsPrivatelinkArrayOutput values.
// You can construct a concrete instance of `AwsPrivatelinkArrayInput` via:
//
//	AwsPrivatelinkArray{ AwsPrivatelinkArgs{...} }
type AwsPrivatelinkArrayInput interface {
	pulumi.Input

	ToAwsPrivatelinkArrayOutput() AwsPrivatelinkArrayOutput
	ToAwsPrivatelinkArrayOutputWithContext(context.Context) AwsPrivatelinkArrayOutput
}

type AwsPrivatelinkArray []AwsPrivatelinkInput

func (AwsPrivatelinkArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AwsPrivatelink)(nil)).Elem()
}

func (i AwsPrivatelinkArray) ToAwsPrivatelinkArrayOutput() AwsPrivatelinkArrayOutput {
	return i.ToAwsPrivatelinkArrayOutputWithContext(context.Background())
}

func (i AwsPrivatelinkArray) ToAwsPrivatelinkArrayOutputWithContext(ctx context.Context) AwsPrivatelinkArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AwsPrivatelinkArrayOutput)
}

// AwsPrivatelinkMapInput is an input type that accepts AwsPrivatelinkMap and AwsPrivatelinkMapOutput values.
// You can construct a concrete instance of `AwsPrivatelinkMapInput` via:
//
//	AwsPrivatelinkMap{ "key": AwsPrivatelinkArgs{...} }
type AwsPrivatelinkMapInput interface {
	pulumi.Input

	ToAwsPrivatelinkMapOutput() AwsPrivatelinkMapOutput
	ToAwsPrivatelinkMapOutputWithContext(context.Context) AwsPrivatelinkMapOutput
}

type AwsPrivatelinkMap map[string]AwsPrivatelinkInput

func (AwsPrivatelinkMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AwsPrivatelink)(nil)).Elem()
}

func (i AwsPrivatelinkMap) ToAwsPrivatelinkMapOutput() AwsPrivatelinkMapOutput {
	return i.ToAwsPrivatelinkMapOutputWithContext(context.Background())
}

func (i AwsPrivatelinkMap) ToAwsPrivatelinkMapOutputWithContext(ctx context.Context) AwsPrivatelinkMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AwsPrivatelinkMapOutput)
}

type AwsPrivatelinkOutput struct{ *pulumi.OutputState }

func (AwsPrivatelinkOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**AwsPrivatelink)(nil)).Elem()
}

func (o AwsPrivatelinkOutput) ToAwsPrivatelinkOutput() AwsPrivatelinkOutput {
	return o
}

func (o AwsPrivatelinkOutput) ToAwsPrivatelinkOutputWithContext(ctx context.Context) AwsPrivatelinkOutput {
	return o
}

// AWS service ID.
func (o AwsPrivatelinkOutput) AwsServiceId() pulumi.StringOutput {
	return o.ApplyT(func(v *AwsPrivatelink) pulumi.StringOutput { return v.AwsServiceId }).(pulumi.StringOutput)
}

// AWS service name.
func (o AwsPrivatelinkOutput) AwsServiceName() pulumi.StringOutput {
	return o.ApplyT(func(v *AwsPrivatelink) pulumi.StringOutput { return v.AwsServiceName }).(pulumi.StringOutput)
}

// List of the ARNs of the AWS accounts or IAM users allowed to connect to the VPC endpoint.
func (o AwsPrivatelinkOutput) Principals() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *AwsPrivatelink) pulumi.StringArrayOutput { return v.Principals }).(pulumi.StringArrayOutput)
}

// The name of the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
func (o AwsPrivatelinkOutput) Project() pulumi.StringOutput {
	return o.ApplyT(func(v *AwsPrivatelink) pulumi.StringOutput { return v.Project }).(pulumi.StringOutput)
}

// The name of the service that this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
func (o AwsPrivatelinkOutput) ServiceName() pulumi.StringOutput {
	return o.ApplyT(func(v *AwsPrivatelink) pulumi.StringOutput { return v.ServiceName }).(pulumi.StringOutput)
}

type AwsPrivatelinkArrayOutput struct{ *pulumi.OutputState }

func (AwsPrivatelinkArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AwsPrivatelink)(nil)).Elem()
}

func (o AwsPrivatelinkArrayOutput) ToAwsPrivatelinkArrayOutput() AwsPrivatelinkArrayOutput {
	return o
}

func (o AwsPrivatelinkArrayOutput) ToAwsPrivatelinkArrayOutputWithContext(ctx context.Context) AwsPrivatelinkArrayOutput {
	return o
}

func (o AwsPrivatelinkArrayOutput) Index(i pulumi.IntInput) AwsPrivatelinkOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *AwsPrivatelink {
		return vs[0].([]*AwsPrivatelink)[vs[1].(int)]
	}).(AwsPrivatelinkOutput)
}

type AwsPrivatelinkMapOutput struct{ *pulumi.OutputState }

func (AwsPrivatelinkMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AwsPrivatelink)(nil)).Elem()
}

func (o AwsPrivatelinkMapOutput) ToAwsPrivatelinkMapOutput() AwsPrivatelinkMapOutput {
	return o
}

func (o AwsPrivatelinkMapOutput) ToAwsPrivatelinkMapOutputWithContext(ctx context.Context) AwsPrivatelinkMapOutput {
	return o
}

func (o AwsPrivatelinkMapOutput) MapIndex(k pulumi.StringInput) AwsPrivatelinkOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *AwsPrivatelink {
		return vs[0].(map[string]*AwsPrivatelink)[vs[1].(string)]
	}).(AwsPrivatelinkOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*AwsPrivatelinkInput)(nil)).Elem(), &AwsPrivatelink{})
	pulumi.RegisterInputType(reflect.TypeOf((*AwsPrivatelinkArrayInput)(nil)).Elem(), AwsPrivatelinkArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*AwsPrivatelinkMapInput)(nil)).Elem(), AwsPrivatelinkMap{})
	pulumi.RegisterOutputType(AwsPrivatelinkOutput{})
	pulumi.RegisterOutputType(AwsPrivatelinkArrayOutput{})
	pulumi.RegisterOutputType(AwsPrivatelinkMapOutput{})
}
