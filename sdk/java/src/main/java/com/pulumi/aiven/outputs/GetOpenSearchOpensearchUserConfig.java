// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aiven.outputs;

import com.pulumi.aiven.outputs.GetOpenSearchOpensearchUserConfigIndexPattern;
import com.pulumi.aiven.outputs.GetOpenSearchOpensearchUserConfigIndexTemplate;
import com.pulumi.aiven.outputs.GetOpenSearchOpensearchUserConfigIpFilterObject;
import com.pulumi.aiven.outputs.GetOpenSearchOpensearchUserConfigOpensearch;
import com.pulumi.aiven.outputs.GetOpenSearchOpensearchUserConfigOpensearchDashboards;
import com.pulumi.aiven.outputs.GetOpenSearchOpensearchUserConfigPrivateAccess;
import com.pulumi.aiven.outputs.GetOpenSearchOpensearchUserConfigPrivatelinkAccess;
import com.pulumi.aiven.outputs.GetOpenSearchOpensearchUserConfigPublicAccess;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetOpenSearchOpensearchUserConfig {
    private @Nullable String additionalBackupRegions;
    private @Nullable String customDomain;
    /**
     * @deprecated
     * DEPRECATED: Disable automatic replication factor adjustment for multi-node services. By default, Aiven ensures all indexes are replicated at least to two nodes. Note: Due to potential data loss in case of losing a service node, this setting can no longer be activated.
     * 
     */
    @Deprecated /* DEPRECATED: Disable automatic replication factor adjustment for multi-node services. By default, Aiven ensures all indexes are replicated at least to two nodes. Note: Due to potential data loss in case of losing a service node, this setting can no longer be activated. */
    private @Nullable String disableReplicationFactorAdjustment;
    private @Nullable List<GetOpenSearchOpensearchUserConfigIndexPattern> indexPatterns;
    private @Nullable GetOpenSearchOpensearchUserConfigIndexTemplate indexTemplate;
    private @Nullable List<GetOpenSearchOpensearchUserConfigIpFilterObject> ipFilterObjects;
    private @Nullable List<String> ipFilters;
    private @Nullable String keepIndexRefreshInterval;
    /**
     * @deprecated
     * DEPRECATED: use index_patterns instead
     * 
     */
    @Deprecated /* DEPRECATED: use index_patterns instead */
    private @Nullable String maxIndexCount;
    /**
     * @return Opensearch server provided values
     * 
     */
    private @Nullable GetOpenSearchOpensearchUserConfigOpensearch opensearch;
    private @Nullable GetOpenSearchOpensearchUserConfigOpensearchDashboards opensearchDashboards;
    private @Nullable String opensearchVersion;
    private @Nullable GetOpenSearchOpensearchUserConfigPrivateAccess privateAccess;
    private @Nullable GetOpenSearchOpensearchUserConfigPrivatelinkAccess privatelinkAccess;
    private @Nullable String projectToForkFrom;
    private @Nullable GetOpenSearchOpensearchUserConfigPublicAccess publicAccess;
    private @Nullable String recoveryBasebackupName;
    private @Nullable String serviceToForkFrom;
    /**
     * @return Static IPs that are going to be associated with this service. Please assign a value using the &#39;toset&#39; function. Once a static ip resource is in the &#39;assigned&#39; state it cannot be unbound from the node again
     * 
     */
    private @Nullable String staticIps;

    private GetOpenSearchOpensearchUserConfig() {}
    public Optional<String> additionalBackupRegions() {
        return Optional.ofNullable(this.additionalBackupRegions);
    }
    public Optional<String> customDomain() {
        return Optional.ofNullable(this.customDomain);
    }
    /**
     * @deprecated
     * DEPRECATED: Disable automatic replication factor adjustment for multi-node services. By default, Aiven ensures all indexes are replicated at least to two nodes. Note: Due to potential data loss in case of losing a service node, this setting can no longer be activated.
     * 
     */
    @Deprecated /* DEPRECATED: Disable automatic replication factor adjustment for multi-node services. By default, Aiven ensures all indexes are replicated at least to two nodes. Note: Due to potential data loss in case of losing a service node, this setting can no longer be activated. */
    public Optional<String> disableReplicationFactorAdjustment() {
        return Optional.ofNullable(this.disableReplicationFactorAdjustment);
    }
    public List<GetOpenSearchOpensearchUserConfigIndexPattern> indexPatterns() {
        return this.indexPatterns == null ? List.of() : this.indexPatterns;
    }
    public Optional<GetOpenSearchOpensearchUserConfigIndexTemplate> indexTemplate() {
        return Optional.ofNullable(this.indexTemplate);
    }
    public List<GetOpenSearchOpensearchUserConfigIpFilterObject> ipFilterObjects() {
        return this.ipFilterObjects == null ? List.of() : this.ipFilterObjects;
    }
    public List<String> ipFilters() {
        return this.ipFilters == null ? List.of() : this.ipFilters;
    }
    public Optional<String> keepIndexRefreshInterval() {
        return Optional.ofNullable(this.keepIndexRefreshInterval);
    }
    /**
     * @deprecated
     * DEPRECATED: use index_patterns instead
     * 
     */
    @Deprecated /* DEPRECATED: use index_patterns instead */
    public Optional<String> maxIndexCount() {
        return Optional.ofNullable(this.maxIndexCount);
    }
    /**
     * @return Opensearch server provided values
     * 
     */
    public Optional<GetOpenSearchOpensearchUserConfigOpensearch> opensearch() {
        return Optional.ofNullable(this.opensearch);
    }
    public Optional<GetOpenSearchOpensearchUserConfigOpensearchDashboards> opensearchDashboards() {
        return Optional.ofNullable(this.opensearchDashboards);
    }
    public Optional<String> opensearchVersion() {
        return Optional.ofNullable(this.opensearchVersion);
    }
    public Optional<GetOpenSearchOpensearchUserConfigPrivateAccess> privateAccess() {
        return Optional.ofNullable(this.privateAccess);
    }
    public Optional<GetOpenSearchOpensearchUserConfigPrivatelinkAccess> privatelinkAccess() {
        return Optional.ofNullable(this.privatelinkAccess);
    }
    public Optional<String> projectToForkFrom() {
        return Optional.ofNullable(this.projectToForkFrom);
    }
    public Optional<GetOpenSearchOpensearchUserConfigPublicAccess> publicAccess() {
        return Optional.ofNullable(this.publicAccess);
    }
    public Optional<String> recoveryBasebackupName() {
        return Optional.ofNullable(this.recoveryBasebackupName);
    }
    public Optional<String> serviceToForkFrom() {
        return Optional.ofNullable(this.serviceToForkFrom);
    }
    /**
     * @return Static IPs that are going to be associated with this service. Please assign a value using the &#39;toset&#39; function. Once a static ip resource is in the &#39;assigned&#39; state it cannot be unbound from the node again
     * 
     */
    public Optional<String> staticIps() {
        return Optional.ofNullable(this.staticIps);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetOpenSearchOpensearchUserConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String additionalBackupRegions;
        private @Nullable String customDomain;
        private @Nullable String disableReplicationFactorAdjustment;
        private @Nullable List<GetOpenSearchOpensearchUserConfigIndexPattern> indexPatterns;
        private @Nullable GetOpenSearchOpensearchUserConfigIndexTemplate indexTemplate;
        private @Nullable List<GetOpenSearchOpensearchUserConfigIpFilterObject> ipFilterObjects;
        private @Nullable List<String> ipFilters;
        private @Nullable String keepIndexRefreshInterval;
        private @Nullable String maxIndexCount;
        private @Nullable GetOpenSearchOpensearchUserConfigOpensearch opensearch;
        private @Nullable GetOpenSearchOpensearchUserConfigOpensearchDashboards opensearchDashboards;
        private @Nullable String opensearchVersion;
        private @Nullable GetOpenSearchOpensearchUserConfigPrivateAccess privateAccess;
        private @Nullable GetOpenSearchOpensearchUserConfigPrivatelinkAccess privatelinkAccess;
        private @Nullable String projectToForkFrom;
        private @Nullable GetOpenSearchOpensearchUserConfigPublicAccess publicAccess;
        private @Nullable String recoveryBasebackupName;
        private @Nullable String serviceToForkFrom;
        private @Nullable String staticIps;
        public Builder() {}
        public Builder(GetOpenSearchOpensearchUserConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalBackupRegions = defaults.additionalBackupRegions;
    	      this.customDomain = defaults.customDomain;
    	      this.disableReplicationFactorAdjustment = defaults.disableReplicationFactorAdjustment;
    	      this.indexPatterns = defaults.indexPatterns;
    	      this.indexTemplate = defaults.indexTemplate;
    	      this.ipFilterObjects = defaults.ipFilterObjects;
    	      this.ipFilters = defaults.ipFilters;
    	      this.keepIndexRefreshInterval = defaults.keepIndexRefreshInterval;
    	      this.maxIndexCount = defaults.maxIndexCount;
    	      this.opensearch = defaults.opensearch;
    	      this.opensearchDashboards = defaults.opensearchDashboards;
    	      this.opensearchVersion = defaults.opensearchVersion;
    	      this.privateAccess = defaults.privateAccess;
    	      this.privatelinkAccess = defaults.privatelinkAccess;
    	      this.projectToForkFrom = defaults.projectToForkFrom;
    	      this.publicAccess = defaults.publicAccess;
    	      this.recoveryBasebackupName = defaults.recoveryBasebackupName;
    	      this.serviceToForkFrom = defaults.serviceToForkFrom;
    	      this.staticIps = defaults.staticIps;
        }

        @CustomType.Setter
        public Builder additionalBackupRegions(@Nullable String additionalBackupRegions) {
            this.additionalBackupRegions = additionalBackupRegions;
            return this;
        }
        @CustomType.Setter
        public Builder customDomain(@Nullable String customDomain) {
            this.customDomain = customDomain;
            return this;
        }
        @CustomType.Setter
        public Builder disableReplicationFactorAdjustment(@Nullable String disableReplicationFactorAdjustment) {
            this.disableReplicationFactorAdjustment = disableReplicationFactorAdjustment;
            return this;
        }
        @CustomType.Setter
        public Builder indexPatterns(@Nullable List<GetOpenSearchOpensearchUserConfigIndexPattern> indexPatterns) {
            this.indexPatterns = indexPatterns;
            return this;
        }
        public Builder indexPatterns(GetOpenSearchOpensearchUserConfigIndexPattern... indexPatterns) {
            return indexPatterns(List.of(indexPatterns));
        }
        @CustomType.Setter
        public Builder indexTemplate(@Nullable GetOpenSearchOpensearchUserConfigIndexTemplate indexTemplate) {
            this.indexTemplate = indexTemplate;
            return this;
        }
        @CustomType.Setter
        public Builder ipFilterObjects(@Nullable List<GetOpenSearchOpensearchUserConfigIpFilterObject> ipFilterObjects) {
            this.ipFilterObjects = ipFilterObjects;
            return this;
        }
        public Builder ipFilterObjects(GetOpenSearchOpensearchUserConfigIpFilterObject... ipFilterObjects) {
            return ipFilterObjects(List.of(ipFilterObjects));
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
        public Builder keepIndexRefreshInterval(@Nullable String keepIndexRefreshInterval) {
            this.keepIndexRefreshInterval = keepIndexRefreshInterval;
            return this;
        }
        @CustomType.Setter
        public Builder maxIndexCount(@Nullable String maxIndexCount) {
            this.maxIndexCount = maxIndexCount;
            return this;
        }
        @CustomType.Setter
        public Builder opensearch(@Nullable GetOpenSearchOpensearchUserConfigOpensearch opensearch) {
            this.opensearch = opensearch;
            return this;
        }
        @CustomType.Setter
        public Builder opensearchDashboards(@Nullable GetOpenSearchOpensearchUserConfigOpensearchDashboards opensearchDashboards) {
            this.opensearchDashboards = opensearchDashboards;
            return this;
        }
        @CustomType.Setter
        public Builder opensearchVersion(@Nullable String opensearchVersion) {
            this.opensearchVersion = opensearchVersion;
            return this;
        }
        @CustomType.Setter
        public Builder privateAccess(@Nullable GetOpenSearchOpensearchUserConfigPrivateAccess privateAccess) {
            this.privateAccess = privateAccess;
            return this;
        }
        @CustomType.Setter
        public Builder privatelinkAccess(@Nullable GetOpenSearchOpensearchUserConfigPrivatelinkAccess privatelinkAccess) {
            this.privatelinkAccess = privatelinkAccess;
            return this;
        }
        @CustomType.Setter
        public Builder projectToForkFrom(@Nullable String projectToForkFrom) {
            this.projectToForkFrom = projectToForkFrom;
            return this;
        }
        @CustomType.Setter
        public Builder publicAccess(@Nullable GetOpenSearchOpensearchUserConfigPublicAccess publicAccess) {
            this.publicAccess = publicAccess;
            return this;
        }
        @CustomType.Setter
        public Builder recoveryBasebackupName(@Nullable String recoveryBasebackupName) {
            this.recoveryBasebackupName = recoveryBasebackupName;
            return this;
        }
        @CustomType.Setter
        public Builder serviceToForkFrom(@Nullable String serviceToForkFrom) {
            this.serviceToForkFrom = serviceToForkFrom;
            return this;
        }
        @CustomType.Setter
        public Builder staticIps(@Nullable String staticIps) {
            this.staticIps = staticIps;
            return this;
        }
        public GetOpenSearchOpensearchUserConfig build() {
            final var o = new GetOpenSearchOpensearchUserConfig();
            o.additionalBackupRegions = additionalBackupRegions;
            o.customDomain = customDomain;
            o.disableReplicationFactorAdjustment = disableReplicationFactorAdjustment;
            o.indexPatterns = indexPatterns;
            o.indexTemplate = indexTemplate;
            o.ipFilterObjects = ipFilterObjects;
            o.ipFilters = ipFilters;
            o.keepIndexRefreshInterval = keepIndexRefreshInterval;
            o.maxIndexCount = maxIndexCount;
            o.opensearch = opensearch;
            o.opensearchDashboards = opensearchDashboards;
            o.opensearchVersion = opensearchVersion;
            o.privateAccess = privateAccess;
            o.privatelinkAccess = privatelinkAccess;
            o.projectToForkFrom = projectToForkFrom;
            o.publicAccess = publicAccess;
            o.recoveryBasebackupName = recoveryBasebackupName;
            o.serviceToForkFrom = serviceToForkFrom;
            o.staticIps = staticIps;
            return o;
        }
    }
}