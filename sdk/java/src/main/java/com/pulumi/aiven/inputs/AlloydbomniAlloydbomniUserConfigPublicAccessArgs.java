// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aiven.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AlloydbomniAlloydbomniUserConfigPublicAccessArgs extends com.pulumi.resources.ResourceArgs {

    public static final AlloydbomniAlloydbomniUserConfigPublicAccessArgs Empty = new AlloydbomniAlloydbomniUserConfigPublicAccessArgs();

    /**
     * Allow clients to connect to pg from the public internet for service nodes that are in a project VPC or another type of private network.
     * 
     */
    @Import(name="pg")
    private @Nullable Output<Boolean> pg;

    /**
     * @return Allow clients to connect to pg from the public internet for service nodes that are in a project VPC or another type of private network.
     * 
     */
    public Optional<Output<Boolean>> pg() {
        return Optional.ofNullable(this.pg);
    }

    /**
     * Allow clients to connect to pgbouncer from the public internet for service nodes that are in a project VPC or another type of private network.
     * 
     */
    @Import(name="pgbouncer")
    private @Nullable Output<Boolean> pgbouncer;

    /**
     * @return Allow clients to connect to pgbouncer from the public internet for service nodes that are in a project VPC or another type of private network.
     * 
     */
    public Optional<Output<Boolean>> pgbouncer() {
        return Optional.ofNullable(this.pgbouncer);
    }

    /**
     * Allow clients to connect to prometheus from the public internet for service nodes that are in a project VPC or another type of private network.
     * 
     */
    @Import(name="prometheus")
    private @Nullable Output<Boolean> prometheus;

    /**
     * @return Allow clients to connect to prometheus from the public internet for service nodes that are in a project VPC or another type of private network.
     * 
     */
    public Optional<Output<Boolean>> prometheus() {
        return Optional.ofNullable(this.prometheus);
    }

    private AlloydbomniAlloydbomniUserConfigPublicAccessArgs() {}

    private AlloydbomniAlloydbomniUserConfigPublicAccessArgs(AlloydbomniAlloydbomniUserConfigPublicAccessArgs $) {
        this.pg = $.pg;
        this.pgbouncer = $.pgbouncer;
        this.prometheus = $.prometheus;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AlloydbomniAlloydbomniUserConfigPublicAccessArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AlloydbomniAlloydbomniUserConfigPublicAccessArgs $;

        public Builder() {
            $ = new AlloydbomniAlloydbomniUserConfigPublicAccessArgs();
        }

        public Builder(AlloydbomniAlloydbomniUserConfigPublicAccessArgs defaults) {
            $ = new AlloydbomniAlloydbomniUserConfigPublicAccessArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param pg Allow clients to connect to pg from the public internet for service nodes that are in a project VPC or another type of private network.
         * 
         * @return builder
         * 
         */
        public Builder pg(@Nullable Output<Boolean> pg) {
            $.pg = pg;
            return this;
        }

        /**
         * @param pg Allow clients to connect to pg from the public internet for service nodes that are in a project VPC or another type of private network.
         * 
         * @return builder
         * 
         */
        public Builder pg(Boolean pg) {
            return pg(Output.of(pg));
        }

        /**
         * @param pgbouncer Allow clients to connect to pgbouncer from the public internet for service nodes that are in a project VPC or another type of private network.
         * 
         * @return builder
         * 
         */
        public Builder pgbouncer(@Nullable Output<Boolean> pgbouncer) {
            $.pgbouncer = pgbouncer;
            return this;
        }

        /**
         * @param pgbouncer Allow clients to connect to pgbouncer from the public internet for service nodes that are in a project VPC or another type of private network.
         * 
         * @return builder
         * 
         */
        public Builder pgbouncer(Boolean pgbouncer) {
            return pgbouncer(Output.of(pgbouncer));
        }

        /**
         * @param prometheus Allow clients to connect to prometheus from the public internet for service nodes that are in a project VPC or another type of private network.
         * 
         * @return builder
         * 
         */
        public Builder prometheus(@Nullable Output<Boolean> prometheus) {
            $.prometheus = prometheus;
            return this;
        }

        /**
         * @param prometheus Allow clients to connect to prometheus from the public internet for service nodes that are in a project VPC or another type of private network.
         * 
         * @return builder
         * 
         */
        public Builder prometheus(Boolean prometheus) {
            return prometheus(Output.of(prometheus));
        }

        public AlloydbomniAlloydbomniUserConfigPublicAccessArgs build() {
            return $;
        }
    }

}
