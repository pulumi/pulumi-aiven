// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

export function getElasticSearchAclConfig(args: GetElasticSearchAclConfigArgs, opts?: pulumi.InvokeOptions): Promise<GetElasticSearchAclConfigResult> {
    if (!opts) {
        opts = {}
    }

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
    return pulumi.runtime.invoke("aiven:index/getElasticSearchAclConfig:getElasticSearchAclConfig", {
        "enabled": args.enabled,
        "extendedAcl": args.extendedAcl,
        "project": args.project,
        "serviceName": args.serviceName,
    }, opts);
}

/**
 * A collection of arguments for invoking getElasticSearchAclConfig.
 */
export interface GetElasticSearchAclConfigArgs {
    enabled?: boolean;
    extendedAcl?: boolean;
    project: string;
    serviceName: string;
}

/**
 * A collection of values returned by getElasticSearchAclConfig.
 */
export interface GetElasticSearchAclConfigResult {
    readonly enabled?: boolean;
    readonly extendedAcl?: boolean;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly project: string;
    readonly serviceName: string;
}

export function getElasticSearchAclConfigOutput(args: GetElasticSearchAclConfigOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetElasticSearchAclConfigResult> {
    return pulumi.output(args).apply(a => getElasticSearchAclConfig(a, opts))
}

/**
 * A collection of arguments for invoking getElasticSearchAclConfig.
 */
export interface GetElasticSearchAclConfigOutputArgs {
    enabled?: pulumi.Input<boolean>;
    extendedAcl?: pulumi.Input<boolean>;
    project: pulumi.Input<string>;
    serviceName: pulumi.Input<string>;
}