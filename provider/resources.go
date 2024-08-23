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
	"github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfgen"
	"os"
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

func must[T any](t T, err error) T {
	if err == nil {
		return t
	}
	panic(err)
}

func Provider(ctx context.Context) tfbridge.ProviderInfo {
	_ = os.Setenv("PROVIDER_AIVEN_ENABLE_BETA", "true")

	p := pfbridge.MuxShimWithDisjointgPF(ctx,
		shimv2.NewProvider(must(providerShim.NewProvider(version.Version))),
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
		DocRules:          &tfbridge.DocRuleInfo{EditRules: docEditRules},
		Config: map[string]*tfbridge.SchemaInfo{
			"api_token": {Secret: tfbridge.True()},
		},
		Resources: map[string]*tfbridge.ResourceInfo{
			"aiven_clickhouse": {
				Fields: map[string]*tfbridge.SchemaInfo{"clickhouse": {CSharpName: "ClickhouseServer"}},
			},
			"aiven_grafana": {
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
				Fields: map[string]*tfbridge.SchemaInfo{
					"kafka": {CSharpName: "KafkaServer"},
				},
			},
			"aiven_kafka_mirrormaker":            {Tok: makeResource(mainMod, "KafkaMirrorMaker")},
			"aiven_mirrormaker_replication_flow": {Tok: makeResource(mainMod, "MirrorMakerReplicationFlow")},
			"aiven_mysql":                        {Tok: makeResource(mainMod, "MySql")},
			"aiven_pg": {
				Fields: map[string]*tfbridge.SchemaInfo{
					"pg":           {CSharpName: "PgServer"},
					"service_name": tfbridge.AutoName("serviceName", 255, "-"),
				},
			},
			"aiven_project": {
				Fields: map[string]*tfbridge.SchemaInfo{
					"project": {CSharpName: "ProjectName"},
				},
			},
			"aiven_m3aggregator":          {Tok: makeResource(mainMod, "M3Aggregator")},
			"aiven_m3db":                  {Tok: makeResource(mainMod, "M3Db")},
			"aiven_opensearch":            {Tok: makeResource(mainMod, "OpenSearch")},
			"aiven_opensearch_acl_config": {Tok: makeResource(mainMod, "OpenSearchAclConfig")},
			"aiven_opensearch_acl_rule":   {Tok: makeResource(mainMod, "OpenSearchAclRule")},
			"aiven_flink":                 {Fields: map[string]*tfbridge.SchemaInfo{"flink": {CSharpName: "FlinkDetails"}}},

			"aiven_cassandra":         {Fields: map[string]*tfbridge.SchemaInfo{"cassandra": {CSharpName: "CassandraServer"}}},
			"aiven_dragonfly":         {Fields: map[string]*tfbridge.SchemaInfo{"dragonfly": {CSharpName: "DragonflyServer"}}},
			"aiven_redis":             {Fields: map[string]*tfbridge.SchemaInfo{"redis": {CSharpName: "RedisServer"}}},
			"aiven_influxdb_database": {Docs: &tfbridge.DocInfo{AllowMissing: true}},
			"aiven_influxdb_user":     {Docs: &tfbridge.DocInfo{AllowMissing: true}},
			"aiven_m3db_user":         {Tok: makeResource(mainMod, "M3dbUser")},

			"aiven_thanos": {
				Fields: map[string]*tfbridge.SchemaInfo{"thanos": {CSharpName: "ThanosServer"}},
			},
			"aiven_valkey": {
				Fields: map[string]*tfbridge.SchemaInfo{"valkey": {CSharpName: "ValkeyServer"}},
			},
		},
		DataSources: map[string]*tfbridge.DataSourceInfo{
			"aiven_influxdb": {
				Tok:  makeDataSource(mainMod, "getInfluxDb"),
				Docs: &tfbridge.DocInfo{AllowMissing: true},
			},
			"aiven_kafka_mirrormaker":            {Tok: makeDataSource(mainMod, "getKafkaMirrorMaker")},
			"aiven_mirrormaker_replication_flow": {Tok: makeDataSource(mainMod, "getMirrorMakerReplicationFlow")},
			"aiven_mysql":                        {Tok: makeDataSource(mainMod, "getMySql")},

			// Manually mapped due to capitalization
			"aiven_m3aggregator":          {Tok: makeDataSource(mainMod, "getM3Aggregator")},
			"aiven_m3db":                  {Tok: makeDataSource(mainMod, "getM3Db")},
			"aiven_opensearch_acl_rule":   {Tok: makeDataSource(mainMod, "getOpenSearchAclRule")},
			"aiven_opensearch":            {Tok: makeDataSource(mainMod, "getOpenSearch")},
			"aiven_opensearch_acl_config": {Tok: makeDataSource(mainMod, "getOpenSearchAclConfig")},

			"aiven_influxdb_database": {Docs: &tfbridge.DocInfo{AllowMissing: true}},
			"aiven_influxdb_user":     {Docs: &tfbridge.DocInfo{AllowMissing: true}},
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

func docEditRules(defaults []tfbridge.DocsEdit) []tfbridge.DocsEdit {
	return append(
		defaults,
		skipWarningSection,
		skipExamplesSection,
	)
}

// Removes a "Warnings" section that includes TF-specific recommendations
var skipWarningSection = tfbridge.DocsEdit{
	Path: "index.md",
	Edit: func(_ string, content []byte) ([]byte, error) {
		return tfgen.SkipSectionByHeaderContent(content, func(headerText string) bool {
			return headerText == "Warning"
		})
	},
}

// Removes a section containing TF-specific tutorial links.
// This is *not* the "Example Usage" section, and doesn't actually contain any code examples.
var skipExamplesSection = tfbridge.DocsEdit{
	Path: "index.md",
	Edit: func(_ string, content []byte) ([]byte, error) {
		return tfgen.SkipSectionByHeaderContent(content, func(headerText string) bool {
			return headerText == "Examples"
		})
	},
}

//go:embed cmd/pulumi-resource-aiven/bridge-metadata.json
var metadata []byte
