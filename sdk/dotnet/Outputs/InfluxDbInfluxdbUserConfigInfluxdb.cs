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
    public sealed class InfluxDbInfluxdbUserConfigInfluxdb
    {
        /// <summary>
        /// The maximum duration in seconds before a query is 
        /// logged as a slow query. Setting this to 0 (the default) will never log slow queries.
        /// </summary>
        public readonly string? LogQueriesAfter;
        /// <summary>
        /// The maximum number of rows returned in a non-chunked query. 
        /// Setting this to 0 (the default) allows an unlimited number to be returned.
        /// </summary>
        public readonly string? MaxRowLimit;
        /// <summary>
        /// The maximum number of `GROUP BY time()` buckets that 
        /// can be processed in a query. Setting this to 0 (the default) allows an unlimited number to
        /// be processed.
        /// </summary>
        public readonly string? MaxSelectBuckets;
        /// <summary>
        /// The maximum number of points that can be processed in a 
        /// SELECT statement. Setting this to 0 (the default) allows an unlimited number to be processed.
        /// </summary>
        public readonly string? MaxSelectPoint;
        /// <summary>
        /// The maximum duration in seconds before a query is killed. 
        /// Setting this to 0 (the default) will never kill slow queries.
        /// </summary>
        public readonly string? QueryTimeout;

        [OutputConstructor]
        private InfluxDbInfluxdbUserConfigInfluxdb(
            string? logQueriesAfter,

            string? maxRowLimit,

            string? maxSelectBuckets,

            string? maxSelectPoint,

            string? queryTimeout)
        {
            LogQueriesAfter = logQueriesAfter;
            MaxRowLimit = maxRowLimit;
            MaxSelectBuckets = maxSelectBuckets;
            MaxSelectPoint = maxSelectPoint;
            QueryTimeout = queryTimeout;
        }
    }
}