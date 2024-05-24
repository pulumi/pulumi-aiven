// Copyright 2016-2018, Pulumi Corporation.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package aiven

import (
	"context"
	"fmt"
	"path/filepath"
	"unicode"

	// embed is used to store bridge-metadata.json in the compiled binary
	_ "embed"

	providerShim "github.com/aiven/terraform-provider-aiven/shim"

	pfbridge "github.com/pulumi/pulumi-terraform-bridge/pf/tfbridge"
	"github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfbridge"
	tfbridgetokens "github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfbridge/tokens"
	shimv2 "github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfshim/sdk-v2"
	"github.com/pulumi/pulumi/sdk/v3/go/common/tokens"

	"github.com/pulumi/pulumi-aiven/provider/v6/pkg/version"
)

// all of the token components used below.
const (
	// packages:
	mainPkg = "aiven"
	// modules:
	mainMod = "index" // the y module
)

// makeMember manufactures a type token for the package and the given module and type.
func makeMember(mod string, mem string) tokens.ModuleMember {
	return tokens.ModuleMember(mainPkg + ":" + mod + ":" + mem)
}

// makeType manufactures a type token for the package and the given module and type.
func makeType(mod string, typ string) tokens.Type {
	return tokens.Type(makeMember(mod, typ))
}

// makeDataSource manufactures a standard resource token given a module and resource name.  It
// automatically uses the main package and names the file by simply lower casing the data source's
// first character.
func makeDataSource(mod string, res string) tokens.ModuleMember {
	fn := string(unicode.ToLower(rune(res[0]))) + res[1:]
	return makeMember(mod+"/"+fn, res)
}

// makeResource manufactures a standard resource token given a module and resource name.  It
// automatically uses the main package and names the file by simply lower casing the resource's
// first character.
func makeResource(mod string, res string) tokens.Type {
	fn := string(unicode.ToLower(rune(res[0]))) + res[1:]
	return makeType(mod+"/"+fn, res)
}

func ref[T any](val T) *T { return &val }

