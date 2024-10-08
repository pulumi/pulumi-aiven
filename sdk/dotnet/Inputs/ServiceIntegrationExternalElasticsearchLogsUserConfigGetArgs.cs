// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aiven.Inputs
{

    public sealed class ServiceIntegrationExternalElasticsearchLogsUserConfigGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("selectedLogFields")]
        private InputList<string>? _selectedLogFields;

        /// <summary>
        /// The list of logging fields that will be sent to the integration logging service. The MESSAGE and timestamp fields are always sent.
        /// </summary>
        public InputList<string> SelectedLogFields
        {
            get => _selectedLogFields ?? (_selectedLogFields = new InputList<string>());
            set => _selectedLogFields = value;
        }

        public ServiceIntegrationExternalElasticsearchLogsUserConfigGetArgs()
        {
        }
        public static new ServiceIntegrationExternalElasticsearchLogsUserConfigGetArgs Empty => new ServiceIntegrationExternalElasticsearchLogsUserConfigGetArgs();
    }
}
