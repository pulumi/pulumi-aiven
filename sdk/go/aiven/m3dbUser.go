// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package aiven

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-aiven/sdk/v6/go/aiven/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// The M3DB User resource allows the creation and management of Aiven M3DB Users.
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
//			_, err := aiven.NewM3dbUser(ctx, "foo", &aiven.M3dbUserArgs{
//				ServiceName: pulumi.Any(bar.ServiceName),
//				Project:     pulumi.String("my-project"),
//				Username:    pulumi.String("user-1"),
//				Password:    pulumi.String("Test$1234"),
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
// $ pulumi import aiven:index/m3dbUser:M3dbUser foo project/service_name/username
// ```
type M3dbUser struct {
	pulumi.CustomResourceState

	// The password of the M3DB User.
	Password pulumi.StringOutput `pulumi:"password"`
	// The name of the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
	Project pulumi.StringOutput `pulumi:"project"`
	// The name of the service that this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
	ServiceName pulumi.StringOutput `pulumi:"serviceName"`
	// Type of the user account. Tells whether the user is the primary account or a regular account.
	Type pulumi.StringOutput `pulumi:"type"`
	// The actual name of the M3DB User. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
	Username pulumi.StringOutput `pulumi:"username"`
}

// NewM3dbUser registers a new resource with the given unique name, arguments, and options.
func NewM3dbUser(ctx *pulumi.Context,
	name string, args *M3dbUserArgs, opts ...pulumi.ResourceOption) (*M3dbUser, error) {
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
	var resource M3dbUser
	err := ctx.RegisterResource("aiven:index/m3dbUser:M3dbUser", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetM3dbUser gets an existing M3dbUser resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetM3dbUser(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *M3dbUserState, opts ...pulumi.ResourceOption) (*M3dbUser, error) {
	var resource M3dbUser
	err := ctx.ReadResource("aiven:index/m3dbUser:M3dbUser", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering M3dbUser resources.
type m3dbUserState struct {
	// The password of the M3DB User.
	Password *string `pulumi:"password"`
	// The name of the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
	Project *string `pulumi:"project"`
	// The name of the service that this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
	ServiceName *string `pulumi:"serviceName"`
	// Type of the user account. Tells whether the user is the primary account or a regular account.
	Type *string `pulumi:"type"`
	// The actual name of the M3DB User. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
	Username *string `pulumi:"username"`
}

type M3dbUserState struct {
	// The password of the M3DB User.
	Password pulumi.StringPtrInput
	// The name of the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
	Project pulumi.StringPtrInput
	// The name of the service that this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
	ServiceName pulumi.StringPtrInput
	// Type of the user account. Tells whether the user is the primary account or a regular account.
	Type pulumi.StringPtrInput
	// The actual name of the M3DB User. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
	Username pulumi.StringPtrInput
}

func (M3dbUserState) ElementType() reflect.Type {
	return reflect.TypeOf((*m3dbUserState)(nil)).Elem()
}

type m3dbUserArgs struct {
	// The password of the M3DB User.
	Password *string `pulumi:"password"`
	// The name of the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
	Project string `pulumi:"project"`
	// The name of the service that this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
	ServiceName string `pulumi:"serviceName"`
	// The actual name of the M3DB User. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
	Username string `pulumi:"username"`
}

// The set of arguments for constructing a M3dbUser resource.
type M3dbUserArgs struct {
	// The password of the M3DB User.
	Password pulumi.StringPtrInput
	// The name of the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
	Project pulumi.StringInput
	// The name of the service that this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
	ServiceName pulumi.StringInput
	// The actual name of the M3DB User. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
	Username pulumi.StringInput
}

func (M3dbUserArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*m3dbUserArgs)(nil)).Elem()
}

type M3dbUserInput interface {
	pulumi.Input

	ToM3dbUserOutput() M3dbUserOutput
	ToM3dbUserOutputWithContext(ctx context.Context) M3dbUserOutput
}

func (*M3dbUser) ElementType() reflect.Type {
	return reflect.TypeOf((**M3dbUser)(nil)).Elem()
}

func (i *M3dbUser) ToM3dbUserOutput() M3dbUserOutput {
	return i.ToM3dbUserOutputWithContext(context.Background())
}

func (i *M3dbUser) ToM3dbUserOutputWithContext(ctx context.Context) M3dbUserOutput {
	return pulumi.ToOutputWithContext(ctx, i).(M3dbUserOutput)
}

// M3dbUserArrayInput is an input type that accepts M3dbUserArray and M3dbUserArrayOutput values.
// You can construct a concrete instance of `M3dbUserArrayInput` via:
//
//	M3dbUserArray{ M3dbUserArgs{...} }
type M3dbUserArrayInput interface {
	pulumi.Input

	ToM3dbUserArrayOutput() M3dbUserArrayOutput
	ToM3dbUserArrayOutputWithContext(context.Context) M3dbUserArrayOutput
}

type M3dbUserArray []M3dbUserInput

func (M3dbUserArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*M3dbUser)(nil)).Elem()
}

