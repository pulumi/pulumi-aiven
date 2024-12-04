// Copyright 2016-2017, Pulumi Corporation.  All rights reserved.

package examples

import (
	"os"
	"testing"

	"github.com/pulumi/pulumi/pkg/v3/testing/integration"
)

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

func getBaseOptions(t *testing.T) integration.ProgramTestOptions {
	t.Skip(`Testing for pulumi-aiven needs to be robust to resource leaks (#235).
               In the past, we have leaked resources here, and continued E2E testing on this provider is not a priority
	       so we have chosen to discontinue testing pulumi-aiven in CI.`)
	return integration.ProgramTestOptions{
		RunUpdateTest: false,
	}
}
