// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aiven;

import com.pulumi.aiven.ClickhouseUserArgs;
import com.pulumi.aiven.Utilities;
import com.pulumi.aiven.inputs.ClickhouseUserState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * The Clickhouse User resource allows the creation and management of Aiven Clikhouse Users.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aiven.ClickhouseUser;
 * import com.pulumi.aiven.ClickhouseUserArgs;
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
 *         var ch_user = new ClickhouseUser(&#34;ch-user&#34;, ClickhouseUserArgs.builder()        
 *             .project(aiven_project.myproject().project())
 *             .serviceName(aiven_clickhouse.myservice().service_name())
 *             .username(&#34;&lt;USERNAME&gt;&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * ```sh
 *  $ pulumi import aiven:index/clickhouseUser:ClickhouseUser ch-user project/service_name/id
 * ```
 * 
 */
@ResourceType(type="aiven:index/clickhouseUser:ClickhouseUser")
public class ClickhouseUser extends com.pulumi.resources.CustomResource {
    /**
     * The password of the clickhouse user.
     * 
     */
    @Export(name="password", type=String.class, parameters={})
    private Output<String> password;

    /**
     * @return The password of the clickhouse user.
     * 
     */
    public Output<String> password() {
        return this.password;
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
     * Indicates if a clickhouse user is required
     * 
     */
    @Export(name="required", type=Boolean.class, parameters={})
    private Output<Boolean> required;

    /**
     * @return Indicates if a clickhouse user is required
     * 
     */
    public Output<Boolean> required() {
        return this.required;
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
     * The actual name of the Clickhouse user. This property cannot be changed, doing so forces recreation of the resource.
     * 
     */
    @Export(name="username", type=String.class, parameters={})
    private Output<String> username;

    /**
     * @return The actual name of the Clickhouse user. This property cannot be changed, doing so forces recreation of the resource.
     * 
     */
    public Output<String> username() {
        return this.username;
    }
    /**
     * UUID of the clickhouse user.
     * 
     */
    @Export(name="uuid", type=String.class, parameters={})
    private Output<String> uuid;

    /**
     * @return UUID of the clickhouse user.
     * 
     */
    public Output<String> uuid() {
        return this.uuid;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ClickhouseUser(String name) {
        this(name, ClickhouseUserArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ClickhouseUser(String name, ClickhouseUserArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ClickhouseUser(String name, ClickhouseUserArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aiven:index/clickhouseUser:ClickhouseUser", name, args == null ? ClickhouseUserArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ClickhouseUser(String name, Output<String> id, @Nullable ClickhouseUserState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aiven:index/clickhouseUser:ClickhouseUser", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .additionalSecretOutputs(List.of(
                "password"
            ))
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
    public static ClickhouseUser get(String name, Output<String> id, @Nullable ClickhouseUserState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ClickhouseUser(name, id, state, options);
    }
}