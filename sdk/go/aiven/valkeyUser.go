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

// Creates and manages an [Aiven for Valkey](https://aiven.io/docs/products/valkey) user.
//
// **This resource is in the beta stage and may change without notice.** Set
// the `PROVIDER_AIVEN_ENABLE_BETA` environment variable to use the resource.
type ValkeyUser struct {
	pulumi.CustomResourceState

	// The password of the Valkey User.
	Password pulumi.StringOutput `pulumi:"password"`
	// The name of the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
	Project pulumi.StringOutput `pulumi:"project"`
	// The name of the service that this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
	ServiceName pulumi.StringOutput `pulumi:"serviceName"`
	// Type of the user account. Tells whether the user is the primary account or a regular account.
	Type pulumi.StringOutput `pulumi:"type"`
	// The actual name of the Valkey User. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
	Username pulumi.StringOutput `pulumi:"username"`
	// Defines command category rules. The field is required with`valkeyAclCommands` and `valkeyAclKeys`. Changing this property forces recreation of the resource.
	ValkeyAclCategories pulumi.StringArrayOutput `pulumi:"valkeyAclCategories"`
	// Defines the permitted pub/sub channel patterns. Changing this property forces recreation of the resource.
	ValkeyAclChannels pulumi.StringArrayOutput `pulumi:"valkeyAclChannels"`
	// Defines rules for individual commands. The field is required with`valkeyAclCategories` and `valkeyAclKeys`. Changing this property forces recreation of the resource.
	ValkeyAclCommands pulumi.StringArrayOutput `pulumi:"valkeyAclCommands"`
	// Defines key access rules. The field is required with`valkeyAclCategories` and `valkeyAclKeys`. Changing this property forces recreation of the resource.
	ValkeyAclKeys pulumi.StringArrayOutput `pulumi:"valkeyAclKeys"`
}

