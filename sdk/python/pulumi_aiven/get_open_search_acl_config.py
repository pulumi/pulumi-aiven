# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = [
    'GetOpenSearchAclConfigResult',
    'AwaitableGetOpenSearchAclConfigResult',
    'get_open_search_acl_config',
    'get_open_search_acl_config_output',
]

@pulumi.output_type
class GetOpenSearchAclConfigResult:
    """
    A collection of values returned by getOpenSearchAclConfig.
    """
    def __init__(__self__, enabled=None, extended_acl=None, id=None, project=None, service_name=None):
        if enabled and not isinstance(enabled, bool):
            raise TypeError("Expected argument 'enabled' to be a bool")
        pulumi.set(__self__, "enabled", enabled)
        if extended_acl and not isinstance(extended_acl, bool):
            raise TypeError("Expected argument 'extended_acl' to be a bool")
        pulumi.set(__self__, "extended_acl", extended_acl)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if project and not isinstance(project, str):
            raise TypeError("Expected argument 'project' to be a str")
        pulumi.set(__self__, "project", project)
        if service_name and not isinstance(service_name, str):
            raise TypeError("Expected argument 'service_name' to be a str")
        pulumi.set(__self__, "service_name", service_name)

    @property
    @pulumi.getter
    def enabled(self) -> Optional[bool]:
        return pulumi.get(self, "enabled")

    @property
    @pulumi.getter(name="extendedAcl")
    def extended_acl(self) -> Optional[bool]:
        return pulumi.get(self, "extended_acl")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def project(self) -> str:
        return pulumi.get(self, "project")

    @property
    @pulumi.getter(name="serviceName")
    def service_name(self) -> str:
        return pulumi.get(self, "service_name")


class AwaitableGetOpenSearchAclConfigResult(GetOpenSearchAclConfigResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetOpenSearchAclConfigResult(
            enabled=self.enabled,
            extended_acl=self.extended_acl,
            id=self.id,
            project=self.project,
            service_name=self.service_name)


def get_open_search_acl_config(enabled: Optional[bool] = None,
                               extended_acl: Optional[bool] = None,
                               project: Optional[str] = None,
                               service_name: Optional[str] = None,
                               opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetOpenSearchAclConfigResult:
    """
    Use this data source to access information about an existing resource.
    """
    __args__ = dict()
    __args__['enabled'] = enabled
    __args__['extendedAcl'] = extended_acl
    __args__['project'] = project
    __args__['serviceName'] = service_name
    if opts is None:
        opts = pulumi.InvokeOptions()
    if opts.version is None:
        opts.version = _utilities.get_version()
    __ret__ = pulumi.runtime.invoke('aiven:index/getOpenSearchAclConfig:getOpenSearchAclConfig', __args__, opts=opts, typ=GetOpenSearchAclConfigResult).value

    return AwaitableGetOpenSearchAclConfigResult(
        enabled=__ret__.enabled,
        extended_acl=__ret__.extended_acl,
        id=__ret__.id,
        project=__ret__.project,
        service_name=__ret__.service_name)


@_utilities.lift_output_func(get_open_search_acl_config)
def get_open_search_acl_config_output(enabled: Optional[pulumi.Input[Optional[bool]]] = None,
                                      extended_acl: Optional[pulumi.Input[Optional[bool]]] = None,
                                      project: Optional[pulumi.Input[str]] = None,
                                      service_name: Optional[pulumi.Input[str]] = None,
                                      opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetOpenSearchAclConfigResult]:
    """
    Use this data source to access information about an existing resource.
    """
    ...