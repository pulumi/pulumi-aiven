// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package aiven

import (
	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/go/pulumi"
)

type ElasticSearchAcl struct {
	s *pulumi.ResourceState
}

// NewElasticSearchAcl registers a new resource with the given unique name, arguments, and options.
func NewElasticSearchAcl(ctx *pulumi.Context,
	name string, args *ElasticSearchAclArgs, opts ...pulumi.ResourceOpt) (*ElasticSearchAcl, error) {
	if args == nil || args.Project == nil {
		return nil, errors.New("missing required argument 'Project'")
	}
	if args == nil || args.ServiceName == nil {
		return nil, errors.New("missing required argument 'ServiceName'")
	}
	inputs := make(map[string]interface{})
	if args == nil {
		inputs["acls"] = nil
		inputs["enabled"] = nil
		inputs["extendedAcl"] = nil
		inputs["project"] = nil
		inputs["serviceName"] = nil
	} else {
		inputs["acls"] = args.Acls
		inputs["enabled"] = args.Enabled
		inputs["extendedAcl"] = args.ExtendedAcl
		inputs["project"] = args.Project
		inputs["serviceName"] = args.ServiceName
	}
	s, err := ctx.RegisterResource("aiven:index/elasticSearchAcl:ElasticSearchAcl", name, true, inputs, opts...)
	if err != nil {
		return nil, err
	}
	return &ElasticSearchAcl{s: s}, nil
}

// GetElasticSearchAcl gets an existing ElasticSearchAcl resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetElasticSearchAcl(ctx *pulumi.Context,
	name string, id pulumi.ID, state *ElasticSearchAclState, opts ...pulumi.ResourceOpt) (*ElasticSearchAcl, error) {
	inputs := make(map[string]interface{})
	if state != nil {
		inputs["acls"] = state.Acls
		inputs["enabled"] = state.Enabled
		inputs["extendedAcl"] = state.ExtendedAcl
		inputs["project"] = state.Project
		inputs["serviceName"] = state.ServiceName
	}
	s, err := ctx.ReadResource("aiven:index/elasticSearchAcl:ElasticSearchAcl", name, id, inputs, opts...)
	if err != nil {
		return nil, err
	}
	return &ElasticSearchAcl{s: s}, nil
}

// URN is this resource's unique name assigned by Pulumi.
func (r *ElasticSearchAcl) URN() pulumi.URNOutput {
	return r.s.URN()
}

// ID is this resource's unique identifier assigned by its provider.
func (r *ElasticSearchAcl) ID() pulumi.IDOutput {
	return r.s.ID()
}

// List of Elasticsearch ACLs
func (r *ElasticSearchAcl) Acls() pulumi.ArrayOutput {
	return (pulumi.ArrayOutput)(r.s.State["acls"])
}

// Enable Elasticsearch ACLs. When disabled authenticated service users have unrestricted access
func (r *ElasticSearchAcl) Enabled() pulumi.BoolOutput {
	return (pulumi.BoolOutput)(r.s.State["enabled"])
}

// Index rules can be applied in a limited fashion to the _mget, _msearch and _bulk APIs (and only those) by enabling the
// ExtendedAcl option for the service. When it is enabled, users can use these APIs as long as all operations only target
// indexes they have been granted access to
func (r *ElasticSearchAcl) ExtendedAcl() pulumi.BoolOutput {
	return (pulumi.BoolOutput)(r.s.State["extendedAcl"])
}

// Project to link the Elasticsearch ACLs to
func (r *ElasticSearchAcl) Project() pulumi.StringOutput {
	return (pulumi.StringOutput)(r.s.State["project"])
}

// Service to link the Elasticsearch ACLs to
func (r *ElasticSearchAcl) ServiceName() pulumi.StringOutput {
	return (pulumi.StringOutput)(r.s.State["serviceName"])
}

// Input properties used for looking up and filtering ElasticSearchAcl resources.
type ElasticSearchAclState struct {
	// List of Elasticsearch ACLs
	Acls interface{}
	// Enable Elasticsearch ACLs. When disabled authenticated service users have unrestricted access
	Enabled interface{}
	// Index rules can be applied in a limited fashion to the _mget, _msearch and _bulk APIs (and only those) by enabling the
	// ExtendedAcl option for the service. When it is enabled, users can use these APIs as long as all operations only target
	// indexes they have been granted access to
	ExtendedAcl interface{}
	// Project to link the Elasticsearch ACLs to
	Project interface{}
	// Service to link the Elasticsearch ACLs to
	ServiceName interface{}
}

// The set of arguments for constructing a ElasticSearchAcl resource.
type ElasticSearchAclArgs struct {
	// List of Elasticsearch ACLs
	Acls interface{}
	// Enable Elasticsearch ACLs. When disabled authenticated service users have unrestricted access
	Enabled interface{}
	// Index rules can be applied in a limited fashion to the _mget, _msearch and _bulk APIs (and only those) by enabling the
	// ExtendedAcl option for the service. When it is enabled, users can use these APIs as long as all operations only target
	// indexes they have been granted access to
	ExtendedAcl interface{}
	// Project to link the Elasticsearch ACLs to
	Project interface{}
	// Service to link the Elasticsearch ACLs to
	ServiceName interface{}
}