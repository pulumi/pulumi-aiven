// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aiven.outputs;

import com.pulumi.aiven.outputs.ThanosThanosUserConfigCompactor;
import com.pulumi.aiven.outputs.ThanosThanosUserConfigIpFilterObject;
import com.pulumi.aiven.outputs.ThanosThanosUserConfigPublicAccess;
import com.pulumi.aiven.outputs.ThanosThanosUserConfigQuery;
import com.pulumi.aiven.outputs.ThanosThanosUserConfigQueryFrontend;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ThanosThanosUserConfig {
    /**
     * @return ThanosCompactor
     * 
     */
    private @Nullable ThanosThanosUserConfigCompactor compactor;
    /**
     * @return Allow incoming connections from CIDR address block, e.g. `10.20.0.0/16`
     * 
     */
    private @Nullable List<ThanosThanosUserConfigIpFilterObject> ipFilterObjects;
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
     * @return After exceeding the limit a service alert is going to be raised (0 means not set).
     * 
     */
    private @Nullable Integer objectStorageUsageAlertThresholdGb;
    /**
     * @return Allow access to selected service ports from the public Internet
     * 
     */
    private @Nullable ThanosThanosUserConfigPublicAccess publicAccess;
    /**
     * @return ThanosQuery
     * 
     */
    private @Nullable ThanosThanosUserConfigQuery query;
    /**
     * @return ThanosQueryFrontend
     * 
     */
    private @Nullable ThanosThanosUserConfigQueryFrontend queryFrontend;
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

    private ThanosThanosUserConfig() {}
    /**
     * @return ThanosCompactor
     * 
     */
    public Optional<ThanosThanosUserConfigCompactor> compactor() {
        return Optional.ofNullable(this.compactor);
    }
    /**
     * @return Allow incoming connections from CIDR address block, e.g. `10.20.0.0/16`
     * 
     */
    public List<ThanosThanosUserConfigIpFilterObject> ipFilterObjects() {
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
     * @return After exceeding the limit a service alert is going to be raised (0 means not set).
     * 
     */
    public Optional<Integer> objectStorageUsageAlertThresholdGb() {
        return Optional.ofNullable(this.objectStorageUsageAlertThresholdGb);
    }
    /**
     * @return Allow access to selected service ports from the public Internet
     * 
     */
    public Optional<ThanosThanosUserConfigPublicAccess> publicAccess() {
        return Optional.ofNullable(this.publicAccess);
    }
    /**
     * @return ThanosQuery
     * 
     */
    public Optional<ThanosThanosUserConfigQuery> query() {
        return Optional.ofNullable(this.query);
    }
    /**
     * @return ThanosQueryFrontend
     * 
     */
    public Optional<ThanosThanosUserConfigQueryFrontend> queryFrontend() {
        return Optional.ofNullable(this.queryFrontend);
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

    public static Builder builder(ThanosThanosUserConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable ThanosThanosUserConfigCompactor compactor;
        private @Nullable List<ThanosThanosUserConfigIpFilterObject> ipFilterObjects;
        private @Nullable List<String> ipFilterStrings;
        private @Nullable List<String> ipFilters;
        private @Nullable Integer objectStorageUsageAlertThresholdGb;
        private @Nullable ThanosThanosUserConfigPublicAccess publicAccess;
        private @Nullable ThanosThanosUserConfigQuery query;
        private @Nullable ThanosThanosUserConfigQueryFrontend queryFrontend;
        private @Nullable Boolean serviceLog;
        private @Nullable Boolean staticIps;
        public Builder() {}
        public Builder(ThanosThanosUserConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.compactor = defaults.compactor;
    	      this.ipFilterObjects = defaults.ipFilterObjects;
    	      this.ipFilterStrings = defaults.ipFilterStrings;
    	      this.ipFilters = defaults.ipFilters;
    	      this.objectStorageUsageAlertThresholdGb = defaults.objectStorageUsageAlertThresholdGb;
    	      this.publicAccess = defaults.publicAccess;
    	      this.query = defaults.query;
    	      this.queryFrontend = defaults.queryFrontend;
    	      this.serviceLog = defaults.serviceLog;
    	      this.staticIps = defaults.staticIps;
        }

        @CustomType.Setter
        public Builder compactor(@Nullable ThanosThanosUserConfigCompactor compactor) {

            this.compactor = compactor;
            return this;
        }
        @CustomType.Setter
        public Builder ipFilterObjects(@Nullable List<ThanosThanosUserConfigIpFilterObject> ipFilterObjects) {

            this.ipFilterObjects = ipFilterObjects;
            return this;
        }
        public Builder ipFilterObjects(ThanosThanosUserConfigIpFilterObject... ipFilterObjects) {
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
        public Builder objectStorageUsageAlertThresholdGb(@Nullable Integer objectStorageUsageAlertThresholdGb) {

            this.objectStorageUsageAlertThresholdGb = objectStorageUsageAlertThresholdGb;
            return this;
        }
        @CustomType.Setter
        public Builder publicAccess(@Nullable ThanosThanosUserConfigPublicAccess publicAccess) {

            this.publicAccess = publicAccess;
            return this;
        }
        @CustomType.Setter
        public Builder query(@Nullable ThanosThanosUserConfigQuery query) {

            this.query = query;
            return this;
        }
        @CustomType.Setter
        public Builder queryFrontend(@Nullable ThanosThanosUserConfigQueryFrontend queryFrontend) {

            this.queryFrontend = queryFrontend;
            return this;
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
        public ThanosThanosUserConfig build() {
            final var _resultValue = new ThanosThanosUserConfig();
            _resultValue.compactor = compactor;
            _resultValue.ipFilterObjects = ipFilterObjects;
            _resultValue.ipFilterStrings = ipFilterStrings;
            _resultValue.ipFilters = ipFilters;
            _resultValue.objectStorageUsageAlertThresholdGb = objectStorageUsageAlertThresholdGb;
            _resultValue.publicAccess = publicAccess;
            _resultValue.query = query;
            _resultValue.queryFrontend = queryFrontend;
            _resultValue.serviceLog = serviceLog;
            _resultValue.staticIps = staticIps;
            return _resultValue;
        }
    }
}