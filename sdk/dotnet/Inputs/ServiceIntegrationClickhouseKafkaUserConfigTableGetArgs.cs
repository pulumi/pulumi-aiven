// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aiven.Inputs
{

    public sealed class ServiceIntegrationClickhouseKafkaUserConfigTableGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("columns")]
        private InputList<Inputs.ServiceIntegrationClickhouseKafkaUserConfigTableColumnGetArgs>? _columns;
        public InputList<Inputs.ServiceIntegrationClickhouseKafkaUserConfigTableColumnGetArgs> Columns
        {
            get => _columns ?? (_columns = new InputList<Inputs.ServiceIntegrationClickhouseKafkaUserConfigTableColumnGetArgs>());
            set => _columns = value;
        }

        [Input("dataFormat")]
        public Input<string>? DataFormat { get; set; }

        [Input("groupName")]
        public Input<string>? GroupName { get; set; }

        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("topics")]
        private InputList<Inputs.ServiceIntegrationClickhouseKafkaUserConfigTableTopicGetArgs>? _topics;
        public InputList<Inputs.ServiceIntegrationClickhouseKafkaUserConfigTableTopicGetArgs> Topics
        {
            get => _topics ?? (_topics = new InputList<Inputs.ServiceIntegrationClickhouseKafkaUserConfigTableTopicGetArgs>());
            set => _topics = value;
        }

        public ServiceIntegrationClickhouseKafkaUserConfigTableGetArgs()
        {
        }
        public static new ServiceIntegrationClickhouseKafkaUserConfigTableGetArgs Empty => new ServiceIntegrationClickhouseKafkaUserConfigTableGetArgs();
    }
}