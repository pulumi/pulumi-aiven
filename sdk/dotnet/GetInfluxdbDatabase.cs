// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aiven
{
    public static class GetInfluxdbDatabase
    {
        public static Task<GetInfluxdbDatabaseResult> InvokeAsync(GetInfluxdbDatabaseArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetInfluxdbDatabaseResult>("aiven:index/getInfluxdbDatabase:getInfluxdbDatabase", args ?? new GetInfluxdbDatabaseArgs(), options.WithDefaults());

        public static Output<GetInfluxdbDatabaseResult> Invoke(GetInfluxdbDatabaseInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetInfluxdbDatabaseResult>("aiven:index/getInfluxdbDatabase:getInfluxdbDatabase", args ?? new GetInfluxdbDatabaseInvokeArgs(), options.WithDefaults());

        public static Output<GetInfluxdbDatabaseResult> Invoke(GetInfluxdbDatabaseInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetInfluxdbDatabaseResult>("aiven:index/getInfluxdbDatabase:getInfluxdbDatabase", args ?? new GetInfluxdbDatabaseInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetInfluxdbDatabaseArgs : global::Pulumi.InvokeArgs
    {
        [Input("databaseName", required: true)]
        public string DatabaseName { get; set; } = null!;

        [Input("project", required: true)]
        public string Project { get; set; } = null!;

        [Input("serviceName", required: true)]
        public string ServiceName { get; set; } = null!;

        public GetInfluxdbDatabaseArgs()
        {
        }
        public static new GetInfluxdbDatabaseArgs Empty => new GetInfluxdbDatabaseArgs();
    }

    public sealed class GetInfluxdbDatabaseInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("databaseName", required: true)]
        public Input<string> DatabaseName { get; set; } = null!;

        [Input("project", required: true)]
        public Input<string> Project { get; set; } = null!;

        [Input("serviceName", required: true)]
        public Input<string> ServiceName { get; set; } = null!;

        public GetInfluxdbDatabaseInvokeArgs()
        {
        }
        public static new GetInfluxdbDatabaseInvokeArgs Empty => new GetInfluxdbDatabaseInvokeArgs();
    }


    [OutputType]
    public sealed class GetInfluxdbDatabaseResult
    {
        public readonly string DatabaseName;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string Project;
        public readonly string ServiceName;
        public readonly bool TerminationProtection;

        [OutputConstructor]
        private GetInfluxdbDatabaseResult(
            string databaseName,

            string id,

            string project,

            string serviceName,

            bool terminationProtection)
        {
            DatabaseName = databaseName;
            Id = id;
            Project = project;
            ServiceName = serviceName;
            TerminationProtection = terminationProtection;
        }
    }
}
