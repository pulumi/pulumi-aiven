// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package aiven

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-aiven/sdk/v6/go/aiven/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Gets information about an application user.
func LookupOrganizationApplicationUser(ctx *pulumi.Context, args *LookupOrganizationApplicationUserArgs, opts ...pulumi.InvokeOption) (*LookupOrganizationApplicationUserResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupOrganizationApplicationUserResult
	err := ctx.Invoke("aiven:index/getOrganizationApplicationUser:getOrganizationApplicationUser", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getOrganizationApplicationUser.
type LookupOrganizationApplicationUserArgs struct {
	// The ID of the organization the application user belongs to.
	OrganizationId string `pulumi:"organizationId"`
	// The ID of the application user.
	UserId string `pulumi:"userId"`
}

// A collection of values returned by getOrganizationApplicationUser.
type LookupOrganizationApplicationUserResult struct {
	// An email address automatically generated by Aiven to help identify the application user. No notifications are sent to this email.
	Email string `pulumi:"email"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// Makes the application user a super admin. The super admin role has completely unrestricted access to all organization resources and settings. This role should be limited to as few users as possible. For daily administrative tasks, assign users the organization admin role instead using the `OrganizationPermission` resource.
	IsSuperAdmin bool `pulumi:"isSuperAdmin"`
	// Name of the application user.
	Name string `pulumi:"name"`
	// The ID of the organization the application user belongs to.
	OrganizationId string `pulumi:"organizationId"`
	// The ID of the application user.
	UserId string `pulumi:"userId"`
}

func LookupOrganizationApplicationUserOutput(ctx *pulumi.Context, args LookupOrganizationApplicationUserOutputArgs, opts ...pulumi.InvokeOption) LookupOrganizationApplicationUserResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupOrganizationApplicationUserResultOutput, error) {
			args := v.(LookupOrganizationApplicationUserArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("aiven:index/getOrganizationApplicationUser:getOrganizationApplicationUser", args, LookupOrganizationApplicationUserResultOutput{}, options).(LookupOrganizationApplicationUserResultOutput), nil
		}).(LookupOrganizationApplicationUserResultOutput)
}

// A collection of arguments for invoking getOrganizationApplicationUser.
type LookupOrganizationApplicationUserOutputArgs struct {
	// The ID of the organization the application user belongs to.
	OrganizationId pulumi.StringInput `pulumi:"organizationId"`
	// The ID of the application user.
	UserId pulumi.StringInput `pulumi:"userId"`
}

func (LookupOrganizationApplicationUserOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupOrganizationApplicationUserArgs)(nil)).Elem()
}

// A collection of values returned by getOrganizationApplicationUser.
type LookupOrganizationApplicationUserResultOutput struct{ *pulumi.OutputState }

func (LookupOrganizationApplicationUserResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupOrganizationApplicationUserResult)(nil)).Elem()
}

func (o LookupOrganizationApplicationUserResultOutput) ToLookupOrganizationApplicationUserResultOutput() LookupOrganizationApplicationUserResultOutput {
	return o
}

func (o LookupOrganizationApplicationUserResultOutput) ToLookupOrganizationApplicationUserResultOutputWithContext(ctx context.Context) LookupOrganizationApplicationUserResultOutput {
	return o
}

// An email address automatically generated by Aiven to help identify the application user. No notifications are sent to this email.
func (o LookupOrganizationApplicationUserResultOutput) Email() pulumi.StringOutput {
	return o.ApplyT(func(v LookupOrganizationApplicationUserResult) string { return v.Email }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupOrganizationApplicationUserResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupOrganizationApplicationUserResult) string { return v.Id }).(pulumi.StringOutput)
}

// Makes the application user a super admin. The super admin role has completely unrestricted access to all organization resources and settings. This role should be limited to as few users as possible. For daily administrative tasks, assign users the organization admin role instead using the `OrganizationPermission` resource.
func (o LookupOrganizationApplicationUserResultOutput) IsSuperAdmin() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupOrganizationApplicationUserResult) bool { return v.IsSuperAdmin }).(pulumi.BoolOutput)
}

// Name of the application user.
func (o LookupOrganizationApplicationUserResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupOrganizationApplicationUserResult) string { return v.Name }).(pulumi.StringOutput)
}

// The ID of the organization the application user belongs to.
func (o LookupOrganizationApplicationUserResultOutput) OrganizationId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupOrganizationApplicationUserResult) string { return v.OrganizationId }).(pulumi.StringOutput)
}

// The ID of the application user.
func (o LookupOrganizationApplicationUserResultOutput) UserId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupOrganizationApplicationUserResult) string { return v.UserId }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupOrganizationApplicationUserResultOutput{})
}
