// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aiven.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetTransitGatewayVpcAttachmentPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetTransitGatewayVpcAttachmentPlainArgs Empty = new GetTransitGatewayVpcAttachmentPlainArgs();

    /**
     * AWS account ID or GCP project ID of the peered VPC. Changing this property forces recreation of the resource.
     * 
     */
    @Import(name="peerCloudAccount", required=true)
    private String peerCloudAccount;

    /**
     * @return AWS account ID or GCP project ID of the peered VPC. Changing this property forces recreation of the resource.
     * 
     */
    public String peerCloudAccount() {
        return this.peerCloudAccount;
    }

    /**
     * Transit gateway ID. Changing this property forces recreation of the resource.
     * 
     */
    @Import(name="peerVpc", required=true)
    private String peerVpc;

    /**
     * @return Transit gateway ID. Changing this property forces recreation of the resource.
     * 
     */
    public String peerVpc() {
        return this.peerVpc;
    }

    /**
     * The VPC the peering connection belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
     * 
     */
    @Import(name="vpcId", required=true)
    private String vpcId;

    /**
     * @return The VPC the peering connection belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
     * 
     */
    public String vpcId() {
        return this.vpcId;
    }

    private GetTransitGatewayVpcAttachmentPlainArgs() {}

    private GetTransitGatewayVpcAttachmentPlainArgs(GetTransitGatewayVpcAttachmentPlainArgs $) {
        this.peerCloudAccount = $.peerCloudAccount;
        this.peerVpc = $.peerVpc;
        this.vpcId = $.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetTransitGatewayVpcAttachmentPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetTransitGatewayVpcAttachmentPlainArgs $;

        public Builder() {
            $ = new GetTransitGatewayVpcAttachmentPlainArgs();
        }

        public Builder(GetTransitGatewayVpcAttachmentPlainArgs defaults) {
            $ = new GetTransitGatewayVpcAttachmentPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param peerCloudAccount AWS account ID or GCP project ID of the peered VPC. Changing this property forces recreation of the resource.
         * 
         * @return builder
         * 
         */
        public Builder peerCloudAccount(String peerCloudAccount) {
            $.peerCloudAccount = peerCloudAccount;
            return this;
        }

        /**
         * @param peerVpc Transit gateway ID. Changing this property forces recreation of the resource.
         * 
         * @return builder
         * 
         */
        public Builder peerVpc(String peerVpc) {
            $.peerVpc = peerVpc;
            return this;
        }

        /**
         * @param vpcId The VPC the peering connection belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
         * 
         * @return builder
         * 
         */
        public Builder vpcId(String vpcId) {
            $.vpcId = vpcId;
            return this;
        }

        public GetTransitGatewayVpcAttachmentPlainArgs build() {
            if ($.peerCloudAccount == null) {
                throw new MissingRequiredPropertyException("GetTransitGatewayVpcAttachmentPlainArgs", "peerCloudAccount");
            }
            if ($.peerVpc == null) {
                throw new MissingRequiredPropertyException("GetTransitGatewayVpcAttachmentPlainArgs", "peerVpc");
            }
            if ($.vpcId == null) {
                throw new MissingRequiredPropertyException("GetTransitGatewayVpcAttachmentPlainArgs", "vpcId");
            }
            return $;
        }
    }

}
