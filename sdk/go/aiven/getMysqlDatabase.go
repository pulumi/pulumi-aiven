// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package aiven

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-aiven/sdk/v6/go/aiven/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Gets information about an Aiven for MySQL® database.
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
//			_, err := aiven.LookupMysqlDatabase(ctx, &aiven.LookupMysqlDatabaseArgs{
//				Project:      exampleProject.Project,
//				ServiceName:  exampleMysql.ServiceName,
//				DatabaseName: "example-database",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupMysqlDatabase(ctx *pulumi.Context, args *LookupMysqlDatabaseArgs, opts ...pulumi.InvokeOption) (*LookupMysqlDatabaseResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupMysqlDatabaseResult
	err := ctx.Invoke("aiven:index/getMysqlDatabase:getMysqlDatabase", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getMysqlDatabase.
type LookupMysqlDatabaseArgs struct {
	// The name of the database. Changing this property forces recreation of the resource.
	DatabaseName string `pulumi:"databaseName"`
	// The name of the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
	Project string `pulumi:"project"`
	// The name of the service that this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
	ServiceName string `pulumi:"serviceName"`
}

// A collection of values returned by getMysqlDatabase.
type LookupMysqlDatabaseResult struct {
	// The name of the database. Changing this property forces recreation of the resource.
	DatabaseName string `pulumi:"databaseName"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// The name of the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
	Project string `pulumi:"project"`
	// The name of the service that this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
	ServiceName           string `pulumi:"serviceName"`
	TerminationProtection bool   `pulumi:"terminationProtection"`
}

func LookupMysqlDatabaseOutput(ctx *pulumi.Context, args LookupMysqlDatabaseOutputArgs, opts ...pulumi.InvokeOption) LookupMysqlDatabaseResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupMysqlDatabaseResultOutput, error) {
			args := v.(LookupMysqlDatabaseArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("aiven:index/getMysqlDatabase:getMysqlDatabase", args, LookupMysqlDatabaseResultOutput{}, options).(LookupMysqlDatabaseResultOutput), nil
		}).(LookupMysqlDatabaseResultOutput)
}

// A collection of arguments for invoking getMysqlDatabase.
type LookupMysqlDatabaseOutputArgs struct {
	// The name of the database. Changing this property forces recreation of the resource.
	DatabaseName pulumi.StringInput `pulumi:"databaseName"`
	// The name of the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
	Project pulumi.StringInput `pulumi:"project"`
	// The name of the service that this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
	ServiceName pulumi.StringInput `pulumi:"serviceName"`
}

func (LookupMysqlDatabaseOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupMysqlDatabaseArgs)(nil)).Elem()
}

// A collection of values returned by getMysqlDatabase.
type LookupMysqlDatabaseResultOutput struct{ *pulumi.OutputState }

func (LookupMysqlDatabaseResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupMysqlDatabaseResult)(nil)).Elem()
}

func (o LookupMysqlDatabaseResultOutput) ToLookupMysqlDatabaseResultOutput() LookupMysqlDatabaseResultOutput {
	return o
}

func (o LookupMysqlDatabaseResultOutput) ToLookupMysqlDatabaseResultOutputWithContext(ctx context.Context) LookupMysqlDatabaseResultOutput {
	return o
}

// The name of the database. Changing this property forces recreation of the resource.
func (o LookupMysqlDatabaseResultOutput) DatabaseName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupMysqlDatabaseResult) string { return v.DatabaseName }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupMysqlDatabaseResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupMysqlDatabaseResult) string { return v.Id }).(pulumi.StringOutput)
}

// The name of the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
func (o LookupMysqlDatabaseResultOutput) Project() pulumi.StringOutput {
	return o.ApplyT(func(v LookupMysqlDatabaseResult) string { return v.Project }).(pulumi.StringOutput)
}

// The name of the service that this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
func (o LookupMysqlDatabaseResultOutput) ServiceName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupMysqlDatabaseResult) string { return v.ServiceName }).(pulumi.StringOutput)
}

func (o LookupMysqlDatabaseResultOutput) TerminationProtection() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupMysqlDatabaseResult) bool { return v.TerminationProtection }).(pulumi.BoolOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupMysqlDatabaseResultOutput{})
}
