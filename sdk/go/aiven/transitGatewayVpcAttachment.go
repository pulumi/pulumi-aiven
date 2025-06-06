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

// The Transit Gateway VPC Attachment resource allows the creation and management Transit Gateway VPC Attachment VPC peering connection between Aiven and AWS.
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
//			_, err := aiven.NewTransitGatewayVpcAttachment(ctx, "attachment", &aiven.TransitGatewayVpcAttachmentArgs{
//				VpcId:            pulumi.Any(bar.Id),
//				PeerCloudAccount: pulumi.String("<PEER_ACCOUNT_ID>"),
//				PeerVpc:          pulumi.String("google-project1"),
//				PeerRegion:       pulumi.String("aws-eu-west-1"),
//				UserPeerNetworkCidrs: pulumi.StringArray{
//					pulumi.String("10.0.0.0/24"),
//				},
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
// $ pulumi import aiven:index/transitGatewayVpcAttachment:TransitGatewayVpcAttachment attachment PROJECT/VPC_ID/PEER_CLOUD_ACCOUNT/PEER_VPC/PEER_REGION
// ```
type TransitGatewayVpcAttachment struct {
	pulumi.CustomResourceState

	// AWS account ID or GCP project ID of the peered VPC. Changing this property forces recreation of the resource.
	PeerCloudAccount pulumi.StringOutput `pulumi:"peerCloudAccount"`
	// AWS region of the peered VPC (if not in the same region as Aiven VPC). This value can't be changed.
	PeerRegion pulumi.StringPtrOutput `pulumi:"peerRegion"`
	// Transit gateway ID. Changing this property forces recreation of the resource.
	PeerVpc pulumi.StringOutput `pulumi:"peerVpc"`
	// Cloud provider identifier for the peering connection if available
	PeeringConnectionId pulumi.StringOutput `pulumi:"peeringConnectionId"`
	// State of the peering connection
	State pulumi.StringOutput `pulumi:"state"`
	// State-specific help or error information
	StateInfo pulumi.StringMapOutput `pulumi:"stateInfo"`
	// List of private IPv4 ranges to route through the peering connection
	UserPeerNetworkCidrs pulumi.StringArrayOutput `pulumi:"userPeerNetworkCidrs"`
	// The VPC the peering connection belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
	VpcId pulumi.StringOutput `pulumi:"vpcId"`
}

