# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities
from . import outputs
from ._inputs import *

__all__ = ['OrganizationPermissionArgs', 'OrganizationPermission']

@pulumi.input_type
class OrganizationPermissionArgs:
    def __init__(__self__, *,
                 organization_id: pulumi.Input[str],
                 permissions: pulumi.Input[Sequence[pulumi.Input['OrganizationPermissionPermissionArgs']]],
                 resource_id: pulumi.Input[str],
                 resource_type: pulumi.Input[str]):
        """
        The set of arguments for constructing a OrganizationPermission resource.
        :param pulumi.Input[str] organization_id: Organization ID
        :param pulumi.Input[Sequence[pulumi.Input['OrganizationPermissionPermissionArgs']]] permissions: A permission to set
        :param pulumi.Input[str] resource_id: Resource Id.
        :param pulumi.Input[str] resource_type: Resource type. The possible values are `project`.
        """
        pulumi.set(__self__, "organization_id", organization_id)
        pulumi.set(__self__, "permissions", permissions)
        pulumi.set(__self__, "resource_id", resource_id)
        pulumi.set(__self__, "resource_type", resource_type)

    @property
    @pulumi.getter(name="organizationId")
    def organization_id(self) -> pulumi.Input[str]:
        """
        Organization ID
        """
        return pulumi.get(self, "organization_id")

    @organization_id.setter
    def organization_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "organization_id", value)

    @property
    @pulumi.getter
    def permissions(self) -> pulumi.Input[Sequence[pulumi.Input['OrganizationPermissionPermissionArgs']]]:
        """
        A permission to set
        """
        return pulumi.get(self, "permissions")

    @permissions.setter
    def permissions(self, value: pulumi.Input[Sequence[pulumi.Input['OrganizationPermissionPermissionArgs']]]):
        pulumi.set(self, "permissions", value)

    @property
    @pulumi.getter(name="resourceId")
    def resource_id(self) -> pulumi.Input[str]:
        """
        Resource Id.
        """
        return pulumi.get(self, "resource_id")

    @resource_id.setter
    def resource_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "resource_id", value)

    @property
    @pulumi.getter(name="resourceType")
    def resource_type(self) -> pulumi.Input[str]:
        """
        Resource type. The possible values are `project`.
        """
        return pulumi.get(self, "resource_type")

    @resource_type.setter
    def resource_type(self, value: pulumi.Input[str]):
        pulumi.set(self, "resource_type", value)


@pulumi.input_type
class _OrganizationPermissionState:
    def __init__(__self__, *,
                 organization_id: Optional[pulumi.Input[str]] = None,
                 permissions: Optional[pulumi.Input[Sequence[pulumi.Input['OrganizationPermissionPermissionArgs']]]] = None,
                 resource_id: Optional[pulumi.Input[str]] = None,
                 resource_type: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering OrganizationPermission resources.
        :param pulumi.Input[str] organization_id: Organization ID
        :param pulumi.Input[Sequence[pulumi.Input['OrganizationPermissionPermissionArgs']]] permissions: A permission to set
        :param pulumi.Input[str] resource_id: Resource Id.
        :param pulumi.Input[str] resource_type: Resource type. The possible values are `project`.
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
    def organization_id(self) -> Optional[pulumi.Input[str]]:
        """
        Organization ID
        """
        return pulumi.get(self, "organization_id")

    @organization_id.setter
    def organization_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "organization_id", value)

    @property
    @pulumi.getter
    def permissions(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['OrganizationPermissionPermissionArgs']]]]:
        """
        A permission to set
        """
        return pulumi.get(self, "permissions")

    @permissions.setter
    def permissions(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['OrganizationPermissionPermissionArgs']]]]):
        pulumi.set(self, "permissions", value)

    @property
    @pulumi.getter(name="resourceId")
    def resource_id(self) -> Optional[pulumi.Input[str]]:
        """
        Resource Id.
        """
        return pulumi.get(self, "resource_id")

    @resource_id.setter
    def resource_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "resource_id", value)

    @property
    @pulumi.getter(name="resourceType")
    def resource_type(self) -> Optional[pulumi.Input[str]]:
        """
        Resource type. The possible values are `project`.
        """
        return pulumi.get(self, "resource_type")

    @resource_type.setter
    def resource_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "resource_type", value)


class OrganizationPermission(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 organization_id: Optional[pulumi.Input[str]] = None,
                 permissions: Optional[pulumi.Input[Sequence[pulumi.Input[Union['OrganizationPermissionPermissionArgs', 'OrganizationPermissionPermissionArgsDict']]]]] = None,
                 resource_id: Optional[pulumi.Input[str]] = None,
                 resource_type: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Grants permissions to a principal for a resource.

        **This resource is in the beta stage and may change without notice.** Set
        the `PROVIDER_AIVEN_ENABLE_BETA` environment variable to use the resource.

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] organization_id: Organization ID
        :param pulumi.Input[Sequence[pulumi.Input[Union['OrganizationPermissionPermissionArgs', 'OrganizationPermissionPermissionArgsDict']]]] permissions: A permission to set
        :param pulumi.Input[str] resource_id: Resource Id.
        :param pulumi.Input[str] resource_type: Resource type. The possible values are `project`.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: OrganizationPermissionArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Grants permissions to a principal for a resource.

        **This resource is in the beta stage and may change without notice.** Set
        the `PROVIDER_AIVEN_ENABLE_BETA` environment variable to use the resource.

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
                 organization_id: Optional[pulumi.Input[str]] = None,
                 permissions: Optional[pulumi.Input[Sequence[pulumi.Input[Union['OrganizationPermissionPermissionArgs', 'OrganizationPermissionPermissionArgsDict']]]]] = None,
                 resource_id: Optional[pulumi.Input[str]] = None,
                 resource_type: Optional[pulumi.Input[str]] = None,
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
            organization_id: Optional[pulumi.Input[str]] = None,
            permissions: Optional[pulumi.Input[Sequence[pulumi.Input[Union['OrganizationPermissionPermissionArgs', 'OrganizationPermissionPermissionArgsDict']]]]] = None,
            resource_id: Optional[pulumi.Input[str]] = None,
            resource_type: Optional[pulumi.Input[str]] = None) -> 'OrganizationPermission':
        """
        Get an existing OrganizationPermission resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] organization_id: Organization ID
        :param pulumi.Input[Sequence[pulumi.Input[Union['OrganizationPermissionPermissionArgs', 'OrganizationPermissionPermissionArgsDict']]]] permissions: A permission to set
        :param pulumi.Input[str] resource_id: Resource Id.
        :param pulumi.Input[str] resource_type: Resource type. The possible values are `project`.
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
    def organization_id(self) -> pulumi.Output[str]:
        """
        Organization ID
        """
        return pulumi.get(self, "organization_id")

    @property
    @pulumi.getter
    def permissions(self) -> pulumi.Output[Sequence['outputs.OrganizationPermissionPermission']]:
        """
        A permission to set
        """
        return pulumi.get(self, "permissions")

    @property
    @pulumi.getter(name="resourceId")
    def resource_id(self) -> pulumi.Output[str]:
        """
        Resource Id.
        """
        return pulumi.get(self, "resource_id")

    @property
    @pulumi.getter(name="resourceType")
    def resource_type(self) -> pulumi.Output[str]:
        """
        Resource type. The possible values are `project`.
        """
        return pulumi.get(self, "resource_type")
