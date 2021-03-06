# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['KafkaSchemaConfigurationArgs', 'KafkaSchemaConfiguration']

@pulumi.input_type
class KafkaSchemaConfigurationArgs:
    def __init__(__self__, *,
                 compatibility_level: pulumi.Input[str],
                 project: pulumi.Input[str],
                 service_name: pulumi.Input[str]):
        """
        The set of arguments for constructing a KafkaSchemaConfiguration resource.
        :param pulumi.Input[str] compatibility_level: is the Global Kafka Schema configuration compatibility level when defined 
               for `KafkaSchemaConfiguration` resource. Also, Kafka Schema configuration
               compatibility level can be overridden for a specific subject when used in `KafkaSchema`
               resource. If the compatibility level not specified for the individual subject by default,
               it takes a global value. Allowed values: `BACKWARD`, `BACKWARD_TRANSITIVE`, `FORWARD`,
               `FORWARD_TRANSITIVE`, `FULL`, `FULL_TRANSITIVE`, `NONE`.
        :param pulumi.Input[str] project: and `service_name` - (Required) define the project and service the Kafka Schemas belongs to. 
               They should be defined using reference as shown above to set up dependencies correctly.
        :param pulumi.Input[str] service_name: Service to link the Kafka Schemas Configuration to
        """
        pulumi.set(__self__, "compatibility_level", compatibility_level)
        pulumi.set(__self__, "project", project)
        pulumi.set(__self__, "service_name", service_name)

    @property
    @pulumi.getter(name="compatibilityLevel")
    def compatibility_level(self) -> pulumi.Input[str]:
        """
        is the Global Kafka Schema configuration compatibility level when defined 
        for `KafkaSchemaConfiguration` resource. Also, Kafka Schema configuration
        compatibility level can be overridden for a specific subject when used in `KafkaSchema`
        resource. If the compatibility level not specified for the individual subject by default,
        it takes a global value. Allowed values: `BACKWARD`, `BACKWARD_TRANSITIVE`, `FORWARD`,
        `FORWARD_TRANSITIVE`, `FULL`, `FULL_TRANSITIVE`, `NONE`.
        """
        return pulumi.get(self, "compatibility_level")

    @compatibility_level.setter
    def compatibility_level(self, value: pulumi.Input[str]):
        pulumi.set(self, "compatibility_level", value)

    @property
    @pulumi.getter
    def project(self) -> pulumi.Input[str]:
        """
        and `service_name` - (Required) define the project and service the Kafka Schemas belongs to. 
        They should be defined using reference as shown above to set up dependencies correctly.
        """
        return pulumi.get(self, "project")

    @project.setter
    def project(self, value: pulumi.Input[str]):
        pulumi.set(self, "project", value)

    @property
    @pulumi.getter(name="serviceName")
    def service_name(self) -> pulumi.Input[str]:
        """
        Service to link the Kafka Schemas Configuration to
        """
        return pulumi.get(self, "service_name")

    @service_name.setter
    def service_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "service_name", value)


