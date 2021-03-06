# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities
from . import outputs
from ._inputs import *

__all__ = [
    'GetServiceIntegrationEndpointResult',
    'AwaitableGetServiceIntegrationEndpointResult',
    'get_service_integration_endpoint',
]

@pulumi.output_type
class GetServiceIntegrationEndpointResult:
    """
    A collection of values returned by getServiceIntegrationEndpoint.
    """
    def __init__(__self__, datadog_user_config=None, endpoint_config=None, endpoint_name=None, endpoint_type=None, external_aws_cloudwatch_logs_user_config=None, external_aws_cloudwatch_metrics_user_config=None, external_elasticsearch_logs_user_config=None, external_google_cloud_logging_user_config=None, external_kafka_user_config=None, external_schema_registry_user_config=None, id=None, jolokia_user_config=None, project=None, prometheus_user_config=None, rsyslog_user_config=None, signalfx_user_config=None):
        if datadog_user_config and not isinstance(datadog_user_config, dict):
            raise TypeError("Expected argument 'datadog_user_config' to be a dict")
        pulumi.set(__self__, "datadog_user_config", datadog_user_config)
        if endpoint_config and not isinstance(endpoint_config, dict):
            raise TypeError("Expected argument 'endpoint_config' to be a dict")
        pulumi.set(__self__, "endpoint_config", endpoint_config)
        if endpoint_name and not isinstance(endpoint_name, str):
            raise TypeError("Expected argument 'endpoint_name' to be a str")
        pulumi.set(__self__, "endpoint_name", endpoint_name)
        if endpoint_type and not isinstance(endpoint_type, str):
            raise TypeError("Expected argument 'endpoint_type' to be a str")
        pulumi.set(__self__, "endpoint_type", endpoint_type)
        if external_aws_cloudwatch_logs_user_config and not isinstance(external_aws_cloudwatch_logs_user_config, dict):
            raise TypeError("Expected argument 'external_aws_cloudwatch_logs_user_config' to be a dict")
        pulumi.set(__self__, "external_aws_cloudwatch_logs_user_config", external_aws_cloudwatch_logs_user_config)
        if external_aws_cloudwatch_metrics_user_config and not isinstance(external_aws_cloudwatch_metrics_user_config, dict):
            raise TypeError("Expected argument 'external_aws_cloudwatch_metrics_user_config' to be a dict")
        pulumi.set(__self__, "external_aws_cloudwatch_metrics_user_config", external_aws_cloudwatch_metrics_user_config)
        if external_elasticsearch_logs_user_config and not isinstance(external_elasticsearch_logs_user_config, dict):
            raise TypeError("Expected argument 'external_elasticsearch_logs_user_config' to be a dict")
        pulumi.set(__self__, "external_elasticsearch_logs_user_config", external_elasticsearch_logs_user_config)
        if external_google_cloud_logging_user_config and not isinstance(external_google_cloud_logging_user_config, dict):
            raise TypeError("Expected argument 'external_google_cloud_logging_user_config' to be a dict")
        pulumi.set(__self__, "external_google_cloud_logging_user_config", external_google_cloud_logging_user_config)
        if external_kafka_user_config and not isinstance(external_kafka_user_config, dict):
            raise TypeError("Expected argument 'external_kafka_user_config' to be a dict")
        pulumi.set(__self__, "external_kafka_user_config", external_kafka_user_config)
        if external_schema_registry_user_config and not isinstance(external_schema_registry_user_config, dict):
            raise TypeError("Expected argument 'external_schema_registry_user_config' to be a dict")
        pulumi.set(__self__, "external_schema_registry_user_config", external_schema_registry_user_config)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if jolokia_user_config and not isinstance(jolokia_user_config, dict):
            raise TypeError("Expected argument 'jolokia_user_config' to be a dict")
        pulumi.set(__self__, "jolokia_user_config", jolokia_user_config)
        if project and not isinstance(project, str):
            raise TypeError("Expected argument 'project' to be a str")
        pulumi.set(__self__, "project", project)
        if prometheus_user_config and not isinstance(prometheus_user_config, dict):
            raise TypeError("Expected argument 'prometheus_user_config' to be a dict")
        pulumi.set(__self__, "prometheus_user_config", prometheus_user_config)
        if rsyslog_user_config and not isinstance(rsyslog_user_config, dict):
            raise TypeError("Expected argument 'rsyslog_user_config' to be a dict")
        pulumi.set(__self__, "rsyslog_user_config", rsyslog_user_config)
        if signalfx_user_config and not isinstance(signalfx_user_config, dict):
            raise TypeError("Expected argument 'signalfx_user_config' to be a dict")
        pulumi.set(__self__, "signalfx_user_config", signalfx_user_config)

    @property
    @pulumi.getter(name="datadogUserConfig")
    def datadog_user_config(self) -> Optional['outputs.GetServiceIntegrationEndpointDatadogUserConfigResult']:
        return pulumi.get(self, "datadog_user_config")

    @property
    @pulumi.getter(name="endpointConfig")
    def endpoint_config(self) -> Mapping[str, str]:
        return pulumi.get(self, "endpoint_config")

    @property
    @pulumi.getter(name="endpointName")
    def endpoint_name(self) -> str:
        return pulumi.get(self, "endpoint_name")

    @property
    @pulumi.getter(name="endpointType")
    def endpoint_type(self) -> Optional[str]:
        """
        is the type of the external service this endpoint is associated with.
        By the time of writing the only available option is `datadog`.
        """
        return pulumi.get(self, "endpoint_type")

    @property
    @pulumi.getter(name="externalAwsCloudwatchLogsUserConfig")
    def external_aws_cloudwatch_logs_user_config(self) -> Optional['outputs.GetServiceIntegrationEndpointExternalAwsCloudwatchLogsUserConfigResult']:
        return pulumi.get(self, "external_aws_cloudwatch_logs_user_config")

    @property
    @pulumi.getter(name="externalAwsCloudwatchMetricsUserConfig")
    def external_aws_cloudwatch_metrics_user_config(self) -> Optional['outputs.GetServiceIntegrationEndpointExternalAwsCloudwatchMetricsUserConfigResult']:
        return pulumi.get(self, "external_aws_cloudwatch_metrics_user_config")

    @property
    @pulumi.getter(name="externalElasticsearchLogsUserConfig")
    def external_elasticsearch_logs_user_config(self) -> Optional['outputs.GetServiceIntegrationEndpointExternalElasticsearchLogsUserConfigResult']:
        return pulumi.get(self, "external_elasticsearch_logs_user_config")

    @property
    @pulumi.getter(name="externalGoogleCloudLoggingUserConfig")
    def external_google_cloud_logging_user_config(self) -> Optional['outputs.GetServiceIntegrationEndpointExternalGoogleCloudLoggingUserConfigResult']:
        return pulumi.get(self, "external_google_cloud_logging_user_config")

    @property
    @pulumi.getter(name="externalKafkaUserConfig")
    def external_kafka_user_config(self) -> Optional['outputs.GetServiceIntegrationEndpointExternalKafkaUserConfigResult']:
        return pulumi.get(self, "external_kafka_user_config")

    @property
    @pulumi.getter(name="externalSchemaRegistryUserConfig")
    def external_schema_registry_user_config(self) -> Optional['outputs.GetServiceIntegrationEndpointExternalSchemaRegistryUserConfigResult']:
        return pulumi.get(self, "external_schema_registry_user_config")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="jolokiaUserConfig")
    def jolokia_user_config(self) -> Optional['outputs.GetServiceIntegrationEndpointJolokiaUserConfigResult']:
        return pulumi.get(self, "jolokia_user_config")

    @property
    @pulumi.getter
    def project(self) -> str:
        return pulumi.get(self, "project")

    @property
    @pulumi.getter(name="prometheusUserConfig")
    def prometheus_user_config(self) -> Optional['outputs.GetServiceIntegrationEndpointPrometheusUserConfigResult']:
        return pulumi.get(self, "prometheus_user_config")

    @property
    @pulumi.getter(name="rsyslogUserConfig")
    def rsyslog_user_config(self) -> Optional['outputs.GetServiceIntegrationEndpointRsyslogUserConfigResult']:
        return pulumi.get(self, "rsyslog_user_config")

    @property
    @pulumi.getter(name="signalfxUserConfig")
    def signalfx_user_config(self) -> Optional['outputs.GetServiceIntegrationEndpointSignalfxUserConfigResult']:
        return pulumi.get(self, "signalfx_user_config")


