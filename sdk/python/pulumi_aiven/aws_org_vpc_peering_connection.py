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

__all__ = ['AwsOrgVpcPeeringConnectionArgs', 'AwsOrgVpcPeeringConnection']

@pulumi.input_type
class AwsOrgVpcPeeringConnectionArgs:
    def __init__(__self__, *,
                 aws_account_id: pulumi.Input[builtins.str],
                 aws_vpc_id: pulumi.Input[builtins.str],
                 aws_vpc_region: pulumi.Input[builtins.str],
                 organization_id: pulumi.Input[builtins.str],
                 organization_vpc_id: pulumi.Input[builtins.str]):
        """
        The set of arguments for constructing a AwsOrgVpcPeeringConnection resource.
        :param pulumi.Input[builtins.str] aws_account_id: AWS account ID. Changing this property forces recreation of the resource.
        :param pulumi.Input[builtins.str] aws_vpc_id: AWS VPC ID. Changing this property forces recreation of the resource.
        :param pulumi.Input[builtins.str] aws_vpc_region: The AWS region of the peered VPC. For example, `eu-central-1`.
        :param pulumi.Input[builtins.str] organization_id: Identifier of the organization.
        :param pulumi.Input[builtins.str] organization_vpc_id: Identifier of the organization VPC.
        """
        pulumi.set(__self__, "aws_account_id", aws_account_id)
        pulumi.set(__self__, "aws_vpc_id", aws_vpc_id)
        pulumi.set(__self__, "aws_vpc_region", aws_vpc_region)
        pulumi.set(__self__, "organization_id", organization_id)
        pulumi.set(__self__, "organization_vpc_id", organization_vpc_id)

    @property
    @pulumi.getter(name="awsAccountId")
    def aws_account_id(self) -> pulumi.Input[builtins.str]:
        """
        AWS account ID. Changing this property forces recreation of the resource.
        """
        return pulumi.get(self, "aws_account_id")

    @aws_account_id.setter
    def aws_account_id(self, value: pulumi.Input[builtins.str]):
        pulumi.set(self, "aws_account_id", value)

    @property
    @pulumi.getter(name="awsVpcId")
    def aws_vpc_id(self) -> pulumi.Input[builtins.str]:
        """
        AWS VPC ID. Changing this property forces recreation of the resource.
        """
        return pulumi.get(self, "aws_vpc_id")

    @aws_vpc_id.setter
    def aws_vpc_id(self, value: pulumi.Input[builtins.str]):
        pulumi.set(self, "aws_vpc_id", value)

    @property
    @pulumi.getter(name="awsVpcRegion")
    def aws_vpc_region(self) -> pulumi.Input[builtins.str]:
        """
        The AWS region of the peered VPC. For example, `eu-central-1`.
        """
        return pulumi.get(self, "aws_vpc_region")

    @aws_vpc_region.setter
    def aws_vpc_region(self, value: pulumi.Input[builtins.str]):
        pulumi.set(self, "aws_vpc_region", value)

    @property
    @pulumi.getter(name="organizationId")
    def organization_id(self) -> pulumi.Input[builtins.str]:
        """
        Identifier of the organization.
        """
        return pulumi.get(self, "organization_id")

    @organization_id.setter
    def organization_id(self, value: pulumi.Input[builtins.str]):
        pulumi.set(self, "organization_id", value)

    @property
    @pulumi.getter(name="organizationVpcId")
    def organization_vpc_id(self) -> pulumi.Input[builtins.str]:
        """
        Identifier of the organization VPC.
        """
        return pulumi.get(self, "organization_vpc_id")

    @organization_vpc_id.setter
    def organization_vpc_id(self, value: pulumi.Input[builtins.str]):
        pulumi.set(self, "organization_vpc_id", value)


