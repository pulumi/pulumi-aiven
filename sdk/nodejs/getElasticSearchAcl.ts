// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

export function getElasticSearchAcl(args: GetElasticSearchAclArgs, opts?: pulumi.InvokeOptions): Promise<GetElasticSearchAclResult> & GetElasticSearchAclResult {
    if (!opts) {
        opts = {}
    }

    if (!opts.version) {
        opts.version = utilities.getVersion();
    }
    const promise: Promise<GetElasticSearchAclResult> = pulumi.runtime.invoke("aiven:index/getElasticSearchAcl:getElasticSearchAcl", {
        "acls": args.acls,
        "enabled": args.enabled,
        "extendedAcl": args.extendedAcl,
        "project": args.project,
        "serviceName": args.serviceName,
    }, opts);

    return pulumi.utils.liftProperties(promise, opts);
}

/**
 * A collection of arguments for invoking getElasticSearchAcl.
 */
export interface GetElasticSearchAclArgs {
    readonly acls?: inputs.GetElasticSearchAclAcl[];
    readonly enabled?: boolean;
    readonly extendedAcl?: boolean;
    readonly project: string;
    readonly serviceName: string;
}

/**
 * A collection of values returned by getElasticSearchAcl.
 */
export interface GetElasticSearchAclResult {
    readonly acls?: outputs.GetElasticSearchAclAcl[];
    readonly enabled?: boolean;
    readonly extendedAcl?: boolean;
    readonly project: string;
    readonly serviceName: string;
    /**
     * id is the provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
}