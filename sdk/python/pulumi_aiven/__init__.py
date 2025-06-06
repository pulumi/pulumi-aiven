# coding=utf-8
# *** WARNING: this file was generated by pulumi-language-python. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import builtins
from . import _utilities
import typing
# Export this package's modules as members:
from .account import *
from .account_authentication import *
from .account_team import *
from .account_team_member import *
from .account_team_project import *
from .alloydbomni import *
from .alloydbomni_database import *
from .alloydbomni_user import *
from .aws_org_vpc_peering_connection import *
from .aws_privatelink import *
from .aws_vpc_peering_connection import *
from .azure_org_vpc_peering_connection import *
from .azure_privatelink import *
from .azure_privatelink_connection_approval import *
from .azure_vpc_peering_connection import *
from .billing_group import *
from .cassandra import *
from .cassandra_user import *
from .clickhouse import *
from .clickhouse_database import *
from .clickhouse_grant import *
from .clickhouse_role import *
from .clickhouse_user import *
from .connection_pool import *
from .dragonfly import *
from .flink import *
from .flink_application import *
from .flink_application_deployment import *
from .flink_application_version import *
from .flink_jar_application import *
from .flink_jar_application_deployment import *
from .flink_jar_application_version import *
from .gcp_org_vpc_peering_connection import *
from .gcp_privatelink import *
from .gcp_privatelink_connection_approval import *
from .gcp_vpc_peering_connection import *
from .get_account import *
from .get_account_authentication import *
from .get_account_team import *
from .get_account_team_member import *
from .get_account_team_project import *
from .get_alloydbomni import *
from .get_alloydbomni_database import *
from .get_alloydbomni_user import *
from .get_aws_org_vpc_peering_connection import *
from .get_aws_privatelink import *
from .get_aws_vpc_peering_connection import *
from .get_azure_org_vpc_peering_connection import *
from .get_azure_privatelink import *
from .get_azure_vpc_peering_connection import *
from .get_billing_group import *
from .get_cassanda import *
from .get_cassandra import *
from .get_cassandra_user import *
from .get_clickhouse import *
from .get_clickhouse_database import *
from .get_clickhouse_user import *
from .get_connection_pool import *
from .get_dragonfly import *
from .get_external_identity import *
from .get_flink import *
from .get_flink_application import *
from .get_flink_application_version import *
from .get_gcp_org_vpc_peering_connection import *
from .get_gcp_privatelink import *
from .get_gcp_vpc_peering_connection import *
from .get_grafana import *
from .get_influx_db import *
from .get_influxdb_database import *
from .get_influxdb_user import *
from .get_kafka import *
from .get_kafka_acl import *
from .get_kafka_connect import *
from .get_kafka_connector import *
from .get_kafka_mirror_maker import *
from .get_kafka_schema import *
from .get_kafka_schema_configuration import *
from .get_kafka_schema_registry_acl import *
from .get_kafka_topic import *
from .get_kafka_user import *
from .get_m3_aggregator import *
from .get_m3_db import *
from .get_m3db_user import *
from .get_mirror_maker_replication_flow import *
from .get_my_sql import *
from .get_mysql_database import *
from .get_mysql_user import *
from .get_open_search import *
from .get_open_search_acl_config import *
from .get_open_search_acl_rule import *
from .get_opensearch_security_plugin_config import *
from .get_opensearch_user import *
from .get_organization import *
from .get_organization_address import *
from .get_organization_application_user import *
from .get_organization_billing_group import *
from .get_organization_billing_group_list import *
from .get_organization_project import *
from .get_organization_user import *
from .get_organization_user_group import *
from .get_organization_user_list import *
from .get_organization_vpc import *
from .get_organizational_unit import *
from .get_pg import *
from .get_pg_database import *
from .get_pg_user import *
from .get_project import *
from .get_project_user import *
from .get_project_vpc import *
from .get_redis import *
from .get_redis_user import *
from .get_service_component import *
from .get_service_integration import *
from .get_service_integration_endpoint import *
from .get_thanos import *
from .get_transit_gateway_vpc_attachment import *
from .get_valkey import *
from .get_valkey_user import *
from .governance_access import *
from .grafana import *
from .influx_db import *
from .influxdb_database import *
from .influxdb_user import *
from .kafka import *
from .kafka_acl import *
from .kafka_connect import *
from .kafka_connector import *
from .kafka_mirror_maker import *
from .kafka_native_acl import *
from .kafka_quota import *
from .kafka_schema import *
from .kafka_schema_configuration import *
from .kafka_schema_registry_acl import *
from .kafka_topic import *
from .kafka_user import *
from .m3_aggregator import *
from .m3_db import *
from .m3db_user import *
from .mirror_maker_replication_flow import *
from .my_sql import *
from .mysql_database import *
from .mysql_user import *
from .open_search import *
from .open_search_acl_config import *
from .open_search_acl_rule import *
from .opensearch_security_plugin_config import *
from .opensearch_user import *
from .organization import *
from .organization_address import *
from .organization_application_user import *
from .organization_application_user_token import *
from .organization_billing_group import *
from .organization_group_project import *
from .organization_permission import *
from .organization_project import *
from .organization_user import *
from .organization_user_group import *
from .organization_user_group_member import *
from .organization_vpc import *
from .organizational_unit import *
from .pg import *
from .pg_database import *
from .pg_user import *
from .project import *
from .project_user import *
from .project_vpc import *
from .provider import *
from .redis import *
from .redis_user import *
from .service_integration import *
from .service_integration_endpoint import *
from .static_ip import *
from .thanos import *
from .transit_gateway_vpc_attachment import *
from .valkey import *
from .valkey_user import *
from ._inputs import *
from . import outputs

