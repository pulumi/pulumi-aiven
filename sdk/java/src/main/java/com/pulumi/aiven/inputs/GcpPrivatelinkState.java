// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aiven.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GcpPrivatelinkState extends com.pulumi.resources.ResourceArgs {

    public static final GcpPrivatelinkState Empty = new GcpPrivatelinkState();

    /**
     * Privatelink resource Google Service Attachment
     * 
     */
    @Import(name="googleServiceAttachment")
    private @Nullable Output<String> googleServiceAttachment;

    /**
     * @return Privatelink resource Google Service Attachment
     * 
     */
    public Optional<Output<String>> googleServiceAttachment() {
        return Optional.ofNullable(this.googleServiceAttachment);
    }

    /**
     * Printable result of the GCP Privatelink request
     * 
     */
    @Import(name="message")
    private @Nullable Output<String> message;

    /**
     * @return Printable result of the GCP Privatelink request
     * 
     */
    public Optional<Output<String>> message() {
        return Optional.ofNullable(this.message);
    }

    /**
     * Identifies the project this resource belongs to. To set up proper dependencies please refer to this variable as a
     * reference. This property cannot be changed, doing so forces recreation of the resource.
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    /**
     * @return Identifies the project this resource belongs to. To set up proper dependencies please refer to this variable as a
     * reference. This property cannot be changed, doing so forces recreation of the resource.
     * 
     */
    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * Specifies the name of the service that this resource belongs to. To set up proper dependencies please refer to this
     * variable as a reference. This property cannot be changed, doing so forces recreation of the resource.
     * 
     */
    @Import(name="serviceName")
    private @Nullable Output<String> serviceName;

    /**
     * @return Specifies the name of the service that this resource belongs to. To set up proper dependencies please refer to this
     * variable as a reference. This property cannot be changed, doing so forces recreation of the resource.
     * 
     */
    public Optional<Output<String>> serviceName() {
        return Optional.ofNullable(this.serviceName);
    }

    /**
     * Privatelink resource state
     * 
     */
    @Import(name="state")
    private @Nullable Output<String> state;

    /**
     * @return Privatelink resource state
     * 
     */
    public Optional<Output<String>> state() {
        return Optional.ofNullable(this.state);
    }

    private GcpPrivatelinkState() {}

    private GcpPrivatelinkState(GcpPrivatelinkState $) {
        this.googleServiceAttachment = $.googleServiceAttachment;
        this.message = $.message;
        this.project = $.project;
        this.serviceName = $.serviceName;
        this.state = $.state;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GcpPrivatelinkState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GcpPrivatelinkState $;

        public Builder() {
            $ = new GcpPrivatelinkState();
        }

        public Builder(GcpPrivatelinkState defaults) {
            $ = new GcpPrivatelinkState(Objects.requireNonNull(defaults));
        }

        /**
         * @param googleServiceAttachment Privatelink resource Google Service Attachment
         * 
         * @return builder
         * 
         */
        public Builder googleServiceAttachment(@Nullable Output<String> googleServiceAttachment) {
            $.googleServiceAttachment = googleServiceAttachment;
            return this;
        }

        /**
         * @param googleServiceAttachment Privatelink resource Google Service Attachment
         * 
         * @return builder
         * 
         */
        public Builder googleServiceAttachment(String googleServiceAttachment) {
            return googleServiceAttachment(Output.of(googleServiceAttachment));
        }

        /**
         * @param message Printable result of the GCP Privatelink request
         * 
         * @return builder
         * 
         */
        public Builder message(@Nullable Output<String> message) {
            $.message = message;
            return this;
        }

        /**
         * @param message Printable result of the GCP Privatelink request
         * 
         * @return builder
         * 
         */
        public Builder message(String message) {
            return message(Output.of(message));
        }

        /**
         * @param project Identifies the project this resource belongs to. To set up proper dependencies please refer to this variable as a
         * reference. This property cannot be changed, doing so forces recreation of the resource.
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        /**
         * @param project Identifies the project this resource belongs to. To set up proper dependencies please refer to this variable as a
         * reference. This property cannot be changed, doing so forces recreation of the resource.
         * 
         * @return builder
         * 
         */
        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param serviceName Specifies the name of the service that this resource belongs to. To set up proper dependencies please refer to this
         * variable as a reference. This property cannot be changed, doing so forces recreation of the resource.
         * 
         * @return builder
         * 
         */
        public Builder serviceName(@Nullable Output<String> serviceName) {
            $.serviceName = serviceName;
            return this;
        }

        /**
         * @param serviceName Specifies the name of the service that this resource belongs to. To set up proper dependencies please refer to this
         * variable as a reference. This property cannot be changed, doing so forces recreation of the resource.
         * 
         * @return builder
         * 
         */
        public Builder serviceName(String serviceName) {
            return serviceName(Output.of(serviceName));
        }

        /**
         * @param state Privatelink resource state
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable Output<String> state) {
            $.state = state;
            return this;
        }

        /**
         * @param state Privatelink resource state
         * 
         * @return builder
         * 
         */
        public Builder state(String state) {
            return state(Output.of(state));
        }

        public GcpPrivatelinkState build() {
            return $;
        }
    }

}