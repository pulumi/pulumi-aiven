// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package aiven

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// The InfluxDB User data source provides information about the existing Aiven InfluxDB User.
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
//			_, err := aiven.LookupInfluxdbUser(ctx, &aiven.LookupInfluxdbUserArgs{
//				Project:     "my-project",
//				ServiceName: "my-service",
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
func LookupInfluxdbUser(ctx *pulumi.Context, args *LookupInfluxdbUserArgs, opts ...pulumi.InvokeOption) (*LookupInfluxdbUserResult, error) {
	var rv LookupInfluxdbUserResult
	err := ctx.Invoke("aiven:index/getInfluxdbUser:getInfluxdbUser", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getInfluxdbUser.
type LookupInfluxdbUserArgs struct {
	// Identifies the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. This property cannot be changed, doing so forces recreation of the resource.
	Project string `pulumi:"project"`
	// Specifies the name of the service that this resource belongs to. To set up proper dependencies please refer to this variable as a reference. This property cannot be changed, doing so forces recreation of the resource.
	ServiceName string `pulumi:"serviceName"`
	// The actual name of the InfluxDB User. To set up proper dependencies please refer to this variable as a reference. This property cannot be changed, doing so forces recreation of the resource.
	Username string `pulumi:"username"`
}

// A collection of values returned by getInfluxdbUser.
type LookupInfluxdbUserResult struct {
	// Access certificate for the user if applicable for the service in question
	AccessCert string `pulumi:"accessCert"`
	// Access certificate key for the user if applicable for the service in question
	AccessKey string `pulumi:"accessKey"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// The password of the InfluxDB User.
	Password string `pulumi:"password"`
	// Identifies the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. This property cannot be changed, doing so forces recreation of the resource.
	Project string `pulumi:"project"`
	// Specifies the name of the service that this resource belongs to. To set up proper dependencies please refer to this variable as a reference. This property cannot be changed, doing so forces recreation of the resource.
	ServiceName string `pulumi:"serviceName"`
	// Type of the user account. Tells whether the user is the primary account or a regular account.
	Type string `pulumi:"type"`
	// The actual name of the InfluxDB User. To set up proper dependencies please refer to this variable as a reference. This property cannot be changed, doing so forces recreation of the resource.
	Username string `pulumi:"username"`
}

func LookupInfluxdbUserOutput(ctx *pulumi.Context, args LookupInfluxdbUserOutputArgs, opts ...pulumi.InvokeOption) LookupInfluxdbUserResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupInfluxdbUserResult, error) {
			args := v.(LookupInfluxdbUserArgs)
			r, err := LookupInfluxdbUser(ctx, &args, opts...)
			var s LookupInfluxdbUserResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupInfluxdbUserResultOutput)
}

// A collection of arguments for invoking getInfluxdbUser.
type LookupInfluxdbUserOutputArgs struct {
	// Identifies the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. This property cannot be changed, doing so forces recreation of the resource.
	Project pulumi.StringInput `pulumi:"project"`
	// Specifies the name of the service that this resource belongs to. To set up proper dependencies please refer to this variable as a reference. This property cannot be changed, doing so forces recreation of the resource.
	ServiceName pulumi.StringInput `pulumi:"serviceName"`
	// The actual name of the InfluxDB User. To set up proper dependencies please refer to this variable as a reference. This property cannot be changed, doing so forces recreation of the resource.
	Username pulumi.StringInput `pulumi:"username"`
}

func (LookupInfluxdbUserOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupInfluxdbUserArgs)(nil)).Elem()
}

// A collection of values returned by getInfluxdbUser.
type LookupInfluxdbUserResultOutput struct{ *pulumi.OutputState }

func (LookupInfluxdbUserResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupInfluxdbUserResult)(nil)).Elem()
}

func (o LookupInfluxdbUserResultOutput) ToLookupInfluxdbUserResultOutput() LookupInfluxdbUserResultOutput {
	return o
}

func (o LookupInfluxdbUserResultOutput) ToLookupInfluxdbUserResultOutputWithContext(ctx context.Context) LookupInfluxdbUserResultOutput {
	return o
}

// Access certificate for the user if applicable for the service in question
func (o LookupInfluxdbUserResultOutput) AccessCert() pulumi.StringOutput {
	return o.ApplyT(func(v LookupInfluxdbUserResult) string { return v.AccessCert }).(pulumi.StringOutput)
}

// Access certificate key for the user if applicable for the service in question
func (o LookupInfluxdbUserResultOutput) AccessKey() pulumi.StringOutput {
	return o.ApplyT(func(v LookupInfluxdbUserResult) string { return v.AccessKey }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupInfluxdbUserResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupInfluxdbUserResult) string { return v.Id }).(pulumi.StringOutput)
}

// The password of the InfluxDB User.
func (o LookupInfluxdbUserResultOutput) Password() pulumi.StringOutput {
	return o.ApplyT(func(v LookupInfluxdbUserResult) string { return v.Password }).(pulumi.StringOutput)
}

// Identifies the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. This property cannot be changed, doing so forces recreation of the resource.
func (o LookupInfluxdbUserResultOutput) Project() pulumi.StringOutput {
	return o.ApplyT(func(v LookupInfluxdbUserResult) string { return v.Project }).(pulumi.StringOutput)
}

// Specifies the name of the service that this resource belongs to. To set up proper dependencies please refer to this variable as a reference. This property cannot be changed, doing so forces recreation of the resource.
func (o LookupInfluxdbUserResultOutput) ServiceName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupInfluxdbUserResult) string { return v.ServiceName }).(pulumi.StringOutput)
}

// Type of the user account. Tells whether the user is the primary account or a regular account.
func (o LookupInfluxdbUserResultOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v LookupInfluxdbUserResult) string { return v.Type }).(pulumi.StringOutput)
}

// The actual name of the InfluxDB User. To set up proper dependencies please refer to this variable as a reference. This property cannot be changed, doing so forces recreation of the resource.
func (o LookupInfluxdbUserResultOutput) Username() pulumi.StringOutput {
	return o.ApplyT(func(v LookupInfluxdbUserResult) string { return v.Username }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupInfluxdbUserResultOutput{})
}