// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aiven.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetAzureVpcPeeringConnectionArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAzureVpcPeeringConnectionArgs Empty = new GetAzureVpcPeeringConnectionArgs();

    /**
     * The ID of the Azure subscription in UUID4 format. Changing this property forces recreation of the resource.
     * 
     */
    @Import(name="azureSubscriptionId", required=true)
    private Output<String> azureSubscriptionId;

    /**
     * @return The ID of the Azure subscription in UUID4 format. Changing this property forces recreation of the resource.
     * 
     */
    public Output<String> azureSubscriptionId() {
        return this.azureSubscriptionId;
    }

    /**
     * The ID of the Azure app that is allowed to create a peering to the Azure Virtual Network (VNet) in UUID4 format. Changing this property forces recreation of the resource.
     * 
     */
    @Import(name="peerAzureAppId", required=true)
    private Output<String> peerAzureAppId;

    /**
     * @return The ID of the Azure app that is allowed to create a peering to the Azure Virtual Network (VNet) in UUID4 format. Changing this property forces recreation of the resource.
     * 
     */
    public Output<String> peerAzureAppId() {
        return this.peerAzureAppId;
    }

    /**
     * The Azure tenant ID in UUID4 format. Changing this property forces recreation of the resource.
     * 
     */
    @Import(name="peerAzureTenantId", required=true)
    private Output<String> peerAzureTenantId;

    /**
     * @return The Azure tenant ID in UUID4 format. Changing this property forces recreation of the resource.
     * 
     */
    public Output<String> peerAzureTenantId() {
        return this.peerAzureTenantId;
    }

    /**
     * The name of the Azure resource group associated with the VNet. Changing this property forces recreation of the resource.
     * 
     */
    @Import(name="peerResourceGroup", required=true)
    private Output<String> peerResourceGroup;

    /**
     * @return The name of the Azure resource group associated with the VNet. Changing this property forces recreation of the resource.
     * 
     */
    public Output<String> peerResourceGroup() {
        return this.peerResourceGroup;
    }

    /**
     * The name of the Azure VNet. Changing this property forces recreation of the resource.
     * 
     */
    @Import(name="vnetName", required=true)
    private Output<String> vnetName;

    /**
     * @return The name of the Azure VNet. Changing this property forces recreation of the resource.
     * 
     */
    public Output<String> vnetName() {
        return this.vnetName;
    }

    /**
     * The ID of the Aiven VPC. Changing this property forces recreation of the resource.
     * 
     */
    @Import(name="vpcId", required=true)
    private Output<String> vpcId;

    /**
     * @return The ID of the Aiven VPC. Changing this property forces recreation of the resource.
     * 
     */
    public Output<String> vpcId() {
        return this.vpcId;
    }

    private GetAzureVpcPeeringConnectionArgs() {}

    private GetAzureVpcPeeringConnectionArgs(GetAzureVpcPeeringConnectionArgs $) {
        this.azureSubscriptionId = $.azureSubscriptionId;
        this.peerAzureAppId = $.peerAzureAppId;
        this.peerAzureTenantId = $.peerAzureTenantId;
        this.peerResourceGroup = $.peerResourceGroup;
        this.vnetName = $.vnetName;
        this.vpcId = $.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAzureVpcPeeringConnectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAzureVpcPeeringConnectionArgs $;

        public Builder() {
            $ = new GetAzureVpcPeeringConnectionArgs();
        }

        public Builder(GetAzureVpcPeeringConnectionArgs defaults) {
            $ = new GetAzureVpcPeeringConnectionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param azureSubscriptionId The ID of the Azure subscription in UUID4 format. Changing this property forces recreation of the resource.
         * 
         * @return builder
         * 
         */
        public Builder azureSubscriptionId(Output<String> azureSubscriptionId) {
            $.azureSubscriptionId = azureSubscriptionId;
            return this;
        }

        /**
         * @param azureSubscriptionId The ID of the Azure subscription in UUID4 format. Changing this property forces recreation of the resource.
         * 
         * @return builder
         * 
         */
        public Builder azureSubscriptionId(String azureSubscriptionId) {
            return azureSubscriptionId(Output.of(azureSubscriptionId));
        }

        /**
         * @param peerAzureAppId The ID of the Azure app that is allowed to create a peering to the Azure Virtual Network (VNet) in UUID4 format. Changing this property forces recreation of the resource.
         * 
         * @return builder
         * 
         */
        public Builder peerAzureAppId(Output<String> peerAzureAppId) {
            $.peerAzureAppId = peerAzureAppId;
            return this;
        }

        /**
         * @param peerAzureAppId The ID of the Azure app that is allowed to create a peering to the Azure Virtual Network (VNet) in UUID4 format. Changing this property forces recreation of the resource.
         * 
         * @return builder
         * 
         */
        public Builder peerAzureAppId(String peerAzureAppId) {
            return peerAzureAppId(Output.of(peerAzureAppId));
        }

        /**
         * @param peerAzureTenantId The Azure tenant ID in UUID4 format. Changing this property forces recreation of the resource.
         * 
         * @return builder
         * 
         */
        public Builder peerAzureTenantId(Output<String> peerAzureTenantId) {
            $.peerAzureTenantId = peerAzureTenantId;
            return this;
        }

        /**
         * @param peerAzureTenantId The Azure tenant ID in UUID4 format. Changing this property forces recreation of the resource.
         * 
         * @return builder
         * 
         */
        public Builder peerAzureTenantId(String peerAzureTenantId) {
            return peerAzureTenantId(Output.of(peerAzureTenantId));
        }

        /**
         * @param peerResourceGroup The name of the Azure resource group associated with the VNet. Changing this property forces recreation of the resource.
         * 
         * @return builder
         * 
         */
        public Builder peerResourceGroup(Output<String> peerResourceGroup) {
            $.peerResourceGroup = peerResourceGroup;
            return this;
        }

        /**
         * @param peerResourceGroup The name of the Azure resource group associated with the VNet. Changing this property forces recreation of the resource.
         * 
         * @return builder
         * 
         */
        public Builder peerResourceGroup(String peerResourceGroup) {
            return peerResourceGroup(Output.of(peerResourceGroup));
        }

        /**
         * @param vnetName The name of the Azure VNet. Changing this property forces recreation of the resource.
         * 
         * @return builder
         * 
         */
        public Builder vnetName(Output<String> vnetName) {
            $.vnetName = vnetName;
            return this;
        }

        /**
         * @param vnetName The name of the Azure VNet. Changing this property forces recreation of the resource.
         * 
         * @return builder
         * 
         */
        public Builder vnetName(String vnetName) {
            return vnetName(Output.of(vnetName));
        }

        /**
         * @param vpcId The ID of the Aiven VPC. Changing this property forces recreation of the resource.
         * 
         * @return builder
         * 
         */
        public Builder vpcId(Output<String> vpcId) {
            $.vpcId = vpcId;
            return this;
        }

        /**
         * @param vpcId The ID of the Aiven VPC. Changing this property forces recreation of the resource.
         * 
         * @return builder
         * 
         */
        public Builder vpcId(String vpcId) {
            return vpcId(Output.of(vpcId));
        }

        public GetAzureVpcPeeringConnectionArgs build() {
            if ($.azureSubscriptionId == null) {
                throw new MissingRequiredPropertyException("GetAzureVpcPeeringConnectionArgs", "azureSubscriptionId");
            }
            if ($.peerAzureAppId == null) {
                throw new MissingRequiredPropertyException("GetAzureVpcPeeringConnectionArgs", "peerAzureAppId");
            }
            if ($.peerAzureTenantId == null) {
                throw new MissingRequiredPropertyException("GetAzureVpcPeeringConnectionArgs", "peerAzureTenantId");
            }
            if ($.peerResourceGroup == null) {
                throw new MissingRequiredPropertyException("GetAzureVpcPeeringConnectionArgs", "peerResourceGroup");
            }
            if ($.vnetName == null) {
                throw new MissingRequiredPropertyException("GetAzureVpcPeeringConnectionArgs", "vnetName");
            }
            if ($.vpcId == null) {
                throw new MissingRequiredPropertyException("GetAzureVpcPeeringConnectionArgs", "vpcId");
            }
            return $;
        }
    }

}