// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aiven.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PgPgUserConfigPglookoutArgs extends com.pulumi.resources.ResourceArgs {

    public static final PgPgUserConfigPglookoutArgs Empty = new PgPgUserConfigPglookoutArgs();

    /**
     * Number of seconds of master unavailability before triggering database failover to standby. The default value is `60`.
     * 
     */
    @Import(name="maxFailoverReplicationTimeLag")
    private @Nullable Output<Integer> maxFailoverReplicationTimeLag;

    /**
     * @return Number of seconds of master unavailability before triggering database failover to standby. The default value is `60`.
     * 
     */
    public Optional<Output<Integer>> maxFailoverReplicationTimeLag() {
        return Optional.ofNullable(this.maxFailoverReplicationTimeLag);
    }

    private PgPgUserConfigPglookoutArgs() {}

    private PgPgUserConfigPglookoutArgs(PgPgUserConfigPglookoutArgs $) {
        this.maxFailoverReplicationTimeLag = $.maxFailoverReplicationTimeLag;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PgPgUserConfigPglookoutArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PgPgUserConfigPglookoutArgs $;

        public Builder() {
            $ = new PgPgUserConfigPglookoutArgs();
        }

        public Builder(PgPgUserConfigPglookoutArgs defaults) {
            $ = new PgPgUserConfigPglookoutArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param maxFailoverReplicationTimeLag Number of seconds of master unavailability before triggering database failover to standby. The default value is `60`.
         * 
         * @return builder
         * 
         */
        public Builder maxFailoverReplicationTimeLag(@Nullable Output<Integer> maxFailoverReplicationTimeLag) {
            $.maxFailoverReplicationTimeLag = maxFailoverReplicationTimeLag;
            return this;
        }

        /**
         * @param maxFailoverReplicationTimeLag Number of seconds of master unavailability before triggering database failover to standby. The default value is `60`.
         * 
         * @return builder
         * 
         */
        public Builder maxFailoverReplicationTimeLag(Integer maxFailoverReplicationTimeLag) {
            return maxFailoverReplicationTimeLag(Output.of(maxFailoverReplicationTimeLag));
        }

        public PgPgUserConfigPglookoutArgs build() {
            return $;
        }
    }

}