// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aiven.Inputs
{

    public sealed class ServiceIntegrationPrometheusUserConfigArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Configuration options for metrics where source service is MySQL
        /// </summary>
        [Input("sourceMysql")]
        public Input<Inputs.ServiceIntegrationPrometheusUserConfigSourceMysqlArgs>? SourceMysql { get; set; }

        public ServiceIntegrationPrometheusUserConfigArgs()
        {
        }
        public static new ServiceIntegrationPrometheusUserConfigArgs Empty => new ServiceIntegrationPrometheusUserConfigArgs();
    }
}