// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aiven.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class InfluxdbUserState extends com.pulumi.resources.ResourceArgs {

    public static final InfluxdbUserState Empty = new InfluxdbUserState();

    /**
     * Access certificate for the user if applicable for the service in question
     * 
     */
    @Import(name="accessCert")
    private @Nullable Output<String> accessCert;

    /**
     * @return Access certificate for the user if applicable for the service in question
     * 
     */
    public Optional<Output<String>> accessCert() {
        return Optional.ofNullable(this.accessCert);
    }

    /**
     * Access certificate key for the user if applicable for the service in question
     * 
     */
    @Import(name="accessKey")
    private @Nullable Output<String> accessKey;

    /**
     * @return Access certificate key for the user if applicable for the service in question
     * 
     */
    public Optional<Output<String>> accessKey() {
        return Optional.ofNullable(this.accessKey);
    }

    /**
     * The password of the InfluxDB User.
     * 
     */
    @Import(name="password")
    private @Nullable Output<String> password;

    /**
     * @return The password of the InfluxDB User.
     * 
     */
    public Optional<Output<String>> password() {
        return Optional.ofNullable(this.password);
    }

    /**
     * The name of the project this resource belongs to. To set up proper dependencies please refer to this variable as a
     * reference. Changing this property forces recreation of the resource.
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    /**
     * @return The name of the project this resource belongs to. To set up proper dependencies please refer to this variable as a
     * reference. Changing this property forces recreation of the resource.
     * 
     */
    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * The name of the service that this resource belongs to. To set up proper dependencies please refer to this variable as a
     * reference. Changing this property forces recreation of the resource.
     * 
     */
    @Import(name="serviceName")
    private @Nullable Output<String> serviceName;

    /**
     * @return The name of the service that this resource belongs to. To set up proper dependencies please refer to this variable as a
     * reference. Changing this property forces recreation of the resource.
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
     * The actual name of the InfluxDB User. To set up proper dependencies please refer to this variable as a reference.
     * Changing this property forces recreation of the resource.
     * 
     */
    @Import(name="username")
    private @Nullable Output<String> username;

    /**
     * @return The actual name of the InfluxDB User. To set up proper dependencies please refer to this variable as a reference.
     * Changing this property forces recreation of the resource.
     * 
     */
    public Optional<Output<String>> username() {
        return Optional.ofNullable(this.username);
    }

    private InfluxdbUserState() {}

    private InfluxdbUserState(InfluxdbUserState $) {
        this.accessCert = $.accessCert;
        this.accessKey = $.accessKey;
        this.password = $.password;
        this.project = $.project;
        this.serviceName = $.serviceName;
        this.type = $.type;
        this.username = $.username;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InfluxdbUserState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InfluxdbUserState $;

        public Builder() {
            $ = new InfluxdbUserState();
        }

        public Builder(InfluxdbUserState defaults) {
            $ = new InfluxdbUserState(Objects.requireNonNull(defaults));
        }

        /**
         * @param accessCert Access certificate for the user if applicable for the service in question
         * 
         * @return builder
         * 
         */
        public Builder accessCert(@Nullable Output<String> accessCert) {
            $.accessCert = accessCert;
            return this;
        }

        /**
         * @param accessCert Access certificate for the user if applicable for the service in question
         * 
         * @return builder
         * 
         */
        public Builder accessCert(String accessCert) {
            return accessCert(Output.of(accessCert));
        }

        /**
         * @param accessKey Access certificate key for the user if applicable for the service in question
         * 
         * @return builder
         * 
         */
        public Builder accessKey(@Nullable Output<String> accessKey) {
            $.accessKey = accessKey;
            return this;
        }

        /**
         * @param accessKey Access certificate key for the user if applicable for the service in question
         * 
         * @return builder
         * 
         */
        public Builder accessKey(String accessKey) {
            return accessKey(Output.of(accessKey));
        }

        /**
         * @param password The password of the InfluxDB User.
         * 
         * @return builder
         * 
         */
        public Builder password(@Nullable Output<String> password) {
            $.password = password;
            return this;
        }

        /**
         * @param password The password of the InfluxDB User.
         * 
         * @return builder
         * 
         */
        public Builder password(String password) {
            return password(Output.of(password));
        }

        /**
         * @param project The name of the project this resource belongs to. To set up proper dependencies please refer to this variable as a
         * reference. Changing this property forces recreation of the resource.
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        /**
         * @param project The name of the project this resource belongs to. To set up proper dependencies please refer to this variable as a
         * reference. Changing this property forces recreation of the resource.
         * 
         * @return builder
         * 
         */
        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param serviceName The name of the service that this resource belongs to. To set up proper dependencies please refer to this variable as a
         * reference. Changing this property forces recreation of the resource.
         * 
         * @return builder
         * 
         */
        public Builder serviceName(@Nullable Output<String> serviceName) {
            $.serviceName = serviceName;
            return this;
        }

        /**
         * @param serviceName The name of the service that this resource belongs to. To set up proper dependencies please refer to this variable as a
         * reference. Changing this property forces recreation of the resource.
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
         * @param username The actual name of the InfluxDB User. To set up proper dependencies please refer to this variable as a reference.
         * Changing this property forces recreation of the resource.
         * 
         * @return builder
         * 
         */
        public Builder username(@Nullable Output<String> username) {
            $.username = username;
            return this;
        }

        /**
         * @param username The actual name of the InfluxDB User. To set up proper dependencies please refer to this variable as a reference.
         * Changing this property forces recreation of the resource.
         * 
         * @return builder
         * 
         */
        public Builder username(String username) {
            return username(Output.of(username));
        }

        public InfluxdbUserState build() {
            return $;
        }
    }

}
