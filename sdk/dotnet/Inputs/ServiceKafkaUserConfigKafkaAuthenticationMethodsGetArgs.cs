// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aiven.Inputs
{

    public sealed class ServiceKafkaUserConfigKafkaAuthenticationMethodsGetArgs : Pulumi.ResourceArgs
    {
        [Input("certificate")]
        public Input<bool>? Certificate { get; set; }

        [Input("sasl")]
        public Input<bool>? Sasl { get; set; }

        public ServiceKafkaUserConfigKafkaAuthenticationMethodsGetArgs()
        {
        }
    }
}