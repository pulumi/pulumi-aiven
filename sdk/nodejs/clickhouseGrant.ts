// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "./types";
import * as utilities from "./utilities";

/**
 * The Clickhouse Grant resource allows the creation and management of Grants in Aiven Clickhouse services.
 *
 * Notes:
 * * Due to a ambiguity in the GRANT syntax in clickhouse you should not have users and roles with the same name. It is not clear if a grant refers to the user or the role.
 * * Currently changes will first revoke all grants and then reissue the remaining grants for convergence.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aiven from "@pulumi/aiven";
 *
 * const clickhouse = new aiven.Clickhouse("clickhouse", {
 *     project: _var.aiven_project_name,
 *     cloudName: "google-europe-west1",
 *     plan: "startup-8",
 *     serviceName: "exapmle-clickhouse",
 * });
 * const demodb = new aiven.ClickhouseDatabase("demodb", {
 *     project: clickhouse.project,
 *     serviceName: clickhouse.serviceName,
 * });
 * const demoClickhouseRole = new aiven.ClickhouseRole("demoClickhouseRole", {
 *     project: clickhouse.project,
 *     serviceName: clickhouse.serviceName,
 *     role: "demo-role",
 * });
 * const demo_role_grant = new aiven.ClickhouseGrant("demo-role-grant", {
 *     project: clickhouse.project,
 *     serviceName: clickhouse.serviceName,
 *     role: demoClickhouseRole.role,
 *     privilegeGrants: [
 *         {
 *             privilege: "INSERT",
 *             database: demodb.name,
 *             table: "*",
 *         },
 *         {
 *             privilege: "SELECT",
 *             database: demodb.name,
 *             table: "*",
 *         },
 *     ],
 * });
 * const demoClickhouseUser = new aiven.ClickhouseUser("demoClickhouseUser", {
 *     project: clickhouse.project,
 *     serviceName: clickhouse.serviceName,
 *     username: "demo-user",
 * });
 * const demo_user_grant = new aiven.ClickhouseGrant("demo-user-grant", {
 *     project: clickhouse.project,
 *     serviceName: clickhouse.serviceName,
 *     user: demoClickhouseUser.username,
 *     roleGrants: [{
 *         role: demoClickhouseRole.role,
 *     }],
 * });
 * ```
 */
export class ClickhouseGrant extends pulumi.CustomResource {
    /**
     * Get an existing ClickhouseGrant resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ClickhouseGrantState, opts?: pulumi.CustomResourceOptions): ClickhouseGrant {
        return new ClickhouseGrant(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aiven:index/clickhouseGrant:ClickhouseGrant';

    /**
     * Returns true if the given object is an instance of ClickhouseGrant.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ClickhouseGrant {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ClickhouseGrant.__pulumiType;
    }

    /**
     * Configuration to grant a privilege. This property cannot be changed, doing so forces recreation of the resource.
     */
    public readonly privilegeGrants!: pulumi.Output<outputs.ClickhouseGrantPrivilegeGrant[] | undefined>;
    /**
     * Identifies the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. This property cannot be changed, doing so forces recreation of the resource.
     */
    public readonly project!: pulumi.Output<string>;
    /**
     * The role to grant privileges or roles to. To set up proper dependencies please refer to this variable as a reference. This property cannot be changed, doing so forces recreation of the resource.
     */
    public readonly role!: pulumi.Output<string | undefined>;
    /**
     * Configuration to grant a role. This property cannot be changed, doing so forces recreation of the resource.
     */
    public readonly roleGrants!: pulumi.Output<outputs.ClickhouseGrantRoleGrant[] | undefined>;
    /**
     * Specifies the name of the service that this resource belongs to. To set up proper dependencies please refer to this variable as a reference. This property cannot be changed, doing so forces recreation of the resource.
     */
    public readonly serviceName!: pulumi.Output<string>;
    /**
     * The user to grant privileges or roles to. To set up proper dependencies please refer to this variable as a reference. This property cannot be changed, doing so forces recreation of the resource.
     */
    public readonly user!: pulumi.Output<string | undefined>;

