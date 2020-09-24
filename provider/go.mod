module github.com/pulumi/pulumi-aiven/provider/v3

go 1.14

replace (
	github.com/Azure/go-autorest => github.com/Azure/go-autorest v12.4.3+incompatible
	github.com/aiven/terraform-provider-aiven => github.com/pulumi/terraform-provider-aiven v1.0.18-0.20200924103620-2ad41aa9d5f8
	github.com/hashicorp/vault => github.com/hashicorp/vault v1.2.0
)

require (
	github.com/aiven/terraform-provider-aiven v1.3.1
	github.com/hashicorp/terraform-plugin-sdk v1.14.0
	github.com/pulumi/pulumi-terraform-bridge/v2 v2.8.0
	github.com/pulumi/pulumi/sdk/v2 v2.10.0
)
