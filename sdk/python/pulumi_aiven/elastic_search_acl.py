# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import json
import warnings
import pulumi
import pulumi.runtime
from typing import Union
from . import utilities, tables

class ElasticSearchAcl(pulumi.CustomResource):
    acls: pulumi.Output[list]
    enabled: pulumi.Output[bool]
    extended_acl: pulumi.Output[bool]
    project: pulumi.Output[str]
    service_name: pulumi.Output[str]
    def __init__(__self__, resource_name, opts=None, acls=None, enabled=None, extended_acl=None, project=None, service_name=None, __props__=None, __name__=None, __opts__=None):
        """
        Create a ElasticSearchAcl resource with the given unique name, props, and options.
        
        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        
        The **acls** object supports the following:
        
          * `rules` (`pulumi.Input[list]`)
        
            * `index` (`pulumi.Input[str]`)
            * `permission` (`pulumi.Input[str]`)
        
          * `username` (`pulumi.Input[str]`)
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

            __props__['acls'] = acls
            __props__['enabled'] = enabled
            __props__['extended_acl'] = extended_acl
            if project is None:
                raise TypeError("Missing required property 'project'")
            __props__['project'] = project
            if service_name is None:
                raise TypeError("Missing required property 'service_name'")
            __props__['service_name'] = service_name
        super(ElasticSearchAcl, __self__).__init__(
            'aiven:index/elasticSearchAcl:ElasticSearchAcl',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name, id, opts=None, acls=None, enabled=None, extended_acl=None, project=None, service_name=None):
        """
        Get an existing ElasticSearchAcl resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.
        
        :param str resource_name: The unique name of the resulting resource.
        :param str id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        
        The **acls** object supports the following:
        
          * `rules` (`pulumi.Input[list]`)
        
            * `index` (`pulumi.Input[str]`)
            * `permission` (`pulumi.Input[str]`)
        
          * `username` (`pulumi.Input[str]`)
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()
        __props__["acls"] = acls
        __props__["enabled"] = enabled
        __props__["extended_acl"] = extended_acl
        __props__["project"] = project
        __props__["service_name"] = service_name
        return ElasticSearchAcl(resource_name, opts=opts, __props__=__props__)
    def translate_output_property(self, prop):
        return tables._CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return tables._SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop
