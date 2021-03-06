// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "./types";
import * as utilities from "./utilities";

/**
 * ## # Kafka Schema Data Source
 *
 * The Kafka Schema data source provides information about the existing Aiven Kafka Schema.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aiven from "@pulumi/aiven";
 *
 * const kafka-schema1 = aiven.getKafkaSchema({
 *     project: aiven_project["kafka-schemas-project1"].project,
 *     serviceName: aiven_service["kafka-service1"].service_name,
 *     subjectName: "kafka-schema1",
 * });
 * ```
 */
export function getKafkaSchema(args: GetKafkaSchemaArgs, opts?: pulumi.InvokeOptions): Promise<GetKafkaSchemaResult> {
    if (!opts) {
        opts = {}
    }

    if (!opts.version) {
        opts.version = utilities.getVersion();
    }
    return pulumi.runtime.invoke("aiven:index/getKafkaSchema:getKafkaSchema", {
        "compatibilityLevel": args.compatibilityLevel,
        "project": args.project,
        "schema": args.schema,
        "serviceName": args.serviceName,
        "subjectName": args.subjectName,
        "version": args.version,
    }, opts);
}

/**
 * A collection of arguments for invoking getKafkaSchema.
 */
export interface GetKafkaSchemaArgs {
    /**
     * configuration compatibility level overrides specific subject
     * resource. If the compatibility level not specified for the individual subject by default,
     * it takes a global value. Allowed values: `BACKWARD`, `BACKWARD_TRANSITIVE`, `FORWARD`,
     * `FORWARD_TRANSITIVE`, `FULL`, `FULL_TRANSITIVE`, `NONE`.
     */
    compatibilityLevel?: string;
    /**
     * and `serviceName` - (Required) define the project and service the Kafka Schemas belongs to. 
     * They should be defined using reference as shown above to set up dependencies correctly.
     */
    project: string;
    /**
     * is Kafka Schema configuration should be a valid Avro Schema JSON format.
     */
    schema?: string;
    serviceName: string;
    /**
     * is Kafka Schema subject name.
     */
    subjectName: string;
    version?: number;
}

/**
 * A collection of values returned by getKafkaSchema.
 */
export interface GetKafkaSchemaResult {
    /**
     * configuration compatibility level overrides specific subject
     * resource. If the compatibility level not specified for the individual subject by default,
     * it takes a global value. Allowed values: `BACKWARD`, `BACKWARD_TRANSITIVE`, `FORWARD`,
     * `FORWARD_TRANSITIVE`, `FULL`, `FULL_TRANSITIVE`, `NONE`.
     */
    readonly compatibilityLevel?: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly project: string;
    /**
     * is Kafka Schema configuration should be a valid Avro Schema JSON format.
     */
    readonly schema?: string;
    readonly serviceName: string;
    readonly subjectName: string;
    readonly version: number;
}
