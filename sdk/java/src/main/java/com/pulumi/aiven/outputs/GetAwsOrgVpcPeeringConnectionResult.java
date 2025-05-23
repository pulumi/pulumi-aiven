// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aiven.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetAwsOrgVpcPeeringConnectionResult {
    /**
     * @return AWS account ID. Changing this property forces recreation of the resource.
     * 
     */
    private String awsAccountId;
    /**
     * @return AWS VPC ID. Changing this property forces recreation of the resource.
     * 
     */
    private String awsVpcId;
    /**
     * @return The ID of the AWS VPC peering connection.
     * 
     */
    private String awsVpcPeeringConnectionId;
    /**
     * @return The AWS region of the peered VPC. For example, `eu-central-1`.
     * 
     */
    private String awsVpcRegion;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return Identifier of the organization.
     * 
     */
    private String organizationId;
    /**
     * @return Identifier of the organization VPC.
     * 
     */
    private String organizationVpcId;
    /**
     * @return The ID of the peering connection.
     * 
     */
    private String peeringConnectionId;
    /**
     * @return State of the peering connection. The possible values are `ACTIVE`, `APPROVED`, `APPROVED_PEER_REQUESTED`, `DELETED`, `DELETED_BY_PEER`, `DELETING`, `ERROR`, `INVALID_SPECIFICATION`, `PENDING_PEER` and `REJECTED_BY_PEER`.
     * 
     */
    private String state;

    private GetAwsOrgVpcPeeringConnectionResult() {}
    /**
     * @return AWS account ID. Changing this property forces recreation of the resource.
     * 
     */
    public String awsAccountId() {
        return this.awsAccountId;
    }
    /**
     * @return AWS VPC ID. Changing this property forces recreation of the resource.
     * 
     */
    public String awsVpcId() {
        return this.awsVpcId;
    }
    /**
     * @return The ID of the AWS VPC peering connection.
     * 
     */
    public String awsVpcPeeringConnectionId() {
        return this.awsVpcPeeringConnectionId;
    }
    /**
     * @return The AWS region of the peered VPC. For example, `eu-central-1`.
     * 
     */
    public String awsVpcRegion() {
        return this.awsVpcRegion;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Identifier of the organization.
     * 
     */
    public String organizationId() {
        return this.organizationId;
    }
    /**
     * @return Identifier of the organization VPC.
     * 
     */
    public String organizationVpcId() {
        return this.organizationVpcId;
    }
    /**
     * @return The ID of the peering connection.
     * 
     */
    public String peeringConnectionId() {
        return this.peeringConnectionId;
    }
    /**
     * @return State of the peering connection. The possible values are `ACTIVE`, `APPROVED`, `APPROVED_PEER_REQUESTED`, `DELETED`, `DELETED_BY_PEER`, `DELETING`, `ERROR`, `INVALID_SPECIFICATION`, `PENDING_PEER` and `REJECTED_BY_PEER`.
     * 
     */
    public String state() {
        return this.state;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAwsOrgVpcPeeringConnectionResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String awsAccountId;
        private String awsVpcId;
        private String awsVpcPeeringConnectionId;
        private String awsVpcRegion;
        private String id;
        private String organizationId;
        private String organizationVpcId;
        private String peeringConnectionId;
        private String state;
        public Builder() {}
        public Builder(GetAwsOrgVpcPeeringConnectionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.awsAccountId = defaults.awsAccountId;
    	      this.awsVpcId = defaults.awsVpcId;
    	      this.awsVpcPeeringConnectionId = defaults.awsVpcPeeringConnectionId;
    	      this.awsVpcRegion = defaults.awsVpcRegion;
    	      this.id = defaults.id;
    	      this.organizationId = defaults.organizationId;
    	      this.organizationVpcId = defaults.organizationVpcId;
    	      this.peeringConnectionId = defaults.peeringConnectionId;
    	      this.state = defaults.state;
        }

        @CustomType.Setter
        public Builder awsAccountId(String awsAccountId) {
            if (awsAccountId == null) {
              throw new MissingRequiredPropertyException("GetAwsOrgVpcPeeringConnectionResult", "awsAccountId");
            }
            this.awsAccountId = awsAccountId;
            return this;
        }
        @CustomType.Setter
        public Builder awsVpcId(String awsVpcId) {
            if (awsVpcId == null) {
              throw new MissingRequiredPropertyException("GetAwsOrgVpcPeeringConnectionResult", "awsVpcId");
            }
            this.awsVpcId = awsVpcId;
            return this;
        }
        @CustomType.Setter
        public Builder awsVpcPeeringConnectionId(String awsVpcPeeringConnectionId) {
            if (awsVpcPeeringConnectionId == null) {
              throw new MissingRequiredPropertyException("GetAwsOrgVpcPeeringConnectionResult", "awsVpcPeeringConnectionId");
            }
            this.awsVpcPeeringConnectionId = awsVpcPeeringConnectionId;
            return this;
        }
        @CustomType.Setter
        public Builder awsVpcRegion(String awsVpcRegion) {
            if (awsVpcRegion == null) {
              throw new MissingRequiredPropertyException("GetAwsOrgVpcPeeringConnectionResult", "awsVpcRegion");
            }
            this.awsVpcRegion = awsVpcRegion;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetAwsOrgVpcPeeringConnectionResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder organizationId(String organizationId) {
            if (organizationId == null) {
              throw new MissingRequiredPropertyException("GetAwsOrgVpcPeeringConnectionResult", "organizationId");
            }
            this.organizationId = organizationId;
            return this;
        }
        @CustomType.Setter
        public Builder organizationVpcId(String organizationVpcId) {
            if (organizationVpcId == null) {
              throw new MissingRequiredPropertyException("GetAwsOrgVpcPeeringConnectionResult", "organizationVpcId");
            }
            this.organizationVpcId = organizationVpcId;
            return this;
        }
        @CustomType.Setter
        public Builder peeringConnectionId(String peeringConnectionId) {
            if (peeringConnectionId == null) {
              throw new MissingRequiredPropertyException("GetAwsOrgVpcPeeringConnectionResult", "peeringConnectionId");
            }
            this.peeringConnectionId = peeringConnectionId;
            return this;
        }
        @CustomType.Setter
        public Builder state(String state) {
            if (state == null) {
              throw new MissingRequiredPropertyException("GetAwsOrgVpcPeeringConnectionResult", "state");
            }
            this.state = state;
            return this;
        }
        public GetAwsOrgVpcPeeringConnectionResult build() {
            final var _resultValue = new GetAwsOrgVpcPeeringConnectionResult();
            _resultValue.awsAccountId = awsAccountId;
            _resultValue.awsVpcId = awsVpcId;
            _resultValue.awsVpcPeeringConnectionId = awsVpcPeeringConnectionId;
            _resultValue.awsVpcRegion = awsVpcRegion;
            _resultValue.id = id;
            _resultValue.organizationId = organizationId;
            _resultValue.organizationVpcId = organizationVpcId;
            _resultValue.peeringConnectionId = peeringConnectionId;
            _resultValue.state = state;
            return _resultValue;
        }
    }
}
