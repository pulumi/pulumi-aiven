// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aiven.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class KafkaKafkaUserConfigPublicAccessArgs extends com.pulumi.resources.ResourceArgs {

    public static final KafkaKafkaUserConfigPublicAccessArgs Empty = new KafkaKafkaUserConfigPublicAccessArgs();

    /**
     * Allow clients to connect to kafka from the public internet for service nodes that are in a project VPC or another type of private network.
     * 
     */
    @Import(name="kafka")
    private @Nullable Output<Boolean> kafka;

    /**
     * @return Allow clients to connect to kafka from the public internet for service nodes that are in a project VPC or another type of private network.
     * 
     */
    public Optional<Output<Boolean>> kafka() {
        return Optional.ofNullable(this.kafka);
    }

    /**
     * Allow clients to connect to kafka_connect from the public internet for service nodes that are in a project VPC or another type of private network.
     * 
     */
    @Import(name="kafkaConnect")
    private @Nullable Output<Boolean> kafkaConnect;

    /**
     * @return Allow clients to connect to kafka_connect from the public internet for service nodes that are in a project VPC or another type of private network.
     * 
     */
    public Optional<Output<Boolean>> kafkaConnect() {
        return Optional.ofNullable(this.kafkaConnect);
    }

    /**
     * Allow clients to connect to kafka_rest from the public internet for service nodes that are in a project VPC or another type of private network.
     * 
     */
    @Import(name="kafkaRest")
    private @Nullable Output<Boolean> kafkaRest;

    /**
     * @return Allow clients to connect to kafka_rest from the public internet for service nodes that are in a project VPC or another type of private network.
     * 
     */
    public Optional<Output<Boolean>> kafkaRest() {
        return Optional.ofNullable(this.kafkaRest);
    }

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
     * Allow clients to connect to schema_registry from the public internet for service nodes that are in a project VPC or another type of private network.
     * 
     */
    @Import(name="schemaRegistry")
    private @Nullable Output<Boolean> schemaRegistry;

    /**
     * @return Allow clients to connect to schema_registry from the public internet for service nodes that are in a project VPC or another type of private network.
     * 
     */
    public Optional<Output<Boolean>> schemaRegistry() {
        return Optional.ofNullable(this.schemaRegistry);
    }

    private KafkaKafkaUserConfigPublicAccessArgs() {}

    private KafkaKafkaUserConfigPublicAccessArgs(KafkaKafkaUserConfigPublicAccessArgs $) {
        this.kafka = $.kafka;
        this.kafkaConnect = $.kafkaConnect;
        this.kafkaRest = $.kafkaRest;
        this.prometheus = $.prometheus;
        this.schemaRegistry = $.schemaRegistry;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(KafkaKafkaUserConfigPublicAccessArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private KafkaKafkaUserConfigPublicAccessArgs $;

        public Builder() {
            $ = new KafkaKafkaUserConfigPublicAccessArgs();
        }

        public Builder(KafkaKafkaUserConfigPublicAccessArgs defaults) {
            $ = new KafkaKafkaUserConfigPublicAccessArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param kafka Allow clients to connect to kafka from the public internet for service nodes that are in a project VPC or another type of private network.
         * 
         * @return builder
         * 
         */
        public Builder kafka(@Nullable Output<Boolean> kafka) {
            $.kafka = kafka;
            return this;
        }

        /**
         * @param kafka Allow clients to connect to kafka from the public internet for service nodes that are in a project VPC or another type of private network.
         * 
         * @return builder
         * 
         */
        public Builder kafka(Boolean kafka) {
            return kafka(Output.of(kafka));
        }

        /**
         * @param kafkaConnect Allow clients to connect to kafka_connect from the public internet for service nodes that are in a project VPC or another type of private network.
         * 
         * @return builder
         * 
         */
        public Builder kafkaConnect(@Nullable Output<Boolean> kafkaConnect) {
            $.kafkaConnect = kafkaConnect;
            return this;
        }

        /**
         * @param kafkaConnect Allow clients to connect to kafka_connect from the public internet for service nodes that are in a project VPC or another type of private network.
         * 
         * @return builder
         * 
         */
        public Builder kafkaConnect(Boolean kafkaConnect) {
            return kafkaConnect(Output.of(kafkaConnect));
        }

        /**
         * @param kafkaRest Allow clients to connect to kafka_rest from the public internet for service nodes that are in a project VPC or another type of private network.
         * 
         * @return builder
         * 
         */
        public Builder kafkaRest(@Nullable Output<Boolean> kafkaRest) {
            $.kafkaRest = kafkaRest;
            return this;
        }

        /**
         * @param kafkaRest Allow clients to connect to kafka_rest from the public internet for service nodes that are in a project VPC or another type of private network.
         * 
         * @return builder
         * 
         */
        public Builder kafkaRest(Boolean kafkaRest) {
            return kafkaRest(Output.of(kafkaRest));
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
         * @param schemaRegistry Allow clients to connect to schema_registry from the public internet for service nodes that are in a project VPC or another type of private network.
         * 
         * @return builder
         * 
         */
        public Builder schemaRegistry(@Nullable Output<Boolean> schemaRegistry) {
            $.schemaRegistry = schemaRegistry;
            return this;
        }

        /**
         * @param schemaRegistry Allow clients to connect to schema_registry from the public internet for service nodes that are in a project VPC or another type of private network.
         * 
         * @return builder
         * 
         */
        public Builder schemaRegistry(Boolean schemaRegistry) {
            return schemaRegistry(Output.of(schemaRegistry));
        }

        public KafkaKafkaUserConfigPublicAccessArgs build() {
            return $;
        }
    }

}
