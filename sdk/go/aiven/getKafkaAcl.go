// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package aiven

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-aiven/sdk/v6/go/aiven/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Gets information about an ACL entry for an Aiven for Apache Kafka® service.
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
//			_, err := aiven.LookupKafkaAcl(ctx, &aiven.LookupKafkaAclArgs{
//				Project:     exampleProject.Project,
//				ServiceName: exampleKafka.ServiceName,
//				Topic:       "example-topic",
//				Permission:  "admin",
//				Username:    "example-user",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupKafkaAcl(ctx *pulumi.Context, args *LookupKafkaAclArgs, opts ...pulumi.InvokeOption) (*LookupKafkaAclResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupKafkaAclResult
	err := ctx.Invoke("aiven:index/getKafkaAcl:getKafkaAcl", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getKafkaAcl.
type LookupKafkaAclArgs struct {
	// Permissions to grant. The possible values are `admin`, `read`, `readwrite` and `write`. Changing this property forces recreation of the resource.
	Permission string `pulumi:"permission"`
	// The name of the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
	Project string `pulumi:"project"`
	// The name of the service that this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
	ServiceName string `pulumi:"serviceName"`
	// Topics that the permissions apply to. Changing this property forces recreation of the resource.
	Topic string `pulumi:"topic"`
	// Usernames to grant permissions to. Changing this property forces recreation of the resource.
	Username string `pulumi:"username"`
}

// A collection of values returned by getKafkaAcl.
type LookupKafkaAclResult struct {
	// Kafka ACL ID.
	AclId string `pulumi:"aclId"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// Permissions to grant. The possible values are `admin`, `read`, `readwrite` and `write`. Changing this property forces recreation of the resource.
	Permission string `pulumi:"permission"`
	// The name of the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
	Project string `pulumi:"project"`
	// The name of the service that this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
	ServiceName string `pulumi:"serviceName"`
	// Topics that the permissions apply to. Changing this property forces recreation of the resource.
	Topic string `pulumi:"topic"`
	// Usernames to grant permissions to. Changing this property forces recreation of the resource.
	Username string `pulumi:"username"`
}

func LookupKafkaAclOutput(ctx *pulumi.Context, args LookupKafkaAclOutputArgs, opts ...pulumi.InvokeOption) LookupKafkaAclResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupKafkaAclResultOutput, error) {
			args := v.(LookupKafkaAclArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("aiven:index/getKafkaAcl:getKafkaAcl", args, LookupKafkaAclResultOutput{}, options).(LookupKafkaAclResultOutput), nil
		}).(LookupKafkaAclResultOutput)
}

// A collection of arguments for invoking getKafkaAcl.
type LookupKafkaAclOutputArgs struct {
	// Permissions to grant. The possible values are `admin`, `read`, `readwrite` and `write`. Changing this property forces recreation of the resource.
	Permission pulumi.StringInput `pulumi:"permission"`
	// The name of the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
	Project pulumi.StringInput `pulumi:"project"`
	// The name of the service that this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
	ServiceName pulumi.StringInput `pulumi:"serviceName"`
	// Topics that the permissions apply to. Changing this property forces recreation of the resource.
	Topic pulumi.StringInput `pulumi:"topic"`
	// Usernames to grant permissions to. Changing this property forces recreation of the resource.
	Username pulumi.StringInput `pulumi:"username"`
}

func (LookupKafkaAclOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupKafkaAclArgs)(nil)).Elem()
}

// A collection of values returned by getKafkaAcl.
type LookupKafkaAclResultOutput struct{ *pulumi.OutputState }

func (LookupKafkaAclResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupKafkaAclResult)(nil)).Elem()
}

func (o LookupKafkaAclResultOutput) ToLookupKafkaAclResultOutput() LookupKafkaAclResultOutput {
	return o
}

func (o LookupKafkaAclResultOutput) ToLookupKafkaAclResultOutputWithContext(ctx context.Context) LookupKafkaAclResultOutput {
	return o
}

// Kafka ACL ID.
func (o LookupKafkaAclResultOutput) AclId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupKafkaAclResult) string { return v.AclId }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupKafkaAclResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupKafkaAclResult) string { return v.Id }).(pulumi.StringOutput)
}

// Permissions to grant. The possible values are `admin`, `read`, `readwrite` and `write`. Changing this property forces recreation of the resource.
func (o LookupKafkaAclResultOutput) Permission() pulumi.StringOutput {
	return o.ApplyT(func(v LookupKafkaAclResult) string { return v.Permission }).(pulumi.StringOutput)
}

// The name of the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
func (o LookupKafkaAclResultOutput) Project() pulumi.StringOutput {
	return o.ApplyT(func(v LookupKafkaAclResult) string { return v.Project }).(pulumi.StringOutput)
}

// The name of the service that this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
func (o LookupKafkaAclResultOutput) ServiceName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupKafkaAclResult) string { return v.ServiceName }).(pulumi.StringOutput)
}

// Topics that the permissions apply to. Changing this property forces recreation of the resource.
func (o LookupKafkaAclResultOutput) Topic() pulumi.StringOutput {
	return o.ApplyT(func(v LookupKafkaAclResult) string { return v.Topic }).(pulumi.StringOutput)
}

// Usernames to grant permissions to. Changing this property forces recreation of the resource.
func (o LookupKafkaAclResultOutput) Username() pulumi.StringOutput {
	return o.ApplyT(func(v LookupKafkaAclResult) string { return v.Username }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupKafkaAclResultOutput{})
}
