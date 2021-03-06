// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "./types";
import * as utilities from "./utilities";

/**
 * ## # Account Team Project Data Source
 *
 * The Account Team Project data source provides information about the existing Account Team Project.
 */
export function getAccountTeamProject(args: GetAccountTeamProjectArgs, opts?: pulumi.InvokeOptions): Promise<GetAccountTeamProjectResult> {
    if (!opts) {
        opts = {}
    }

    if (!opts.version) {
        opts.version = utilities.getVersion();
    }
    return pulumi.runtime.invoke("aiven:index/getAccountTeamProject:getAccountTeamProject", {
        "accountId": args.accountId,
        "projectName": args.projectName,
        "teamId": args.teamId,
        "teamType": args.teamType,
    }, opts);
}

/**
 * A collection of arguments for invoking getAccountTeamProject.
 */
export interface GetAccountTeamProjectArgs {
    /**
     * is a unique account id.
     */
    accountId: string;
    /**
     * is a project name of already existing project.
     */
    projectName: string;
    /**
     * is an account team id.
     */
    teamId: string;
    /**
     * is an account team project type, can one of the following values: `admin`, 
     * `developer`, `operator` and `readOnly`.
     */
    teamType?: string;
}

/**
 * A collection of values returned by getAccountTeamProject.
 */
export interface GetAccountTeamProjectResult {
    readonly accountId: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly projectName: string;
    readonly teamId: string;
    /**
     * is an account team project type, can one of the following values: `admin`, 
     * `developer`, `operator` and `readOnly`.
     */
    readonly teamType?: string;
}
