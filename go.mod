module github.com/pulumi/pulumi-aiven

go 1.13

replace (
	github.com/Azure/go-autorest => github.com/Azure/go-autorest v12.4.3+incompatible
	github.com/aiven/terraform-provider-aiven => github.com/pulumi/terraform-provider-aiven v1.0.18-0.20191217094432-bd46fd648ac4
	github.com/hashicorp/vault => github.com/hashicorp/vault v1.2.0
)

require (
	github.com/aiven/terraform-provider-aiven v1.0.17
	github.com/gobuffalo/packr/v2 v2.1.0
	github.com/hashicorp/terraform v0.12.8
	github.com/pkg/errors v0.8.1
	github.com/pulumi/pulumi v1.6.0
	github.com/pulumi/pulumi-terraform v0.18.4-0.20191202134852-87cfb4dc8ae1
	github.com/stretchr/testify v1.4.0 // indirect
)
