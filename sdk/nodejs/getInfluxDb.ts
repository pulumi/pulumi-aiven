// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "./types";
import * as utilities from "./utilities";

/**
 * ## # InfluxDB Data Source
 *
 * The InfluxDB data source provides information about the existing Aiven InfluxDB service.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aiven from "@pulumi/aiven";
 *
 * const inf1 = aiven.getInfluxDb({
 *     project: data.aiven_project.pr1.project,
 *     serviceName: "my-inf1",
 * });
 * ```
 */
export function getInfluxDb(args: GetInfluxDbArgs, opts?: pulumi.InvokeOptions): Promise<GetInfluxDbResult> {
    if (!opts) {
        opts = {}
    }

    if (!opts.version) {
        opts.version = utilities.getVersion();
    }
    return pulumi.runtime.invoke("aiven:index/getInfluxDb:getInfluxDb", {
        "cloudName": args.cloudName,
        "components": args.components,
        "influxdb": args.influxdb,
        "influxdbUserConfig": args.influxdbUserConfig,
        "maintenanceWindowDow": args.maintenanceWindowDow,
        "maintenanceWindowTime": args.maintenanceWindowTime,
        "plan": args.plan,
        "project": args.project,
        "projectVpcId": args.projectVpcId,
        "serviceHost": args.serviceHost,
        "serviceIntegrations": args.serviceIntegrations,
        "serviceName": args.serviceName,
        "servicePassword": args.servicePassword,
        "servicePort": args.servicePort,
        "serviceType": args.serviceType,
        "serviceUri": args.serviceUri,
        "serviceUsername": args.serviceUsername,
        "state": args.state,
        "terminationProtection": args.terminationProtection,
    }, opts);
}

/**
 * A collection of arguments for invoking getInfluxDb.
 */
export interface GetInfluxDbArgs {
    /**
     * defines where the cloud provider and region where the service is hosted
     * in. This can be changed freely after service is created. Changing the value will trigger
     * a potentially lengthy migration process for the service. Format is cloud provider name
     * (`aws`, `azure`, `do` `google`, `upcloud`, etc.), dash, and the cloud provider
     * specific region name. These are documented on each Cloud provider's own support articles,
     * like [here for Google](https://cloud.google.com/compute/docs/regions-zones/) and
     * [here for AWS](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.RegionsAndAvailabilityZones.html).
     */
    cloudName?: string;
    components?: inputs.GetInfluxDbComponent[];
    /**
     * InfluxDB specific server provided values.
     */
    influxdb?: inputs.GetInfluxDbInfluxdb;
    /**
     * defines InfluxDB specific additional configuration options. The following 
     * configuration options available:
     */
    influxdbUserConfig?: inputs.GetInfluxDbInfluxdbUserConfig;
    /**
     * day of week when maintenance operations should be performed. 
     * On monday, tuesday, wednesday, etc.
     */
    maintenanceWindowDow?: string;
    /**
     * time of day when maintenance operations should be performed. 
     * UTC time in HH:mm:ss format.
     */
    maintenanceWindowTime?: string;
    /**
     * defines what kind of computing resources are allocated for the service. It can
     * be changed after creation, though there are some restrictions when going to a smaller
     * plan such as the new plan must have sufficient amount of disk space to store all current
     * data and switching to a plan with fewer nodes might not be supported. The basic plan
     * names are `hobbyist`, `startup-x`, `business-x` and `premium-x` where `x` is
     * (roughly) the amount of memory on each node (also other attributes like number of CPUs
     * and amount of disk space varies but naming is based on memory). The available options can be seem from the [Aiven pricing page](https://aiven.io/pricing).
     */
    plan?: string;
    /**
     * identifies the project the service belongs to. To set up proper dependency
     * between the project and the service, refer to the project as shown in the above example.
     * Project cannot be changed later without destroying and re-creating the service.
     */
    project: string;
    /**
     * optionally specifies the VPC the service should run in. If the value
     * is not set the service is not run inside a VPC. When set, the value should be given as a
     * reference as shown above to set up dependencies correctly and the VPC must be in the same
     * cloud and region as the service itself. Project can be freely moved to and from VPC after
     * creation but doing so triggers migration to new servers so the operation can take
     * significant amount of time to complete if the service has a lot of data.
     */
    projectVpcId?: string;
    /**
     * InfluxDB hostname.
     */
    serviceHost?: string;
    serviceIntegrations?: inputs.GetInfluxDbServiceIntegration[];
    /**
     * specifies the actual name of the service. The name cannot be changed
     * later without destroying and re-creating the service so name should be picked based on
     * intended service usage rather than current attributes.
     */
    serviceName: string;
    /**
     * Password used for connecting to the InfluxDB service, if applicable.
     */
    servicePassword?: string;
    /**
     * InfluxDB port.
     */
    servicePort?: number;
    serviceType?: string;
    /**
     * URI for connecting to the InfluxDB service.
     */
    serviceUri?: string;
    /**
     * Username used for connecting to the InfluxDB service, if applicable.
     */
    serviceUsername?: string;
    /**
     * Service state.
     */
    state?: string;
    /**
     * prevents the service from being deleted. It is recommended to
     * set this to `true` for all production services to prevent unintentional service
     * deletion. This does not shield against deleting databases or topics but for services
     * with backups much of the content can at least be restored from backup in case accidental
     * deletion is done.
     */
    terminationProtection?: boolean;
}

