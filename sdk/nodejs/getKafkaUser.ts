// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * The Kafka User data source provides information about the existing Aiven Kafka User.
 *
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aiven from "@pulumi/aiven";
 *
 * const user = aiven.getKafkaUser({
 *     project: "my-project",
 *     serviceName: "my-service",
 *     username: "user1",
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 */
export function getKafkaUser(args: GetKafkaUserArgs, opts?: pulumi.InvokeOptions): Promise<GetKafkaUserResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("aiven:index/getKafkaUser:getKafkaUser", {
        "project": args.project,
        "serviceName": args.serviceName,
        "username": args.username,
    }, opts);
}

/**
 * A collection of arguments for invoking getKafkaUser.
 */
export interface GetKafkaUserArgs {
    /**
     * Identifies the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
     */
    project: string;
    /**
     * Specifies the name of the service that this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
     */
    serviceName: string;
    /**
     * The actual name of the Kafka User. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
     */
    username: string;
}

/**
 * A collection of values returned by getKafkaUser.
 */
export interface GetKafkaUserResult {
    /**
     * Access certificate for the user
     */
    readonly accessCert: string;
    /**
     * Access certificate key for the user
     */
    readonly accessKey: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * The password of the Kafka User.
     */
    readonly password: string;
    /**
     * Identifies the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
     */
    readonly project: string;
    /**
     * Specifies the name of the service that this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
     */
    readonly serviceName: string;
    /**
     * Type of the user account. Tells whether the user is the primary account or a regular account.
     */
    readonly type: string;
    /**
     * The actual name of the Kafka User. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
     */
    readonly username: string;
}
/**
 * The Kafka User data source provides information about the existing Aiven Kafka User.
 *
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aiven from "@pulumi/aiven";
 *
 * const user = aiven.getKafkaUser({
 *     project: "my-project",
 *     serviceName: "my-service",
 *     username: "user1",
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 */
export function getKafkaUserOutput(args: GetKafkaUserOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetKafkaUserResult> {
    return pulumi.output(args).apply((a: any) => getKafkaUser(a, opts))
}

/**
 * A collection of arguments for invoking getKafkaUser.
 */
export interface GetKafkaUserOutputArgs {
    /**
     * Identifies the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
     */
    project: pulumi.Input<string>;
    /**
     * Specifies the name of the service that this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
     */
    serviceName: pulumi.Input<string>;
    /**
     * The actual name of the Kafka User. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
     */
    username: pulumi.Input<string>;
}
