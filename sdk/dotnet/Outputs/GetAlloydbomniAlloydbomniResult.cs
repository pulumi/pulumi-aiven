// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aiven.Outputs
{

    [OutputType]
    public sealed class GetAlloydbomniAlloydbomniResult
    {
        /// <summary>
        /// PgBouncer connection details for [connection pooling](https://aiven.io/docs/products/postgresql/concepts/pg-connection-pooling).
        /// </summary>
        public readonly string Bouncer;
        /// <summary>
        /// Primary AlloyDB Omni database name.
        /// </summary>
        public readonly string Dbname;
        /// <summary>
        /// AlloyDB Omni primary node host IP or name.
        /// </summary>
        public readonly string Host;
        /// <summary>
        /// The [number of allowed connections](https://aiven.io/docs/products/postgresql/reference/pg-connection-limits). Varies based on the service plan.
        /// </summary>
        public readonly int MaxConnections;
        /// <summary>
        /// AlloyDB Omni connection parameters.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetAlloydbomniAlloydbomniParamResult> Params;
        /// <summary>
        /// AlloyDB Omni admin user password.
        /// </summary>
        public readonly string Password;
        /// <summary>
        /// AlloyDB Omni port.
        /// </summary>
        public readonly int Port;
        /// <summary>
        /// AlloyDB Omni replica URI for services with a replica.
        /// </summary>
        public readonly string ReplicaUri;
        /// <summary>
        /// AlloyDB Omni SSL mode setting.
        /// </summary>
        public readonly string Sslmode;
        /// <summary>
        /// AlloyDB Omni standby connection URIs.
        /// </summary>
        public readonly ImmutableArray<string> StandbyUris;
        /// <summary>
        /// AlloyDB Omni syncing connection URIs.
        /// </summary>
        public readonly ImmutableArray<string> SyncingUris;
        /// <summary>
        /// AlloyDB Omni primary connection URI.
        /// </summary>
        public readonly string Uri;
        /// <summary>
        /// AlloyDB Omni primary connection URIs.
        /// </summary>
        public readonly ImmutableArray<string> Uris;
        /// <summary>
        /// AlloyDB Omni admin user name.
        /// </summary>
        public readonly string User;

        [OutputConstructor]
        private GetAlloydbomniAlloydbomniResult(
            string bouncer,

            string dbname,

            string host,

            int maxConnections,

            ImmutableArray<Outputs.GetAlloydbomniAlloydbomniParamResult> @params,

            string password,

            int port,

            string replicaUri,

            string sslmode,

            ImmutableArray<string> standbyUris,

            ImmutableArray<string> syncingUris,

            string uri,

            ImmutableArray<string> uris,

            string user)
        {
            Bouncer = bouncer;
            Dbname = dbname;
            Host = host;
            MaxConnections = maxConnections;
            Params = @params;
            Password = password;
            Port = port;
            ReplicaUri = replicaUri;
            Sslmode = sslmode;
            StandbyUris = standbyUris;
            SyncingUris = syncingUris;
            Uri = uri;
            Uris = uris;
            User = user;
        }
    }
}
