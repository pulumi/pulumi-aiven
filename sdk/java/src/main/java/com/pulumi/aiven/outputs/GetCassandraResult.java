// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aiven.outputs;

import com.pulumi.aiven.outputs.GetCassandraCassandra;
import com.pulumi.aiven.outputs.GetCassandraCassandraUserConfig;
import com.pulumi.aiven.outputs.GetCassandraComponent;
import com.pulumi.aiven.outputs.GetCassandraServiceIntegration;
import com.pulumi.aiven.outputs.GetCassandraTag;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetCassandraResult {
    /**
     * @return Additional disk space. Possible values depend on the service type, the cloud provider and the project. Therefore, reducing will result in the service rebalancing.
     * 
     */
    private String additionalDiskSpace;
    /**
     * @return Cassandra user configurable settings
     * 
     */
    private List<GetCassandraCassandraUserConfig> cassandraUserConfigs;
    /**
     * @return Cassandra server provided values
     * 
     */
    private List<GetCassandraCassandra> cassandras;
    /**
     * @return Defines where the cloud provider and region where the service is hosted in. This can be changed freely after service is created. Changing the value will trigger a potentially lengthy migration process for the service. Format is cloud provider name (`aws`, `azure`, `do` `google`, `upcloud`, etc.), dash, and the cloud provider specific region name. These are documented on each Cloud provider&#39;s own support articles, like [here for Google](https://cloud.google.com/compute/docs/regions-zones/) and [here for AWS](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.RegionsAndAvailabilityZones.html).
     * 
     */
    private String cloudName;
    /**
     * @return Service component information objects
     * 
     */
    private List<GetCassandraComponent> components;
    /**
     * @return Service disk space. Possible values depend on the service type, the cloud provider and the project. Therefore, reducing will result in the service rebalancing.
     * 
     */
    private String diskSpace;
    /**
     * @return The maximum disk space of the service, possible values depend on the service type, the cloud provider and the project.
     * 
     */
    private String diskSpaceCap;
    /**
     * @return The default disk space of the service, possible values depend on the service type, the cloud provider and the project. Its also the minimum value for `disk_space`
     * 
     */
    private String diskSpaceDefault;
    /**
     * @return The default disk space step of the service, possible values depend on the service type, the cloud provider and the project. `disk_space` needs to increment from `disk_space_default` by increments of this size.
     * 
     */
    private String diskSpaceStep;
    /**
     * @return Disk space that service is currently using
     * 
     */
    private String diskSpaceUsed;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return Day of week when maintenance operations should be performed. One monday, tuesday, wednesday, etc.
     * 
     */
    private String maintenanceWindowDow;
    /**
     * @return Time of day when maintenance operations should be performed. UTC time in HH:mm:ss format.
     * 
     */
    private String maintenanceWindowTime;
    /**
     * @return Defines what kind of computing resources are allocated for the service. It can be changed after creation, though there are some restrictions when going to a smaller plan such as the new plan must have sufficient amount of disk space to store all current data and switching to a plan with fewer nodes might not be supported. The basic plan names are `hobbyist`, `startup-x`, `business-x` and `premium-x` where `x` is (roughly) the amount of memory on each node (also other attributes like number of CPUs and amount of disk space varies but naming is based on memory). The available options can be seem from the [Aiven pricing page](https://aiven.io/pricing).
     * 
     */
    private String plan;
    /**
     * @return Identifies the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. This property cannot be changed, doing so forces recreation of the resource.
     * 
     */
    private String project;
    /**
     * @return Specifies the VPC the service should run in. If the value is not set the service is not run inside a VPC. When set, the value should be given as a reference to set up dependencies correctly and the VPC must be in the same cloud and region as the service itself. Project can be freely moved to and from VPC after creation but doing so triggers migration to new servers so the operation can take significant amount of time to complete if the service has a lot of data.
     * 
     */
    private String projectVpcId;
    /**
     * @return The hostname of the service.
     * 
     */
    private String serviceHost;
    /**
     * @return Service integrations to specify when creating a service. Not applied after initial service creation
     * 
     */
    private List<GetCassandraServiceIntegration> serviceIntegrations;
    /**
     * @return Specifies the actual name of the service. The name cannot be changed later without destroying and re-creating the service so name should be picked based on intended service usage rather than current attributes.
     * 
     */
    private String serviceName;
    /**
     * @return Password used for connecting to the service, if applicable
     * 
     */
    private String servicePassword;
    /**
     * @return The port of the service
     * 
     */
    private Integer servicePort;
    /**
     * @return Aiven internal service type code
     * 
     */
    private String serviceType;
    /**
     * @return URI for connecting to the service. Service specific info is under &#34;kafka&#34;, &#34;pg&#34;, etc.
     * 
     */
    private String serviceUri;
    /**
     * @return Username used for connecting to the service, if applicable
     * 
     */
    private String serviceUsername;
    /**
     * @return Service state. One of `POWEROFF`, `REBALANCING`, `REBUILDING` or `RUNNING`
     * 
     */
    private String state;
    /**
     * @return Static IPs that are going to be associated with this service. Please assign a value using the &#39;toset&#39; function. Once a static ip resource is in the &#39;assigned&#39; state it cannot be unbound from the node again
     * 
     */
    private List<String> staticIps;
    /**
     * @return Tags are key-value pairs that allow you to categorize services.
     * 
     */
    private List<GetCassandraTag> tags;
    /**
     * @return Prevents the service from being deleted. It is recommended to set this to `true` for all production services to prevent unintentional service deletion. This does not shield against deleting databases or topics but for services with backups much of the content can at least be restored from backup in case accidental deletion is done.
     * 
     */
    private Boolean terminationProtection;

    private GetCassandraResult() {}
    /**
     * @return Additional disk space. Possible values depend on the service type, the cloud provider and the project. Therefore, reducing will result in the service rebalancing.
     * 
     */
    public String additionalDiskSpace() {
        return this.additionalDiskSpace;
    }
    /**
     * @return Cassandra user configurable settings
     * 
     */
    public List<GetCassandraCassandraUserConfig> cassandraUserConfigs() {
        return this.cassandraUserConfigs;
    }
    /**
     * @return Cassandra server provided values
     * 
     */
    public List<GetCassandraCassandra> cassandras() {
        return this.cassandras;
    }
    /**
     * @return Defines where the cloud provider and region where the service is hosted in. This can be changed freely after service is created. Changing the value will trigger a potentially lengthy migration process for the service. Format is cloud provider name (`aws`, `azure`, `do` `google`, `upcloud`, etc.), dash, and the cloud provider specific region name. These are documented on each Cloud provider&#39;s own support articles, like [here for Google](https://cloud.google.com/compute/docs/regions-zones/) and [here for AWS](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.RegionsAndAvailabilityZones.html).
     * 
     */
    public String cloudName() {
        return this.cloudName;
    }
    /**
     * @return Service component information objects
     * 
     */
    public List<GetCassandraComponent> components() {
        return this.components;
    }
    /**
     * @return Service disk space. Possible values depend on the service type, the cloud provider and the project. Therefore, reducing will result in the service rebalancing.
     * 
     */
    public String diskSpace() {
        return this.diskSpace;
    }
    /**
     * @return The maximum disk space of the service, possible values depend on the service type, the cloud provider and the project.
     * 
     */
    public String diskSpaceCap() {
        return this.diskSpaceCap;
    }
    /**
     * @return The default disk space of the service, possible values depend on the service type, the cloud provider and the project. Its also the minimum value for `disk_space`
     * 
     */
    public String diskSpaceDefault() {
        return this.diskSpaceDefault;
    }
    /**
     * @return The default disk space step of the service, possible values depend on the service type, the cloud provider and the project. `disk_space` needs to increment from `disk_space_default` by increments of this size.
     * 
     */
    public String diskSpaceStep() {
        return this.diskSpaceStep;
    }
    /**
     * @return Disk space that service is currently using
     * 
     */
    public String diskSpaceUsed() {
        return this.diskSpaceUsed;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Day of week when maintenance operations should be performed. One monday, tuesday, wednesday, etc.
     * 
     */
    public String maintenanceWindowDow() {
        return this.maintenanceWindowDow;
    }
    /**
     * @return Time of day when maintenance operations should be performed. UTC time in HH:mm:ss format.
     * 
     */
    public String maintenanceWindowTime() {
        return this.maintenanceWindowTime;
    }
    /**
     * @return Defines what kind of computing resources are allocated for the service. It can be changed after creation, though there are some restrictions when going to a smaller plan such as the new plan must have sufficient amount of disk space to store all current data and switching to a plan with fewer nodes might not be supported. The basic plan names are `hobbyist`, `startup-x`, `business-x` and `premium-x` where `x` is (roughly) the amount of memory on each node (also other attributes like number of CPUs and amount of disk space varies but naming is based on memory). The available options can be seem from the [Aiven pricing page](https://aiven.io/pricing).
     * 
     */
    public String plan() {
        return this.plan;
    }
    /**
     * @return Identifies the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. This property cannot be changed, doing so forces recreation of the resource.
     * 
     */
    public String project() {
        return this.project;
    }
    /**
     * @return Specifies the VPC the service should run in. If the value is not set the service is not run inside a VPC. When set, the value should be given as a reference to set up dependencies correctly and the VPC must be in the same cloud and region as the service itself. Project can be freely moved to and from VPC after creation but doing so triggers migration to new servers so the operation can take significant amount of time to complete if the service has a lot of data.
     * 
     */
    public String projectVpcId() {
        return this.projectVpcId;
    }
    /**
     * @return The hostname of the service.
     * 
     */
    public String serviceHost() {
        return this.serviceHost;
    }
    /**
     * @return Service integrations to specify when creating a service. Not applied after initial service creation
     * 
     */
    public List<GetCassandraServiceIntegration> serviceIntegrations() {
        return this.serviceIntegrations;
    }
    /**
     * @return Specifies the actual name of the service. The name cannot be changed later without destroying and re-creating the service so name should be picked based on intended service usage rather than current attributes.
     * 
     */
    public String serviceName() {
        return this.serviceName;
    }
    /**
     * @return Password used for connecting to the service, if applicable
     * 
     */
    public String servicePassword() {
        return this.servicePassword;
    }
    /**
     * @return The port of the service
     * 
     */
    public Integer servicePort() {
        return this.servicePort;
    }
    /**
     * @return Aiven internal service type code
     * 
     */
    public String serviceType() {
        return this.serviceType;
    }
    /**
     * @return URI for connecting to the service. Service specific info is under &#34;kafka&#34;, &#34;pg&#34;, etc.
     * 
     */
    public String serviceUri() {
        return this.serviceUri;
    }
    /**
     * @return Username used for connecting to the service, if applicable
     * 
     */
    public String serviceUsername() {
        return this.serviceUsername;
    }
    /**
     * @return Service state. One of `POWEROFF`, `REBALANCING`, `REBUILDING` or `RUNNING`
     * 
     */
    public String state() {
        return this.state;
    }
    /**
     * @return Static IPs that are going to be associated with this service. Please assign a value using the &#39;toset&#39; function. Once a static ip resource is in the &#39;assigned&#39; state it cannot be unbound from the node again
     * 
     */
    public List<String> staticIps() {
        return this.staticIps;
    }
    /**
     * @return Tags are key-value pairs that allow you to categorize services.
     * 
     */
    public List<GetCassandraTag> tags() {
        return this.tags;
    }
    /**
     * @return Prevents the service from being deleted. It is recommended to set this to `true` for all production services to prevent unintentional service deletion. This does not shield against deleting databases or topics but for services with backups much of the content can at least be restored from backup in case accidental deletion is done.
     * 
     */
    public Boolean terminationProtection() {
        return this.terminationProtection;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCassandraResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String additionalDiskSpace;
        private List<GetCassandraCassandraUserConfig> cassandraUserConfigs;
        private List<GetCassandraCassandra> cassandras;
        private String cloudName;
        private List<GetCassandraComponent> components;
        private String diskSpace;
        private String diskSpaceCap;
        private String diskSpaceDefault;
        private String diskSpaceStep;
        private String diskSpaceUsed;
        private String id;
        private String maintenanceWindowDow;
        private String maintenanceWindowTime;
        private String plan;
        private String project;
        private String projectVpcId;
        private String serviceHost;
        private List<GetCassandraServiceIntegration> serviceIntegrations;
        private String serviceName;
        private String servicePassword;
        private Integer servicePort;
        private String serviceType;
        private String serviceUri;
        private String serviceUsername;
        private String state;
        private List<String> staticIps;
        private List<GetCassandraTag> tags;
        private Boolean terminationProtection;
        public Builder() {}
        public Builder(GetCassandraResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalDiskSpace = defaults.additionalDiskSpace;
    	      this.cassandraUserConfigs = defaults.cassandraUserConfigs;
    	      this.cassandras = defaults.cassandras;
    	      this.cloudName = defaults.cloudName;
    	      this.components = defaults.components;
    	      this.diskSpace = defaults.diskSpace;
    	      this.diskSpaceCap = defaults.diskSpaceCap;
    	      this.diskSpaceDefault = defaults.diskSpaceDefault;
    	      this.diskSpaceStep = defaults.diskSpaceStep;
    	      this.diskSpaceUsed = defaults.diskSpaceUsed;
    	      this.id = defaults.id;
    	      this.maintenanceWindowDow = defaults.maintenanceWindowDow;
    	      this.maintenanceWindowTime = defaults.maintenanceWindowTime;
    	      this.plan = defaults.plan;
    	      this.project = defaults.project;
    	      this.projectVpcId = defaults.projectVpcId;
    	      this.serviceHost = defaults.serviceHost;
    	      this.serviceIntegrations = defaults.serviceIntegrations;
    	      this.serviceName = defaults.serviceName;
    	      this.servicePassword = defaults.servicePassword;
    	      this.servicePort = defaults.servicePort;
    	      this.serviceType = defaults.serviceType;
    	      this.serviceUri = defaults.serviceUri;
    	      this.serviceUsername = defaults.serviceUsername;
    	      this.state = defaults.state;
    	      this.staticIps = defaults.staticIps;
    	      this.tags = defaults.tags;
    	      this.terminationProtection = defaults.terminationProtection;
        }

        @CustomType.Setter
        public Builder additionalDiskSpace(String additionalDiskSpace) {
            this.additionalDiskSpace = Objects.requireNonNull(additionalDiskSpace);
            return this;
        }
        @CustomType.Setter
        public Builder cassandraUserConfigs(List<GetCassandraCassandraUserConfig> cassandraUserConfigs) {
            this.cassandraUserConfigs = Objects.requireNonNull(cassandraUserConfigs);
            return this;
        }
        public Builder cassandraUserConfigs(GetCassandraCassandraUserConfig... cassandraUserConfigs) {
            return cassandraUserConfigs(List.of(cassandraUserConfigs));
        }
        @CustomType.Setter
        public Builder cassandras(List<GetCassandraCassandra> cassandras) {
            this.cassandras = Objects.requireNonNull(cassandras);
            return this;
        }
        public Builder cassandras(GetCassandraCassandra... cassandras) {
            return cassandras(List.of(cassandras));
        }
        @CustomType.Setter
        public Builder cloudName(String cloudName) {
            this.cloudName = Objects.requireNonNull(cloudName);
            return this;
        }
        @CustomType.Setter
        public Builder components(List<GetCassandraComponent> components) {
            this.components = Objects.requireNonNull(components);
            return this;
        }
        public Builder components(GetCassandraComponent... components) {
            return components(List.of(components));
        }
        @CustomType.Setter
        public Builder diskSpace(String diskSpace) {
            this.diskSpace = Objects.requireNonNull(diskSpace);
            return this;
        }
        @CustomType.Setter
        public Builder diskSpaceCap(String diskSpaceCap) {
            this.diskSpaceCap = Objects.requireNonNull(diskSpaceCap);
            return this;
        }
        @CustomType.Setter
        public Builder diskSpaceDefault(String diskSpaceDefault) {
            this.diskSpaceDefault = Objects.requireNonNull(diskSpaceDefault);
            return this;
        }
        @CustomType.Setter
        public Builder diskSpaceStep(String diskSpaceStep) {
            this.diskSpaceStep = Objects.requireNonNull(diskSpaceStep);
            return this;
        }
        @CustomType.Setter
        public Builder diskSpaceUsed(String diskSpaceUsed) {
            this.diskSpaceUsed = Objects.requireNonNull(diskSpaceUsed);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder maintenanceWindowDow(String maintenanceWindowDow) {
            this.maintenanceWindowDow = Objects.requireNonNull(maintenanceWindowDow);
            return this;
        }
        @CustomType.Setter
        public Builder maintenanceWindowTime(String maintenanceWindowTime) {
            this.maintenanceWindowTime = Objects.requireNonNull(maintenanceWindowTime);
            return this;
        }
        @CustomType.Setter
        public Builder plan(String plan) {
            this.plan = Objects.requireNonNull(plan);
            return this;
        }
        @CustomType.Setter
        public Builder project(String project) {
            this.project = Objects.requireNonNull(project);
            return this;
        }
        @CustomType.Setter
        public Builder projectVpcId(String projectVpcId) {
            this.projectVpcId = Objects.requireNonNull(projectVpcId);
            return this;
        }
        @CustomType.Setter
        public Builder serviceHost(String serviceHost) {
            this.serviceHost = Objects.requireNonNull(serviceHost);
            return this;
        }
        @CustomType.Setter
        public Builder serviceIntegrations(List<GetCassandraServiceIntegration> serviceIntegrations) {
            this.serviceIntegrations = Objects.requireNonNull(serviceIntegrations);
            return this;
        }
        public Builder serviceIntegrations(GetCassandraServiceIntegration... serviceIntegrations) {
            return serviceIntegrations(List.of(serviceIntegrations));
        }
        @CustomType.Setter
        public Builder serviceName(String serviceName) {
            this.serviceName = Objects.requireNonNull(serviceName);
            return this;
        }
        @CustomType.Setter
        public Builder servicePassword(String servicePassword) {
            this.servicePassword = Objects.requireNonNull(servicePassword);
            return this;
        }
        @CustomType.Setter
        public Builder servicePort(Integer servicePort) {
            this.servicePort = Objects.requireNonNull(servicePort);
            return this;
        }
        @CustomType.Setter
        public Builder serviceType(String serviceType) {
            this.serviceType = Objects.requireNonNull(serviceType);
            return this;
        }
        @CustomType.Setter
        public Builder serviceUri(String serviceUri) {
            this.serviceUri = Objects.requireNonNull(serviceUri);
            return this;
        }
        @CustomType.Setter
        public Builder serviceUsername(String serviceUsername) {
            this.serviceUsername = Objects.requireNonNull(serviceUsername);
            return this;
        }
        @CustomType.Setter
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        @CustomType.Setter
        public Builder staticIps(List<String> staticIps) {
            this.staticIps = Objects.requireNonNull(staticIps);
            return this;
        }
        public Builder staticIps(String... staticIps) {
            return staticIps(List.of(staticIps));
        }
        @CustomType.Setter
        public Builder tags(List<GetCassandraTag> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        public Builder tags(GetCassandraTag... tags) {
            return tags(List.of(tags));
        }
        @CustomType.Setter
        public Builder terminationProtection(Boolean terminationProtection) {
            this.terminationProtection = Objects.requireNonNull(terminationProtection);
            return this;
        }
        public GetCassandraResult build() {
            final var o = new GetCassandraResult();
            o.additionalDiskSpace = additionalDiskSpace;
            o.cassandraUserConfigs = cassandraUserConfigs;
            o.cassandras = cassandras;
            o.cloudName = cloudName;
            o.components = components;
            o.diskSpace = diskSpace;
            o.diskSpaceCap = diskSpaceCap;
            o.diskSpaceDefault = diskSpaceDefault;
            o.diskSpaceStep = diskSpaceStep;
            o.diskSpaceUsed = diskSpaceUsed;
            o.id = id;
            o.maintenanceWindowDow = maintenanceWindowDow;
            o.maintenanceWindowTime = maintenanceWindowTime;
            o.plan = plan;
            o.project = project;
            o.projectVpcId = projectVpcId;
            o.serviceHost = serviceHost;
            o.serviceIntegrations = serviceIntegrations;
            o.serviceName = serviceName;
            o.servicePassword = servicePassword;
            o.servicePort = servicePort;
            o.serviceType = serviceType;
            o.serviceUri = serviceUri;
            o.serviceUsername = serviceUsername;
            o.state = state;
            o.staticIps = staticIps;
            o.tags = tags;
            o.terminationProtection = terminationProtection;
            return o;
        }
    }
}