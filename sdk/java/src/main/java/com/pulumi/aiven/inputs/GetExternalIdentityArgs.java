// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aiven.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetExternalIdentityArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetExternalIdentityArgs Empty = new GetExternalIdentityArgs();

    /**
     * The name of the external service. The possible values are `github`.
     * 
     */
    @Import(name="externalServiceName", required=true)
    private Output<String> externalServiceName;

    /**
     * @return The name of the external service. The possible values are `github`.
     * 
     */
    public Output<String> externalServiceName() {
        return this.externalServiceName;
    }

    /**
     * The user&#39;s ID on the external service.
     * 
     */
    @Import(name="externalUserId", required=true)
    private Output<String> externalUserId;

    /**
     * @return The user&#39;s ID on the external service.
     * 
     */
    public Output<String> externalUserId() {
        return this.externalUserId;
    }

    /**
     * The Aiven user ID.
     * 
     */
    @Import(name="internalUserId", required=true)
    private Output<String> internalUserId;

    /**
     * @return The Aiven user ID.
     * 
     */
    public Output<String> internalUserId() {
        return this.internalUserId;
    }

    /**
     * The ID of the Aiven organization that the user is part of.
     * 
     */
    @Import(name="organizationId", required=true)
    private Output<String> organizationId;

    /**
     * @return The ID of the Aiven organization that the user is part of.
     * 
     */
    public Output<String> organizationId() {
        return this.organizationId;
    }

    private GetExternalIdentityArgs() {}

    private GetExternalIdentityArgs(GetExternalIdentityArgs $) {
        this.externalServiceName = $.externalServiceName;
        this.externalUserId = $.externalUserId;
        this.internalUserId = $.internalUserId;
        this.organizationId = $.organizationId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetExternalIdentityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetExternalIdentityArgs $;

        public Builder() {
            $ = new GetExternalIdentityArgs();
        }

        public Builder(GetExternalIdentityArgs defaults) {
            $ = new GetExternalIdentityArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param externalServiceName The name of the external service. The possible values are `github`.
         * 
         * @return builder
         * 
         */
        public Builder externalServiceName(Output<String> externalServiceName) {
            $.externalServiceName = externalServiceName;
            return this;
        }

        /**
         * @param externalServiceName The name of the external service. The possible values are `github`.
         * 
         * @return builder
         * 
         */
        public Builder externalServiceName(String externalServiceName) {
            return externalServiceName(Output.of(externalServiceName));
        }

        /**
         * @param externalUserId The user&#39;s ID on the external service.
         * 
         * @return builder
         * 
         */
        public Builder externalUserId(Output<String> externalUserId) {
            $.externalUserId = externalUserId;
            return this;
        }

        /**
         * @param externalUserId The user&#39;s ID on the external service.
         * 
         * @return builder
         * 
         */
        public Builder externalUserId(String externalUserId) {
            return externalUserId(Output.of(externalUserId));
        }

        /**
         * @param internalUserId The Aiven user ID.
         * 
         * @return builder
         * 
         */
        public Builder internalUserId(Output<String> internalUserId) {
            $.internalUserId = internalUserId;
            return this;
        }

        /**
         * @param internalUserId The Aiven user ID.
         * 
         * @return builder
         * 
         */
        public Builder internalUserId(String internalUserId) {
            return internalUserId(Output.of(internalUserId));
        }

        /**
         * @param organizationId The ID of the Aiven organization that the user is part of.
         * 
         * @return builder
         * 
         */
        public Builder organizationId(Output<String> organizationId) {
            $.organizationId = organizationId;
            return this;
        }

        /**
         * @param organizationId The ID of the Aiven organization that the user is part of.
         * 
         * @return builder
         * 
         */
        public Builder organizationId(String organizationId) {
            return organizationId(Output.of(organizationId));
        }

        public GetExternalIdentityArgs build() {
            if ($.externalServiceName == null) {
                throw new MissingRequiredPropertyException("GetExternalIdentityArgs", "externalServiceName");
            }
            if ($.externalUserId == null) {
                throw new MissingRequiredPropertyException("GetExternalIdentityArgs", "externalUserId");
            }
            if ($.internalUserId == null) {
                throw new MissingRequiredPropertyException("GetExternalIdentityArgs", "internalUserId");
            }
            if ($.organizationId == null) {
                throw new MissingRequiredPropertyException("GetExternalIdentityArgs", "organizationId");
            }
            return $;
        }
    }

}