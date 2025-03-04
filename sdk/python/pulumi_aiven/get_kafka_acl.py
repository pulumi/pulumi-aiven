# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

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
    'GetKafkaAclResult',
    'AwaitableGetKafkaAclResult',
    'get_kafka_acl',
    'get_kafka_acl_output',
]

@pulumi.output_type
class GetKafkaAclResult:
    """
    A collection of values returned by getKafkaAcl.
    """
    def __init__(__self__, acl_id=None, id=None, permission=None, project=None, service_name=None, topic=None, username=None):
        if acl_id and not isinstance(acl_id, str):
            raise TypeError("Expected argument 'acl_id' to be a str")
        pulumi.set(__self__, "acl_id", acl_id)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if permission and not isinstance(permission, str):
            raise TypeError("Expected argument 'permission' to be a str")
        pulumi.set(__self__, "permission", permission)
        if project and not isinstance(project, str):
            raise TypeError("Expected argument 'project' to be a str")
        pulumi.set(__self__, "project", project)
        if service_name and not isinstance(service_name, str):
            raise TypeError("Expected argument 'service_name' to be a str")
        pulumi.set(__self__, "service_name", service_name)
        if topic and not isinstance(topic, str):
            raise TypeError("Expected argument 'topic' to be a str")
        pulumi.set(__self__, "topic", topic)
        if username and not isinstance(username, str):
            raise TypeError("Expected argument 'username' to be a str")
        pulumi.set(__self__, "username", username)

    @property
    @pulumi.getter(name="aclId")
    def acl_id(self) -> str:
        """
        Kafka ACL ID.
        """
        return pulumi.get(self, "acl_id")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def permission(self) -> str:
        """
        Permissions to grant. The possible values are `admin`, `read`, `readwrite` and `write`. Changing this property forces recreation of the resource.
        """
        return pulumi.get(self, "permission")

    @property
    @pulumi.getter
    def project(self) -> str:
        """
        The name of the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
        """
        return pulumi.get(self, "project")

    @property
    @pulumi.getter(name="serviceName")
    def service_name(self) -> str:
        """
        The name of the service that this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
        """
        return pulumi.get(self, "service_name")

    @property
    @pulumi.getter
    def topic(self) -> str:
        """
        Topics that the permissions apply to. Changing this property forces recreation of the resource.
        """
        return pulumi.get(self, "topic")

    @property
    @pulumi.getter
    def username(self) -> str:
        """
        Usernames to grant permissions to. Changing this property forces recreation of the resource.
        """
        return pulumi.get(self, "username")


class AwaitableGetKafkaAclResult(GetKafkaAclResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetKafkaAclResult(
            acl_id=self.acl_id,
            id=self.id,
            permission=self.permission,
            project=self.project,
            service_name=self.service_name,
            topic=self.topic,
            username=self.username)


def get_kafka_acl(permission: Optional[str] = None,
                  project: Optional[str] = None,
                  service_name: Optional[str] = None,
                  topic: Optional[str] = None,
                  username: Optional[str] = None,
                  opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetKafkaAclResult:
    """
    Gets information about an ACL entry for an Aiven for Apache Kafka® service.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_aiven as aiven

    example_acl = aiven.get_kafka_acl(project=example_project["project"],
        service_name=example_kafka["serviceName"],
        topic="example-topic",
        permission="admin",
        username="example-user")
    ```


    :param str permission: Permissions to grant. The possible values are `admin`, `read`, `readwrite` and `write`. Changing this property forces recreation of the resource.
    :param str project: The name of the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
    :param str service_name: The name of the service that this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
    :param str topic: Topics that the permissions apply to. Changing this property forces recreation of the resource.
    :param str username: Usernames to grant permissions to. Changing this property forces recreation of the resource.
    """
    __args__ = dict()
    __args__['permission'] = permission
    __args__['project'] = project
    __args__['serviceName'] = service_name
    __args__['topic'] = topic
    __args__['username'] = username
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('aiven:index/getKafkaAcl:getKafkaAcl', __args__, opts=opts, typ=GetKafkaAclResult).value

    return AwaitableGetKafkaAclResult(
        acl_id=pulumi.get(__ret__, 'acl_id'),
        id=pulumi.get(__ret__, 'id'),
        permission=pulumi.get(__ret__, 'permission'),
        project=pulumi.get(__ret__, 'project'),
        service_name=pulumi.get(__ret__, 'service_name'),
        topic=pulumi.get(__ret__, 'topic'),
        username=pulumi.get(__ret__, 'username'))
def get_kafka_acl_output(permission: Optional[pulumi.Input[str]] = None,
                         project: Optional[pulumi.Input[str]] = None,
                         service_name: Optional[pulumi.Input[str]] = None,
                         topic: Optional[pulumi.Input[str]] = None,
                         username: Optional[pulumi.Input[str]] = None,
                         opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetKafkaAclResult]:
    """
    Gets information about an ACL entry for an Aiven for Apache Kafka® service.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_aiven as aiven

    example_acl = aiven.get_kafka_acl(project=example_project["project"],
        service_name=example_kafka["serviceName"],
        topic="example-topic",
        permission="admin",
        username="example-user")
    ```


    :param str permission: Permissions to grant. The possible values are `admin`, `read`, `readwrite` and `write`. Changing this property forces recreation of the resource.
    :param str project: The name of the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
    :param str service_name: The name of the service that this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
    :param str topic: Topics that the permissions apply to. Changing this property forces recreation of the resource.
    :param str username: Usernames to grant permissions to. Changing this property forces recreation of the resource.
    """
    __args__ = dict()
    __args__['permission'] = permission
    __args__['project'] = project
    __args__['serviceName'] = service_name
    __args__['topic'] = topic
    __args__['username'] = username
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('aiven:index/getKafkaAcl:getKafkaAcl', __args__, opts=opts, typ=GetKafkaAclResult)
    return __ret__.apply(lambda __response__: GetKafkaAclResult(
        acl_id=pulumi.get(__response__, 'acl_id'),
        id=pulumi.get(__response__, 'id'),
        permission=pulumi.get(__response__, 'permission'),
        project=pulumi.get(__response__, 'project'),
        service_name=pulumi.get(__response__, 'service_name'),
        topic=pulumi.get(__response__, 'topic'),
        username=pulumi.get(__response__, 'username')))
