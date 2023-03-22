// Copyright 2016-2017, Pulumi Corporation.  All rights reserved.
//go:build nodejs || all
// +build nodejs all

package examples

import (
	"path"
	"testing"

	"github.com/pulumi/pulumi/pkg/v3/testing/integration"
)

func TestAccService(t *testing.T) {
	test := getJSBaseOptions(t).
		With(integration.ProgramTestOptions{
			Dir: path.Join(getCwd(t), "service"),
		})

	integration.ProgramTest(t, &test)
}

func TestAccPgService(t *testing.T) {
	test := getJSBaseOptions(t).
		With(integration.ProgramTestOptions{
			Dir: path.Join(getCwd(t), "pg-service"),
			EditDirs: []integration.EditDir{
				{
					Dir:      "step2",
					Additive: true,
				},
			},
		})

	integration.ProgramTest(t, &test)
}

func getJSBaseOptions(t *testing.T) integration.ProgramTestOptions {
	projectName := getProjectName(t)
	base := getBaseOptions()
	baseJS := base.With(integration.ProgramTestOptions{
		ExpectRefreshChanges: true,
		Config: map[string]string{
			"projectName": projectName,
		},
		Dependencies: []string{
			"@pulumi/aiven",
		},
	})

	return baseJS
}
