// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aiven;

import com.pulumi.aiven.OpenSearchAclConfigArgs;
import com.pulumi.aiven.Utilities;
import com.pulumi.aiven.inputs.OpenSearchAclConfigState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Enables access control for an Aiven for OpenSearch® service.
 * 
 * By default, service users are granted full access rights. To limit their access, you can enable access control and create ACLs
 * that define permissions and patterns. Alternatively, you can enable OpenSearch Security management
 * to manage users and permissions with the OpenSearch Security dashboard.
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
 * import com.pulumi.aiven.OpenSearchAclConfig;
 * import com.pulumi.aiven.OpenSearchAclConfigArgs;
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
 *         var main = new OpenSearchAclConfig("main", OpenSearchAclConfigArgs.builder()
 *             .project(exampleProject.project())
 *             .serviceName(exampleOpensearch.serviceName())
 *             .enabled(true)
 *             .extendedAcl(false)
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
 * $ pulumi import aiven:index/openSearchAclConfig:OpenSearchAclConfig main PROJECT/SERVICE_NAME
 * ```
 * 
 */
@ResourceType(type="aiven:index/openSearchAclConfig:OpenSearchAclConfig")
public class OpenSearchAclConfig extends com.pulumi.resources.CustomResource {
    /**
     * Enable OpenSearch ACLs. When disabled, authenticated service users have unrestricted access. The default value is `true`.
     * 
     */
    @Export(name="enabled", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> enabled;

    /**
     * @return Enable OpenSearch ACLs. When disabled, authenticated service users have unrestricted access. The default value is `true`.
     * 
     */
    public Output<Optional<Boolean>> enabled() {
        return Codegen.optional(this.enabled);
    }
    /**
     * Index rules can be applied in a limited fashion to the _mget, _msearch and _bulk APIs (and only those) by enabling the ExtendedAcl option for the service. When it is enabled, users can use these APIs as long as all operations only target indexes they have been granted access to. The default value is `true`.
     * 
     */
    @Export(name="extendedAcl", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> extendedAcl;

    /**
     * @return Index rules can be applied in a limited fashion to the _mget, _msearch and _bulk APIs (and only those) by enabling the ExtendedAcl option for the service. When it is enabled, users can use these APIs as long as all operations only target indexes they have been granted access to. The default value is `true`.
     * 
     */
    public Output<Optional<Boolean>> extendedAcl() {
        return Codegen.optional(this.extendedAcl);
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

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public OpenSearchAclConfig(java.lang.String name) {
        this(name, OpenSearchAclConfigArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public OpenSearchAclConfig(java.lang.String name, OpenSearchAclConfigArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public OpenSearchAclConfig(java.lang.String name, OpenSearchAclConfigArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aiven:index/openSearchAclConfig:OpenSearchAclConfig", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private OpenSearchAclConfig(java.lang.String name, Output<java.lang.String> id, @Nullable OpenSearchAclConfigState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aiven:index/openSearchAclConfig:OpenSearchAclConfig", name, state, makeResourceOptions(options, id), false);
    }

    private static OpenSearchAclConfigArgs makeArgs(OpenSearchAclConfigArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? OpenSearchAclConfigArgs.Empty : args;
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
    public static OpenSearchAclConfig get(java.lang.String name, Output<java.lang.String> id, @Nullable OpenSearchAclConfigState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new OpenSearchAclConfig(name, id, state, options);
    }
}
