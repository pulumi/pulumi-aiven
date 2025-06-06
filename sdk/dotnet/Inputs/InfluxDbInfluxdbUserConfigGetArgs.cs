// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aiven.Inputs
{

    public sealed class InfluxDbInfluxdbUserConfigGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Additional Cloud Regions for Backup Replication.
        /// </summary>
        [Input("additionalBackupRegions")]
        public Input<string>? AdditionalBackupRegions { get; set; }

        /// <summary>
        /// Serve the web frontend using a custom CNAME pointing to the Aiven DNS name. Example: `grafana.example.org`.
        /// </summary>
        [Input("customDomain")]
        public Input<string>? CustomDomain { get; set; }

        /// <summary>
        /// influxdb.conf configuration values
        /// </summary>
        [Input("influxdb")]
        public Input<Inputs.InfluxDbInfluxdbUserConfigInfluxdbGetArgs>? Influxdb { get; set; }

        /// <summary>
        /// Enum: `1.8`, and newer. InfluxDB major version. Default: `1.8`.
        /// </summary>
        [Input("influxdbVersion")]
        public Input<string>? InfluxdbVersion { get; set; }

        [Input("ipFilterObjects")]
        private InputList<Inputs.InfluxDbInfluxdbUserConfigIpFilterObjectGetArgs>? _ipFilterObjects;

        /// <summary>
        /// Allow incoming connections from CIDR address block, e.g. `10.20.0.0/16`
        /// </summary>
        public InputList<Inputs.InfluxDbInfluxdbUserConfigIpFilterObjectGetArgs> IpFilterObjects
        {
            get => _ipFilterObjects ?? (_ipFilterObjects = new InputList<Inputs.InfluxDbInfluxdbUserConfigIpFilterObjectGetArgs>());
            set => _ipFilterObjects = value;
        }

        [Input("ipFilterStrings")]
        private InputList<string>? _ipFilterStrings;

        /// <summary>
        /// Allow incoming connections from CIDR address block, e.g. `10.20.0.0/16`.
        /// </summary>
        public InputList<string> IpFilterStrings
        {
            get => _ipFilterStrings ?? (_ipFilterStrings = new InputList<string>());
            set => _ipFilterStrings = value;
        }

        [Input("ipFilters")]
        private InputList<string>? _ipFilters;

        /// <summary>
        /// Allow incoming connections from CIDR address block, e.g. `10.20.0.0/16`.
        /// </summary>
        [Obsolete(@"Deprecated. Use `ip_filter_string` instead.")]
        public InputList<string> IpFilters
        {
            get => _ipFilters ?? (_ipFilters = new InputList<string>());
            set => _ipFilters = value;
        }

        /// <summary>
        /// Allow access to selected service ports from private networks
        /// </summary>
        [Input("privateAccess")]
        public Input<Inputs.InfluxDbInfluxdbUserConfigPrivateAccessGetArgs>? PrivateAccess { get; set; }

        /// <summary>
        /// Allow access to selected service components through Privatelink
        /// </summary>
        [Input("privatelinkAccess")]
        public Input<Inputs.InfluxDbInfluxdbUserConfigPrivatelinkAccessGetArgs>? PrivatelinkAccess { get; set; }

        /// <summary>
        /// Name of another project to fork a service from. This has effect only when a new service is being created. Example: `anotherprojectname`.
        /// </summary>
        [Input("projectToForkFrom")]
        public Input<string>? ProjectToForkFrom { get; set; }

        /// <summary>
        /// Allow access to selected service ports from the public Internet
        /// </summary>
        [Input("publicAccess")]
        public Input<Inputs.InfluxDbInfluxdbUserConfigPublicAccessGetArgs>? PublicAccess { get; set; }

        /// <summary>
        /// Name of the basebackup to restore in forked service. Example: `backup-20191112t091354293891z`.
        /// </summary>
        [Input("recoveryBasebackupName")]
        public Input<string>? RecoveryBasebackupName { get; set; }

        /// <summary>
        /// Store logs for the service so that they are available in the HTTP API and console.
        /// </summary>
        [Input("serviceLog")]
        public Input<bool>? ServiceLog { get; set; }

        /// <summary>
        /// Name of another service to fork from. This has effect only when a new service is being created. Example: `anotherservicename`.
        /// </summary>
        [Input("serviceToForkFrom")]
        public Input<string>? ServiceToForkFrom { get; set; }

        /// <summary>
        /// Use static public IP addresses.
        /// </summary>
        [Input("staticIps")]
        public Input<bool>? StaticIps { get; set; }

        public InfluxDbInfluxdbUserConfigGetArgs()
        {
        }
        public static new InfluxDbInfluxdbUserConfigGetArgs Empty => new InfluxDbInfluxdbUserConfigGetArgs();
    }
}
