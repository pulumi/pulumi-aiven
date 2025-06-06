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
from ._inputs import *

__all__ = ['OrganizationPermissionArgs', 'OrganizationPermission']

@pulumi.input_type
class OrganizationPermissionArgs:
    def __init__(__self__, *,
                 organization_id: pulumi.Input[builtins.str],
                 permissions: pulumi.Input[Sequence[pulumi.Input['OrganizationPermissionPermissionArgs']]],
                 resource_id: pulumi.Input[builtins.str],
                 resource_type: pulumi.Input[builtins.str]):
        """
        The set of arguments for constructing a OrganizationPermission resource.
        :param pulumi.Input[builtins.str] organization_id: Organization ID.
        :param pulumi.Input[Sequence[pulumi.Input['OrganizationPermissionPermissionArgs']]] permissions: Permissions to grant to principals.
        :param pulumi.Input[builtins.str] resource_id: Resource ID.
        :param pulumi.Input[builtins.str] resource_type: Resource type. The possible values are `organization`, `organization_unit` and `project`.
        """
        pulumi.set(__self__, "organization_id", organization_id)
        pulumi.set(__self__, "permissions", permissions)
        pulumi.set(__self__, "resource_id", resource_id)
        pulumi.set(__self__, "resource_type", resource_type)

    @property
    @pulumi.getter(name="organizationId")
    def organization_id(self) -> pulumi.Input[builtins.str]:
        """
        Organization ID.
        """
        return pulumi.get(self, "organization_id")

    @organization_id.setter
    def organization_id(self, value: pulumi.Input[builtins.str]):
        pulumi.set(self, "organization_id", value)

    @property
    @pulumi.getter
    def permissions(self) -> pulumi.Input[Sequence[pulumi.Input['OrganizationPermissionPermissionArgs']]]:
        """
        Permissions to grant to principals.
        """
        return pulumi.get(self, "permissions")

    @permissions.setter
    def permissions(self, value: pulumi.Input[Sequence[pulumi.Input['OrganizationPermissionPermissionArgs']]]):
        pulumi.set(self, "permissions", value)

    @property
    @pulumi.getter(name="resourceId")
    def resource_id(self) -> pulumi.Input[builtins.str]:
        """
        Resource ID.
        """
        return pulumi.get(self, "resource_id")

    @resource_id.setter
    def resource_id(self, value: pulumi.Input[builtins.str]):
        pulumi.set(self, "resource_id", value)

    @property
    @pulumi.getter(name="resourceType")
    def resource_type(self) -> pulumi.Input[builtins.str]:
        """
        Resource type. The possible values are `organization`, `organization_unit` and `project`.
        """
        return pulumi.get(self, "resource_type")

    @resource_type.setter
    def resource_type(self, value: pulumi.Input[builtins.str]):
        pulumi.set(self, "resource_type", value)


