// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aiven.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AzurePrivatelinkConnectionApprovalState extends com.pulumi.resources.ResourceArgs {

    public static final AzurePrivatelinkConnectionApprovalState Empty = new AzurePrivatelinkConnectionApprovalState();

    /**
     * IP address of Azure private endpoint
     * 
     */
    @Import(name="endpointIpAddress")
    private @Nullable Output<String> endpointIpAddress;

    /**
     * @return IP address of Azure private endpoint
     * 
     */
    public Optional<Output<String>> endpointIpAddress() {
        return Optional.ofNullable(this.endpointIpAddress);
    }

    /**
     * Privatelink connection id
     * 
     */
    @Import(name="privatelinkConnectionId")
    private @Nullable Output<String> privatelinkConnectionId;

    /**
     * @return Privatelink connection id
     * 
     */
    public Optional<Output<String>> privatelinkConnectionId() {
        return Optional.ofNullable(this.privatelinkConnectionId);
    }

    /**
     * Identifies the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. This property cannot be changed, doing so forces recreation of the resource.
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    /**
     * @return Identifies the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. This property cannot be changed, doing so forces recreation of the resource.
     * 
     */
    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * Specifies the name of the service that this resource belongs to. To set up proper dependencies please refer to this variable as a reference. This property cannot be changed, doing so forces recreation of the resource.
     * 
     */
    @Import(name="serviceName")
    private @Nullable Output<String> serviceName;

    /**
     * @return Specifies the name of the service that this resource belongs to. To set up proper dependencies please refer to this variable as a reference. This property cannot be changed, doing so forces recreation of the resource.
     * 
     */
    public Optional<Output<String>> serviceName() {
        return Optional.ofNullable(this.serviceName);
    }

    /**
     * Privatelink connection state
     * 
     */
    @Import(name="state")
    private @Nullable Output<String> state;

    /**
     * @return Privatelink connection state
     * 
     */
    public Optional<Output<String>> state() {
        return Optional.ofNullable(this.state);
    }

    private AzurePrivatelinkConnectionApprovalState() {}

    private AzurePrivatelinkConnectionApprovalState(AzurePrivatelinkConnectionApprovalState $) {
        this.endpointIpAddress = $.endpointIpAddress;
        this.privatelinkConnectionId = $.privatelinkConnectionId;
        this.project = $.project;
        this.serviceName = $.serviceName;
        this.state = $.state;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AzurePrivatelinkConnectionApprovalState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AzurePrivatelinkConnectionApprovalState $;

        public Builder() {
            $ = new AzurePrivatelinkConnectionApprovalState();
        }

        public Builder(AzurePrivatelinkConnectionApprovalState defaults) {
            $ = new AzurePrivatelinkConnectionApprovalState(Objects.requireNonNull(defaults));
        }

        /**
         * @param endpointIpAddress IP address of Azure private endpoint
         * 
         * @return builder
         * 
         */
        public Builder endpointIpAddress(@Nullable Output<String> endpointIpAddress) {
            $.endpointIpAddress = endpointIpAddress;
            return this;
        }

        /**
         * @param endpointIpAddress IP address of Azure private endpoint
         * 
         * @return builder
         * 
         */
        public Builder endpointIpAddress(String endpointIpAddress) {
            return endpointIpAddress(Output.of(endpointIpAddress));
        }

        /**
         * @param privatelinkConnectionId Privatelink connection id
         * 
         * @return builder
         * 
         */
        public Builder privatelinkConnectionId(@Nullable Output<String> privatelinkConnectionId) {
            $.privatelinkConnectionId = privatelinkConnectionId;
            return this;
        }

        /**
         * @param privatelinkConnectionId Privatelink connection id
         * 
         * @return builder
         * 
         */
        public Builder privatelinkConnectionId(String privatelinkConnectionId) {
            return privatelinkConnectionId(Output.of(privatelinkConnectionId));
        }

        /**
         * @param project Identifies the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. This property cannot be changed, doing so forces recreation of the resource.
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        /**
         * @param project Identifies the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. This property cannot be changed, doing so forces recreation of the resource.
         * 
         * @return builder
         * 
         */
        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param serviceName Specifies the name of the service that this resource belongs to. To set up proper dependencies please refer to this variable as a reference. This property cannot be changed, doing so forces recreation of the resource.
         * 
         * @return builder
         * 
         */
        public Builder serviceName(@Nullable Output<String> serviceName) {
            $.serviceName = serviceName;
            return this;
        }

        /**
         * @param serviceName Specifies the name of the service that this resource belongs to. To set up proper dependencies please refer to this variable as a reference. This property cannot be changed, doing so forces recreation of the resource.
         * 
         * @return builder
         * 
         */
        public Builder serviceName(String serviceName) {
            return serviceName(Output.of(serviceName));
        }

        /**
         * @param state Privatelink connection state
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable Output<String> state) {
            $.state = state;
            return this;
        }

        /**
         * @param state Privatelink connection state
         * 
         * @return builder
         * 
         */
        public Builder state(String state) {
            return state(Output.of(state));
        }

        public AzurePrivatelinkConnectionApprovalState build() {
            return $;
        }
    }

}