// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package aiven

import (
	"fmt"

	"github.com/blang/semver"
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

type module struct {
	version semver.Version
}

func (m *module) Version() semver.Version {
	return m.version
}

func (m *module) Construct(ctx *pulumi.Context, name, typ, urn string) (r pulumi.Resource, err error) {
	switch typ {
	case "aiven:index/account:Account":
		r, err = NewAccount(ctx, name, nil, pulumi.URN_(urn))
	case "aiven:index/accountAuthentication:AccountAuthentication":
		r, err = NewAccountAuthentication(ctx, name, nil, pulumi.URN_(urn))
	case "aiven:index/accountTeam:AccountTeam":
		r, err = NewAccountTeam(ctx, name, nil, pulumi.URN_(urn))
	case "aiven:index/accountTeamMember:AccountTeamMember":
		r, err = NewAccountTeamMember(ctx, name, nil, pulumi.URN_(urn))
	case "aiven:index/accountTeamProject:AccountTeamProject":
		r, err = NewAccountTeamProject(ctx, name, nil, pulumi.URN_(urn))
	case "aiven:index/billingGroup:BillingGroup":
		r, err = NewBillingGroup(ctx, name, nil, pulumi.URN_(urn))
	case "aiven:index/cassandra:Cassandra":
		r, err = NewCassandra(ctx, name, nil, pulumi.URN_(urn))
	case "aiven:index/connectionPool:ConnectionPool":
		r, err = NewConnectionPool(ctx, name, nil, pulumi.URN_(urn))
	case "aiven:index/database:Database":
		r, err = NewDatabase(ctx, name, nil, pulumi.URN_(urn))
	case "aiven:index/elasticSearch:ElasticSearch":
		r, err = NewElasticSearch(ctx, name, nil, pulumi.URN_(urn))
	case "aiven:index/elasticSearchAcl:ElasticSearchAcl":
		r, err = NewElasticSearchAcl(ctx, name, nil, pulumi.URN_(urn))
	case "aiven:index/grafana:Grafana":
		r, err = NewGrafana(ctx, name, nil, pulumi.URN_(urn))
	case "aiven:index/influxDb:InfluxDb":
		r, err = NewInfluxDb(ctx, name, nil, pulumi.URN_(urn))
	case "aiven:index/kafka:Kafka":
		r, err = NewKafka(ctx, name, nil, pulumi.URN_(urn))
	case "aiven:index/kafkaAcl:KafkaAcl":
		r, err = NewKafkaAcl(ctx, name, nil, pulumi.URN_(urn))
	case "aiven:index/kafkaConnect:KafkaConnect":
		r, err = NewKafkaConnect(ctx, name, nil, pulumi.URN_(urn))
	case "aiven:index/kafkaConnector:KafkaConnector":
		r, err = NewKafkaConnector(ctx, name, nil, pulumi.URN_(urn))
	case "aiven:index/kafkaMirrorMaker:KafkaMirrorMaker":
		r, err = NewKafkaMirrorMaker(ctx, name, nil, pulumi.URN_(urn))
	case "aiven:index/kafkaSchema:KafkaSchema":
		r, err = NewKafkaSchema(ctx, name, nil, pulumi.URN_(urn))
	case "aiven:index/kafkaSchemaConfiguration:KafkaSchemaConfiguration":
		r, err = NewKafkaSchemaConfiguration(ctx, name, nil, pulumi.URN_(urn))
	case "aiven:index/kafkaTopic:KafkaTopic":
		r, err = NewKafkaTopic(ctx, name, nil, pulumi.URN_(urn))
	case "aiven:index/m3Aggregator:M3Aggregator":
		r, err = NewM3Aggregator(ctx, name, nil, pulumi.URN_(urn))
	case "aiven:index/m3Db:M3Db":
		r, err = NewM3Db(ctx, name, nil, pulumi.URN_(urn))
	case "aiven:index/mirrorMakerReplicationFlow:MirrorMakerReplicationFlow":
		r, err = NewMirrorMakerReplicationFlow(ctx, name, nil, pulumi.URN_(urn))
	case "aiven:index/mySql:MySql":
		r, err = NewMySql(ctx, name, nil, pulumi.URN_(urn))
	case "aiven:index/pg:Pg":
		r, err = NewPg(ctx, name, nil, pulumi.URN_(urn))
	case "aiven:index/project:Project":
		r, err = NewProject(ctx, name, nil, pulumi.URN_(urn))
	case "aiven:index/projectUser:ProjectUser":
		r, err = NewProjectUser(ctx, name, nil, pulumi.URN_(urn))
	case "aiven:index/projectVpc:ProjectVpc":
		r, err = NewProjectVpc(ctx, name, nil, pulumi.URN_(urn))
	case "aiven:index/redis:Redis":
		r, err = NewRedis(ctx, name, nil, pulumi.URN_(urn))
	case "aiven:index/service:Service":
		r, err = NewService(ctx, name, nil, pulumi.URN_(urn))
	case "aiven:index/serviceIntegration:ServiceIntegration":
		r, err = NewServiceIntegration(ctx, name, nil, pulumi.URN_(urn))
	case "aiven:index/serviceIntegrationEndpoint:ServiceIntegrationEndpoint":
		r, err = NewServiceIntegrationEndpoint(ctx, name, nil, pulumi.URN_(urn))
	case "aiven:index/serviceUser:ServiceUser":
		r, err = NewServiceUser(ctx, name, nil, pulumi.URN_(urn))
	case "aiven:index/transitGatewayVpcAttachment:TransitGatewayVpcAttachment":
		r, err = NewTransitGatewayVpcAttachment(ctx, name, nil, pulumi.URN_(urn))
	case "aiven:index/vpcPeeringConnection:VpcPeeringConnection":
		r, err = NewVpcPeeringConnection(ctx, name, nil, pulumi.URN_(urn))
	default:
		return nil, fmt.Errorf("unknown resource type: %s", typ)
	}

	return
}

type pkg struct {
	version semver.Version
}

func (p *pkg) Version() semver.Version {
	return p.version
}

func (p *pkg) ConstructProvider(ctx *pulumi.Context, name, typ, urn string) (pulumi.ProviderResource, error) {
	if typ != "pulumi:providers:aiven" {
		return nil, fmt.Errorf("unknown provider type: %s", typ)
	}

	return NewProvider(ctx, name, nil, pulumi.URN_(urn))
}

func init() {
	version, err := PkgVersion()
	if err != nil {
		fmt.Println("failed to determine package version. defaulting to v1: %v", err)
	}
	pulumi.RegisterResourceModule(
		"aiven",
		"index/account",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"aiven",
		"index/accountAuthentication",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"aiven",
		"index/accountTeam",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"aiven",
		"index/accountTeamMember",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"aiven",
		"index/accountTeamProject",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"aiven",
		"index/billingGroup",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"aiven",
		"index/cassandra",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"aiven",
		"index/connectionPool",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"aiven",
		"index/database",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"aiven",
		"index/elasticSearch",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"aiven",
		"index/elasticSearchAcl",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"aiven",
		"index/grafana",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"aiven",
		"index/influxDb",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"aiven",
		"index/kafka",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"aiven",
		"index/kafkaAcl",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"aiven",
		"index/kafkaConnect",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"aiven",
		"index/kafkaConnector",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"aiven",
		"index/kafkaMirrorMaker",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"aiven",
		"index/kafkaSchema",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"aiven",
		"index/kafkaSchemaConfiguration",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"aiven",
		"index/kafkaTopic",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"aiven",
		"index/m3Aggregator",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"aiven",
		"index/m3Db",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"aiven",
		"index/mirrorMakerReplicationFlow",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"aiven",
		"index/mySql",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"aiven",
		"index/pg",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"aiven",
		"index/project",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"aiven",
		"index/projectUser",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"aiven",
		"index/projectVpc",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"aiven",
		"index/redis",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"aiven",
		"index/service",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"aiven",
		"index/serviceIntegration",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"aiven",
		"index/serviceIntegrationEndpoint",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"aiven",
		"index/serviceUser",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"aiven",
		"index/transitGatewayVpcAttachment",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"aiven",
		"index/vpcPeeringConnection",
		&module{version},
	)
	pulumi.RegisterResourcePackage(
		"aiven",
		&pkg{version},
	)
}