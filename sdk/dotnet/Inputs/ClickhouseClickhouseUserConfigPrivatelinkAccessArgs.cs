// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aiven.Inputs
{

    public sealed class ClickhouseClickhouseUserConfigPrivatelinkAccessArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Clickhouse server provided values
        /// </summary>
        [Input("clickhouse")]
        public Input<bool>? Clickhouse { get; set; }

        [Input("clickhouseHttps")]
        public Input<bool>? ClickhouseHttps { get; set; }

        [Input("prometheus")]
        public Input<bool>? Prometheus { get; set; }

        public ClickhouseClickhouseUserConfigPrivatelinkAccessArgs()
        {
        }
        public static new ClickhouseClickhouseUserConfigPrivatelinkAccessArgs Empty => new ClickhouseClickhouseUserConfigPrivatelinkAccessArgs();
    }
}