@pulumi.input_type
class _OrganizationPermissionState:
    def __init__(__self__, *,
                 organization_id: Optional[pulumi.Input[builtins.str]] = None,
                 permissions: Optional[pulumi.Input[Sequence[pulumi.Input['OrganizationPermissionPermissionArgs']]]] = None,
                 resource_id: Optional[pulumi.Input[builtins.str]] = None,
                 resource_type: Optional[pulumi.Input[builtins.str]] = None):
        """
        Input properties used for looking up and filtering OrganizationPermission resources.
        :param pulumi.Input[builtins.str] organization_id: Organization ID.
        :param pulumi.Input[Sequence[pulumi.Input['OrganizationPermissionPermissionArgs']]] permissions: Permissions to grant to principals.
        :param pulumi.Input[builtins.str] resource_id: Resource ID.
        :param pulumi.Input[builtins.str] resource_type: Resource type. The possible values are `organization`, `organization_unit` and `project`.
        """
        if organization_id is not None:
            pulumi.set(__self__, "organization_id", organization_id)
        if permissions is not None:
            pulumi.set(__self__, "permissions", permissions)
        if resource_id is not None:
            pulumi.set(__self__, "resource_id", resource_id)
        if resource_type is not None:
            pulumi.set(__self__, "resource_type", resource_type)

    @property
    @pulumi.getter(name="organizationId")
    def organization_id(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        Organization ID.
        """
        return pulumi.get(self, "organization_id")

    @organization_id.setter
    def organization_id(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "organization_id", value)

    @property
    @pulumi.getter
    def permissions(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['OrganizationPermissionPermissionArgs']]]]:
        """
        Permissions to grant to principals.
        """
        return pulumi.get(self, "permissions")

    @permissions.setter
    def permissions(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['OrganizationPermissionPermissionArgs']]]]):
        pulumi.set(self, "permissions", value)

    @property
    @pulumi.getter(name="resourceId")
    def resource_id(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        Resource ID.
        """
        return pulumi.get(self, "resource_id")

    @resource_id.setter
    def resource_id(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "resource_id", value)

    @property
    @pulumi.getter(name="resourceType")
    def resource_type(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        Resource type. The possible values are `organization`, `organization_unit` and `project`.
        """
        return pulumi.get(self, "resource_type")

    @resource_type.setter
    def resource_type(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "resource_type", value)


@pulumi.type_token("aiven:index/organizationPermission:OrganizationPermission")
class OrganizationPermission(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 organization_id: Optional[pulumi.Input[builtins.str]] = None,
                 permissions: Optional[pulumi.Input[Sequence[pulumi.Input[Union['OrganizationPermissionPermissionArgs', 'OrganizationPermissionPermissionArgsDict']]]]] = None,
                 resource_id: Optional[pulumi.Input[builtins.str]] = None,
                 resource_type: Optional[pulumi.Input[builtins.str]] = None,
                 __props__=None):
        """
        ## Example Usage

        ```python
        import pulumi
        import pulumi_aiven as aiven

        # Grant access to a specific project
        example_project_permissions = aiven.OrganizationPermission("example_project_permissions",
            organization_id=main["id"],
            resource_id=example_project["project"],
            resource_type="project",
            permissions=[
                {
                    "permissions": [
                        "operator",
                        "service:logs:read",
                    ],
                    "principal_id": "u123a456b7890c",
                    "principal_type": "user",
                },
                {
                    "permissions": [
                        "project:integrations:write",
                        "developer",
                    ],
                    "principal_id": example_group["groupId"],
                    "principal_type": "user_group",
                },
            ])
        # Organization-level permissions
        example_org_permissions = aiven.OrganizationPermission("example_org_permissions",
            organization_id=main["id"],
            resource_id=main["id"],
            resource_type="organization",
            permissions=[
                {
                    "permissions": [
                        "organization:app_users:write",
                        "project:audit_logs:read",
                    ],
                    "principal_id": "u123a456b7890c",
                    "principal_type": "user",
                },
                {
                    "permissions": [
                        "organization:users:write",
                        "organization:groups:write",
                        "organization:domains:write",
                        "organization:idps:write",
                    ],
                    "principal_id": example_group_aiven_organization_user_group["groupId"],
                    "principal_type": "user_group",
                },
            ])
        ```

        ## Import

        ```sh
        $ pulumi import aiven:index/organizationPermission:OrganizationPermission operator ORGANIZATION_ID/ID
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[builtins.str] organization_id: Organization ID.
        :param pulumi.Input[Sequence[pulumi.Input[Union['OrganizationPermissionPermissionArgs', 'OrganizationPermissionPermissionArgsDict']]]] permissions: Permissions to grant to principals.
        :param pulumi.Input[builtins.str] resource_id: Resource ID.
        :param pulumi.Input[builtins.str] resource_type: Resource type. The possible values are `organization`, `organization_unit` and `project`.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: OrganizationPermissionArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Example Usage

        ```python
        import pulumi
        import pulumi_aiven as aiven

        # Grant access to a specific project
        example_project_permissions = aiven.OrganizationPermission("example_project_permissions",
            organization_id=main["id"],
            resource_id=example_project["project"],
            resource_type="project",
            permissions=[
                {
                    "permissions": [
                        "operator",
                        "service:logs:read",
                    ],
                    "principal_id": "u123a456b7890c",
                    "principal_type": "user",
                },
                {
                    "permissions": [
                        "project:integrations:write",
                        "developer",
                    ],
                    "principal_id": example_group["groupId"],
                    "principal_type": "user_group",
                },
            ])
        # Organization-level permissions
        example_org_permissions = aiven.OrganizationPermission("example_org_permissions",
            organization_id=main["id"],
            resource_id=main["id"],
            resource_type="organization",
            permissions=[
                {
                    "permissions": [
                        "organization:app_users:write",
                        "project:audit_logs:read",
                    ],
                    "principal_id": "u123a456b7890c",
                    "principal_type": "user",
                },
                {
                    "permissions": [
                        "organization:users:write",
                        "organization:groups:write",
                        "organization:domains:write",
                        "organization:idps:write",
                    ],
                    "principal_id": example_group_aiven_organization_user_group["groupId"],
                    "principal_type": "user_group",
                },
            ])
        ```

        ## Import

        ```sh
        $ pulumi import aiven:index/organizationPermission:OrganizationPermission operator ORGANIZATION_ID/ID
        ```

        :param str resource_name: The name of the resource.
        :param OrganizationPermissionArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(OrganizationPermissionArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 organization_id: Optional[pulumi.Input[builtins.str]] = None,
                 permissions: Optional[pulumi.Input[Sequence[pulumi.Input[Union['OrganizationPermissionPermissionArgs', 'OrganizationPermissionPermissionArgsDict']]]]] = None,
                 resource_id: Optional[pulumi.Input[builtins.str]] = None,
                 resource_type: Optional[pulumi.Input[builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = OrganizationPermissionArgs.__new__(OrganizationPermissionArgs)

            if organization_id is None and not opts.urn:
                raise TypeError("Missing required property 'organization_id'")
            __props__.__dict__["organization_id"] = organization_id
            if permissions is None and not opts.urn:
                raise TypeError("Missing required property 'permissions'")
            __props__.__dict__["permissions"] = permissions
            if resource_id is None and not opts.urn:
                raise TypeError("Missing required property 'resource_id'")
            __props__.__dict__["resource_id"] = resource_id
            if resource_type is None and not opts.urn:
                raise TypeError("Missing required property 'resource_type'")
            __props__.__dict__["resource_type"] = resource_type
        super(OrganizationPermission, __self__).__init__(
            'aiven:index/organizationPermission:OrganizationPermission',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            organization_id: Optional[pulumi.Input[builtins.str]] = None,
            permissions: Optional[pulumi.Input[Sequence[pulumi.Input[Union['OrganizationPermissionPermissionArgs', 'OrganizationPermissionPermissionArgsDict']]]]] = None,
            resource_id: Optional[pulumi.Input[builtins.str]] = None,
            resource_type: Optional[pulumi.Input[builtins.str]] = None) -> 'OrganizationPermission':
        """
        Get an existing OrganizationPermission resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[builtins.str] organization_id: Organization ID.
        :param pulumi.Input[Sequence[pulumi.Input[Union['OrganizationPermissionPermissionArgs', 'OrganizationPermissionPermissionArgsDict']]]] permissions: Permissions to grant to principals.
        :param pulumi.Input[builtins.str] resource_id: Resource ID.
        :param pulumi.Input[builtins.str] resource_type: Resource type. The possible values are `organization`, `organization_unit` and `project`.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _OrganizationPermissionState.__new__(_OrganizationPermissionState)

        __props__.__dict__["organization_id"] = organization_id
        __props__.__dict__["permissions"] = permissions
        __props__.__dict__["resource_id"] = resource_id
        __props__.__dict__["resource_type"] = resource_type
        return OrganizationPermission(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="organizationId")
    def organization_id(self) -> pulumi.Output[builtins.str]:
        """
        Organization ID.
        """
        return pulumi.get(self, "organization_id")

    @property
    @pulumi.getter
    def permissions(self) -> pulumi.Output[Sequence['outputs.OrganizationPermissionPermission']]:
        """
        Permissions to grant to principals.
        """
        return pulumi.get(self, "permissions")

    @property
    @pulumi.getter(name="resourceId")
    def resource_id(self) -> pulumi.Output[builtins.str]:
        """
        Resource ID.
        """
        return pulumi.get(self, "resource_id")

    @property
    @pulumi.getter(name="resourceType")
    def resource_type(self) -> pulumi.Output[builtins.str]:
        """
        Resource type. The possible values are `organization`, `organization_unit` and `project`.
        """
        return pulumi.get(self, "resource_type")

