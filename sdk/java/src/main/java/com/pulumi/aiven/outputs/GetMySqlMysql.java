// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aiven.outputs;

import com.pulumi.aiven.outputs.GetMySqlMysqlParam;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetMySqlMysql {
    /**
     * @return MySQL connection parameters
     * 
     */
    private List<GetMySqlMysqlParam> params;
    /**
     * @return MySQL replica URI for services with a replica
     * 
     */
    private String replicaUri;
    /**
     * @return MySQL standby connection URIs
     * 
     */
    private List<String> standbyUris;
    /**
     * @return MySQL syncing connection URIs
     * 
     */
    private List<String> syncingUris;
    /**
     * @return MySQL master connection URIs
     * 
     */
    private List<String> uris;

    private GetMySqlMysql() {}
    /**
     * @return MySQL connection parameters
     * 
     */
    public List<GetMySqlMysqlParam> params() {
        return this.params;
    }
    /**
     * @return MySQL replica URI for services with a replica
     * 
     */
    public String replicaUri() {
        return this.replicaUri;
    }
    /**
     * @return MySQL standby connection URIs
     * 
     */
    public List<String> standbyUris() {
        return this.standbyUris;
    }
    /**
     * @return MySQL syncing connection URIs
     * 
     */
    public List<String> syncingUris() {
        return this.syncingUris;
    }
    /**
     * @return MySQL master connection URIs
     * 
     */
    public List<String> uris() {
        return this.uris;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetMySqlMysql defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetMySqlMysqlParam> params;
        private String replicaUri;
        private List<String> standbyUris;
        private List<String> syncingUris;
        private List<String> uris;
        public Builder() {}
        public Builder(GetMySqlMysql defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.params = defaults.params;
    	      this.replicaUri = defaults.replicaUri;
    	      this.standbyUris = defaults.standbyUris;
    	      this.syncingUris = defaults.syncingUris;
    	      this.uris = defaults.uris;
        }

        @CustomType.Setter
        public Builder params(List<GetMySqlMysqlParam> params) {
            if (params == null) {
              throw new MissingRequiredPropertyException("GetMySqlMysql", "params");
            }
            this.params = params;
            return this;
        }
        public Builder params(GetMySqlMysqlParam... params) {
            return params(List.of(params));
        }
        @CustomType.Setter
        public Builder replicaUri(String replicaUri) {
            if (replicaUri == null) {
              throw new MissingRequiredPropertyException("GetMySqlMysql", "replicaUri");
            }
            this.replicaUri = replicaUri;
            return this;
        }
        @CustomType.Setter
        public Builder standbyUris(List<String> standbyUris) {
            if (standbyUris == null) {
              throw new MissingRequiredPropertyException("GetMySqlMysql", "standbyUris");
            }
            this.standbyUris = standbyUris;
            return this;
        }
        public Builder standbyUris(String... standbyUris) {
            return standbyUris(List.of(standbyUris));
        }
        @CustomType.Setter
        public Builder syncingUris(List<String> syncingUris) {
            if (syncingUris == null) {
              throw new MissingRequiredPropertyException("GetMySqlMysql", "syncingUris");
            }
            this.syncingUris = syncingUris;
            return this;
        }
        public Builder syncingUris(String... syncingUris) {
            return syncingUris(List.of(syncingUris));
        }
        @CustomType.Setter
        public Builder uris(List<String> uris) {
            if (uris == null) {
              throw new MissingRequiredPropertyException("GetMySqlMysql", "uris");
            }
            this.uris = uris;
            return this;
        }
        public Builder uris(String... uris) {
            return uris(List.of(uris));
        }
        public GetMySqlMysql build() {
            final var _resultValue = new GetMySqlMysql();
            _resultValue.params = params;
            _resultValue.replicaUri = replicaUri;
            _resultValue.standbyUris = standbyUris;
            _resultValue.syncingUris = syncingUris;
            _resultValue.uris = uris;
            return _resultValue;
        }
    }
}