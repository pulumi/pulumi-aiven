// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aiven.outputs;

import com.pulumi.aiven.outputs.MySqlMysqlParam;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class MySqlMysql {
    /**
     * @return MySQL connection parameters
     * 
     */
    private @Nullable List<MySqlMysqlParam> params;
    /**
     * @return MySQL replica URI for services with a replica
     * 
     */
    private @Nullable String replicaUri;
    /**
     * @return MySQL standby connection URIs
     * 
     */
    private @Nullable List<String> standbyUris;
    /**
     * @return MySQL syncing connection URIs
     * 
     */
    private @Nullable List<String> syncingUris;
    /**
     * @return MySQL master connection URIs
     * 
     */
    private @Nullable List<String> uris;

    private MySqlMysql() {}
    /**
     * @return MySQL connection parameters
     * 
     */
    public List<MySqlMysqlParam> params() {
        return this.params == null ? List.of() : this.params;
    }
    /**
     * @return MySQL replica URI for services with a replica
     * 
     */
    public Optional<String> replicaUri() {
        return Optional.ofNullable(this.replicaUri);
    }
    /**
     * @return MySQL standby connection URIs
     * 
     */
    public List<String> standbyUris() {
        return this.standbyUris == null ? List.of() : this.standbyUris;
    }
    /**
     * @return MySQL syncing connection URIs
     * 
     */
    public List<String> syncingUris() {
        return this.syncingUris == null ? List.of() : this.syncingUris;
    }
    /**
     * @return MySQL master connection URIs
     * 
     */
    public List<String> uris() {
        return this.uris == null ? List.of() : this.uris;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MySqlMysql defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<MySqlMysqlParam> params;
        private @Nullable String replicaUri;
        private @Nullable List<String> standbyUris;
        private @Nullable List<String> syncingUris;
        private @Nullable List<String> uris;
        public Builder() {}
        public Builder(MySqlMysql defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.params = defaults.params;
    	      this.replicaUri = defaults.replicaUri;
    	      this.standbyUris = defaults.standbyUris;
    	      this.syncingUris = defaults.syncingUris;
    	      this.uris = defaults.uris;
        }

        @CustomType.Setter
        public Builder params(@Nullable List<MySqlMysqlParam> params) {

            this.params = params;
            return this;
        }
        public Builder params(MySqlMysqlParam... params) {
            return params(List.of(params));
        }
        @CustomType.Setter
        public Builder replicaUri(@Nullable String replicaUri) {

            this.replicaUri = replicaUri;
            return this;
        }
        @CustomType.Setter
        public Builder standbyUris(@Nullable List<String> standbyUris) {

            this.standbyUris = standbyUris;
            return this;
        }
        public Builder standbyUris(String... standbyUris) {
            return standbyUris(List.of(standbyUris));
        }
        @CustomType.Setter
        public Builder syncingUris(@Nullable List<String> syncingUris) {

            this.syncingUris = syncingUris;
            return this;
        }
        public Builder syncingUris(String... syncingUris) {
            return syncingUris(List.of(syncingUris));
        }
        @CustomType.Setter
        public Builder uris(@Nullable List<String> uris) {

            this.uris = uris;
            return this;
        }
        public Builder uris(String... uris) {
            return uris(List.of(uris));
        }
        public MySqlMysql build() {
            final var _resultValue = new MySqlMysql();
            _resultValue.params = params;
            _resultValue.replicaUri = replicaUri;
            _resultValue.standbyUris = standbyUris;
            _resultValue.syncingUris = syncingUris;
            _resultValue.uris = uris;
            return _resultValue;
        }
    }
}