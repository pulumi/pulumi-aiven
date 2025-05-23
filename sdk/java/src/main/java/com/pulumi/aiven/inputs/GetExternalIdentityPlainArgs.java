// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aiven.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetExternalIdentityPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetExternalIdentityPlainArgs Empty = new GetExternalIdentityPlainArgs();

    /**
     * The name of the external service. The possible value is `github`.
     * 
     */
    @Import(name="externalServiceName", required=true)
    private String externalServiceName;

    /**
     * @return The name of the external service. The possible value is `github`.
     * 
     */
    public String externalServiceName() {
        return this.externalServiceName;
    }

    /**
     * The user&#39;s ID on the external service. For GitHub, this is their GitHub username.
     * 
     */
    @Import(name="externalUserId", required=true)
    private String externalUserId;

    /**
     * @return The user&#39;s ID on the external service. For GitHub, this is their GitHub username.
     * 
     */
    public String externalUserId() {
        return this.externalUserId;
    }

    /**
     * The Aiven user ID.
     * 
     */
    @Import(name="internalUserId", required=true)
    private String internalUserId;

    /**
     * @return The Aiven user ID.
     * 
     */
    public String internalUserId() {
        return this.internalUserId;
    }

    /**
     * The ID of the Aiven organization that the user is part of.
     * 
     */
    @Import(name="organizationId", required=true)
    private String organizationId;

    /**
     * @return The ID of the Aiven organization that the user is part of.
     * 
     */
    public String organizationId() {
        return this.organizationId;
    }

    private GetExternalIdentityPlainArgs() {}

    private GetExternalIdentityPlainArgs(GetExternalIdentityPlainArgs $) {
        this.externalServiceName = $.externalServiceName;
        this.externalUserId = $.externalUserId;
        this.internalUserId = $.internalUserId;
        this.organizationId = $.organizationId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetExternalIdentityPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetExternalIdentityPlainArgs $;

        public Builder() {
            $ = new GetExternalIdentityPlainArgs();
        }

        public Builder(GetExternalIdentityPlainArgs defaults) {
            $ = new GetExternalIdentityPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param externalServiceName The name of the external service. The possible value is `github`.
         * 
         * @return builder
         * 
         */
        public Builder externalServiceName(String externalServiceName) {
            $.externalServiceName = externalServiceName;
            return this;
        }

        /**
         * @param externalUserId The user&#39;s ID on the external service. For GitHub, this is their GitHub username.
         * 
         * @return builder
         * 
         */
        public Builder externalUserId(String externalUserId) {
            $.externalUserId = externalUserId;
            return this;
        }

        /**
         * @param internalUserId The Aiven user ID.
         * 
         * @return builder
         * 
         */
        public Builder internalUserId(String internalUserId) {
            $.internalUserId = internalUserId;
            return this;
        }

        /**
         * @param organizationId The ID of the Aiven organization that the user is part of.
         * 
         * @return builder
         * 
         */
        public Builder organizationId(String organizationId) {
            $.organizationId = organizationId;
            return this;
        }

        public GetExternalIdentityPlainArgs build() {
            if ($.externalServiceName == null) {
                throw new MissingRequiredPropertyException("GetExternalIdentityPlainArgs", "externalServiceName");
            }
            if ($.externalUserId == null) {
                throw new MissingRequiredPropertyException("GetExternalIdentityPlainArgs", "externalUserId");
            }
            if ($.internalUserId == null) {
                throw new MissingRequiredPropertyException("GetExternalIdentityPlainArgs", "internalUserId");
            }
            if ($.organizationId == null) {
                throw new MissingRequiredPropertyException("GetExternalIdentityPlainArgs", "organizationId");
            }
            return $;
        }
    }

}
