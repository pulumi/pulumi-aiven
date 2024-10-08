// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aiven.Inputs
{

    public sealed class ThanosThanosUserConfigArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// ThanosCompactor
        /// </summary>
        [Input("compactor")]
        public Input<Inputs.ThanosThanosUserConfigCompactorArgs>? Compactor { get; set; }

        [Input("env")]
        private InputMap<string>? _env;

        /// <summary>
        /// Environmental variables.
        /// </summary>
        public InputMap<string> Env
        {
            get => _env ?? (_env = new InputMap<string>());
            set => _env = value;
        }

        [Input("ipFilterObjects")]
        private InputList<Inputs.ThanosThanosUserConfigIpFilterObjectArgs>? _ipFilterObjects;

        /// <summary>
        /// Allow incoming connections from CIDR address block, e.g. `10.20.0.0/16`
        /// </summary>
        public InputList<Inputs.ThanosThanosUserConfigIpFilterObjectArgs> IpFilterObjects
        {
            get => _ipFilterObjects ?? (_ipFilterObjects = new InputList<Inputs.ThanosThanosUserConfigIpFilterObjectArgs>());
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
        /// After exceeding the limit a service alert is going to be raised (0 means not set).
        /// </summary>
        [Input("objectStorageUsageAlertThresholdGb")]
        public Input<int>? ObjectStorageUsageAlertThresholdGb { get; set; }

        /// <summary>
        /// Allow access to selected service ports from the public Internet
        /// </summary>
        [Input("publicAccess")]
        public Input<Inputs.ThanosThanosUserConfigPublicAccessArgs>? PublicAccess { get; set; }

        /// <summary>
        /// ThanosQuery
        /// </summary>
        [Input("query")]
        public Input<Inputs.ThanosThanosUserConfigQueryArgs>? Query { get; set; }

        /// <summary>
        /// ThanosQueryFrontend
        /// </summary>
        [Input("queryFrontend")]
        public Input<Inputs.ThanosThanosUserConfigQueryFrontendArgs>? QueryFrontend { get; set; }

        /// <summary>
        /// Store logs for the service so that they are available in the HTTP API and console.
        /// </summary>
        [Input("serviceLog")]
        public Input<bool>? ServiceLog { get; set; }

        /// <summary>
        /// Use static public IP addresses.
        /// </summary>
        [Input("staticIps")]
        public Input<bool>? StaticIps { get; set; }

        public ThanosThanosUserConfigArgs()
        {
        }
        public static new ThanosThanosUserConfigArgs Empty => new ThanosThanosUserConfigArgs();
    }
}
