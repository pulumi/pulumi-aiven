// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Creates and manages an [Aiven for Apache Flink® jar application](https://aiven.io/docs/products/flink/howto/create-jar-application).
 *
 * **This resource is in the beta stage and may change without notice.** Set
 * the `PROVIDER_AIVEN_ENABLE_BETA` environment variable to use the resource.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aiven from "@pulumi/aiven";
 *
 * const example = new aiven.Flink("example", {
 *     project: exampleAivenProject.project,
 *     serviceName: "example-flink-service",
 *     cloudName: "google-europe-west1",
 *     plan: "business-4",
 *     maintenanceWindowDow: "monday",
 *     maintenanceWindowTime: "04:00:00",
 *     flinkUserConfig: {
 *         customCode: true,
 *     },
 * });
 * const exampleFlinkJarApplication = new aiven.FlinkJarApplication("example", {
 *     project: example.project,
 *     serviceName: example.serviceName,
 *     name: "example-app-jar",
 * });
 * ```
 *
 * ## Import
 *
 * ```sh
 * $ pulumi import aiven:index/flinkJarApplication:FlinkJarApplication example PROJECT/SERVICE_NAME/APPLICATION_ID
 * ```
 */
export class FlinkJarApplication extends pulumi.CustomResource {
    /**
     * Get an existing FlinkJarApplication resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: FlinkJarApplicationState, opts?: pulumi.CustomResourceOptions): FlinkJarApplication {
        return new FlinkJarApplication(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aiven:index/flinkJarApplication:FlinkJarApplication';

    /**
     * Returns true if the given object is an instance of FlinkJarApplication.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is FlinkJarApplication {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === FlinkJarApplication.__pulumiType;
    }

    /**
     * Application ID.
     */
    public /*out*/ readonly applicationId!: pulumi.Output<string>;
    /**
     * JarApplicationVersions.
     */
    public /*out*/ readonly applicationVersions!: pulumi.Output<outputs.FlinkJarApplicationApplicationVersion[]>;
    /**
     * The creation timestamp of this entity in ISO 8601 format, always in UTC.
     */
    public /*out*/ readonly createdAt!: pulumi.Output<string>;
    /**
     * The creator of this entity.
     */
    public /*out*/ readonly createdBy!: pulumi.Output<string>;
    /**
     * Flink JarApplicationDeployment.
     */
    public /*out*/ readonly currentDeployments!: pulumi.Output<outputs.FlinkJarApplicationCurrentDeployment[]>;
    /**
     * Application name. Maximum length: `128`.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Project name. Changing this property forces recreation of the resource.
     */
    public readonly project!: pulumi.Output<string>;
    /**
     * Service name. Changing this property forces recreation of the resource.
     */
    public readonly serviceName!: pulumi.Output<string>;
    /**
     * The update timestamp of this entity in ISO 8601 format, always in UTC.
     */
    public /*out*/ readonly updatedAt!: pulumi.Output<string>;
    /**
     * The latest updater of this entity.
     */
    public /*out*/ readonly updatedBy!: pulumi.Output<string>;

    /**
     * Create a FlinkJarApplication resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: FlinkJarApplicationArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: FlinkJarApplicationArgs | FlinkJarApplicationState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as FlinkJarApplicationState | undefined;
            resourceInputs["applicationId"] = state ? state.applicationId : undefined;
            resourceInputs["applicationVersions"] = state ? state.applicationVersions : undefined;
            resourceInputs["createdAt"] = state ? state.createdAt : undefined;
            resourceInputs["createdBy"] = state ? state.createdBy : undefined;
            resourceInputs["currentDeployments"] = state ? state.currentDeployments : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["project"] = state ? state.project : undefined;
            resourceInputs["serviceName"] = state ? state.serviceName : undefined;
            resourceInputs["updatedAt"] = state ? state.updatedAt : undefined;
            resourceInputs["updatedBy"] = state ? state.updatedBy : undefined;
        } else {
            const args = argsOrState as FlinkJarApplicationArgs | undefined;
            if ((!args || args.project === undefined) && !opts.urn) {
                throw new Error("Missing required property 'project'");
            }
            if ((!args || args.serviceName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'serviceName'");
            }
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["project"] = args ? args.project : undefined;
            resourceInputs["serviceName"] = args ? args.serviceName : undefined;
            resourceInputs["applicationId"] = undefined /*out*/;
            resourceInputs["applicationVersions"] = undefined /*out*/;
            resourceInputs["createdAt"] = undefined /*out*/;
            resourceInputs["createdBy"] = undefined /*out*/;
            resourceInputs["currentDeployments"] = undefined /*out*/;
            resourceInputs["updatedAt"] = undefined /*out*/;
            resourceInputs["updatedBy"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(FlinkJarApplication.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering FlinkJarApplication resources.
 */
export interface FlinkJarApplicationState {
    /**
     * Application ID.
     */
    applicationId?: pulumi.Input<string>;
    /**
     * JarApplicationVersions.
     */
    applicationVersions?: pulumi.Input<pulumi.Input<inputs.FlinkJarApplicationApplicationVersion>[]>;
    /**
     * The creation timestamp of this entity in ISO 8601 format, always in UTC.
     */
    createdAt?: pulumi.Input<string>;
    /**
     * The creator of this entity.
     */
    createdBy?: pulumi.Input<string>;
    /**
     * Flink JarApplicationDeployment.
     */
    currentDeployments?: pulumi.Input<pulumi.Input<inputs.FlinkJarApplicationCurrentDeployment>[]>;
    /**
     * Application name. Maximum length: `128`.
     */
    name?: pulumi.Input<string>;
    /**
     * Project name. Changing this property forces recreation of the resource.
     */
    project?: pulumi.Input<string>;
    /**
     * Service name. Changing this property forces recreation of the resource.
     */
    serviceName?: pulumi.Input<string>;
    /**
     * The update timestamp of this entity in ISO 8601 format, always in UTC.
     */
    updatedAt?: pulumi.Input<string>;
    /**
     * The latest updater of this entity.
     */
    updatedBy?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a FlinkJarApplication resource.
 */
export interface FlinkJarApplicationArgs {
    /**
     * Application name. Maximum length: `128`.
     */
    name?: pulumi.Input<string>;
    /**
     * Project name. Changing this property forces recreation of the resource.
     */
    project: pulumi.Input<string>;
    /**
     * Service name. Changing this property forces recreation of the resource.
     */
    serviceName: pulumi.Input<string>;
}