// NewTransitGatewayVpcAttachment registers a new resource with the given unique name, arguments, and options.
func NewTransitGatewayVpcAttachment(ctx *pulumi.Context,
	name string, args *TransitGatewayVpcAttachmentArgs, opts ...pulumi.ResourceOption) (*TransitGatewayVpcAttachment, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.PeerCloudAccount == nil {
		return nil, errors.New("invalid value for required argument 'PeerCloudAccount'")
	}
	if args.PeerVpc == nil {
		return nil, errors.New("invalid value for required argument 'PeerVpc'")
	}
	if args.UserPeerNetworkCidrs == nil {
		return nil, errors.New("invalid value for required argument 'UserPeerNetworkCidrs'")
	}
	if args.VpcId == nil {
		return nil, errors.New("invalid value for required argument 'VpcId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource TransitGatewayVpcAttachment
	err := ctx.RegisterResource("aiven:index/transitGatewayVpcAttachment:TransitGatewayVpcAttachment", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetTransitGatewayVpcAttachment gets an existing TransitGatewayVpcAttachment resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetTransitGatewayVpcAttachment(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *TransitGatewayVpcAttachmentState, opts ...pulumi.ResourceOption) (*TransitGatewayVpcAttachment, error) {
	var resource TransitGatewayVpcAttachment
	err := ctx.ReadResource("aiven:index/transitGatewayVpcAttachment:TransitGatewayVpcAttachment", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering TransitGatewayVpcAttachment resources.
type transitGatewayVpcAttachmentState struct {
	// AWS account ID or GCP project ID of the peered VPC. Changing this property forces recreation of the resource.
	PeerCloudAccount *string `pulumi:"peerCloudAccount"`
	// AWS region of the peered VPC (if not in the same region as Aiven VPC). This value can't be changed.
	PeerRegion *string `pulumi:"peerRegion"`
	// Transit gateway ID. Changing this property forces recreation of the resource.
	PeerVpc *string `pulumi:"peerVpc"`
	// Cloud provider identifier for the peering connection if available
	PeeringConnectionId *string `pulumi:"peeringConnectionId"`
	// State of the peering connection
	State *string `pulumi:"state"`
	// State-specific help or error information
	StateInfo map[string]string `pulumi:"stateInfo"`
	// List of private IPv4 ranges to route through the peering connection
	UserPeerNetworkCidrs []string `pulumi:"userPeerNetworkCidrs"`
	// The VPC the peering connection belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
	VpcId *string `pulumi:"vpcId"`
}

type TransitGatewayVpcAttachmentState struct {
	// AWS account ID or GCP project ID of the peered VPC. Changing this property forces recreation of the resource.
	PeerCloudAccount pulumi.StringPtrInput
	// AWS region of the peered VPC (if not in the same region as Aiven VPC). This value can't be changed.
	PeerRegion pulumi.StringPtrInput
	// Transit gateway ID. Changing this property forces recreation of the resource.
	PeerVpc pulumi.StringPtrInput
	// Cloud provider identifier for the peering connection if available
	PeeringConnectionId pulumi.StringPtrInput
	// State of the peering connection
	State pulumi.StringPtrInput
	// State-specific help or error information
	StateInfo pulumi.StringMapInput
	// List of private IPv4 ranges to route through the peering connection
	UserPeerNetworkCidrs pulumi.StringArrayInput
	// The VPC the peering connection belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
	VpcId pulumi.StringPtrInput
}

func (TransitGatewayVpcAttachmentState) ElementType() reflect.Type {
	return reflect.TypeOf((*transitGatewayVpcAttachmentState)(nil)).Elem()
}

type transitGatewayVpcAttachmentArgs struct {
	// AWS account ID or GCP project ID of the peered VPC. Changing this property forces recreation of the resource.
	PeerCloudAccount string `pulumi:"peerCloudAccount"`
	// AWS region of the peered VPC (if not in the same region as Aiven VPC). This value can't be changed.
	PeerRegion *string `pulumi:"peerRegion"`
	// Transit gateway ID. Changing this property forces recreation of the resource.
	PeerVpc string `pulumi:"peerVpc"`
	// List of private IPv4 ranges to route through the peering connection
	UserPeerNetworkCidrs []string `pulumi:"userPeerNetworkCidrs"`
	// The VPC the peering connection belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
	VpcId string `pulumi:"vpcId"`
}

// The set of arguments for constructing a TransitGatewayVpcAttachment resource.
type TransitGatewayVpcAttachmentArgs struct {
	// AWS account ID or GCP project ID of the peered VPC. Changing this property forces recreation of the resource.
	PeerCloudAccount pulumi.StringInput
	// AWS region of the peered VPC (if not in the same region as Aiven VPC). This value can't be changed.
	PeerRegion pulumi.StringPtrInput
	// Transit gateway ID. Changing this property forces recreation of the resource.
	PeerVpc pulumi.StringInput
	// List of private IPv4 ranges to route through the peering connection
	UserPeerNetworkCidrs pulumi.StringArrayInput
	// The VPC the peering connection belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
	VpcId pulumi.StringInput
}

func (TransitGatewayVpcAttachmentArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*transitGatewayVpcAttachmentArgs)(nil)).Elem()
}

type TransitGatewayVpcAttachmentInput interface {
	pulumi.Input

	ToTransitGatewayVpcAttachmentOutput() TransitGatewayVpcAttachmentOutput
	ToTransitGatewayVpcAttachmentOutputWithContext(ctx context.Context) TransitGatewayVpcAttachmentOutput
}

func (*TransitGatewayVpcAttachment) ElementType() reflect.Type {
	return reflect.TypeOf((**TransitGatewayVpcAttachment)(nil)).Elem()
}

func (i *TransitGatewayVpcAttachment) ToTransitGatewayVpcAttachmentOutput() TransitGatewayVpcAttachmentOutput {
	return i.ToTransitGatewayVpcAttachmentOutputWithContext(context.Background())
}

func (i *TransitGatewayVpcAttachment) ToTransitGatewayVpcAttachmentOutputWithContext(ctx context.Context) TransitGatewayVpcAttachmentOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TransitGatewayVpcAttachmentOutput)
}

// TransitGatewayVpcAttachmentArrayInput is an input type that accepts TransitGatewayVpcAttachmentArray and TransitGatewayVpcAttachmentArrayOutput values.
// You can construct a concrete instance of `TransitGatewayVpcAttachmentArrayInput` via:
//
//	TransitGatewayVpcAttachmentArray{ TransitGatewayVpcAttachmentArgs{...} }
type TransitGatewayVpcAttachmentArrayInput interface {
	pulumi.Input

	ToTransitGatewayVpcAttachmentArrayOutput() TransitGatewayVpcAttachmentArrayOutput
	ToTransitGatewayVpcAttachmentArrayOutputWithContext(context.Context) TransitGatewayVpcAttachmentArrayOutput
}

type TransitGatewayVpcAttachmentArray []TransitGatewayVpcAttachmentInput

func (TransitGatewayVpcAttachmentArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*TransitGatewayVpcAttachment)(nil)).Elem()
}

