// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

export function getGcpPrivatelink(args: GetGcpPrivatelinkArgs, opts?: pulumi.InvokeOptions): Promise<GetGcpPrivatelinkResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("aiven:index/getGcpPrivatelink:getGcpPrivatelink", {
        "project": args.project,
        "serviceName": args.serviceName,
    }, opts);
}

/**
 * A collection of arguments for invoking getGcpPrivatelink.
 */
export interface GetGcpPrivatelinkArgs {
    project: string;
    serviceName: string;
}

/**
 * A collection of values returned by getGcpPrivatelink.
 */
export interface GetGcpPrivatelinkResult {
    readonly googleServiceAttachment: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly message: string;
    readonly project: string;
    readonly serviceName: string;
    readonly state: string;
}
export function getGcpPrivatelinkOutput(args: GetGcpPrivatelinkOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetGcpPrivatelinkResult> {
    return pulumi.output(args).apply((a: any) => getGcpPrivatelink(a, opts))
}

/**
 * A collection of arguments for invoking getGcpPrivatelink.
 */
export interface GetGcpPrivatelinkOutputArgs {
    project: pulumi.Input<string>;
    serviceName: pulumi.Input<string>;
}