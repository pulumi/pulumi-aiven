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
    public sealed class GetKafkaKafkaUserConfigKafkaSaslMechanismsResult
    {
        /// <summary>
        /// Enable PLAIN mechanism. Default: `true`.
        /// </summary>
        public readonly bool? Plain;
        /// <summary>
        /// Enable SCRAM-SHA-256 mechanism. Default: `true`.
        /// </summary>
        public readonly bool? ScramSha256;
        /// <summary>
        /// Enable SCRAM-SHA-512 mechanism. Default: `true`.
        /// </summary>
        public readonly bool? ScramSha512;

        [OutputConstructor]
        private GetKafkaKafkaUserConfigKafkaSaslMechanismsResult(
            bool? plain,

            bool? scramSha256,

            bool? scramSha512)
        {
            Plain = plain;
            ScramSha256 = scramSha256;
            ScramSha512 = scramSha512;
        }
    }
}