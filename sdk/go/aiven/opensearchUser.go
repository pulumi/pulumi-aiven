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

// Creates and manages an Aiven for OpenSearch® service user.
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
//			_, err := aiven.NewOpensearchUser(ctx, "example_opensearch_user", &aiven.OpensearchUserArgs{
//				ServiceName: pulumi.Any(exampleOpensearch.ServiceName),
//				Project:     pulumi.Any(exampleProject.Project),
//				Username:    pulumi.String("example-opensearch-user"),
//				Password:    pulumi.Any(opensearchUserPassword),
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
// $ pulumi import aiven:index/opensearchUser:OpensearchUser example_opensearch_user PROJECT/SERVICE_NAME/USERNAME
// ```
type OpensearchUser struct {
	pulumi.CustomResourceState

	// The OpenSearch service user's password.
	Password pulumi.StringOutput `pulumi:"password"`
	// The name of the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
	Project pulumi.StringOutput `pulumi:"project"`
	// The name of the service that this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
	ServiceName pulumi.StringOutput `pulumi:"serviceName"`
	// User account type, such as primary or regular account.
	Type pulumi.StringOutput `pulumi:"type"`
	// Name of the OpenSearch service user. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
	Username pulumi.StringOutput `pulumi:"username"`
}

// NewOpensearchUser registers a new resource with the given unique name, arguments, and options.
func NewOpensearchUser(ctx *pulumi.Context,
	name string, args *OpensearchUserArgs, opts ...pulumi.ResourceOption) (*OpensearchUser, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Project == nil {
		return nil, errors.New("invalid value for required argument 'Project'")
	}
	if args.ServiceName == nil {
		return nil, errors.New("invalid value for required argument 'ServiceName'")
	}
	if args.Username == nil {
		return nil, errors.New("invalid value for required argument 'Username'")
	}
	if args.Password != nil {
		args.Password = pulumi.ToSecret(args.Password).(pulumi.StringPtrInput)
	}
	secrets := pulumi.AdditionalSecretOutputs([]string{
		"password",
	})
	opts = append(opts, secrets)
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource OpensearchUser
	err := ctx.RegisterResource("aiven:index/opensearchUser:OpensearchUser", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetOpensearchUser gets an existing OpensearchUser resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetOpensearchUser(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *OpensearchUserState, opts ...pulumi.ResourceOption) (*OpensearchUser, error) {
	var resource OpensearchUser
	err := ctx.ReadResource("aiven:index/opensearchUser:OpensearchUser", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering OpensearchUser resources.
type opensearchUserState struct {
	// The OpenSearch service user's password.
	Password *string `pulumi:"password"`
	// The name of the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
	Project *string `pulumi:"project"`
	// The name of the service that this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
	ServiceName *string `pulumi:"serviceName"`
	// User account type, such as primary or regular account.
	Type *string `pulumi:"type"`
	// Name of the OpenSearch service user. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
	Username *string `pulumi:"username"`
}

type OpensearchUserState struct {
	// The OpenSearch service user's password.
	Password pulumi.StringPtrInput
	// The name of the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
	Project pulumi.StringPtrInput
	// The name of the service that this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
	ServiceName pulumi.StringPtrInput
	// User account type, such as primary or regular account.
	Type pulumi.StringPtrInput
	// Name of the OpenSearch service user. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
	Username pulumi.StringPtrInput
}

func (OpensearchUserState) ElementType() reflect.Type {
	return reflect.TypeOf((*opensearchUserState)(nil)).Elem()
}

type opensearchUserArgs struct {
	// The OpenSearch service user's password.
	Password *string `pulumi:"password"`
	// The name of the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
	Project string `pulumi:"project"`
	// The name of the service that this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
	ServiceName string `pulumi:"serviceName"`
	// Name of the OpenSearch service user. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
	Username string `pulumi:"username"`
}

// The set of arguments for constructing a OpensearchUser resource.
type OpensearchUserArgs struct {
	// The OpenSearch service user's password.
	Password pulumi.StringPtrInput
	// The name of the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
	Project pulumi.StringInput
	// The name of the service that this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
	ServiceName pulumi.StringInput
	// Name of the OpenSearch service user. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
	Username pulumi.StringInput
}

func (OpensearchUserArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*opensearchUserArgs)(nil)).Elem()
}

type OpensearchUserInput interface {
	pulumi.Input

	ToOpensearchUserOutput() OpensearchUserOutput
	ToOpensearchUserOutputWithContext(ctx context.Context) OpensearchUserOutput
}

func (*OpensearchUser) ElementType() reflect.Type {
	return reflect.TypeOf((**OpensearchUser)(nil)).Elem()
}

func (i *OpensearchUser) ToOpensearchUserOutput() OpensearchUserOutput {
	return i.ToOpensearchUserOutputWithContext(context.Background())
}

func (i *OpensearchUser) ToOpensearchUserOutputWithContext(ctx context.Context) OpensearchUserOutput {
	return pulumi.ToOutputWithContext(ctx, i).(OpensearchUserOutput)
}

// OpensearchUserArrayInput is an input type that accepts OpensearchUserArray and OpensearchUserArrayOutput values.
// You can construct a concrete instance of `OpensearchUserArrayInput` via:
//
//	OpensearchUserArray{ OpensearchUserArgs{...} }
type OpensearchUserArrayInput interface {
	pulumi.Input

	ToOpensearchUserArrayOutput() OpensearchUserArrayOutput
	ToOpensearchUserArrayOutputWithContext(context.Context) OpensearchUserArrayOutput
}

type OpensearchUserArray []OpensearchUserInput

func (OpensearchUserArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*OpensearchUser)(nil)).Elem()
}

