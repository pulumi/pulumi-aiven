// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Gets information about an application user.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aiven from "@pulumi/aiven";
 *
 * const tfUser = aiven.getOrganizationApplicationUser({
 *     organizationId: main.id,
 *     userId: "u123a456b7890c",
 * });
 * ```
 */
export function getOrganizationApplicationUser(args: GetOrganizationApplicationUserArgs, opts?: pulumi.InvokeOptions): Promise<GetOrganizationApplicationUserResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("aiven:index/getOrganizationApplicationUser:getOrganizationApplicationUser", {
        "organizationId": args.organizationId,
        "userId": args.userId,
    }, opts);
}

/**
 * A collection of arguments for invoking getOrganizationApplicationUser.
 */
export interface GetOrganizationApplicationUserArgs {
    /**
     * The ID of the organization the application user belongs to.
     */
    organizationId: string;
    /**
     * The ID of the application user.
     */
    userId: string;
}

/**
 * A collection of values returned by getOrganizationApplicationUser.
 */
export interface GetOrganizationApplicationUserResult {
    /**
     * An email address automatically generated by Aiven to help identify the application user. No notifications are sent to this email.
     */
    readonly email: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * Makes the application user a super admin. The super admin role has full access to an organization, its billing and settings, and all its organizational units, projects, and services.
     */
    readonly isSuperAdmin: boolean;
    /**
     * Name of the application user.
     */
    readonly name: string;
    /**
     * The ID of the organization the application user belongs to.
     */
    readonly organizationId: string;
    /**
     * The ID of the application user.
     */
    readonly userId: string;
}
/**
 * Gets information about an application user.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aiven from "@pulumi/aiven";
 *
 * const tfUser = aiven.getOrganizationApplicationUser({
 *     organizationId: main.id,
 *     userId: "u123a456b7890c",
 * });
 * ```
 */
export function getOrganizationApplicationUserOutput(args: GetOrganizationApplicationUserOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetOrganizationApplicationUserResult> {
    return pulumi.output(args).apply((a: any) => getOrganizationApplicationUser(a, opts))
}

/**
 * A collection of arguments for invoking getOrganizationApplicationUser.
 */
export interface GetOrganizationApplicationUserOutputArgs {
    /**
     * The ID of the organization the application user belongs to.
     */
    organizationId: pulumi.Input<string>;
    /**
     * The ID of the application user.
     */
    userId: pulumi.Input<string>;
}