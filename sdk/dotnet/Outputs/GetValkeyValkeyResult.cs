// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aiven.Outputs
{

    [OutputType]
    public sealed class GetValkeyValkeyResult
    {
        /// <summary>
        /// Valkey password.
        /// </summary>
        public readonly string Password;
        /// <summary>
        /// Valkey replica server URI.
        /// </summary>
        public readonly string ReplicaUri;
        /// <summary>
        /// Valkey slave server URIs.
        /// </summary>
        public readonly ImmutableArray<string> SlaveUris;
        /// <summary>
        /// Valkey server URIs.
        /// </summary>
        public readonly ImmutableArray<string> Uris;

        [OutputConstructor]
        private GetValkeyValkeyResult(
            string password,

            string replicaUri,

            ImmutableArray<string> slaveUris,

            ImmutableArray<string> uris)
        {
            Password = password;
            ReplicaUri = replicaUri;
            SlaveUris = slaveUris;
            Uris = uris;
        }
    }
}