// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aiven.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CassandraCassandraUserConfigPrivateAccessArgs extends com.pulumi.resources.ResourceArgs {

    public static final CassandraCassandraUserConfigPrivateAccessArgs Empty = new CassandraCassandraUserConfigPrivateAccessArgs();

    @Import(name="prometheus")
    private @Nullable Output<String> prometheus;

    public Optional<Output<String>> prometheus() {
        return Optional.ofNullable(this.prometheus);
    }

    private CassandraCassandraUserConfigPrivateAccessArgs() {}

    private CassandraCassandraUserConfigPrivateAccessArgs(CassandraCassandraUserConfigPrivateAccessArgs $) {
        this.prometheus = $.prometheus;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CassandraCassandraUserConfigPrivateAccessArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CassandraCassandraUserConfigPrivateAccessArgs $;

        public Builder() {
            $ = new CassandraCassandraUserConfigPrivateAccessArgs();
        }

        public Builder(CassandraCassandraUserConfigPrivateAccessArgs defaults) {
            $ = new CassandraCassandraUserConfigPrivateAccessArgs(Objects.requireNonNull(defaults));
        }

        public Builder prometheus(@Nullable Output<String> prometheus) {
            $.prometheus = prometheus;
            return this;
        }

        public Builder prometheus(String prometheus) {
            return prometheus(Output.of(prometheus));
        }

        public CassandraCassandraUserConfigPrivateAccessArgs build() {
            return $;
        }
    }

}