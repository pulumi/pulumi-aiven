// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aiven;

import com.pulumi.aiven.RedisUserArgs;
import com.pulumi.aiven.Utilities;
import com.pulumi.aiven.inputs.RedisUserState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * The Redis User resource allows the creation and management of Aiven Redis Users.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aiven.RedisUser;
 * import com.pulumi.aiven.RedisUserArgs;
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
 *         var foo = new RedisUser(&#34;foo&#34;, RedisUserArgs.builder()        
 *             .serviceName(aiven_redis.bar().service_name())
 *             .project(&#34;my-project&#34;)
 *             .username(&#34;user-1&#34;)
 *             .password(&#34;Test$1234&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 */
@ResourceType(type="aiven:index/redisUser:RedisUser")
public class RedisUser extends com.pulumi.resources.CustomResource {
    /**
     * The password of the Redis User.
     * 
     */
    @Export(name="password", type=String.class, parameters={})
    private Output<String> password;

    /**
     * @return The password of the Redis User.
     * 
     */
    public Output<String> password() {
        return this.password;
    }
    /**
     * Identifies the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. This property cannot be changed, doing so forces recreation of the resource.
     * 
     */
    @Export(name="project", type=String.class, parameters={})
    private Output<String> project;

    /**
     * @return Identifies the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. This property cannot be changed, doing so forces recreation of the resource.
     * 
     */
    public Output<String> project() {
        return this.project;
    }
    /**
     * Defines command category rules. The field is required with`redis_acl_commands` and `redis_acl_keys`. This property cannot be changed, doing so forces recreation of the resource.
     * 
     */
    @Export(name="redisAclCategories", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> redisAclCategories;

    /**
     * @return Defines command category rules. The field is required with`redis_acl_commands` and `redis_acl_keys`. This property cannot be changed, doing so forces recreation of the resource.
     * 
     */
    public Output<Optional<List<String>>> redisAclCategories() {
        return Codegen.optional(this.redisAclCategories);
    }
    /**
     * Defines the permitted pub/sub channel patterns. This property cannot be changed, doing so forces recreation of the resource.
     * 
     */
    @Export(name="redisAclChannels", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> redisAclChannels;

    /**
     * @return Defines the permitted pub/sub channel patterns. This property cannot be changed, doing so forces recreation of the resource.
     * 
     */
    public Output<Optional<List<String>>> redisAclChannels() {
        return Codegen.optional(this.redisAclChannels);
    }
    /**
     * Defines rules for individual commands. The field is required with`redis_acl_categories` and `redis_acl_keys`. This property cannot be changed, doing so forces recreation of the resource.
     * 
     */
    @Export(name="redisAclCommands", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> redisAclCommands;

    /**
     * @return Defines rules for individual commands. The field is required with`redis_acl_categories` and `redis_acl_keys`. This property cannot be changed, doing so forces recreation of the resource.
     * 
     */
    public Output<Optional<List<String>>> redisAclCommands() {
        return Codegen.optional(this.redisAclCommands);
    }
    /**
     * Defines key access rules. The field is required with`redis_acl_categories` and `redis_acl_keys`. This property cannot be changed, doing so forces recreation of the resource.
     * 
     */
    @Export(name="redisAclKeys", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> redisAclKeys;

    /**
     * @return Defines key access rules. The field is required with`redis_acl_categories` and `redis_acl_keys`. This property cannot be changed, doing so forces recreation of the resource.
     * 
     */
    public Output<Optional<List<String>>> redisAclKeys() {
        return Codegen.optional(this.redisAclKeys);
    }
    /**
     * Specifies the name of the service that this resource belongs to. To set up proper dependencies please refer to this variable as a reference. This property cannot be changed, doing so forces recreation of the resource.
     * 
     */
    @Export(name="serviceName", type=String.class, parameters={})
    private Output<String> serviceName;

    /**
     * @return Specifies the name of the service that this resource belongs to. To set up proper dependencies please refer to this variable as a reference. This property cannot be changed, doing so forces recreation of the resource.
     * 
     */
    public Output<String> serviceName() {
        return this.serviceName;
    }
    /**
     * Type of the user account. Tells whether the user is the primary account or a regular account.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Type of the user account. Tells whether the user is the primary account or a regular account.
     * 
     */
    public Output<String> type() {
        return this.type;
    }
    /**
     * The actual name of the Redis User. To set up proper dependencies please refer to this variable as a reference. This property cannot be changed, doing so forces recreation of the resource.
     * 
     */
    @Export(name="username", type=String.class, parameters={})
    private Output<String> username;

    /**
     * @return The actual name of the Redis User. To set up proper dependencies please refer to this variable as a reference. This property cannot be changed, doing so forces recreation of the resource.
     * 
     */
    public Output<String> username() {
        return this.username;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public RedisUser(String name) {
        this(name, RedisUserArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public RedisUser(String name, RedisUserArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public RedisUser(String name, RedisUserArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aiven:index/redisUser:RedisUser", name, args == null ? RedisUserArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private RedisUser(String name, Output<String> id, @Nullable RedisUserState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aiven:index/redisUser:RedisUser", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .additionalSecretOutputs(List.of(
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
    public static RedisUser get(String name, Output<String> id, @Nullable RedisUserState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new RedisUser(name, id, state, options);
    }
}