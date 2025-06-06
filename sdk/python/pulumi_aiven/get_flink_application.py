# coding=utf-8
# *** WARNING: this file was generated by pulumi-language-python. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import builtins
import copy
import warnings
import sys
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
if sys.version_info >= (3, 11):
    from typing import NotRequired, TypedDict, TypeAlias
else:
    from typing_extensions import NotRequired, TypedDict, TypeAlias
from . import _utilities

__all__ = [
    'GetFlinkApplicationResult',
    'AwaitableGetFlinkApplicationResult',
    'get_flink_application',
    'get_flink_application_output',
]

@pulumi.output_type
class GetFlinkApplicationResult:
    """
    A collection of values returned by getFlinkApplication.
    """
    def __init__(__self__, application_id=None, created_at=None, created_by=None, id=None, name=None, project=None, service_name=None, updated_at=None, updated_by=None):
        if application_id and not isinstance(application_id, str):
            raise TypeError("Expected argument 'application_id' to be a str")
        pulumi.set(__self__, "application_id", application_id)
        if created_at and not isinstance(created_at, str):
            raise TypeError("Expected argument 'created_at' to be a str")
        pulumi.set(__self__, "created_at", created_at)
        if created_by and not isinstance(created_by, str):
            raise TypeError("Expected argument 'created_by' to be a str")
        pulumi.set(__self__, "created_by", created_by)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if project and not isinstance(project, str):
            raise TypeError("Expected argument 'project' to be a str")
        pulumi.set(__self__, "project", project)
        if service_name and not isinstance(service_name, str):
            raise TypeError("Expected argument 'service_name' to be a str")
        pulumi.set(__self__, "service_name", service_name)
        if updated_at and not isinstance(updated_at, str):
            raise TypeError("Expected argument 'updated_at' to be a str")
        pulumi.set(__self__, "updated_at", updated_at)
        if updated_by and not isinstance(updated_by, str):
            raise TypeError("Expected argument 'updated_by' to be a str")
        pulumi.set(__self__, "updated_by", updated_by)

    @property
    @pulumi.getter(name="applicationId")
    def application_id(self) -> builtins.str:
        """
        Application ID.
        """
        return pulumi.get(self, "application_id")

    @property
    @pulumi.getter(name="createdAt")
    def created_at(self) -> builtins.str:
        """
        Application creation time.
        """
        return pulumi.get(self, "created_at")

    @property
    @pulumi.getter(name="createdBy")
    def created_by(self) -> builtins.str:
        """
        The user who created the application.
        """
        return pulumi.get(self, "created_by")

    @property
    @pulumi.getter
    def id(self) -> builtins.str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def name(self) -> builtins.str:
        """
        The name of the application.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def project(self) -> builtins.str:
        """
        The name of the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
        """
        return pulumi.get(self, "project")

    @property
    @pulumi.getter(name="serviceName")
    def service_name(self) -> builtins.str:
        """
        The name of the service that this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
        """
        return pulumi.get(self, "service_name")

    @property
    @pulumi.getter(name="updatedAt")
    def updated_at(self) -> builtins.str:
        """
        When the application was updated.
        """
        return pulumi.get(self, "updated_at")

    @property
    @pulumi.getter(name="updatedBy")
    def updated_by(self) -> builtins.str:
        """
        The user who updated the application.
        """
        return pulumi.get(self, "updated_by")


class AwaitableGetFlinkApplicationResult(GetFlinkApplicationResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetFlinkApplicationResult(
            application_id=self.application_id,
            created_at=self.created_at,
            created_by=self.created_by,
            id=self.id,
            name=self.name,
            project=self.project,
            service_name=self.service_name,
            updated_at=self.updated_at,
            updated_by=self.updated_by)


def get_flink_application(name: Optional[builtins.str] = None,
                          project: Optional[builtins.str] = None,
                          service_name: Optional[builtins.str] = None,
                          opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetFlinkApplicationResult:
    """
    Gets information about an Aiven for Apache Flink® application.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_aiven as aiven

    example_app = aiven.get_flink_application(project=example_project["project"],
        service_name="example-flink-service",
        name="example-app")
    ```


    :param builtins.str name: The name of the application.
    :param builtins.str project: The name of the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
    :param builtins.str service_name: The name of the service that this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
    """
    __args__ = dict()
    __args__['name'] = name
    __args__['project'] = project
    __args__['serviceName'] = service_name
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('aiven:index/getFlinkApplication:getFlinkApplication', __args__, opts=opts, typ=GetFlinkApplicationResult).value

    return AwaitableGetFlinkApplicationResult(
        application_id=pulumi.get(__ret__, 'application_id'),
        created_at=pulumi.get(__ret__, 'created_at'),
        created_by=pulumi.get(__ret__, 'created_by'),
        id=pulumi.get(__ret__, 'id'),
        name=pulumi.get(__ret__, 'name'),
        project=pulumi.get(__ret__, 'project'),
        service_name=pulumi.get(__ret__, 'service_name'),
        updated_at=pulumi.get(__ret__, 'updated_at'),
        updated_by=pulumi.get(__ret__, 'updated_by'))
def get_flink_application_output(name: Optional[pulumi.Input[builtins.str]] = None,
                                 project: Optional[pulumi.Input[builtins.str]] = None,
                                 service_name: Optional[pulumi.Input[builtins.str]] = None,
                                 opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetFlinkApplicationResult]:
    """
    Gets information about an Aiven for Apache Flink® application.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_aiven as aiven

    example_app = aiven.get_flink_application(project=example_project["project"],
        service_name="example-flink-service",
        name="example-app")
    ```


    :param builtins.str name: The name of the application.
    :param builtins.str project: The name of the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
    :param builtins.str service_name: The name of the service that this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
    """
    __args__ = dict()
    __args__['name'] = name
    __args__['project'] = project
    __args__['serviceName'] = service_name
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('aiven:index/getFlinkApplication:getFlinkApplication', __args__, opts=opts, typ=GetFlinkApplicationResult)
    return __ret__.apply(lambda __response__: GetFlinkApplicationResult(
        application_id=pulumi.get(__response__, 'application_id'),
        created_at=pulumi.get(__response__, 'created_at'),
        created_by=pulumi.get(__response__, 'created_by'),
        id=pulumi.get(__response__, 'id'),
        name=pulumi.get(__response__, 'name'),
        project=pulumi.get(__response__, 'project'),
        service_name=pulumi.get(__response__, 'service_name'),
        updated_at=pulumi.get(__response__, 'updated_at'),
        updated_by=pulumi.get(__response__, 'updated_by')))
