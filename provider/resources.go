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
	"fmt"
	"path/filepath"
	"unicode"

	"github.com/aiven/terraform-provider-aiven/aiven"
	"github.com/pulumi/pulumi-aiven/provider/v4/pkg/version"
	"github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfbridge"
	shimv2 "github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfshim/sdk-v2"
	"github.com/pulumi/pulumi/sdk/v3/go/common/tokens"
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

func refProviderLicense(license tfbridge.TFProviderLicense) *tfbridge.TFProviderLicense {
	return &license
}

func Provider() tfbridge.ProviderInfo {
	p := shimv2.NewProvider(aiven.Provider())

	prov := tfbridge.ProviderInfo{
		P:                 p,
		Name:              "aiven",
		GitHubOrg:         "aiven",
		Description:       "A Pulumi package for creating and managing Aiven cloud resources.",
		Keywords:          []string{"pulumi", "aiven"},
		License:           "Apache-2.0",
		Homepage:          "https://pulumi.io",
		Repository:        "https://github.com/pulumi/pulumi-aiven",
		TFProviderLicense: refProviderLicense(tfbridge.MITLicenseType),
		Config:            map[string]*tfbridge.SchemaInfo{},
		Resources: map[string]*tfbridge.ResourceInfo{
			"aiven_account":                {Tok: makeResource(mainMod, "Account")},
			"aiven_account_authentication": {Tok: makeResource(mainMod, "AccountAuthentication")},
			"aiven_account_team":           {Tok: makeResource(mainMod, "AccountTeam")},
			"aiven_account_team_member":    {Tok: makeResource(mainMod, "AccountTeamMember")},
			"aiven_account_team_project":   {Tok: makeResource(mainMod, "AccountTeamProject")},
			"aiven_billing_group":          {Tok: makeResource(mainMod, "BillingGroup")},
			"aiven_cassandra": {
				Tok: makeResource(mainMod, "Cassandra"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"cassandra": {
						CSharpName: "CassandraServer",
					},
				},
			},
			"aiven_connection_pool":   {Tok: makeResource(mainMod, "ConnectionPool")},
			"aiven_database":          {Tok: makeResource(mainMod, "Database")},
			"aiven_elasticsearch":     {Tok: makeResource(mainMod, "ElasticSearch")},
			"aiven_elasticsearch_acl": {Tok: makeResource(mainMod, "ElasticSearchAcl")},
			"aiven_grafana": {
				Tok: makeResource(mainMod, "Grafana"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"grafana": {
						CSharpName: "GrafanaServer",
					},
				},
			},
			"aiven_influxdb": {Tok: makeResource(mainMod, "InfluxDb")},
			"aiven_kafka": {
				Tok: makeResource(mainMod, "Kafka"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"kafka": {
						CSharpName: "KafkaServer",
					},
				},
			},
			"aiven_kafka_acl": {Tok: makeResource(mainMod, "KafkaAcl")},
			"aiven_kafka_connect": {
				Tok: makeResource(mainMod, "KafkaConnect"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"kafka_connect": {
						CSharpName: "KafkaConnectServer",
					},
				},
			},
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
					"pg": {
						CSharpName: "PgServer",
					},
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
			"aiven_project_user": {Tok: makeResource(mainMod, "ProjectUser")},
			"aiven_project_vpc":  {Tok: makeResource(mainMod, "ProjectVpc")},
			"aiven_redis": {
				Tok: makeResource(mainMod, "Redis"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"redis": {
						CSharpName: "RedisServer",
					},
				},
			},
			"aiven_service": {
				Tok: makeResource(mainMod, "Service"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"pg_user_config": {
						Elem: &tfbridge.SchemaInfo{
							Fields: map[string]*tfbridge.SchemaInfo{
								"pg": {
									Elem: &tfbridge.SchemaInfo{
										Fields: map[string]*tfbridge.SchemaInfo{
											"pg_stat_statements_dot_track": {
												Name: "pgStatStatementsTrack",
											},
											"pg_partman_bgw_dot_role": {
												Name: "pgPartmanBgwRole",
											},
											"pg_partman_bgw_dot_interval": {
												Name: "pgPartmanBgwInterval",
											},
										},
									},
								},
							},
						},
					},
				},
			},
			"aiven_service_integration":            {Tok: makeResource(mainMod, "ServiceIntegration")},
			"aiven_service_integration_endpoint":   {Tok: makeResource(mainMod, "ServiceIntegrationEndpoint")},
			"aiven_service_user":                   {Tok: makeResource(mainMod, "ServiceUser")},
			"aiven_transit_gateway_vpc_attachment": {Tok: makeResource(mainMod, "TransitGatewayVpcAttachment")},
			"aiven_vpc_peering_connection":         {Tok: makeResource(mainMod, "VpcPeeringConnection")},
			"aiven_m3aggregator":                   {Tok: makeResource(mainMod, "M3Aggregator")},
			"aiven_m3db":                           {Tok: makeResource(mainMod, "M3Db")},
			"aiven_aws_privatelink":                {Tok: makeResource(mainMod, "AwsPrivatelink")},
		},
		DataSources: map[string]*tfbridge.DataSourceInfo{
			"aiven_account":                      {Tok: makeDataSource(mainMod, "getAccount")},
			"aiven_account_team":                 {Tok: makeDataSource(mainMod, "getAccountTeam")},
			"aiven_account_team_member":          {Tok: makeDataSource(mainMod, "getAccountTeamMember")},
			"aiven_account_team_project":         {Tok: makeDataSource(mainMod, "getAccountTeamProject")},
			"aiven_account_authentication":       {Tok: makeDataSource(mainMod, "getAccountAuthentication")},
			"aiven_cassandra":                    {Tok: makeDataSource(mainMod, "getCassanda")},
			"aiven_connection_pool":              {Tok: makeDataSource(mainMod, "getConnectionPool")},
			"aiven_database":                     {Tok: makeDataSource(mainMod, "getDatabase")},
			"aiven_elasticsearch":                {Tok: makeDataSource(mainMod, "getElasticSearch")},
			"aiven_elasticsearch_acl":            {Tok: makeDataSource(mainMod, "getElasticSearchAcl")},
			"aiven_grafana":                      {Tok: makeDataSource(mainMod, "getGrafana")},
			"aiven_influxdb":                     {Tok: makeDataSource(mainMod, "getInfluxDb")},
			"aiven_kafka":                        {Tok: makeDataSource(mainMod, "getKafka")},
			"aiven_kafka_acl":                    {Tok: makeDataSource(mainMod, "getKafkaAcl")},
			"aiven_kafka_topic":                  {Tok: makeDataSource(mainMod, "getKafkaTopic")},
			"aiven_kafka_connect":                {Tok: makeDataSource(mainMod, "getKafkaConnect")},
			"aiven_kafka_connector":              {Tok: makeDataSource(mainMod, "getKafkaConnector")},
			"aiven_kafka_mirrormaker":            {Tok: makeDataSource(mainMod, "getKafkaMirrorMaker")},
			"aiven_kafka_schema":                 {Tok: makeDataSource(mainMod, "getKafkaSchema")},
			"aiven_kafka_schema_configuration":   {Tok: makeDataSource(mainMod, "getKafkaSchemaConfiguration")},
			"aiven_mirrormaker_replication_flow": {Tok: makeDataSource(mainMod, "getMirrorMakerReplicationFlow")},
			"aiven_mysql":                        {Tok: makeDataSource(mainMod, "getMySql")},
			"aiven_pg":                           {Tok: makeDataSource(mainMod, "getPg")},
			"aiven_project":                      {Tok: makeDataSource(mainMod, "getProject")},
			"aiven_project_user":                 {Tok: makeDataSource(mainMod, "getProjectUser")},
			"aiven_project_vpc":                  {Tok: makeDataSource(mainMod, "getProjectVpc")},
			"aiven_redis":                        {Tok: makeDataSource(mainMod, "getRedis")},
			"aiven_service": {
				Tok: makeDataSource(mainMod, "getService"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"pg_user_config": {
						Elem: &tfbridge.SchemaInfo{
							Fields: map[string]*tfbridge.SchemaInfo{
								"pg": {
									Elem: &tfbridge.SchemaInfo{
										Fields: map[string]*tfbridge.SchemaInfo{
											"pg_stat_statements_dot_track": {
												Name: "pgStatStatementsTrack",
											},
											"pg_partman_bgw_dot_role": {
												Name: "pgPartmanBgwRole",
											},
											"pg_partman_bgw_dot_interval": {
												Name: "pgPartmanBgwInterval",
											},
										},
									},
								},
							},
						},
					},
				},
			},
			"aiven_service_component":              {Tok: makeDataSource(mainMod, "getServiceComponent")},
			"aiven_service_integration":            {Tok: makeDataSource(mainMod, "getServiceIntegration")},
			"aiven_service_integration_endpoint":   {Tok: makeDataSource(mainMod, "getServiceIntegrationEndpoint")},
			"aiven_service_user":                   {Tok: makeDataSource(mainMod, "getServiceUser")},
			"aiven_transit_gateway_vpc_attachment": {Tok: makeDataSource(mainMod, "getTransitGatewayVpcAttachment")},
			"aiven_vpc_peering_connection":         {Tok: makeDataSource(mainMod, "getVpcPeeringConnection")},
			"aiven_m3aggregator":                   {Tok: makeDataSource(mainMod, "getM3Aggregator")},
			"aiven_m3db":                           {Tok: makeDataSource(mainMod, "getM3Db")},
			"aiven_aws_privatelink":                {Tok: makeDataSource(mainMod, "getAwsPrivatelink")},
		},
		JavaScript: &tfbridge.JavaScriptInfo{
			Dependencies: map[string]string{
				"@pulumi/pulumi": "^3.0.0",
			},
			DevDependencies: map[string]string{
				"@types/node": "^10.0.0",
				"@types/mime": "^2.0.0",
			},
		},
		Golang: &tfbridge.GolangInfo{
			ImportBasePath: filepath.Join(
				fmt.Sprintf("github.com/pulumi/pulumi-%[1]s/sdk/", mainPkg),
				tfbridge.GetModuleMajorVersion(version.Version),
				"go",
				mainPkg,
			),
			GenerateResourceContainerTypes: true,
		},

		Python: &tfbridge.PythonInfo{
			Requires: map[string]string{
				"pulumi": ">=3.0.0,<4.0.0",
			},
		},
		CSharp: &tfbridge.CSharpInfo{
			PackageReferences: map[string]string{
				"Pulumi": "3.*",
			},
			Namespaces: map[string]string{
				mainPkg: "Aiven",
			},
		},
	}

	prov.SetAutonaming(255, "-")

	return prov
}
