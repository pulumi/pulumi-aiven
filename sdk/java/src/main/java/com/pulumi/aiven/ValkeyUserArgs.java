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


public final class ValkeyUserArgs extends com.pulumi.resources.ResourceArgs {

    public static final ValkeyUserArgs Empty = new ValkeyUserArgs();

    /**
     * The Valkey service user&#39;s password.
     * 
     */
    @Import(name="password")
    private @Nullable Output<String> password;

    /**
     * @return The Valkey service user&#39;s password.
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
     * Name of the Valkey service user. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
     * 
     */
    @Import(name="username", required=true)
    private Output<String> username;

    /**
     * @return Name of the Valkey service user. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
     * 
     */
    public Output<String> username() {
        return this.username;
    }

    /**
     * Allow or disallow command categories. To allow a category use the prefix `+{@literal @}` and to disallow use `-{@literal @}`. See the [Valkey documentation](https://valkey.io/topics/acl/) for details on the ACL feature. The field is required with`valkey_acl_commands` and `valkey_acl_keys`. Changing this property forces recreation of the resource.
     * 
     */
    @Import(name="valkeyAclCategories")
    private @Nullable Output<List<String>> valkeyAclCategories;

    /**
     * @return Allow or disallow command categories. To allow a category use the prefix `+{@literal @}` and to disallow use `-{@literal @}`. See the [Valkey documentation](https://valkey.io/topics/acl/) for details on the ACL feature. The field is required with`valkey_acl_commands` and `valkey_acl_keys`. Changing this property forces recreation of the resource.
     * 
     */
    public Optional<Output<List<String>>> valkeyAclCategories() {
        return Optional.ofNullable(this.valkeyAclCategories);
    }

    /**
     * Allows and disallows access to pub/sub channels. Entries are defined as standard glob patterns. Changing this property forces recreation of the resource.
     * 
     */
    @Import(name="valkeyAclChannels")
    private @Nullable Output<List<String>> valkeyAclChannels;

    /**
     * @return Allows and disallows access to pub/sub channels. Entries are defined as standard glob patterns. Changing this property forces recreation of the resource.
     * 
     */
    public Optional<Output<List<String>>> valkeyAclChannels() {
        return Optional.ofNullable(this.valkeyAclChannels);
    }

    /**
     * Defines rules for individual commands. To allow a command use the prefix `+` and to disallow use `-`. The field is required with`valkey_acl_categories` and `valkey_acl_keys`. Changing this property forces recreation of the resource.
     * 
     */
    @Import(name="valkeyAclCommands")
    private @Nullable Output<List<String>> valkeyAclCommands;

    /**
     * @return Defines rules for individual commands. To allow a command use the prefix `+` and to disallow use `-`. The field is required with`valkey_acl_categories` and `valkey_acl_keys`. Changing this property forces recreation of the resource.
     * 
     */
    public Optional<Output<List<String>>> valkeyAclCommands() {
        return Optional.ofNullable(this.valkeyAclCommands);
    }

    /**
     * Key access rules. Entries are defined as standard glob patterns. The field is required with`valkey_acl_categories` and `valkey_acl_keys`. Changing this property forces recreation of the resource.
     * 
     */
    @Import(name="valkeyAclKeys")
    private @Nullable Output<List<String>> valkeyAclKeys;

    /**
     * @return Key access rules. Entries are defined as standard glob patterns. The field is required with`valkey_acl_categories` and `valkey_acl_keys`. Changing this property forces recreation of the resource.
     * 
     */
    public Optional<Output<List<String>>> valkeyAclKeys() {
        return Optional.ofNullable(this.valkeyAclKeys);
    }

    private ValkeyUserArgs() {}

