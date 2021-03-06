// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aiven.Inputs
{

    public sealed class ServiceMysqlUserConfigArgs : Pulumi.ResourceArgs
    {
        [Input("adminPassword")]
        public Input<string>? AdminPassword { get; set; }

        [Input("adminUsername")]
        public Input<string>? AdminUsername { get; set; }

        [Input("backupHour")]
        public Input<string>? BackupHour { get; set; }

        [Input("backupMinute")]
        public Input<string>? BackupMinute { get; set; }

        [Input("binlogRetentionPeriod")]
        public Input<string>? BinlogRetentionPeriod { get; set; }

        [Input("ipFilters")]
        private InputList<string>? _ipFilters;
        public InputList<string> IpFilters
        {
            get => _ipFilters ?? (_ipFilters = new InputList<string>());
            set => _ipFilters = value;
        }

        [Input("migration")]
        public Input<Inputs.ServiceMysqlUserConfigMigrationArgs>? Migration { get; set; }

        [Input("mysql")]
        public Input<Inputs.ServiceMysqlUserConfigMysqlArgs>? Mysql { get; set; }

        [Input("mysqlVersion")]
        public Input<string>? MysqlVersion { get; set; }

        [Input("privateAccess")]
        public Input<Inputs.ServiceMysqlUserConfigPrivateAccessArgs>? PrivateAccess { get; set; }

        [Input("privatelinkAccess")]
        public Input<Inputs.ServiceMysqlUserConfigPrivatelinkAccessArgs>? PrivatelinkAccess { get; set; }

        [Input("projectToForkFrom")]
        public Input<string>? ProjectToForkFrom { get; set; }

        [Input("publicAccess")]
        public Input<Inputs.ServiceMysqlUserConfigPublicAccessArgs>? PublicAccess { get; set; }

        [Input("recoveryTargetTime")]
        public Input<string>? RecoveryTargetTime { get; set; }

        [Input("serviceToForkFrom")]
        public Input<string>? ServiceToForkFrom { get; set; }

        public ServiceMysqlUserConfigArgs()
        {
        }
    }
}
