// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * The Service Integration Endpoint resource allows the creation and management of Aiven Service Integration Endpoints.
 */
export class ServiceIntegrationEndpoint extends pulumi.CustomResource {
    /**
     * Get an existing ServiceIntegrationEndpoint resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ServiceIntegrationEndpointState, opts?: pulumi.CustomResourceOptions): ServiceIntegrationEndpoint {
        return new ServiceIntegrationEndpoint(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aiven:index/serviceIntegrationEndpoint:ServiceIntegrationEndpoint';

    /**
     * Returns true if the given object is an instance of ServiceIntegrationEndpoint.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ServiceIntegrationEndpoint {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ServiceIntegrationEndpoint.__pulumiType;
    }

    /**
     * Datadog user configurable settings
     */
    public readonly datadogUserConfig!: pulumi.Output<outputs.ServiceIntegrationEndpointDatadogUserConfig | undefined>;
    /**
     * Integration endpoint specific backend configuration
     */
    public /*out*/ readonly endpointConfig!: pulumi.Output<{[key: string]: string}>;
    /**
     * Name of the service integration endpoint
     */
    public readonly endpointName!: pulumi.Output<string>;
    /**
     * Type of the service integration endpoint. Possible values: `autoscaler`, `datadog`, `externalAwsCloudwatchLogs`, `externalAwsCloudwatchMetrics`, `externalAwsS3`, `externalClickhouse`, `externalElasticsearchLogs`, `externalGoogleCloudBigquery`, `externalGoogleCloudLogging`, `externalKafka`, `externalMysql`, `externalOpensearchLogs`, `externalPostgresql`, `externalRedis`, `externalSchemaRegistry`, `externalSumologicLogs`, `jolokia`, `prometheus`, `rsyslog`
     */
    public readonly endpointType!: pulumi.Output<string>;
    /**
     * ExternalAwsCloudwatchLogs user configurable settings
     */
    public readonly externalAwsCloudwatchLogsUserConfig!: pulumi.Output<outputs.ServiceIntegrationEndpointExternalAwsCloudwatchLogsUserConfig | undefined>;
    /**
     * ExternalAwsCloudwatchMetrics user configurable settings
     */
    public readonly externalAwsCloudwatchMetricsUserConfig!: pulumi.Output<outputs.ServiceIntegrationEndpointExternalAwsCloudwatchMetricsUserConfig | undefined>;
    /**
     * ExternalAwsS3 user configurable settings
     */
    public readonly externalAwsS3UserConfig!: pulumi.Output<outputs.ServiceIntegrationEndpointExternalAwsS3UserConfig | undefined>;
    /**
     * ExternalClickhouse user configurable settings
     */
    public readonly externalClickhouseUserConfig!: pulumi.Output<outputs.ServiceIntegrationEndpointExternalClickhouseUserConfig | undefined>;
    /**
     * ExternalElasticsearchLogs user configurable settings
     */
    public readonly externalElasticsearchLogsUserConfig!: pulumi.Output<outputs.ServiceIntegrationEndpointExternalElasticsearchLogsUserConfig | undefined>;
    /**
     * ExternalGoogleCloudBigquery user configurable settings
     */
    public readonly externalGoogleCloudBigquery!: pulumi.Output<outputs.ServiceIntegrationEndpointExternalGoogleCloudBigquery | undefined>;
    /**
     * ExternalGoogleCloudLogging user configurable settings
     */
    public readonly externalGoogleCloudLoggingUserConfig!: pulumi.Output<outputs.ServiceIntegrationEndpointExternalGoogleCloudLoggingUserConfig | undefined>;
    /**
     * ExternalKafka user configurable settings
     */
    public readonly externalKafkaUserConfig!: pulumi.Output<outputs.ServiceIntegrationEndpointExternalKafkaUserConfig | undefined>;
    /**
     * ExternalMysql user configurable settings
     */
    public readonly externalMysqlUserConfig!: pulumi.Output<outputs.ServiceIntegrationEndpointExternalMysqlUserConfig | undefined>;
    /**
     * ExternalOpensearchLogs user configurable settings
     */
    public readonly externalOpensearchLogsUserConfig!: pulumi.Output<outputs.ServiceIntegrationEndpointExternalOpensearchLogsUserConfig | undefined>;
    /**
     * ExternalPostgresql user configurable settings
     */
    public readonly externalPostgresql!: pulumi.Output<outputs.ServiceIntegrationEndpointExternalPostgresql | undefined>;
    /**
     * ExternalSchemaRegistry user configurable settings
     */
    public readonly externalSchemaRegistryUserConfig!: pulumi.Output<outputs.ServiceIntegrationEndpointExternalSchemaRegistryUserConfig | undefined>;
    /**
     * Jolokia user configurable settings
     */
    public readonly jolokiaUserConfig!: pulumi.Output<outputs.ServiceIntegrationEndpointJolokiaUserConfig | undefined>;
    /**
     * Project the service integration endpoint belongs to
     */
    public readonly project!: pulumi.Output<string>;
    /**
     * Prometheus user configurable settings
     */
    public readonly prometheusUserConfig!: pulumi.Output<outputs.ServiceIntegrationEndpointPrometheusUserConfig | undefined>;
    /**
     * Rsyslog user configurable settings
     */
    public readonly rsyslogUserConfig!: pulumi.Output<outputs.ServiceIntegrationEndpointRsyslogUserConfig | undefined>;

