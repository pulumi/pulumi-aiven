// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Gets information about an Aiven for Valkey service.
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
 * const exampleValkey = aiven.getValkey({
 *     project: exampleProject.project,
 *     serviceName: "example-valkey-service",
 * });
 * ```
 */
export function getValkey(args: GetValkeyArgs, opts?: pulumi.InvokeOptions): Promise<GetValkeyResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("aiven:index/getValkey:getValkey", {
        "project": args.project,
        "serviceName": args.serviceName,
    }, opts);
}

/**
 * A collection of arguments for invoking getValkey.
 */
export interface GetValkeyArgs {
    /**
     * The name of the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
     */
    project: string;
    /**
     * Specifies the actual name of the service. The name cannot be changed later without destroying and re-creating the service so name should be picked based on intended service usage rather than current attributes.
     */
    serviceName: string;
}

/**
 * A collection of values returned by getValkey.
 */
export interface GetValkeyResult {
    /**
     * Additional disk space. Possible values depend on the service type, the cloud provider and the project. Therefore, reducing will result in the service rebalancing.
     */
    readonly additionalDiskSpace: string;
    /**
     * Defines where the cloud provider and region where the service is hosted in. This can be changed freely after service is created. Changing the value will trigger a potentially lengthy migration process for the service. Format is cloud provider name (`aws`, `azure`, `do` `google`, `upcloud`, etc.), dash, and the cloud provider specific region name. These are documented on each Cloud provider's own support articles, like [here for Google](https://cloud.google.com/compute/docs/regions-zones/) and [here for AWS](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.RegionsAndAvailabilityZones.html).
     */
    readonly cloudName: string;
    /**
     * Service component information objects
     */
    readonly components: outputs.GetValkeyComponent[];
    /**
     * Service disk space. Possible values depend on the service type, the cloud provider and the project. Therefore, reducing will result in the service rebalancing.
     */
    readonly diskSpace: string;
    /**
     * The maximum disk space of the service, possible values depend on the service type, the cloud provider and the project.
     */
    readonly diskSpaceCap: string;
    /**
     * The default disk space of the service, possible values depend on the service type, the cloud provider and the project. Its also the minimum value for `diskSpace`
     */
    readonly diskSpaceDefault: string;
    /**
     * The default disk space step of the service, possible values depend on the service type, the cloud provider and the project. `diskSpace` needs to increment from `diskSpaceDefault` by increments of this size.
     */
    readonly diskSpaceStep: string;
    /**
     * Disk space that service is currently using
     */
    readonly diskSpaceUsed: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * Day of week when maintenance operations should be performed. One monday, tuesday, wednesday, etc.
     */
    readonly maintenanceWindowDow: string;
    /**
     * Time of day when maintenance operations should be performed. UTC time in HH:mm:ss format.
     */
    readonly maintenanceWindowTime: string;
    /**
     * Defines what kind of computing resources are allocated for the service. It can be changed after creation, though there are some restrictions when going to a smaller plan such as the new plan must have sufficient amount of disk space to store all current data and switching to a plan with fewer nodes might not be supported. The basic plan names are `hobbyist`, `startup-x`, `business-x` and `premium-x` where `x` is (roughly) the amount of memory on each node (also other attributes like number of CPUs and amount of disk space varies but naming is based on memory). The available options can be seem from the [Aiven pricing page](https://aiven.io/pricing).
     */
    readonly plan: string;
    /**
     * The name of the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
     */
    readonly project: string;
    /**
     * Specifies the VPC the service should run in. If the value is not set the service is not run inside a VPC. When set, the value should be given as a reference to set up dependencies correctly and the VPC must be in the same cloud and region as the service itself. Project can be freely moved to and from VPC after creation but doing so triggers migration to new servers so the operation can take significant amount of time to complete if the service has a lot of data.
     */
    readonly projectVpcId: string;
    /**
     * The hostname of the service.
     */
    readonly serviceHost: string;
    /**
     * Service integrations to specify when creating a service. Not applied after initial service creation
     */
    readonly serviceIntegrations: outputs.GetValkeyServiceIntegration[];
    /**
     * Specifies the actual name of the service. The name cannot be changed later without destroying and re-creating the service so name should be picked based on intended service usage rather than current attributes.
     */
    readonly serviceName: string;
    /**
     * Password used for connecting to the service, if applicable
     */
    readonly servicePassword: string;
    /**
     * The port of the service
     */
    readonly servicePort: number;
    /**
     * Aiven internal service type code
     */
    readonly serviceType: string;
    /**
     * URI for connecting to the service. Service specific info is under "kafka", "pg", etc.
     */
    readonly serviceUri: string;
    /**
     * Username used for connecting to the service, if applicable
     */
    readonly serviceUsername: string;
    /**
     * Service state. One of `POWEROFF`, `REBALANCING`, `REBUILDING` or `RUNNING`
     */
    readonly state: string;
    /**
     * Static IPs that are going to be associated with this service. Please assign a value using the 'toset' function. Once a static ip resource is in the 'assigned' state it cannot be unbound from the node again
     */
    readonly staticIps: string[];
    /**
     * Tags are key-value pairs that allow you to categorize services.
     */
    readonly tags: outputs.GetValkeyTag[];
    /**
     * The email addresses for [service contacts](https://aiven.io/docs/platform/howto/technical-emails), who will receive important alerts and updates about this service. You can also set email contacts at the project level.
     */
    readonly techEmails: outputs.GetValkeyTechEmail[];
    /**
     * Prevents the service from being deleted. It is recommended to set this to `true` for all production services to prevent unintentional service deletion. This does not shield against deleting databases or topics but for services with backups much of the content can at least be restored from backup in case accidental deletion is done.
     */
    readonly terminationProtection: boolean;
    /**
     * Valkey user configurable settings
     */
    readonly valkeyUserConfigs: outputs.GetValkeyValkeyUserConfig[];
    /**
     * Valkey server provided values
     */
    readonly valkeys: outputs.GetValkeyValkey[];
}
/**
 * Gets information about an Aiven for Valkey service.
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
 * const exampleValkey = aiven.getValkey({
 *     project: exampleProject.project,
 *     serviceName: "example-valkey-service",
 * });
 * ```
 */
export function getValkeyOutput(args: GetValkeyOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetValkeyResult> {
    return pulumi.output(args).apply((a: any) => getValkey(a, opts))
}

/**
 * A collection of arguments for invoking getValkey.
 */
export interface GetValkeyOutputArgs {
    /**
     * The name of the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
     */
    project: pulumi.Input<string>;
    /**
     * Specifies the actual name of the service. The name cannot be changed later without destroying and re-creating the service so name should be picked based on intended service usage rather than current attributes.
     */
    serviceName: pulumi.Input<string>;
}