    /**
     * Create a ClickhouseGrant resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ClickhouseGrantArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ClickhouseGrantArgs | ClickhouseGrantState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ClickhouseGrantState | undefined;
            resourceInputs["privilegeGrants"] = state ? state.privilegeGrants : undefined;
            resourceInputs["project"] = state ? state.project : undefined;
            resourceInputs["role"] = state ? state.role : undefined;
            resourceInputs["roleGrants"] = state ? state.roleGrants : undefined;
            resourceInputs["serviceName"] = state ? state.serviceName : undefined;
            resourceInputs["user"] = state ? state.user : undefined;
        } else {
            const args = argsOrState as ClickhouseGrantArgs | undefined;
            if ((!args || args.project === undefined) && !opts.urn) {
                throw new Error("Missing required property 'project'");
            }
            if ((!args || args.serviceName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'serviceName'");
            }
            resourceInputs["privilegeGrants"] = args ? args.privilegeGrants : undefined;
            resourceInputs["project"] = args ? args.project : undefined;
            resourceInputs["role"] = args ? args.role : undefined;
            resourceInputs["roleGrants"] = args ? args.roleGrants : undefined;
            resourceInputs["serviceName"] = args ? args.serviceName : undefined;
            resourceInputs["user"] = args ? args.user : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(ClickhouseGrant.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ClickhouseGrant resources.
 */
export interface ClickhouseGrantState {
    /**
     * Configuration to grant a privilege. This property cannot be changed, doing so forces recreation of the resource.
     */
    privilegeGrants?: pulumi.Input<pulumi.Input<inputs.ClickhouseGrantPrivilegeGrant>[]>;
    /**
     * Identifies the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. This property cannot be changed, doing so forces recreation of the resource.
     */
    project?: pulumi.Input<string>;
    /**
     * The role to grant privileges or roles to. To set up proper dependencies please refer to this variable as a reference. This property cannot be changed, doing so forces recreation of the resource.
     */
    role?: pulumi.Input<string>;
    /**
     * Configuration to grant a role. This property cannot be changed, doing so forces recreation of the resource.
     */
    roleGrants?: pulumi.Input<pulumi.Input<inputs.ClickhouseGrantRoleGrant>[]>;
    /**
     * Specifies the name of the service that this resource belongs to. To set up proper dependencies please refer to this variable as a reference. This property cannot be changed, doing so forces recreation of the resource.
     */
    serviceName?: pulumi.Input<string>;
    /**
     * The user to grant privileges or roles to. To set up proper dependencies please refer to this variable as a reference. This property cannot be changed, doing so forces recreation of the resource.
     */
    user?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a ClickhouseGrant resource.
 */
export interface ClickhouseGrantArgs {
    /**
     * Configuration to grant a privilege. This property cannot be changed, doing so forces recreation of the resource.
     */
    privilegeGrants?: pulumi.Input<pulumi.Input<inputs.ClickhouseGrantPrivilegeGrant>[]>;
    /**
     * Identifies the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. This property cannot be changed, doing so forces recreation of the resource.
     */
    project: pulumi.Input<string>;
    /**
     * The role to grant privileges or roles to. To set up proper dependencies please refer to this variable as a reference. This property cannot be changed, doing so forces recreation of the resource.
     */
    role?: pulumi.Input<string>;
    /**
     * Configuration to grant a role. This property cannot be changed, doing so forces recreation of the resource.
     */
    roleGrants?: pulumi.Input<pulumi.Input<inputs.ClickhouseGrantRoleGrant>[]>;
    /**
     * Specifies the name of the service that this resource belongs to. To set up proper dependencies please refer to this variable as a reference. This property cannot be changed, doing so forces recreation of the resource.
     */
    serviceName: pulumi.Input<string>;
    /**
     * The user to grant privileges or roles to. To set up proper dependencies please refer to this variable as a reference. This property cannot be changed, doing so forces recreation of the resource.
     */
    user?: pulumi.Input<string>;
}