// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aiven.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServiceIntegrationKafkaConnectUserConfigKafkaConnectArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceIntegrationKafkaConnectUserConfigKafkaConnectArgs Empty = new ServiceIntegrationKafkaConnectUserConfigKafkaConnectArgs();

    @Import(name="configStorageTopic")
    private @Nullable Output<String> configStorageTopic;

    public Optional<Output<String>> configStorageTopic() {
        return Optional.ofNullable(this.configStorageTopic);
    }

    @Import(name="groupId")
    private @Nullable Output<String> groupId;

    public Optional<Output<String>> groupId() {
        return Optional.ofNullable(this.groupId);
    }

    @Import(name="offsetStorageTopic")
    private @Nullable Output<String> offsetStorageTopic;

    public Optional<Output<String>> offsetStorageTopic() {
        return Optional.ofNullable(this.offsetStorageTopic);
    }

    @Import(name="statusStorageTopic")
    private @Nullable Output<String> statusStorageTopic;

    public Optional<Output<String>> statusStorageTopic() {
        return Optional.ofNullable(this.statusStorageTopic);
    }

    private ServiceIntegrationKafkaConnectUserConfigKafkaConnectArgs() {}

    private ServiceIntegrationKafkaConnectUserConfigKafkaConnectArgs(ServiceIntegrationKafkaConnectUserConfigKafkaConnectArgs $) {
        this.configStorageTopic = $.configStorageTopic;
        this.groupId = $.groupId;
        this.offsetStorageTopic = $.offsetStorageTopic;
        this.statusStorageTopic = $.statusStorageTopic;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceIntegrationKafkaConnectUserConfigKafkaConnectArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceIntegrationKafkaConnectUserConfigKafkaConnectArgs $;

        public Builder() {
            $ = new ServiceIntegrationKafkaConnectUserConfigKafkaConnectArgs();
        }

        public Builder(ServiceIntegrationKafkaConnectUserConfigKafkaConnectArgs defaults) {
            $ = new ServiceIntegrationKafkaConnectUserConfigKafkaConnectArgs(Objects.requireNonNull(defaults));
        }

        public Builder configStorageTopic(@Nullable Output<String> configStorageTopic) {
            $.configStorageTopic = configStorageTopic;
            return this;
        }

        public Builder configStorageTopic(String configStorageTopic) {
            return configStorageTopic(Output.of(configStorageTopic));
        }

        public Builder groupId(@Nullable Output<String> groupId) {
            $.groupId = groupId;
            return this;
        }

        public Builder groupId(String groupId) {
            return groupId(Output.of(groupId));
        }

        public Builder offsetStorageTopic(@Nullable Output<String> offsetStorageTopic) {
            $.offsetStorageTopic = offsetStorageTopic;
            return this;
        }

        public Builder offsetStorageTopic(String offsetStorageTopic) {
            return offsetStorageTopic(Output.of(offsetStorageTopic));
        }

        public Builder statusStorageTopic(@Nullable Output<String> statusStorageTopic) {
            $.statusStorageTopic = statusStorageTopic;
            return this;
        }

        public Builder statusStorageTopic(String statusStorageTopic) {
            return statusStorageTopic(Output.of(statusStorageTopic));
        }

        public ServiceIntegrationKafkaConnectUserConfigKafkaConnectArgs build() {
            return $;
        }
    }

}