// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aiven;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FlinkJarApplicationDeploymentArgs extends com.pulumi.resources.ResourceArgs {

    public static final FlinkJarApplicationDeploymentArgs Empty = new FlinkJarApplicationDeploymentArgs();

    /**
     * Application Id. Changing this property forces recreation of the resource.
     * 
     */
    @Import(name="applicationId", required=true)
    private Output<String> applicationId;

    /**
     * @return Application Id. Changing this property forces recreation of the resource.
     * 
     */
    public Output<String> applicationId() {
        return this.applicationId;
    }

    /**
     * The fully qualified name of the entry class to pass during Flink job submission through the entryClass parameter. Maximum length: `128`.
     * 
     */
    @Import(name="entryClass")
    private @Nullable Output<String> entryClass;

    /**
     * @return The fully qualified name of the entry class to pass during Flink job submission through the entryClass parameter. Maximum length: `128`.
     * 
     */
    public Optional<Output<String>> entryClass() {
        return Optional.ofNullable(this.entryClass);
    }

    /**
     * Reading of Flink parallel execution documentation is recommended before setting this value to other than 1. Please do not set this value higher than (total number of nodes x number*of*task_slots), or every new job created will fail.
     * 
     */
    @Import(name="parallelism")
    private @Nullable Output<Integer> parallelism;

    /**
     * @return Reading of Flink parallel execution documentation is recommended before setting this value to other than 1. Please do not set this value higher than (total number of nodes x number*of*task_slots), or every new job created will fail.
     * 
     */
    public Optional<Output<Integer>> parallelism() {
        return Optional.ofNullable(this.parallelism);
    }

    /**
     * Arguments to pass during Flink job submission through the programArgsList parameter.
     * 
     */
    @Import(name="programArgs")
    private @Nullable Output<List<String>> programArgs;

    /**
     * @return Arguments to pass during Flink job submission through the programArgsList parameter.
     * 
     */
    public Optional<Output<List<String>>> programArgs() {
        return Optional.ofNullable(this.programArgs);
    }

    /**
     * Project name. Changing this property forces recreation of the resource.
     * 
     */
    @Import(name="project", required=true)
    private Output<String> project;

    /**
     * @return Project name. Changing this property forces recreation of the resource.
     * 
     */
    public Output<String> project() {
        return this.project;
    }

    /**
     * Specifies whether a Flink Job is restarted in case it fails. Changing this property forces recreation of the resource.
     * 
     */
    @Import(name="restartEnabled")
    private @Nullable Output<Boolean> restartEnabled;

    /**
     * @return Specifies whether a Flink Job is restarted in case it fails. Changing this property forces recreation of the resource.
     * 
     */
    public Optional<Output<Boolean>> restartEnabled() {
        return Optional.ofNullable(this.restartEnabled);
    }

    /**
     * Service name. Changing this property forces recreation of the resource.
     * 
     */
    @Import(name="serviceName", required=true)
    private Output<String> serviceName;

    /**
     * @return Service name. Changing this property forces recreation of the resource.
     * 
     */
    public Output<String> serviceName() {
        return this.serviceName;
    }

    /**
     * Job savepoint. Maximum length: `2048`.
     * 
     */
    @Import(name="startingSavepoint")
    private @Nullable Output<String> startingSavepoint;

    /**
     * @return Job savepoint. Maximum length: `2048`.
     * 
     */
    public Optional<Output<String>> startingSavepoint() {
        return Optional.ofNullable(this.startingSavepoint);
    }

    /**
     * ApplicationVersion ID. Maximum length: `36`. Changing this property forces recreation of the resource.
     * 
     */
    @Import(name="versionId", required=true)
    private Output<String> versionId;

    /**
     * @return ApplicationVersion ID. Maximum length: `36`. Changing this property forces recreation of the resource.
     * 
     */
    public Output<String> versionId() {
        return this.versionId;
    }

    private FlinkJarApplicationDeploymentArgs() {}

    private FlinkJarApplicationDeploymentArgs(FlinkJarApplicationDeploymentArgs $) {
        this.applicationId = $.applicationId;
        this.entryClass = $.entryClass;
        this.parallelism = $.parallelism;
        this.programArgs = $.programArgs;
        this.project = $.project;
        this.restartEnabled = $.restartEnabled;
        this.serviceName = $.serviceName;
        this.startingSavepoint = $.startingSavepoint;
        this.versionId = $.versionId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FlinkJarApplicationDeploymentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FlinkJarApplicationDeploymentArgs $;

        public Builder() {
            $ = new FlinkJarApplicationDeploymentArgs();
        }

        public Builder(FlinkJarApplicationDeploymentArgs defaults) {
            $ = new FlinkJarApplicationDeploymentArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param applicationId Application Id. Changing this property forces recreation of the resource.
         * 
         * @return builder
         * 
         */
        public Builder applicationId(Output<String> applicationId) {
            $.applicationId = applicationId;
            return this;
        }

        /**
         * @param applicationId Application Id. Changing this property forces recreation of the resource.
         * 
         * @return builder
         * 
         */
        public Builder applicationId(String applicationId) {
            return applicationId(Output.of(applicationId));
        }

        /**
         * @param entryClass The fully qualified name of the entry class to pass during Flink job submission through the entryClass parameter. Maximum length: `128`.
         * 
         * @return builder
         * 
         */
        public Builder entryClass(@Nullable Output<String> entryClass) {
            $.entryClass = entryClass;
            return this;
        }

        /**
         * @param entryClass The fully qualified name of the entry class to pass during Flink job submission through the entryClass parameter. Maximum length: `128`.
         * 
         * @return builder
         * 
         */
        public Builder entryClass(String entryClass) {
            return entryClass(Output.of(entryClass));
        }

        /**
         * @param parallelism Reading of Flink parallel execution documentation is recommended before setting this value to other than 1. Please do not set this value higher than (total number of nodes x number*of*task_slots), or every new job created will fail.
         * 
         * @return builder
         * 
         */
        public Builder parallelism(@Nullable Output<Integer> parallelism) {
            $.parallelism = parallelism;
            return this;
        }

        /**
         * @param parallelism Reading of Flink parallel execution documentation is recommended before setting this value to other than 1. Please do not set this value higher than (total number of nodes x number*of*task_slots), or every new job created will fail.
         * 
         * @return builder
         * 
         */
        public Builder parallelism(Integer parallelism) {
            return parallelism(Output.of(parallelism));
        }

        /**
         * @param programArgs Arguments to pass during Flink job submission through the programArgsList parameter.
         * 
         * @return builder
         * 
         */
        public Builder programArgs(@Nullable Output<List<String>> programArgs) {
            $.programArgs = programArgs;
            return this;
        }

        /**
         * @param programArgs Arguments to pass during Flink job submission through the programArgsList parameter.
         * 
         * @return builder
         * 
         */
        public Builder programArgs(List<String> programArgs) {
            return programArgs(Output.of(programArgs));
        }

        /**
         * @param programArgs Arguments to pass during Flink job submission through the programArgsList parameter.
         * 
         * @return builder
         * 
         */
        public Builder programArgs(String... programArgs) {
            return programArgs(List.of(programArgs));
        }

        /**
         * @param project Project name. Changing this property forces recreation of the resource.
         * 
         * @return builder
         * 
         */
        public Builder project(Output<String> project) {
            $.project = project;
            return this;
        }

        /**
         * @param project Project name. Changing this property forces recreation of the resource.
         * 
         * @return builder
         * 
         */
        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param restartEnabled Specifies whether a Flink Job is restarted in case it fails. Changing this property forces recreation of the resource.
         * 
         * @return builder
         * 
         */
        public Builder restartEnabled(@Nullable Output<Boolean> restartEnabled) {
            $.restartEnabled = restartEnabled;
            return this;
        }

        /**
         * @param restartEnabled Specifies whether a Flink Job is restarted in case it fails. Changing this property forces recreation of the resource.
         * 
         * @return builder
         * 
         */
        public Builder restartEnabled(Boolean restartEnabled) {
            return restartEnabled(Output.of(restartEnabled));
        }

        /**
         * @param serviceName Service name. Changing this property forces recreation of the resource.
         * 
         * @return builder
         * 
         */
        public Builder serviceName(Output<String> serviceName) {
            $.serviceName = serviceName;
            return this;
        }

        /**
         * @param serviceName Service name. Changing this property forces recreation of the resource.
         * 
         * @return builder
         * 
         */
        public Builder serviceName(String serviceName) {
            return serviceName(Output.of(serviceName));
        }

        /**
         * @param startingSavepoint Job savepoint. Maximum length: `2048`.
         * 
         * @return builder
         * 
         */
        public Builder startingSavepoint(@Nullable Output<String> startingSavepoint) {
            $.startingSavepoint = startingSavepoint;
            return this;
        }

        /**
         * @param startingSavepoint Job savepoint. Maximum length: `2048`.
         * 
         * @return builder
         * 
         */
        public Builder startingSavepoint(String startingSavepoint) {
            return startingSavepoint(Output.of(startingSavepoint));
        }

        /**
         * @param versionId ApplicationVersion ID. Maximum length: `36`. Changing this property forces recreation of the resource.
         * 
         * @return builder
         * 
         */
        public Builder versionId(Output<String> versionId) {
            $.versionId = versionId;
            return this;
        }

        /**
         * @param versionId ApplicationVersion ID. Maximum length: `36`. Changing this property forces recreation of the resource.
         * 
         * @return builder
         * 
         */
        public Builder versionId(String versionId) {
            return versionId(Output.of(versionId));
        }

        public FlinkJarApplicationDeploymentArgs build() {
            if ($.applicationId == null) {
                throw new MissingRequiredPropertyException("FlinkJarApplicationDeploymentArgs", "applicationId");
            }
            if ($.project == null) {
                throw new MissingRequiredPropertyException("FlinkJarApplicationDeploymentArgs", "project");
            }
            if ($.serviceName == null) {
                throw new MissingRequiredPropertyException("FlinkJarApplicationDeploymentArgs", "serviceName");
            }
            if ($.versionId == null) {
                throw new MissingRequiredPropertyException("FlinkJarApplicationDeploymentArgs", "versionId");
            }
            return $;
        }
    }

}
