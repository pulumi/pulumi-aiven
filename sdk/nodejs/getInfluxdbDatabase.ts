// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * The InfluxDB Database data source provides information about the existing Aiven InfluxDB Database.
 */
export function getInfluxdbDatabase(args: GetInfluxdbDatabaseArgs, opts?: pulumi.InvokeOptions): Promise<GetInfluxdbDatabaseResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("aiven:index/getInfluxdbDatabase:getInfluxdbDatabase", {
        "databaseName": args.databaseName,
        "project": args.project,
        "serviceName": args.serviceName,
    }, opts);
}

/**
 * A collection of arguments for invoking getInfluxdbDatabase.
 */
export interface GetInfluxdbDatabaseArgs {
    /**
     * The name of the service database. This property cannot be changed, doing so forces recreation of the resource.
     */
    databaseName: string;
    /**
     * Identifies the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. This property cannot be changed, doing so forces recreation of the resource.
     */
    project: string;
    /**
     * Specifies the name of the service that this resource belongs to. To set up proper dependencies please refer to this variable as a reference. This property cannot be changed, doing so forces recreation of the resource.
     */
    serviceName: string;
}

/**
 * A collection of values returned by getInfluxdbDatabase.
 */
export interface GetInfluxdbDatabaseResult {
    /**
     * The name of the service database. This property cannot be changed, doing so forces recreation of the resource.
     */
    readonly databaseName: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * Identifies the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. This property cannot be changed, doing so forces recreation of the resource.
     */
    readonly project: string;
    /**
     * Specifies the name of the service that this resource belongs to. To set up proper dependencies please refer to this variable as a reference. This property cannot be changed, doing so forces recreation of the resource.
     */
    readonly serviceName: string;
    readonly terminationProtection: boolean;
}
/**
 * The InfluxDB Database data source provides information about the existing Aiven InfluxDB Database.
 */
export function getInfluxdbDatabaseOutput(args: GetInfluxdbDatabaseOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetInfluxdbDatabaseResult> {
    return pulumi.output(args).apply((a: any) => getInfluxdbDatabase(a, opts))
}

/**
 * A collection of arguments for invoking getInfluxdbDatabase.
 */
export interface GetInfluxdbDatabaseOutputArgs {
    /**
     * The name of the service database. This property cannot be changed, doing so forces recreation of the resource.
     */
    databaseName: pulumi.Input<string>;
    /**
     * Identifies the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. This property cannot be changed, doing so forces recreation of the resource.
     */
    project: pulumi.Input<string>;
    /**
     * Specifies the name of the service that this resource belongs to. To set up proper dependencies please refer to this variable as a reference. This property cannot be changed, doing so forces recreation of the resource.
     */
    serviceName: pulumi.Input<string>;
}