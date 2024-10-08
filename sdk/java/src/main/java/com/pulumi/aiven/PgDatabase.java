// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aiven;

import com.pulumi.aiven.PgDatabaseArgs;
import com.pulumi.aiven.Utilities;
import com.pulumi.aiven.inputs.PgDatabaseState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Creates and manages a database in an Aiven for PostgreSQL® service.
 * 
 * ## Example Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aiven.PgDatabase;
 * import com.pulumi.aiven.PgDatabaseArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var main = new PgDatabase("main", PgDatabaseArgs.builder()
 *             .project(exampleProject.project())
 *             .serviceName(examplePostgres.serviceName())
 *             .databaseName("example-database")
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * ```sh
 * $ pulumi import aiven:index/pgDatabase:PgDatabase main PROJECT/SERVICE_NAME/DATABASE_NAME
 * ```
 * 
 */
@ResourceType(type="aiven:index/pgDatabase:PgDatabase")
public class PgDatabase extends com.pulumi.resources.CustomResource {
    /**
     * The name of the service database. Changing this property forces recreation of the resource.
     * 
     */
    @Export(name="databaseName", refs={String.class}, tree="[0]")
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
    @Export(name="lcCollate", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> lcCollate;

    /**
     * @return Default string sort order (`LC_COLLATE`) of the database. The default value is `en_US.UTF-8`. Changing this property forces recreation of the resource.
     * 
     */
    public Output<Optional<String>> lcCollate() {
        return Codegen.optional(this.lcCollate);
    }
    /**
     * Default character classification (`LC_CTYPE`) of the database. The default value is `en_US.UTF-8`. Changing this property forces recreation of the resource.
     * 
     */
    @Export(name="lcCtype", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> lcCtype;

    /**
     * @return Default character classification (`LC_CTYPE`) of the database. The default value is `en_US.UTF-8`. Changing this property forces recreation of the resource.
     * 
     */
    public Output<Optional<String>> lcCtype() {
        return Codegen.optional(this.lcCtype);
    }
    /**
     * The name of the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
     * 
     */
    @Export(name="project", refs={String.class}, tree="[0]")
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
    @Export(name="serviceName", refs={String.class}, tree="[0]")
    private Output<String> serviceName;

    /**
     * @return The name of the service that this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
     * 
     */
    public Output<String> serviceName() {
        return this.serviceName;
    }
    @Export(name="terminationProtection", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> terminationProtection;

    public Output<Optional<Boolean>> terminationProtection() {
        return Codegen.optional(this.terminationProtection);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public PgDatabase(java.lang.String name) {
        this(name, PgDatabaseArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public PgDatabase(java.lang.String name, PgDatabaseArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public PgDatabase(java.lang.String name, PgDatabaseArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aiven:index/pgDatabase:PgDatabase", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private PgDatabase(java.lang.String name, Output<java.lang.String> id, @Nullable PgDatabaseState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aiven:index/pgDatabase:PgDatabase", name, state, makeResourceOptions(options, id), false);
    }

    private static PgDatabaseArgs makeArgs(PgDatabaseArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? PgDatabaseArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static PgDatabase get(java.lang.String name, Output<java.lang.String> id, @Nullable PgDatabaseState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new PgDatabase(name, id, state, options);
    }
}
