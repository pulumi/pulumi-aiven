// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package aiven

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// The Clickhouse Grant resource allows the creation and management of Grants in Aiven Clickhouse services.
//
// Notes:
// * Due to a ambiguity in the GRANT syntax in clickhouse you should not have users and roles with the same name. It is not clear if a grant refers to the user or the role.
// * Currently changes will first revoke all grants and then reissue the remaining grants for convergence.
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
// 		clickhouse, err := aiven.NewClickhouse(ctx, "clickhouse", &aiven.ClickhouseArgs{
// 			Project:     pulumi.Any(_var.Aiven_project_name),
// 			CloudName:   pulumi.String("google-europe-west1"),
// 			Plan:        pulumi.String("startup-8"),
// 			ServiceName: pulumi.String("exapmle-clickhouse"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		demodb, err := aiven.NewClickhouseDatabase(ctx, "demodb", &aiven.ClickhouseDatabaseArgs{
// 			Project:     clickhouse.Project,
// 			ServiceName: clickhouse.ServiceName,
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		demoClickhouseRole, err := aiven.NewClickhouseRole(ctx, "demoClickhouseRole", &aiven.ClickhouseRoleArgs{
// 			Project:     clickhouse.Project,
// 			ServiceName: clickhouse.ServiceName,
// 			Role:        pulumi.String("demo-role"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		_, err = aiven.NewClickhouseGrant(ctx, "demo-role-grant", &aiven.ClickhouseGrantArgs{
// 			Project:     clickhouse.Project,
// 			ServiceName: clickhouse.ServiceName,
// 			Role:        demoClickhouseRole.Role,
// 			PrivilegeGrants: ClickhouseGrantPrivilegeGrantArray{
// 				&ClickhouseGrantPrivilegeGrantArgs{
// 					Privilege: pulumi.String("INSERT"),
// 					Database:  demodb.Name,
// 					Table:     pulumi.String("*"),
// 				},
// 				&ClickhouseGrantPrivilegeGrantArgs{
// 					Privilege: pulumi.String("SELECT"),
// 					Database:  demodb.Name,
// 					Table:     pulumi.String("*"),
// 				},
// 			},
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		demoClickhouseUser, err := aiven.NewClickhouseUser(ctx, "demoClickhouseUser", &aiven.ClickhouseUserArgs{
// 			Project:     clickhouse.Project,
// 			ServiceName: clickhouse.ServiceName,
// 			Username:    pulumi.String("demo-user"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		_, err = aiven.NewClickhouseGrant(ctx, "demo-user-grant", &aiven.ClickhouseGrantArgs{
// 			Project:     clickhouse.Project,
// 			ServiceName: clickhouse.ServiceName,
// 			User:        demoClickhouseUser.Username,
// 			RoleGrants: ClickhouseGrantRoleGrantArray{
// 				&ClickhouseGrantRoleGrantArgs{
// 					Role: demoClickhouseRole.Role,
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
type ClickhouseGrant struct {
	pulumi.CustomResourceState

	// Configuration to grant a privilege. This property cannot be changed, doing so forces recreation of the resource.
	PrivilegeGrants ClickhouseGrantPrivilegeGrantArrayOutput `pulumi:"privilegeGrants"`
	// Identifies the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. This property cannot be changed, doing so forces recreation of the resource.
	Project pulumi.StringOutput `pulumi:"project"`
	// The role to grant privileges or roles to. To set up proper dependencies please refer to this variable as a reference. This property cannot be changed, doing so forces recreation of the resource.
	Role pulumi.StringPtrOutput `pulumi:"role"`
	// Configuration to grant a role. This property cannot be changed, doing so forces recreation of the resource.
	RoleGrants ClickhouseGrantRoleGrantArrayOutput `pulumi:"roleGrants"`
	// Specifies the name of the service that this resource belongs to. To set up proper dependencies please refer to this variable as a reference. This property cannot be changed, doing so forces recreation of the resource.
	ServiceName pulumi.StringOutput `pulumi:"serviceName"`
	// The user to grant privileges or roles to. To set up proper dependencies please refer to this variable as a reference. This property cannot be changed, doing so forces recreation of the resource.
	User pulumi.StringPtrOutput `pulumi:"user"`
}

// NewClickhouseGrant registers a new resource with the given unique name, arguments, and options.
func NewClickhouseGrant(ctx *pulumi.Context,
	name string, args *ClickhouseGrantArgs, opts ...pulumi.ResourceOption) (*ClickhouseGrant, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Project == nil {
		return nil, errors.New("invalid value for required argument 'Project'")
	}
	if args.ServiceName == nil {
		return nil, errors.New("invalid value for required argument 'ServiceName'")
	}
	var resource ClickhouseGrant
	err := ctx.RegisterResource("aiven:index/clickhouseGrant:ClickhouseGrant", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetClickhouseGrant gets an existing ClickhouseGrant resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetClickhouseGrant(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ClickhouseGrantState, opts ...pulumi.ResourceOption) (*ClickhouseGrant, error) {
	var resource ClickhouseGrant
	err := ctx.ReadResource("aiven:index/clickhouseGrant:ClickhouseGrant", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ClickhouseGrant resources.
type clickhouseGrantState struct {
	// Configuration to grant a privilege. This property cannot be changed, doing so forces recreation of the resource.
	PrivilegeGrants []ClickhouseGrantPrivilegeGrant `pulumi:"privilegeGrants"`
	// Identifies the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. This property cannot be changed, doing so forces recreation of the resource.
	Project *string `pulumi:"project"`
	// The role to grant privileges or roles to. To set up proper dependencies please refer to this variable as a reference. This property cannot be changed, doing so forces recreation of the resource.
	Role *string `pulumi:"role"`
	// Configuration to grant a role. This property cannot be changed, doing so forces recreation of the resource.
	RoleGrants []ClickhouseGrantRoleGrant `pulumi:"roleGrants"`
	// Specifies the name of the service that this resource belongs to. To set up proper dependencies please refer to this variable as a reference. This property cannot be changed, doing so forces recreation of the resource.
	ServiceName *string `pulumi:"serviceName"`
	// The user to grant privileges or roles to. To set up proper dependencies please refer to this variable as a reference. This property cannot be changed, doing so forces recreation of the resource.
	User *string `pulumi:"user"`
}

type ClickhouseGrantState struct {
	// Configuration to grant a privilege. This property cannot be changed, doing so forces recreation of the resource.
	PrivilegeGrants ClickhouseGrantPrivilegeGrantArrayInput
	// Identifies the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. This property cannot be changed, doing so forces recreation of the resource.
	Project pulumi.StringPtrInput
	// The role to grant privileges or roles to. To set up proper dependencies please refer to this variable as a reference. This property cannot be changed, doing so forces recreation of the resource.
	Role pulumi.StringPtrInput
	// Configuration to grant a role. This property cannot be changed, doing so forces recreation of the resource.
	RoleGrants ClickhouseGrantRoleGrantArrayInput
	// Specifies the name of the service that this resource belongs to. To set up proper dependencies please refer to this variable as a reference. This property cannot be changed, doing so forces recreation of the resource.
	ServiceName pulumi.StringPtrInput
	// The user to grant privileges or roles to. To set up proper dependencies please refer to this variable as a reference. This property cannot be changed, doing so forces recreation of the resource.
	User pulumi.StringPtrInput
}

func (ClickhouseGrantState) ElementType() reflect.Type {
	return reflect.TypeOf((*clickhouseGrantState)(nil)).Elem()
}

type clickhouseGrantArgs struct {
	// Configuration to grant a privilege. This property cannot be changed, doing so forces recreation of the resource.
	PrivilegeGrants []ClickhouseGrantPrivilegeGrant `pulumi:"privilegeGrants"`
	// Identifies the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. This property cannot be changed, doing so forces recreation of the resource.
	Project string `pulumi:"project"`
	// The role to grant privileges or roles to. To set up proper dependencies please refer to this variable as a reference. This property cannot be changed, doing so forces recreation of the resource.
	Role *string `pulumi:"role"`
	// Configuration to grant a role. This property cannot be changed, doing so forces recreation of the resource.
	RoleGrants []ClickhouseGrantRoleGrant `pulumi:"roleGrants"`
	// Specifies the name of the service that this resource belongs to. To set up proper dependencies please refer to this variable as a reference. This property cannot be changed, doing so forces recreation of the resource.
	ServiceName string `pulumi:"serviceName"`
	// The user to grant privileges or roles to. To set up proper dependencies please refer to this variable as a reference. This property cannot be changed, doing so forces recreation of the resource.
	User *string `pulumi:"user"`
}

// The set of arguments for constructing a ClickhouseGrant resource.
type ClickhouseGrantArgs struct {
	// Configuration to grant a privilege. This property cannot be changed, doing so forces recreation of the resource.
	PrivilegeGrants ClickhouseGrantPrivilegeGrantArrayInput
	// Identifies the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. This property cannot be changed, doing so forces recreation of the resource.
	Project pulumi.StringInput
	// The role to grant privileges or roles to. To set up proper dependencies please refer to this variable as a reference. This property cannot be changed, doing so forces recreation of the resource.
	Role pulumi.StringPtrInput
	// Configuration to grant a role. This property cannot be changed, doing so forces recreation of the resource.
	RoleGrants ClickhouseGrantRoleGrantArrayInput
	// Specifies the name of the service that this resource belongs to. To set up proper dependencies please refer to this variable as a reference. This property cannot be changed, doing so forces recreation of the resource.
	ServiceName pulumi.StringInput
	// The user to grant privileges or roles to. To set up proper dependencies please refer to this variable as a reference. This property cannot be changed, doing so forces recreation of the resource.
	User pulumi.StringPtrInput
}

func (ClickhouseGrantArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*clickhouseGrantArgs)(nil)).Elem()
}

type ClickhouseGrantInput interface {
	pulumi.Input

	ToClickhouseGrantOutput() ClickhouseGrantOutput
	ToClickhouseGrantOutputWithContext(ctx context.Context) ClickhouseGrantOutput
}

func (*ClickhouseGrant) ElementType() reflect.Type {
	return reflect.TypeOf((**ClickhouseGrant)(nil)).Elem()
}

func (i *ClickhouseGrant) ToClickhouseGrantOutput() ClickhouseGrantOutput {
	return i.ToClickhouseGrantOutputWithContext(context.Background())
}

func (i *ClickhouseGrant) ToClickhouseGrantOutputWithContext(ctx context.Context) ClickhouseGrantOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ClickhouseGrantOutput)
}

// ClickhouseGrantArrayInput is an input type that accepts ClickhouseGrantArray and ClickhouseGrantArrayOutput values.
// You can construct a concrete instance of `ClickhouseGrantArrayInput` via:
//
//          ClickhouseGrantArray{ ClickhouseGrantArgs{...} }
type ClickhouseGrantArrayInput interface {
	pulumi.Input

	ToClickhouseGrantArrayOutput() ClickhouseGrantArrayOutput
	ToClickhouseGrantArrayOutputWithContext(context.Context) ClickhouseGrantArrayOutput
}

type ClickhouseGrantArray []ClickhouseGrantInput

func (ClickhouseGrantArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ClickhouseGrant)(nil)).Elem()
}

func (i ClickhouseGrantArray) ToClickhouseGrantArrayOutput() ClickhouseGrantArrayOutput {
	return i.ToClickhouseGrantArrayOutputWithContext(context.Background())
}

func (i ClickhouseGrantArray) ToClickhouseGrantArrayOutputWithContext(ctx context.Context) ClickhouseGrantArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ClickhouseGrantArrayOutput)
}

