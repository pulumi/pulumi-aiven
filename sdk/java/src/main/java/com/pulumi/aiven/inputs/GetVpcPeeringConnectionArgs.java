// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aiven.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetVpcPeeringConnectionArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetVpcPeeringConnectionArgs Empty = new GetVpcPeeringConnectionArgs();

    /**
     * AWS account ID or GCP project ID of the peered VPC. This property cannot be changed, doing so forces recreation of the resource.
     * 
     */
    @Import(name="peerCloudAccount", required=true)
    private Output<String> peerCloudAccount;

    /**
     * @return AWS account ID or GCP project ID of the peered VPC. This property cannot be changed, doing so forces recreation of the resource.
     * 
     */
    public Output<String> peerCloudAccount() {
        return this.peerCloudAccount;
    }

    /**
     * AWS VPC ID or GCP VPC network name of the peered VPC. This property cannot be changed, doing so forces recreation of the resource.
     * 
     */
    @Import(name="peerVpc", required=true)
    private Output<String> peerVpc;

    /**
     * @return AWS VPC ID or GCP VPC network name of the peered VPC. This property cannot be changed, doing so forces recreation of the resource.
     * 
     */
    public Output<String> peerVpc() {
        return this.peerVpc;
    }

    /**
     * The VPC the peering connection belongs to. This property cannot be changed, doing so forces recreation of the resource.
     * 
     */
    @Import(name="vpcId", required=true)
    private Output<String> vpcId;

    /**
     * @return The VPC the peering connection belongs to. This property cannot be changed, doing so forces recreation of the resource.
     * 
     */
    public Output<String> vpcId() {
        return this.vpcId;
    }

    private GetVpcPeeringConnectionArgs() {}

    private GetVpcPeeringConnectionArgs(GetVpcPeeringConnectionArgs $) {
        this.peerCloudAccount = $.peerCloudAccount;
        this.peerVpc = $.peerVpc;
        this.vpcId = $.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetVpcPeeringConnectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetVpcPeeringConnectionArgs $;

        public Builder() {
            $ = new GetVpcPeeringConnectionArgs();
        }

        public Builder(GetVpcPeeringConnectionArgs defaults) {
            $ = new GetVpcPeeringConnectionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param peerCloudAccount AWS account ID or GCP project ID of the peered VPC. This property cannot be changed, doing so forces recreation of the resource.
         * 
         * @return builder
         * 
         */
        public Builder peerCloudAccount(Output<String> peerCloudAccount) {
            $.peerCloudAccount = peerCloudAccount;
            return this;
        }

        /**
         * @param peerCloudAccount AWS account ID or GCP project ID of the peered VPC. This property cannot be changed, doing so forces recreation of the resource.
         * 
         * @return builder
         * 
         */
        public Builder peerCloudAccount(String peerCloudAccount) {
            return peerCloudAccount(Output.of(peerCloudAccount));
        }

        /**
         * @param peerVpc AWS VPC ID or GCP VPC network name of the peered VPC. This property cannot be changed, doing so forces recreation of the resource.
         * 
         * @return builder
         * 
         */
        public Builder peerVpc(Output<String> peerVpc) {
            $.peerVpc = peerVpc;
            return this;
        }

        /**
         * @param peerVpc AWS VPC ID or GCP VPC network name of the peered VPC. This property cannot be changed, doing so forces recreation of the resource.
         * 
         * @return builder
         * 
         */
        public Builder peerVpc(String peerVpc) {
            return peerVpc(Output.of(peerVpc));
        }

        /**
         * @param vpcId The VPC the peering connection belongs to. This property cannot be changed, doing so forces recreation of the resource.
         * 
         * @return builder
         * 
         */
        public Builder vpcId(Output<String> vpcId) {
            $.vpcId = vpcId;
            return this;
        }

        /**
         * @param vpcId The VPC the peering connection belongs to. This property cannot be changed, doing so forces recreation of the resource.
         * 
         * @return builder
         * 
         */
        public Builder vpcId(String vpcId) {
            return vpcId(Output.of(vpcId));
        }

        public GetVpcPeeringConnectionArgs build() {
            $.peerCloudAccount = Objects.requireNonNull($.peerCloudAccount, "expected parameter 'peerCloudAccount' to be non-null");
            $.peerVpc = Objects.requireNonNull($.peerVpc, "expected parameter 'peerVpc' to be non-null");
            $.vpcId = Objects.requireNonNull($.vpcId, "expected parameter 'vpcId' to be non-null");
            return $;
        }
    }

}