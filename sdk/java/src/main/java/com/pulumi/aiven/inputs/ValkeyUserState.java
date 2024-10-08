// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aiven.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ValkeyUserState extends com.pulumi.resources.ResourceArgs {

    public static final ValkeyUserState Empty = new ValkeyUserState();

    /**
     * The password of the Valkey User.
     * 
     */
    @Import(name="password")
    private @Nullable Output<String> password;

    /**
     * @return The password of the Valkey User.
     * 
     */
    public Optional<Output<String>> password() {
        return Optional.ofNullable(this.password);
    }

    /**
     * The name of the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    /**
     * @return The name of the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
     * 
     */
    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * The name of the service that this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
     * 
     */
    @Import(name="serviceName")
    private @Nullable Output<String> serviceName;

    /**
     * @return The name of the service that this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
     * 
     */
    public Optional<Output<String>> serviceName() {
        return Optional.ofNullable(this.serviceName);
    }

    /**
     * Type of the user account. Tells whether the user is the primary account or a regular account.
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return Type of the user account. Tells whether the user is the primary account or a regular account.
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    /**
     * The actual name of the Valkey User. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
     * 
     */
    @Import(name="username")
    private @Nullable Output<String> username;

    /**
     * @return The actual name of the Valkey User. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
     * 
     */
    public Optional<Output<String>> username() {
        return Optional.ofNullable(this.username);
    }

    /**
     * Defines command category rules. The field is required with`valkey_acl_commands` and `valkey_acl_keys`. Changing this property forces recreation of the resource.
     * 
     */
    @Import(name="valkeyAclCategories")
    private @Nullable Output<List<String>> valkeyAclCategories;

    /**
     * @return Defines command category rules. The field is required with`valkey_acl_commands` and `valkey_acl_keys`. Changing this property forces recreation of the resource.
     * 
     */
    public Optional<Output<List<String>>> valkeyAclCategories() {
        return Optional.ofNullable(this.valkeyAclCategories);
    }

    /**
     * Defines the permitted pub/sub channel patterns. Changing this property forces recreation of the resource.
     * 
     */
    @Import(name="valkeyAclChannels")
    private @Nullable Output<List<String>> valkeyAclChannels;

    /**
     * @return Defines the permitted pub/sub channel patterns. Changing this property forces recreation of the resource.
     * 
     */
    public Optional<Output<List<String>>> valkeyAclChannels() {
        return Optional.ofNullable(this.valkeyAclChannels);
    }

    /**
     * Defines rules for individual commands. The field is required with`valkey_acl_categories` and `valkey_acl_keys`. Changing this property forces recreation of the resource.
     * 
     */
    @Import(name="valkeyAclCommands")
    private @Nullable Output<List<String>> valkeyAclCommands;

    /**
     * @return Defines rules for individual commands. The field is required with`valkey_acl_categories` and `valkey_acl_keys`. Changing this property forces recreation of the resource.
     * 
     */
    public Optional<Output<List<String>>> valkeyAclCommands() {
        return Optional.ofNullable(this.valkeyAclCommands);
    }

    /**
     * Defines key access rules. The field is required with`valkey_acl_categories` and `valkey_acl_keys`. Changing this property forces recreation of the resource.
     * 
     */
    @Import(name="valkeyAclKeys")
    private @Nullable Output<List<String>> valkeyAclKeys;

    /**
     * @return Defines key access rules. The field is required with`valkey_acl_categories` and `valkey_acl_keys`. Changing this property forces recreation of the resource.
     * 
     */
    public Optional<Output<List<String>>> valkeyAclKeys() {
        return Optional.ofNullable(this.valkeyAclKeys);
    }

    private ValkeyUserState() {}

    private ValkeyUserState(ValkeyUserState $) {
        this.password = $.password;
        this.project = $.project;
        this.serviceName = $.serviceName;
        this.type = $.type;
        this.username = $.username;
        this.valkeyAclCategories = $.valkeyAclCategories;
        this.valkeyAclChannels = $.valkeyAclChannels;
        this.valkeyAclCommands = $.valkeyAclCommands;
        this.valkeyAclKeys = $.valkeyAclKeys;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ValkeyUserState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ValkeyUserState $;

        public Builder() {
            $ = new ValkeyUserState();
        }

        public Builder(ValkeyUserState defaults) {
            $ = new ValkeyUserState(Objects.requireNonNull(defaults));
        }

        /**
         * @param password The password of the Valkey User.
         * 
         * @return builder
         * 
         */
        public Builder password(@Nullable Output<String> password) {
            $.password = password;
            return this;
        }

        /**
         * @param password The password of the Valkey User.
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
        public Builder project(@Nullable Output<String> project) {
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
         * @param serviceName The name of the service that this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
         * 
         * @return builder
         * 
         */
        public Builder serviceName(@Nullable Output<String> serviceName) {
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
         * @param type Type of the user account. Tells whether the user is the primary account or a regular account.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Type of the user account. Tells whether the user is the primary account or a regular account.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        /**
         * @param username The actual name of the Valkey User. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
         * 
         * @return builder
         * 
         */
        public Builder username(@Nullable Output<String> username) {
            $.username = username;
            return this;
        }

        /**
         * @param username The actual name of the Valkey User. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
         * 
         * @return builder
         * 
         */
        public Builder username(String username) {
            return username(Output.of(username));
        }

        /**
         * @param valkeyAclCategories Defines command category rules. The field is required with`valkey_acl_commands` and `valkey_acl_keys`. Changing this property forces recreation of the resource.
         * 
         * @return builder
         * 
         */
        public Builder valkeyAclCategories(@Nullable Output<List<String>> valkeyAclCategories) {
            $.valkeyAclCategories = valkeyAclCategories;
            return this;
        }

        /**
         * @param valkeyAclCategories Defines command category rules. The field is required with`valkey_acl_commands` and `valkey_acl_keys`. Changing this property forces recreation of the resource.
         * 
         * @return builder
         * 
         */
        public Builder valkeyAclCategories(List<String> valkeyAclCategories) {
            return valkeyAclCategories(Output.of(valkeyAclCategories));
        }

        /**
         * @param valkeyAclCategories Defines command category rules. The field is required with`valkey_acl_commands` and `valkey_acl_keys`. Changing this property forces recreation of the resource.
         * 
         * @return builder
         * 
         */
        public Builder valkeyAclCategories(String... valkeyAclCategories) {
            return valkeyAclCategories(List.of(valkeyAclCategories));
        }

        /**
         * @param valkeyAclChannels Defines the permitted pub/sub channel patterns. Changing this property forces recreation of the resource.
         * 
         * @return builder
         * 
         */
        public Builder valkeyAclChannels(@Nullable Output<List<String>> valkeyAclChannels) {
            $.valkeyAclChannels = valkeyAclChannels;
            return this;
        }

        /**
         * @param valkeyAclChannels Defines the permitted pub/sub channel patterns. Changing this property forces recreation of the resource.
         * 
         * @return builder
         * 
         */
        public Builder valkeyAclChannels(List<String> valkeyAclChannels) {
            return valkeyAclChannels(Output.of(valkeyAclChannels));
        }

        /**
         * @param valkeyAclChannels Defines the permitted pub/sub channel patterns. Changing this property forces recreation of the resource.
         * 
         * @return builder
         * 
         */
        public Builder valkeyAclChannels(String... valkeyAclChannels) {
            return valkeyAclChannels(List.of(valkeyAclChannels));
        }

        /**
         * @param valkeyAclCommands Defines rules for individual commands. The field is required with`valkey_acl_categories` and `valkey_acl_keys`. Changing this property forces recreation of the resource.
         * 
         * @return builder
         * 
         */
        public Builder valkeyAclCommands(@Nullable Output<List<String>> valkeyAclCommands) {
            $.valkeyAclCommands = valkeyAclCommands;
            return this;
        }

        /**
         * @param valkeyAclCommands Defines rules for individual commands. The field is required with`valkey_acl_categories` and `valkey_acl_keys`. Changing this property forces recreation of the resource.
         * 
         * @return builder
         * 
         */
        public Builder valkeyAclCommands(List<String> valkeyAclCommands) {
            return valkeyAclCommands(Output.of(valkeyAclCommands));
        }

        /**
         * @param valkeyAclCommands Defines rules for individual commands. The field is required with`valkey_acl_categories` and `valkey_acl_keys`. Changing this property forces recreation of the resource.
         * 
         * @return builder
         * 
         */
        public Builder valkeyAclCommands(String... valkeyAclCommands) {
            return valkeyAclCommands(List.of(valkeyAclCommands));
        }

        /**
         * @param valkeyAclKeys Defines key access rules. The field is required with`valkey_acl_categories` and `valkey_acl_keys`. Changing this property forces recreation of the resource.
         * 
         * @return builder
         * 
         */
        public Builder valkeyAclKeys(@Nullable Output<List<String>> valkeyAclKeys) {
            $.valkeyAclKeys = valkeyAclKeys;
            return this;
        }

        /**
         * @param valkeyAclKeys Defines key access rules. The field is required with`valkey_acl_categories` and `valkey_acl_keys`. Changing this property forces recreation of the resource.
         * 
         * @return builder
         * 
         */
        public Builder valkeyAclKeys(List<String> valkeyAclKeys) {
            return valkeyAclKeys(Output.of(valkeyAclKeys));
        }

        /**
         * @param valkeyAclKeys Defines key access rules. The field is required with`valkey_acl_categories` and `valkey_acl_keys`. Changing this property forces recreation of the resource.
         * 
         * @return builder
         * 
         */
        public Builder valkeyAclKeys(String... valkeyAclKeys) {
            return valkeyAclKeys(List.of(valkeyAclKeys));
        }

        public ValkeyUserState build() {
            return $;
        }
    }

}
