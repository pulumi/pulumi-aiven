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

__all__ = ['ClickhouseDatabaseArgs', 'ClickhouseDatabase']

@pulumi.input_type
class ClickhouseDatabaseArgs:
    def __init__(__self__, *,
                 project: pulumi.Input[builtins.str],
                 service_name: pulumi.Input[builtins.str],
                 name: Optional[pulumi.Input[builtins.str]] = None,
                 termination_protection: Optional[pulumi.Input[builtins.bool]] = None):
        """
        The set of arguments for constructing a ClickhouseDatabase resource.
        :param pulumi.Input[builtins.str] project: The name of the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
        :param pulumi.Input[builtins.str] service_name: The name of the service that this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
        :param pulumi.Input[builtins.str] name: The name of the ClickHouse database. Changing this property forces recreation of the resource.
        """
        pulumi.set(__self__, "project", project)
        pulumi.set(__self__, "service_name", service_name)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if termination_protection is not None:
            pulumi.set(__self__, "termination_protection", termination_protection)

    @property
    @pulumi.getter
    def project(self) -> pulumi.Input[builtins.str]:
        """
        The name of the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
        """
        return pulumi.get(self, "project")

    @project.setter
    def project(self, value: pulumi.Input[builtins.str]):
        pulumi.set(self, "project", value)

    @property
    @pulumi.getter(name="serviceName")
    def service_name(self) -> pulumi.Input[builtins.str]:
        """
        The name of the service that this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
        """
        return pulumi.get(self, "service_name")

    @service_name.setter
    def service_name(self, value: pulumi.Input[builtins.str]):
        pulumi.set(self, "service_name", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The name of the ClickHouse database. Changing this property forces recreation of the resource.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="terminationProtection")
    def termination_protection(self) -> Optional[pulumi.Input[builtins.bool]]:
        return pulumi.get(self, "termination_protection")

    @termination_protection.setter
    def termination_protection(self, value: Optional[pulumi.Input[builtins.bool]]):
        pulumi.set(self, "termination_protection", value)