@pulumi.input_type
class _AwsOrgVpcPeeringConnectionState:
    def __init__(__self__, *,
                 aws_account_id: Optional[pulumi.Input[builtins.str]] = None,
                 aws_vpc_id: Optional[pulumi.Input[builtins.str]] = None,
                 aws_vpc_peering_connection_id: Optional[pulumi.Input[builtins.str]] = None,
                 aws_vpc_region: Optional[pulumi.Input[builtins.str]] = None,
                 organization_id: Optional[pulumi.Input[builtins.str]] = None,
                 organization_vpc_id: Optional[pulumi.Input[builtins.str]] = None,
                 peering_connection_id: Optional[pulumi.Input[builtins.str]] = None,
                 state: Optional[pulumi.Input[builtins.str]] = None):
        """
        Input properties used for looking up and filtering AwsOrgVpcPeeringConnection resources.
        :param pulumi.Input[builtins.str] aws_account_id: AWS account ID. Changing this property forces recreation of the resource.
        :param pulumi.Input[builtins.str] aws_vpc_id: AWS VPC ID. Changing this property forces recreation of the resource.
        :param pulumi.Input[builtins.str] aws_vpc_peering_connection_id: The ID of the AWS VPC peering connection.
        :param pulumi.Input[builtins.str] aws_vpc_region: The AWS region of the peered VPC. For example, `eu-central-1`.
        :param pulumi.Input[builtins.str] organization_id: Identifier of the organization.
        :param pulumi.Input[builtins.str] organization_vpc_id: Identifier of the organization VPC.
        :param pulumi.Input[builtins.str] peering_connection_id: The ID of the peering connection.
        :param pulumi.Input[builtins.str] state: State of the peering connection. The possible values are `ACTIVE`, `APPROVED`, `APPROVED_PEER_REQUESTED`, `DELETED`, `DELETED_BY_PEER`, `DELETING`, `ERROR`, `INVALID_SPECIFICATION`, `PENDING_PEER` and `REJECTED_BY_PEER`.
        """
        if aws_account_id is not None:
            pulumi.set(__self__, "aws_account_id", aws_account_id)
        if aws_vpc_id is not None:
            pulumi.set(__self__, "aws_vpc_id", aws_vpc_id)
        if aws_vpc_peering_connection_id is not None:
            pulumi.set(__self__, "aws_vpc_peering_connection_id", aws_vpc_peering_connection_id)
        if aws_vpc_region is not None:
            pulumi.set(__self__, "aws_vpc_region", aws_vpc_region)
        if organization_id is not None:
            pulumi.set(__self__, "organization_id", organization_id)
        if organization_vpc_id is not None:
            pulumi.set(__self__, "organization_vpc_id", organization_vpc_id)
        if peering_connection_id is not None:
            pulumi.set(__self__, "peering_connection_id", peering_connection_id)
        if state is not None:
            pulumi.set(__self__, "state", state)

    @property
    @pulumi.getter(name="awsAccountId")
    def aws_account_id(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        AWS account ID. Changing this property forces recreation of the resource.
        """
        return pulumi.get(self, "aws_account_id")

    @aws_account_id.setter
    def aws_account_id(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "aws_account_id", value)

    @property
    @pulumi.getter(name="awsVpcId")
    def aws_vpc_id(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        AWS VPC ID. Changing this property forces recreation of the resource.
        """
        return pulumi.get(self, "aws_vpc_id")

    @aws_vpc_id.setter
    def aws_vpc_id(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "aws_vpc_id", value)

    @property
    @pulumi.getter(name="awsVpcPeeringConnectionId")
    def aws_vpc_peering_connection_id(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The ID of the AWS VPC peering connection.
        """
        return pulumi.get(self, "aws_vpc_peering_connection_id")

    @aws_vpc_peering_connection_id.setter
    def aws_vpc_peering_connection_id(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "aws_vpc_peering_connection_id", value)

    @property
    @pulumi.getter(name="awsVpcRegion")
    def aws_vpc_region(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The AWS region of the peered VPC. For example, `eu-central-1`.
        """
        return pulumi.get(self, "aws_vpc_region")

    @aws_vpc_region.setter
    def aws_vpc_region(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "aws_vpc_region", value)

    @property
    @pulumi.getter(name="organizationId")
    def organization_id(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        Identifier of the organization.
        """
        return pulumi.get(self, "organization_id")

    @organization_id.setter
    def organization_id(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "organization_id", value)

    @property
    @pulumi.getter(name="organizationVpcId")
    def organization_vpc_id(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        Identifier of the organization VPC.
        """
        return pulumi.get(self, "organization_vpc_id")

    @organization_vpc_id.setter
    def organization_vpc_id(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "organization_vpc_id", value)

    @property
    @pulumi.getter(name="peeringConnectionId")
    def peering_connection_id(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The ID of the peering connection.
        """
        return pulumi.get(self, "peering_connection_id")

    @peering_connection_id.setter
    def peering_connection_id(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "peering_connection_id", value)

    @property
    @pulumi.getter
    def state(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        State of the peering connection. The possible values are `ACTIVE`, `APPROVED`, `APPROVED_PEER_REQUESTED`, `DELETED`, `DELETED_BY_PEER`, `DELETING`, `ERROR`, `INVALID_SPECIFICATION`, `PENDING_PEER` and `REJECTED_BY_PEER`.
        """
        return pulumi.get(self, "state")

    @state.setter
    def state(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "state", value)


@pulumi.type_token("aiven:index/awsOrgVpcPeeringConnection:AwsOrgVpcPeeringConnection")
class AwsOrgVpcPeeringConnection(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 aws_account_id: Optional[pulumi.Input[builtins.str]] = None,
                 aws_vpc_id: Optional[pulumi.Input[builtins.str]] = None,
                 aws_vpc_region: Optional[pulumi.Input[builtins.str]] = None,
                 organization_id: Optional[pulumi.Input[builtins.str]] = None,
                 organization_vpc_id: Optional[pulumi.Input[builtins.str]] = None,
                 __props__=None):
        """
        Creates and manages an AWS VPC peering connection with an Aiven Organization VPC.

        **This resource is in the beta stage and may change without notice.** Set
        the `PROVIDER_AIVEN_ENABLE_BETA` environment variable to use the resource.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aiven as aiven

        example_vpc = aiven.OrganizationVpc("example_vpc",
            organization_id=example["id"],
            cloud_name="aws-eu-central-1",
            network_cidr="10.0.0.0/24")
        example_peering = aiven.AwsOrgVpcPeeringConnection("example_peering",
            organization_id=example_vpc.organization_id,
            organization_vpc_id=example_vpc.organization_vpc_id,
            aws_account_id=aws_id,
            aws_vpc_id="vpc-1a2b3c4d5e6f7g8h9",
            aws_vpc_region="aws-us-east-2")
        ```

        ## Import

        ```sh
        $ pulumi import aiven:index/awsOrgVpcPeeringConnection:AwsOrgVpcPeeringConnection example ORGANIZATION_ID/ORGANIZATION_VPC_ID/AWS_ACCOUNT_ID/AWS_VPC_ID/AWS_REGION
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[builtins.str] aws_account_id: AWS account ID. Changing this property forces recreation of the resource.
        :param pulumi.Input[builtins.str] aws_vpc_id: AWS VPC ID. Changing this property forces recreation of the resource.
        :param pulumi.Input[builtins.str] aws_vpc_region: The AWS region of the peered VPC. For example, `eu-central-1`.
        :param pulumi.Input[builtins.str] organization_id: Identifier of the organization.
        :param pulumi.Input[builtins.str] organization_vpc_id: Identifier of the organization VPC.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: AwsOrgVpcPeeringConnectionArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Creates and manages an AWS VPC peering connection with an Aiven Organization VPC.

        **This resource is in the beta stage and may change without notice.** Set
        the `PROVIDER_AIVEN_ENABLE_BETA` environment variable to use the resource.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aiven as aiven

        example_vpc = aiven.OrganizationVpc("example_vpc",
            organization_id=example["id"],
            cloud_name="aws-eu-central-1",
            network_cidr="10.0.0.0/24")
        example_peering = aiven.AwsOrgVpcPeeringConnection("example_peering",
            organization_id=example_vpc.organization_id,
            organization_vpc_id=example_vpc.organization_vpc_id,
            aws_account_id=aws_id,
            aws_vpc_id="vpc-1a2b3c4d5e6f7g8h9",
            aws_vpc_region="aws-us-east-2")
        ```

        ## Import

        ```sh
        $ pulumi import aiven:index/awsOrgVpcPeeringConnection:AwsOrgVpcPeeringConnection example ORGANIZATION_ID/ORGANIZATION_VPC_ID/AWS_ACCOUNT_ID/AWS_VPC_ID/AWS_REGION
        ```

        :param str resource_name: The name of the resource.
        :param AwsOrgVpcPeeringConnectionArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(AwsOrgVpcPeeringConnectionArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 aws_account_id: Optional[pulumi.Input[builtins.str]] = None,
                 aws_vpc_id: Optional[pulumi.Input[builtins.str]] = None,
                 aws_vpc_region: Optional[pulumi.Input[builtins.str]] = None,
                 organization_id: Optional[pulumi.Input[builtins.str]] = None,
                 organization_vpc_id: Optional[pulumi.Input[builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = AwsOrgVpcPeeringConnectionArgs.__new__(AwsOrgVpcPeeringConnectionArgs)

            if aws_account_id is None and not opts.urn:
                raise TypeError("Missing required property 'aws_account_id'")
            __props__.__dict__["aws_account_id"] = aws_account_id
            if aws_vpc_id is None and not opts.urn:
                raise TypeError("Missing required property 'aws_vpc_id'")
            __props__.__dict__["aws_vpc_id"] = aws_vpc_id
            if aws_vpc_region is None and not opts.urn:
                raise TypeError("Missing required property 'aws_vpc_region'")
            __props__.__dict__["aws_vpc_region"] = aws_vpc_region
            if organization_id is None and not opts.urn:
                raise TypeError("Missing required property 'organization_id'")
            __props__.__dict__["organization_id"] = organization_id
            if organization_vpc_id is None and not opts.urn:
                raise TypeError("Missing required property 'organization_vpc_id'")
            __props__.__dict__["organization_vpc_id"] = organization_vpc_id
            __props__.__dict__["aws_vpc_peering_connection_id"] = None
            __props__.__dict__["peering_connection_id"] = None
            __props__.__dict__["state"] = None
        super(AwsOrgVpcPeeringConnection, __self__).__init__(
            'aiven:index/awsOrgVpcPeeringConnection:AwsOrgVpcPeeringConnection',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            aws_account_id: Optional[pulumi.Input[builtins.str]] = None,
            aws_vpc_id: Optional[pulumi.Input[builtins.str]] = None,
            aws_vpc_peering_connection_id: Optional[pulumi.Input[builtins.str]] = None,
            aws_vpc_region: Optional[pulumi.Input[builtins.str]] = None,
            organization_id: Optional[pulumi.Input[builtins.str]] = None,
            organization_vpc_id: Optional[pulumi.Input[builtins.str]] = None,
            peering_connection_id: Optional[pulumi.Input[builtins.str]] = None,
            state: Optional[pulumi.Input[builtins.str]] = None) -> 'AwsOrgVpcPeeringConnection':
        """
        Get an existing AwsOrgVpcPeeringConnection resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[builtins.str] aws_account_id: AWS account ID. Changing this property forces recreation of the resource.
        :param pulumi.Input[builtins.str] aws_vpc_id: AWS VPC ID. Changing this property forces recreation of the resource.
        :param pulumi.Input[builtins.str] aws_vpc_peering_connection_id: The ID of the AWS VPC peering connection.
        :param pulumi.Input[builtins.str] aws_vpc_region: The AWS region of the peered VPC. For example, `eu-central-1`.
        :param pulumi.Input[builtins.str] organization_id: Identifier of the organization.
        :param pulumi.Input[builtins.str] organization_vpc_id: Identifier of the organization VPC.
        :param pulumi.Input[builtins.str] peering_connection_id: The ID of the peering connection.
        :param pulumi.Input[builtins.str] state: State of the peering connection. The possible values are `ACTIVE`, `APPROVED`, `APPROVED_PEER_REQUESTED`, `DELETED`, `DELETED_BY_PEER`, `DELETING`, `ERROR`, `INVALID_SPECIFICATION`, `PENDING_PEER` and `REJECTED_BY_PEER`.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _AwsOrgVpcPeeringConnectionState.__new__(_AwsOrgVpcPeeringConnectionState)

        __props__.__dict__["aws_account_id"] = aws_account_id
        __props__.__dict__["aws_vpc_id"] = aws_vpc_id
        __props__.__dict__["aws_vpc_peering_connection_id"] = aws_vpc_peering_connection_id
        __props__.__dict__["aws_vpc_region"] = aws_vpc_region
        __props__.__dict__["organization_id"] = organization_id
        __props__.__dict__["organization_vpc_id"] = organization_vpc_id
        __props__.__dict__["peering_connection_id"] = peering_connection_id
        __props__.__dict__["state"] = state
        return AwsOrgVpcPeeringConnection(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="awsAccountId")
    def aws_account_id(self) -> pulumi.Output[builtins.str]:
        """
        AWS account ID. Changing this property forces recreation of the resource.
        """
        return pulumi.get(self, "aws_account_id")

    @property
    @pulumi.getter(name="awsVpcId")
    def aws_vpc_id(self) -> pulumi.Output[builtins.str]:
        """
        AWS VPC ID. Changing this property forces recreation of the resource.
        """
        return pulumi.get(self, "aws_vpc_id")

    @property
    @pulumi.getter(name="awsVpcPeeringConnectionId")
    def aws_vpc_peering_connection_id(self) -> pulumi.Output[builtins.str]:
        """
        The ID of the AWS VPC peering connection.
        """
        return pulumi.get(self, "aws_vpc_peering_connection_id")

    @property
    @pulumi.getter(name="awsVpcRegion")
    def aws_vpc_region(self) -> pulumi.Output[builtins.str]:
        """
        The AWS region of the peered VPC. For example, `eu-central-1`.
        """
        return pulumi.get(self, "aws_vpc_region")

    @property
    @pulumi.getter(name="organizationId")
    def organization_id(self) -> pulumi.Output[builtins.str]:
        """
        Identifier of the organization.
        """
        return pulumi.get(self, "organization_id")

    @property
    @pulumi.getter(name="organizationVpcId")
    def organization_vpc_id(self) -> pulumi.Output[builtins.str]:
        """
        Identifier of the organization VPC.
        """
        return pulumi.get(self, "organization_vpc_id")

    @property
    @pulumi.getter(name="peeringConnectionId")
    def peering_connection_id(self) -> pulumi.Output[builtins.str]:
        """
        The ID of the peering connection.
        """
        return pulumi.get(self, "peering_connection_id")

    @property
    @pulumi.getter
    def state(self) -> pulumi.Output[builtins.str]:
        """
        State of the peering connection. The possible values are `ACTIVE`, `APPROVED`, `APPROVED_PEER_REQUESTED`, `DELETED`, `DELETED_BY_PEER`, `DELETING`, `ERROR`, `INVALID_SPECIFICATION`, `PENDING_PEER` and `REJECTED_BY_PEER`.
        """
        return pulumi.get(self, "state")

