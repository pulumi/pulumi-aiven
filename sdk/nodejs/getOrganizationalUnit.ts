// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Gets information about an organizational unit.
 */
export function getOrganizationalUnit(args: GetOrganizationalUnitArgs, opts?: pulumi.InvokeOptions): Promise<GetOrganizationalUnitResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("aiven:index/getOrganizationalUnit:getOrganizationalUnit", {
        "name": args.name,
    }, opts);
}

/**
 * A collection of arguments for invoking getOrganizationalUnit.
 */
export interface GetOrganizationalUnitArgs {
    /**
     * The name of the organizational unit.
     */
    name: string;
}

/**
 * A collection of values returned by getOrganizationalUnit.
 */
export interface GetOrganizationalUnitResult {
    /**
     * Time of creation.
     */
    readonly createTime: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * The name of the organizational unit.
     */
    readonly name: string;
    /**
     * The ID of the organization that the unit is created in.
     */
    readonly parentId: string;
    /**
     * Tenant ID.
     */
    readonly tenantId: string;
    /**
     * Time of last update.
     */
    readonly updateTime: string;
}
/**
 * Gets information about an organizational unit.
 */
export function getOrganizationalUnitOutput(args: GetOrganizationalUnitOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetOrganizationalUnitResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("aiven:index/getOrganizationalUnit:getOrganizationalUnit", {
        "name": args.name,
    }, opts);
}

/**
 * A collection of arguments for invoking getOrganizationalUnit.
 */
export interface GetOrganizationalUnitOutputArgs {
    /**
     * The name of the organizational unit.
     */
    name: pulumi.Input<string>;
}
