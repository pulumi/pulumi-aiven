// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package aiven

import (
	"github.com/pulumi/pulumi/sdk/go/pulumi"
)

func LookupAccountTeamProject(ctx *pulumi.Context, args *GetAccountTeamProjectArgs) (*GetAccountTeamProjectResult, error) {
	inputs := make(map[string]interface{})
	if args != nil {
		inputs["accountId"] = args.AccountId
		inputs["projectName"] = args.ProjectName
		inputs["teamId"] = args.TeamId
		inputs["teamType"] = args.TeamType
	}
	outputs, err := ctx.Invoke("aiven:index/getAccountTeamProject:getAccountTeamProject", inputs)
	if err != nil {
		return nil, err
	}
	return &GetAccountTeamProjectResult{
		AccountId: outputs["accountId"],
		ProjectName: outputs["projectName"],
		TeamId: outputs["teamId"],
		TeamType: outputs["teamType"],
		Id: outputs["id"],
	}, nil
}

// A collection of arguments for invoking getAccountTeamProject.
type GetAccountTeamProjectArgs struct {
	AccountId interface{}
	ProjectName interface{}
	TeamId interface{}
	TeamType interface{}
}

// A collection of values returned by getAccountTeamProject.
type GetAccountTeamProjectResult struct {
	AccountId interface{}
	ProjectName interface{}
	TeamId interface{}
	TeamType interface{}
	// id is the provider-assigned unique ID for this managed resource.
	Id interface{}
}