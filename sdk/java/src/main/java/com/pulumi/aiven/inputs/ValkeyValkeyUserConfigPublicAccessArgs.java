// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aiven.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ValkeyValkeyUserConfigPublicAccessArgs extends com.pulumi.resources.ResourceArgs {

    public static final ValkeyValkeyUserConfigPublicAccessArgs Empty = new ValkeyValkeyUserConfigPublicAccessArgs();

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

    /**
     * Allow clients to connect to valkey from the public internet for service nodes that are in a project VPC or another type of private network.
     * 
     */
    @Import(name="valkey")
    private @Nullable Output<Boolean> valkey;

    /**
     * @return Allow clients to connect to valkey from the public internet for service nodes that are in a project VPC or another type of private network.
     * 
     */
    public Optional<Output<Boolean>> valkey() {
        return Optional.ofNullable(this.valkey);
    }

    private ValkeyValkeyUserConfigPublicAccessArgs() {}

    private ValkeyValkeyUserConfigPublicAccessArgs(ValkeyValkeyUserConfigPublicAccessArgs $) {
        this.prometheus = $.prometheus;
        this.valkey = $.valkey;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ValkeyValkeyUserConfigPublicAccessArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ValkeyValkeyUserConfigPublicAccessArgs $;

        public Builder() {
            $ = new ValkeyValkeyUserConfigPublicAccessArgs();
        }

        public Builder(ValkeyValkeyUserConfigPublicAccessArgs defaults) {
            $ = new ValkeyValkeyUserConfigPublicAccessArgs(Objects.requireNonNull(defaults));
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

        /**
         * @param valkey Allow clients to connect to valkey from the public internet for service nodes that are in a project VPC or another type of private network.
         * 
         * @return builder
         * 
         */
        public Builder valkey(@Nullable Output<Boolean> valkey) {
            $.valkey = valkey;
            return this;
        }

        /**
         * @param valkey Allow clients to connect to valkey from the public internet for service nodes that are in a project VPC or another type of private network.
         * 
         * @return builder
         * 
         */
        public Builder valkey(Boolean valkey) {
            return valkey(Output.of(valkey));
        }

        public ValkeyValkeyUserConfigPublicAccessArgs build() {
            return $;
        }
    }

}