    private ValkeyUserArgs(ValkeyUserArgs $) {
        this.password = $.password;
        this.project = $.project;
        this.serviceName = $.serviceName;
        this.username = $.username;
        this.valkeyAclCategories = $.valkeyAclCategories;
        this.valkeyAclChannels = $.valkeyAclChannels;
        this.valkeyAclCommands = $.valkeyAclCommands;
        this.valkeyAclKeys = $.valkeyAclKeys;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ValkeyUserArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ValkeyUserArgs $;

        public Builder() {
            $ = new ValkeyUserArgs();
        }

        public Builder(ValkeyUserArgs defaults) {
            $ = new ValkeyUserArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param password The Valkey service user&#39;s password.
         * 
         * @return builder
         * 
         */
        public Builder password(@Nullable Output<String> password) {
            $.password = password;
            return this;
        }

        /**
         * @param password The Valkey service user&#39;s password.
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
         * @param username Name of the Valkey service user. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
         * 
         * @return builder
         * 
         */
        public Builder username(Output<String> username) {
            $.username = username;
            return this;
        }

        /**
         * @param username Name of the Valkey service user. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
         * 
         * @return builder
         * 
         */
        public Builder username(String username) {
            return username(Output.of(username));
        }

        /**
         * @param valkeyAclCategories Allow or disallow command categories. To allow a category use the prefix `+{@literal @}` and to disallow use `-{@literal @}`. See the [Valkey documentation](https://valkey.io/topics/acl/) for details on the ACL feature. The field is required with`valkey_acl_commands` and `valkey_acl_keys`. Changing this property forces recreation of the resource.
         * 
         * @return builder
         * 
         */
        public Builder valkeyAclCategories(@Nullable Output<List<String>> valkeyAclCategories) {
            $.valkeyAclCategories = valkeyAclCategories;
            return this;
        }

        /**
         * @param valkeyAclCategories Allow or disallow command categories. To allow a category use the prefix `+{@literal @}` and to disallow use `-{@literal @}`. See the [Valkey documentation](https://valkey.io/topics/acl/) for details on the ACL feature. The field is required with`valkey_acl_commands` and `valkey_acl_keys`. Changing this property forces recreation of the resource.
         * 
         * @return builder
         * 
         */
        public Builder valkeyAclCategories(List<String> valkeyAclCategories) {
            return valkeyAclCategories(Output.of(valkeyAclCategories));
        }

        /**
         * @param valkeyAclCategories Allow or disallow command categories. To allow a category use the prefix `+{@literal @}` and to disallow use `-{@literal @}`. See the [Valkey documentation](https://valkey.io/topics/acl/) for details on the ACL feature. The field is required with`valkey_acl_commands` and `valkey_acl_keys`. Changing this property forces recreation of the resource.
         * 
         * @return builder
         * 
         */
        public Builder valkeyAclCategories(String... valkeyAclCategories) {
            return valkeyAclCategories(List.of(valkeyAclCategories));
        }

        /**
         * @param valkeyAclChannels Allows and disallows access to pub/sub channels. Entries are defined as standard glob patterns. Changing this property forces recreation of the resource.
         * 
         * @return builder
         * 
         */
        public Builder valkeyAclChannels(@Nullable Output<List<String>> valkeyAclChannels) {
            $.valkeyAclChannels = valkeyAclChannels;
            return this;
        }

        /**
         * @param valkeyAclChannels Allows and disallows access to pub/sub channels. Entries are defined as standard glob patterns. Changing this property forces recreation of the resource.
         * 
         * @return builder
         * 
         */
        public Builder valkeyAclChannels(List<String> valkeyAclChannels) {
            return valkeyAclChannels(Output.of(valkeyAclChannels));
        }

        /**
         * @param valkeyAclChannels Allows and disallows access to pub/sub channels. Entries are defined as standard glob patterns. Changing this property forces recreation of the resource.
         * 
         * @return builder
         * 
         */
        public Builder valkeyAclChannels(String... valkeyAclChannels) {
            return valkeyAclChannels(List.of(valkeyAclChannels));
        }

        /**
         * @param valkeyAclCommands Defines rules for individual commands. To allow a command use the prefix `+` and to disallow use `-`. The field is required with`valkey_acl_categories` and `valkey_acl_keys`. Changing this property forces recreation of the resource.
         * 
         * @return builder
         * 
         */
        public Builder valkeyAclCommands(@Nullable Output<List<String>> valkeyAclCommands) {
            $.valkeyAclCommands = valkeyAclCommands;
            return this;
        }

        /**
         * @param valkeyAclCommands Defines rules for individual commands. To allow a command use the prefix `+` and to disallow use `-`. The field is required with`valkey_acl_categories` and `valkey_acl_keys`. Changing this property forces recreation of the resource.
         * 
         * @return builder
         * 
         */
        public Builder valkeyAclCommands(List<String> valkeyAclCommands) {
            return valkeyAclCommands(Output.of(valkeyAclCommands));
        }

        /**
         * @param valkeyAclCommands Defines rules for individual commands. To allow a command use the prefix `+` and to disallow use `-`. The field is required with`valkey_acl_categories` and `valkey_acl_keys`. Changing this property forces recreation of the resource.
         * 
         * @return builder
         * 
         */
        public Builder valkeyAclCommands(String... valkeyAclCommands) {
            return valkeyAclCommands(List.of(valkeyAclCommands));
        }

        /**
         * @param valkeyAclKeys Key access rules. Entries are defined as standard glob patterns. The field is required with`valkey_acl_categories` and `valkey_acl_keys`. Changing this property forces recreation of the resource.
         * 
         * @return builder
         * 
         */
        public Builder valkeyAclKeys(@Nullable Output<List<String>> valkeyAclKeys) {
            $.valkeyAclKeys = valkeyAclKeys;
            return this;
        }

        /**
         * @param valkeyAclKeys Key access rules. Entries are defined as standard glob patterns. The field is required with`valkey_acl_categories` and `valkey_acl_keys`. Changing this property forces recreation of the resource.
         * 
         * @return builder
         * 
         */
        public Builder valkeyAclKeys(List<String> valkeyAclKeys) {
            return valkeyAclKeys(Output.of(valkeyAclKeys));
        }

        /**
         * @param valkeyAclKeys Key access rules. Entries are defined as standard glob patterns. The field is required with`valkey_acl_categories` and `valkey_acl_keys`. Changing this property forces recreation of the resource.
         * 
         * @return builder
         * 
         */
        public Builder valkeyAclKeys(String... valkeyAclKeys) {
            return valkeyAclKeys(List.of(valkeyAclKeys));
        }

        public ValkeyUserArgs build() {
            if ($.project == null) {
                throw new MissingRequiredPropertyException("ValkeyUserArgs", "project");
            }
            if ($.serviceName == null) {
                throw new MissingRequiredPropertyException("ValkeyUserArgs", "serviceName");
            }
            if ($.username == null) {
                throw new MissingRequiredPropertyException("ValkeyUserArgs", "username");
            }
            return $;
        }
    }

}
