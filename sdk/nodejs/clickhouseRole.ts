// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * The Clickhouse Role resource allows the creation and management of Roles in Aiven Clickhouse services
 *
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aiven from "@pulumi/aiven";
 *
 * const bar = new aiven.Clickhouse("bar", {
 *     project: "example-project",
 *     cloudName: "google-europe-west1",
 *     plan: "startup-beta-8",
 *     serviceName: "example-service",
 *     maintenanceWindowDow: "monday",
 *     maintenanceWindowTime: "10:00:00",
 * });
 * const foo = new aiven.ClickhouseRole("foo", {
 *     serviceName: bar.serviceName,
 *     project: bar.project,
 *     role: "writer",
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * ## Import
 *
 * ```sh
 * $ pulumi import aiven:index/clickhouseRole:ClickhouseRole foo project/service_name/role
 * ```
 */
export class ClickhouseRole extends pulumi.CustomResource {
    /**
     * Get an existing ClickhouseRole resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ClickhouseRoleState, opts?: pulumi.CustomResourceOptions): ClickhouseRole {
        return new ClickhouseRole(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aiven:index/clickhouseRole:ClickhouseRole';

    /**
     * Returns true if the given object is an instance of ClickhouseRole.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ClickhouseRole {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ClickhouseRole.__pulumiType;
    }

    /**
     * Identifies the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
     */
    public readonly project!: pulumi.Output<string>;
    /**
     * The role that is to be created. Changing this property forces recreation of the resource.
     */
    public readonly role!: pulumi.Output<string>;
    /**
     * Specifies the name of the service that this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
     */
    public readonly serviceName!: pulumi.Output<string>;

    /**
     * Create a ClickhouseRole resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ClickhouseRoleArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ClickhouseRoleArgs | ClickhouseRoleState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ClickhouseRoleState | undefined;
            resourceInputs["project"] = state ? state.project : undefined;
            resourceInputs["role"] = state ? state.role : undefined;
            resourceInputs["serviceName"] = state ? state.serviceName : undefined;
        } else {
            const args = argsOrState as ClickhouseRoleArgs | undefined;
            if ((!args || args.project === undefined) && !opts.urn) {
                throw new Error("Missing required property 'project'");
            }
            if ((!args || args.role === undefined) && !opts.urn) {
                throw new Error("Missing required property 'role'");
            }
            if ((!args || args.serviceName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'serviceName'");
            }
            resourceInputs["project"] = args ? args.project : undefined;
            resourceInputs["role"] = args ? args.role : undefined;
            resourceInputs["serviceName"] = args ? args.serviceName : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(ClickhouseRole.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ClickhouseRole resources.
 */
export interface ClickhouseRoleState {
    /**
     * Identifies the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
     */
    project?: pulumi.Input<string>;
    /**
     * The role that is to be created. Changing this property forces recreation of the resource.
     */
    role?: pulumi.Input<string>;
    /**
     * Specifies the name of the service that this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
     */
    serviceName?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a ClickhouseRole resource.
 */
export interface ClickhouseRoleArgs {
    /**
     * Identifies the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
     */
    project: pulumi.Input<string>;
    /**
     * The role that is to be created. Changing this property forces recreation of the resource.
     */
    role: pulumi.Input<string>;
    /**
     * Specifies the name of the service that this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
     */
    serviceName: pulumi.Input<string>;
}
