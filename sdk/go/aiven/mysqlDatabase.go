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

// Creates and manages an [Aiven for MySQL®](https://aiven.io/docs/products/mysql) database.
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
//			_, err := aiven.NewMysqlDatabase(ctx, "example_mysql_database", &aiven.MysqlDatabaseArgs{
//				Project:      pulumi.Any(exampleProject.Project),
//				ServiceName:  pulumi.Any(exampleMysql.ServiceName),
//				DatabaseName: pulumi.String("example-database"),
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
// $ pulumi import aiven:index/mysqlDatabase:MysqlDatabase example_database PROJECT/SERVICE_NAME/DATABASE_NAME
// ```
type MysqlDatabase struct {
	pulumi.CustomResourceState

	// The name of the database. Changing this property forces recreation of the resource.
	DatabaseName pulumi.StringOutput `pulumi:"databaseName"`
	// The name of the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
	Project pulumi.StringOutput `pulumi:"project"`
	// The name of the service that this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
	ServiceName           pulumi.StringOutput  `pulumi:"serviceName"`
	TerminationProtection pulumi.BoolPtrOutput `pulumi:"terminationProtection"`
}

// NewMysqlDatabase registers a new resource with the given unique name, arguments, and options.
func NewMysqlDatabase(ctx *pulumi.Context,
	name string, args *MysqlDatabaseArgs, opts ...pulumi.ResourceOption) (*MysqlDatabase, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.DatabaseName == nil {
		return nil, errors.New("invalid value for required argument 'DatabaseName'")
	}
	if args.Project == nil {
		return nil, errors.New("invalid value for required argument 'Project'")
	}
	if args.ServiceName == nil {
		return nil, errors.New("invalid value for required argument 'ServiceName'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource MysqlDatabase
	err := ctx.RegisterResource("aiven:index/mysqlDatabase:MysqlDatabase", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetMysqlDatabase gets an existing MysqlDatabase resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetMysqlDatabase(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *MysqlDatabaseState, opts ...pulumi.ResourceOption) (*MysqlDatabase, error) {
	var resource MysqlDatabase
	err := ctx.ReadResource("aiven:index/mysqlDatabase:MysqlDatabase", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering MysqlDatabase resources.
type mysqlDatabaseState struct {
	// The name of the database. Changing this property forces recreation of the resource.
	DatabaseName *string `pulumi:"databaseName"`
	// The name of the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
	Project *string `pulumi:"project"`
	// The name of the service that this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
	ServiceName           *string `pulumi:"serviceName"`
	TerminationProtection *bool   `pulumi:"terminationProtection"`
}

type MysqlDatabaseState struct {
	// The name of the database. Changing this property forces recreation of the resource.
	DatabaseName pulumi.StringPtrInput
	// The name of the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
	Project pulumi.StringPtrInput
	// The name of the service that this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
	ServiceName           pulumi.StringPtrInput
	TerminationProtection pulumi.BoolPtrInput
}

func (MysqlDatabaseState) ElementType() reflect.Type {
	return reflect.TypeOf((*mysqlDatabaseState)(nil)).Elem()
}

type mysqlDatabaseArgs struct {
	// The name of the database. Changing this property forces recreation of the resource.
	DatabaseName string `pulumi:"databaseName"`
	// The name of the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
	Project string `pulumi:"project"`
	// The name of the service that this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
	ServiceName           string `pulumi:"serviceName"`
	TerminationProtection *bool  `pulumi:"terminationProtection"`
}

// The set of arguments for constructing a MysqlDatabase resource.
type MysqlDatabaseArgs struct {
	// The name of the database. Changing this property forces recreation of the resource.
	DatabaseName pulumi.StringInput
	// The name of the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
	Project pulumi.StringInput
	// The name of the service that this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
	ServiceName           pulumi.StringInput
	TerminationProtection pulumi.BoolPtrInput
}

func (MysqlDatabaseArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*mysqlDatabaseArgs)(nil)).Elem()
}

type MysqlDatabaseInput interface {
	pulumi.Input

	ToMysqlDatabaseOutput() MysqlDatabaseOutput
	ToMysqlDatabaseOutputWithContext(ctx context.Context) MysqlDatabaseOutput
}

func (*MysqlDatabase) ElementType() reflect.Type {
	return reflect.TypeOf((**MysqlDatabase)(nil)).Elem()
}

func (i *MysqlDatabase) ToMysqlDatabaseOutput() MysqlDatabaseOutput {
	return i.ToMysqlDatabaseOutputWithContext(context.Background())
}

func (i *MysqlDatabase) ToMysqlDatabaseOutputWithContext(ctx context.Context) MysqlDatabaseOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MysqlDatabaseOutput)
}

// MysqlDatabaseArrayInput is an input type that accepts MysqlDatabaseArray and MysqlDatabaseArrayOutput values.
// You can construct a concrete instance of `MysqlDatabaseArrayInput` via:
//
//	MysqlDatabaseArray{ MysqlDatabaseArgs{...} }
type MysqlDatabaseArrayInput interface {
	pulumi.Input

	ToMysqlDatabaseArrayOutput() MysqlDatabaseArrayOutput
	ToMysqlDatabaseArrayOutputWithContext(context.Context) MysqlDatabaseArrayOutput
}

type MysqlDatabaseArray []MysqlDatabaseInput

func (MysqlDatabaseArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*MysqlDatabase)(nil)).Elem()
}

