// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aiven.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServiceIntegrationLogsUserConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceIntegrationLogsUserConfigArgs Empty = new ServiceIntegrationLogsUserConfigArgs();

    /**
     * Elasticsearch index retention limit. The default value is `3`.
     * 
     */
    @Import(name="elasticsearchIndexDaysMax")
    private @Nullable Output<Integer> elasticsearchIndexDaysMax;

    /**
     * @return Elasticsearch index retention limit. The default value is `3`.
     * 
     */
    public Optional<Output<Integer>> elasticsearchIndexDaysMax() {
        return Optional.ofNullable(this.elasticsearchIndexDaysMax);
    }

    /**
     * Elasticsearch index prefix. The default value is `logs`.
     * 
     */
    @Import(name="elasticsearchIndexPrefix")
    private @Nullable Output<String> elasticsearchIndexPrefix;

    /**
     * @return Elasticsearch index prefix. The default value is `logs`.
     * 
     */
    public Optional<Output<String>> elasticsearchIndexPrefix() {
        return Optional.ofNullable(this.elasticsearchIndexPrefix);
    }

    /**
     * The list of logging fields that will be sent to the integration logging service. The MESSAGE and timestamp fields are always sent.
     * 
     */
    @Import(name="selectedLogFields")
    private @Nullable Output<List<String>> selectedLogFields;

    /**
     * @return The list of logging fields that will be sent to the integration logging service. The MESSAGE and timestamp fields are always sent.
     * 
     */
    public Optional<Output<List<String>>> selectedLogFields() {
        return Optional.ofNullable(this.selectedLogFields);
    }

    private ServiceIntegrationLogsUserConfigArgs() {}

    private ServiceIntegrationLogsUserConfigArgs(ServiceIntegrationLogsUserConfigArgs $) {
        this.elasticsearchIndexDaysMax = $.elasticsearchIndexDaysMax;
        this.elasticsearchIndexPrefix = $.elasticsearchIndexPrefix;
        this.selectedLogFields = $.selectedLogFields;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceIntegrationLogsUserConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceIntegrationLogsUserConfigArgs $;

        public Builder() {
            $ = new ServiceIntegrationLogsUserConfigArgs();
        }

        public Builder(ServiceIntegrationLogsUserConfigArgs defaults) {
            $ = new ServiceIntegrationLogsUserConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param elasticsearchIndexDaysMax Elasticsearch index retention limit. The default value is `3`.
         * 
         * @return builder
         * 
         */
        public Builder elasticsearchIndexDaysMax(@Nullable Output<Integer> elasticsearchIndexDaysMax) {
            $.elasticsearchIndexDaysMax = elasticsearchIndexDaysMax;
            return this;
        }

        /**
         * @param elasticsearchIndexDaysMax Elasticsearch index retention limit. The default value is `3`.
         * 
         * @return builder
         * 
         */
        public Builder elasticsearchIndexDaysMax(Integer elasticsearchIndexDaysMax) {
            return elasticsearchIndexDaysMax(Output.of(elasticsearchIndexDaysMax));
        }

        /**
         * @param elasticsearchIndexPrefix Elasticsearch index prefix. The default value is `logs`.
         * 
         * @return builder
         * 
         */
        public Builder elasticsearchIndexPrefix(@Nullable Output<String> elasticsearchIndexPrefix) {
            $.elasticsearchIndexPrefix = elasticsearchIndexPrefix;
            return this;
        }

        /**
         * @param elasticsearchIndexPrefix Elasticsearch index prefix. The default value is `logs`.
         * 
         * @return builder
         * 
         */
        public Builder elasticsearchIndexPrefix(String elasticsearchIndexPrefix) {
            return elasticsearchIndexPrefix(Output.of(elasticsearchIndexPrefix));
        }

        /**
         * @param selectedLogFields The list of logging fields that will be sent to the integration logging service. The MESSAGE and timestamp fields are always sent.
         * 
         * @return builder
         * 
         */
        public Builder selectedLogFields(@Nullable Output<List<String>> selectedLogFields) {
            $.selectedLogFields = selectedLogFields;
            return this;
        }

        /**
         * @param selectedLogFields The list of logging fields that will be sent to the integration logging service. The MESSAGE and timestamp fields are always sent.
         * 
         * @return builder
         * 
         */
        public Builder selectedLogFields(List<String> selectedLogFields) {
            return selectedLogFields(Output.of(selectedLogFields));
        }

        /**
         * @param selectedLogFields The list of logging fields that will be sent to the integration logging service. The MESSAGE and timestamp fields are always sent.
         * 
         * @return builder
         * 
         */
        public Builder selectedLogFields(String... selectedLogFields) {
            return selectedLogFields(List.of(selectedLogFields));
        }

        public ServiceIntegrationLogsUserConfigArgs build() {
            return $;
        }
    }

}