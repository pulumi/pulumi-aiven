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
    public sealed class GetM3DbM3dbUserConfigM3Result
    {
        /// <summary>
        /// M3 Tag Options
        /// </summary>
        public readonly Outputs.GetM3DbM3dbUserConfigM3TagOptionsResult? TagOptions;

        [OutputConstructor]
        private GetM3DbM3dbUserConfigM3Result(Outputs.GetM3DbM3dbUserConfigM3TagOptionsResult? tagOptions)
        {
            TagOptions = tagOptions;
        }
    }
}