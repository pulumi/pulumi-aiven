// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

export class MirrorMakerReplicationFlow extends pulumi.CustomResource {
    /**
     * Get an existing MirrorMakerReplicationFlow resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: MirrorMakerReplicationFlowState, opts?: pulumi.CustomResourceOptions): MirrorMakerReplicationFlow {
        return new MirrorMakerReplicationFlow(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aiven:index/mirrorMakerReplicationFlow:MirrorMakerReplicationFlow';

    /**
     * Returns true if the given object is an instance of MirrorMakerReplicationFlow.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is MirrorMakerReplicationFlow {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === MirrorMakerReplicationFlow.__pulumiType;
    }

    /**
     * Enable of disable replication flows for a service
     */
    public readonly enable!: pulumi.Output<boolean>;
    /**
     * Project to link the kafka topic to
     */
    public readonly project!: pulumi.Output<string>;
    /**
     * Service to link the kafka topic to
     */
    public readonly serviceName!: pulumi.Output<string>;
    /**
     * Source cluster alias
     */
    public readonly sourceCluster!: pulumi.Output<string>;
    /**
     * Target cluster alias
     */
    public readonly targetCluster!: pulumi.Output<string>;
    /**
     * List of topics and/or regular expressions to replicate
     */
    public readonly topics!: pulumi.Output<string[] | undefined>;
    /**
     * List of topics and/or regular expressions to not replicate.
     */
    public readonly topicsBlacklists!: pulumi.Output<string[] | undefined>;

    /**
     * Create a MirrorMakerReplicationFlow resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: MirrorMakerReplicationFlowArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: MirrorMakerReplicationFlowArgs | MirrorMakerReplicationFlowState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        if (opts && opts.id) {
            const state = argsOrState as MirrorMakerReplicationFlowState | undefined;
            inputs["enable"] = state ? state.enable : undefined;
            inputs["project"] = state ? state.project : undefined;
            inputs["serviceName"] = state ? state.serviceName : undefined;
            inputs["sourceCluster"] = state ? state.sourceCluster : undefined;
            inputs["targetCluster"] = state ? state.targetCluster : undefined;
            inputs["topics"] = state ? state.topics : undefined;
            inputs["topicsBlacklists"] = state ? state.topicsBlacklists : undefined;
        } else {
            const args = argsOrState as MirrorMakerReplicationFlowArgs | undefined;
            if (!args || args.enable === undefined) {
                throw new Error("Missing required property 'enable'");
            }
            if (!args || args.project === undefined) {
                throw new Error("Missing required property 'project'");
            }
            if (!args || args.serviceName === undefined) {
                throw new Error("Missing required property 'serviceName'");
            }
            if (!args || args.sourceCluster === undefined) {
                throw new Error("Missing required property 'sourceCluster'");
            }
            if (!args || args.targetCluster === undefined) {
                throw new Error("Missing required property 'targetCluster'");
            }
            inputs["enable"] = args ? args.enable : undefined;
            inputs["project"] = args ? args.project : undefined;
            inputs["serviceName"] = args ? args.serviceName : undefined;
            inputs["sourceCluster"] = args ? args.sourceCluster : undefined;
            inputs["targetCluster"] = args ? args.targetCluster : undefined;
            inputs["topics"] = args ? args.topics : undefined;
            inputs["topicsBlacklists"] = args ? args.topicsBlacklists : undefined;
        }
        if (!opts) {
            opts = {}
        }

        if (!opts.version) {
            opts.version = utilities.getVersion();
        }
        super(MirrorMakerReplicationFlow.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering MirrorMakerReplicationFlow resources.
 */
export interface MirrorMakerReplicationFlowState {
    /**
     * Enable of disable replication flows for a service
     */
    readonly enable?: pulumi.Input<boolean>;
    /**
     * Project to link the kafka topic to
     */
    readonly project?: pulumi.Input<string>;
    /**
     * Service to link the kafka topic to
     */
    readonly serviceName?: pulumi.Input<string>;
    /**
     * Source cluster alias
     */
    readonly sourceCluster?: pulumi.Input<string>;
    /**
     * Target cluster alias
     */
    readonly targetCluster?: pulumi.Input<string>;
    /**
     * List of topics and/or regular expressions to replicate
     */
    readonly topics?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * List of topics and/or regular expressions to not replicate.
     */
    readonly topicsBlacklists?: pulumi.Input<pulumi.Input<string>[]>;
}

/**
 * The set of arguments for constructing a MirrorMakerReplicationFlow resource.
 */
export interface MirrorMakerReplicationFlowArgs {
    /**
     * Enable of disable replication flows for a service
     */
    readonly enable: pulumi.Input<boolean>;
    /**
     * Project to link the kafka topic to
     */
    readonly project: pulumi.Input<string>;
    /**
     * Service to link the kafka topic to
     */
    readonly serviceName: pulumi.Input<string>;
    /**
     * Source cluster alias
     */
    readonly sourceCluster: pulumi.Input<string>;
    /**
     * Target cluster alias
     */
    readonly targetCluster: pulumi.Input<string>;
    /**
     * List of topics and/or regular expressions to replicate
     */
    readonly topics?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * List of topics and/or regular expressions to not replicate.
     */
    readonly topicsBlacklists?: pulumi.Input<pulumi.Input<string>[]>;
}