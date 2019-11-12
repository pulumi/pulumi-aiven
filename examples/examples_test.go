// Copyright 2016-2017, Pulumi Corporation.  All rights reserved.

package examples

import (
	"github.com/pulumi/pulumi/pkg/testing/integration"
	"os"
	"path"
	"testing"
)

func TestAccService(t *testing.T) {
	test := getJSBaseOptions(t).
		With(integration.ProgramTestOptions{
			Dir: path.Join(getCwd(t), "service"),
		})

	integration.ProgramTest(t, &test)
}

func getProjectName(t *testing.T) string {
	name := os.Getenv("AIVEN_PROJECT_NAME")
	if name == "" {
		t.Skipf("Skipping test due to missing AIVEN_PROJECT_NAME environment variable")
	}

	return name
}

func getCwd(t *testing.T) string {
	cwd, err := os.Getwd()
	if err != nil {
		t.FailNow()
	}

	return cwd
}

func getBaseOptions() integration.ProgramTestOptions {
	return integration.ProgramTestOptions{}
}

func getJSBaseOptions(t *testing.T) integration.ProgramTestOptions {
	projectName := getProjectName(t)
	base := getBaseOptions()
	baseJS := base.With(integration.ProgramTestOptions{
		Config: map[string]string{
			"projectName": projectName,
		},
		Dependencies: []string{
			"@pulumi/aiven",
		},
	})

	return baseJS
}
