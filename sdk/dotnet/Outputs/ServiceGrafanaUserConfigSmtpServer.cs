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
    public sealed class ServiceGrafanaUserConfigSmtpServer
    {
        public readonly string? FromAddress;
        public readonly string? FromName;
        public readonly string? Host;
        public readonly string? Password;
        public readonly int? Port;
        public readonly string? SkipVerify;
        public readonly string? Username;

        [OutputConstructor]
        private ServiceGrafanaUserConfigSmtpServer(
            string? fromAddress,

            string? fromName,

            string? host,

            string? password,

            int? port,

            string? skipVerify,

            string? username)
        {
            FromAddress = fromAddress;
            FromName = fromName;
            Host = host;
            Password = password;
            Port = port;
            SkipVerify = skipVerify;
            Username = username;
        }
    }
}