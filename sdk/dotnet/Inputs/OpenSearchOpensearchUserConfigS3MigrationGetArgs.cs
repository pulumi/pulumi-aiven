// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aiven.Inputs
{

    public sealed class OpenSearchOpensearchUserConfigS3MigrationGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// AWS Access key.
        /// </summary>
        [Input("accessKey", required: true)]
        public Input<string> AccessKey { get; set; } = null!;

        /// <summary>
        /// The path to the repository data within its container. The value of this setting should not start or end with a /.
        /// </summary>
        [Input("basePath", required: true)]
        public Input<string> BasePath { get; set; } = null!;

        /// <summary>
        /// S3 bucket name.
        /// </summary>
        [Input("bucket", required: true)]
        public Input<string> Bucket { get; set; } = null!;

        /// <summary>
        /// Big files can be broken down into chunks during snapshotting if needed. Should be the same as for the 3rd party repository.
        /// </summary>
        [Input("chunkSize")]
        public Input<string>? ChunkSize { get; set; }

        /// <summary>
        /// When set to true metadata files are stored in compressed format.
        /// </summary>
        [Input("compress")]
        public Input<bool>? Compress { get; set; }

        /// <summary>
        /// The S3 service endpoint to connect to. If you are using an S3-compatible service then you should set this to the service’s endpoint.
        /// </summary>
        [Input("endpoint")]
        public Input<string>? Endpoint { get; set; }

        /// <summary>
        /// Whether to restore aliases alongside their associated indexes. Default is true.
        /// </summary>
        [Input("includeAliases")]
        public Input<bool>? IncludeAliases { get; set; }

        /// <summary>
        /// A comma-delimited list of indices to restore from the snapshot. Multi-index syntax is supported. Example: `metrics*,logs*,data-20240823`.
        /// </summary>
        [Input("indices", required: true)]
        public Input<string> Indices { get; set; } = null!;

        /// <summary>
        /// Whether the repository is read-only. Default: `true`.
        /// </summary>
        [Input("readonly")]
        public Input<bool>? Readonly { get; set; }

        /// <summary>
        /// S3 region.
        /// </summary>
        [Input("region", required: true)]
        public Input<string> Region { get; set; } = null!;

        /// <summary>
        /// If true, restore the cluster state. Defaults to false.
        /// </summary>
        [Input("restoreGlobalState")]
        public Input<bool>? RestoreGlobalState { get; set; }

        [Input("secretKey", required: true)]
        private Input<string>? _secretKey;

        /// <summary>
        /// AWS secret key.
        /// </summary>
        public Input<string>? SecretKey
        {
            get => _secretKey;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _secretKey = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// When set to true files are encrypted on server side.
        /// </summary>
        [Input("serverSideEncryption")]
        public Input<bool>? ServerSideEncryption { get; set; }

        /// <summary>
        /// The snapshot name to restore from.
        /// </summary>
        [Input("snapshotName", required: true)]
        public Input<string> SnapshotName { get; set; } = null!;

        public OpenSearchOpensearchUserConfigS3MigrationGetArgs()
        {
        }
        public static new OpenSearchOpensearchUserConfigS3MigrationGetArgs Empty => new OpenSearchOpensearchUserConfigS3MigrationGetArgs();
    }
}
