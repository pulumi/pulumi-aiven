// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aiven
{
    public static class GetAwsVpcPeeringConnection
    {
        /// <summary>
        /// Gets information about an AWS VPC peering connection.
        /// 
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Aiven = Pulumi.Aiven;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var exampleVpc = new Aiven.ProjectVpc("example_vpc", new()
        ///     {
        ///         Project = exampleProject.Project,
        ///         CloudName = "google-europe-west1",
        ///         NetworkCidr = "192.168.1.0/24",
        ///     });
        /// 
        ///     var awsToAivenPeering = Aiven.GetAwsVpcPeeringConnection.Invoke(new()
        ///     {
        ///         VpcId = exampleVpc.Id,
        ///         AwsAccountId = awsId,
        ///         AwsVpcId = "vpc-1a2b3c4d5e6f7g8h9",
        ///         AwsVpcRegion = "aws-us-east-2",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetAwsVpcPeeringConnectionResult> InvokeAsync(GetAwsVpcPeeringConnectionArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetAwsVpcPeeringConnectionResult>("aiven:index/getAwsVpcPeeringConnection:getAwsVpcPeeringConnection", args ?? new GetAwsVpcPeeringConnectionArgs(), options.WithDefaults());

        /// <summary>
        /// Gets information about an AWS VPC peering connection.
        /// 
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Aiven = Pulumi.Aiven;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var exampleVpc = new Aiven.ProjectVpc("example_vpc", new()
        ///     {
        ///         Project = exampleProject.Project,
        ///         CloudName = "google-europe-west1",
        ///         NetworkCidr = "192.168.1.0/24",
        ///     });
        /// 
        ///     var awsToAivenPeering = Aiven.GetAwsVpcPeeringConnection.Invoke(new()
        ///     {
        ///         VpcId = exampleVpc.Id,
        ///         AwsAccountId = awsId,
        ///         AwsVpcId = "vpc-1a2b3c4d5e6f7g8h9",
        ///         AwsVpcRegion = "aws-us-east-2",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetAwsVpcPeeringConnectionResult> Invoke(GetAwsVpcPeeringConnectionInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetAwsVpcPeeringConnectionResult>("aiven:index/getAwsVpcPeeringConnection:getAwsVpcPeeringConnection", args ?? new GetAwsVpcPeeringConnectionInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// Gets information about an AWS VPC peering connection.
        /// 
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Aiven = Pulumi.Aiven;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var exampleVpc = new Aiven.ProjectVpc("example_vpc", new()
        ///     {
        ///         Project = exampleProject.Project,
        ///         CloudName = "google-europe-west1",
        ///         NetworkCidr = "192.168.1.0/24",
        ///     });
        /// 
        ///     var awsToAivenPeering = Aiven.GetAwsVpcPeeringConnection.Invoke(new()
        ///     {
        ///         VpcId = exampleVpc.Id,
        ///         AwsAccountId = awsId,
        ///         AwsVpcId = "vpc-1a2b3c4d5e6f7g8h9",
        ///         AwsVpcRegion = "aws-us-east-2",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetAwsVpcPeeringConnectionResult> Invoke(GetAwsVpcPeeringConnectionInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetAwsVpcPeeringConnectionResult>("aiven:index/getAwsVpcPeeringConnection:getAwsVpcPeeringConnection", args ?? new GetAwsVpcPeeringConnectionInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetAwsVpcPeeringConnectionArgs : global::Pulumi.InvokeArgs
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
        /// The AWS region of the peered VPC, if different from the Aiven VPC region. Changing this property forces recreation of the resource.
        /// </summary>
        [Input("awsVpcRegion", required: true)]
        public string AwsVpcRegion { get; set; } = null!;

        /// <summary>
        /// The ID of the Aiven VPC. Changing this property forces recreation of the resource.
        /// </summary>
        [Input("vpcId", required: true)]
        public string VpcId { get; set; } = null!;

        public GetAwsVpcPeeringConnectionArgs()
        {
        }
        public static new GetAwsVpcPeeringConnectionArgs Empty => new GetAwsVpcPeeringConnectionArgs();
    }

    public sealed class GetAwsVpcPeeringConnectionInvokeArgs : global::Pulumi.InvokeArgs
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
        /// The AWS region of the peered VPC, if different from the Aiven VPC region. Changing this property forces recreation of the resource.
        /// </summary>
        [Input("awsVpcRegion", required: true)]
        public Input<string> AwsVpcRegion { get; set; } = null!;

        /// <summary>
        /// The ID of the Aiven VPC. Changing this property forces recreation of the resource.
        /// </summary>
        [Input("vpcId", required: true)]
        public Input<string> VpcId { get; set; } = null!;

        public GetAwsVpcPeeringConnectionInvokeArgs()
        {
        }
        public static new GetAwsVpcPeeringConnectionInvokeArgs Empty => new GetAwsVpcPeeringConnectionInvokeArgs();
    }


    [OutputType]
    public sealed class GetAwsVpcPeeringConnectionResult
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
        /// The AWS region of the peered VPC, if different from the Aiven VPC region. Changing this property forces recreation of the resource.
        /// </summary>
        public readonly string AwsVpcRegion;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The state of the peering connection.
        /// </summary>
        public readonly string State;
        /// <summary>
        /// State-specific help or error information.
        /// </summary>
        public readonly ImmutableDictionary<string, string> StateInfo;
        /// <summary>
        /// The ID of the Aiven VPC. Changing this property forces recreation of the resource.
        /// </summary>
        public readonly string VpcId;

        [OutputConstructor]
        private GetAwsVpcPeeringConnectionResult(
            string awsAccountId,

            string awsVpcId,

            string awsVpcPeeringConnectionId,

            string awsVpcRegion,

            string id,

            string state,

            ImmutableDictionary<string, string> stateInfo,

            string vpcId)
        {
            AwsAccountId = awsAccountId;
            AwsVpcId = awsVpcId;
            AwsVpcPeeringConnectionId = awsVpcPeeringConnectionId;
            AwsVpcRegion = awsVpcRegion;
            Id = id;
            State = state;
            StateInfo = stateInfo;
            VpcId = vpcId;
        }
    }
}
