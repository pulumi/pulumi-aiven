// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aiven;

import com.pulumi.aiven.FlinkApplicationArgs;
import com.pulumi.aiven.Utilities;
import com.pulumi.aiven.inputs.FlinkApplicationState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * The Flink Application resource allows the creation and management of Aiven Flink Applications.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aiven.FlinkApplication;
 * import com.pulumi.aiven.FlinkApplicationArgs;
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
 *         var foo = new FlinkApplication(&#34;foo&#34;, FlinkApplicationArgs.builder()        
 *             .project(aiven_project.foo().project())
 *             .serviceName(&#34;flink-service-1&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * ```sh
 *  $ pulumi import aiven:index/flinkApplication:FlinkApplication myapp project/service/application_name
 * ```
 * 
 */
@ResourceType(type="aiven:index/flinkApplication:FlinkApplication")
public class FlinkApplication extends com.pulumi.resources.CustomResource {
    /**
     * Application ID
     * 
     */
    @Export(name="applicationId", type=String.class, parameters={})
    private Output<String> applicationId;

    /**
     * @return Application ID
     * 
     */
    public Output<String> applicationId() {
        return this.applicationId;
    }
    /**
     * Application creation time
     * 
     */
    @Export(name="createdAt", type=String.class, parameters={})
    private Output<String> createdAt;

    /**
     * @return Application creation time
     * 
     */
    public Output<String> createdAt() {
        return this.createdAt;
    }
    /**
     * Application creator
     * 
     */
    @Export(name="createdBy", type=String.class, parameters={})
    private Output<String> createdBy;

    /**
     * @return Application creator
     * 
     */
    public Output<String> createdBy() {
        return this.createdBy;
    }
    /**
     * Application name
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Application name
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Identifies the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. This property cannot be changed, doing so forces recreation of the resource.
     * 
     */
    @Export(name="project", type=String.class, parameters={})
    private Output<String> project;

    /**
     * @return Identifies the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. This property cannot be changed, doing so forces recreation of the resource.
     * 
     */
    public Output<String> project() {
        return this.project;
    }
    /**
     * Specifies the name of the service that this resource belongs to. To set up proper dependencies please refer to this variable as a reference. This property cannot be changed, doing so forces recreation of the resource.
     * 
     */
    @Export(name="serviceName", type=String.class, parameters={})
    private Output<String> serviceName;

    /**
     * @return Specifies the name of the service that this resource belongs to. To set up proper dependencies please refer to this variable as a reference. This property cannot be changed, doing so forces recreation of the resource.
     * 
     */
    public Output<String> serviceName() {
        return this.serviceName;
    }
    /**
     * Application update time
     * 
     */
    @Export(name="updatedAt", type=String.class, parameters={})
    private Output<String> updatedAt;

    /**
     * @return Application update time
     * 
     */
    public Output<String> updatedAt() {
        return this.updatedAt;
    }
    /**
     * Application updater
     * 
     */
    @Export(name="updatedBy", type=String.class, parameters={})
    private Output<String> updatedBy;

    /**
     * @return Application updater
     * 
     */
    public Output<String> updatedBy() {
        return this.updatedBy;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public FlinkApplication(String name) {
        this(name, FlinkApplicationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public FlinkApplication(String name, FlinkApplicationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public FlinkApplication(String name, FlinkApplicationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aiven:index/flinkApplication:FlinkApplication", name, args == null ? FlinkApplicationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private FlinkApplication(String name, Output<String> id, @Nullable FlinkApplicationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aiven:index/flinkApplication:FlinkApplication", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
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
    public static FlinkApplication get(String name, Output<String> id, @Nullable FlinkApplicationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new FlinkApplication(name, id, state, options);
    }
}