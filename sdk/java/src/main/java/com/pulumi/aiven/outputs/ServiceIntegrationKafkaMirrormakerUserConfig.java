// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aiven.outputs;

import com.pulumi.aiven.outputs.ServiceIntegrationKafkaMirrormakerUserConfigKafkaMirrormaker;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ServiceIntegrationKafkaMirrormakerUserConfig {
    /**
     * @return The alias under which the Kafka cluster is known to MirrorMaker. Can contain the following symbols: ASCII alphanumerics, &#39;.&#39;, &#39;_&#39;, and &#39;-&#39;.
     * 
     */
    private @Nullable String clusterAlias;
    /**
     * @return Kafka MirrorMaker configuration values
     * 
     */
    private @Nullable ServiceIntegrationKafkaMirrormakerUserConfigKafkaMirrormaker kafkaMirrormaker;

    private ServiceIntegrationKafkaMirrormakerUserConfig() {}
    /**
     * @return The alias under which the Kafka cluster is known to MirrorMaker. Can contain the following symbols: ASCII alphanumerics, &#39;.&#39;, &#39;_&#39;, and &#39;-&#39;.
     * 
     */
    public Optional<String> clusterAlias() {
        return Optional.ofNullable(this.clusterAlias);
    }
    /**
     * @return Kafka MirrorMaker configuration values
     * 
     */
    public Optional<ServiceIntegrationKafkaMirrormakerUserConfigKafkaMirrormaker> kafkaMirrormaker() {
        return Optional.ofNullable(this.kafkaMirrormaker);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceIntegrationKafkaMirrormakerUserConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String clusterAlias;
        private @Nullable ServiceIntegrationKafkaMirrormakerUserConfigKafkaMirrormaker kafkaMirrormaker;
        public Builder() {}
        public Builder(ServiceIntegrationKafkaMirrormakerUserConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterAlias = defaults.clusterAlias;
    	      this.kafkaMirrormaker = defaults.kafkaMirrormaker;
        }

        @CustomType.Setter
        public Builder clusterAlias(@Nullable String clusterAlias) {
            this.clusterAlias = clusterAlias;
            return this;
        }
        @CustomType.Setter
        public Builder kafkaMirrormaker(@Nullable ServiceIntegrationKafkaMirrormakerUserConfigKafkaMirrormaker kafkaMirrormaker) {
            this.kafkaMirrormaker = kafkaMirrormaker;
            return this;
        }
        public ServiceIntegrationKafkaMirrormakerUserConfig build() {
            final var o = new ServiceIntegrationKafkaMirrormakerUserConfig();
            o.clusterAlias = clusterAlias;
            o.kafkaMirrormaker = kafkaMirrormaker;
            return o;
        }
    }
}