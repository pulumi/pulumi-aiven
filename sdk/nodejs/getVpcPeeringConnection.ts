// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "./types";
import * as utilities from "./utilities";

/**
 * ## # VPC Peering Connection Data Source
 *
 * The VPC Peering Connection data source provides information about the existing Aiven
 * VPC Peering Connection.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aiven from "@pulumi/aiven";
 *
 * const mypeeringconnection = aiven.getVpcPeeringConnection({
 *     vpcId: aiven_project_vpc.myvpc.id,
 *     peerCloudAccount: "<PEER_ACCOUNT_ID>",
 *     peerVpc: "<PEER_VPC_ID/NAME>",
 * });
 * ```
 */
export function getVpcPeeringConnection(args: GetVpcPeeringConnectionArgs, opts?: pulumi.InvokeOptions): Promise<GetVpcPeeringConnectionResult> {
    if (!opts) {
        opts = {}
    }

    if (!opts.version) {
        opts.version = utilities.getVersion();
    }
    return pulumi.runtime.invoke("aiven:index/getVpcPeeringConnection:getVpcPeeringConnection", {
        "peerAzureAppId": args.peerAzureAppId,
        "peerAzureTenantId": args.peerAzureTenantId,
        "peerCloudAccount": args.peerCloudAccount,
        "peerRegion": args.peerRegion,
        "peerResourceGroup": args.peerResourceGroup,
        "peerVpc": args.peerVpc,
        "peeringConnectionId": args.peeringConnectionId,
        "state": args.state,
        "stateInfo": args.stateInfo,
        "vpcId": args.vpcId,
    }, opts);
}

/**
 * A collection of arguments for invoking getVpcPeeringConnection.
 */
export interface GetVpcPeeringConnectionArgs {
    /**
     * an Azure app registration id in UUID4 form that is allowed to create a peering to the peer vnet.
     */
    peerAzureAppId?: string;
    /**
     * an Azure tenant id in UUID4 form.
     */
    peerAzureTenantId?: string;
    /**
     * defines the identifier of the cloud account the VPC is being
     * peered with.
     */
    peerCloudAccount: string;
    /**
     * defines the region of the remote VPC if it is not in the same region as Aiven VPC.
     */
    peerRegion?: string;
    /**
     * an Azure resource group name of the peered VPC.
     */
    peerResourceGroup?: string;
    /**
     * defines the identifier or name of the remote VPC.
     */
    peerVpc: string;
    /**
     * a cloud provider identifier for the peering connection if available.
     */
    peeringConnectionId?: string;
    /**
     * is the state of the peering connection. This property is computed by Aiven 
     * therefore cannot be set, only read. Where state can be one of: `APPROVED`,
     * `PENDING_PEER`, `ACTIVE`, `DELETED`, `DELETED_BY_PEER`, `REJECTED_BY_PEER` and
     * `INVALID_SPECIFICATION`.
     */
    state?: string;
    /**
     * state-specific help or error information.
     */
    stateInfo?: {[key: string]: any};
    /**
     * is the Aiven VPC the peering connection is associated with.
     */
    vpcId: string;
}

/**
 * A collection of values returned by getVpcPeeringConnection.
 */
export interface GetVpcPeeringConnectionResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * an Azure app registration id in UUID4 form that is allowed to create a peering to the peer vnet.
     */
    readonly peerAzureAppId?: string;
    /**
     * an Azure tenant id in UUID4 form.
     */
    readonly peerAzureTenantId?: string;
    readonly peerCloudAccount: string;
    /**
     * defines the region of the remote VPC if it is not in the same region as Aiven VPC.
     */
    readonly peerRegion?: string;
    /**
     * an Azure resource group name of the peered VPC.
     */
    readonly peerResourceGroup?: string;
    readonly peerVpc: string;
    /**
     * a cloud provider identifier for the peering connection if available.
     */
    readonly peeringConnectionId: string;
    /**
     * is the state of the peering connection. This property is computed by Aiven 
     * therefore cannot be set, only read. Where state can be one of: `APPROVED`,
     * `PENDING_PEER`, `ACTIVE`, `DELETED`, `DELETED_BY_PEER`, `REJECTED_BY_PEER` and
     * `INVALID_SPECIFICATION`.
     */
    readonly state: string;
    /**
     * state-specific help or error information.
     */
    readonly stateInfo: {[key: string]: any};
    readonly vpcId: string;
}
