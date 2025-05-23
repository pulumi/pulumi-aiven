// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aiven.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetServiceIntegrationPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetServiceIntegrationPlainArgs Empty = new GetServiceIntegrationPlainArgs();

    /**
     * Destination service for the integration.
     * 
     */
    @Import(name="destinationServiceName", required=true)
    private String destinationServiceName;

    /**
     * @return Destination service for the integration.
     * 
     */
    public String destinationServiceName() {
        return this.destinationServiceName;
    }

    /**
     * Type of the service integration. The possible values are `alertmanager`, `autoscaler`, `caching`, `cassandra_cross_service_cluster`, `clickhouse_credentials`, `clickhouse_kafka`, `clickhouse_postgresql`, `dashboard`, `datadog`, `datasource`, `disaster_recovery`, `external_aws_cloudwatch_logs`, `external_aws_cloudwatch_metrics`, `external_elasticsearch_logs`, `external_google_cloud_logging`, `external_opensearch_logs`, `flink`, `flink_external_bigquery`, `flink_external_kafka`, `flink_external_postgresql`, `internal_connectivity`, `jolokia`, `kafka_connect`, `kafka_connect_postgresql`, `kafka_logs`, `kafka_mirrormaker`, `logs`, `m3aggregator`, `m3coordinator`, `metrics`, `opensearch_cross_cluster_replication`, `opensearch_cross_cluster_search`, `prometheus`, `read_replica`, `rsyslog`, `schema_registry_proxy`, `stresstester`, `thanos_distributed_query`, `thanos_migrate`, `thanoscompactor`, `thanosquery`, `thanosruler`, `thanosstore`, `vector` and `vmalert`.
     * 
     */
    @Import(name="integrationType", required=true)
    private String integrationType;

    /**
     * @return Type of the service integration. The possible values are `alertmanager`, `autoscaler`, `caching`, `cassandra_cross_service_cluster`, `clickhouse_credentials`, `clickhouse_kafka`, `clickhouse_postgresql`, `dashboard`, `datadog`, `datasource`, `disaster_recovery`, `external_aws_cloudwatch_logs`, `external_aws_cloudwatch_metrics`, `external_elasticsearch_logs`, `external_google_cloud_logging`, `external_opensearch_logs`, `flink`, `flink_external_bigquery`, `flink_external_kafka`, `flink_external_postgresql`, `internal_connectivity`, `jolokia`, `kafka_connect`, `kafka_connect_postgresql`, `kafka_logs`, `kafka_mirrormaker`, `logs`, `m3aggregator`, `m3coordinator`, `metrics`, `opensearch_cross_cluster_replication`, `opensearch_cross_cluster_search`, `prometheus`, `read_replica`, `rsyslog`, `schema_registry_proxy`, `stresstester`, `thanos_distributed_query`, `thanos_migrate`, `thanoscompactor`, `thanosquery`, `thanosruler`, `thanosstore`, `vector` and `vmalert`.
     * 
     */
    public String integrationType() {
        return this.integrationType;
    }

    /**
     * Project the integration belongs to.
     * 
     */
    @Import(name="project", required=true)
    private String project;

    /**
     * @return Project the integration belongs to.
     * 
     */
    public String project() {
        return this.project;
    }

    /**
     * Source service for the integration (if any)
     * 
     */
    @Import(name="sourceServiceName", required=true)
    private String sourceServiceName;

    /**
     * @return Source service for the integration (if any)
     * 
     */
    public String sourceServiceName() {
        return this.sourceServiceName;
    }

    private GetServiceIntegrationPlainArgs() {}

    private GetServiceIntegrationPlainArgs(GetServiceIntegrationPlainArgs $) {
        this.destinationServiceName = $.destinationServiceName;
        this.integrationType = $.integrationType;
        this.project = $.project;
        this.sourceServiceName = $.sourceServiceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetServiceIntegrationPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetServiceIntegrationPlainArgs $;

        public Builder() {
            $ = new GetServiceIntegrationPlainArgs();
        }

        public Builder(GetServiceIntegrationPlainArgs defaults) {
            $ = new GetServiceIntegrationPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param destinationServiceName Destination service for the integration.
         * 
         * @return builder
         * 
         */
        public Builder destinationServiceName(String destinationServiceName) {
            $.destinationServiceName = destinationServiceName;
            return this;
        }

        /**
         * @param integrationType Type of the service integration. The possible values are `alertmanager`, `autoscaler`, `caching`, `cassandra_cross_service_cluster`, `clickhouse_credentials`, `clickhouse_kafka`, `clickhouse_postgresql`, `dashboard`, `datadog`, `datasource`, `disaster_recovery`, `external_aws_cloudwatch_logs`, `external_aws_cloudwatch_metrics`, `external_elasticsearch_logs`, `external_google_cloud_logging`, `external_opensearch_logs`, `flink`, `flink_external_bigquery`, `flink_external_kafka`, `flink_external_postgresql`, `internal_connectivity`, `jolokia`, `kafka_connect`, `kafka_connect_postgresql`, `kafka_logs`, `kafka_mirrormaker`, `logs`, `m3aggregator`, `m3coordinator`, `metrics`, `opensearch_cross_cluster_replication`, `opensearch_cross_cluster_search`, `prometheus`, `read_replica`, `rsyslog`, `schema_registry_proxy`, `stresstester`, `thanos_distributed_query`, `thanos_migrate`, `thanoscompactor`, `thanosquery`, `thanosruler`, `thanosstore`, `vector` and `vmalert`.
         * 
         * @return builder
         * 
         */
        public Builder integrationType(String integrationType) {
            $.integrationType = integrationType;
            return this;
        }

        /**
         * @param project Project the integration belongs to.
         * 
         * @return builder
         * 
         */
        public Builder project(String project) {
            $.project = project;
            return this;
        }

        /**
         * @param sourceServiceName Source service for the integration (if any)
         * 
         * @return builder
         * 
         */
        public Builder sourceServiceName(String sourceServiceName) {
            $.sourceServiceName = sourceServiceName;
            return this;
        }

        public GetServiceIntegrationPlainArgs build() {
            if ($.destinationServiceName == null) {
                throw new MissingRequiredPropertyException("GetServiceIntegrationPlainArgs", "destinationServiceName");
            }
            if ($.integrationType == null) {
                throw new MissingRequiredPropertyException("GetServiceIntegrationPlainArgs", "integrationType");
            }
            if ($.project == null) {
                throw new MissingRequiredPropertyException("GetServiceIntegrationPlainArgs", "project");
            }
            if ($.sourceServiceName == null) {
                throw new MissingRequiredPropertyException("GetServiceIntegrationPlainArgs", "sourceServiceName");
            }
            return $;
        }
    }

}
