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
    public sealed class ServiceIntegrationMetricsUserConfigSourceMysql
    {
        /// <summary>
        /// Configuration options for Telegraf MySQL input plugin
        /// </summary>
        public readonly Outputs.ServiceIntegrationMetricsUserConfigSourceMysqlTelegraf? Telegraf;

        [OutputConstructor]
        private ServiceIntegrationMetricsUserConfigSourceMysql(Outputs.ServiceIntegrationMetricsUserConfigSourceMysqlTelegraf? telegraf)
        {
            Telegraf = telegraf;
        }
    }
}