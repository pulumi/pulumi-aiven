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
    public sealed class M3DbM3dbUserConfigM3
    {
        /// <summary>
        /// M3 Tag Options
        /// </summary>
        public readonly Outputs.M3DbM3dbUserConfigM3TagOptions? TagOptions;

        [OutputConstructor]
        private M3DbM3dbUserConfigM3(Outputs.M3DbM3dbUserConfigM3TagOptions? tagOptions)
        {
            TagOptions = tagOptions;
        }
    }
}
