// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aiven
{
    /// <summary>
    /// Creates and manages an Aiven for Apache Flink® application version.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Aiven = Pulumi.Aiven;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var exampleApp = new Aiven.FlinkApplication("example_app", new()
    ///     {
    ///         Project = exampleProject.Project,
    ///         ServiceName = "example-flink-service",
    ///         Name = "example-app",
    ///     });
    /// 
    ///     var main = new Aiven.FlinkApplicationVersion("main", new()
    ///     {
    ///         Project = exampleProject.Project,
    ///         ServiceName = exampleFlink.ServiceName,
    ///         ApplicationId = exampleApp.ApplicationId,
    ///         Statement = @"    INSERT INTO kafka_known_pizza SELECT * FROM kafka_pizza WHERE shop LIKE '%Luigis Pizza%'
    /// ",
    ///         Sinks = new[]
    ///         {
    ///             new Aiven.Inputs.FlinkApplicationVersionSinkArgs
    ///             {
    ///                 CreateTable = @"      CREATE TABLE kafka_known_pizza (
    ///         shop STRING,
    ///         name STRING
    ///       ) WITH (
    ///         'connector' = 'kafka',
    ///         'properties.bootstrap.servers' = '',
    ///         'scan.startup.mode' = 'earliest-offset',
    ///         'topic' = 'sink_topic',
    ///         'value.format' = 'json'
    ///       )
    /// ",
    ///                 IntegrationId = flinkToKafka.IntegrationId,
    ///             },
    ///         },
    ///         Sources = new[]
    ///         {
    ///             new Aiven.Inputs.FlinkApplicationVersionSourceArgs
    ///             {
    ///                 CreateTable = @"      CREATE TABLE kafka_pizza (
    ///         shop STRING,
    ///         name STRING
    ///       ) WITH (
    ///         'connector' = 'kafka',
    ///         'properties.bootstrap.servers' = '',
    ///         'scan.startup.mode' = 'earliest-offset',
    ///         'topic' = 'source_topic',
    ///         'value.format' = 'json'
    ///       )
    /// ",
    ///                 IntegrationId = flinkToKafka.IntegrationId,
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// ```sh
    /// $ pulumi import aiven:index/flinkApplicationVersion:FlinkApplicationVersion main PROJECT/SERVICE_NAME/APPLICATION_ID/APPLICATION_VERSION_ID
    /// ```
    /// </summary>
    [AivenResourceType("aiven:index/flinkApplicationVersion:FlinkApplicationVersion")]
    public partial class FlinkApplicationVersion : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Application ID.
        /// </summary>
        [Output("applicationId")]
        public Output<string> ApplicationId { get; private set; } = null!;

        /// <summary>
        /// Application version ID.
        /// </summary>
        [Output("applicationVersionId")]
        public Output<string> ApplicationVersionId { get; private set; } = null!;

        /// <summary>
        /// Application version creation time.
        /// </summary>
        [Output("createdAt")]
        public Output<string> CreatedAt { get; private set; } = null!;

        /// <summary>
        /// The user who created the application.
        /// </summary>
        [Output("createdBy")]
        public Output<string> CreatedBy { get; private set; } = null!;

        /// <summary>
        /// The name of the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
        /// </summary>
        [Output("project")]
        public Output<string> Project { get; private set; } = null!;

        /// <summary>
        /// The name of the service that this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
        /// </summary>
        [Output("serviceName")]
        public Output<string> ServiceName { get; private set; } = null!;

        /// <summary>
        /// The sink table for the application.
        /// </summary>
        [Output("sink")]
        public Output<ImmutableArray<Outputs.FlinkApplicationVersionSink>> Sink { get; private set; } = null!;

        /// <summary>
        /// Application sinks
        /// </summary>
        [Output("sinks")]
        public Output<ImmutableArray<Outputs.FlinkApplicationVersionSink>> Sinks { get; private set; } = null!;

        /// <summary>
        /// The source table for the application.
        /// </summary>
        [Output("source")]
        public Output<ImmutableArray<Outputs.FlinkApplicationVersionSource>> Source { get; private set; } = null!;

        /// <summary>
        /// Application sources
        /// </summary>
        [Output("sources")]
        public Output<ImmutableArray<Outputs.FlinkApplicationVersionSource>> Sources { get; private set; } = null!;

        /// <summary>
        /// Job SQL statement.
        /// </summary>
        [Output("statement")]
        public Output<string> Statement { get; private set; } = null!;

        /// <summary>
        /// Application version number.
        /// </summary>
        [Output("version")]
        public Output<int> Version { get; private set; } = null!;


        /// <summary>
        /// Create a FlinkApplicationVersion resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public FlinkApplicationVersion(string name, FlinkApplicationVersionArgs args, CustomResourceOptions? options = null)
            : base("aiven:index/flinkApplicationVersion:FlinkApplicationVersion", name, args ?? new FlinkApplicationVersionArgs(), MakeResourceOptions(options, ""))
        {
        }

        private FlinkApplicationVersion(string name, Input<string> id, FlinkApplicationVersionState? state = null, CustomResourceOptions? options = null)
            : base("aiven:index/flinkApplicationVersion:FlinkApplicationVersion", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing FlinkApplicationVersion resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static FlinkApplicationVersion Get(string name, Input<string> id, FlinkApplicationVersionState? state = null, CustomResourceOptions? options = null)
        {
            return new FlinkApplicationVersion(name, id, state, options);
        }
    }

    public sealed class FlinkApplicationVersionArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Application ID.
        /// </summary>
        [Input("applicationId", required: true)]
        public Input<string> ApplicationId { get; set; } = null!;

        /// <summary>
        /// The name of the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
        /// </summary>
        [Input("project", required: true)]
        public Input<string> Project { get; set; } = null!;

        /// <summary>
        /// The name of the service that this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
        /// </summary>
        [Input("serviceName", required: true)]
        public Input<string> ServiceName { get; set; } = null!;

        [Input("sink")]
        private InputList<Inputs.FlinkApplicationVersionSinkArgs>? _sink;

        /// <summary>
        /// The sink table for the application.
        /// </summary>
        public InputList<Inputs.FlinkApplicationVersionSinkArgs> Sink
        {
            get => _sink ?? (_sink = new InputList<Inputs.FlinkApplicationVersionSinkArgs>());
            set => _sink = value;
        }

        [Input("sinks")]
        private InputList<Inputs.FlinkApplicationVersionSinkArgs>? _sinks;

        /// <summary>
        /// Application sinks
        /// </summary>
        [Obsolete(@"This field is deprecated and will be removed in the next major release. Use `sink` instead.")]
        public InputList<Inputs.FlinkApplicationVersionSinkArgs> Sinks
        {
            get => _sinks ?? (_sinks = new InputList<Inputs.FlinkApplicationVersionSinkArgs>());
            set => _sinks = value;
        }

        [Input("source")]
        private InputList<Inputs.FlinkApplicationVersionSourceArgs>? _source;

        /// <summary>
        /// The source table for the application.
        /// </summary>
        public InputList<Inputs.FlinkApplicationVersionSourceArgs> Source
        {
            get => _source ?? (_source = new InputList<Inputs.FlinkApplicationVersionSourceArgs>());
            set => _source = value;
        }

        [Input("sources")]
        private InputList<Inputs.FlinkApplicationVersionSourceArgs>? _sources;

        /// <summary>
        /// Application sources
        /// </summary>
        [Obsolete(@"This field is deprecated and will be removed in the next major release. Use `source` instead.")]
        public InputList<Inputs.FlinkApplicationVersionSourceArgs> Sources
        {
            get => _sources ?? (_sources = new InputList<Inputs.FlinkApplicationVersionSourceArgs>());
            set => _sources = value;
        }

        /// <summary>
        /// Job SQL statement.
        /// </summary>
        [Input("statement", required: true)]
        public Input<string> Statement { get; set; } = null!;

        public FlinkApplicationVersionArgs()
        {
        }
        public static new FlinkApplicationVersionArgs Empty => new FlinkApplicationVersionArgs();
    }

    public sealed class FlinkApplicationVersionState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Application ID.
        /// </summary>
        [Input("applicationId")]
        public Input<string>? ApplicationId { get; set; }

        /// <summary>
        /// Application version ID.
        /// </summary>
        [Input("applicationVersionId")]
        public Input<string>? ApplicationVersionId { get; set; }

        /// <summary>
        /// Application version creation time.
        /// </summary>
        [Input("createdAt")]
        public Input<string>? CreatedAt { get; set; }

        /// <summary>
        /// The user who created the application.
        /// </summary>
        [Input("createdBy")]
        public Input<string>? CreatedBy { get; set; }

        /// <summary>
        /// The name of the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
        /// </summary>
        [Input("project")]
        public Input<string>? Project { get; set; }

        /// <summary>
        /// The name of the service that this resource belongs to. To set up proper dependencies please refer to this variable as a reference. Changing this property forces recreation of the resource.
        /// </summary>
        [Input("serviceName")]
        public Input<string>? ServiceName { get; set; }

        [Input("sink")]
        private InputList<Inputs.FlinkApplicationVersionSinkGetArgs>? _sink;

        /// <summary>
        /// The sink table for the application.
        /// </summary>
        public InputList<Inputs.FlinkApplicationVersionSinkGetArgs> Sink
        {
            get => _sink ?? (_sink = new InputList<Inputs.FlinkApplicationVersionSinkGetArgs>());
            set => _sink = value;
        }

        [Input("sinks")]
        private InputList<Inputs.FlinkApplicationVersionSinkGetArgs>? _sinks;

        /// <summary>
        /// Application sinks
        /// </summary>
        [Obsolete(@"This field is deprecated and will be removed in the next major release. Use `sink` instead.")]
        public InputList<Inputs.FlinkApplicationVersionSinkGetArgs> Sinks
        {
            get => _sinks ?? (_sinks = new InputList<Inputs.FlinkApplicationVersionSinkGetArgs>());
            set => _sinks = value;
        }

        [Input("source")]
        private InputList<Inputs.FlinkApplicationVersionSourceGetArgs>? _source;

        /// <summary>
        /// The source table for the application.
        /// </summary>
        public InputList<Inputs.FlinkApplicationVersionSourceGetArgs> Source
        {
            get => _source ?? (_source = new InputList<Inputs.FlinkApplicationVersionSourceGetArgs>());
            set => _source = value;
        }

        [Input("sources")]
        private InputList<Inputs.FlinkApplicationVersionSourceGetArgs>? _sources;

        /// <summary>
        /// Application sources
        /// </summary>
        [Obsolete(@"This field is deprecated and will be removed in the next major release. Use `source` instead.")]
        public InputList<Inputs.FlinkApplicationVersionSourceGetArgs> Sources
        {
            get => _sources ?? (_sources = new InputList<Inputs.FlinkApplicationVersionSourceGetArgs>());
            set => _sources = value;
        }

        /// <summary>
        /// Job SQL statement.
        /// </summary>
        [Input("statement")]
        public Input<string>? Statement { get; set; }

        /// <summary>
        /// Application version number.
        /// </summary>
        [Input("version")]
        public Input<int>? Version { get; set; }

        public FlinkApplicationVersionState()
        {
        }
        public static new FlinkApplicationVersionState Empty => new FlinkApplicationVersionState();
    }
}