func Provider(ctx context.Context) tfbridge.ProviderInfo {
	p := pfbridge.MuxShimWithDisjointgPF(ctx,
		shimv2.NewProvider(providerShim.NewProvider(version.Version)),
		providerShim.NewPFProvider(version.Version))

	prov := tfbridge.ProviderInfo{
		P:                 p,
		Name:              "aiven",
		GitHubOrg:         "aiven",
		Description:       "A Pulumi package for creating and managing Aiven cloud resources.",
		Keywords:          []string{"pulumi", "aiven"},
		License:           "Apache-2.0",
		Homepage:          "https://pulumi.io",
		Repository:        "https://github.com/pulumi/pulumi-aiven",
		TFProviderLicense: ref(tfbridge.MITLicenseType),
		UpstreamRepoPath:  "./upstream",
		Version:           version.Version,
		MetadataInfo:      tfbridge.NewProviderMetadata(metadata),
		Config: map[string]*tfbridge.SchemaInfo{
			"api_token": {Secret: tfbridge.True()},
		},
		Resources: map[string]*tfbridge.ResourceInfo{
			"aiven_account":                               {Tok: makeResource(mainMod, "Account")},
			"aiven_account_authentication":                {Tok: makeResource(mainMod, "AccountAuthentication")},
			"aiven_account_team":                          {Tok: makeResource(mainMod, "AccountTeam")},
			"aiven_account_team_member":                   {Tok: makeResource(mainMod, "AccountTeamMember")},
			"aiven_account_team_project":                  {Tok: makeResource(mainMod, "AccountTeamProject")},
			"aiven_azure_privatelink":                     {Tok: makeResource(mainMod, "AzurePrivatelink")},
			"aiven_azure_privatelink_connection_approval": {Tok: makeResource(mainMod, "AzurePrivatelinkConnectionApproval")},
			"aiven_gcp_privatelink": {
				Tok: makeResource(mainMod, "GcpPrivatelink"),
				Docs: &tfbridge.DocInfo{
					Markdown: []byte(" "),
				},
			},
			"aiven_gcp_privatelink_connection_approval": {
				Tok: makeResource(mainMod, "GcpPrivatelinkConnectionApproval"),
				Docs: &tfbridge.DocInfo{
					Markdown: []byte(" "),
				},
			},
			"aiven_billing_group":   {Tok: makeResource(mainMod, "BillingGroup")},
			"aiven_connection_pool": {Tok: makeResource(mainMod, "ConnectionPool")},
			"aiven_clickhouse": {
				Tok:    makeResource(mainMod, "Clickhouse"),
				Fields: map[string]*tfbridge.SchemaInfo{"clickhouse": {CSharpName: "ClickhouseServer"}},
			},
			"aiven_clickhouse_database": {Tok: makeResource(mainMod, "ClickhouseDatabase")},
			"aiven_clickhouse_grant":    {Tok: makeResource(mainMod, "ClickhouseGrant")},
			"aiven_clickhouse_role":     {Tok: makeResource(mainMod, "ClickhouseRole")},
			"aiven_clickhouse_user":     {Tok: makeResource(mainMod, "ClickhouseUser")},
			"aiven_grafana": {
				Tok: makeResource(mainMod, "Grafana"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"service_name": tfbridge.AutoName("serviceName", 255, "-"),
					"grafana":      {CSharpName: "GrafanaServer"},
				},
			},
			"aiven_influxdb": {
				Tok:  makeResource(mainMod, "InfluxDb"),
				Docs: &tfbridge.DocInfo{AllowMissing: true},
			},
			"aiven_kafka": {
				Tok: makeResource(mainMod, "Kafka"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"kafka": {CSharpName: "KafkaServer"},
				},
			},
			"aiven_kafka_acl":                    {Tok: makeResource(mainMod, "KafkaAcl")},
			"aiven_kafka_connector":              {Tok: makeResource(mainMod, "KafkaConnector")},
			"aiven_kafka_mirrormaker":            {Tok: makeResource(mainMod, "KafkaMirrorMaker")},
			"aiven_kafka_schema":                 {Tok: makeResource(mainMod, "KafkaSchema")},
			"aiven_kafka_schema_configuration":   {Tok: makeResource(mainMod, "KafkaSchemaConfiguration")},
			"aiven_kafka_topic":                  {Tok: makeResource(mainMod, "KafkaTopic")},
			"aiven_mirrormaker_replication_flow": {Tok: makeResource(mainMod, "MirrorMakerReplicationFlow")},
			"aiven_mysql":                        {Tok: makeResource(mainMod, "MySql")},
			"aiven_pg": {
				Tok: makeResource(mainMod, "Pg"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"pg":           {CSharpName: "PgServer"},
					"service_name": tfbridge.AutoName("serviceName", 255, "-"),
				},
			},
			"aiven_project": {
				Tok: makeResource(mainMod, "Project"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"project": {
						CSharpName: "ProjectName",
					},
				},
			},
			"aiven_project_user":                   {Tok: makeResource(mainMod, "ProjectUser")},
			"aiven_project_vpc":                    {Tok: makeResource(mainMod, "ProjectVpc")},
			"aiven_service_integration":            {Tok: makeResource(mainMod, "ServiceIntegration")},
			"aiven_service_integration_endpoint":   {Tok: makeResource(mainMod, "ServiceIntegrationEndpoint")},
			"aiven_transit_gateway_vpc_attachment": {Tok: makeResource(mainMod, "TransitGatewayVpcAttachment")},
			"aiven_m3aggregator":                   {Tok: makeResource(mainMod, "M3Aggregator")},
			"aiven_m3db":                           {Tok: makeResource(mainMod, "M3Db")},
			"aiven_aws_privatelink":                {Tok: makeResource(mainMod, "AwsPrivatelink")},
			"aiven_opensearch":                     {Tok: makeResource(mainMod, "OpenSearch")},
			"aiven_opensearch_acl_config":          {Tok: makeResource(mainMod, "OpenSearchAclConfig")},
			"aiven_opensearch_acl_rule":            {Tok: makeResource(mainMod, "OpenSearchAclRule")},
			"aiven_flink": {
				Tok: makeResource(mainMod, "Flink"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"flink": {
						CSharpName: "FlinkDetails",
					},
				},
			},
			"aiven_flink_application_deployment": {
				Tok: makeResource(mainMod, "FlinkApplicationDeployment"),
				Docs: &tfbridge.DocInfo{
					Markdown: []byte(" "),
				},
			},
			"aiven_static_ip":                    {Tok: makeResource(mainMod, "StaticIp")},
			"aiven_aws_vpc_peering_connection":   {Tok: makeResource(mainMod, "AwsVpcPeeringConnection")},
			"aiven_azure_vpc_peering_connection": {Tok: makeResource(mainMod, "AzureVpcPeeringConnection")},
			"aiven_gcp_vpc_peering_connection":   {Tok: makeResource(mainMod, "GcpVpcPeeringConnection")},
			"aiven_cassandra": {
				Fields: map[string]*tfbridge.SchemaInfo{"cassandra": {CSharpName: "CassandraServer"}},
			},
			"aiven_cassandra_user": {Tok: makeResource(mainMod, "CassandraUser")},
			"aiven_dragonfly": {
				Fields: map[string]*tfbridge.SchemaInfo{"dragonfly": {CSharpName: "DragonflyServer"}},
			},
			"aiven_redis": {
				Fields: map[string]*tfbridge.SchemaInfo{"redis": {CSharpName: "RedisServer"}},
			},
			"aiven_influxdb_database": {
				Tok:  makeResource(mainMod, "InfluxdbDatabase"),
				Docs: &tfbridge.DocInfo{AllowMissing: true},
			},
			"aiven_influxdb_user": {
				Tok:  makeResource(mainMod, "InfluxdbUser"),
				Docs: &tfbridge.DocInfo{AllowMissing: true},
			},
			"aiven_m3db_user":                 {Tok: makeResource(mainMod, "M3dbUser")},
			"aiven_kafka_schema_registry_acl": {Tok: makeResource(mainMod, "KafkaSchemaRegistryAcl")},
		},
		DataSources: map[string]*tfbridge.DataSourceInfo{
			"aiven_account_authentication": {Tok: makeDataSource(mainMod, "getAccountAuthentication")},
			"aiven_connection_pool":        {Tok: makeDataSource(mainMod, "getConnectionPool")},
			"aiven_grafana":                {Tok: makeDataSource(mainMod, "getGrafana")},
			"aiven_influxdb": {
				Tok:  makeDataSource(mainMod, "getInfluxDb"),
				Docs: &tfbridge.DocInfo{AllowMissing: true},
			},
			"aiven_kafka":                          {Tok: makeDataSource(mainMod, "getKafka")},
			"aiven_kafka_acl":                      {Tok: makeDataSource(mainMod, "getKafkaAcl")},
			"aiven_kafka_topic":                    {Tok: makeDataSource(mainMod, "getKafkaTopic")},
			"aiven_kafka_connect":                  {Tok: makeDataSource(mainMod, "getKafkaConnect")},
			"aiven_kafka_connector":                {Tok: makeDataSource(mainMod, "getKafkaConnector")},
			"aiven_kafka_mirrormaker":              {Tok: makeDataSource(mainMod, "getKafkaMirrorMaker")},
			"aiven_kafka_schema":                   {Tok: makeDataSource(mainMod, "getKafkaSchema")},
			"aiven_kafka_schema_configuration":     {Tok: makeDataSource(mainMod, "getKafkaSchemaConfiguration")},
			"aiven_mirrormaker_replication_flow":   {Tok: makeDataSource(mainMod, "getMirrorMakerReplicationFlow")},
			"aiven_mysql":                          {Tok: makeDataSource(mainMod, "getMySql")},
			"aiven_pg":                             {Tok: makeDataSource(mainMod, "getPg")},
			"aiven_project":                        {Tok: makeDataSource(mainMod, "getProject")},
			"aiven_project_user":                   {Tok: makeDataSource(mainMod, "getProjectUser")},
			"aiven_project_vpc":                    {Tok: makeDataSource(mainMod, "getProjectVpc")},
			"aiven_redis":                          {Tok: makeDataSource(mainMod, "getRedis")},
			"aiven_service_component":              {Tok: makeDataSource(mainMod, "getServiceComponent")},
			"aiven_service_integration":            {Tok: makeDataSource(mainMod, "getServiceIntegration")},
			"aiven_service_integration_endpoint":   {Tok: makeDataSource(mainMod, "getServiceIntegrationEndpoint")},
			"aiven_transit_gateway_vpc_attachment": {Tok: makeDataSource(mainMod, "getTransitGatewayVpcAttachment")},
			"aiven_m3aggregator":                   {Tok: makeDataSource(mainMod, "getM3Aggregator")},
			"aiven_m3db":                           {Tok: makeDataSource(mainMod, "getM3Db")},
			"aiven_aws_privatelink":                {Tok: makeDataSource(mainMod, "getAwsPrivatelink")},
			"aiven_opensearch":                     {Tok: makeDataSource(mainMod, "getOpenSearch")},
			"aiven_opensearch_acl_config":          {Tok: makeDataSource(mainMod, "getOpenSearchAclConfig")},
			"aiven_opensearch_acl_rule":            {Tok: makeDataSource(mainMod, "getOpenSearchAclRule")},
			"aiven_azure_privatelink":              {Tok: makeDataSource(mainMod, "getAzurePrivatelink")},
			"aiven_gcp_privatelink": {
				Tok: makeDataSource(mainMod, "getGcpPrivatelink"),
				Docs: &tfbridge.DocInfo{
					Markdown: []byte(" "),
				},
			},
			"aiven_billing_group":                {Tok: makeDataSource(mainMod, "getBillingGroup")},
			"aiven_clickhouse":                   {Tok: makeDataSource(mainMod, "getClickhouse")},
			"aiven_clickhouse_database":          {Tok: makeDataSource(mainMod, "getClickhouseDatabase")},
			"aiven_clickhouse_user":              {Tok: makeDataSource(mainMod, "getClickhouseUser")},
			"aiven_flink":                        {Tok: makeDataSource(mainMod, "getFlink")},
			"aiven_aws_vpc_peering_connection":   {Tok: makeDataSource(mainMod, "getAwsVpcPeeringConnection")},
			"aiven_azure_vpc_peering_connection": {Tok: makeDataSource(mainMod, "getAzureVpcPeeringConnection")},
			"aiven_gcp_vpc_peering_connection":   {Tok: makeDataSource(mainMod, "getGcpVpcPeeringConnection")},
			"aiven_cassandra_user":               {Tok: makeDataSource(mainMod, "getCassandraUser")},
			"aiven_influxdb_database": {
				Tok:  makeDataSource(mainMod, "getInfluxdbDatabase"),
				Docs: &tfbridge.DocInfo{AllowMissing: true},
			},
			"aiven_influxdb_user": {
				Tok:  makeDataSource(mainMod, "getInfluxdbUser"),
				Docs: &tfbridge.DocInfo{AllowMissing: true},
			},
			"aiven_kafka_user":                {Tok: makeDataSource(mainMod, "getKafkaUser")},
			"aiven_m3db_user":                 {Tok: makeDataSource(mainMod, "getM3dbUser")},
			"aiven_mysql_database":            {Tok: makeDataSource(mainMod, "getMysqlDatabase")},
			"aiven_mysql_user":                {Tok: makeDataSource(mainMod, "getMysqlUser")},
			"aiven_opensearch_user":           {Tok: makeDataSource(mainMod, "getOpensearchUser")},
			"aiven_pg_database":               {Tok: makeDataSource(mainMod, "getPgDatabase")},
			"aiven_pg_user":                   {Tok: makeDataSource(mainMod, "getPgUser")},
			"aiven_redis_user":                {Tok: makeDataSource(mainMod, "getRedisUser")},
			"aiven_kafka_schema_registry_acl": {Tok: makeDataSource(mainMod, "getKafkaSchemaRegistryAcl")},
		},
		JavaScript: &tfbridge.JavaScriptInfo{
			Dependencies: map[string]string{
				"@pulumi/pulumi": "^3.0.0",
			},
			DevDependencies: map[string]string{
				"@types/node": "^10.0.0",
				"@types/mime": "^2.0.0",
			},
			RespectSchemaVersion: true,
		},
		Golang: &tfbridge.GolangInfo{
			ImportBasePath: filepath.Join(
				fmt.Sprintf("github.com/pulumi/pulumi-%[1]s/sdk/", mainPkg),
				tfbridge.GetModuleMajorVersion(version.Version),
				"go",
				mainPkg,
			),
			GenerateResourceContainerTypes: true,
			RespectSchemaVersion:           true,
		},

		Python: &tfbridge.PythonInfo{
			RespectSchemaVersion: true,
			Requires: map[string]string{
				"pulumi": ">=3.0.0,<4.0.0",
			},
			PyProject: struct{ Enabled bool }{true},
		},
		CSharp: &tfbridge.CSharpInfo{
			RespectSchemaVersion: true,
			PackageReferences: map[string]string{
				"Pulumi": "3.*",
			},
			Namespaces: map[string]string{
				mainPkg: "Aiven",
			},
		},
	}

	prov.RenameDataSource("aiven_cassandra", makeDataSource(mainMod, "getCassanda"),
		makeDataSource(mainMod, "getCassandra"), mainMod, mainMod, &tfbridge.DataSourceInfo{
			Docs: &tfbridge.DocInfo{
				Source: "cassandra.md",
			},
		})

	prov.MustComputeTokens(tfbridgetokens.SingleModule("aiven_", mainMod,
		tfbridgetokens.MakeStandard(mainPkg)))
	prov.MustApplyAutoAliases()

	prov.SetAutonaming(255, "-")

	return prov
}

//go:embed cmd/pulumi-resource-aiven/bridge-metadata.json
var metadata []byte
