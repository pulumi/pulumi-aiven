// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aiven;

import com.pulumi.aiven.MysqlUserArgs;
import com.pulumi.aiven.Utilities;
import com.pulumi.aiven.inputs.MysqlUserState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * The MySQL User resource allows the creation and management of Aiven MySQL Users.
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
 * import com.pulumi.aiven.MysqlUser;
 * import com.pulumi.aiven.MysqlUserArgs;
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
 *         var foo = new MysqlUser("foo", MysqlUserArgs.builder()
 *             .serviceName(bar.serviceName())
 *             .project("my-project")
 *             .username("user-1")
 *             .password("Test$1234")
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
 * $ pulumi import aiven:index/mysqlUser:MysqlUser foo PROJECT/SERVICE_NAME/USERNAME
 * ```
 * 
 */
@ResourceType(type="aiven:index/mysqlUser:MysqlUser")
public class MysqlUser extends com.pulumi.resources.CustomResource {
    /**
     * Access certificate for the user
     * 
     */
    @Export(name="accessCert", refs={String.class}, tree="[0]")
    private Output<String> accessCert;

    /**
     * @return Access certificate for the user
     * 
     */
    public Output<String> accessCert() {
        return this.accessCert;
    }
    /**
     * Access certificate key for the user
     * 
     */
    @Export(name="accessKey", refs={String.class}, tree="[0]")
    private Output<String> accessKey;

    /**
     * @return Access certificate key for the user
     * 
     */
    public Output<String> accessKey() {
        return this.accessKey;
    }
    /**
     * Authentication details. The possible values are `null`, `caching_sha2_password` and `mysql_native_password`.
     * 
     */
    @Export(name="authentication", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> authentication;

    /**
     * @return Authentication details. The possible values are `null`, `caching_sha2_password` and `mysql_native_password`.
     * 
     */
    public Output<Optional<String>> authentication() {
        return Codegen.optional(this.authentication);
    }
    /**
     * The password of the MySQL User ( not applicable for all services ).
     * 
     */
    @Export(name="password", refs={String.class}, tree="[0]")
    private Output<String> password;

    /**
     * @return The password of the MySQL User ( not applicable for all services ).
     * 
     */
    public Output<String> password() {
        return this.password;
    }
    /**
     * The name of the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
     * 
     */
    @Export(name="project", refs={String.class}, tree="[0]")
    private Output<String> project;

    /**
     * @return The name of the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
     * 
     */
    public Output<String> project() {
        return this.project;
    }
    /**
     * The name of the service that this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
     * 
     */
    @Export(name="serviceName", refs={String.class}, tree="[0]")
    private Output<String> serviceName;

    /**
     * @return The name of the service that this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
     * 
     */
    public Output<String> serviceName() {
        return this.serviceName;
    }
    /**
     * Type of the user account. Tells whether the user is the primary account or a regular account.
     * 
     */
    @Export(name="type", refs={String.class}, tree="[0]")
    private Output<String> type;

    /**
     * @return Type of the user account. Tells whether the user is the primary account or a regular account.
     * 
     */
    public Output<String> type() {
        return this.type;
    }
    /**
     * The actual name of the MySQL User. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
     * 
     */
    @Export(name="username", refs={String.class}, tree="[0]")
    private Output<String> username;

    /**
     * @return The actual name of the MySQL User. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
     * 
     */
    public Output<String> username() {
        return this.username;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public MysqlUser(java.lang.String name) {
        this(name, MysqlUserArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public MysqlUser(java.lang.String name, MysqlUserArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public MysqlUser(java.lang.String name, MysqlUserArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aiven:index/mysqlUser:MysqlUser", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private MysqlUser(java.lang.String name, Output<java.lang.String> id, @Nullable MysqlUserState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aiven:index/mysqlUser:MysqlUser", name, state, makeResourceOptions(options, id), false);
    }

    private static MysqlUserArgs makeArgs(MysqlUserArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? MysqlUserArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .additionalSecretOutputs(List.of(
                "accessCert",
                "accessKey",
                "password"
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
    public static MysqlUser get(java.lang.String name, Output<java.lang.String> id, @Nullable MysqlUserState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new MysqlUser(name, id, state, options);
    }
}
