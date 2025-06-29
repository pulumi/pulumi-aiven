// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aiven from "@pulumi/aiven";
 *
 * const exampleRole = new aiven.ClickhouseRole("example_role", {
 *     project: exampleProject.project,
 *     serviceName: exampleClickhouse.serviceName,
 *     role: "example-role",
 * });
 * // Grant privileges to the example role.
 * const rolePrivileges = new aiven.ClickhouseGrant("role_privileges", {
 *     project: exampleProject.project,
 *     serviceName: exampleClickhouse.serviceName,
 *     role: exampleRole.role,
 *     privilegeGrants: [
 *         {
 *             privilege: "INSERT",
 *             database: exampleDb.name,
 *             table: "example-table",
 *         },
 *         {
 *             privilege: "SELECT",
 *             database: exampleDb.name,
 *         },
 *         {
 *             privilege: "CREATE TEMPORARY TABLE",
 *             database: "*",
 *         },
 *         {
 *             privilege: "SYSTEM DROP CACHE",
 *             database: "*",
 *         },
 *     ],
 * });
 * // Grant the role to the user.
 * const exampleUser = new aiven.ClickhouseUser("example_user", {
 *     project: exampleProject.project,
 *     serviceName: exampleClickhouse.serviceName,
 *     username: "example-user",
 * });
 * const userRoleAssignment = new aiven.ClickhouseGrant("user_role_assignment", {
 *     project: exampleProject.project,
 *     serviceName: exampleClickhouse.serviceName,
 *     user: exampleUser.username,
 *     roleGrants: [{
 *         role: exampleRole.role,
 *     }],
 * });
 * ```
 *
 * ## Import
 *
 * ```sh
 * $ pulumi import aiven:index/clickhouseGrant:ClickhouseGrant example_grant PROJECT/SERVICE_NAME/ID
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
     * Grant privileges. Changing this property forces recreation of the resource.
     */
    public readonly privilegeGrants!: pulumi.Output<outputs.ClickhouseGrantPrivilegeGrant[] | undefined>;
    /**
     * The name of the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
     */
    public readonly project!: pulumi.Output<string>;
    /**
     * The role to grant privileges or roles to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
     */
    public readonly role!: pulumi.Output<string | undefined>;
    /**
     * Grant roles. Changing this property forces recreation of the resource.
     */
    public readonly roleGrants!: pulumi.Output<outputs.ClickhouseGrantRoleGrant[] | undefined>;
    /**
     * The name of the service that this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
     */
    public readonly serviceName!: pulumi.Output<string>;
    /**
     * The user to grant privileges or roles to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
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
     * Grant privileges. Changing this property forces recreation of the resource.
     */
    privilegeGrants?: pulumi.Input<pulumi.Input<inputs.ClickhouseGrantPrivilegeGrant>[]>;
    /**
     * The name of the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
     */
    project?: pulumi.Input<string>;
    /**
     * The role to grant privileges or roles to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
     */
    role?: pulumi.Input<string>;
    /**
     * Grant roles. Changing this property forces recreation of the resource.
     */
    roleGrants?: pulumi.Input<pulumi.Input<inputs.ClickhouseGrantRoleGrant>[]>;
    /**
     * The name of the service that this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
     */
    serviceName?: pulumi.Input<string>;
    /**
     * The user to grant privileges or roles to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
     */
    user?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a ClickhouseGrant resource.
 */
export interface ClickhouseGrantArgs {
    /**
     * Grant privileges. Changing this property forces recreation of the resource.
     */
    privilegeGrants?: pulumi.Input<pulumi.Input<inputs.ClickhouseGrantPrivilegeGrant>[]>;
    /**
     * The name of the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
     */
    project: pulumi.Input<string>;
    /**
     * The role to grant privileges or roles to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
     */
    role?: pulumi.Input<string>;
    /**
     * Grant roles. Changing this property forces recreation of the resource.
     */
    roleGrants?: pulumi.Input<pulumi.Input<inputs.ClickhouseGrantRoleGrant>[]>;
    /**
     * The name of the service that this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
     */
    serviceName: pulumi.Input<string>;
    /**
     * The user to grant privileges or roles to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
     */
    user?: pulumi.Input<string>;
}
