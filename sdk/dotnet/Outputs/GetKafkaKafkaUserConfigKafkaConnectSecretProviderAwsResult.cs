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
    public sealed class GetKafkaKafkaUserConfigKafkaConnectSecretProviderAwsResult
    {
        /// <summary>
        /// Access key used to authenticate with aws.
        /// </summary>
        public readonly string? AccessKey;
        /// <summary>
        /// Enum: `credentials`. Auth method of the vault secret provider.
        /// </summary>
        public readonly string AuthMethod;
        /// <summary>
        /// Region used to lookup secrets with AWS SecretManager.
        /// </summary>
        public readonly string Region;
        /// <summary>
        /// Secret key used to authenticate with aws.
        /// </summary>
        public readonly string? SecretKey;

        [OutputConstructor]
        private GetKafkaKafkaUserConfigKafkaConnectSecretProviderAwsResult(
            string? accessKey,

            string authMethod,

            string region,

            string? secretKey)
        {
            AccessKey = accessKey;
            AuthMethod = authMethod;
            Region = region;
            SecretKey = secretKey;
        }
    }
}
