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
    public sealed class GetKafkaMirrorMakerKafkaMirrormakerUserConfigKafkaMirrormakerResult
    {
        public readonly string? RefreshGroupsEnabled;
        public readonly string? RefreshGroupsIntervalSeconds;
        public readonly string? RefreshTopicsEnabled;
        public readonly string? RefreshTopicsIntervalSeconds;

        [OutputConstructor]
        private GetKafkaMirrorMakerKafkaMirrormakerUserConfigKafkaMirrormakerResult(
            string? refreshGroupsEnabled,

            string? refreshGroupsIntervalSeconds,

            string? refreshTopicsEnabled,

            string? refreshTopicsIntervalSeconds)
        {
            RefreshGroupsEnabled = refreshGroupsEnabled;
            RefreshGroupsIntervalSeconds = refreshGroupsIntervalSeconds;
            RefreshTopicsEnabled = refreshTopicsEnabled;
            RefreshTopicsIntervalSeconds = refreshTopicsIntervalSeconds;
        }
    }
}