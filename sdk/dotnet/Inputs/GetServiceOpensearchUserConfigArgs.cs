// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aiven.Inputs
{

    public sealed class GetServiceOpensearchUserConfigInputArgs : Pulumi.ResourceArgs
    {
        [Input("customDomain")]
        public Input<string>? CustomDomain { get; set; }

        [Input("disableReplicationFactorAdjustment")]
        public Input<string>? DisableReplicationFactorAdjustment { get; set; }

        [Input("indexPatterns")]
        private InputList<Inputs.GetServiceOpensearchUserConfigIndexPatternInputArgs>? _indexPatterns;
        public InputList<Inputs.GetServiceOpensearchUserConfigIndexPatternInputArgs> IndexPatterns
        {
            get => _indexPatterns ?? (_indexPatterns = new InputList<Inputs.GetServiceOpensearchUserConfigIndexPatternInputArgs>());
            set => _indexPatterns = value;
        }

        [Input("indexTemplate")]
        public Input<Inputs.GetServiceOpensearchUserConfigIndexTemplateInputArgs>? IndexTemplate { get; set; }

        [Input("ipFilters")]
        private InputList<string>? _ipFilters;
        public InputList<string> IpFilters
        {
            get => _ipFilters ?? (_ipFilters = new InputList<string>());
            set => _ipFilters = value;
        }

        [Input("keepIndexRefreshInterval")]
        public Input<string>? KeepIndexRefreshInterval { get; set; }

        [Input("maxIndexCount")]
        public Input<string>? MaxIndexCount { get; set; }

        [Input("opensearch")]
        public Input<Inputs.GetServiceOpensearchUserConfigOpensearchInputArgs>? Opensearch { get; set; }

        [Input("opensearchDashboards")]
        public Input<Inputs.GetServiceOpensearchUserConfigOpensearchDashboardsInputArgs>? OpensearchDashboards { get; set; }

        [Input("opensearchVersion")]
        public Input<string>? OpensearchVersion { get; set; }

        [Input("privateAccess")]
        public Input<Inputs.GetServiceOpensearchUserConfigPrivateAccessInputArgs>? PrivateAccess { get; set; }

        [Input("privatelinkAccess")]
        public Input<Inputs.GetServiceOpensearchUserConfigPrivatelinkAccessInputArgs>? PrivatelinkAccess { get; set; }

        [Input("projectToForkFrom")]
        public Input<string>? ProjectToForkFrom { get; set; }

        [Input("publicAccess")]
        public Input<Inputs.GetServiceOpensearchUserConfigPublicAccessInputArgs>? PublicAccess { get; set; }

        [Input("recoveryBasebackupName")]
        public Input<string>? RecoveryBasebackupName { get; set; }

        [Input("serviceToForkFrom")]
        public Input<string>? ServiceToForkFrom { get; set; }

        [Input("staticIps")]
        public Input<string>? StaticIps { get; set; }

        public GetServiceOpensearchUserConfigInputArgs()
        {
        }
    }
}