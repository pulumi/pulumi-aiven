// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aiven.inputs;

import com.pulumi.aiven.inputs.KafkaTopicConfigArgs;
import com.pulumi.aiven.inputs.KafkaTopicTagArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class KafkaTopicState extends com.pulumi.resources.ResourceArgs {

    public static final KafkaTopicState Empty = new KafkaTopicState();

    /**
     * Kafka topic configuration.
     * 
     */
    @Import(name="config")
    private @Nullable Output<KafkaTopicConfigArgs> config;

    /**
     * @return Kafka topic configuration.
     * 
     */
    public Optional<Output<KafkaTopicConfigArgs>> config() {
        return Optional.ofNullable(this.config);
    }

    /**
     * The number of partitions to create in the topic.
     * 
     */
    @Import(name="partitions")
    private @Nullable Output<Integer> partitions;

    /**
     * @return The number of partitions to create in the topic.
     * 
     */
    public Optional<Output<Integer>> partitions() {
        return Optional.ofNullable(this.partitions);
    }

    /**
     * The name of the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    /**
     * @return The name of the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
     * 
     */
    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * The replication factor for the topic.
     * 
     */
    @Import(name="replication")
    private @Nullable Output<Integer> replication;

    /**
     * @return The replication factor for the topic.
     * 
     */
    public Optional<Output<Integer>> replication() {
        return Optional.ofNullable(this.replication);
    }

    /**
     * The name of the service that this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
     * 
     */
    @Import(name="serviceName")
    private @Nullable Output<String> serviceName;

    /**
     * @return The name of the service that this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
     * 
     */
    public Optional<Output<String>> serviceName() {
        return Optional.ofNullable(this.serviceName);
    }

    /**
     * Tags for the Kafka topic.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<List<KafkaTopicTagArgs>> tags;

    /**
     * @return Tags for the Kafka topic.
     * 
     */
    public Optional<Output<List<KafkaTopicTagArgs>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    @Import(name="terminationProtection")
    private @Nullable Output<Boolean> terminationProtection;

    public Optional<Output<Boolean>> terminationProtection() {
        return Optional.ofNullable(this.terminationProtection);
    }

    /**
     * The name of the topic. Changing this property forces recreation of the resource.
     * 
     */
    @Import(name="topicName")
    private @Nullable Output<String> topicName;

    /**
     * @return The name of the topic. Changing this property forces recreation of the resource.
     * 
     */
    public Optional<Output<String>> topicName() {
        return Optional.ofNullable(this.topicName);
    }

    private KafkaTopicState() {}

    private KafkaTopicState(KafkaTopicState $) {
        this.config = $.config;
        this.partitions = $.partitions;
        this.project = $.project;
        this.replication = $.replication;
        this.serviceName = $.serviceName;
        this.tags = $.tags;
        this.terminationProtection = $.terminationProtection;
        this.topicName = $.topicName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(KafkaTopicState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private KafkaTopicState $;

        public Builder() {
            $ = new KafkaTopicState();
        }

        public Builder(KafkaTopicState defaults) {
            $ = new KafkaTopicState(Objects.requireNonNull(defaults));
        }

        /**
         * @param config Kafka topic configuration.
         * 
         * @return builder
         * 
         */
        public Builder config(@Nullable Output<KafkaTopicConfigArgs> config) {
            $.config = config;
            return this;
        }

        /**
         * @param config Kafka topic configuration.
         * 
         * @return builder
         * 
         */
        public Builder config(KafkaTopicConfigArgs config) {
            return config(Output.of(config));
        }

        /**
         * @param partitions The number of partitions to create in the topic.
         * 
         * @return builder
         * 
         */
        public Builder partitions(@Nullable Output<Integer> partitions) {
            $.partitions = partitions;
            return this;
        }

        /**
         * @param partitions The number of partitions to create in the topic.
         * 
         * @return builder
         * 
         */
        public Builder partitions(Integer partitions) {
            return partitions(Output.of(partitions));
        }

        /**
         * @param project The name of the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        /**
         * @param project The name of the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
         * 
         * @return builder
         * 
         */
        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param replication The replication factor for the topic.
         * 
         * @return builder
         * 
         */
        public Builder replication(@Nullable Output<Integer> replication) {
            $.replication = replication;
            return this;
        }

        /**
         * @param replication The replication factor for the topic.
         * 
         * @return builder
         * 
         */
        public Builder replication(Integer replication) {
            return replication(Output.of(replication));
        }

        /**
         * @param serviceName The name of the service that this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
         * 
         * @return builder
         * 
         */
        public Builder serviceName(@Nullable Output<String> serviceName) {
            $.serviceName = serviceName;
            return this;
        }

        /**
         * @param serviceName The name of the service that this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
         * 
         * @return builder
         * 
         */
        public Builder serviceName(String serviceName) {
            return serviceName(Output.of(serviceName));
        }

        /**
         * @param tags Tags for the Kafka topic.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<List<KafkaTopicTagArgs>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Tags for the Kafka topic.
         * 
         * @return builder
         * 
         */
        public Builder tags(List<KafkaTopicTagArgs> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tags Tags for the Kafka topic.
         * 
         * @return builder
         * 
         */
        public Builder tags(KafkaTopicTagArgs... tags) {
            return tags(List.of(tags));
        }

        public Builder terminationProtection(@Nullable Output<Boolean> terminationProtection) {
            $.terminationProtection = terminationProtection;
            return this;
        }

        public Builder terminationProtection(Boolean terminationProtection) {
            return terminationProtection(Output.of(terminationProtection));
        }

        /**
         * @param topicName The name of the topic. Changing this property forces recreation of the resource.
         * 
         * @return builder
         * 
         */
        public Builder topicName(@Nullable Output<String> topicName) {
            $.topicName = topicName;
            return this;
        }

        /**
         * @param topicName The name of the topic. Changing this property forces recreation of the resource.
         * 
         * @return builder
         * 
         */
        public Builder topicName(String topicName) {
            return topicName(Output.of(topicName));
        }

        public KafkaTopicState build() {
            return $;
        }
    }

}