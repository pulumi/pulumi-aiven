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
from . import outputs

__all__ = [
    'GetOrganizationUserListResult',
    'AwaitableGetOrganizationUserListResult',
    'get_organization_user_list',
    'get_organization_user_list_output',
]

@pulumi.output_type
class GetOrganizationUserListResult:
    """
    A collection of values returned by getOrganizationUserList.
    """
    def __init__(__self__, id=None, name=None, users=None):
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if users and not isinstance(users, list):
            raise TypeError("Expected argument 'users' to be a list")
        pulumi.set(__self__, "users", users)

    @property
    @pulumi.getter
    def id(self) -> Optional[builtins.str]:
        """
        The ID of the organization.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def name(self) -> Optional[builtins.str]:
        """
        The name of the organization.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def users(self) -> Sequence['outputs.GetOrganizationUserListUserResult']:
        """
        List of the users, their profile information, and other data.
        """
        return pulumi.get(self, "users")


class AwaitableGetOrganizationUserListResult(GetOrganizationUserListResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetOrganizationUserListResult(
            id=self.id,
            name=self.name,
            users=self.users)


def get_organization_user_list(id: Optional[builtins.str] = None,
                               name: Optional[builtins.str] = None,
                               opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetOrganizationUserListResult:
    """
    Returns a list of [users in the organization](https://aiven.io/docs/platform/concepts/user-access-management), their profile details, and other data . This includes users you add to your organization and application users.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_aiven as aiven

    users = aiven.get_organization_user_list(name="Example organization")
    ```


    :param builtins.str id: The ID of the organization.
    :param builtins.str name: The name of the organization.
    """
    __args__ = dict()
    __args__['id'] = id
    __args__['name'] = name
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('aiven:index/getOrganizationUserList:getOrganizationUserList', __args__, opts=opts, typ=GetOrganizationUserListResult).value

    return AwaitableGetOrganizationUserListResult(
        id=pulumi.get(__ret__, 'id'),
        name=pulumi.get(__ret__, 'name'),
        users=pulumi.get(__ret__, 'users'))
def get_organization_user_list_output(id: Optional[pulumi.Input[Optional[builtins.str]]] = None,
                                      name: Optional[pulumi.Input[Optional[builtins.str]]] = None,
                                      opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetOrganizationUserListResult]:
    """
    Returns a list of [users in the organization](https://aiven.io/docs/platform/concepts/user-access-management), their profile details, and other data . This includes users you add to your organization and application users.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_aiven as aiven

    users = aiven.get_organization_user_list(name="Example organization")
    ```


    :param builtins.str id: The ID of the organization.
    :param builtins.str name: The name of the organization.
    """
    __args__ = dict()
    __args__['id'] = id
    __args__['name'] = name
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('aiven:index/getOrganizationUserList:getOrganizationUserList', __args__, opts=opts, typ=GetOrganizationUserListResult)
    return __ret__.apply(lambda __response__: GetOrganizationUserListResult(
        id=pulumi.get(__response__, 'id'),
        name=pulumi.get(__response__, 'name'),
        users=pulumi.get(__response__, 'users')))
