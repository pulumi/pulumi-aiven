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
    public sealed class GetPgPgUserConfigMigrationResult
    {
        public readonly string? Dbname;
        public readonly string? Host;
        public readonly string? Password;
        public readonly string? Port;
        public readonly string? Ssl;
        public readonly string? Username;

        [OutputConstructor]
        private GetPgPgUserConfigMigrationResult(
            string? dbname,

            string? host,

            string? password,

            string? port,

            string? ssl,

            string? username)
        {
            Dbname = dbname;
            Host = host;
            Password = password;
            Port = port;
            Ssl = ssl;
            Username = username;
        }
    }
}