// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aiven.Inputs
{

    public sealed class ServiceIntegrationEndpointExternalClickhouseUserConfigGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Hostname or IP address of the server. Example: `my.server.com`.
        /// </summary>
        [Input("host", required: true)]
        public Input<string> Host { get; set; } = null!;

        [Input("password", required: true)]
        private Input<string>? _password;

        /// <summary>
        /// Password. Example: `jjKk45Nnd`.
        /// </summary>
        public Input<string>? Password
        {
            get => _password;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _password = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// Secure TCP server port. Example: `9440`.
        /// </summary>
        [Input("port", required: true)]
        public Input<int> Port { get; set; } = null!;

        /// <summary>
        /// User name. Example: `default`.
        /// </summary>
        [Input("username", required: true)]
        public Input<string> Username { get; set; } = null!;

        public ServiceIntegrationEndpointExternalClickhouseUserConfigGetArgs()
        {
        }
        public static new ServiceIntegrationEndpointExternalClickhouseUserConfigGetArgs Empty => new ServiceIntegrationEndpointExternalClickhouseUserConfigGetArgs();
    }
}
