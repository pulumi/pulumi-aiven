// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package aiven

import (
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

func LookupServiceIntegration(ctx *pulumi.Context, args *LookupServiceIntegrationArgs, opts ...pulumi.InvokeOption) (*LookupServiceIntegrationResult, error) {
	var rv LookupServiceIntegrationResult
	err := ctx.Invoke("aiven:index/getServiceIntegration:getServiceIntegration", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getServiceIntegration.
type LookupServiceIntegrationArgs struct {
	DestinationEndpointId      *string                                          `pulumi:"destinationEndpointId"`
	DestinationServiceName     string                                           `pulumi:"destinationServiceName"`
	IntegrationType            string                                           `pulumi:"integrationType"`
	KafkaConnectUserConfig     *GetServiceIntegrationKafkaConnectUserConfig     `pulumi:"kafkaConnectUserConfig"`
	KafkaMirrormakerUserConfig *GetServiceIntegrationKafkaMirrormakerUserConfig `pulumi:"kafkaMirrormakerUserConfig"`
	LogsUserConfig             *GetServiceIntegrationLogsUserConfig             `pulumi:"logsUserConfig"`
	MirrormakerUserConfig      *GetServiceIntegrationMirrormakerUserConfig      `pulumi:"mirrormakerUserConfig"`
	Project                    string                                           `pulumi:"project"`
	SourceEndpointId           *string                                          `pulumi:"sourceEndpointId"`
	SourceServiceName          string                                           `pulumi:"sourceServiceName"`
}

// A collection of values returned by getServiceIntegration.
type LookupServiceIntegrationResult struct {
	DestinationEndpointId  *string `pulumi:"destinationEndpointId"`
	DestinationServiceName string  `pulumi:"destinationServiceName"`
	// The provider-assigned unique ID for this managed resource.
	Id                         string                                           `pulumi:"id"`
	IntegrationType            string                                           `pulumi:"integrationType"`
	KafkaConnectUserConfig     *GetServiceIntegrationKafkaConnectUserConfig     `pulumi:"kafkaConnectUserConfig"`
	KafkaMirrormakerUserConfig *GetServiceIntegrationKafkaMirrormakerUserConfig `pulumi:"kafkaMirrormakerUserConfig"`
	LogsUserConfig             *GetServiceIntegrationLogsUserConfig             `pulumi:"logsUserConfig"`
	MirrormakerUserConfig      *GetServiceIntegrationMirrormakerUserConfig      `pulumi:"mirrormakerUserConfig"`
	Project                    string                                           `pulumi:"project"`
	SourceEndpointId           *string                                          `pulumi:"sourceEndpointId"`
	SourceServiceName          string                                           `pulumi:"sourceServiceName"`
}