// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aiven.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetThanosThano {
    /**
     * @return Query frontend URI.
     * 
     */
    private String queryFrontendUri;
    /**
     * @return Query URI.
     * 
     */
    private String queryUri;
    /**
     * @return Receiver ingesting remote write URI.
     * 
     */
    private String receiverIngestingRemoteWriteUri;
    /**
     * @return Receiver remote write URI.
     * 
     */
    private String receiverRemoteWriteUri;
    /**
     * @return Store URI.
     * 
     */
    private String storeUri;
    /**
     * @return Thanos server URIs.
     * 
     */
    private List<String> uris;

    private GetThanosThano() {}
    /**
     * @return Query frontend URI.
     * 
     */
    public String queryFrontendUri() {
        return this.queryFrontendUri;
    }
    /**
     * @return Query URI.
     * 
     */
    public String queryUri() {
        return this.queryUri;
    }
    /**
     * @return Receiver ingesting remote write URI.
     * 
     */
    public String receiverIngestingRemoteWriteUri() {
        return this.receiverIngestingRemoteWriteUri;
    }
    /**
     * @return Receiver remote write URI.
     * 
     */
    public String receiverRemoteWriteUri() {
        return this.receiverRemoteWriteUri;
    }
    /**
     * @return Store URI.
     * 
     */
    public String storeUri() {
        return this.storeUri;
    }
    /**
     * @return Thanos server URIs.
     * 
     */
    public List<String> uris() {
        return this.uris;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetThanosThano defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String queryFrontendUri;
        private String queryUri;
        private String receiverIngestingRemoteWriteUri;
        private String receiverRemoteWriteUri;
        private String storeUri;
        private List<String> uris;
        public Builder() {}
        public Builder(GetThanosThano defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.queryFrontendUri = defaults.queryFrontendUri;
    	      this.queryUri = defaults.queryUri;
    	      this.receiverIngestingRemoteWriteUri = defaults.receiverIngestingRemoteWriteUri;
    	      this.receiverRemoteWriteUri = defaults.receiverRemoteWriteUri;
    	      this.storeUri = defaults.storeUri;
    	      this.uris = defaults.uris;
        }

        @CustomType.Setter
        public Builder queryFrontendUri(String queryFrontendUri) {
            if (queryFrontendUri == null) {
              throw new MissingRequiredPropertyException("GetThanosThano", "queryFrontendUri");
            }
            this.queryFrontendUri = queryFrontendUri;
            return this;
        }
        @CustomType.Setter
        public Builder queryUri(String queryUri) {
            if (queryUri == null) {
              throw new MissingRequiredPropertyException("GetThanosThano", "queryUri");
            }
            this.queryUri = queryUri;
            return this;
        }
        @CustomType.Setter
        public Builder receiverIngestingRemoteWriteUri(String receiverIngestingRemoteWriteUri) {
            if (receiverIngestingRemoteWriteUri == null) {
              throw new MissingRequiredPropertyException("GetThanosThano", "receiverIngestingRemoteWriteUri");
            }
            this.receiverIngestingRemoteWriteUri = receiverIngestingRemoteWriteUri;
            return this;
        }
        @CustomType.Setter
        public Builder receiverRemoteWriteUri(String receiverRemoteWriteUri) {
            if (receiverRemoteWriteUri == null) {
              throw new MissingRequiredPropertyException("GetThanosThano", "receiverRemoteWriteUri");
            }
            this.receiverRemoteWriteUri = receiverRemoteWriteUri;
            return this;
        }
        @CustomType.Setter
        public Builder storeUri(String storeUri) {
            if (storeUri == null) {
              throw new MissingRequiredPropertyException("GetThanosThano", "storeUri");
            }
            this.storeUri = storeUri;
            return this;
        }
        @CustomType.Setter
        public Builder uris(List<String> uris) {
            if (uris == null) {
              throw new MissingRequiredPropertyException("GetThanosThano", "uris");
            }
            this.uris = uris;
            return this;
        }
        public Builder uris(String... uris) {
            return uris(List.of(uris));
        }
        public GetThanosThano build() {
            final var _resultValue = new GetThanosThano();
            _resultValue.queryFrontendUri = queryFrontendUri;
            _resultValue.queryUri = queryUri;
            _resultValue.receiverIngestingRemoteWriteUri = receiverIngestingRemoteWriteUri;
            _resultValue.receiverRemoteWriteUri = receiverRemoteWriteUri;
            _resultValue.storeUri = storeUri;
            _resultValue.uris = uris;
            return _resultValue;
        }
    }
}