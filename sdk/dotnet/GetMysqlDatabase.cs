// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aiven
{
    public static class GetMysqlDatabase
    {
        /// <summary>
        /// The MySQL Database data source provides information about the existing Aiven MySQL Database.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using Pulumi;
        /// using Aiven = Pulumi.Aiven;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var mydatabase = Aiven.GetMysqlDatabase.Invoke(new()
        ///     {
        ///         Project = aiven_project.Myproject.Project,
        ///         ServiceName = aiven_mysql.Mymysql.Service_name,
        ///         DatabaseName = "&lt;DATABASE_NAME&gt;",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetMysqlDatabaseResult> InvokeAsync(GetMysqlDatabaseArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetMysqlDatabaseResult>("aiven:index/getMysqlDatabase:getMysqlDatabase", args ?? new GetMysqlDatabaseArgs(), options.WithDefaults());

        /// <summary>
        /// The MySQL Database data source provides information about the existing Aiven MySQL Database.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using Pulumi;
        /// using Aiven = Pulumi.Aiven;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var mydatabase = Aiven.GetMysqlDatabase.Invoke(new()
        ///     {
        ///         Project = aiven_project.Myproject.Project,
        ///         ServiceName = aiven_mysql.Mymysql.Service_name,
        ///         DatabaseName = "&lt;DATABASE_NAME&gt;",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetMysqlDatabaseResult> Invoke(GetMysqlDatabaseInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetMysqlDatabaseResult>("aiven:index/getMysqlDatabase:getMysqlDatabase", args ?? new GetMysqlDatabaseInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetMysqlDatabaseArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The name of the service database. This property cannot be changed, doing so forces recreation of the resource.
        /// </summary>
        [Input("databaseName", required: true)]
        public string DatabaseName { get; set; } = null!;

        /// <summary>
        /// Identifies the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. This property cannot be changed, doing so forces recreation of the resource.
        /// </summary>
        [Input("project", required: true)]
        public string Project { get; set; } = null!;

        /// <summary>
        /// Specifies the name of the service that this resource belongs to. To set up proper dependencies please refer to this variable as a reference. This property cannot be changed, doing so forces recreation of the resource.
        /// </summary>
        [Input("serviceName", required: true)]
        public string ServiceName { get; set; } = null!;

        public GetMysqlDatabaseArgs()
        {
        }
        public static new GetMysqlDatabaseArgs Empty => new GetMysqlDatabaseArgs();
    }

    public sealed class GetMysqlDatabaseInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The name of the service database. This property cannot be changed, doing so forces recreation of the resource.
        /// </summary>
        [Input("databaseName", required: true)]
        public Input<string> DatabaseName { get; set; } = null!;

        /// <summary>
        /// Identifies the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. This property cannot be changed, doing so forces recreation of the resource.
        /// </summary>
        [Input("project", required: true)]
        public Input<string> Project { get; set; } = null!;

        /// <summary>
        /// Specifies the name of the service that this resource belongs to. To set up proper dependencies please refer to this variable as a reference. This property cannot be changed, doing so forces recreation of the resource.
        /// </summary>
        [Input("serviceName", required: true)]
        public Input<string> ServiceName { get; set; } = null!;

        public GetMysqlDatabaseInvokeArgs()
        {
        }
        public static new GetMysqlDatabaseInvokeArgs Empty => new GetMysqlDatabaseInvokeArgs();
    }


    [OutputType]
    public sealed class GetMysqlDatabaseResult
    {
        /// <summary>
        /// The name of the service database. This property cannot be changed, doing so forces recreation of the resource.
        /// </summary>
        public readonly string DatabaseName;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Identifies the project this resource belongs to. To set up proper dependencies please refer to this variable as a reference. This property cannot be changed, doing so forces recreation of the resource.
        /// </summary>
        public readonly string Project;
        /// <summary>
        /// Specifies the name of the service that this resource belongs to. To set up proper dependencies please refer to this variable as a reference. This property cannot be changed, doing so forces recreation of the resource.
        /// </summary>
        public readonly string ServiceName;
        public readonly bool TerminationProtection;

        [OutputConstructor]
        private GetMysqlDatabaseResult(
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