// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aiven.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class ServiceIntegrationClickhouseKafkaUserConfigTableColumnArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceIntegrationClickhouseKafkaUserConfigTableColumnArgs Empty = new ServiceIntegrationClickhouseKafkaUserConfigTableColumnArgs();

    /**
     * Column name.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return Column name.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * Column type.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return Column type.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    private ServiceIntegrationClickhouseKafkaUserConfigTableColumnArgs() {}

    private ServiceIntegrationClickhouseKafkaUserConfigTableColumnArgs(ServiceIntegrationClickhouseKafkaUserConfigTableColumnArgs $) {
        this.name = $.name;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceIntegrationClickhouseKafkaUserConfigTableColumnArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceIntegrationClickhouseKafkaUserConfigTableColumnArgs $;

        public Builder() {
            $ = new ServiceIntegrationClickhouseKafkaUserConfigTableColumnArgs();
        }

        public Builder(ServiceIntegrationClickhouseKafkaUserConfigTableColumnArgs defaults) {
            $ = new ServiceIntegrationClickhouseKafkaUserConfigTableColumnArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name Column name.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Column name.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param type Column type.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Column type.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public ServiceIntegrationClickhouseKafkaUserConfigTableColumnArgs build() {
            if ($.name == null) {
                throw new MissingRequiredPropertyException("ServiceIntegrationClickhouseKafkaUserConfigTableColumnArgs", "name");
            }
            if ($.type == null) {
                throw new MissingRequiredPropertyException("ServiceIntegrationClickhouseKafkaUserConfigTableColumnArgs", "type");
            }
            return $;
        }
    }

}