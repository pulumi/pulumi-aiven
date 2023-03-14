[![Actions Status](https://github.com/pulumi/pulumi-aiven/workflows/master/badge.svg)](https://github.com/pulumi/pulumi-aiven/actions)
[![Slack](http://www.pulumi.com/images/docs/badges/slack.svg)](https://slack.pulumi.com)
[![NPM version](https://badge.fury.io/js/%40pulumi%2Faiven.svg)](https://www.npmjs.com/package/@pulumi/aiven)
[![Python version](https://badge.fury.io/py/pulumi-aiven.svg)](https://pypi.org/project/pulumi-aiven)
[![NuGet version](https://badge.fury.io/nu/pulumi.aiven.svg)](https://badge.fury.io/nu/pulumi.aiven)
[![PkgGoDev](https://pkg.go.dev/badge/github.com/pulumi/pulumi-aiven/sdk/v5/go)](https://pkg.go.dev/github.com/pulumi/pulumi-aiven/sdk/v5/go)
[![License](https://img.shields.io/npm/l/%40pulumi%2Fpulumi.svg)](https://github.com/pulumi/pulumi-aiven/blob/master/LICENSE)

# Aiven Resource Provider

The Aiven resource provider for Pulumi lets you manage Aiven resources in your cloud programs. To use
this package, please [install the Pulumi CLI first](https://pulumi.io/).

## Installing

This package is available in many languages in the standard packaging formats.

### Node.js (Java/TypeScript)

To use from JavaScript or TypeScript in Node.js, install using either `npm`:

    $ npm install @pulumi/aiven

or `yarn`:

    $ yarn add @pulumi/aiven

### Python

To use from Python, install using `pip`:

    $ pip install pulumi_aiven

### Go

To use from Go, use `go get` to grab the latest version of the library

    $ go get github.com/pulumi/pulumi-aiven/sdk/v5

### .NET

To use from .NET, install using `dotnet add package`:

    $ dotnet add package Pulumi.Aiven

## Configuration

The following configuration points are available:

- `aiven:apiToken` - (Optional) This is the API token to interact with your Aiven account. May be set via the `AIVEN_TOKEN` environment variable.

## Reference

For further information, please visit [the Aiven provider docs](https://www.pulumi.com/docs/intro/cloud-providers/aiven) or for detailed reference documentation, please visit [the API docs](https://www.pulumi.com/docs/reference/pkg/aiven).
