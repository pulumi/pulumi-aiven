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
    public sealed class GrafanaGrafanaUserConfigPrivatelinkAccess
    {
        /// <summary>
        /// Enable grafana.
        /// </summary>
        public readonly bool? Grafana;

        [OutputConstructor]
        private GrafanaGrafanaUserConfigPrivatelinkAccess(bool? grafana)
        {
            Grafana = grafana;
        }
    }
}
