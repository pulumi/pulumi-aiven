// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aiven.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetAccountAuthenticationPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAccountAuthenticationPlainArgs Empty = new GetAccountAuthenticationPlainArgs();

    /**
     * The unique id of the account.
     * 
     */
    @Import(name="accountId", required=true)
    private String accountId;

    /**
     * @return The unique id of the account.
     * 
     */
    public String accountId() {
        return this.accountId;
    }

    /**
     * The name of the account authentication.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return The name of the account authentication.
     * 
     */
    public String name() {
        return this.name;
    }

    private GetAccountAuthenticationPlainArgs() {}

    private GetAccountAuthenticationPlainArgs(GetAccountAuthenticationPlainArgs $) {
        this.accountId = $.accountId;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAccountAuthenticationPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAccountAuthenticationPlainArgs $;

        public Builder() {
            $ = new GetAccountAuthenticationPlainArgs();
        }

        public Builder(GetAccountAuthenticationPlainArgs defaults) {
            $ = new GetAccountAuthenticationPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId The unique id of the account.
         * 
         * @return builder
         * 
         */
        public Builder accountId(String accountId) {
            $.accountId = accountId;
            return this;
        }

        /**
         * @param name The name of the account authentication.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public GetAccountAuthenticationPlainArgs build() {
            $.accountId = Objects.requireNonNull($.accountId, "expected parameter 'accountId' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}