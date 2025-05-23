// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aiven.inputs;

import com.pulumi.aiven.inputs.KafkaKafkaUserConfigFollowerFetchingArgs;
import com.pulumi.aiven.inputs.KafkaKafkaUserConfigIpFilterObjectArgs;
import com.pulumi.aiven.inputs.KafkaKafkaUserConfigKafkaArgs;
import com.pulumi.aiven.inputs.KafkaKafkaUserConfigKafkaAuthenticationMethodsArgs;
import com.pulumi.aiven.inputs.KafkaKafkaUserConfigKafkaConnectConfigArgs;
import com.pulumi.aiven.inputs.KafkaKafkaUserConfigKafkaConnectPluginVersionArgs;
import com.pulumi.aiven.inputs.KafkaKafkaUserConfigKafkaConnectSecretProviderArgs;
import com.pulumi.aiven.inputs.KafkaKafkaUserConfigKafkaRestConfigArgs;
import com.pulumi.aiven.inputs.KafkaKafkaUserConfigKafkaSaslMechanismsArgs;
import com.pulumi.aiven.inputs.KafkaKafkaUserConfigPrivateAccessArgs;
import com.pulumi.aiven.inputs.KafkaKafkaUserConfigPrivatelinkAccessArgs;
import com.pulumi.aiven.inputs.KafkaKafkaUserConfigPublicAccessArgs;
import com.pulumi.aiven.inputs.KafkaKafkaUserConfigSchemaRegistryConfigArgs;
import com.pulumi.aiven.inputs.KafkaKafkaUserConfigSingleZoneArgs;
import com.pulumi.aiven.inputs.KafkaKafkaUserConfigTieredStorageArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class KafkaKafkaUserConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final KafkaKafkaUserConfigArgs Empty = new KafkaKafkaUserConfigArgs();

    /**
     * Additional Cloud Regions for Backup Replication.
     * 
     * @deprecated
     * This property is deprecated.
     * 
     */
    @Deprecated /* This property is deprecated. */
    @Import(name="additionalBackupRegions")
    private @Nullable Output<String> additionalBackupRegions;

    /**
     * @return Additional Cloud Regions for Backup Replication.
     * 
     * @deprecated
     * This property is deprecated.
     * 
     */
    @Deprecated /* This property is deprecated. */
    public Optional<Output<String>> additionalBackupRegions() {
        return Optional.ofNullable(this.additionalBackupRegions);
    }

    /**
     * Allow access to read Kafka topic messages in the Aiven Console and REST API.
     * 
     */
    @Import(name="aivenKafkaTopicMessages")
    private @Nullable Output<Boolean> aivenKafkaTopicMessages;

    /**
     * @return Allow access to read Kafka topic messages in the Aiven Console and REST API.
     * 
     */
    public Optional<Output<Boolean>> aivenKafkaTopicMessages() {
        return Optional.ofNullable(this.aivenKafkaTopicMessages);
    }

    /**
     * Serve the web frontend using a custom CNAME pointing to the Aiven DNS name. Example: `grafana.example.org`.
     * 
     */
    @Import(name="customDomain")
    private @Nullable Output<String> customDomain;

    /**
     * @return Serve the web frontend using a custom CNAME pointing to the Aiven DNS name. Example: `grafana.example.org`.
     * 
     */
    public Optional<Output<String>> customDomain() {
        return Optional.ofNullable(this.customDomain);
    }

    /**
     * Enable follower fetching
     * 
     */
    @Import(name="followerFetching")
    private @Nullable Output<KafkaKafkaUserConfigFollowerFetchingArgs> followerFetching;

    /**
     * @return Enable follower fetching
     * 
     */
    public Optional<Output<KafkaKafkaUserConfigFollowerFetchingArgs>> followerFetching() {
        return Optional.ofNullable(this.followerFetching);
    }

    /**
     * Allow incoming connections from CIDR address block, e.g. `10.20.0.0/16`
     * 
     */
    @Import(name="ipFilterObjects")
    private @Nullable Output<List<KafkaKafkaUserConfigIpFilterObjectArgs>> ipFilterObjects;

    /**
     * @return Allow incoming connections from CIDR address block, e.g. `10.20.0.0/16`
     * 
     */
    public Optional<Output<List<KafkaKafkaUserConfigIpFilterObjectArgs>>> ipFilterObjects() {
        return Optional.ofNullable(this.ipFilterObjects);
    }

    /**
     * Allow incoming connections from CIDR address block, e.g. `10.20.0.0/16`.
     * 
     */
    @Import(name="ipFilterStrings")
    private @Nullable Output<List<String>> ipFilterStrings;

    /**
     * @return Allow incoming connections from CIDR address block, e.g. `10.20.0.0/16`.
     * 
     */
    public Optional<Output<List<String>>> ipFilterStrings() {
        return Optional.ofNullable(this.ipFilterStrings);
    }

    /**
     * Allow incoming connections from CIDR address block, e.g. `10.20.0.0/16`.
     * 
     * @deprecated
     * Deprecated. Use `ip_filter_string` instead.
     * 
     */
    @Deprecated /* Deprecated. Use `ip_filter_string` instead. */
    @Import(name="ipFilters")
    private @Nullable Output<List<String>> ipFilters;

    /**
     * @return Allow incoming connections from CIDR address block, e.g. `10.20.0.0/16`.
     * 
     * @deprecated
     * Deprecated. Use `ip_filter_string` instead.
     * 
     */
    @Deprecated /* Deprecated. Use `ip_filter_string` instead. */
    public Optional<Output<List<String>>> ipFilters() {
        return Optional.ofNullable(this.ipFilters);
    }

    /**
     * Kafka broker configuration values
     * 
     */
    @Import(name="kafka")
    private @Nullable Output<KafkaKafkaUserConfigKafkaArgs> kafka;

    /**
     * @return Kafka broker configuration values
     * 
     */
    public Optional<Output<KafkaKafkaUserConfigKafkaArgs>> kafka() {
        return Optional.ofNullable(this.kafka);
    }

    /**
     * Kafka authentication methods
     * 
     */
    @Import(name="kafkaAuthenticationMethods")
    private @Nullable Output<KafkaKafkaUserConfigKafkaAuthenticationMethodsArgs> kafkaAuthenticationMethods;

    /**
     * @return Kafka authentication methods
     * 
     */
    public Optional<Output<KafkaKafkaUserConfigKafkaAuthenticationMethodsArgs>> kafkaAuthenticationMethods() {
        return Optional.ofNullable(this.kafkaAuthenticationMethods);
    }

    /**
     * Enable Kafka Connect service. Default: `false`.
     * 
     */
    @Import(name="kafkaConnect")
    private @Nullable Output<Boolean> kafkaConnect;

    /**
     * @return Enable Kafka Connect service. Default: `false`.
     * 
     */
    public Optional<Output<Boolean>> kafkaConnect() {
        return Optional.ofNullable(this.kafkaConnect);
    }

    /**
     * Kafka Connect configuration values
     * 
     */
    @Import(name="kafkaConnectConfig")
    private @Nullable Output<KafkaKafkaUserConfigKafkaConnectConfigArgs> kafkaConnectConfig;

    /**
     * @return Kafka Connect configuration values
     * 
     */
    public Optional<Output<KafkaKafkaUserConfigKafkaConnectConfigArgs>> kafkaConnectConfig() {
        return Optional.ofNullable(this.kafkaConnectConfig);
    }

    /**
     * The plugin selected by the user
     * 
     */
    @Import(name="kafkaConnectPluginVersions")
    private @Nullable Output<List<KafkaKafkaUserConfigKafkaConnectPluginVersionArgs>> kafkaConnectPluginVersions;

    /**
     * @return The plugin selected by the user
     * 
     */
    public Optional<Output<List<KafkaKafkaUserConfigKafkaConnectPluginVersionArgs>>> kafkaConnectPluginVersions() {
        return Optional.ofNullable(this.kafkaConnectPluginVersions);
    }

    @Import(name="kafkaConnectSecretProviders")
    private @Nullable Output<List<KafkaKafkaUserConfigKafkaConnectSecretProviderArgs>> kafkaConnectSecretProviders;

    public Optional<Output<List<KafkaKafkaUserConfigKafkaConnectSecretProviderArgs>>> kafkaConnectSecretProviders() {
        return Optional.ofNullable(this.kafkaConnectSecretProviders);
    }

    /**
     * Enable Kafka-REST service. Default: `false`.
     * 
     */
    @Import(name="kafkaRest")
    private @Nullable Output<Boolean> kafkaRest;

    /**
     * @return Enable Kafka-REST service. Default: `false`.
     * 
     */
    public Optional<Output<Boolean>> kafkaRest() {
        return Optional.ofNullable(this.kafkaRest);
    }

    /**
     * Enable authorization in Kafka-REST service.
     * 
     */
    @Import(name="kafkaRestAuthorization")
    private @Nullable Output<Boolean> kafkaRestAuthorization;

    /**
     * @return Enable authorization in Kafka-REST service.
     * 
     */
    public Optional<Output<Boolean>> kafkaRestAuthorization() {
        return Optional.ofNullable(this.kafkaRestAuthorization);
    }

    /**
     * Kafka REST configuration
     * 
     */
    @Import(name="kafkaRestConfig")
    private @Nullable Output<KafkaKafkaUserConfigKafkaRestConfigArgs> kafkaRestConfig;

    /**
     * @return Kafka REST configuration
     * 
     */
    public Optional<Output<KafkaKafkaUserConfigKafkaRestConfigArgs>> kafkaRestConfig() {
        return Optional.ofNullable(this.kafkaRestConfig);
    }

    /**
     * Kafka SASL mechanisms
     * 
     */
    @Import(name="kafkaSaslMechanisms")
    private @Nullable Output<KafkaKafkaUserConfigKafkaSaslMechanismsArgs> kafkaSaslMechanisms;

    /**
     * @return Kafka SASL mechanisms
     * 
     */
    public Optional<Output<KafkaKafkaUserConfigKafkaSaslMechanismsArgs>> kafkaSaslMechanisms() {
        return Optional.ofNullable(this.kafkaSaslMechanisms);
    }

    /**
     * Enum: `3.1`, `3.2`, `3.3`, `3.4`, `3.5`, `3.6`, `3.7`, `3.8`, `3.9`, and newer. Kafka major version.
     * 
     */
    @Import(name="kafkaVersion")
    private @Nullable Output<String> kafkaVersion;

    /**
     * @return Enum: `3.1`, `3.2`, `3.3`, `3.4`, `3.5`, `3.6`, `3.7`, `3.8`, `3.9`, and newer. Kafka major version.
     * 
     */
    public Optional<Output<String>> kafkaVersion() {
        return Optional.ofNullable(this.kafkaVersion);
    }

    /**
     * Use Letsencrypt CA for Kafka SASL via Privatelink.
     * 
     */
    @Import(name="letsencryptSaslPrivatelink")
    private @Nullable Output<Boolean> letsencryptSaslPrivatelink;

    /**
     * @return Use Letsencrypt CA for Kafka SASL via Privatelink.
     * 
     */
    public Optional<Output<Boolean>> letsencryptSaslPrivatelink() {
        return Optional.ofNullable(this.letsencryptSaslPrivatelink);
    }

    /**
     * Allow access to selected service ports from private networks
     * 
     */
    @Import(name="privateAccess")
    private @Nullable Output<KafkaKafkaUserConfigPrivateAccessArgs> privateAccess;

    /**
     * @return Allow access to selected service ports from private networks
     * 
     */
    public Optional<Output<KafkaKafkaUserConfigPrivateAccessArgs>> privateAccess() {
        return Optional.ofNullable(this.privateAccess);
    }

    /**
     * Allow access to selected service components through Privatelink
     * 
     */
    @Import(name="privatelinkAccess")
    private @Nullable Output<KafkaKafkaUserConfigPrivatelinkAccessArgs> privatelinkAccess;

    /**
     * @return Allow access to selected service components through Privatelink
     * 
     */
    public Optional<Output<KafkaKafkaUserConfigPrivatelinkAccessArgs>> privatelinkAccess() {
        return Optional.ofNullable(this.privatelinkAccess);
    }

    /**
     * Allow access to selected service ports from the public Internet
     * 
     */
    @Import(name="publicAccess")
    private @Nullable Output<KafkaKafkaUserConfigPublicAccessArgs> publicAccess;

    /**
     * @return Allow access to selected service ports from the public Internet
     * 
     */
    public Optional<Output<KafkaKafkaUserConfigPublicAccessArgs>> publicAccess() {
        return Optional.ofNullable(this.publicAccess);
    }

    /**
     * Enable Schema-Registry service. Default: `false`.
     * 
     */
    @Import(name="schemaRegistry")
    private @Nullable Output<Boolean> schemaRegistry;

    /**
     * @return Enable Schema-Registry service. Default: `false`.
     * 
     */
    public Optional<Output<Boolean>> schemaRegistry() {
        return Optional.ofNullable(this.schemaRegistry);
    }

    /**
     * Schema Registry configuration
     * 
     */
    @Import(name="schemaRegistryConfig")
    private @Nullable Output<KafkaKafkaUserConfigSchemaRegistryConfigArgs> schemaRegistryConfig;

    /**
     * @return Schema Registry configuration
     * 
     */
    public Optional<Output<KafkaKafkaUserConfigSchemaRegistryConfigArgs>> schemaRegistryConfig() {
        return Optional.ofNullable(this.schemaRegistryConfig);
    }

    /**
     * Store logs for the service so that they are available in the HTTP API and console.
     * 
     */
    @Import(name="serviceLog")
    private @Nullable Output<Boolean> serviceLog;

    /**
     * @return Store logs for the service so that they are available in the HTTP API and console.
     * 
     */
    public Optional<Output<Boolean>> serviceLog() {
        return Optional.ofNullable(this.serviceLog);
    }

    /**
     * Single-zone configuration
     * 
     */
    @Import(name="singleZone")
    private @Nullable Output<KafkaKafkaUserConfigSingleZoneArgs> singleZone;

    /**
     * @return Single-zone configuration
     * 
     */
    public Optional<Output<KafkaKafkaUserConfigSingleZoneArgs>> singleZone() {
        return Optional.ofNullable(this.singleZone);
    }

    /**
     * Use static public IP addresses.
     * 
     */
    @Import(name="staticIps")
    private @Nullable Output<Boolean> staticIps;

    /**
     * @return Use static public IP addresses.
     * 
     */
    public Optional<Output<Boolean>> staticIps() {
        return Optional.ofNullable(this.staticIps);
    }

    /**
     * Tiered storage configuration
     * 
     */
    @Import(name="tieredStorage")
    private @Nullable Output<KafkaKafkaUserConfigTieredStorageArgs> tieredStorage;

    /**
     * @return Tiered storage configuration
     * 
     */
    public Optional<Output<KafkaKafkaUserConfigTieredStorageArgs>> tieredStorage() {
        return Optional.ofNullable(this.tieredStorage);
    }

    private KafkaKafkaUserConfigArgs() {}

    private KafkaKafkaUserConfigArgs(KafkaKafkaUserConfigArgs $) {
        this.additionalBackupRegions = $.additionalBackupRegions;
        this.aivenKafkaTopicMessages = $.aivenKafkaTopicMessages;
        this.customDomain = $.customDomain;
        this.followerFetching = $.followerFetching;
        this.ipFilterObjects = $.ipFilterObjects;
        this.ipFilterStrings = $.ipFilterStrings;
        this.ipFilters = $.ipFilters;
        this.kafka = $.kafka;
        this.kafkaAuthenticationMethods = $.kafkaAuthenticationMethods;
        this.kafkaConnect = $.kafkaConnect;
        this.kafkaConnectConfig = $.kafkaConnectConfig;
        this.kafkaConnectPluginVersions = $.kafkaConnectPluginVersions;
        this.kafkaConnectSecretProviders = $.kafkaConnectSecretProviders;
        this.kafkaRest = $.kafkaRest;
        this.kafkaRestAuthorization = $.kafkaRestAuthorization;
        this.kafkaRestConfig = $.kafkaRestConfig;
        this.kafkaSaslMechanisms = $.kafkaSaslMechanisms;
        this.kafkaVersion = $.kafkaVersion;
        this.letsencryptSaslPrivatelink = $.letsencryptSaslPrivatelink;
        this.privateAccess = $.privateAccess;
        this.privatelinkAccess = $.privatelinkAccess;
        this.publicAccess = $.publicAccess;
        this.schemaRegistry = $.schemaRegistry;
        this.schemaRegistryConfig = $.schemaRegistryConfig;
        this.serviceLog = $.serviceLog;
        this.singleZone = $.singleZone;
        this.staticIps = $.staticIps;
        this.tieredStorage = $.tieredStorage;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(KafkaKafkaUserConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private KafkaKafkaUserConfigArgs $;

        public Builder() {
            $ = new KafkaKafkaUserConfigArgs();
        }

        public Builder(KafkaKafkaUserConfigArgs defaults) {
            $ = new KafkaKafkaUserConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param additionalBackupRegions Additional Cloud Regions for Backup Replication.
         * 
         * @return builder
         * 
         * @deprecated
         * This property is deprecated.
         * 
         */
        @Deprecated /* This property is deprecated. */
        public Builder additionalBackupRegions(@Nullable Output<String> additionalBackupRegions) {
            $.additionalBackupRegions = additionalBackupRegions;
            return this;
        }

        /**
         * @param additionalBackupRegions Additional Cloud Regions for Backup Replication.
         * 
         * @return builder
         * 
         * @deprecated
         * This property is deprecated.
         * 
         */
        @Deprecated /* This property is deprecated. */
        public Builder additionalBackupRegions(String additionalBackupRegions) {
            return additionalBackupRegions(Output.of(additionalBackupRegions));
        }

        /**
         * @param aivenKafkaTopicMessages Allow access to read Kafka topic messages in the Aiven Console and REST API.
         * 
         * @return builder
         * 
         */
        public Builder aivenKafkaTopicMessages(@Nullable Output<Boolean> aivenKafkaTopicMessages) {
            $.aivenKafkaTopicMessages = aivenKafkaTopicMessages;
            return this;
        }

        /**
         * @param aivenKafkaTopicMessages Allow access to read Kafka topic messages in the Aiven Console and REST API.
         * 
         * @return builder
         * 
         */
        public Builder aivenKafkaTopicMessages(Boolean aivenKafkaTopicMessages) {
            return aivenKafkaTopicMessages(Output.of(aivenKafkaTopicMessages));
        }

        /**
         * @param customDomain Serve the web frontend using a custom CNAME pointing to the Aiven DNS name. Example: `grafana.example.org`.
         * 
         * @return builder
         * 
         */
        public Builder customDomain(@Nullable Output<String> customDomain) {
            $.customDomain = customDomain;
            return this;
        }

        /**
         * @param customDomain Serve the web frontend using a custom CNAME pointing to the Aiven DNS name. Example: `grafana.example.org`.
         * 
         * @return builder
         * 
         */
        public Builder customDomain(String customDomain) {
            return customDomain(Output.of(customDomain));
        }

        /**
         * @param followerFetching Enable follower fetching
         * 
         * @return builder
         * 
         */
        public Builder followerFetching(@Nullable Output<KafkaKafkaUserConfigFollowerFetchingArgs> followerFetching) {
            $.followerFetching = followerFetching;
            return this;
        }

        /**
         * @param followerFetching Enable follower fetching
         * 
         * @return builder
         * 
         */
        public Builder followerFetching(KafkaKafkaUserConfigFollowerFetchingArgs followerFetching) {
            return followerFetching(Output.of(followerFetching));
        }

        /**
         * @param ipFilterObjects Allow incoming connections from CIDR address block, e.g. `10.20.0.0/16`
         * 
         * @return builder
         * 
         */
        public Builder ipFilterObjects(@Nullable Output<List<KafkaKafkaUserConfigIpFilterObjectArgs>> ipFilterObjects) {
            $.ipFilterObjects = ipFilterObjects;
            return this;
        }

        /**
         * @param ipFilterObjects Allow incoming connections from CIDR address block, e.g. `10.20.0.0/16`
         * 
         * @return builder
         * 
         */
        public Builder ipFilterObjects(List<KafkaKafkaUserConfigIpFilterObjectArgs> ipFilterObjects) {
            return ipFilterObjects(Output.of(ipFilterObjects));
        }

        /**
         * @param ipFilterObjects Allow incoming connections from CIDR address block, e.g. `10.20.0.0/16`
         * 
         * @return builder
         * 
         */
        public Builder ipFilterObjects(KafkaKafkaUserConfigIpFilterObjectArgs... ipFilterObjects) {
            return ipFilterObjects(List.of(ipFilterObjects));
        }

        /**
         * @param ipFilterStrings Allow incoming connections from CIDR address block, e.g. `10.20.0.0/16`.
         * 
         * @return builder
         * 
         */
        public Builder ipFilterStrings(@Nullable Output<List<String>> ipFilterStrings) {
            $.ipFilterStrings = ipFilterStrings;
            return this;
        }

        /**
         * @param ipFilterStrings Allow incoming connections from CIDR address block, e.g. `10.20.0.0/16`.
         * 
         * @return builder
         * 
         */
        public Builder ipFilterStrings(List<String> ipFilterStrings) {
            return ipFilterStrings(Output.of(ipFilterStrings));
        }

        /**
         * @param ipFilterStrings Allow incoming connections from CIDR address block, e.g. `10.20.0.0/16`.
         * 
         * @return builder
         * 
         */
        public Builder ipFilterStrings(String... ipFilterStrings) {
            return ipFilterStrings(List.of(ipFilterStrings));
        }

        /**
         * @param ipFilters Allow incoming connections from CIDR address block, e.g. `10.20.0.0/16`.
         * 
         * @return builder
         * 
         * @deprecated
         * Deprecated. Use `ip_filter_string` instead.
         * 
         */
        @Deprecated /* Deprecated. Use `ip_filter_string` instead. */
        public Builder ipFilters(@Nullable Output<List<String>> ipFilters) {
            $.ipFilters = ipFilters;
            return this;
        }

        /**
         * @param ipFilters Allow incoming connections from CIDR address block, e.g. `10.20.0.0/16`.
         * 
         * @return builder
         * 
         * @deprecated
         * Deprecated. Use `ip_filter_string` instead.
         * 
         */
        @Deprecated /* Deprecated. Use `ip_filter_string` instead. */
        public Builder ipFilters(List<String> ipFilters) {
            return ipFilters(Output.of(ipFilters));
        }

        /**
         * @param ipFilters Allow incoming connections from CIDR address block, e.g. `10.20.0.0/16`.
         * 
         * @return builder
         * 
         * @deprecated
         * Deprecated. Use `ip_filter_string` instead.
         * 
         */
        @Deprecated /* Deprecated. Use `ip_filter_string` instead. */
        public Builder ipFilters(String... ipFilters) {
            return ipFilters(List.of(ipFilters));
        }

        /**
         * @param kafka Kafka broker configuration values
         * 
         * @return builder
         * 
         */
        public Builder kafka(@Nullable Output<KafkaKafkaUserConfigKafkaArgs> kafka) {
            $.kafka = kafka;
            return this;
        }

        /**
         * @param kafka Kafka broker configuration values
         * 
         * @return builder
         * 
         */
        public Builder kafka(KafkaKafkaUserConfigKafkaArgs kafka) {
            return kafka(Output.of(kafka));
        }

        /**
         * @param kafkaAuthenticationMethods Kafka authentication methods
         * 
         * @return builder
         * 
         */
        public Builder kafkaAuthenticationMethods(@Nullable Output<KafkaKafkaUserConfigKafkaAuthenticationMethodsArgs> kafkaAuthenticationMethods) {
            $.kafkaAuthenticationMethods = kafkaAuthenticationMethods;
            return this;
        }

        /**
         * @param kafkaAuthenticationMethods Kafka authentication methods
         * 
         * @return builder
         * 
         */
        public Builder kafkaAuthenticationMethods(KafkaKafkaUserConfigKafkaAuthenticationMethodsArgs kafkaAuthenticationMethods) {
            return kafkaAuthenticationMethods(Output.of(kafkaAuthenticationMethods));
        }

        /**
         * @param kafkaConnect Enable Kafka Connect service. Default: `false`.
         * 
         * @return builder
         * 
         */
        public Builder kafkaConnect(@Nullable Output<Boolean> kafkaConnect) {
            $.kafkaConnect = kafkaConnect;
            return this;
        }

        /**
         * @param kafkaConnect Enable Kafka Connect service. Default: `false`.
         * 
         * @return builder
         * 
         */
        public Builder kafkaConnect(Boolean kafkaConnect) {
            return kafkaConnect(Output.of(kafkaConnect));
        }

        /**
         * @param kafkaConnectConfig Kafka Connect configuration values
         * 
         * @return builder
         * 
         */
        public Builder kafkaConnectConfig(@Nullable Output<KafkaKafkaUserConfigKafkaConnectConfigArgs> kafkaConnectConfig) {
            $.kafkaConnectConfig = kafkaConnectConfig;
            return this;
        }

        /**
         * @param kafkaConnectConfig Kafka Connect configuration values
         * 
         * @return builder
         * 
         */
        public Builder kafkaConnectConfig(KafkaKafkaUserConfigKafkaConnectConfigArgs kafkaConnectConfig) {
            return kafkaConnectConfig(Output.of(kafkaConnectConfig));
        }

        /**
         * @param kafkaConnectPluginVersions The plugin selected by the user
         * 
         * @return builder
         * 
         */
        public Builder kafkaConnectPluginVersions(@Nullable Output<List<KafkaKafkaUserConfigKafkaConnectPluginVersionArgs>> kafkaConnectPluginVersions) {
            $.kafkaConnectPluginVersions = kafkaConnectPluginVersions;
            return this;
        }

        /**
         * @param kafkaConnectPluginVersions The plugin selected by the user
         * 
         * @return builder
         * 
         */
        public Builder kafkaConnectPluginVersions(List<KafkaKafkaUserConfigKafkaConnectPluginVersionArgs> kafkaConnectPluginVersions) {
            return kafkaConnectPluginVersions(Output.of(kafkaConnectPluginVersions));
        }

        /**
         * @param kafkaConnectPluginVersions The plugin selected by the user
         * 
         * @return builder
         * 
         */
        public Builder kafkaConnectPluginVersions(KafkaKafkaUserConfigKafkaConnectPluginVersionArgs... kafkaConnectPluginVersions) {
            return kafkaConnectPluginVersions(List.of(kafkaConnectPluginVersions));
        }

        public Builder kafkaConnectSecretProviders(@Nullable Output<List<KafkaKafkaUserConfigKafkaConnectSecretProviderArgs>> kafkaConnectSecretProviders) {
            $.kafkaConnectSecretProviders = kafkaConnectSecretProviders;
            return this;
        }

        public Builder kafkaConnectSecretProviders(List<KafkaKafkaUserConfigKafkaConnectSecretProviderArgs> kafkaConnectSecretProviders) {
            return kafkaConnectSecretProviders(Output.of(kafkaConnectSecretProviders));
        }

        public Builder kafkaConnectSecretProviders(KafkaKafkaUserConfigKafkaConnectSecretProviderArgs... kafkaConnectSecretProviders) {
            return kafkaConnectSecretProviders(List.of(kafkaConnectSecretProviders));
        }

        /**
         * @param kafkaRest Enable Kafka-REST service. Default: `false`.
         * 
         * @return builder
         * 
         */
        public Builder kafkaRest(@Nullable Output<Boolean> kafkaRest) {
            $.kafkaRest = kafkaRest;
            return this;
        }

        /**
         * @param kafkaRest Enable Kafka-REST service. Default: `false`.
         * 
         * @return builder
         * 
         */
        public Builder kafkaRest(Boolean kafkaRest) {
            return kafkaRest(Output.of(kafkaRest));
        }

        /**
         * @param kafkaRestAuthorization Enable authorization in Kafka-REST service.
         * 
         * @return builder
         * 
         */
        public Builder kafkaRestAuthorization(@Nullable Output<Boolean> kafkaRestAuthorization) {
            $.kafkaRestAuthorization = kafkaRestAuthorization;
            return this;
        }

        /**
         * @param kafkaRestAuthorization Enable authorization in Kafka-REST service.
         * 
         * @return builder
         * 
         */
        public Builder kafkaRestAuthorization(Boolean kafkaRestAuthorization) {
            return kafkaRestAuthorization(Output.of(kafkaRestAuthorization));
        }

        /**
         * @param kafkaRestConfig Kafka REST configuration
         * 
         * @return builder
         * 
         */
        public Builder kafkaRestConfig(@Nullable Output<KafkaKafkaUserConfigKafkaRestConfigArgs> kafkaRestConfig) {
            $.kafkaRestConfig = kafkaRestConfig;
            return this;
        }

        /**
         * @param kafkaRestConfig Kafka REST configuration
         * 
         * @return builder
         * 
         */
        public Builder kafkaRestConfig(KafkaKafkaUserConfigKafkaRestConfigArgs kafkaRestConfig) {
            return kafkaRestConfig(Output.of(kafkaRestConfig));
        }

        /**
         * @param kafkaSaslMechanisms Kafka SASL mechanisms
         * 
         * @return builder
         * 
         */
        public Builder kafkaSaslMechanisms(@Nullable Output<KafkaKafkaUserConfigKafkaSaslMechanismsArgs> kafkaSaslMechanisms) {
            $.kafkaSaslMechanisms = kafkaSaslMechanisms;
            return this;
        }

        /**
         * @param kafkaSaslMechanisms Kafka SASL mechanisms
         * 
         * @return builder
         * 
         */
        public Builder kafkaSaslMechanisms(KafkaKafkaUserConfigKafkaSaslMechanismsArgs kafkaSaslMechanisms) {
            return kafkaSaslMechanisms(Output.of(kafkaSaslMechanisms));
        }

        /**
         * @param kafkaVersion Enum: `3.1`, `3.2`, `3.3`, `3.4`, `3.5`, `3.6`, `3.7`, `3.8`, `3.9`, and newer. Kafka major version.
         * 
         * @return builder
         * 
         */
        public Builder kafkaVersion(@Nullable Output<String> kafkaVersion) {
            $.kafkaVersion = kafkaVersion;
            return this;
        }

        /**
         * @param kafkaVersion Enum: `3.1`, `3.2`, `3.3`, `3.4`, `3.5`, `3.6`, `3.7`, `3.8`, `3.9`, and newer. Kafka major version.
         * 
         * @return builder
         * 
         */
        public Builder kafkaVersion(String kafkaVersion) {
            return kafkaVersion(Output.of(kafkaVersion));
        }

        /**
         * @param letsencryptSaslPrivatelink Use Letsencrypt CA for Kafka SASL via Privatelink.
         * 
         * @return builder
         * 
         */
        public Builder letsencryptSaslPrivatelink(@Nullable Output<Boolean> letsencryptSaslPrivatelink) {
            $.letsencryptSaslPrivatelink = letsencryptSaslPrivatelink;
            return this;
        }

        /**
         * @param letsencryptSaslPrivatelink Use Letsencrypt CA for Kafka SASL via Privatelink.
         * 
         * @return builder
         * 
         */
        public Builder letsencryptSaslPrivatelink(Boolean letsencryptSaslPrivatelink) {
            return letsencryptSaslPrivatelink(Output.of(letsencryptSaslPrivatelink));
        }

        /**
         * @param privateAccess Allow access to selected service ports from private networks
         * 
         * @return builder
         * 
         */
        public Builder privateAccess(@Nullable Output<KafkaKafkaUserConfigPrivateAccessArgs> privateAccess) {
            $.privateAccess = privateAccess;
            return this;
        }

        /**
         * @param privateAccess Allow access to selected service ports from private networks
         * 
         * @return builder
         * 
         */
        public Builder privateAccess(KafkaKafkaUserConfigPrivateAccessArgs privateAccess) {
            return privateAccess(Output.of(privateAccess));
        }

        /**
         * @param privatelinkAccess Allow access to selected service components through Privatelink
         * 
         * @return builder
         * 
         */
        public Builder privatelinkAccess(@Nullable Output<KafkaKafkaUserConfigPrivatelinkAccessArgs> privatelinkAccess) {
            $.privatelinkAccess = privatelinkAccess;
            return this;
        }

        /**
         * @param privatelinkAccess Allow access to selected service components through Privatelink
         * 
         * @return builder
         * 
         */
        public Builder privatelinkAccess(KafkaKafkaUserConfigPrivatelinkAccessArgs privatelinkAccess) {
            return privatelinkAccess(Output.of(privatelinkAccess));
        }

        /**
         * @param publicAccess Allow access to selected service ports from the public Internet
         * 
         * @return builder
         * 
         */
        public Builder publicAccess(@Nullable Output<KafkaKafkaUserConfigPublicAccessArgs> publicAccess) {
            $.publicAccess = publicAccess;
            return this;
        }

        /**
         * @param publicAccess Allow access to selected service ports from the public Internet
         * 
         * @return builder
         * 
         */
        public Builder publicAccess(KafkaKafkaUserConfigPublicAccessArgs publicAccess) {
            return publicAccess(Output.of(publicAccess));
        }

        /**
         * @param schemaRegistry Enable Schema-Registry service. Default: `false`.
         * 
         * @return builder
         * 
         */
        public Builder schemaRegistry(@Nullable Output<Boolean> schemaRegistry) {
            $.schemaRegistry = schemaRegistry;
            return this;
        }

        /**
         * @param schemaRegistry Enable Schema-Registry service. Default: `false`.
         * 
         * @return builder
         * 
         */
        public Builder schemaRegistry(Boolean schemaRegistry) {
            return schemaRegistry(Output.of(schemaRegistry));
        }

        /**
         * @param schemaRegistryConfig Schema Registry configuration
         * 
         * @return builder
         * 
         */
        public Builder schemaRegistryConfig(@Nullable Output<KafkaKafkaUserConfigSchemaRegistryConfigArgs> schemaRegistryConfig) {
            $.schemaRegistryConfig = schemaRegistryConfig;
            return this;
        }

        /**
         * @param schemaRegistryConfig Schema Registry configuration
         * 
         * @return builder
         * 
         */
        public Builder schemaRegistryConfig(KafkaKafkaUserConfigSchemaRegistryConfigArgs schemaRegistryConfig) {
            return schemaRegistryConfig(Output.of(schemaRegistryConfig));
        }

        /**
         * @param serviceLog Store logs for the service so that they are available in the HTTP API and console.
         * 
         * @return builder
         * 
         */
        public Builder serviceLog(@Nullable Output<Boolean> serviceLog) {
            $.serviceLog = serviceLog;
            return this;
        }

        /**
         * @param serviceLog Store logs for the service so that they are available in the HTTP API and console.
         * 
         * @return builder
         * 
         */
        public Builder serviceLog(Boolean serviceLog) {
            return serviceLog(Output.of(serviceLog));
        }

        /**
         * @param singleZone Single-zone configuration
         * 
         * @return builder
         * 
         */
        public Builder singleZone(@Nullable Output<KafkaKafkaUserConfigSingleZoneArgs> singleZone) {
            $.singleZone = singleZone;
            return this;
        }

        /**
         * @param singleZone Single-zone configuration
         * 
         * @return builder
         * 
         */
        public Builder singleZone(KafkaKafkaUserConfigSingleZoneArgs singleZone) {
            return singleZone(Output.of(singleZone));
        }

        /**
         * @param staticIps Use static public IP addresses.
         * 
         * @return builder
         * 
         */
        public Builder staticIps(@Nullable Output<Boolean> staticIps) {
            $.staticIps = staticIps;
            return this;
        }

        /**
         * @param staticIps Use static public IP addresses.
         * 
         * @return builder
         * 
         */
        public Builder staticIps(Boolean staticIps) {
            return staticIps(Output.of(staticIps));
        }

        /**
         * @param tieredStorage Tiered storage configuration
         * 
         * @return builder
         * 
         */
        public Builder tieredStorage(@Nullable Output<KafkaKafkaUserConfigTieredStorageArgs> tieredStorage) {
            $.tieredStorage = tieredStorage;
            return this;
        }

        /**
         * @param tieredStorage Tiered storage configuration
         * 
         * @return builder
         * 
         */
        public Builder tieredStorage(KafkaKafkaUserConfigTieredStorageArgs tieredStorage) {
            return tieredStorage(Output.of(tieredStorage));
        }

        public KafkaKafkaUserConfigArgs build() {
            return $;
        }
    }

}
