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
public final class KafkaConnectKafkaConnectUserConfigKafkaConnect {
    /**
     * @return Enum: `All`, `None`. Defines what client configurations can be overridden by the connector. Default is None.
     * 
     */
    private @Nullable String connectorClientConfigOverridePolicy;
    /**
     * @return Enum: `earliest`, `latest`. What to do when there is no initial offset in Kafka or if the current offset does not exist any more on the server. Default is earliest.
     * 
     */
    private @Nullable String consumerAutoOffsetReset;
    /**
     * @return Records are fetched in batches by the consumer, and if the first record batch in the first non-empty partition of the fetch is larger than this value, the record batch will still be returned to ensure that the consumer can make progress. As such, this is not a absolute maximum. Example: `52428800`.
     * 
     */
    private @Nullable Integer consumerFetchMaxBytes;
    /**
     * @return Enum: `read_committed`, `read_uncommitted`. Transaction read isolation level. read*uncommitted is the default, but read*committed can be used if consume-exactly-once behavior is desired.
     * 
     */
    private @Nullable String consumerIsolationLevel;
    /**
     * @return Records are fetched in batches by the consumer.If the first record batch in the first non-empty partition of the fetch is larger than this limit, the batch will still be returned to ensure that the consumer can make progress. Example: `1048576`.
     * 
     */
    private @Nullable Integer consumerMaxPartitionFetchBytes;
    /**
     * @return The maximum delay in milliseconds between invocations of poll() when using consumer group management (defaults to 300000).
     * 
     */
    private @Nullable Integer consumerMaxPollIntervalMs;
    /**
     * @return The maximum number of records returned in a single call to poll() (defaults to 500).
     * 
     */
    private @Nullable Integer consumerMaxPollRecords;
    /**
     * @return The interval at which to try committing offsets for tasks (defaults to 60000).
     * 
     */
    private @Nullable Integer offsetFlushIntervalMs;
    /**
     * @return Maximum number of milliseconds to wait for records to flush and partition offset data to be committed to offset storage before cancelling the process and restoring the offset data to be committed in a future attempt (defaults to 5000).
     * 
     */
    private @Nullable Integer offsetFlushTimeoutMs;
    /**
     * @return This setting gives the upper bound of the batch size to be sent. If there are fewer than this many bytes accumulated for this partition, the producer will `linger` for the linger.ms time waiting for more records to show up. A batch size of zero will disable batching entirely (defaults to 16384).
     * 
     */
    private @Nullable Integer producerBatchSize;
    /**
     * @return The total bytes of memory the producer can use to buffer records waiting to be sent to the broker (defaults to 33554432).
     * 
     */
    private @Nullable Integer producerBufferMemory;
    /**
     * @return Enum: `gzip`, `lz4`, `none`, `snappy`, `zstd`. Specify the default compression type for producers. This configuration accepts the standard compression codecs (`gzip`, `snappy`, `lz4`, `zstd`). It additionally accepts `none` which is the default and equivalent to no compression.
     * 
     */
    private @Nullable String producerCompressionType;
    /**
     * @return This setting gives the upper bound on the delay for batching: once there is batch.size worth of records for a partition it will be sent immediately regardless of this setting, however if there are fewer than this many bytes accumulated for this partition the producer will `linger` for the specified time waiting for more records to show up. Defaults to 0.
     * 
     */
    private @Nullable Integer producerLingerMs;
    /**
     * @return This setting will limit the number of record batches the producer will send in a single request to avoid sending huge requests. Example: `1048576`.
     * 
     */
    private @Nullable Integer producerMaxRequestSize;
    /**
     * @return The maximum delay that is scheduled in order to wait for the return of one or more departed workers before rebalancing and reassigning their connectors and tasks to the group. During this period the connectors and tasks of the departed workers remain unassigned. Defaults to 5 minutes.
     * 
     */
    private @Nullable Integer scheduledRebalanceMaxDelayMs;
    /**
     * @return The timeout in milliseconds used to detect failures when using Kafka’s group management facilities (defaults to 10000).
     * 
     */
    private @Nullable Integer sessionTimeoutMs;

