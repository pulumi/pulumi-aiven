// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aiven.inputs;

import com.pulumi.aiven.inputs.KafkaKafkaUserConfigKafkaConnectSecretProviderAwsArgs;
import com.pulumi.aiven.inputs.KafkaKafkaUserConfigKafkaConnectSecretProviderVaultArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class KafkaKafkaUserConfigKafkaConnectSecretProviderArgs extends com.pulumi.resources.ResourceArgs {

    public static final KafkaKafkaUserConfigKafkaConnectSecretProviderArgs Empty = new KafkaKafkaUserConfigKafkaConnectSecretProviderArgs();

    /**
     * AWS secret provider configuration
     * 
     */
    @Import(name="aws")
    private @Nullable Output<KafkaKafkaUserConfigKafkaConnectSecretProviderAwsArgs> aws;

    /**
     * @return AWS secret provider configuration
     * 
     */
    public Optional<Output<KafkaKafkaUserConfigKafkaConnectSecretProviderAwsArgs>> aws() {
        return Optional.ofNullable(this.aws);
    }

    /**
     * Name of the secret provider. Used to reference secrets in connector config.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return Name of the secret provider. Used to reference secrets in connector config.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * Vault secret provider configuration
     * 
     */
    @Import(name="vault")
    private @Nullable Output<KafkaKafkaUserConfigKafkaConnectSecretProviderVaultArgs> vault;

    /**
     * @return Vault secret provider configuration
     * 
     */
    public Optional<Output<KafkaKafkaUserConfigKafkaConnectSecretProviderVaultArgs>> vault() {
        return Optional.ofNullable(this.vault);
    }

    private KafkaKafkaUserConfigKafkaConnectSecretProviderArgs() {}

    private KafkaKafkaUserConfigKafkaConnectSecretProviderArgs(KafkaKafkaUserConfigKafkaConnectSecretProviderArgs $) {
        this.aws = $.aws;
        this.name = $.name;
        this.vault = $.vault;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(KafkaKafkaUserConfigKafkaConnectSecretProviderArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private KafkaKafkaUserConfigKafkaConnectSecretProviderArgs $;

        public Builder() {
            $ = new KafkaKafkaUserConfigKafkaConnectSecretProviderArgs();
        }

        public Builder(KafkaKafkaUserConfigKafkaConnectSecretProviderArgs defaults) {
            $ = new KafkaKafkaUserConfigKafkaConnectSecretProviderArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param aws AWS secret provider configuration
         * 
         * @return builder
         * 
         */
        public Builder aws(@Nullable Output<KafkaKafkaUserConfigKafkaConnectSecretProviderAwsArgs> aws) {
            $.aws = aws;
            return this;
        }

        /**
         * @param aws AWS secret provider configuration
         * 
         * @return builder
         * 
         */
        public Builder aws(KafkaKafkaUserConfigKafkaConnectSecretProviderAwsArgs aws) {
            return aws(Output.of(aws));
        }

        /**
         * @param name Name of the secret provider. Used to reference secrets in connector config.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the secret provider. Used to reference secrets in connector config.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param vault Vault secret provider configuration
         * 
         * @return builder
         * 
         */
        public Builder vault(@Nullable Output<KafkaKafkaUserConfigKafkaConnectSecretProviderVaultArgs> vault) {
            $.vault = vault;
            return this;
        }

        /**
         * @param vault Vault secret provider configuration
         * 
         * @return builder
         * 
         */
        public Builder vault(KafkaKafkaUserConfigKafkaConnectSecretProviderVaultArgs vault) {
            return vault(Output.of(vault));
        }

        public KafkaKafkaUserConfigKafkaConnectSecretProviderArgs build() {
            if ($.name == null) {
                throw new MissingRequiredPropertyException("KafkaKafkaUserConfigKafkaConnectSecretProviderArgs", "name");
            }
            return $;
        }
    }

}
