// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package aiven

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// The PG Database resource allows the creation and management of Aiven PostgreSQL Databases.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aiven/sdk/v5/go/aiven"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := aiven.NewPgDatabase(ctx, "mydatabase", &aiven.PgDatabaseArgs{
//				Project:      pulumi.Any(aiven_project.Myproject.Project),
//				ServiceName:  pulumi.Any(aiven_pg.Mypg.Service_name),
//				DatabaseName: pulumi.String("<DATABASE_NAME>"),
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
//
//	$ pulumi import aiven:index/pgDatabase:PgDatabase mydatabase project/service_name/database_name
//
// ```
type PgDatabase struct {
	pulumi.CustomResourceState

	// The name of the service database. This property cannot be changed, doing so forces recreation of the resource.
	DatabaseName pulumi.StringOutput `pulumi:"databaseName"`
	// Default string sort order (`LC_COLLATE`) of the database. The default value is `en_US.UTF-8`. This property cannot be changed, doing so forces recreation of the resource.
	LcCollate pulumi.StringPtrOutput `pulumi:"lcCollate"`
	// Default character classification (`LC_CTYPE`) of the database. The default value is `en_US.UTF-8`. This property cannot be changed, doing so forces recreation of the resource.
	LcCtype pulumi.StringPtrOutput `pulumi:"lcCtype"`
	// Identifies the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. This property cannot be changed, doing so forces recreation of the resource.
	Project pulumi.StringOutput `pulumi:"project"`
	// Specifies the name of the service that this resource belongs to. To set up proper dependencies please refer to this variable as a reference. This property cannot be changed, doing so forces recreation of the resource.
	ServiceName pulumi.StringOutput `pulumi:"serviceName"`
	// It is a Terraform client-side deletion protections, which prevents the database from being deleted by Terraform. It is
	// recommended to enable this for any production databases containing critical data. The default value is `false`.
	TerminationProtection pulumi.BoolPtrOutput `pulumi:"terminationProtection"`
}

