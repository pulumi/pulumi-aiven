// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package aiven

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-aiven/sdk/v6/go/aiven/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Creates and manages an Aiven for Apache Kafka® [topic](https://aiven.io/docs/products/kafka/concepts).
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aiven/sdk/v6/go/aiven"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := aiven.NewKafkaTopic(ctx, "example_topic", &aiven.KafkaTopicArgs{
//				Project:               pulumi.Any(exampleProject.Project),
//				ServiceName:           pulumi.Any(exampleKafka.ServiceName),
//				TopicName:             pulumi.String("example-topic"),
//				Partitions:            pulumi.Int(5),
//				Replication:           pulumi.Int(3),
//				TerminationProtection: pulumi.Bool(true),
//				Config: &aiven.KafkaTopicConfigArgs{
//					FlushMs:       pulumi.String("10"),
//					CleanupPolicy: pulumi.String("compact,delete"),
//				},
//				OwnerUserGroupId: pulumi.Any(example.GroupId),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// ## Import
//
// ```sh
// $ pulumi import aiven:index/kafkaTopic:KafkaTopic example_topic PROJECT/SERVICE_NAME/TOPIC_NAME
// ```
type KafkaTopic struct {
	pulumi.CustomResourceState

	// [Advanced parameters](https://aiven.io/docs/products/kafka/reference/advanced-params) to configure topics.
	Config KafkaTopicConfigPtrOutput `pulumi:"config"`
	// The ID of the user group that owns the topic. Assigning ownership to decentralize topic management is part of [Aiven for Apache Kafka® governance](https://aiven.io/docs/products/kafka/concepts/governance-overview).
	OwnerUserGroupId pulumi.StringPtrOutput `pulumi:"ownerUserGroupId"`
	// The number of partitions to create in the topic.
	Partitions pulumi.IntOutput `pulumi:"partitions"`
	// The name of the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
	Project pulumi.StringOutput `pulumi:"project"`
	// The replication factor for the topic.
	Replication pulumi.IntOutput `pulumi:"replication"`
	// The name of the service that this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
	ServiceName pulumi.StringOutput `pulumi:"serviceName"`
	// Tags for the topic.
	Tags                  KafkaTopicTagArrayOutput `pulumi:"tags"`
	TerminationProtection pulumi.BoolPtrOutput     `pulumi:"terminationProtection"`
	// The description of the topic
	TopicDescription pulumi.StringPtrOutput `pulumi:"topicDescription"`
	// The name of the topic. Changing this property forces recreation of the resource.
	TopicName pulumi.StringOutput `pulumi:"topicName"`
}

// NewKafkaTopic registers a new resource with the given unique name, arguments, and options.
func NewKafkaTopic(ctx *pulumi.Context,
	name string, args *KafkaTopicArgs, opts ...pulumi.ResourceOption) (*KafkaTopic, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Partitions == nil {
		return nil, errors.New("invalid value for required argument 'Partitions'")
	}
	if args.Project == nil {
		return nil, errors.New("invalid value for required argument 'Project'")
	}
	if args.Replication == nil {
		return nil, errors.New("invalid value for required argument 'Replication'")
	}
	if args.ServiceName == nil {
		return nil, errors.New("invalid value for required argument 'ServiceName'")
	}
	if args.TopicName == nil {
		return nil, errors.New("invalid value for required argument 'TopicName'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource KafkaTopic
	err := ctx.RegisterResource("aiven:index/kafkaTopic:KafkaTopic", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetKafkaTopic gets an existing KafkaTopic resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetKafkaTopic(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *KafkaTopicState, opts ...pulumi.ResourceOption) (*KafkaTopic, error) {
	var resource KafkaTopic
	err := ctx.ReadResource("aiven:index/kafkaTopic:KafkaTopic", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering KafkaTopic resources.
type kafkaTopicState struct {
	// [Advanced parameters](https://aiven.io/docs/products/kafka/reference/advanced-params) to configure topics.
	Config *KafkaTopicConfig `pulumi:"config"`
	// The ID of the user group that owns the topic. Assigning ownership to decentralize topic management is part of [Aiven for Apache Kafka® governance](https://aiven.io/docs/products/kafka/concepts/governance-overview).
	OwnerUserGroupId *string `pulumi:"ownerUserGroupId"`
	// The number of partitions to create in the topic.
	Partitions *int `pulumi:"partitions"`
	// The name of the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
	Project *string `pulumi:"project"`
	// The replication factor for the topic.
	Replication *int `pulumi:"replication"`
	// The name of the service that this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
	ServiceName *string `pulumi:"serviceName"`
	// Tags for the topic.
	Tags                  []KafkaTopicTag `pulumi:"tags"`
	TerminationProtection *bool           `pulumi:"terminationProtection"`
	// The description of the topic
	TopicDescription *string `pulumi:"topicDescription"`
	// The name of the topic. Changing this property forces recreation of the resource.
	TopicName *string `pulumi:"topicName"`
}

type KafkaTopicState struct {
	// [Advanced parameters](https://aiven.io/docs/products/kafka/reference/advanced-params) to configure topics.
	Config KafkaTopicConfigPtrInput
	// The ID of the user group that owns the topic. Assigning ownership to decentralize topic management is part of [Aiven for Apache Kafka® governance](https://aiven.io/docs/products/kafka/concepts/governance-overview).
	OwnerUserGroupId pulumi.StringPtrInput
	// The number of partitions to create in the topic.
	Partitions pulumi.IntPtrInput
	// The name of the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
	Project pulumi.StringPtrInput
	// The replication factor for the topic.
	Replication pulumi.IntPtrInput
	// The name of the service that this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
	ServiceName pulumi.StringPtrInput
	// Tags for the topic.
	Tags                  KafkaTopicTagArrayInput
	TerminationProtection pulumi.BoolPtrInput
	// The description of the topic
	TopicDescription pulumi.StringPtrInput
	// The name of the topic. Changing this property forces recreation of the resource.
	TopicName pulumi.StringPtrInput
}

func (KafkaTopicState) ElementType() reflect.Type {
	return reflect.TypeOf((*kafkaTopicState)(nil)).Elem()
}

type kafkaTopicArgs struct {
	// [Advanced parameters](https://aiven.io/docs/products/kafka/reference/advanced-params) to configure topics.
	Config *KafkaTopicConfig `pulumi:"config"`
	// The ID of the user group that owns the topic. Assigning ownership to decentralize topic management is part of [Aiven for Apache Kafka® governance](https://aiven.io/docs/products/kafka/concepts/governance-overview).
	OwnerUserGroupId *string `pulumi:"ownerUserGroupId"`
	// The number of partitions to create in the topic.
	Partitions int `pulumi:"partitions"`
	// The name of the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
	Project string `pulumi:"project"`
	// The replication factor for the topic.
	Replication int `pulumi:"replication"`
	// The name of the service that this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
	ServiceName string `pulumi:"serviceName"`
	// Tags for the topic.
	Tags                  []KafkaTopicTag `pulumi:"tags"`
	TerminationProtection *bool           `pulumi:"terminationProtection"`
	// The description of the topic
	TopicDescription *string `pulumi:"topicDescription"`
	// The name of the topic. Changing this property forces recreation of the resource.
	TopicName string `pulumi:"topicName"`
}

// The set of arguments for constructing a KafkaTopic resource.
type KafkaTopicArgs struct {
	// [Advanced parameters](https://aiven.io/docs/products/kafka/reference/advanced-params) to configure topics.
	Config KafkaTopicConfigPtrInput
	// The ID of the user group that owns the topic. Assigning ownership to decentralize topic management is part of [Aiven for Apache Kafka® governance](https://aiven.io/docs/products/kafka/concepts/governance-overview).
	OwnerUserGroupId pulumi.StringPtrInput
	// The number of partitions to create in the topic.
	Partitions pulumi.IntInput
	// The name of the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
	Project pulumi.StringInput
	// The replication factor for the topic.
	Replication pulumi.IntInput
	// The name of the service that this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
	ServiceName pulumi.StringInput
	// Tags for the topic.
	Tags                  KafkaTopicTagArrayInput
	TerminationProtection pulumi.BoolPtrInput
	// The description of the topic
	TopicDescription pulumi.StringPtrInput
	// The name of the topic. Changing this property forces recreation of the resource.
	TopicName pulumi.StringInput
}

func (KafkaTopicArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*kafkaTopicArgs)(nil)).Elem()
}

type KafkaTopicInput interface {
	pulumi.Input

	ToKafkaTopicOutput() KafkaTopicOutput
	ToKafkaTopicOutputWithContext(ctx context.Context) KafkaTopicOutput
}

func (*KafkaTopic) ElementType() reflect.Type {
	return reflect.TypeOf((**KafkaTopic)(nil)).Elem()
}

func (i *KafkaTopic) ToKafkaTopicOutput() KafkaTopicOutput {
	return i.ToKafkaTopicOutputWithContext(context.Background())
}

func (i *KafkaTopic) ToKafkaTopicOutputWithContext(ctx context.Context) KafkaTopicOutput {
	return pulumi.ToOutputWithContext(ctx, i).(KafkaTopicOutput)
}

// KafkaTopicArrayInput is an input type that accepts KafkaTopicArray and KafkaTopicArrayOutput values.
// You can construct a concrete instance of `KafkaTopicArrayInput` via:
//
//	KafkaTopicArray{ KafkaTopicArgs{...} }
type KafkaTopicArrayInput interface {
	pulumi.Input

	ToKafkaTopicArrayOutput() KafkaTopicArrayOutput
	ToKafkaTopicArrayOutputWithContext(context.Context) KafkaTopicArrayOutput
}

type KafkaTopicArray []KafkaTopicInput

func (KafkaTopicArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*KafkaTopic)(nil)).Elem()
}

func (i KafkaTopicArray) ToKafkaTopicArrayOutput() KafkaTopicArrayOutput {
	return i.ToKafkaTopicArrayOutputWithContext(context.Background())
}

func (i KafkaTopicArray) ToKafkaTopicArrayOutputWithContext(ctx context.Context) KafkaTopicArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(KafkaTopicArrayOutput)
}

// KafkaTopicMapInput is an input type that accepts KafkaTopicMap and KafkaTopicMapOutput values.
// You can construct a concrete instance of `KafkaTopicMapInput` via:
//
//	KafkaTopicMap{ "key": KafkaTopicArgs{...} }
type KafkaTopicMapInput interface {
	pulumi.Input

	ToKafkaTopicMapOutput() KafkaTopicMapOutput
	ToKafkaTopicMapOutputWithContext(context.Context) KafkaTopicMapOutput
}

type KafkaTopicMap map[string]KafkaTopicInput

func (KafkaTopicMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*KafkaTopic)(nil)).Elem()
}