    /**
     * Create a ServiceIntegrationEndpoint resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ServiceIntegrationEndpointArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ServiceIntegrationEndpointArgs | ServiceIntegrationEndpointState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ServiceIntegrationEndpointState | undefined;
            resourceInputs["datadogUserConfig"] = state ? state.datadogUserConfig : undefined;
            resourceInputs["endpointConfig"] = state ? state.endpointConfig : undefined;
            resourceInputs["endpointName"] = state ? state.endpointName : undefined;
            resourceInputs["endpointType"] = state ? state.endpointType : undefined;
            resourceInputs["externalAwsCloudwatchLogsUserConfig"] = state ? state.externalAwsCloudwatchLogsUserConfig : undefined;
            resourceInputs["externalAwsCloudwatchMetricsUserConfig"] = state ? state.externalAwsCloudwatchMetricsUserConfig : undefined;
            resourceInputs["externalAwsS3UserConfig"] = state ? state.externalAwsS3UserConfig : undefined;
            resourceInputs["externalClickhouseUserConfig"] = state ? state.externalClickhouseUserConfig : undefined;
            resourceInputs["externalElasticsearchLogsUserConfig"] = state ? state.externalElasticsearchLogsUserConfig : undefined;
            resourceInputs["externalGoogleCloudBigquery"] = state ? state.externalGoogleCloudBigquery : undefined;
            resourceInputs["externalGoogleCloudLoggingUserConfig"] = state ? state.externalGoogleCloudLoggingUserConfig : undefined;
            resourceInputs["externalKafkaUserConfig"] = state ? state.externalKafkaUserConfig : undefined;
            resourceInputs["externalMysqlUserConfig"] = state ? state.externalMysqlUserConfig : undefined;
            resourceInputs["externalOpensearchLogsUserConfig"] = state ? state.externalOpensearchLogsUserConfig : undefined;
            resourceInputs["externalPostgresql"] = state ? state.externalPostgresql : undefined;
            resourceInputs["externalSchemaRegistryUserConfig"] = state ? state.externalSchemaRegistryUserConfig : undefined;
            resourceInputs["jolokiaUserConfig"] = state ? state.jolokiaUserConfig : undefined;
            resourceInputs["project"] = state ? state.project : undefined;
            resourceInputs["prometheusUserConfig"] = state ? state.prometheusUserConfig : undefined;
            resourceInputs["rsyslogUserConfig"] = state ? state.rsyslogUserConfig : undefined;
        } else {
            const args = argsOrState as ServiceIntegrationEndpointArgs | undefined;
            if ((!args || args.endpointName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'endpointName'");
            }
            if ((!args || args.endpointType === undefined) && !opts.urn) {
                throw new Error("Missing required property 'endpointType'");
            }
            if ((!args || args.project === undefined) && !opts.urn) {
                throw new Error("Missing required property 'project'");
            }
            resourceInputs["datadogUserConfig"] = args ? args.datadogUserConfig : undefined;
            resourceInputs["endpointName"] = args ? args.endpointName : undefined;
            resourceInputs["endpointType"] = args ? args.endpointType : undefined;
            resourceInputs["externalAwsCloudwatchLogsUserConfig"] = args ? args.externalAwsCloudwatchLogsUserConfig : undefined;
            resourceInputs["externalAwsCloudwatchMetricsUserConfig"] = args ? args.externalAwsCloudwatchMetricsUserConfig : undefined;
            resourceInputs["externalAwsS3UserConfig"] = args ? args.externalAwsS3UserConfig : undefined;
            resourceInputs["externalClickhouseUserConfig"] = args ? args.externalClickhouseUserConfig : undefined;
            resourceInputs["externalElasticsearchLogsUserConfig"] = args ? args.externalElasticsearchLogsUserConfig : undefined;
            resourceInputs["externalGoogleCloudBigquery"] = args ? args.externalGoogleCloudBigquery : undefined;
            resourceInputs["externalGoogleCloudLoggingUserConfig"] = args ? args.externalGoogleCloudLoggingUserConfig : undefined;
            resourceInputs["externalKafkaUserConfig"] = args ? args.externalKafkaUserConfig : undefined;
            resourceInputs["externalMysqlUserConfig"] = args ? args.externalMysqlUserConfig : undefined;
            resourceInputs["externalOpensearchLogsUserConfig"] = args ? args.externalOpensearchLogsUserConfig : undefined;
            resourceInputs["externalPostgresql"] = args ? args.externalPostgresql : undefined;
            resourceInputs["externalSchemaRegistryUserConfig"] = args ? args.externalSchemaRegistryUserConfig : undefined;
            resourceInputs["jolokiaUserConfig"] = args ? args.jolokiaUserConfig : undefined;
            resourceInputs["project"] = args ? args.project : undefined;
            resourceInputs["prometheusUserConfig"] = args ? args.prometheusUserConfig : undefined;
            resourceInputs["rsyslogUserConfig"] = args ? args.rsyslogUserConfig : undefined;
            resourceInputs["endpointConfig"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(ServiceIntegrationEndpoint.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ServiceIntegrationEndpoint resources.
 */
export interface ServiceIntegrationEndpointState {
    /**
     * Datadog user configurable settings
     */
    datadogUserConfig?: pulumi.Input<inputs.ServiceIntegrationEndpointDatadogUserConfig>;
    /**
     * Integration endpoint specific backend configuration
     */
    endpointConfig?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Name of the service integration endpoint
     */
    endpointName?: pulumi.Input<string>;
    /**
     * Type of the service integration endpoint. Possible values: `autoscaler`, `datadog`, `externalAwsCloudwatchLogs`, `externalAwsCloudwatchMetrics`, `externalAwsS3`, `externalClickhouse`, `externalElasticsearchLogs`, `externalGoogleCloudBigquery`, `externalGoogleCloudLogging`, `externalKafka`, `externalMysql`, `externalOpensearchLogs`, `externalPostgresql`, `externalRedis`, `externalSchemaRegistry`, `externalSumologicLogs`, `jolokia`, `prometheus`, `rsyslog`
     */
    endpointType?: pulumi.Input<string>;
    /**
     * ExternalAwsCloudwatchLogs user configurable settings
     */
    externalAwsCloudwatchLogsUserConfig?: pulumi.Input<inputs.ServiceIntegrationEndpointExternalAwsCloudwatchLogsUserConfig>;
    /**
     * ExternalAwsCloudwatchMetrics user configurable settings
     */
    externalAwsCloudwatchMetricsUserConfig?: pulumi.Input<inputs.ServiceIntegrationEndpointExternalAwsCloudwatchMetricsUserConfig>;
    /**
     * ExternalAwsS3 user configurable settings
     */
    externalAwsS3UserConfig?: pulumi.Input<inputs.ServiceIntegrationEndpointExternalAwsS3UserConfig>;
    /**
     * ExternalClickhouse user configurable settings
     */
    externalClickhouseUserConfig?: pulumi.Input<inputs.ServiceIntegrationEndpointExternalClickhouseUserConfig>;
    /**
     * ExternalElasticsearchLogs user configurable settings
     */
    externalElasticsearchLogsUserConfig?: pulumi.Input<inputs.ServiceIntegrationEndpointExternalElasticsearchLogsUserConfig>;
    /**
     * ExternalGoogleCloudBigquery user configurable settings
     */
    externalGoogleCloudBigquery?: pulumi.Input<inputs.ServiceIntegrationEndpointExternalGoogleCloudBigquery>;
    /**
     * ExternalGoogleCloudLogging user configurable settings
     */
    externalGoogleCloudLoggingUserConfig?: pulumi.Input<inputs.ServiceIntegrationEndpointExternalGoogleCloudLoggingUserConfig>;
    /**
     * ExternalKafka user configurable settings
     */
    externalKafkaUserConfig?: pulumi.Input<inputs.ServiceIntegrationEndpointExternalKafkaUserConfig>;
    /**
     * ExternalMysql user configurable settings
     */
    externalMysqlUserConfig?: pulumi.Input<inputs.ServiceIntegrationEndpointExternalMysqlUserConfig>;
    /**
     * ExternalOpensearchLogs user configurable settings
     */
    externalOpensearchLogsUserConfig?: pulumi.Input<inputs.ServiceIntegrationEndpointExternalOpensearchLogsUserConfig>;
    /**
     * ExternalPostgresql user configurable settings
     */
    externalPostgresql?: pulumi.Input<inputs.ServiceIntegrationEndpointExternalPostgresql>;
    /**
     * ExternalSchemaRegistry user configurable settings
     */
    externalSchemaRegistryUserConfig?: pulumi.Input<inputs.ServiceIntegrationEndpointExternalSchemaRegistryUserConfig>;
    /**
     * Jolokia user configurable settings
     */
    jolokiaUserConfig?: pulumi.Input<inputs.ServiceIntegrationEndpointJolokiaUserConfig>;
    /**
     * Project the service integration endpoint belongs to
     */
    project?: pulumi.Input<string>;
    /**
     * Prometheus user configurable settings
     */
    prometheusUserConfig?: pulumi.Input<inputs.ServiceIntegrationEndpointPrometheusUserConfig>;
    /**
     * Rsyslog user configurable settings
     */
    rsyslogUserConfig?: pulumi.Input<inputs.ServiceIntegrationEndpointRsyslogUserConfig>;
}

/**
 * The set of arguments for constructing a ServiceIntegrationEndpoint resource.
 */
export interface ServiceIntegrationEndpointArgs {
    /**
     * Datadog user configurable settings
     */
    datadogUserConfig?: pulumi.Input<inputs.ServiceIntegrationEndpointDatadogUserConfig>;
    /**
     * Name of the service integration endpoint
     */
    endpointName: pulumi.Input<string>;
    /**
     * Type of the service integration endpoint. Possible values: `autoscaler`, `datadog`, `externalAwsCloudwatchLogs`, `externalAwsCloudwatchMetrics`, `externalAwsS3`, `externalClickhouse`, `externalElasticsearchLogs`, `externalGoogleCloudBigquery`, `externalGoogleCloudLogging`, `externalKafka`, `externalMysql`, `externalOpensearchLogs`, `externalPostgresql`, `externalRedis`, `externalSchemaRegistry`, `externalSumologicLogs`, `jolokia`, `prometheus`, `rsyslog`
     */
    endpointType: pulumi.Input<string>;
    /**
     * ExternalAwsCloudwatchLogs user configurable settings
     */
    externalAwsCloudwatchLogsUserConfig?: pulumi.Input<inputs.ServiceIntegrationEndpointExternalAwsCloudwatchLogsUserConfig>;
    /**
     * ExternalAwsCloudwatchMetrics user configurable settings
     */
    externalAwsCloudwatchMetricsUserConfig?: pulumi.Input<inputs.ServiceIntegrationEndpointExternalAwsCloudwatchMetricsUserConfig>;
    /**
     * ExternalAwsS3 user configurable settings
     */
    externalAwsS3UserConfig?: pulumi.Input<inputs.ServiceIntegrationEndpointExternalAwsS3UserConfig>;
    /**
     * ExternalClickhouse user configurable settings
     */
    externalClickhouseUserConfig?: pulumi.Input<inputs.ServiceIntegrationEndpointExternalClickhouseUserConfig>;
    /**
     * ExternalElasticsearchLogs user configurable settings
     */
    externalElasticsearchLogsUserConfig?: pulumi.Input<inputs.ServiceIntegrationEndpointExternalElasticsearchLogsUserConfig>;
    /**
     * ExternalGoogleCloudBigquery user configurable settings
     */
    externalGoogleCloudBigquery?: pulumi.Input<inputs.ServiceIntegrationEndpointExternalGoogleCloudBigquery>;
    /**
     * ExternalGoogleCloudLogging user configurable settings
     */
    externalGoogleCloudLoggingUserConfig?: pulumi.Input<inputs.ServiceIntegrationEndpointExternalGoogleCloudLoggingUserConfig>;
    /**
     * ExternalKafka user configurable settings
     */
    externalKafkaUserConfig?: pulumi.Input<inputs.ServiceIntegrationEndpointExternalKafkaUserConfig>;
    /**
     * ExternalMysql user configurable settings
     */
    externalMysqlUserConfig?: pulumi.Input<inputs.ServiceIntegrationEndpointExternalMysqlUserConfig>;
    /**
     * ExternalOpensearchLogs user configurable settings
     */
    externalOpensearchLogsUserConfig?: pulumi.Input<inputs.ServiceIntegrationEndpointExternalOpensearchLogsUserConfig>;
    /**
     * ExternalPostgresql user configurable settings
     */
    externalPostgresql?: pulumi.Input<inputs.ServiceIntegrationEndpointExternalPostgresql>;
    /**
     * ExternalSchemaRegistry user configurable settings
     */
    externalSchemaRegistryUserConfig?: pulumi.Input<inputs.ServiceIntegrationEndpointExternalSchemaRegistryUserConfig>;
    /**
     * Jolokia user configurable settings
     */
    jolokiaUserConfig?: pulumi.Input<inputs.ServiceIntegrationEndpointJolokiaUserConfig>;
    /**
     * Project the service integration endpoint belongs to
     */
    project: pulumi.Input<string>;
    /**
     * Prometheus user configurable settings
     */
    prometheusUserConfig?: pulumi.Input<inputs.ServiceIntegrationEndpointPrometheusUserConfig>;
    /**
     * Rsyslog user configurable settings
     */
    rsyslogUserConfig?: pulumi.Input<inputs.ServiceIntegrationEndpointRsyslogUserConfig>;
}
