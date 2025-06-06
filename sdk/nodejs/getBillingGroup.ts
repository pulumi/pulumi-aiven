// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Gets information about a billing group.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aiven from "@pulumi/aiven";
 *
 * const exampleBillingGroup = aiven.getBillingGroup({
 *     billingGroupId: "1a2b3c4d-5e6f-7a8b-9c0d-1e2f3a4b5c6d",
 * });
 * ```
 */
export function getBillingGroup(args: GetBillingGroupArgs, opts?: pulumi.InvokeOptions): Promise<GetBillingGroupResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("aiven:index/getBillingGroup:getBillingGroup", {
        "billingGroupId": args.billingGroupId,
    }, opts);
}

/**
 * A collection of arguments for invoking getBillingGroup.
 */
export interface GetBillingGroupArgs {
    /**
     * The [ID of the billing group](https://aiven.io/docs/platform/reference/get-resource-IDs#get-a-billing-group-id). To set up proper dependencies please refer to this variable as a reference.
     */
    billingGroupId: string;
}

/**
 * A collection of values returned by getBillingGroup.
 */
export interface GetBillingGroupResult {
    /**
     * Account ID.
     */
    readonly accountId: string;
    /**
     * Address lines 1 and 2. For example, street, PO box, or building.
     */
    readonly addressLines: string[];
    /**
     * Billing currency for the billing group. Supported currencies are: AUD, CAD, CHF, DKK, EUR, GBP, JPY, NOK, NZD, SEK, SGD, and USD.
     */
    readonly billingCurrency: string;
    /**
     * Email address of billing contacts. Invoices and other payment notifications are emailed to all billing contacts.
     */
    readonly billingEmails: string[];
    /**
     * Additional information to include on your invoice (for example, a reference number).
     */
    readonly billingExtraText: string;
    /**
     * The [ID of the billing group](https://aiven.io/docs/platform/reference/get-resource-IDs#get-a-billing-group-id). To set up proper dependencies please refer to this variable as a reference.
     */
    readonly billingGroupId: string;
    /**
     * Credit card ID.
     */
    readonly cardId: string;
    /**
     * City, district, suburb, town, or village.
     */
    readonly city: string;
    /**
     * Your company name.
     */
    readonly company: string;
    /**
     * ID of the billing group to copy the company name, address, currency, billing contacts, and extra text from.
     */
    readonly copyFromBillingGroup: string;
    /**
     * Two-letter country code.
     */
    readonly countryCode: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * Name of the billing group.
     */
    readonly name: string;
    /**
     * Link a billing group to an existing organization by using its ID. To set up proper dependencies please refer to this variable as a reference.
     */
    readonly parentId: string;
    /**
     * Address state.
     */
    readonly state: string;
    /**
     * The VAT identification number for your company.
     */
    readonly vatId: string;
    /**
     * Zip or postal code.
     */
    readonly zipCode: string;
}
/**
 * Gets information about a billing group.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aiven from "@pulumi/aiven";
 *
 * const exampleBillingGroup = aiven.getBillingGroup({
 *     billingGroupId: "1a2b3c4d-5e6f-7a8b-9c0d-1e2f3a4b5c6d",
 * });
 * ```
 */
export function getBillingGroupOutput(args: GetBillingGroupOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetBillingGroupResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("aiven:index/getBillingGroup:getBillingGroup", {
        "billingGroupId": args.billingGroupId,
    }, opts);
}

/**
 * A collection of arguments for invoking getBillingGroup.
 */
export interface GetBillingGroupOutputArgs {
    /**
     * The [ID of the billing group](https://aiven.io/docs/platform/reference/get-resource-IDs#get-a-billing-group-id). To set up proper dependencies please refer to this variable as a reference.
     */
    billingGroupId: pulumi.Input<string>;
}
