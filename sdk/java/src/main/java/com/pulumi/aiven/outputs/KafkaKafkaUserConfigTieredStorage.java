// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aiven.outputs;

import com.pulumi.aiven.outputs.KafkaKafkaUserConfigTieredStorageLocalCache;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class KafkaKafkaUserConfigTieredStorage {
    /**
     * @return Whether to enable the tiered storage functionality.
     * 
     */
    private @Nullable Boolean enabled;
    /**
     * @return Local cache configuration.
     * 
     */
    private @Nullable KafkaKafkaUserConfigTieredStorageLocalCache localCache;

    private KafkaKafkaUserConfigTieredStorage() {}
    /**
     * @return Whether to enable the tiered storage functionality.
     * 
     */
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }
    /**
     * @return Local cache configuration.
     * 
     */
    public Optional<KafkaKafkaUserConfigTieredStorageLocalCache> localCache() {
        return Optional.ofNullable(this.localCache);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KafkaKafkaUserConfigTieredStorage defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean enabled;
        private @Nullable KafkaKafkaUserConfigTieredStorageLocalCache localCache;
        public Builder() {}
        public Builder(KafkaKafkaUserConfigTieredStorage defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.localCache = defaults.localCache;
        }

        @CustomType.Setter
        public Builder enabled(@Nullable Boolean enabled) {

            this.enabled = enabled;
            return this;
        }
        @CustomType.Setter
        public Builder localCache(@Nullable KafkaKafkaUserConfigTieredStorageLocalCache localCache) {

            this.localCache = localCache;
            return this;
        }
        public KafkaKafkaUserConfigTieredStorage build() {
            final var _resultValue = new KafkaKafkaUserConfigTieredStorage();
            _resultValue.enabled = enabled;
            _resultValue.localCache = localCache;
            return _resultValue;
        }
    }
}