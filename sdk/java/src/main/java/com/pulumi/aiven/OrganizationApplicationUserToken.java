// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aiven;

import com.pulumi.aiven.OrganizationApplicationUserTokenArgs;
import com.pulumi.aiven.Utilities;
import com.pulumi.aiven.inputs.OrganizationApplicationUserTokenState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Creates and manages an application user token. Review the [best practices](https://aiven.io/docs/platform/concepts/application-users#security-best-practices) for securing application users and their tokens.
 * 
 * ## Example Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aiven.OrganizationApplicationUser;
 * import com.pulumi.aiven.OrganizationApplicationUserArgs;
 * import com.pulumi.aiven.OrganizationApplicationUserToken;
 * import com.pulumi.aiven.OrganizationApplicationUserTokenArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var tfUser = new OrganizationApplicationUser("tfUser", OrganizationApplicationUserArgs.builder()
 *             .organizationId(main.id())
 *             .name("app-terraform")
 *             .build());
 * 
 *         var example = new OrganizationApplicationUserToken("example", OrganizationApplicationUserTokenArgs.builder()
 *             .organizationId(main.id())
 *             .userId(tfUser.userId())
 *             .description("Token for TF access to Aiven.")
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * ```sh
 * $ pulumi import aiven:index/organizationApplicationUserToken:OrganizationApplicationUserToken example ORGANIZATION_ID/USER_ID/TOKEN_PREFIX
 * ```
 * 
 */
@ResourceType(type="aiven:index/organizationApplicationUserToken:OrganizationApplicationUserToken")
public class OrganizationApplicationUserToken extends com.pulumi.resources.CustomResource {
    /**
     * Time when the token was created.
     * 
     */
    @Export(name="createTime", refs={String.class}, tree="[0]")
    private Output<String> createTime;

    /**
     * @return Time when the token was created.
     * 
     */
    public Output<String> createTime() {
        return this.createTime;
    }
    /**
     * True for tokens explicitly created using the `access_tokens` API. False for tokens created when a user logs in.
     * 
     */
    @Export(name="createdManually", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> createdManually;

    /**
     * @return True for tokens explicitly created using the `access_tokens` API. False for tokens created when a user logs in.
     * 
     */
    public Output<Boolean> createdManually() {
        return this.createdManually;
    }
    /**
     * True if the API request was made with this token.
     * 
     */
    @Export(name="currentlyActive", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> currentlyActive;

    /**
     * @return True if the API request was made with this token.
     * 
     */
    public Output<Boolean> currentlyActive() {
        return this.currentlyActive;
    }
    /**
     * Description of the token.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return Description of the token.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * Timestamp when the access token will expire unless extended.
     * 
     */
    @Export(name="expiryTime", refs={String.class}, tree="[0]")
    private Output<String> expiryTime;

    /**
     * @return Timestamp when the access token will expire unless extended.
     * 
     */
    public Output<String> expiryTime() {
        return this.expiryTime;
    }
    /**
     * Extends the token session duration when the token is used. Only applicable if a value is set for `max_age_seconds`.
     * 
     */
    @Export(name="extendWhenUsed", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> extendWhenUsed;

    /**
     * @return Extends the token session duration when the token is used. Only applicable if a value is set for `max_age_seconds`.
     * 
     */
    public Output<Optional<Boolean>> extendWhenUsed() {
        return Codegen.optional(this.extendWhenUsed);
    }
    /**
     * Full token.
     * 
     */
    @Export(name="fullToken", refs={String.class}, tree="[0]")
    private Output<String> fullToken;

    /**
     * @return Full token.
     * 
     */
    public Output<String> fullToken() {
        return this.fullToken;
    }
    /**
     * List of allowed IP ranges.
     * 
     */
    @Export(name="ipAllowlists", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> ipAllowlists;

    /**
     * @return List of allowed IP ranges.
     * 
     */
    public Output<Optional<List<String>>> ipAllowlists() {
        return Codegen.optional(this.ipAllowlists);
    }
    /**
     * IP address of the last request made with this token.
     * 
     */
    @Export(name="lastIp", refs={String.class}, tree="[0]")
    private Output<String> lastIp;

    /**
     * @return IP address of the last request made with this token.
     * 
     */
    public Output<String> lastIp() {
        return this.lastIp;
    }
    /**
     * Timestamp when the access token was last used.
     * 
     */
    @Export(name="lastUsedTime", refs={String.class}, tree="[0]")
    private Output<String> lastUsedTime;

    /**
     * @return Timestamp when the access token was last used.
     * 
     */
    public Output<String> lastUsedTime() {
        return this.lastUsedTime;
    }
    /**
     * User agent of the last request made with this token.
     * 
     */
    @Export(name="lastUserAgent", refs={String.class}, tree="[0]")
    private Output<String> lastUserAgent;

    /**
     * @return User agent of the last request made with this token.
     * 
     */
    public Output<String> lastUserAgent() {
        return this.lastUserAgent;
    }
    /**
     * User agent of the last request made with this token in human-readable format.
     * 
     */
    @Export(name="lastUserAgentHumanReadable", refs={String.class}, tree="[0]")
    private Output<String> lastUserAgentHumanReadable;

    /**
     * @return User agent of the last request made with this token in human-readable format.
     * 
     */
    public Output<String> lastUserAgentHumanReadable() {
        return this.lastUserAgentHumanReadable;
    }
    /**
     * The number of hours after which a token expires. If not set, it never expires.
     * 
     */
    @Export(name="maxAgeSeconds", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> maxAgeSeconds;

    /**
     * @return The number of hours after which a token expires. If not set, it never expires.
     * 
     */
    public Output<Optional<Integer>> maxAgeSeconds() {
        return Codegen.optional(this.maxAgeSeconds);
    }
    /**
     * The ID of the organization the application user belongs to.
     * 
     */
    @Export(name="organizationId", refs={String.class}, tree="[0]")
    private Output<String> organizationId;

    /**
     * @return The ID of the organization the application user belongs to.
     * 
     */
    public Output<String> organizationId() {
        return this.organizationId;
    }
    /**
     * Limits access to specific resources by granting read or write privileges to them. For example: `billing:read`. Available scopes are: `authentication`, `billing`, `payments` for [payment methods](https://aiven.io/docs/platform/howto/list-billing), `privatelink`, `projects`, `services`, `static_ips`, and `user`.
     * 
     */
    @Export(name="scopes", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> scopes;

    /**
     * @return Limits access to specific resources by granting read or write privileges to them. For example: `billing:read`. Available scopes are: `authentication`, `billing`, `payments` for [payment methods](https://aiven.io/docs/platform/howto/list-billing), `privatelink`, `projects`, `services`, `static_ips`, and `user`.
     * 
     */
    public Output<Optional<List<String>>> scopes() {
        return Codegen.optional(this.scopes);
    }
    /**
     * Prefix of the token.
     * 
     */
    @Export(name="tokenPrefix", refs={String.class}, tree="[0]")
    private Output<String> tokenPrefix;

    /**
     * @return Prefix of the token.
     * 
     */
    public Output<String> tokenPrefix() {
        return this.tokenPrefix;
    }
    /**
     * The ID of the application user the token is created for.
     * 
     */
    @Export(name="userId", refs={String.class}, tree="[0]")
    private Output<String> userId;

    /**
     * @return The ID of the application user the token is created for.
     * 
     */
    public Output<String> userId() {
        return this.userId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public OrganizationApplicationUserToken(java.lang.String name) {
        this(name, OrganizationApplicationUserTokenArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public OrganizationApplicationUserToken(java.lang.String name, OrganizationApplicationUserTokenArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public OrganizationApplicationUserToken(java.lang.String name, OrganizationApplicationUserTokenArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aiven:index/organizationApplicationUserToken:OrganizationApplicationUserToken", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private OrganizationApplicationUserToken(java.lang.String name, Output<java.lang.String> id, @Nullable OrganizationApplicationUserTokenState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aiven:index/organizationApplicationUserToken:OrganizationApplicationUserToken", name, state, makeResourceOptions(options, id), false);
    }

    private static OrganizationApplicationUserTokenArgs makeArgs(OrganizationApplicationUserTokenArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? OrganizationApplicationUserTokenArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .additionalSecretOutputs(List.of(
                "fullToken"
            ))
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static OrganizationApplicationUserToken get(java.lang.String name, Output<java.lang.String> id, @Nullable OrganizationApplicationUserTokenState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new OrganizationApplicationUserToken(name, id, state, options);
    }
}
