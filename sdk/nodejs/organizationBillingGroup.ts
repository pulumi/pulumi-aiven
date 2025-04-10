// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Creates and manages an organization billing group.
 */
export class OrganizationBillingGroup extends pulumi.CustomResource {
    /**
     * Get an existing OrganizationBillingGroup resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: OrganizationBillingGroupState, opts?: pulumi.CustomResourceOptions): OrganizationBillingGroup {
        return new OrganizationBillingGroup(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aiven:index/organizationBillingGroup:OrganizationBillingGroup';

    /**
     * Returns true if the given object is an instance of OrganizationBillingGroup.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is OrganizationBillingGroup {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === OrganizationBillingGroup.__pulumiType;
    }

    /**
     * ID of the billing address.
     */
    public readonly billingAddressId!: pulumi.Output<string>;
    /**
     * List of billing contact emails.
     */
    public readonly billingContactEmails!: pulumi.Output<string[]>;
    /**
     * Billing currency.
     */
    public readonly billingCurrency!: pulumi.Output<string | undefined>;
    /**
     * List of billing emails.
     */
    public readonly billingEmails!: pulumi.Output<string[]>;
    /**
     * ID of the billing group.
     */
    public /*out*/ readonly billingGroupId!: pulumi.Output<string>;
    /**
     * Name of the billing group.
     */
    public readonly billingGroupName!: pulumi.Output<string>;
    /**
     * Custom invoice text.
     */
    public readonly customInvoiceText!: pulumi.Output<string | undefined>;
    /**
     * ID of the organization.
     */
    public readonly organizationId!: pulumi.Output<string>;
    /**
     * ID of the payment method.
     */
    public readonly paymentMethodId!: pulumi.Output<string>;
    /**
     * ID of the shipping address.
     */
    public readonly shippingAddressId!: pulumi.Output<string>;
    public readonly timeouts!: pulumi.Output<outputs.OrganizationBillingGroupTimeouts | undefined>;
    /**
     * VAT ID.
     */
    public readonly vatId!: pulumi.Output<string | undefined>;

    /**
     * Create a OrganizationBillingGroup resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: OrganizationBillingGroupArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: OrganizationBillingGroupArgs | OrganizationBillingGroupState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as OrganizationBillingGroupState | undefined;
            resourceInputs["billingAddressId"] = state ? state.billingAddressId : undefined;
            resourceInputs["billingContactEmails"] = state ? state.billingContactEmails : undefined;
            resourceInputs["billingCurrency"] = state ? state.billingCurrency : undefined;
            resourceInputs["billingEmails"] = state ? state.billingEmails : undefined;
            resourceInputs["billingGroupId"] = state ? state.billingGroupId : undefined;
            resourceInputs["billingGroupName"] = state ? state.billingGroupName : undefined;
            resourceInputs["customInvoiceText"] = state ? state.customInvoiceText : undefined;
            resourceInputs["organizationId"] = state ? state.organizationId : undefined;
            resourceInputs["paymentMethodId"] = state ? state.paymentMethodId : undefined;
            resourceInputs["shippingAddressId"] = state ? state.shippingAddressId : undefined;
            resourceInputs["timeouts"] = state ? state.timeouts : undefined;
            resourceInputs["vatId"] = state ? state.vatId : undefined;
        } else {
            const args = argsOrState as OrganizationBillingGroupArgs | undefined;
            if ((!args || args.billingAddressId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'billingAddressId'");
            }
            if ((!args || args.billingContactEmails === undefined) && !opts.urn) {
                throw new Error("Missing required property 'billingContactEmails'");
            }
            if ((!args || args.billingEmails === undefined) && !opts.urn) {
                throw new Error("Missing required property 'billingEmails'");
            }
            if ((!args || args.billingGroupName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'billingGroupName'");
            }
            if ((!args || args.organizationId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'organizationId'");
            }
            if ((!args || args.paymentMethodId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'paymentMethodId'");
            }
            if ((!args || args.shippingAddressId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'shippingAddressId'");
            }
            resourceInputs["billingAddressId"] = args ? args.billingAddressId : undefined;
            resourceInputs["billingContactEmails"] = args ? args.billingContactEmails : undefined;
            resourceInputs["billingCurrency"] = args ? args.billingCurrency : undefined;
            resourceInputs["billingEmails"] = args ? args.billingEmails : undefined;
            resourceInputs["billingGroupName"] = args ? args.billingGroupName : undefined;
            resourceInputs["customInvoiceText"] = args ? args.customInvoiceText : undefined;
            resourceInputs["organizationId"] = args ? args.organizationId : undefined;
            resourceInputs["paymentMethodId"] = args ? args.paymentMethodId : undefined;
            resourceInputs["shippingAddressId"] = args ? args.shippingAddressId : undefined;
            resourceInputs["timeouts"] = args ? args.timeouts : undefined;
            resourceInputs["vatId"] = args ? args.vatId : undefined;
            resourceInputs["billingGroupId"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(OrganizationBillingGroup.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering OrganizationBillingGroup resources.
 */
export interface OrganizationBillingGroupState {
    /**
     * ID of the billing address.
     */
    billingAddressId?: pulumi.Input<string>;
    /**
     * List of billing contact emails.
     */
    billingContactEmails?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Billing currency.
     */
    billingCurrency?: pulumi.Input<string>;
    /**
     * List of billing emails.
     */
    billingEmails?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * ID of the billing group.
     */
    billingGroupId?: pulumi.Input<string>;
    /**
     * Name of the billing group.
     */
    billingGroupName?: pulumi.Input<string>;
    /**
     * Custom invoice text.
     */
    customInvoiceText?: pulumi.Input<string>;
    /**
     * ID of the organization.
     */
    organizationId?: pulumi.Input<string>;
    /**
     * ID of the payment method.
     */
    paymentMethodId?: pulumi.Input<string>;
    /**
     * ID of the shipping address.
     */
    shippingAddressId?: pulumi.Input<string>;
    timeouts?: pulumi.Input<inputs.OrganizationBillingGroupTimeouts>;
    /**
     * VAT ID.
     */
    vatId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a OrganizationBillingGroup resource.
 */
export interface OrganizationBillingGroupArgs {
    /**
     * ID of the billing address.
     */
    billingAddressId: pulumi.Input<string>;
    /**
     * List of billing contact emails.
     */
    billingContactEmails: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Billing currency.
     */
    billingCurrency?: pulumi.Input<string>;
    /**
     * List of billing emails.
     */
    billingEmails: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Name of the billing group.
     */
    billingGroupName: pulumi.Input<string>;
    /**
     * Custom invoice text.
     */
    customInvoiceText?: pulumi.Input<string>;
    /**
     * ID of the organization.
     */
    organizationId: pulumi.Input<string>;
    /**
     * ID of the payment method.
     */
    paymentMethodId: pulumi.Input<string>;
    /**
     * ID of the shipping address.
     */
    shippingAddressId: pulumi.Input<string>;
    timeouts?: pulumi.Input<inputs.OrganizationBillingGroupTimeouts>;
    /**
     * VAT ID.
     */
    vatId?: pulumi.Input<string>;
}
