// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package aiven

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// The Azure Privatelink resource allows the creation and management of Aiven Azure Privatelink for a services.
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
// 		_, err := aiven.LookupAzurePrivatelink(ctx, &GetAzurePrivatelinkArgs{
// 			Project:     data.Aiven_project.Foo.Project,
// 			ServiceName: aiven_kafka.Bar.Service_name,
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
func LookupAzurePrivatelink(ctx *pulumi.Context, args *LookupAzurePrivatelinkArgs, opts ...pulumi.InvokeOption) (*LookupAzurePrivatelinkResult, error) {
	var rv LookupAzurePrivatelinkResult
	err := ctx.Invoke("aiven:index/getAzurePrivatelink:getAzurePrivatelink", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getAzurePrivatelink.
type LookupAzurePrivatelinkArgs struct {
	// Identifies the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. This property cannot be changed, doing so forces recreation of the resource.
	Project string `pulumi:"project"`
	// Specifies the name of the service that this resource belongs to. To set up proper dependencies please refer to this variable as a reference. This property cannot be changed, doing so forces recreation of the resource.
	ServiceName string `pulumi:"serviceName"`
}

// A collection of values returned by getAzurePrivatelink.
type LookupAzurePrivatelinkResult struct {
	// Azure Privatelink service alias
	AzureServiceAlias string `pulumi:"azureServiceAlias"`
	// Azure Privatelink service ID
	AzureServiceId string `pulumi:"azureServiceId"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// Printable result of the Azure Privatelink request
	Message string `pulumi:"message"`
	// Identifies the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. This property cannot be changed, doing so forces recreation of the resource.
	Project string `pulumi:"project"`
	// Specifies the name of the service that this resource belongs to. To set up proper dependencies please refer to this variable as a reference. This property cannot be changed, doing so forces recreation of the resource.
	ServiceName string `pulumi:"serviceName"`
	// Privatelink resource state
	State string `pulumi:"state"`
	// A List of allowed Subscription IDs Maximum Length: `16`.
	UserSubscriptionIds []string `pulumi:"userSubscriptionIds"`
}

func LookupAzurePrivatelinkOutput(ctx *pulumi.Context, args LookupAzurePrivatelinkOutputArgs, opts ...pulumi.InvokeOption) LookupAzurePrivatelinkResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupAzurePrivatelinkResult, error) {
			args := v.(LookupAzurePrivatelinkArgs)
			r, err := LookupAzurePrivatelink(ctx, &args, opts...)
			return *r, err
		}).(LookupAzurePrivatelinkResultOutput)
}

// A collection of arguments for invoking getAzurePrivatelink.
type LookupAzurePrivatelinkOutputArgs struct {
	// Identifies the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. This property cannot be changed, doing so forces recreation of the resource.
	Project pulumi.StringInput `pulumi:"project"`
	// Specifies the name of the service that this resource belongs to. To set up proper dependencies please refer to this variable as a reference. This property cannot be changed, doing so forces recreation of the resource.
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

// Azure Privatelink service alias
func (o LookupAzurePrivatelinkResultOutput) AzureServiceAlias() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAzurePrivatelinkResult) string { return v.AzureServiceAlias }).(pulumi.StringOutput)
}

// Azure Privatelink service ID
func (o LookupAzurePrivatelinkResultOutput) AzureServiceId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAzurePrivatelinkResult) string { return v.AzureServiceId }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupAzurePrivatelinkResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAzurePrivatelinkResult) string { return v.Id }).(pulumi.StringOutput)
}

// Printable result of the Azure Privatelink request
func (o LookupAzurePrivatelinkResultOutput) Message() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAzurePrivatelinkResult) string { return v.Message }).(pulumi.StringOutput)
}

// Identifies the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. This property cannot be changed, doing so forces recreation of the resource.
func (o LookupAzurePrivatelinkResultOutput) Project() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAzurePrivatelinkResult) string { return v.Project }).(pulumi.StringOutput)
}

// Specifies the name of the service that this resource belongs to. To set up proper dependencies please refer to this variable as a reference. This property cannot be changed, doing so forces recreation of the resource.
func (o LookupAzurePrivatelinkResultOutput) ServiceName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAzurePrivatelinkResult) string { return v.ServiceName }).(pulumi.StringOutput)
}

// Privatelink resource state
func (o LookupAzurePrivatelinkResultOutput) State() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAzurePrivatelinkResult) string { return v.State }).(pulumi.StringOutput)
}

// A List of allowed Subscription IDs Maximum Length: `16`.
func (o LookupAzurePrivatelinkResultOutput) UserSubscriptionIds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupAzurePrivatelinkResult) []string { return v.UserSubscriptionIds }).(pulumi.StringArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupAzurePrivatelinkResultOutput{})
}