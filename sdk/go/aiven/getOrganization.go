// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package aiven

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// The Organization data source provides information about the existing Aiven Organization.
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
//			_, err := aiven.LookupOrganization(ctx, &aiven.LookupOrganizationArgs{
//				Name: "<ORGANIZATION_NAME>",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupOrganization(ctx *pulumi.Context, args *LookupOrganizationArgs, opts ...pulumi.InvokeOption) (*LookupOrganizationResult, error) {
	var rv LookupOrganizationResult
	err := ctx.Invoke("aiven:index/getOrganization:getOrganization", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getOrganization.
type LookupOrganizationArgs struct {
	// Organization name
	Name string `pulumi:"name"`
}

// A collection of values returned by getOrganization.
type LookupOrganizationResult struct {
	// Time of creation
	CreateTime string `pulumi:"createTime"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// Organization name
	Name string `pulumi:"name"`
	// Tenant ID
	TenantId string `pulumi:"tenantId"`
	// Time of last update
	UpdateTime string `pulumi:"updateTime"`
}

func LookupOrganizationOutput(ctx *pulumi.Context, args LookupOrganizationOutputArgs, opts ...pulumi.InvokeOption) LookupOrganizationResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupOrganizationResult, error) {
			args := v.(LookupOrganizationArgs)
			r, err := LookupOrganization(ctx, &args, opts...)
			var s LookupOrganizationResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupOrganizationResultOutput)
}

// A collection of arguments for invoking getOrganization.
type LookupOrganizationOutputArgs struct {
	// Organization name
	Name pulumi.StringInput `pulumi:"name"`
}

func (LookupOrganizationOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupOrganizationArgs)(nil)).Elem()
}

// A collection of values returned by getOrganization.
type LookupOrganizationResultOutput struct{ *pulumi.OutputState }

func (LookupOrganizationResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupOrganizationResult)(nil)).Elem()
}

func (o LookupOrganizationResultOutput) ToLookupOrganizationResultOutput() LookupOrganizationResultOutput {
	return o
}

func (o LookupOrganizationResultOutput) ToLookupOrganizationResultOutputWithContext(ctx context.Context) LookupOrganizationResultOutput {
	return o
}

// Time of creation
func (o LookupOrganizationResultOutput) CreateTime() pulumi.StringOutput {
	return o.ApplyT(func(v LookupOrganizationResult) string { return v.CreateTime }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupOrganizationResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupOrganizationResult) string { return v.Id }).(pulumi.StringOutput)
}

// Organization name
func (o LookupOrganizationResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupOrganizationResult) string { return v.Name }).(pulumi.StringOutput)
}

// Tenant ID
func (o LookupOrganizationResultOutput) TenantId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupOrganizationResult) string { return v.TenantId }).(pulumi.StringOutput)
}

// Time of last update
func (o LookupOrganizationResultOutput) UpdateTime() pulumi.StringOutput {
	return o.ApplyT(func(v LookupOrganizationResult) string { return v.UpdateTime }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupOrganizationResultOutput{})
}