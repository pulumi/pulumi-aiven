// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aiven.outputs;

import com.pulumi.aiven.outputs.GetKafkaConnectKafkaConnectUserConfigSecretProviderAws;
import com.pulumi.aiven.outputs.GetKafkaConnectKafkaConnectUserConfigSecretProviderVault;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetKafkaConnectKafkaConnectUserConfigSecretProvider {
    /**
     * @return AWS config for Secret Provider
     * 
     */
    private @Nullable GetKafkaConnectKafkaConnectUserConfigSecretProviderAws aws;
    /**
     * @return Name of the secret provider. Used to reference secrets in connector config.
     * 
     */
    private String name;
    /**
     * @return Vault Config for Secret Provider
     * 
     */
    private @Nullable GetKafkaConnectKafkaConnectUserConfigSecretProviderVault vault;

    private GetKafkaConnectKafkaConnectUserConfigSecretProvider() {}
    /**
     * @return AWS config for Secret Provider
     * 
     */
    public Optional<GetKafkaConnectKafkaConnectUserConfigSecretProviderAws> aws() {
        return Optional.ofNullable(this.aws);
    }
    /**
     * @return Name of the secret provider. Used to reference secrets in connector config.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Vault Config for Secret Provider
     * 
     */
    public Optional<GetKafkaConnectKafkaConnectUserConfigSecretProviderVault> vault() {
        return Optional.ofNullable(this.vault);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetKafkaConnectKafkaConnectUserConfigSecretProvider defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable GetKafkaConnectKafkaConnectUserConfigSecretProviderAws aws;
        private String name;
        private @Nullable GetKafkaConnectKafkaConnectUserConfigSecretProviderVault vault;
        public Builder() {}
        public Builder(GetKafkaConnectKafkaConnectUserConfigSecretProvider defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aws = defaults.aws;
    	      this.name = defaults.name;
    	      this.vault = defaults.vault;
        }

        @CustomType.Setter
        public Builder aws(@Nullable GetKafkaConnectKafkaConnectUserConfigSecretProviderAws aws) {

            this.aws = aws;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetKafkaConnectKafkaConnectUserConfigSecretProvider", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder vault(@Nullable GetKafkaConnectKafkaConnectUserConfigSecretProviderVault vault) {

            this.vault = vault;
            return this;
        }
        public GetKafkaConnectKafkaConnectUserConfigSecretProvider build() {
            final var _resultValue = new GetKafkaConnectKafkaConnectUserConfigSecretProvider();
            _resultValue.aws = aws;
            _resultValue.name = name;
            _resultValue.vault = vault;
            return _resultValue;
        }
    }
}