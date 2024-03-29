// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aiven.Inputs
{

    public sealed class PgPgUserConfigPgbouncerArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// If the automatically created database pools have been unused this many seconds, they are freed. If 0 then timeout is disabled. (seconds). The default value is `3600`.
        /// </summary>
        [Input("autodbIdleTimeout")]
        public Input<int>? AutodbIdleTimeout { get; set; }

        /// <summary>
        /// Do not allow more than this many server connections per database (regardless of user). Setting it to 0 means unlimited.
        /// </summary>
        [Input("autodbMaxDbConnections")]
        public Input<int>? AutodbMaxDbConnections { get; set; }

        /// <summary>
        /// PGBouncer pool mode. The default value is `transaction`.
        /// </summary>
        [Input("autodbPoolMode")]
        public Input<string>? AutodbPoolMode { get; set; }

        /// <summary>
        /// If non-zero then create automatically a pool of that size per user when a pool doesn't exist. The default value is `0`.
        /// </summary>
        [Input("autodbPoolSize")]
        public Input<int>? AutodbPoolSize { get; set; }

        [Input("ignoreStartupParameters")]
        private InputList<string>? _ignoreStartupParameters;

        /// <summary>
        /// List of parameters to ignore when given in startup packet.
        /// </summary>
        public InputList<string> IgnoreStartupParameters
        {
            get => _ignoreStartupParameters ?? (_ignoreStartupParameters = new InputList<string>());
            set => _ignoreStartupParameters = value;
        }

        /// <summary>
        /// Add more server connections to pool if below this number. Improves behavior when usual load comes suddenly back after period of total inactivity. The value is effectively capped at the pool size. The default value is `0`.
        /// </summary>
        [Input("minPoolSize")]
        public Input<int>? MinPoolSize { get; set; }

        /// <summary>
        /// If a server connection has been idle more than this many seconds it will be dropped. If 0 then timeout is disabled. (seconds). The default value is `600`.
        /// </summary>
        [Input("serverIdleTimeout")]
        public Input<int>? ServerIdleTimeout { get; set; }

        /// <summary>
        /// The pooler will close an unused server connection that has been connected longer than this. (seconds). The default value is `3600`.
        /// </summary>
        [Input("serverLifetime")]
        public Input<int>? ServerLifetime { get; set; }

        /// <summary>
        /// Run server*reset*query (DISCARD ALL) in all pooling modes. The default value is `false`.
        /// </summary>
        [Input("serverResetQueryAlways")]
        public Input<bool>? ServerResetQueryAlways { get; set; }

        public PgPgUserConfigPgbouncerArgs()
        {
        }
        public static new PgPgUserConfigPgbouncerArgs Empty => new PgPgUserConfigPgbouncerArgs();
    }
}