@pulumi.input_type
class _KafkaSchemaConfigurationState:
    def __init__(__self__, *,
                 compatibility_level: Optional[pulumi.Input[str]] = None,
                 project: Optional[pulumi.Input[str]] = None,
                 service_name: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering KafkaSchemaConfiguration resources.
        :param pulumi.Input[str] compatibility_level: is the Global Kafka Schema configuration compatibility level when defined 
               for `KafkaSchemaConfiguration` resource. Also, Kafka Schema configuration
               compatibility level can be overridden for a specific subject when used in `KafkaSchema`
               resource. If the compatibility level not specified for the individual subject by default,
               it takes a global value. Allowed values: `BACKWARD`, `BACKWARD_TRANSITIVE`, `FORWARD`,
               `FORWARD_TRANSITIVE`, `FULL`, `FULL_TRANSITIVE`, `NONE`.
        :param pulumi.Input[str] project: and `service_name` - (Required) define the project and service the Kafka Schemas belongs to. 
               They should be defined using reference as shown above to set up dependencies correctly.
        :param pulumi.Input[str] service_name: Service to link the Kafka Schemas Configuration to
        """
        if compatibility_level is not None:
            pulumi.set(__self__, "compatibility_level", compatibility_level)
        if project is not None:
            pulumi.set(__self__, "project", project)
        if service_name is not None:
            pulumi.set(__self__, "service_name", service_name)

    @property
    @pulumi.getter(name="compatibilityLevel")
    def compatibility_level(self) -> Optional[pulumi.Input[str]]:
        """
        is the Global Kafka Schema configuration compatibility level when defined 
        for `KafkaSchemaConfiguration` resource. Also, Kafka Schema configuration
        compatibility level can be overridden for a specific subject when used in `KafkaSchema`
        resource. If the compatibility level not specified for the individual subject by default,
        it takes a global value. Allowed values: `BACKWARD`, `BACKWARD_TRANSITIVE`, `FORWARD`,
        `FORWARD_TRANSITIVE`, `FULL`, `FULL_TRANSITIVE`, `NONE`.
        """
        return pulumi.get(self, "compatibility_level")

    @compatibility_level.setter
    def compatibility_level(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "compatibility_level", value)

    @property
    @pulumi.getter
    def project(self) -> Optional[pulumi.Input[str]]:
        """
        and `service_name` - (Required) define the project and service the Kafka Schemas belongs to. 
        They should be defined using reference as shown above to set up dependencies correctly.
        """
        return pulumi.get(self, "project")

    @project.setter
    def project(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "project", value)

    @property
    @pulumi.getter(name="serviceName")
    def service_name(self) -> Optional[pulumi.Input[str]]:
        """
        Service to link the Kafka Schemas Configuration to
        """
        return pulumi.get(self, "service_name")

    @service_name.setter
    def service_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "service_name", value)


class KafkaSchemaConfiguration(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 compatibility_level: Optional[pulumi.Input[str]] = None,
                 project: Optional[pulumi.Input[str]] = None,
                 service_name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        ## # Kafka Schema Configuration Resource

        The Kafka Schema Configuration resource allows the creation and management of Aiven Kafka Schema Configurations.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aiven as aiven

        config = aiven.KafkaSchemaConfiguration("config",
            project=aiven_project["kafka-schemas-project1"]["project"],
            service_name=aiven_kafka["kafka-service1"]["service_name"],
            compatibility_level="BACKWARD")
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] compatibility_level: is the Global Kafka Schema configuration compatibility level when defined 
               for `KafkaSchemaConfiguration` resource. Also, Kafka Schema configuration
               compatibility level can be overridden for a specific subject when used in `KafkaSchema`
               resource. If the compatibility level not specified for the individual subject by default,
               it takes a global value. Allowed values: `BACKWARD`, `BACKWARD_TRANSITIVE`, `FORWARD`,
               `FORWARD_TRANSITIVE`, `FULL`, `FULL_TRANSITIVE`, `NONE`.
        :param pulumi.Input[str] project: and `service_name` - (Required) define the project and service the Kafka Schemas belongs to. 
               They should be defined using reference as shown above to set up dependencies correctly.
        :param pulumi.Input[str] service_name: Service to link the Kafka Schemas Configuration to
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: KafkaSchemaConfigurationArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## # Kafka Schema Configuration Resource

        The Kafka Schema Configuration resource allows the creation and management of Aiven Kafka Schema Configurations.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aiven as aiven

        config = aiven.KafkaSchemaConfiguration("config",
            project=aiven_project["kafka-schemas-project1"]["project"],
            service_name=aiven_kafka["kafka-service1"]["service_name"],
            compatibility_level="BACKWARD")
        ```

        :param str resource_name: The name of the resource.
        :param KafkaSchemaConfigurationArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(KafkaSchemaConfigurationArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 compatibility_level: Optional[pulumi.Input[str]] = None,
                 project: Optional[pulumi.Input[str]] = None,
                 service_name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        if opts is None:
            opts = pulumi.ResourceOptions()
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.version is None:
            opts.version = _utilities.get_version()
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = KafkaSchemaConfigurationArgs.__new__(KafkaSchemaConfigurationArgs)

            if compatibility_level is None and not opts.urn:
                raise TypeError("Missing required property 'compatibility_level'")
            __props__.__dict__["compatibility_level"] = compatibility_level
            if project is None and not opts.urn:
                raise TypeError("Missing required property 'project'")
            __props__.__dict__["project"] = project
            if service_name is None and not opts.urn:
                raise TypeError("Missing required property 'service_name'")
            __props__.__dict__["service_name"] = service_name
        super(KafkaSchemaConfiguration, __self__).__init__(
            'aiven:index/kafkaSchemaConfiguration:KafkaSchemaConfiguration',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            compatibility_level: Optional[pulumi.Input[str]] = None,
            project: Optional[pulumi.Input[str]] = None,
            service_name: Optional[pulumi.Input[str]] = None) -> 'KafkaSchemaConfiguration':
        """
        Get an existing KafkaSchemaConfiguration resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] compatibility_level: is the Global Kafka Schema configuration compatibility level when defined 
               for `KafkaSchemaConfiguration` resource. Also, Kafka Schema configuration
               compatibility level can be overridden for a specific subject when used in `KafkaSchema`
               resource. If the compatibility level not specified for the individual subject by default,
               it takes a global value. Allowed values: `BACKWARD`, `BACKWARD_TRANSITIVE`, `FORWARD`,
               `FORWARD_TRANSITIVE`, `FULL`, `FULL_TRANSITIVE`, `NONE`.
        :param pulumi.Input[str] project: and `service_name` - (Required) define the project and service the Kafka Schemas belongs to. 
               They should be defined using reference as shown above to set up dependencies correctly.
        :param pulumi.Input[str] service_name: Service to link the Kafka Schemas Configuration to
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _KafkaSchemaConfigurationState.__new__(_KafkaSchemaConfigurationState)

        __props__.__dict__["compatibility_level"] = compatibility_level
        __props__.__dict__["project"] = project
        __props__.__dict__["service_name"] = service_name
        return KafkaSchemaConfiguration(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="compatibilityLevel")
    def compatibility_level(self) -> pulumi.Output[str]:
        """
        is the Global Kafka Schema configuration compatibility level when defined 
        for `KafkaSchemaConfiguration` resource. Also, Kafka Schema configuration
        compatibility level can be overridden for a specific subject when used in `KafkaSchema`
        resource. If the compatibility level not specified for the individual subject by default,
        it takes a global value. Allowed values: `BACKWARD`, `BACKWARD_TRANSITIVE`, `FORWARD`,
        `FORWARD_TRANSITIVE`, `FULL`, `FULL_TRANSITIVE`, `NONE`.
        """
        return pulumi.get(self, "compatibility_level")

    @property
    @pulumi.getter
    def project(self) -> pulumi.Output[str]:
        """
        and `service_name` - (Required) define the project and service the Kafka Schemas belongs to. 
        They should be defined using reference as shown above to set up dependencies correctly.
        """
        return pulumi.get(self, "project")

    @property
    @pulumi.getter(name="serviceName")
    def service_name(self) -> pulumi.Output[str]:
        """
        Service to link the Kafka Schemas Configuration to
        """
        return pulumi.get(self, "service_name")