class AwaitableGetServiceIntegrationEndpointResult(GetServiceIntegrationEndpointResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetServiceIntegrationEndpointResult(
            datadog_user_config=self.datadog_user_config,
            endpoint_config=self.endpoint_config,
            endpoint_name=self.endpoint_name,
            endpoint_type=self.endpoint_type,
            external_aws_cloudwatch_logs_user_config=self.external_aws_cloudwatch_logs_user_config,
            external_aws_cloudwatch_metrics_user_config=self.external_aws_cloudwatch_metrics_user_config,
            external_elasticsearch_logs_user_config=self.external_elasticsearch_logs_user_config,
            external_google_cloud_logging_user_config=self.external_google_cloud_logging_user_config,
            external_kafka_user_config=self.external_kafka_user_config,
            external_schema_registry_user_config=self.external_schema_registry_user_config,
            id=self.id,
            jolokia_user_config=self.jolokia_user_config,
            project=self.project,
            prometheus_user_config=self.prometheus_user_config,
            rsyslog_user_config=self.rsyslog_user_config,
            signalfx_user_config=self.signalfx_user_config)


def get_service_integration_endpoint(datadog_user_config: Optional[pulumi.InputType['GetServiceIntegrationEndpointDatadogUserConfigArgs']] = None,
                                     endpoint_config: Optional[Mapping[str, str]] = None,
                                     endpoint_name: Optional[str] = None,
                                     endpoint_type: Optional[str] = None,
                                     external_aws_cloudwatch_logs_user_config: Optional[pulumi.InputType['GetServiceIntegrationEndpointExternalAwsCloudwatchLogsUserConfigArgs']] = None,
                                     external_aws_cloudwatch_metrics_user_config: Optional[pulumi.InputType['GetServiceIntegrationEndpointExternalAwsCloudwatchMetricsUserConfigArgs']] = None,
                                     external_elasticsearch_logs_user_config: Optional[pulumi.InputType['GetServiceIntegrationEndpointExternalElasticsearchLogsUserConfigArgs']] = None,
                                     external_google_cloud_logging_user_config: Optional[pulumi.InputType['GetServiceIntegrationEndpointExternalGoogleCloudLoggingUserConfigArgs']] = None,
                                     external_kafka_user_config: Optional[pulumi.InputType['GetServiceIntegrationEndpointExternalKafkaUserConfigArgs']] = None,
                                     external_schema_registry_user_config: Optional[pulumi.InputType['GetServiceIntegrationEndpointExternalSchemaRegistryUserConfigArgs']] = None,
                                     jolokia_user_config: Optional[pulumi.InputType['GetServiceIntegrationEndpointJolokiaUserConfigArgs']] = None,
                                     project: Optional[str] = None,
                                     prometheus_user_config: Optional[pulumi.InputType['GetServiceIntegrationEndpointPrometheusUserConfigArgs']] = None,
                                     rsyslog_user_config: Optional[pulumi.InputType['GetServiceIntegrationEndpointRsyslogUserConfigArgs']] = None,
                                     signalfx_user_config: Optional[pulumi.InputType['GetServiceIntegrationEndpointSignalfxUserConfigArgs']] = None,
                                     opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetServiceIntegrationEndpointResult:
    """
    ## # Service Integration Endpoint Data Source

    The Service Integration Endpoint data source provides information about the existing
    Aiven Service Integration Endpoint.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_aiven as aiven

    myendpoint = aiven.get_service_integration_endpoint(project=aiven_project["myproject"]["project"],
        endpoint_name="<ENDPOINT_NAME>")
    ```


    :param str endpoint_name: is the name of the endpoint. This value has no effect beyond being used
           to identify different integration endpoints.
    :param str endpoint_type: is the type of the external service this endpoint is associated with.
           By the time of writing the only available option is `datadog`.
    :param str project: defines the project the endpoint is associated with.
    """
    __args__ = dict()
    __args__['datadogUserConfig'] = datadog_user_config
    __args__['endpointConfig'] = endpoint_config
    __args__['endpointName'] = endpoint_name
    __args__['endpointType'] = endpoint_type
    __args__['externalAwsCloudwatchLogsUserConfig'] = external_aws_cloudwatch_logs_user_config
    __args__['externalAwsCloudwatchMetricsUserConfig'] = external_aws_cloudwatch_metrics_user_config
    __args__['externalElasticsearchLogsUserConfig'] = external_elasticsearch_logs_user_config
    __args__['externalGoogleCloudLoggingUserConfig'] = external_google_cloud_logging_user_config
    __args__['externalKafkaUserConfig'] = external_kafka_user_config
    __args__['externalSchemaRegistryUserConfig'] = external_schema_registry_user_config
    __args__['jolokiaUserConfig'] = jolokia_user_config
    __args__['project'] = project
    __args__['prometheusUserConfig'] = prometheus_user_config
    __args__['rsyslogUserConfig'] = rsyslog_user_config
    __args__['signalfxUserConfig'] = signalfx_user_config
    if opts is None:
        opts = pulumi.InvokeOptions()
    if opts.version is None:
        opts.version = _utilities.get_version()
    __ret__ = pulumi.runtime.invoke('aiven:index/getServiceIntegrationEndpoint:getServiceIntegrationEndpoint', __args__, opts=opts, typ=GetServiceIntegrationEndpointResult).value

    return AwaitableGetServiceIntegrationEndpointResult(
        datadog_user_config=__ret__.datadog_user_config,
        endpoint_config=__ret__.endpoint_config,
        endpoint_name=__ret__.endpoint_name,
        endpoint_type=__ret__.endpoint_type,
        external_aws_cloudwatch_logs_user_config=__ret__.external_aws_cloudwatch_logs_user_config,
        external_aws_cloudwatch_metrics_user_config=__ret__.external_aws_cloudwatch_metrics_user_config,
        external_elasticsearch_logs_user_config=__ret__.external_elasticsearch_logs_user_config,
        external_google_cloud_logging_user_config=__ret__.external_google_cloud_logging_user_config,
        external_kafka_user_config=__ret__.external_kafka_user_config,
        external_schema_registry_user_config=__ret__.external_schema_registry_user_config,
        id=__ret__.id,
        jolokia_user_config=__ret__.jolokia_user_config,
        project=__ret__.project,
        prometheus_user_config=__ret__.prometheus_user_config,
        rsyslog_user_config=__ret__.rsyslog_user_config,
        signalfx_user_config=__ret__.signalfx_user_config)
