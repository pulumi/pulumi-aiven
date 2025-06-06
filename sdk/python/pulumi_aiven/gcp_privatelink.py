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

__all__ = ['GcpPrivatelinkArgs', 'GcpPrivatelink']

@pulumi.input_type
class GcpPrivatelinkArgs:
    def __init__(__self__, *,
                 project: pulumi.Input[builtins.str],
                 service_name: pulumi.Input[builtins.str]):
        """
        The set of arguments for constructing a GcpPrivatelink resource.
        :param pulumi.Input[builtins.str] project: The name of the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
        :param pulumi.Input[builtins.str] service_name: The name of the service that this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
        """
        pulumi.set(__self__, "project", project)
        pulumi.set(__self__, "service_name", service_name)

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


@pulumi.input_type
class _GcpPrivatelinkState:
    def __init__(__self__, *,
                 google_service_attachment: Optional[pulumi.Input[builtins.str]] = None,
                 message: Optional[pulumi.Input[builtins.str]] = None,
                 project: Optional[pulumi.Input[builtins.str]] = None,
                 service_name: Optional[pulumi.Input[builtins.str]] = None,
                 state: Optional[pulumi.Input[builtins.str]] = None):
        """
        Input properties used for looking up and filtering GcpPrivatelink resources.
        :param pulumi.Input[builtins.str] google_service_attachment: Google Private Service Connect service attachment.
        :param pulumi.Input[builtins.str] message: Printable result of the Google Cloud Private Service Connect request.
        :param pulumi.Input[builtins.str] project: The name of the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
        :param pulumi.Input[builtins.str] service_name: The name of the service that this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
        :param pulumi.Input[builtins.str] state: The state of the Private Service Connect resource.
        """
        if google_service_attachment is not None:
            pulumi.set(__self__, "google_service_attachment", google_service_attachment)
        if message is not None:
            pulumi.set(__self__, "message", message)
        if project is not None:
            pulumi.set(__self__, "project", project)
        if service_name is not None:
            pulumi.set(__self__, "service_name", service_name)
        if state is not None:
            pulumi.set(__self__, "state", state)

    @property
    @pulumi.getter(name="googleServiceAttachment")
    def google_service_attachment(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        Google Private Service Connect service attachment.
        """
        return pulumi.get(self, "google_service_attachment")

    @google_service_attachment.setter
    def google_service_attachment(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "google_service_attachment", value)

    @property
    @pulumi.getter
    def message(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        Printable result of the Google Cloud Private Service Connect request.
        """
        return pulumi.get(self, "message")

    @message.setter
    def message(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "message", value)

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
    @pulumi.getter
    def state(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The state of the Private Service Connect resource.
        """
        return pulumi.get(self, "state")

    @state.setter
    def state(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "state", value)


@pulumi.type_token("aiven:index/gcpPrivatelink:GcpPrivatelink")
class GcpPrivatelink(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 project: Optional[pulumi.Input[builtins.str]] = None,
                 service_name: Optional[pulumi.Input[builtins.str]] = None,
                 __props__=None):
        """
        Creates and manages a Google Private Service Connect for an Aiven service in a VPC.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aiven as aiven

        main = aiven.GcpPrivatelink("main",
            project=example_project["project"],
            service_name=example_kafka["serviceName"])
        ```

        ## Import

        ```sh
        $ pulumi import aiven:index/gcpPrivatelink:GcpPrivatelink main PROJECT/SERVICE_NAME
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[builtins.str] project: The name of the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
        :param pulumi.Input[builtins.str] service_name: The name of the service that this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: GcpPrivatelinkArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Creates and manages a Google Private Service Connect for an Aiven service in a VPC.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aiven as aiven

        main = aiven.GcpPrivatelink("main",
            project=example_project["project"],
            service_name=example_kafka["serviceName"])
        ```

        ## Import

        ```sh
        $ pulumi import aiven:index/gcpPrivatelink:GcpPrivatelink main PROJECT/SERVICE_NAME
        ```

        :param str resource_name: The name of the resource.
        :param GcpPrivatelinkArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(GcpPrivatelinkArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 project: Optional[pulumi.Input[builtins.str]] = None,
                 service_name: Optional[pulumi.Input[builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = GcpPrivatelinkArgs.__new__(GcpPrivatelinkArgs)

            if project is None and not opts.urn:
                raise TypeError("Missing required property 'project'")
            __props__.__dict__["project"] = project
            if service_name is None and not opts.urn:
                raise TypeError("Missing required property 'service_name'")
            __props__.__dict__["service_name"] = service_name
            __props__.__dict__["google_service_attachment"] = None
            __props__.__dict__["message"] = None
            __props__.__dict__["state"] = None
        super(GcpPrivatelink, __self__).__init__(
            'aiven:index/gcpPrivatelink:GcpPrivatelink',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            google_service_attachment: Optional[pulumi.Input[builtins.str]] = None,
            message: Optional[pulumi.Input[builtins.str]] = None,
            project: Optional[pulumi.Input[builtins.str]] = None,
            service_name: Optional[pulumi.Input[builtins.str]] = None,
            state: Optional[pulumi.Input[builtins.str]] = None) -> 'GcpPrivatelink':
        """
        Get an existing GcpPrivatelink resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[builtins.str] google_service_attachment: Google Private Service Connect service attachment.
        :param pulumi.Input[builtins.str] message: Printable result of the Google Cloud Private Service Connect request.
        :param pulumi.Input[builtins.str] project: The name of the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
        :param pulumi.Input[builtins.str] service_name: The name of the service that this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
        :param pulumi.Input[builtins.str] state: The state of the Private Service Connect resource.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _GcpPrivatelinkState.__new__(_GcpPrivatelinkState)

        __props__.__dict__["google_service_attachment"] = google_service_attachment
        __props__.__dict__["message"] = message
        __props__.__dict__["project"] = project
        __props__.__dict__["service_name"] = service_name
        __props__.__dict__["state"] = state
        return GcpPrivatelink(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="googleServiceAttachment")
    def google_service_attachment(self) -> pulumi.Output[builtins.str]:
        """
        Google Private Service Connect service attachment.
        """
        return pulumi.get(self, "google_service_attachment")

    @property
    @pulumi.getter
    def message(self) -> pulumi.Output[builtins.str]:
        """
        Printable result of the Google Cloud Private Service Connect request.
        """
        return pulumi.get(self, "message")

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
    @pulumi.getter
    def state(self) -> pulumi.Output[builtins.str]:
        """
        The state of the Private Service Connect resource.
        """
        return pulumi.get(self, "state")

