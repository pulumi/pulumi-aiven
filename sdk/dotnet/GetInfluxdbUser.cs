// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aiven
{
    public static class GetInfluxdbUser
    {
        public static Task<GetInfluxdbUserResult> InvokeAsync(GetInfluxdbUserArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetInfluxdbUserResult>("aiven:index/getInfluxdbUser:getInfluxdbUser", args ?? new GetInfluxdbUserArgs(), options.WithDefaults());

        public static Output<GetInfluxdbUserResult> Invoke(GetInfluxdbUserInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetInfluxdbUserResult>("aiven:index/getInfluxdbUser:getInfluxdbUser", args ?? new GetInfluxdbUserInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetInfluxdbUserArgs : global::Pulumi.InvokeArgs
    {
        [Input("project", required: true)]
        public string Project { get; set; } = null!;

        [Input("serviceName", required: true)]
        public string ServiceName { get; set; } = null!;

        [Input("username", required: true)]
        public string Username { get; set; } = null!;

        public GetInfluxdbUserArgs()
        {
        }
        public static new GetInfluxdbUserArgs Empty => new GetInfluxdbUserArgs();
    }

    public sealed class GetInfluxdbUserInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("project", required: true)]
        public Input<string> Project { get; set; } = null!;

        [Input("serviceName", required: true)]
        public Input<string> ServiceName { get; set; } = null!;

        [Input("username", required: true)]
        public Input<string> Username { get; set; } = null!;

        public GetInfluxdbUserInvokeArgs()
        {
        }
        public static new GetInfluxdbUserInvokeArgs Empty => new GetInfluxdbUserInvokeArgs();
    }


    [OutputType]
    public sealed class GetInfluxdbUserResult
    {
        public readonly string AccessCert;
        public readonly string AccessKey;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string Password;
        public readonly string Project;
        public readonly string ServiceName;
        public readonly string Type;
        public readonly string Username;

        [OutputConstructor]
        private GetInfluxdbUserResult(
            string accessCert,

            string accessKey,

            string id,

            string password,

            string project,

            string serviceName,

            string type,

            string username)
        {
            AccessCert = accessCert;
            AccessKey = accessKey;
            Id = id;
            Password = password;
            Project = project;
            ServiceName = serviceName;
            Type = type;
            Username = username;
        }
    }
}