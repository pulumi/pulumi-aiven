// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aiven
{
    public static class GetAwsOrgVpcPeeringConnection
    {
        /// <summary>
        /// Gets information about an AWS VPC peering connection.
        /// 
        /// **This resource is in the beta stage and may change without notice.** Set
        /// the `PROVIDER_AIVEN_ENABLE_BETA` environment variable to use the resource.
        /// </summary>
        public static Task<GetAwsOrgVpcPeeringConnectionResult> InvokeAsync(GetAwsOrgVpcPeeringConnectionArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetAwsOrgVpcPeeringConnectionResult>("aiven:index/getAwsOrgVpcPeeringConnection:getAwsOrgVpcPeeringConnection", args ?? new GetAwsOrgVpcPeeringConnectionArgs(), options.WithDefaults());

        /// <summary>
        /// Gets information about an AWS VPC peering connection.
        /// 
        /// **This resource is in the beta stage and may change without notice.** Set
        /// the `PROVIDER_AIVEN_ENABLE_BETA` environment variable to use the resource.
        /// </summary>
        public static Output<GetAwsOrgVpcPeeringConnectionResult> Invoke(GetAwsOrgVpcPeeringConnectionInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetAwsOrgVpcPeeringConnectionResult>("aiven:index/getAwsOrgVpcPeeringConnection:getAwsOrgVpcPeeringConnection", args ?? new GetAwsOrgVpcPeeringConnectionInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// Gets information about an AWS VPC peering connection.
        /// 
        /// **This resource is in the beta stage and may change without notice.** Set
        /// the `PROVIDER_AIVEN_ENABLE_BETA` environment variable to use the resource.
        /// </summary>
        public static Output<GetAwsOrgVpcPeeringConnectionResult> Invoke(GetAwsOrgVpcPeeringConnectionInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetAwsOrgVpcPeeringConnectionResult>("aiven:index/getAwsOrgVpcPeeringConnection:getAwsOrgVpcPeeringConnection", args ?? new GetAwsOrgVpcPeeringConnectionInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetAwsOrgVpcPeeringConnectionArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// AWS account ID. Changing this property forces recreation of the resource.
        /// </summary>
        [Input("awsAccountId", required: true)]
        public string AwsAccountId { get; set; } = null!;

        /// <summary>
        /// AWS VPC ID. Changing this property forces recreation of the resource.
        /// </summary>
        [Input("awsVpcId", required: true)]
        public string AwsVpcId { get; set; } = null!;

        /// <summary>
        /// The AWS region of the peered VPC. For example, `eu-central-1`.
        /// </summary>
        [Input("awsVpcRegion", required: true)]
        public string AwsVpcRegion { get; set; } = null!;

        /// <summary>
        /// Identifier of the organization.
        /// </summary>
        [Input("organizationId", required: true)]
        public string OrganizationId { get; set; } = null!;

        /// <summary>
        /// Identifier of the organization VPC.
        /// </summary>
        [Input("organizationVpcId", required: true)]
        public string OrganizationVpcId { get; set; } = null!;

        public GetAwsOrgVpcPeeringConnectionArgs()
        {
        }
        public static new GetAwsOrgVpcPeeringConnectionArgs Empty => new GetAwsOrgVpcPeeringConnectionArgs();
    }

    public sealed class GetAwsOrgVpcPeeringConnectionInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// AWS account ID. Changing this property forces recreation of the resource.
        /// </summary>
        [Input("awsAccountId", required: true)]
        public Input<string> AwsAccountId { get; set; } = null!;

        /// <summary>
        /// AWS VPC ID. Changing this property forces recreation of the resource.
        /// </summary>
        [Input("awsVpcId", required: true)]
        public Input<string> AwsVpcId { get; set; } = null!;

        /// <summary>
        /// The AWS region of the peered VPC. For example, `eu-central-1`.
        /// </summary>
        [Input("awsVpcRegion", required: true)]
        public Input<string> AwsVpcRegion { get; set; } = null!;

        /// <summary>
        /// Identifier of the organization.
        /// </summary>
        [Input("organizationId", required: true)]
        public Input<string> OrganizationId { get; set; } = null!;

        /// <summary>
        /// Identifier of the organization VPC.
        /// </summary>
        [Input("organizationVpcId", required: true)]
        public Input<string> OrganizationVpcId { get; set; } = null!;

        public GetAwsOrgVpcPeeringConnectionInvokeArgs()
        {
        }
        public static new GetAwsOrgVpcPeeringConnectionInvokeArgs Empty => new GetAwsOrgVpcPeeringConnectionInvokeArgs();
    }


    [OutputType]
    public sealed class GetAwsOrgVpcPeeringConnectionResult
    {
        /// <summary>
        /// AWS account ID. Changing this property forces recreation of the resource.
        /// </summary>
        public readonly string AwsAccountId;
        /// <summary>
        /// AWS VPC ID. Changing this property forces recreation of the resource.
        /// </summary>
        public readonly string AwsVpcId;
        /// <summary>
        /// The ID of the AWS VPC peering connection.
        /// </summary>
        public readonly string AwsVpcPeeringConnectionId;
        /// <summary>
        /// The AWS region of the peered VPC. For example, `eu-central-1`.
        /// </summary>
        public readonly string AwsVpcRegion;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Identifier of the organization.
        /// </summary>
        public readonly string OrganizationId;
        /// <summary>
        /// Identifier of the organization VPC.
        /// </summary>
        public readonly string OrganizationVpcId;
        /// <summary>
        /// The ID of the peering connection.
        /// </summary>
        public readonly string PeeringConnectionId;
        /// <summary>
        /// State of the peering connection. The possible values are `ACTIVE`, `APPROVED`, `APPROVED_PEER_REQUESTED`, `DELETED`, `DELETED_BY_PEER`, `DELETING`, `ERROR`, `INVALID_SPECIFICATION`, `PENDING_PEER` and `REJECTED_BY_PEER`.
        /// </summary>
        public readonly string State;

        [OutputConstructor]
        private GetAwsOrgVpcPeeringConnectionResult(
            string awsAccountId,

            string awsVpcId,

            string awsVpcPeeringConnectionId,

            string awsVpcRegion,

            string id,

            string organizationId,

            string organizationVpcId,

            string peeringConnectionId,

            string state)
        {
            AwsAccountId = awsAccountId;
            AwsVpcId = awsVpcId;
            AwsVpcPeeringConnectionId = awsVpcPeeringConnectionId;
            AwsVpcRegion = awsVpcRegion;
            Id = id;
            OrganizationId = organizationId;
            OrganizationVpcId = organizationVpcId;
            PeeringConnectionId = peeringConnectionId;
            State = state;
        }
    }
}