func (i M3dbUserArray) ToM3dbUserArrayOutput() M3dbUserArrayOutput {
	return i.ToM3dbUserArrayOutputWithContext(context.Background())
}

func (i M3dbUserArray) ToM3dbUserArrayOutputWithContext(ctx context.Context) M3dbUserArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(M3dbUserArrayOutput)
}

// M3dbUserMapInput is an input type that accepts M3dbUserMap and M3dbUserMapOutput values.
// You can construct a concrete instance of `M3dbUserMapInput` via:
//
//	M3dbUserMap{ "key": M3dbUserArgs{...} }
type M3dbUserMapInput interface {
	pulumi.Input

	ToM3dbUserMapOutput() M3dbUserMapOutput
	ToM3dbUserMapOutputWithContext(context.Context) M3dbUserMapOutput
}

type M3dbUserMap map[string]M3dbUserInput

func (M3dbUserMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*M3dbUser)(nil)).Elem()
}

func (i M3dbUserMap) ToM3dbUserMapOutput() M3dbUserMapOutput {
	return i.ToM3dbUserMapOutputWithContext(context.Background())
}

func (i M3dbUserMap) ToM3dbUserMapOutputWithContext(ctx context.Context) M3dbUserMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(M3dbUserMapOutput)
}

type M3dbUserOutput struct{ *pulumi.OutputState }

func (M3dbUserOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**M3dbUser)(nil)).Elem()
}

func (o M3dbUserOutput) ToM3dbUserOutput() M3dbUserOutput {
	return o
}

func (o M3dbUserOutput) ToM3dbUserOutputWithContext(ctx context.Context) M3dbUserOutput {
	return o
}

// The password of the M3DB User.
func (o M3dbUserOutput) Password() pulumi.StringOutput {
	return o.ApplyT(func(v *M3dbUser) pulumi.StringOutput { return v.Password }).(pulumi.StringOutput)
}

// The name of the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
func (o M3dbUserOutput) Project() pulumi.StringOutput {
	return o.ApplyT(func(v *M3dbUser) pulumi.StringOutput { return v.Project }).(pulumi.StringOutput)
}

// The name of the service that this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
func (o M3dbUserOutput) ServiceName() pulumi.StringOutput {
	return o.ApplyT(func(v *M3dbUser) pulumi.StringOutput { return v.ServiceName }).(pulumi.StringOutput)
}

// Type of the user account. Tells whether the user is the primary account or a regular account.
func (o M3dbUserOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v *M3dbUser) pulumi.StringOutput { return v.Type }).(pulumi.StringOutput)
}

// The actual name of the M3DB User. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
func (o M3dbUserOutput) Username() pulumi.StringOutput {
	return o.ApplyT(func(v *M3dbUser) pulumi.StringOutput { return v.Username }).(pulumi.StringOutput)
}

type M3dbUserArrayOutput struct{ *pulumi.OutputState }

func (M3dbUserArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*M3dbUser)(nil)).Elem()
}

func (o M3dbUserArrayOutput) ToM3dbUserArrayOutput() M3dbUserArrayOutput {
	return o
}

func (o M3dbUserArrayOutput) ToM3dbUserArrayOutputWithContext(ctx context.Context) M3dbUserArrayOutput {
	return o
}

func (o M3dbUserArrayOutput) Index(i pulumi.IntInput) M3dbUserOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *M3dbUser {
		return vs[0].([]*M3dbUser)[vs[1].(int)]
	}).(M3dbUserOutput)
}

type M3dbUserMapOutput struct{ *pulumi.OutputState }

func (M3dbUserMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*M3dbUser)(nil)).Elem()
}

func (o M3dbUserMapOutput) ToM3dbUserMapOutput() M3dbUserMapOutput {
	return o
}

func (o M3dbUserMapOutput) ToM3dbUserMapOutputWithContext(ctx context.Context) M3dbUserMapOutput {
	return o
}

func (o M3dbUserMapOutput) MapIndex(k pulumi.StringInput) M3dbUserOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *M3dbUser {
		return vs[0].(map[string]*M3dbUser)[vs[1].(string)]
	}).(M3dbUserOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*M3dbUserInput)(nil)).Elem(), &M3dbUser{})
	pulumi.RegisterInputType(reflect.TypeOf((*M3dbUserArrayInput)(nil)).Elem(), M3dbUserArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*M3dbUserMapInput)(nil)).Elem(), M3dbUserMap{})
	pulumi.RegisterOutputType(M3dbUserOutput{})
	pulumi.RegisterOutputType(M3dbUserArrayOutput{})
	pulumi.RegisterOutputType(M3dbUserMapOutput{})
}
