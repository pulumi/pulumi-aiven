// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aiven.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class ClickhouseTechEmailArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClickhouseTechEmailArgs Empty = new ClickhouseTechEmailArgs();

    /**
     * An email address to contact for technical issues
     * 
     */
    @Import(name="email", required=true)
    private Output<String> email;

    /**
     * @return An email address to contact for technical issues
     * 
     */
    public Output<String> email() {
        return this.email;
    }

    private ClickhouseTechEmailArgs() {}

    private ClickhouseTechEmailArgs(ClickhouseTechEmailArgs $) {
        this.email = $.email;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClickhouseTechEmailArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClickhouseTechEmailArgs $;

        public Builder() {
            $ = new ClickhouseTechEmailArgs();
        }

        public Builder(ClickhouseTechEmailArgs defaults) {
            $ = new ClickhouseTechEmailArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param email An email address to contact for technical issues
         * 
         * @return builder
         * 
         */
        public Builder email(Output<String> email) {
            $.email = email;
            return this;
        }

        /**
         * @param email An email address to contact for technical issues
         * 
         * @return builder
         * 
         */
        public Builder email(String email) {
            return email(Output.of(email));
        }

        public ClickhouseTechEmailArgs build() {
            if ($.email == null) {
                throw new MissingRequiredPropertyException("ClickhouseTechEmailArgs", "email");
            }
            return $;
        }
    }

}
