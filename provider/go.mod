module github.com/pulumi/pulumi-aiven/provider/v2

go 1.14

replace (
	github.com/Azure/go-autorest => github.com/Azure/go-autorest v12.4.3+incompatible
	github.com/aiven/terraform-provider-aiven => github.com/pulumi/terraform-provider-aiven v1.0.18-0.20200421114658-f1c6eda6f135
	github.com/hashicorp/vault => github.com/hashicorp/vault v1.2.0
)

require (
	github.com/aiven/terraform-provider-aiven v1.0.17
	github.com/gobuffalo/packr/v2 v2.1.0
	github.com/hashicorp/terraform-plugin-sdk v1.7.0
	github.com/pulumi/pulumi-terraform-bridge/v2 v2.4.1-0.20200608011815-6feeb51f2d39
	github.com/pulumi/pulumi/sdk/v2 v2.3.1-0.20200607162109-9754465b04db
	github.com/pulumi/tf2pulumi v0.8.1-0.20200528170746-c1234defe2b5 // indirect
)
