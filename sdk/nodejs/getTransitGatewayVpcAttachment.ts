// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

export function getTransitGatewayVpcAttachment(args: GetTransitGatewayVpcAttachmentArgs, opts?: pulumi.InvokeOptions): Promise<GetTransitGatewayVpcAttachmentResult> {
    if (!opts) {
        opts = {}
    }

    if (!opts.version) {
        opts.version = utilities.getVersion();
    }
    return pulumi.runtime.invoke("aiven:index/getTransitGatewayVpcAttachment:getTransitGatewayVpcAttachment", {
        "peerCloudAccount": args.peerCloudAccount,
        "peerRegion": args.peerRegion,
        "peerVpc": args.peerVpc,
        "peeringConnectionId": args.peeringConnectionId,
        "state": args.state,
        "stateInfo": args.stateInfo,
        "userPeerNetworkCidrs": args.userPeerNetworkCidrs,
        "vpcId": args.vpcId,
    }, opts);
}

/**
 * A collection of arguments for invoking getTransitGatewayVpcAttachment.
 */
export interface GetTransitGatewayVpcAttachmentArgs {
    readonly peerCloudAccount: string;
    readonly peerRegion?: string;
    readonly peerVpc: string;
    readonly peeringConnectionId?: string;
    readonly state?: string;
    readonly stateInfo?: {[key: string]: any};
    readonly userPeerNetworkCidrs?: string[];
    readonly vpcId: string;
}

/**
 * A collection of values returned by getTransitGatewayVpcAttachment.
 */
export interface GetTransitGatewayVpcAttachmentResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly peerCloudAccount: string;
    readonly peerRegion?: string;
    readonly peerVpc: string;
    readonly peeringConnectionId: string;
    readonly state: string;
    readonly stateInfo: {[key: string]: any};
    readonly userPeerNetworkCidrs?: string[];
    readonly vpcId: string;
}