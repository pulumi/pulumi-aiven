// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aiven.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class DragonflyTechEmail {
    /**
     * @return An email address to contact for technical issues
     * 
     */
    private String email;

    private DragonflyTechEmail() {}
    /**
     * @return An email address to contact for technical issues
     * 
     */
    public String email() {
        return this.email;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DragonflyTechEmail defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String email;
        public Builder() {}
        public Builder(DragonflyTechEmail defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.email = defaults.email;
        }

        @CustomType.Setter
        public Builder email(String email) {
            if (email == null) {
              throw new MissingRequiredPropertyException("DragonflyTechEmail", "email");
            }
            this.email = email;
            return this;
        }
        public DragonflyTechEmail build() {
            final var _resultValue = new DragonflyTechEmail();
            _resultValue.email = email;
            return _resultValue;
        }
    }
}