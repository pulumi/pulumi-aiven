module github.com/pulumi/pulumi-aiven/provider/v3

go 1.14

replace (
	github.com/Azure/go-autorest => github.com/Azure/go-autorest v12.4.3+incompatible
	github.com/aiven/terraform-provider-aiven => github.com/pulumi/terraform-provider-aiven v1.0.18-0.20210115143130-b076b98207c2
	github.com/hashicorp/terraform-plugin-sdk/v2 => github.com/pulumi/terraform-plugin-sdk/v2 v2.0.0-20200910230100-328eb4ff41df
	github.com/hashicorp/vault => github.com/hashicorp/vault v1.2.0
)

require (
	github.com/aiven/terraform-provider-aiven v1.3.1
	github.com/hashicorp/terraform-plugin-sdk v1.14.0 // indirect
	github.com/pulumi/pulumi-terraform-bridge/v2 v2.17.0
	github.com/pulumi/pulumi/sdk/v2 v2.16.2
)
