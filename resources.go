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
	"unicode"

	"github.com/aiven/terraform-provider-aiven/aiven"
	"github.com/hashicorp/terraform/helper/schema"
	"github.com/pulumi/pulumi-terraform/pkg/tfbridge"
	"github.com/pulumi/pulumi/pkg/tokens"
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
	p := aiven.Provider().(*schema.Provider)
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
		Config: map[string]*tfbridge.SchemaInfo{
			"api_token": {
				Type: "string",
				Default: &tfbridge.DefaultInfo{
					EnvVars: []string{"AIVEN_API_TOKEN"},
				},
			},
		},
		Resources: map[string]*tfbridge.ResourceInfo{
			"aiven_connection_pool": {Tok: makeResource(mainMod, "ConnectionPool")},
			"aiven_database":        {Tok: makeResource(mainMod, "Database")},
			"aiven_kafka_acl":       {Tok: makeResource(mainMod, "KafkaAcl")},
			"aiven_kafka_topic":     {Tok: makeResource(mainMod, "KafkaTopic")},
			"aiven_project": {
				Tok: makeResource(mainMod, "Project"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"project": {
						CSharpName: "ProjectName",
					},
				},
			},
			"aiven_project_user":           {Tok: makeResource(mainMod, "ProjectUser")},
			"aiven_project_vpc":            {Tok: makeResource(mainMod, "ProjectVpc")},
			"aiven_vpc_peering_connection": {Tok: makeResource(mainMod, "VpcPeeringConnection")},
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
										},
									},
								},
							},
						},
					},
				},
			},
			"aiven_service_integration":          {Tok: makeResource(mainMod, "ServiceIntegration")},
			"aiven_service_integration_endpoint": {Tok: makeResource(mainMod, "ServiceIntegrationEndpoint")},
			"aiven_service_user":                 {Tok: makeResource(mainMod, "ServiceUser")},
			"aiven_elasticsearch_acl":            {Tok: makeResource(mainMod, "ElasticSearchAcl")},
			"aiven_kafka_connector":              {Tok: makeResource(mainMod, "KafkaConnector")},
			"aiven_kafka_schema":                 {Tok: makeResource(mainMod, "KafkaSchema")},
			"aiven_kafka_schema_configuration":   {Tok: makeResource(mainMod, "KafkaSchemaConfiguration")},
			"aiven_account":                      {Tok: makeResource(mainMod, "Account")},
			"aiven_account_team":                 {Tok: makeResource(mainMod, "AccountTeam")},
			"aiven_account_team_member":          {Tok: makeResource(mainMod, "AccountTeamMember")},
			"aiven_account_team_project":         {Tok: makeResource(mainMod, "AccountTeamProject")},
		},
		DataSources: map[string]*tfbridge.DataSourceInfo{
			"aiven_connection_pool":        {Tok: makeDataSource(mainMod, "getConnectionPool")},
			"aiven_database":               {Tok: makeDataSource(mainMod, "getDatabase")},
			"aiven_kafka_acl":              {Tok: makeDataSource(mainMod, "getKafkaAcl")},
			"aiven_kafka_topic":            {Tok: makeDataSource(mainMod, "getKafkaTopic")},
			"aiven_project":                {Tok: makeDataSource(mainMod, "getProject")},
			"aiven_project_user":           {Tok: makeDataSource(mainMod, "getProjectUser")},
			"aiven_project_vpc":            {Tok: makeDataSource(mainMod, "getProjectVpc")},
			"aiven_vpc_peering_connection": {Tok: makeDataSource(mainMod, "getVpcPeeringConnection")},
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
										},
									},
								},
							},
						},
					},
				},
			},
			"aiven_service_integration_endpoint": {Tok: makeDataSource(mainMod, "getServiceIntegrationEndpoint")},
			"aiven_service_user":                 {Tok: makeDataSource(mainMod, "getServiceUser")},
			"aiven_elasticsearch_acl":            {Tok: makeDataSource(mainMod, "getElasticSearchAcl")},
			"aiven_kafka_connector":              {Tok: makeDataSource(mainMod, "getKafkaConnector")},
			"aiven_kafka_schema":                 {Tok: makeDataSource(mainMod, "getKafkaSchema")},
			"aiven_kafka_schema_configuration":   {Tok: makeDataSource(mainMod, "getKafkaSchemaConfiguration")},
			"aiven_account":                      {Tok: makeDataSource(mainMod, "getAccount")},
			"aiven_account_team":                 {Tok: makeDataSource(mainMod, "getAccountTeam")},
			"aiven_account_team_member":          {Tok: makeDataSource(mainMod, "getAccountTeamMember")},
			"aiven_account_team_project":         {Tok: makeDataSource(mainMod, "getAccountTeamProject")},
		},
		JavaScript: &tfbridge.JavaScriptInfo{
			Dependencies: map[string]string{
				"@pulumi/pulumi": "^1.0.0",
			},
			DevDependencies: map[string]string{
				"@types/node": "^8.0.25",
				"@types/mime": "^2.0.0",
			},
		},
		Python: &tfbridge.PythonInfo{
			Requires: map[string]string{
				"pulumi": ">=1.0.0,<2.0.0",
			},
		},
		CSharp: &tfbridge.CSharpInfo{
			PackageReferences: map[string]string{
				"Pulumi":                       "1.5.0-*",
				"System.Collections.Immutable": "1.6.0",
			},
			Namespaces: map[string]string{
				mainPkg: "Aiven",
			},
		},
	}

	// For all resources with name properties, we will add an auto-name property.  Make sure to skip those that
	// already have a name mapping entry, since those may have custom overrides set above (e.g., for length).
	const nameProperty = "name"
	for resname, res := range prov.Resources {
		if schema := p.ResourcesMap[resname]; schema != nil {
			// Only apply auto-name to input properties (Optional || Required) named `name`
			if tfs, has := schema.Schema[nameProperty]; has && (tfs.Optional || tfs.Required) {
				if _, hasfield := res.Fields[nameProperty]; !hasfield {
					if res.Fields == nil {
						res.Fields = make(map[string]*tfbridge.SchemaInfo)
					}
					res.Fields[nameProperty] = tfbridge.AutoName(nameProperty, 255)
				}
			}
		}
	}

	return prov
}
