# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import json
import warnings
import pulumi
import pulumi.runtime
from typing import Union
from . import utilities, tables

class KafkaSchema(pulumi.CustomResource):
    project: pulumi.Output[str]
    schema: pulumi.Output[str]
    service_name: pulumi.Output[str]
    subject_name: pulumi.Output[str]
    version: pulumi.Output[float]
    def __init__(__self__, resource_name, opts=None, project=None, schema=None, service_name=None, subject_name=None, __props__=None, __name__=None, __opts__=None):
        """
        Create a KafkaSchema resource with the given unique name, props, and options.
        
        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        if __name__ is not None:
            warnings.warn("explicit use of __name__ is deprecated", DeprecationWarning)
            resource_name = __name__
        if __opts__ is not None:
            warnings.warn("explicit use of __opts__ is deprecated, use 'opts' instead", DeprecationWarning)
            opts = __opts__
        if opts is None:
            opts = pulumi.ResourceOptions()
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.version is None:
            opts.version = utilities.get_version()
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = dict()

            if project is None:
                raise TypeError("Missing required property 'project'")
            __props__['project'] = project
            if schema is None:
                raise TypeError("Missing required property 'schema'")
            __props__['schema'] = schema
            if service_name is None:
                raise TypeError("Missing required property 'service_name'")
            __props__['service_name'] = service_name
            if subject_name is None:
                raise TypeError("Missing required property 'subject_name'")
            __props__['subject_name'] = subject_name
            __props__['version'] = None
        super(KafkaSchema, __self__).__init__(
            'aiven:index/kafkaSchema:KafkaSchema',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name, id, opts=None, project=None, schema=None, service_name=None, subject_name=None, version=None):
        """
        Get an existing KafkaSchema resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.
        
        :param str resource_name: The unique name of the resulting resource.
        :param str id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()
        __props__["project"] = project
        __props__["schema"] = schema
        __props__["service_name"] = service_name
        __props__["subject_name"] = subject_name
        __props__["version"] = version
        return KafkaSchema(resource_name, opts=opts, __props__=__props__)
    def translate_output_property(self, prop):
        return tables._CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return tables._SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop
