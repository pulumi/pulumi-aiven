// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aiven.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class MySqlServiceIntegrationArgs extends com.pulumi.resources.ResourceArgs {

    public static final MySqlServiceIntegrationArgs Empty = new MySqlServiceIntegrationArgs();

    /**
     * Type of the service integration. The possible value is `read_replica`.
     * 
     */
    @Import(name="integrationType", required=true)
    private Output<String> integrationType;

    /**
     * @return Type of the service integration. The possible value is `read_replica`.
     * 
     */
    public Output<String> integrationType() {
        return this.integrationType;
    }

    /**
     * Name of the source service
     * 
     */
    @Import(name="sourceServiceName", required=true)
    private Output<String> sourceServiceName;

    /**
     * @return Name of the source service
     * 
     */
    public Output<String> sourceServiceName() {
        return this.sourceServiceName;
    }

    private MySqlServiceIntegrationArgs() {}

    private MySqlServiceIntegrationArgs(MySqlServiceIntegrationArgs $) {
        this.integrationType = $.integrationType;
        this.sourceServiceName = $.sourceServiceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MySqlServiceIntegrationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MySqlServiceIntegrationArgs $;

        public Builder() {
            $ = new MySqlServiceIntegrationArgs();
        }

        public Builder(MySqlServiceIntegrationArgs defaults) {
            $ = new MySqlServiceIntegrationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param integrationType Type of the service integration. The possible value is `read_replica`.
         * 
         * @return builder
         * 
         */
        public Builder integrationType(Output<String> integrationType) {
            $.integrationType = integrationType;
            return this;
        }

        /**
         * @param integrationType Type of the service integration. The possible value is `read_replica`.
         * 
         * @return builder
         * 
         */
        public Builder integrationType(String integrationType) {
            return integrationType(Output.of(integrationType));
        }

        /**
         * @param sourceServiceName Name of the source service
         * 
         * @return builder
         * 
         */
        public Builder sourceServiceName(Output<String> sourceServiceName) {
            $.sourceServiceName = sourceServiceName;
            return this;
        }

        /**
         * @param sourceServiceName Name of the source service
         * 
         * @return builder
         * 
         */
        public Builder sourceServiceName(String sourceServiceName) {
            return sourceServiceName(Output.of(sourceServiceName));
        }

        public MySqlServiceIntegrationArgs build() {
            if ($.integrationType == null) {
                throw new MissingRequiredPropertyException("MySqlServiceIntegrationArgs", "integrationType");
            }
            if ($.sourceServiceName == null) {
                throw new MissingRequiredPropertyException("MySqlServiceIntegrationArgs", "sourceServiceName");
            }
            return $;
        }
    }

}
