// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * During the creation of `aiven..AccountTeamMember` resource, an email invitation will be sent
 * to a user using `userEmail` address. If the user accepts an invitation, he or she will become a member of the account team. 
 * The deletion of `aiven..AccountTeamMember` will not only delete invitation if one was sent but not yet accepted by the 
 * user, and it will also eliminate an account team member if one has accepted an invitation previously.
 * 
 * ## Example Usage
 * 
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aiven from "@pulumi/aiven";
 * 
 * const foo = new aiven.AccountTeamMember("foo", {
 *     accountId: aiven_account_developers.accountId,
 *     teamId: aiven_account_developers.accountId,
 *     userEmail: "user+1@example.com",
 * });
 * ```
 *
 * > This content is derived from https://github.com/aiven/terraform-provider-aiven/blob/master/website/docs/r/account_team_member.html.markdown.
 */
export class AccountTeamMember extends pulumi.CustomResource {
    /**
     * Get an existing AccountTeamMember resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: AccountTeamMemberState, opts?: pulumi.CustomResourceOptions): AccountTeamMember {
        return new AccountTeamMember(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aiven:index/accountTeamMember:AccountTeamMember';

    /**
     * Returns true if the given object is an instance of AccountTeamMember.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is AccountTeamMember {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === AccountTeamMember.__pulumiType;
    }

    /**
     * Team member invitation status
     */
    public readonly accepted!: pulumi.Output<boolean>;
    /**
     * Account id
     */
    public readonly accountId!: pulumi.Output<string>;
    /**
     * Time of creation
     */
    public readonly createTime!: pulumi.Output<string>;
    /**
     * Team invited by user email
     */
    public readonly invitedByUserEmail!: pulumi.Output<string>;
    /**
     * Account team id
     */
    public readonly teamId!: pulumi.Output<string>;
    /**
     * Team invite user email
     */
    public readonly userEmail!: pulumi.Output<string>;

    /**
     * Create a AccountTeamMember resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: AccountTeamMemberArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: AccountTeamMemberArgs | AccountTeamMemberState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        if (opts && opts.id) {
            const state = argsOrState as AccountTeamMemberState | undefined;
            inputs["accepted"] = state ? state.accepted : undefined;
            inputs["accountId"] = state ? state.accountId : undefined;
            inputs["createTime"] = state ? state.createTime : undefined;
            inputs["invitedByUserEmail"] = state ? state.invitedByUserEmail : undefined;
            inputs["teamId"] = state ? state.teamId : undefined;
            inputs["userEmail"] = state ? state.userEmail : undefined;
        } else {
            const args = argsOrState as AccountTeamMemberArgs | undefined;
            if (!args || args.accountId === undefined) {
                throw new Error("Missing required property 'accountId'");
            }
            if (!args || args.teamId === undefined) {
                throw new Error("Missing required property 'teamId'");
            }
            if (!args || args.userEmail === undefined) {
                throw new Error("Missing required property 'userEmail'");
            }
            inputs["accepted"] = args ? args.accepted : undefined;
            inputs["accountId"] = args ? args.accountId : undefined;
            inputs["createTime"] = args ? args.createTime : undefined;
            inputs["invitedByUserEmail"] = args ? args.invitedByUserEmail : undefined;
            inputs["teamId"] = args ? args.teamId : undefined;
            inputs["userEmail"] = args ? args.userEmail : undefined;
        }
        if (!opts) {
            opts = {}
        }

        if (!opts.version) {
            opts.version = utilities.getVersion();
        }
        super(AccountTeamMember.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering AccountTeamMember resources.
 */
export interface AccountTeamMemberState {
    /**
     * Team member invitation status
     */
    readonly accepted?: pulumi.Input<boolean>;
    /**
     * Account id
     */
    readonly accountId?: pulumi.Input<string>;
    /**
     * Time of creation
     */
    readonly createTime?: pulumi.Input<string>;
    /**
     * Team invited by user email
     */
    readonly invitedByUserEmail?: pulumi.Input<string>;
    /**
     * Account team id
     */
    readonly teamId?: pulumi.Input<string>;
    /**
     * Team invite user email
     */
    readonly userEmail?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a AccountTeamMember resource.
 */
export interface AccountTeamMemberArgs {
    /**
     * Team member invitation status
     */
    readonly accepted?: pulumi.Input<boolean>;
    /**
     * Account id
     */
    readonly accountId: pulumi.Input<string>;
    /**
     * Time of creation
     */
    readonly createTime?: pulumi.Input<string>;
    /**
     * Team invited by user email
     */
    readonly invitedByUserEmail?: pulumi.Input<string>;
    /**
     * Account team id
     */
    readonly teamId: pulumi.Input<string>;
    /**
     * Team invite user email
     */
    readonly userEmail: pulumi.Input<string>;
}