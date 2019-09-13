module github.com/pulumi/pulumi-aiven

go 1.13

replace (
	github.com/Nvveen/Gotty => github.com/ijc25/Gotty v0.0.0-20170406111628-a8b993ba6abd
	github.com/golang/glog => github.com/pulumi/glog v0.0.0-20180820174630-7eaa6ffb71e4
)

require (
	git.apache.org/thrift.git v0.12.0 // indirect
	github.com/Nvveen/Gotty v0.0.0-20170406111628-a8b993ba6abd // indirect
	github.com/aiven/terraform-provider-aiven v1.0.16 // indirect
	github.com/go-ini/ini v1.31.0 // indirect
	github.com/hashicorp/terraform v0.12.8
	github.com/pulumi/pulumi v1.1.0
	github.com/pulumi/pulumi-terraform v0.18.4-0.20190911210241-c73da359df9f
	github.com/pulumi/scripts v0.0.0-20190912181042-64ca2230fc9b // indirect
	github.com/stretchr/testify v1.4.0
	golang.org/x/build v0.0.0-20190314133821-5284462c4bec // indirect
	gopkg.in/vmihailenco/msgpack.v2 v2.9.1 // indirect
)
