// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aiven.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetAzureOrgVpcPeeringConnectionPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAzureOrgVpcPeeringConnectionPlainArgs Empty = new GetAzureOrgVpcPeeringConnectionPlainArgs();

    /**
     * The ID of the Azure subscription in UUID4 format. Changing this property forces recreation of the resource.
     * 
     */
    @Import(name="azureSubscriptionId", required=true)
    private String azureSubscriptionId;

    /**
     * @return The ID of the Azure subscription in UUID4 format. Changing this property forces recreation of the resource.
     * 
     */
    public String azureSubscriptionId() {
        return this.azureSubscriptionId;
    }

    /**
     * Identifier of the organization.
     * 
     */
    @Import(name="organizationId", required=true)
    private String organizationId;

    /**
     * @return Identifier of the organization.
     * 
     */
    public String organizationId() {
        return this.organizationId;
    }

    /**
     * Identifier of the organization VPC.
     * 
     */
    @Import(name="organizationVpcId", required=true)
    private String organizationVpcId;

    /**
     * @return Identifier of the organization VPC.
     * 
     */
    public String organizationVpcId() {
        return this.organizationVpcId;
    }

    /**
     * The name of the Azure resource group associated with the VNet. Changing this property forces recreation of the resource.
     * 
     */
    @Import(name="peerResourceGroup", required=true)
    private String peerResourceGroup;

    /**
     * @return The name of the Azure resource group associated with the VNet. Changing this property forces recreation of the resource.
     * 
     */
    public String peerResourceGroup() {
        return this.peerResourceGroup;
    }

    /**
     * The name of the Azure VNet. Changing this property forces recreation of the resource.
     * 
     */
    @Import(name="vnetName", required=true)
    private String vnetName;

    /**
     * @return The name of the Azure VNet. Changing this property forces recreation of the resource.
     * 
     */
    public String vnetName() {
        return this.vnetName;
    }

    private GetAzureOrgVpcPeeringConnectionPlainArgs() {}

    private GetAzureOrgVpcPeeringConnectionPlainArgs(GetAzureOrgVpcPeeringConnectionPlainArgs $) {
        this.azureSubscriptionId = $.azureSubscriptionId;
        this.organizationId = $.organizationId;
        this.organizationVpcId = $.organizationVpcId;
        this.peerResourceGroup = $.peerResourceGroup;
        this.vnetName = $.vnetName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAzureOrgVpcPeeringConnectionPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAzureOrgVpcPeeringConnectionPlainArgs $;

        public Builder() {
            $ = new GetAzureOrgVpcPeeringConnectionPlainArgs();
        }

        public Builder(GetAzureOrgVpcPeeringConnectionPlainArgs defaults) {
            $ = new GetAzureOrgVpcPeeringConnectionPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param azureSubscriptionId The ID of the Azure subscription in UUID4 format. Changing this property forces recreation of the resource.
         * 
         * @return builder
         * 
         */
        public Builder azureSubscriptionId(String azureSubscriptionId) {
            $.azureSubscriptionId = azureSubscriptionId;
            return this;
        }

        /**
         * @param organizationId Identifier of the organization.
         * 
         * @return builder
         * 
         */
        public Builder organizationId(String organizationId) {
            $.organizationId = organizationId;
            return this;
        }

        /**
         * @param organizationVpcId Identifier of the organization VPC.
         * 
         * @return builder
         * 
         */
        public Builder organizationVpcId(String organizationVpcId) {
            $.organizationVpcId = organizationVpcId;
            return this;
        }

        /**
         * @param peerResourceGroup The name of the Azure resource group associated with the VNet. Changing this property forces recreation of the resource.
         * 
         * @return builder
         * 
         */
        public Builder peerResourceGroup(String peerResourceGroup) {
            $.peerResourceGroup = peerResourceGroup;
            return this;
        }

        /**
         * @param vnetName The name of the Azure VNet. Changing this property forces recreation of the resource.
         * 
         * @return builder
         * 
         */
        public Builder vnetName(String vnetName) {
            $.vnetName = vnetName;
            return this;
        }

        public GetAzureOrgVpcPeeringConnectionPlainArgs build() {
            if ($.azureSubscriptionId == null) {
                throw new MissingRequiredPropertyException("GetAzureOrgVpcPeeringConnectionPlainArgs", "azureSubscriptionId");
            }
            if ($.organizationId == null) {
                throw new MissingRequiredPropertyException("GetAzureOrgVpcPeeringConnectionPlainArgs", "organizationId");
            }
            if ($.organizationVpcId == null) {
                throw new MissingRequiredPropertyException("GetAzureOrgVpcPeeringConnectionPlainArgs", "organizationVpcId");
            }
            if ($.peerResourceGroup == null) {
                throw new MissingRequiredPropertyException("GetAzureOrgVpcPeeringConnectionPlainArgs", "peerResourceGroup");
            }
            if ($.vnetName == null) {
                throw new MissingRequiredPropertyException("GetAzureOrgVpcPeeringConnectionPlainArgs", "vnetName");
            }
            return $;
        }
    }

}
