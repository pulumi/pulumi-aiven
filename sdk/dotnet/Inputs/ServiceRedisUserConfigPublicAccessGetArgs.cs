// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aiven.Inputs
{

    public sealed class ServiceRedisUserConfigPublicAccessGetArgs : Pulumi.ResourceArgs
    {
        [Input("prometheus")]
        public Input<string>? Prometheus { get; set; }

        [Input("redis")]
        public Input<string>? Redis { get; set; }

        public ServiceRedisUserConfigPublicAccessGetArgs()
        {
        }
    }
}
