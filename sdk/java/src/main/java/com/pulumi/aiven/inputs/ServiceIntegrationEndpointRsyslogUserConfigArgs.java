// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aiven.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServiceIntegrationEndpointRsyslogUserConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceIntegrationEndpointRsyslogUserConfigArgs Empty = new ServiceIntegrationEndpointRsyslogUserConfigArgs();

    /**
     * PEM encoded CA certificate. Example: `-----BEGIN CERTIFICATE-----
     * ...
     * -----END CERTIFICATE-----
     * `.
     * 
     */
    @Import(name="ca")
    private @Nullable Output<String> ca;

    /**
     * @return PEM encoded CA certificate. Example: `-----BEGIN CERTIFICATE-----
     * ...
     * -----END CERTIFICATE-----
     * `.
     * 
     */
    public Optional<Output<String>> ca() {
        return Optional.ofNullable(this.ca);
    }

    /**
     * PEM encoded client certificate. Example: `-----BEGIN CERTIFICATE-----
     * ...
     * -----END CERTIFICATE-----
     * `.
     * 
     */
    @Import(name="cert")
    private @Nullable Output<String> cert;

    /**
     * @return PEM encoded client certificate. Example: `-----BEGIN CERTIFICATE-----
     * ...
     * -----END CERTIFICATE-----
     * `.
     * 
     */
    public Optional<Output<String>> cert() {
        return Optional.ofNullable(this.cert);
    }

    /**
     * Enum: `custom`, `rfc3164`, `rfc5424`. Message format. Default: `rfc5424`.
     * 
     */
    @Import(name="format", required=true)
    private Output<String> format;

    /**
     * @return Enum: `custom`, `rfc3164`, `rfc5424`. Message format. Default: `rfc5424`.
     * 
     */
    public Output<String> format() {
        return this.format;
    }

    /**
     * PEM encoded client key. Example: `-----BEGIN PRIVATE KEY-----
     * ...
     * -----END PRIVATE KEY-----
     * `.
     * 
     */
    @Import(name="key")
    private @Nullable Output<String> key;

    /**
     * @return PEM encoded client key. Example: `-----BEGIN PRIVATE KEY-----
     * ...
     * -----END PRIVATE KEY-----
     * `.
     * 
     */
    public Optional<Output<String>> key() {
        return Optional.ofNullable(this.key);
    }

    /**
     * Custom syslog message format. Example: `&lt;%pri%&gt;%timestamp:::date-rfc3339% %HOSTNAME% %app-name% %msg%`.
     * 
     */
    @Import(name="logline")
    private @Nullable Output<String> logline;

    /**
     * @return Custom syslog message format. Example: `&lt;%pri%&gt;%timestamp:::date-rfc3339% %HOSTNAME% %app-name% %msg%`.
     * 
     */
    public Optional<Output<String>> logline() {
        return Optional.ofNullable(this.logline);
    }

    /**
     * Rsyslog max message size. Default: `8192`.
     * 
     */
    @Import(name="maxMessageSize")
    private @Nullable Output<Integer> maxMessageSize;

    /**
     * @return Rsyslog max message size. Default: `8192`.
     * 
     */
    public Optional<Output<Integer>> maxMessageSize() {
        return Optional.ofNullable(this.maxMessageSize);
    }

    /**
     * Rsyslog server port. Default: `514`.
     * 
     */
    @Import(name="port", required=true)
    private Output<Integer> port;

    /**
     * @return Rsyslog server port. Default: `514`.
     * 
     */
    public Output<Integer> port() {
        return this.port;
    }

    /**
     * Structured data block for log message. Example: `TOKEN tag=&#34;LiteralValue&#34;`.
     * 
     */
    @Import(name="sd")
    private @Nullable Output<String> sd;

    /**
     * @return Structured data block for log message. Example: `TOKEN tag=&#34;LiteralValue&#34;`.
     * 
     */
    public Optional<Output<String>> sd() {
        return Optional.ofNullable(this.sd);
    }

    /**
     * Rsyslog server IP address or hostname. Example: `logs.example.com`.
     * 
     */
    @Import(name="server", required=true)
    private Output<String> server;

    /**
     * @return Rsyslog server IP address or hostname. Example: `logs.example.com`.
     * 
     */
    public Output<String> server() {
        return this.server;
    }

    /**
     * Require TLS. Default: `true`.
     * 
     */
    @Import(name="tls", required=true)
    private Output<Boolean> tls;

    /**
     * @return Require TLS. Default: `true`.
     * 
     */
    public Output<Boolean> tls() {
        return this.tls;
    }

    private ServiceIntegrationEndpointRsyslogUserConfigArgs() {}

    private ServiceIntegrationEndpointRsyslogUserConfigArgs(ServiceIntegrationEndpointRsyslogUserConfigArgs $) {
        this.ca = $.ca;
        this.cert = $.cert;
        this.format = $.format;
        this.key = $.key;
        this.logline = $.logline;
        this.maxMessageSize = $.maxMessageSize;
        this.port = $.port;
        this.sd = $.sd;
        this.server = $.server;
        this.tls = $.tls;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceIntegrationEndpointRsyslogUserConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceIntegrationEndpointRsyslogUserConfigArgs $;

        public Builder() {
            $ = new ServiceIntegrationEndpointRsyslogUserConfigArgs();
        }

        public Builder(ServiceIntegrationEndpointRsyslogUserConfigArgs defaults) {
            $ = new ServiceIntegrationEndpointRsyslogUserConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param ca PEM encoded CA certificate. Example: `-----BEGIN CERTIFICATE-----
         * ...
         * -----END CERTIFICATE-----
         * `.
         * 
         * @return builder
         * 
         */
        public Builder ca(@Nullable Output<String> ca) {
            $.ca = ca;
            return this;
        }

        /**
         * @param ca PEM encoded CA certificate. Example: `-----BEGIN CERTIFICATE-----
         * ...
         * -----END CERTIFICATE-----
         * `.
         * 
         * @return builder
         * 
         */
        public Builder ca(String ca) {
            return ca(Output.of(ca));
        }

        /**
         * @param cert PEM encoded client certificate. Example: `-----BEGIN CERTIFICATE-----
         * ...
         * -----END CERTIFICATE-----
         * `.
         * 
         * @return builder
         * 
         */
        public Builder cert(@Nullable Output<String> cert) {
            $.cert = cert;
            return this;
        }

        /**
         * @param cert PEM encoded client certificate. Example: `-----BEGIN CERTIFICATE-----
         * ...
         * -----END CERTIFICATE-----
         * `.
         * 
         * @return builder
         * 
         */
        public Builder cert(String cert) {
            return cert(Output.of(cert));
        }

        /**
         * @param format Enum: `custom`, `rfc3164`, `rfc5424`. Message format. Default: `rfc5424`.
         * 
         * @return builder
         * 
         */
        public Builder format(Output<String> format) {
            $.format = format;
            return this;
        }

        /**
         * @param format Enum: `custom`, `rfc3164`, `rfc5424`. Message format. Default: `rfc5424`.
         * 
         * @return builder
         * 
         */
        public Builder format(String format) {
            return format(Output.of(format));
        }

        /**
         * @param key PEM encoded client key. Example: `-----BEGIN PRIVATE KEY-----
         * ...
         * -----END PRIVATE KEY-----
         * `.
         * 
         * @return builder
         * 
         */
        public Builder key(@Nullable Output<String> key) {
            $.key = key;
            return this;
        }

        /**
         * @param key PEM encoded client key. Example: `-----BEGIN PRIVATE KEY-----
         * ...
         * -----END PRIVATE KEY-----
         * `.
         * 
         * @return builder
         * 
         */
        public Builder key(String key) {
            return key(Output.of(key));
        }

        /**
         * @param logline Custom syslog message format. Example: `&lt;%pri%&gt;%timestamp:::date-rfc3339% %HOSTNAME% %app-name% %msg%`.
         * 
         * @return builder
         * 
         */
        public Builder logline(@Nullable Output<String> logline) {
            $.logline = logline;
            return this;
        }

        /**
         * @param logline Custom syslog message format. Example: `&lt;%pri%&gt;%timestamp:::date-rfc3339% %HOSTNAME% %app-name% %msg%`.
         * 
         * @return builder
         * 
         */
        public Builder logline(String logline) {
            return logline(Output.of(logline));
        }

        /**
         * @param maxMessageSize Rsyslog max message size. Default: `8192`.
         * 
         * @return builder
         * 
         */
        public Builder maxMessageSize(@Nullable Output<Integer> maxMessageSize) {
            $.maxMessageSize = maxMessageSize;
            return this;
        }

        /**
         * @param maxMessageSize Rsyslog max message size. Default: `8192`.
         * 
         * @return builder
         * 
         */
        public Builder maxMessageSize(Integer maxMessageSize) {
            return maxMessageSize(Output.of(maxMessageSize));
        }

        /**
         * @param port Rsyslog server port. Default: `514`.
         * 
         * @return builder
         * 
         */
        public Builder port(Output<Integer> port) {
            $.port = port;
            return this;
        }

        /**
         * @param port Rsyslog server port. Default: `514`.
         * 
         * @return builder
         * 
         */
        public Builder port(Integer port) {
            return port(Output.of(port));
        }

        /**
         * @param sd Structured data block for log message. Example: `TOKEN tag=&#34;LiteralValue&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder sd(@Nullable Output<String> sd) {
            $.sd = sd;
            return this;
        }

        /**
         * @param sd Structured data block for log message. Example: `TOKEN tag=&#34;LiteralValue&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder sd(String sd) {
            return sd(Output.of(sd));
        }

        /**
         * @param server Rsyslog server IP address or hostname. Example: `logs.example.com`.
         * 
         * @return builder
         * 
         */
        public Builder server(Output<String> server) {
            $.server = server;
            return this;
        }

        /**
         * @param server Rsyslog server IP address or hostname. Example: `logs.example.com`.
         * 
         * @return builder
         * 
         */
        public Builder server(String server) {
            return server(Output.of(server));
        }

        /**
         * @param tls Require TLS. Default: `true`.
         * 
         * @return builder
         * 
         */
        public Builder tls(Output<Boolean> tls) {
            $.tls = tls;
            return this;
        }

        /**
         * @param tls Require TLS. Default: `true`.
         * 
         * @return builder
         * 
         */
        public Builder tls(Boolean tls) {
            return tls(Output.of(tls));
        }

        public ServiceIntegrationEndpointRsyslogUserConfigArgs build() {
            if ($.format == null) {
                throw new MissingRequiredPropertyException("ServiceIntegrationEndpointRsyslogUserConfigArgs", "format");
            }
            if ($.port == null) {
                throw new MissingRequiredPropertyException("ServiceIntegrationEndpointRsyslogUserConfigArgs", "port");
            }
            if ($.server == null) {
                throw new MissingRequiredPropertyException("ServiceIntegrationEndpointRsyslogUserConfigArgs", "server");
            }
            if ($.tls == null) {
                throw new MissingRequiredPropertyException("ServiceIntegrationEndpointRsyslogUserConfigArgs", "tls");
            }
            return $;
        }
    }

}
