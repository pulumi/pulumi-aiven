// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aiven.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class M3DbM3dbUserConfigLimits {
    private @Nullable String maxRecentlyQueriedSeriesBlocks;
    private @Nullable String maxRecentlyQueriedSeriesDiskBytesRead;
    private @Nullable String maxRecentlyQueriedSeriesLookback;
    private @Nullable String queryDocs;
    private @Nullable String queryRequireExhaustive;
    private @Nullable String querySeries;

    private M3DbM3dbUserConfigLimits() {}
    public Optional<String> maxRecentlyQueriedSeriesBlocks() {
        return Optional.ofNullable(this.maxRecentlyQueriedSeriesBlocks);
    }
    public Optional<String> maxRecentlyQueriedSeriesDiskBytesRead() {
        return Optional.ofNullable(this.maxRecentlyQueriedSeriesDiskBytesRead);
    }
    public Optional<String> maxRecentlyQueriedSeriesLookback() {
        return Optional.ofNullable(this.maxRecentlyQueriedSeriesLookback);
    }
    public Optional<String> queryDocs() {
        return Optional.ofNullable(this.queryDocs);
    }
    public Optional<String> queryRequireExhaustive() {
        return Optional.ofNullable(this.queryRequireExhaustive);
    }
    public Optional<String> querySeries() {
        return Optional.ofNullable(this.querySeries);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(M3DbM3dbUserConfigLimits defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String maxRecentlyQueriedSeriesBlocks;
        private @Nullable String maxRecentlyQueriedSeriesDiskBytesRead;
        private @Nullable String maxRecentlyQueriedSeriesLookback;
        private @Nullable String queryDocs;
        private @Nullable String queryRequireExhaustive;
        private @Nullable String querySeries;
        public Builder() {}
        public Builder(M3DbM3dbUserConfigLimits defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxRecentlyQueriedSeriesBlocks = defaults.maxRecentlyQueriedSeriesBlocks;
    	      this.maxRecentlyQueriedSeriesDiskBytesRead = defaults.maxRecentlyQueriedSeriesDiskBytesRead;
    	      this.maxRecentlyQueriedSeriesLookback = defaults.maxRecentlyQueriedSeriesLookback;
    	      this.queryDocs = defaults.queryDocs;
    	      this.queryRequireExhaustive = defaults.queryRequireExhaustive;
    	      this.querySeries = defaults.querySeries;
        }

        @CustomType.Setter
        public Builder maxRecentlyQueriedSeriesBlocks(@Nullable String maxRecentlyQueriedSeriesBlocks) {
            this.maxRecentlyQueriedSeriesBlocks = maxRecentlyQueriedSeriesBlocks;
            return this;
        }
        @CustomType.Setter
        public Builder maxRecentlyQueriedSeriesDiskBytesRead(@Nullable String maxRecentlyQueriedSeriesDiskBytesRead) {
            this.maxRecentlyQueriedSeriesDiskBytesRead = maxRecentlyQueriedSeriesDiskBytesRead;
            return this;
        }
        @CustomType.Setter
        public Builder maxRecentlyQueriedSeriesLookback(@Nullable String maxRecentlyQueriedSeriesLookback) {
            this.maxRecentlyQueriedSeriesLookback = maxRecentlyQueriedSeriesLookback;
            return this;
        }
        @CustomType.Setter
        public Builder queryDocs(@Nullable String queryDocs) {
            this.queryDocs = queryDocs;
            return this;
        }
        @CustomType.Setter
        public Builder queryRequireExhaustive(@Nullable String queryRequireExhaustive) {
            this.queryRequireExhaustive = queryRequireExhaustive;
            return this;
        }
        @CustomType.Setter
        public Builder querySeries(@Nullable String querySeries) {
            this.querySeries = querySeries;
            return this;
        }
        public M3DbM3dbUserConfigLimits build() {
            final var o = new M3DbM3dbUserConfigLimits();
            o.maxRecentlyQueriedSeriesBlocks = maxRecentlyQueriedSeriesBlocks;
            o.maxRecentlyQueriedSeriesDiskBytesRead = maxRecentlyQueriedSeriesDiskBytesRead;
            o.maxRecentlyQueriedSeriesLookback = maxRecentlyQueriedSeriesLookback;
            o.queryDocs = queryDocs;
            o.queryRequireExhaustive = queryRequireExhaustive;
            o.querySeries = querySeries;
            return o;
        }
    }
}