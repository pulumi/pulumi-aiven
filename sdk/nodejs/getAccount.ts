// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * ## Example Usage
 * 
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aiven from "@pulumi/aiven";
 * 
 * const account1 = aiven.getAccount({
 *     name: "<ACCOUNT_NAME>",
 * });
 * ```
 *
 * > This content is derived from https://github.com/aiven/terraform-provider-aiven/blob/master/website/docs/d/account.html.markdown.
 */
export function getAccount(args: GetAccountArgs, opts?: pulumi.InvokeOptions): Promise<GetAccountResult> & GetAccountResult {
    if (!opts) {
        opts = {}
    }

    if (!opts.version) {
        opts.version = utilities.getVersion();
    }
    const promise: Promise<GetAccountResult> = pulumi.runtime.invoke("aiven:index/getAccount:getAccount", {
        "accountId": args.accountId,
        "createTime": args.createTime,
        "name": args.name,
        "ownerTeamId": args.ownerTeamId,
        "tenantId": args.tenantId,
        "updateTime": args.updateTime,
    }, opts);

    return pulumi.utils.liftProperties(promise, opts);
}

/**
 * A collection of arguments for invoking getAccount.
 */
export interface GetAccountArgs {
    readonly accountId?: string;
    readonly createTime?: string;
    readonly name: string;
    readonly ownerTeamId?: string;
    readonly tenantId?: string;
    readonly updateTime?: string;
}

/**
 * A collection of values returned by getAccount.
 */
export interface GetAccountResult {
    readonly accountId: string;
    readonly createTime: string;
    readonly name: string;
    readonly ownerTeamId: string;
    readonly tenantId: string;
    readonly updateTime: string;
    /**
     * id is the provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
}