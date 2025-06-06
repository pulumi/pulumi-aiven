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
    public sealed class KafkaKafkaUserConfigTieredStorageLocalCache
    {
        /// <summary>
        /// Local cache size in bytes. Example: `1073741824`.
        /// </summary>
        public readonly int? Size;

        [OutputConstructor]
        private KafkaKafkaUserConfigTieredStorageLocalCache(int? size)
        {
            Size = size;
        }
    }
}