// NewValkeyUser registers a new resource with the given unique name, arguments, and options.
func NewValkeyUser(ctx *pulumi.Context,
	name string, args *ValkeyUserArgs, opts ...pulumi.ResourceOption) (*ValkeyUser, error) {
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
	var resource ValkeyUser
	err := ctx.RegisterResource("aiven:index/valkeyUser:ValkeyUser", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetValkeyUser gets an existing ValkeyUser resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetValkeyUser(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ValkeyUserState, opts ...pulumi.ResourceOption) (*ValkeyUser, error) {
	var resource ValkeyUser
	err := ctx.ReadResource("aiven:index/valkeyUser:ValkeyUser", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ValkeyUser resources.
type valkeyUserState struct {
	// The password of the Valkey User.
	Password *string `pulumi:"password"`
	// The name of the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
	Project *string `pulumi:"project"`
	// The name of the service that this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
	ServiceName *string `pulumi:"serviceName"`
	// Type of the user account. Tells whether the user is the primary account or a regular account.
	Type *string `pulumi:"type"`
	// The actual name of the Valkey User. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
	Username *string `pulumi:"username"`
	// Defines command category rules. The field is required with`valkeyAclCommands` and `valkeyAclKeys`. Changing this property forces recreation of the resource.
	ValkeyAclCategories []string `pulumi:"valkeyAclCategories"`
	// Defines the permitted pub/sub channel patterns. Changing this property forces recreation of the resource.
	ValkeyAclChannels []string `pulumi:"valkeyAclChannels"`
	// Defines rules for individual commands. The field is required with`valkeyAclCategories` and `valkeyAclKeys`. Changing this property forces recreation of the resource.
	ValkeyAclCommands []string `pulumi:"valkeyAclCommands"`
	// Defines key access rules. The field is required with`valkeyAclCategories` and `valkeyAclKeys`. Changing this property forces recreation of the resource.
	ValkeyAclKeys []string `pulumi:"valkeyAclKeys"`
}

type ValkeyUserState struct {
	// The password of the Valkey User.
	Password pulumi.StringPtrInput
	// The name of the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
	Project pulumi.StringPtrInput
	// The name of the service that this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
	ServiceName pulumi.StringPtrInput
	// Type of the user account. Tells whether the user is the primary account or a regular account.
	Type pulumi.StringPtrInput
	// The actual name of the Valkey User. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
	Username pulumi.StringPtrInput
	// Defines command category rules. The field is required with`valkeyAclCommands` and `valkeyAclKeys`. Changing this property forces recreation of the resource.
	ValkeyAclCategories pulumi.StringArrayInput
	// Defines the permitted pub/sub channel patterns. Changing this property forces recreation of the resource.
	ValkeyAclChannels pulumi.StringArrayInput
	// Defines rules for individual commands. The field is required with`valkeyAclCategories` and `valkeyAclKeys`. Changing this property forces recreation of the resource.
	ValkeyAclCommands pulumi.StringArrayInput
	// Defines key access rules. The field is required with`valkeyAclCategories` and `valkeyAclKeys`. Changing this property forces recreation of the resource.
	ValkeyAclKeys pulumi.StringArrayInput
}

func (ValkeyUserState) ElementType() reflect.Type {
	return reflect.TypeOf((*valkeyUserState)(nil)).Elem()
}

type valkeyUserArgs struct {
	// The password of the Valkey User.
	Password *string `pulumi:"password"`
	// The name of the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
	Project string `pulumi:"project"`
	// The name of the service that this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
	ServiceName string `pulumi:"serviceName"`
	// The actual name of the Valkey User. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
	Username string `pulumi:"username"`
	// Defines command category rules. The field is required with`valkeyAclCommands` and `valkeyAclKeys`. Changing this property forces recreation of the resource.
	ValkeyAclCategories []string `pulumi:"valkeyAclCategories"`
	// Defines the permitted pub/sub channel patterns. Changing this property forces recreation of the resource.
	ValkeyAclChannels []string `pulumi:"valkeyAclChannels"`
	// Defines rules for individual commands. The field is required with`valkeyAclCategories` and `valkeyAclKeys`. Changing this property forces recreation of the resource.
	ValkeyAclCommands []string `pulumi:"valkeyAclCommands"`
	// Defines key access rules. The field is required with`valkeyAclCategories` and `valkeyAclKeys`. Changing this property forces recreation of the resource.
	ValkeyAclKeys []string `pulumi:"valkeyAclKeys"`
}

// The set of arguments for constructing a ValkeyUser resource.
type ValkeyUserArgs struct {
	// The password of the Valkey User.
	Password pulumi.StringPtrInput
	// The name of the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
	Project pulumi.StringInput
	// The name of the service that this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
	ServiceName pulumi.StringInput
	// The actual name of the Valkey User. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
	Username pulumi.StringInput
	// Defines command category rules. The field is required with`valkeyAclCommands` and `valkeyAclKeys`. Changing this property forces recreation of the resource.
	ValkeyAclCategories pulumi.StringArrayInput
	// Defines the permitted pub/sub channel patterns. Changing this property forces recreation of the resource.
	ValkeyAclChannels pulumi.StringArrayInput
	// Defines rules for individual commands. The field is required with`valkeyAclCategories` and `valkeyAclKeys`. Changing this property forces recreation of the resource.
	ValkeyAclCommands pulumi.StringArrayInput
	// Defines key access rules. The field is required with`valkeyAclCategories` and `valkeyAclKeys`. Changing this property forces recreation of the resource.
	ValkeyAclKeys pulumi.StringArrayInput
}

func (ValkeyUserArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*valkeyUserArgs)(nil)).Elem()
}

type ValkeyUserInput interface {
	pulumi.Input

	ToValkeyUserOutput() ValkeyUserOutput
	ToValkeyUserOutputWithContext(ctx context.Context) ValkeyUserOutput
}

func (*ValkeyUser) ElementType() reflect.Type {
	return reflect.TypeOf((**ValkeyUser)(nil)).Elem()
}

func (i *ValkeyUser) ToValkeyUserOutput() ValkeyUserOutput {
	return i.ToValkeyUserOutputWithContext(context.Background())
}

func (i *ValkeyUser) ToValkeyUserOutputWithContext(ctx context.Context) ValkeyUserOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ValkeyUserOutput)
}

// ValkeyUserArrayInput is an input type that accepts ValkeyUserArray and ValkeyUserArrayOutput values.
// You can construct a concrete instance of `ValkeyUserArrayInput` via:
//
//	ValkeyUserArray{ ValkeyUserArgs{...} }
type ValkeyUserArrayInput interface {
	pulumi.Input

	ToValkeyUserArrayOutput() ValkeyUserArrayOutput
	ToValkeyUserArrayOutputWithContext(context.Context) ValkeyUserArrayOutput
}

type ValkeyUserArray []ValkeyUserInput

func (ValkeyUserArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ValkeyUser)(nil)).Elem()
}

func (i ValkeyUserArray) ToValkeyUserArrayOutput() ValkeyUserArrayOutput {
	return i.ToValkeyUserArrayOutputWithContext(context.Background())
}

func (i ValkeyUserArray) ToValkeyUserArrayOutputWithContext(ctx context.Context) ValkeyUserArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ValkeyUserArrayOutput)
}

// ValkeyUserMapInput is an input type that accepts ValkeyUserMap and ValkeyUserMapOutput values.
// You can construct a concrete instance of `ValkeyUserMapInput` via:
//
//	ValkeyUserMap{ "key": ValkeyUserArgs{...} }
type ValkeyUserMapInput interface {
	pulumi.Input

	ToValkeyUserMapOutput() ValkeyUserMapOutput
	ToValkeyUserMapOutputWithContext(context.Context) ValkeyUserMapOutput
}

type ValkeyUserMap map[string]ValkeyUserInput

func (ValkeyUserMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ValkeyUser)(nil)).Elem()
}

func (i ValkeyUserMap) ToValkeyUserMapOutput() ValkeyUserMapOutput {
	return i.ToValkeyUserMapOutputWithContext(context.Background())
}

