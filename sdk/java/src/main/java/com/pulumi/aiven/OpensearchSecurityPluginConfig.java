// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aiven;

import com.pulumi.aiven.OpensearchSecurityPluginConfigArgs;
import com.pulumi.aiven.Utilities;
import com.pulumi.aiven.inputs.OpensearchSecurityPluginConfigState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * The OpenSearch Security Plugin Config resource allows the creation and management of AivenOpenSearch Security Plugin config.
 * 
 * ## Import
 * 
 * ```sh
 *  $ pulumi import aiven:index/opensearchSecurityPluginConfig:OpensearchSecurityPluginConfig foo project/service_name
 * ```
 * 
 */
@ResourceType(type="aiven:index/opensearchSecurityPluginConfig:OpensearchSecurityPluginConfig")
public class OpensearchSecurityPluginConfig extends com.pulumi.resources.CustomResource {
    /**
     * Whether the os-sec-admin user is enabled. This indicates whether the user management with the security plugin is enabled. This is always true when the os-sec-admin password was set at least once.
     * 
     */
    @Export(name="adminEnabled", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> adminEnabled;

    /**
     * @return Whether the os-sec-admin user is enabled. This indicates whether the user management with the security plugin is enabled. This is always true when the os-sec-admin password was set at least once.
     * 
     */
    public Output<Boolean> adminEnabled() {
        return this.adminEnabled;
    }
    /**
     * The password for the os-sec-admin user.
     * 
     */
    @Export(name="adminPassword", refs={String.class}, tree="[0]")
    private Output<String> adminPassword;

    /**
     * @return The password for the os-sec-admin user.
     * 
     */
    public Output<String> adminPassword() {
        return this.adminPassword;
    }
    /**
     * Whether the security plugin is available. This is always true for recently created services.
     * 
     */
    @Export(name="available", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> available;

    /**
     * @return Whether the security plugin is available. This is always true for recently created services.
     * 
     */
    public Output<Boolean> available() {
        return this.available;
    }
    /**
     * Whether the security plugin is enabled. This is always true for recently created services.
     * 
     */
    @Export(name="enabled", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> enabled;

    /**
     * @return Whether the security plugin is enabled. This is always true for recently created services.
     * 
     */
    public Output<Boolean> enabled() {
        return this.enabled;
    }
    /**
     * Identifies the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. This property cannot be changed, doing so forces recreation of the resource.
     * 
     */
    @Export(name="project", refs={String.class}, tree="[0]")
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
    @Export(name="serviceName", refs={String.class}, tree="[0]")
    private Output<String> serviceName;

    /**
     * @return Specifies the name of the service that this resource belongs to. To set up proper dependencies please refer to this variable as a reference. This property cannot be changed, doing so forces recreation of the resource.
     * 
     */
    public Output<String> serviceName() {
        return this.serviceName;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public OpensearchSecurityPluginConfig(String name) {
        this(name, OpensearchSecurityPluginConfigArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public OpensearchSecurityPluginConfig(String name, OpensearchSecurityPluginConfigArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public OpensearchSecurityPluginConfig(String name, OpensearchSecurityPluginConfigArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aiven:index/opensearchSecurityPluginConfig:OpensearchSecurityPluginConfig", name, args == null ? OpensearchSecurityPluginConfigArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private OpensearchSecurityPluginConfig(String name, Output<String> id, @Nullable OpensearchSecurityPluginConfigState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aiven:index/opensearchSecurityPluginConfig:OpensearchSecurityPluginConfig", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .additionalSecretOutputs(List.of(
                "adminPassword"
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
    public static OpensearchSecurityPluginConfig get(String name, Output<String> id, @Nullable OpensearchSecurityPluginConfigState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new OpensearchSecurityPluginConfig(name, id, state, options);
    }
}