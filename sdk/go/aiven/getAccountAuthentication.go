// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package aiven

import (
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

func LookupAccountAuthentication(ctx *pulumi.Context, args *LookupAccountAuthenticationArgs, opts ...pulumi.InvokeOption) (*LookupAccountAuthenticationResult, error) {
	var rv LookupAccountAuthenticationResult
	err := ctx.Invoke("aiven:index/getAccountAuthentication:getAccountAuthentication", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getAccountAuthentication.
type LookupAccountAuthenticationArgs struct {
	AccountId        string  `pulumi:"accountId"`
	AuthenticationId *string `pulumi:"authenticationId"`
	CreateTime       *string `pulumi:"createTime"`
	Enabled          *bool   `pulumi:"enabled"`
	Name             string  `pulumi:"name"`
	SamlAcsUrl       *string `pulumi:"samlAcsUrl"`
	SamlCertificate  *string `pulumi:"samlCertificate"`
	SamlEntityId     *string `pulumi:"samlEntityId"`
	SamlIdpUrl       *string `pulumi:"samlIdpUrl"`
	SamlMetadataUrl  *string `pulumi:"samlMetadataUrl"`
	Type             *string `pulumi:"type"`
	UpdateTime       *string `pulumi:"updateTime"`
}

// A collection of values returned by getAccountAuthentication.
type LookupAccountAuthenticationResult struct {
	AccountId        string `pulumi:"accountId"`
	AuthenticationId string `pulumi:"authenticationId"`
	CreateTime       string `pulumi:"createTime"`
	Enabled          *bool  `pulumi:"enabled"`
	// The provider-assigned unique ID for this managed resource.
	Id              string  `pulumi:"id"`
	Name            string  `pulumi:"name"`
	SamlAcsUrl      string  `pulumi:"samlAcsUrl"`
	SamlCertificate *string `pulumi:"samlCertificate"`
	SamlEntityId    *string `pulumi:"samlEntityId"`
	SamlIdpUrl      *string `pulumi:"samlIdpUrl"`
	SamlMetadataUrl string  `pulumi:"samlMetadataUrl"`
	Type            *string `pulumi:"type"`
	UpdateTime      string  `pulumi:"updateTime"`
}