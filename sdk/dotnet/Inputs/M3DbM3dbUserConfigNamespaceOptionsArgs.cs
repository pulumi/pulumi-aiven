// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aiven.Inputs
{

    public sealed class M3DbM3dbUserConfigNamespaceOptionsArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Retention options
        /// </summary>
        [Input("retentionOptions", required: true)]
        public Input<Inputs.M3DbM3dbUserConfigNamespaceOptionsRetentionOptionsArgs> RetentionOptions { get; set; } = null!;

        /// <summary>
        /// Controls whether M3DB will create snapshot files for this namespace.
        /// </summary>
        [Input("snapshotEnabled")]
        public Input<bool>? SnapshotEnabled { get; set; }

        /// <summary>
        /// Controls whether M3DB will include writes to this namespace in the commitlog.
        /// </summary>
        [Input("writesToCommitlog")]
        public Input<bool>? WritesToCommitlog { get; set; }

        public M3DbM3dbUserConfigNamespaceOptionsArgs()
        {
        }
        public static new M3DbM3dbUserConfigNamespaceOptionsArgs Empty => new M3DbM3dbUserConfigNamespaceOptionsArgs();
    }
}