// NewPgDatabase registers a new resource with the given unique name, arguments, and options.
func NewPgDatabase(ctx *pulumi.Context,
	name string, args *PgDatabaseArgs, opts ...pulumi.ResourceOption) (*PgDatabase, error) {
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
	var resource PgDatabase
	err := ctx.RegisterResource("aiven:index/pgDatabase:PgDatabase", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetPgDatabase gets an existing PgDatabase resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetPgDatabase(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *PgDatabaseState, opts ...pulumi.ResourceOption) (*PgDatabase, error) {
	var resource PgDatabase
	err := ctx.ReadResource("aiven:index/pgDatabase:PgDatabase", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering PgDatabase resources.
type pgDatabaseState struct {
	// The name of the service database. This property cannot be changed, doing so forces recreation of the resource.
	DatabaseName *string `pulumi:"databaseName"`
	// Default string sort order (`LC_COLLATE`) of the database. The default value is `en_US.UTF-8`. This property cannot be changed, doing so forces recreation of the resource.
	LcCollate *string `pulumi:"lcCollate"`
	// Default character classification (`LC_CTYPE`) of the database. The default value is `en_US.UTF-8`. This property cannot be changed, doing so forces recreation of the resource.
	LcCtype *string `pulumi:"lcCtype"`
	// Identifies the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. This property cannot be changed, doing so forces recreation of the resource.
	Project *string `pulumi:"project"`
	// Specifies the name of the service that this resource belongs to. To set up proper dependencies please refer to this variable as a reference. This property cannot be changed, doing so forces recreation of the resource.
	ServiceName *string `pulumi:"serviceName"`
	// It is a Terraform client-side deletion protections, which prevents the database from being deleted by Terraform. It is
	// recommended to enable this for any production databases containing critical data. The default value is `false`.
	TerminationProtection *bool `pulumi:"terminationProtection"`
}

type PgDatabaseState struct {
	// The name of the service database. This property cannot be changed, doing so forces recreation of the resource.
	DatabaseName pulumi.StringPtrInput
	// Default string sort order (`LC_COLLATE`) of the database. The default value is `en_US.UTF-8`. This property cannot be changed, doing so forces recreation of the resource.
	LcCollate pulumi.StringPtrInput
	// Default character classification (`LC_CTYPE`) of the database. The default value is `en_US.UTF-8`. This property cannot be changed, doing so forces recreation of the resource.
	LcCtype pulumi.StringPtrInput
	// Identifies the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. This property cannot be changed, doing so forces recreation of the resource.
	Project pulumi.StringPtrInput
	// Specifies the name of the service that this resource belongs to. To set up proper dependencies please refer to this variable as a reference. This property cannot be changed, doing so forces recreation of the resource.
	ServiceName pulumi.StringPtrInput
	// It is a Terraform client-side deletion protections, which prevents the database from being deleted by Terraform. It is
	// recommended to enable this for any production databases containing critical data. The default value is `false`.
	TerminationProtection pulumi.BoolPtrInput
}

func (PgDatabaseState) ElementType() reflect.Type {
	return reflect.TypeOf((*pgDatabaseState)(nil)).Elem()
}

type pgDatabaseArgs struct {
	// The name of the service database. This property cannot be changed, doing so forces recreation of the resource.
	DatabaseName string `pulumi:"databaseName"`
	// Default string sort order (`LC_COLLATE`) of the database. The default value is `en_US.UTF-8`. This property cannot be changed, doing so forces recreation of the resource.
	LcCollate *string `pulumi:"lcCollate"`
	// Default character classification (`LC_CTYPE`) of the database. The default value is `en_US.UTF-8`. This property cannot be changed, doing so forces recreation of the resource.
	LcCtype *string `pulumi:"lcCtype"`
	// Identifies the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. This property cannot be changed, doing so forces recreation of the resource.
	Project string `pulumi:"project"`
	// Specifies the name of the service that this resource belongs to. To set up proper dependencies please refer to this variable as a reference. This property cannot be changed, doing so forces recreation of the resource.
	ServiceName string `pulumi:"serviceName"`
	// It is a Terraform client-side deletion protections, which prevents the database from being deleted by Terraform. It is
	// recommended to enable this for any production databases containing critical data. The default value is `false`.
	TerminationProtection *bool `pulumi:"terminationProtection"`
}

// The set of arguments for constructing a PgDatabase resource.
type PgDatabaseArgs struct {
	// The name of the service database. This property cannot be changed, doing so forces recreation of the resource.
	DatabaseName pulumi.StringInput
	// Default string sort order (`LC_COLLATE`) of the database. The default value is `en_US.UTF-8`. This property cannot be changed, doing so forces recreation of the resource.
	LcCollate pulumi.StringPtrInput
	// Default character classification (`LC_CTYPE`) of the database. The default value is `en_US.UTF-8`. This property cannot be changed, doing so forces recreation of the resource.
	LcCtype pulumi.StringPtrInput
	// Identifies the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. This property cannot be changed, doing so forces recreation of the resource.
	Project pulumi.StringInput
	// Specifies the name of the service that this resource belongs to. To set up proper dependencies please refer to this variable as a reference. This property cannot be changed, doing so forces recreation of the resource.
	ServiceName pulumi.StringInput
	// It is a Terraform client-side deletion protections, which prevents the database from being deleted by Terraform. It is
	// recommended to enable this for any production databases containing critical data. The default value is `false`.
	TerminationProtection pulumi.BoolPtrInput
}

func (PgDatabaseArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*pgDatabaseArgs)(nil)).Elem()
}

type PgDatabaseInput interface {
	pulumi.Input

	ToPgDatabaseOutput() PgDatabaseOutput
	ToPgDatabaseOutputWithContext(ctx context.Context) PgDatabaseOutput
}

func (*PgDatabase) ElementType() reflect.Type {
	return reflect.TypeOf((**PgDatabase)(nil)).Elem()
}

func (i *PgDatabase) ToPgDatabaseOutput() PgDatabaseOutput {
	return i.ToPgDatabaseOutputWithContext(context.Background())
}

func (i *PgDatabase) ToPgDatabaseOutputWithContext(ctx context.Context) PgDatabaseOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PgDatabaseOutput)
}

// PgDatabaseArrayInput is an input type that accepts PgDatabaseArray and PgDatabaseArrayOutput values.
// You can construct a concrete instance of `PgDatabaseArrayInput` via:
//
//	PgDatabaseArray{ PgDatabaseArgs{...} }
type PgDatabaseArrayInput interface {
	pulumi.Input

	ToPgDatabaseArrayOutput() PgDatabaseArrayOutput
	ToPgDatabaseArrayOutputWithContext(context.Context) PgDatabaseArrayOutput
}

type PgDatabaseArray []PgDatabaseInput

func (PgDatabaseArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*PgDatabase)(nil)).Elem()
}

func (i PgDatabaseArray) ToPgDatabaseArrayOutput() PgDatabaseArrayOutput {
	return i.ToPgDatabaseArrayOutputWithContext(context.Background())
}

func (i PgDatabaseArray) ToPgDatabaseArrayOutputWithContext(ctx context.Context) PgDatabaseArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PgDatabaseArrayOutput)
}

// PgDatabaseMapInput is an input type that accepts PgDatabaseMap and PgDatabaseMapOutput values.
// You can construct a concrete instance of `PgDatabaseMapInput` via:
//
//	PgDatabaseMap{ "key": PgDatabaseArgs{...} }
type PgDatabaseMapInput interface {
	pulumi.Input

	ToPgDatabaseMapOutput() PgDatabaseMapOutput
	ToPgDatabaseMapOutputWithContext(context.Context) PgDatabaseMapOutput
}

