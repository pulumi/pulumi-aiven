// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aiven.outputs;

import com.pulumi.aiven.outputs.M3DbM3dbUserConfigRulesMappingNamespacesObject;
import com.pulumi.aiven.outputs.M3DbM3dbUserConfigRulesMappingTag;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class M3DbM3dbUserConfigRulesMapping {
    private @Nullable List<String> aggregations;
    private @Nullable String drop;
    private @Nullable String filter;
    private @Nullable String name;
    private @Nullable List<String> namespaces;
    private @Nullable List<M3DbM3dbUserConfigRulesMappingNamespacesObject> namespacesObjects;
    private @Nullable List<M3DbM3dbUserConfigRulesMappingTag> tags;

    private M3DbM3dbUserConfigRulesMapping() {}
    public List<String> aggregations() {
        return this.aggregations == null ? List.of() : this.aggregations;
    }
    public Optional<String> drop() {
        return Optional.ofNullable(this.drop);
    }
    public Optional<String> filter() {
        return Optional.ofNullable(this.filter);
    }
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    public List<String> namespaces() {
        return this.namespaces == null ? List.of() : this.namespaces;
    }
    public List<M3DbM3dbUserConfigRulesMappingNamespacesObject> namespacesObjects() {
        return this.namespacesObjects == null ? List.of() : this.namespacesObjects;
    }
    public List<M3DbM3dbUserConfigRulesMappingTag> tags() {
        return this.tags == null ? List.of() : this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(M3DbM3dbUserConfigRulesMapping defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> aggregations;
        private @Nullable String drop;
        private @Nullable String filter;
        private @Nullable String name;
        private @Nullable List<String> namespaces;
        private @Nullable List<M3DbM3dbUserConfigRulesMappingNamespacesObject> namespacesObjects;
        private @Nullable List<M3DbM3dbUserConfigRulesMappingTag> tags;
        public Builder() {}
        public Builder(M3DbM3dbUserConfigRulesMapping defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aggregations = defaults.aggregations;
    	      this.drop = defaults.drop;
    	      this.filter = defaults.filter;
    	      this.name = defaults.name;
    	      this.namespaces = defaults.namespaces;
    	      this.namespacesObjects = defaults.namespacesObjects;
    	      this.tags = defaults.tags;
        }

        @CustomType.Setter
        public Builder aggregations(@Nullable List<String> aggregations) {
            this.aggregations = aggregations;
            return this;
        }
        public Builder aggregations(String... aggregations) {
            return aggregations(List.of(aggregations));
        }
        @CustomType.Setter
        public Builder drop(@Nullable String drop) {
            this.drop = drop;
            return this;
        }
        @CustomType.Setter
        public Builder filter(@Nullable String filter) {
            this.filter = filter;
            return this;
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder namespaces(@Nullable List<String> namespaces) {
            this.namespaces = namespaces;
            return this;
        }
        public Builder namespaces(String... namespaces) {
            return namespaces(List.of(namespaces));
        }
        @CustomType.Setter
        public Builder namespacesObjects(@Nullable List<M3DbM3dbUserConfigRulesMappingNamespacesObject> namespacesObjects) {
            this.namespacesObjects = namespacesObjects;
            return this;
        }
        public Builder namespacesObjects(M3DbM3dbUserConfigRulesMappingNamespacesObject... namespacesObjects) {
            return namespacesObjects(List.of(namespacesObjects));
        }
        @CustomType.Setter
        public Builder tags(@Nullable List<M3DbM3dbUserConfigRulesMappingTag> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(M3DbM3dbUserConfigRulesMappingTag... tags) {
            return tags(List.of(tags));
        }
        public M3DbM3dbUserConfigRulesMapping build() {
            final var o = new M3DbM3dbUserConfigRulesMapping();
            o.aggregations = aggregations;
            o.drop = drop;
            o.filter = filter;
            o.name = name;
            o.namespaces = namespaces;
            o.namespacesObjects = namespacesObjects;
            o.tags = tags;
            return o;
        }
    }
}