// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Gets information about an organization address.
 *
 * **This resource is in the beta stage and may change without notice.** Set
 * the `PROVIDER_AIVEN_ENABLE_BETA` environment variable to use the resource.
 */
export function getOrganizationAddress(args: GetOrganizationAddressArgs, opts?: pulumi.InvokeOptions): Promise<GetOrganizationAddressResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("aiven:index/getOrganizationAddress:getOrganizationAddress", {
        "addressId": args.addressId,
        "organizationId": args.organizationId,
        "timeouts": args.timeouts,
    }, opts);
}

/**
 * A collection of arguments for invoking getOrganizationAddress.
 */
export interface GetOrganizationAddressArgs {
    /**
     * Address ID.
     */
    addressId: string;
    /**
     * ID of an organization.
     */
    organizationId: string;
    timeouts?: inputs.GetOrganizationAddressTimeouts;
}

/**
 * A collection of values returned by getOrganizationAddress.
 */
export interface GetOrganizationAddressResult {
    /**
     * Address ID.
     */
    readonly addressId: string;
    /**
     * Address Lines.
     */
    readonly addressLines: string[];
    /**
     * City.
     */
    readonly city: string;
    /**
     * Country Code.
     */
    readonly countryCode: string;
    /**
     * Create Time.
     */
    readonly createTime: string;
    /**
     * Resource ID, a composite of `organizationId` and `addressId` IDs.
     */
    readonly id: string;
    /**
     * Name of a company.
     */
    readonly name: string;
    /**
     * ID of an organization.
     */
    readonly organizationId: string;
    /**
     * State.
     */
    readonly state: string;
    readonly timeouts?: outputs.GetOrganizationAddressTimeouts;
    /**
     * Update Time.
     */
    readonly updateTime: string;
    /**
     * Zip Code.
     */
    readonly zipCode: string;
}
/**
 * Gets information about an organization address.
 *
 * **This resource is in the beta stage and may change without notice.** Set
 * the `PROVIDER_AIVEN_ENABLE_BETA` environment variable to use the resource.
 */
export function getOrganizationAddressOutput(args: GetOrganizationAddressOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetOrganizationAddressResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("aiven:index/getOrganizationAddress:getOrganizationAddress", {
        "addressId": args.addressId,
        "organizationId": args.organizationId,
        "timeouts": args.timeouts,
    }, opts);
}

/**
 * A collection of arguments for invoking getOrganizationAddress.
 */
export interface GetOrganizationAddressOutputArgs {
    /**
     * Address ID.
     */
    addressId: pulumi.Input<string>;
    /**
     * ID of an organization.
     */
    organizationId: pulumi.Input<string>;
    timeouts?: pulumi.Input<inputs.GetOrganizationAddressTimeoutsArgs>;
}
