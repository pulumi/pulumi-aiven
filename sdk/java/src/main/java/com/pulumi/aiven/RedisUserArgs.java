// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aiven;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RedisUserArgs extends com.pulumi.resources.ResourceArgs {

    public static final RedisUserArgs Empty = new RedisUserArgs();

    /**
     * The password of the Redis User.
     * 
     */
    @Import(name="password")
    private @Nullable Output<String> password;

    /**
     * @return The password of the Redis User.
     * 
     */
    public Optional<Output<String>> password() {
        return Optional.ofNullable(this.password);
    }

    /**
     * The name of the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
     * 
     */
    @Import(name="project", required=true)
    private Output<String> project;

    /**
     * @return The name of the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
     * 
     */
    public Output<String> project() {
        return this.project;
    }

    /**
     * Defines command category rules. The field is required with`redis_acl_commands` and `redis_acl_keys`. Changing this property forces recreation of the resource.
     * 
     */
    @Import(name="redisAclCategories")
    private @Nullable Output<List<String>> redisAclCategories;

    /**
     * @return Defines command category rules. The field is required with`redis_acl_commands` and `redis_acl_keys`. Changing this property forces recreation of the resource.
     * 
     */
    public Optional<Output<List<String>>> redisAclCategories() {
        return Optional.ofNullable(this.redisAclCategories);
    }

    /**
     * Defines the permitted pub/sub channel patterns. Changing this property forces recreation of the resource.
     * 
     */
    @Import(name="redisAclChannels")
    private @Nullable Output<List<String>> redisAclChannels;

    /**
     * @return Defines the permitted pub/sub channel patterns. Changing this property forces recreation of the resource.
     * 
     */
    public Optional<Output<List<String>>> redisAclChannels() {
        return Optional.ofNullable(this.redisAclChannels);
    }

    /**
     * Defines rules for individual commands. The field is required with`redis_acl_categories` and `redis_acl_keys`. Changing this property forces recreation of the resource.
     * 
     */
    @Import(name="redisAclCommands")
    private @Nullable Output<List<String>> redisAclCommands;

    /**
     * @return Defines rules for individual commands. The field is required with`redis_acl_categories` and `redis_acl_keys`. Changing this property forces recreation of the resource.
     * 
     */
    public Optional<Output<List<String>>> redisAclCommands() {
        return Optional.ofNullable(this.redisAclCommands);
    }

    /**
     * Defines key access rules. The field is required with`redis_acl_categories` and `redis_acl_keys`. Changing this property forces recreation of the resource.
     * 
     */
    @Import(name="redisAclKeys")
    private @Nullable Output<List<String>> redisAclKeys;

    /**
     * @return Defines key access rules. The field is required with`redis_acl_categories` and `redis_acl_keys`. Changing this property forces recreation of the resource.
     * 
     */
    public Optional<Output<List<String>>> redisAclKeys() {
        return Optional.ofNullable(this.redisAclKeys);
    }

    /**
     * The name of the service that this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
     * 
     */
    @Import(name="serviceName", required=true)
    private Output<String> serviceName;

    /**
     * @return The name of the service that this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
     * 
     */
    public Output<String> serviceName() {
        return this.serviceName;
    }

    /**
     * The actual name of the Redis User. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
     * 
     */
    @Import(name="username", required=true)
    private Output<String> username;

    /**
     * @return The actual name of the Redis User. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
     * 
     */
    public Output<String> username() {
        return this.username;
    }

    private RedisUserArgs() {}

    private RedisUserArgs(RedisUserArgs $) {
        this.password = $.password;
        this.project = $.project;
        this.redisAclCategories = $.redisAclCategories;
        this.redisAclChannels = $.redisAclChannels;
        this.redisAclCommands = $.redisAclCommands;
        this.redisAclKeys = $.redisAclKeys;
        this.serviceName = $.serviceName;
        this.username = $.username;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RedisUserArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RedisUserArgs $;

        public Builder() {
            $ = new RedisUserArgs();
        }

        public Builder(RedisUserArgs defaults) {
            $ = new RedisUserArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param password The password of the Redis User.
         * 
         * @return builder
         * 
         */
        public Builder password(@Nullable Output<String> password) {
            $.password = password;
            return this;
        }

        /**
         * @param password The password of the Redis User.
         * 
         * @return builder
         * 
         */
        public Builder password(String password) {
            return password(Output.of(password));
        }

        /**
         * @param project The name of the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
         * 
         * @return builder
         * 
         */
        public Builder project(Output<String> project) {
            $.project = project;
            return this;
        }

        /**
         * @param project The name of the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
         * 
         * @return builder
         * 
         */
        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param redisAclCategories Defines command category rules. The field is required with`redis_acl_commands` and `redis_acl_keys`. Changing this property forces recreation of the resource.
         * 
         * @return builder
         * 
         */
        public Builder redisAclCategories(@Nullable Output<List<String>> redisAclCategories) {
            $.redisAclCategories = redisAclCategories;
            return this;
        }

        /**
         * @param redisAclCategories Defines command category rules. The field is required with`redis_acl_commands` and `redis_acl_keys`. Changing this property forces recreation of the resource.
         * 
         * @return builder
         * 
         */
        public Builder redisAclCategories(List<String> redisAclCategories) {
            return redisAclCategories(Output.of(redisAclCategories));
        }

        /**
         * @param redisAclCategories Defines command category rules. The field is required with`redis_acl_commands` and `redis_acl_keys`. Changing this property forces recreation of the resource.
         * 
         * @return builder
         * 
         */
        public Builder redisAclCategories(String... redisAclCategories) {
            return redisAclCategories(List.of(redisAclCategories));
        }

        /**
         * @param redisAclChannels Defines the permitted pub/sub channel patterns. Changing this property forces recreation of the resource.
         * 
         * @return builder
         * 
         */
        public Builder redisAclChannels(@Nullable Output<List<String>> redisAclChannels) {
            $.redisAclChannels = redisAclChannels;
            return this;
        }

        /**
         * @param redisAclChannels Defines the permitted pub/sub channel patterns. Changing this property forces recreation of the resource.
         * 
         * @return builder
         * 
         */
        public Builder redisAclChannels(List<String> redisAclChannels) {
            return redisAclChannels(Output.of(redisAclChannels));
        }

        /**
         * @param redisAclChannels Defines the permitted pub/sub channel patterns. Changing this property forces recreation of the resource.
         * 
         * @return builder
         * 
         */
        public Builder redisAclChannels(String... redisAclChannels) {
            return redisAclChannels(List.of(redisAclChannels));
        }

        /**
         * @param redisAclCommands Defines rules for individual commands. The field is required with`redis_acl_categories` and `redis_acl_keys`. Changing this property forces recreation of the resource.
         * 
         * @return builder
         * 
         */
        public Builder redisAclCommands(@Nullable Output<List<String>> redisAclCommands) {
            $.redisAclCommands = redisAclCommands;
            return this;
        }

        /**
         * @param redisAclCommands Defines rules for individual commands. The field is required with`redis_acl_categories` and `redis_acl_keys`. Changing this property forces recreation of the resource.
         * 
         * @return builder
         * 
         */
        public Builder redisAclCommands(List<String> redisAclCommands) {
            return redisAclCommands(Output.of(redisAclCommands));
        }

        /**
         * @param redisAclCommands Defines rules for individual commands. The field is required with`redis_acl_categories` and `redis_acl_keys`. Changing this property forces recreation of the resource.
         * 
         * @return builder
         * 
         */
        public Builder redisAclCommands(String... redisAclCommands) {
            return redisAclCommands(List.of(redisAclCommands));
        }

        /**
         * @param redisAclKeys Defines key access rules. The field is required with`redis_acl_categories` and `redis_acl_keys`. Changing this property forces recreation of the resource.
         * 
         * @return builder
         * 
         */
        public Builder redisAclKeys(@Nullable Output<List<String>> redisAclKeys) {
            $.redisAclKeys = redisAclKeys;
            return this;
        }

        /**
         * @param redisAclKeys Defines key access rules. The field is required with`redis_acl_categories` and `redis_acl_keys`. Changing this property forces recreation of the resource.
         * 
         * @return builder
         * 
         */
        public Builder redisAclKeys(List<String> redisAclKeys) {
            return redisAclKeys(Output.of(redisAclKeys));
        }

        /**
         * @param redisAclKeys Defines key access rules. The field is required with`redis_acl_categories` and `redis_acl_keys`. Changing this property forces recreation of the resource.
         * 
         * @return builder
         * 
         */
        public Builder redisAclKeys(String... redisAclKeys) {
            return redisAclKeys(List.of(redisAclKeys));
        }

        /**
         * @param serviceName The name of the service that this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
         * 
         * @return builder
         * 
         */
        public Builder serviceName(Output<String> serviceName) {
            $.serviceName = serviceName;
            return this;
        }

        /**
         * @param serviceName The name of the service that this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
         * 
         * @return builder
         * 
         */
        public Builder serviceName(String serviceName) {
            return serviceName(Output.of(serviceName));
        }

        /**
         * @param username The actual name of the Redis User. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
         * 
         * @return builder
         * 
         */
        public Builder username(Output<String> username) {
            $.username = username;
            return this;
        }

        /**
         * @param username The actual name of the Redis User. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
         * 
         * @return builder
         * 
         */
        public Builder username(String username) {
            return username(Output.of(username));
        }

        public RedisUserArgs build() {
            if ($.project == null) {
                throw new MissingRequiredPropertyException("RedisUserArgs", "project");
            }
            if ($.serviceName == null) {
                throw new MissingRequiredPropertyException("RedisUserArgs", "serviceName");
            }
            if ($.username == null) {
                throw new MissingRequiredPropertyException("RedisUserArgs", "username");
            }
            return $;
        }
    }

}
