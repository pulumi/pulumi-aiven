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

__all__ = [
    'GetGcpVpcPeeringConnectionResult',
    'AwaitableGetGcpVpcPeeringConnectionResult',
    'get_gcp_vpc_peering_connection',
    'get_gcp_vpc_peering_connection_output',
]

@pulumi.output_type
class GetGcpVpcPeeringConnectionResult:
    """
    A collection of values returned by getGcpVpcPeeringConnection.
    """
    def __init__(__self__, gcp_project_id=None, id=None, peer_vpc=None, self_link=None, state=None, state_info=None, vpc_id=None):
        if gcp_project_id and not isinstance(gcp_project_id, str):
            raise TypeError("Expected argument 'gcp_project_id' to be a str")
        pulumi.set(__self__, "gcp_project_id", gcp_project_id)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if peer_vpc and not isinstance(peer_vpc, str):
            raise TypeError("Expected argument 'peer_vpc' to be a str")
        pulumi.set(__self__, "peer_vpc", peer_vpc)
        if self_link and not isinstance(self_link, str):
            raise TypeError("Expected argument 'self_link' to be a str")
        pulumi.set(__self__, "self_link", self_link)
        if state and not isinstance(state, str):
            raise TypeError("Expected argument 'state' to be a str")
        pulumi.set(__self__, "state", state)
        if state_info and not isinstance(state_info, dict):
            raise TypeError("Expected argument 'state_info' to be a dict")
        pulumi.set(__self__, "state_info", state_info)
        if vpc_id and not isinstance(vpc_id, str):
            raise TypeError("Expected argument 'vpc_id' to be a str")
        pulumi.set(__self__, "vpc_id", vpc_id)

    @property
    @pulumi.getter(name="gcpProjectId")
    def gcp_project_id(self) -> builtins.str:
        """
        Google Cloud project ID. Changing this property forces recreation of the resource.
        """
        return pulumi.get(self, "gcp_project_id")

    @property
    @pulumi.getter
    def id(self) -> builtins.str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="peerVpc")
    def peer_vpc(self) -> builtins.str:
        """
        Google Cloud VPC network name. Changing this property forces recreation of the resource.
        """
        return pulumi.get(self, "peer_vpc")

    @property
    @pulumi.getter(name="selfLink")
    def self_link(self) -> builtins.str:
        """
        Computed Google Cloud network peering link.
        """
        return pulumi.get(self, "self_link")

    @property
    @pulumi.getter
    def state(self) -> builtins.str:
        """
        State of the peering connection.
        """
        return pulumi.get(self, "state")

    @property
    @pulumi.getter(name="stateInfo")
    def state_info(self) -> Mapping[str, builtins.str]:
        """
        State-specific help or error information.
        """
        return pulumi.get(self, "state_info")

    @property
    @pulumi.getter(name="vpcId")
    def vpc_id(self) -> builtins.str:
        """
        The VPC the peering connection belongs to. Changing this property forces recreation of the resource.
        """
        return pulumi.get(self, "vpc_id")


class AwaitableGetGcpVpcPeeringConnectionResult(GetGcpVpcPeeringConnectionResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetGcpVpcPeeringConnectionResult(
            gcp_project_id=self.gcp_project_id,
            id=self.id,
            peer_vpc=self.peer_vpc,
            self_link=self.self_link,
            state=self.state,
            state_info=self.state_info,
            vpc_id=self.vpc_id)


def get_gcp_vpc_peering_connection(gcp_project_id: Optional[builtins.str] = None,
                                   peer_vpc: Optional[builtins.str] = None,
                                   vpc_id: Optional[builtins.str] = None,
                                   opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetGcpVpcPeeringConnectionResult:
    """
    The GCP VPC Peering Connection data source provides information about the existing Aiven VPC Peering Connection.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_aiven as aiven

    main = aiven.get_gcp_vpc_peering_connection(vpc_id=vpc["id"],
        gcp_project_id="example-project",
        peer_vpc="example-network")
    ```


    :param builtins.str gcp_project_id: Google Cloud project ID. Changing this property forces recreation of the resource.
    :param builtins.str peer_vpc: Google Cloud VPC network name. Changing this property forces recreation of the resource.
    :param builtins.str vpc_id: The VPC the peering connection belongs to. Changing this property forces recreation of the resource.
    """
    __args__ = dict()
    __args__['gcpProjectId'] = gcp_project_id
    __args__['peerVpc'] = peer_vpc
    __args__['vpcId'] = vpc_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('aiven:index/getGcpVpcPeeringConnection:getGcpVpcPeeringConnection', __args__, opts=opts, typ=GetGcpVpcPeeringConnectionResult).value

    return AwaitableGetGcpVpcPeeringConnectionResult(
        gcp_project_id=pulumi.get(__ret__, 'gcp_project_id'),
        id=pulumi.get(__ret__, 'id'),
        peer_vpc=pulumi.get(__ret__, 'peer_vpc'),
        self_link=pulumi.get(__ret__, 'self_link'),
        state=pulumi.get(__ret__, 'state'),
        state_info=pulumi.get(__ret__, 'state_info'),
        vpc_id=pulumi.get(__ret__, 'vpc_id'))
def get_gcp_vpc_peering_connection_output(gcp_project_id: Optional[pulumi.Input[builtins.str]] = None,
                                          peer_vpc: Optional[pulumi.Input[builtins.str]] = None,
                                          vpc_id: Optional[pulumi.Input[builtins.str]] = None,
                                          opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetGcpVpcPeeringConnectionResult]:
    """
    The GCP VPC Peering Connection data source provides information about the existing Aiven VPC Peering Connection.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_aiven as aiven

    main = aiven.get_gcp_vpc_peering_connection(vpc_id=vpc["id"],
        gcp_project_id="example-project",
        peer_vpc="example-network")
    ```


    :param builtins.str gcp_project_id: Google Cloud project ID. Changing this property forces recreation of the resource.
    :param builtins.str peer_vpc: Google Cloud VPC network name. Changing this property forces recreation of the resource.
    :param builtins.str vpc_id: The VPC the peering connection belongs to. Changing this property forces recreation of the resource.
    """
    __args__ = dict()
    __args__['gcpProjectId'] = gcp_project_id
    __args__['peerVpc'] = peer_vpc
    __args__['vpcId'] = vpc_id
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('aiven:index/getGcpVpcPeeringConnection:getGcpVpcPeeringConnection', __args__, opts=opts, typ=GetGcpVpcPeeringConnectionResult)
    return __ret__.apply(lambda __response__: GetGcpVpcPeeringConnectionResult(
        gcp_project_id=pulumi.get(__response__, 'gcp_project_id'),
        id=pulumi.get(__response__, 'id'),
        peer_vpc=pulumi.get(__response__, 'peer_vpc'),
        self_link=pulumi.get(__response__, 'self_link'),
        state=pulumi.get(__response__, 'state'),
        state_info=pulumi.get(__response__, 'state_info'),
        vpc_id=pulumi.get(__response__, 'vpc_id')))
