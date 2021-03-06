// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aiven.Inputs
{

    public sealed class KafkaConnectorTaskGetArgs : Pulumi.ResourceArgs
    {
        [Input("connector")]
        public Input<string>? Connector { get; set; }

        /// <summary>
        /// List of tasks of a connector, each element contains `connector` 
        /// (Related connector name) and `task` (Task id / number).
        /// </summary>
        [Input("task")]
        public Input<int>? Task { get; set; }

        public KafkaConnectorTaskGetArgs()
        {
        }
    }
}
