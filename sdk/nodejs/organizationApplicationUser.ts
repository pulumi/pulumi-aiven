// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Creates and manages an organization application user. [Application users](https://aiven.io/docs/platform/concepts/application-users) can be used for
 * programmatic access to the platform using a token created with the `aiven.OrganizationApplicationUserToken` resource.
 *
 * You give application users access to your organization, projects, and services using the `aiven.OrganizationPermission` resource. You can also add application users to
 * groups using the `aiven.OrganizationUserGroupMember` resource.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aiven from "@pulumi/aiven";
 *
 * const tfUser = new aiven.OrganizationApplicationUser("tf_user", {
 *     organizationId: main.id,
 *     name: "app-terraform",
 * });
 * ```
 *
 * ## Import
 *
 * ```sh
 * $ pulumi import aiven:index/organizationApplicationUser:OrganizationApplicationUser example ORGANIZATION_ID/USER_ID
 * ```
 */
export class OrganizationApplicationUser extends pulumi.CustomResource {
    /**
     * Get an existing OrganizationApplicationUser resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: OrganizationApplicationUserState, opts?: pulumi.CustomResourceOptions): OrganizationApplicationUser {
        return new OrganizationApplicationUser(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aiven:index/organizationApplicationUser:OrganizationApplicationUser';

    /**
     * Returns true if the given object is an instance of OrganizationApplicationUser.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is OrganizationApplicationUser {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === OrganizationApplicationUser.__pulumiType;
    }

    /**
     * An email address automatically generated by Aiven to help identify the application user. No notifications are sent to this email.
     */
    public /*out*/ readonly email!: pulumi.Output<string>;
    /**
     * Makes the application user a super admin. The super admin role has completely unrestricted access to all organization resources and settings. This role should be limited to as few users as possible. For daily administrative tasks, assign users the organization admin role instead using the `aiven.OrganizationPermission` resource.
     *
     * @deprecated This field is deprecated and will be removed in the next major release. For administrative tasks, assign application users the organization admin role instead using the aiven.OrganizationPermission resource.
     */
    public readonly isSuperAdmin!: pulumi.Output<boolean | undefined>;
    /**
     * Name of the application user.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The ID of the organization the application user belongs to.
     */
    public readonly organizationId!: pulumi.Output<string>;
    /**
     * The ID of the application user.
     */
    public /*out*/ readonly userId!: pulumi.Output<string>;

    /**
     * Create a OrganizationApplicationUser resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: OrganizationApplicationUserArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: OrganizationApplicationUserArgs | OrganizationApplicationUserState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as OrganizationApplicationUserState | undefined;
            resourceInputs["email"] = state ? state.email : undefined;
            resourceInputs["isSuperAdmin"] = state ? state.isSuperAdmin : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["organizationId"] = state ? state.organizationId : undefined;
            resourceInputs["userId"] = state ? state.userId : undefined;
        } else {
            const args = argsOrState as OrganizationApplicationUserArgs | undefined;
            if ((!args || args.organizationId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'organizationId'");
            }
            resourceInputs["isSuperAdmin"] = args ? args.isSuperAdmin : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["organizationId"] = args ? args.organizationId : undefined;
            resourceInputs["email"] = undefined /*out*/;
            resourceInputs["userId"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(OrganizationApplicationUser.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering OrganizationApplicationUser resources.
 */
export interface OrganizationApplicationUserState {
    /**
     * An email address automatically generated by Aiven to help identify the application user. No notifications are sent to this email.
     */
    email?: pulumi.Input<string>;
    /**
     * Makes the application user a super admin. The super admin role has completely unrestricted access to all organization resources and settings. This role should be limited to as few users as possible. For daily administrative tasks, assign users the organization admin role instead using the `aiven.OrganizationPermission` resource.
     *
     * @deprecated This field is deprecated and will be removed in the next major release. For administrative tasks, assign application users the organization admin role instead using the aiven.OrganizationPermission resource.
     */
    isSuperAdmin?: pulumi.Input<boolean>;
    /**
     * Name of the application user.
     */
    name?: pulumi.Input<string>;
    /**
     * The ID of the organization the application user belongs to.
     */
    organizationId?: pulumi.Input<string>;
    /**
     * The ID of the application user.
     */
    userId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a OrganizationApplicationUser resource.
 */
export interface OrganizationApplicationUserArgs {
    /**
     * Makes the application user a super admin. The super admin role has completely unrestricted access to all organization resources and settings. This role should be limited to as few users as possible. For daily administrative tasks, assign users the organization admin role instead using the `aiven.OrganizationPermission` resource.
     *
     * @deprecated This field is deprecated and will be removed in the next major release. For administrative tasks, assign application users the organization admin role instead using the aiven.OrganizationPermission resource.
     */
    isSuperAdmin?: pulumi.Input<boolean>;
    /**
     * Name of the application user.
     */
    name?: pulumi.Input<string>;
    /**
     * The ID of the organization the application user belongs to.
     */
    organizationId: pulumi.Input<string>;
}
