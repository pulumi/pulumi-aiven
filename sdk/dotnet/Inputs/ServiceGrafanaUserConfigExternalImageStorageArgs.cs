// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aiven.Inputs
{

    public sealed class ServiceGrafanaUserConfigExternalImageStorageArgs : Pulumi.ResourceArgs
    {
        [Input("accessKey")]
        public Input<string>? AccessKey { get; set; }

        [Input("bucketUrl")]
        public Input<string>? BucketUrl { get; set; }

        [Input("provider")]
        public Input<string>? Provider { get; set; }

        [Input("secretKey")]
        public Input<string>? SecretKey { get; set; }

        public ServiceGrafanaUserConfigExternalImageStorageArgs()
        {
        }
    }
}
