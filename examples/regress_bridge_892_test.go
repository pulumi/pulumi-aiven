// Copyright 2016-2023, Pulumi Corporation.
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

package examples

import (
	"context"
	"os"
	"testing"

	provider "github.com/pulumi/pulumi-aiven/provider/v6"
	"github.com/pulumi/pulumi-aiven/provider/v6/pkg/version"
	testutils "github.com/pulumi/pulumi-terraform-bridge/testing/x"
	"github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfbridge"
)

// Regress a panic in Aiven provider.
//
// See https://github.com/pulumi/pulumi-terraform-bridge/issues/892
func TestRegressBridge892(t *testing.T) {
	ctx := context.Background()
	testCase := `
	{
	  "method": "/pulumirpc.ResourceProvider/Create",
	  "request": {
	    "urn": "urn:pulumi:p-it-antons-mac-service-5be213e9::aiven-service::aiven:index/grafana:Grafana::my-new-service",
	    "properties": {
	      "__defaults": [
		"serviceName"
	      ],
	      "cloudName": "google-europe-west1",
	      "grafanaUserConfig": {
		"__defaults": [],
		"publicAccess": {
		  "__defaults": [],
		  "grafana": true
		}
	      },
	      "plan": "startup-4",
	      "project": "pulumi-7e9a",
	      "serviceName": "my-new-service-6683789"
	    },
	    "preview": true
	  },
	  "response": {}
	}`
	version.Version = "0.0.1"
	info := provider.Provider()

	readFile := func(f string) []byte {
		c, err := os.ReadFile(f)
		if err != nil {
			t.Fatal(err)
			return nil
		}
		return c
	}

	pulumiSchema := readFile("../provider/cmd/pulumi-resource-aiven/schema.json")

	server0 := tfbridge.NewProvider(
		ctx,
		nil,
		"aiven",
		version.Version,
		info.P,
		info,
		pulumiSchema,
	)

	testutils.Replay(t, server0, testCase)
}