func (i KafkaTopicMap) ToKafkaTopicMapOutput() KafkaTopicMapOutput {
	return i.ToKafkaTopicMapOutputWithContext(context.Background())
}

func (i KafkaTopicMap) ToKafkaTopicMapOutputWithContext(ctx context.Context) KafkaTopicMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(KafkaTopicMapOutput)
}

type KafkaTopicOutput struct{ *pulumi.OutputState }

func (KafkaTopicOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**KafkaTopic)(nil)).Elem()
}

func (o KafkaTopicOutput) ToKafkaTopicOutput() KafkaTopicOutput {
	return o
}

func (o KafkaTopicOutput) ToKafkaTopicOutputWithContext(ctx context.Context) KafkaTopicOutput {
	return o
}

// [Advanced parameters](https://aiven.io/docs/products/kafka/reference/advanced-params) to configure topics.
func (o KafkaTopicOutput) Config() KafkaTopicConfigPtrOutput {
	return o.ApplyT(func(v *KafkaTopic) KafkaTopicConfigPtrOutput { return v.Config }).(KafkaTopicConfigPtrOutput)
}

// The ID of the user group that owns the topic. Assigning ownership to decentralize topic management is part of [Aiven for Apache Kafka® governance](https://aiven.io/docs/products/kafka/concepts/governance-overview).
func (o KafkaTopicOutput) OwnerUserGroupId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *KafkaTopic) pulumi.StringPtrOutput { return v.OwnerUserGroupId }).(pulumi.StringPtrOutput)
}

