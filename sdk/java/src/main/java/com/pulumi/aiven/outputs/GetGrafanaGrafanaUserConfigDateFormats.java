// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aiven.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetGrafanaGrafanaUserConfigDateFormats {
    private @Nullable String defaultTimezone;
    private @Nullable String fullDate;
    private @Nullable String intervalDay;
    private @Nullable String intervalHour;
    private @Nullable String intervalMinute;
    private @Nullable String intervalMonth;
    private @Nullable String intervalSecond;
    private @Nullable String intervalYear;

    private GetGrafanaGrafanaUserConfigDateFormats() {}
    public Optional<String> defaultTimezone() {
        return Optional.ofNullable(this.defaultTimezone);
    }
    public Optional<String> fullDate() {
        return Optional.ofNullable(this.fullDate);
    }
    public Optional<String> intervalDay() {
        return Optional.ofNullable(this.intervalDay);
    }
    public Optional<String> intervalHour() {
        return Optional.ofNullable(this.intervalHour);
    }
    public Optional<String> intervalMinute() {
        return Optional.ofNullable(this.intervalMinute);
    }
    public Optional<String> intervalMonth() {
        return Optional.ofNullable(this.intervalMonth);
    }
    public Optional<String> intervalSecond() {
        return Optional.ofNullable(this.intervalSecond);
    }
    public Optional<String> intervalYear() {
        return Optional.ofNullable(this.intervalYear);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGrafanaGrafanaUserConfigDateFormats defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String defaultTimezone;
        private @Nullable String fullDate;
        private @Nullable String intervalDay;
        private @Nullable String intervalHour;
        private @Nullable String intervalMinute;
        private @Nullable String intervalMonth;
        private @Nullable String intervalSecond;
        private @Nullable String intervalYear;
        public Builder() {}
        public Builder(GetGrafanaGrafanaUserConfigDateFormats defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultTimezone = defaults.defaultTimezone;
    	      this.fullDate = defaults.fullDate;
    	      this.intervalDay = defaults.intervalDay;
    	      this.intervalHour = defaults.intervalHour;
    	      this.intervalMinute = defaults.intervalMinute;
    	      this.intervalMonth = defaults.intervalMonth;
    	      this.intervalSecond = defaults.intervalSecond;
    	      this.intervalYear = defaults.intervalYear;
        }

        @CustomType.Setter
        public Builder defaultTimezone(@Nullable String defaultTimezone) {
            this.defaultTimezone = defaultTimezone;
            return this;
        }
        @CustomType.Setter
        public Builder fullDate(@Nullable String fullDate) {
            this.fullDate = fullDate;
            return this;
        }
        @CustomType.Setter
        public Builder intervalDay(@Nullable String intervalDay) {
            this.intervalDay = intervalDay;
            return this;
        }
        @CustomType.Setter
        public Builder intervalHour(@Nullable String intervalHour) {
            this.intervalHour = intervalHour;
            return this;
        }
        @CustomType.Setter
        public Builder intervalMinute(@Nullable String intervalMinute) {
            this.intervalMinute = intervalMinute;
            return this;
        }
        @CustomType.Setter
        public Builder intervalMonth(@Nullable String intervalMonth) {
            this.intervalMonth = intervalMonth;
            return this;
        }
        @CustomType.Setter
        public Builder intervalSecond(@Nullable String intervalSecond) {
            this.intervalSecond = intervalSecond;
            return this;
        }
        @CustomType.Setter
        public Builder intervalYear(@Nullable String intervalYear) {
            this.intervalYear = intervalYear;
            return this;
        }
        public GetGrafanaGrafanaUserConfigDateFormats build() {
            final var o = new GetGrafanaGrafanaUserConfigDateFormats();
            o.defaultTimezone = defaultTimezone;
            o.fullDate = fullDate;
            o.intervalDay = intervalDay;
            o.intervalHour = intervalHour;
            o.intervalMinute = intervalMinute;
            o.intervalMonth = intervalMonth;
            o.intervalSecond = intervalSecond;
            o.intervalYear = intervalYear;
            return o;
        }
    }
}