func (i MysqlDatabaseArray) ToMysqlDatabaseArrayOutput() MysqlDatabaseArrayOutput {
	return i.ToMysqlDatabaseArrayOutputWithContext(context.Background())
}

func (i MysqlDatabaseArray) ToMysqlDatabaseArrayOutputWithContext(ctx context.Context) MysqlDatabaseArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MysqlDatabaseArrayOutput)
}

// MysqlDatabaseMapInput is an input type that accepts MysqlDatabaseMap and MysqlDatabaseMapOutput values.
// You can construct a concrete instance of `MysqlDatabaseMapInput` via:
//
//	MysqlDatabaseMap{ "key": MysqlDatabaseArgs{...} }
type MysqlDatabaseMapInput interface {
	pulumi.Input

	ToMysqlDatabaseMapOutput() MysqlDatabaseMapOutput
	ToMysqlDatabaseMapOutputWithContext(context.Context) MysqlDatabaseMapOutput
}

type MysqlDatabaseMap map[string]MysqlDatabaseInput

func (MysqlDatabaseMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*MysqlDatabase)(nil)).Elem()
}

func (i MysqlDatabaseMap) ToMysqlDatabaseMapOutput() MysqlDatabaseMapOutput {
	return i.ToMysqlDatabaseMapOutputWithContext(context.Background())
}

func (i MysqlDatabaseMap) ToMysqlDatabaseMapOutputWithContext(ctx context.Context) MysqlDatabaseMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MysqlDatabaseMapOutput)
}

type MysqlDatabaseOutput struct{ *pulumi.OutputState }

func (MysqlDatabaseOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**MysqlDatabase)(nil)).Elem()
}

func (o MysqlDatabaseOutput) ToMysqlDatabaseOutput() MysqlDatabaseOutput {
	return o
}

func (o MysqlDatabaseOutput) ToMysqlDatabaseOutputWithContext(ctx context.Context) MysqlDatabaseOutput {
	return o
}

// The name of the database. Changing this property forces recreation of the resource.
func (o MysqlDatabaseOutput) DatabaseName() pulumi.StringOutput {
	return o.ApplyT(func(v *MysqlDatabase) pulumi.StringOutput { return v.DatabaseName }).(pulumi.StringOutput)
}

// The name of the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
func (o MysqlDatabaseOutput) Project() pulumi.StringOutput {
	return o.ApplyT(func(v *MysqlDatabase) pulumi.StringOutput { return v.Project }).(pulumi.StringOutput)
}

// The name of the service that this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
func (o MysqlDatabaseOutput) ServiceName() pulumi.StringOutput {
	return o.ApplyT(func(v *MysqlDatabase) pulumi.StringOutput { return v.ServiceName }).(pulumi.StringOutput)
}

func (o MysqlDatabaseOutput) TerminationProtection() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *MysqlDatabase) pulumi.BoolPtrOutput { return v.TerminationProtection }).(pulumi.BoolPtrOutput)
}

type MysqlDatabaseArrayOutput struct{ *pulumi.OutputState }

func (MysqlDatabaseArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*MysqlDatabase)(nil)).Elem()
}

func (o MysqlDatabaseArrayOutput) ToMysqlDatabaseArrayOutput() MysqlDatabaseArrayOutput {
	return o
}

func (o MysqlDatabaseArrayOutput) ToMysqlDatabaseArrayOutputWithContext(ctx context.Context) MysqlDatabaseArrayOutput {
	return o
}

func (o MysqlDatabaseArrayOutput) Index(i pulumi.IntInput) MysqlDatabaseOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *MysqlDatabase {
		return vs[0].([]*MysqlDatabase)[vs[1].(int)]
	}).(MysqlDatabaseOutput)
}

type MysqlDatabaseMapOutput struct{ *pulumi.OutputState }

func (MysqlDatabaseMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*MysqlDatabase)(nil)).Elem()
}

func (o MysqlDatabaseMapOutput) ToMysqlDatabaseMapOutput() MysqlDatabaseMapOutput {
	return o
}

func (o MysqlDatabaseMapOutput) ToMysqlDatabaseMapOutputWithContext(ctx context.Context) MysqlDatabaseMapOutput {
	return o
}

func (o MysqlDatabaseMapOutput) MapIndex(k pulumi.StringInput) MysqlDatabaseOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *MysqlDatabase {
		return vs[0].(map[string]*MysqlDatabase)[vs[1].(string)]
	}).(MysqlDatabaseOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*MysqlDatabaseInput)(nil)).Elem(), &MysqlDatabase{})
	pulumi.RegisterInputType(reflect.TypeOf((*MysqlDatabaseArrayInput)(nil)).Elem(), MysqlDatabaseArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*MysqlDatabaseMapInput)(nil)).Elem(), MysqlDatabaseMap{})
	pulumi.RegisterOutputType(MysqlDatabaseOutput{})
	pulumi.RegisterOutputType(MysqlDatabaseArrayOutput{})
	pulumi.RegisterOutputType(MysqlDatabaseMapOutput{})
}
