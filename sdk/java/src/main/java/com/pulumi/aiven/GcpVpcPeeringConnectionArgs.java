// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aiven;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GcpVpcPeeringConnectionArgs extends com.pulumi.resources.ResourceArgs {

    public static final GcpVpcPeeringConnectionArgs Empty = new GcpVpcPeeringConnectionArgs();

    /**
     * Google Cloud project ID. Changing this property forces recreation of the resource.
     * 
     */
    @Import(name="gcpProjectId", required=true)
    private Output<String> gcpProjectId;

    /**
     * @return Google Cloud project ID. Changing this property forces recreation of the resource.
     * 
     */
    public Output<String> gcpProjectId() {
        return this.gcpProjectId;
    }

    /**
     * Google Cloud VPC network name. Changing this property forces recreation of the resource.
     * 
     */
    @Import(name="peerVpc", required=true)
    private Output<String> peerVpc;

    /**
     * @return Google Cloud VPC network name. Changing this property forces recreation of the resource.
     * 
     */
    public Output<String> peerVpc() {
        return this.peerVpc;
    }

    /**
     * The VPC the peering connection belongs to. Changing this property forces recreation of the resource.
     * 
     */
    @Import(name="vpcId", required=true)
    private Output<String> vpcId;

    /**
     * @return The VPC the peering connection belongs to. Changing this property forces recreation of the resource.
     * 
     */
    public Output<String> vpcId() {
        return this.vpcId;
    }

    private GcpVpcPeeringConnectionArgs() {}

    private GcpVpcPeeringConnectionArgs(GcpVpcPeeringConnectionArgs $) {
        this.gcpProjectId = $.gcpProjectId;
        this.peerVpc = $.peerVpc;
        this.vpcId = $.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GcpVpcPeeringConnectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GcpVpcPeeringConnectionArgs $;

        public Builder() {
            $ = new GcpVpcPeeringConnectionArgs();
        }

        public Builder(GcpVpcPeeringConnectionArgs defaults) {
            $ = new GcpVpcPeeringConnectionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param gcpProjectId Google Cloud project ID. Changing this property forces recreation of the resource.
         * 
         * @return builder
         * 
         */
        public Builder gcpProjectId(Output<String> gcpProjectId) {
            $.gcpProjectId = gcpProjectId;
            return this;
        }

        /**
         * @param gcpProjectId Google Cloud project ID. Changing this property forces recreation of the resource.
         * 
         * @return builder
         * 
         */
        public Builder gcpProjectId(String gcpProjectId) {
            return gcpProjectId(Output.of(gcpProjectId));
        }

        /**
         * @param peerVpc Google Cloud VPC network name. Changing this property forces recreation of the resource.
         * 
         * @return builder
         * 
         */
        public Builder peerVpc(Output<String> peerVpc) {
            $.peerVpc = peerVpc;
            return this;
        }

        /**
         * @param peerVpc Google Cloud VPC network name. Changing this property forces recreation of the resource.
         * 
         * @return builder
         * 
         */
        public Builder peerVpc(String peerVpc) {
            return peerVpc(Output.of(peerVpc));
        }

        /**
         * @param vpcId The VPC the peering connection belongs to. Changing this property forces recreation of the resource.
         * 
         * @return builder
         * 
         */
        public Builder vpcId(Output<String> vpcId) {
            $.vpcId = vpcId;
            return this;
        }

        /**
         * @param vpcId The VPC the peering connection belongs to. Changing this property forces recreation of the resource.
         * 
         * @return builder
         * 
         */
        public Builder vpcId(String vpcId) {
            return vpcId(Output.of(vpcId));
        }

        public GcpVpcPeeringConnectionArgs build() {
            if ($.gcpProjectId == null) {
                throw new MissingRequiredPropertyException("GcpVpcPeeringConnectionArgs", "gcpProjectId");
            }
            if ($.peerVpc == null) {
                throw new MissingRequiredPropertyException("GcpVpcPeeringConnectionArgs", "peerVpc");
            }
            if ($.vpcId == null) {
                throw new MissingRequiredPropertyException("GcpVpcPeeringConnectionArgs", "vpcId");
            }
            return $;
        }
    }

}