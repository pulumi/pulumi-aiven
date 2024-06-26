// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aiven.inputs;

import com.pulumi.aiven.inputs.M3DbM3dbUserConfigIpFilterObjectArgs;
import com.pulumi.aiven.inputs.M3DbM3dbUserConfigLimitsArgs;
import com.pulumi.aiven.inputs.M3DbM3dbUserConfigM3Args;
import com.pulumi.aiven.inputs.M3DbM3dbUserConfigNamespaceArgs;
import com.pulumi.aiven.inputs.M3DbM3dbUserConfigPrivateAccessArgs;
import com.pulumi.aiven.inputs.M3DbM3dbUserConfigPublicAccessArgs;
import com.pulumi.aiven.inputs.M3DbM3dbUserConfigRulesArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class M3DbM3dbUserConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final M3DbM3dbUserConfigArgs Empty = new M3DbM3dbUserConfigArgs();

    /**
     * Additional Cloud Regions for Backup Replication.
     * 
     */
    @Import(name="additionalBackupRegions")
    private @Nullable Output<String> additionalBackupRegions;

    /**
     * @return Additional Cloud Regions for Backup Replication.
     * 
     */
    public Optional<Output<String>> additionalBackupRegions() {
        return Optional.ofNullable(this.additionalBackupRegions);
    }

    /**
     * Serve the web frontend using a custom CNAME pointing to the Aiven DNS name. Example: `grafana.example.org`.
     * 
     */
    @Import(name="customDomain")
    private @Nullable Output<String> customDomain;

    /**
     * @return Serve the web frontend using a custom CNAME pointing to the Aiven DNS name. Example: `grafana.example.org`.
     * 
     */
    public Optional<Output<String>> customDomain() {
        return Optional.ofNullable(this.customDomain);
    }

    /**
     * Allow incoming connections from CIDR address block, e.g. `10.20.0.0/16`
     * 
     */
    @Import(name="ipFilterObjects")
    private @Nullable Output<List<M3DbM3dbUserConfigIpFilterObjectArgs>> ipFilterObjects;

    /**
     * @return Allow incoming connections from CIDR address block, e.g. `10.20.0.0/16`
     * 
     */
    public Optional<Output<List<M3DbM3dbUserConfigIpFilterObjectArgs>>> ipFilterObjects() {
        return Optional.ofNullable(this.ipFilterObjects);
    }

    /**
     * Allow incoming connections from CIDR address block, e.g. `10.20.0.0/16`.
     * 
     */
    @Import(name="ipFilterStrings")
    private @Nullable Output<List<String>> ipFilterStrings;

    /**
     * @return Allow incoming connections from CIDR address block, e.g. `10.20.0.0/16`.
     * 
     */
    public Optional<Output<List<String>>> ipFilterStrings() {
        return Optional.ofNullable(this.ipFilterStrings);
    }

    /**
     * Allow incoming connections from CIDR address block, e.g. `10.20.0.0/16`.
     * 
     * @deprecated
     * Deprecated. Use `ip_filter_string` instead.
     * 
     */
    @Deprecated /* Deprecated. Use `ip_filter_string` instead. */
    @Import(name="ipFilters")
    private @Nullable Output<List<String>> ipFilters;

    /**
     * @return Allow incoming connections from CIDR address block, e.g. `10.20.0.0/16`.
     * 
     * @deprecated
     * Deprecated. Use `ip_filter_string` instead.
     * 
     */
    @Deprecated /* Deprecated. Use `ip_filter_string` instead. */
    public Optional<Output<List<String>>> ipFilters() {
        return Optional.ofNullable(this.ipFilters);
    }

    /**
     * M3 limits
     * 
     */
    @Import(name="limits")
    private @Nullable Output<M3DbM3dbUserConfigLimitsArgs> limits;

    /**
     * @return M3 limits
     * 
     */
    public Optional<Output<M3DbM3dbUserConfigLimitsArgs>> limits() {
        return Optional.ofNullable(this.limits);
    }

    /**
     * M3 specific configuration options
     * 
     */
    @Import(name="m3")
    private @Nullable Output<M3DbM3dbUserConfigM3Args> m3;

    /**
     * @return M3 specific configuration options
     * 
     */
    public Optional<Output<M3DbM3dbUserConfigM3Args>> m3() {
        return Optional.ofNullable(this.m3);
    }

    /**
     * Enum: `1.1`, `1.2`, `1.5`, and newer. M3 major version (deprecated, use m3db_version).
     * 
     */
    @Import(name="m3Version")
    private @Nullable Output<String> m3Version;

    /**
     * @return Enum: `1.1`, `1.2`, `1.5`, and newer. M3 major version (deprecated, use m3db_version).
     * 
     */
    public Optional<Output<String>> m3Version() {
        return Optional.ofNullable(this.m3Version);
    }

    /**
     * Enables access to Graphite Carbon plaintext metrics ingestion. It can be enabled only for services inside VPCs. The metrics are written to aggregated namespaces only.
     * 
     */
    @Import(name="m3coordinatorEnableGraphiteCarbonIngest")
    private @Nullable Output<Boolean> m3coordinatorEnableGraphiteCarbonIngest;

    /**
     * @return Enables access to Graphite Carbon plaintext metrics ingestion. It can be enabled only for services inside VPCs. The metrics are written to aggregated namespaces only.
     * 
     */
    public Optional<Output<Boolean>> m3coordinatorEnableGraphiteCarbonIngest() {
        return Optional.ofNullable(this.m3coordinatorEnableGraphiteCarbonIngest);
    }

    /**
     * Enum: `1.1`, `1.2`, `1.5`, and newer. M3 major version (the minimum compatible version).
     * 
     */
    @Import(name="m3dbVersion")
    private @Nullable Output<String> m3dbVersion;

    /**
     * @return Enum: `1.1`, `1.2`, `1.5`, and newer. M3 major version (the minimum compatible version).
     * 
     */
    public Optional<Output<String>> m3dbVersion() {
        return Optional.ofNullable(this.m3dbVersion);
    }

    /**
     * List of M3 namespaces
     * 
     */
    @Import(name="namespaces")
    private @Nullable Output<List<M3DbM3dbUserConfigNamespaceArgs>> namespaces;

    /**
     * @return List of M3 namespaces
     * 
     */
    public Optional<Output<List<M3DbM3dbUserConfigNamespaceArgs>>> namespaces() {
        return Optional.ofNullable(this.namespaces);
    }

    /**
     * Allow access to selected service ports from private networks
     * 
     */
    @Import(name="privateAccess")
    private @Nullable Output<M3DbM3dbUserConfigPrivateAccessArgs> privateAccess;

    /**
     * @return Allow access to selected service ports from private networks
     * 
     */
    public Optional<Output<M3DbM3dbUserConfigPrivateAccessArgs>> privateAccess() {
        return Optional.ofNullable(this.privateAccess);
    }

    /**
     * Name of another project to fork a service from. This has effect only when a new service is being created. Example: `anotherprojectname`.
     * 
     */
    @Import(name="projectToForkFrom")
    private @Nullable Output<String> projectToForkFrom;

    /**
     * @return Name of another project to fork a service from. This has effect only when a new service is being created. Example: `anotherprojectname`.
     * 
     */
    public Optional<Output<String>> projectToForkFrom() {
        return Optional.ofNullable(this.projectToForkFrom);
    }

    /**
     * Allow access to selected service ports from the public Internet
     * 
     */
    @Import(name="publicAccess")
    private @Nullable Output<M3DbM3dbUserConfigPublicAccessArgs> publicAccess;

    /**
     * @return Allow access to selected service ports from the public Internet
     * 
     */
    public Optional<Output<M3DbM3dbUserConfigPublicAccessArgs>> publicAccess() {
        return Optional.ofNullable(this.publicAccess);
    }

    /**
     * M3 rules
     * 
     */
    @Import(name="rules")
    private @Nullable Output<M3DbM3dbUserConfigRulesArgs> rules;

    /**
     * @return M3 rules
     * 
     */
    public Optional<Output<M3DbM3dbUserConfigRulesArgs>> rules() {
        return Optional.ofNullable(this.rules);
    }

    /**
     * Store logs for the service so that they are available in the HTTP API and console.
     * 
     */
    @Import(name="serviceLog")
    private @Nullable Output<Boolean> serviceLog;

    /**
     * @return Store logs for the service so that they are available in the HTTP API and console.
     * 
     */
    public Optional<Output<Boolean>> serviceLog() {
        return Optional.ofNullable(this.serviceLog);
    }

    /**
     * Name of another service to fork from. This has effect only when a new service is being created. Example: `anotherservicename`.
     * 
     */
    @Import(name="serviceToForkFrom")
    private @Nullable Output<String> serviceToForkFrom;

    /**
     * @return Name of another service to fork from. This has effect only when a new service is being created. Example: `anotherservicename`.
     * 
     */
    public Optional<Output<String>> serviceToForkFrom() {
        return Optional.ofNullable(this.serviceToForkFrom);
    }

    /**
     * Use static public IP addresses.
     * 
     */
    @Import(name="staticIps")
    private @Nullable Output<Boolean> staticIps;

    /**
     * @return Use static public IP addresses.
     * 
     */
    public Optional<Output<Boolean>> staticIps() {
        return Optional.ofNullable(this.staticIps);
    }

    private M3DbM3dbUserConfigArgs() {}

    private M3DbM3dbUserConfigArgs(M3DbM3dbUserConfigArgs $) {
        this.additionalBackupRegions = $.additionalBackupRegions;
        this.customDomain = $.customDomain;
        this.ipFilterObjects = $.ipFilterObjects;
        this.ipFilterStrings = $.ipFilterStrings;
        this.ipFilters = $.ipFilters;
        this.limits = $.limits;
        this.m3 = $.m3;
        this.m3Version = $.m3Version;
        this.m3coordinatorEnableGraphiteCarbonIngest = $.m3coordinatorEnableGraphiteCarbonIngest;
        this.m3dbVersion = $.m3dbVersion;
        this.namespaces = $.namespaces;
        this.privateAccess = $.privateAccess;
        this.projectToForkFrom = $.projectToForkFrom;
        this.publicAccess = $.publicAccess;
        this.rules = $.rules;
        this.serviceLog = $.serviceLog;
        this.serviceToForkFrom = $.serviceToForkFrom;
        this.staticIps = $.staticIps;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(M3DbM3dbUserConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private M3DbM3dbUserConfigArgs $;

        public Builder() {
            $ = new M3DbM3dbUserConfigArgs();
        }

        public Builder(M3DbM3dbUserConfigArgs defaults) {
            $ = new M3DbM3dbUserConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param additionalBackupRegions Additional Cloud Regions for Backup Replication.
         * 
         * @return builder
         * 
         */
        public Builder additionalBackupRegions(@Nullable Output<String> additionalBackupRegions) {
            $.additionalBackupRegions = additionalBackupRegions;
            return this;
        }

        /**
         * @param additionalBackupRegions Additional Cloud Regions for Backup Replication.
         * 
         * @return builder
         * 
         */
        public Builder additionalBackupRegions(String additionalBackupRegions) {
            return additionalBackupRegions(Output.of(additionalBackupRegions));
        }

        /**
         * @param customDomain Serve the web frontend using a custom CNAME pointing to the Aiven DNS name. Example: `grafana.example.org`.
         * 
         * @return builder
         * 
         */
        public Builder customDomain(@Nullable Output<String> customDomain) {
            $.customDomain = customDomain;
            return this;
        }

        /**
         * @param customDomain Serve the web frontend using a custom CNAME pointing to the Aiven DNS name. Example: `grafana.example.org`.
         * 
         * @return builder
         * 
         */
        public Builder customDomain(String customDomain) {
            return customDomain(Output.of(customDomain));
        }

        /**
         * @param ipFilterObjects Allow incoming connections from CIDR address block, e.g. `10.20.0.0/16`
         * 
         * @return builder
         * 
         */
        public Builder ipFilterObjects(@Nullable Output<List<M3DbM3dbUserConfigIpFilterObjectArgs>> ipFilterObjects) {
            $.ipFilterObjects = ipFilterObjects;
            return this;
        }

        /**
         * @param ipFilterObjects Allow incoming connections from CIDR address block, e.g. `10.20.0.0/16`
         * 
         * @return builder
         * 
         */
        public Builder ipFilterObjects(List<M3DbM3dbUserConfigIpFilterObjectArgs> ipFilterObjects) {
            return ipFilterObjects(Output.of(ipFilterObjects));
        }

        /**
         * @param ipFilterObjects Allow incoming connections from CIDR address block, e.g. `10.20.0.0/16`
         * 
         * @return builder
         * 
         */
        public Builder ipFilterObjects(M3DbM3dbUserConfigIpFilterObjectArgs... ipFilterObjects) {
            return ipFilterObjects(List.of(ipFilterObjects));
        }

        /**
         * @param ipFilterStrings Allow incoming connections from CIDR address block, e.g. `10.20.0.0/16`.
         * 
         * @return builder
         * 
         */
        public Builder ipFilterStrings(@Nullable Output<List<String>> ipFilterStrings) {
            $.ipFilterStrings = ipFilterStrings;
            return this;
        }

        /**
         * @param ipFilterStrings Allow incoming connections from CIDR address block, e.g. `10.20.0.0/16`.
         * 
         * @return builder
         * 
         */
        public Builder ipFilterStrings(List<String> ipFilterStrings) {
            return ipFilterStrings(Output.of(ipFilterStrings));
        }

        /**
         * @param ipFilterStrings Allow incoming connections from CIDR address block, e.g. `10.20.0.0/16`.
         * 
         * @return builder
         * 
         */
        public Builder ipFilterStrings(String... ipFilterStrings) {
            return ipFilterStrings(List.of(ipFilterStrings));
        }

        /**
         * @param ipFilters Allow incoming connections from CIDR address block, e.g. `10.20.0.0/16`.
         * 
         * @return builder
         * 
         * @deprecated
         * Deprecated. Use `ip_filter_string` instead.
         * 
         */
        @Deprecated /* Deprecated. Use `ip_filter_string` instead. */
        public Builder ipFilters(@Nullable Output<List<String>> ipFilters) {
            $.ipFilters = ipFilters;
            return this;
        }

        /**
         * @param ipFilters Allow incoming connections from CIDR address block, e.g. `10.20.0.0/16`.
         * 
         * @return builder
         * 
         * @deprecated
         * Deprecated. Use `ip_filter_string` instead.
         * 
         */
        @Deprecated /* Deprecated. Use `ip_filter_string` instead. */
        public Builder ipFilters(List<String> ipFilters) {
            return ipFilters(Output.of(ipFilters));
        }

        /**
         * @param ipFilters Allow incoming connections from CIDR address block, e.g. `10.20.0.0/16`.
         * 
         * @return builder
         * 
         * @deprecated
         * Deprecated. Use `ip_filter_string` instead.
         * 
         */
        @Deprecated /* Deprecated. Use `ip_filter_string` instead. */
        public Builder ipFilters(String... ipFilters) {
            return ipFilters(List.of(ipFilters));
        }

        /**
         * @param limits M3 limits
         * 
         * @return builder
         * 
         */
        public Builder limits(@Nullable Output<M3DbM3dbUserConfigLimitsArgs> limits) {
            $.limits = limits;
            return this;
        }

        /**
         * @param limits M3 limits
         * 
         * @return builder
         * 
         */
        public Builder limits(M3DbM3dbUserConfigLimitsArgs limits) {
            return limits(Output.of(limits));
        }

        /**
         * @param m3 M3 specific configuration options
         * 
         * @return builder
         * 
         */
        public Builder m3(@Nullable Output<M3DbM3dbUserConfigM3Args> m3) {
            $.m3 = m3;
            return this;
        }

        /**
         * @param m3 M3 specific configuration options
         * 
         * @return builder
         * 
         */
        public Builder m3(M3DbM3dbUserConfigM3Args m3) {
            return m3(Output.of(m3));
        }

        /**
         * @param m3Version Enum: `1.1`, `1.2`, `1.5`, and newer. M3 major version (deprecated, use m3db_version).
         * 
         * @return builder
         * 
         */
        public Builder m3Version(@Nullable Output<String> m3Version) {
            $.m3Version = m3Version;
            return this;
        }

        /**
         * @param m3Version Enum: `1.1`, `1.2`, `1.5`, and newer. M3 major version (deprecated, use m3db_version).
         * 
         * @return builder
         * 
         */
        public Builder m3Version(String m3Version) {
            return m3Version(Output.of(m3Version));
        }

        /**
         * @param m3coordinatorEnableGraphiteCarbonIngest Enables access to Graphite Carbon plaintext metrics ingestion. It can be enabled only for services inside VPCs. The metrics are written to aggregated namespaces only.
         * 
         * @return builder
         * 
         */
        public Builder m3coordinatorEnableGraphiteCarbonIngest(@Nullable Output<Boolean> m3coordinatorEnableGraphiteCarbonIngest) {
            $.m3coordinatorEnableGraphiteCarbonIngest = m3coordinatorEnableGraphiteCarbonIngest;
            return this;
        }

        /**
         * @param m3coordinatorEnableGraphiteCarbonIngest Enables access to Graphite Carbon plaintext metrics ingestion. It can be enabled only for services inside VPCs. The metrics are written to aggregated namespaces only.
         * 
         * @return builder
         * 
         */
        public Builder m3coordinatorEnableGraphiteCarbonIngest(Boolean m3coordinatorEnableGraphiteCarbonIngest) {
            return m3coordinatorEnableGraphiteCarbonIngest(Output.of(m3coordinatorEnableGraphiteCarbonIngest));
        }

        /**
         * @param m3dbVersion Enum: `1.1`, `1.2`, `1.5`, and newer. M3 major version (the minimum compatible version).
         * 
         * @return builder
         * 
         */
        public Builder m3dbVersion(@Nullable Output<String> m3dbVersion) {
            $.m3dbVersion = m3dbVersion;
            return this;
        }

        /**
         * @param m3dbVersion Enum: `1.1`, `1.2`, `1.5`, and newer. M3 major version (the minimum compatible version).
         * 
         * @return builder
         * 
         */
        public Builder m3dbVersion(String m3dbVersion) {
            return m3dbVersion(Output.of(m3dbVersion));
        }

        /**
         * @param namespaces List of M3 namespaces
         * 
         * @return builder
         * 
         */
        public Builder namespaces(@Nullable Output<List<M3DbM3dbUserConfigNamespaceArgs>> namespaces) {
            $.namespaces = namespaces;
            return this;
        }

        /**
         * @param namespaces List of M3 namespaces
         * 
         * @return builder
         * 
         */
        public Builder namespaces(List<M3DbM3dbUserConfigNamespaceArgs> namespaces) {
            return namespaces(Output.of(namespaces));
        }

        /**
         * @param namespaces List of M3 namespaces
         * 
         * @return builder
         * 
         */
        public Builder namespaces(M3DbM3dbUserConfigNamespaceArgs... namespaces) {
            return namespaces(List.of(namespaces));
        }

        /**
         * @param privateAccess Allow access to selected service ports from private networks
         * 
         * @return builder
         * 
         */
        public Builder privateAccess(@Nullable Output<M3DbM3dbUserConfigPrivateAccessArgs> privateAccess) {
            $.privateAccess = privateAccess;
            return this;
        }

        /**
         * @param privateAccess Allow access to selected service ports from private networks
         * 
         * @return builder
         * 
         */
        public Builder privateAccess(M3DbM3dbUserConfigPrivateAccessArgs privateAccess) {
            return privateAccess(Output.of(privateAccess));
        }

        /**
         * @param projectToForkFrom Name of another project to fork a service from. This has effect only when a new service is being created. Example: `anotherprojectname`.
         * 
         * @return builder
         * 
         */
        public Builder projectToForkFrom(@Nullable Output<String> projectToForkFrom) {
            $.projectToForkFrom = projectToForkFrom;
            return this;
        }

        /**
         * @param projectToForkFrom Name of another project to fork a service from. This has effect only when a new service is being created. Example: `anotherprojectname`.
         * 
         * @return builder
         * 
         */
        public Builder projectToForkFrom(String projectToForkFrom) {
            return projectToForkFrom(Output.of(projectToForkFrom));
        }

        /**
         * @param publicAccess Allow access to selected service ports from the public Internet
         * 
         * @return builder
         * 
         */
        public Builder publicAccess(@Nullable Output<M3DbM3dbUserConfigPublicAccessArgs> publicAccess) {
            $.publicAccess = publicAccess;
            return this;
        }

        /**
         * @param publicAccess Allow access to selected service ports from the public Internet
         * 
         * @return builder
         * 
         */
        public Builder publicAccess(M3DbM3dbUserConfigPublicAccessArgs publicAccess) {
            return publicAccess(Output.of(publicAccess));
        }

        /**
         * @param rules M3 rules
         * 
         * @return builder
         * 
         */
        public Builder rules(@Nullable Output<M3DbM3dbUserConfigRulesArgs> rules) {
            $.rules = rules;
            return this;
        }

        /**
         * @param rules M3 rules
         * 
         * @return builder
         * 
         */
        public Builder rules(M3DbM3dbUserConfigRulesArgs rules) {
            return rules(Output.of(rules));
        }

        /**
         * @param serviceLog Store logs for the service so that they are available in the HTTP API and console.
         * 
         * @return builder
         * 
         */
        public Builder serviceLog(@Nullable Output<Boolean> serviceLog) {
            $.serviceLog = serviceLog;
            return this;
        }

        /**
         * @param serviceLog Store logs for the service so that they are available in the HTTP API and console.
         * 
         * @return builder
         * 
         */
        public Builder serviceLog(Boolean serviceLog) {
            return serviceLog(Output.of(serviceLog));
        }

        /**
         * @param serviceToForkFrom Name of another service to fork from. This has effect only when a new service is being created. Example: `anotherservicename`.
         * 
         * @return builder
         * 
         */
        public Builder serviceToForkFrom(@Nullable Output<String> serviceToForkFrom) {
            $.serviceToForkFrom = serviceToForkFrom;
            return this;
        }

        /**
         * @param serviceToForkFrom Name of another service to fork from. This has effect only when a new service is being created. Example: `anotherservicename`.
         * 
         * @return builder
         * 
         */
        public Builder serviceToForkFrom(String serviceToForkFrom) {
            return serviceToForkFrom(Output.of(serviceToForkFrom));
        }

        /**
         * @param staticIps Use static public IP addresses.
         * 
         * @return builder
         * 
         */
        public Builder staticIps(@Nullable Output<Boolean> staticIps) {
            $.staticIps = staticIps;
            return this;
        }

        /**
         * @param staticIps Use static public IP addresses.
         * 
         * @return builder
         * 
         */
        public Builder staticIps(Boolean staticIps) {
            return staticIps(Output.of(staticIps));
        }

        public M3DbM3dbUserConfigArgs build() {
            return $;
        }
    }

}
