// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "./types";
import * as utilities from "./utilities";

/**
 * ## # AWS Privatelink Data Source
 *
 * The AWS Privatelink resource allows the creation and management of Aiven AWS Privatelink for a services.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aiven from "@pulumi/aiven";
 *
 * const foo = aiven.getAwsPrivatelink({
 *     project: data.aiven_project.foo.project,
 *     serviceName: aiven_kafka.bar.service_name,
 * });
 * ```
 */
export function getAwsPrivatelink(args: GetAwsPrivatelinkArgs, opts?: pulumi.InvokeOptions): Promise<GetAwsPrivatelinkResult> {
    if (!opts) {
        opts = {}
    }

    if (!opts.version) {
        opts.version = utilities.getVersion();
    }
    return pulumi.runtime.invoke("aiven:index/getAwsPrivatelink:getAwsPrivatelink", {
        "awsServiceId": args.awsServiceId,
        "awsServiceName": args.awsServiceName,
        "principals": args.principals,
        "project": args.project,
        "serviceName": args.serviceName,
    }, opts);
}

/**
 * A collection of arguments for invoking getAwsPrivatelink.
 */
export interface GetAwsPrivatelinkArgs {
    /**
     * AWS service ID.
     */
    awsServiceId?: string;
    /**
     * AWS service name.
     */
    awsServiceName?: string;
    /**
     * list of allowed principals
     */
    principals?: string[];
    /**
     * identifies the project the service belongs to. To set up proper dependency between the project
     * and the service, refer to the project as shown in the above example. Project cannot be changed later without
     * destroying and re-creating the service.
     */
    project: string;
    /**
     * specifies the actual name of the service. The name cannot be changed later without
     * destroying and re-creating the service so name should be picked based on intended service usage rather than current
     * attributes.
     */
    serviceName: string;
}

/**
 * A collection of values returned by getAwsPrivatelink.
 */
export interface GetAwsPrivatelinkResult {
    /**
     * AWS service ID.
     */
    readonly awsServiceId: string;
    /**
     * AWS service name.
     */
    readonly awsServiceName: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * list of allowed principals
     */
    readonly principals?: string[];
    readonly project: string;
    readonly serviceName: string;
}
