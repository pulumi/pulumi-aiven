// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aiven
{
    public static class GetAzureVpcPeeringConnection
    {
        /// <summary>
        /// Gets information about about an Azure VPC peering connection.
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
        ///     var azureToAivenPeering = Aiven.GetAzureVpcPeeringConnection.Invoke(new()
        ///     {
        ///         VpcId = exampleVpc.Id,
        ///         AzureSubscriptionId = "00000000-0000-0000-0000-000000000000",
        ///         PeerResourceGroup = "example-resource-group",
        ///         VnetName = "example-vnet",
        ///         PeerAzureAppId = "00000000-0000-0000-0000-000000000000",
        ///         PeerAzureTenantId = "00000000-0000-0000-0000-000000000000",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetAzureVpcPeeringConnectionResult> InvokeAsync(GetAzureVpcPeeringConnectionArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetAzureVpcPeeringConnectionResult>("aiven:index/getAzureVpcPeeringConnection:getAzureVpcPeeringConnection", args ?? new GetAzureVpcPeeringConnectionArgs(), options.WithDefaults());

        /// <summary>
        /// Gets information about about an Azure VPC peering connection.
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
        ///     var azureToAivenPeering = Aiven.GetAzureVpcPeeringConnection.Invoke(new()
        ///     {
        ///         VpcId = exampleVpc.Id,
        ///         AzureSubscriptionId = "00000000-0000-0000-0000-000000000000",
        ///         PeerResourceGroup = "example-resource-group",
        ///         VnetName = "example-vnet",
        ///         PeerAzureAppId = "00000000-0000-0000-0000-000000000000",
        ///         PeerAzureTenantId = "00000000-0000-0000-0000-000000000000",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetAzureVpcPeeringConnectionResult> Invoke(GetAzureVpcPeeringConnectionInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetAzureVpcPeeringConnectionResult>("aiven:index/getAzureVpcPeeringConnection:getAzureVpcPeeringConnection", args ?? new GetAzureVpcPeeringConnectionInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// Gets information about about an Azure VPC peering connection.
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
        ///     var azureToAivenPeering = Aiven.GetAzureVpcPeeringConnection.Invoke(new()
        ///     {
        ///         VpcId = exampleVpc.Id,
        ///         AzureSubscriptionId = "00000000-0000-0000-0000-000000000000",
        ///         PeerResourceGroup = "example-resource-group",
        ///         VnetName = "example-vnet",
        ///         PeerAzureAppId = "00000000-0000-0000-0000-000000000000",
        ///         PeerAzureTenantId = "00000000-0000-0000-0000-000000000000",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetAzureVpcPeeringConnectionResult> Invoke(GetAzureVpcPeeringConnectionInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetAzureVpcPeeringConnectionResult>("aiven:index/getAzureVpcPeeringConnection:getAzureVpcPeeringConnection", args ?? new GetAzureVpcPeeringConnectionInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetAzureVpcPeeringConnectionArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The ID of the Azure subscription in UUID4 format. Changing this property forces recreation of the resource.
        /// </summary>
        [Input("azureSubscriptionId", required: true)]
        public string AzureSubscriptionId { get; set; } = null!;

        /// <summary>
        /// The ID of the Azure app that is allowed to create a peering to the Azure Virtual Network (VNet) in UUID4 format. Changing this property forces recreation of the resource.
        /// </summary>
        [Input("peerAzureAppId", required: true)]
        public string PeerAzureAppId { get; set; } = null!;

        /// <summary>
        /// The Azure tenant ID in UUID4 format. Changing this property forces recreation of the resource.
        /// </summary>
        [Input("peerAzureTenantId", required: true)]
        public string PeerAzureTenantId { get; set; } = null!;

        /// <summary>
        /// The name of the Azure resource group associated with the VNet. Changing this property forces recreation of the resource.
        /// </summary>
        [Input("peerResourceGroup", required: true)]
        public string PeerResourceGroup { get; set; } = null!;

        /// <summary>
        /// The name of the Azure VNet. Changing this property forces recreation of the resource.
        /// </summary>
        [Input("vnetName", required: true)]
        public string VnetName { get; set; } = null!;

        /// <summary>
        /// The ID of the Aiven VPC. Changing this property forces recreation of the resource.
        /// </summary>
        [Input("vpcId", required: true)]
        public string VpcId { get; set; } = null!;

        public GetAzureVpcPeeringConnectionArgs()
        {
        }
        public static new GetAzureVpcPeeringConnectionArgs Empty => new GetAzureVpcPeeringConnectionArgs();
    }

    public sealed class GetAzureVpcPeeringConnectionInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The ID of the Azure subscription in UUID4 format. Changing this property forces recreation of the resource.
        /// </summary>
        [Input("azureSubscriptionId", required: true)]
        public Input<string> AzureSubscriptionId { get; set; } = null!;

        /// <summary>
        /// The ID of the Azure app that is allowed to create a peering to the Azure Virtual Network (VNet) in UUID4 format. Changing this property forces recreation of the resource.
        /// </summary>
        [Input("peerAzureAppId", required: true)]
        public Input<string> PeerAzureAppId { get; set; } = null!;

        /// <summary>
        /// The Azure tenant ID in UUID4 format. Changing this property forces recreation of the resource.
        /// </summary>
        [Input("peerAzureTenantId", required: true)]
        public Input<string> PeerAzureTenantId { get; set; } = null!;

        /// <summary>
        /// The name of the Azure resource group associated with the VNet. Changing this property forces recreation of the resource.
        /// </summary>
        [Input("peerResourceGroup", required: true)]
        public Input<string> PeerResourceGroup { get; set; } = null!;

        /// <summary>
        /// The name of the Azure VNet. Changing this property forces recreation of the resource.
        /// </summary>
        [Input("vnetName", required: true)]
        public Input<string> VnetName { get; set; } = null!;

        /// <summary>
        /// The ID of the Aiven VPC. Changing this property forces recreation of the resource.
        /// </summary>
        [Input("vpcId", required: true)]
        public Input<string> VpcId { get; set; } = null!;

        public GetAzureVpcPeeringConnectionInvokeArgs()
        {
        }
        public static new GetAzureVpcPeeringConnectionInvokeArgs Empty => new GetAzureVpcPeeringConnectionInvokeArgs();
    }


    [OutputType]
    public sealed class GetAzureVpcPeeringConnectionResult
    {
        /// <summary>
        /// The ID of the Azure subscription in UUID4 format. Changing this property forces recreation of the resource.
        /// </summary>
        public readonly string AzureSubscriptionId;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The ID of the Azure app that is allowed to create a peering to the Azure Virtual Network (VNet) in UUID4 format. Changing this property forces recreation of the resource.
        /// </summary>
        public readonly string PeerAzureAppId;
        /// <summary>
        /// The Azure tenant ID in UUID4 format. Changing this property forces recreation of the resource.
        /// </summary>
        public readonly string PeerAzureTenantId;
        /// <summary>
        /// The name of the Azure resource group associated with the VNet. Changing this property forces recreation of the resource.
        /// </summary>
        public readonly string PeerResourceGroup;
        /// <summary>
        /// The ID of the cloud provider for the peering connection.
        /// </summary>
        public readonly string PeeringConnectionId;
        /// <summary>
        /// State of the peering connection
        /// </summary>
        public readonly string State;
        /// <summary>
        /// State-specific help or error information.
        /// </summary>
        public readonly ImmutableDictionary<string, string> StateInfo;
        /// <summary>
        /// The name of the Azure VNet. Changing this property forces recreation of the resource.
        /// </summary>
        public readonly string VnetName;
        /// <summary>
        /// The ID of the Aiven VPC. Changing this property forces recreation of the resource.
        /// </summary>
        public readonly string VpcId;

        [OutputConstructor]
        private GetAzureVpcPeeringConnectionResult(
            string azureSubscriptionId,

            string id,

            string peerAzureAppId,

            string peerAzureTenantId,

            string peerResourceGroup,

            string peeringConnectionId,

            string state,

            ImmutableDictionary<string, string> stateInfo,

            string vnetName,

            string vpcId)
        {
            AzureSubscriptionId = azureSubscriptionId;
            Id = id;
            PeerAzureAppId = peerAzureAppId;
            PeerAzureTenantId = peerAzureTenantId;
            PeerResourceGroup = peerResourceGroup;
            PeeringConnectionId = peeringConnectionId;
            State = state;
            StateInfo = stateInfo;
            VnetName = vnetName;
            VpcId = vpcId;
        }
    }
}