// The number of partitions to create in the topic.
func (o KafkaTopicOutput) Partitions() pulumi.IntOutput {
	return o.ApplyT(func(v *KafkaTopic) pulumi.IntOutput { return v.Partitions }).(pulumi.IntOutput)
}

// The name of the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
func (o KafkaTopicOutput) Project() pulumi.StringOutput {
	return o.ApplyT(func(v *KafkaTopic) pulumi.StringOutput { return v.Project }).(pulumi.StringOutput)
}

// The replication factor for the topic.
func (o KafkaTopicOutput) Replication() pulumi.IntOutput {
	return o.ApplyT(func(v *KafkaTopic) pulumi.IntOutput { return v.Replication }).(pulumi.IntOutput)
}

// The name of the service that this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
func (o KafkaTopicOutput) ServiceName() pulumi.StringOutput {
	return o.ApplyT(func(v *KafkaTopic) pulumi.StringOutput { return v.ServiceName }).(pulumi.StringOutput)
}

// Tags for the topic.
func (o KafkaTopicOutput) Tags() KafkaTopicTagArrayOutput {
	return o.ApplyT(func(v *KafkaTopic) KafkaTopicTagArrayOutput { return v.Tags }).(KafkaTopicTagArrayOutput)
}

func (o KafkaTopicOutput) TerminationProtection() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *KafkaTopic) pulumi.BoolPtrOutput { return v.TerminationProtection }).(pulumi.BoolPtrOutput)
}