/**
 * A collection of values returned by getInfluxDb.
 */
export interface GetInfluxDbResult {
    /**
     * defines where the cloud provider and region where the service is hosted
     * in. This can be changed freely after service is created. Changing the value will trigger
     * a potentially lengthy migration process for the service. Format is cloud provider name
     * (`aws`, `azure`, `do` `google`, `upcloud`, etc.), dash, and the cloud provider
     * specific region name. These are documented on each Cloud provider's own support articles,
     * like [here for Google](https://cloud.google.com/compute/docs/regions-zones/) and
     * [here for AWS](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.RegionsAndAvailabilityZones.html).
     */
    readonly cloudName?: string;
    readonly components: outputs.GetInfluxDbComponent[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * InfluxDB specific server provided values.
     */
    readonly influxdb: outputs.GetInfluxDbInfluxdb;
    /**
     * defines InfluxDB specific additional configuration options. The following 
     * configuration options available:
     */
    readonly influxdbUserConfig?: outputs.GetInfluxDbInfluxdbUserConfig;
    /**
     * day of week when maintenance operations should be performed. 
     * On monday, tuesday, wednesday, etc.
     */
    readonly maintenanceWindowDow?: string;
    /**
     * time of day when maintenance operations should be performed. 
     * UTC time in HH:mm:ss format.
     */
    readonly maintenanceWindowTime?: string;
    /**
     * defines what kind of computing resources are allocated for the service. It can
     * be changed after creation, though there are some restrictions when going to a smaller
     * plan such as the new plan must have sufficient amount of disk space to store all current
     * data and switching to a plan with fewer nodes might not be supported. The basic plan
     * names are `hobbyist`, `startup-x`, `business-x` and `premium-x` where `x` is
     * (roughly) the amount of memory on each node (also other attributes like number of CPUs
     * and amount of disk space varies but naming is based on memory). The available options can be seem from the [Aiven pricing page](https://aiven.io/pricing).
     */
    readonly plan?: string;
    readonly project: string;
    /**
     * optionally specifies the VPC the service should run in. If the value
     * is not set the service is not run inside a VPC. When set, the value should be given as a
     * reference as shown above to set up dependencies correctly and the VPC must be in the same
     * cloud and region as the service itself. Project can be freely moved to and from VPC after
     * creation but doing so triggers migration to new servers so the operation can take
     * significant amount of time to complete if the service has a lot of data.
     */
    readonly projectVpcId?: string;
    /**
     * InfluxDB hostname.
     */
    readonly serviceHost: string;
    readonly serviceIntegrations?: outputs.GetInfluxDbServiceIntegration[];
    readonly serviceName: string;
    /**
     * Password used for connecting to the InfluxDB service, if applicable.
     */
    readonly servicePassword: string;
    /**
     * InfluxDB port.
     */
    readonly servicePort: number;
    readonly serviceType: string;
    /**
     * URI for connecting to the InfluxDB service.
     */
    readonly serviceUri: string;
    /**
     * Username used for connecting to the InfluxDB service, if applicable.
     */
    readonly serviceUsername: string;
    /**
     * Service state.
     */
    readonly state: string;
    /**
     * prevents the service from being deleted. It is recommended to
     * set this to `true` for all production services to prevent unintentional service
     * deletion. This does not shield against deleting databases or topics but for services
     * with backups much of the content can at least be restored from backup in case accidental
     * deletion is done.
     */
    readonly terminationProtection?: boolean;
}
