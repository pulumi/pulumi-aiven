// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * The Cassandra User resource allows the creation and management of Aiven Cassandra Users.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aiven from "@pulumi/aiven";
 *
 * const foo = new aiven.CassandraUser("foo", {
 *     serviceName: aiven_cassandra.bar.service_name,
 *     project: "my-project",
 *     username: "user-1",
 *     password: `Test$1234`,
 * });
 * ```
 */
export class CassandraUser extends pulumi.CustomResource {
    /**
     * Get an existing CassandraUser resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: CassandraUserState, opts?: pulumi.CustomResourceOptions): CassandraUser {
        return new CassandraUser(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aiven:index/cassandraUser:CassandraUser';

    /**
     * Returns true if the given object is an instance of CassandraUser.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is CassandraUser {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === CassandraUser.__pulumiType;
    }

    /**
     * Access certificate for the user if applicable for the service in question
     */
    public /*out*/ readonly accessCert!: pulumi.Output<string>;
    /**
     * Access certificate key for the user if applicable for the service in question
     */
    public /*out*/ readonly accessKey!: pulumi.Output<string>;
    /**
     * The password of the Cassandra User.
     */
    public readonly password!: pulumi.Output<string>;
    /**
     * Identifies the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. This property cannot be changed, doing so forces recreation of the resource.
     */
    public readonly project!: pulumi.Output<string>;
    /**
     * Specifies the name of the service that this resource belongs to. To set up proper dependencies please refer to this variable as a reference. This property cannot be changed, doing so forces recreation of the resource.
     */
    public readonly serviceName!: pulumi.Output<string>;
    /**
     * Type of the user account. Tells whether the user is the primary account or a regular account.
     */
    public /*out*/ readonly type!: pulumi.Output<string>;
    /**
     * The actual name of the Cassandra User. To set up proper dependencies please refer to this variable as a reference. This property cannot be changed, doing so forces recreation of the resource.
     */
    public readonly username!: pulumi.Output<string>;

    /**
     * Create a CassandraUser resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: CassandraUserArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: CassandraUserArgs | CassandraUserState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as CassandraUserState | undefined;
            resourceInputs["accessCert"] = state ? state.accessCert : undefined;
            resourceInputs["accessKey"] = state ? state.accessKey : undefined;
            resourceInputs["password"] = state ? state.password : undefined;
            resourceInputs["project"] = state ? state.project : undefined;
            resourceInputs["serviceName"] = state ? state.serviceName : undefined;
            resourceInputs["type"] = state ? state.type : undefined;
            resourceInputs["username"] = state ? state.username : undefined;
        } else {
            const args = argsOrState as CassandraUserArgs | undefined;
            if ((!args || args.project === undefined) && !opts.urn) {
                throw new Error("Missing required property 'project'");
            }
            if ((!args || args.serviceName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'serviceName'");
            }
            if ((!args || args.username === undefined) && !opts.urn) {
                throw new Error("Missing required property 'username'");
            }
            resourceInputs["password"] = args?.password ? pulumi.secret(args.password) : undefined;
            resourceInputs["project"] = args ? args.project : undefined;
            resourceInputs["serviceName"] = args ? args.serviceName : undefined;
            resourceInputs["username"] = args ? args.username : undefined;
            resourceInputs["accessCert"] = undefined /*out*/;
            resourceInputs["accessKey"] = undefined /*out*/;
            resourceInputs["type"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const secretOpts = { additionalSecretOutputs: ["accessCert", "accessKey", "password"] };
        opts = pulumi.mergeOptions(opts, secretOpts);
        super(CassandraUser.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering CassandraUser resources.
 */
export interface CassandraUserState {
    /**
     * Access certificate for the user if applicable for the service in question
     */
    accessCert?: pulumi.Input<string>;
    /**
     * Access certificate key for the user if applicable for the service in question
     */
    accessKey?: pulumi.Input<string>;
    /**
     * The password of the Cassandra User.
     */
    password?: pulumi.Input<string>;
    /**
     * Identifies the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. This property cannot be changed, doing so forces recreation of the resource.
     */
    project?: pulumi.Input<string>;
    /**
     * Specifies the name of the service that this resource belongs to. To set up proper dependencies please refer to this variable as a reference. This property cannot be changed, doing so forces recreation of the resource.
     */
    serviceName?: pulumi.Input<string>;
    /**
     * Type of the user account. Tells whether the user is the primary account or a regular account.
     */
    type?: pulumi.Input<string>;
    /**
     * The actual name of the Cassandra User. To set up proper dependencies please refer to this variable as a reference. This property cannot be changed, doing so forces recreation of the resource.
     */
    username?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a CassandraUser resource.
 */
export interface CassandraUserArgs {
    /**
     * The password of the Cassandra User.
     */
    password?: pulumi.Input<string>;
    /**
     * Identifies the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. This property cannot be changed, doing so forces recreation of the resource.
     */
    project: pulumi.Input<string>;
    /**
     * Specifies the name of the service that this resource belongs to. To set up proper dependencies please refer to this variable as a reference. This property cannot be changed, doing so forces recreation of the resource.
     */
    serviceName: pulumi.Input<string>;
    /**
     * The actual name of the Cassandra User. To set up proper dependencies please refer to this variable as a reference. This property cannot be changed, doing so forces recreation of the resource.
     */
    username: pulumi.Input<string>;
}