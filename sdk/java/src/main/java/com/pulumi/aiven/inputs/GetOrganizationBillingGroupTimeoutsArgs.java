// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aiven.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetOrganizationBillingGroupTimeoutsArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetOrganizationBillingGroupTimeoutsArgs Empty = new GetOrganizationBillingGroupTimeoutsArgs();

    /**
     * A string that can be [parsed as a duration](https://pkg.go.dev/time#ParseDuration) consisting of numbers and unit suffixes, such as &#34;30s&#34; or &#34;2h45m&#34;. Valid time units are &#34;s&#34; (seconds), &#34;m&#34; (minutes), &#34;h&#34; (hours).
     * 
     */
    @Import(name="read")
    private @Nullable Output<String> read;

    /**
     * @return A string that can be [parsed as a duration](https://pkg.go.dev/time#ParseDuration) consisting of numbers and unit suffixes, such as &#34;30s&#34; or &#34;2h45m&#34;. Valid time units are &#34;s&#34; (seconds), &#34;m&#34; (minutes), &#34;h&#34; (hours).
     * 
     */
    public Optional<Output<String>> read() {
        return Optional.ofNullable(this.read);
    }

    private GetOrganizationBillingGroupTimeoutsArgs() {}

    private GetOrganizationBillingGroupTimeoutsArgs(GetOrganizationBillingGroupTimeoutsArgs $) {
        this.read = $.read;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetOrganizationBillingGroupTimeoutsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetOrganizationBillingGroupTimeoutsArgs $;

        public Builder() {
            $ = new GetOrganizationBillingGroupTimeoutsArgs();
        }

        public Builder(GetOrganizationBillingGroupTimeoutsArgs defaults) {
            $ = new GetOrganizationBillingGroupTimeoutsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param read A string that can be [parsed as a duration](https://pkg.go.dev/time#ParseDuration) consisting of numbers and unit suffixes, such as &#34;30s&#34; or &#34;2h45m&#34;. Valid time units are &#34;s&#34; (seconds), &#34;m&#34; (minutes), &#34;h&#34; (hours).
         * 
         * @return builder
         * 
         */
        public Builder read(@Nullable Output<String> read) {
            $.read = read;
            return this;
        }

        /**
         * @param read A string that can be [parsed as a duration](https://pkg.go.dev/time#ParseDuration) consisting of numbers and unit suffixes, such as &#34;30s&#34; or &#34;2h45m&#34;. Valid time units are &#34;s&#34; (seconds), &#34;m&#34; (minutes), &#34;h&#34; (hours).
         * 
         * @return builder
         * 
         */
        public Builder read(String read) {
            return read(Output.of(read));
        }

        public GetOrganizationBillingGroupTimeoutsArgs build() {
            return $;
        }
    }

}
