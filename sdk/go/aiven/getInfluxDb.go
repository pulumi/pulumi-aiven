// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package aiven

import (
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

func LookupInfluxDb(ctx *pulumi.Context, args *LookupInfluxDbArgs, opts ...pulumi.InvokeOption) (*LookupInfluxDbResult, error) {
	var rv LookupInfluxDbResult
	err := ctx.Invoke("aiven:index/getInfluxDb:getInfluxDb", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getInfluxDb.
type LookupInfluxDbArgs struct {
	CloudName             *string                         `pulumi:"cloudName"`
	Components            []GetInfluxDbComponent          `pulumi:"components"`
	Influxdb              *GetInfluxDbInfluxdb            `pulumi:"influxdb"`
	InfluxdbUserConfig    *GetInfluxDbInfluxdbUserConfig  `pulumi:"influxdbUserConfig"`
	MaintenanceWindowDow  *string                         `pulumi:"maintenanceWindowDow"`
	MaintenanceWindowTime *string                         `pulumi:"maintenanceWindowTime"`
	Plan                  *string                         `pulumi:"plan"`
	Project               string                          `pulumi:"project"`
	ProjectVpcId          *string                         `pulumi:"projectVpcId"`
	ServiceHost           *string                         `pulumi:"serviceHost"`
	ServiceIntegrations   []GetInfluxDbServiceIntegration `pulumi:"serviceIntegrations"`
	ServiceName           string                          `pulumi:"serviceName"`
	ServicePassword       *string                         `pulumi:"servicePassword"`
	ServicePort           *int                            `pulumi:"servicePort"`
	ServiceType           *string                         `pulumi:"serviceType"`
	ServiceUri            *string                         `pulumi:"serviceUri"`
	ServiceUsername       *string                         `pulumi:"serviceUsername"`
	State                 *string                         `pulumi:"state"`
	TerminationProtection *bool                           `pulumi:"terminationProtection"`
}

// A collection of values returned by getInfluxDb.
type LookupInfluxDbResult struct {
	CloudName  *string                `pulumi:"cloudName"`
	Components []GetInfluxDbComponent `pulumi:"components"`
	// The provider-assigned unique ID for this managed resource.
	Id                    string                          `pulumi:"id"`
	Influxdb              GetInfluxDbInfluxdb             `pulumi:"influxdb"`
	InfluxdbUserConfig    *GetInfluxDbInfluxdbUserConfig  `pulumi:"influxdbUserConfig"`
	MaintenanceWindowDow  *string                         `pulumi:"maintenanceWindowDow"`
	MaintenanceWindowTime *string                         `pulumi:"maintenanceWindowTime"`
	Plan                  *string                         `pulumi:"plan"`
	Project               string                          `pulumi:"project"`
	ProjectVpcId          *string                         `pulumi:"projectVpcId"`
	ServiceHost           string                          `pulumi:"serviceHost"`
	ServiceIntegrations   []GetInfluxDbServiceIntegration `pulumi:"serviceIntegrations"`
	ServiceName           string                          `pulumi:"serviceName"`
	ServicePassword       string                          `pulumi:"servicePassword"`
	ServicePort           int                             `pulumi:"servicePort"`
	ServiceType           string                          `pulumi:"serviceType"`
	ServiceUri            string                          `pulumi:"serviceUri"`
	ServiceUsername       string                          `pulumi:"serviceUsername"`
	State                 string                          `pulumi:"state"`
	TerminationProtection *bool                           `pulumi:"terminationProtection"`
}