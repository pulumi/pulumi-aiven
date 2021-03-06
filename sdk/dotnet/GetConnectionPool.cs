// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aiven
{
    public static class GetConnectionPool
    {
        /// <summary>
        /// ## # Connection Pool Data Source
        /// 
        /// The Connection Pool data source provides information about the existing Aiven Connection Pool.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using Pulumi;
        /// using Aiven = Pulumi.Aiven;
        /// 
        /// class MyStack : Stack
        /// {
        ///     public MyStack()
        ///     {
        ///         var mytestpool = Output.Create(Aiven.GetConnectionPool.InvokeAsync(new Aiven.GetConnectionPoolArgs
        ///         {
        ///             Project = aiven_project.Myproject.Project,
        ///             ServiceName = aiven_service.Myservice.Service_name,
        ///             PoolName = "mypool",
        ///         }));
        ///     }
        /// 
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetConnectionPoolResult> InvokeAsync(GetConnectionPoolArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetConnectionPoolResult>("aiven:index/getConnectionPool:getConnectionPool", args ?? new GetConnectionPoolArgs(), options.WithVersion());
    }


    public sealed class GetConnectionPoolArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// is a computed property that tells the URI for connecting to the pool.
        /// This value cannot be set, only read.
        /// </summary>
        [Input("connectionUri")]
        public string? ConnectionUri { get; set; }

        /// <summary>
        /// is the name of the database the pool connects to. This should be
        /// defined using reference as shown above to set up dependencies correctly.
        /// </summary>
        [Input("databaseName")]
        public string? DatabaseName { get; set; }

        /// <summary>
        /// is the mode the pool operates in (session, transaction, statement).
        /// </summary>
        [Input("poolMode")]
        public string? PoolMode { get; set; }

        /// <summary>
        /// is the name of the pool.
        /// </summary>
        [Input("poolName", required: true)]
        public string PoolName { get; set; } = null!;

        /// <summary>
        /// is the number of connections the pool may create towards the backend
        /// server. This does not affect the number of incoming connections, which is always a much
        /// larger number.
        /// </summary>
        [Input("poolSize")]
        public int? PoolSize { get; set; }

        /// <summary>
        /// and `service_name` - (Required) define the project and service the connection pool
        /// belongs to. They should be defined using reference as shown above to set up dependencies
        /// correctly. These properties cannot be changed once the service is created. Doing so will
        /// result in the connection pool being deleted and new one created instead.
        /// </summary>
        [Input("project", required: true)]
        public string Project { get; set; } = null!;

        [Input("serviceName", required: true)]
        public string ServiceName { get; set; } = null!;

        /// <summary>
        /// is the name of the service user used to connect to the database. This should
        /// be defined using reference as shown above to set up dependencies correctly.
        /// </summary>
        [Input("username")]
        public string? Username { get; set; }

        public GetConnectionPoolArgs()
        {
        }
    }


    [OutputType]
    public sealed class GetConnectionPoolResult
    {
        /// <summary>
        /// is a computed property that tells the URI for connecting to the pool.
        /// This value cannot be set, only read.
        /// </summary>
        public readonly string ConnectionUri;
        /// <summary>
        /// is the name of the database the pool connects to. This should be
        /// defined using reference as shown above to set up dependencies correctly.
        /// </summary>
        public readonly string? DatabaseName;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// is the mode the pool operates in (session, transaction, statement).
        /// </summary>
        public readonly string? PoolMode;
        public readonly string PoolName;
        /// <summary>
        /// is the number of connections the pool may create towards the backend
        /// server. This does not affect the number of incoming connections, which is always a much
        /// larger number.
        /// </summary>
        public readonly int? PoolSize;
        public readonly string Project;
        public readonly string ServiceName;
        /// <summary>
        /// is the name of the service user used to connect to the database. This should
        /// be defined using reference as shown above to set up dependencies correctly.
        /// </summary>
        public readonly string? Username;

        [OutputConstructor]
        private GetConnectionPoolResult(
            string connectionUri,

            string? databaseName,

            string id,

            string? poolMode,

            string poolName,

            int? poolSize,

            string project,

            string serviceName,

            string? username)
        {
            ConnectionUri = connectionUri;
            DatabaseName = databaseName;
            Id = id;
            PoolMode = poolMode;
            PoolName = poolName;
            PoolSize = poolSize;
            Project = project;
            ServiceName = serviceName;
            Username = username;
        }
    }
}
