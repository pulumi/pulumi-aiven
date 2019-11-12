module github.com/pulumi/pulumi-aiven

go 1.13

replace (
	github.com/Azure/go-autorest => github.com/Azure/go-autorest v12.4.3+incompatible
	github.com/Nvveen/Gotty => github.com/ijc25/Gotty v0.0.0-20170406111628-a8b993ba6abd
	github.com/Sirupsen/logrus => github.com/sirupsen/logrus v1.4.2-0.20190403091019-9b3cdde74fbe
	github.com/aiven/terraform-provider-aiven => github.com/pulumi/terraform-provider-aiven v1.0.18-0.20191112055150-1b033b27c5e8
	github.com/golang/glog => github.com/pulumi/glog v0.0.0-20180820174630-7eaa6ffb71e4
	github.com/hashicorp/vault => github.com/hashicorp/vault v1.2.0
)

require (
	github.com/Azure/go-autorest/autorest/azure/auth v0.4.0 // indirect
	github.com/Azure/go-autorest/autorest/to v0.3.0 // indirect
	github.com/Azure/go-autorest/autorest/validation v0.2.0 // indirect
	github.com/aiven/terraform-provider-aiven v1.0.17
	github.com/hashicorp/terraform v0.12.8
	github.com/pkg/errors v0.8.1
	github.com/pulumi/pulumi v1.1.0
	github.com/pulumi/pulumi-terraform v0.18.4-0.20191106002356-df2ca0d49bbf
	github.com/stretchr/testify v1.4.0 // indirect
)
