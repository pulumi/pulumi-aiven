// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aiven.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OpenSearchOpensearchUserConfigIndexTemplateArgs extends com.pulumi.resources.ResourceArgs {

    public static final OpenSearchOpensearchUserConfigIndexTemplateArgs Empty = new OpenSearchOpensearchUserConfigIndexTemplateArgs();

    @Import(name="mappingNestedObjectsLimit")
    private @Nullable Output<String> mappingNestedObjectsLimit;

    public Optional<Output<String>> mappingNestedObjectsLimit() {
        return Optional.ofNullable(this.mappingNestedObjectsLimit);
    }

    @Import(name="numberOfReplicas")
    private @Nullable Output<String> numberOfReplicas;

    public Optional<Output<String>> numberOfReplicas() {
        return Optional.ofNullable(this.numberOfReplicas);
    }

    @Import(name="numberOfShards")
    private @Nullable Output<String> numberOfShards;

    public Optional<Output<String>> numberOfShards() {
        return Optional.ofNullable(this.numberOfShards);
    }

    private OpenSearchOpensearchUserConfigIndexTemplateArgs() {}

    private OpenSearchOpensearchUserConfigIndexTemplateArgs(OpenSearchOpensearchUserConfigIndexTemplateArgs $) {
        this.mappingNestedObjectsLimit = $.mappingNestedObjectsLimit;
        this.numberOfReplicas = $.numberOfReplicas;
        this.numberOfShards = $.numberOfShards;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OpenSearchOpensearchUserConfigIndexTemplateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OpenSearchOpensearchUserConfigIndexTemplateArgs $;

        public Builder() {
            $ = new OpenSearchOpensearchUserConfigIndexTemplateArgs();
        }

        public Builder(OpenSearchOpensearchUserConfigIndexTemplateArgs defaults) {
            $ = new OpenSearchOpensearchUserConfigIndexTemplateArgs(Objects.requireNonNull(defaults));
        }

        public Builder mappingNestedObjectsLimit(@Nullable Output<String> mappingNestedObjectsLimit) {
            $.mappingNestedObjectsLimit = mappingNestedObjectsLimit;
            return this;
        }

        public Builder mappingNestedObjectsLimit(String mappingNestedObjectsLimit) {
            return mappingNestedObjectsLimit(Output.of(mappingNestedObjectsLimit));
        }

        public Builder numberOfReplicas(@Nullable Output<String> numberOfReplicas) {
            $.numberOfReplicas = numberOfReplicas;
            return this;
        }

        public Builder numberOfReplicas(String numberOfReplicas) {
            return numberOfReplicas(Output.of(numberOfReplicas));
        }

        public Builder numberOfShards(@Nullable Output<String> numberOfShards) {
            $.numberOfShards = numberOfShards;
            return this;
        }

        public Builder numberOfShards(String numberOfShards) {
            return numberOfShards(Output.of(numberOfShards));
        }

        public OpenSearchOpensearchUserConfigIndexTemplateArgs build() {
            return $;
        }
    }

}