@pulumi.input_type
class _ClickhouseDatabaseState:
    def __init__(__self__, *,
                 name: Optional[pulumi.Input[builtins.str]] = None,
                 project: Optional[pulumi.Input[builtins.str]] = None,
                 service_name: Optional[pulumi.Input[builtins.str]] = None,
                 termination_protection: Optional[pulumi.Input[builtins.bool]] = None):
        """
        Input properties used for looking up and filtering ClickhouseDatabase resources.
        :param pulumi.Input[builtins.str] name: The name of the ClickHouse database. Changing this property forces recreation of the resource.
        :param pulumi.Input[builtins.str] project: The name of the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
        :param pulumi.Input[builtins.str] service_name: The name of the service that this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
        """
        if name is not None:
            pulumi.set(__self__, "name", name)
        if project is not None:
            pulumi.set(__self__, "project", project)
        if service_name is not None:
            pulumi.set(__self__, "service_name", service_name)
        if termination_protection is not None:
            pulumi.set(__self__, "termination_protection", termination_protection)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The name of the ClickHouse database. Changing this property forces recreation of the resource.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def project(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The name of the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
        """
        return pulumi.get(self, "project")

    @project.setter
    def project(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "project", value)

    @property
    @pulumi.getter(name="serviceName")
    def service_name(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The name of the service that this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
        """
        return pulumi.get(self, "service_name")

    @service_name.setter
    def service_name(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "service_name", value)

    @property
    @pulumi.getter(name="terminationProtection")
    def termination_protection(self) -> Optional[pulumi.Input[builtins.bool]]:
        return pulumi.get(self, "termination_protection")

    @termination_protection.setter
    def termination_protection(self, value: Optional[pulumi.Input[builtins.bool]]):
        pulumi.set(self, "termination_protection", value)


@pulumi.type_token("aiven:index/clickhouseDatabase:ClickhouseDatabase")
class ClickhouseDatabase(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 name: Optional[pulumi.Input[builtins.str]] = None,
                 project: Optional[pulumi.Input[builtins.str]] = None,
                 service_name: Optional[pulumi.Input[builtins.str]] = None,
                 termination_protection: Optional[pulumi.Input[builtins.bool]] = None,
                 __props__=None):
        """
        ## Example Usage

        ```python
        import pulumi
        import pulumi_aiven as aiven

        example_clickhouse = aiven.Clickhouse("example_clickhouse",
            project=example_project["project"],
            cloud_name="google-europe-west1",
            plan="business-4",
            service_name="example-clickhouse-service",
            maintenance_window_dow="monday",
            maintenance_window_time="10:00:00")
        example_db = aiven.ClickhouseDatabase("example_db",
            project=example_project["project"],
            service_name=example_clickhouse.service_name,
            name="example-database")
        ```

        ## Import

        ```sh
        $ pulumi import aiven:index/clickhouseDatabase:ClickhouseDatabase example_db PROJECT/SERVICE_NAME/DATABASE_NAME
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[builtins.str] name: The name of the ClickHouse database. Changing this property forces recreation of the resource.
        :param pulumi.Input[builtins.str] project: The name of the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
        :param pulumi.Input[builtins.str] service_name: The name of the service that this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ClickhouseDatabaseArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Example Usage

        ```python
        import pulumi
        import pulumi_aiven as aiven

        example_clickhouse = aiven.Clickhouse("example_clickhouse",
            project=example_project["project"],
            cloud_name="google-europe-west1",
            plan="business-4",
            service_name="example-clickhouse-service",
            maintenance_window_dow="monday",
            maintenance_window_time="10:00:00")
        example_db = aiven.ClickhouseDatabase("example_db",
            project=example_project["project"],
            service_name=example_clickhouse.service_name,
            name="example-database")
        ```

        ## Import

        ```sh
        $ pulumi import aiven:index/clickhouseDatabase:ClickhouseDatabase example_db PROJECT/SERVICE_NAME/DATABASE_NAME
        ```

        :param str resource_name: The name of the resource.
        :param ClickhouseDatabaseArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ClickhouseDatabaseArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 name: Optional[pulumi.Input[builtins.str]] = None,
                 project: Optional[pulumi.Input[builtins.str]] = None,
                 service_name: Optional[pulumi.Input[builtins.str]] = None,
                 termination_protection: Optional[pulumi.Input[builtins.bool]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ClickhouseDatabaseArgs.__new__(ClickhouseDatabaseArgs)

            __props__.__dict__["name"] = name
            if project is None and not opts.urn:
                raise TypeError("Missing required property 'project'")
            __props__.__dict__["project"] = project
            if service_name is None and not opts.urn:
                raise TypeError("Missing required property 'service_name'")
            __props__.__dict__["service_name"] = service_name
            __props__.__dict__["termination_protection"] = termination_protection
        super(ClickhouseDatabase, __self__).__init__(
            'aiven:index/clickhouseDatabase:ClickhouseDatabase',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            name: Optional[pulumi.Input[builtins.str]] = None,
            project: Optional[pulumi.Input[builtins.str]] = None,
            service_name: Optional[pulumi.Input[builtins.str]] = None,
            termination_protection: Optional[pulumi.Input[builtins.bool]] = None) -> 'ClickhouseDatabase':
        """
        Get an existing ClickhouseDatabase resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[builtins.str] name: The name of the ClickHouse database. Changing this property forces recreation of the resource.
        :param pulumi.Input[builtins.str] project: The name of the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
        :param pulumi.Input[builtins.str] service_name: The name of the service that this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ClickhouseDatabaseState.__new__(_ClickhouseDatabaseState)

        __props__.__dict__["name"] = name
        __props__.__dict__["project"] = project
        __props__.__dict__["service_name"] = service_name
        __props__.__dict__["termination_protection"] = termination_protection
        return ClickhouseDatabase(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[builtins.str]:
        """
        The name of the ClickHouse database. Changing this property forces recreation of the resource.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def project(self) -> pulumi.Output[builtins.str]:
        """
        The name of the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
        """
        return pulumi.get(self, "project")

    @property
    @pulumi.getter(name="serviceName")
    def service_name(self) -> pulumi.Output[builtins.str]:
        """
        The name of the service that this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
        """
        return pulumi.get(self, "service_name")

    @property
    @pulumi.getter(name="terminationProtection")
    def termination_protection(self) -> pulumi.Output[Optional[builtins.bool]]:
        return pulumi.get(self, "termination_protection")

