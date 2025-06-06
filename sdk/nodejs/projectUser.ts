// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Creates and manages an Aiven project member.
 *
 * > **This resource is deprecated**
 * Use `aiven.OrganizationPermission` instead and
 * migrate existing `aiven.ProjectUser` resources
 * to the new resource. **Do not use the `aiven.ProjectUser` and `aiven.OrganizationPermission` resources together**.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aiven from "@pulumi/aiven";
 *
 * const mytestuser = new aiven.ProjectUser("mytestuser", {
 *     project: myproject.project,
 *     email: "john.doe@example.com",
 *     memberType: "admin",
 * });
 * ```
 *
 * ## Import
 *
 * ```sh
 * $ pulumi import aiven:index/projectUser:ProjectUser mytestuser PROJECT/EMAIL
 * ```
 */
export class ProjectUser extends pulumi.CustomResource {
    /**
     * Get an existing ProjectUser resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ProjectUserState, opts?: pulumi.CustomResourceOptions): ProjectUser {
        return new ProjectUser(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aiven:index/projectUser:ProjectUser';

    /**
     * Returns true if the given object is an instance of ProjectUser.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ProjectUser {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ProjectUser.__pulumiType;
    }

    /**
     * Whether the user has accepted the request to join the project. Users get an invite and become project members after accepting the invite.
     */
    public /*out*/ readonly accepted!: pulumi.Output<boolean>;
    /**
     * Email address of the user in lowercase. Changing this property forces recreation of the resource.
     */
    public readonly email!: pulumi.Output<string>;
    /**
     * Project membership type. The possible values are `admin`, `developer`, `operator`, `organization:app_users:write`, `organization:audit_logs:read`, `organization:billing:read`, `organization:billing:write`, `organization:domains:write`, `organization:groups:write`, `organization:idps:write`, `organization:networking:read`, `organization:networking:write`, `organization:projects:write`, `organization:users:write`, `project:audit_logs:read`, `project:integrations:read`, `project:integrations:write`, `project:networking:read`, `project:networking:write`, `project:permissions:read`, `project:services:read`, `project:services:write`, `readOnly`, `role:organization:admin`, `role:services:maintenance`, `role:services:recover`, `service:configuration:write`, `service:data:write`, `service:logs:read`, `service:secrets:read` and `service:users:write`.
     */
    public readonly memberType!: pulumi.Output<string>;
    /**
     * The name of the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
     */
    public readonly project!: pulumi.Output<string>;

    /**
     * Create a ProjectUser resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ProjectUserArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ProjectUserArgs | ProjectUserState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ProjectUserState | undefined;
            resourceInputs["accepted"] = state ? state.accepted : undefined;
            resourceInputs["email"] = state ? state.email : undefined;
            resourceInputs["memberType"] = state ? state.memberType : undefined;
            resourceInputs["project"] = state ? state.project : undefined;
        } else {
            const args = argsOrState as ProjectUserArgs | undefined;
            if ((!args || args.email === undefined) && !opts.urn) {
                throw new Error("Missing required property 'email'");
            }
            if ((!args || args.memberType === undefined) && !opts.urn) {
                throw new Error("Missing required property 'memberType'");
            }
            if ((!args || args.project === undefined) && !opts.urn) {
                throw new Error("Missing required property 'project'");
            }
            resourceInputs["email"] = args ? args.email : undefined;
            resourceInputs["memberType"] = args ? args.memberType : undefined;
            resourceInputs["project"] = args ? args.project : undefined;
            resourceInputs["accepted"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(ProjectUser.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ProjectUser resources.
 */
export interface ProjectUserState {
    /**
     * Whether the user has accepted the request to join the project. Users get an invite and become project members after accepting the invite.
     */
    accepted?: pulumi.Input<boolean>;
    /**
     * Email address of the user in lowercase. Changing this property forces recreation of the resource.
     */
    email?: pulumi.Input<string>;
    /**
     * Project membership type. The possible values are `admin`, `developer`, `operator`, `organization:app_users:write`, `organization:audit_logs:read`, `organization:billing:read`, `organization:billing:write`, `organization:domains:write`, `organization:groups:write`, `organization:idps:write`, `organization:networking:read`, `organization:networking:write`, `organization:projects:write`, `organization:users:write`, `project:audit_logs:read`, `project:integrations:read`, `project:integrations:write`, `project:networking:read`, `project:networking:write`, `project:permissions:read`, `project:services:read`, `project:services:write`, `readOnly`, `role:organization:admin`, `role:services:maintenance`, `role:services:recover`, `service:configuration:write`, `service:data:write`, `service:logs:read`, `service:secrets:read` and `service:users:write`.
     */
    memberType?: pulumi.Input<string>;
    /**
     * The name of the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
     */
    project?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a ProjectUser resource.
 */
export interface ProjectUserArgs {
    /**
     * Email address of the user in lowercase. Changing this property forces recreation of the resource.
     */
    email: pulumi.Input<string>;
    /**
     * Project membership type. The possible values are `admin`, `developer`, `operator`, `organization:app_users:write`, `organization:audit_logs:read`, `organization:billing:read`, `organization:billing:write`, `organization:domains:write`, `organization:groups:write`, `organization:idps:write`, `organization:networking:read`, `organization:networking:write`, `organization:projects:write`, `organization:users:write`, `project:audit_logs:read`, `project:integrations:read`, `project:integrations:write`, `project:networking:read`, `project:networking:write`, `project:permissions:read`, `project:services:read`, `project:services:write`, `readOnly`, `role:organization:admin`, `role:services:maintenance`, `role:services:recover`, `service:configuration:write`, `service:data:write`, `service:logs:read`, `service:secrets:read` and `service:users:write`.
     */
    memberType: pulumi.Input<string>;
    /**
     * The name of the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
     */
    project: pulumi.Input<string>;
}
