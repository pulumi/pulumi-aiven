// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aiven.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class KafkaSchemaRegistryAclState extends com.pulumi.resources.ResourceArgs {

    public static final KafkaSchemaRegistryAclState Empty = new KafkaSchemaRegistryAclState();

    /**
     * Kafka Schema Registry ACL ID
     * 
     */
    @Import(name="aclId")
    private @Nullable Output<String> aclId;

    /**
     * @return Kafka Schema Registry ACL ID
     * 
     */
    public Optional<Output<String>> aclId() {
        return Optional.ofNullable(this.aclId);
    }

    /**
     * Kafka Schema Registry permission to grant. The possible values are `schema_registry_read` and `schema_registry_write`. Changing this property forces recreation of the resource.
     * 
     */
    @Import(name="permission")
    private @Nullable Output<String> permission;

    /**
     * @return Kafka Schema Registry permission to grant. The possible values are `schema_registry_read` and `schema_registry_write`. Changing this property forces recreation of the resource.
     * 
     */
    public Optional<Output<String>> permission() {
        return Optional.ofNullable(this.permission);
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
     * Resource name pattern for the Schema Registry ACL entry. Changing this property forces recreation of the resource.
     * 
     */
    @Import(name="resource")
    private @Nullable Output<String> resource;

    /**
     * @return Resource name pattern for the Schema Registry ACL entry. Changing this property forces recreation of the resource.
     * 
     */
    public Optional<Output<String>> resource() {
        return Optional.ofNullable(this.resource);
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
     * Username pattern for the ACL entry. Changing this property forces recreation of the resource.
     * 
     */
    @Import(name="username")
    private @Nullable Output<String> username;

    /**
     * @return Username pattern for the ACL entry. Changing this property forces recreation of the resource.
     * 
     */
    public Optional<Output<String>> username() {
        return Optional.ofNullable(this.username);
    }

    private KafkaSchemaRegistryAclState() {}

    private KafkaSchemaRegistryAclState(KafkaSchemaRegistryAclState $) {
        this.aclId = $.aclId;
        this.permission = $.permission;
        this.project = $.project;
        this.resource = $.resource;
        this.serviceName = $.serviceName;
        this.username = $.username;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(KafkaSchemaRegistryAclState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private KafkaSchemaRegistryAclState $;

        public Builder() {
            $ = new KafkaSchemaRegistryAclState();
        }

        public Builder(KafkaSchemaRegistryAclState defaults) {
            $ = new KafkaSchemaRegistryAclState(Objects.requireNonNull(defaults));
        }

        /**
         * @param aclId Kafka Schema Registry ACL ID
         * 
         * @return builder
         * 
         */
        public Builder aclId(@Nullable Output<String> aclId) {
            $.aclId = aclId;
            return this;
        }

        /**
         * @param aclId Kafka Schema Registry ACL ID
         * 
         * @return builder
         * 
         */
        public Builder aclId(String aclId) {
            return aclId(Output.of(aclId));
        }

        /**
         * @param permission Kafka Schema Registry permission to grant. The possible values are `schema_registry_read` and `schema_registry_write`. Changing this property forces recreation of the resource.
         * 
         * @return builder
         * 
         */
        public Builder permission(@Nullable Output<String> permission) {
            $.permission = permission;
            return this;
        }

        /**
         * @param permission Kafka Schema Registry permission to grant. The possible values are `schema_registry_read` and `schema_registry_write`. Changing this property forces recreation of the resource.
         * 
         * @return builder
         * 
         */
        public Builder permission(String permission) {
            return permission(Output.of(permission));
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
         * @param resource Resource name pattern for the Schema Registry ACL entry. Changing this property forces recreation of the resource.
         * 
         * @return builder
         * 
         */
        public Builder resource(@Nullable Output<String> resource) {
            $.resource = resource;
            return this;
        }

        /**
         * @param resource Resource name pattern for the Schema Registry ACL entry. Changing this property forces recreation of the resource.
         * 
         * @return builder
         * 
         */
        public Builder resource(String resource) {
            return resource(Output.of(resource));
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
         * @param username Username pattern for the ACL entry. Changing this property forces recreation of the resource.
         * 
         * @return builder
         * 
         */
        public Builder username(@Nullable Output<String> username) {
            $.username = username;
            return this;
        }

        /**
         * @param username Username pattern for the ACL entry. Changing this property forces recreation of the resource.
         * 
         * @return builder
         * 
         */
        public Builder username(String username) {
            return username(Output.of(username));
        }

        public KafkaSchemaRegistryAclState build() {
            return $;
        }
    }

}
