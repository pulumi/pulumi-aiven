// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aiven.Inputs
{

    public sealed class ServiceIntegrationDatadogUserConfigDatadogTagGetArgs : Pulumi.ResourceArgs
    {
        [Input("comment")]
        public Input<string>? Comment { get; set; }

        [Input("tag")]
        public Input<string>? Tag { get; set; }

        public ServiceIntegrationDatadogUserConfigDatadogTagGetArgs()
        {
        }
    }
}