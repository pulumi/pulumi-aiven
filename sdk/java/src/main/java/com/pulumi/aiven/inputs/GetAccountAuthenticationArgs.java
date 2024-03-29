// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aiven.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetAccountAuthenticationArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAccountAuthenticationArgs Empty = new GetAccountAuthenticationArgs();

    /**
     * The unique id of the account.
     * 
     */
    @Import(name="accountId", required=true)
    private Output<String> accountId;

    /**
     * @return The unique id of the account.
     * 
     */
    public Output<String> accountId() {
        return this.accountId;
    }

    /**
     * The name of the account authentication.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name of the account authentication.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    private GetAccountAuthenticationArgs() {}

    private GetAccountAuthenticationArgs(GetAccountAuthenticationArgs $) {
        this.accountId = $.accountId;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAccountAuthenticationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAccountAuthenticationArgs $;

        public Builder() {
            $ = new GetAccountAuthenticationArgs();
        }

        public Builder(GetAccountAuthenticationArgs defaults) {
            $ = new GetAccountAuthenticationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId The unique id of the account.
         * 
         * @return builder
         * 
         */
        public Builder accountId(Output<String> accountId) {
            $.accountId = accountId;
            return this;
        }

        /**
         * @param accountId The unique id of the account.
         * 
         * @return builder
         * 
         */
        public Builder accountId(String accountId) {
            return accountId(Output.of(accountId));
        }

        /**
         * @param name The name of the account authentication.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the account authentication.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public GetAccountAuthenticationArgs build() {
            if ($.accountId == null) {
                throw new MissingRequiredPropertyException("GetAccountAuthenticationArgs", "accountId");
            }
            if ($.name == null) {
                throw new MissingRequiredPropertyException("GetAccountAuthenticationArgs", "name");
            }
            return $;
        }
    }

}
