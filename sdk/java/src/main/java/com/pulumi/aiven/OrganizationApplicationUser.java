// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aiven;

import com.pulumi.aiven.OrganizationApplicationUserArgs;
import com.pulumi.aiven.Utilities;
import com.pulumi.aiven.inputs.OrganizationApplicationUserState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Creates and manages an organization application user. [Application users](https://aiven.io/docs/platform/concepts/application-users) can be used for
 * programmatic access to the platform using a token created with the `aiven.OrganizationApplicationUserToken` resource.
 * 
 * You give application users access to your organization, projects, and services using the `aiven.OrganizationPermission` resource. You can also add application users to
 * groups using the `aiven.OrganizationUserGroupMember` resource.
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
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * ```sh
 * $ pulumi import aiven:index/organizationApplicationUser:OrganizationApplicationUser example ORGANIZATION_ID/USER_ID
 * ```
 * 
 */
@ResourceType(type="aiven:index/organizationApplicationUser:OrganizationApplicationUser")
public class OrganizationApplicationUser extends com.pulumi.resources.CustomResource {
    /**
     * An email address automatically generated by Aiven to help identify the application user. No notifications are sent to this email.
     * 
     */
    @Export(name="email", refs={String.class}, tree="[0]")
    private Output<String> email;

    /**
     * @return An email address automatically generated by Aiven to help identify the application user. No notifications are sent to this email.
     * 
     */
    public Output<String> email() {
        return this.email;
    }
    /**
     * Makes the application user a super admin. The super admin role has completely unrestricted access to all organization resources and settings. This role should be limited to as few users as possible. For daily administrative tasks, assign users the organization admin role instead using the `aiven.OrganizationPermission` resource.
     * 
     * @deprecated
     * This field is deprecated and will be removed in the next major release. For administrative tasks, assign application users the organization admin role instead using the aiven.OrganizationPermission resource.
     * 
     */
    @Deprecated /* This field is deprecated and will be removed in the next major release. For administrative tasks, assign application users the organization admin role instead using the aiven.OrganizationPermission resource. */
    @Export(name="isSuperAdmin", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> isSuperAdmin;

    /**
     * @return Makes the application user a super admin. The super admin role has completely unrestricted access to all organization resources and settings. This role should be limited to as few users as possible. For daily administrative tasks, assign users the organization admin role instead using the `aiven.OrganizationPermission` resource.
     * 
     */
    public Output<Optional<Boolean>> isSuperAdmin() {
        return Codegen.optional(this.isSuperAdmin);
    }
    /**
     * Name of the application user.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Name of the application user.
     * 
     */
    public Output<String> name() {
        return this.name;
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
     * The ID of the application user.
     * 
     */
    @Export(name="userId", refs={String.class}, tree="[0]")
    private Output<String> userId;

    /**
     * @return The ID of the application user.
     * 
     */
    public Output<String> userId() {
        return this.userId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public OrganizationApplicationUser(java.lang.String name) {
        this(name, OrganizationApplicationUserArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public OrganizationApplicationUser(java.lang.String name, OrganizationApplicationUserArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public OrganizationApplicationUser(java.lang.String name, OrganizationApplicationUserArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aiven:index/organizationApplicationUser:OrganizationApplicationUser", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private OrganizationApplicationUser(java.lang.String name, Output<java.lang.String> id, @Nullable OrganizationApplicationUserState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aiven:index/organizationApplicationUser:OrganizationApplicationUser", name, state, makeResourceOptions(options, id), false);
    }

    private static OrganizationApplicationUserArgs makeArgs(OrganizationApplicationUserArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? OrganizationApplicationUserArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
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
    public static OrganizationApplicationUser get(java.lang.String name, Output<java.lang.String> id, @Nullable OrganizationApplicationUserState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new OrganizationApplicationUser(name, id, state, options);
    }
}