func (i ValkeyUserMap) ToValkeyUserMapOutputWithContext(ctx context.Context) ValkeyUserMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ValkeyUserMapOutput)
}

type ValkeyUserOutput struct{ *pulumi.OutputState }

func (ValkeyUserOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ValkeyUser)(nil)).Elem()
}

func (o ValkeyUserOutput) ToValkeyUserOutput() ValkeyUserOutput {
	return o
}

func (o ValkeyUserOutput) ToValkeyUserOutputWithContext(ctx context.Context) ValkeyUserOutput {
	return o
}

// The password of the Valkey User.
func (o ValkeyUserOutput) Password() pulumi.StringOutput {
	return o.ApplyT(func(v *ValkeyUser) pulumi.StringOutput { return v.Password }).(pulumi.StringOutput)
}

// The name of the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
func (o ValkeyUserOutput) Project() pulumi.StringOutput {
	return o.ApplyT(func(v *ValkeyUser) pulumi.StringOutput { return v.Project }).(pulumi.StringOutput)
}

// The name of the service that this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
func (o ValkeyUserOutput) ServiceName() pulumi.StringOutput {
	return o.ApplyT(func(v *ValkeyUser) pulumi.StringOutput { return v.ServiceName }).(pulumi.StringOutput)
}

// Type of the user account. Tells whether the user is the primary account or a regular account.
func (o ValkeyUserOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v *ValkeyUser) pulumi.StringOutput { return v.Type }).(pulumi.StringOutput)
}

// The actual name of the Valkey User. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
func (o ValkeyUserOutput) Username() pulumi.StringOutput {
	return o.ApplyT(func(v *ValkeyUser) pulumi.StringOutput { return v.Username }).(pulumi.StringOutput)
}

// Defines command category rules. The field is required with`valkeyAclCommands` and `valkeyAclKeys`. Changing this property forces recreation of the resource.
func (o ValkeyUserOutput) ValkeyAclCategories() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *ValkeyUser) pulumi.StringArrayOutput { return v.ValkeyAclCategories }).(pulumi.StringArrayOutput)
}

// Defines the permitted pub/sub channel patterns. Changing this property forces recreation of the resource.
func (o ValkeyUserOutput) ValkeyAclChannels() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *ValkeyUser) pulumi.StringArrayOutput { return v.ValkeyAclChannels }).(pulumi.StringArrayOutput)
}

// Defines rules for individual commands. The field is required with`valkeyAclCategories` and `valkeyAclKeys`. Changing this property forces recreation of the resource.
func (o ValkeyUserOutput) ValkeyAclCommands() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *ValkeyUser) pulumi.StringArrayOutput { return v.ValkeyAclCommands }).(pulumi.StringArrayOutput)
}

// Defines key access rules. The field is required with`valkeyAclCategories` and `valkeyAclKeys`. Changing this property forces recreation of the resource.
func (o ValkeyUserOutput) ValkeyAclKeys() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *ValkeyUser) pulumi.StringArrayOutput { return v.ValkeyAclKeys }).(pulumi.StringArrayOutput)
}

type ValkeyUserArrayOutput struct{ *pulumi.OutputState }

func (ValkeyUserArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ValkeyUser)(nil)).Elem()
}

func (o ValkeyUserArrayOutput) ToValkeyUserArrayOutput() ValkeyUserArrayOutput {
	return o
}

func (o ValkeyUserArrayOutput) ToValkeyUserArrayOutputWithContext(ctx context.Context) ValkeyUserArrayOutput {
	return o
}

func (o ValkeyUserArrayOutput) Index(i pulumi.IntInput) ValkeyUserOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ValkeyUser {
		return vs[0].([]*ValkeyUser)[vs[1].(int)]
	}).(ValkeyUserOutput)
}

type ValkeyUserMapOutput struct{ *pulumi.OutputState }

func (ValkeyUserMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ValkeyUser)(nil)).Elem()
}

func (o ValkeyUserMapOutput) ToValkeyUserMapOutput() ValkeyUserMapOutput {
	return o
}

func (o ValkeyUserMapOutput) ToValkeyUserMapOutputWithContext(ctx context.Context) ValkeyUserMapOutput {
	return o
}

func (o ValkeyUserMapOutput) MapIndex(k pulumi.StringInput) ValkeyUserOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ValkeyUser {
		return vs[0].(map[string]*ValkeyUser)[vs[1].(string)]
	}).(ValkeyUserOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ValkeyUserInput)(nil)).Elem(), &ValkeyUser{})
	pulumi.RegisterInputType(reflect.TypeOf((*ValkeyUserArrayInput)(nil)).Elem(), ValkeyUserArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ValkeyUserMapInput)(nil)).Elem(), ValkeyUserMap{})
	pulumi.RegisterOutputType(ValkeyUserOutput{})
	pulumi.RegisterOutputType(ValkeyUserArrayOutput{})
	pulumi.RegisterOutputType(ValkeyUserMapOutput{})
}