// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

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
    readonly cloudName?: string;
    readonly components?: inputs.GetInfluxDbComponent[];
    readonly influxdb?: inputs.GetInfluxDbInfluxdb;
    readonly influxdbUserConfig?: inputs.GetInfluxDbInfluxdbUserConfig;
    readonly maintenanceWindowDow?: string;
    readonly maintenanceWindowTime?: string;
    readonly plan?: string;
    readonly project: string;
    readonly projectVpcId?: string;
    readonly serviceHost?: string;
    readonly serviceIntegrations?: inputs.GetInfluxDbServiceIntegration[];
    readonly serviceName: string;
    readonly servicePassword?: string;
    readonly servicePort?: number;
    readonly serviceType?: string;
    readonly serviceUri?: string;
    readonly serviceUsername?: string;
    readonly state?: string;
    readonly terminationProtection?: boolean;
}

/**
 * A collection of values returned by getInfluxDb.
 */
export interface GetInfluxDbResult {
    readonly cloudName?: string;
    readonly components: outputs.GetInfluxDbComponent[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly influxdb: outputs.GetInfluxDbInfluxdb;
    readonly influxdbUserConfig?: outputs.GetInfluxDbInfluxdbUserConfig;
    readonly maintenanceWindowDow?: string;
    readonly maintenanceWindowTime?: string;
    readonly plan?: string;
    readonly project: string;
    readonly projectVpcId?: string;
    readonly serviceHost: string;
    readonly serviceIntegrations?: outputs.GetInfluxDbServiceIntegration[];
    readonly serviceName: string;
    readonly servicePassword: string;
    readonly servicePort: number;
    readonly serviceType: string;
    readonly serviceUri: string;
    readonly serviceUsername: string;
    readonly state: string;
    readonly terminationProtection?: boolean;
}