// ClickhouseGrantMapInput is an input type that accepts ClickhouseGrantMap and ClickhouseGrantMapOutput values.
// You can construct a concrete instance of `ClickhouseGrantMapInput` via:
//
//          ClickhouseGrantMap{ "key": ClickhouseGrantArgs{...} }
type ClickhouseGrantMapInput interface {
	pulumi.Input

	ToClickhouseGrantMapOutput() ClickhouseGrantMapOutput
	ToClickhouseGrantMapOutputWithContext(context.Context) ClickhouseGrantMapOutput
}

type ClickhouseGrantMap map[string]ClickhouseGrantInput

func (ClickhouseGrantMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ClickhouseGrant)(nil)).Elem()
}

func (i ClickhouseGrantMap) ToClickhouseGrantMapOutput() ClickhouseGrantMapOutput {
	return i.ToClickhouseGrantMapOutputWithContext(context.Background())
}

func (i ClickhouseGrantMap) ToClickhouseGrantMapOutputWithContext(ctx context.Context) ClickhouseGrantMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ClickhouseGrantMapOutput)
}

type ClickhouseGrantOutput struct{ *pulumi.OutputState }

func (ClickhouseGrantOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ClickhouseGrant)(nil)).Elem()
}

func (o ClickhouseGrantOutput) ToClickhouseGrantOutput() ClickhouseGrantOutput {
	return o
}

