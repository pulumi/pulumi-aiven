// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Gets information about an Aiven for OpenSearch® ACL rule.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aiven from "@pulumi/aiven";
 *
 * const osAclRule = aiven.getOpenSearchAclRule({
 *     project: exampleProject.project,
 *     serviceName: exampleOpensearch.serviceName,
 *     username: "documentation-user-1",
 *     index: "index5",
 * });
 * ```
 */
export function getOpenSearchAclRule(args: GetOpenSearchAclRuleArgs, opts?: pulumi.InvokeOptions): Promise<GetOpenSearchAclRuleResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("aiven:index/getOpenSearchAclRule:getOpenSearchAclRule", {
        "index": args.index,
        "permission": args.permission,
        "project": args.project,
        "serviceName": args.serviceName,
        "username": args.username,
    }, opts);
}

/**
 * A collection of arguments for invoking getOpenSearchAclRule.
 */
export interface GetOpenSearchAclRuleArgs {
    /**
     * The index pattern for this ACL rule. Maximum length: `249`. Changing this property forces recreation of the resource.
     */
    index: string;
    /**
     * The permissions for this ACL rule. The possible values are `admin`, `deny`, `read`, `readwrite` and `write`.
     */
    permission: string;
    /**
     * The name of the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
     */
    project: string;
    /**
     * The name of the service that this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
     */
    serviceName: string;
    /**
     * The username for the OpenSearch user this ACL rule applies to. Maximum length: `40`. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
     */
    username: string;
}

/**
 * A collection of values returned by getOpenSearchAclRule.
 */
export interface GetOpenSearchAclRuleResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * The index pattern for this ACL rule. Maximum length: `249`. Changing this property forces recreation of the resource.
     */
    readonly index: string;
    /**
     * The permissions for this ACL rule. The possible values are `admin`, `deny`, `read`, `readwrite` and `write`.
     */
    readonly permission: string;
    /**
     * The name of the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
     */
    readonly project: string;
    /**
     * The name of the service that this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
     */
    readonly serviceName: string;
    /**
     * The username for the OpenSearch user this ACL rule applies to. Maximum length: `40`. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
     */
    readonly username: string;
}
/**
 * Gets information about an Aiven for OpenSearch® ACL rule.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aiven from "@pulumi/aiven";
 *
 * const osAclRule = aiven.getOpenSearchAclRule({
 *     project: exampleProject.project,
 *     serviceName: exampleOpensearch.serviceName,
 *     username: "documentation-user-1",
 *     index: "index5",
 * });
 * ```
 */
export function getOpenSearchAclRuleOutput(args: GetOpenSearchAclRuleOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetOpenSearchAclRuleResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("aiven:index/getOpenSearchAclRule:getOpenSearchAclRule", {
        "index": args.index,
        "permission": args.permission,
        "project": args.project,
        "serviceName": args.serviceName,
        "username": args.username,
    }, opts);
}

/**
 * A collection of arguments for invoking getOpenSearchAclRule.
 */
export interface GetOpenSearchAclRuleOutputArgs {
    /**
     * The index pattern for this ACL rule. Maximum length: `249`. Changing this property forces recreation of the resource.
     */
    index: pulumi.Input<string>;
    /**
     * The permissions for this ACL rule. The possible values are `admin`, `deny`, `read`, `readwrite` and `write`.
     */
    permission: pulumi.Input<string>;
    /**
     * The name of the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
     */
    project: pulumi.Input<string>;
    /**
     * The name of the service that this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
     */
    serviceName: pulumi.Input<string>;
    /**
     * The username for the OpenSearch user this ACL rule applies to. Maximum length: `40`. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
     */
    username: pulumi.Input<string>;
}
