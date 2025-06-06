// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aiven.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetOpenSearchComponent {
    /**
     * @return Service component name
     * 
     */
    private String component;
    /**
     * @return Connection info for connecting to the service component. This is a combination of host and port.
     * 
     */
    private String connectionUri;
    /**
     * @return Host name for connecting to the service component
     * 
     */
    private String host;
    /**
     * @return Kafka authentication method. This is a value specific to the &#39;kafka&#39; service component
     * 
     */
    private String kafkaAuthenticationMethod;
    /**
     * @return Kafka certificate used. The possible values are `letsencrypt` and `project_ca`.
     * 
     */
    private String kafkaSslCa;
    /**
     * @return Port number for connecting to the service component
     * 
     */
    private Integer port;
    /**
     * @return Network access route
     * 
     */
    private String route;
    /**
     * @return Whether the endpoint is encrypted or accepts plaintext. By default endpoints are always encrypted and this property is only included for service components they may disable encryption
     * 
     */
    private Boolean ssl;
    /**
     * @return DNS usage name
     * 
     */
    private String usage;

    private GetOpenSearchComponent() {}
    /**
     * @return Service component name
     * 
     */
    public String component() {
        return this.component;
    }
    /**
     * @return Connection info for connecting to the service component. This is a combination of host and port.
     * 
     */
    public String connectionUri() {
        return this.connectionUri;
    }
    /**
     * @return Host name for connecting to the service component
     * 
     */
    public String host() {
        return this.host;
    }
    /**
     * @return Kafka authentication method. This is a value specific to the &#39;kafka&#39; service component
     * 
     */
    public String kafkaAuthenticationMethod() {
        return this.kafkaAuthenticationMethod;
    }
    /**
     * @return Kafka certificate used. The possible values are `letsencrypt` and `project_ca`.
     * 
     */
    public String kafkaSslCa() {
        return this.kafkaSslCa;
    }
    /**
     * @return Port number for connecting to the service component
     * 
     */
    public Integer port() {
        return this.port;
    }
    /**
     * @return Network access route
     * 
     */
    public String route() {
        return this.route;
    }
    /**
     * @return Whether the endpoint is encrypted or accepts plaintext. By default endpoints are always encrypted and this property is only included for service components they may disable encryption
     * 
     */
    public Boolean ssl() {
        return this.ssl;
    }
    /**
     * @return DNS usage name
     * 
     */
    public String usage() {
        return this.usage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetOpenSearchComponent defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String component;
        private String connectionUri;
        private String host;
        private String kafkaAuthenticationMethod;
        private String kafkaSslCa;
        private Integer port;
        private String route;
        private Boolean ssl;
        private String usage;
        public Builder() {}
        public Builder(GetOpenSearchComponent defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.component = defaults.component;
    	      this.connectionUri = defaults.connectionUri;
    	      this.host = defaults.host;
    	      this.kafkaAuthenticationMethod = defaults.kafkaAuthenticationMethod;
    	      this.kafkaSslCa = defaults.kafkaSslCa;
    	      this.port = defaults.port;
    	      this.route = defaults.route;
    	      this.ssl = defaults.ssl;
    	      this.usage = defaults.usage;
        }

        @CustomType.Setter
        public Builder component(String component) {
            if (component == null) {
              throw new MissingRequiredPropertyException("GetOpenSearchComponent", "component");
            }
            this.component = component;
            return this;
        }
        @CustomType.Setter
        public Builder connectionUri(String connectionUri) {
            if (connectionUri == null) {
              throw new MissingRequiredPropertyException("GetOpenSearchComponent", "connectionUri");
            }
            this.connectionUri = connectionUri;
            return this;
        }
        @CustomType.Setter
        public Builder host(String host) {
            if (host == null) {
              throw new MissingRequiredPropertyException("GetOpenSearchComponent", "host");
            }
            this.host = host;
            return this;
        }
        @CustomType.Setter
        public Builder kafkaAuthenticationMethod(String kafkaAuthenticationMethod) {
            if (kafkaAuthenticationMethod == null) {
              throw new MissingRequiredPropertyException("GetOpenSearchComponent", "kafkaAuthenticationMethod");
            }
            this.kafkaAuthenticationMethod = kafkaAuthenticationMethod;
            return this;
        }
        @CustomType.Setter
        public Builder kafkaSslCa(String kafkaSslCa) {
            if (kafkaSslCa == null) {
              throw new MissingRequiredPropertyException("GetOpenSearchComponent", "kafkaSslCa");
            }
            this.kafkaSslCa = kafkaSslCa;
            return this;
        }
        @CustomType.Setter
        public Builder port(Integer port) {
            if (port == null) {
              throw new MissingRequiredPropertyException("GetOpenSearchComponent", "port");
            }
            this.port = port;
            return this;
        }
        @CustomType.Setter
        public Builder route(String route) {
            if (route == null) {
              throw new MissingRequiredPropertyException("GetOpenSearchComponent", "route");
            }
            this.route = route;
            return this;
        }
        @CustomType.Setter
        public Builder ssl(Boolean ssl) {
            if (ssl == null) {
              throw new MissingRequiredPropertyException("GetOpenSearchComponent", "ssl");
            }
            this.ssl = ssl;
            return this;
        }
        @CustomType.Setter
        public Builder usage(String usage) {
            if (usage == null) {
              throw new MissingRequiredPropertyException("GetOpenSearchComponent", "usage");
            }
            this.usage = usage;
            return this;
        }
        public GetOpenSearchComponent build() {
            final var _resultValue = new GetOpenSearchComponent();
            _resultValue.component = component;
            _resultValue.connectionUri = connectionUri;
            _resultValue.host = host;
            _resultValue.kafkaAuthenticationMethod = kafkaAuthenticationMethod;
            _resultValue.kafkaSslCa = kafkaSslCa;
            _resultValue.port = port;
            _resultValue.route = route;
            _resultValue.ssl = ssl;
            _resultValue.usage = usage;
            return _resultValue;
        }
    }
}
