// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aiven.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ThanosThanosUserConfigPublicAccessArgs extends com.pulumi.resources.ResourceArgs {

    public static final ThanosThanosUserConfigPublicAccessArgs Empty = new ThanosThanosUserConfigPublicAccessArgs();

    /**
     * Allow clients to connect to compactor from the public internet for service nodes that are in a project VPC or another type of private network.
     * 
     */
    @Import(name="compactor")
    private @Nullable Output<Boolean> compactor;

    /**
     * @return Allow clients to connect to compactor from the public internet for service nodes that are in a project VPC or another type of private network.
     * 
     */
    public Optional<Output<Boolean>> compactor() {
        return Optional.ofNullable(this.compactor);
    }

    /**
     * Allow clients to connect to query from the public internet for service nodes that are in a project VPC or another type of private network.
     * 
     */
    @Import(name="query")
    private @Nullable Output<Boolean> query;

    /**
     * @return Allow clients to connect to query from the public internet for service nodes that are in a project VPC or another type of private network.
     * 
     */
    public Optional<Output<Boolean>> query() {
        return Optional.ofNullable(this.query);
    }

    /**
     * Allow clients to connect to query_frontend from the public internet for service nodes that are in a project VPC or another type of private network.
     * 
     */
    @Import(name="queryFrontend")
    private @Nullable Output<Boolean> queryFrontend;

    /**
     * @return Allow clients to connect to query_frontend from the public internet for service nodes that are in a project VPC or another type of private network.
     * 
     */
    public Optional<Output<Boolean>> queryFrontend() {
        return Optional.ofNullable(this.queryFrontend);
    }

    /**
     * Allow clients to connect to receiver_ingesting from the public internet for service nodes that are in a project VPC or another type of private network.
     * 
     */
    @Import(name="receiverIngesting")
    private @Nullable Output<Boolean> receiverIngesting;

    /**
     * @return Allow clients to connect to receiver_ingesting from the public internet for service nodes that are in a project VPC or another type of private network.
     * 
     */
    public Optional<Output<Boolean>> receiverIngesting() {
        return Optional.ofNullable(this.receiverIngesting);
    }

    /**
     * Allow clients to connect to receiver_routing from the public internet for service nodes that are in a project VPC or another type of private network.
     * 
     */
    @Import(name="receiverRouting")
    private @Nullable Output<Boolean> receiverRouting;

    /**
     * @return Allow clients to connect to receiver_routing from the public internet for service nodes that are in a project VPC or another type of private network.
     * 
     */
    public Optional<Output<Boolean>> receiverRouting() {
        return Optional.ofNullable(this.receiverRouting);
    }

    /**
     * Allow clients to connect to store from the public internet for service nodes that are in a project VPC or another type of private network.
     * 
     */
    @Import(name="store")
    private @Nullable Output<Boolean> store;

    /**
     * @return Allow clients to connect to store from the public internet for service nodes that are in a project VPC or another type of private network.
     * 
     */
    public Optional<Output<Boolean>> store() {
        return Optional.ofNullable(this.store);
    }

    private ThanosThanosUserConfigPublicAccessArgs() {}

    private ThanosThanosUserConfigPublicAccessArgs(ThanosThanosUserConfigPublicAccessArgs $) {
        this.compactor = $.compactor;
        this.query = $.query;
        this.queryFrontend = $.queryFrontend;
        this.receiverIngesting = $.receiverIngesting;
        this.receiverRouting = $.receiverRouting;
        this.store = $.store;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ThanosThanosUserConfigPublicAccessArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ThanosThanosUserConfigPublicAccessArgs $;

        public Builder() {
            $ = new ThanosThanosUserConfigPublicAccessArgs();
        }

        public Builder(ThanosThanosUserConfigPublicAccessArgs defaults) {
            $ = new ThanosThanosUserConfigPublicAccessArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param compactor Allow clients to connect to compactor from the public internet for service nodes that are in a project VPC or another type of private network.
         * 
         * @return builder
         * 
         */
        public Builder compactor(@Nullable Output<Boolean> compactor) {
            $.compactor = compactor;
            return this;
        }

        /**
         * @param compactor Allow clients to connect to compactor from the public internet for service nodes that are in a project VPC or another type of private network.
         * 
         * @return builder
         * 
         */
        public Builder compactor(Boolean compactor) {
            return compactor(Output.of(compactor));
        }

        /**
         * @param query Allow clients to connect to query from the public internet for service nodes that are in a project VPC or another type of private network.
         * 
         * @return builder
         * 
         */
        public Builder query(@Nullable Output<Boolean> query) {
            $.query = query;
            return this;
        }

        /**
         * @param query Allow clients to connect to query from the public internet for service nodes that are in a project VPC or another type of private network.
         * 
         * @return builder
         * 
         */
        public Builder query(Boolean query) {
            return query(Output.of(query));
        }

        /**
         * @param queryFrontend Allow clients to connect to query_frontend from the public internet for service nodes that are in a project VPC or another type of private network.
         * 
         * @return builder
         * 
         */
        public Builder queryFrontend(@Nullable Output<Boolean> queryFrontend) {
            $.queryFrontend = queryFrontend;
            return this;
        }

        /**
         * @param queryFrontend Allow clients to connect to query_frontend from the public internet for service nodes that are in a project VPC or another type of private network.
         * 
         * @return builder
         * 
         */
        public Builder queryFrontend(Boolean queryFrontend) {
            return queryFrontend(Output.of(queryFrontend));
        }

        /**
         * @param receiverIngesting Allow clients to connect to receiver_ingesting from the public internet for service nodes that are in a project VPC or another type of private network.
         * 
         * @return builder
         * 
         */
        public Builder receiverIngesting(@Nullable Output<Boolean> receiverIngesting) {
            $.receiverIngesting = receiverIngesting;
            return this;
        }

        /**
         * @param receiverIngesting Allow clients to connect to receiver_ingesting from the public internet for service nodes that are in a project VPC or another type of private network.
         * 
         * @return builder
         * 
         */
        public Builder receiverIngesting(Boolean receiverIngesting) {
            return receiverIngesting(Output.of(receiverIngesting));
        }

        /**
         * @param receiverRouting Allow clients to connect to receiver_routing from the public internet for service nodes that are in a project VPC or another type of private network.
         * 
         * @return builder
         * 
         */
        public Builder receiverRouting(@Nullable Output<Boolean> receiverRouting) {
            $.receiverRouting = receiverRouting;
            return this;
        }

        /**
         * @param receiverRouting Allow clients to connect to receiver_routing from the public internet for service nodes that are in a project VPC or another type of private network.
         * 
         * @return builder
         * 
         */
        public Builder receiverRouting(Boolean receiverRouting) {
            return receiverRouting(Output.of(receiverRouting));
        }

        /**
         * @param store Allow clients to connect to store from the public internet for service nodes that are in a project VPC or another type of private network.
         * 
         * @return builder
         * 
         */
        public Builder store(@Nullable Output<Boolean> store) {
            $.store = store;
            return this;
        }

        /**
         * @param store Allow clients to connect to store from the public internet for service nodes that are in a project VPC or another type of private network.
         * 
         * @return builder
         * 
         */
        public Builder store(Boolean store) {
            return store(Output.of(store));
        }

        public ThanosThanosUserConfigPublicAccessArgs build() {
            return $;
        }
    }

}