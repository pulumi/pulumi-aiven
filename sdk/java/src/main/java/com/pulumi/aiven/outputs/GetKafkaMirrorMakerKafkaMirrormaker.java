// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aiven.outputs;

import com.pulumi.core.annotations.CustomType;
import java.util.Objects;

@CustomType
public final class GetKafkaMirrorMakerKafkaMirrormaker {
    private GetKafkaMirrorMakerKafkaMirrormaker() {}

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetKafkaMirrorMakerKafkaMirrormaker defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        public Builder() {}
        public Builder(GetKafkaMirrorMakerKafkaMirrormaker defaults) {
    	      Objects.requireNonNull(defaults);
        }

        public GetKafkaMirrorMakerKafkaMirrormaker build() {
            final var o = new GetKafkaMirrorMakerKafkaMirrormaker();
            return o;
        }
    }
}