// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aiven.outputs;

import com.pulumi.aiven.outputs.GetOpenSearchOpensearchUserConfigOpensearchSearchBackpressureNodeDuress;
import com.pulumi.aiven.outputs.GetOpenSearchOpensearchUserConfigOpensearchSearchBackpressureSearchShardTask;
import com.pulumi.aiven.outputs.GetOpenSearchOpensearchUserConfigOpensearchSearchBackpressureSearchTask;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetOpenSearchOpensearchUserConfigOpensearchSearchBackpressure {
    /**
     * @return Enum: `disabled`, `enforced`, `monitor_only`. The search backpressure mode. Valid values are monitor_only, enforced, or disabled. Default is monitor_only.
     * 
     */
    private @Nullable String mode;
    /**
     * @return Node duress settings
     * 
     */
    private @Nullable GetOpenSearchOpensearchUserConfigOpensearchSearchBackpressureNodeDuress nodeDuress;
    /**
     * @return Search shard settings
     * 
     */
    private @Nullable GetOpenSearchOpensearchUserConfigOpensearchSearchBackpressureSearchShardTask searchShardTask;
    /**
     * @return Search task settings
     * 
     */
    private @Nullable GetOpenSearchOpensearchUserConfigOpensearchSearchBackpressureSearchTask searchTask;

    private GetOpenSearchOpensearchUserConfigOpensearchSearchBackpressure() {}
    /**
     * @return Enum: `disabled`, `enforced`, `monitor_only`. The search backpressure mode. Valid values are monitor_only, enforced, or disabled. Default is monitor_only.
     * 
     */
    public Optional<String> mode() {
        return Optional.ofNullable(this.mode);
    }
    /**
     * @return Node duress settings
     * 
     */
    public Optional<GetOpenSearchOpensearchUserConfigOpensearchSearchBackpressureNodeDuress> nodeDuress() {
        return Optional.ofNullable(this.nodeDuress);
    }
    /**
     * @return Search shard settings
     * 
     */
    public Optional<GetOpenSearchOpensearchUserConfigOpensearchSearchBackpressureSearchShardTask> searchShardTask() {
        return Optional.ofNullable(this.searchShardTask);
    }
    /**
     * @return Search task settings
     * 
     */
    public Optional<GetOpenSearchOpensearchUserConfigOpensearchSearchBackpressureSearchTask> searchTask() {
        return Optional.ofNullable(this.searchTask);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetOpenSearchOpensearchUserConfigOpensearchSearchBackpressure defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String mode;
        private @Nullable GetOpenSearchOpensearchUserConfigOpensearchSearchBackpressureNodeDuress nodeDuress;
        private @Nullable GetOpenSearchOpensearchUserConfigOpensearchSearchBackpressureSearchShardTask searchShardTask;
        private @Nullable GetOpenSearchOpensearchUserConfigOpensearchSearchBackpressureSearchTask searchTask;
        public Builder() {}
        public Builder(GetOpenSearchOpensearchUserConfigOpensearchSearchBackpressure defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.mode = defaults.mode;
    	      this.nodeDuress = defaults.nodeDuress;
    	      this.searchShardTask = defaults.searchShardTask;
    	      this.searchTask = defaults.searchTask;
        }

        @CustomType.Setter
        public Builder mode(@Nullable String mode) {

            this.mode = mode;
            return this;
        }
        @CustomType.Setter
        public Builder nodeDuress(@Nullable GetOpenSearchOpensearchUserConfigOpensearchSearchBackpressureNodeDuress nodeDuress) {

            this.nodeDuress = nodeDuress;
            return this;
        }
        @CustomType.Setter
        public Builder searchShardTask(@Nullable GetOpenSearchOpensearchUserConfigOpensearchSearchBackpressureSearchShardTask searchShardTask) {

            this.searchShardTask = searchShardTask;
            return this;
        }
        @CustomType.Setter
        public Builder searchTask(@Nullable GetOpenSearchOpensearchUserConfigOpensearchSearchBackpressureSearchTask searchTask) {

            this.searchTask = searchTask;
            return this;
        }
        public GetOpenSearchOpensearchUserConfigOpensearchSearchBackpressure build() {
            final var _resultValue = new GetOpenSearchOpensearchUserConfigOpensearchSearchBackpressure();
            _resultValue.mode = mode;
            _resultValue.nodeDuress = nodeDuress;
            _resultValue.searchShardTask = searchShardTask;
            _resultValue.searchTask = searchTask;
            return _resultValue;
        }
    }
}
