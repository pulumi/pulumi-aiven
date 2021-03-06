// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aiven
{
    /// <summary>
    /// ## # Elasticsearch Resource
    /// 
    /// The Elasticsearch resource allows the creation and management of Aiven Elasticsearch services.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using Pulumi;
    /// using Aiven = Pulumi.Aiven;
    /// 
    /// class MyStack : Stack
    /// {
    ///     public MyStack()
    ///     {
    ///         var es1 = new Aiven.ElasticSearch("es1", new Aiven.ElasticSearchArgs
    ///         {
    ///             Project = data.Aiven_project.Pr1.Project,
    ///             CloudName = "google-europe-west1",
    ///             Plan = "startup-4",
    ///             ServiceName = "my-es1",
    ///             MaintenanceWindowDow = "monday",
    ///             MaintenanceWindowTime = "10:00:00",
    ///             ElasticsearchUserConfig = new Aiven.Inputs.ElasticSearchElasticsearchUserConfigArgs
    ///             {
    ///                 ElasticsearchVersion = "7",
    ///                 Kibana = new Aiven.Inputs.ElasticSearchElasticsearchUserConfigKibanaArgs
    ///                 {
    ///                     Enabled = "true",
    ///                     ElasticsearchRequestTimeout = "30000",
    ///                 },
    ///                 PublicAccess = new Aiven.Inputs.ElasticSearchElasticsearchUserConfigPublicAccessArgs
    ///                 {
    ///                     Elasticsearch = "true",
    ///                     Kibana = "true",
    ///                 },
    ///             },
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// </summary>
    [AivenResourceType("aiven:index/elasticSearch:ElasticSearch")]
    public partial class ElasticSearch : Pulumi.CustomResource
    {
        /// <summary>
        /// defines where the cloud provider and region where the service is hosted
        /// in. This can be changed freely after service is created. Changing the value will trigger
        /// a potentially lengthy migration process for the service. Format is cloud provider name
        /// (`aws`, `azure`, `do` `google`, `upcloud`, etc.), dash, and the cloud provider
        /// specific region name. These are documented on each Cloud provider's own support articles,
        /// like [here for Google](https://cloud.google.com/compute/docs/regions-zones/) and
        /// [here for AWS](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.RegionsAndAvailabilityZones.html).
        /// </summary>
        [Output("cloudName")]
        public Output<string?> CloudName { get; private set; } = null!;

        /// <summary>
        /// Service component information objects
        /// </summary>
        [Output("components")]
        public Output<ImmutableArray<Outputs.ElasticSearchComponent>> Components { get; private set; } = null!;

        /// <summary>
        /// Allow clients to connect to elasticsearch from the public 
        /// internet for service nodes that are in a project VPC or another type of private network.
        /// </summary>
        [Output("elasticsearch")]
        public Output<Outputs.ElasticSearchElasticsearch> Elasticsearch { get; private set; } = null!;

        /// <summary>
        /// defines Elasticsearch specific additional configuration options. 
        /// The following configuration options available:
        /// </summary>
        [Output("elasticsearchUserConfig")]
        public Output<Outputs.ElasticSearchElasticsearchUserConfig?> ElasticsearchUserConfig { get; private set; } = null!;

        /// <summary>
        /// day of week when maintenance operations should be performed. 
        /// On monday, tuesday, wednesday, etc.
        /// </summary>
        [Output("maintenanceWindowDow")]
        public Output<string?> MaintenanceWindowDow { get; private set; } = null!;

        /// <summary>
        /// time of day when maintenance operations should be performed. 
        /// UTC time in HH:mm:ss format.
        /// </summary>
        [Output("maintenanceWindowTime")]
        public Output<string?> MaintenanceWindowTime { get; private set; } = null!;

        /// <summary>
        /// defines what kind of computing resources are allocated for the service. It can
        /// be changed after creation, though there are some restrictions when going to a smaller
        /// plan such as the new plan must have sufficient amount of disk space to store all current
        /// data and switching to a plan with fewer nodes might not be supported. The basic plan
        /// names are `hobbyist`, `startup-x`, `business-x` and `premium-x` where `x` is
        /// (roughly) the amount of memory on each node (also other attributes like number of CPUs
        /// and amount of disk space varies but naming is based on memory). The available options can be seem from the [Aiven pricing page](https://aiven.io/pricing).
        /// </summary>
        [Output("plan")]
        public Output<string?> Plan { get; private set; } = null!;

        /// <summary>
        /// identifies the project the service belongs to. To set up proper dependency
        /// between the project and the service, refer to the project as shown in the above example.
        /// Project cannot be changed later without destroying and re-creating the service.
        /// </summary>
        [Output("project")]
        public Output<string> Project { get; private set; } = null!;

        /// <summary>
        /// optionally specifies the VPC the service should run in. If the value
        /// is not set the service is not run inside a VPC. When set, the value should be given as a
        /// reference as shown above to set up dependencies correctly and the VPC must be in the same
        /// cloud and region as the service itself. Project can be freely moved to and from VPC after
        /// creation but doing so triggers migration to new servers so the operation can take
        /// significant amount of time to complete if the service has a lot of data.
        /// </summary>
        [Output("projectVpcId")]
        public Output<string?> ProjectVpcId { get; private set; } = null!;

        /// <summary>
        /// Elasticsearch hostname.
        /// </summary>
        [Output("serviceHost")]
        public Output<string> ServiceHost { get; private set; } = null!;

        /// <summary>
        /// Service integrations to specify when creating a service. Not applied after initial service creation
        /// </summary>
        [Output("serviceIntegrations")]
        public Output<ImmutableArray<Outputs.ElasticSearchServiceIntegration>> ServiceIntegrations { get; private set; } = null!;

        /// <summary>
        /// specifies the actual name of the service. The name cannot be changed
        /// later without destroying and re-creating the service so name should be picked based on
        /// intended service usage rather than current attributes.
        /// </summary>
        [Output("serviceName")]
        public Output<string> ServiceName { get; private set; } = null!;

        /// <summary>
        /// Password used for connecting to the Elasticsearch service, if applicable.
        /// </summary>
        [Output("servicePassword")]
        public Output<string> ServicePassword { get; private set; } = null!;

        /// <summary>
        /// Elasticsearch port.
        /// </summary>
        [Output("servicePort")]
        public Output<int> ServicePort { get; private set; } = null!;

        /// <summary>
        /// Aiven internal service type code
        /// </summary>
        [Output("serviceType")]
        public Output<string> ServiceType { get; private set; } = null!;

        /// <summary>
        /// URI for connecting to the Elasticsearch service.
        /// </summary>
        [Output("serviceUri")]
        public Output<string> ServiceUri { get; private set; } = null!;

        /// <summary>
        /// Username used for connecting to the Elasticsearch service, if applicable.
        /// </summary>
        [Output("serviceUsername")]
        public Output<string> ServiceUsername { get; private set; } = null!;

        /// <summary>
        /// Service state.
        /// </summary>
        [Output("state")]
        public Output<string> State { get; private set; } = null!;

        /// <summary>
        /// prevents the service from being deleted. It is recommended to
        /// set this to `true` for all production services to prevent unintentional service
        /// deletion. This does not shield against deleting databases or topics but for services
        /// with backups much of the content can at least be restored from backup in case accidental
        /// deletion is done.
        /// </summary>
        [Output("terminationProtection")]
        public Output<bool?> TerminationProtection { get; private set; } = null!;


        /// <summary>
        /// Create a ElasticSearch resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ElasticSearch(string name, ElasticSearchArgs args, CustomResourceOptions? options = null)
            : base("aiven:index/elasticSearch:ElasticSearch", name, args ?? new ElasticSearchArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ElasticSearch(string name, Input<string> id, ElasticSearchState? state = null, CustomResourceOptions? options = null)
            : base("aiven:index/elasticSearch:ElasticSearch", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing ElasticSearch resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ElasticSearch Get(string name, Input<string> id, ElasticSearchState? state = null, CustomResourceOptions? options = null)
        {
            return new ElasticSearch(name, id, state, options);
        }
    }

    public sealed class ElasticSearchArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// defines where the cloud provider and region where the service is hosted
        /// in. This can be changed freely after service is created. Changing the value will trigger
        /// a potentially lengthy migration process for the service. Format is cloud provider name
        /// (`aws`, `azure`, `do` `google`, `upcloud`, etc.), dash, and the cloud provider
        /// specific region name. These are documented on each Cloud provider's own support articles,
        /// like [here for Google](https://cloud.google.com/compute/docs/regions-zones/) and
        /// [here for AWS](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.RegionsAndAvailabilityZones.html).
        /// </summary>
        [Input("cloudName")]
        public Input<string>? CloudName { get; set; }

        /// <summary>
        /// Allow clients to connect to elasticsearch from the public 
        /// internet for service nodes that are in a project VPC or another type of private network.
        /// </summary>
        [Input("elasticsearch")]
        public Input<Inputs.ElasticSearchElasticsearchArgs>? Elasticsearch { get; set; }

        /// <summary>
        /// defines Elasticsearch specific additional configuration options. 
        /// The following configuration options available:
        /// </summary>
        [Input("elasticsearchUserConfig")]
        public Input<Inputs.ElasticSearchElasticsearchUserConfigArgs>? ElasticsearchUserConfig { get; set; }

        /// <summary>
        /// day of week when maintenance operations should be performed. 
        /// On monday, tuesday, wednesday, etc.
        /// </summary>
        [Input("maintenanceWindowDow")]
        public Input<string>? MaintenanceWindowDow { get; set; }

        /// <summary>
        /// time of day when maintenance operations should be performed. 
        /// UTC time in HH:mm:ss format.
        /// </summary>
        [Input("maintenanceWindowTime")]
        public Input<string>? MaintenanceWindowTime { get; set; }

        /// <summary>
        /// defines what kind of computing resources are allocated for the service. It can
        /// be changed after creation, though there are some restrictions when going to a smaller
        /// plan such as the new plan must have sufficient amount of disk space to store all current
        /// data and switching to a plan with fewer nodes might not be supported. The basic plan
        /// names are `hobbyist`, `startup-x`, `business-x` and `premium-x` where `x` is
        /// (roughly) the amount of memory on each node (also other attributes like number of CPUs
        /// and amount of disk space varies but naming is based on memory). The available options can be seem from the [Aiven pricing page](https://aiven.io/pricing).
        /// </summary>
        [Input("plan")]
        public Input<string>? Plan { get; set; }

        /// <summary>
        /// identifies the project the service belongs to. To set up proper dependency
        /// between the project and the service, refer to the project as shown in the above example.
        /// Project cannot be changed later without destroying and re-creating the service.
        /// </summary>
        [Input("project", required: true)]
        public Input<string> Project { get; set; } = null!;

        /// <summary>
        /// optionally specifies the VPC the service should run in. If the value
        /// is not set the service is not run inside a VPC. When set, the value should be given as a
        /// reference as shown above to set up dependencies correctly and the VPC must be in the same
        /// cloud and region as the service itself. Project can be freely moved to and from VPC after
        /// creation but doing so triggers migration to new servers so the operation can take
        /// significant amount of time to complete if the service has a lot of data.
        /// </summary>
        [Input("projectVpcId")]
        public Input<string>? ProjectVpcId { get; set; }

        [Input("serviceIntegrations")]
        private InputList<Inputs.ElasticSearchServiceIntegrationArgs>? _serviceIntegrations;

        /// <summary>
        /// Service integrations to specify when creating a service. Not applied after initial service creation
        /// </summary>
        public InputList<Inputs.ElasticSearchServiceIntegrationArgs> ServiceIntegrations
        {
            get => _serviceIntegrations ?? (_serviceIntegrations = new InputList<Inputs.ElasticSearchServiceIntegrationArgs>());
            set => _serviceIntegrations = value;
        }

        /// <summary>
        /// specifies the actual name of the service. The name cannot be changed
        /// later without destroying and re-creating the service so name should be picked based on
        /// intended service usage rather than current attributes.
        /// </summary>
        [Input("serviceName", required: true)]
        public Input<string> ServiceName { get; set; } = null!;

        /// <summary>
        /// prevents the service from being deleted. It is recommended to
        /// set this to `true` for all production services to prevent unintentional service
        /// deletion. This does not shield against deleting databases or topics but for services
        /// with backups much of the content can at least be restored from backup in case accidental
        /// deletion is done.
        /// </summary>
        [Input("terminationProtection")]
        public Input<bool>? TerminationProtection { get; set; }

        public ElasticSearchArgs()
        {
        }
    }

    public sealed class ElasticSearchState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// defines where the cloud provider and region where the service is hosted
        /// in. This can be changed freely after service is created. Changing the value will trigger
        /// a potentially lengthy migration process for the service. Format is cloud provider name
        /// (`aws`, `azure`, `do` `google`, `upcloud`, etc.), dash, and the cloud provider
        /// specific region name. These are documented on each Cloud provider's own support articles,
        /// like [here for Google](https://cloud.google.com/compute/docs/regions-zones/) and
        /// [here for AWS](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.RegionsAndAvailabilityZones.html).
        /// </summary>
        [Input("cloudName")]
        public Input<string>? CloudName { get; set; }

        [Input("components")]
        private InputList<Inputs.ElasticSearchComponentGetArgs>? _components;

        /// <summary>
        /// Service component information objects
        /// </summary>
        public InputList<Inputs.ElasticSearchComponentGetArgs> Components
        {
            get => _components ?? (_components = new InputList<Inputs.ElasticSearchComponentGetArgs>());
            set => _components = value;
        }

        /// <summary>
        /// Allow clients to connect to elasticsearch from the public 
        /// internet for service nodes that are in a project VPC or another type of private network.
        /// </summary>
        [Input("elasticsearch")]
        public Input<Inputs.ElasticSearchElasticsearchGetArgs>? Elasticsearch { get; set; }

        /// <summary>
        /// defines Elasticsearch specific additional configuration options. 
        /// The following configuration options available:
        /// </summary>
        [Input("elasticsearchUserConfig")]
        public Input<Inputs.ElasticSearchElasticsearchUserConfigGetArgs>? ElasticsearchUserConfig { get; set; }

        /// <summary>
        /// day of week when maintenance operations should be performed. 
        /// On monday, tuesday, wednesday, etc.
        /// </summary>
        [Input("maintenanceWindowDow")]
        public Input<string>? MaintenanceWindowDow { get; set; }

        /// <summary>
        /// time of day when maintenance operations should be performed. 
        /// UTC time in HH:mm:ss format.
        /// </summary>
        [Input("maintenanceWindowTime")]
        public Input<string>? MaintenanceWindowTime { get; set; }

        /// <summary>
        /// defines what kind of computing resources are allocated for the service. It can
        /// be changed after creation, though there are some restrictions when going to a smaller
        /// plan such as the new plan must have sufficient amount of disk space to store all current
        /// data and switching to a plan with fewer nodes might not be supported. The basic plan
        /// names are `hobbyist`, `startup-x`, `business-x` and `premium-x` where `x` is
        /// (roughly) the amount of memory on each node (also other attributes like number of CPUs
        /// and amount of disk space varies but naming is based on memory). The available options can be seem from the [Aiven pricing page](https://aiven.io/pricing).
        /// </summary>
        [Input("plan")]
        public Input<string>? Plan { get; set; }

        /// <summary>
        /// identifies the project the service belongs to. To set up proper dependency
        /// between the project and the service, refer to the project as shown in the above example.
        /// Project cannot be changed later without destroying and re-creating the service.
        /// </summary>
        [Input("project")]
        public Input<string>? Project { get; set; }

        /// <summary>
        /// optionally specifies the VPC the service should run in. If the value
        /// is not set the service is not run inside a VPC. When set, the value should be given as a
        /// reference as shown above to set up dependencies correctly and the VPC must be in the same
        /// cloud and region as the service itself. Project can be freely moved to and from VPC after
        /// creation but doing so triggers migration to new servers so the operation can take
        /// significant amount of time to complete if the service has a lot of data.
        /// </summary>
        [Input("projectVpcId")]
        public Input<string>? ProjectVpcId { get; set; }

        /// <summary>
        /// Elasticsearch hostname.
        /// </summary>
        [Input("serviceHost")]
        public Input<string>? ServiceHost { get; set; }

        [Input("serviceIntegrations")]
        private InputList<Inputs.ElasticSearchServiceIntegrationGetArgs>? _serviceIntegrations;

        /// <summary>
        /// Service integrations to specify when creating a service. Not applied after initial service creation
        /// </summary>
        public InputList<Inputs.ElasticSearchServiceIntegrationGetArgs> ServiceIntegrations
        {
            get => _serviceIntegrations ?? (_serviceIntegrations = new InputList<Inputs.ElasticSearchServiceIntegrationGetArgs>());
            set => _serviceIntegrations = value;
        }

        /// <summary>
        /// specifies the actual name of the service. The name cannot be changed
        /// later without destroying and re-creating the service so name should be picked based on
        /// intended service usage rather than current attributes.
        /// </summary>
        [Input("serviceName")]
        public Input<string>? ServiceName { get; set; }

        /// <summary>
        /// Password used for connecting to the Elasticsearch service, if applicable.
        /// </summary>
        [Input("servicePassword")]
        public Input<string>? ServicePassword { get; set; }

        /// <summary>
        /// Elasticsearch port.
        /// </summary>
        [Input("servicePort")]
        public Input<int>? ServicePort { get; set; }

        /// <summary>
        /// Aiven internal service type code
        /// </summary>
        [Input("serviceType")]
        public Input<string>? ServiceType { get; set; }

        /// <summary>
        /// URI for connecting to the Elasticsearch service.
        /// </summary>
        [Input("serviceUri")]
        public Input<string>? ServiceUri { get; set; }

        /// <summary>
        /// Username used for connecting to the Elasticsearch service, if applicable.
        /// </summary>
        [Input("serviceUsername")]
        public Input<string>? ServiceUsername { get; set; }

        /// <summary>
        /// Service state.
        /// </summary>
        [Input("state")]
        public Input<string>? State { get; set; }

        /// <summary>
        /// prevents the service from being deleted. It is recommended to
        /// set this to `true` for all production services to prevent unintentional service
        /// deletion. This does not shield against deleting databases or topics but for services
        /// with backups much of the content can at least be restored from backup in case accidental
        /// deletion is done.
        /// </summary>
        [Input("terminationProtection")]
        public Input<bool>? TerminationProtection { get; set; }

        public ElasticSearchState()
        {
        }
    }
}
