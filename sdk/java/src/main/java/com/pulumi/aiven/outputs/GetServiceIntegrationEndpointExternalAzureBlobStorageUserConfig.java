// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aiven.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetServiceIntegrationEndpointExternalAzureBlobStorageUserConfig {
    /**
     * @return Blob path. Example: `path/to/blob/file.csv`.
     * 
     */
    private @Nullable String blobPath;
    /**
     * @return Azure Blob Storage connection string. Example: `AccountName=IDENT;AccountKey=SECRET`.
     * 
     */
    private String connectionString;
    /**
     * @return Container. Example: `container-dev`.
     * 
     */
    private String container;

    private GetServiceIntegrationEndpointExternalAzureBlobStorageUserConfig() {}
    /**
     * @return Blob path. Example: `path/to/blob/file.csv`.
     * 
     */
    public Optional<String> blobPath() {
        return Optional.ofNullable(this.blobPath);
    }
    /**
     * @return Azure Blob Storage connection string. Example: `AccountName=IDENT;AccountKey=SECRET`.
     * 
     */
    public String connectionString() {
        return this.connectionString;
    }
    /**
     * @return Container. Example: `container-dev`.
     * 
     */
    public String container() {
        return this.container;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServiceIntegrationEndpointExternalAzureBlobStorageUserConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String blobPath;
        private String connectionString;
        private String container;
        public Builder() {}
        public Builder(GetServiceIntegrationEndpointExternalAzureBlobStorageUserConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.blobPath = defaults.blobPath;
    	      this.connectionString = defaults.connectionString;
    	      this.container = defaults.container;
        }

        @CustomType.Setter
        public Builder blobPath(@Nullable String blobPath) {

            this.blobPath = blobPath;
            return this;
        }
        @CustomType.Setter
        public Builder connectionString(String connectionString) {
            if (connectionString == null) {
              throw new MissingRequiredPropertyException("GetServiceIntegrationEndpointExternalAzureBlobStorageUserConfig", "connectionString");
            }
            this.connectionString = connectionString;
            return this;
        }
        @CustomType.Setter
        public Builder container(String container) {
            if (container == null) {
              throw new MissingRequiredPropertyException("GetServiceIntegrationEndpointExternalAzureBlobStorageUserConfig", "container");
            }
            this.container = container;
            return this;
        }
        public GetServiceIntegrationEndpointExternalAzureBlobStorageUserConfig build() {
            final var _resultValue = new GetServiceIntegrationEndpointExternalAzureBlobStorageUserConfig();
            _resultValue.blobPath = blobPath;
            _resultValue.connectionString = connectionString;
            _resultValue.container = container;
            return _resultValue;
        }
    }
}
