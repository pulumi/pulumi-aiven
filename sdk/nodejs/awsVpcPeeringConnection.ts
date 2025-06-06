// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Creates and manages an AWS VPC peering connection with an Aiven VPC.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aiven from "@pulumi/aiven";
 *
 * const exampleVpc = new aiven.ProjectVpc("example_vpc", {
 *     project: exampleProject.project,
 *     cloudName: "aws-us-east-2",
 *     networkCidr: "192.168.1.0/24",
 * });
 * const awsToAivenPeering = new aiven.AwsVpcPeeringConnection("aws_to_aiven_peering", {
 *     vpcId: exampleVpc.id,
 *     awsAccountId: awsId,
 *     awsVpcId: "vpc-1a2b3c4d5e6f7g8h9",
 *     awsVpcRegion: "aws-us-east-2",
 * });
 * ```
 *
 * ## Import
 *
 * ```sh
 * $ pulumi import aiven:index/awsVpcPeeringConnection:AwsVpcPeeringConnection aws_to_aiven_peering PROJECT/VPC_ID/AWS_ACCOUNT_ID/AWS_VPC_ID/AWS_VPC_REGION
 * ```
 */
export class AwsVpcPeeringConnection extends pulumi.CustomResource {
    /**
     * Get an existing AwsVpcPeeringConnection resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: AwsVpcPeeringConnectionState, opts?: pulumi.CustomResourceOptions): AwsVpcPeeringConnection {
        return new AwsVpcPeeringConnection(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aiven:index/awsVpcPeeringConnection:AwsVpcPeeringConnection';

    /**
     * Returns true if the given object is an instance of AwsVpcPeeringConnection.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is AwsVpcPeeringConnection {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === AwsVpcPeeringConnection.__pulumiType;
    }

    /**
     * AWS account ID. Changing this property forces recreation of the resource.
     */
    public readonly awsAccountId!: pulumi.Output<string>;
    /**
     * AWS VPC ID. Changing this property forces recreation of the resource.
     */
    public readonly awsVpcId!: pulumi.Output<string>;
    /**
     * The ID of the AWS VPC peering connection.
     */
    public /*out*/ readonly awsVpcPeeringConnectionId!: pulumi.Output<string>;
    /**
     * The AWS region of the peered VPC, if different from the Aiven VPC region. Changing this property forces recreation of the resource.
     */
    public readonly awsVpcRegion!: pulumi.Output<string>;
    /**
     * The state of the peering connection.
     */
    public /*out*/ readonly state!: pulumi.Output<string>;
    /**
     * State-specific help or error information.
     */
    public /*out*/ readonly stateInfo!: pulumi.Output<{[key: string]: string}>;
    /**
     * The ID of the Aiven VPC. Changing this property forces recreation of the resource.
     */
    public readonly vpcId!: pulumi.Output<string>;

    /**
     * Create a AwsVpcPeeringConnection resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: AwsVpcPeeringConnectionArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: AwsVpcPeeringConnectionArgs | AwsVpcPeeringConnectionState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as AwsVpcPeeringConnectionState | undefined;
            resourceInputs["awsAccountId"] = state ? state.awsAccountId : undefined;
            resourceInputs["awsVpcId"] = state ? state.awsVpcId : undefined;
            resourceInputs["awsVpcPeeringConnectionId"] = state ? state.awsVpcPeeringConnectionId : undefined;
            resourceInputs["awsVpcRegion"] = state ? state.awsVpcRegion : undefined;
            resourceInputs["state"] = state ? state.state : undefined;
            resourceInputs["stateInfo"] = state ? state.stateInfo : undefined;
            resourceInputs["vpcId"] = state ? state.vpcId : undefined;
        } else {
            const args = argsOrState as AwsVpcPeeringConnectionArgs | undefined;
            if ((!args || args.awsAccountId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'awsAccountId'");
            }
            if ((!args || args.awsVpcId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'awsVpcId'");
            }
            if ((!args || args.awsVpcRegion === undefined) && !opts.urn) {
                throw new Error("Missing required property 'awsVpcRegion'");
            }
            if ((!args || args.vpcId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'vpcId'");
            }
            resourceInputs["awsAccountId"] = args ? args.awsAccountId : undefined;
            resourceInputs["awsVpcId"] = args ? args.awsVpcId : undefined;
            resourceInputs["awsVpcRegion"] = args ? args.awsVpcRegion : undefined;
            resourceInputs["vpcId"] = args ? args.vpcId : undefined;
            resourceInputs["awsVpcPeeringConnectionId"] = undefined /*out*/;
            resourceInputs["state"] = undefined /*out*/;
            resourceInputs["stateInfo"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(AwsVpcPeeringConnection.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering AwsVpcPeeringConnection resources.
 */
export interface AwsVpcPeeringConnectionState {
    /**
     * AWS account ID. Changing this property forces recreation of the resource.
     */
    awsAccountId?: pulumi.Input<string>;
    /**
     * AWS VPC ID. Changing this property forces recreation of the resource.
     */
    awsVpcId?: pulumi.Input<string>;
    /**
     * The ID of the AWS VPC peering connection.
     */
    awsVpcPeeringConnectionId?: pulumi.Input<string>;
    /**
     * The AWS region of the peered VPC, if different from the Aiven VPC region. Changing this property forces recreation of the resource.
     */
    awsVpcRegion?: pulumi.Input<string>;
    /**
     * The state of the peering connection.
     */
    state?: pulumi.Input<string>;
    /**
     * State-specific help or error information.
     */
    stateInfo?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The ID of the Aiven VPC. Changing this property forces recreation of the resource.
     */
    vpcId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a AwsVpcPeeringConnection resource.
 */
export interface AwsVpcPeeringConnectionArgs {
    /**
     * AWS account ID. Changing this property forces recreation of the resource.
     */
    awsAccountId: pulumi.Input<string>;
    /**
     * AWS VPC ID. Changing this property forces recreation of the resource.
     */
    awsVpcId: pulumi.Input<string>;
    /**
     * The AWS region of the peered VPC, if different from the Aiven VPC region. Changing this property forces recreation of the resource.
     */
    awsVpcRegion: pulumi.Input<string>;
    /**
     * The ID of the Aiven VPC. Changing this property forces recreation of the resource.
     */
    vpcId: pulumi.Input<string>;
}
