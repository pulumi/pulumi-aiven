// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package aiven

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-aiven/sdk/v6/go/aiven/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// The PG User data source provides information about the existing Aiven PG User.
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
//			_, err := aiven.LookupPgUser(ctx, &aiven.LookupPgUserArgs{
//				ServiceName: "my-service",
//				Project:     "my-project",
//				Username:    "user1",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupPgUser(ctx *pulumi.Context, args *LookupPgUserArgs, opts ...pulumi.InvokeOption) (*LookupPgUserResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupPgUserResult
	err := ctx.Invoke("aiven:index/getPgUser:getPgUser", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getPgUser.
type LookupPgUserArgs struct {
	// The name of the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
	Project string `pulumi:"project"`
	// The name of the service that this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
	ServiceName string `pulumi:"serviceName"`
	// The actual name of the PG User. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
	Username string `pulumi:"username"`
}

// A collection of values returned by getPgUser.
type LookupPgUserResult struct {
	// Access certificate for the user
	AccessCert string `pulumi:"accessCert"`
	// Access certificate key for the user
	AccessKey string `pulumi:"accessKey"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// The password of the PG User (not applicable for all services).
	Password string `pulumi:"password"`
	// Defines whether replication is allowed.
	PgAllowReplication bool `pulumi:"pgAllowReplication"`
	// The name of the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
	Project string `pulumi:"project"`
	// The name of the service that this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
	ServiceName string `pulumi:"serviceName"`
	// Type of the user account. Tells whether the user is the primary account or a regular account.
	Type string `pulumi:"type"`
	// The actual name of the PG User. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
	Username string `pulumi:"username"`
}

func LookupPgUserOutput(ctx *pulumi.Context, args LookupPgUserOutputArgs, opts ...pulumi.InvokeOption) LookupPgUserResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupPgUserResult, error) {
			args := v.(LookupPgUserArgs)
			r, err := LookupPgUser(ctx, &args, opts...)
			var s LookupPgUserResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupPgUserResultOutput)
}

// A collection of arguments for invoking getPgUser.
type LookupPgUserOutputArgs struct {
	// The name of the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
	Project pulumi.StringInput `pulumi:"project"`
	// The name of the service that this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
	ServiceName pulumi.StringInput `pulumi:"serviceName"`
	// The actual name of the PG User. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
	Username pulumi.StringInput `pulumi:"username"`
}

func (LookupPgUserOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupPgUserArgs)(nil)).Elem()
}

// A collection of values returned by getPgUser.
type LookupPgUserResultOutput struct{ *pulumi.OutputState }

func (LookupPgUserResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupPgUserResult)(nil)).Elem()
}

func (o LookupPgUserResultOutput) ToLookupPgUserResultOutput() LookupPgUserResultOutput {
	return o
}

func (o LookupPgUserResultOutput) ToLookupPgUserResultOutputWithContext(ctx context.Context) LookupPgUserResultOutput {
	return o
}

// Access certificate for the user
func (o LookupPgUserResultOutput) AccessCert() pulumi.StringOutput {
	return o.ApplyT(func(v LookupPgUserResult) string { return v.AccessCert }).(pulumi.StringOutput)
}

// Access certificate key for the user
func (o LookupPgUserResultOutput) AccessKey() pulumi.StringOutput {
	return o.ApplyT(func(v LookupPgUserResult) string { return v.AccessKey }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupPgUserResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupPgUserResult) string { return v.Id }).(pulumi.StringOutput)
}

// The password of the PG User (not applicable for all services).
func (o LookupPgUserResultOutput) Password() pulumi.StringOutput {
	return o.ApplyT(func(v LookupPgUserResult) string { return v.Password }).(pulumi.StringOutput)
}

// Defines whether replication is allowed.
func (o LookupPgUserResultOutput) PgAllowReplication() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupPgUserResult) bool { return v.PgAllowReplication }).(pulumi.BoolOutput)
}

// The name of the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
func (o LookupPgUserResultOutput) Project() pulumi.StringOutput {
	return o.ApplyT(func(v LookupPgUserResult) string { return v.Project }).(pulumi.StringOutput)
}

// The name of the service that this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
func (o LookupPgUserResultOutput) ServiceName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupPgUserResult) string { return v.ServiceName }).(pulumi.StringOutput)
}

// Type of the user account. Tells whether the user is the primary account or a regular account.
func (o LookupPgUserResultOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v LookupPgUserResult) string { return v.Type }).(pulumi.StringOutput)
}

// The actual name of the PG User. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
func (o LookupPgUserResultOutput) Username() pulumi.StringOutput {
	return o.ApplyT(func(v LookupPgUserResult) string { return v.Username }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupPgUserResultOutput{})
}