func (i TransitGatewayVpcAttachmentArray) ToTransitGatewayVpcAttachmentArrayOutput() TransitGatewayVpcAttachmentArrayOutput {
	return i.ToTransitGatewayVpcAttachmentArrayOutputWithContext(context.Background())
}

func (i TransitGatewayVpcAttachmentArray) ToTransitGatewayVpcAttachmentArrayOutputWithContext(ctx context.Context) TransitGatewayVpcAttachmentArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TransitGatewayVpcAttachmentArrayOutput)
}

// TransitGatewayVpcAttachmentMapInput is an input type that accepts TransitGatewayVpcAttachmentMap and TransitGatewayVpcAttachmentMapOutput values.
// You can construct a concrete instance of `TransitGatewayVpcAttachmentMapInput` via:
//
//	TransitGatewayVpcAttachmentMap{ "key": TransitGatewayVpcAttachmentArgs{...} }
type TransitGatewayVpcAttachmentMapInput interface {
	pulumi.Input

	ToTransitGatewayVpcAttachmentMapOutput() TransitGatewayVpcAttachmentMapOutput
	ToTransitGatewayVpcAttachmentMapOutputWithContext(context.Context) TransitGatewayVpcAttachmentMapOutput
}

type TransitGatewayVpcAttachmentMap map[string]TransitGatewayVpcAttachmentInput

func (TransitGatewayVpcAttachmentMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*TransitGatewayVpcAttachment)(nil)).Elem()
}

func (i TransitGatewayVpcAttachmentMap) ToTransitGatewayVpcAttachmentMapOutput() TransitGatewayVpcAttachmentMapOutput {
	return i.ToTransitGatewayVpcAttachmentMapOutputWithContext(context.Background())
}

func (i TransitGatewayVpcAttachmentMap) ToTransitGatewayVpcAttachmentMapOutputWithContext(ctx context.Context) TransitGatewayVpcAttachmentMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TransitGatewayVpcAttachmentMapOutput)
}

type TransitGatewayVpcAttachmentOutput struct{ *pulumi.OutputState }

func (TransitGatewayVpcAttachmentOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**TransitGatewayVpcAttachment)(nil)).Elem()
}

func (o TransitGatewayVpcAttachmentOutput) ToTransitGatewayVpcAttachmentOutput() TransitGatewayVpcAttachmentOutput {
	return o
}

func (o TransitGatewayVpcAttachmentOutput) ToTransitGatewayVpcAttachmentOutputWithContext(ctx context.Context) TransitGatewayVpcAttachmentOutput {
	return o
}

// AWS account ID or GCP project ID of the peered VPC. Changing this property forces recreation of the resource.
func (o TransitGatewayVpcAttachmentOutput) PeerCloudAccount() pulumi.StringOutput {
	return o.ApplyT(func(v *TransitGatewayVpcAttachment) pulumi.StringOutput { return v.PeerCloudAccount }).(pulumi.StringOutput)
}

// AWS region of the peered VPC (if not in the same region as Aiven VPC). This value can't be changed.
func (o TransitGatewayVpcAttachmentOutput) PeerRegion() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *TransitGatewayVpcAttachment) pulumi.StringPtrOutput { return v.PeerRegion }).(pulumi.StringPtrOutput)
}

// Transit gateway ID. Changing this property forces recreation of the resource.
func (o TransitGatewayVpcAttachmentOutput) PeerVpc() pulumi.StringOutput {
	return o.ApplyT(func(v *TransitGatewayVpcAttachment) pulumi.StringOutput { return v.PeerVpc }).(pulumi.StringOutput)
}

