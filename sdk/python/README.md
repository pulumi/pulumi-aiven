[![Build Status](https://travis-ci.com/pulumi/pulumi-aiven.svg?token=eHg7Zp5zdDDJfTjY8ejq&branch=master)](https://travis-ci.com/pulumi/pulumi-aiven)

# Aiven Resource Provider

The Aiven resource provider for Pulumi lets you manage Okta resources in your cloud programs. To use
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

    $ go get github.com/pulumi/pulumi-aiven/sdk/go/...

## Configuration

The following configuration points are available:

- `aiven:apiToken` - (Optional) This is the API token to interact with your Aiven account. May be set via the `AIVEN_API_TOKEN` environment variable.

## Reference

For detailed reference documentation, please visit [the API docs](https://pulumi.io/reference/pkg/nodejs/@pulumi/aiven/index.html).
