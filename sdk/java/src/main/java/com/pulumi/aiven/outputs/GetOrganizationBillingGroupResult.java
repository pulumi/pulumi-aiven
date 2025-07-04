// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aiven.outputs;

import com.pulumi.aiven.outputs.GetOrganizationBillingGroupTimeouts;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetOrganizationBillingGroupResult {
    /**
     * @return Billing address ID.
     * 
     */
    private String billingAddressId;
    /**
     * @return List of billing contact emails.
     * 
     */
    private List<String> billingContactEmails;
    /**
     * @return List of billing contact emails.
     * 
     */
    private List<String> billingEmails;
    /**
     * @return Billing group ID.
     * 
     */
    private String billingGroupId;
    /**
     * @return Billing Group Name.
     * 
     */
    private String billingGroupName;
    /**
     * @return Acceptable currencies for a billing group. The possible values are `AUD`, `CAD`, `CHF`, `DKK`, `EUR`, `GBP`, `JPY`, `NOK`, `NZD`, `SEK`, `SGD` and `USD`.
     * 
     */
    private String currency;
    /**
     * @return Extra billing text.
     * 
     */
    private String customInvoiceText;
    /**
     * @return Resource ID, a composite of `organization_id` and `billing_group_id` IDs.
     * 
     */
    private String id;
    /**
     * @return ID of an organization.
     * 
     */
    private String organizationId;
    /**
     * @return Payment method ID.
     * 
     */
    private String paymentMethodId;
    /**
     * @return Shipping address ID.
     * 
     */
    private String shippingAddressId;
    private @Nullable GetOrganizationBillingGroupTimeouts timeouts;
    /**
     * @return VAT ID.
     * 
     */
    private String vatId;

    private GetOrganizationBillingGroupResult() {}
    /**
     * @return Billing address ID.
     * 
     */
    public String billingAddressId() {
        return this.billingAddressId;
    }
    /**
     * @return List of billing contact emails.
     * 
     */
    public List<String> billingContactEmails() {
        return this.billingContactEmails;
    }
    /**
     * @return List of billing contact emails.
     * 
     */
    public List<String> billingEmails() {
        return this.billingEmails;
    }
    /**
     * @return Billing group ID.
     * 
     */
    public String billingGroupId() {
        return this.billingGroupId;
    }
    /**
     * @return Billing Group Name.
     * 
     */
    public String billingGroupName() {
        return this.billingGroupName;
    }
    /**
     * @return Acceptable currencies for a billing group. The possible values are `AUD`, `CAD`, `CHF`, `DKK`, `EUR`, `GBP`, `JPY`, `NOK`, `NZD`, `SEK`, `SGD` and `USD`.
     * 
     */
    public String currency() {
        return this.currency;
    }
    /**
     * @return Extra billing text.
     * 
     */
    public String customInvoiceText() {
        return this.customInvoiceText;
    }
    /**
     * @return Resource ID, a composite of `organization_id` and `billing_group_id` IDs.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return ID of an organization.
     * 
     */
    public String organizationId() {
        return this.organizationId;
    }
    /**
     * @return Payment method ID.
     * 
     */
    public String paymentMethodId() {
        return this.paymentMethodId;
    }
    /**
     * @return Shipping address ID.
     * 
     */
    public String shippingAddressId() {
        return this.shippingAddressId;
    }
    public Optional<GetOrganizationBillingGroupTimeouts> timeouts() {
        return Optional.ofNullable(this.timeouts);
    }
    /**
     * @return VAT ID.
     * 
     */
    public String vatId() {
        return this.vatId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetOrganizationBillingGroupResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String billingAddressId;
        private List<String> billingContactEmails;
        private List<String> billingEmails;
        private String billingGroupId;
        private String billingGroupName;
        private String currency;
        private String customInvoiceText;
        private String id;
        private String organizationId;
        private String paymentMethodId;
        private String shippingAddressId;
        private @Nullable GetOrganizationBillingGroupTimeouts timeouts;
        private String vatId;
        public Builder() {}
        public Builder(GetOrganizationBillingGroupResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.billingAddressId = defaults.billingAddressId;
    	      this.billingContactEmails = defaults.billingContactEmails;
    	      this.billingEmails = defaults.billingEmails;
    	      this.billingGroupId = defaults.billingGroupId;
    	      this.billingGroupName = defaults.billingGroupName;
    	      this.currency = defaults.currency;
    	      this.customInvoiceText = defaults.customInvoiceText;
    	      this.id = defaults.id;
    	      this.organizationId = defaults.organizationId;
    	      this.paymentMethodId = defaults.paymentMethodId;
    	      this.shippingAddressId = defaults.shippingAddressId;
    	      this.timeouts = defaults.timeouts;
    	      this.vatId = defaults.vatId;
        }

        @CustomType.Setter
        public Builder billingAddressId(String billingAddressId) {
            if (billingAddressId == null) {
              throw new MissingRequiredPropertyException("GetOrganizationBillingGroupResult", "billingAddressId");
            }
            this.billingAddressId = billingAddressId;
            return this;
        }
        @CustomType.Setter
        public Builder billingContactEmails(List<String> billingContactEmails) {
            if (billingContactEmails == null) {
              throw new MissingRequiredPropertyException("GetOrganizationBillingGroupResult", "billingContactEmails");
            }
            this.billingContactEmails = billingContactEmails;
            return this;
        }
        public Builder billingContactEmails(String... billingContactEmails) {
            return billingContactEmails(List.of(billingContactEmails));
        }
        @CustomType.Setter
        public Builder billingEmails(List<String> billingEmails) {
            if (billingEmails == null) {
              throw new MissingRequiredPropertyException("GetOrganizationBillingGroupResult", "billingEmails");
            }
            this.billingEmails = billingEmails;
            return this;
        }
        public Builder billingEmails(String... billingEmails) {
            return billingEmails(List.of(billingEmails));
        }
        @CustomType.Setter
        public Builder billingGroupId(String billingGroupId) {
            if (billingGroupId == null) {
              throw new MissingRequiredPropertyException("GetOrganizationBillingGroupResult", "billingGroupId");
            }
            this.billingGroupId = billingGroupId;
            return this;
        }
        @CustomType.Setter
        public Builder billingGroupName(String billingGroupName) {
            if (billingGroupName == null) {
              throw new MissingRequiredPropertyException("GetOrganizationBillingGroupResult", "billingGroupName");
            }
            this.billingGroupName = billingGroupName;
            return this;
        }
        @CustomType.Setter
        public Builder currency(String currency) {
            if (currency == null) {
              throw new MissingRequiredPropertyException("GetOrganizationBillingGroupResult", "currency");
            }
            this.currency = currency;
            return this;
        }
        @CustomType.Setter
        public Builder customInvoiceText(String customInvoiceText) {
            if (customInvoiceText == null) {
              throw new MissingRequiredPropertyException("GetOrganizationBillingGroupResult", "customInvoiceText");
            }
            this.customInvoiceText = customInvoiceText;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetOrganizationBillingGroupResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder organizationId(String organizationId) {
            if (organizationId == null) {
              throw new MissingRequiredPropertyException("GetOrganizationBillingGroupResult", "organizationId");
            }
            this.organizationId = organizationId;
            return this;
        }
        @CustomType.Setter
        public Builder paymentMethodId(String paymentMethodId) {
            if (paymentMethodId == null) {
              throw new MissingRequiredPropertyException("GetOrganizationBillingGroupResult", "paymentMethodId");
            }
            this.paymentMethodId = paymentMethodId;
            return this;
        }
        @CustomType.Setter
        public Builder shippingAddressId(String shippingAddressId) {
            if (shippingAddressId == null) {
              throw new MissingRequiredPropertyException("GetOrganizationBillingGroupResult", "shippingAddressId");
            }
            this.shippingAddressId = shippingAddressId;
            return this;
        }
        @CustomType.Setter
        public Builder timeouts(@Nullable GetOrganizationBillingGroupTimeouts timeouts) {

            this.timeouts = timeouts;
            return this;
        }
        @CustomType.Setter
        public Builder vatId(String vatId) {
            if (vatId == null) {
              throw new MissingRequiredPropertyException("GetOrganizationBillingGroupResult", "vatId");
            }
            this.vatId = vatId;
            return this;
        }
        public GetOrganizationBillingGroupResult build() {
            final var _resultValue = new GetOrganizationBillingGroupResult();
            _resultValue.billingAddressId = billingAddressId;
            _resultValue.billingContactEmails = billingContactEmails;
            _resultValue.billingEmails = billingEmails;
            _resultValue.billingGroupId = billingGroupId;
            _resultValue.billingGroupName = billingGroupName;
            _resultValue.currency = currency;
            _resultValue.customInvoiceText = customInvoiceText;
            _resultValue.id = id;
            _resultValue.organizationId = organizationId;
            _resultValue.paymentMethodId = paymentMethodId;
            _resultValue.shippingAddressId = shippingAddressId;
            _resultValue.timeouts = timeouts;
            _resultValue.vatId = vatId;
            return _resultValue;
        }
    }
}
