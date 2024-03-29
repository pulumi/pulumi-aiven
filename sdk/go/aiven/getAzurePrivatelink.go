// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package aiven

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-aiven/sdk/v6/go/aiven/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Gets information about an Azure Private Link connection for an Aiven service.
//
// ## Example Usage
//
// <!--Start PulumiCodeChooser -->
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
//			_, err := aiven.LookupAzurePrivatelink(ctx, &aiven.LookupAzurePrivatelinkArgs{
//				Project:     data.Aiven_project.Example_project.Project,
//				ServiceName: aiven_kafka.Example_kafka.Service_name,
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// <!--End PulumiCodeChooser -->
func LookupAzurePrivatelink(ctx *pulumi.Context, args *LookupAzurePrivatelinkArgs, opts ...pulumi.InvokeOption) (*LookupAzurePrivatelinkResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupAzurePrivatelinkResult
	err := ctx.Invoke("aiven:index/getAzurePrivatelink:getAzurePrivatelink", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getAzurePrivatelink.
type LookupAzurePrivatelinkArgs struct {
	// Identifies the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
	Project string `pulumi:"project"`
	// Specifies the name of the service that this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
	ServiceName string `pulumi:"serviceName"`
}

// A collection of values returned by getAzurePrivatelink.
type LookupAzurePrivatelinkResult struct {
	// The Azure Private Link service alias.
	AzureServiceAlias string `pulumi:"azureServiceAlias"`
	// The Azure Private Link service ID.
	AzureServiceId string `pulumi:"azureServiceId"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// Printable result of the Azure Private Link request.
	Message string `pulumi:"message"`
	// Identifies the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
	Project string `pulumi:"project"`
	// Specifies the name of the service that this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
	ServiceName string `pulumi:"serviceName"`
	// The state of the Private Link resource.
	State string `pulumi:"state"`
	// A list of allowed subscription IDs. Maximum length: `16`.
	UserSubscriptionIds []string `pulumi:"userSubscriptionIds"`
}

func LookupAzurePrivatelinkOutput(ctx *pulumi.Context, args LookupAzurePrivatelinkOutputArgs, opts ...pulumi.InvokeOption) LookupAzurePrivatelinkResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupAzurePrivatelinkResult, error) {
			args := v.(LookupAzurePrivatelinkArgs)
			r, err := LookupAzurePrivatelink(ctx, &args, opts...)
			var s LookupAzurePrivatelinkResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupAzurePrivatelinkResultOutput)
}

// A collection of arguments for invoking getAzurePrivatelink.
type LookupAzurePrivatelinkOutputArgs struct {
	// Identifies the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
	Project pulumi.StringInput `pulumi:"project"`
	// Specifies the name of the service that this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
	ServiceName pulumi.StringInput `pulumi:"serviceName"`
}

func (LookupAzurePrivatelinkOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupAzurePrivatelinkArgs)(nil)).Elem()
}

// A collection of values returned by getAzurePrivatelink.
type LookupAzurePrivatelinkResultOutput struct{ *pulumi.OutputState }

func (LookupAzurePrivatelinkResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupAzurePrivatelinkResult)(nil)).Elem()
}

func (o LookupAzurePrivatelinkResultOutput) ToLookupAzurePrivatelinkResultOutput() LookupAzurePrivatelinkResultOutput {
	return o
}

func (o LookupAzurePrivatelinkResultOutput) ToLookupAzurePrivatelinkResultOutputWithContext(ctx context.Context) LookupAzurePrivatelinkResultOutput {
	return o
}

// The Azure Private Link service alias.
func (o LookupAzurePrivatelinkResultOutput) AzureServiceAlias() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAzurePrivatelinkResult) string { return v.AzureServiceAlias }).(pulumi.StringOutput)
}

// The Azure Private Link service ID.
func (o LookupAzurePrivatelinkResultOutput) AzureServiceId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAzurePrivatelinkResult) string { return v.AzureServiceId }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupAzurePrivatelinkResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAzurePrivatelinkResult) string { return v.Id }).(pulumi.StringOutput)
}

// Printable result of the Azure Private Link request.
func (o LookupAzurePrivatelinkResultOutput) Message() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAzurePrivatelinkResult) string { return v.Message }).(pulumi.StringOutput)
}

// Identifies the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
func (o LookupAzurePrivatelinkResultOutput) Project() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAzurePrivatelinkResult) string { return v.Project }).(pulumi.StringOutput)
}

// Specifies the name of the service that this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
func (o LookupAzurePrivatelinkResultOutput) ServiceName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAzurePrivatelinkResult) string { return v.ServiceName }).(pulumi.StringOutput)
}

// The state of the Private Link resource.
func (o LookupAzurePrivatelinkResultOutput) State() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAzurePrivatelinkResult) string { return v.State }).(pulumi.StringOutput)
}

// A list of allowed subscription IDs. Maximum length: `16`.
func (o LookupAzurePrivatelinkResultOutput) UserSubscriptionIds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupAzurePrivatelinkResult) []string { return v.UserSubscriptionIds }).(pulumi.StringArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupAzurePrivatelinkResultOutput{})
}
