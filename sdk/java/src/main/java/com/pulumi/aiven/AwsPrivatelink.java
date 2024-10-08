// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aiven;

import com.pulumi.aiven.AwsPrivatelinkArgs;
import com.pulumi.aiven.Utilities;
import com.pulumi.aiven.inputs.AwsPrivatelinkState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Creates and manages an [AWS PrivateLink for Aiven services](https://aiven.io/docs/platform/howto/use-aws-privatelinks) in a VPC.
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
 * import com.pulumi.aiven.AwsPrivatelink;
 * import com.pulumi.aiven.AwsPrivatelinkArgs;
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
 *         var main = new AwsPrivatelink("main", AwsPrivatelinkArgs.builder()
 *             .project(exampleProject.project())
 *             .serviceName(exampleKafka.serviceName())
 *             .principals("arn:aws:iam::012345678901:user/mwf")
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
 * $ pulumi import aiven:index/awsPrivatelink:AwsPrivatelink main PROJECT/SERVICE_NAME
 * ```
 * 
 */
@ResourceType(type="aiven:index/awsPrivatelink:AwsPrivatelink")
public class AwsPrivatelink extends com.pulumi.resources.CustomResource {
    /**
     * AWS service ID.
     * 
     */
    @Export(name="awsServiceId", refs={String.class}, tree="[0]")
    private Output<String> awsServiceId;

    /**
     * @return AWS service ID.
     * 
     */
    public Output<String> awsServiceId() {
        return this.awsServiceId;
    }
    /**
     * AWS service name.
     * 
     */
    @Export(name="awsServiceName", refs={String.class}, tree="[0]")
    private Output<String> awsServiceName;

    /**
     * @return AWS service name.
     * 
     */
    public Output<String> awsServiceName() {
        return this.awsServiceName;
    }
    /**
     * List of the ARNs of the AWS accounts or IAM users allowed to connect to the VPC endpoint.
     * 
     */
    @Export(name="principals", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> principals;

    /**
     * @return List of the ARNs of the AWS accounts or IAM users allowed to connect to the VPC endpoint.
     * 
     */
    public Output<List<String>> principals() {
        return this.principals;
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
    public AwsPrivatelink(java.lang.String name) {
        this(name, AwsPrivatelinkArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AwsPrivatelink(java.lang.String name, AwsPrivatelinkArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AwsPrivatelink(java.lang.String name, AwsPrivatelinkArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aiven:index/awsPrivatelink:AwsPrivatelink", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private AwsPrivatelink(java.lang.String name, Output<java.lang.String> id, @Nullable AwsPrivatelinkState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aiven:index/awsPrivatelink:AwsPrivatelink", name, state, makeResourceOptions(options, id), false);
    }

    private static AwsPrivatelinkArgs makeArgs(AwsPrivatelinkArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? AwsPrivatelinkArgs.Empty : args;
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
    public static AwsPrivatelink get(java.lang.String name, Output<java.lang.String> id, @Nullable AwsPrivatelinkState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new AwsPrivatelink(name, id, state, options);
    }
}
