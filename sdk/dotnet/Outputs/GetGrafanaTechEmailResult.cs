// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aiven.Outputs
{

    [OutputType]
    public sealed class GetGrafanaTechEmailResult
    {
        /// <summary>
        /// An email address to contact for technical issues
        /// </summary>
        public readonly string Email;

        [OutputConstructor]
        private GetGrafanaTechEmailResult(string email)
        {
            Email = email;
        }
    }
}
