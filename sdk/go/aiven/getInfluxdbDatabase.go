// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package aiven

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// The InfluxDB Database data source provides information about the existing Aiven InfluxDB Database.
func LookupInfluxdbDatabase(ctx *pulumi.Context, args *LookupInfluxdbDatabaseArgs, opts ...pulumi.InvokeOption) (*LookupInfluxdbDatabaseResult, error) {
	var rv LookupInfluxdbDatabaseResult
	err := ctx.Invoke("aiven:index/getInfluxdbDatabase:getInfluxdbDatabase", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getInfluxdbDatabase.
type LookupInfluxdbDatabaseArgs struct {
	// The name of the service database. This property cannot be changed, doing so forces recreation of the resource.
	DatabaseName string `pulumi:"databaseName"`
	// Identifies the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. This property cannot be changed, doing so forces recreation of the resource.
	Project string `pulumi:"project"`
	// Specifies the name of the service that this resource belongs to. To set up proper dependencies please refer to this variable as a reference. This property cannot be changed, doing so forces recreation of the resource.
	ServiceName string `pulumi:"serviceName"`
}

// A collection of values returned by getInfluxdbDatabase.
type LookupInfluxdbDatabaseResult struct {
	// The name of the service database. This property cannot be changed, doing so forces recreation of the resource.
	DatabaseName string `pulumi:"databaseName"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// Identifies the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. This property cannot be changed, doing so forces recreation of the resource.
	Project string `pulumi:"project"`
	// Specifies the name of the service that this resource belongs to. To set up proper dependencies please refer to this variable as a reference. This property cannot be changed, doing so forces recreation of the resource.
	ServiceName           string `pulumi:"serviceName"`
	TerminationProtection bool   `pulumi:"terminationProtection"`
}

func LookupInfluxdbDatabaseOutput(ctx *pulumi.Context, args LookupInfluxdbDatabaseOutputArgs, opts ...pulumi.InvokeOption) LookupInfluxdbDatabaseResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupInfluxdbDatabaseResult, error) {
			args := v.(LookupInfluxdbDatabaseArgs)
			r, err := LookupInfluxdbDatabase(ctx, &args, opts...)
			var s LookupInfluxdbDatabaseResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupInfluxdbDatabaseResultOutput)
}

// A collection of arguments for invoking getInfluxdbDatabase.
type LookupInfluxdbDatabaseOutputArgs struct {
	// The name of the service database. This property cannot be changed, doing so forces recreation of the resource.
	DatabaseName pulumi.StringInput `pulumi:"databaseName"`
	// Identifies the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. This property cannot be changed, doing so forces recreation of the resource.
	Project pulumi.StringInput `pulumi:"project"`
	// Specifies the name of the service that this resource belongs to. To set up proper dependencies please refer to this variable as a reference. This property cannot be changed, doing so forces recreation of the resource.
	ServiceName pulumi.StringInput `pulumi:"serviceName"`
}

func (LookupInfluxdbDatabaseOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupInfluxdbDatabaseArgs)(nil)).Elem()
}

// A collection of values returned by getInfluxdbDatabase.
type LookupInfluxdbDatabaseResultOutput struct{ *pulumi.OutputState }

func (LookupInfluxdbDatabaseResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupInfluxdbDatabaseResult)(nil)).Elem()
}

func (o LookupInfluxdbDatabaseResultOutput) ToLookupInfluxdbDatabaseResultOutput() LookupInfluxdbDatabaseResultOutput {
	return o
}

func (o LookupInfluxdbDatabaseResultOutput) ToLookupInfluxdbDatabaseResultOutputWithContext(ctx context.Context) LookupInfluxdbDatabaseResultOutput {
	return o
}

// The name of the service database. This property cannot be changed, doing so forces recreation of the resource.
func (o LookupInfluxdbDatabaseResultOutput) DatabaseName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupInfluxdbDatabaseResult) string { return v.DatabaseName }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupInfluxdbDatabaseResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupInfluxdbDatabaseResult) string { return v.Id }).(pulumi.StringOutput)
}

// Identifies the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. This property cannot be changed, doing so forces recreation of the resource.
func (o LookupInfluxdbDatabaseResultOutput) Project() pulumi.StringOutput {
	return o.ApplyT(func(v LookupInfluxdbDatabaseResult) string { return v.Project }).(pulumi.StringOutput)
}

// Specifies the name of the service that this resource belongs to. To set up proper dependencies please refer to this variable as a reference. This property cannot be changed, doing so forces recreation of the resource.
func (o LookupInfluxdbDatabaseResultOutput) ServiceName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupInfluxdbDatabaseResult) string { return v.ServiceName }).(pulumi.StringOutput)
}

func (o LookupInfluxdbDatabaseResultOutput) TerminationProtection() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupInfluxdbDatabaseResult) bool { return v.TerminationProtection }).(pulumi.BoolOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupInfluxdbDatabaseResultOutput{})
}