// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aiven.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PgPgUserConfigPublicAccess {
    /**
     * @return PostgreSQL specific server provided values
     * 
     */
    private @Nullable String pg;
    private @Nullable String pgbouncer;
    private @Nullable String prometheus;

    private PgPgUserConfigPublicAccess() {}
    /**
     * @return PostgreSQL specific server provided values
     * 
     */
    public Optional<String> pg() {
        return Optional.ofNullable(this.pg);
    }
    public Optional<String> pgbouncer() {
        return Optional.ofNullable(this.pgbouncer);
    }
    public Optional<String> prometheus() {
        return Optional.ofNullable(this.prometheus);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PgPgUserConfigPublicAccess defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String pg;
        private @Nullable String pgbouncer;
        private @Nullable String prometheus;
        public Builder() {}
        public Builder(PgPgUserConfigPublicAccess defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.pg = defaults.pg;
    	      this.pgbouncer = defaults.pgbouncer;
    	      this.prometheus = defaults.prometheus;
        }

        @CustomType.Setter
        public Builder pg(@Nullable String pg) {
            this.pg = pg;
            return this;
        }
        @CustomType.Setter
        public Builder pgbouncer(@Nullable String pgbouncer) {
            this.pgbouncer = pgbouncer;
            return this;
        }
        @CustomType.Setter
        public Builder prometheus(@Nullable String prometheus) {
            this.prometheus = prometheus;
            return this;
        }
        public PgPgUserConfigPublicAccess build() {
            final var o = new PgPgUserConfigPublicAccess();
            o.pg = pg;
            o.pgbouncer = pgbouncer;
            o.prometheus = prometheus;
            return o;
        }
    }
}