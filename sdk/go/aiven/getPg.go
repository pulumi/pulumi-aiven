// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package aiven

import (
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

func LookupPg(ctx *pulumi.Context, args *LookupPgArgs, opts ...pulumi.InvokeOption) (*LookupPgResult, error) {
	var rv LookupPgResult
	err := ctx.Invoke("aiven:index/getPg:getPg", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getPg.
type LookupPgArgs struct {
	CloudName             *string                   `pulumi:"cloudName"`
	Components            []GetPgComponent          `pulumi:"components"`
	MaintenanceWindowDow  *string                   `pulumi:"maintenanceWindowDow"`
	MaintenanceWindowTime *string                   `pulumi:"maintenanceWindowTime"`
	Pg                    *GetPgPg                  `pulumi:"pg"`
	PgUserConfig          *GetPgPgUserConfig        `pulumi:"pgUserConfig"`
	Plan                  *string                   `pulumi:"plan"`
	Project               string                    `pulumi:"project"`
	ProjectVpcId          *string                   `pulumi:"projectVpcId"`
	ServiceHost           *string                   `pulumi:"serviceHost"`
	ServiceIntegrations   []GetPgServiceIntegration `pulumi:"serviceIntegrations"`
	ServiceName           string                    `pulumi:"serviceName"`
	ServicePassword       *string                   `pulumi:"servicePassword"`
	ServicePort           *int                      `pulumi:"servicePort"`
	ServiceType           *string                   `pulumi:"serviceType"`
	ServiceUri            *string                   `pulumi:"serviceUri"`
	ServiceUsername       *string                   `pulumi:"serviceUsername"`
	State                 *string                   `pulumi:"state"`
	TerminationProtection *bool                     `pulumi:"terminationProtection"`
}

// A collection of values returned by getPg.
type LookupPgResult struct {
	CloudName  *string          `pulumi:"cloudName"`
	Components []GetPgComponent `pulumi:"components"`
	// The provider-assigned unique ID for this managed resource.
	Id                    string                    `pulumi:"id"`
	MaintenanceWindowDow  *string                   `pulumi:"maintenanceWindowDow"`
	MaintenanceWindowTime *string                   `pulumi:"maintenanceWindowTime"`
	Pg                    GetPgPg                   `pulumi:"pg"`
	PgUserConfig          *GetPgPgUserConfig        `pulumi:"pgUserConfig"`
	Plan                  *string                   `pulumi:"plan"`
	Project               string                    `pulumi:"project"`
	ProjectVpcId          *string                   `pulumi:"projectVpcId"`
	ServiceHost           string                    `pulumi:"serviceHost"`
	ServiceIntegrations   []GetPgServiceIntegration `pulumi:"serviceIntegrations"`
	ServiceName           string                    `pulumi:"serviceName"`
	ServicePassword       string                    `pulumi:"servicePassword"`
	ServicePort           int                       `pulumi:"servicePort"`
	ServiceType           string                    `pulumi:"serviceType"`
	ServiceUri            string                    `pulumi:"serviceUri"`
	ServiceUsername       string                    `pulumi:"serviceUsername"`
	State                 string                    `pulumi:"state"`
	TerminationProtection *bool                     `pulumi:"terminationProtection"`
}