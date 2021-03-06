// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package aiven

import (
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// ## # Grafana Data Source
//
// The Grafana data source provides information about the existing Aiven Grafana service.
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
// 		_, err := aiven.LookupGrafana(ctx, &aiven.LookupGrafanaArgs{
// 			Project:     data.Aiven_project.Ps1.Project,
// 			ServiceName: "my-gr1",
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
func LookupGrafana(ctx *pulumi.Context, args *LookupGrafanaArgs, opts ...pulumi.InvokeOption) (*LookupGrafanaResult, error) {
	var rv LookupGrafanaResult
	err := ctx.Invoke("aiven:index/getGrafana:getGrafana", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getGrafana.
type LookupGrafanaArgs struct {
	// defines where the cloud provider and region where the service is hosted
	// in. This can be changed freely after service is created. Changing the value will trigger
	// a potentially lengthy migration process for the service. Format is cloud provider name
	// (`aws`, `azure`, `do` `google`, `upcloud`, etc.), dash, and the cloud provider
	// specific region name. These are documented on each Cloud provider's own support articles,
	// like [here for Google](https://cloud.google.com/compute/docs/regions-zones/) and
	// [here for AWS](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.RegionsAndAvailabilityZones.html).
	CloudName  *string               `pulumi:"cloudName"`
	Components []GetGrafanaComponent `pulumi:"components"`
	// Grafana specific server provided values.
	Grafana *GetGrafanaGrafana `pulumi:"grafana"`
	// defines Grafana specific additional configuration options. The following
	// configuration options available:
	GrafanaUserConfig *GetGrafanaGrafanaUserConfig `pulumi:"grafanaUserConfig"`
	// day of week when maintenance operations should be performed.
	// On monday, tuesday, wednesday, etc.
	MaintenanceWindowDow *string `pulumi:"maintenanceWindowDow"`
	// time of day when maintenance operations should be performed.
	// UTC time in HH:mm:ss format.
	MaintenanceWindowTime *string `pulumi:"maintenanceWindowTime"`
	// defines what kind of computing resources are allocated for the service. It can
	// be changed after creation, though there are some restrictions when going to a smaller
	// plan such as the new plan must have sufficient amount of disk space to store all current
	// data and switching to a plan with fewer nodes might not be supported. The basic plan
	// names are `hobbyist`, `startup-x`, `business-x` and `premium-x` where `x` is
	// (roughly) the amount of memory on each node (also other attributes like number of CPUs
	// and amount of disk space varies but naming is based on memory). The available options can be seem from the [Aiven pricing page](https://aiven.io/pricing).
	Plan *string `pulumi:"plan"`
	// identifies the project the service belongs to. To set up proper dependency
	// between the project and the service, refer to the project as shown in the above example.
	// Project cannot be changed later without destroying and re-creating the service.
	Project string `pulumi:"project"`
	// optionally specifies the VPC the service should run in. If the value
	// is not set the service is not run inside a VPC. When set, the value should be given as a
	// reference as shown above to set up dependencies correctly and the VPC must be in the same
	// cloud and region as the service itself. Project can be freely moved to and from VPC after
	// creation but doing so triggers migration to new servers so the operation can take
	// significant amount of time to complete if the service has a lot of data.
	ProjectVpcId *string `pulumi:"projectVpcId"`
	// Grafana hostname.
	ServiceHost         *string                        `pulumi:"serviceHost"`
	ServiceIntegrations []GetGrafanaServiceIntegration `pulumi:"serviceIntegrations"`
	// specifies the actual name of the service. The name cannot be changed
	// later without destroying and re-creating the service so name should be picked based on
	// intended service usage rather than current attributes.
	ServiceName string `pulumi:"serviceName"`
	// Password used for connecting to the Grafana service, if applicable.
	ServicePassword *string `pulumi:"servicePassword"`
	// Grafana port.
	ServicePort *int    `pulumi:"servicePort"`
	ServiceType *string `pulumi:"serviceType"`
	// URI for connecting to the Grafana service.
	ServiceUri *string `pulumi:"serviceUri"`
	// Username used for connecting to the Grafana service, if applicable.
	ServiceUsername *string `pulumi:"serviceUsername"`
	// Service state.
	State *string `pulumi:"state"`
	// prevents the service from being deleted. It is recommended to
	// set this to `true` for all production services to prevent unintentional service
	// deletion. This does not shield against deleting databases or topics but for services
	// with backups much of the content can at least be restored from backup in case accidental
	// deletion is done.
	TerminationProtection *bool `pulumi:"terminationProtection"`
}

// A collection of values returned by getGrafana.
type LookupGrafanaResult struct {
	// defines where the cloud provider and region where the service is hosted
	// in. This can be changed freely after service is created. Changing the value will trigger
	// a potentially lengthy migration process for the service. Format is cloud provider name
	// (`aws`, `azure`, `do` `google`, `upcloud`, etc.), dash, and the cloud provider
	// specific region name. These are documented on each Cloud provider's own support articles,
	// like [here for Google](https://cloud.google.com/compute/docs/regions-zones/) and
	// [here for AWS](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.RegionsAndAvailabilityZones.html).
	CloudName  *string               `pulumi:"cloudName"`
	Components []GetGrafanaComponent `pulumi:"components"`
	// Grafana specific server provided values.
	Grafana GetGrafanaGrafana `pulumi:"grafana"`
	// defines Grafana specific additional configuration options. The following
	// configuration options available:
	GrafanaUserConfig *GetGrafanaGrafanaUserConfig `pulumi:"grafanaUserConfig"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// day of week when maintenance operations should be performed.
	// On monday, tuesday, wednesday, etc.
	MaintenanceWindowDow *string `pulumi:"maintenanceWindowDow"`
	// time of day when maintenance operations should be performed.
	// UTC time in HH:mm:ss format.
	MaintenanceWindowTime *string `pulumi:"maintenanceWindowTime"`
	// defines what kind of computing resources are allocated for the service. It can
	// be changed after creation, though there are some restrictions when going to a smaller
	// plan such as the new plan must have sufficient amount of disk space to store all current
	// data and switching to a plan with fewer nodes might not be supported. The basic plan
	// names are `hobbyist`, `startup-x`, `business-x` and `premium-x` where `x` is
	// (roughly) the amount of memory on each node (also other attributes like number of CPUs
	// and amount of disk space varies but naming is based on memory). The available options can be seem from the [Aiven pricing page](https://aiven.io/pricing).
	Plan    *string `pulumi:"plan"`
	Project string  `pulumi:"project"`
	// optionally specifies the VPC the service should run in. If the value
	// is not set the service is not run inside a VPC. When set, the value should be given as a
	// reference as shown above to set up dependencies correctly and the VPC must be in the same
	// cloud and region as the service itself. Project can be freely moved to and from VPC after
	// creation but doing so triggers migration to new servers so the operation can take
	// significant amount of time to complete if the service has a lot of data.
	ProjectVpcId *string `pulumi:"projectVpcId"`
	// Grafana hostname.
	ServiceHost         string                         `pulumi:"serviceHost"`
	ServiceIntegrations []GetGrafanaServiceIntegration `pulumi:"serviceIntegrations"`
	ServiceName         string                         `pulumi:"serviceName"`
	// Password used for connecting to the Grafana service, if applicable.
	ServicePassword string `pulumi:"servicePassword"`
	// Grafana port.
	ServicePort int    `pulumi:"servicePort"`
	ServiceType string `pulumi:"serviceType"`
	// URI for connecting to the Grafana service.
	ServiceUri string `pulumi:"serviceUri"`
	// Username used for connecting to the Grafana service, if applicable.
	ServiceUsername string `pulumi:"serviceUsername"`
	// Service state.
	State string `pulumi:"state"`
	// prevents the service from being deleted. It is recommended to
	// set this to `true` for all production services to prevent unintentional service
	// deletion. This does not shield against deleting databases or topics but for services
	// with backups much of the content can at least be restored from backup in case accidental
	// deletion is done.
	TerminationProtection *bool `pulumi:"terminationProtection"`
}
