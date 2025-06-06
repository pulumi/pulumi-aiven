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
    'GetProjectUserResult',
    'AwaitableGetProjectUserResult',
    'get_project_user',
    'get_project_user_output',
]

@pulumi.output_type
class GetProjectUserResult:
    """
    A collection of values returned by getProjectUser.
    """
    def __init__(__self__, accepted=None, email=None, id=None, member_type=None, project=None):
        if accepted and not isinstance(accepted, bool):
            raise TypeError("Expected argument 'accepted' to be a bool")
        pulumi.set(__self__, "accepted", accepted)
        if email and not isinstance(email, str):
            raise TypeError("Expected argument 'email' to be a str")
        pulumi.set(__self__, "email", email)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if member_type and not isinstance(member_type, str):
            raise TypeError("Expected argument 'member_type' to be a str")
        pulumi.set(__self__, "member_type", member_type)
        if project and not isinstance(project, str):
            raise TypeError("Expected argument 'project' to be a str")
        pulumi.set(__self__, "project", project)

    @property
    @pulumi.getter
    def accepted(self) -> builtins.bool:
        """
        Whether the user has accepted the request to join the project. Users get an invite and become project members after accepting the invite.
        """
        return pulumi.get(self, "accepted")

    @property
    @pulumi.getter
    def email(self) -> builtins.str:
        """
        Email address of the user in lowercase. Changing this property forces recreation of the resource.
        """
        return pulumi.get(self, "email")

    @property
    @pulumi.getter
    def id(self) -> builtins.str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="memberType")
    def member_type(self) -> builtins.str:
        """
        Project membership type. The possible values are `admin`, `developer`, `operator`, `organization:app_users:write`, `organization:audit_logs:read`, `organization:billing:read`, `organization:billing:write`, `organization:domains:write`, `organization:groups:write`, `organization:idps:write`, `organization:networking:read`, `organization:networking:write`, `organization:projects:write`, `organization:users:write`, `project:audit_logs:read`, `project:integrations:read`, `project:integrations:write`, `project:networking:read`, `project:networking:write`, `project:permissions:read`, `project:services:read`, `project:services:write`, `read_only`, `role:organization:admin`, `role:services:maintenance`, `role:services:recover`, `service:configuration:write`, `service:data:write`, `service:logs:read`, `service:secrets:read` and `service:users:write`.
        """
        return pulumi.get(self, "member_type")

    @property
    @pulumi.getter
    def project(self) -> builtins.str:
        """
        The name of the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
        """
        return pulumi.get(self, "project")


class AwaitableGetProjectUserResult(GetProjectUserResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetProjectUserResult(
            accepted=self.accepted,
            email=self.email,
            id=self.id,
            member_type=self.member_type,
            project=self.project)


def get_project_user(email: Optional[builtins.str] = None,
                     project: Optional[builtins.str] = None,
                     opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetProjectUserResult:
    """
    The Project User data source provides information about the existing Aiven Project User.

    > **This resource is deprecated**
    Use `OrganizationPermission` instead and
    migrate existing `ProjectUser` resources
    to the new resource. **Do not use the `ProjectUser` and `OrganizationPermission` resources together**.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_aiven as aiven

    mytestuser = aiven.get_project_user(project=myproject["project"],
        email="john.doe@example.com")
    ```


    :param builtins.str email: Email address of the user in lowercase. Changing this property forces recreation of the resource.
    :param builtins.str project: The name of the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
    """
    __args__ = dict()
    __args__['email'] = email
    __args__['project'] = project
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('aiven:index/getProjectUser:getProjectUser', __args__, opts=opts, typ=GetProjectUserResult).value

    return AwaitableGetProjectUserResult(
        accepted=pulumi.get(__ret__, 'accepted'),
        email=pulumi.get(__ret__, 'email'),
        id=pulumi.get(__ret__, 'id'),
        member_type=pulumi.get(__ret__, 'member_type'),
        project=pulumi.get(__ret__, 'project'))
def get_project_user_output(email: Optional[pulumi.Input[builtins.str]] = None,
                            project: Optional[pulumi.Input[builtins.str]] = None,
                            opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetProjectUserResult]:
    """
    The Project User data source provides information about the existing Aiven Project User.

    > **This resource is deprecated**
    Use `OrganizationPermission` instead and
    migrate existing `ProjectUser` resources
    to the new resource. **Do not use the `ProjectUser` and `OrganizationPermission` resources together**.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_aiven as aiven

    mytestuser = aiven.get_project_user(project=myproject["project"],
        email="john.doe@example.com")
    ```


    :param builtins.str email: Email address of the user in lowercase. Changing this property forces recreation of the resource.
    :param builtins.str project: The name of the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
    """
    __args__ = dict()
    __args__['email'] = email
    __args__['project'] = project
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('aiven:index/getProjectUser:getProjectUser', __args__, opts=opts, typ=GetProjectUserResult)
    return __ret__.apply(lambda __response__: GetProjectUserResult(
        accepted=pulumi.get(__response__, 'accepted'),
        email=pulumi.get(__response__, 'email'),
        id=pulumi.get(__response__, 'id'),
        member_type=pulumi.get(__response__, 'member_type'),
        project=pulumi.get(__response__, 'project')))
