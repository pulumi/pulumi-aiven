// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aiven;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AlloydbomniDatabaseArgs extends com.pulumi.resources.ResourceArgs {

    public static final AlloydbomniDatabaseArgs Empty = new AlloydbomniDatabaseArgs();

    /**
     * The name of the service database. Changing this property forces recreation of the resource.
     * 
     */
    @Import(name="databaseName", required=true)
    private Output<String> databaseName;

    /**
     * @return The name of the service database. Changing this property forces recreation of the resource.
     * 
     */
    public Output<String> databaseName() {
        return this.databaseName;
    }

    /**
     * Default string sort order (`LC_COLLATE`) of the database. The default value is `en_US.UTF-8`. Changing this property forces recreation of the resource.
     * 
     */
    @Import(name="lcCollate")
    private @Nullable Output<String> lcCollate;

    /**
     * @return Default string sort order (`LC_COLLATE`) of the database. The default value is `en_US.UTF-8`. Changing this property forces recreation of the resource.
     * 
     */
    public Optional<Output<String>> lcCollate() {
        return Optional.ofNullable(this.lcCollate);
    }

    /**
     * Default character classification (`LC_CTYPE`) of the database. The default value is `en_US.UTF-8`. Changing this property forces recreation of the resource.
     * 
     */
    @Import(name="lcCtype")
    private @Nullable Output<String> lcCtype;

    /**
     * @return Default character classification (`LC_CTYPE`) of the database. The default value is `en_US.UTF-8`. Changing this property forces recreation of the resource.
     * 
     */
    public Optional<Output<String>> lcCtype() {
        return Optional.ofNullable(this.lcCtype);
    }

    /**
     * The name of the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
     * 
     */
    @Import(name="project", required=true)
    private Output<String> project;

    /**
     * @return The name of the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
     * 
     */
    public Output<String> project() {
        return this.project;
    }

    /**
     * The name of the service that this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
     * 
     */
    @Import(name="serviceName", required=true)
    private Output<String> serviceName;

    /**
     * @return The name of the service that this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
     * 
     */
    public Output<String> serviceName() {
        return this.serviceName;
    }

    private AlloydbomniDatabaseArgs() {}

    private AlloydbomniDatabaseArgs(AlloydbomniDatabaseArgs $) {
        this.databaseName = $.databaseName;
        this.lcCollate = $.lcCollate;
        this.lcCtype = $.lcCtype;
        this.project = $.project;
        this.serviceName = $.serviceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AlloydbomniDatabaseArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AlloydbomniDatabaseArgs $;

        public Builder() {
            $ = new AlloydbomniDatabaseArgs();
        }

        public Builder(AlloydbomniDatabaseArgs defaults) {
            $ = new AlloydbomniDatabaseArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param databaseName The name of the service database. Changing this property forces recreation of the resource.
         * 
         * @return builder
         * 
         */
        public Builder databaseName(Output<String> databaseName) {
            $.databaseName = databaseName;
            return this;
        }

        /**
         * @param databaseName The name of the service database. Changing this property forces recreation of the resource.
         * 
         * @return builder
         * 
         */
        public Builder databaseName(String databaseName) {
            return databaseName(Output.of(databaseName));
        }

        /**
         * @param lcCollate Default string sort order (`LC_COLLATE`) of the database. The default value is `en_US.UTF-8`. Changing this property forces recreation of the resource.
         * 
         * @return builder
         * 
         */
        public Builder lcCollate(@Nullable Output<String> lcCollate) {
            $.lcCollate = lcCollate;
            return this;
        }

        /**
         * @param lcCollate Default string sort order (`LC_COLLATE`) of the database. The default value is `en_US.UTF-8`. Changing this property forces recreation of the resource.
         * 
         * @return builder
         * 
         */
        public Builder lcCollate(String lcCollate) {
            return lcCollate(Output.of(lcCollate));
        }

        /**
         * @param lcCtype Default character classification (`LC_CTYPE`) of the database. The default value is `en_US.UTF-8`. Changing this property forces recreation of the resource.
         * 
         * @return builder
         * 
         */
        public Builder lcCtype(@Nullable Output<String> lcCtype) {
            $.lcCtype = lcCtype;
            return this;
        }

        /**
         * @param lcCtype Default character classification (`LC_CTYPE`) of the database. The default value is `en_US.UTF-8`. Changing this property forces recreation of the resource.
         * 
         * @return builder
         * 
         */
        public Builder lcCtype(String lcCtype) {
            return lcCtype(Output.of(lcCtype));
        }

        /**
         * @param project The name of the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
         * 
         * @return builder
         * 
         */
        public Builder project(Output<String> project) {
            $.project = project;
            return this;
        }

        /**
         * @param project The name of the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
         * 
         * @return builder
         * 
         */
        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param serviceName The name of the service that this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
         * 
         * @return builder
         * 
         */
        public Builder serviceName(Output<String> serviceName) {
            $.serviceName = serviceName;
            return this;
        }

        /**
         * @param serviceName The name of the service that this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
         * 
         * @return builder
         * 
         */
        public Builder serviceName(String serviceName) {
            return serviceName(Output.of(serviceName));
        }

        public AlloydbomniDatabaseArgs build() {
            if ($.databaseName == null) {
                throw new MissingRequiredPropertyException("AlloydbomniDatabaseArgs", "databaseName");
            }
            if ($.project == null) {
                throw new MissingRequiredPropertyException("AlloydbomniDatabaseArgs", "project");
            }
            if ($.serviceName == null) {
                throw new MissingRequiredPropertyException("AlloydbomniDatabaseArgs", "serviceName");
            }
            return $;
        }
    }

}
