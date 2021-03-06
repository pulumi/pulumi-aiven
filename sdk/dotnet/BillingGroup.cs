// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aiven
{
    /// <summary>
    /// ## # Billing Group Resource
    /// 
    /// The Billing Group resource allows the creation and management of Aiven Billing Groups and association with the Projects.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using Pulumi;
    /// using Aiven = Pulumi.Aiven;
    /// 
    /// class MyStack : Stack
    /// {
    ///     public MyStack()
    ///     {
    ///         var bybg1 = new Aiven.BillingGroup("bybg1", new Aiven.BillingGroupArgs
    ///         {
    ///             BillingCurrency = "USD",
    ///             VatId = "123ABC",
    ///         });
    ///         var pr1 = new Aiven.Project("pr1", new Aiven.ProjectArgs
    ///         {
    ///             Project = "pr1",
    ///             BillingGroup = bybg1.Id,
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// </summary>
    [AivenResourceType("aiven:index/billingGroup:BillingGroup")]
    public partial class BillingGroup : Pulumi.CustomResource
    {
        /// <summary>
        /// Account id
        /// </summary>
        [Output("accountId")]
        public Output<string?> AccountId { get; private set; } = null!;

        /// <summary>
        /// Address lines
        /// </summary>
        [Output("addressLines")]
        public Output<ImmutableArray<string>> AddressLines { get; private set; } = null!;

        /// <summary>
        /// Billing currency
        /// </summary>
        [Output("billingCurrency")]
        public Output<string?> BillingCurrency { get; private set; } = null!;

        /// <summary>
        /// Billing contact emails
        /// </summary>
        [Output("billingEmails")]
        public Output<ImmutableArray<string>> BillingEmails { get; private set; } = null!;

        /// <summary>
        /// Billing extra text
        /// </summary>
        [Output("billingExtraText")]
        public Output<string?> BillingExtraText { get; private set; } = null!;

        /// <summary>
        /// Credit card id
        /// </summary>
        [Output("cardId")]
        public Output<string?> CardId { get; private set; } = null!;

        /// <summary>
        /// City
        /// </summary>
        [Output("city")]
        public Output<string?> City { get; private set; } = null!;

        /// <summary>
        /// Company name
        /// </summary>
        [Output("company")]
        public Output<string?> Company { get; private set; } = null!;

        /// <summary>
        /// Country code
        /// </summary>
        [Output("countryCode")]
        public Output<string?> CountryCode { get; private set; } = null!;

        /// <summary>
        /// Billing Group name
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// State
        /// </summary>
        [Output("state")]
        public Output<string?> State { get; private set; } = null!;

        /// <summary>
        /// VAT id
        /// </summary>
        [Output("vatId")]
        public Output<string?> VatId { get; private set; } = null!;

        /// <summary>
        /// Zip Code
        /// </summary>
        [Output("zipCode")]
        public Output<string?> ZipCode { get; private set; } = null!;


        /// <summary>
        /// Create a BillingGroup resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public BillingGroup(string name, BillingGroupArgs? args = null, CustomResourceOptions? options = null)
            : base("aiven:index/billingGroup:BillingGroup", name, args ?? new BillingGroupArgs(), MakeResourceOptions(options, ""))
        {
        }

        private BillingGroup(string name, Input<string> id, BillingGroupState? state = null, CustomResourceOptions? options = null)
            : base("aiven:index/billingGroup:BillingGroup", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing BillingGroup resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static BillingGroup Get(string name, Input<string> id, BillingGroupState? state = null, CustomResourceOptions? options = null)
        {
            return new BillingGroup(name, id, state, options);
        }
    }

    public sealed class BillingGroupArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Account id
        /// </summary>
        [Input("accountId")]
        public Input<string>? AccountId { get; set; }

        [Input("addressLines")]
        private InputList<string>? _addressLines;

        /// <summary>
        /// Address lines
        /// </summary>
        public InputList<string> AddressLines
        {
            get => _addressLines ?? (_addressLines = new InputList<string>());
            set => _addressLines = value;
        }

        /// <summary>
        /// Billing currency
        /// </summary>
        [Input("billingCurrency")]
        public Input<string>? BillingCurrency { get; set; }

        [Input("billingEmails")]
        private InputList<string>? _billingEmails;

        /// <summary>
        /// Billing contact emails
        /// </summary>
        public InputList<string> BillingEmails
        {
            get => _billingEmails ?? (_billingEmails = new InputList<string>());
            set => _billingEmails = value;
        }

        /// <summary>
        /// Billing extra text
        /// </summary>
        [Input("billingExtraText")]
        public Input<string>? BillingExtraText { get; set; }

        /// <summary>
        /// Credit card id
        /// </summary>
        [Input("cardId")]
        public Input<string>? CardId { get; set; }

        /// <summary>
        /// City
        /// </summary>
        [Input("city")]
        public Input<string>? City { get; set; }

        /// <summary>
        /// Company name
        /// </summary>
        [Input("company")]
        public Input<string>? Company { get; set; }

        /// <summary>
        /// Country code
        /// </summary>
        [Input("countryCode")]
        public Input<string>? CountryCode { get; set; }

        /// <summary>
        /// Billing Group name
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// State
        /// </summary>
        [Input("state")]
        public Input<string>? State { get; set; }

        /// <summary>
        /// VAT id
        /// </summary>
        [Input("vatId")]
        public Input<string>? VatId { get; set; }

        /// <summary>
        /// Zip Code
        /// </summary>
        [Input("zipCode")]
        public Input<string>? ZipCode { get; set; }

        public BillingGroupArgs()
        {
        }
    }

    public sealed class BillingGroupState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Account id
        /// </summary>
        [Input("accountId")]
        public Input<string>? AccountId { get; set; }

        [Input("addressLines")]
        private InputList<string>? _addressLines;

        /// <summary>
        /// Address lines
        /// </summary>
        public InputList<string> AddressLines
        {
            get => _addressLines ?? (_addressLines = new InputList<string>());
            set => _addressLines = value;
        }

        /// <summary>
        /// Billing currency
        /// </summary>
        [Input("billingCurrency")]
        public Input<string>? BillingCurrency { get; set; }

        [Input("billingEmails")]
        private InputList<string>? _billingEmails;

        /// <summary>
        /// Billing contact emails
        /// </summary>
        public InputList<string> BillingEmails
        {
            get => _billingEmails ?? (_billingEmails = new InputList<string>());
            set => _billingEmails = value;
        }

        /// <summary>
        /// Billing extra text
        /// </summary>
        [Input("billingExtraText")]
        public Input<string>? BillingExtraText { get; set; }

        /// <summary>
        /// Credit card id
        /// </summary>
        [Input("cardId")]
        public Input<string>? CardId { get; set; }

        /// <summary>
        /// City
        /// </summary>
        [Input("city")]
        public Input<string>? City { get; set; }

        /// <summary>
        /// Company name
        /// </summary>
        [Input("company")]
        public Input<string>? Company { get; set; }

        /// <summary>
        /// Country code
        /// </summary>
        [Input("countryCode")]
        public Input<string>? CountryCode { get; set; }

        /// <summary>
        /// Billing Group name
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// State
        /// </summary>
        [Input("state")]
        public Input<string>? State { get; set; }

        /// <summary>
        /// VAT id
        /// </summary>
        [Input("vatId")]
        public Input<string>? VatId { get; set; }

        /// <summary>
        /// Zip Code
        /// </summary>
        [Input("zipCode")]
        public Input<string>? ZipCode { get; set; }

        public BillingGroupState()
        {
        }
    }
}
