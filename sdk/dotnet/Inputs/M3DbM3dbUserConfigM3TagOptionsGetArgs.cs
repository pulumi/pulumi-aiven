// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aiven.Inputs
{

    public sealed class M3DbM3dbUserConfigM3TagOptionsGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("allowTagNameDuplicates")]
        public Input<bool>? AllowTagNameDuplicates { get; set; }

        [Input("allowTagValueEmpty")]
        public Input<bool>? AllowTagValueEmpty { get; set; }

        public M3DbM3dbUserConfigM3TagOptionsGetArgs()
        {
        }
        public static new M3DbM3dbUserConfigM3TagOptionsGetArgs Empty => new M3DbM3dbUserConfigM3TagOptionsGetArgs();
    }
}