type PgDatabaseMap map[string]PgDatabaseInput

func (PgDatabaseMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*PgDatabase)(nil)).Elem()
}

func (i PgDatabaseMap) ToPgDatabaseMapOutput() PgDatabaseMapOutput {
	return i.ToPgDatabaseMapOutputWithContext(context.Background())
}

func (i PgDatabaseMap) ToPgDatabaseMapOutputWithContext(ctx context.Context) PgDatabaseMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PgDatabaseMapOutput)
}

type PgDatabaseOutput struct{ *pulumi.OutputState }

func (PgDatabaseOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**PgDatabase)(nil)).Elem()
}

func (o PgDatabaseOutput) ToPgDatabaseOutput() PgDatabaseOutput {
	return o
}

func (o PgDatabaseOutput) ToPgDatabaseOutputWithContext(ctx context.Context) PgDatabaseOutput {
	return o
}

// The name of the service database. This property cannot be changed, doing so forces recreation of the resource.
func (o PgDatabaseOutput) DatabaseName() pulumi.StringOutput {
	return o.ApplyT(func(v *PgDatabase) pulumi.StringOutput { return v.DatabaseName }).(pulumi.StringOutput)
}

// Default string sort order (`LC_COLLATE`) of the database. The default value is `en_US.UTF-8`. This property cannot be changed, doing so forces recreation of the resource.
func (o PgDatabaseOutput) LcCollate() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *PgDatabase) pulumi.StringPtrOutput { return v.LcCollate }).(pulumi.StringPtrOutput)
}

// Default character classification (`LC_CTYPE`) of the database. The default value is `en_US.UTF-8`. This property cannot be changed, doing so forces recreation of the resource.
func (o PgDatabaseOutput) LcCtype() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *PgDatabase) pulumi.StringPtrOutput { return v.LcCtype }).(pulumi.StringPtrOutput)
}

// Identifies the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. This property cannot be changed, doing so forces recreation of the resource.
func (o PgDatabaseOutput) Project() pulumi.StringOutput {
	return o.ApplyT(func(v *PgDatabase) pulumi.StringOutput { return v.Project }).(pulumi.StringOutput)
}

// Specifies the name of the service that this resource belongs to. To set up proper dependencies please refer to this variable as a reference. This property cannot be changed, doing so forces recreation of the resource.
func (o PgDatabaseOutput) ServiceName() pulumi.StringOutput {
	return o.ApplyT(func(v *PgDatabase) pulumi.StringOutput { return v.ServiceName }).(pulumi.StringOutput)
}

// It is a Terraform client-side deletion protections, which prevents the database from being deleted by Terraform. It is
// recommended to enable this for any production databases containing critical data. The default value is `false`.
func (o PgDatabaseOutput) TerminationProtection() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *PgDatabase) pulumi.BoolPtrOutput { return v.TerminationProtection }).(pulumi.BoolPtrOutput)
}

type PgDatabaseArrayOutput struct{ *pulumi.OutputState }

func (PgDatabaseArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*PgDatabase)(nil)).Elem()
}

func (o PgDatabaseArrayOutput) ToPgDatabaseArrayOutput() PgDatabaseArrayOutput {
	return o
}

func (o PgDatabaseArrayOutput) ToPgDatabaseArrayOutputWithContext(ctx context.Context) PgDatabaseArrayOutput {
	return o
}

func (o PgDatabaseArrayOutput) Index(i pulumi.IntInput) PgDatabaseOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *PgDatabase {
		return vs[0].([]*PgDatabase)[vs[1].(int)]
	}).(PgDatabaseOutput)
}

type PgDatabaseMapOutput struct{ *pulumi.OutputState }

func (PgDatabaseMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*PgDatabase)(nil)).Elem()
}

func (o PgDatabaseMapOutput) ToPgDatabaseMapOutput() PgDatabaseMapOutput {
	return o
}

func (o PgDatabaseMapOutput) ToPgDatabaseMapOutputWithContext(ctx context.Context) PgDatabaseMapOutput {
	return o
}

func (o PgDatabaseMapOutput) MapIndex(k pulumi.StringInput) PgDatabaseOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *PgDatabase {
		return vs[0].(map[string]*PgDatabase)[vs[1].(string)]
	}).(PgDatabaseOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*PgDatabaseInput)(nil)).Elem(), &PgDatabase{})
	pulumi.RegisterInputType(reflect.TypeOf((*PgDatabaseArrayInput)(nil)).Elem(), PgDatabaseArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*PgDatabaseMapInput)(nil)).Elem(), PgDatabaseMap{})
	pulumi.RegisterOutputType(PgDatabaseOutput{})
	pulumi.RegisterOutputType(PgDatabaseArrayOutput{})
	pulumi.RegisterOutputType(PgDatabaseMapOutput{})
}