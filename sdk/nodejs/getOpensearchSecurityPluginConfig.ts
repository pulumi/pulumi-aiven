// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Gets information about OpenSearch Security configuration for an Aiven for OpenSearch® service.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aiven from "@pulumi/aiven";
 *
 * const os_sec_config = aiven.getOpensearchSecurityPluginConfig({
 *     project: exampleProject.project,
 *     serviceName: exampleOpensearch.serviceName,
 * });
 * ```
 */
export function getOpensearchSecurityPluginConfig(args: GetOpensearchSecurityPluginConfigArgs, opts?: pulumi.InvokeOptions): Promise<GetOpensearchSecurityPluginConfigResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("aiven:index/getOpensearchSecurityPluginConfig:getOpensearchSecurityPluginConfig", {
        "project": args.project,
        "serviceName": args.serviceName,
    }, opts);
}

/**
 * A collection of arguments for invoking getOpensearchSecurityPluginConfig.
 */
export interface GetOpensearchSecurityPluginConfigArgs {
    /**
     * The name of the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
     */
    project: string;
    /**
     * The name of the service that this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
     */
    serviceName: string;
}

/**
 * A collection of values returned by getOpensearchSecurityPluginConfig.
 */
export interface GetOpensearchSecurityPluginConfigResult {
    /**
     * Whether the os-sec-admin user is enabled. This indicates whether OpenSearch Security management is enabled. This is always true when the os-sec-admin password was set at least once.
     */
    readonly adminEnabled: boolean;
    /**
     * The password for the os-sec-admin user.
     */
    readonly adminPassword: string;
    /**
     * Whether the security plugin is available. This is always true for recently created services.
     */
    readonly available: boolean;
    /**
     * Whether the security plugin is enabled. This is always true for recently created services.
     */
    readonly enabled: boolean;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * The name of the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
     */
    readonly project: string;
    /**
     * The name of the service that this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
     */
    readonly serviceName: string;
}
/**
 * Gets information about OpenSearch Security configuration for an Aiven for OpenSearch® service.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aiven from "@pulumi/aiven";
 *
 * const os_sec_config = aiven.getOpensearchSecurityPluginConfig({
 *     project: exampleProject.project,
 *     serviceName: exampleOpensearch.serviceName,
 * });
 * ```
 */
export function getOpensearchSecurityPluginConfigOutput(args: GetOpensearchSecurityPluginConfigOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetOpensearchSecurityPluginConfigResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("aiven:index/getOpensearchSecurityPluginConfig:getOpensearchSecurityPluginConfig", {
        "project": args.project,
        "serviceName": args.serviceName,
    }, opts);
}

/**
 * A collection of arguments for invoking getOpensearchSecurityPluginConfig.
 */
export interface GetOpensearchSecurityPluginConfigOutputArgs {
    /**
     * The name of the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
     */
    project: pulumi.Input<string>;
    /**
     * The name of the service that this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
     */
    serviceName: pulumi.Input<string>;
}
