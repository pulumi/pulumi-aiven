// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aiven.Inputs
{

    public sealed class RedisServiceIntegrationGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Type of the service integration. The possible value is `read_replica`.
        /// </summary>
        [Input("integrationType", required: true)]
        public Input<string> IntegrationType { get; set; } = null!;

        /// <summary>
        /// Name of the source service
        /// </summary>
        [Input("sourceServiceName", required: true)]
        public Input<string> SourceServiceName { get; set; } = null!;

        public RedisServiceIntegrationGetArgs()
        {
        }
        public static new RedisServiceIntegrationGetArgs Empty => new RedisServiceIntegrationGetArgs();
    }
}
