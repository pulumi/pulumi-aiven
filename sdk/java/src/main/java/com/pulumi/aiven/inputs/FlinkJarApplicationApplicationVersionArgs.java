// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aiven.inputs;

import com.pulumi.aiven.inputs.FlinkJarApplicationApplicationVersionFileInfoArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FlinkJarApplicationApplicationVersionArgs extends com.pulumi.resources.ResourceArgs {

    public static final FlinkJarApplicationApplicationVersionArgs Empty = new FlinkJarApplicationApplicationVersionArgs();

    /**
     * The creation timestamp of this entity in ISO 8601 format, always in UTC.
     * 
     */
    @Import(name="createdAt")
    private @Nullable Output<String> createdAt;

    /**
     * @return The creation timestamp of this entity in ISO 8601 format, always in UTC.
     * 
     */
    public Optional<Output<String>> createdAt() {
        return Optional.ofNullable(this.createdAt);
    }

    /**
     * The creator of this entity.
     * 
     */
    @Import(name="createdBy")
    private @Nullable Output<String> createdBy;

    /**
     * @return The creator of this entity.
     * 
     */
    public Optional<Output<String>> createdBy() {
        return Optional.ofNullable(this.createdBy);
    }

    /**
     * Flink JarApplicationVersion FileInfo.
     * 
     */
    @Import(name="fileInfos")
    private @Nullable Output<List<FlinkJarApplicationApplicationVersionFileInfoArgs>> fileInfos;

    /**
     * @return Flink JarApplicationVersion FileInfo.
     * 
     */
    public Optional<Output<List<FlinkJarApplicationApplicationVersionFileInfoArgs>>> fileInfos() {
        return Optional.ofNullable(this.fileInfos);
    }

    /**
     * ApplicationVersion ID.
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    /**
     * @return ApplicationVersion ID.
     * 
     */
    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * Version number.
     * 
     */
    @Import(name="version")
    private @Nullable Output<Integer> version;

    /**
     * @return Version number.
     * 
     */
    public Optional<Output<Integer>> version() {
        return Optional.ofNullable(this.version);
    }

    private FlinkJarApplicationApplicationVersionArgs() {}

    private FlinkJarApplicationApplicationVersionArgs(FlinkJarApplicationApplicationVersionArgs $) {
        this.createdAt = $.createdAt;
        this.createdBy = $.createdBy;
        this.fileInfos = $.fileInfos;
        this.id = $.id;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FlinkJarApplicationApplicationVersionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FlinkJarApplicationApplicationVersionArgs $;

        public Builder() {
            $ = new FlinkJarApplicationApplicationVersionArgs();
        }

        public Builder(FlinkJarApplicationApplicationVersionArgs defaults) {
            $ = new FlinkJarApplicationApplicationVersionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param createdAt The creation timestamp of this entity in ISO 8601 format, always in UTC.
         * 
         * @return builder
         * 
         */
        public Builder createdAt(@Nullable Output<String> createdAt) {
            $.createdAt = createdAt;
            return this;
        }

        /**
         * @param createdAt The creation timestamp of this entity in ISO 8601 format, always in UTC.
         * 
         * @return builder
         * 
         */
        public Builder createdAt(String createdAt) {
            return createdAt(Output.of(createdAt));
        }

        /**
         * @param createdBy The creator of this entity.
         * 
         * @return builder
         * 
         */
        public Builder createdBy(@Nullable Output<String> createdBy) {
            $.createdBy = createdBy;
            return this;
        }

        /**
         * @param createdBy The creator of this entity.
         * 
         * @return builder
         * 
         */
        public Builder createdBy(String createdBy) {
            return createdBy(Output.of(createdBy));
        }

        /**
         * @param fileInfos Flink JarApplicationVersion FileInfo.
         * 
         * @return builder
         * 
         */
        public Builder fileInfos(@Nullable Output<List<FlinkJarApplicationApplicationVersionFileInfoArgs>> fileInfos) {
            $.fileInfos = fileInfos;
            return this;
        }

        /**
         * @param fileInfos Flink JarApplicationVersion FileInfo.
         * 
         * @return builder
         * 
         */
        public Builder fileInfos(List<FlinkJarApplicationApplicationVersionFileInfoArgs> fileInfos) {
            return fileInfos(Output.of(fileInfos));
        }

        /**
         * @param fileInfos Flink JarApplicationVersion FileInfo.
         * 
         * @return builder
         * 
         */
        public Builder fileInfos(FlinkJarApplicationApplicationVersionFileInfoArgs... fileInfos) {
            return fileInfos(List.of(fileInfos));
        }

        /**
         * @param id ApplicationVersion ID.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id ApplicationVersion ID.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param version Version number.
         * 
         * @return builder
         * 
         */
        public Builder version(@Nullable Output<Integer> version) {
            $.version = version;
            return this;
        }

        /**
         * @param version Version number.
         * 
         * @return builder
         * 
         */
        public Builder version(Integer version) {
            return version(Output.of(version));
        }

        public FlinkJarApplicationApplicationVersionArgs build() {
            return $;
        }
    }

}
