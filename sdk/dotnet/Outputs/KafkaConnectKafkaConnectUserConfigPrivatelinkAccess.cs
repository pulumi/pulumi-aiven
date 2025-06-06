// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aiven.Outputs
{

    [OutputType]
    public sealed class KafkaConnectKafkaConnectUserConfigPrivatelinkAccess
    {
        /// <summary>
        /// Enable jolokia.
        /// </summary>
        public readonly bool? Jolokia;
        /// <summary>
        /// Enable kafka_connect.
        /// </summary>
        public readonly bool? KafkaConnect;
        /// <summary>
        /// Enable prometheus.
        /// </summary>
        public readonly bool? Prometheus;

        [OutputConstructor]
        private KafkaConnectKafkaConnectUserConfigPrivatelinkAccess(
            bool? jolokia,

            bool? kafkaConnect,

            bool? prometheus)
        {
            Jolokia = jolokia;
            KafkaConnect = kafkaConnect;
            Prometheus = prometheus;
        }
    }
}
