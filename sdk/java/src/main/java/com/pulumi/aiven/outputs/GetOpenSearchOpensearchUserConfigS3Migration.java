// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aiven.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetOpenSearchOpensearchUserConfigS3Migration {
    /**
     * @return AWS Access key.
     * 
     */
    private String accessKey;
    /**
     * @return The path to the repository data within its container. The value of this setting should not start or end with a /.
     * 
     */
    private String basePath;
    /**
     * @return S3 bucket name.
     * 
     */
    private String bucket;
    /**
     * @return Big files can be broken down into chunks during snapshotting if needed. Should be the same as for the 3rd party repository.
     * 
     */
    private @Nullable String chunkSize;
    /**
     * @return When set to true metadata files are stored in compressed format.
     * 
     */
    private @Nullable Boolean compress;
    /**
     * @return The S3 service endpoint to connect to. If you are using an S3-compatible service then you should set this to the service’s endpoint.
     * 
     */
    private @Nullable String endpoint;
    /**
     * @return Whether to restore aliases alongside their associated indexes. Default is true.
     * 
     */
    private @Nullable Boolean includeAliases;
    /**
     * @return A comma-delimited list of indices to restore from the snapshot. Multi-index syntax is supported. Example: `metrics*,logs*,data-20240823`.
     * 
     */
    private String indices;
    /**
     * @return Whether the repository is read-only. Default: `true`.
     * 
     */
    private @Nullable Boolean readonly;
    /**
     * @return S3 region.
     * 
     */
    private String region;
    /**
     * @return If true, restore the cluster state. Defaults to false.
     * 
     */
    private @Nullable Boolean restoreGlobalState;
    /**
     * @return AWS secret key.
     * 
     */
    private String secretKey;
    /**
     * @return When set to true files are encrypted on server side.
     * 
     */
    private @Nullable Boolean serverSideEncryption;
    /**
     * @return The snapshot name to restore from.
     * 
     */
    private String snapshotName;

    private GetOpenSearchOpensearchUserConfigS3Migration() {}
    /**
     * @return AWS Access key.
     * 
     */
    public String accessKey() {
        return this.accessKey;
    }
    /**
     * @return The path to the repository data within its container. The value of this setting should not start or end with a /.
     * 
     */
    public String basePath() {
        return this.basePath;
    }
    /**
     * @return S3 bucket name.
     * 
     */
    public String bucket() {
        return this.bucket;
    }
    /**
     * @return Big files can be broken down into chunks during snapshotting if needed. Should be the same as for the 3rd party repository.
     * 
     */
    public Optional<String> chunkSize() {
        return Optional.ofNullable(this.chunkSize);
    }
    /**
     * @return When set to true metadata files are stored in compressed format.
     * 
     */
    public Optional<Boolean> compress() {
        return Optional.ofNullable(this.compress);
    }
    /**
     * @return The S3 service endpoint to connect to. If you are using an S3-compatible service then you should set this to the service’s endpoint.
     * 
     */
    public Optional<String> endpoint() {
        return Optional.ofNullable(this.endpoint);
    }
    /**
     * @return Whether to restore aliases alongside their associated indexes. Default is true.
     * 
     */
    public Optional<Boolean> includeAliases() {
        return Optional.ofNullable(this.includeAliases);
    }
    /**
     * @return A comma-delimited list of indices to restore from the snapshot. Multi-index syntax is supported. Example: `metrics*,logs*,data-20240823`.
     * 
     */
    public String indices() {
        return this.indices;
    }
    /**
     * @return Whether the repository is read-only. Default: `true`.
     * 
     */
    public Optional<Boolean> readonly() {
        return Optional.ofNullable(this.readonly);
    }
    /**
     * @return S3 region.
     * 
     */
    public String region() {
        return this.region;
    }
    /**
     * @return If true, restore the cluster state. Defaults to false.
     * 
     */
    public Optional<Boolean> restoreGlobalState() {
        return Optional.ofNullable(this.restoreGlobalState);
    }
    /**
     * @return AWS secret key.
     * 
     */
    public String secretKey() {
        return this.secretKey;
    }
    /**
     * @return When set to true files are encrypted on server side.
     * 
     */
    public Optional<Boolean> serverSideEncryption() {
        return Optional.ofNullable(this.serverSideEncryption);
    }
    /**
     * @return The snapshot name to restore from.
     * 
     */
    public String snapshotName() {
        return this.snapshotName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetOpenSearchOpensearchUserConfigS3Migration defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String accessKey;
        private String basePath;
        private String bucket;
        private @Nullable String chunkSize;
        private @Nullable Boolean compress;
        private @Nullable String endpoint;
        private @Nullable Boolean includeAliases;
        private String indices;
        private @Nullable Boolean readonly;
        private String region;
        private @Nullable Boolean restoreGlobalState;
        private String secretKey;
        private @Nullable Boolean serverSideEncryption;
        private String snapshotName;
        public Builder() {}
        public Builder(GetOpenSearchOpensearchUserConfigS3Migration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessKey = defaults.accessKey;
    	      this.basePath = defaults.basePath;
    	      this.bucket = defaults.bucket;
    	      this.chunkSize = defaults.chunkSize;
    	      this.compress = defaults.compress;
    	      this.endpoint = defaults.endpoint;
    	      this.includeAliases = defaults.includeAliases;
    	      this.indices = defaults.indices;
    	      this.readonly = defaults.readonly;
    	      this.region = defaults.region;
    	      this.restoreGlobalState = defaults.restoreGlobalState;
    	      this.secretKey = defaults.secretKey;
    	      this.serverSideEncryption = defaults.serverSideEncryption;
    	      this.snapshotName = defaults.snapshotName;
        }

        @CustomType.Setter
        public Builder accessKey(String accessKey) {
            if (accessKey == null) {
              throw new MissingRequiredPropertyException("GetOpenSearchOpensearchUserConfigS3Migration", "accessKey");
            }
            this.accessKey = accessKey;
            return this;
        }
        @CustomType.Setter
        public Builder basePath(String basePath) {
            if (basePath == null) {
              throw new MissingRequiredPropertyException("GetOpenSearchOpensearchUserConfigS3Migration", "basePath");
            }
            this.basePath = basePath;
            return this;
        }
        @CustomType.Setter
        public Builder bucket(String bucket) {
            if (bucket == null) {
              throw new MissingRequiredPropertyException("GetOpenSearchOpensearchUserConfigS3Migration", "bucket");
            }
            this.bucket = bucket;
            return this;
        }
        @CustomType.Setter
        public Builder chunkSize(@Nullable String chunkSize) {

            this.chunkSize = chunkSize;
            return this;
        }
        @CustomType.Setter
        public Builder compress(@Nullable Boolean compress) {

            this.compress = compress;
            return this;
        }
        @CustomType.Setter
        public Builder endpoint(@Nullable String endpoint) {

            this.endpoint = endpoint;
            return this;
        }
        @CustomType.Setter
        public Builder includeAliases(@Nullable Boolean includeAliases) {

            this.includeAliases = includeAliases;
            return this;
        }
        @CustomType.Setter
        public Builder indices(String indices) {
            if (indices == null) {
              throw new MissingRequiredPropertyException("GetOpenSearchOpensearchUserConfigS3Migration", "indices");
            }
            this.indices = indices;
            return this;
        }
        @CustomType.Setter
        public Builder readonly(@Nullable Boolean readonly) {

            this.readonly = readonly;
            return this;
        }
        @CustomType.Setter
        public Builder region(String region) {
            if (region == null) {
              throw new MissingRequiredPropertyException("GetOpenSearchOpensearchUserConfigS3Migration", "region");
            }
            this.region = region;
            return this;
        }
        @CustomType.Setter
        public Builder restoreGlobalState(@Nullable Boolean restoreGlobalState) {

            this.restoreGlobalState = restoreGlobalState;
            return this;
        }
        @CustomType.Setter
        public Builder secretKey(String secretKey) {
            if (secretKey == null) {
              throw new MissingRequiredPropertyException("GetOpenSearchOpensearchUserConfigS3Migration", "secretKey");
            }
            this.secretKey = secretKey;
            return this;
        }
        @CustomType.Setter
        public Builder serverSideEncryption(@Nullable Boolean serverSideEncryption) {

            this.serverSideEncryption = serverSideEncryption;
            return this;
        }
        @CustomType.Setter
        public Builder snapshotName(String snapshotName) {
            if (snapshotName == null) {
              throw new MissingRequiredPropertyException("GetOpenSearchOpensearchUserConfigS3Migration", "snapshotName");
            }
            this.snapshotName = snapshotName;
            return this;
        }
        public GetOpenSearchOpensearchUserConfigS3Migration build() {
            final var _resultValue = new GetOpenSearchOpensearchUserConfigS3Migration();
            _resultValue.accessKey = accessKey;
            _resultValue.basePath = basePath;
            _resultValue.bucket = bucket;
            _resultValue.chunkSize = chunkSize;
            _resultValue.compress = compress;
            _resultValue.endpoint = endpoint;
            _resultValue.includeAliases = includeAliases;
            _resultValue.indices = indices;
            _resultValue.readonly = readonly;
            _resultValue.region = region;
            _resultValue.restoreGlobalState = restoreGlobalState;
            _resultValue.secretKey = secretKey;
            _resultValue.serverSideEncryption = serverSideEncryption;
            _resultValue.snapshotName = snapshotName;
            return _resultValue;
        }
    }
}
