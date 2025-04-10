// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aiven.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetOrganizationUserListArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetOrganizationUserListArgs Empty = new GetOrganizationUserListArgs();

    /**
     * The ID of the organization.
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    /**
     * @return The ID of the organization.
     * 
     */
    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * The name of the organization.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the organization.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    private GetOrganizationUserListArgs() {}

    private GetOrganizationUserListArgs(GetOrganizationUserListArgs $) {
        this.id = $.id;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetOrganizationUserListArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetOrganizationUserListArgs $;

        public Builder() {
            $ = new GetOrganizationUserListArgs();
        }

        public Builder(GetOrganizationUserListArgs defaults) {
            $ = new GetOrganizationUserListArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id The ID of the organization.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id The ID of the organization.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param name The name of the organization.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the organization.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public GetOrganizationUserListArgs build() {
            return $;
        }
    }

}
