// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package aiven

import (
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// ## # Kafka Schema Data Source
//
// The Kafka Schema data source provides information about the existing Aiven Kafka Schema.
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
// 		_, err := aiven.LookupKafkaSchema(ctx, &aiven.LookupKafkaSchemaArgs{
// 			Project:     aiven_project.Kafka - schemas - project1.Project,
// 			ServiceName: aiven_service.Kafka - service1.Service_name,
// 			SubjectName: "kafka-schema1",
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
func LookupKafkaSchema(ctx *pulumi.Context, args *LookupKafkaSchemaArgs, opts ...pulumi.InvokeOption) (*LookupKafkaSchemaResult, error) {
	var rv LookupKafkaSchemaResult
	err := ctx.Invoke("aiven:index/getKafkaSchema:getKafkaSchema", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getKafkaSchema.
type LookupKafkaSchemaArgs struct {
	// configuration compatibility level overrides specific subject
	// resource. If the compatibility level not specified for the individual subject by default,
	// it takes a global value. Allowed values: `BACKWARD`, `BACKWARD_TRANSITIVE`, `FORWARD`,
	// `FORWARD_TRANSITIVE`, `FULL`, `FULL_TRANSITIVE`, `NONE`.
	CompatibilityLevel *string `pulumi:"compatibilityLevel"`
	// and `serviceName` - (Required) define the project and service the Kafka Schemas belongs to.
	// They should be defined using reference as shown above to set up dependencies correctly.
	Project string `pulumi:"project"`
	// is Kafka Schema configuration should be a valid Avro Schema JSON format.
	Schema      *string `pulumi:"schema"`
	ServiceName string  `pulumi:"serviceName"`
	// is Kafka Schema subject name.
	SubjectName string `pulumi:"subjectName"`
	Version     *int   `pulumi:"version"`
}

// A collection of values returned by getKafkaSchema.
type LookupKafkaSchemaResult struct {
	// configuration compatibility level overrides specific subject
	// resource. If the compatibility level not specified for the individual subject by default,
	// it takes a global value. Allowed values: `BACKWARD`, `BACKWARD_TRANSITIVE`, `FORWARD`,
	// `FORWARD_TRANSITIVE`, `FULL`, `FULL_TRANSITIVE`, `NONE`.
	CompatibilityLevel *string `pulumi:"compatibilityLevel"`
	// The provider-assigned unique ID for this managed resource.
	Id      string `pulumi:"id"`
	Project string `pulumi:"project"`
	// is Kafka Schema configuration should be a valid Avro Schema JSON format.
	Schema      *string `pulumi:"schema"`
	ServiceName string  `pulumi:"serviceName"`
	SubjectName string  `pulumi:"subjectName"`
	Version     int     `pulumi:"version"`
}
