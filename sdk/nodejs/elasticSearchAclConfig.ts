// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * ## # Elasticsearch ACL Config Resource
 *
 * The Elasticsearch ACL Config resource allows the configuration of ACL management on an Aiven Elasticsearch service.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aiven from "@pulumi/aiven";
 *
 * const es_acl_config = new aiven.ElasticSearchAclConfig("es-acl-config", {
 *     project: aiven_project["es-project"].project,
 *     serviceName: aiven_service.es.service_name,
 *     enabled: true,
 *     extendedAcl: false,
 * });
 * ```
 */
export class ElasticSearchAclConfig extends pulumi.CustomResource {
    /**
     * Get an existing ElasticSearchAclConfig resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ElasticSearchAclConfigState, opts?: pulumi.CustomResourceOptions): ElasticSearchAclConfig {
        return new ElasticSearchAclConfig(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aiven:index/elasticSearchAclConfig:ElasticSearchAclConfig';

    /**
     * Returns true if the given object is an instance of ElasticSearchAclConfig.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ElasticSearchAclConfig {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ElasticSearchAclConfig.__pulumiType;
    }

    /**
     * enables of disables Elasticsearch ACL's.
     */
    public readonly enabled!: pulumi.Output<boolean | undefined>;
    /**
     * Index rules can be applied in a limited fashion to the _mget, _msearch and _bulk APIs 
     * (and only those) by enabling the ExtendedAcl option for the service. When it is enabled, users can use
     * these APIs as long as all operations only target indexes they have been granted access to.
     */
    public readonly extendedAcl!: pulumi.Output<boolean | undefined>;
    /**
     * and `serviceName` - (Required) define the project and service the ACL belongs to. 
     * They should be defined using reference as shown above to set up dependencies correctly.
     */
    public readonly project!: pulumi.Output<string>;
    /**
     * Service to link the Elasticsearch ACLs to
     */
    public readonly serviceName!: pulumi.Output<string>;

    /**
     * Create a ElasticSearchAclConfig resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ElasticSearchAclConfigArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ElasticSearchAclConfigArgs | ElasticSearchAclConfigState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ElasticSearchAclConfigState | undefined;
            resourceInputs["enabled"] = state ? state.enabled : undefined;
            resourceInputs["extendedAcl"] = state ? state.extendedAcl : undefined;
            resourceInputs["project"] = state ? state.project : undefined;
            resourceInputs["serviceName"] = state ? state.serviceName : undefined;
        } else {
            const args = argsOrState as ElasticSearchAclConfigArgs | undefined;
            if ((!args || args.project === undefined) && !opts.urn) {
                throw new Error("Missing required property 'project'");
            }
            if ((!args || args.serviceName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'serviceName'");
            }
            resourceInputs["enabled"] = args ? args.enabled : undefined;
            resourceInputs["extendedAcl"] = args ? args.extendedAcl : undefined;
            resourceInputs["project"] = args ? args.project : undefined;
            resourceInputs["serviceName"] = args ? args.serviceName : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(ElasticSearchAclConfig.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ElasticSearchAclConfig resources.
 */
export interface ElasticSearchAclConfigState {
    /**
     * enables of disables Elasticsearch ACL's.
     */
    enabled?: pulumi.Input<boolean>;
    /**
     * Index rules can be applied in a limited fashion to the _mget, _msearch and _bulk APIs 
     * (and only those) by enabling the ExtendedAcl option for the service. When it is enabled, users can use
     * these APIs as long as all operations only target indexes they have been granted access to.
     */
    extendedAcl?: pulumi.Input<boolean>;
    /**
     * and `serviceName` - (Required) define the project and service the ACL belongs to. 
     * They should be defined using reference as shown above to set up dependencies correctly.
     */
    project?: pulumi.Input<string>;
    /**
     * Service to link the Elasticsearch ACLs to
     */
    serviceName?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a ElasticSearchAclConfig resource.
 */
export interface ElasticSearchAclConfigArgs {
    /**
     * enables of disables Elasticsearch ACL's.
     */
    enabled?: pulumi.Input<boolean>;
    /**
     * Index rules can be applied in a limited fashion to the _mget, _msearch and _bulk APIs 
     * (and only those) by enabling the ExtendedAcl option for the service. When it is enabled, users can use
     * these APIs as long as all operations only target indexes they have been granted access to.
     */
    extendedAcl?: pulumi.Input<boolean>;
    /**
     * and `serviceName` - (Required) define the project and service the ACL belongs to. 
     * They should be defined using reference as shown above to set up dependencies correctly.
     */
    project: pulumi.Input<string>;
    /**
     * Service to link the Elasticsearch ACLs to
     */
    serviceName: pulumi.Input<string>;
}