// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aiven.outputs;

import com.pulumi.aiven.outputs.GetKafkaConnectKafkaConnectUserConfigIpFilterObject;
import com.pulumi.aiven.outputs.GetKafkaConnectKafkaConnectUserConfigKafkaConnect;
import com.pulumi.aiven.outputs.GetKafkaConnectKafkaConnectUserConfigPluginVersion;
import com.pulumi.aiven.outputs.GetKafkaConnectKafkaConnectUserConfigPrivateAccess;
import com.pulumi.aiven.outputs.GetKafkaConnectKafkaConnectUserConfigPrivatelinkAccess;
import com.pulumi.aiven.outputs.GetKafkaConnectKafkaConnectUserConfigPublicAccess;
import com.pulumi.aiven.outputs.GetKafkaConnectKafkaConnectUserConfigSecretProvider;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetKafkaConnectKafkaConnectUserConfig {
    /**
     * @return Additional Cloud Regions for Backup Replication.
     * 
     * @deprecated
     * This property is deprecated.
     * 
     */
    @Deprecated /* This property is deprecated. */
    private @Nullable String additionalBackupRegions;
    /**
     * @return Allow incoming connections from CIDR address block, e.g. `10.20.0.0/16`
     * 
     */
    private @Nullable List<GetKafkaConnectKafkaConnectUserConfigIpFilterObject> ipFilterObjects;
    /**
     * @return Allow incoming connections from CIDR address block, e.g. `10.20.0.0/16`.
     * 
     */
    private @Nullable List<String> ipFilterStrings;
    /**
     * @return Allow incoming connections from CIDR address block, e.g. `10.20.0.0/16`.
     * 
     * @deprecated
     * Deprecated. Use `ip_filter_string` instead.
     * 
     */
    @Deprecated /* Deprecated. Use `ip_filter_string` instead. */
    private @Nullable List<String> ipFilters;
    /**
     * @return Kafka Connect configuration values
     * 
     */
    private @Nullable GetKafkaConnectKafkaConnectUserConfigKafkaConnect kafkaConnect;
    /**
     * @return The plugin selected by the user
     * 
     */
    private @Nullable List<GetKafkaConnectKafkaConnectUserConfigPluginVersion> pluginVersions;
    /**
     * @return Allow access to selected service ports from private networks
     * 
     */
    private @Nullable GetKafkaConnectKafkaConnectUserConfigPrivateAccess privateAccess;
    /**
     * @return Allow access to selected service components through Privatelink
     * 
     */
    private @Nullable GetKafkaConnectKafkaConnectUserConfigPrivatelinkAccess privatelinkAccess;
    /**
     * @return Allow access to selected service ports from the public Internet
     * 
     */
    private @Nullable GetKafkaConnectKafkaConnectUserConfigPublicAccess publicAccess;
    private @Nullable List<GetKafkaConnectKafkaConnectUserConfigSecretProvider> secretProviders;
    /**
     * @return Store logs for the service so that they are available in the HTTP API and console.
     * 
     */
    private @Nullable Boolean serviceLog;
    /**
     * @return Use static public IP addresses.
     * 
     */
    private @Nullable Boolean staticIps;

    private GetKafkaConnectKafkaConnectUserConfig() {}
    /**
     * @return Additional Cloud Regions for Backup Replication.
     * 
     * @deprecated
     * This property is deprecated.
     * 
     */
    @Deprecated /* This property is deprecated. */
    public Optional<String> additionalBackupRegions() {
        return Optional.ofNullable(this.additionalBackupRegions);
    }
    /**
     * @return Allow incoming connections from CIDR address block, e.g. `10.20.0.0/16`
     * 
     */
    public List<GetKafkaConnectKafkaConnectUserConfigIpFilterObject> ipFilterObjects() {
        return this.ipFilterObjects == null ? List.of() : this.ipFilterObjects;
    }
    /**
     * @return Allow incoming connections from CIDR address block, e.g. `10.20.0.0/16`.
     * 
     */
    public List<String> ipFilterStrings() {
        return this.ipFilterStrings == null ? List.of() : this.ipFilterStrings;
    }
    /**
     * @return Allow incoming connections from CIDR address block, e.g. `10.20.0.0/16`.
     * 
     * @deprecated
     * Deprecated. Use `ip_filter_string` instead.
     * 
     */
    @Deprecated /* Deprecated. Use `ip_filter_string` instead. */
    public List<String> ipFilters() {
        return this.ipFilters == null ? List.of() : this.ipFilters;
    }
    /**
     * @return Kafka Connect configuration values
     * 
     */
    public Optional<GetKafkaConnectKafkaConnectUserConfigKafkaConnect> kafkaConnect() {
        return Optional.ofNullable(this.kafkaConnect);
    }
    /**
     * @return The plugin selected by the user
     * 
     */
    public List<GetKafkaConnectKafkaConnectUserConfigPluginVersion> pluginVersions() {
        return this.pluginVersions == null ? List.of() : this.pluginVersions;
    }
    /**
     * @return Allow access to selected service ports from private networks
     * 
     */
    public Optional<GetKafkaConnectKafkaConnectUserConfigPrivateAccess> privateAccess() {
        return Optional.ofNullable(this.privateAccess);
    }
    /**
     * @return Allow access to selected service components through Privatelink
     * 
     */
    public Optional<GetKafkaConnectKafkaConnectUserConfigPrivatelinkAccess> privatelinkAccess() {
        return Optional.ofNullable(this.privatelinkAccess);
    }
    /**
     * @return Allow access to selected service ports from the public Internet
     * 
     */
    public Optional<GetKafkaConnectKafkaConnectUserConfigPublicAccess> publicAccess() {
        return Optional.ofNullable(this.publicAccess);
    }
    public List<GetKafkaConnectKafkaConnectUserConfigSecretProvider> secretProviders() {
        return this.secretProviders == null ? List.of() : this.secretProviders;
    }
    /**
     * @return Store logs for the service so that they are available in the HTTP API and console.
     * 
     */
    public Optional<Boolean> serviceLog() {
        return Optional.ofNullable(this.serviceLog);
    }
    /**
     * @return Use static public IP addresses.
     * 
     */
    public Optional<Boolean> staticIps() {
        return Optional.ofNullable(this.staticIps);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetKafkaConnectKafkaConnectUserConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String additionalBackupRegions;
        private @Nullable List<GetKafkaConnectKafkaConnectUserConfigIpFilterObject> ipFilterObjects;
        private @Nullable List<String> ipFilterStrings;
        private @Nullable List<String> ipFilters;
        private @Nullable GetKafkaConnectKafkaConnectUserConfigKafkaConnect kafkaConnect;
        private @Nullable List<GetKafkaConnectKafkaConnectUserConfigPluginVersion> pluginVersions;
        private @Nullable GetKafkaConnectKafkaConnectUserConfigPrivateAccess privateAccess;
        private @Nullable GetKafkaConnectKafkaConnectUserConfigPrivatelinkAccess privatelinkAccess;
        private @Nullable GetKafkaConnectKafkaConnectUserConfigPublicAccess publicAccess;
        private @Nullable List<GetKafkaConnectKafkaConnectUserConfigSecretProvider> secretProviders;
        private @Nullable Boolean serviceLog;
        private @Nullable Boolean staticIps;
        public Builder() {}
        public Builder(GetKafkaConnectKafkaConnectUserConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalBackupRegions = defaults.additionalBackupRegions;
    	      this.ipFilterObjects = defaults.ipFilterObjects;
    	      this.ipFilterStrings = defaults.ipFilterStrings;
    	      this.ipFilters = defaults.ipFilters;
    	      this.kafkaConnect = defaults.kafkaConnect;
    	      this.pluginVersions = defaults.pluginVersions;
    	      this.privateAccess = defaults.privateAccess;
    	      this.privatelinkAccess = defaults.privatelinkAccess;
    	      this.publicAccess = defaults.publicAccess;
    	      this.secretProviders = defaults.secretProviders;
    	      this.serviceLog = defaults.serviceLog;
    	      this.staticIps = defaults.staticIps;
        }

        @CustomType.Setter
        public Builder additionalBackupRegions(@Nullable String additionalBackupRegions) {

            this.additionalBackupRegions = additionalBackupRegions;
            return this;
        }
        @CustomType.Setter
        public Builder ipFilterObjects(@Nullable List<GetKafkaConnectKafkaConnectUserConfigIpFilterObject> ipFilterObjects) {

            this.ipFilterObjects = ipFilterObjects;
            return this;
        }
        public Builder ipFilterObjects(GetKafkaConnectKafkaConnectUserConfigIpFilterObject... ipFilterObjects) {
            return ipFilterObjects(List.of(ipFilterObjects));
        }
        @CustomType.Setter
        public Builder ipFilterStrings(@Nullable List<String> ipFilterStrings) {

            this.ipFilterStrings = ipFilterStrings;
            return this;
        }
        public Builder ipFilterStrings(String... ipFilterStrings) {
            return ipFilterStrings(List.of(ipFilterStrings));
        }
        @CustomType.Setter
        public Builder ipFilters(@Nullable List<String> ipFilters) {

            this.ipFilters = ipFilters;
            return this;
        }
        public Builder ipFilters(String... ipFilters) {
            return ipFilters(List.of(ipFilters));
        }
        @CustomType.Setter
        public Builder kafkaConnect(@Nullable GetKafkaConnectKafkaConnectUserConfigKafkaConnect kafkaConnect) {

            this.kafkaConnect = kafkaConnect;
            return this;
        }
        @CustomType.Setter
        public Builder pluginVersions(@Nullable List<GetKafkaConnectKafkaConnectUserConfigPluginVersion> pluginVersions) {

            this.pluginVersions = pluginVersions;
            return this;
        }
        public Builder pluginVersions(GetKafkaConnectKafkaConnectUserConfigPluginVersion... pluginVersions) {
            return pluginVersions(List.of(pluginVersions));
        }
        @CustomType.Setter
        public Builder privateAccess(@Nullable GetKafkaConnectKafkaConnectUserConfigPrivateAccess privateAccess) {

            this.privateAccess = privateAccess;
            return this;
        }
        @CustomType.Setter
        public Builder privatelinkAccess(@Nullable GetKafkaConnectKafkaConnectUserConfigPrivatelinkAccess privatelinkAccess) {

            this.privatelinkAccess = privatelinkAccess;
            return this;
        }
        @CustomType.Setter
        public Builder publicAccess(@Nullable GetKafkaConnectKafkaConnectUserConfigPublicAccess publicAccess) {

            this.publicAccess = publicAccess;
            return this;
        }
        @CustomType.Setter
        public Builder secretProviders(@Nullable List<GetKafkaConnectKafkaConnectUserConfigSecretProvider> secretProviders) {

            this.secretProviders = secretProviders;
            return this;
        }
        public Builder secretProviders(GetKafkaConnectKafkaConnectUserConfigSecretProvider... secretProviders) {
            return secretProviders(List.of(secretProviders));
        }
        @CustomType.Setter
        public Builder serviceLog(@Nullable Boolean serviceLog) {

            this.serviceLog = serviceLog;
            return this;
        }
        @CustomType.Setter
        public Builder staticIps(@Nullable Boolean staticIps) {

            this.staticIps = staticIps;
            return this;
        }
        public GetKafkaConnectKafkaConnectUserConfig build() {
            final var _resultValue = new GetKafkaConnectKafkaConnectUserConfig();
            _resultValue.additionalBackupRegions = additionalBackupRegions;
            _resultValue.ipFilterObjects = ipFilterObjects;
            _resultValue.ipFilterStrings = ipFilterStrings;
            _resultValue.ipFilters = ipFilters;
            _resultValue.kafkaConnect = kafkaConnect;
            _resultValue.pluginVersions = pluginVersions;
            _resultValue.privateAccess = privateAccess;
            _resultValue.privatelinkAccess = privatelinkAccess;
            _resultValue.publicAccess = publicAccess;
            _resultValue.secretProviders = secretProviders;
            _resultValue.serviceLog = serviceLog;
            _resultValue.staticIps = staticIps;
            return _resultValue;
        }
    }
}
