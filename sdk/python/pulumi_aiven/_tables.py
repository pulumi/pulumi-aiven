# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

SNAKE_TO_CAMEL_CASE_TABLE = {
    "access_cert": "accessCert",
    "access_key": "accessKey",
    "account_id": "accountId",
    "api_token": "apiToken",
    "authentication_id": "authenticationId",
    "billing_address": "billingAddress",
    "billing_emails": "billingEmails",
    "ca_cert": "caCert",
    "card_id": "cardId",
    "cassandra_user_config": "cassandraUserConfig",
    "cleanup_policy": "cleanupPolicy",
    "cloud_name": "cloudName",
    "compatibility_level": "compatibilityLevel",
    "connection_uri": "connectionUri",
    "connector_name": "connectorName",
    "copy_from_project": "copyFromProject",
    "country_code": "countryCode",
    "create_time": "createTime",
    "database_name": "databaseName",
    "datadog_user_config": "datadogUserConfig",
    "default_acl": "defaultAcl",
    "destination_endpoint_id": "destinationEndpointId",
    "destination_service_name": "destinationServiceName",
    "elasticsearch_user_config": "elasticsearchUserConfig",
    "endpoint_config": "endpointConfig",
    "endpoint_name": "endpointName",
    "endpoint_type": "endpointType",
    "extended_acl": "extendedAcl",
    "external_elasticsearch_logs_user_config": "externalElasticsearchLogsUserConfig",
    "grafana_user_config": "grafanaUserConfig",
    "influxdb_user_config": "influxdbUserConfig",
    "integration_type": "integrationType",
    "invited_by_user_email": "invitedByUserEmail",
    "kafka_connect": "kafkaConnect",
    "kafka_connect_user_config": "kafkaConnectUserConfig",
    "kafka_mirrormaker": "kafkaMirrormaker",
    "kafka_mirrormaker_user_config": "kafkaMirrormakerUserConfig",
    "kafka_user_config": "kafkaUserConfig",
    "lc_collate": "lcCollate",
    "lc_ctype": "lcCtype",
    "logs_user_config": "logsUserConfig",
    "maintenance_window_dow": "maintenanceWindowDow",
    "maintenance_window_time": "maintenanceWindowTime",
    "member_type": "memberType",
    "minimum_in_sync_replicas": "minimumInSyncReplicas",
    "mirrormaker_user_config": "mirrormakerUserConfig",
    "mysql_user_config": "mysqlUserConfig",
    "network_cidr": "networkCidr",
    "owner_team_id": "ownerTeamId",
    "peer_azure_app_id": "peerAzureAppId",
    "peer_azure_tenant_id": "peerAzureTenantId",
    "peer_cloud_account": "peerCloudAccount",
    "peer_region": "peerRegion",
    "peer_resource_group": "peerResourceGroup",
    "peer_vpc": "peerVpc",
    "peering_connection_id": "peeringConnectionId",
    "pg_user_config": "pgUserConfig",
    "plugin_author": "pluginAuthor",
    "plugin_class": "pluginClass",
    "plugin_doc_url": "pluginDocUrl",
    "plugin_title": "pluginTitle",
    "plugin_type": "pluginType",
    "plugin_version": "pluginVersion",
    "pool_mode": "poolMode",
    "pool_name": "poolName",
    "pool_size": "poolSize",
    "project_name": "projectName",
    "project_vpc_id": "projectVpcId",
    "prometheus_user_config": "prometheusUserConfig",
    "redis_user_config": "redisUserConfig",
    "retention_bytes": "retentionBytes",
    "retention_hours": "retentionHours",
    "rsyslog_user_config": "rsyslogUserConfig",
    "saml_acs_url": "samlAcsUrl",
    "saml_certificate": "samlCertificate",
    "saml_entity_id": "samlEntityId",
    "saml_idp_url": "samlIdpUrl",
    "saml_metadata_url": "samlMetadataUrl",
    "service_host": "serviceHost",
    "service_integrations": "serviceIntegrations",
    "service_name": "serviceName",
    "service_password": "servicePassword",
    "service_port": "servicePort",
    "service_type": "serviceType",
    "service_uri": "serviceUri",
    "service_username": "serviceUsername",
    "source_cluster": "sourceCluster",
    "source_endpoint_id": "sourceEndpointId",
    "source_service_name": "sourceServiceName",
    "state_info": "stateInfo",
    "subject_name": "subjectName",
    "target_cluster": "targetCluster",
    "team_id": "teamId",
    "team_type": "teamType",
    "technical_emails": "technicalEmails",
    "tenant_id": "tenantId",
    "termination_protection": "terminationProtection",
    "topic_name": "topicName",
    "topics_blacklists": "topicsBlacklists",
    "update_time": "updateTime",
    "user_email": "userEmail",
    "user_peer_network_cidrs": "userPeerNetworkCidrs",
    "vpc_id": "vpcId",
}

