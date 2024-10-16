// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * The Valkey User data source provides information about the existing Aiven for Valkey user.
 */
export function getValkeyUser(args: GetValkeyUserArgs, opts?: pulumi.InvokeOptions): Promise<GetValkeyUserResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("aiven:index/getValkeyUser:getValkeyUser", {
        "project": args.project,
        "serviceName": args.serviceName,
        "username": args.username,
    }, opts);
}

/**
 * A collection of arguments for invoking getValkeyUser.
 */
export interface GetValkeyUserArgs {
    /**
     * The name of the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
     */
    project: string;
    /**
     * The name of the service that this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
     */
    serviceName: string;
    /**
     * The actual name of the Valkey User. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
     */
    username: string;
}

/**
 * A collection of values returned by getValkeyUser.
 */
export interface GetValkeyUserResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * The password of the Valkey User.
     */
    readonly password: string;
    /**
     * The name of the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
     */
    readonly project: string;
    /**
     * The name of the service that this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
     */
    readonly serviceName: string;
    /**
     * Type of the user account. Tells whether the user is the primary account or a regular account.
     */
    readonly type: string;
    /**
     * The actual name of the Valkey User. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
     */
    readonly username: string;
    /**
     * Defines command category rules. The field is required with`valkeyAclCommands` and `valkeyAclKeys`. Changing this property forces recreation of the resource.
     */
    readonly valkeyAclCategories: string[];
    /**
     * Defines the permitted pub/sub channel patterns. Changing this property forces recreation of the resource.
     */
    readonly valkeyAclChannels: string[];
    /**
     * Defines rules for individual commands. The field is required with`valkeyAclCategories` and `valkeyAclKeys`. Changing this property forces recreation of the resource.
     */
    readonly valkeyAclCommands: string[];
    /**
     * Defines key access rules. The field is required with`valkeyAclCategories` and `valkeyAclKeys`. Changing this property forces recreation of the resource.
     */
    readonly valkeyAclKeys: string[];
}
/**
 * The Valkey User data source provides information about the existing Aiven for Valkey user.
 */
export function getValkeyUserOutput(args: GetValkeyUserOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetValkeyUserResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("aiven:index/getValkeyUser:getValkeyUser", {
        "project": args.project,
        "serviceName": args.serviceName,
        "username": args.username,
    }, opts);
}

/**
 * A collection of arguments for invoking getValkeyUser.
 */
export interface GetValkeyUserOutputArgs {
    /**
     * The name of the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
     */
    project: pulumi.Input<string>;
    /**
     * The name of the service that this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
     */
    serviceName: pulumi.Input<string>;
    /**
     * The actual name of the Valkey User. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
     */
    username: pulumi.Input<string>;
}