func (o ClickhouseGrantOutput) ToClickhouseGrantOutputWithContext(ctx context.Context) ClickhouseGrantOutput {
	return o
}

type ClickhouseGrantArrayOutput struct{ *pulumi.OutputState }

func (ClickhouseGrantArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ClickhouseGrant)(nil)).Elem()
}

func (o ClickhouseGrantArrayOutput) ToClickhouseGrantArrayOutput() ClickhouseGrantArrayOutput {
	return o
}

func (o ClickhouseGrantArrayOutput) ToClickhouseGrantArrayOutputWithContext(ctx context.Context) ClickhouseGrantArrayOutput {
	return o
}

func (o ClickhouseGrantArrayOutput) Index(i pulumi.IntInput) ClickhouseGrantOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ClickhouseGrant {
		return vs[0].([]*ClickhouseGrant)[vs[1].(int)]
	}).(ClickhouseGrantOutput)
}

type ClickhouseGrantMapOutput struct{ *pulumi.OutputState }

func (ClickhouseGrantMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ClickhouseGrant)(nil)).Elem()
}

func (o ClickhouseGrantMapOutput) ToClickhouseGrantMapOutput() ClickhouseGrantMapOutput {
	return o
}

func (o ClickhouseGrantMapOutput) ToClickhouseGrantMapOutputWithContext(ctx context.Context) ClickhouseGrantMapOutput {
	return o
}

func (o ClickhouseGrantMapOutput) MapIndex(k pulumi.StringInput) ClickhouseGrantOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ClickhouseGrant {
		return vs[0].(map[string]*ClickhouseGrant)[vs[1].(string)]
	}).(ClickhouseGrantOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ClickhouseGrantInput)(nil)).Elem(), &ClickhouseGrant{})
	pulumi.RegisterInputType(reflect.TypeOf((*ClickhouseGrantArrayInput)(nil)).Elem(), ClickhouseGrantArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ClickhouseGrantMapInput)(nil)).Elem(), ClickhouseGrantMap{})
	pulumi.RegisterOutputType(ClickhouseGrantOutput{})
	pulumi.RegisterOutputType(ClickhouseGrantArrayOutput{})
	pulumi.RegisterOutputType(ClickhouseGrantMapOutput{})
}