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

__all__ = ['KafkaTopicArgs', 'KafkaTopic']

@pulumi.input_type
class KafkaTopicArgs:
    def __init__(__self__, *,
                 partitions: pulumi.Input[builtins.int],
                 project: pulumi.Input[builtins.str],
                 replication: pulumi.Input[builtins.int],
                 service_name: pulumi.Input[builtins.str],
                 topic_name: pulumi.Input[builtins.str],
                 config: Optional[pulumi.Input['KafkaTopicConfigArgs']] = None,
                 owner_user_group_id: Optional[pulumi.Input[builtins.str]] = None,
                 tags: Optional[pulumi.Input[Sequence[pulumi.Input['KafkaTopicTagArgs']]]] = None,
                 termination_protection: Optional[pulumi.Input[builtins.bool]] = None,
                 topic_description: Optional[pulumi.Input[builtins.str]] = None):
        """
        The set of arguments for constructing a KafkaTopic resource.
        :param pulumi.Input[builtins.int] partitions: The number of partitions to create in the topic.
        :param pulumi.Input[builtins.str] project: The name of the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
        :param pulumi.Input[builtins.int] replication: The replication factor for the topic.
        :param pulumi.Input[builtins.str] service_name: The name of the service that this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
        :param pulumi.Input[builtins.str] topic_name: The name of the topic. Changing this property forces recreation of the resource.
        :param pulumi.Input['KafkaTopicConfigArgs'] config: [Advanced parameters](https://aiven.io/docs/products/kafka/reference/advanced-params) to configure topics.
        :param pulumi.Input[builtins.str] owner_user_group_id: The ID of the user group that owns the topic. Assigning ownership to decentralize topic management is part of [Aiven for Apache Kafka® governance](https://aiven.io/docs/products/kafka/concepts/governance-overview).
        :param pulumi.Input[Sequence[pulumi.Input['KafkaTopicTagArgs']]] tags: Tags for the topic.
        :param pulumi.Input[builtins.str] topic_description: The description of the topic
        """
        pulumi.set(__self__, "partitions", partitions)
        pulumi.set(__self__, "project", project)
        pulumi.set(__self__, "replication", replication)
        pulumi.set(__self__, "service_name", service_name)
        pulumi.set(__self__, "topic_name", topic_name)
        if config is not None:
            pulumi.set(__self__, "config", config)
        if owner_user_group_id is not None:
            pulumi.set(__self__, "owner_user_group_id", owner_user_group_id)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)
        if termination_protection is not None:
            pulumi.set(__self__, "termination_protection", termination_protection)
        if topic_description is not None:
            pulumi.set(__self__, "topic_description", topic_description)

    @property
    @pulumi.getter
    def partitions(self) -> pulumi.Input[builtins.int]:
        """
        The number of partitions to create in the topic.
        """
        return pulumi.get(self, "partitions")

    @partitions.setter
    def partitions(self, value: pulumi.Input[builtins.int]):
        pulumi.set(self, "partitions", value)

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
    @pulumi.getter
    def replication(self) -> pulumi.Input[builtins.int]:
        """
        The replication factor for the topic.
        """
        return pulumi.get(self, "replication")

    @replication.setter
    def replication(self, value: pulumi.Input[builtins.int]):
        pulumi.set(self, "replication", value)

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
    @pulumi.getter(name="topicName")
    def topic_name(self) -> pulumi.Input[builtins.str]:
        """
        The name of the topic. Changing this property forces recreation of the resource.
        """
        return pulumi.get(self, "topic_name")

    @topic_name.setter
    def topic_name(self, value: pulumi.Input[builtins.str]):
        pulumi.set(self, "topic_name", value)

    @property
    @pulumi.getter
    def config(self) -> Optional[pulumi.Input['KafkaTopicConfigArgs']]:
        """
        [Advanced parameters](https://aiven.io/docs/products/kafka/reference/advanced-params) to configure topics.
        """
        return pulumi.get(self, "config")

    @config.setter
    def config(self, value: Optional[pulumi.Input['KafkaTopicConfigArgs']]):
        pulumi.set(self, "config", value)

    @property
    @pulumi.getter(name="ownerUserGroupId")
    def owner_user_group_id(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The ID of the user group that owns the topic. Assigning ownership to decentralize topic management is part of [Aiven for Apache Kafka® governance](https://aiven.io/docs/products/kafka/concepts/governance-overview).
        """
        return pulumi.get(self, "owner_user_group_id")

    @owner_user_group_id.setter
    def owner_user_group_id(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "owner_user_group_id", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['KafkaTopicTagArgs']]]]:
        """
        Tags for the topic.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['KafkaTopicTagArgs']]]]):
        pulumi.set(self, "tags", value)

    @property
    @pulumi.getter(name="terminationProtection")
    def termination_protection(self) -> Optional[pulumi.Input[builtins.bool]]:
        return pulumi.get(self, "termination_protection")

    @termination_protection.setter
    def termination_protection(self, value: Optional[pulumi.Input[builtins.bool]]):
        pulumi.set(self, "termination_protection", value)

    @property
    @pulumi.getter(name="topicDescription")
    def topic_description(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The description of the topic
        """
        return pulumi.get(self, "topic_description")

    @topic_description.setter
    def topic_description(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "topic_description", value)


@pulumi.input_type
class _KafkaTopicState:
    def __init__(__self__, *,
                 config: Optional[pulumi.Input['KafkaTopicConfigArgs']] = None,
                 owner_user_group_id: Optional[pulumi.Input[builtins.str]] = None,
                 partitions: Optional[pulumi.Input[builtins.int]] = None,
                 project: Optional[pulumi.Input[builtins.str]] = None,
                 replication: Optional[pulumi.Input[builtins.int]] = None,
                 service_name: Optional[pulumi.Input[builtins.str]] = None,
                 tags: Optional[pulumi.Input[Sequence[pulumi.Input['KafkaTopicTagArgs']]]] = None,
                 termination_protection: Optional[pulumi.Input[builtins.bool]] = None,
                 topic_description: Optional[pulumi.Input[builtins.str]] = None,
                 topic_name: Optional[pulumi.Input[builtins.str]] = None):
        """
        Input properties used for looking up and filtering KafkaTopic resources.
        :param pulumi.Input['KafkaTopicConfigArgs'] config: [Advanced parameters](https://aiven.io/docs/products/kafka/reference/advanced-params) to configure topics.
        :param pulumi.Input[builtins.str] owner_user_group_id: The ID of the user group that owns the topic. Assigning ownership to decentralize topic management is part of [Aiven for Apache Kafka® governance](https://aiven.io/docs/products/kafka/concepts/governance-overview).
        :param pulumi.Input[builtins.int] partitions: The number of partitions to create in the topic.
        :param pulumi.Input[builtins.str] project: The name of the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
        :param pulumi.Input[builtins.int] replication: The replication factor for the topic.
        :param pulumi.Input[builtins.str] service_name: The name of the service that this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
        :param pulumi.Input[Sequence[pulumi.Input['KafkaTopicTagArgs']]] tags: Tags for the topic.
        :param pulumi.Input[builtins.str] topic_description: The description of the topic
        :param pulumi.Input[builtins.str] topic_name: The name of the topic. Changing this property forces recreation of the resource.
        """
        if config is not None:
            pulumi.set(__self__, "config", config)
        if owner_user_group_id is not None:
            pulumi.set(__self__, "owner_user_group_id", owner_user_group_id)
        if partitions is not None:
            pulumi.set(__self__, "partitions", partitions)
        if project is not None:
            pulumi.set(__self__, "project", project)
        if replication is not None:
            pulumi.set(__self__, "replication", replication)
        if service_name is not None:
            pulumi.set(__self__, "service_name", service_name)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)
        if termination_protection is not None:
            pulumi.set(__self__, "termination_protection", termination_protection)
        if topic_description is not None:
            pulumi.set(__self__, "topic_description", topic_description)
        if topic_name is not None:
            pulumi.set(__self__, "topic_name", topic_name)

    @property
    @pulumi.getter
    def config(self) -> Optional[pulumi.Input['KafkaTopicConfigArgs']]:
        """
        [Advanced parameters](https://aiven.io/docs/products/kafka/reference/advanced-params) to configure topics.
        """
        return pulumi.get(self, "config")

    @config.setter
    def config(self, value: Optional[pulumi.Input['KafkaTopicConfigArgs']]):
        pulumi.set(self, "config", value)

    @property
    @pulumi.getter(name="ownerUserGroupId")
    def owner_user_group_id(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The ID of the user group that owns the topic. Assigning ownership to decentralize topic management is part of [Aiven for Apache Kafka® governance](https://aiven.io/docs/products/kafka/concepts/governance-overview).
        """
        return pulumi.get(self, "owner_user_group_id")

    @owner_user_group_id.setter
    def owner_user_group_id(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "owner_user_group_id", value)

    @property
    @pulumi.getter
    def partitions(self) -> Optional[pulumi.Input[builtins.int]]:
        """
        The number of partitions to create in the topic.
        """
        return pulumi.get(self, "partitions")

    @partitions.setter
    def partitions(self, value: Optional[pulumi.Input[builtins.int]]):
        pulumi.set(self, "partitions", value)

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
    @pulumi.getter
    def replication(self) -> Optional[pulumi.Input[builtins.int]]:
        """
        The replication factor for the topic.
        """
        return pulumi.get(self, "replication")

    @replication.setter
    def replication(self, value: Optional[pulumi.Input[builtins.int]]):
        pulumi.set(self, "replication", value)

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
    def tags(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['KafkaTopicTagArgs']]]]:
        """
        Tags for the topic.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['KafkaTopicTagArgs']]]]):
        pulumi.set(self, "tags", value)

    @property
    @pulumi.getter(name="terminationProtection")
    def termination_protection(self) -> Optional[pulumi.Input[builtins.bool]]:
        return pulumi.get(self, "termination_protection")

    @termination_protection.setter
    def termination_protection(self, value: Optional[pulumi.Input[builtins.bool]]):
        pulumi.set(self, "termination_protection", value)

    @property
    @pulumi.getter(name="topicDescription")
    def topic_description(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The description of the topic
        """
        return pulumi.get(self, "topic_description")

    @topic_description.setter
    def topic_description(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "topic_description", value)

    @property
    @pulumi.getter(name="topicName")
    def topic_name(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The name of the topic. Changing this property forces recreation of the resource.
        """
        return pulumi.get(self, "topic_name")

    @topic_name.setter
    def topic_name(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "topic_name", value)


@pulumi.type_token("aiven:index/kafkaTopic:KafkaTopic")
class KafkaTopic(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 config: Optional[pulumi.Input[Union['KafkaTopicConfigArgs', 'KafkaTopicConfigArgsDict']]] = None,
                 owner_user_group_id: Optional[pulumi.Input[builtins.str]] = None,
                 partitions: Optional[pulumi.Input[builtins.int]] = None,
                 project: Optional[pulumi.Input[builtins.str]] = None,
                 replication: Optional[pulumi.Input[builtins.int]] = None,
                 service_name: Optional[pulumi.Input[builtins.str]] = None,
                 tags: Optional[pulumi.Input[Sequence[pulumi.Input[Union['KafkaTopicTagArgs', 'KafkaTopicTagArgsDict']]]]] = None,
                 termination_protection: Optional[pulumi.Input[builtins.bool]] = None,
                 topic_description: Optional[pulumi.Input[builtins.str]] = None,
                 topic_name: Optional[pulumi.Input[builtins.str]] = None,
                 __props__=None):
        """
        Creates and manages an Aiven for Apache Kafka® [topic](https://aiven.io/docs/products/kafka/concepts).

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aiven as aiven

        example_topic = aiven.KafkaTopic("example_topic",
            project=example_project["project"],
            service_name=example_kafka["serviceName"],
            topic_name="example-topic",
            partitions=5,
            replication=3,
            termination_protection=True,
            config={
                "flush_ms": "10",
                "cleanup_policy": "compact,delete",
            },
            owner_user_group_id=example["groupId"])
        ```

        ## Import

        ```sh
        $ pulumi import aiven:index/kafkaTopic:KafkaTopic example_topic PROJECT/SERVICE_NAME/TOPIC_NAME
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Union['KafkaTopicConfigArgs', 'KafkaTopicConfigArgsDict']] config: [Advanced parameters](https://aiven.io/docs/products/kafka/reference/advanced-params) to configure topics.
        :param pulumi.Input[builtins.str] owner_user_group_id: The ID of the user group that owns the topic. Assigning ownership to decentralize topic management is part of [Aiven for Apache Kafka® governance](https://aiven.io/docs/products/kafka/concepts/governance-overview).
        :param pulumi.Input[builtins.int] partitions: The number of partitions to create in the topic.
        :param pulumi.Input[builtins.str] project: The name of the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
        :param pulumi.Input[builtins.int] replication: The replication factor for the topic.
        :param pulumi.Input[builtins.str] service_name: The name of the service that this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
        :param pulumi.Input[Sequence[pulumi.Input[Union['KafkaTopicTagArgs', 'KafkaTopicTagArgsDict']]]] tags: Tags for the topic.
        :param pulumi.Input[builtins.str] topic_description: The description of the topic
        :param pulumi.Input[builtins.str] topic_name: The name of the topic. Changing this property forces recreation of the resource.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: KafkaTopicArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Creates and manages an Aiven for Apache Kafka® [topic](https://aiven.io/docs/products/kafka/concepts).

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aiven as aiven

        example_topic = aiven.KafkaTopic("example_topic",
            project=example_project["project"],
            service_name=example_kafka["serviceName"],
            topic_name="example-topic",
            partitions=5,
            replication=3,
            termination_protection=True,
            config={
                "flush_ms": "10",
                "cleanup_policy": "compact,delete",
            },
            owner_user_group_id=example["groupId"])
        ```

        ## Import

        ```sh
        $ pulumi import aiven:index/kafkaTopic:KafkaTopic example_topic PROJECT/SERVICE_NAME/TOPIC_NAME
        ```

        :param str resource_name: The name of the resource.
        :param KafkaTopicArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(KafkaTopicArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 config: Optional[pulumi.Input[Union['KafkaTopicConfigArgs', 'KafkaTopicConfigArgsDict']]] = None,
                 owner_user_group_id: Optional[pulumi.Input[builtins.str]] = None,
                 partitions: Optional[pulumi.Input[builtins.int]] = None,
                 project: Optional[pulumi.Input[builtins.str]] = None,
                 replication: Optional[pulumi.Input[builtins.int]] = None,
                 service_name: Optional[pulumi.Input[builtins.str]] = None,
                 tags: Optional[pulumi.Input[Sequence[pulumi.Input[Union['KafkaTopicTagArgs', 'KafkaTopicTagArgsDict']]]]] = None,
                 termination_protection: Optional[pulumi.Input[builtins.bool]] = None,
                 topic_description: Optional[pulumi.Input[builtins.str]] = None,
                 topic_name: Optional[pulumi.Input[builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = KafkaTopicArgs.__new__(KafkaTopicArgs)

            __props__.__dict__["config"] = config
            __props__.__dict__["owner_user_group_id"] = owner_user_group_id
            if partitions is None and not opts.urn:
                raise TypeError("Missing required property 'partitions'")
            __props__.__dict__["partitions"] = partitions
            if project is None and not opts.urn:
                raise TypeError("Missing required property 'project'")
            __props__.__dict__["project"] = project
            if replication is None and not opts.urn:
                raise TypeError("Missing required property 'replication'")
            __props__.__dict__["replication"] = replication
            if service_name is None and not opts.urn:
                raise TypeError("Missing required property 'service_name'")
            __props__.__dict__["service_name"] = service_name
            __props__.__dict__["tags"] = tags
            __props__.__dict__["termination_protection"] = termination_protection
            __props__.__dict__["topic_description"] = topic_description
            if topic_name is None and not opts.urn:
                raise TypeError("Missing required property 'topic_name'")
            __props__.__dict__["topic_name"] = topic_name
        super(KafkaTopic, __self__).__init__(
            'aiven:index/kafkaTopic:KafkaTopic',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            config: Optional[pulumi.Input[Union['KafkaTopicConfigArgs', 'KafkaTopicConfigArgsDict']]] = None,
            owner_user_group_id: Optional[pulumi.Input[builtins.str]] = None,
            partitions: Optional[pulumi.Input[builtins.int]] = None,
            project: Optional[pulumi.Input[builtins.str]] = None,
            replication: Optional[pulumi.Input[builtins.int]] = None,
            service_name: Optional[pulumi.Input[builtins.str]] = None,
            tags: Optional[pulumi.Input[Sequence[pulumi.Input[Union['KafkaTopicTagArgs', 'KafkaTopicTagArgsDict']]]]] = None,
            termination_protection: Optional[pulumi.Input[builtins.bool]] = None,
            topic_description: Optional[pulumi.Input[builtins.str]] = None,
            topic_name: Optional[pulumi.Input[builtins.str]] = None) -> 'KafkaTopic':
        """
        Get an existing KafkaTopic resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Union['KafkaTopicConfigArgs', 'KafkaTopicConfigArgsDict']] config: [Advanced parameters](https://aiven.io/docs/products/kafka/reference/advanced-params) to configure topics.
        :param pulumi.Input[builtins.str] owner_user_group_id: The ID of the user group that owns the topic. Assigning ownership to decentralize topic management is part of [Aiven for Apache Kafka® governance](https://aiven.io/docs/products/kafka/concepts/governance-overview).
        :param pulumi.Input[builtins.int] partitions: The number of partitions to create in the topic.
        :param pulumi.Input[builtins.str] project: The name of the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
        :param pulumi.Input[builtins.int] replication: The replication factor for the topic.
        :param pulumi.Input[builtins.str] service_name: The name of the service that this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
        :param pulumi.Input[Sequence[pulumi.Input[Union['KafkaTopicTagArgs', 'KafkaTopicTagArgsDict']]]] tags: Tags for the topic.
        :param pulumi.Input[builtins.str] topic_description: The description of the topic
        :param pulumi.Input[builtins.str] topic_name: The name of the topic. Changing this property forces recreation of the resource.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _KafkaTopicState.__new__(_KafkaTopicState)

        __props__.__dict__["config"] = config
        __props__.__dict__["owner_user_group_id"] = owner_user_group_id
        __props__.__dict__["partitions"] = partitions
        __props__.__dict__["project"] = project
        __props__.__dict__["replication"] = replication
        __props__.__dict__["service_name"] = service_name
        __props__.__dict__["tags"] = tags
        __props__.__dict__["termination_protection"] = termination_protection
        __props__.__dict__["topic_description"] = topic_description
        __props__.__dict__["topic_name"] = topic_name
        return KafkaTopic(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def config(self) -> pulumi.Output[Optional['outputs.KafkaTopicConfig']]:
        """
        [Advanced parameters](https://aiven.io/docs/products/kafka/reference/advanced-params) to configure topics.
        """
        return pulumi.get(self, "config")

    @property
    @pulumi.getter(name="ownerUserGroupId")
    def owner_user_group_id(self) -> pulumi.Output[Optional[builtins.str]]:
        """
        The ID of the user group that owns the topic. Assigning ownership to decentralize topic management is part of [Aiven for Apache Kafka® governance](https://aiven.io/docs/products/kafka/concepts/governance-overview).
        """
        return pulumi.get(self, "owner_user_group_id")

    @property
    @pulumi.getter
    def partitions(self) -> pulumi.Output[builtins.int]:
        """
        The number of partitions to create in the topic.
        """
        return pulumi.get(self, "partitions")

    @property
    @pulumi.getter
    def project(self) -> pulumi.Output[builtins.str]:
        """
        The name of the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
        """
        return pulumi.get(self, "project")

    @property
    @pulumi.getter
    def replication(self) -> pulumi.Output[builtins.int]:
        """
        The replication factor for the topic.
        """
        return pulumi.get(self, "replication")

    @property
    @pulumi.getter(name="serviceName")
    def service_name(self) -> pulumi.Output[builtins.str]:
        """
        The name of the service that this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
        """
        return pulumi.get(self, "service_name")

    @property
    @pulumi.getter
    def tags(self) -> pulumi.Output[Optional[Sequence['outputs.KafkaTopicTag']]]:
        """
        Tags for the topic.
        """
        return pulumi.get(self, "tags")

    @property
    @pulumi.getter(name="terminationProtection")
    def termination_protection(self) -> pulumi.Output[Optional[builtins.bool]]:
        return pulumi.get(self, "termination_protection")

    @property
    @pulumi.getter(name="topicDescription")
    def topic_description(self) -> pulumi.Output[Optional[builtins.str]]:
        """
        The description of the topic
        """
        return pulumi.get(self, "topic_description")

    @property
    @pulumi.getter(name="topicName")
    def topic_name(self) -> pulumi.Output[builtins.str]:
        """
        The name of the topic. Changing this property forces recreation of the resource.
        """
        return pulumi.get(self, "topic_name")

