// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aiven;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PgUserArgs extends com.pulumi.resources.ResourceArgs {

    public static final PgUserArgs Empty = new PgUserArgs();

    /**
     * The password of the service user.
     * 
     */
    @Import(name="password")
    private @Nullable Output<String> password;

    /**
     * @return The password of the service user.
     * 
     */
    public Optional<Output<String>> password() {
        return Optional.ofNullable(this.password);
    }

    /**
     * Allows replication. For the default avnadmin user this attribute is required and is always `true`.
     * 
     */
    @Import(name="pgAllowReplication")
    private @Nullable Output<Boolean> pgAllowReplication;

    /**
     * @return Allows replication. For the default avnadmin user this attribute is required and is always `true`.
     * 
     */
    public Optional<Output<Boolean>> pgAllowReplication() {
        return Optional.ofNullable(this.pgAllowReplication);
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
     * The name of the service user for this service. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
     * 
     */
    @Import(name="username", required=true)
    private Output<String> username;

    /**
     * @return The name of the service user for this service. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
     * 
     */
    public Output<String> username() {
        return this.username;
    }

    private PgUserArgs() {}

    private PgUserArgs(PgUserArgs $) {
        this.password = $.password;
        this.pgAllowReplication = $.pgAllowReplication;
        this.project = $.project;
        this.serviceName = $.serviceName;
        this.username = $.username;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PgUserArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PgUserArgs $;

        public Builder() {
            $ = new PgUserArgs();
        }

        public Builder(PgUserArgs defaults) {
            $ = new PgUserArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param password The password of the service user.
         * 
         * @return builder
         * 
         */
        public Builder password(@Nullable Output<String> password) {
            $.password = password;
            return this;
        }

        /**
         * @param password The password of the service user.
         * 
         * @return builder
         * 
         */
        public Builder password(String password) {
            return password(Output.of(password));
        }

        /**
         * @param pgAllowReplication Allows replication. For the default avnadmin user this attribute is required and is always `true`.
         * 
         * @return builder
         * 
         */
        public Builder pgAllowReplication(@Nullable Output<Boolean> pgAllowReplication) {
            $.pgAllowReplication = pgAllowReplication;
            return this;
        }

        /**
         * @param pgAllowReplication Allows replication. For the default avnadmin user this attribute is required and is always `true`.
         * 
         * @return builder
         * 
         */
        public Builder pgAllowReplication(Boolean pgAllowReplication) {
            return pgAllowReplication(Output.of(pgAllowReplication));
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
         * @param username The name of the service user for this service. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
         * 
         * @return builder
         * 
         */
        public Builder username(Output<String> username) {
            $.username = username;
            return this;
        }

        /**
         * @param username The name of the service user for this service. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
         * 
         * @return builder
         * 
         */
        public Builder username(String username) {
            return username(Output.of(username));
        }

        public PgUserArgs build() {
            if ($.project == null) {
                throw new MissingRequiredPropertyException("PgUserArgs", "project");
            }
            if ($.serviceName == null) {
                throw new MissingRequiredPropertyException("PgUserArgs", "serviceName");
            }
            if ($.username == null) {
                throw new MissingRequiredPropertyException("PgUserArgs", "username");
            }
            return $;
        }
    }

}
