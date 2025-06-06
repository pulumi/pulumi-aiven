// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aiven.Inputs
{

    public sealed class FlinkJarApplicationApplicationVersionFileInfoGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// sha256 of the file if known.
        /// </summary>
        [Input("fileSha256")]
        public Input<string>? FileSha256 { get; set; }

        /// <summary>
        /// The size of the file in bytes.
        /// </summary>
        [Input("fileSize")]
        public Input<int>? FileSize { get; set; }

        /// <summary>
        /// Indicates whether the uploaded .jar file has been verified by the system and deployment ready. The possible values are `INITIAL`, `READY` and `FAILED`.
        /// </summary>
        [Input("fileStatus")]
        public Input<string>? FileStatus { get; set; }

        /// <summary>
        /// The pre-signed url of the bucket where the .jar file is uploaded. Becomes null when the JarApplicationVersion is ready or failed.
        /// </summary>
        [Input("url")]
        public Input<string>? Url { get; set; }

        /// <summary>
        /// In the case file_status is FAILED, the error code of the failure. The possible values are `1`, `2` and `3`.
        /// </summary>
        [Input("verifyErrorCode")]
        public Input<int>? VerifyErrorCode { get; set; }

        /// <summary>
        /// In the case file_status is FAILED, may contain details about the failure.
        /// </summary>
        [Input("verifyErrorMessage")]
        public Input<string>? VerifyErrorMessage { get; set; }

        public FlinkJarApplicationApplicationVersionFileInfoGetArgs()
        {
        }
        public static new FlinkJarApplicationApplicationVersionFileInfoGetArgs Empty => new FlinkJarApplicationApplicationVersionFileInfoGetArgs();
    }
}
