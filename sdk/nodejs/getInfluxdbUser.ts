// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

export function getInfluxdbUser(args: GetInfluxdbUserArgs, opts?: pulumi.InvokeOptions): Promise<GetInfluxdbUserResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("aiven:index/getInfluxdbUser:getInfluxdbUser", {
        "project": args.project,
        "serviceName": args.serviceName,
        "username": args.username,
    }, opts);
}

/**
 * A collection of arguments for invoking getInfluxdbUser.
 */
export interface GetInfluxdbUserArgs {
    project: string;
    serviceName: string;
    username: string;
}

/**
 * A collection of values returned by getInfluxdbUser.
 */
export interface GetInfluxdbUserResult {
    readonly accessCert: string;
    readonly accessKey: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly password: string;
    readonly project: string;
    readonly serviceName: string;
    readonly type: string;
    readonly username: string;
}
export function getInfluxdbUserOutput(args: GetInfluxdbUserOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetInfluxdbUserResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("aiven:index/getInfluxdbUser:getInfluxdbUser", {
        "project": args.project,
        "serviceName": args.serviceName,
        "username": args.username,
    }, opts);
}

/**
 * A collection of arguments for invoking getInfluxdbUser.
 */
export interface GetInfluxdbUserOutputArgs {
    project: pulumi.Input<string>;
    serviceName: pulumi.Input<string>;
    username: pulumi.Input<string>;
}