# Make subpackages available:
if typing.TYPE_CHECKING:
    import pulumi_aiven.config as __config
    config = __config
else:
    config = _utilities.lazy_import('pulumi_aiven.config')

_utilities.register(
    resource_modules="""
[
 {
  "pkg": "aiven",
  "mod": "index/account",
  "fqn": "pulumi_aiven",
  "classes": {
   "aiven:index/account:Account": "Account"
  }
 },
 {
  "pkg": "aiven",
  "mod": "index/accountAuthentication",
  "fqn": "pulumi_aiven",
  "classes": {
   "aiven:index/accountAuthentication:AccountAuthentication": "AccountAuthentication"
  }
 },
 {
  "pkg": "aiven",
  "mod": "index/accountTeam",
  "fqn": "pulumi_aiven",
  "classes": {
   "aiven:index/accountTeam:AccountTeam": "AccountTeam"
  }
 },
 {
  "pkg": "aiven",
  "mod": "index/accountTeamMember",
  "fqn": "pulumi_aiven",
  "classes": {
   "aiven:index/accountTeamMember:AccountTeamMember": "AccountTeamMember"
  }
 },
 {
  "pkg": "aiven",
  "mod": "index/accountTeamProject",
  "fqn": "pulumi_aiven",
  "classes": {
   "aiven:index/accountTeamProject:AccountTeamProject": "AccountTeamProject"
  }
 },
 {
  "pkg": "aiven",
  "mod": "index/alloydbomni",
  "fqn": "pulumi_aiven",
  "classes": {
   "aiven:index/alloydbomni:Alloydbomni": "Alloydbomni"
  }
 },
 {
  "pkg": "aiven",
  "mod": "index/alloydbomniDatabase",
  "fqn": "pulumi_aiven",
  "classes": {
   "aiven:index/alloydbomniDatabase:AlloydbomniDatabase": "AlloydbomniDatabase"
  }
 },
 {
  "pkg": "aiven",
  "mod": "index/alloydbomniUser",
  "fqn": "pulumi_aiven",
  "classes": {
   "aiven:index/alloydbomniUser:AlloydbomniUser": "AlloydbomniUser"
  }
 },
 {
  "pkg": "aiven",
  "mod": "index/awsOrgVpcPeeringConnection",
  "fqn": "pulumi_aiven",
  "classes": {
   "aiven:index/awsOrgVpcPeeringConnection:AwsOrgVpcPeeringConnection": "AwsOrgVpcPeeringConnection"
  }
 },
 {
  "pkg": "aiven",
  "mod": "index/awsPrivatelink",
  "fqn": "pulumi_aiven",
  "classes": {
   "aiven:index/awsPrivatelink:AwsPrivatelink": "AwsPrivatelink"
  }
 },
 {
  "pkg": "aiven",
  "mod": "index/awsVpcPeeringConnection",
  "fqn": "pulumi_aiven",
  "classes": {
   "aiven:index/awsVpcPeeringConnection:AwsVpcPeeringConnection": "AwsVpcPeeringConnection"
  }
 },
 {
  "pkg": "aiven",
  "mod": "index/azureOrgVpcPeeringConnection",
  "fqn": "pulumi_aiven",
  "classes": {
   "aiven:index/azureOrgVpcPeeringConnection:AzureOrgVpcPeeringConnection": "AzureOrgVpcPeeringConnection"
  }
 },
 {
  "pkg": "aiven",
  "mod": "index/azurePrivatelink",
  "fqn": "pulumi_aiven",
  "classes": {
   "aiven:index/azurePrivatelink:AzurePrivatelink": "AzurePrivatelink"
  }
 },
 {
  "pkg": "aiven",
  "mod": "index/azurePrivatelinkConnectionApproval",
  "fqn": "pulumi_aiven",
  "classes": {
   "aiven:index/azurePrivatelinkConnectionApproval:AzurePrivatelinkConnectionApproval": "AzurePrivatelinkConnectionApproval"
  }
 },
 {
  "pkg": "aiven",
  "mod": "index/azureVpcPeeringConnection",
  "fqn": "pulumi_aiven",
  "classes": {
   "aiven:index/azureVpcPeeringConnection:AzureVpcPeeringConnection": "AzureVpcPeeringConnection"
  }
 },
 {
  "pkg": "aiven",
  "mod": "index/billingGroup",
  "fqn": "pulumi_aiven",
  "classes": {
   "aiven:index/billingGroup:BillingGroup": "BillingGroup"
  }
 },
 {
  "pkg": "aiven",
  "mod": "index/cassandra",
  "fqn": "pulumi_aiven",
  "classes": {
   "aiven:index/cassandra:Cassandra": "Cassandra"
  }
 },
 {
  "pkg": "aiven",
  "mod": "index/cassandraUser",
  "fqn": "pulumi_aiven",
  "classes": {
   "aiven:index/cassandraUser:CassandraUser": "CassandraUser"
  }
 },
 {
  "pkg": "aiven",
  "mod": "index/clickhouse",
  "fqn": "pulumi_aiven",
  "classes": {
   "aiven:index/clickhouse:Clickhouse": "Clickhouse"
  }
 },
 {
  "pkg": "aiven",
  "mod": "index/clickhouseDatabase",
  "fqn": "pulumi_aiven",
  "classes": {
   "aiven:index/clickhouseDatabase:ClickhouseDatabase": "ClickhouseDatabase"
  }
 },
 {
  "pkg": "aiven",
  "mod": "index/clickhouseGrant",
  "fqn": "pulumi_aiven",
  "classes": {
   "aiven:index/clickhouseGrant:ClickhouseGrant": "ClickhouseGrant"
  }
 },
 {
  "pkg": "aiven",
  "mod": "index/clickhouseRole",
  "fqn": "pulumi_aiven",
  "classes": {
   "aiven:index/clickhouseRole:ClickhouseRole": "ClickhouseRole"
  }
 },
 {
  "pkg": "aiven",
  "mod": "index/clickhouseUser",
  "fqn": "pulumi_aiven",
  "classes": {
   "aiven:index/clickhouseUser:ClickhouseUser": "ClickhouseUser"
  }
 },
 {
  "pkg": "aiven",
  "mod": "index/connectionPool",
  "fqn": "pulumi_aiven",
  "classes": {
   "aiven:index/connectionPool:ConnectionPool": "ConnectionPool"
  }
 },
 {
  "pkg": "aiven",
  "mod": "index/dragonfly",
  "fqn": "pulumi_aiven",
  "classes": {
   "aiven:index/dragonfly:Dragonfly": "Dragonfly"
  }
 },
 {
  "pkg": "aiven",
  "mod": "index/flink",
  "fqn": "pulumi_aiven",
  "classes": {
   "aiven:index/flink:Flink": "Flink"
  }
 },
 {
  "pkg": "aiven",
  "mod": "index/flinkApplication",
  "fqn": "pulumi_aiven",
  "classes": {
   "aiven:index/flinkApplication:FlinkApplication": "FlinkApplication"
  }
 },
 {
  "pkg": "aiven",
  "mod": "index/flinkApplicationDeployment",
  "fqn": "pulumi_aiven",
  "classes": {
   "aiven:index/flinkApplicationDeployment:FlinkApplicationDeployment": "FlinkApplicationDeployment"
  }
 },
 {
  "pkg": "aiven",
  "mod": "index/flinkApplicationVersion",
  "fqn": "pulumi_aiven",
  "classes": {
   "aiven:index/flinkApplicationVersion:FlinkApplicationVersion": "FlinkApplicationVersion"
  }
 },
 {
  "pkg": "aiven",
  "mod": "index/flinkJarApplication",
  "fqn": "pulumi_aiven",
  "classes": {
   "aiven:index/flinkJarApplication:FlinkJarApplication": "FlinkJarApplication"
  }
 },
 {
  "pkg": "aiven",
  "mod": "index/flinkJarApplicationDeployment",
  "fqn": "pulumi_aiven",
  "classes": {
   "aiven:index/flinkJarApplicationDeployment:FlinkJarApplicationDeployment": "FlinkJarApplicationDeployment"
  }
 },
 {
  "pkg": "aiven",
  "mod": "index/flinkJarApplicationVersion",
  "fqn": "pulumi_aiven",
  "classes": {
   "aiven:index/flinkJarApplicationVersion:FlinkJarApplicationVersion": "FlinkJarApplicationVersion"
  }
 },
 {
  "pkg": "aiven",
  "mod": "index/gcpOrgVpcPeeringConnection",
  "fqn": "pulumi_aiven",
  "classes": {
   "aiven:index/gcpOrgVpcPeeringConnection:GcpOrgVpcPeeringConnection": "GcpOrgVpcPeeringConnection"
  }
 },
 {
  "pkg": "aiven",
  "mod": "index/gcpPrivatelink",
  "fqn": "pulumi_aiven",
  "classes": {
   "aiven:index/gcpPrivatelink:GcpPrivatelink": "GcpPrivatelink"
  }
 },
 {
  "pkg": "aiven",
  "mod": "index/gcpPrivatelinkConnectionApproval",
  "fqn": "pulumi_aiven",
  "classes": {
   "aiven:index/gcpPrivatelinkConnectionApproval:GcpPrivatelinkConnectionApproval": "GcpPrivatelinkConnectionApproval"
  }
 },
 {
  "pkg": "aiven",
  "mod": "index/gcpVpcPeeringConnection",
  "fqn": "pulumi_aiven",
  "classes": {
   "aiven:index/gcpVpcPeeringConnection:GcpVpcPeeringConnection": "GcpVpcPeeringConnection"
  }
 },
 {
  "pkg": "aiven",
  "mod": "index/governanceAccess",
  "fqn": "pulumi_aiven",
  "classes": {
   "aiven:index/governanceAccess:GovernanceAccess": "GovernanceAccess"
  }
 },
 {
  "pkg": "aiven",
  "mod": "index/grafana",
  "fqn": "pulumi_aiven",
  "classes": {
   "aiven:index/grafana:Grafana": "Grafana"
  }
 },
 {
  "pkg": "aiven",
  "mod": "index/influxDb",
  "fqn": "pulumi_aiven",
  "classes": {
   "aiven:index/influxDb:InfluxDb": "InfluxDb"
  }
 },
 {
  "pkg": "aiven",
  "mod": "index/influxdbDatabase",
  "fqn": "pulumi_aiven",
  "classes": {
   "aiven:index/influxdbDatabase:InfluxdbDatabase": "InfluxdbDatabase"
  }
 },
 {
  "pkg": "aiven",
  "mod": "index/influxdbUser",
  "fqn": "pulumi_aiven",
  "classes": {
   "aiven:index/influxdbUser:InfluxdbUser": "InfluxdbUser"
  }
 },
 {
  "pkg": "aiven",
  "mod": "index/kafka",
  "fqn": "pulumi_aiven",
  "classes": {
   "aiven:index/kafka:Kafka": "Kafka"
  }
 },
 {
  "pkg": "aiven",
  "mod": "index/kafkaAcl",
  "fqn": "pulumi_aiven",
  "classes": {
   "aiven:index/kafkaAcl:KafkaAcl": "KafkaAcl"
  }
 },
 {
  "pkg": "aiven",
  "mod": "index/kafkaConnect",
  "fqn": "pulumi_aiven",
  "classes": {
   "aiven:index/kafkaConnect:KafkaConnect": "KafkaConnect"
  }
 },
 {
  "pkg": "aiven",
  "mod": "index/kafkaConnector",
  "fqn": "pulumi_aiven",
  "classes": {
   "aiven:index/kafkaConnector:KafkaConnector": "KafkaConnector"
  }
 },
 {
  "pkg": "aiven",
  "mod": "index/kafkaMirrorMaker",
  "fqn": "pulumi_aiven",
  "classes": {
   "aiven:index/kafkaMirrorMaker:KafkaMirrorMaker": "KafkaMirrorMaker"
  }
 },
 {
  "pkg": "aiven",
  "mod": "index/kafkaNativeAcl",
  "fqn": "pulumi_aiven",
  "classes": {
   "aiven:index/kafkaNativeAcl:KafkaNativeAcl": "KafkaNativeAcl"
  }
 },
 {
  "pkg": "aiven",
  "mod": "index/kafkaQuota",
  "fqn": "pulumi_aiven",
  "classes": {
   "aiven:index/kafkaQuota:KafkaQuota": "KafkaQuota"
  }
 },
 {
  "pkg": "aiven",
  "mod": "index/kafkaSchema",
  "fqn": "pulumi_aiven",
  "classes": {
   "aiven:index/kafkaSchema:KafkaSchema": "KafkaSchema"
  }
 },
 {
  "pkg": "aiven",
  "mod": "index/kafkaSchemaConfiguration",
  "fqn": "pulumi_aiven",
  "classes": {
   "aiven:index/kafkaSchemaConfiguration:KafkaSchemaConfiguration": "KafkaSchemaConfiguration"
  }
 },
 {
  "pkg": "aiven",
  "mod": "index/kafkaSchemaRegistryAcl",
  "fqn": "pulumi_aiven",
  "classes": {
   "aiven:index/kafkaSchemaRegistryAcl:KafkaSchemaRegistryAcl": "KafkaSchemaRegistryAcl"
  }
 },
 {
  "pkg": "aiven",
  "mod": "index/kafkaTopic",
  "fqn": "pulumi_aiven",
  "classes": {
   "aiven:index/kafkaTopic:KafkaTopic": "KafkaTopic"
  }
 },
 {
  "pkg": "aiven",
  "mod": "index/kafkaUser",
  "fqn": "pulumi_aiven",
  "classes": {
   "aiven:index/kafkaUser:KafkaUser": "KafkaUser"
  }
 },
 {
  "pkg": "aiven",
  "mod": "index/m3Aggregator",
  "fqn": "pulumi_aiven",
  "classes": {
   "aiven:index/m3Aggregator:M3Aggregator": "M3Aggregator"
  }
 },
 {
  "pkg": "aiven",
  "mod": "index/m3Db",
  "fqn": "pulumi_aiven",
  "classes": {
   "aiven:index/m3Db:M3Db": "M3Db"
  }
 },
 {
  "pkg": "aiven",
  "mod": "index/m3dbUser",
  "fqn": "pulumi_aiven",
  "classes": {
   "aiven:index/m3dbUser:M3dbUser": "M3dbUser"
  }
 },
 {
  "pkg": "aiven",
  "mod": "index/mirrorMakerReplicationFlow",
  "fqn": "pulumi_aiven",
  "classes": {
   "aiven:index/mirrorMakerReplicationFlow:MirrorMakerReplicationFlow": "MirrorMakerReplicationFlow"
  }
 },
 {
  "pkg": "aiven",
  "mod": "index/mySql",
  "fqn": "pulumi_aiven",
  "classes": {
   "aiven:index/mySql:MySql": "MySql"
  }
 },
 {
  "pkg": "aiven",
  "mod": "index/mysqlDatabase",
  "fqn": "pulumi_aiven",
  "classes": {
   "aiven:index/mysqlDatabase:MysqlDatabase": "MysqlDatabase"
  }
 },
 {
  "pkg": "aiven",
  "mod": "index/mysqlUser",
  "fqn": "pulumi_aiven",
  "classes": {
   "aiven:index/mysqlUser:MysqlUser": "MysqlUser"
  }
 },
 {
  "pkg": "aiven",
  "mod": "index/openSearch",
  "fqn": "pulumi_aiven",
  "classes": {
   "aiven:index/openSearch:OpenSearch": "OpenSearch"
  }
 },
 {
  "pkg": "aiven",
  "mod": "index/openSearchAclConfig",
  "fqn": "pulumi_aiven",
  "classes": {
   "aiven:index/openSearchAclConfig:OpenSearchAclConfig": "OpenSearchAclConfig"
  }
 },
 {
  "pkg": "aiven",
  "mod": "index/openSearchAclRule",
  "fqn": "pulumi_aiven",
  "classes": {
   "aiven:index/openSearchAclRule:OpenSearchAclRule": "OpenSearchAclRule"
  }
 },
 {
  "pkg": "aiven",
  "mod": "index/opensearchSecurityPluginConfig",
  "fqn": "pulumi_aiven",
  "classes": {
   "aiven:index/opensearchSecurityPluginConfig:OpensearchSecurityPluginConfig": "OpensearchSecurityPluginConfig"
  }
 },
 {
  "pkg": "aiven",
  "mod": "index/opensearchUser",
  "fqn": "pulumi_aiven",
  "classes": {
   "aiven:index/opensearchUser:OpensearchUser": "OpensearchUser"
  }
 },
 {
  "pkg": "aiven",
  "mod": "index/organization",
  "fqn": "pulumi_aiven",
  "classes": {
   "aiven:index/organization:Organization": "Organization"
  }
 },
 {
  "pkg": "aiven",
  "mod": "index/organizationAddress",
  "fqn": "pulumi_aiven",
  "classes": {
   "aiven:index/organizationAddress:OrganizationAddress": "OrganizationAddress"
  }
 },
 {
  "pkg": "aiven",
  "mod": "index/organizationApplicationUser",
  "fqn": "pulumi_aiven",
  "classes": {
   "aiven:index/organizationApplicationUser:OrganizationApplicationUser": "OrganizationApplicationUser"
  }
 },
 {
  "pkg": "aiven",
  "mod": "index/organizationApplicationUserToken",
  "fqn": "pulumi_aiven",
  "classes": {
   "aiven:index/organizationApplicationUserToken:OrganizationApplicationUserToken": "OrganizationApplicationUserToken"
  }
 },
 {
  "pkg": "aiven",
  "mod": "index/organizationBillingGroup",
  "fqn": "pulumi_aiven",
  "classes": {
   "aiven:index/organizationBillingGroup:OrganizationBillingGroup": "OrganizationBillingGroup"
  }
 },
 {
  "pkg": "aiven",
  "mod": "index/organizationGroupProject",
  "fqn": "pulumi_aiven",
  "classes": {
   "aiven:index/organizationGroupProject:OrganizationGroupProject": "OrganizationGroupProject"
  }
 },
 {
  "pkg": "aiven",
  "mod": "index/organizationPermission",
  "fqn": "pulumi_aiven",
  "classes": {
   "aiven:index/organizationPermission:OrganizationPermission": "OrganizationPermission"
  }
 },
 {
  "pkg": "aiven",
  "mod": "index/organizationProject",
  "fqn": "pulumi_aiven",
  "classes": {
   "aiven:index/organizationProject:OrganizationProject": "OrganizationProject"
  }
 },
 {
  "pkg": "aiven",
  "mod": "index/organizationUser",
  "fqn": "pulumi_aiven",
  "classes": {
   "aiven:index/organizationUser:OrganizationUser": "OrganizationUser"
  }
 },
 {
  "pkg": "aiven",
  "mod": "index/organizationUserGroup",
  "fqn": "pulumi_aiven",
  "classes": {
   "aiven:index/organizationUserGroup:OrganizationUserGroup": "OrganizationUserGroup"
  }
 },
 {
  "pkg": "aiven",
  "mod": "index/organizationUserGroupMember",
  "fqn": "pulumi_aiven",
  "classes": {
   "aiven:index/organizationUserGroupMember:OrganizationUserGroupMember": "OrganizationUserGroupMember"
  }
 },
 {
  "pkg": "aiven",
  "mod": "index/organizationVpc",
  "fqn": "pulumi_aiven",
  "classes": {
   "aiven:index/organizationVpc:OrganizationVpc": "OrganizationVpc"
  }
 },
 {
  "pkg": "aiven",
  "mod": "index/organizationalUnit",
  "fqn": "pulumi_aiven",
  "classes": {
   "aiven:index/organizationalUnit:OrganizationalUnit": "OrganizationalUnit"
  }
 },
 {
  "pkg": "aiven",
  "mod": "index/pg",
  "fqn": "pulumi_aiven",
  "classes": {
   "aiven:index/pg:Pg": "Pg"
  }
 },
 {
  "pkg": "aiven",
  "mod": "index/pgDatabase",
  "fqn": "pulumi_aiven",
  "classes": {
   "aiven:index/pgDatabase:PgDatabase": "PgDatabase"
  }
 },
 {
  "pkg": "aiven",
  "mod": "index/pgUser",
  "fqn": "pulumi_aiven",
  "classes": {
   "aiven:index/pgUser:PgUser": "PgUser"
  }
 },
 {
  "pkg": "aiven",
  "mod": "index/project",
  "fqn": "pulumi_aiven",
  "classes": {
   "aiven:index/project:Project": "Project"
  }
 },
 {
  "pkg": "aiven",
  "mod": "index/projectUser",
  "fqn": "pulumi_aiven",
  "classes": {
   "aiven:index/projectUser:ProjectUser": "ProjectUser"
  }
 },
 {
  "pkg": "aiven",
  "mod": "index/projectVpc",
  "fqn": "pulumi_aiven",
  "classes": {
   "aiven:index/projectVpc:ProjectVpc": "ProjectVpc"
  }
 },
 {
  "pkg": "aiven",
  "mod": "index/redis",
  "fqn": "pulumi_aiven",
  "classes": {
   "aiven:index/redis:Redis": "Redis"
  }
 },
 {
  "pkg": "aiven",
  "mod": "index/redisUser",
  "fqn": "pulumi_aiven",
  "classes": {
   "aiven:index/redisUser:RedisUser": "RedisUser"
  }
 },
 {
  "pkg": "aiven",
  "mod": "index/serviceIntegration",
  "fqn": "pulumi_aiven",
  "classes": {
   "aiven:index/serviceIntegration:ServiceIntegration": "ServiceIntegration"
  }
 },
 {
  "pkg": "aiven",
  "mod": "index/serviceIntegrationEndpoint",
  "fqn": "pulumi_aiven",
  "classes": {
   "aiven:index/serviceIntegrationEndpoint:ServiceIntegrationEndpoint": "ServiceIntegrationEndpoint"
  }
 },
 {
  "pkg": "aiven",
  "mod": "index/staticIp",
  "fqn": "pulumi_aiven",
  "classes": {
   "aiven:index/staticIp:StaticIp": "StaticIp"
  }
 },
 {
  "pkg": "aiven",
  "mod": "index/thanos",
  "fqn": "pulumi_aiven",
  "classes": {
   "aiven:index/thanos:Thanos": "Thanos"
  }
 },
 {
  "pkg": "aiven",
  "mod": "index/transitGatewayVpcAttachment",
  "fqn": "pulumi_aiven",
  "classes": {
   "aiven:index/transitGatewayVpcAttachment:TransitGatewayVpcAttachment": "TransitGatewayVpcAttachment"
  }
 },
 {
  "pkg": "aiven",
  "mod": "index/valkey",
  "fqn": "pulumi_aiven",
  "classes": {
   "aiven:index/valkey:Valkey": "Valkey"
  }
 },
 {
  "pkg": "aiven",
  "mod": "index/valkeyUser",
  "fqn": "pulumi_aiven",
  "classes": {
   "aiven:index/valkeyUser:ValkeyUser": "ValkeyUser"
  }
 }
]
""",
    resource_packages="""
[
 {
  "pkg": "aiven",
  "token": "pulumi:providers:aiven",
  "fqn": "pulumi_aiven",
  "class": "Provider"
 }
]
"""
)
