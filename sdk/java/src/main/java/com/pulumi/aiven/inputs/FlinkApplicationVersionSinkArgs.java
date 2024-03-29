// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aiven.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FlinkApplicationVersionSinkArgs extends com.pulumi.resources.ResourceArgs {

    public static final FlinkApplicationVersionSinkArgs Empty = new FlinkApplicationVersionSinkArgs();

    /**
     * The CREATE TABLE statement
     * 
     */
    @Import(name="createTable", required=true)
    private Output<String> createTable;

    /**
     * @return The CREATE TABLE statement
     * 
     */
    public Output<String> createTable() {
        return this.createTable;
    }

    /**
     * The integration ID
     * 
     */
    @Import(name="integrationId")
    private @Nullable Output<String> integrationId;

    /**
     * @return The integration ID
     * 
     */
    public Optional<Output<String>> integrationId() {
        return Optional.ofNullable(this.integrationId);
    }

    private FlinkApplicationVersionSinkArgs() {}

    private FlinkApplicationVersionSinkArgs(FlinkApplicationVersionSinkArgs $) {
        this.createTable = $.createTable;
        this.integrationId = $.integrationId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FlinkApplicationVersionSinkArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FlinkApplicationVersionSinkArgs $;

        public Builder() {
            $ = new FlinkApplicationVersionSinkArgs();
        }

        public Builder(FlinkApplicationVersionSinkArgs defaults) {
            $ = new FlinkApplicationVersionSinkArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param createTable The CREATE TABLE statement
         * 
         * @return builder
         * 
         */
        public Builder createTable(Output<String> createTable) {
            $.createTable = createTable;
            return this;
        }

        /**
         * @param createTable The CREATE TABLE statement
         * 
         * @return builder
         * 
         */
        public Builder createTable(String createTable) {
            return createTable(Output.of(createTable));
        }

        /**
         * @param integrationId The integration ID
         * 
         * @return builder
         * 
         */
        public Builder integrationId(@Nullable Output<String> integrationId) {
            $.integrationId = integrationId;
            return this;
        }

        /**
         * @param integrationId The integration ID
         * 
         * @return builder
         * 
         */
        public Builder integrationId(String integrationId) {
            return integrationId(Output.of(integrationId));
        }

        public FlinkApplicationVersionSinkArgs build() {
            if ($.createTable == null) {
                throw new MissingRequiredPropertyException("FlinkApplicationVersionSinkArgs", "createTable");
            }
            return $;
        }
    }

}
