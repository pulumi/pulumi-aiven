// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Creates and manages an Azure VPC peering connection with an Aiven VPC.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aiven from "@pulumi/aiven";
 *
 * const exampleVpc = new aiven.ProjectVpc("example_vpc", {
 *     project: exampleProject.project,
 *     cloudName: "google-europe-west1",
 *     networkCidr: "192.168.1.0/24",
 * });
 * const azureToAivenPeering = new aiven.AzureVpcPeeringConnection("azure_to_aiven_peering", {
 *     vpcId: exampleVpc.id,
 *     azureSubscriptionId: "00000000-0000-0000-0000-000000000000",
 *     peerResourceGroup: "example-resource-group",
 *     vnetName: "example-vnet",
 *     peerAzureAppId: "00000000-0000-0000-0000-000000000000",
 *     peerAzureTenantId: "00000000-0000-0000-0000-000000000000",
 * });
 * ```
 *
 * ## Import
 *
 * ```sh
 * $ pulumi import aiven:index/azureVpcPeeringConnection:AzureVpcPeeringConnection azure_to_aiven_peering PROJECT/VPC_ID/AZURE_SUBSCRIPTION_ID/VNET_NAME
 * ```
 */
export class AzureVpcPeeringConnection extends pulumi.CustomResource {
    /**
     * Get an existing AzureVpcPeeringConnection resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: AzureVpcPeeringConnectionState, opts?: pulumi.CustomResourceOptions): AzureVpcPeeringConnection {
        return new AzureVpcPeeringConnection(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aiven:index/azureVpcPeeringConnection:AzureVpcPeeringConnection';

    /**
     * Returns true if the given object is an instance of AzureVpcPeeringConnection.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is AzureVpcPeeringConnection {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === AzureVpcPeeringConnection.__pulumiType;
    }

    /**
     * The ID of the Azure subscription in UUID4 format. Changing this property forces recreation of the resource.
     */
    public readonly azureSubscriptionId!: pulumi.Output<string>;
    /**
     * The ID of the Azure app that is allowed to create a peering to the Azure Virtual Network (VNet) in UUID4 format. Changing this property forces recreation of the resource.
     */
    public readonly peerAzureAppId!: pulumi.Output<string>;
    /**
     * The Azure tenant ID in UUID4 format. Changing this property forces recreation of the resource.
     */
    public readonly peerAzureTenantId!: pulumi.Output<string>;
    /**
     * The name of the Azure resource group associated with the VNet. Changing this property forces recreation of the resource.
     */
    public readonly peerResourceGroup!: pulumi.Output<string>;
    /**
     * The ID of the cloud provider for the peering connection.
     */
    public /*out*/ readonly peeringConnectionId!: pulumi.Output<string>;
    /**
     * State of the peering connection
     */
    public /*out*/ readonly state!: pulumi.Output<string>;
    /**
     * State-specific help or error information.
     */
    public /*out*/ readonly stateInfo!: pulumi.Output<{[key: string]: string}>;
    /**
     * The name of the Azure VNet. Changing this property forces recreation of the resource.
     */
    public readonly vnetName!: pulumi.Output<string>;
    /**
     * The ID of the Aiven VPC. Changing this property forces recreation of the resource.
     */
    public readonly vpcId!: pulumi.Output<string>;

    /**
     * Create a AzureVpcPeeringConnection resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: AzureVpcPeeringConnectionArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: AzureVpcPeeringConnectionArgs | AzureVpcPeeringConnectionState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as AzureVpcPeeringConnectionState | undefined;
            resourceInputs["azureSubscriptionId"] = state ? state.azureSubscriptionId : undefined;
            resourceInputs["peerAzureAppId"] = state ? state.peerAzureAppId : undefined;
            resourceInputs["peerAzureTenantId"] = state ? state.peerAzureTenantId : undefined;
            resourceInputs["peerResourceGroup"] = state ? state.peerResourceGroup : undefined;
            resourceInputs["peeringConnectionId"] = state ? state.peeringConnectionId : undefined;
            resourceInputs["state"] = state ? state.state : undefined;
            resourceInputs["stateInfo"] = state ? state.stateInfo : undefined;
            resourceInputs["vnetName"] = state ? state.vnetName : undefined;
            resourceInputs["vpcId"] = state ? state.vpcId : undefined;
        } else {
            const args = argsOrState as AzureVpcPeeringConnectionArgs | undefined;
            if ((!args || args.azureSubscriptionId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'azureSubscriptionId'");
            }
            if ((!args || args.peerAzureAppId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'peerAzureAppId'");
            }
            if ((!args || args.peerAzureTenantId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'peerAzureTenantId'");
            }
            if ((!args || args.peerResourceGroup === undefined) && !opts.urn) {
                throw new Error("Missing required property 'peerResourceGroup'");
            }
            if ((!args || args.vnetName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'vnetName'");
            }
            if ((!args || args.vpcId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'vpcId'");
            }
            resourceInputs["azureSubscriptionId"] = args ? args.azureSubscriptionId : undefined;
            resourceInputs["peerAzureAppId"] = args ? args.peerAzureAppId : undefined;
            resourceInputs["peerAzureTenantId"] = args ? args.peerAzureTenantId : undefined;
            resourceInputs["peerResourceGroup"] = args ? args.peerResourceGroup : undefined;
            resourceInputs["vnetName"] = args ? args.vnetName : undefined;
            resourceInputs["vpcId"] = args ? args.vpcId : undefined;
            resourceInputs["peeringConnectionId"] = undefined /*out*/;
            resourceInputs["state"] = undefined /*out*/;
            resourceInputs["stateInfo"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(AzureVpcPeeringConnection.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering AzureVpcPeeringConnection resources.
 */
export interface AzureVpcPeeringConnectionState {
    /**
     * The ID of the Azure subscription in UUID4 format. Changing this property forces recreation of the resource.
     */
    azureSubscriptionId?: pulumi.Input<string>;
    /**
     * The ID of the Azure app that is allowed to create a peering to the Azure Virtual Network (VNet) in UUID4 format. Changing this property forces recreation of the resource.
     */
    peerAzureAppId?: pulumi.Input<string>;
    /**
     * The Azure tenant ID in UUID4 format. Changing this property forces recreation of the resource.
     */
    peerAzureTenantId?: pulumi.Input<string>;
    /**
     * The name of the Azure resource group associated with the VNet. Changing this property forces recreation of the resource.
     */
    peerResourceGroup?: pulumi.Input<string>;
    /**
     * The ID of the cloud provider for the peering connection.
     */
    peeringConnectionId?: pulumi.Input<string>;
    /**
     * State of the peering connection
     */
    state?: pulumi.Input<string>;
    /**
     * State-specific help or error information.
     */
    stateInfo?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The name of the Azure VNet. Changing this property forces recreation of the resource.
     */
    vnetName?: pulumi.Input<string>;
    /**
     * The ID of the Aiven VPC. Changing this property forces recreation of the resource.
     */
    vpcId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a AzureVpcPeeringConnection resource.
 */
export interface AzureVpcPeeringConnectionArgs {
    /**
     * The ID of the Azure subscription in UUID4 format. Changing this property forces recreation of the resource.
     */
    azureSubscriptionId: pulumi.Input<string>;
    /**
     * The ID of the Azure app that is allowed to create a peering to the Azure Virtual Network (VNet) in UUID4 format. Changing this property forces recreation of the resource.
     */
    peerAzureAppId: pulumi.Input<string>;
    /**
     * The Azure tenant ID in UUID4 format. Changing this property forces recreation of the resource.
     */
    peerAzureTenantId: pulumi.Input<string>;
    /**
     * The name of the Azure resource group associated with the VNet. Changing this property forces recreation of the resource.
     */
    peerResourceGroup: pulumi.Input<string>;
    /**
     * The name of the Azure VNet. Changing this property forces recreation of the resource.
     */
    vnetName: pulumi.Input<string>;
    /**
     * The ID of the Aiven VPC. Changing this property forces recreation of the resource.
     */
    vpcId: pulumi.Input<string>;
}
