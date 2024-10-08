// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aiven.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CassandraCassandraUserConfigCassandra {
    /**
     * @return Fail any multiple-partition batch exceeding this value. 50kb (10x warn threshold) by default. Example: `50`.
     * 
     */
    private @Nullable Integer batchSizeFailThresholdInKb;
    /**
     * @return Log a warning message on any multiple-partition batch size exceeding this value.5kb per batch by default.Caution should be taken on increasing the size of this thresholdas it can lead to node instability. Example: `5`.
     * 
     */
    private @Nullable Integer batchSizeWarnThresholdInKb;
    /**
     * @return Name of the datacenter to which nodes of this service belong. Can be set only when creating the service. Example: `my-service-google-west1`.
     * 
     */
    private @Nullable String datacenter;
    /**
     * @return How long the coordinator waits for read operations to complete before timing it out. 5 seconds by default. Example: `5000`.
     * 
     */
    private @Nullable Integer readRequestTimeoutInMs;
    /**
     * @return How long the coordinator waits for write requests to complete with at least one node in the local datacenter. 2 seconds by default. Example: `2000`.
     * 
     */
    private @Nullable Integer writeRequestTimeoutInMs;

    private CassandraCassandraUserConfigCassandra() {}
    /**
     * @return Fail any multiple-partition batch exceeding this value. 50kb (10x warn threshold) by default. Example: `50`.
     * 
     */
    public Optional<Integer> batchSizeFailThresholdInKb() {
        return Optional.ofNullable(this.batchSizeFailThresholdInKb);
    }
    /**
     * @return Log a warning message on any multiple-partition batch size exceeding this value.5kb per batch by default.Caution should be taken on increasing the size of this thresholdas it can lead to node instability. Example: `5`.
     * 
     */
    public Optional<Integer> batchSizeWarnThresholdInKb() {
        return Optional.ofNullable(this.batchSizeWarnThresholdInKb);
    }
    /**
     * @return Name of the datacenter to which nodes of this service belong. Can be set only when creating the service. Example: `my-service-google-west1`.
     * 
     */
    public Optional<String> datacenter() {
        return Optional.ofNullable(this.datacenter);
    }
    /**
     * @return How long the coordinator waits for read operations to complete before timing it out. 5 seconds by default. Example: `5000`.
     * 
     */
    public Optional<Integer> readRequestTimeoutInMs() {
        return Optional.ofNullable(this.readRequestTimeoutInMs);
    }
    /**
     * @return How long the coordinator waits for write requests to complete with at least one node in the local datacenter. 2 seconds by default. Example: `2000`.
     * 
     */
    public Optional<Integer> writeRequestTimeoutInMs() {
        return Optional.ofNullable(this.writeRequestTimeoutInMs);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CassandraCassandraUserConfigCassandra defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer batchSizeFailThresholdInKb;
        private @Nullable Integer batchSizeWarnThresholdInKb;
        private @Nullable String datacenter;
        private @Nullable Integer readRequestTimeoutInMs;
        private @Nullable Integer writeRequestTimeoutInMs;
        public Builder() {}
        public Builder(CassandraCassandraUserConfigCassandra defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.batchSizeFailThresholdInKb = defaults.batchSizeFailThresholdInKb;
    	      this.batchSizeWarnThresholdInKb = defaults.batchSizeWarnThresholdInKb;
    	      this.datacenter = defaults.datacenter;
    	      this.readRequestTimeoutInMs = defaults.readRequestTimeoutInMs;
    	      this.writeRequestTimeoutInMs = defaults.writeRequestTimeoutInMs;
        }

        @CustomType.Setter
        public Builder batchSizeFailThresholdInKb(@Nullable Integer batchSizeFailThresholdInKb) {

            this.batchSizeFailThresholdInKb = batchSizeFailThresholdInKb;
            return this;
        }
        @CustomType.Setter
        public Builder batchSizeWarnThresholdInKb(@Nullable Integer batchSizeWarnThresholdInKb) {

            this.batchSizeWarnThresholdInKb = batchSizeWarnThresholdInKb;
            return this;
        }
        @CustomType.Setter
        public Builder datacenter(@Nullable String datacenter) {

            this.datacenter = datacenter;
            return this;
        }
        @CustomType.Setter
        public Builder readRequestTimeoutInMs(@Nullable Integer readRequestTimeoutInMs) {

            this.readRequestTimeoutInMs = readRequestTimeoutInMs;
            return this;
        }
        @CustomType.Setter
        public Builder writeRequestTimeoutInMs(@Nullable Integer writeRequestTimeoutInMs) {

            this.writeRequestTimeoutInMs = writeRequestTimeoutInMs;
            return this;
        }
        public CassandraCassandraUserConfigCassandra build() {
            final var _resultValue = new CassandraCassandraUserConfigCassandra();
            _resultValue.batchSizeFailThresholdInKb = batchSizeFailThresholdInKb;
            _resultValue.batchSizeWarnThresholdInKb = batchSizeWarnThresholdInKb;
            _resultValue.datacenter = datacenter;
            _resultValue.readRequestTimeoutInMs = readRequestTimeoutInMs;
            _resultValue.writeRequestTimeoutInMs = writeRequestTimeoutInMs;
            return _resultValue;
        }
    }
}
