# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = [
    'GetMysqlDatabaseResult',
    'AwaitableGetMysqlDatabaseResult',
    'get_mysql_database',
    'get_mysql_database_output',
]

@pulumi.output_type
class GetMysqlDatabaseResult:
    """
    A collection of values returned by getMysqlDatabase.
    """
    def __init__(__self__, database_name=None, id=None, project=None, service_name=None, termination_protection=None):
        if database_name and not isinstance(database_name, str):
            raise TypeError("Expected argument 'database_name' to be a str")
        pulumi.set(__self__, "database_name", database_name)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if project and not isinstance(project, str):
            raise TypeError("Expected argument 'project' to be a str")
        pulumi.set(__self__, "project", project)
        if service_name and not isinstance(service_name, str):
            raise TypeError("Expected argument 'service_name' to be a str")
        pulumi.set(__self__, "service_name", service_name)
        if termination_protection and not isinstance(termination_protection, bool):
            raise TypeError("Expected argument 'termination_protection' to be a bool")
        pulumi.set(__self__, "termination_protection", termination_protection)

    @property
    @pulumi.getter(name="databaseName")
    def database_name(self) -> str:
        """
        The name of the service database. This property cannot be changed, doing so forces recreation of the resource.
        """
        return pulumi.get(self, "database_name")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def project(self) -> str:
        """
        Identifies the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. This property cannot be changed, doing so forces recreation of the resource.
        """
        return pulumi.get(self, "project")

    @property
    @pulumi.getter(name="serviceName")
    def service_name(self) -> str:
        """
        Specifies the name of the service that this resource belongs to. To set up proper dependencies please refer to this variable as a reference. This property cannot be changed, doing so forces recreation of the resource.
        """
        return pulumi.get(self, "service_name")

    @property
    @pulumi.getter(name="terminationProtection")
    def termination_protection(self) -> bool:
        return pulumi.get(self, "termination_protection")


class AwaitableGetMysqlDatabaseResult(GetMysqlDatabaseResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetMysqlDatabaseResult(
            database_name=self.database_name,
            id=self.id,
            project=self.project,
            service_name=self.service_name,
            termination_protection=self.termination_protection)


def get_mysql_database(database_name: Optional[str] = None,
                       project: Optional[str] = None,
                       service_name: Optional[str] = None,
                       opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetMysqlDatabaseResult:
    """
    The MySQL Database data source provides information about the existing Aiven MySQL Database.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_aiven as aiven

    mydatabase = aiven.get_mysql_database(project=aiven_project["myproject"]["project"],
        service_name=aiven_mysql["mymysql"]["service_name"],
        database_name="<DATABASE_NAME>")
    ```


    :param str database_name: The name of the service database. This property cannot be changed, doing so forces recreation of the resource.
    :param str project: Identifies the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. This property cannot be changed, doing so forces recreation of the resource.
    :param str service_name: Specifies the name of the service that this resource belongs to. To set up proper dependencies please refer to this variable as a reference. This property cannot be changed, doing so forces recreation of the resource.
    """
    __args__ = dict()
    __args__['databaseName'] = database_name
    __args__['project'] = project
    __args__['serviceName'] = service_name
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('aiven:index/getMysqlDatabase:getMysqlDatabase', __args__, opts=opts, typ=GetMysqlDatabaseResult).value

    return AwaitableGetMysqlDatabaseResult(
        database_name=__ret__.database_name,
        id=__ret__.id,
        project=__ret__.project,
        service_name=__ret__.service_name,
        termination_protection=__ret__.termination_protection)


@_utilities.lift_output_func(get_mysql_database)
def get_mysql_database_output(database_name: Optional[pulumi.Input[str]] = None,
                              project: Optional[pulumi.Input[str]] = None,
                              service_name: Optional[pulumi.Input[str]] = None,
                              opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetMysqlDatabaseResult]:
    """
    The MySQL Database data source provides information about the existing Aiven MySQL Database.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_aiven as aiven

    mydatabase = aiven.get_mysql_database(project=aiven_project["myproject"]["project"],
        service_name=aiven_mysql["mymysql"]["service_name"],
        database_name="<DATABASE_NAME>")
    ```


    :param str database_name: The name of the service database. This property cannot be changed, doing so forces recreation of the resource.
    :param str project: Identifies the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. This property cannot be changed, doing so forces recreation of the resource.
    :param str service_name: Specifies the name of the service that this resource belongs to. To set up proper dependencies please refer to this variable as a reference. This property cannot be changed, doing so forces recreation of the resource.
    """
    ...