// Cloud provider identifier for the peering connection if available
func (o TransitGatewayVpcAttachmentOutput) PeeringConnectionId() pulumi.StringOutput {
	return o.ApplyT(func(v *TransitGatewayVpcAttachment) pulumi.StringOutput { return v.PeeringConnectionId }).(pulumi.StringOutput)
}

// State of the peering connection
func (o TransitGatewayVpcAttachmentOutput) State() pulumi.StringOutput {
	return o.ApplyT(func(v *TransitGatewayVpcAttachment) pulumi.StringOutput { return v.State }).(pulumi.StringOutput)
}

// State-specific help or error information
func (o TransitGatewayVpcAttachmentOutput) StateInfo() pulumi.StringMapOutput {
	return o.ApplyT(func(v *TransitGatewayVpcAttachment) pulumi.StringMapOutput { return v.StateInfo }).(pulumi.StringMapOutput)
}

// List of private IPv4 ranges to route through the peering connection
func (o TransitGatewayVpcAttachmentOutput) UserPeerNetworkCidrs() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *TransitGatewayVpcAttachment) pulumi.StringArrayOutput { return v.UserPeerNetworkCidrs }).(pulumi.StringArrayOutput)
}

// The VPC the peering connection belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
func (o TransitGatewayVpcAttachmentOutput) VpcId() pulumi.StringOutput {
	return o.ApplyT(func(v *TransitGatewayVpcAttachment) pulumi.StringOutput { return v.VpcId }).(pulumi.StringOutput)
}

type TransitGatewayVpcAttachmentArrayOutput struct{ *pulumi.OutputState }

func (TransitGatewayVpcAttachmentArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*TransitGatewayVpcAttachment)(nil)).Elem()
}

func (o TransitGatewayVpcAttachmentArrayOutput) ToTransitGatewayVpcAttachmentArrayOutput() TransitGatewayVpcAttachmentArrayOutput {
	return o
}

func (o TransitGatewayVpcAttachmentArrayOutput) ToTransitGatewayVpcAttachmentArrayOutputWithContext(ctx context.Context) TransitGatewayVpcAttachmentArrayOutput {
	return o
}

func (o TransitGatewayVpcAttachmentArrayOutput) Index(i pulumi.IntInput) TransitGatewayVpcAttachmentOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *TransitGatewayVpcAttachment {
		return vs[0].([]*TransitGatewayVpcAttachment)[vs[1].(int)]
	}).(TransitGatewayVpcAttachmentOutput)
}

type TransitGatewayVpcAttachmentMapOutput struct{ *pulumi.OutputState }

func (TransitGatewayVpcAttachmentMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*TransitGatewayVpcAttachment)(nil)).Elem()
}

func (o TransitGatewayVpcAttachmentMapOutput) ToTransitGatewayVpcAttachmentMapOutput() TransitGatewayVpcAttachmentMapOutput {
	return o
}

func (o TransitGatewayVpcAttachmentMapOutput) ToTransitGatewayVpcAttachmentMapOutputWithContext(ctx context.Context) TransitGatewayVpcAttachmentMapOutput {
	return o
}

func (o TransitGatewayVpcAttachmentMapOutput) MapIndex(k pulumi.StringInput) TransitGatewayVpcAttachmentOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *TransitGatewayVpcAttachment {
		return vs[0].(map[string]*TransitGatewayVpcAttachment)[vs[1].(string)]
	}).(TransitGatewayVpcAttachmentOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*TransitGatewayVpcAttachmentInput)(nil)).Elem(), &TransitGatewayVpcAttachment{})
	pulumi.RegisterInputType(reflect.TypeOf((*TransitGatewayVpcAttachmentArrayInput)(nil)).Elem(), TransitGatewayVpcAttachmentArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*TransitGatewayVpcAttachmentMapInput)(nil)).Elem(), TransitGatewayVpcAttachmentMap{})
	pulumi.RegisterOutputType(TransitGatewayVpcAttachmentOutput{})
	pulumi.RegisterOutputType(TransitGatewayVpcAttachmentArrayOutput{})
	pulumi.RegisterOutputType(TransitGatewayVpcAttachmentMapOutput{})
}
