// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aiven.Inputs
{

    public sealed class ServiceIntegrationClickhousePostgresqlUserConfigArgs : global::Pulumi.ResourceArgs
    {
        [Input("databases")]
        private InputList<Inputs.ServiceIntegrationClickhousePostgresqlUserConfigDatabaseArgs>? _databases;

        /// <summary>
        /// Databases to expose
        /// </summary>
        public InputList<Inputs.ServiceIntegrationClickhousePostgresqlUserConfigDatabaseArgs> Databases
        {
            get => _databases ?? (_databases = new InputList<Inputs.ServiceIntegrationClickhousePostgresqlUserConfigDatabaseArgs>());
            set => _databases = value;
        }

        public ServiceIntegrationClickhousePostgresqlUserConfigArgs()
        {
        }
        public static new ServiceIntegrationClickhousePostgresqlUserConfigArgs Empty => new ServiceIntegrationClickhousePostgresqlUserConfigArgs();
    }
}