// The description of the topic
func (o KafkaTopicOutput) TopicDescription() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *KafkaTopic) pulumi.StringPtrOutput { return v.TopicDescription }).(pulumi.StringPtrOutput)
}

// The name of the topic. Changing this property forces recreation of the resource.
func (o KafkaTopicOutput) TopicName() pulumi.StringOutput {
	return o.ApplyT(func(v *KafkaTopic) pulumi.StringOutput { return v.TopicName }).(pulumi.StringOutput)
}

type KafkaTopicArrayOutput struct{ *pulumi.OutputState }

func (KafkaTopicArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*KafkaTopic)(nil)).Elem()
}

func (o KafkaTopicArrayOutput) ToKafkaTopicArrayOutput() KafkaTopicArrayOutput {
	return o
}

func (o KafkaTopicArrayOutput) ToKafkaTopicArrayOutputWithContext(ctx context.Context) KafkaTopicArrayOutput {
	return o
}

func (o KafkaTopicArrayOutput) Index(i pulumi.IntInput) KafkaTopicOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *KafkaTopic {
		return vs[0].([]*KafkaTopic)[vs[1].(int)]
	}).(KafkaTopicOutput)
}

type KafkaTopicMapOutput struct{ *pulumi.OutputState }

func (KafkaTopicMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*KafkaTopic)(nil)).Elem()
}

func (o KafkaTopicMapOutput) ToKafkaTopicMapOutput() KafkaTopicMapOutput {
	return o
}

func (o KafkaTopicMapOutput) ToKafkaTopicMapOutputWithContext(ctx context.Context) KafkaTopicMapOutput {
	return o
}

func (o KafkaTopicMapOutput) MapIndex(k pulumi.StringInput) KafkaTopicOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *KafkaTopic {
		return vs[0].(map[string]*KafkaTopic)[vs[1].(string)]
	}).(KafkaTopicOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*KafkaTopicInput)(nil)).Elem(), &KafkaTopic{})
	pulumi.RegisterInputType(reflect.TypeOf((*KafkaTopicArrayInput)(nil)).Elem(), KafkaTopicArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*KafkaTopicMapInput)(nil)).Elem(), KafkaTopicMap{})
	pulumi.RegisterOutputType(KafkaTopicOutput{})
	pulumi.RegisterOutputType(KafkaTopicArrayOutput{})
	pulumi.RegisterOutputType(KafkaTopicMapOutput{})
}
