// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aiven;

import com.pulumi.aiven.ProjectVpcArgs;
import com.pulumi.aiven.Utilities;
import com.pulumi.aiven.inputs.ProjectVpcState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Creates and manages a VPC for an Aiven project.
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
 * import com.pulumi.aiven.ProjectVpc;
 * import com.pulumi.aiven.ProjectVpcArgs;
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
 *         var exampleVpc = new ProjectVpc("exampleVpc", ProjectVpcArgs.builder()
 *             .project(exampleProject.project())
 *             .cloudName("google-europe-west1")
 *             .networkCidr("192.168.1.0/24")
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
 * $ pulumi import aiven:index/projectVpc:ProjectVpc example_vpc PROJECT/ID
 * ```
 * 
 */
@ResourceType(type="aiven:index/projectVpc:ProjectVpc")
public class ProjectVpc extends com.pulumi.resources.CustomResource {
    /**
     * The cloud provider and region where the service is hosted in the format `CLOUD_PROVIDER-REGION_NAME`. For example, `google-europe-west1` or `aws-us-east-2`. Changing this property forces recreation of the resource.
     * 
     */
    @Export(name="cloudName", refs={String.class}, tree="[0]")
    private Output<String> cloudName;

    /**
     * @return The cloud provider and region where the service is hosted in the format `CLOUD_PROVIDER-REGION_NAME`. For example, `google-europe-west1` or `aws-us-east-2`. Changing this property forces recreation of the resource.
     * 
     */
    public Output<String> cloudName() {
        return this.cloudName;
    }
    /**
     * Network address range used by the VPC. For example, `192.168.0.0/24`.
     * 
     */
    @Export(name="networkCidr", refs={String.class}, tree="[0]")
    private Output<String> networkCidr;

    /**
     * @return Network address range used by the VPC. For example, `192.168.0.0/24`.
     * 
     */
    public Output<String> networkCidr() {
        return this.networkCidr;
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
     * State of the VPC. The possible values are `ACTIVE`, `APPROVED`, `DELETED` and `DELETING`.
     * 
     */
    @Export(name="state", refs={String.class}, tree="[0]")
    private Output<String> state;

    /**
     * @return State of the VPC. The possible values are `ACTIVE`, `APPROVED`, `DELETED` and `DELETING`.
     * 
     */
    public Output<String> state() {
        return this.state;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ProjectVpc(java.lang.String name) {
        this(name, ProjectVpcArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ProjectVpc(java.lang.String name, ProjectVpcArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ProjectVpc(java.lang.String name, ProjectVpcArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aiven:index/projectVpc:ProjectVpc", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private ProjectVpc(java.lang.String name, Output<java.lang.String> id, @Nullable ProjectVpcState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aiven:index/projectVpc:ProjectVpc", name, state, makeResourceOptions(options, id), false);
    }

    private static ProjectVpcArgs makeArgs(ProjectVpcArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? ProjectVpcArgs.Empty : args;
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
    public static ProjectVpc get(java.lang.String name, Output<java.lang.String> id, @Nullable ProjectVpcState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ProjectVpc(name, id, state, options);
    }
}
