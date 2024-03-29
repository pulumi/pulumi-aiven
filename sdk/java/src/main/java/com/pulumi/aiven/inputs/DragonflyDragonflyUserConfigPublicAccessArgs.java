// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aiven.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DragonflyDragonflyUserConfigPublicAccessArgs extends com.pulumi.resources.ResourceArgs {

    public static final DragonflyDragonflyUserConfigPublicAccessArgs Empty = new DragonflyDragonflyUserConfigPublicAccessArgs();

    /**
     * Allow clients to connect to dragonfly from the public internet for service nodes that are in a project VPC or another type of private network.
     * 
     */
    @Import(name="dragonfly")
    private @Nullable Output<Boolean> dragonfly;

    /**
     * @return Allow clients to connect to dragonfly from the public internet for service nodes that are in a project VPC or another type of private network.
     * 
     */
    public Optional<Output<Boolean>> dragonfly() {
        return Optional.ofNullable(this.dragonfly);
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

    private DragonflyDragonflyUserConfigPublicAccessArgs() {}

    private DragonflyDragonflyUserConfigPublicAccessArgs(DragonflyDragonflyUserConfigPublicAccessArgs $) {
        this.dragonfly = $.dragonfly;
        this.prometheus = $.prometheus;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DragonflyDragonflyUserConfigPublicAccessArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DragonflyDragonflyUserConfigPublicAccessArgs $;

        public Builder() {
            $ = new DragonflyDragonflyUserConfigPublicAccessArgs();
        }

        public Builder(DragonflyDragonflyUserConfigPublicAccessArgs defaults) {
            $ = new DragonflyDragonflyUserConfigPublicAccessArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param dragonfly Allow clients to connect to dragonfly from the public internet for service nodes that are in a project VPC or another type of private network.
         * 
         * @return builder
         * 
         */
        public Builder dragonfly(@Nullable Output<Boolean> dragonfly) {
            $.dragonfly = dragonfly;
            return this;
        }

        /**
         * @param dragonfly Allow clients to connect to dragonfly from the public internet for service nodes that are in a project VPC or another type of private network.
         * 
         * @return builder
         * 
         */
        public Builder dragonfly(Boolean dragonfly) {
            return dragonfly(Output.of(dragonfly));
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

        public DragonflyDragonflyUserConfigPublicAccessArgs build() {
            return $;
        }
    }

}