CAMEL_TO_SNAKE_CASE_TABLE = {
    "accessCert": "access_cert",
    "accessKey": "access_key",
    "accountId": "account_id",
    "apiToken": "api_token",
    "authenticationId": "authentication_id",
    "billingAddress": "billing_address",
    "billingEmails": "billing_emails",
    "caCert": "ca_cert",
    "cardId": "card_id",
    "cassandraUserConfig": "cassandra_user_config",
    "cleanupPolicy": "cleanup_policy",
    "cloudName": "cloud_name",
    "compatibilityLevel": "compatibility_level",
    "connectionUri": "connection_uri",
    "connectorName": "connector_name",
    "copyFromProject": "copy_from_project",
    "countryCode": "country_code",
    "createTime": "create_time",
    "databaseName": "database_name",
    "datadogUserConfig": "datadog_user_config",
    "defaultAcl": "default_acl",
    "destinationEndpointId": "destination_endpoint_id",
    "destinationServiceName": "destination_service_name",
    "elasticsearchUserConfig": "elasticsearch_user_config",
    "endpointConfig": "endpoint_config",
    "endpointName": "endpoint_name",
    "endpointType": "endpoint_type",
    "extendedAcl": "extended_acl",
    "externalElasticsearchLogsUserConfig": "external_elasticsearch_logs_user_config",
    "grafanaUserConfig": "grafana_user_config",
    "influxdbUserConfig": "influxdb_user_config",
    "integrationType": "integration_type",
    "invitedByUserEmail": "invited_by_user_email",
    "kafkaConnect": "kafka_connect",
    "kafkaConnectUserConfig": "kafka_connect_user_config",
    "kafkaMirrormaker": "kafka_mirrormaker",
    "kafkaMirrormakerUserConfig": "kafka_mirrormaker_user_config",
    "kafkaUserConfig": "kafka_user_config",
    "lcCollate": "lc_collate",
    "lcCtype": "lc_ctype",
    "logsUserConfig": "logs_user_config",
    "maintenanceWindowDow": "maintenance_window_dow",
    "maintenanceWindowTime": "maintenance_window_time",
    "memberType": "member_type",
    "minimumInSyncReplicas": "minimum_in_sync_replicas",
    "mirrormakerUserConfig": "mirrormaker_user_config",
    "mysqlUserConfig": "mysql_user_config",
    "networkCidr": "network_cidr",
    "ownerTeamId": "owner_team_id",
    "peerAzureAppId": "peer_azure_app_id",
    "peerAzureTenantId": "peer_azure_tenant_id",
    "peerCloudAccount": "peer_cloud_account",
    "peerRegion": "peer_region",
    "peerResourceGroup": "peer_resource_group",
    "peerVpc": "peer_vpc",
    "peeringConnectionId": "peering_connection_id",
    "pgUserConfig": "pg_user_config",
    "pluginAuthor": "plugin_author",
    "pluginClass": "plugin_class",
    "pluginDocUrl": "plugin_doc_url",
    "pluginTitle": "plugin_title",
    "pluginType": "plugin_type",
    "pluginVersion": "plugin_version",
    "poolMode": "pool_mode",
    "poolName": "pool_name",
    "poolSize": "pool_size",
    "projectName": "project_name",
    "projectVpcId": "project_vpc_id",
    "prometheusUserConfig": "prometheus_user_config",
    "redisUserConfig": "redis_user_config",
    "retentionBytes": "retention_bytes",
    "retentionHours": "retention_hours",
    "rsyslogUserConfig": "rsyslog_user_config",
    "samlAcsUrl": "saml_acs_url",
    "samlCertificate": "saml_certificate",
    "samlEntityId": "saml_entity_id",
    "samlIdpUrl": "saml_idp_url",
    "samlMetadataUrl": "saml_metadata_url",
    "serviceHost": "service_host",
    "serviceIntegrations": "service_integrations",
    "serviceName": "service_name",
    "servicePassword": "service_password",
    "servicePort": "service_port",
    "serviceType": "service_type",
    "serviceUri": "service_uri",
    "serviceUsername": "service_username",
    "sourceCluster": "source_cluster",
    "sourceEndpointId": "source_endpoint_id",
    "sourceServiceName": "source_service_name",
    "stateInfo": "state_info",
    "subjectName": "subject_name",
    "targetCluster": "target_cluster",
    "teamId": "team_id",
    "teamType": "team_type",
    "technicalEmails": "technical_emails",
    "tenantId": "tenant_id",
    "terminationProtection": "termination_protection",
    "topicName": "topic_name",
    "topicsBlacklists": "topics_blacklists",
    "updateTime": "update_time",
    "userEmail": "user_email",
    "userPeerNetworkCidrs": "user_peer_network_cidrs",
    "vpcId": "vpc_id",
}