// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aiven;

import com.pulumi.aiven.ProjectUserArgs;
import com.pulumi.aiven.Utilities;
import com.pulumi.aiven.inputs.ProjectUserState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * The Project User resource allows the creation and management of Aiven Project Users.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aiven.ProjectUser;
 * import com.pulumi.aiven.ProjectUserArgs;
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
 *         var mytestuser = new ProjectUser(&#34;mytestuser&#34;, ProjectUserArgs.builder()        
 *             .project(aiven_project.myproject().project())
 *             .email(&#34;john.doe@example.com&#34;)
 *             .memberType(&#34;admin&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * ```sh
 *  $ pulumi import aiven:index/projectUser:ProjectUser mytestuser project/email
 * ```
 * 
 */
@ResourceType(type="aiven:index/projectUser:ProjectUser")
public class ProjectUser extends com.pulumi.resources.CustomResource {
    /**
     * Whether the user has accepted the request to join the project; adding user to a project sends an invitation to the target user and the actual membership is only created once the user accepts the invitation.
     * 
     */
    @Export(name="accepted", type=Boolean.class, parameters={})
    private Output<Boolean> accepted;

    /**
     * @return Whether the user has accepted the request to join the project; adding user to a project sends an invitation to the target user and the actual membership is only created once the user accepts the invitation.
     * 
     */
    public Output<Boolean> accepted() {
        return this.accepted;
    }
    /**
     * Email address of the user. This property cannot be changed, doing so forces recreation of the resource.
     * 
     */
    @Export(name="email", type=String.class, parameters={})
    private Output<String> email;

    /**
     * @return Email address of the user. This property cannot be changed, doing so forces recreation of the resource.
     * 
     */
    public Output<String> email() {
        return this.email;
    }
    /**
     * Project membership type. The possible values are `admin`, `developer` and `operator`.
     * 
     */
    @Export(name="memberType", type=String.class, parameters={})
    private Output<String> memberType;

    /**
     * @return Project membership type. The possible values are `admin`, `developer` and `operator`.
     * 
     */
    public Output<String> memberType() {
        return this.memberType;
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
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ProjectUser(String name) {
        this(name, ProjectUserArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ProjectUser(String name, ProjectUserArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ProjectUser(String name, ProjectUserArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aiven:index/projectUser:ProjectUser", name, args == null ? ProjectUserArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ProjectUser(String name, Output<String> id, @Nullable ProjectUserState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aiven:index/projectUser:ProjectUser", name, state, makeResourceOptions(options, id));
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
    public static ProjectUser get(String name, Output<String> id, @Nullable ProjectUserState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ProjectUser(name, id, state, options);
    }
}