func (i OpensearchUserArray) ToOpensearchUserArrayOutput() OpensearchUserArrayOutput {
	return i.ToOpensearchUserArrayOutputWithContext(context.Background())
}

func (i OpensearchUserArray) ToOpensearchUserArrayOutputWithContext(ctx context.Context) OpensearchUserArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(OpensearchUserArrayOutput)
}

// OpensearchUserMapInput is an input type that accepts OpensearchUserMap and OpensearchUserMapOutput values.
// You can construct a concrete instance of `OpensearchUserMapInput` via:
//
//	OpensearchUserMap{ "key": OpensearchUserArgs{...} }
type OpensearchUserMapInput interface {
	pulumi.Input

	ToOpensearchUserMapOutput() OpensearchUserMapOutput
	ToOpensearchUserMapOutputWithContext(context.Context) OpensearchUserMapOutput
}

type OpensearchUserMap map[string]OpensearchUserInput

func (OpensearchUserMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*OpensearchUser)(nil)).Elem()
}

func (i OpensearchUserMap) ToOpensearchUserMapOutput() OpensearchUserMapOutput {
	return i.ToOpensearchUserMapOutputWithContext(context.Background())
}

func (i OpensearchUserMap) ToOpensearchUserMapOutputWithContext(ctx context.Context) OpensearchUserMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(OpensearchUserMapOutput)
}

type OpensearchUserOutput struct{ *pulumi.OutputState }

func (OpensearchUserOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**OpensearchUser)(nil)).Elem()
}

func (o OpensearchUserOutput) ToOpensearchUserOutput() OpensearchUserOutput {
	return o
}

func (o OpensearchUserOutput) ToOpensearchUserOutputWithContext(ctx context.Context) OpensearchUserOutput {
	return o
}

// The OpenSearch service user's password.
func (o OpensearchUserOutput) Password() pulumi.StringOutput {
	return o.ApplyT(func(v *OpensearchUser) pulumi.StringOutput { return v.Password }).(pulumi.StringOutput)
}

// The name of the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
func (o OpensearchUserOutput) Project() pulumi.StringOutput {
	return o.ApplyT(func(v *OpensearchUser) pulumi.StringOutput { return v.Project }).(pulumi.StringOutput)
}

// The name of the service that this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
func (o OpensearchUserOutput) ServiceName() pulumi.StringOutput {
	return o.ApplyT(func(v *OpensearchUser) pulumi.StringOutput { return v.ServiceName }).(pulumi.StringOutput)
}

// User account type, such as primary or regular account.
func (o OpensearchUserOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v *OpensearchUser) pulumi.StringOutput { return v.Type }).(pulumi.StringOutput)
}

// Name of the OpenSearch service user. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
func (o OpensearchUserOutput) Username() pulumi.StringOutput {
	return o.ApplyT(func(v *OpensearchUser) pulumi.StringOutput { return v.Username }).(pulumi.StringOutput)
}

type OpensearchUserArrayOutput struct{ *pulumi.OutputState }

func (OpensearchUserArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*OpensearchUser)(nil)).Elem()
}

func (o OpensearchUserArrayOutput) ToOpensearchUserArrayOutput() OpensearchUserArrayOutput {
	return o
}

func (o OpensearchUserArrayOutput) ToOpensearchUserArrayOutputWithContext(ctx context.Context) OpensearchUserArrayOutput {
	return o
}

func (o OpensearchUserArrayOutput) Index(i pulumi.IntInput) OpensearchUserOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *OpensearchUser {
		return vs[0].([]*OpensearchUser)[vs[1].(int)]
	}).(OpensearchUserOutput)
}

type OpensearchUserMapOutput struct{ *pulumi.OutputState }

func (OpensearchUserMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*OpensearchUser)(nil)).Elem()
}

func (o OpensearchUserMapOutput) ToOpensearchUserMapOutput() OpensearchUserMapOutput {
	return o
}

func (o OpensearchUserMapOutput) ToOpensearchUserMapOutputWithContext(ctx context.Context) OpensearchUserMapOutput {
	return o
}

func (o OpensearchUserMapOutput) MapIndex(k pulumi.StringInput) OpensearchUserOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *OpensearchUser {
		return vs[0].(map[string]*OpensearchUser)[vs[1].(string)]
	}).(OpensearchUserOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*OpensearchUserInput)(nil)).Elem(), &OpensearchUser{})
	pulumi.RegisterInputType(reflect.TypeOf((*OpensearchUserArrayInput)(nil)).Elem(), OpensearchUserArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*OpensearchUserMapInput)(nil)).Elem(), OpensearchUserMap{})
	pulumi.RegisterOutputType(OpensearchUserOutput{})
	pulumi.RegisterOutputType(OpensearchUserArrayOutput{})
	pulumi.RegisterOutputType(OpensearchUserMapOutput{})
}