    private KafkaConnectKafkaConnectUserConfigKafkaConnect() {}
    /**
     * @return Enum: `All`, `None`. Defines what client configurations can be overridden by the connector. Default is None.
     * 
     */
    public Optional<String> connectorClientConfigOverridePolicy() {
        return Optional.ofNullable(this.connectorClientConfigOverridePolicy);
    }
    /**
     * @return Enum: `earliest`, `latest`. What to do when there is no initial offset in Kafka or if the current offset does not exist any more on the server. Default is earliest.
     * 
     */
    public Optional<String> consumerAutoOffsetReset() {
        return Optional.ofNullable(this.consumerAutoOffsetReset);
    }
    /**
     * @return Records are fetched in batches by the consumer, and if the first record batch in the first non-empty partition of the fetch is larger than this value, the record batch will still be returned to ensure that the consumer can make progress. As such, this is not a absolute maximum. Example: `52428800`.
     * 
     */
    public Optional<Integer> consumerFetchMaxBytes() {
        return Optional.ofNullable(this.consumerFetchMaxBytes);
    }
    /**
     * @return Enum: `read_committed`, `read_uncommitted`. Transaction read isolation level. read*uncommitted is the default, but read*committed can be used if consume-exactly-once behavior is desired.
     * 
     */
    public Optional<String> consumerIsolationLevel() {
        return Optional.ofNullable(this.consumerIsolationLevel);
    }
    /**
     * @return Records are fetched in batches by the consumer.If the first record batch in the first non-empty partition of the fetch is larger than this limit, the batch will still be returned to ensure that the consumer can make progress. Example: `1048576`.
     * 
     */
    public Optional<Integer> consumerMaxPartitionFetchBytes() {
        return Optional.ofNullable(this.consumerMaxPartitionFetchBytes);
    }
    /**
     * @return The maximum delay in milliseconds between invocations of poll() when using consumer group management (defaults to 300000).
     * 
     */
    public Optional<Integer> consumerMaxPollIntervalMs() {
        return Optional.ofNullable(this.consumerMaxPollIntervalMs);
    }
    /**
     * @return The maximum number of records returned in a single call to poll() (defaults to 500).
     * 
     */
    public Optional<Integer> consumerMaxPollRecords() {
        return Optional.ofNullable(this.consumerMaxPollRecords);
    }
    /**
     * @return The interval at which to try committing offsets for tasks (defaults to 60000).
     * 
     */
    public Optional<Integer> offsetFlushIntervalMs() {
        return Optional.ofNullable(this.offsetFlushIntervalMs);
    }
    /**
     * @return Maximum number of milliseconds to wait for records to flush and partition offset data to be committed to offset storage before cancelling the process and restoring the offset data to be committed in a future attempt (defaults to 5000).
     * 
     */
    public Optional<Integer> offsetFlushTimeoutMs() {
        return Optional.ofNullable(this.offsetFlushTimeoutMs);
    }
    /**
     * @return This setting gives the upper bound of the batch size to be sent. If there are fewer than this many bytes accumulated for this partition, the producer will `linger` for the linger.ms time waiting for more records to show up. A batch size of zero will disable batching entirely (defaults to 16384).
     * 
     */
    public Optional<Integer> producerBatchSize() {
        return Optional.ofNullable(this.producerBatchSize);
    }
    /**
     * @return The total bytes of memory the producer can use to buffer records waiting to be sent to the broker (defaults to 33554432).
     * 
     */
    public Optional<Integer> producerBufferMemory() {
        return Optional.ofNullable(this.producerBufferMemory);
    }
    /**
     * @return Enum: `gzip`, `lz4`, `none`, `snappy`, `zstd`. Specify the default compression type for producers. This configuration accepts the standard compression codecs (`gzip`, `snappy`, `lz4`, `zstd`). It additionally accepts `none` which is the default and equivalent to no compression.
     * 
     */
    public Optional<String> producerCompressionType() {
        return Optional.ofNullable(this.producerCompressionType);
    }
    /**
     * @return This setting gives the upper bound on the delay for batching: once there is batch.size worth of records for a partition it will be sent immediately regardless of this setting, however if there are fewer than this many bytes accumulated for this partition the producer will `linger` for the specified time waiting for more records to show up. Defaults to 0.
     * 
     */
    public Optional<Integer> producerLingerMs() {
        return Optional.ofNullable(this.producerLingerMs);
    }
    /**
     * @return This setting will limit the number of record batches the producer will send in a single request to avoid sending huge requests. Example: `1048576`.
     * 
     */
    public Optional<Integer> producerMaxRequestSize() {
        return Optional.ofNullable(this.producerMaxRequestSize);
    }
    /**
     * @return The maximum delay that is scheduled in order to wait for the return of one or more departed workers before rebalancing and reassigning their connectors and tasks to the group. During this period the connectors and tasks of the departed workers remain unassigned. Defaults to 5 minutes.
     * 
     */
    public Optional<Integer> scheduledRebalanceMaxDelayMs() {
        return Optional.ofNullable(this.scheduledRebalanceMaxDelayMs);
    }
    /**
     * @return The timeout in milliseconds used to detect failures when using Kafka’s group management facilities (defaults to 10000).
     * 
     */
    public Optional<Integer> sessionTimeoutMs() {
        return Optional.ofNullable(this.sessionTimeoutMs);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KafkaConnectKafkaConnectUserConfigKafkaConnect defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String connectorClientConfigOverridePolicy;
        private @Nullable String consumerAutoOffsetReset;
        private @Nullable Integer consumerFetchMaxBytes;
        private @Nullable String consumerIsolationLevel;
        private @Nullable Integer consumerMaxPartitionFetchBytes;
        private @Nullable Integer consumerMaxPollIntervalMs;
        private @Nullable Integer consumerMaxPollRecords;
        private @Nullable Integer offsetFlushIntervalMs;
        private @Nullable Integer offsetFlushTimeoutMs;
        private @Nullable Integer producerBatchSize;
        private @Nullable Integer producerBufferMemory;
        private @Nullable String producerCompressionType;
        private @Nullable Integer producerLingerMs;
        private @Nullable Integer producerMaxRequestSize;
        private @Nullable Integer scheduledRebalanceMaxDelayMs;
        private @Nullable Integer sessionTimeoutMs;
        public Builder() {}
        public Builder(KafkaConnectKafkaConnectUserConfigKafkaConnect defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectorClientConfigOverridePolicy = defaults.connectorClientConfigOverridePolicy;
    	      this.consumerAutoOffsetReset = defaults.consumerAutoOffsetReset;
    	      this.consumerFetchMaxBytes = defaults.consumerFetchMaxBytes;
    	      this.consumerIsolationLevel = defaults.consumerIsolationLevel;
    	      this.consumerMaxPartitionFetchBytes = defaults.consumerMaxPartitionFetchBytes;
    	      this.consumerMaxPollIntervalMs = defaults.consumerMaxPollIntervalMs;
    	      this.consumerMaxPollRecords = defaults.consumerMaxPollRecords;
    	      this.offsetFlushIntervalMs = defaults.offsetFlushIntervalMs;
    	      this.offsetFlushTimeoutMs = defaults.offsetFlushTimeoutMs;
    	      this.producerBatchSize = defaults.producerBatchSize;
    	      this.producerBufferMemory = defaults.producerBufferMemory;
    	      this.producerCompressionType = defaults.producerCompressionType;
    	      this.producerLingerMs = defaults.producerLingerMs;
    	      this.producerMaxRequestSize = defaults.producerMaxRequestSize;
    	      this.scheduledRebalanceMaxDelayMs = defaults.scheduledRebalanceMaxDelayMs;
    	      this.sessionTimeoutMs = defaults.sessionTimeoutMs;
        }

        @CustomType.Setter
        public Builder connectorClientConfigOverridePolicy(@Nullable String connectorClientConfigOverridePolicy) {

            this.connectorClientConfigOverridePolicy = connectorClientConfigOverridePolicy;
            return this;
        }
        @CustomType.Setter
        public Builder consumerAutoOffsetReset(@Nullable String consumerAutoOffsetReset) {

            this.consumerAutoOffsetReset = consumerAutoOffsetReset;
            return this;
        }
        @CustomType.Setter
        public Builder consumerFetchMaxBytes(@Nullable Integer consumerFetchMaxBytes) {

            this.consumerFetchMaxBytes = consumerFetchMaxBytes;
            return this;
        }
        @CustomType.Setter
        public Builder consumerIsolationLevel(@Nullable String consumerIsolationLevel) {

            this.consumerIsolationLevel = consumerIsolationLevel;
            return this;
        }
        @CustomType.Setter
        public Builder consumerMaxPartitionFetchBytes(@Nullable Integer consumerMaxPartitionFetchBytes) {

            this.consumerMaxPartitionFetchBytes = consumerMaxPartitionFetchBytes;
            return this;
        }
        @CustomType.Setter
        public Builder consumerMaxPollIntervalMs(@Nullable Integer consumerMaxPollIntervalMs) {

            this.consumerMaxPollIntervalMs = consumerMaxPollIntervalMs;
            return this;
        }
        @CustomType.Setter
        public Builder consumerMaxPollRecords(@Nullable Integer consumerMaxPollRecords) {

            this.consumerMaxPollRecords = consumerMaxPollRecords;
            return this;
        }
        @CustomType.Setter
        public Builder offsetFlushIntervalMs(@Nullable Integer offsetFlushIntervalMs) {

            this.offsetFlushIntervalMs = offsetFlushIntervalMs;
            return this;
        }
        @CustomType.Setter
        public Builder offsetFlushTimeoutMs(@Nullable Integer offsetFlushTimeoutMs) {

            this.offsetFlushTimeoutMs = offsetFlushTimeoutMs;
            return this;
        }
        @CustomType.Setter
        public Builder producerBatchSize(@Nullable Integer producerBatchSize) {

            this.producerBatchSize = producerBatchSize;
            return this;
        }
        @CustomType.Setter
        public Builder producerBufferMemory(@Nullable Integer producerBufferMemory) {

            this.producerBufferMemory = producerBufferMemory;
            return this;
        }
        @CustomType.Setter
        public Builder producerCompressionType(@Nullable String producerCompressionType) {

            this.producerCompressionType = producerCompressionType;
            return this;
        }
        @CustomType.Setter
        public Builder producerLingerMs(@Nullable Integer producerLingerMs) {

            this.producerLingerMs = producerLingerMs;
            return this;
        }
        @CustomType.Setter
        public Builder producerMaxRequestSize(@Nullable Integer producerMaxRequestSize) {

            this.producerMaxRequestSize = producerMaxRequestSize;
            return this;
        }
        @CustomType.Setter
        public Builder scheduledRebalanceMaxDelayMs(@Nullable Integer scheduledRebalanceMaxDelayMs) {

            this.scheduledRebalanceMaxDelayMs = scheduledRebalanceMaxDelayMs;
            return this;
        }
        @CustomType.Setter
        public Builder sessionTimeoutMs(@Nullable Integer sessionTimeoutMs) {

            this.sessionTimeoutMs = sessionTimeoutMs;
            return this;
        }
        public KafkaConnectKafkaConnectUserConfigKafkaConnect build() {
            final var _resultValue = new KafkaConnectKafkaConnectUserConfigKafkaConnect();
            _resultValue.connectorClientConfigOverridePolicy = connectorClientConfigOverridePolicy;
            _resultValue.consumerAutoOffsetReset = consumerAutoOffsetReset;
            _resultValue.consumerFetchMaxBytes = consumerFetchMaxBytes;
            _resultValue.consumerIsolationLevel = consumerIsolationLevel;
            _resultValue.consumerMaxPartitionFetchBytes = consumerMaxPartitionFetchBytes;
            _resultValue.consumerMaxPollIntervalMs = consumerMaxPollIntervalMs;
            _resultValue.consumerMaxPollRecords = consumerMaxPollRecords;
            _resultValue.offsetFlushIntervalMs = offsetFlushIntervalMs;
            _resultValue.offsetFlushTimeoutMs = offsetFlushTimeoutMs;
            _resultValue.producerBatchSize = producerBatchSize;
            _resultValue.producerBufferMemory = producerBufferMemory;
            _resultValue.producerCompressionType = producerCompressionType;
            _resultValue.producerLingerMs = producerLingerMs;
            _resultValue.producerMaxRequestSize = producerMaxRequestSize;
            _resultValue.scheduledRebalanceMaxDelayMs = scheduledRebalanceMaxDelayMs;
            _resultValue.sessionTimeoutMs = sessionTimeoutMs;
            return _resultValue;
        }
    }
}
